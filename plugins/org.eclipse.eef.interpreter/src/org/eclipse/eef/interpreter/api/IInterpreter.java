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

import java.util.Map;

import org.eclipse.sirius.expression.SiriusExpressionDescription;

/**
 * Common interface of all the interpreters used by the EEF runtime.
 *
 * @author sbegaudeau
 */
public interface IInterpreter {
	/**
	 * Evaluates the expression with the given body and parameters.
	 *
	 * @param variables
	 *            The variables used to evaluate the expression
	 * @param expressionDescription
	 *            The description of the expression
	 * @param expressionBody
	 *            The body of the expression
	 * @return The result of the evaluation
	 * @throws EvaluationException
	 *             In case of error during the evaluation
	 */
	IEvaluationResult evaluateExpression(Map<String, Object> variables, SiriusExpressionDescription expressionDescription, String expressionBody);

	/**
	 * Validates the expression with the given body and parameters.
	 *
	 * @param expressionDescription
	 *            The description of the expression
	 * @param expressionBody
	 *            The body of the expression
	 * @return The evaluation result
	 */
	IValidationResult validateExpression(SiriusExpressionDescription expressionDescription, String expressionBody);
}
