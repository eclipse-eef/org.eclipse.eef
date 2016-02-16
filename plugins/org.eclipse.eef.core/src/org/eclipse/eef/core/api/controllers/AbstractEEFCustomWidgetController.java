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
package org.eclipse.eef.core.api.controllers;

import org.eclipse.eef.EEFCustomDescription;
import org.eclipse.eef.EEFCustomExpression;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.EefPackage;
import org.eclipse.eef.core.api.utils.Eval;
import org.eclipse.eef.core.internal.controllers.AbstractEEFWidgetController;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;

/**
 * This class is used to provide utilities to custom widget controller.
 *
 * @author mbats
 */
public abstract class AbstractEEFCustomWidgetController extends AbstractEEFWidgetController {
	/**
	 * The description.
	 */
	protected EEFCustomDescription description;

	/**
	 * The editing domain.
	 */
	protected TransactionalEditingDomain editingDomain;

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
	public AbstractEEFCustomWidgetController(EEFCustomDescription description, IVariableManager variableManager, IInterpreter interpreter,
			TransactionalEditingDomain editingDomain) {
		super(variableManager, interpreter);
		this.description = description;
		this.editingDomain = editingDomain;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.internal.controllers.AbstractEEFWidgetController#getDescription()
	 */
	@Override
	protected abstract EEFWidgetDescription getDescription();

	/**
	 * Get the custom expression.
	 *
	 * @param customExpressionId
	 *            Identifier of the custom expression
	 * @return The custom expression
	 */
	protected String getCustomExpression(String customExpressionId) {
		EEFWidgetDescription customDescription = getDescription();
		if (customDescription instanceof EEFCustomDescription) {
			for (EEFCustomExpression eefCustomExpression : ((EEFCustomDescription) customDescription).getCustomExpressions()) {
				if (eefCustomExpression.getIdentifier().equals(customExpressionId)) {
					return eefCustomExpression.getCustomExpression();
				}
			}
		}
		// TODO log error
		return null;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.internal.controllers.AbstractEEFWidgetController#refresh()
	 */
	@Override
	public void refresh() {
		super.refresh();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.internal.controllers.AbstractEEFController#newEval()
	 */
	@Override
	protected Eval newEval() {
		return super.newEval();
	}

	/**
	 * Execute a custom expression in a command.
	 *
	 * @param customExpressionId
	 *            Identifier of the custom expression to execute
	 */
	protected void executeCommandExpression(final String customExpressionId) {
		final Command command = new RecordingCommand(this.editingDomain) {
			@Override
			protected void doExecute() {
				String pushExpression = getCustomExpression(customExpressionId);
				EAttribute attr = EefPackage.Literals.EEF_CUSTOM_EXPRESSION__CUSTOM_EXPRESSION;
				AbstractEEFCustomWidgetController.this.newEval().call(attr, pushExpression);
			}
		};
		this.editingDomain.getCommandStack().execute(command);
	}

}
