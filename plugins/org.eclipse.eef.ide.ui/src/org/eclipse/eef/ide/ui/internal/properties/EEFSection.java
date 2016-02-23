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
import org.eclipse.eef.EEFRuleAuditDescription;
import org.eclipse.eef.EEFSemanticValidationRuleDescription;
import org.eclipse.eef.EefPackage;
import org.eclipse.eef.core.api.EEFGroup;
import org.eclipse.eef.core.api.EEFPage;
import org.eclipse.eef.core.api.InputDescriptor;
import org.eclipse.eef.core.api.utils.Eval;
import org.eclipse.eef.ide.ui.internal.EEFIdeUiPlugin;
import org.eclipse.eef.ide.ui.internal.widgets.EEFGroupLifecycleManager;
import org.eclipse.eef.ide.ui.internal.widgets.ILifecycleManager;
import org.eclipse.eef.properties.ui.api.EEFTabbedPropertySheetPage;
import org.eclipse.eef.properties.ui.api.IEEFSection;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
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
import org.eclipse.ui.forms.IMessageManager;

/**
 * The implementation of {@link IEEFSection} using the {@link EEFSectionDescriptor}.
 *
 * @author sbegaudeau
 */
public class EEFSection implements IEEFSection {

	/**
	 * A post-commit listener which refreshes the whole page when a significant change (an actual modification of a
	 * model element) occurs in the current editing domain.
	 */
	private static final class Updater extends ResourceSetListenerImpl {
		/**
		 * Describes the changes we want to react to.
		 */
		private static final NotificationFilter FILTER = NotificationFilter.NOT_TOUCH.and(NotificationFilter.createNotifierTypeFilter(EObject.class));

		/**
		 * The top-level page the section is part of.
		 */
		private final EEFTabbedPropertySheetPage page;

		/**
		 * The section to refresh.
		 */
		private final EEFSection section;

		/**
		 * The editing domain to which we are attached.
		 */
		private TransactionalEditingDomain editingDomain;

		/**
		 * Creates a new updater.
		 *
		 * @param section
		 *            the section to refresh.
		 * @param page
		 *            the top-level page the section is part of.
		 */
		private Updater(EEFSection section, EEFTabbedPropertySheetPage page) {
			super(FILTER);
			this.section = section;
			this.page = page;
		}

		@Override
		public boolean isPostcommitOnly() {
			return true;
		}

		@Override
		public void resourceSetChanged(final ResourceSetChangeEvent event) {
			Display display = page.getSite().getShell().getDisplay();
			if (display != null) {
				display.asyncExec(new Runnable() {
					@Override
					public void run() {
						page.refreshPage();
					}
				});
			}
		}

		/**
		 * Start listening to changes from the current editing domain.
		 */
		public void enable() {
			disable();
			editingDomain = section.eefSectionDescriptor.getEEFPage().getView().getEditingDomain();
			if (editingDomain != null) {
				editingDomain.addResourceSetListener(this);
			}
		}

		/**
		 * Stop listening to changes from the editing domain.
		 */
		public void disable() {
			if (editingDomain != null) {
				editingDomain.removeResourceSetListener(this);
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
	private Updater updater;

	/**
	 * The tabbed property sheet page.
	 */
	private EEFTabbedPropertySheetPage tabbedPropertySheetPage;

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
	public void createControls(Composite parent, EEFTabbedPropertySheetPage eefTabbedPropertySheetPage) {
		EEFIdeUiPlugin.getPlugin().debug("EEFSection#createControls(...)"); //$NON-NLS-1$

		this.tabbedPropertySheetPage = eefTabbedPropertySheetPage;
		this.tabbedPropertySheetPage.getForm().getMessageManager().setDecorationPosition(SWT.LEFT | SWT.TOP);
		this.tabbedPropertySheetPage.getForm().getMessageManager().setAutoUpdate(false);

		EEFPage eefPage = this.eefSectionDescriptor.getEEFPage();
		List<EEFGroup> eefGroups = eefPage.getGroups();
		for (EEFGroup eefGroup : eefGroups) {
			EEFGroupLifecycleManager groupLifecycleManager = new EEFGroupLifecycleManager(eefGroup.getDescription(), eefGroup.getVariableManager(),
					eefGroup.getInterpreter(), eefGroup.getEditingDomain());
			groupLifecycleManager.createControl(parent, eefTabbedPropertySheetPage);

			this.lifecycleManagers.add(groupLifecycleManager);
		}
		this.updater = new Updater(this, tabbedPropertySheetPage);
	}

	@Override
	public void aboutToBeShown() {
		EEFIdeUiPlugin.getPlugin().debug("EEFSection#aboutToBeShown(...)"); //$NON-NLS-1$

		for (ILifecycleManager lifecycleManager : lifecycleManagers) {
			lifecycleManager.aboutToBeShown();
		}
		updater.enable();
	}

	@Override
	public void setInput(IWorkbenchPart part, ISelection selection) {
		EEFIdeUiPlugin.getPlugin().debug("EEFSection#setInput(...)"); //$NON-NLS-1$

		if (selection instanceof IStructuredSelection) {
			IStructuredSelection iStructuredSelection = (IStructuredSelection) selection;
			Object object = iStructuredSelection.getFirstElement();

			InputDescriptor input = Platform.getAdapterManager().getAdapter(object, InputDescriptor.class);

			if (input != null) {
				// TODO we should create a whole context with the current selection etc for the context
				this.eefSectionDescriptor.getEEFPage().getView().setInput(input);
			}
		}
	}

	@Override
	public void refresh() {
		EEFIdeUiPlugin.getPlugin().debug("EEFSection#refresh(...)"); //$NON-NLS-1$

		IMessageManager messageManager = this.tabbedPropertySheetPage.getForm().getMessageManager();
		EAttribute auditEAttribute = EefPackage.Literals.EEF_RULE_AUDIT_DESCRIPTION__AUDIT_EXPRESSION;
		EAttribute messageEAttribute = EefPackage.Literals.EEF_VALIDATION_RULE_DESCRIPTION__MESSAGE_EXPRESSION;

		EEFPage page = this.eefSectionDescriptor.getEEFPage();
		List<EEFSemanticValidationRuleDescription> semanticValidationRules = page.getDescription().getSemanticValidationRules();
		for (EEFSemanticValidationRuleDescription semanticValidationRule : semanticValidationRules) {
			boolean isValid = true;

			for (EEFRuleAuditDescription audit : semanticValidationRule.getAudits()) {
				String auditExpression = audit.getAuditExpression();
				Boolean result = new Eval(page.getInterpreter(), page.getVariableManager()).get(auditEAttribute, auditExpression, Boolean.class);
				isValid = isValid && (result != null && result.booleanValue());

				if (!isValid) {
					break;
				}
			}

			if (isValid) {
				messageManager.removeMessage(semanticValidationRule);
			} else {
				String messageExpression = semanticValidationRule.getMessageExpression();
				String message = new Eval(page.getInterpreter(), page.getVariableManager()).get(messageEAttribute, messageExpression, String.class);
				messageManager.addMessage(semanticValidationRule, message, null, semanticValidationRule.getSeverity().getValue());
			}
		}

		for (ILifecycleManager lifecycleManager : lifecycleManagers) {
			lifecycleManager.refresh();
		}

		this.tabbedPropertySheetPage.getForm().getMessageManager().update();
	}

	@Override
	public void aboutToBeHidden() {
		EEFIdeUiPlugin.getPlugin().debug("EEFSection#aboutToBeHidden(...)"); //$NON-NLS-1$

		this.tabbedPropertySheetPage.getForm().getMessageManager().removeAllMessages();

		updater.disable();
		for (ILifecycleManager lifecycleManager : lifecycleManagers) {
			lifecycleManager.aboutToBeHidden();
		}
	}

	@Override
	public void dispose() {
		EEFIdeUiPlugin.getPlugin().debug("EEFSection#dispose(...)"); //$NON-NLS-1$

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
