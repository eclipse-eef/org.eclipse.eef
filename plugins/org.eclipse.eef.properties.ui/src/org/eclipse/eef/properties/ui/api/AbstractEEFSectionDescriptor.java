/*******************************************************************************
 * Copyright (c) 2007, 2015 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Obeo - Contribution to the EEF project
 ******************************************************************************/
package org.eclipse.eef.properties.ui.api;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.eef.properties.ui.internal.page.EEFTabbedPropertyRegistryClassSectionFilter;
import org.eclipse.jface.viewers.IFilter;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchPart;

/**
 * An abstract implementation of a section descriptor for the tabbed property view.
 *
 * @author Anthony Hunter
 * @author Stephane Begaudeau
 * @since 1.6.0
 */
public abstract class AbstractEEFSectionDescriptor implements IEEFSectionDescriptor {

	/**
	 * The filter used to determine if this section descriptor can be used for a given selection.
	 */
	private EEFTabbedPropertyRegistryClassSectionFilter classFilter;

	/**
	 * The constructor.
	 *
	 * @param typeMapper
	 *            The type mapper for the section
	 */
	public AbstractEEFSectionDescriptor(IEEFTypeMapper typeMapper) {
		this.classFilter = new EEFTabbedPropertyRegistryClassSectionFilter(typeMapper);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.properties.ui.api.IEEFSectionDescriptor#getFilter()
	 */
	@Override
	public IFilter getFilter() {
		return null;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.properties.ui.api.IEEFSectionDescriptor#getInputTypes()
	 */
	@Override
	public List<String> getInputTypes() {
		return new ArrayList<String>();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.properties.ui.api.IEEFSectionDescriptor#getEnablesFor()
	 */
	@Override
	public int getEnablesFor() {
		return ENABLES_FOR_ANY;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.properties.ui.api.IEEFSectionDescriptor#appliesTo(org.eclipse.ui.IWorkbenchPart,
	 *      org.eclipse.jface.viewers.ISelection)
	 */
	@Override
	public boolean appliesTo(IWorkbenchPart part, ISelection selection) {
		return this.classFilter.appliesToSelection(this, selection);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.properties.ui.api.IEEFSectionDescriptor#getAfterSection()
	 */
	@Override
	public String getAfterSection() {
		return TOP;
	}

}
