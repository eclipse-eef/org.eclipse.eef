/*******************************************************************************
 * Copyright (c) 2018 Obeo.
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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.eef.properties.ui.api.IEEFSection;
import org.eclipse.eef.properties.ui.api.IEEFSectionDescriptor;
import org.eclipse.eef.properties.ui.legacy.internal.extension.impl.LegacyPropertySectionSorter;
import org.eclipse.jface.viewers.IFilter;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchPart;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test class for the LegacyPropertySectionSorter.
 *
 * @author sbegaudeau
 */
@SuppressWarnings({ "checkstyle:javadocmethod" })
public class LegacyPropertySectionSorterTests {

	/**
	 * The special after tab for the TOP tab.
	 */
	private static final String TOP = "top"; //$NON-NLS-1$

	/**
	 * Utility class to test the section descriptor.
	 *
	 * @author sbegaudeau
	 */
	private static class TestSectionDescriptor implements IEEFSectionDescriptor {

		/**
		 * The id.
		 */
		private String id;

		/**
		 * The after section.
		 */
		private String afterSection;

		/**
		 * The constructor.
		 *
		 * @param id
		 *            The id
		 * @param afterSection
		 *            The after section
		 */
		TestSectionDescriptor(String id, String afterSection) {
			this.id = id;
			this.afterSection = afterSection;
		}

		@Override
		public String getId() {
			return this.id;
		}

		@Override
		public IFilter getFilter() {
			return null;
		}

		@Override
		public List<String> getInputTypes() {
			return null;
		}

		@Override
		public IEEFSection getSectionClass() {
			return null;
		}

		@Override
		public String getTargetTab() {
			return null;
		}

		@Override
		public int getEnablesFor() {
			return 0;
		}

		@Override
		public boolean appliesTo(IWorkbenchPart part, ISelection selection) {
			return false;
		}

		@Override
		public String getAfterSection() {
			return this.afterSection;
		}

		@Override
		public String toString() {
			return this.id;
		}

	}

	@Test
	public void testOrderedSections() {
		List<IEEFSectionDescriptor> sections = new ArrayList<>();
		sections.add(new TestSectionDescriptor("1", null)); //$NON-NLS-1$
		sections.add(new TestSectionDescriptor("2", null)); //$NON-NLS-1$
		sections.add(new TestSectionDescriptor("3", null)); //$NON-NLS-1$

		List<IEEFSectionDescriptor> sortedSections = new LegacyPropertySectionSorter().sortSectionsByAfterSection(sections);

		assertEquals("[1, 2, 3]", sortedSections.toString()); //$NON-NLS-1$
	}

	@Test
	public void testOrderedSectionsWithAfterSection() {
		List<IEEFSectionDescriptor> sections = new ArrayList<>();
		sections.add(new TestSectionDescriptor("4", "6")); //$NON-NLS-1$ //$NON-NLS-2$
		sections.add(new TestSectionDescriptor("5", TOP)); //$NON-NLS-1$
		sections.add(new TestSectionDescriptor("6", "5")); //$NON-NLS-1$ //$NON-NLS-2$

		List<IEEFSectionDescriptor> sortedSections = new LegacyPropertySectionSorter().sortSectionsByAfterSection(sections);

		assertEquals("[5, 6, 4]", sortedSections.toString()); //$NON-NLS-1$
	}

	@Test
	public void testOrderedSectionsWithAfterSection2() {
		List<IEEFSectionDescriptor> sections = new ArrayList<>();
		sections.add(new TestSectionDescriptor("9", "10")); //$NON-NLS-1$ //$NON-NLS-2$
		sections.add(new TestSectionDescriptor("7", "8")); //$NON-NLS-1$ //$NON-NLS-2$
		sections.add(new TestSectionDescriptor("8", "9")); //$NON-NLS-1$ //$NON-NLS-2$
		sections.add(new TestSectionDescriptor("10", TOP)); //$NON-NLS-1$

		List<IEEFSectionDescriptor> sortedSections = new LegacyPropertySectionSorter().sortSectionsByAfterSection(sections);

		assertEquals("[10, 9, 8, 7]", sortedSections.toString()); //$NON-NLS-1$
	}

	@Test
	public void testOrderedSectionsWithAfterSection3() {
		List<IEEFSectionDescriptor> sections = new ArrayList<>();
		sections.add(new TestSectionDescriptor("17", TOP)); //$NON-NLS-1$
		sections.add(new TestSectionDescriptor("16", "17")); //$NON-NLS-1$ //$NON-NLS-2$
		sections.add(new TestSectionDescriptor("13", "14")); //$NON-NLS-1$ //$NON-NLS-2$
		sections.add(new TestSectionDescriptor("14", "15")); //$NON-NLS-1$ //$NON-NLS-2$
		sections.add(new TestSectionDescriptor("15", "16")); //$NON-NLS-1$ //$NON-NLS-2$
		sections.add(new TestSectionDescriptor("12", "13")); //$NON-NLS-1$ //$NON-NLS-2$
		sections.add(new TestSectionDescriptor("11", "12")); //$NON-NLS-1$ //$NON-NLS-2$

		List<IEEFSectionDescriptor> sortedSections = new LegacyPropertySectionSorter().sortSectionsByAfterSection(sections);

		assertEquals("[17, 16, 15, 14, 13, 12, 11]", sortedSections.toString()); //$NON-NLS-1$
	}
}
