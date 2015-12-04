/*******************************************************************************
 * Copyright (c) 2015 Obeo.
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
import org.eclipse.eef.core.api.EEFExpressionUtils;
import org.eclipse.eef.core.api.IVariableManager;
import org.eclipse.eef.core.api.controllers.EEFTextController;
import org.eclipse.eef.core.api.controllers.IConsumer;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.common.interpreter.api.IEvaluationResult;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;

/**
 * This class will be used in order to manage the behavior of the text.
 *
 * @author sbegaudeau
 */
public class EEFTextControllerImpl implements EEFTextController {
	/**
	 * The description.
	 */
	private EEFTextDescription description;

	/**
	 * The variable manager.
	 */
	private IVariableManager variableManager;

	/**
	 * The interpreter.
	 */
	private IInterpreter interpreter;

	/**
	 * The editing domain.
	 */
	private TransactionalEditingDomain editingDomain;

	/**
	 * The consumer of a new value of the text.
	 */
	private IConsumer<String> newValueConsumer;

	/**
	 * The consumer of a new value of the label.
	 */
	private IConsumer<String> newLabelConsumer;

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
	 * @param editingDomain
	 *            The editing domain
	 */
	public EEFTextControllerImpl(EEFTextDescription description, IVariableManager variableManager, IInterpreter interpreter,
			TransactionalEditingDomain editingDomain) {
		this.description = description;
		this.variableManager = variableManager;
		this.interpreter = interpreter;
		this.editingDomain = editingDomain;
	}

	@Override
	public void updateValue(final String text) {
		if (this.currentUpdatedValueFuture != null && !this.currentUpdatedValueFuture.isDone()) {
			this.currentUpdatedValueFuture.cancel(true);
		}

		final Command command = new RecordingCommand(this.editingDomain) {
			@Override
			protected void doExecute() {
				String editExpression = EEFTextControllerImpl.this.description.getEditExpression();
				if (editExpression != null) {
					Map<String, Object> variables = new HashMap<String, Object>();
					variables.putAll(EEFTextControllerImpl.this.variableManager.getVariables());
					variables.put(EEFExpressionUtils.EEFText.NEW_VALUE, text);
					//variables.put("selection", selection); //$NON-NLS-1$
					EEFTextControllerImpl.this.interpreter.evaluateExpression(variables, editExpression);
				}
			}

			@Override
			public boolean canExecute() {
				return true;
			}
		};

		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				CommandStack commandStack = EEFTextControllerImpl.this.editingDomain.getCommandStack();
				commandStack.execute(command);
			}
		};
		final long scheduleTime = 500L;
		this.currentUpdatedValueFuture = this.executor.schedule(runnable, scheduleTime, TimeUnit.MILLISECONDS);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.controllers.EEFTextController#refresh()
	 */
	@Override
	public void refresh() {
		String valueExpression = this.description.getValueExpression();
		if (valueExpression != null) {
			IEvaluationResult evaluationResult = this.interpreter.evaluateExpression(this.variableManager.getVariables(), valueExpression);
			Object value = evaluationResult.getValue();
			if (value instanceof String && this.newValueConsumer != null) {
				this.newValueConsumer.apply((String) value);
			}
		}

		String labelExpression = this.description.getLabelExpression();
		if (labelExpression != null) {
			IEvaluationResult evaluationResult = this.interpreter.evaluateExpression(this.variableManager.getVariables(), labelExpression);
			Object value = evaluationResult.getValue();
			if (value instanceof String && this.newLabelConsumer != null) {
				this.newLabelConsumer.apply((String) value);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.controllers.EEFTextController#onNewValue(org.eclipse.eef.core.api.controllers.IConsumer)
	 */
	@Override
	public void onNewValue(IConsumer<String> consumer) {
		this.newValueConsumer = consumer;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.controllers.EEFTextController#onNewLabel(org.eclipse.eef.core.api.controllers.IConsumer)
	 */
	@Override
	public void onNewLabel(IConsumer<String> consumer) {
		this.newLabelConsumer = consumer;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.controllers.EEFTextController#removeNewValueConsumer()
	 */
	@Override
	public void removeNewValueConsumer() {
		this.newValueConsumer = null;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.controllers.EEFTextController#removeNewLabelConsumer()
	 */
	@Override
	public void removeNewLabelConsumer() {
		this.newLabelConsumer = null;
	}

}
