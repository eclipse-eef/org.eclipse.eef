/*******************************************************************************
 * Copyright (c) 2016 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.eef.ide.ui.internal.widgets.quickfix;

import org.eclipse.eef.EEFValidationRuleDescription;
import org.eclipse.eef.ide.ui.internal.Messages;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
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
 * This optional page will let the user select the violated validation rule to fix.
 *
 * @author sbegaudeau
 */
public class EEFValidationMessagesPage extends WizardPage {

	/**
	 * The messages.
	 */
	private IMessage[] messages;

	/**
	 * The selected message.
	 */
	private IMessage selectedMessage;

	/**
	 * The table viewer used to display all the validation messages.
	 */
	private TableViewer validationMessagesList;

	/**
	 * Creates the wizard page with the message to display.
	 *
	 * @param messages
	 *            The messages
	 */
	public EEFValidationMessagesPage(IMessage[] messages) {
		super(Messages.EEFValidationRulesPage_title);
		this.setTitle(Messages.EEFValidationRulesPage_title);
		this.setDescription(Messages.EEFValidationRulesPage_description);
		this.messages = messages;
	}

	/**
	 * Creates the wizard page with the message to display and one of those messages selected.
	 *
	 * @param messages
	 *            The messages
	 * @param selectedMessage
	 *            The message to select
	 */
	public EEFValidationMessagesPage(IMessage[] messages, IMessage selectedMessage) {
		this(messages);
		this.selectedMessage = selectedMessage;
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
		label.setText(Messages.EEFValidationRulesPage_label);
		label.setLayoutData(new FormData());

		// Create the list for the message
		this.validationMessagesList = new TableViewer(control, SWT.BORDER | SWT.SINGLE | SWT.V_SCROLL);
		this.validationMessagesList.setContentProvider(new EEFValidationMessagesTableContentProvider());
		this.validationMessagesList.setLabelProvider(new EEFValidationMessagesTableLabelProvider());
		this.validationMessagesList.setComparator(new EEFValidationMessagesTableComparator());
		this.validationMessagesList.addSelectionChangedListener((event) -> {
			// Sets the new selected message
			ISelection selection = event.getSelection();
			if (selection instanceof IStructuredSelection) {
				IStructuredSelection structuredSelection = (IStructuredSelection) selection;
				Object element = structuredSelection.getFirstElement();
				if (element instanceof IMessage) {
					this.selectedMessage = (IMessage) element;
				}
			}

			if (this.selectedMessage.getKey() instanceof EEFValidationRuleDescription) {
				EEFValidationRuleDescription validationRuleDescription = (EEFValidationRuleDescription) this.selectedMessage.getKey();
				if (validationRuleDescription.getFixes().size() == 0) {
					this.setMessage(Messages.EEFQuickFixWizard_noQuickFixAvailable, IMessageProvider.ERROR);
				} else {
					this.setMessage(null);
				}
			}
			this.setPageComplete(true);
		});

		FormData listData = new FormData();
		listData.top = new FormAttachment(label, 0);
		listData.left = new FormAttachment(0);
		listData.right = new FormAttachment(100, 0);
		listData.height = convertHeightInCharsToPixels(10);
		this.validationMessagesList.getControl().setLayoutData(listData);

		this.validationMessagesList.setInput(this.messages);

		Dialog.applyDialogFont(control);

		// Select the first quick fix available
		this.validationMessagesList.setSelection(new StructuredSelection(this.validationMessagesList.getElementAt(0)));
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.jface.wizard.WizardPage#isPageComplete()
	 */
	@Override
	public boolean isPageComplete() {
		// There is always a next page
		return true;
	}

	/**
	 * Returns the selected {@link IMessage}.
	 *
	 * @return The selected message
	 */
	public IMessage getSelectedMessage() {
		return this.selectedMessage;
	}

}
