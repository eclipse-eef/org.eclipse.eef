/*******************************************************************************
 * Copyright (c) 2016, 2017 Obeo.
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
import java.util.function.Consumer;

import org.eclipse.eef.common.api.utils.Util;
import org.eclipse.eef.core.internal.EEFCorePlugin;
import org.eclipse.eef.core.internal.Messages;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.sirius.common.interpreter.api.IEvaluationResult;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;

/**
 * Utility class used to create the {@link Eval}.
 *
 * @author sbegaudeau
 */
public final class EvalFactory {

	/**
	 * The constructor.
	 */
	private EvalFactory() {
		// Prevent the instantiation
	}

	/**
	 * Creates a new {@link Eval} with the given interpreter and variables.
	 *
	 * @param interpreter
	 *            The interpreter
	 * @param variables
	 *            The variables
	 * @return The new {@link Eval} builder
	 */
	public static Eval<Object> of(IInterpreter interpreter, Map<String, Object> variables) {
		return new Eval<Object>(interpreter, variables, Object.class);
	}

	/**
	 * Creates a new {@link Eval} with the given interpreter and variable manager.
	 *
	 * @param interpreter
	 *            The interpreter
	 * @param variableManager
	 *            The variable manager
	 * @return The new {@link Eval}
	 */
	public static Eval<Object> of(IInterpreter interpreter, IVariableManager variableManager) {
		return new Eval<Object>(interpreter, variableManager, Object.class);
	}

	/**
	 * This class will be used to evaluate the expression.
	 *
	 * @author sbegaudeau
	 *
	 * @param <TYPE>
	 *            The type of the result returned by the execution of the expression
	 */
	public static final class Eval<TYPE> {
		/**
		 * The interpreter.
		 */
		private IInterpreter interpreter;

		/**
		 * The variables.
		 */
		private Map<String, Object> variables = new HashMap<String, Object>();

		/**
		 * The EAttribute containing the expression. It will be used, if not null, to log an error if the expression is
		 * blank.
		 */
		private EAttribute eAttribute;

		/**
		 * The value to use by default if the evaluation of the expression returns null.
		 */
		private TYPE defaultValue;

		/**
		 * The expected type of the result.
		 */
		private Class<TYPE> type;

		/**
		 * The constructor.
		 *
		 * @param interpreter
		 *            The interpreter
		 * @param variables
		 *            The variables
		 * @param type
		 *            The expected type of the result
		 */
		private Eval(IInterpreter interpreter, Map<String, Object> variables, Class<TYPE> type) {
			this.interpreter = interpreter;
			this.variables.putAll(variables);
			this.type = type;
		}

		/**
		 * The constructor.
		 *
		 * @param interpreter
		 *            The interpreter
		 * @param variableManager
		 *            The variable manager
		 * @param type
		 *            The expected type of the result
		 */
		private Eval(IInterpreter interpreter, IVariableManager variableManager, Class<TYPE> type) {
			this(interpreter, variableManager.getVariables(), type);
		}

		/**
		 * Indicates that an error should be logged using the given EAttribute if the expression to execute is blank.
		 *
		 * @param attribute
		 *            The EAttribute containing the expression to execute
		 * @return The current {@link Eval}
		 */
		public Eval<TYPE> logIfBlank(EAttribute attribute) {
			this.eAttribute = attribute;
			return this;
		}

		/**
		 * Indicates that the result should have the same type as the given class. It will log an error if the type of
		 * the result does not match the given type.
		 *
		 * @param expectedType
		 *            The expected type
		 * @param <E>
		 *            The expected type of the execution of the expression
		 * @return The current {@link Eval}
		 *
		 */
		public <E> Eval<E> logIfInvalidType(Class<E> expectedType) {
			E value = null;
			if (expectedType.isInstance(this.defaultValue)) {
				value = expectedType.cast(this.defaultValue);
			}
			return new Eval<E>(this.interpreter, this.variables, expectedType).logIfBlank(this.eAttribute).defaultValue(value);
		}

		/**
		 * Indicates the value to use by default if the result of the evaluation of the expression is null.
		 *
		 * @param value
		 *            The default value
		 * @return The current {@link Eval}
		 */
		public Eval<TYPE> defaultValue(TYPE value) {
			this.defaultValue = value;
			return this;
		}

		/**
		 * Executes the given expression and process its result using the given consumer.
		 *
		 * @param expression
		 *            The expression
		 */
		public void call(String expression) {
			this.call(expression, null);
		}

		/**
		 * Executes the given expression and process its result using the given consumer.
		 *
		 * @param expression
		 *            The expression
		 * @param consumer
		 *            The consumer
		 */
		public void call(String expression, Consumer<TYPE> consumer) {
			if (Util.isBlank(expression)) {
				if (this.eAttribute != null && EEFCorePlugin.getPlugin() != null) {
					EEFCorePlugin.getPlugin().blank(this.eAttribute);
				}

				if (this.defaultValue != null && consumer != null) {
					consumer.accept(this.defaultValue);
				}
				return;
			}

			IEvaluationResult evaluationResult = this.interpreter.evaluateExpression(this.variables, expression);
			if (evaluationResult.success()) {
				if (consumer != null) {
					TYPE returnValue = this.defaultValue;
					Object value = evaluationResult.getValue();
					if (value != null && this.type.isInstance(value)) {
						returnValue = this.type.cast(value);
					} else if (value != null && EEFCorePlugin.getPlugin() != null) {
						String message = MessageFormat.format(Messages.AbstractEEFWidgetController_InvalidValueForExpression, expression,
								this.type.getName(), value);
						EEFCorePlugin.getPlugin().error(message);
					}
					consumer.accept(returnValue);
				}
			} else if (EEFCorePlugin.getPlugin() != null) {
				EEFCorePlugin.getPlugin().diagnostic(expression, evaluationResult.getDiagnostic());
			}
		}

		/**
		 * Executes the given expression.
		 *
		 * @param expression
		 *            The expression
		 * @return The result of the expression
		 */
		public TYPE evaluate(String expression) {
			if (Util.isBlank(expression)) {
				if (this.eAttribute != null && EEFCorePlugin.getPlugin() != null) {
					EEFCorePlugin.getPlugin().blank(this.eAttribute);
				}

				return this.defaultValue;
			}

			TYPE result = this.defaultValue;
			IEvaluationResult evaluationResult = this.interpreter.evaluateExpression(this.variables, expression);
			if (evaluationResult.success()) {
				Object value = evaluationResult.getValue();
				if (value != null && this.type.isInstance(value)) {
					TYPE castValue = this.type.cast(value);
					result = castValue;
				} else if (value != null && EEFCorePlugin.getPlugin() != null) {
					String message = MessageFormat.format(Messages.AbstractEEFWidgetController_InvalidValueForExpression, expression,
							this.type.getName(), value);
					EEFCorePlugin.getPlugin().error(message);
				}
			} else if (EEFCorePlugin.getPlugin() != null) {
				EEFCorePlugin.getPlugin().diagnostic(expression, evaluationResult.getDiagnostic());
			}
			return result;
		}
	}
}
