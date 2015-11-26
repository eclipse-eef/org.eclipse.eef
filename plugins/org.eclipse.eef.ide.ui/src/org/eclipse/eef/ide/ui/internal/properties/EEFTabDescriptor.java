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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.eef.core.api.EEFGroup;
import org.eclipse.eef.core.api.EEFPage;
import org.eclipse.ui.views.properties.tabbed.AbstractTabDescriptor;
import org.eclipse.ui.views.properties.tabbed.ISectionDescriptor;

/**
 * The implementation of the {@link AbstractTabDescriptor} using the {@link EEFPage}.
 *
 * @author sbegaudeau
 */
public class EEFTabDescriptor extends AbstractTabDescriptor {

	/**
	 * The {@link EEFPage}.
	 */
	private EEFPage eefPage;

	/**
	 * The constructor.
	 *
	 * @param eefPage
	 *            The EEFPage
	 */
	public EEFTabDescriptor(EEFPage eefPage) {
		this.eefPage = eefPage;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.ui.views.properties.tabbed.ITabDescriptor#getId()
	 */
	@Override
	public String getId() {
		return this.eefPage.getDescription().getIdentifier();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.ui.views.properties.tabbed.ITabDescriptor#getLabel()
	 */
	@Override
	public String getLabel() {
		return this.eefPage.getLabel();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.ui.views.properties.tabbed.AbstractTabDescriptor#getSectionDescriptors()
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public List getSectionDescriptors() {
		List<ISectionDescriptor> sectionDescriptors = new ArrayList<ISectionDescriptor>();

		List<EEFGroup> eefGroups = this.eefPage.getGroups();
		for (EEFGroup eefGroup : eefGroups) {
			sectionDescriptors.add(new EEFSectionDescriptor(eefGroup));
		}

		return sectionDescriptors;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.ui.views.properties.tabbed.ITabDescriptor#getCategory()
	 */
	@Override
	public String getCategory() {
		return "EEF"; //$NON-NLS-1$
	}

}
