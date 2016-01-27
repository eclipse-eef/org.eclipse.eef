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
package org.eclipse.eef.ide.ui.api;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.eef.core.api.EEFGroup;
import org.eclipse.eef.core.api.EEFPage;
import org.eclipse.eef.ide.ui.internal.properties.EEFSectionDescriptor;
import org.eclipse.eef.properties.ui.api.AbstractEEFTabDescriptor;
import org.eclipse.eef.properties.ui.api.IEEFSectionDescriptor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * The implementation of the {@link AbstractTabDescriptor} using the {@link EEFPage}.
 *
 * @author sbegaudeau
 */
public class EEFTabDescriptor extends AbstractEEFTabDescriptor {

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
		super();
		this.eefPage = eefPage;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.properties.ui.api.IEEFTabDescriptor#getId()
	 */
	@Override
	public String getId() {
		EObject self = (EObject) this.eefPage.getVariableManager().getVariables().get("self"); //$NON-NLS-1$
		return this.eefPage.getDescription().getIdentifier() + EcoreUtil.getURI(self);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.properties.ui.api.IEEFTabDescriptor#getLabel()
	 */
	@Override
	public String getLabel() {
		return this.eefPage.getLabel();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.properties.ui.api.AbstractEEFTabDescriptor#getSectionDescriptors()
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public List getSectionDescriptors() {
		List<IEEFSectionDescriptor> sectionDescriptors = new ArrayList<IEEFSectionDescriptor>();

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
