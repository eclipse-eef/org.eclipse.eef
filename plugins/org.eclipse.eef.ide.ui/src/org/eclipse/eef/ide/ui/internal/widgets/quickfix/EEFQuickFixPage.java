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

import java.lang.reflect.InvocationTargetException;
import java.text.MessageFormat;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.eef.EEFValidationFixDescription;
import org.eclipse.eef.EEFValidationRuleDescription;
import org.eclipse.eef.EefPackage;
import org.eclipse.eef.core.api.utils.Eval.EvalBuilder;
import org.eclipse.eef.ide.ui.internal.EEFIdeUiPlugin;
import org.eclipse.eef.ide.ui.internal.Messages;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.operation.IRunnableWithProgress;
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
	 * The evaluation utility class.
	 */
	private EvalBuilder<?> eval;

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
	 * @param eval
	 *            The evaluation utility class
	 */
	public EEFQuickFixPage(IMessage message, EEFValidationRuleDescription validationRule, EvalBuilder<?> eval) {
		super(message.getMessage());
		this.setTitle(Messages.EEFQuickFixPage_title);
		this.setDescription(MessageFormat.format(Messages.EEFQuickFixPage_description, message.getMessage()));
		this.validationRule = validationRule;
		this.eval = eval;
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
		this.quickFixesList.setSelection(new StructuredSelection(this.quickFixesList.getElementAt(0)));
	}

	/**
	 * Launch the selected quick fix in the list.
	 *
	 * @param monitor
	 *            The progress monitor
	 */
	public void performFinish(IProgressMonitor monitor) {
		try {
			this.getWizard().getContainer().run(false, true, new IRunnableWithProgress() {
				@Override
				public void run(IProgressMonitor progressMonitor) throws InvocationTargetException, InterruptedException {
					progressMonitor.beginTask(Messages.EEFQuickFixWizard_applyQuickFix, 1);
					EEFQuickFixPage.this.getShell().getDisplay().readAndDispatch();
					if (progressMonitor.isCanceled()) {
						return;
					}

					ISelection selection = EEFQuickFixPage.this.quickFixesList.getSelection();
					if (selection instanceof IStructuredSelection) {
						IStructuredSelection structuredSelection = (IStructuredSelection) selection;
						// Only one quick fix can be selected
						Object element = structuredSelection.getFirstElement();
						if (element instanceof EEFValidationFixDescription) {
							// Run the quick fix using the given eval
							EEFValidationFixDescription validationFix = (EEFValidationFixDescription) element;
							EAttribute expressionEAttribute = EefPackage.Literals.EEF_VALIDATION_FIX_DESCRIPTION__FIX_EXPRESSION;
							EEFQuickFixPage.this.eval.logIfBlank(expressionEAttribute).call(validationFix.getFixExpression());
						}
					}

					progressMonitor.worked(1);
				}
			});
		} catch (InvocationTargetException e) {
			EEFIdeUiPlugin.getPlugin().error(e.getMessage(), e);
		} catch (InterruptedException e) {
			EEFIdeUiPlugin.getPlugin().error(e.getMessage(), e);
		}
	}
}
