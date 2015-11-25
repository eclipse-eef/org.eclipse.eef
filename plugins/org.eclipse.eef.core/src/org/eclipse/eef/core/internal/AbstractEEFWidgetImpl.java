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

import org.eclipse.eef.core.api.EEFWidget;
import org.eclipse.eef.core.api.IVariableManager;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;

/**
 * The implementation of the {@link EEFWidget}.
 *
 * @author sbegaudeau
 */
public abstract class AbstractEEFWidgetImpl extends AbstractEEFChildObject implements EEFWidget {

	/**
	 * The constructor.
	 *
	 * @param variableManager
	 *            The variable manager
	 * @param interpreter
	 *            The interpreter
	 */
	public AbstractEEFWidgetImpl(IVariableManager variableManager, IInterpreter interpreter) {
		super(variableManager, interpreter);
	}
}
