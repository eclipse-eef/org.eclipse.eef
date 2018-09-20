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

import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.forms.IMessage;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.eclipse.ui.forms.events.IHyperlinkListener;

/**
 * The hyperlink listener will be used to display the quick fix to run when the user click on a message.
 *
 * @author sbegaudeau
 */
public class EEFMessageHyperlinkListener implements IHyperlinkListener {

	/**
	 * The shell.
	 */
	private Shell shell;

	/**
	 * The constructor.
	 *
	 * @param shell
	 *            The shell used to display the page
	 */
	public EEFMessageHyperlinkListener(Shell shell) {
		this.shell = shell;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.ui.forms.events.IHyperlinkListener#linkEntered(org.eclipse.ui.forms.events.HyperlinkEvent)
	 */
	@Override
	public void linkEntered(HyperlinkEvent event) {
		// do nothing
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.ui.forms.events.IHyperlinkListener#linkExited(org.eclipse.ui.forms.events.HyperlinkEvent)
	 */
	@Override
	public void linkExited(HyperlinkEvent event) {
		// do nothing
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.ui.forms.events.IHyperlinkListener#linkActivated(org.eclipse.ui.forms.events.HyperlinkEvent)
	 */
	@Override
	public void linkActivated(HyperlinkEvent event) {
		Object data = event.data;
		if (data instanceof IMessage[]) {
			IMessage[] messages = (IMessage[]) data;
			Wizard wizard = new EEFQuickFixWizard(messages);
			WizardDialog wizardDialog = new WizardDialog(shell, wizard);
			wizardDialog.open();
		}
	}

}
