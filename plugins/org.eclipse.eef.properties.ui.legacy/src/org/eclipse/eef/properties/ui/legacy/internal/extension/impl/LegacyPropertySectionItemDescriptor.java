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

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.eef.properties.ui.api.AbstractEEFSectionDescriptor;
import org.eclipse.eef.properties.ui.api.IEEFSection;
import org.eclipse.eef.properties.ui.legacy.internal.EEFPropertiesUiLegacyPlugin;
import org.eclipse.eef.properties.ui.legacy.internal.extension.IItemDescriptor;
import org.eclipse.eef.properties.ui.legacy.internal.legacy2eef.EEFLegacySection;
import org.eclipse.jface.viewers.IFilter;
import org.eclipse.ui.views.properties.tabbed.AbstractPropertySection;
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
	 * The configuration element used to create the section.
	 */
	private IConfigurationElement configurationElement;

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
	 * @param configurationElement
	 *            The configuration element used to create the section
	 * @param id
	 *            The id
	 * @param afterSection
	 *            The afterSection
	 * @param enablesFor
	 *            The enablesFor
	 */
	public LegacyPropertySectionItemDescriptor(String tab, IFilter filter, IConfigurationElement configurationElement, String id, int enablesFor,
			String afterSection) {
		this.tab = tab;
		this.filter = filter;
		this.configurationElement = configurationElement;
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
		try {
			ISection sectionClass = (ISection) configurationElement.createExecutableExtension(LegacyPropertySectionsRegistryEventListener.CLASS_ATTR);
			if (sectionClass instanceof AbstractPropertySection) {
				EEFLegacySection legacySection = new EEFLegacySection((AbstractPropertySection) sectionClass);
				return legacySection;
			}
		} catch (CoreException e) {
			EEFPropertiesUiLegacyPlugin.getImplementation().logError(e.getMessage(), e);
		}
		return null;
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
