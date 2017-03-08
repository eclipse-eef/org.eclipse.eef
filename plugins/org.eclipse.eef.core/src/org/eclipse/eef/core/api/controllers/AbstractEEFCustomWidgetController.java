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
package org.eclipse.eef.core.api.controllers;

import java.util.Optional;

import org.eclipse.eef.EEFCustomExpression;
import org.eclipse.eef.EEFCustomWidgetDescription;
import org.eclipse.eef.EefPackage;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.emf.ecore.EAttribute;
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
	protected final EEFCustomWidgetDescription description;

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
	 *            The editing context adapter.
	 */
	public AbstractEEFCustomWidgetController(EEFCustomWidgetDescription description, IVariableManager variableManager, IInterpreter interpreter,
			EditingContextAdapter contextAdapter) {
		super(variableManager, interpreter, contextAdapter);
		this.description = description;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.controllers.AbstractEEFWidgetController#getDescription()
	 */
	@Override
	protected EEFCustomWidgetDescription getDescription() {
		return this.description;
	}

	/**
	 * Get the custom expression with the given id.
	 *
	 * @param customExpressionId
	 *            Identifier of the custom expression
	 * @return An optional with the custom expression or an empty optional if none could be found
	 */
	protected Optional<String> getCustomExpression(String customExpressionId) {
		Optional<String> optionalCustomExpression = this.getDescription().getCustomExpressions().stream().filter(eefCustomExpression -> {
			return customExpressionId != null && customExpressionId.equals(eefCustomExpression.getIdentifier());
		}).map(EEFCustomExpression::getCustomExpression).findFirst();

		return optionalCustomExpression;
	}

	/**
	 * Execute a custom expression in a command.
	 *
	 * @param customExpressionId
	 *            Identifier of the custom expression to execute
	 */
	protected void executeCommandExpression(final String customExpressionId) {
		this.editingContextAdapter.performModelChange(() -> {
			this.getCustomExpression(customExpressionId).ifPresent(expression -> {
				EAttribute attr = EefPackage.Literals.EEF_CUSTOM_EXPRESSION__CUSTOM_EXPRESSION;
				AbstractEEFCustomWidgetController.this.newEval().logIfBlank(attr).call(expression);
			});
		});
	}

}
