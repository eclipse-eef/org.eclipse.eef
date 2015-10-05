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
package org.eclipse.eef.core.api;

/**
 * Superinterface of all the business objects.
 *
 * @author sbegaudeau
 */
public interface EEFObject {
	/**
	 * Creates the tree of objects representing the user interface.
	 */
	void createControl();

	/**
	 * Set or update the input and reevaluates all the input-related expressions.
	 *
	 * @param object
	 *            The new input
	 */
	void setInput(Object object);
}
