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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

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
	private Map<String, List<IItemDescriptor>> id2descriptors = new HashMap<>();

	/**
	 * Get property categories.
	 *
	 * @return List of categories
	 */
	public List<String> getPropertyCategories() {
		// @formatter:off
		return this.id2descriptors.values().stream()
					.filter(Objects::nonNull)
					.flatMap(List::stream)
					.filter(LegacyPropertyContributorItemDescriptor.class::isInstance)
					.map(LegacyPropertyContributorItemDescriptor.class::cast)
					.map(LegacyPropertyContributorItemDescriptor::getCategories)
					.flatMap(List::stream)
					.collect(Collectors.toList());
		// @formatter:on
	}

	/**
	 * Get property type mapper.
	 *
	 * @param contributorId
	 *            The contributor ID
	 * @return Type mapper
	 */
	public ITypeMapper getTypeMapper(String contributorId) {
		// @formatter:off
		Collection<IItemDescriptor> values = this.id2descriptors.values().stream()
				.filter(Objects::nonNull)
				.flatMap(List::stream)
				.collect(Collectors.toList());

		return values.stream().filter(LegacyPropertyContributorItemDescriptor.class::isInstance)
				.map(LegacyPropertyContributorItemDescriptor.class::cast)
				.filter(itemDescriptor -> contributorId != null && contributorId.equals(itemDescriptor.getId()))
				.map(LegacyPropertyContributorItemDescriptor::getTypeMapper)
				.filter(Objects::nonNull)
				.findFirst()
				.orElse(null);
		// @formatter:on
	}

	/**
	 * Get property section descriptor provider.
	 *
	 * @param contributorId
	 *            The contributor ID
	 * @return Section descriptor provider
	 */
	public ISectionDescriptorProvider getSectionDescriptorProvider(String contributorId) {
		// @formatter:off
		Collection<IItemDescriptor> values = this.id2descriptors.values().stream()
				.filter(Objects::nonNull)
				.flatMap(List::stream)
				.collect(Collectors.toList());

		return values.stream().filter(LegacyPropertyContributorItemDescriptor.class::isInstance)
					.map(LegacyPropertyContributorItemDescriptor.class::cast)
					.filter(itemDescriptor -> contributorId != null && contributorId.equals(itemDescriptor.getId()))
					.map(LegacyPropertyContributorItemDescriptor::getSectionDescriptorProvider)
					.filter(Objects::nonNull)
					.findFirst()
					.orElse(null);
		// @formatter:on
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see IItemRegistry#add(IItemDescriptor)
	 */
	@Override
	public IItemDescriptor add(IItemDescriptor itemDescriptor) {
		List<IItemDescriptor> descriptors = this.id2descriptors.getOrDefault(itemDescriptor.getId(), new ArrayList<>());
		descriptors.add(itemDescriptor);
		this.id2descriptors.put(itemDescriptor.getId(), descriptors);

		return itemDescriptor;
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
		return Optional.ofNullable(this.id2descriptors.remove(id)).isPresent();
	}
}
