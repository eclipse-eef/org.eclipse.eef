/*******************************************************************************
 * Copyright (c) 2015, 2017 Obeo.
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
import java.util.Optional;
import java.util.function.Consumer;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.eef.EEFLabelDescription;
import org.eclipse.eef.EEFWidgetAction;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.EefPackage;
import org.eclipse.eef.common.api.utils.Util;
import org.eclipse.eef.core.api.EEFExpressionUtils;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.controllers.AbstractEEFWidgetController;
import org.eclipse.eef.core.api.controllers.IEEFLabelController;
import org.eclipse.eef.core.api.utils.EvalFactory;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;

/**
 * This class will be used in order to manage the behavior of the label.
 *
 * @author mbats
 */
public class EEFLabelController extends AbstractEEFWidgetController implements IEEFLabelController {
	/**
	 * The description.
	 */
	private final EEFLabelDescription description;

	/**
	 * The consumer of the new body.
	 */
	private Consumer<String> newValueConsumer;

	/**
	 * The constructor.
	 *
	 * @param description
	 *            The description
	 * @param variableManager
	 *            The variable manager
	 * @param interpreter
	 *            The interpreter
	 * @param editingContextAdapter
	 *            The editing context adapter
	 */
	public EEFLabelController(EEFLabelDescription description, IVariableManager variableManager, IInterpreter interpreter,
			EditingContextAdapter editingContextAdapter) {
		super(variableManager, interpreter, editingContextAdapter);
		this.description = description;
	}

	/**
	 *
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.controllers.AbstractEEFWidgetController#refresh()
	 */
	@Override
	public void refresh() {
		super.refresh();

		String valueExpression = this.description.getValueExpression();
		Object valueExpressionResult = this.newEval().evaluate(valueExpression);

		String displayExpression = this.description.getDisplayExpression();
		Optional.ofNullable(this.newValueConsumer).ifPresent(consumer -> {
			if (!Util.isBlank(displayExpression)) {
				Map<String, Object> variables = new HashMap<String, Object>();
				variables.putAll(this.variableManager.getVariables());
				variables.put(EEFExpressionUtils.EEFReference.VALUE, valueExpressionResult);
				EvalFactory.of(this.interpreter, variables).logIfInvalidType(String.class).call(displayExpression, consumer);
			} else if (valueExpressionResult != null) {
				newValueConsumer.accept(valueExpressionResult.toString());
			}
		});
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

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.controllers.IEEFLabelController#onNewValue(org.eclipse.eef.core.api.controllers.IConsumer)
	 */
	@Override
	public void onNewValue(Consumer<String> consumer) {
		this.newValueConsumer = consumer;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.controllers.IEEFLabelController#removeNewValueConsumer()
	 */
	@Override
	public void removeNewValueConsumer() {
		this.newValueConsumer = null;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.controllers.IEEFLabelController#action(EEFWidgetAction)
	 */
	@Override
	public IStatus action(final EEFWidgetAction action) {
		return this.editingContextAdapter.performModelChange(() -> {
			String expression = action.getActionExpression();
			EAttribute eAttribute = EefPackage.Literals.EEF_WIDGET_ACTION__ACTION_EXPRESSION;

			Map<String, Object> variables = new HashMap<String, Object>();
			variables.putAll(this.variableManager.getVariables());

			EvalFactory.of(this.interpreter, variables).logIfBlank(eAttribute).call(expression);
		});
	}

}
