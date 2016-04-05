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
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import org.eclipse.eef.EEFTextDescription;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.EefPackage;
import org.eclipse.eef.core.api.EEFExpressionUtils;
import org.eclipse.eef.core.api.ModelChangeExecutor;
import org.eclipse.eef.core.api.controllers.AbstractEEFWidgetController;
import org.eclipse.eef.core.api.controllers.IConsumer;
import org.eclipse.eef.core.api.controllers.IEEFTextController;
import org.eclipse.eef.core.api.utils.Eval;
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
	private EEFTextDescription description;

	/**
	 * The editing domain.
	 */
	private ModelChangeExecutor mce;

	/**
	 * The consumer of a new value of the text.
	 */
	private IConsumer<String> newValueConsumer;

	/**
	 * Executor service used to run the update of the text field.
	 */
	private ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();

	/**
	 * This future contains the update to be performed.
	 */
	private ScheduledFuture<?> currentUpdatedValueFuture;

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
	public EEFTextController(EEFTextDescription description, IVariableManager variableManager, IInterpreter interpreter, ModelChangeExecutor mce) {
		super(variableManager, interpreter);
		this.description = description;
		this.mce = mce;
	}

	@Override
	public void updateValue(final String text) {
		if (this.currentUpdatedValueFuture != null && !this.currentUpdatedValueFuture.isDone()) {
			this.currentUpdatedValueFuture.cancel(true);
		}

		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				EEFTextController.this.mce.execute(new Runnable() {
					@Override
					public void run() {
						String editExpression = EEFTextController.this.description.getEditExpression();
						EAttribute eAttribute = EefPackage.Literals.EEF_TEXT_DESCRIPTION__EDIT_EXPRESSION;

						Map<String, Object> variables = new HashMap<String, Object>();
						variables.putAll(EEFTextController.this.variableManager.getVariables());
						variables.put(EEFExpressionUtils.EEFText.NEW_VALUE, text);

						new Eval(EEFTextController.this.interpreter, variables).call(eAttribute, editExpression);
					}
				});
			}
		};
		final long scheduleTime = 500L;
		this.currentUpdatedValueFuture = this.executor.schedule(runnable, scheduleTime, TimeUnit.MILLISECONDS);
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
		EAttribute eAttribute = EefPackage.Literals.EEF_TEXT_DESCRIPTION__VALUE_EXPRESSION;

		this.newEval().call(eAttribute, valueExpression, String.class, EEFTextController.this.newValueConsumer);
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

}
