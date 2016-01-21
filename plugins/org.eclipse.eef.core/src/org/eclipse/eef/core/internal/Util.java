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
package org.eclipse.eef.core.internal;

import org.eclipse.sirius.common.interpreter.api.IEvaluationResult;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;

/**
 * Shared utility methods.
 *
 * @author Pierre-Charles David <pierre-charles.david@obeo.fr>
 */
public final class Util {
	/**
	 * Prevent instantiation.
	 */
	private Util() {
		// Prevent instantiation.
	}

	/**
	 * Helper to evaluate a SemanticCandidateExpression.
	 *
	 * @param itp
	 *            the interpreter to use.
	 * @param context
	 *            the evaluation context (variables).
	 * @param expression
	 *            the expression to evaluate.
	 * @return the result, or <code>null</code> if the evaluation failed.
	 */
	public static Object computeCandidate(IInterpreter itp, IVariableManager context, String expression) {
		if (!isBlank(expression)) {
			IEvaluationResult evaluationResult = itp.evaluateExpression(context.getVariables(), expression);
			if (evaluationResult.success()) {
				return evaluationResult.getValue();
			}
		}
		return null;
	}

	/**
	 * Returns the first of a series of alternative string values which is not {@link Util#blank blank}.
	 *
	 * @param alternatives
	 *            the alernative strings, in order of preference.
	 * @return the first non-blank alternative, or <code>null</code> if they are all blank.
	 */
	public static String firstNonBlank(String... alternatives) {
		for (String s : alternatives) {
			if (!isBlank(s)) {
				return s;
			}
		}
		return null;
	}

	/**
	 * Tests if a string is blank (i.e. null, empty, or containing only whitespace).
	 *
	 * @param s
	 *            the string to test.
	 * @return <code>true</code> if and only if the string is blank.
	 */
	public static boolean isBlank(String s) {
		return s == null || s.trim().length() == 0;
	}

}
