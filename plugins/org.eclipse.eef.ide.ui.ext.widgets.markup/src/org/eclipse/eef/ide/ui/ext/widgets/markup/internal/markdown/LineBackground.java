/*******************************************************************************
 * Copyright (c) 2018 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.eef.ide.ui.ext.widgets.markup.internal.markdown;

import org.eclipse.swt.graphics.Color;

public class LineBackground {

	private final int startLine;

	private final int endLine;

	private final Color color;

	public LineBackground(int startLine, int endLine, Color color) {
		super();
		this.startLine = startLine;
		this.endLine = endLine;
		this.color = color;
	}

	public int getStartLine() {
		return startLine;
	}

	public int getEndLine() {
		return endLine;
	}

	public Color getColor() {
		return color;
	}
}