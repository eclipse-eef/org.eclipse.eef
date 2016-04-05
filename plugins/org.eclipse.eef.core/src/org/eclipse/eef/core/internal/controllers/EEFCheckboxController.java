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

import org.eclipse.eef.EEFCheckboxDescription;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.EefPackage;
import org.eclipse.eef.core.api.EEFExpressionUtils;
import org.eclipse.eef.core.api.EditionContextAdapter;
import org.eclipse.eef.core.api.controllers.AbstractEEFWidgetController;
import org.eclipse.eef.core.api.controllers.IConsumer;
import org.eclipse.eef.core.api.controllers.IEEFCheckboxController;
import org.eclipse.eef.core.api.utils.Eval;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;

/**
 * This class will be used in order to manage the behavior of the checkbox.
 *
 * @author mbats
 */
public class EEFCheckboxController extends AbstractEEFWidgetController implements IEEFCheckboxController {
	/**
	 * The description.
	 */
	private EEFCheckboxDescription description;

	/**
	 * The editing context adapter.
	 */
	private EditionContextAdapter eca;

	/**
	 * The consumer of a new value of the checkbox.
	 */
	private IConsumer<Boolean> newValueConsumer;

	/**
	 * The constructor.
	 *
	 * @param description
	 *            The description
	 * @param variableManager
	 *            The variable manager
	 * @param interpreter
	 *            The interpreter
	 * @param eca
	 *            The editing context adapter
	 */
	public EEFCheckboxController(EEFCheckboxDescription description, IVariableManager variableManager, IInterpreter interpreter,
			EditionContextAdapter eca) {
		super(variableManager, interpreter);
		this.description = description;
		this.eca = eca;
	}

	@Override
	public void updateValue(final boolean checkbox) {
		eca.performModelChange(new Runnable() {
			@Override
			public void run() {
				String editExpression = EEFCheckboxController.this.description.getEditExpression();
				EAttribute eAttribute = EefPackage.Literals.EEF_CHECKBOX_DESCRIPTION__EDIT_EXPRESSION;

				Map<String, Object> variables = new HashMap<String, Object>();
				variables.putAll(EEFCheckboxController.this.variableManager.getVariables());
				variables.put(EEFExpressionUtils.EEFCheckbox.NEW_VALUE, checkbox);

				new Eval(EEFCheckboxController.this.interpreter, variables).call(eAttribute, editExpression);
			}
		});
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.controllers.AbstractEEFWidgetController#refresh()
	 */
	@Override
	public void refresh() {
		super.refresh();

		String valueExpression = this.description.getValueExpression();
		EAttribute eAttribute = EefPackage.Literals.EEF_CHECKBOX_DESCRIPTION__VALUE_EXPRESSION;

		this.newEval().call(eAttribute, valueExpression, Boolean.class, EEFCheckboxController.this.newValueConsumer);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.controllers.IEEFTextController#onNewValue(org.eclipse.eef.core.api.controllers.IConsumer)
	 */
	@Override
	public void onNewValue(IConsumer<Boolean> consumer) {
		this.newValueConsumer = consumer;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.controllers.IEEFTextController#removeNewValueConsumer()
	 */
	@Override
	public void removeNewValueConsumer() {
		this.newValueConsumer = null;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.controllers.AbstractEEFWidgetController#getDescription()
	 */
	@Override
	protected EEFWidgetDescription getDescription() {
		return this.description;
	}

}
