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
package org.eclipse.eef.core.internal.controllers;

import java.util.Optional;
import java.util.function.Consumer;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.eef.EEFButtonDescription;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.EefPackage;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.controllers.AbstractEEFWidgetController;
import org.eclipse.eef.core.api.controllers.IEEFButtonController;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;

/**
 * This class will be used in order to manage the behavior of the button.
 *
 * @author pcdavid
 */
public class EEFButtonController extends AbstractEEFWidgetController implements IEEFButtonController {
	/**
	 * The description.
	 */
	private final EEFButtonDescription description;

	/**
	 * The consumer of a new value of the button's label.
	 */
	private Consumer<String> newButtonLabelConsumer;

	/**
	 * The consumer of a new value of the button's image.
	 */
	private Consumer<Object> newButtonImageConsumer;

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
	public EEFButtonController(EEFButtonDescription description, IVariableManager variableManager, IInterpreter interpreter,
			EditingContextAdapter editingContextAdapter) {
		super(variableManager, interpreter, editingContextAdapter);
		this.description = description;
	}

	@Override
	public void onNewButtonLabel(Consumer<String> consumer) {
		this.newButtonLabelConsumer = consumer;
	}

	@Override
	public void removeNewButtonLabelConsumer() {
		this.newButtonLabelConsumer = null;
	}

	@Override
	public void onNewButtonImage(Consumer<Object> consumer) {
		this.newButtonImageConsumer = consumer;
	}

	@Override
	public void removeNewButtonImageConsumer() {
		this.newButtonImageConsumer = null;
	}

	@Override
	protected EEFWidgetDescription getDescription() {
		return this.description;
	}

	@Override
	public void refresh() {
		super.refresh();

		String imageExpression = Optional.ofNullable(this.description.getImageExpression()).orElse(""); //$NON-NLS-1$
		if (!imageExpression.isEmpty()) {
			this.newEval().logIfInvalidType(Object.class).call(imageExpression, this.newButtonImageConsumer);
		}

		String buttonLabelExpression = this.description.getButtonLabelExpression();
		if (!imageExpression.isEmpty()) {
			this.newEval().logIfInvalidType(String.class).call(buttonLabelExpression, this.newButtonLabelConsumer);
		} else {
			this.newEval().logIfInvalidType(String.class).defaultValue("...").call(buttonLabelExpression, this.newButtonLabelConsumer); //$NON-NLS-1$
		}
	}

	@Override
	public IStatus pushed() {
		return this.editingContextAdapter.performModelChange(() -> {
			String pushExpression = this.description.getPushExpression();
			EAttribute attr = EefPackage.Literals.EEF_BUTTON_DESCRIPTION__PUSH_EXPRESSION;
			this.newEval().logIfBlank(attr).call(pushExpression);
		});
	}
}
