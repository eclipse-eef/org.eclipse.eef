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

import org.eclipse.eef.EEFCustomExpression;
import org.eclipse.eef.EEFCustomWidgetDescription;
import org.eclipse.eef.EefPackage;
import org.eclipse.eef.core.api.EditionContextAdapter;
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
	protected EEFCustomWidgetDescription description;

	/**
	 * The editing context adapter.
	 */
	protected EditionContextAdapter eca;

	/**
	 * The constructor.
	 *
	 * @param description
	 *            The description
	 * @param variableManager
	 *            The variable manager
	 * @param interpreter
	 *            The interpreter
	 * @param eca
	 *            The editing context adapter.
	 */
	public AbstractEEFCustomWidgetController(EEFCustomWidgetDescription description, IVariableManager variableManager, IInterpreter interpreter,
			EditionContextAdapter eca) {
		super(variableManager, interpreter);
		this.description = description;
		this.eca = eca;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.controllers.AbstractEEFWidgetController#getDescription()
	 */
	@Override
	protected abstract EEFCustomWidgetDescription getDescription();

	/**
	 * Get the custom expression.
	 *
	 * @param customExpressionId
	 *            Identifier of the custom expression
	 * @return The custom expression
	 */
	protected String getCustomExpression(String customExpressionId) {
		EEFCustomWidgetDescription customDescription = getDescription();
		if (customDescription != null) {
			for (EEFCustomExpression eefCustomExpression : customDescription.getCustomExpressions()) {
				if (eefCustomExpression != null && customExpressionId != null && customExpressionId.equals(eefCustomExpression.getIdentifier())) {
					return eefCustomExpression.getCustomExpression();
				}
			}
		}
		// TODO log error
		return null;
	}

	/**
	 * Execute a custom expression in a command.
	 *
	 * @param customExpressionId
	 *            Identifier of the custom expression to execute
	 */
	protected void executeCommandExpression(final String customExpressionId) {
		eca.performModelChange(new Runnable() {
			@Override
			public void run() {
				String pushExpression = getCustomExpression(customExpressionId);
				EAttribute attr = EefPackage.Literals.EEF_CUSTOM_EXPRESSION__CUSTOM_EXPRESSION;
				AbstractEEFCustomWidgetController.this.newEval().call(attr, pushExpression);
			}
		});
	}

}
