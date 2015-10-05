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
package org.eclipse.eef.interpreter.aql.internal;

import org.eclipse.eef.interpreter.api.IEvaluationResult;
import org.eclipse.emf.common.util.Diagnostic;

/**
 * An implementation of the {@link IEvaluationResult}.
 *
 * @author sbegaudeau
 */
public class AQLEvaluationResult implements IEvaluationResult {

	/**
	 * The value returned by the evaluation.
	 */
	private Object value;

	/**
	 * The diagnostic of the evaluation.
	 */
	private Diagnostic diagnostic;

	/**
	 * The constructor.
	 *
	 * @param value
	 *            The value returned by the evaluation
	 * @param diagnostic
	 *            The diagnostic of the evaluation
	 */
	public AQLEvaluationResult(Object value, Diagnostic diagnostic) {
		this.value = value;
		this.diagnostic = diagnostic;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.interpreter.api.IEvaluationResult#getValue()
	 */
	@Override
	public Object getValue() {
		return this.value;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.interpreter.api.IEvaluationResult#getDiagnostic()
	 */
	@Override
	public Diagnostic getDiagnostic() {
		return this.diagnostic;
	}

}
