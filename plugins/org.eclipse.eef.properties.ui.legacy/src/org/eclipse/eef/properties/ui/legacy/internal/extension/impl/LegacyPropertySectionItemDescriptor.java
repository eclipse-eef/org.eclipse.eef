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

import org.eclipse.eef.properties.ui.api.AbstractEEFSectionDescriptor;
import org.eclipse.eef.properties.ui.api.IEEFSection;
import org.eclipse.eef.properties.ui.legacy.internal.extension.IItemDescriptor;
import org.eclipse.jface.viewers.IFilter;

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
	 * The EEF section.
	 */
	private IEEFSection eefSection;

	/**
	 * The enablesFor.
	 */
	private int enablesFor;

	/**
	 * The afterSection.
	 */
	private String afterSection;

	/**
	 * The constructor.
	 *
	 * @param tab
	 *            The parent tab
	 * @param filter
	 *            The filter
	 * @param eefSection
	 *            The EEF section
	 * @param id
	 *            The id
	 * @param afterSection
	 *            The afterSection
	 * @param enablesFor
	 *            The enablesFor
	 */
	public LegacyPropertySectionItemDescriptor(String tab, IFilter filter, IEEFSection eefSection, String id, int enablesFor, String afterSection) {
		this.tab = tab;
		this.filter = filter;
		this.eefSection = eefSection;
		this.id = id;
		this.enablesFor = enablesFor;
		this.afterSection = afterSection;
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
		return this.eefSection;
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

}
