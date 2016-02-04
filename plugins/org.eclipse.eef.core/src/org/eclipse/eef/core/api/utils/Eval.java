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
package org.eclipse.eef.core.api.utils;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.eef.core.internal.EEFCorePlugin;
import org.eclipse.eef.core.internal.Messages;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.sirius.common.interpreter.api.IEvaluationResult;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;

/**
 * Utility class used to evaluate expression and log potential errors.
 *
 * @author sbegaudeau
 */
public final class Eval {
	/**
	 * The interpreter.
	 */
	private IInterpreter interpreter;

	/**
	 * The variables.
	 */
	private Map<String, Object> variables = new HashMap<String, Object>();

	/**
	 * The constructor.
	 *
	 * @param interpreter
	 *            The interpreter
	 * @param variables
	 *            The variables
	 */
	public Eval(IInterpreter interpreter, Map<String, Object> variables) {
		this.interpreter = interpreter;
		this.variables.putAll(variables);
	}

	/**
	 * The constructor.
	 *
	 * @param interpreter
	 *            The interpreter
	 * @param variableManager
	 *            The variable manager
	 */
	public Eval(IInterpreter interpreter, IVariableManager variableManager) {
		this(interpreter, variableManager.getVariables());
	}

	/**
	 * Verifies that the expression is not blank, evaluates it, verify the type of the result and logs any potential
	 * error.
	 *
	 * @param expressionEAttribute
	 *            The EAttribute containing the expression
	 * @param expression
	 *            The expression to evaluate
	 * @param expectedResultType
	 *            The expected type of the result
	 * @param consumer
	 *            The consumer which will receive the result
	 * @param <T>
	 *            The type of the result expected
	 */
	public <T> void call(EAttribute expressionEAttribute, String expression, Class<T> expectedResultType, ISuccessfulResultConsumer<T> consumer) {
		if (!Util.isBlank(expression)) {
			this.call(expression, expectedResultType, consumer);
		} else {
			EEFCorePlugin.getPlugin().blank(expressionEAttribute);
		}
	}

	/**
	 * Evaluates the expression, verify the type of the result and logs any potential error.
	 *
	 * @param expression
	 *            The expression to evaluate
	 * @param expectedResultType
	 *            The expected type of the result
	 * @param consumer
	 *            The consumer which will receive the result
	 * @param <T>
	 *            The type of the result expected
	 */
	public <T> void call(String expression, Class<T> expectedResultType, ISuccessfulResultConsumer<T> consumer) {
		IEvaluationResult evaluationResult = this.interpreter.evaluateExpression(this.variables, expression);
		if (evaluationResult.success()) {
			Object value = evaluationResult.getValue();
			if (expectedResultType.isInstance(value)) {
				T castValue = expectedResultType.cast(value);
				consumer.apply(castValue);
			} else {
				String message = MessageFormat.format(Messages.AbstractEEFWidgetController_InvalidValueForExpression, expression,
						expectedResultType.getName(), value);
				EEFCorePlugin.getPlugin().error(message);
			}
		} else {
			EEFCorePlugin.getPlugin().diagnostic(expression, evaluationResult.getDiagnostic());
		}
	}

	/**
	 * Verifies that the expression is not blank, evaluates it and logs any potential error.
	 *
	 * @param expressionEAttribute
	 *            The EAttribute containing the expression
	 * @param expression
	 *            The expression to evaluate
	 * @param consumer
	 *            The consumer which will receive the result
	 */
	public void call(EAttribute expressionEAttribute, String expression, ISuccessfulResultConsumer<Object> consumer) {
		if (!Util.isBlank(expression)) {
			this.call(expression, consumer);
		} else {
			EEFCorePlugin.getPlugin().blank(expressionEAttribute);
		}
	}

	/**
	 * Verifies that the expression is not blank, evaluates it and logs any potential error.
	 *
	 * @param expression
	 *            The expression to evaluate
	 * @param consumer
	 *            The consumer which will receive the result
	 */
	public void call(String expression, ISuccessfulResultConsumer<Object> consumer) {
		IEvaluationResult evaluationResult = this.interpreter.evaluateExpression(this.variables, expression);
		if (evaluationResult.success()) {
			Object value = evaluationResult.getValue();
			consumer.apply(value);
		} else {
			EEFCorePlugin.getPlugin().diagnostic(expression, evaluationResult.getDiagnostic());
		}
	}

	/**
	 * Verifies that the expression is not blank, evaluates it and logs any potential error.
	 *
	 * @param expressionEAttribute
	 *            The EAttribute containing the expression
	 * @param expression
	 *            The expression to evaluate
	 */
	public void call(EAttribute expressionEAttribute, String expression) {
		if (!Util.isBlank(expression)) {
			IEvaluationResult evaluationResult = this.interpreter.evaluateExpression(this.variables, expression);
			if (!evaluationResult.success()) {
				EEFCorePlugin.getPlugin().diagnostic(expression, evaluationResult.getDiagnostic());
			}
		} else {
			EEFCorePlugin.getPlugin().blank(expressionEAttribute);
		}
	}

	/**
	 * Verifies that the expression is not blank, evaluates it and returns its result if its matches the given result
	 * type.
	 *
	 * @param expressionEAttribute
	 *            The EAttribute containing the expression
	 * @param expression
	 *            The expression
	 * @param expectedResultType
	 *            The expected result type
	 * @param <T>
	 *            The type expected
	 * @return The result of the expression
	 */
	public <T> T get(EAttribute expressionEAttribute, String expression, Class<T> expectedResultType) {
		if (!Util.isBlank(expression)) {
			IEvaluationResult evaluationResult = this.interpreter.evaluateExpression(this.variables, expression);
			if (evaluationResult.success()) {
				Object value = evaluationResult.getValue();
				if (expectedResultType.isInstance(value)) {
					T castValue = expectedResultType.cast(value);
					return castValue;
				} else {
					String message = MessageFormat.format(Messages.AbstractEEFWidgetController_InvalidValueForExpression, expression,
							expectedResultType.getName(), value);
					EEFCorePlugin.getPlugin().error(message);
				}
			} else {
				EEFCorePlugin.getPlugin().diagnostic(expression, evaluationResult.getDiagnostic());
			}
		} else {
			EEFCorePlugin.getPlugin().blank(expressionEAttribute);
		}
		return null;
	}
}
