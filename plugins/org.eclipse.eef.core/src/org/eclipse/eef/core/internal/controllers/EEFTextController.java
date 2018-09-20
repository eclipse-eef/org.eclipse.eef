/*******************************************************************************
 * Copyright (c) 2015, 2018 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors: Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.eef.core.internal.controllers;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.eef.EEFTextDescription;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.EefPackage;
import org.eclipse.eef.core.api.EEFExpressionUtils;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.controllers.AbstractEEFWidgetController;
import org.eclipse.eef.core.api.controllers.IEEFTextController;
import org.eclipse.eef.core.api.utils.EvalFactory;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;

/**
 * This class will be used in order to manage the behavior of the text.
 *
 * @author sbegaudeau
 */
public class EEFTextController extends AbstractEEFWidgetController implements IEEFTextController {
	/**
	 * The description.
	 */
	private final EEFTextDescription description;

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
	public EEFTextController(EEFTextDescription description, IVariableManager variableManager, IInterpreter interpreter,
			EditingContextAdapter editingContextAdapter) {
		super(variableManager, interpreter, editingContextAdapter);
		this.description = description;
	}

	@Override
	public IStatus updateValue(final String text) {
		return this.editingContextAdapter.performModelChange(() -> {
			String editExpression = this.description.getEditExpression();
			EAttribute eAttribute = EefPackage.Literals.EEF_TEXT_DESCRIPTION__EDIT_EXPRESSION;

			Map<String, Object> variables = new HashMap<String, Object>();
			variables.putAll(this.variableManager.getVariables());
			variables.put(EEFExpressionUtils.EEFText.NEW_VALUE, text);

			EvalFactory.of(this.interpreter, variables).logIfBlank(eAttribute).call(editExpression);
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
		Optional.ofNullable(this.newValueConsumer).ifPresent(consumer -> {
			this.newEval().call(valueExpression, consumer);
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

}
