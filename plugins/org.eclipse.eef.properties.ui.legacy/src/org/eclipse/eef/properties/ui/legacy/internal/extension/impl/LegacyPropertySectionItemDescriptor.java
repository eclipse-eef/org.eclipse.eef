/*******************************************************************************
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.eef.properties.ui.legacy.internal.extension.impl;

import java.util.List;

import org.eclipse.eef.properties.ui.api.AbstractEEFSectionDescriptor;
import org.eclipse.eef.properties.ui.api.IEEFSection;
import org.eclipse.eef.properties.ui.api.IEEFTypeMapper;
import org.eclipse.eef.properties.ui.legacy.internal.extension.IItemDescriptor;
import org.eclipse.eef.properties.ui.legacy.internal.legacy2eef.EEFLegacySection;
import org.eclipse.jface.viewers.IFilter;
import org.eclipse.ui.views.properties.tabbed.ISection;

/**
 * The property section descriptor.
 *
 * @author mbats
 */
public class LegacyPropertySectionItemDescriptor extends AbstractEEFSectionDescriptor implements IItemDescriptor {

	/**
	 * The section identifier.
	 */
	private String id;

	/**
	 * The parent tab.
	 */
	private String tab;

	/**
	 * The filter class.
	 */
	private IFilter filter;

	/**
	 * The section class.
	 */
	private ISection sectionClass;

	/**
	 * The enablesFor.
	 */
	private int enablesFor;

	/**
	 * The afterSection.
	 */
	private String afterSection;

	/**
	 * The input.
	 */
	private List<String> inputTypes;

	/**
	 * The constructor.
	 *
	 * @param tab
	 *            The parent tab
	 * @param filter
	 *            The filter
	 * @param sectionClass
	 *            The section class
	 * @param id
	 *            The id
	 * @param afterSection
	 *            The afterSection
	 * @param enablesFor
	 *            The enablesFor
	 * @param inputTypes
	 *            The input types
	 * @param typeMapper
	 *            The type mapper
	 */
	public LegacyPropertySectionItemDescriptor(String tab, IFilter filter, ISection sectionClass, String id, int enablesFor, String afterSection,
			List<String> inputTypes, IEEFTypeMapper typeMapper) {
		super(typeMapper);
		this.tab = tab;
		this.filter = filter;
		this.sectionClass = sectionClass;
		this.id = id;
		this.enablesFor = enablesFor;
		this.afterSection = afterSection;
		this.inputTypes = inputTypes;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.properties.ui.api.IEEFSectionDescriptor#getId()
	 */
	@Override
	public String getId() {
		return this.id;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.properties.ui.api.IEEFSectionDescriptor#getSectionClass()
	 */
	@Override
	public IEEFSection getSectionClass() {
		return new EEFLegacySection(sectionClass);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.properties.ui.api.IEEFSectionDescriptor#getTargetTab()
	 */
	@Override
	public String getTargetTab() {
		return this.tab;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.properties.ui.api.IEEFSectionDescriptor#getFilter()
	 */
	@Override
	public IFilter getFilter() {
		return this.filter;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.properties.ui.api.IEEFSectionDescriptor#getAfterSection()
	 */
	@Override
	public String getAfterSection() {
		return this.afterSection;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.properties.ui.api.IEEFSectionDescriptor#getEnablesFor()
	 */
	@Override
	public int getEnablesFor() {
		return this.enablesFor;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.properties.ui.api.AbstractEEFSectionDescriptor#getInputTypes()
	 */
	@Override
	public List<String> getInputTypes() {
		return this.inputTypes;
	}

}
