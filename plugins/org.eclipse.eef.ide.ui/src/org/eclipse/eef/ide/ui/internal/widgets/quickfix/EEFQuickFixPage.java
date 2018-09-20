/*******************************************************************************
 * Copyright (c) 2016, 2018 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors: Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.eef.ide.ui.internal.widgets.quickfix;

import java.lang.reflect.InvocationTargetException;
import java.text.MessageFormat;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.eef.EEFValidationFixDescription;
import org.eclipse.eef.EEFValidationRuleDescription;
import org.eclipse.eef.EefPackage;
import org.eclipse.eef.core.api.controllers.InvalidValidationRuleResultData;
import org.eclipse.eef.ide.ui.internal.EEFIdeUiPlugin;
import org.eclipse.eef.ide.ui.internal.Messages;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.forms.IMessage;

/**
 * The wizard page used to launch a quick fix.
 *
 * @author sbegaudeau
 */
public class EEFQuickFixPage extends WizardPage {
	/**
	 * The table viewer containing all the quick fixes available.
	 */
	private TableViewer quickFixesList;

	/**
	 * The validation rule.
	 */
	private EEFValidationRuleDescription validationRule;

	/**
	 * The invalid validation result data.
	 */
	private InvalidValidationRuleResultData data;

	/**
	 * The selected {@link IMessage}.
	 */
	private IMessage selectedMessage;

	/**
	 * The constructor.
	 *
	 * @param message
	 *            The message
	 * @param validationRule
	 *            The validation rule
	 * @param data
	 *            The invalid validation result data
	 */
	public EEFQuickFixPage(IMessage message, EEFValidationRuleDescription validationRule, InvalidValidationRuleResultData data) {
		super(message.getMessage());
		this.setTitle(Messages.EEFQuickFixPage_title);
		this.setDescription(MessageFormat.format(Messages.EEFQuickFixPage_description, message.getMessage()));
		this.validationRule = validationRule;
		this.data = data;
		this.selectedMessage = message;
	}

	/**
	 * Returns the selected {@link IMessage}.
	 *
	 * @return The selected {@link IMessage}
	 */
	public IMessage getSelectedMessage() {
		return this.selectedMessage;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createControl(Composite parent) {
		this.initializeDialogUnits(parent);

		Composite control = new Composite(parent, SWT.NONE);
		control.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		this.setControl(control);

		FormLayout layout = new FormLayout();
		layout.marginHeight = this.convertVerticalDLUsToPixels(IDialogConstants.VERTICAL_MARGIN);
		layout.marginWidth = this.convertHorizontalDLUsToPixels(IDialogConstants.HORIZONTAL_MARGIN);
		layout.spacing = this.convertHorizontalDLUsToPixels(IDialogConstants.HORIZONTAL_SPACING);
		control.setLayout(layout);

		Label label = new Label(control, SWT.NONE);
		label.setText(Messages.EEFQuickFixPage_label);
		label.setLayoutData(new FormData());

		// Create the list for the quick fixes
		this.quickFixesList = new TableViewer(control, SWT.BORDER | SWT.SINGLE | SWT.V_SCROLL);
		this.quickFixesList.setContentProvider(new EEFQuickFixTableContentProvider());
		this.quickFixesList.setLabelProvider(new EEFQuickFixTableLabelProvider());
		this.quickFixesList.setComparator(new EEFQuickFixTableComparator());
		this.quickFixesList.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				EEFQuickFixPage.this.setPageComplete(true);
			}
		});

		FormData listData = new FormData();
		listData.top = new FormAttachment(label, 0);
		listData.left = new FormAttachment(0);
		listData.right = new FormAttachment(100, 0);
		listData.height = convertHeightInCharsToPixels(10);
		this.quickFixesList.getControl().setLayoutData(listData);

		this.quickFixesList.setInput(this.validationRule);

		Dialog.applyDialogFont(control);

		// Select the first quick fix available
		Object firstElement = this.quickFixesList.getElementAt(0);
		if (firstElement != null) {
			this.quickFixesList.setSelection(new StructuredSelection(firstElement));
		} else {
			this.setMessage(Messages.EEFQuickFixWizard_noQuickFixAvailable, IMessageProvider.ERROR);
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.jface.wizard.WizardPage#isPageComplete()
	 */
	@Override
	public boolean isPageComplete() {
		return this.quickFixesList != null && this.validationRule.getFixes().size() > 0 && !this.quickFixesList.getSelection().isEmpty();
	}

	/**
	 * Launch the selected quick fix in the list.
	 *
	 * @param monitor
	 *            The progress monitor
	 */
	public void performFinish(IProgressMonitor monitor) {
		try {
			this.getWizard().getContainer().run(false, true, (progressMonitor) -> {
				progressMonitor.beginTask(Messages.EEFQuickFixWizard_applyQuickFix, 1);
				this.getShell().getDisplay().readAndDispatch();
				if (progressMonitor.isCanceled()) {
					return;
				}

				ISelection selection = this.quickFixesList.getSelection();
				if (selection instanceof IStructuredSelection) {
					IStructuredSelection structuredSelection = (IStructuredSelection) selection;
					// Only one quick fix can be selected
					Object element = structuredSelection.getFirstElement();
					if (element instanceof EEFValidationFixDescription) {
						// Run the quick fix using the given eval
						EEFValidationFixDescription validationFix = (EEFValidationFixDescription) element;
						EAttribute expressionEAttribute = EefPackage.Literals.EEF_VALIDATION_FIX_DESCRIPTION__FIX_EXPRESSION;
						this.data.getEditingContextAdapter().performModelChange(() -> {
							this.data.getEval().logIfBlank(expressionEAttribute).call(validationFix.getFixExpression());
						});
					}
				}

				progressMonitor.worked(1);
			});
		} catch (InvocationTargetException e) {
			EEFIdeUiPlugin.getPlugin().error(e.getMessage(), e);
		} catch (InterruptedException e) {
			EEFIdeUiPlugin.getPlugin().error(e.getMessage(), e);
		}
	}
}
