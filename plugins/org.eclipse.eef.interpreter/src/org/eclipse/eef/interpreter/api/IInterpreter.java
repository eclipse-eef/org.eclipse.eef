/*******************************************************************************
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.eef.interpreter.api;

/**
 * Common interface of all the interpreters used by the EEF runtime.
 *
 * @author sbegaudeau
 */
public interface IInterpreter {
	/**
	 * Evaluates the expression with the given body and parameters.
	 *
	 * @param interpreterContext
	 *            The context available for this expression
	 * @param body
	 *            The body of the expression
	 * @return The result of the evaluation
	 * @throws EvaluationException
	 *             In case of error during the evaluation
	 */
	IEvaluationResult evaluateExpression(IInterpreterContext interpreterContext, String body);

	/**
	 * Validates the expression with the given body and parameters.
	 *
	 * @param interpreterContext
	 *            The context available for this expression
	 * @param body
	 *            The body of the expression
	 * @return The evaluation result
	 */
	IValidationResult validateExpression(IInterpreterContext interpreterContext, String body);
}
