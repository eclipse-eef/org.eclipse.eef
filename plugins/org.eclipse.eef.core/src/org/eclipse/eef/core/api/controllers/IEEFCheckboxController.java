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

/**
 * The EEFCheckboxController is responsible of supporting all the interactions with the widgets created for an
 * EEFCheckboxDescription.
 *
 * @author mbats
 */
public interface IEEFCheckboxController extends IEEFWidgetController {

	/**
	 * Update the value of the checkbox.
	 *
	 * @param checkbox
	 *            The new value of the checkbox
	 * @return the status of the update execution.
	 */
	IStatus updateValue(boolean checkbox);

	/**
	 * Register a consumer which will be called with the new value of the checkbox when it will change.
	 *
	 * @param consumer
	 *            The consumer of the new value of the checkbox
	 */
	void onNewValue(Consumer<Boolean> consumer);

	/**
	 * Remove the consumer of the new value of the checkbox.
	 */
	void removeNewValueConsumer();
}
