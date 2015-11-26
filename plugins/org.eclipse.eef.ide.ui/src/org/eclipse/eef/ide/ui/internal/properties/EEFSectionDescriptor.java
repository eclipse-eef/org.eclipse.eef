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
package org.eclipse.eef.ide.ui.internal.properties;

import org.eclipse.eef.core.api.EEFGroup;
import org.eclipse.jface.viewers.IFilter;
import org.eclipse.ui.views.properties.tabbed.AbstractSectionDescriptor;
import org.eclipse.ui.views.properties.tabbed.ISection;

/**
 * The implementation of the {@link AbstractSectionDescriptor} using the {@link EEFGroup}.
 *
 * @author sbegaudeau
 */
public class EEFSectionDescriptor extends AbstractSectionDescriptor {

	/**
	 * The EEFGroup.
	 */
	private EEFGroup eefGroup;

	/**
	 * The constructor.
	 *
	 * @param eefGroup
	 *            The EEFGroup
	 */
	public EEFSectionDescriptor(EEFGroup eefGroup) {
		this.eefGroup = eefGroup;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.ui.views.properties.tabbed.ISectionDescriptor#getId()
	 */
	@Override
	public String getId() {
		return this.eefGroup.getDescription().getIdentifier();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.ui.views.properties.tabbed.ISectionDescriptor#getSectionClass()
	 */
	@Override
	public ISection getSectionClass() {
		return new EEFSection(this);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.ui.views.properties.tabbed.ISectionDescriptor#getTargetTab()
	 */
	@Override
	public String getTargetTab() {
		return null;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.ui.views.properties.tabbed.AbstractSectionDescriptor#getFilter()
	 */
	@Override
	public IFilter getFilter() {
		return new IFilter() {

			@Override
			public boolean select(Object toTest) {
				return true;
			}
		};
	}

	/**
	 * Returns the EEFGroup used to managed this section descriptor.
	 * 
	 * @return The EEFGroup used to managed this section descriptor
	 */
	public EEFGroup getEEFGroup() {
		return eefGroup;
	}
}
