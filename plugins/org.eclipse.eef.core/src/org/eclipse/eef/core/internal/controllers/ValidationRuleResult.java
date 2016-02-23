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
package org.eclipse.eef.core.internal.controllers;

import org.eclipse.eef.EEFValidationRuleDescription;
import org.eclipse.eef.core.api.controllers.IValidationRuleResult;

/**
 * A validation rule result.
 *
 * @author sbegaudeau
 */
public class ValidationRuleResult implements IValidationRuleResult {

	/**
	 * The validation rule.
	 */
	private EEFValidationRuleDescription validationRule;

	/**
	 * The constructor.
	 * 
	 * @param validationRule
	 *            The validation rule
	 */
	public ValidationRuleResult(EEFValidationRuleDescription validationRule) {
		this.validationRule = validationRule;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.controllers.IValidationRuleResult#getValidationRule()
	 */
	@Override
	public EEFValidationRuleDescription getValidationRule() {
		return this.validationRule;
	}

}
