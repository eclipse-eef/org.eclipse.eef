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

import org.eclipse.eef.core.api.utils.Eval;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;

/**
 * Superclass of all the controllers containing some utility methods.
 *
 * @author sbegaudeau
 */
public abstract class AbstractEEFController {
	/**
	 * The interpreter.
	 */
	protected IInterpreter interpreter;

	/**
	 * The variable manager.
	 */
	protected IVariableManager variableManager;

	/**
	 * The constructor.
	 *
	 * @param variableManager
	 *            The variable manager
	 * @param interpreter
	 *            The interpreter
	 */
	public AbstractEEFController(IVariableManager variableManager, IInterpreter interpreter) {
		this.variableManager = variableManager;
		this.interpreter = interpreter;
	}

	/**
	 * Returns a new {@link Eval} instance initialized with the {@link IInterpreter} and the {@link IVariableManager}.
	 *
	 * @return a new Eval.
	 */
	protected Eval newEval() {
		return new Eval(this.interpreter, this.variableManager);
	}
}
