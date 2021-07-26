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

import static java.util.stream.Collectors.toList;

import java.util.List;

import org.eclipse.swt.custom.StyleRange;

public class StyleDescription {

	private final List<StyleRange> styles;

	private final List<LineBackground> lineBackgrounds;

	public StyleDescription(List<StyleRange> styles, List<LineBackground> lineBackgrounds) {
		super();
		this.styles = styles;
		this.lineBackgrounds = lineBackgrounds;
	}

	public List<StyleRange> getStyles() {
		return styles;
	}

	public StyleDescription filterWithText(String text) {

		long nbLine = text.lines().count();

		int length = text.length();
		List<StyleRange> filteredStyle = styles.stream().filter(sr -> {
			return sr.length + sr.start <= length;
		}).collect(toList());

		List<LineBackground> filteredLineBackground = lineBackgrounds.stream()
				.filter(lb -> lb.getEndLine() < nbLine).collect(toList());

		return new StyleDescription(filteredStyle, filteredLineBackground);

	}

	public List<LineBackground> getLineBackgrounds() {
		return lineBackgrounds;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((lineBackgrounds == null) ? 0 : lineBackgrounds.hashCode());
		result = prime * result + ((styles == null) ? 0 : styles.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StyleDescription other = (StyleDescription) obj;
		if (lineBackgrounds == null) {
			if (other.lineBackgrounds != null)
				return false;
		} else if (!lineBackgrounds.equals(other.lineBackgrounds))
			return false;
		if (styles == null) {
			if (other.styles != null)
				return false;
		} else if (!styles.equals(other.styles))
			return false;
		return true;
	}

}