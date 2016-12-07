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
package org.eclipse.eef.ide.ui.internal.widgets;

import org.eclipse.eef.ide.ui.api.widgets.EEFStyleHelper.IEEFTextStyleCallback;
import org.eclipse.eef.ide.ui.internal.widgets.styles.EEFColor;
import org.eclipse.eef.ide.ui.internal.widgets.styles.EEFFont;
import org.eclipse.swt.widgets.Spinner;

/**
 * Applies the new style to the given spinner.
 *
 * @author arichard
 */
public class EEFSpinnerStyleCallback implements IEEFTextStyleCallback {
	/**
	 * The spinner.
	 */
	private Spinner spinner;

	/**
	 * The constructor.
	 *
	 * @param spinner
	 *            The Spinner
	 */
	public EEFSpinnerStyleCallback(Spinner spinner) {
		this.spinner = spinner;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.EEFStyleHelper.IEEFTextStyleCallback#applyFont(org.eclipse.eef.ide.ui.internal.widgets.styles.EEFFont)
	 */
	@Override
	public void applyFont(EEFFont font) {
		this.spinner.setFont(font.getFont());
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
		this.spinner.setForeground(color.getColor());
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.EEFStyleHelper.IEEFTextStyleCallback#applyBackgroundColor(org.eclipse.eef.ide.ui.internal.widgets.styles.EEFColor)
	 */
	@Override
	public void applyBackgroundColor(EEFColor color) {
		this.spinner.setBackground(color.getColor());
	}
}
