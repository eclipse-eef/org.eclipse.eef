/*******************************************************************************
 * Copyright (c) 2016, 2018 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors: Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.eef.tests.internal.core;

import java.util.Map;

import org.eclipse.eef.core.api.utils.EvalFactory;
import org.eclipse.sirius.common.interpreter.api.EvaluationResult;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.sirius.common.interpreter.api.VariableManagerFactory;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

/**
 * Tests of the {@link EvalFactory} utility class.
 *
 * @author sbegaudeau
 */
@SuppressWarnings({ "checkstyle:javadocmethod" })
public class EvalTests {

	/**
	 * The first AQL based expression used for the test.
	 */
	private static final String FIRST_EXPRESSION = "aql:self.name"; //$NON-NLS-1$

	/**
	 * The result of the first AQL based expression.
	 */
	private static final String FIRST_RESULT = "John Doe"; //$NON-NLS-1$

	/**
	 * The second AQL based expression used for the test.
	 */
	private static final String SECOND_EXPRESSION = "aql:self.abstract"; //$NON-NLS-1$

	/**
	 * The result of the second AQL based expression.
	 */
	private static final boolean SECOND_RESULT = true;

	@Test
	public void testGetResult() {
		IInterpreter interpreter = (Map<String, Object> variables, String expressionBody) -> {
			if (FIRST_EXPRESSION.equals(expressionBody)) {
				return EvaluationResult.of(FIRST_RESULT);
			}
			return EvaluationResult.of(Boolean.valueOf(SECOND_RESULT));
		};

		IVariableManager variableManager = new VariableManagerFactory().createVariableManager();
		Object result = EvalFactory.of(interpreter, variableManager).evaluate(FIRST_EXPRESSION);
		assertThat(result, is(FIRST_RESULT));
	}

	@Test
	public void testGetDefaultValue() {
		IInterpreter interpreter = (Map<String, Object> variables, String expressionBody) -> {
			return EvaluationResult.of(null);
		};
		IVariableManager variableManager = new VariableManagerFactory().createVariableManager();

		assertThat(EvalFactory.of(interpreter, variableManager).evaluate(FIRST_EXPRESSION), nullValue());

		Object result = EvalFactory.of(interpreter, variableManager).defaultValue(FIRST_RESULT).evaluate(FIRST_EXPRESSION);
		assertThat(result, is(FIRST_RESULT));
	}

	@Test
	public void testGetCastValue() {
		IInterpreter interpreter = (Map<String, Object> variables, String expressionBody) -> {
			if (FIRST_EXPRESSION.equals(expressionBody)) {
				return EvaluationResult.of(FIRST_RESULT);
			}
			return EvaluationResult.of(Boolean.valueOf(SECOND_RESULT));
		};

		IVariableManager variableManager = new VariableManagerFactory().createVariableManager();

		String stringResult = EvalFactory.of(interpreter, variableManager).logIfInvalidType(String.class).evaluate(FIRST_EXPRESSION);
		assertThat(stringResult, is(FIRST_RESULT));

		Boolean booleanResult = EvalFactory.of(interpreter, variableManager).logIfInvalidType(Boolean.class).evaluate(SECOND_EXPRESSION);
		assertThat(booleanResult, is(SECOND_RESULT));
	}
}
