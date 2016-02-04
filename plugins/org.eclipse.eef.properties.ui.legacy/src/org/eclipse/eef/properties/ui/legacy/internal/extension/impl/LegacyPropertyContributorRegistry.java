/*******************************************************************************
 * Copyright (c) 2016 Obeo.
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

import org.eclipse.eef.properties.ui.legacy.internal.extension.IItemDescriptor;
import org.eclipse.eef.properties.ui.legacy.internal.extension.IItemRegistry;

/**
 * The registry used to track the descriptors of the property contributor extension.
 * 
 * @author mbats
 */
public class LegacyPropertyContributorRegistry implements IItemRegistry {

	/**
	 * The map of the identifier of the description to the {@link IItemDescriptor}.
	 */
	private Map<String, IItemDescriptor> id2descriptors = new HashMap<String, IItemDescriptor>();

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
				legacyPropertyCategories.add(((LegacyPropertyContributorItemDescriptor) itemDescriptor).getCategory());
			}
		}
		return legacyPropertyCategories;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see IItemRegistry#add(IItemDescriptor)
	 */
	@Override
	public IItemDescriptor add(IItemDescriptor itemDescriptor) {
		return this.id2descriptors.put(itemDescriptor.getId(), itemDescriptor);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see IItemRegistry#remove(String)
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
