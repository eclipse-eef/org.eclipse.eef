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

import org.eclipse.eef.EEFValidationRuleDescription;

/**
 * A validation rule result.
 *
 * @author sbegaudeau
 */
public interface IValidationRuleResult {
	/**
	 * The validation rule.
	 *
	 * @return The validation rule
	 */
	EEFValidationRuleDescription getValidationRule();
}
