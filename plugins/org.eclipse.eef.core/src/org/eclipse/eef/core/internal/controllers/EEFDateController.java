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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.eef.EEFDateDescription;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.EefPackage;
import org.eclipse.eef.core.api.EEFExpressionUtils;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.controllers.AbstractEEFWidgetController;
import org.eclipse.eef.core.api.controllers.IConsumer;
import org.eclipse.eef.core.api.controllers.IEEFDateController;
import org.eclipse.eef.core.api.utils.EvalFactory;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;

/**
 * This class will be used in order to manage the behavior of the date.
 *
 * @author arichard
 */
public class EEFDateController extends AbstractEEFWidgetController implements IEEFDateController {
	/**
	 * The description.
	 */
	private EEFDateDescription description;

	/**
	 * The editing context adapter.
	 */
	private EditingContextAdapter contextAdapter;

	/**
	 * The consumer of a new value of the date.
	 */
	private IConsumer<Date> newValueConsumer;

	/**
	 * The constructor.
	 *
	 * @param description
	 *            The description
	 * @param variableManager
	 *            The variable manager
	 * @param interpreter
	 *            The interpreter
	 * @param contextAdapter
	 *            The editing context adapter
	 */
	public EEFDateController(EEFDateDescription description, IVariableManager variableManager, IInterpreter interpreter,
			EditingContextAdapter contextAdapter) {
		super(variableManager, interpreter);
		this.description = description;
		this.contextAdapter = contextAdapter;
	}

	@Override
	public void onNewValue(IConsumer<Date> consumer) {
		this.newValueConsumer = consumer;
	}

	@Override
	public void removeNewValueConsumer() {
		this.newValueConsumer = null;
	}

	@Override
	protected EEFWidgetDescription getDescription() {
		return this.description;
	}

	@Override
	public void refresh() {
		super.refresh();

		String valueExpression = this.description.getValueExpression();
		this.newEval().logIfInvalidType(Date.class).call(valueExpression, this.newValueConsumer);
	}

	@Override
	public IStatus updateValue(final Date date) {
		return contextAdapter.performModelChange(new Runnable() {
			@Override
			public void run() {
				String editExpression = EEFDateController.this.description.getEditExpression();
				EAttribute eAttribute = EefPackage.Literals.EEF_TEXT_DESCRIPTION__EDIT_EXPRESSION;

				Map<String, Object> variables = new HashMap<String, Object>();
				variables.putAll(EEFDateController.this.variableManager.getVariables());
				variables.put(EEFExpressionUtils.EEFDate.NEW_VALUE, date);

				EvalFactory.of(EEFDateController.this.interpreter, variables).logIfBlank(eAttribute).call(editExpression);
			}
		});
	}
}
