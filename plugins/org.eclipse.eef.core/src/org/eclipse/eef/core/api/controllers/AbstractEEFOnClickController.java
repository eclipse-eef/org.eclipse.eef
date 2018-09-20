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

import org.eclipse.eef.core.api.EEFExpressionUtils;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.utils.EvalFactory;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;

/**
 * This class is used to provide utilities to on click controller.
 *
 * @author mbats
 */
public abstract class AbstractEEFOnClickController extends AbstractEEFWidgetController implements IEEFOnClickController {

	/**
	 * The constructor.
	 *
	 * @param variableManager
	 *            The variable manager
	 * @param interpreter
	 *            The interpreter
	 * @param editingContextAdapter
	 *            The editing context adapter
	 */
	public AbstractEEFOnClickController(IVariableManager variableManager, IInterpreter interpreter, EditingContextAdapter editingContextAdapter) {
		super(variableManager, interpreter, editingContextAdapter);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.controllers.IEEFOnClickController#onClick(java.lang.Object, java.lang.String)
	 */
	@Override
	public void onClick(Object element, String onClickEventKind) {
		this.editingContextAdapter.performModelChange(() -> {
			String expression = this.getOnClickExpression();

			Map<String, Object> variables = new HashMap<String, Object>();
			variables.putAll(this.variableManager.getVariables());
			variables.put(EEFExpressionUtils.EEFList.SELECTION, element);
			variables.put(EEFExpressionUtils.EEFList.ON_CLICK_EVENT_KIND, onClickEventKind);

			EvalFactory.of(this.interpreter, variables).call(expression);
		});
	}

	/**
	 * Returns the on click expression.
	 *
	 * @return The on click expression
	 */
	protected abstract String getOnClickExpression();
}
