/*******************************************************************************
 * Copyright (c) 2015, 2018 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.eef.properties.ui.legacy.internal.extension.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

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
	private Map<String, List<IItemDescriptor>> id2descriptors = new HashMap<>();

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
				LegacyPropertySectionItemDescriptor legacySectionDescriptor = new LegacyPropertySectionItemDescriptor(sectionDescriptor,
						eefTypeMapper);
				values.add(legacySectionDescriptor);
			}
		}

		// Else read the section from the configuration
		if (values.isEmpty()) {
			// @formatter:off
			values = this.id2descriptors.values().stream()
						.filter(Objects::nonNull)
						.flatMap(List::stream)
						.collect(Collectors.toList());
			// @formatter:on
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
		return new ArrayList<IEEFSectionDescriptor>(sortSectionsByAfterSection(eefSectionDescriptors.values()));
	}

	/**
	 * Sort sections of a tab by after section.
	 *
	 * @param sectionList
	 *            List of sections
	 * @return List of sections sorted by after section
	 */
	private List<IEEFSectionDescriptor> sortSectionsByAfterSection(Collection<IEEFSectionDescriptor> sectionList) {
		List<IEEFSectionDescriptor> sorted = new LinkedList<IEEFSectionDescriptor>();
		for (IEEFSectionDescriptor section : sectionList) {
			String afterSectionId = section.getAfterSection();
			int indexOfAfterSection = -1;
			if (afterSectionId != null && !afterSectionId.isEmpty()) {
				IEEFSectionDescriptor afterSection = getSection(sectionList, afterSectionId);
				if (afterSection != null) {
					indexOfAfterSection = sorted.indexOf(afterSection);
				}
			}
			sorted.add(indexOfAfterSection + 1, section);
		}
		return sorted;
	}

	/**
	 * Get a section in a list of sections according to its id.
	 *
	 * @param sectionId
	 *            The section id
	 * @param sections
	 *            The sections list
	 * @return the Section
	 */
	private IEEFSectionDescriptor getSection(Collection<IEEFSectionDescriptor> sections, String sectionId) {
		for (IEEFSectionDescriptor section : sections) {
			if (sectionId.equals(section.getId())) {
				return section;
			}
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see IItemRegistry#add(IItemDescriptor)
	 */
	@Override
	public IItemDescriptor add(IItemDescriptor descriptor) {
		List<IItemDescriptor> descriptors = this.id2descriptors.getOrDefault(descriptor.getId(), new ArrayList<>());
		boolean result = descriptors.add(descriptor);
		this.id2descriptors.put(descriptor.getId(), descriptors);

		if (result) {
			return descriptor;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see IItemRegistry#remove(String)
	 */
	@Override
	public boolean remove(String id) {
		List<IItemDescriptor> descriptors = Optional.ofNullable(this.id2descriptors.remove(id)).orElseGet(ArrayList::new);
		return !descriptors.isEmpty();
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
