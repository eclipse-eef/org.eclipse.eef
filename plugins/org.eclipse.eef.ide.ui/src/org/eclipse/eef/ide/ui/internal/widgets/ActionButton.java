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
package org.eclipse.eef.ide.ui.internal.widgets;

import java.util.Optional;

import org.eclipse.eef.EEFWidgetAction;
import org.eclipse.eef.common.ui.api.EEFWidgetFactory;
import org.eclipse.eef.core.api.utils.EvalFactory;
import org.eclipse.eef.core.api.utils.EvalFactory.Eval;
import org.eclipse.eef.ide.ui.internal.EEFImageUtils;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

/**
 * Represents an action button widget.
 *
 * @author mbats
 */
public class ActionButton {

	/**
	 * The minimum width of the button.
	 */
	private static final int MINIMUM_BUTTON_WIDTH = 80;

	/**
	 * The button.
	 */
	private Button button;

	/**
	 * The button listener.
	 */
	private SelectionListener selectionListener;

	/**
	 * The widget action.
	 */
	private EEFWidgetAction action;

	/**
	 * The constructor.
	 *
	 * @param action
	 *            Widget action
	 * @param parent
	 *            Parent composite
	 * @param widgetFactory
	 *            Widget factory
	 * @param interpreter
	 *            Interpreter
	 * @param variableManager
	 *            Variable manager
	 *
	 */
	public ActionButton(EEFWidgetAction action, Composite parent, EEFWidgetFactory widgetFactory, IInterpreter interpreter,
			IVariableManager variableManager) {
		this.action = action;
		this.button = widgetFactory.createButton(parent, "", SWT.NONE); //$NON-NLS-1$

		GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
		gridData.grabExcessHorizontalSpace = true;
		gridData.minimumWidth = MINIMUM_BUTTON_WIDTH;

		this.button.setLayoutData(gridData);

		String imageExpression = Optional.ofNullable(action.getImageExpression()).orElse(""); //$NON-NLS-1$
		Object buttonImage = EvalFactory.of(interpreter, variableManager).logIfInvalidType(Object.class).evaluate(imageExpression);

		// @formatter:off
		Optional.ofNullable(buttonImage).filter(String.class::isInstance)
			.map(String.class::cast)
			.flatMap(EEFImageUtils::getImage)
			.ifPresent(button::setImage);
		// @formatter:on

		// If the button has an image, do not put label default value
		boolean labelDefaultValue = true;
		if (!imageExpression.isEmpty()) {
			labelDefaultValue = false;
		}

		String labelExpression = action.getLabelExpression();
		Eval<String> eval = EvalFactory.of(interpreter, variableManager).logIfInvalidType(String.class);
		if (labelDefaultValue) {
			eval = eval.defaultValue("..."); //$NON-NLS-1$
		}
		String buttonLabel = eval.evaluate(labelExpression);
		button.setText(Optional.ofNullable(buttonLabel).orElse("")); //$NON-NLS-1$
	}

	/**
	 * Sets the enablement of the action button.
	 *
	 * @param isEnabled
	 *            <code>true</code> to set the button as enabled, <code>false</code> otherwise
	 */
	public void setEnabled(boolean isEnabled) {
		this.button.setEnabled(isEnabled);
	}

	/**
	 * Add a selection listener to the button.
	 *
	 * @param listener
	 *            Selection listener
	 */
	public void addSelectionListener(SelectionListener listener) {
		if (!button.isDisposed()) {
			this.selectionListener = listener;
			button.addSelectionListener(selectionListener);
		}
	}

	/**
	 * Remove the selection listener.
	 */
	public void removeSelectionListener() {
		if (!button.isDisposed()) {
			button.removeSelectionListener(selectionListener);
		}
	}

	/**
	 * Get the action.
	 *
	 * @return the action.
	 */
	public EEFWidgetAction getAction() {
		return action;
	}

	/**
	 * Get the button.
	 *
	 * @return The button
	 */
	public Control getButton() {
		return button;
	}
}
