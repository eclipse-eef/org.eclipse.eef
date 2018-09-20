/*******************************************************************************
 * Copyright (c) 2016, 2018 Obeo.
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

/**
 * The Widget controller is responsible for the refresh of the label of a widget.
 *
 * @author sbegaudeau
 */
public interface IEEFWidgetController extends IEEFController {
	/**
	 * Register a consumer which will be called with the new value of the label when it will change.
	 *
	 * @param consumer
	 *            The consumer of the new value of the label
	 */
	void onNewLabel(Consumer<String> consumer);

	/**
	 * Remove the consumer of the new value of the label.
	 */
	void removeNewLabelConsumer();

	/**
	 * Registers a consumer which will be called with the new value of the help.
	 *
	 * @param consumer
	 *            The consumer of the new value of the help
	 */
	void onNewHelp(Consumer<String> consumer);

	/**
	 * Removes the consumer of the new value of the help.
	 */
	void removeNewHelpConsumer();

	/**
	 * Compute the help message.
	 */
	void computeHelp();
}
