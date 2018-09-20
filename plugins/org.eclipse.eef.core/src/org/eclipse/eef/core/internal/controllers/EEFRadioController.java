/*******************************************************************************
 * Copyright (c) 2016, 2018 Obeo.
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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.eef.EEFRadioDescription;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.EefPackage;
import org.eclipse.eef.core.api.EEFExpressionUtils;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.controllers.AbstractEEFWidgetController;
import org.eclipse.eef.core.api.controllers.IEEFRadioController;
import org.eclipse.eef.core.api.utils.EvalFactory;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;

/**
 * This class will be used in order to manage the behavior of the radio.
 *
 * @author mbats
 */
public class EEFRadioController extends AbstractEEFWidgetController implements IEEFRadioController {
	/**
	 * The description.
	 */
	private final EEFRadioDescription description;

	/**
	 * The consumer of a new value of the combo.
	 */
	private Consumer<Object> newValueConsumer;

	/**
	 * The consumer of a new candidates of the combo.
	 */
	private Consumer<List<Object>> newCandidatesConsumer;

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
	public EEFRadioController(EEFRadioDescription description, IVariableManager variableManager, IInterpreter interpreter,
			EditingContextAdapter editingContextAdapter) {
		super(variableManager, interpreter, editingContextAdapter);
		this.description = description;
	}

	@Override
	public IStatus updateValue(final Object text) {
		return this.editingContextAdapter.performModelChange(() -> {
			String editExpression = this.description.getEditExpression();
			EAttribute eAttribute = EefPackage.Literals.EEF_RADIO_DESCRIPTION__EDIT_EXPRESSION;

			Map<String, Object> variables = new HashMap<String, Object>();
			variables.putAll(this.variableManager.getVariables());
			variables.put(EEFExpressionUtils.EEFText.NEW_VALUE, text);

			EvalFactory.of(this.interpreter, variables).logIfBlank(eAttribute).call(editExpression);
		});
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.controllers.EEFTextController#refresh()
	 */
	@Override
	public void refresh() {
		super.refresh();
		String candidatesExpression = this.description.getCandidatesExpression();
		EAttribute candidatesExpressionEAttribute = EefPackage.Literals.EEF_RADIO_DESCRIPTION__CANDIDATES_EXPRESSION;

		this.newEval().logIfBlank(candidatesExpressionEAttribute).call(candidatesExpression, (value) -> {
			if (value instanceof Iterable<?>) {
				List<Object> candidates = new ArrayList<Object>();

				((Iterable<?>) value).forEach(object -> candidates.add(object));

				Optional.ofNullable(this.newCandidatesConsumer).ifPresent(consumer -> {
					consumer.accept(candidates);
				});
			}
		});

		String valueExpression = this.description.getValueExpression();
		Optional.ofNullable(this.newValueConsumer).ifPresent(consumer -> {
			this.newEval().call(valueExpression, consumer);
		});
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.controllers.EEFTextController#onNewValue(java.util.function.Consumer)
	 */
	@Override
	public void onNewValue(Consumer<Object> consumer) {
		this.newValueConsumer = consumer;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.controllers.EEFTextController#onNewValue(java.util.function.Consumer)
	 */
	@Override
	public void onNewCandidates(Consumer<List<Object>> consumer) {
		this.newCandidatesConsumer = consumer;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.controllers.EEFSelectController#removeNewValueConsumer()
	 */
	@Override
	public void removeNewValueConsumer() {
		this.newValueConsumer = null;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.controllers.EEFSelectController#removeNewCandidatesConsumer()
	 */
	@Override
	public void removeNewCandidatesConsumer() {
		this.newCandidatesConsumer = null;
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
