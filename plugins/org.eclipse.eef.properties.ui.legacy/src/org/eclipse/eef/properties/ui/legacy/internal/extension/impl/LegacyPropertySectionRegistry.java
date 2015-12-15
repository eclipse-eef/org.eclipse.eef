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

import org.eclipse.eef.properties.ui.api.IEEFSectionDescriptor;
import org.eclipse.eef.properties.ui.legacy.internal.extension.IItemDescriptor;
import org.eclipse.eef.properties.ui.legacy.internal.extension.IItemRegistry;

/**
 * The registry used to track the descriptors of the property section extension.
 * 
 * @author mbats
 */
public class LegacyPropertySectionRegistry implements IItemRegistry {

	/**
	 * The map of the identifier of the description to the {@link LegacyPropertySectionItemDescriptor}.
	 */
	private Map<String, IItemDescriptor> id2descriptors = new HashMap<String, IItemDescriptor>();

	/**
	 * Get the property sections.
	 * 
	 * @param tabId
	 *            Id of the tab for which we should get the sections
	 * @return List of sections
	 */
	public List<IEEFSectionDescriptor> getPropertySections(String tabId) {
		Map<String, IEEFSectionDescriptor> eefSectionDescriptors = new HashMap<String, IEEFSectionDescriptor>();
		Collection<IItemDescriptor> values = this.id2descriptors.values();
		for (IItemDescriptor itemDescriptor : values) {
			if (itemDescriptor instanceof IEEFSectionDescriptor) {
				if (tabId.equals(((IEEFSectionDescriptor) itemDescriptor).getTargetTab())) {
					if (!eefSectionDescriptors.containsKey(itemDescriptor.getId())) {
						eefSectionDescriptors.put(itemDescriptor.getId(), (IEEFSectionDescriptor) itemDescriptor);
					}
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
		return this.id2descriptors.put(descriptor.getId(), descriptor);
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
