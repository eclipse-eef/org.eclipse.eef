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

import org.eclipse.eef.EEFGroupDescription;
import org.eclipse.eef.EefPackage;
import org.eclipse.eef.core.api.controllers.IConsumer;
import org.eclipse.eef.core.api.controllers.IEEFGroupController;
import org.eclipse.eef.core.api.utils.ISuccessfulResultConsumer;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;

/**
 * This controller is used to manage the interaction with a group.
 *
 * @author sbegaudeau
 */
public class EEFGroupController extends AbstractEEFController implements IEEFGroupController {

	/**
	 * The description.
	 */
	private EEFGroupDescription description;

	/**
	 * The label consumer.
	 */
	private IConsumer<String> newLabelConsumer;

	/**
	 * The constructor.
	 *
	 * @param description
	 *            The description
	 * @param variableManager
	 *            The variable manager
	 * @param interpreter
	 *            The interpreter
	 */
	public EEFGroupController(EEFGroupDescription description, IVariableManager variableManager, IInterpreter interpreter) {
		super(variableManager, interpreter);
		this.description = description;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.controllers.IEEFGroupController#onNewLabel(org.eclipse.eef.core.api.controllers.IConsumer)
	 */
	@Override
	public void onNewLabel(IConsumer<String> consumer) {
		this.newLabelConsumer = consumer;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.controllers.IEEFGroupController#removeNewLabelConsumer()
	 */
	@Override
	public void removeNewLabelConsumer() {
		this.newLabelConsumer = null;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.controllers.IEEFGroupController#refresh()
	 */
	@Override
	public void refresh() {
		String labelExpression = this.description.getLabelExpression();
		EAttribute eAttribute = EefPackage.Literals.EEF_WIDGET_DESCRIPTION__LABEL_EXPRESSION;

		this.newEval().call(eAttribute, labelExpression, String.class, new ISuccessfulResultConsumer<String>() {
			@Override
			public void apply(String value) {
				EEFGroupController.this.newLabelConsumer.apply(value);
			}
		});
	}
}
