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

import org.eclipse.eef.properties.ui.legacy.internal.extension.IItemDescriptor;

/**
 * The property contributor descriptor.
 *
 * @author mbats
 */
public class LegacyPropertyContributorItemDescriptor implements IItemDescriptor {

	/**
	 * The category.
	 */
	private String category;

	/**
	 * The constructor.
	 * 
	 * @param category
	 *            The category
	 */
	public LegacyPropertyContributorItemDescriptor(String category) {
		this.category = category;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see IItemDescriptor#getId()
	 */
	@Override
	public String getId() {
		return this.category;
	}

	/**
	 * Get category.
	 * 
	 * @return The category
	 */
	public String getCategory() {
		return this.category;
	}

}
