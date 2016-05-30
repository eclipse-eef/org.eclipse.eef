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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	 * The after tab top value.
	 */
	private static final String TOP = "top"; //$NON-NLS-1$

	/**
	 * The map of the identifier of the description to the {@link LegacyPropertyTabItemDescriptor}.
	 */
	private Map<String, IItemDescriptor> id2descriptors = new HashMap<String, IItemDescriptor>();

	/**
	 * Get the property tabs.
	 * 
	 * @return List of tabs
	 */
	public List<IEEFTabDescriptor> getPropertyTabs() {
		// Get tabs
		List<IEEFTabDescriptor> tabs = readTabDescriptors();
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
	@SuppressWarnings("cast")
	private List<IEEFTabDescriptor> sortTabDescriptorsByAfterTab(List<IEEFTabDescriptor> tabs, List<String> propertyCategories) {
		if (tabs.size() == 0 || propertyCategories == null) {
			return tabs;
		}
		List<IEEFTabDescriptor> sorted = new ArrayList<IEEFTabDescriptor>();
		int categoryIndex = 0;
		for (int i = 0; i < propertyCategories.size(); i++) {
			List<IEEFTabDescriptor> categoryList = new ArrayList<IEEFTabDescriptor>();
			String category = (String) propertyCategories.get(i);
			int topOfCategory = categoryIndex;
			int endOfCategory = categoryIndex;
			while (endOfCategory < tabs.size() && ((IEEFTabDescriptor) tabs.get(endOfCategory)).getCategory().equals(category)) {
				endOfCategory++;
			}
			for (int j = topOfCategory; j < endOfCategory; j++) {
				IEEFTabDescriptor tab = (IEEFTabDescriptor) tabs.get(j);
				if (tab.getAfterTab().equals(TOP)) {
					categoryList.add(0, tabs.get(j));
				} else {
					categoryList.add(tabs.get(j));
				}
			}
			Collections.sort(categoryList, new Comparator<Object>() {
				@Override
				public int compare(Object arg0, Object arg1) {
					IEEFTabDescriptor one = (IEEFTabDescriptor) arg0;
					IEEFTabDescriptor two = (IEEFTabDescriptor) arg1;
					int result = 0;
					if (two.getAfterTab().equals(one.getId())) {
						result = -1;
					} else if (one.getAfterTab().equals(two.getId())) {
						result = 1;
					}
					return result;
				}
			});
			for (int j = 0; j < categoryList.size(); j++) {
				sorted.add((IEEFTabDescriptor) categoryList.get(j));
			}
			categoryIndex = endOfCategory;
		}
		return sorted;
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
	 * @return List of static tab descriptors
	 */
	private List<IEEFTabDescriptor> readTabDescriptors() {
		Map<String, IEEFTabDescriptor> eefTabDescriptors = new HashMap<String, IEEFTabDescriptor>();
		Collection<IItemDescriptor> values = this.id2descriptors.values();
		for (IItemDescriptor itemDescriptor : values) {
			if (itemDescriptor instanceof IEEFTabDescriptor) {
				if (!eefTabDescriptors.containsKey(itemDescriptor.getId())) {
					eefTabDescriptors.put(itemDescriptor.getId(), (IEEFTabDescriptor) itemDescriptor);
				}
			}
		}
		return new ArrayList<IEEFTabDescriptor>(eefTabDescriptors.values());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see IItemRegistry#add(IItemDescriptor)
	 */
	@Override
	public IItemDescriptor add(IItemDescriptor descriptor) {
		return this.id2descriptors.put(descriptor.getId(), descriptor);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see IItemRegistry#add(IItemDescriptor)
	 */
	@Override
	public IItemDescriptor remove(String id) {
		return this.id2descriptors.remove(id);
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
