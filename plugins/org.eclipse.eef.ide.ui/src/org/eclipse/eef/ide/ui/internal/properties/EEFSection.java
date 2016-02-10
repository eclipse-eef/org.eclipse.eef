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
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListenerImpl;
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

	/**
	 * A post-commit listener which refreshes the section content when a significant change (an actual modification of a
	 * model element) occurs in the current editing domain.
	 */
	private static final class SectionUpdater extends ResourceSetListenerImpl {
		/**
		 * Describes the changes we want to react to.
		 */
		private static final NotificationFilter FILTER = NotificationFilter.NOT_TOUCH.and(NotificationFilter.createEventTypeFilter(Notification.SET)
				.or(NotificationFilter.createEventTypeFilter(Notification.UNSET)).and(NotificationFilter.createNotifierTypeFilter(EObject.class)));

		/**
		 * The section to refresh.
		 */
		private final IEEFSection section;

		/**
		 * Creates a new updater.
		 *
		 * @param section
		 *            the section to refresh.
		 */
		private SectionUpdater(IEEFSection section) {
			super(FILTER);
			this.section = section;
		}

		@Override
		public boolean isPostcommitOnly() {
			return true;
		}

		@Override
		public void resourceSetChanged(ResourceSetChangeEvent event) {
			Display display = getCurrentDisplay();
			if (display != null) {
				display.asyncExec(new Runnable() {
					@Override
					public void run() {
						section.refresh();
					}
				});
			}
		}

		/**
		 * Start listening to changes from the specified editing domain.
		 *
		 * @param editingDomain
		 *            the editing domain to listen to.
		 */
		public void attachTo(TransactionalEditingDomain editingDomain) {
			if (editingDomain != null) {
				editingDomain.addResourceSetListener(this);
			}
		}

		/**
		 * Stop listening to changes from the specified editing domain.
		 *
		 * @param editingDomain
		 *            the editing domain to stop listening to.
		 */
		public void detachFrom(TransactionalEditingDomain editingDomain) {
			if (editingDomain != null) {
				editingDomain.removeResourceSetListener(this);
			}
		}

		/**
		 * Helper to obtain the current display, as the actual refresh must be launched in the UI thread.
		 *
		 * @return the current display.
		 */
		private Display getCurrentDisplay() {
			if (PlatformUI.isWorkbenchRunning()) {
				return PlatformUI.getWorkbench().getDisplay();
			} else {
				return Display.getDefault();
			}
		}

	}

	/**
	 * The section descriptor.
	 */
	private EEFSectionDescriptor eefSectionDescriptor;

	/**
	 * The lifecycle managers of this section.
	 */
	private List<ILifecycleManager> lifecycleManagers = new ArrayList<ILifecycleManager>();

	/**
	 * The updater which refreshes this section on external model changes.
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
		updater.attachTo(this.editingDomain);
	}

	@Override
	public void setInput(IWorkbenchPart part, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection iStructuredSelection = (IStructuredSelection) selection;
			Object object = iStructuredSelection.getFirstElement();

			InputDescriptor input = Platform.getAdapterManager().getAdapter(object, InputDescriptor.class);

			// TODO we should create a whole context with the current selection etc for the context
			this.eefSectionDescriptor.getEEFPage().getView().setInput(input);
			storeCurrentEditingDomain(part);
		}
	}

	/**
	 * Identifies the {@link TransactionalEditingDomain} assiociated with the specified part, if any, and remembers it
	 * in {@link #editingDomain}.
	 *
	 * @param part
	 *            the input part.
	 */
	private void storeCurrentEditingDomain(IWorkbenchPart part) {
		IEditingDomainProvider provider = part.getAdapter(IEditingDomainProvider.class);
		if (provider != null) {
			EditingDomain theEditingDomain = provider.getEditingDomain();
			if (theEditingDomain instanceof TransactionalEditingDomain) {
				this.editingDomain = (TransactionalEditingDomain) theEditingDomain;
			} else {
				this.editingDomain = null;
			}
		} else {
			this.editingDomain = null;
		}
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
		updater.detachFrom(this.editingDomain);
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
