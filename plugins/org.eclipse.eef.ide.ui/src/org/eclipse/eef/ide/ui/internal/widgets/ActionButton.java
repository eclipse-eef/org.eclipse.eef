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

import com.google.common.base.Strings;

import java.net.URL;

import org.eclipse.eef.EEFWidgetAction;
import org.eclipse.eef.common.ui.api.EEFWidgetFactory;
import org.eclipse.eef.core.api.utils.EvalFactory;
import org.eclipse.eef.core.api.utils.EvalFactory.Eval;
import org.eclipse.eef.ide.ui.internal.EEFIdeUiPlugin;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.SWTException;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;

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

		GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
		gridData.grabExcessHorizontalSpace = true;
		gridData.minimumWidth = MINIMUM_BUTTON_WIDTH;

		this.button.setLayoutData(gridData);

		String imageExpression = action.getImageExpression();
		Object buttonImage = EvalFactory.of(interpreter, variableManager).logIfInvalidType(Object.class).evaluate(imageExpression);
		try {
			Image image = null;
			if (buttonImage instanceof String) {
				image = new Image(Display.getCurrent(), (String) buttonImage);
			} else if (buttonImage instanceof URL) {
				image = ImageDescriptor.createFromURL((URL) buttonImage).createImage();
			} else if (buttonImage instanceof ImageDescriptor) {
				image = ((ImageDescriptor) buttonImage).createImage();
			} else if (buttonImage instanceof Image) {
				image = (Image) buttonImage;
			}
			if (image != null) {
				button.setImage(image);
			}
		} catch (IllegalArgumentException | SWTException e) {
			EEFIdeUiPlugin.getPlugin().error(e.getMessage(), e);
		}

		// If the button has an image, do not put label default value
		boolean labelDefaultValue = true;
		if (!Strings.isNullOrEmpty(imageExpression)) {
			labelDefaultValue = false;
		}

		String labelExpression = action.getLabelExpression();
		Eval<String> eval = EvalFactory.of(interpreter, variableManager).logIfInvalidType(String.class);
		if (labelDefaultValue) {
			eval = eval.defaultValue("..."); //$NON-NLS-1$
		}
		String buttonLabel = eval.evaluate(labelExpression);
		button.setText(buttonLabel);
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
