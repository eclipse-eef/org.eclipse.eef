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
import org.eclipse.eef.core.api.controllers.IInvalidValidationRuleResult;

/**
 * An invalid validation rule result.
 *
 * @author sbegaudeau
 */
public class InvalidValidationRuleResult extends ValidationRuleResult implements IInvalidValidationRuleResult {

	/**
	 * The message.
	 */
	private String message;

	/**
	 * The data.
	 */
	private Object data;

	/**
	 * The severity.
	 */
	private int severity;

	/**
	 * The constructor.
	 * 
	 * @param validationRule
	 *            The validation rule
	 * @param message
	 *            The message
	 * @param data
	 *            The data
	 * @param severity
	 *            The severity
	 */
	public InvalidValidationRuleResult(EEFValidationRuleDescription validationRule, String message, Object data, int severity) {
		super(validationRule);
		this.message = message;
		this.data = data;
		this.severity = severity;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.controllers.IInvalidValidationRuleResult#getMessage()
	 */
	@Override
	public String getMessage() {
		return this.message;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.controllers.IInvalidValidationRuleResult#getData()
	 */
	@Override
	public Object getData() {
		return this.data;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.controllers.IInvalidValidationRuleResult#getSeverity()
	 */
	@Override
	public int getSeverity() {
		return this.severity;
	}

}
