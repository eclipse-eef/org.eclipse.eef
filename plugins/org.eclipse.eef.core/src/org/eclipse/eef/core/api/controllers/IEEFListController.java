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

import org.eclipse.core.runtime.IStatus;
import org.eclipse.eef.EEFWidgetAction;

/**
 * The IEEFListController is responsible of supporting all the interactions with the widgets created for a list.
 *
 * @author mbats
 */
public interface IEEFListController extends IEEFWidgetController {
	/**
	 * Register a consumer which will be called with the new value of the text when it will change.
	 *
	 * @param consumer
	 *            The consumer of the new value of the text
	 */
	void onNewValue(Consumer<Object> consumer);

	/**
	 * Remove the consumer of the new value of the text.
	 */
	void removeNewValueConsumer();

	/**
	 * Invoked when the user clicks on an object.
	 *
	 * @param element
	 *            Semantic element
	 * @param onClickEventKind
	 *            The kind of event (single click or double click)
	 */
	void onClick(Object element, String onClickEventKind);

	/**
	 * Invoked when the user clicks on an action button.
	 *
	 * @param action
	 *            Widget action
	 * @param selection
	 *            The selected elements
	 * @return the status of the action execution
	 */
	IStatus action(EEFWidgetAction action, List<Object> selection);

}
