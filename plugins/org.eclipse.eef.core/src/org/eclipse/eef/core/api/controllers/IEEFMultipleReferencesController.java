/*******************************************************************************
 * Copyright (c) 2016, 2017 Obeo.
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
import java.util.function.Consumer;

/**
 * The IEEFMultipleReferencesController is responsible of supporting all the interactions with the widgets created for a
 * multiple references viewer.
 *
 * @author mbats
 */
public interface IEEFMultipleReferencesController extends IEEFWidgetController {
	/**
	 * Register a consumer which will be called with the new value of the text when it will change.
	 *
	 * @param consumer
	 *            The consumer of the new value of the text
	 */
	void onNewValue(Consumer<List<Object>> consumer);

	/**
	 * Remove the consumer of the new value of the text.
	 */
	void removeNewValueConsumer();

	/**
	 * Invoked when the user pushes the create button.
	 */
	void create();

	/**
	 * Invoked when the user pushes the search button.
	 */
	void search();

	/**
	 * Invoked when the user pushes the unset button.
	 *
	 * @param elements
	 *            Selected elements
	 */
	void unset(List<Object> elements);

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

	/**
	 * Invoked when the user double clicks on a reference.
	 *
	 * @param element
	 *            Selected element
	 */
	void onClick(Object element);
}
