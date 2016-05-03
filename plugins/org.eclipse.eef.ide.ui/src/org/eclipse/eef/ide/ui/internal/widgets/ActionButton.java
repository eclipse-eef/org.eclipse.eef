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
package org.eclipse.eef.ide.ui.internal.widgets;

import org.eclipse.eef.EEFWidgetAction;
import org.eclipse.eef.common.ui.api.EEFWidgetFactory;
import org.eclipse.eef.core.api.utils.EvalFactory;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
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
	 * The button.
	 */
	private Button button;

	/**
	 * The button listener.
	 */
	private SelectionAdapter selectionListener;

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

		String expression = action.getLabelExpression();
		String buttonLabel = EvalFactory.of(interpreter, variableManager).logIfInvalidType(String.class).defaultValue("...").evaluate(expression); //$NON-NLS-1$
		button.setText(buttonLabel);
	}

	/**
	 * Add a selection listener to the button.
	 *
	 * @param listener
	 *            Selection listener
	 */
	public void addSelectionListener(SelectionAdapter listener) {
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
