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
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import org.eclipse.eef.EEFSelectDescription;
import org.eclipse.eef.EefPackage;
import org.eclipse.eef.core.api.EEFExpressionUtils;
import org.eclipse.eef.core.api.controllers.EEFSelectController;
import org.eclipse.eef.core.api.controllers.IConsumer;
import org.eclipse.eef.core.api.utils.Util;
import org.eclipse.eef.core.internal.EEFCorePlugin;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;

/**
 * This class will be used in order to manage the behavior of the combo.
 *
 * @author mbats
 */
public class EEFSelectControllerImpl extends AbstractEEFWidgetController implements EEFSelectController {
	/**
	 * The description.
	 */
	private EEFSelectDescription description;

	/**
	 * The editing domain.
	 */
	private TransactionalEditingDomain editingDomain;

	/**
	 * The consumer of a new value of the combo.
	 */
	private IConsumer<Object> newValueConsumer;

	/**
	 * The consumer of a new value of the label.
	 */
	private IConsumer<String> newLabelConsumer;

	/**
	 * The consumer of a new candidates of the combo.
	 */
	private IConsumer<List<Object>> newCandidatesConsumer;

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
	public EEFSelectControllerImpl(EEFSelectDescription description, IVariableManager variableManager, IInterpreter interpreter,
			TransactionalEditingDomain editingDomain) {
		this.description = description;
		this.variableManager = variableManager;
		this.interpreter = interpreter;
		this.editingDomain = editingDomain;
	}

	@Override
	public void updateValue(final Object text) {
		if (this.currentUpdatedValueFuture != null && !this.currentUpdatedValueFuture.isDone()) {
			this.currentUpdatedValueFuture.cancel(true);
		}

		final Command command = new RecordingCommand(this.editingDomain) {
			@Override
			protected void doExecute() {
				String editExpression = EEFSelectControllerImpl.this.description.getEditExpression();
				if (!Util.isBlank(editExpression)) {
					Map<String, Object> variables = new HashMap<String, Object>();
					variables.putAll(EEFSelectControllerImpl.this.variableManager.getVariables());
					variables.put(EEFExpressionUtils.EEFText.NEW_VALUE, text);
					EEFSelectControllerImpl.this.interpreter.evaluateExpression(variables, editExpression);
				} else {
					EEFCorePlugin.getPlugin().blank(EefPackage.Literals.EEF_SELECT_DESCRIPTION__EDIT_EXPRESSION);
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
				CommandStack commandStack = EEFSelectControllerImpl.this.editingDomain.getCommandStack();
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
		String labelExpression = this.description.getLabelExpression();
		if (!Util.isBlank(labelExpression)) {
			this.refreshStringBasedExpression(labelExpression, this.newLabelConsumer);
		} else {
			EEFCorePlugin.getPlugin().blank(EefPackage.Literals.EEF_WIDGET_DESCRIPTION__LABEL_EXPRESSION);
		}

		String candidatesExpression = this.description.getCandidatesExpression();
		if (!Util.isBlank(candidatesExpression)) {
			this.refreshListBasedExpression(candidatesExpression, this.newCandidatesConsumer);
		} else {
			EEFCorePlugin.getPlugin().blank(EefPackage.Literals.EEF_SELECT_DESCRIPTION__CANDIDATES_EXPRESSION);
		}

		String valueExpression = this.description.getValueExpression();
		if (!Util.isBlank(valueExpression)) {
			this.refreshObjectBasedExpression(valueExpression, this.newValueConsumer);
		} else {
			EEFCorePlugin.getPlugin().blank(EefPackage.Literals.EEF_SELECT_DESCRIPTION__VALUE_EXPRESSION);
		}
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
	 * @see org.eclipse.eef.core.api.controllers.EEFTextController#onNewLabel(org.eclipse.eef.core.api.controllers.IConsumer)
	 */
	@Override
	public void onNewLabel(IConsumer<String> consumer) {
		this.newLabelConsumer = consumer;
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
	 * @see org.eclipse.eef.core.api.controllers.EEFSelectController#removeNewLabelConsumer()
	 */
	@Override
	public void removeNewLabelConsumer() {
		this.newLabelConsumer = null;
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

}
