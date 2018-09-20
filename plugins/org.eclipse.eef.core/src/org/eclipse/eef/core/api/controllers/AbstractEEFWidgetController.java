/*******************************************************************************
 * Copyright (c) 2016, 2018 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors: Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.eef.core.api.controllers;

import java.util.Optional;
import java.util.function.Consumer;

import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.EefPackage;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;

/**
 * This class is used to provide utilities to widget controller.
 *
 * @author mbats
 */
public abstract class AbstractEEFWidgetController extends AbstractEEFController implements IEEFWidgetController {

	/**
	 * The consumer of a new value of the label.
	 */
	protected Consumer<String> newLabelConsumer;

	/**
	 * The consumer of the new value of the help.
	 */
	protected Consumer<String> newHelpConsumer;

	/**
	 * The constructor.
	 *
	 * @param variableManager
	 *            The variable manager
	 * @param interpreter
	 *            The interpreter
	 * @param editingContextAdapter
	 *            The editing context adapter
	 */
	public AbstractEEFWidgetController(IVariableManager variableManager, IInterpreter interpreter, EditingContextAdapter editingContextAdapter) {
		super(variableManager, interpreter, editingContextAdapter);
	}

	/**
	 * Returns the widget description.
	 *
	 * @return The widget description
	 */
	protected abstract EEFWidgetDescription getDescription();

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.controllers.AbstractEEFController#getValidationRulesContainer()
	 */
	@Override
	protected EObject getValidationRulesContainer() {
		return this.getDescription();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.controllers.AbstractEEFController#getValidationRulesReference()
	 */
	@Override
	protected EReference getValidationRulesReference() {
		return EefPackage.Literals.EEF_WIDGET_DESCRIPTION__PROPERTY_VALIDATION_RULES;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.controllers.IEEFWidgetController#onNewLabel(java.util.function.Consumer)
	 */
	@Override
	public void onNewLabel(Consumer<String> consumer) {
		this.newLabelConsumer = consumer;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.controllers.IEEFWidgetController#removeNewLabelConsumer()
	 */
	@Override
	public void removeNewLabelConsumer() {
		this.newLabelConsumer = null;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.controllers.IEEFWidgetController#onNewHelp(java.util.function.Consumer)
	 */
	@Override
	public void onNewHelp(Consumer<String> consumer) {
		this.newHelpConsumer = consumer;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.controllers.IEEFWidgetController#removeNewHelpConsumer()
	 */
	@Override
	public void removeNewHelpConsumer() {
		this.newHelpConsumer = null;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.controllers.AbstractEEFController#refresh()
	 */
	@Override
	public void refresh() {
		super.refresh();

		String labelExpression = this.getDescription().getLabelExpression();
		Optional.ofNullable(this.newLabelConsumer).ifPresent(consumer -> {
			this.newEval().logIfInvalidType(String.class).call(labelExpression, consumer);
		});
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.controllers.IEEFWidgetController#computeHelp()
	 */
	@Override
	public void computeHelp() {
		String helpExpression = this.getDescription().getHelpExpression();
		Optional.ofNullable(this.newHelpConsumer).ifPresent(consumer -> {
			this.newEval().logIfInvalidType(String.class).call(helpExpression, consumer);
		});
	}

}
