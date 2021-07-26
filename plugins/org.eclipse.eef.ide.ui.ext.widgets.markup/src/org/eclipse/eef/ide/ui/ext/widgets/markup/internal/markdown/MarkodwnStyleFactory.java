/**
 * Copyright (c) Israel Aerospace Industries, Eclipse contributors and others 2021.
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *
 */

package org.eclipse.eef.ide.ui.ext.widgets.markup.internal.markdown;

import org.eclipse.jface.resource.ColorRegistry;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;

public class MarkodwnStyleFactory {

	// Package visibility for testing purpose
	static final RGB HEADER_RGB = new RGB(128, 0, 0);
	static final RGB LINK_LABEL_HEADER = new RGB(163, 21, 21);

	private static final String LIST_ITEM_MARKER = "ListItemMarker"; //$NON-NLS-1$
	private static final String LINK_LABEL = "LinkLabel"; //$NON-NLS-1$
	private static final String UNDERLINE = "Underline"; //$NON-NLS-1$
	private static final String QUOTE = "Quote"; //$NON-NLS-1$
	private static final String CODE = "Code"; //$NON-NLS-1$
	private static final String H = "Header"; //$NON-NLS-1$
	private ColorRegistry colorRegistry;

	public MarkodwnStyleFactory(Display display) {
		colorRegistry = new ColorRegistry(display, true);

		init();
	}

	private void init() {
		colorRegistry.put(LINK_LABEL, LINK_LABEL_HEADER);
		colorRegistry.put(H, HEADER_RGB);
		colorRegistry.put(LIST_ITEM_MARKER, new RGB(4, 81, 165));
		colorRegistry.put(CODE, new RGB(235, 235, 235));
		colorRegistry.put(QUOTE, new RGB(245, 220, 152));
		colorRegistry.put(UNDERLINE, new RGB(0, 0, 161));

	}

	public StyleRange buildHeaderStyle(int start, int lenght, int level) {
		return new StyleRange(start, lenght, getHeadingColor(), null);
	}

	public StyleRange buildLinkLabelStyle(int start, int lenght) {
		return new StyleRange(start, lenght, colorRegistry.get(LINK_LABEL), null);
	}

	public StyleRange buildBoldStyle(int start, int lenght) {
		return new StyleRange(start, lenght, null, null, SWT.BOLD);
	}

	public StyleRange buildListItemMarkerStyle(int start, int lenght) {
		return new StyleRange(start, lenght, colorRegistry.get(LIST_ITEM_MARKER), null, SWT.BOLD);
	}

	public StyleRange buildItalicStyle(int start, int lenght) {
		return new StyleRange(start, lenght, null, null, SWT.ITALIC);
	}

	public StyleRange buildLinkStyle(int start, int lenght) {
		StyleRange styleRange = new StyleRange(start, lenght, colorRegistry.get(UNDERLINE), null, SWT.UNDERLINE_SINGLE);
		styleRange.underline = true;
		return styleRange;
	}

	public StyleRange buildCodeStyle(int start, int lenght) {
		return new StyleRange(start, lenght, null, getCodeColor());
	}

	public Color getCodeColor() {
		return colorRegistry.get(CODE);
	}

	public StyleRange buildQuoteStyle(int start, int end) {
		return new StyleRange(start, end, null, getQuoteColor());
	}

	public Color getHeadingColor() {
		return colorRegistry.get(H);
	}

	public Color getQuoteColor() {
		return colorRegistry.get(QUOTE);
	}

}
