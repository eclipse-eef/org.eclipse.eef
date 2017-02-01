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
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.controllers.IInvalidValidationRuleResult;
import org.eclipse.eef.core.api.controllers.InvalidValidationRuleResultData;
import org.eclipse.eef.core.api.utils.EvalFactory.Eval;

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
	 * The evaluation environment.
	 */
	private Eval<Object> eval;

	/**
	 * The editing context adapter.
	 */
	private EditingContextAdapter editingContextAdapter;

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
	 * @param eval
	 *            The evaluation environment
	 * @param editingContextAdapter
	 *            The editing context adapter
	 * @param severity
	 *            The severity
	 */
	public InvalidValidationRuleResult(EEFValidationRuleDescription validationRule, String message, Eval<Object> eval,
			EditingContextAdapter editingContextAdapter, int severity) {
		super(validationRule);
		this.message = message;
		this.eval = eval;
		this.editingContextAdapter = editingContextAdapter;
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
	public InvalidValidationRuleResultData getData() {
		return new InvalidValidationRuleResultData(this.eval, this.editingContextAdapter);
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
