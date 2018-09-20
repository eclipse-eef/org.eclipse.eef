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
package org.eclipse.eef.properties.ui.legacy.internal.extension.impl;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.eef.properties.ui.api.AbstractEEFSectionDescriptor;
import org.eclipse.eef.properties.ui.api.IEEFSection;
import org.eclipse.eef.properties.ui.api.IEEFTypeMapper;
import org.eclipse.eef.properties.ui.legacy.internal.EEFPropertiesUiLegacyPlugin;
import org.eclipse.eef.properties.ui.legacy.internal.Messages;
import org.eclipse.eef.properties.ui.legacy.internal.extension.IItemDescriptor;
import org.eclipse.eef.properties.ui.legacy.internal.legacy2eef.EEFLegacySection;
import org.eclipse.jface.viewers.IFilter;
import org.eclipse.ui.views.properties.tabbed.ISection;
import org.eclipse.ui.views.properties.tabbed.ISectionDescriptor;

/**
 * The property section descriptor.
 *
 * @author mbats
 */
public class LegacyPropertySectionItemDescriptor extends AbstractEEFSectionDescriptor implements IItemDescriptor {

	/**
	 * The configuration element.
	 */
	private IConfigurationElement configurationElement;

	/**
	 * The section descriptor.
	 */
	private ISectionDescriptor sectionDescriptor;

	/**
	 * The constructor.
	 *
	 * @param configurationElement
	 *            The configuration Element
	 * @param typeMapper
	 *            The type mapper
	 */
	public LegacyPropertySectionItemDescriptor(IConfigurationElement configurationElement, IEEFTypeMapper typeMapper) {
		super(typeMapper);
		this.configurationElement = configurationElement;
	}

	/**
	 * The constructor.
	 *
	 * @param sectionDescriptor
	 *            The section descriptor
	 * @param typeMapper
	 *            The type mapper
	 */
	public LegacyPropertySectionItemDescriptor(ISectionDescriptor sectionDescriptor, IEEFTypeMapper typeMapper) {
		super(typeMapper);
		this.sectionDescriptor = sectionDescriptor;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.properties.ui.api.IEEFSectionDescriptor#getId()
	 */
	@Override
	public String getId() {
		String id = null;
		if (configurationElement != null) {
			id = configurationElement.getAttribute(LegacyPropertySectionsRegistryEventListener.ID_ATTR);
		} else if (sectionDescriptor != null) {
			id = sectionDescriptor.getId();
		}

		return id;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.properties.ui.api.IEEFSectionDescriptor#getSectionClass()
	 */
	@Override
	public IEEFSection getSectionClass() {
		ISection section = null;
		if (configurationElement != null && configurationElement.getAttribute(LegacyPropertySectionsRegistryEventListener.CLASS_ATTR) != null) {
			try {
				section = (ISection) configurationElement.createExecutableExtension(LegacyPropertySectionsRegistryEventListener.CLASS_ATTR);
			} catch (CoreException e) {
				String message = MessageFormat.format(Messages.RegistryEventListener_cannotInstantiateExtension, getId());
				EEFPropertiesUiLegacyPlugin.getImplementation().logError(message, e);
			}
		} else if (sectionDescriptor != null) {
			section = sectionDescriptor.getSectionClass();
		}
		if (section != null) {
			return new EEFLegacySection(section);
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
		String tab = null;
		if (configurationElement != null) {
			tab = configurationElement.getAttribute(LegacyPropertySectionsRegistryEventListener.TAB_ATTR);
		} else if (sectionDescriptor != null) {
			tab = sectionDescriptor.getTargetTab();
		}

		return tab;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.properties.ui.api.IEEFSectionDescriptor#getFilter()
	 */
	@Override
	public IFilter getFilter() {
		IFilter filter = null;
		if (configurationElement != null && configurationElement.getAttribute(LegacyPropertySectionsRegistryEventListener.FILTER_ATTR) != null) {
			try {
				filter = (IFilter) configurationElement.createExecutableExtension(LegacyPropertySectionsRegistryEventListener.FILTER_ATTR);
			} catch (CoreException e) {
				String message = MessageFormat.format(Messages.RegistryEventListener_cannotInstantiateExtension, getId());
				EEFPropertiesUiLegacyPlugin.getImplementation().logError(message, e);
			}
		} else if (sectionDescriptor != null) {
			filter = sectionDescriptor.getFilter();
		}
		return filter;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.properties.ui.api.IEEFSectionDescriptor#getAfterSection()
	 */
	@Override
	public String getAfterSection() {
		String section = null;
		if (configurationElement != null) {
			section = configurationElement.getAttribute(LegacyPropertySectionsRegistryEventListener.AFTER_SECTION_ATTR);
		} else if (sectionDescriptor != null) {
			section = sectionDescriptor.getAfterSection();
		}
		return section;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.properties.ui.api.IEEFSectionDescriptor#getEnablesFor()
	 */
	@Override
	public int getEnablesFor() {
		int enablesFor = ISectionDescriptor.ENABLES_FOR_ANY;
		if (configurationElement != null && configurationElement.getAttribute(LegacyPropertySectionsRegistryEventListener.ENABLES_FOR_ATTR) != null) {
			String enablesForStr = configurationElement.getAttribute(LegacyPropertySectionsRegistryEventListener.ENABLES_FOR_ATTR);
			int enablesForTest = Integer.parseInt(enablesForStr);
			if (enablesForTest > 0) {
				enablesFor = enablesForTest;
			}
		} else if (sectionDescriptor != null) {
			enablesFor = sectionDescriptor.getEnablesFor();
		}
		return enablesFor;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.properties.ui.api.AbstractEEFSectionDescriptor#getInputTypes()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<String> getInputTypes() {
		List<String> inputTypes = new ArrayList<String>();
		if (configurationElement != null) {
			IConfigurationElement[] elements = configurationElement.getChildren(LegacyPropertySectionsRegistryEventListener.ELEMENT_INPUT);
			for (IConfigurationElement element : elements) {
				String type = element.getAttribute(LegacyPropertySectionsRegistryEventListener.ATT_INPUT_TYPE);
				if (type != null && !type.isEmpty()) {
					inputTypes.add(type);
				}
			}
		} else if (sectionDescriptor != null) {
			inputTypes = sectionDescriptor.getInputTypes();
		}
		return inputTypes;
	}

	/**
	 * Get the contributor Id of the section.
	 *
	 * @return the contributor Id of the section, or <code>null</code> if it doesn't exist.
	 */
	public String getContributionId() {
		// @formatter:off
		return Optional.ofNullable(this.configurationElement)
				.map(IConfigurationElement::getParent)
				.filter(IConfigurationElement.class::isInstance)
				.map(IConfigurationElement.class::cast)
				.map(element -> element.getAttribute(LegacyPropertySectionsRegistryEventListener.CONTRIBUTOR_ID_ATTR))
				.orElse(null);
		// @formatter:on
	}
}
