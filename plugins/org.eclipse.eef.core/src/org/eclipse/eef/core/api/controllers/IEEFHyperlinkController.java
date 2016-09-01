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

import org.eclipse.eef.EEFWidgetAction;

/**
 * The EEFHyperlinkController is responsible of supporting all the interactions with the widgets created for an
 * EEFHyperlinkDescription.
 *
 * @author mbats
 */
public interface IEEFHyperlinkController extends IEEFWidgetController {

	/**
	 * Invoked when the user clicks on an hyperlink.
	 *
	 * @param element
	 *            Semantic element
	 */
	void onClick(Object element);

	/**
	 * Register a consumer which will be called with the new value of the hyperlink when it will change.
	 *
	 * @param consumer
	 *            The consumer of the new value of the hyperlink
	 */
	void onNewValue(IConsumer<String> consumer);

	/**
	 * Remove the consumer of the new value of the hyperlink.
	 */
	void removeNewValueConsumer();

	/**
	 * Invoked when the user clicks on an action button.
	 *
	 * @param action
	 *            Widget action
	 */
	void action(EEFWidgetAction action);

}
