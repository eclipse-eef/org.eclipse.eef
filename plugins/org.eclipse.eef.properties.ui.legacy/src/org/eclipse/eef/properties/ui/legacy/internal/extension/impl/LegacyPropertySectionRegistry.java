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

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.eef.properties.ui.api.IEEFSectionDescriptor;
import org.eclipse.eef.properties.ui.api.IEEFTypeMapper;
import org.eclipse.eef.properties.ui.legacy.internal.EEFPropertiesUiLegacyPlugin;
import org.eclipse.eef.properties.ui.legacy.internal.extension.IItemDescriptor;
import org.eclipse.eef.properties.ui.legacy.internal.extension.IItemRegistry;
import org.eclipse.eef.properties.ui.legacy.internal.legacy2eef.EEFLegacyTypeMapper;
import org.eclipse.ui.views.properties.tabbed.ISectionDescriptor;
import org.eclipse.ui.views.properties.tabbed.ISectionDescriptorProvider;
import org.eclipse.ui.views.properties.tabbed.ITypeMapper;

/**
 * The registry used to track the descriptors of the property section extension.
 *
 * @author mbats
 */
public class LegacyPropertySectionRegistry implements IItemRegistry {

	/**
	 * The map of the identifier of the description to the {@link LegacyPropertySectionItemDescriptor}.
	 */
	private Multimap<String, IItemDescriptor> id2descriptors = ArrayListMultimap.create();

	/**
	 * Get the property sections.
	 *
	 * @param contributorId
	 *            The contributor Id
	 * @param tabId
	 *            Id of the tab for which we should get the sections
	 * @return List of sections
	 */
	public List<IEEFSectionDescriptor> getPropertySections(String contributorId, String tabId) {
		Map<String, IEEFSectionDescriptor> eefSectionDescriptors = new HashMap<String, IEEFSectionDescriptor>();
		// Check if section descriptor provider exists
		Collection<IItemDescriptor> values = new ArrayList<IItemDescriptor>();

		ISectionDescriptorProvider sectionDescriptorProvider = EEFPropertiesUiLegacyPlugin.getImplementation().getTabbedPropertyContributorRegistry()
				.getSectionDescriptorProvider(contributorId);
		if (sectionDescriptorProvider != null) {
			ISectionDescriptor[] sections = sectionDescriptorProvider.getSectionDescriptors();
			for (ISectionDescriptor sectionDescriptor : sections) {
				// Get the type mapper from contributor ID
				ITypeMapper typeMapper = EEFPropertiesUiLegacyPlugin.getImplementation().getTabbedPropertyContributorRegistry()
						.getTypeMapper(contributorId);

				IEEFTypeMapper eefTypeMapper = null;
				if (typeMapper != null) {
					eefTypeMapper = new EEFLegacyTypeMapper(typeMapper);
				}
				LegacyPropertySectionItemDescriptor legacySectionDescriptor = new LegacyPropertySectionItemDescriptor(eefTypeMapper);
				legacySectionDescriptor.setId(sectionDescriptor.getId());
				legacySectionDescriptor.setTab(sectionDescriptor.getTargetTab());
				legacySectionDescriptor.setFilter(sectionDescriptor.getFilter());
				legacySectionDescriptor.setSectionClass(sectionDescriptor.getSectionClass());
				legacySectionDescriptor.setEnablesFor(sectionDescriptor.getEnablesFor());
				legacySectionDescriptor.setAfterSection(sectionDescriptor.getAfterSection());
				List<String> inputTypes = new ArrayList<String>();
				for (Object inputType : sectionDescriptor.getInputTypes()) {
					if (inputType instanceof String) {
						inputTypes.add((String) inputType);
					}
				}
				legacySectionDescriptor.setInputTypes(inputTypes);
				values.add(legacySectionDescriptor);
			}
		}

		// Else read the section from the configuration
		if (values.isEmpty()) {
			values = this.id2descriptors.values();
		}

		for (IItemDescriptor itemDescriptor : values) {
			if (itemDescriptor instanceof IEEFSectionDescriptor) {
				String tab = ((IEEFSectionDescriptor) itemDescriptor).getTargetTab();
				String sectionTargetTabId = tab;
				if (tabId.equals(sectionTargetTabId)) {
					String key = sectionTargetTabId + itemDescriptor.getId();
					eefSectionDescriptors.put(key, (IEEFSectionDescriptor) itemDescriptor);
				}
			}
		}
		return new ArrayList<IEEFSectionDescriptor>(eefSectionDescriptors.values());
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see IItemRegistry#add(IItemDescriptor)
	 */
	@Override
	public IItemDescriptor add(IItemDescriptor descriptor) {
		this.id2descriptors.put(descriptor.getId(), descriptor);
		return descriptor;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see IItemRegistry#remove(String)
	 */
	@Override
	public boolean remove(String id) {
		return !this.id2descriptors.removeAll(id).isEmpty();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see IItemRegistry#clear()
	 */
	@Override
	public void clear() {
		this.id2descriptors.clear();
	}
}
