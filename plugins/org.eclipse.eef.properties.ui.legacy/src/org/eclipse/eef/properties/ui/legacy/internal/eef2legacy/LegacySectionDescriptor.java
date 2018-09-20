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

import java.util.List;

import org.eclipse.eef.properties.ui.api.IEEFSectionDescriptor;
import org.eclipse.jface.viewers.IFilter;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.ISection;
import org.eclipse.ui.views.properties.tabbed.ISectionDescriptor;

/**
 * Wraps an {@link IEEFSectionDescriptor} to an {@link ISectionDescriptor}.
 *
 * @author melanie
 */
public class LegacySectionDescriptor implements ISectionDescriptor {

	/**
	 * The EEF section descriptor.
	 */
	private IEEFSectionDescriptor eefSectionDescriptor;

	/**
	 * The constructor.
	 *
	 * @param eefSectionDescriptor
	 *            EEF section descriptor
	 */
	public LegacySectionDescriptor(IEEFSectionDescriptor eefSectionDescriptor) {
		this.eefSectionDescriptor = eefSectionDescriptor;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see ISectionDescriptor#getId()
	 */
	@Override
	public String getId() {
		return this.eefSectionDescriptor.getId();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see ISectionDescriptor#getFilter()
	 */
	@Override
	public IFilter getFilter() {
		return this.eefSectionDescriptor.getFilter();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see ISectionDescriptor#getInputTypes()
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public List getInputTypes() {
		return this.eefSectionDescriptor.getInputTypes();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see ISectionDescriptor#getSectionClass()
	 */
	@Override
	public ISection getSectionClass() {
		return new LegacySection(this.eefSectionDescriptor.getSectionClass());
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see ISectionDescriptor#getTargetTab()
	 */
	@Override
	public String getTargetTab() {
		return this.eefSectionDescriptor.getTargetTab();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see ISectionDescriptor#getEnablesFor()
	 */
	@Override
	public int getEnablesFor() {
		return this.eefSectionDescriptor.getEnablesFor();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see ISectionDescriptor#appliesTo(IWorkbenchPart, ISelection)
	 */
	@Override
	public boolean appliesTo(IWorkbenchPart part, ISelection selection) {
		return this.eefSectionDescriptor.appliesTo(part, selection);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see ISectionDescriptor#getAfterSection()
	 */
	@Override
	public String getAfterSection() {
		return this.eefSectionDescriptor.getAfterSection();
	}

}
