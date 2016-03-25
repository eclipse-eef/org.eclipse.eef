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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.eef.EEFRadioDescription;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.EefPackage;
import org.eclipse.eef.core.api.EEFExpressionUtils;
import org.eclipse.eef.core.api.controllers.AbstractEEFWidgetController;
import org.eclipse.eef.core.api.controllers.IConsumer;
import org.eclipse.eef.core.api.controllers.IEEFRadioController;
import org.eclipse.eef.core.api.utils.Eval;
import org.eclipse.eef.core.api.utils.ISuccessfulResultConsumer;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
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
	private EEFRadioDescription description;

	/**
	 * The editing domain.
	 */
	private TransactionalEditingDomain editingDomain;

	/**
	 * The consumer of a new value of the combo.
	 */
	private IConsumer<Object> newValueConsumer;

	/**
	 * The consumer of a new candidates of the combo.
	 */
	private IConsumer<List<Object>> newCandidatesConsumer;

	/**
	 * The constructor.
	 *
	 * @param description
	 *            The description
	 * @param variableManager
	 *            The variable manager
	 * @param interpreter
	 *            The interpreter
	 * @param editingDomain
	 *            The editing domain
	 */
	public EEFRadioController(EEFRadioDescription description, IVariableManager variableManager, IInterpreter interpreter,
			TransactionalEditingDomain editingDomain) {
		super(variableManager, interpreter);
		this.description = description;
		this.editingDomain = editingDomain;
	}

	@Override
	public void updateValue(final Object text) {
		final Command command = new RecordingCommand(this.editingDomain) {
			@Override
			protected void doExecute() {
				String editExpression = EEFRadioController.this.description.getEditExpression();
				EAttribute eAttribute = EefPackage.Literals.EEF_RADIO_DESCRIPTION__EDIT_EXPRESSION;

				Map<String, Object> variables = new HashMap<String, Object>();
				variables.putAll(EEFRadioController.this.variableManager.getVariables());
				variables.put(EEFExpressionUtils.EEFText.NEW_VALUE, text);

				new Eval(EEFRadioController.this.interpreter, variables).call(eAttribute, editExpression);
			}

			@Override
			public boolean canExecute() {
				return true;
			}
		};

		CommandStack commandStack = EEFRadioController.this.editingDomain.getCommandStack();
		commandStack.execute(command);
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

		this.newEval().call(candidatesExpressionEAttribute, candidatesExpression, new ISuccessfulResultConsumer<Object>() {
			@Override
			public void apply(Object value) {
				if (value instanceof Iterable<?>) {
					List<Object> candidates = new ArrayList<Object>();
					for (Object iterator : (Iterable<?>) value) {
						candidates.add(iterator);
					}
					EEFRadioController.this.newCandidatesConsumer.apply(candidates);
				}
			}
		});

		String valueExpression = this.description.getValueExpression();
		EAttribute valueExpressionEAttribute = EefPackage.Literals.EEF_RADIO_DESCRIPTION__VALUE_EXPRESSION;

		this.newEval().call(valueExpressionEAttribute, valueExpression, new ISuccessfulResultConsumer<Object>() {
			@Override
			public void apply(Object value) {
				EEFRadioController.this.newValueConsumer.apply(value);
			}
		});
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.controllers.EEFTextController#onNewValue(org.eclipse.eef.core.api.controllers.IConsumer)
	 */
	@Override
	public void onNewValue(IConsumer<Object> consumer) {
		this.newValueConsumer = consumer;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.controllers.EEFTextController#onNewValue(org.eclipse.eef.core.api.controllers.IConsumer)
	 */
	@Override
	public void onNewCandidates(IConsumer<List<Object>> consumer) {
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
