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
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.eef.EEFListDescription;
import org.eclipse.eef.EEFWidgetAction;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.EefPackage;
import org.eclipse.eef.core.api.EEFExpressionUtils;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.controllers.AbstractEEFWidgetController;
import org.eclipse.eef.core.api.controllers.IEEFListController;
import org.eclipse.eef.core.api.utils.EvalFactory;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;

/**
 * This class will be used in order to manage the behavior of the list widget.
 *
 * @author sbegaudeau
 */
public class EEFListController extends AbstractEEFWidgetController implements IEEFListController {
	/**
	 * The description.
	 */
	private final EEFListDescription description;

	/**
	 * The consumer of a new value of the list.
	 */
	private Consumer<Object> newValueConsumer;

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
	public EEFListController(IVariableManager variableManager, IInterpreter interpreter, EEFListDescription description,
			EditingContextAdapter editingContextAdapter) {
		super(variableManager, interpreter, editingContextAdapter);
		this.description = description;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.internal.controllers.AbstractEEFCustomWidgetController#refresh()
	 */
	@Override
	public void refresh() {
		super.refresh();

		String valueExpression = this.description.getValueExpression();
		Optional.ofNullable(this.newValueConsumer).ifPresent(consumer -> {
			this.newEval().call(valueExpression, consumer);
		});
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.controllers.IEEFListController#onNewValue(org.eclipse.eef.core.api.controllers.IConsumer)
	 */
	@Override
	public void onNewValue(Consumer<Object> consumer) {
		this.newValueConsumer = consumer;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.controllers.IEEFListController#removeNewValueConsumer()
	 */
	@Override
	public void removeNewValueConsumer() {
		this.newValueConsumer = null;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.controllers.IEEFListController#onClick(java.lang.Object, java.lang.String)
	 */
	@Override
	public void onClick(final Object element, final String onClickEventKind) {
		this.editingContextAdapter.performModelChange(() -> {
			String expression = this.description.getOnClickExpression();

			Map<String, Object> variables = new HashMap<String, Object>();
			variables.putAll(this.variableManager.getVariables());
			variables.put(EEFExpressionUtils.EEFList.SELECTION, element);
			variables.put(EEFExpressionUtils.EEFList.ON_CLICK_EVENT_KIND, onClickEventKind);

			EvalFactory.of(this.interpreter, variables).call(expression);
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
	 * @see org.eclipse.eef.core.api.controllers.IEEFListController#action(org.eclipse.eef.EEFWidgetAction,
	 *      java.util.List)
	 */
	@Override
	public IStatus action(final EEFWidgetAction action, final List<Object> elements) {
		return this.editingContextAdapter.performModelChange(() -> {
			String expression = action.getActionExpression();
			EAttribute eAttribute = EefPackage.Literals.EEF_WIDGET_ACTION__ACTION_EXPRESSION;

			Map<String, Object> variables = new HashMap<String, Object>();
			variables.putAll(this.variableManager.getVariables());
			variables.put(EEFExpressionUtils.EEFList.SELECTION, elements);

			EvalFactory.of(this.interpreter, variables).logIfBlank(eAttribute).call(expression);
		});
	}
}
