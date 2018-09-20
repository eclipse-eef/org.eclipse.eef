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
package org.eclipse.eef.ide.ui.internal.widgets;

import org.eclipse.eef.ide.ui.api.widgets.EEFStyleHelper.IEEFTextStyleCallback;
import org.eclipse.eef.ide.ui.internal.widgets.styles.EEFColor;
import org.eclipse.eef.ide.ui.internal.widgets.styles.EEFFont;
import org.eclipse.swt.widgets.Button;

/**
 * This callback will be used to apply the text style to the label of a checkbox.
 *
 * @author sbegaudeau
 */
public class EEFCheckboxStyleCallback implements IEEFTextStyleCallback {

	/**
	 * The checkbox.
	 */
	private Button checkbox;

	/**
	 * The constructor.
	 *
	 * @param checkbox
	 *            The checkbox
	 */
	public EEFCheckboxStyleCallback(Button checkbox) {
		this.checkbox = checkbox;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.EEFStyleHelper.IEEFTextStyleCallback#applyFont(org.eclipse.eef.ide.ui.internal.widgets.styles.EEFFont)
	 */
	@Override
	public void applyFont(EEFFont font) {
		this.checkbox.setFont(font.getFont());
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.EEFStyleHelper.IEEFTextStyleCallback#applyFontStyle(boolean, boolean)
	 */
	@Override
	public void applyFontStyle(boolean strikeout, boolean underline) {
		// do not apply
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.EEFStyleHelper.IEEFTextStyleCallback#applyForegroundColor(org.eclipse.eef.ide.ui.internal.widgets.styles.EEFColor)
	 */
	@Override
	public void applyForegroundColor(EEFColor color) {
		this.checkbox.setForeground(color.getColor());
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.EEFStyleHelper.IEEFTextStyleCallback#applyBackgroundColor(org.eclipse.eef.ide.ui.internal.widgets.styles.EEFColor)
	 */
	@Override
	public void applyBackgroundColor(EEFColor color) {
		this.checkbox.setBackground(color.getColor());
	}

}
