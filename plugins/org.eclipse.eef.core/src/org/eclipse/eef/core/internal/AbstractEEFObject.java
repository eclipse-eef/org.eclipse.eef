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

import org.eclipse.eef.core.api.EEFObject;
import org.eclipse.eef.core.api.IVariableManager;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;

/**
 * The basic implementation of the {@link EEFObject}.
 *
 * @author sbegaudeau
 */
public abstract class AbstractEEFObject implements EEFObject {

	/**
	 * The variable manager.
	 */
	private IVariableManager variableManager;

	/**
	 * The interpreter.
	 */
	private IInterpreter interpreter;

	/**
	 * The constructor.
	 *
	 * @param variableManager
	 *            The variable manager
	 * @param interpreter
	 *            The interpreter
	 */
	public AbstractEEFObject(IVariableManager variableManager, IInterpreter interpreter) {
		this.variableManager = variableManager;
		this.interpreter = interpreter;
	}

	/**
	 * Return the variableManager.
	 *
	 * @return the variableManager
	 */
	protected IVariableManager getVariableManager() {
		return this.variableManager;
	}

	/**
	 * Return the interpreter.
	 *
	 * @return the interpreter
	 */
	protected IInterpreter getInterpreter() {
		return this.interpreter;
	}

}
