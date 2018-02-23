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
package org.eclipse.eef.properties.ui.api;

import org.eclipse.jface.viewers.ISelection;

/**
 * This interface is used to filter {@link IEEFTabDescriptor}.
 *
 * @author mbats
 */
public interface IEEFTabDescriptorFilter {
	/**
	 * Returns if a tab descriptor must be filtered or not.
	 *
	 * @param tabDescriptor
	 *            The tab descriptor
	 *
	 * @return <code>true</code> if the tab descriptor should be used, <code>false</code> otherwise
	 */
	@Deprecated
	boolean filter(IEEFTabDescriptor tabDescriptor);

	/**
	 * Returns if a tab descriptor must be filtered or not.
	 *
	 * @param tabDescriptor
	 *            The tab descriptor
	 * @param input
	 *            The current selection
	 * @return <code>true</code> if the tab descriptor should be used, <code>false</code> otherwise
	 */
	default boolean filter(IEEFTabDescriptor tabDescriptor, ISelection input) {
		return filter(tabDescriptor);
	}
}
