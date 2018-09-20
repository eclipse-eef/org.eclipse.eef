/*******************************************************************************
 * Copyright (c) 2015, 2018 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors: Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.eef.properties.ui.legacy.internal.extension.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.eef.properties.ui.api.IEEFSectionDescriptor;

/**
 * Utility class used to sort the property sections.
 *
 * @author sbegaudeau
 */
public class LegacyPropertySectionSorter {

	/**
	 * Sort sections of a tab by after section.
	 *
	 * @param sections
	 *            List of sections
	 * @return List of sections sorted by after section
	 */
	public List<IEEFSectionDescriptor> sortSectionsByAfterSection(Collection<IEEFSectionDescriptor> sections) {
		List<IEEFSectionDescriptor> sorted = new ArrayList<IEEFSectionDescriptor>(sections);

		Collections.sort(sorted, (section1, section2) -> {
			int result = 0;
			if (section1.getId().equals(section2.getAfterSection())) {
				result = -1;
			} else if (section2.getId().equals(section1.getAfterSection())) {
				result = 1;
			} else if (this.isNullEmpty(section1.getAfterSection()) && !this.isNullEmpty(section2.getAfterSection())) {
				result = -1;
			} else if (this.isNullEmpty(section2.getAfterSection()) && !this.isNullEmpty(section1.getAfterSection())) {
				result = 1;
			} else if (this.isTop(section1.getAfterSection())) {
				result = -1;
			} else if (this.isTop(section2.getAfterSection())) {
				result = 1;
			}
			return result;
		});

		return sorted;
	}

	/**
	 * Indicates if the given after section is null, an empty string.
	 *
	 * @param afterSection
	 *            The after section
	 * @return <code>true</code> if the after section is null, an empty string
	 */
	private boolean isNullEmpty(String afterSection) {
		return afterSection == null || afterSection.isEmpty();
	}

	/**
	 * Indicates if the given after section is top.
	 *
	 * @param afterSection
	 *            The after section
	 * @return <code>true</code> if the after section is top
	 */
	private boolean isTop(String afterSection) {
		return "top".equals(afterSection); //$NON-NLS-1$
	}
}
