/*******************************************************************************
 * Copyright (c) 2015, 2019 Obeo.
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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.eef.properties.ui.api.IEEFTabDescriptor;
import org.eclipse.eef.properties.ui.legacy.internal.EEFPropertiesUiLegacyPlugin;
import org.eclipse.eef.properties.ui.legacy.internal.extension.IItemDescriptor;
import org.eclipse.eef.properties.ui.legacy.internal.extension.IItemRegistry;

/**
 * The registry used to track the descriptors of the property tab extension.
 *
 * @author mbats
 */
public class LegacyPropertyTabRegistry implements IItemRegistry {

	/**
	 * The map of the identifier of the description to the {@link LegacyPropertyTabItemDescriptor}.
	 */
	private Map<String, List<IItemDescriptor>> id2descriptors = new HashMap<>();

	/**
	 * Get the property tabs.
	 *
	 * @param contributorId
	 *            The contributor Id
	 *
	 * @return List of tabs
	 */
	public List<IEEFTabDescriptor> getPropertyTabs(String contributorId) {
		// Get tabs
		List<IEEFTabDescriptor> tabs = readTabDescriptors(contributorId);
		// Get categories
		final List<String> propertyCategories = readPropertyCategories();
		// Sort the tabs according to their categories
		List<IEEFTabDescriptor> sortedTabs = sortTabDescriptorsByCategory(tabs, propertyCategories);
		// Sort the tabs according to the after tab attribute
		sortedTabs = sortTabDescriptorsByAfterTab(sortedTabs, propertyCategories);
		return sortedTabs;
	}

	/**
	 * Sorts the tab descriptors in the given list according to category.
	 *
	 * @param tabs
	 *            Tabs to sort
	 * @param propertyCategories
	 *            Property categories
	 * @return Sorted list of tabs according to there categories
	 */
	private List<IEEFTabDescriptor> sortTabDescriptorsByCategory(List<IEEFTabDescriptor> tabs, final List<String> propertyCategories) {
		List<IEEFTabDescriptor> sortedTabs = new ArrayList<IEEFTabDescriptor>(tabs);
		if (propertyCategories != null) {
			Collections.sort(sortedTabs, new Comparator<Object>() {
				@Override
				public int compare(Object arg0, Object arg1) {
					IEEFTabDescriptor one = (IEEFTabDescriptor) arg0;
					IEEFTabDescriptor two = (IEEFTabDescriptor) arg1;
					String categoryOne = one.getCategory();
					String categoryTwo = two.getCategory();
					if (categoryOne != null && categoryTwo != null) {
						int categoryOnePosition = getIndex(propertyCategories.toArray(), categoryOne);
						int categoryTwoPosition = getIndex(propertyCategories.toArray(), categoryTwo);
						return categoryOnePosition - categoryTwoPosition;
					}
					return 0;
				}
			});
		}

		return sortedTabs;

	}

	/**
	 * Sorts the tab descriptors in the given list according to afterTab.
	 *
	 * @param tabs
	 *            Tabs to sort
	 * @param propertyCategories
	 *            Property categories
	 * @return Sorted list of tabs according to the afterTab attribute
	 */
	private List<IEEFTabDescriptor> sortTabDescriptorsByAfterTab(List<IEEFTabDescriptor> tabs, List<String> propertyCategories) {
		if (tabs.size() == 0 || propertyCategories == null) {
			return tabs;
		}
		List<IEEFTabDescriptor> sorted = new ArrayList<IEEFTabDescriptor>();
		for (int i = 0; i < propertyCategories.size(); i++) {
			// Get all the tabs of a category
			final List<IEEFTabDescriptor> categoryList = new ArrayList<IEEFTabDescriptor>();
			String category = propertyCategories.get(i);

			for (IEEFTabDescriptor tab : tabs) {
				if (category.equals(tab.getCategory())) {
					categoryList.add(tab);
				}
			}
			List<IEEFTabDescriptor> sortedTabs = sortCategoryTabsByAfterTab(categoryList);

			for (int j = 0; j < sortedTabs.size(); j++) {
				sorted.add(sortedTabs.get(j));
			}
		}
		return sorted;
	}

	/**
	 * Sort tabs of a category by after tab.
	 *
	 * @param categoryList
	 *            List of tabs
	 * @return List of tabs sorted by after tab
	 */
	private List<IEEFTabDescriptor> sortCategoryTabsByAfterTab(List<IEEFTabDescriptor> categoryList) {
		return new LegacyPropertyTabSorter().sortTabsByAfterTab(categoryList);
	}

	/**
	 * Returns the index of the given element in the array.
	 *
	 * @param array
	 *            Array
	 * @param target
	 *            The element to search
	 * @return The index of the searched element in the array if it exists otherwise -1
	 */
	private int getIndex(Object[] array, Object target) {
		for (int i = 0; i < array.length; i++) {
			if (target != null && array[i] != null && array[i].equals(target)) {
				return i;
			}
		}
		return -1; // should never happen
	}

	/**
	 * Read property categories from the extension point.
	 *
	 * @return List of categories
	 */
	private List<String> readPropertyCategories() {
		return EEFPropertiesUiLegacyPlugin.getImplementation().getTabbedPropertyContributorRegistry().getPropertyCategories();
	}

	/**
	 * Reads property tab extensions. Returns all tab descriptors for the current contributor id or an empty list if
	 * none is found.
	 *
	 * @param contributorId
	 *            The contributor id
	 *
	 * @return List of static tab descriptors
	 */
	private List<IEEFTabDescriptor> readTabDescriptors(String contributorId) {
		List<IEEFTabDescriptor> eefTabDescriptors = new ArrayList<IEEFTabDescriptor>();
		// @formatter:off
		Collection<IItemDescriptor> values = this.id2descriptors.values().stream()
					.filter(Objects::nonNull)
					.flatMap(List::stream)
					.collect(Collectors.toList());
		// @formatter:on
		for (IItemDescriptor itemDescriptor : values) {
			if (itemDescriptor instanceof LegacyPropertyTabItemDescriptor) {
				LegacyPropertyTabItemDescriptor eefTabDescriptor = (LegacyPropertyTabItemDescriptor) itemDescriptor;
				String eefTabContributorId = eefTabDescriptor.getContributorId();
				if (eefTabContributorId != null && eefTabContributorId.equals(contributorId)) {
					eefTabDescriptors.add(eefTabDescriptor);
				}
			}
		}
		return eefTabDescriptors;
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
	 * @see IItemRegistry#add(IItemDescriptor)
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

	/**
	 * Disposes this registry.
	 */
	public void dispose() {
		// @formatter:off
		this.id2descriptors.values().stream()
			.filter(Objects::nonNull)
			.flatMap(List::stream)
			.filter(LegacyPropertyTabItemDescriptor.class::isInstance)
			.map(LegacyPropertyTabItemDescriptor.class::cast)
			.forEach(LegacyPropertyTabItemDescriptor::dispose);
		// @formatter:on
	}
}
