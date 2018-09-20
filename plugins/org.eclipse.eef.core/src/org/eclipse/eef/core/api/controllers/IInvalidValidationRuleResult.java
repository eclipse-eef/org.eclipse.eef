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

/**
 * The invalid validation rule result.
 *
 * @author sbegaudeau
 */
public interface IInvalidValidationRuleResult extends IValidationRuleResult {

	/**
	 * INFO.
	 */
	int INFO_TYPE = 1;

	/**
	 * WARNING.
	 */
	int WARNING_TYPE = 2;

	/**
	 * ERROR.
	 */
	int ERROR_TYPE = 3;

	/**
	 * Returns the message to display to the end user.
	 *
	 * @return The message to display to the end user
	 */
	String getMessage();

	/**
	 * Returns the data related to this invalid result.
	 *
	 * @return The data related to this invalid result
	 */
	InvalidValidationRuleResultData getData();

	/**
	 * Returns the severity.
	 *
	 * @return The severity
	 */
	int getSeverity();
}
