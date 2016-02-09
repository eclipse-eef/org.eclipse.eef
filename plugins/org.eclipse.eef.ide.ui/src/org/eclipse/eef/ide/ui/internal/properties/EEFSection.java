/*******************************************************************************
 * Copyright (c) 2015, 2016 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.eef.ide.ui.internal.properties;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.Platform;
import org.eclipse.eef.core.api.EEFGroup;
import org.eclipse.eef.core.api.EEFPage;
import org.eclipse.eef.core.api.InputDescriptor;
import org.eclipse.eef.ide.ui.internal.widgets.EEFGroupLifecycleManager;
import org.eclipse.eef.ide.ui.internal.widgets.ILifecycleManager;
import org.eclipse.eef.properties.ui.api.EEFTabbedPropertySheetPage;
import org.eclipse.eef.properties.ui.api.IEEFSection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.transaction.DemultiplexingListener;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

/**
 * The implementation of {@link IEEFSection} using the {@link EEFSectionDescriptor}.
 *
 * @author sbegaudeau
 */
public class EEFSection implements IEEFSection {

	// CHECKSTYLE:OFF
	private static final class SectionUpdater extends DemultiplexingListener {
		private static final NotificationFilter DEFAULT_FILTER = NotificationFilter.NOT_TOUCH.and(NotificationFilter
				.createEventTypeFilter(Notification.SET).or(NotificationFilter.createEventTypeFilter(Notification.UNSET))
				.and(NotificationFilter.createNotifierTypeFilter(EObject.class)));

		private final IEEFSection section;

		private SectionUpdater(IEEFSection section) {
			super(DEFAULT_FILTER);
			this.section = section;
		}

		/**
		 * Subclasses overriding this method should remember to override
		 * {@link #update(TransactionalEditingDomain, Notification)} as required. The default implementation of
		 * {@link #update(TransactionalEditingDomain, Notification)} will only update if the notifier is an
		 * <code>EObject</code>.
		 *
		 * @return the filter for events used by my <code>eventListener</code>.
		 */
		@Override
		public NotificationFilter getFilter() {
			return SectionUpdater.DEFAULT_FILTER;
		}

		@Override
		protected void handleNotification(final TransactionalEditingDomain domain, final Notification notification) {
			if (isUpdateEnabled()) {
				update(domain, notification);
			}
		}

		private boolean isUpdateEnabled() {
			return true;
		}

		/**
		 * Updates me if the notifier is an <code>EObject</code> by calling {@link #update(Notification, EObject)}. Does
		 * nothing otherwise. Subclasses should override this method if they need to update based on non-EObject
		 * notifiers.
		 *
		 * @param domain
		 *            the editing domain
		 * @param notification
		 *            the event notification
		 */
		protected void update(TransactionalEditingDomain domain, Notification notification) {
			System.out.println("UPDATING " + section); //$NON-NLS-1$
			if (notification.getNotifier() instanceof EObject) {
				getCurrentDisplay().asyncExec(new Runnable() {
					@Override
					public void run() {
						section.refresh();
					}
				});
			}
		}

		private Display getCurrentDisplay() {
			Display d;
			if (PlatformUI.isWorkbenchRunning()) {
				d = PlatformUI.getWorkbench().getDisplay();
			} else {
				d = Display.getDefault();
			}
			return d;
		}

	}

	// CHECKSTYLE:ON

	/**
	 * The section descriptor.
	 */
	private EEFSectionDescriptor eefSectionDescriptor;

	/**
	 * The lifecycle managers of this section.
	 */
	private List<ILifecycleManager> lifecycleManagers = new ArrayList<ILifecycleManager>();

	/**
	 * Model event listener.<BR>
	 * Listen the editing domain
	 */
	private SectionUpdater updater = new SectionUpdater(this);

	/**
	 * The editing domain of the current input.
	 */
	private TransactionalEditingDomain editingDomain;

	/**
	 * The constructor.
	 *
	 * @param eefSectionDescriptor
	 *            The section descriptor
	 */
	public EEFSection(EEFSectionDescriptor eefSectionDescriptor) {
		this.eefSectionDescriptor = eefSectionDescriptor;
	}

	@Override
	public void createControls(Composite parent, EEFTabbedPropertySheetPage tabbedPropertySheetPage) {
		EEFPage eefPage = this.eefSectionDescriptor.getEEFPage();
		List<EEFGroup> eefGroups = eefPage.getGroups();
		for (EEFGroup eefGroup : eefGroups) {
			EEFGroupLifecycleManager groupLifecycleManager = new EEFGroupLifecycleManager(eefGroup.getDescription(), eefGroup.getVariableManager(),
					eefGroup.getInterpreter(), eefGroup.getEditingDomain());
			groupLifecycleManager.createControl(parent, tabbedPropertySheetPage);

			this.lifecycleManagers.add(groupLifecycleManager);
		}
	}

	@Override
	public void aboutToBeShown() {
		for (ILifecycleManager lifecycleManager : lifecycleManagers) {
			lifecycleManager.aboutToBeShown();
		}
		final TransactionalEditingDomain theEditingDomain = getEditingDomain();
		if (theEditingDomain != null) {
			theEditingDomain.addResourceSetListener(updater);
		}
	}

	@Override
	public void setInput(IWorkbenchPart part, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection iStructuredSelection = (IStructuredSelection) selection;
			Object object = iStructuredSelection.getFirstElement();

			InputDescriptor input = Platform.getAdapterManager().getAdapter(object, InputDescriptor.class);

			// TODO we should create a whole context with the current selection etc for the context
			this.eefSectionDescriptor.getEEFPage().getView().setInput(input);

			final IEditingDomainProvider provider = part.getAdapter(IEditingDomainProvider.class);
			if (provider != null) {
				final EditingDomain theEditingDomain = provider.getEditingDomain();
				if (theEditingDomain instanceof TransactionalEditingDomain) {
					setEditingDomain((TransactionalEditingDomain) theEditingDomain);
				}
			}
		}
	}

	private void setEditingDomain(TransactionalEditingDomain theEditingDomain) {
		this.editingDomain = theEditingDomain;
	}

	private TransactionalEditingDomain getEditingDomain() {
		return this.editingDomain;
	}

	@Override
	public void refresh() {
		for (ILifecycleManager lifecycleManager : lifecycleManagers) {
			lifecycleManager.refresh();
		}
	}

	@Override
	public void aboutToBeHidden() {
		for (ILifecycleManager lifecycleManager : lifecycleManagers) {
			lifecycleManager.aboutToBeHidden();
		}
		final TransactionalEditingDomain theEditingDomain = getEditingDomain();
		if (theEditingDomain != null) {
			theEditingDomain.removeResourceSetListener(updater);
		}
	}

	@Override
	public void dispose() {
		for (ILifecycleManager lifecycleManager : lifecycleManagers) {
			lifecycleManager.dispose();
		}
	}

	@Override
	public int getMinimumHeight() {
		return SWT.DEFAULT;
	}

	@Override
	public boolean shouldUseExtraSpace() {
		return true;
	}

}
