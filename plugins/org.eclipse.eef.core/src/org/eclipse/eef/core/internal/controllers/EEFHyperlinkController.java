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

import org.eclipse.eef.EEFHyperlinkDescription;
import org.eclipse.eef.EEFWidgetAction;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.EefPackage;
import org.eclipse.eef.common.api.utils.Util;
import org.eclipse.eef.core.api.EEFExpressionUtils;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.controllers.AbstractEEFWidgetController;
import org.eclipse.eef.core.api.controllers.IConsumer;
import org.eclipse.eef.core.api.controllers.IEEFHyperlinkController;
import org.eclipse.eef.core.api.utils.EvalFactory;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;

/**
 * This class will be used in order to manage the behavior of the hyperlink.
 *
 * @author mbats
 */
public class EEFHyperlinkController extends AbstractEEFWidgetController implements IEEFHyperlinkController {
	/**
	 * The description.
	 */
	private EEFHyperlinkDescription description;

	/**
	 * The editing context adapter.
	 */
	private EditingContextAdapter contextAdapter;

	/**
	 * The consumer of a new value of the text.
	 */
	private IConsumer<String> newValueConsumer;

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
	public EEFHyperlinkController(EEFHyperlinkDescription description, IVariableManager variableManager, IInterpreter interpreter,
			EditingContextAdapter contextAdapter) {
		super(variableManager, interpreter);
		this.description = description;
		this.contextAdapter = contextAdapter;
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
		Object valueExpressionResult = this.newEval().evaluate(valueExpression);

		String displayExpression = this.description.getDisplayExpression();
		if (!Util.isBlank(displayExpression)) {
			Map<String, Object> variables = new HashMap<String, Object>();
			variables.putAll(this.variableManager.getVariables());
			variables.put(EEFExpressionUtils.EEFReference.VALUE, valueExpressionResult);
			EvalFactory.of(this.interpreter, variables).logIfInvalidType(String.class).call(displayExpression, this.newValueConsumer);
		} else if (valueExpressionResult != null) {
			this.newValueConsumer.apply(valueExpressionResult.toString());
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.controllers.IEEFHyperlinkController#onClick(java.lang.Object)
	 */
	@Override
	public void onClick(final Object element) {
		contextAdapter.performModelChange(new Runnable() {
			@Override
			public void run() {
				String expression = EEFHyperlinkController.this.description.getOnClickExpression();
				EAttribute attr = EefPackage.Literals.EEF_HYPERLINK_DESCRIPTION__ON_CLICK_EXPRESSION;

				Map<String, Object> variables = new HashMap<String, Object>();
				variables.putAll(EEFHyperlinkController.this.variableManager.getVariables());
				variables.put(EEFExpressionUtils.EEFHyperlink.SELECTION, element);

				EvalFactory.of(EEFHyperlinkController.this.interpreter, variables).logIfBlank(attr).call(expression);
			}
		});
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.controllers.IEEFTextController#onNewValue(org.eclipse.eef.core.api.controllers.IConsumer)
	 */
	@Override
	public void onNewValue(IConsumer<String> consumer) {
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

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.controllers.IEEFHyperlinkController#action(EEFWidgetAction)
	 */
	@Override
	public void action(final EEFWidgetAction action) {
		this.contextAdapter.performModelChange(new Runnable() {
			@Override
			public void run() {
				String expression = action.getActionExpression();
				EAttribute eAttribute = EefPackage.Literals.EEF_WIDGET_ACTION__ACTION_EXPRESSION;

				Map<String, Object> variables = new HashMap<String, Object>();
				variables.putAll(EEFHyperlinkController.this.variableManager.getVariables());

				EvalFactory.of(EEFHyperlinkController.this.interpreter, variables).logIfBlank(eAttribute).call(expression);
			}
		});
	}

}
