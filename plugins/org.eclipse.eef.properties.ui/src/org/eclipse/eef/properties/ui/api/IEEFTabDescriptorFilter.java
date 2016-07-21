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
	 * @return True if the tab descriptor is filtered otherwise false
	 */
	boolean filter(IEEFTabDescriptor tabDescriptor);
}
