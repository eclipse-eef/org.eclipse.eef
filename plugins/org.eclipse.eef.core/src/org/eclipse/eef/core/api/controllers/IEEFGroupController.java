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
 * The EEFGroupController is responsible of supporting the refresh of the label of the group.
 *
 * @author sbegaudeau
 */
public interface IEEFGroupController extends IEEFController, IEEFToolbarActionController {
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
}
