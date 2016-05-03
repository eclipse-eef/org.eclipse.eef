/*******************************************************************************
 * Copyright (c) 2015, 2016 Obeo.
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

import org.eclipse.eef.EEFReferenceDescription;
import org.eclipse.eef.EEFWidgetAction;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.EefPackage;
import org.eclipse.eef.core.api.EEFExpressionUtils;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.controllers.AbstractEEFWidgetController;
import org.eclipse.eef.core.api.controllers.IConsumer;
import org.eclipse.eef.core.api.controllers.IEEFReferenceController;
import org.eclipse.eef.core.api.utils.Eval;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;

/**
 * This class will be used in order to manage the behavior of the reference widget.
 *
 * @author mbats
 */
public class EEFReferenceController extends AbstractEEFWidgetController implements IEEFReferenceController {
	/**
	 * The description.
	 */
	private EEFReferenceDescription description;

	/**
	 * The editing context adapter.
	 */
	private EditingContextAdapter contextAdapter;

	/**
	 * The consumer of a new value of the reference.
	 */
	private IConsumer<Object> newValueConsumer;

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
	public EEFReferenceController(IVariableManager variableManager, IInterpreter interpreter, EEFReferenceDescription description,
			EditingContextAdapter contextAdapter) {
		super(variableManager, interpreter);
		this.description = description;
		this.contextAdapter = contextAdapter;
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
		this.newEval().call(valueExpression, this.newValueConsumer);
	}

	@Override
	public void onNewValue(IConsumer<Object> consumer) {
		this.newValueConsumer = consumer;
	}

	@Override
	public void removeNewValueConsumer() {
		this.newValueConsumer = null;
	}

	@Override
	public void onClick(final Object element) {
		contextAdapter.performModelChange(new Runnable() {
			@Override
			public void run() {
				String expression = EEFReferenceController.this.description.getOnClickExpression();
				EAttribute attr = EefPackage.Literals.EEF_REFERENCE_DESCRIPTION__ON_CLICK_EXPRESSION;

				Map<String, Object> variables = new HashMap<String, Object>();
				variables.putAll(EEFReferenceController.this.variableManager.getVariables());
				variables.put(EEFExpressionUtils.EEFReference.SELECTION, element);

				Eval.of(EEFReferenceController.this.interpreter, variables).logIfBlank(attr).call(expression);
			}
		});
	}

	@Override
	protected EEFWidgetDescription getDescription() {
		return this.description;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @param action
	 *
	 * @see org.eclipse.eef.core.api.controllers.IEEFReferenceController#action()
	 */
	@Override
	public void action(EEFWidgetAction action, List<Object> elements) {
		String expression = action.getActionExpression();
		EAttribute eAttribute = EefPackage.Literals.EEF_WIDGET_ACTION__ACTION_EXPRESSION;

		Map<String, Object> variables = new HashMap<String, Object>();
		variables.putAll(EEFReferenceController.this.variableManager.getVariables());
		variables.put(EEFExpressionUtils.EEFReference.SELECTION, elements);

		Eval.of(EEFReferenceController.this.interpreter, variables).logIfBlank(eAttribute).call(expression);
	}
}
