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

import java.text.MessageFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.eef.ide.ui.internal.EEFIdeUiPlugin;
import org.eclipse.eef.ide.ui.internal.Messages;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;

/**
 * Represents a color in EEF.
 *
 * @author mbats
 */
public class EEFColor {
	/**
	 * Hex radix.
	 */
	private static final int HEX = 16;

	/**
	 * Key prefix.
	 */
	private static final String KEY_PREFIX = EEFColor.class.getCanonicalName() + "."; //$NON-NLS-1$

	/**
	 * The color.
	 */
	private Color color;

	/**
	 * The constructor.
	 *
	 * @param colorCode
	 *            The color code it can be defined as hex (#000000) or as RGB (rgb(0,0,0))
	 */
	public EEFColor(String colorCode) {
		if (colorCode.startsWith("#")) { //$NON-NLS-1$
			color = hexToColor(colorCode);
		} else if (colorCode.startsWith("rgb")) { //$NON-NLS-1$
			// Else it is RGB
			color = rgbToColor(colorCode);
		} else {
			String message = MessageFormat.format(Messages.EEFColor_invalidColorCode, colorCode);
			EEFIdeUiPlugin.getPlugin().error(message);
		}
	}

	/**
	 * Constructor.
	 *
	 * @param color
	 *            Color
	 */
	public EEFColor(Color color) {
		this.color = color;
	}

	/**
	 * Get the color as an rgb string.
	 *
	 * @return RGB string as rgb(0,0,0)
	 */
	public String colorToString() {
		return "rgb(" + color.getRed() + "," + color.getGreen() + "," + color.getBlue() + ")"; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	}

	/**
	 * Convert an hex color code to a color.
	 *
	 * @param colorCode
	 *            Hex color code as #000000
	 * @return The color
	 */
	private Color hexToColor(String colorCode) {
		RGB rgb = hexToRGB(colorCode.substring(1));
		return getColor(rgb.red, rgb.green, rgb.blue);
	}

	/**
	 * Convert a rgb color code to a color.
	 *
	 * @param colorCode
	 *            RGB color code as rgb(0,0,0)
	 * @return The color
	 */
	private Color rgbToColor(String colorCode) {
		Pattern c = Pattern.compile("rgb *\\( *([0-9]+), *([0-9]+), *([0-9]+) *\\)"); //$NON-NLS-1$
		Matcher m = c.matcher(colorCode);

		if (m.matches()) {
			return getColor(Integer.valueOf(m.group(1)).intValue(), // r
					Integer.valueOf(m.group(2)).intValue(), // g
					Integer.valueOf(m.group(3)).intValue()); // b
		}
		return null;
	}

	/**
	 * Get color.
	 *
	 * @param red
	 *            Red
	 * @param green
	 *            Green
	 * @param blue
	 *            Blue
	 * @return The color
	 */
	private Color getColor(int red, int green, int blue) {
		String key = getColorKey(red, green, blue);
		if (JFaceResources.getColorRegistry().hasValueFor(key)) {
			return JFaceResources.getColorRegistry().get(key);
		} else {
			JFaceResources.getColorRegistry().put(key, new RGB(red, green, blue));
			return getColor(key);
		}
	}

	/**
	 * Get color.
	 *
	 * @param key
	 *            Key
	 * @return The color.
	 */
	private Color getColor(String key) {
		return JFaceResources.getColorRegistry().get(key);
	}

	/**
	 * Get the color key.
	 *
	 * @param red
	 *            Red
	 * @param green
	 *            Green
	 * @param blue
	 *            Blue
	 * @return The color key
	 */
	private String getColorKey(int red, int green, int blue) {
		return KEY_PREFIX + "_COLOR_" + red + "_" + green + "_" + blue; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
	}

	/**
	 * Get the color.
	 *
	 * @return The color
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * Convert an hex color code to RGB.
	 *
	 * @param hex
	 *            Hex color code
	 * @return The RGB
	 */
	private RGB hexToRGB(String hex) {
		RGB rgb = null;
		if (hex != null && hex.length() == 6) {
			rgb = new RGB(Integer.parseInt(hex.substring(0, 2), HEX), Integer.parseInt(hex.substring(2, 4), HEX),
					Integer.parseInt(hex.substring(4, 6), HEX));
		}
		return rgb;
	}
}
