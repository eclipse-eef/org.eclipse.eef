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
	void onNewValue(IConsumer<Object> consumer);

	/**
	 * Remove the consumer of the new value of the text.
	 */
	void removeNewValueConsumer();

	/**
	 * Register a consumer which will be called with the new value of the candidates when it will change.
	 *
	 * @param consumer
	 *            The consumer of the new candidates of the list
	 */
	void onNewCandidates(IConsumer<List<Object>> consumer);

	/**
	 * Remove the consumer of the new candidates of the list.
	 */
	void removeNewCandidatesConsumer();

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
	 * @param element
	 *            Clicked element
	 */
	void unset(Object element);

	/**
	 * Invoked when the user pushes the up button.
	 *
	 * @param element
	 *            Clicked element
	 */
	void up(Object element);

	/**
	 * Invoked when the user pushes the down button.
	 *
	 * @param element
	 *            Clicked element
	 */
	void down(Object element);

	/**
	 * Invoked when the user double clicks on a reference.
	 *
	 * @param element
	 *            Clicked element
	 */
	void onClick(Object element);
}
