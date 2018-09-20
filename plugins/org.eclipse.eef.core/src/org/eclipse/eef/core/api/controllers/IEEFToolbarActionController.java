/*******************************************************************************
 * Copyright (c) 2017, 2018 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors: Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.eef.core.api.controllers;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.eef.EEFToolbarAction;
import org.eclipse.eef.EefPackage;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.utils.EvalFactory;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;

/**
 * The EEFToolbarActionController is responsible of supporting the execution of the action.
 *
 * @author arichard
 *
 */
public interface IEEFToolbarActionController {

	/**
	 * Invoked when the user clicks on an action button.
	 *
	 * @param action
	 *            Toolbar action
	 * @param editingContextAdapter
	 *            The editing context adapter
	 * @param interpreter
	 *            The interpreter
	 * @param variableManager
	 *            The variable manager
	 * @return the status of the action execution
	 */
	default IStatus action(EEFToolbarAction action, EditingContextAdapter editingContextAdapter, IInterpreter interpreter,
			IVariableManager variableManager) {
		return editingContextAdapter.performModelChange(() -> {
			String actionExpression = action.getActionExpression();
			EAttribute eAttribute = EefPackage.Literals.EEF_TOOLBAR_ACTION__ACTION_EXPRESSION;

			Map<String, Object> variables = new HashMap<String, Object>();
			variables.putAll(variableManager.getVariables());
			EvalFactory.of(interpreter, variableManager).logIfBlank(eAttribute).call(actionExpression);
		});
	}
}