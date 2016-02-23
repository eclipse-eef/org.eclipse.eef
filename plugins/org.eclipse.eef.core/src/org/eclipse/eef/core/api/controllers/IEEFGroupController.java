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
 * The EEFGroupController is responsible of supporting the refresh of the label of the group.
 *
 * @author sbegaudeau
 */
public interface IEEFGroupController {
	/**
	 * Register a consumer which will be called with the new value of the label when it will change.
	 *
	 * @param consumer
	 *            The consumer of the new value of the label
	 */
	void onNewLabel(IConsumer<String> consumer);

	/**
	 * Remove the consumer of the new value of the label.
	 */
	void removeNewLabelConsumer();

	/**
	 * Registers a consumer which will be called with the validation status.
	 *
	 * @param consumer
	 *            The consumer of the validation status
	 */
	void onValidation(IConsumer<List<IValidationRuleResult>> consumer);

	/**
	 * Removes the consumer of the validation.
	 */
	void removeValidationConsumer();

	/**
	 * Refresh the label.
	 */
	void refresh();
}
