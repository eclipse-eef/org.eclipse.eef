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
package org.eclipse.eef.properties.ui.legacy.internal.extension;


/**
 * The registry used to track the descriptors of the extensions.
 *
 * @author sbegaudeau
 */
public interface IItemRegistry {
	/**
	 * Adds the given {@link IItemDescriptor} to the registry.
	 *
	 * @param descriptor
	 *            The descriptor
	 * @return The previous {@link IItemDescriptor} with the same identifier, or null if no registered
	 *         {@link IItemDescriptor} had the same identifier
	 */
	IItemDescriptor add(IItemDescriptor descriptor);

	/**
	 * Removes the {@link IItemDescriptor} with the given identifier.
	 *
	 * @param id
	 *            The identifier
	 * @return The {@link IItemDescriptor} removed or null if no registered {@link IItemDescriptor} had an identifier
	 *         matching the given one
	 */
	IItemDescriptor remove(String id);

	/**
	 * Clears the registry.
	 */
	void clear();
}
