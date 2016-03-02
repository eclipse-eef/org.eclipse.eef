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
package org.eclipse.eef.core.api.controllers;

import java.util.List;

/**
 * The IEEFMultiReferenceController is responsible of supporting all the interactions with the widgets created for a
 * single reference viewer.
 *
 * @author mbats
 */
public interface IEEFMultiReferenceController extends IEEFWidgetController {
	/**
	 * Invoked when the user pushes the up button.
	 *
	 * @param elements
	 *            Selected elements
	 */
	void up(List<Object> elements);

	/**
	 * Invoked when the user pushes the down button.
	 *
	 * @param elements
	 *            Selected elements
	 */
	void down(List<Object> elements);
}
