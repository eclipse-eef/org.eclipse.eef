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
package org.eclipse.eef.ui.tests.internal;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.eef.properties.ui.api.EEFTabContents;
import org.eclipse.eef.properties.ui.api.IEEFSectionDescriptor;
import org.eclipse.eef.properties.ui.api.IEEFTabDescriptor;
import org.eclipse.eef.properties.ui.legacy.internal.extension.impl.LegacyPropertyTabSorter;
import org.eclipse.swt.graphics.Image;
import org.junit.Test;

/**
 * Test class for the LegacyPropertyTabSorter.
 *
 * @author arichard
 */
@SuppressWarnings({ "checkstyle:javadocmethod" })
public class LegacyPropertyTabSorterTests {

	/**
	 * The special after tab for the TOP tab.
	 */
	private static final String TOP = "top"; //$NON-NLS-1$

	/**
	 * Utility class to test the tab descriptor.
	 *
	 * @author arichard
	 */
	private static class TestTabDescriptor implements IEEFTabDescriptor {

		/**
		 * The id.
		 */
		private String id;

		/**
		 * The after tab.
		 */
		private String afterTab;

		/**
		 * The constructor.
		 *
		 * @param id
		 *            The id
		 * @param afterTab
		 *            The after tab
		 */
		TestTabDescriptor(String id, String afterTab) {
			this.id = id;
			this.afterTab = afterTab;
		}

		@Override
		public String getId() {
			return this.id;
		}

		@Override
		public String getAfterTab() {
			return this.afterTab;
		}

		@Override
		public String toString() {
			return this.id;
		}

		@Override
		public Image getImage() {
			return null;
		}

		@Override
		public String getText() {
			return null;
		}

		@Override
		public boolean isSelected() {
			return false;
		}

		@Override
		public boolean isIndented() {
			return false;
		}

		@Override
		public EEFTabContents createTab() {
			return null;
		}

		@Override
		public String getCategory() {
			return null;
		}

		@Override
		public String getLabel() {
			return null;
		}

		@Override
		public List<IEEFSectionDescriptor> getSectionDescriptors() {
			return null;
		}

	}

	@Test
	public void testOrderedTabs() {
		List<IEEFTabDescriptor> tabs = new ArrayList<>();
		tabs.add(new TestTabDescriptor("1", null)); //$NON-NLS-1$
		tabs.add(new TestTabDescriptor("2", null)); //$NON-NLS-1$
		tabs.add(new TestTabDescriptor("3", null)); //$NON-NLS-1$

		List<IEEFTabDescriptor> sortedTabs = new LegacyPropertyTabSorter().sortTabsByAfterTab(tabs);

		assertEquals("[1, 2, 3]", sortedTabs.toString()); //$NON-NLS-1$
	}

	@Test
	public void testOrderedTabsWithAfterTab() {
		List<IEEFTabDescriptor> tabs = new ArrayList<>();
		tabs.add(new TestTabDescriptor("4", "6")); //$NON-NLS-1$ //$NON-NLS-2$
		tabs.add(new TestTabDescriptor("5", TOP)); //$NON-NLS-1$
		tabs.add(new TestTabDescriptor("6", "5")); //$NON-NLS-1$ //$NON-NLS-2$

		List<IEEFTabDescriptor> sortedTabs = new LegacyPropertyTabSorter().sortTabsByAfterTab(tabs);

		assertEquals("[5, 6, 4]", sortedTabs.toString()); //$NON-NLS-1$
	}

	@Test
	public void testOrderedTabsWithAfterTab2() {
		List<IEEFTabDescriptor> tabs = new ArrayList<>();
		tabs.add(new TestTabDescriptor("9", "10")); //$NON-NLS-1$ //$NON-NLS-2$
		tabs.add(new TestTabDescriptor("7", "8")); //$NON-NLS-1$ //$NON-NLS-2$
		tabs.add(new TestTabDescriptor("8", "9")); //$NON-NLS-1$ //$NON-NLS-2$
		tabs.add(new TestTabDescriptor("10", TOP)); //$NON-NLS-1$

		List<IEEFTabDescriptor> sortedTabs = new LegacyPropertyTabSorter().sortTabsByAfterTab(tabs);

		assertEquals("[10, 9, 8, 7]", sortedTabs.toString()); //$NON-NLS-1$
	}

	@Test
	public void testOrderedTabsWithAfterTab3() {
		List<IEEFTabDescriptor> tabs = new ArrayList<>();
		tabs.add(new TestTabDescriptor("17", TOP)); //$NON-NLS-1$
		tabs.add(new TestTabDescriptor("16", "17")); //$NON-NLS-1$ //$NON-NLS-2$
		tabs.add(new TestTabDescriptor("13", "14")); //$NON-NLS-1$ //$NON-NLS-2$
		tabs.add(new TestTabDescriptor("14", "15")); //$NON-NLS-1$ //$NON-NLS-2$
		tabs.add(new TestTabDescriptor("15", "16")); //$NON-NLS-1$ //$NON-NLS-2$
		tabs.add(new TestTabDescriptor("12", "13")); //$NON-NLS-1$ //$NON-NLS-2$
		tabs.add(new TestTabDescriptor("11", "12")); //$NON-NLS-1$ //$NON-NLS-2$

		List<IEEFTabDescriptor> sortedTabs = new LegacyPropertyTabSorter().sortTabsByAfterTab(tabs);

		assertEquals("[17, 16, 15, 14, 13, 12, 11]", sortedTabs.toString()); //$NON-NLS-1$
	}

	@Test
	public void testOrderedTabsWithAfterTab4() {
		List<IEEFTabDescriptor> tabs = new ArrayList<>();
		tabs.add(new TestTabDescriptor("1", null)); //$NON-NLS-1$
		tabs.add(new TestTabDescriptor("2", "1")); //$NON-NLS-1$ //$NON-NLS-2$
		tabs.add(new TestTabDescriptor("3", null)); //$NON-NLS-1$
		tabs.add(new TestTabDescriptor("5", null)); //$NON-NLS-1$
		tabs.add(new TestTabDescriptor("4", "5")); //$NON-NLS-1$ //$NON-NLS-2$
		tabs.add(new TestTabDescriptor("6", "5")); //$NON-NLS-1$ //$NON-NLS-2$

		List<IEEFTabDescriptor> sortedTabs = new LegacyPropertyTabSorter().sortTabsByAfterTab(tabs);

		assertEquals("[1, 3, 5, 2, 6, 4]", sortedTabs.toString()); //$NON-NLS-1$
	}

	@Test
	public void testOrderedTabsWithAfterTab5() {
		List<IEEFTabDescriptor> tabs = new ArrayList<>();
		tabs.add(new TestTabDescriptor("5b", "4")); //$NON-NLS-1$ //$NON-NLS-2$
		tabs.add(new TestTabDescriptor("1", null)); //$NON-NLS-1$
		tabs.add(new TestTabDescriptor("2", "1")); //$NON-NLS-1$ //$NON-NLS-2$
		tabs.add(new TestTabDescriptor("3", "2")); //$NON-NLS-1$ //$NON-NLS-2$
		tabs.add(new TestTabDescriptor("4", "3")); //$NON-NLS-1$ //$NON-NLS-2$
		tabs.add(new TestTabDescriptor("5", "4")); //$NON-NLS-1$ //$NON-NLS-2$
		tabs.add(new TestTabDescriptor("6", "5")); //$NON-NLS-1$ //$NON-NLS-2$

		List<IEEFTabDescriptor> sortedTabs = new LegacyPropertyTabSorter().sortTabsByAfterTab(tabs);

		assertEquals("[1, 2, 3, 4, 5, 5b, 6]", sortedTabs.toString()); //$NON-NLS-1$
	}

	@Test
	public void testOrderedTabsWithAfterTab6() {
		List<IEEFTabDescriptor> tabs = new ArrayList<>();
		tabs.add(new TestTabDescriptor("A", "C")); //$NON-NLS-1$ //$NON-NLS-2$
		tabs.add(new TestTabDescriptor("B", null)); //$NON-NLS-1$
		tabs.add(new TestTabDescriptor("C", "H")); //$NON-NLS-1$ //$NON-NLS-2$
		tabs.add(new TestTabDescriptor("D", "E")); //$NON-NLS-1$ //$NON-NLS-2$
		tabs.add(new TestTabDescriptor("E", "H")); //$NON-NLS-1$ //$NON-NLS-2$
		tabs.add(new TestTabDescriptor("F", null)); //$NON-NLS-1$
		tabs.add(new TestTabDescriptor("G", "B")); //$NON-NLS-1$ //$NON-NLS-2$
		tabs.add(new TestTabDescriptor("H", "G")); //$NON-NLS-1$ //$NON-NLS-2$

		List<IEEFTabDescriptor> sortedTabs = new LegacyPropertyTabSorter().sortTabsByAfterTab(tabs);

		assertEquals("[B, F, G, H, E, D, C, A]", sortedTabs.toString()); //$NON-NLS-1$
	}
}
