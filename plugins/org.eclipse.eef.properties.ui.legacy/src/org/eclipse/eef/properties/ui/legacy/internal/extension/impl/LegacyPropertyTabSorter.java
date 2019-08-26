/*******************************************************************************
 * Copyright (c) 2019 Obeo.
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

import org.eclipse.eef.properties.ui.api.IEEFTabDescriptor;

/**
 * Utility class used to sort the property tabs.
 *
 * @author arichard
 */
public class LegacyPropertyTabSorter {

	/**
	 * Sort tabs by after tab. Tabs without after tab are put at the beginning of the list as they appear.
	 *
	 * @param tabs
	 *            List of tabs
	 * @return List of tabs sorted by after tab
	 */
	public List<IEEFTabDescriptor> sortTabsByAfterTab(Collection<IEEFTabDescriptor> tabs) {
		List<IEEFTabDescriptor> sorted = new ArrayList<IEEFTabDescriptor>(tabs);

		Collections.sort(sorted, (tab1, tab2) -> {
			int result = 0;
			if (tab1.getId().equals(tab2.getAfterTab())) {
				result = -1;
			} else if (tab2.getId().equals(tab1.getAfterTab())) {
				result = 1;
			} else if (this.isNullEmpty(tab1.getAfterTab()) && !this.isNullEmpty(tab2.getAfterTab())) {
				result = -1;
			} else if (this.isNullEmpty(tab2.getAfterTab()) && !this.isNullEmpty(tab1.getAfterTab())) {
				result = 1;
			} else if (this.isTop(tab1.getAfterTab())) {
				result = -1;
			} else if (this.isTop(tab2.getAfterTab())) {
				result = 1;
			}
			return result;
		});

		return sorted;
	}

	/**
	 * Indicates if the given after tab is null, an empty string.
	 *
	 * @param afterTab
	 *            The after tab
	 * @return <code>true</code> if the after tab is null, an empty string
	 */
	private boolean isNullEmpty(String afterTab) {
		return afterTab == null || afterTab.isEmpty();
	}

	/**
	 * Indicates if the given after tab is top.
	 *
	 * @param afterTab
	 *            The after tab
	 * @return <code>true</code> if the after tab is top
	 */
	private boolean isTop(String afterTab) {
		return "top".equals(afterTab); //$NON-NLS-1$
	}
}
