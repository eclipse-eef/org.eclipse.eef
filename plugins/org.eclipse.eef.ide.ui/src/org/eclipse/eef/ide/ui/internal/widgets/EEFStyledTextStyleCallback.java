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
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.custom.StyledText;

/**
 * Applies the new style to the given styled text.
 *
 * @author sbegaudeau
 */
public class EEFStyledTextStyleCallback implements IEEFTextStyleCallback {
	/**
	 * The styled text.
	 */
	private StyledText styledText;

	/**
	 * The constructor.
	 *
	 * @param styledText
	 *            The styled text
	 */
	public EEFStyledTextStyleCallback(StyledText styledText) {
		this.styledText = styledText;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.EEFStyleHelper.IEEFTextStyleCallback#applyFont(org.eclipse.eef.ide.ui.internal.widgets.styles.EEFFont)
	 */
	@Override
	public void applyFont(EEFFont font) {
		this.styledText.setFont(font.getFont());
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.EEFStyleHelper.IEEFTextStyleCallback#applyFontStyle(boolean, boolean)
	 */
	@Override
	public void applyFontStyle(boolean strikeout, boolean underline) {
		StyleRange styleRange = new StyleRange();
		styleRange.start = 0;
		styleRange.length = this.styledText.getCharCount();
		styleRange.underline = underline;
		styleRange.strikeout = strikeout;

		this.styledText.setStyleRange(styleRange);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.EEFStyleHelper.IEEFTextStyleCallback#applyForegroundColor(org.eclipse.eef.ide.ui.internal.widgets.styles.EEFColor)
	 */
	@Override
	public void applyForegroundColor(EEFColor color) {
		this.styledText.setForeground(color.getColor());
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.EEFStyleHelper.IEEFTextStyleCallback#applyBackgroundColor(org.eclipse.eef.ide.ui.internal.widgets.styles.EEFColor)
	 */
	@Override
	public void applyBackgroundColor(EEFColor color) {
		this.styledText.setBackground(color.getColor());
	}
}
