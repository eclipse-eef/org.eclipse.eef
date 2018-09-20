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
package org.eclipse.eef.ide.ui.internal.widgets.styles;

import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;

/**
 * Represents a font in EEF.
 *
 * @author mbats
 */
public class EEFFont {
	/**
	 * Key prefix.
	 */
	private static final String KEY_PREFIX = EEFFont.class.getCanonicalName() + "."; //$NON-NLS-1$

	/**
	 * The font.
	 */
	private Font font;

	/**
	 * The constructor.
	 *
	 * @param name
	 *            Name
	 * @param height
	 *            Height
	 * @param style
	 *            Style
	 */
	public EEFFont(String name, int height, int style) {
		font = getFont(name, height, style);
	}

	/**
	 * Get font.
	 *
	 * @param name
	 *            Name Green
	 * @param height
	 *            Height
	 * @param style
	 *            Style
	 * @return The font
	 */
	private Font getFont(String name, int height, int style) {
		FontData defaultFontData = JFaceResources.getFontRegistry().defaultFont().getFontData()[0];
		String fontName = name;
		if (fontName == null) {
			fontName = defaultFontData.getName();
		}
		int fontHeight = height;
		if (fontHeight == 0) {
			fontHeight = defaultFontData.getHeight();
		}

		String key = getFontKey(fontName, fontHeight, style);
		if (JFaceResources.getFontRegistry().hasValueFor(key)) {
			return JFaceResources.getFontRegistry().get(key);
		} else {
			JFaceResources.getFontRegistry().put(key, new FontData[] { new FontData(fontName, fontHeight, style) });
			return getFont(key);
		}
	}

	/**
	 * Get font.
	 *
	 * @param key
	 *            Key
	 * @return The font.
	 */
	private Font getFont(String key) {
		return JFaceResources.getFontRegistry().get(key);
	}

	/**
	 * Get the font key.
	 *
	 * @param name
	 *            Name
	 * @param height
	 *            Height
	 * @param style
	 *            Style
	 * @return The font key
	 */
	private String getFontKey(String name, int height, int style) {
		return KEY_PREFIX + "_FONT_" + name + "_" + height + "_" + style; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
	}

	/**
	 * Get the font.
	 *
	 * @return The color
	 */
	public Font getFont() {
		return font;
	}
}
