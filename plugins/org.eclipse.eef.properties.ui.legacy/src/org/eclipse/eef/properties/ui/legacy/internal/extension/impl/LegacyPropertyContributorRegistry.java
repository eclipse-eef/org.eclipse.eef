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
import java.util.List;

import org.eclipse.eef.properties.ui.legacy.internal.extension.IItemDescriptor;
import org.eclipse.eef.properties.ui.legacy.internal.extension.IItemRegistry;
import org.eclipse.ui.views.properties.tabbed.ISectionDescriptorProvider;
import org.eclipse.ui.views.properties.tabbed.ITypeMapper;

/**
 * The registry used to track the descriptors of the property contributor extension.
 *
 * @author mbats
 */
public class LegacyPropertyContributorRegistry implements IItemRegistry {

	/**
	 * The map of the identifier of the description to the {@link IItemDescriptor}.
	 */
	private Multimap<String, IItemDescriptor> id2descriptors = ArrayListMultimap.create();

	/**
	 * Get property categories.
	 *
	 * @return List of categories
	 */
	public List<String> getPropertyCategories() {
		List<String> legacyPropertyCategories = new ArrayList<String>();
		Collection<IItemDescriptor> values = this.id2descriptors.values();
		for (IItemDescriptor itemDescriptor : values) {
			if (itemDescriptor instanceof LegacyPropertyContributorItemDescriptor) {
				legacyPropertyCategories.addAll(((LegacyPropertyContributorItemDescriptor) itemDescriptor).getCategories());
			}
		}
		return legacyPropertyCategories;
	}

	/**
	 * Get property type mapper.
	 *
	 * @param contributorId
	 *            The contributor ID
	 * @return Type mapper
	 */
	public ITypeMapper getTypeMapper(String contributorId) {
		Collection<IItemDescriptor> values = this.id2descriptors.values();
		for (IItemDescriptor itemDescriptor : values) {
			if (itemDescriptor instanceof LegacyPropertyContributorItemDescriptor) {
				if (contributorId != null && contributorId.equals(itemDescriptor.getId())) {
					ITypeMapper legacyPropertyTypeMapper = ((LegacyPropertyContributorItemDescriptor) itemDescriptor).getTypeMapper();
					if (legacyPropertyTypeMapper != null) {
						return legacyPropertyTypeMapper;
					}
				}
			}
		}
		return null;
	}

	/**
	 * Get property section descriptor provider.
	 *
	 * @param contributorId
	 *            The contributor ID
	 * @return Section descriptor provider
	 */
	public ISectionDescriptorProvider getSectionDescriptorProvider(String contributorId) {

		Collection<IItemDescriptor> values = this.id2descriptors.values();
		for (IItemDescriptor itemDescriptor : values) {
			if (itemDescriptor instanceof LegacyPropertyContributorItemDescriptor) {
				if (contributorId != null && contributorId.equals(itemDescriptor.getId())) {
					ISectionDescriptorProvider legacyPropertySectionDescriptorProvider = ((LegacyPropertyContributorItemDescriptor) itemDescriptor)
							.getSectionDescriptorProvider();
					if (legacyPropertySectionDescriptorProvider != null) {
						return legacyPropertySectionDescriptorProvider;
					}
				}
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
	public IItemDescriptor add(IItemDescriptor itemDescriptor) {
		boolean result = this.id2descriptors.put(itemDescriptor.getId(), itemDescriptor);
		if (result) {
			return itemDescriptor;
		}
		return null;
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
	 * {@inheritDoc}
	 *
	 * @see IItemRegistry#remove(java.lang.String)
	 */
	@Override
	public boolean remove(String id) {
		return !this.id2descriptors.removeAll(id).isEmpty();
	}
}
