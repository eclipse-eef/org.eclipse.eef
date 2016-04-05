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

import org.eclipse.eef.EEFSelectDescription;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.EefPackage;
import org.eclipse.eef.core.api.EEFExpressionUtils;
import org.eclipse.eef.core.api.ModelChangeExecutor;
import org.eclipse.eef.core.api.controllers.AbstractEEFWidgetController;
import org.eclipse.eef.core.api.controllers.IConsumer;
import org.eclipse.eef.core.api.controllers.IEEFSelectController;
import org.eclipse.eef.core.api.utils.Eval;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;

/**
 * This class will be used in order to manage the behavior of the combo.
 *
 * @author mbats
 */
public class EEFSelectController extends AbstractEEFWidgetController implements IEEFSelectController {
	/**
	 * The description.
	 */
	private EEFSelectDescription description;

	/**
	 * The editing domain.
	 */
	private ModelChangeExecutor mce;

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
	 * @param mce
	 *            The editing domain
	 */
	public EEFSelectController(EEFSelectDescription description, IVariableManager variableManager, IInterpreter interpreter,
			ModelChangeExecutor mce) {
		super(variableManager, interpreter);
		this.description = description;
		this.mce = mce;
	}

	@Override
	public void updateValue(final Object text) {
		mce.execute(new Runnable() {
			@Override
			public void run() {
				String editExpression = EEFSelectController.this.description.getEditExpression();
				EAttribute eAttribute = EefPackage.Literals.EEF_SELECT_DESCRIPTION__EDIT_EXPRESSION;

				Map<String, Object> variables = new HashMap<String, Object>();
				variables.putAll(EEFSelectController.this.variableManager.getVariables());
				variables.put(EEFExpressionUtils.EEFText.NEW_VALUE, text);

				new Eval(EEFSelectController.this.interpreter, variables).call(eAttribute, editExpression);
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

		String candidatesExpression = this.description.getCandidatesExpression();
		EAttribute candidatesExpressionEAttribute = EefPackage.Literals.EEF_SELECT_DESCRIPTION__CANDIDATES_EXPRESSION;

		this.newEval().call(candidatesExpressionEAttribute, candidatesExpression, new IConsumer<Object>() {
			@Override
			public void apply(Object value) {
				if (value instanceof Iterable<?>) {
					List<Object> candidates = new ArrayList<Object>();
					for (Object iterator : (Iterable<?>) value) {
						candidates.add(iterator);
					}
					EEFSelectController.this.newCandidatesConsumer.apply(candidates);
				}
			}
		});

		String valueExpression = this.description.getValueExpression();
		EAttribute valueExpressionEAttribute = EefPackage.Literals.EEF_SELECT_DESCRIPTION__VALUE_EXPRESSION;

		this.newEval().call(valueExpressionEAttribute, valueExpression, EEFSelectController.this.newValueConsumer);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.controllers.IEEFTextController#onNewValue(org.eclipse.eef.core.api.controllers.IConsumer)
	 */
	@Override
	public void onNewValue(IConsumer<Object> consumer) {
		this.newValueConsumer = consumer;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.controllers.IEEFTextController#onNewValue(org.eclipse.eef.core.api.controllers.IConsumer)
	 */
	@Override
	public void onNewCandidates(IConsumer<List<Object>> consumer) {
		this.newCandidatesConsumer = consumer;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.controllers.IEEFSelectController#removeNewValueConsumer()
	 */
	@Override
	public void removeNewValueConsumer() {
		this.newValueConsumer = null;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.controllers.IEEFSelectController#removeNewCandidatesConsumer()
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
