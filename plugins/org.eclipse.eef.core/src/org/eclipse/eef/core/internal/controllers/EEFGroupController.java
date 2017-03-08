/*******************************************************************************
 * Copyright (c) 2015, 2017 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.eef.core.internal.controllers;

import java.util.function.Consumer;

import org.eclipse.eef.EEFGroupDescription;
import org.eclipse.eef.EefPackage;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.controllers.AbstractEEFController;
import org.eclipse.eef.core.api.controllers.IEEFGroupController;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
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
	private Consumer<String> newLabelConsumer;

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
	public EEFGroupController(EEFGroupDescription description, IVariableManager variableManager, IInterpreter interpreter,
			EditingContextAdapter editingContextAdapter) {
		super(variableManager, interpreter, editingContextAdapter);
		this.description = description;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.controllers.IEEFGroupController#onNewLabel(java.util.function.Consumer)
	 */
	@Override
	public void onNewLabel(Consumer<String> consumer) {
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
	 * @see org.eclipse.eef.core.api.controllers.AbstractEEFController#getValidationRulesContainer()
	 */
	@Override
	protected EObject getValidationRulesContainer() {
		return this.description;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.controllers.AbstractEEFController#getValidationRulesReference()
	 */
	@Override
	protected EReference getValidationRulesReference() {
		return EefPackage.Literals.EEF_GROUP_DESCRIPTION__SEMANTIC_VALIDATION_RULES;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.controllers.AbstractEEFController#refresh()
	 */
	@Override
	public void refresh() {
		super.refresh();

		String labelExpression = this.description.getLabelExpression();
		this.newEval().logIfInvalidType(String.class).call(labelExpression, this.newLabelConsumer);
	}
}
