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

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.eef.core.api.controllers.IConsumer;
import org.eclipse.eef.core.internal.EEFCorePlugin;
import org.eclipse.eef.core.internal.Messages;
import org.eclipse.sirius.common.interpreter.api.IEvaluationResult;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;

/**
 * This class is used to provide utilities to widget controller.
 *
 * @author mbats
 */
public abstract class AbstractEEFWidgetController {
	/**
	 * The interpreter.
	 */
	protected IInterpreter interpreter;

	/**
	 * The variable manager.
	 */
	protected IVariableManager variableManager;

	/**
	 * Refresh an expression returning a string.
	 *
	 * @param expression
	 *            The expression
	 * @param consumer
	 *            The consumer of the result
	 */
	protected void refreshStringBasedExpression(String expression, IConsumer<String> consumer) {
		IEvaluationResult evaluationResult = this.interpreter.evaluateExpression(this.variableManager.getVariables(), expression);
		if (evaluationResult.success()) {
			Object value = evaluationResult.getValue();
			if (value instanceof String && consumer != null) {
				consumer.apply((String) value);
			} else if (!(value instanceof String)) {
				String message = MessageFormat.format(Messages.AbstractEEFWidgetController_InvalidValueForExpression, expression,
						String.class.getName(), value);
				EEFCorePlugin.getPlugin().error(message);
			}
		} else {
			EEFCorePlugin.getPlugin().diagnostic(expression, evaluationResult.getDiagnostic());
		}
	}

	/**
	 * Refresh an expression returning a boolean.
	 *
	 * @param expression
	 *            The expression
	 * @param consumer
	 *            The consumer of the result
	 */
	protected void refreshBooleanBasedExpression(String expression, IConsumer<Boolean> consumer) {
		IEvaluationResult evaluationResult = this.interpreter.evaluateExpression(this.variableManager.getVariables(), expression);
		if (evaluationResult.success()) {
			Object value = evaluationResult.getValue();
			if (value instanceof Boolean && consumer != null) {
				consumer.apply((Boolean) value);
			} else if (!(value instanceof String)) {
				String message = MessageFormat.format(Messages.AbstractEEFWidgetController_InvalidValueForExpression, expression,
						Boolean.class.getName(), value);
				EEFCorePlugin.getPlugin().error(message);
			}
		} else {
			EEFCorePlugin.getPlugin().diagnostic(expression, evaluationResult.getDiagnostic());
		}
	}

	/**
	 * Refresh an expression returning an object.
	 *
	 * @param expression
	 *            The expression
	 * @param consumer
	 *            The consumer of the result
	 */
	protected void refreshObjectBasedExpression(String expression, IConsumer<Object> consumer) {
		IEvaluationResult evaluationResult = this.interpreter.evaluateExpression(this.variableManager.getVariables(), expression);
		if (evaluationResult.success()) {
			Object value = evaluationResult.getValue();
			if (consumer != null) {
				consumer.apply(value);
			}
		} else {
			EEFCorePlugin.getPlugin().diagnostic(expression, evaluationResult.getDiagnostic());
		}
	}

	/**
	 * Refresh an expression returning a list of objects.
	 *
	 * @param expression
	 *            The expression
	 * @param consumer
	 *            The consumer of the result
	 */
	protected void refreshListBasedExpression(String expression, IConsumer<List<Object>> consumer) {
		IEvaluationResult evaluationResult = this.interpreter.evaluateExpression(this.variableManager.getVariables(), expression);
		if (evaluationResult.success()) {
			Object value = evaluationResult.getValue();
			if (value instanceof Iterable<?> && consumer != null) {
				List<Object> iterators = new ArrayList<Object>();
				for (Object iterator : (Iterable<?>) value) {
					iterators.add(iterator);
				}
				consumer.apply(iterators);
			} else if (!(value instanceof Iterable<?>)) {
				String message = MessageFormat.format(Messages.AbstractEEFWidgetController_InvalidValueForExpression, expression,
						Iterable.class.getName(), value);
				EEFCorePlugin.getPlugin().error(message);
			}
		} else {
			EEFCorePlugin.getPlugin().diagnostic(expression, evaluationResult.getDiagnostic());
		}
	}
}
