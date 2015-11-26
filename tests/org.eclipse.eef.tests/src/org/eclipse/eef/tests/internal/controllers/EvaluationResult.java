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
package org.eclipse.eef.tests.internal.controllers;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.sirius.common.interpreter.api.IEvaluationResult;

/**
 * The evaluation result.
 *
 * @author sbegaudeau
 */
public class EvaluationResult implements IEvaluationResult {

	/**
	 * The value.
	 */
	private Object value;

	/**
	 * The diagnostic.
	 */
	private Diagnostic diagnostic;

	/**
	 * The constructor.
	 *
	 * @param value
	 *            The value
	 */
	public EvaluationResult(Object value) {
		this(value, Diagnostic.OK_INSTANCE);
	}

	/**
	 * The constructor.
	 *
	 * @param value
	 *            The value
	 * @param diagnostic
	 *            The diagnostic
	 */
	public EvaluationResult(Object value, Diagnostic diagnostic) {
		this.value = value;
		this.diagnostic = diagnostic;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.sirius.common.interpreter.api.IEvaluationResult#getValue()
	 */
	@Override
	public Object getValue() {
		return this.value;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.sirius.common.interpreter.api.IEvaluationResult#getDiagnostic()
	 */
	@Override
	public Diagnostic getDiagnostic() {
		return this.diagnostic;
	}

}
