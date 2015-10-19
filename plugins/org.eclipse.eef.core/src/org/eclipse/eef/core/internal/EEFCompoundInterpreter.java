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
package org.eclipse.eef.core.internal;

import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;

import java.util.List;
import java.util.Map;

import org.eclipse.eef.interpreter.api.IEvaluationResult;
import org.eclipse.eef.interpreter.api.IInterpreter;
import org.eclipse.eef.interpreter.api.IInterpreterProvider;
import org.eclipse.eef.interpreter.api.IValidationResult;
import org.eclipse.sirius.expression.ExpressionDescription;

/**
 * Utility class encapsulating all the available interpreters.
 *
 * @author sbegaudeau
 */
public class EEFCompoundInterpreter implements IInterpreter {
	/**
	 * The interpreter providers.
	 */
	private List<IInterpreterProvider> interpreterProviders;

	/**
	 * The constructor.
	 *
	 * @param interpreterProviders
	 *            The interpreter providers.
	 */
	public EEFCompoundInterpreter(List<IInterpreterProvider> interpreterProviders) {
		this.interpreterProviders = interpreterProviders;
	}

	/**
	 * Returns the interpreter to use to evaluate the given expression body.
	 *
	 * @param expressionBody
	 *            The body of the expression
	 * @return The {@link IInterpreter} found or <code>null</code> if no interpreter has been found for the evaluation
	 */
	private IInterpreter getInterpreterForExpression(final String expressionBody) {
		Predicate<IInterpreterProvider> canHandleExpressionPredicate = new Predicate<IInterpreterProvider>() {
			@Override
			public boolean apply(IInterpreterProvider interpreterProvider) {
				return interpreterProvider.canHandle(expressionBody);
			}
		};
		Optional<IInterpreterProvider> interpreterProvider = Iterables.tryFind(this.interpreterProviders, canHandleExpressionPredicate);
		if (interpreterProvider.isPresent()) {
			IInterpreterProvider provider = interpreterProvider.get();
			return provider.createInterpreter();
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.interpreter.api.IInterpreter#evaluateExpression(java.util.Map,
	 *      org.eclipse.sirius.expression.ExpressionDescription, java.lang.String)
	 */
	@Override
	public IEvaluationResult evaluateExpression(Map<String, Object> variables, ExpressionDescription expressionDescription, String expressionBody) {
		IInterpreter interpreter = this.getInterpreterForExpression(expressionBody);
		if (interpreter != null) {
			return interpreter.evaluateExpression(variables, expressionDescription, expressionBody);
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.interpreter.api.IInterpreter#validateExpression(org.eclipse.sirius.expression.ExpressionDescription,
	 *      java.lang.String)
	 */
	@Override
	public IValidationResult validateExpression(ExpressionDescription expressionDescription, String expressionBody) {
		IInterpreter interpreter = this.getInterpreterForExpression(expressionBody);
		if (interpreter != null) {
			return interpreter.validateExpression(expressionDescription, expressionBody);
		}
		return null;
	}

}
