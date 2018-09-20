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
package org.eclipse.eef.properties.ui.legacy.internal.eef2legacy;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.eef.properties.ui.api.EEFTabContents;
import org.eclipse.eef.properties.ui.api.IEEFSection;
import org.eclipse.eef.properties.ui.api.IEEFSectionDescriptor;
import org.eclipse.eef.properties.ui.api.IEEFTabDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.views.properties.tabbed.ISection;
import org.eclipse.ui.views.properties.tabbed.ITabDescriptor;
import org.eclipse.ui.views.properties.tabbed.TabContents;

/**
 * Wraps an {@link IEEFTabDescriptor} to a {@link ITabDescriptor}.
 *
 * @author mbats
 */
public class LegacyTabDescriptor implements ITabDescriptor {

	/**
	 * The EEF tab descriptor.
	 */
	private IEEFTabDescriptor eefTabDescriptor;

	/**
	 * The constructor.
	 *
	 * @param eefTabDescriptor
	 *            EEF tab descriptor
	 */
	public LegacyTabDescriptor(IEEFTabDescriptor eefTabDescriptor) {
		this.eefTabDescriptor = eefTabDescriptor;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see ITabDescriptor#getImage()
	 */
	@Override
	public Image getImage() {
		return this.eefTabDescriptor.getImage();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see ITabDescriptor#getText()
	 */
	@Override
	public String getText() {
		return this.eefTabDescriptor.getText();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see ITabDescriptor#isSelected()
	 */
	@Override
	public boolean isSelected() {
		return this.eefTabDescriptor.isSelected();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see ITabDescriptor#isIndented()
	 */
	@Override
	public boolean isIndented() {
		return this.eefTabDescriptor.isIndented();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see ITabDescriptor#createTab()
	 */
	@Override
	public TabContents createTab() {
		TabContents tabContents = new TabContents();
		List<ISection> sections = new ArrayList<ISection>();

		EEFTabContents eefTabContents = this.eefTabDescriptor.createTab();
		List<IEEFSection> eefSections = eefTabContents.getSections();
		for (IEEFSection eefSection : eefSections) {
			sections.add(new LegacySection(eefSection));
		}

		tabContents.setSections(sections.toArray(new ISection[sections.size()]));
		return tabContents;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see ITabDescriptor#getAfterTab()
	 */
	@Override
	public String getAfterTab() {
		return this.eefTabDescriptor.getAfterTab();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see ITabDescriptor#getCategory()
	 */
	@Override
	public String getCategory() {
		return this.eefTabDescriptor.getCategory();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see ITabDescriptor#getId()
	 */
	@Override
	public String getId() {
		return this.eefTabDescriptor.getId();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see ITabDescriptor#getLabel()
	 */
	@Override
	public String getLabel() {
		return this.eefTabDescriptor.getLabel();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see ITabDescriptor#getSectionDescriptors()
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public List getSectionDescriptors() {
		List<LegacySectionDescriptor> legacySectionDescriptors = new ArrayList<LegacySectionDescriptor>();
		List<IEEFSectionDescriptor> eefSectionDescriptors = this.eefTabDescriptor.getSectionDescriptors();
		for (IEEFSectionDescriptor eefSectionDescriptor : eefSectionDescriptors) {
			legacySectionDescriptors.add(new LegacySectionDescriptor(eefSectionDescriptor));
		}
		return legacySectionDescriptors;
	}

}
