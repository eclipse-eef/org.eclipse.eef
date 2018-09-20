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
package org.eclipse.eef.ide.ui.internal.preferences;

import org.eclipse.eef.common.api.preferences.EEFCommonPreferences;
import org.eclipse.eef.ide.ui.internal.Messages;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

/**
 * The EEF preference page.
 *
 * @author sbegaudeau
 */
public class EEFPreferencePage extends PreferencePage implements IWorkbenchPreferencePage {

	/**
	 * The button used to toggle the debug mode.
	 */
	private Button debugButton;

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	@Override
	public void init(IWorkbench workbench) {
		// do nothing
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.jface.preference.PreferencePage#createContents(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	protected Control createContents(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new GridLayout());

		this.debugButton = new Button(composite, SWT.CHECK);
		this.debugButton.setText(Messages.EEFPreferencePage_DebugButton_Text);
		this.debugButton.setToolTipText(Messages.EEFPreferencePage_DebugButton_Tooltip);
		this.debugButton.setSelection(EEFCommonPreferences.isDebugEnabled());

		return composite;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.jface.preference.PreferencePage#performDefaults()
	 */
	@Override
	protected void performDefaults() {
		EEFCommonPreferences.setDebug(false);
		this.debugButton.setSelection(false);
		super.performDefaults();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.jface.preference.PreferencePage#performApply()
	 */
	@Override
	protected void performApply() {
		EEFCommonPreferences.setDebug(this.debugButton.getSelection());
		super.performApply();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.jface.preference.PreferencePage#performOk()
	 */
	@Override
	public boolean performOk() {
		EEFCommonPreferences.setDebug(this.debugButton.getSelection());
		return super.performOk();
	}

}
