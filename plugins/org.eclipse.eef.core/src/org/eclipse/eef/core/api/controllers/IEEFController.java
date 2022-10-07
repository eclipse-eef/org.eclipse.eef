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

import java.util.List;
import java.util.function.Consumer;

/**
 * Common interface of all the controllers.
 *
 * @author sbegaudeau
 */
public interface IEEFController {
	/**
	 * Registers a consumer which will be called with the validation status.
	 *
	 * @param consumer
	 *            The consumer of the validation status
	 */
	void onValidation(Consumer<List<IValidationRuleResult>> consumer);

	/**
	 * Removes the consumer of the validation.
	 */
	void removeValidationConsumer();

	/**
	 * Refresh the controller.
	 */
	void refresh();

	/**
	 * Indicates if the associated widget is used to show validation rules.
	 * <p>
	 * This indication may be required for widget layout.
	 * </p>
	 *
	 * @return true if some validation may be displayed
	 */
	default boolean isValidationAnchor() {
		return true;
	}
}
