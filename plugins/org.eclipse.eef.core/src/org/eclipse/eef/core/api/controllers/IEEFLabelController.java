/*******************************************************************************
 * Copyright (c) 2015, 2018 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors: Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.eef.core.api.controllers;

import java.util.function.Consumer;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.eef.EEFWidgetAction;

/**
 * The EEFLabelController is responsible of supporting all the interactions with the widgets created for an
 * EEFLabelDescription.
 *
 * @author mbats
 */
public interface IEEFLabelController extends IEEFWidgetController {
	/**
	 * Register a consumer which will be called with the new value of the label when it will change.
	 *
	 * @param consumer
	 *            The consumer of the new value of the label
	 */
	void onNewValue(Consumer<String> consumer);

	/**
	 * Remove the consumer of the new value of the label.
	 */
	void removeNewValueConsumer();

	/**
	 * Invoked when the user clicks on an action button.
	 *
	 * @param action
	 *            Widget action
	 * @return the status of the action execution
	 */
	IStatus action(EEFWidgetAction action);
}
