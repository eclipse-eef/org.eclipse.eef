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

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.eef.EEFSpinnerDescription;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.EefPackage;
import org.eclipse.eef.core.api.EEFExpressionUtils;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.controllers.AbstractEEFWidgetController;
import org.eclipse.eef.core.api.controllers.IEEFSpinnerController;
import org.eclipse.eef.core.api.utils.EvalFactory;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;

/**
 * This class will be used in order to manage the behavior of the spinner.
 *
 * @author arichard
 */
public class EEFSpinnerController extends AbstractEEFWidgetController implements IEEFSpinnerController {
	/**
	 * The description.
	 */
	private EEFSpinnerDescription description;

	/**
	 * The editing context adapter.
	 */
	private EditingContextAdapter contextAdapter;

	/**
	 * The consumer of a new value of the spinner's label.
	 */
	private Consumer<Object> newSpinnerValueConsumer;

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
	public EEFSpinnerController(EEFSpinnerDescription description, IVariableManager variableManager, IInterpreter interpreter,
			EditingContextAdapter contextAdapter) {
		super(variableManager, interpreter, contextAdapter);
		this.description = description;
		this.contextAdapter = contextAdapter;
	}

	@Override
	public void onNewSpinnerValue(Consumer<Object> consumer) {
		this.newSpinnerValueConsumer = consumer;
	}

	@Override
	public void removeNewSpinnerValueConsumer() {
		this.newSpinnerValueConsumer = null;
	}

	@Override
	protected EEFWidgetDescription getDescription() {
		return this.description;
	}

	@Override
	public void refresh() {
		super.refresh();

		String valueExpression = this.description.getValueExpression();
		this.newEval().call(valueExpression, this.newSpinnerValueConsumer);
	}

	@Override
	public IStatus updateValue(final String text) {
		return contextAdapter.performModelChange(new Runnable() {
			@Override
			public void run() {
				String expression = EEFSpinnerController.this.description.getEditExpression();
				EAttribute eAttribute = EefPackage.Literals.EEF_SPINNER_DESCRIPTION__EDIT_EXPRESSION;

				Map<String, Object> variables = new HashMap<String, Object>();
				variables.putAll(EEFSpinnerController.this.variableManager.getVariables());
				variables.put(EEFExpressionUtils.EEFSpinner.NEW_VALUE, text);

				EvalFactory.of(EEFSpinnerController.this.interpreter, variables).logIfBlank(eAttribute).call(expression);
			}
		});
	}
}
