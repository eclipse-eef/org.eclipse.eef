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

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.eef.EEFValidationRuleDescription;
import org.eclipse.eef.core.api.controllers.InvalidValidationRuleResultData;
import org.eclipse.eef.ide.ui.internal.EEFIdeUiPlugin;
import org.eclipse.eef.ide.ui.internal.Icons;
import org.eclipse.eef.ide.ui.internal.Messages;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.forms.IMessage;

/**
 * The wizard used to display and launch the quick fixes.
 *
 * @author sbegaudeau
 */
public class EEFQuickFixWizard extends Wizard {

	/**
	 * The number of ticks that can be consumed by each sub task.
	 */
	private static final int SUBMONITOR_TASK_WORK = 10;

	/**
	 * The messages displayed to the end user.
	 */
	private IMessage[] messages;

	/**
	 * The page displaying all the validation messages.
	 */
	private EEFValidationMessagesPage validationMessagesPage;

	/**
	 * The page displaying all the quick fixes.
	 */
	private EEFQuickFixPage quickFixPage;

	/**
	 * The constructor.
	 *
	 * @param messages
	 *            The messages displayed to the end user
	 */
	public EEFQuickFixWizard(IMessage[] messages) {
		this.messages = messages;
		this.setWindowTitle(Messages.EEFQuickFixWizard_windowTitle);
		this.setDefaultPageImageDescriptor(EEFIdeUiPlugin.getPlugin().getImageDescriptor(Icons.QUICK_FIX));
		this.setNeedsProgressMonitor(true);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.jface.wizard.Wizard#addPages()
	 */
	@Override
	public void addPages() {
		super.addPages();

		if (this.messages.length == 1) {
			// We have only one validation rule violated, let's show only the fix available
			IMessage message = this.messages[0];
			if (message.getKey() instanceof EEFValidationRuleDescription && message.getData() instanceof InvalidValidationRuleResultData) {
				EEFValidationRuleDescription validationRule = (EEFValidationRuleDescription) message.getKey();
				InvalidValidationRuleResultData data = (InvalidValidationRuleResultData) message.getData();

				this.quickFixPage = new EEFQuickFixPage(message, validationRule, data);
				this.addPage(this.quickFixPage);
			}
		} else {
			// We have multiple validation rules violated, the user must select the one to fix
			this.validationMessagesPage = new EEFValidationMessagesPage(this.messages);
			this.addPage(this.validationMessagesPage);
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.jface.wizard.Wizard#getNextPage(org.eclipse.jface.wizard.IWizardPage)
	 */
	@Override
	public IWizardPage getNextPage(IWizardPage page) {
		// If we do not have a single message, we need to customize this
		if (this.messages.length != 1 && page instanceof EEFValidationMessagesPage) {
			EEFValidationMessagesPage validationRulesPage = (EEFValidationMessagesPage) page;
			IMessage message = validationRulesPage.getSelectedMessage();

			// The second page will show the quick fixes of the message of the first page
			if (message.getKey() instanceof EEFValidationRuleDescription && message.getData() instanceof InvalidValidationRuleResultData) {
				EEFValidationRuleDescription validationRule = (EEFValidationRuleDescription) message.getKey();

				if (validationRule.getFixes().size() > 0) {
					InvalidValidationRuleResultData data = (InvalidValidationRuleResultData) message.getData();
					this.quickFixPage = new EEFQuickFixPage(message, validationRule, data);
					this.quickFixPage.setWizard(this);
					return this.quickFixPage;
				}
			}
		}
		return super.getNextPage(page);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.jface.wizard.Wizard#getPreviousPage(org.eclipse.jface.wizard.IWizardPage)
	 */
	@Override
	public IWizardPage getPreviousPage(IWizardPage page) {
		// If we do not have a single message, we need to customize this too
		if (this.messages.length != -1 && page == this.quickFixPage) {
			// Make sure that we can navigate back and forth with the same IMessage
			this.validationMessagesPage = new EEFValidationMessagesPage(this.messages, quickFixPage.getSelectedMessage());
			this.validationMessagesPage.setWizard(this);
			this.quickFixPage = null;
			return this.validationMessagesPage;
		}

		return super.getPreviousPage(page);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.jface.wizard.Wizard#needsPreviousAndNextButtons()
	 */
	@Override
	public boolean needsPreviousAndNextButtons() {
		return this.messages.length > 1;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.jface.wizard.Wizard#canFinish()
	 */
	@Override
	public boolean canFinish() {
		boolean canFinish = this.getContainer().getCurrentPage() == this.quickFixPage;

		canFinish = canFinish && (this.validationMessagesPage == null || this.validationMessagesPage.isPageComplete());
		canFinish = canFinish && (this.quickFixPage != null && this.quickFixPage.isPageComplete());

		return canFinish;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.jface.wizard.Wizard#performFinish()
	 */
	@Override
	public boolean performFinish() {
		IRunnableWithProgress runnable = new IRunnableWithProgress() {
			@Override
			public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
				SubMonitor subMonitor = SubMonitor.convert(monitor, Messages.EEFQuickFixWizard_applyQuickFix, SUBMONITOR_TASK_WORK + 1);
				subMonitor.worked(1);

				if (EEFQuickFixWizard.this.quickFixPage != null) {
					// Use submonitor.split once we get to Neon as the minimum target platfom

					EEFQuickFixWizard.this.getShell().getDisplay().readAndDispatch();
					EEFQuickFixWizard.this.quickFixPage.performFinish(subMonitor.newChild(SUBMONITOR_TASK_WORK));
				}
			}
		};

		boolean finishedProperly = true;

		try {
			this.getContainer().run(false, true, runnable);
		} catch (InvocationTargetException e) {
			finishedProperly = false;
			EEFIdeUiPlugin.getPlugin().error(e.getMessage(), e);
		} catch (InterruptedException e) {
			finishedProperly = false;
			EEFIdeUiPlugin.getPlugin().error(e.getMessage(), e);
		}

		return finishedProperly;
	}
}
