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

/**
 * The IEEFContainmentReferenceController is responsible of supporting all the interactions with the widgets created for
 * a containment reference viewer.
 *
 * @author mbats
 */
public interface IEEFContainmentReferenceController extends IEEFWidgetController {
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
	 * Invoked when the user pushes the create button.
	 */
	void create();

	/**
	 * Invoked when the user pushes the unset button.
	 *
	 * @param element
	 *            Semantic element
	 */
	void unset(Object element);

	/**
	 * Invoked when the user clicks on an hyperlink.
	 *
	 * @param element
	 *            Semantic element
	 */
	void onClick(Object element);

}
