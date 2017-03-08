/*******************************************************************************
 * Copyright (c) 2016, 2017 Obeo.
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
import org.eclipse.eef.EEFHyperlinkDescription;
import org.eclipse.eef.EEFWidgetAction;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.EefPackage;
import org.eclipse.eef.common.api.utils.Util;
import org.eclipse.eef.core.api.EEFExpressionUtils;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.controllers.AbstractEEFWidgetController;
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
	private final EEFHyperlinkDescription description;

	/**
	 * The consumer of a new value of the text.
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
	public EEFHyperlinkController(EEFHyperlinkDescription description, IVariableManager variableManager, IInterpreter interpreter,
			EditingContextAdapter editingContextAdapter) {
		super(variableManager, interpreter, editingContextAdapter);
		this.description = description;
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
		Optional.ofNullable(this.newValueConsumer).ifPresent(consumer -> {
			this.newEval().call(valueExpression, consumer);
		});
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.controllers.IEEFHyperlinkController#computeDisplayValue(java.lang.Object)
	 */
	@Override
	public String computeDisplayValue(Object value) {
		String displayExpression = this.description.getDisplayExpression();
		String text = null;
		if (!Util.isBlank(displayExpression)) {
			Map<String, Object> variables = new HashMap<String, Object>();
			variables.putAll(this.variableManager.getVariables());
			variables.put(EEFExpressionUtils.EEFReference.VALUE, value);
			text = EvalFactory.of(this.interpreter, variables).logIfInvalidType(String.class).evaluate(displayExpression);
		}
		return Optional.ofNullable(text).orElse(""); //$NON-NLS-1$
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.controllers.IEEFHyperlinkController#onClick(java.lang.Object)
	 */
	@Override
	public IStatus onClick(final Object element) {
		return this.editingContextAdapter.performModelChange(() -> {
			String expression = this.description.getOnClickExpression();
			EAttribute attr = EefPackage.Literals.EEF_HYPERLINK_DESCRIPTION__ON_CLICK_EXPRESSION;

			Map<String, Object> variables = new HashMap<String, Object>();
			variables.putAll(this.variableManager.getVariables());
			variables.put(EEFExpressionUtils.EEFHyperlink.SELECTION, element);

			EvalFactory.of(this.interpreter, variables).logIfBlank(attr).call(expression);
		});
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.controllers.IEEFTextController#onNewValue(java.util.function.Consumer)
	 */
	@Override
	public void onNewValue(Consumer<Object> consumer) {
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
