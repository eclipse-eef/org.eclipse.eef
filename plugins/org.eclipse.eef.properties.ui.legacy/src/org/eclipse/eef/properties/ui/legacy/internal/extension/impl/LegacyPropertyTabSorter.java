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
import java.util.List;

import org.eclipse.eef.properties.ui.api.IEEFTabDescriptor;

/**
 * Utility class used to sort the property tabs.
 *
 * @author arichard
 */
public class LegacyPropertyTabSorter {

	/**
	 * Sort tabs by after tab. Top tabs and tabs without after tab are put at the beginning of the list as they appear.
	 *
	 * @param tabs
	 *            List of tabs
	 * @return List of tabs sorted by after tab
	 */
	public List<IEEFTabDescriptor> sortTabsByAfterTab(Collection<IEEFTabDescriptor> tabs) {
		List<IEEFTabDescriptor> sorted = new ArrayList<IEEFTabDescriptor>(tabs);
		List<IEEFTabDescriptor> processed = new ArrayList<IEEFTabDescriptor>();
		int lastIndex = sorted.size() - 1;

		for (int i = 0; i <= lastIndex; i++) {
			IEEFTabDescriptor lastUnprocessedTab = getLastUnprocessedTab(sorted, processed);
			if (lastUnprocessedTab != null) {
				String lastUnprocessedTabId = lastUnprocessedTab.getId();
				if (!isNullEmpty(lastUnprocessedTabId)) {
					for (IEEFTabDescriptor tab : tabs) {
						if (lastUnprocessedTabId.equals(tab.getAfterTab())) {
							sorted.remove(tab);
							sorted.add(sorted.indexOf(lastUnprocessedTab) + 1, tab);
						}
					}
				}
				processed.add(lastUnprocessedTab);
			}
		}

		// Move top tabs and tabs without afterTab at the beginning of the list
		int index = 0;
		for (IEEFTabDescriptor tab : tabs) {
			String afterTab = tab.getAfterTab();
			if (isNullEmpty(afterTab) || isTop(afterTab)) {
				sorted.remove(tab);
				sorted.add(index, tab);
				index++;
			}
		}

		return sorted;
	}

	/**
	 * Get the last tab that has not been processed yet by {@link #sortTabsByAfterTab(Collection)}.
	 *
	 * @param tabs
	 *            The list of tabs.
	 * @param processed
	 *            The list of already processed tabs.
	 * @return The last tab that has not been processed yet by {@link #sortTabsByAfterTab(Collection)}
	 */
	private IEEFTabDescriptor getLastUnprocessedTab(List<IEEFTabDescriptor> tabs, List<IEEFTabDescriptor> processed) {
		for (int i = tabs.size() - 1; i >= 0; i--) {
			IEEFTabDescriptor lastUnprocessedTab = tabs.get(i);
			if (!processed.contains(lastUnprocessedTab)) {
				return lastUnprocessedTab;
			}
		}
		return null;
	}

	/**
	 * Indicates if the given id is null, or an empty string.
	 *
	 * @param id
	 *            The id
	 * @return <code>true</code> if the id is null, or an empty string
	 */
	private boolean isNullEmpty(String id) {
		return id == null || id.isEmpty();
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
