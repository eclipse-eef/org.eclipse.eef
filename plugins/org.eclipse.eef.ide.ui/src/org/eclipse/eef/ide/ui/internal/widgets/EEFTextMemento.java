/*******************************************************************************
 * Copyright (c) 2017, 2018 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.eef.ide.ui.internal.widgets;

import java.util.Map;

import org.eclipse.eef.EEFTextDescription;
import org.eclipse.eef.core.api.EEFExpressionUtils;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.swt.widgets.Widget;

/**
 * A simple data record to remember un-commited user input for recovery in case of concurrent changes that could
 * override this input.
 */
public class EEFTextMemento {
	/**
	 * The key used to attach the user input memento to the widget.
	 */
	public static final String KEY = "eef.widget.text.memento"; //$NON-NLS-1$

	/**
	 * The widget description that was current when the memento was created.
	 */
	private final EEFTextDescription description;

	/**
	 * The "self" target element that was current when the memento was created.
	 */
	private final Object self;

	/**
	 * The reference value corresponding to the pristine text computed from the model by the valueExpression.
	 */
	private final String referenceValue;

	/**
	 * The last (full) value of the text widget entered by the user but not commited yet.
	 */
	private final String userInput;

	/**
	 * The constructor.
	 *
	 * @param description
	 *            The description of the text widget.
	 * @param self
	 *            The "self" target element
	 * @param referenceValue
	 *            The reference value corresponding to the pristine text computed from the model
	 * @param userInput
	 *            The user input
	 */
	public EEFTextMemento(EEFTextDescription description, Object self, String referenceValue, String userInput) {
		this.description = description;
		this.self = self;
		this.referenceValue = referenceValue;
		this.userInput = userInput;
	}

	/**
	 * Indicates if the memento applies to the given lifecycle manager.
	 *
	 * @param textDescription
	 *            The description of the text widget of the lifecycle manager
	 * @param variables
	 *            The variables of the lifecycle manager
	 * @return <code>true</code> if the memento applies to the lifecycle manager, <code>false</code> otherwise.
	 */
	public boolean appliesTo(EEFTextDescription textDescription, Map<String, Object> variables) {
		return this.description == textDescription && this.self == variables.get(EEFExpressionUtils.SELF);
	}

	/**
	 * Stores the memento in the given widget.
	 *
	 * @param widget
	 *            The widget
	 */
	public void store(Widget widget) {
		widget.setData(KEY, this);
	}

	/**
	 * Returns the memento of the given widget.
	 *
	 * @param widget
	 *            The widget
	 * @return The memento of the given widget
	 */
	public static EEFTextMemento of(Widget widget) {
		Object data = widget.getData(KEY);
		if (data instanceof EEFTextMemento) {
			return (EEFTextMemento) data;
		} else {
			return null;
		}
	}

	/**
	 * Removes the memento of the given widget.
	 *
	 * @param widget
	 *            The widget
	 */
	public static void remove(Widget widget) {
		widget.setData(KEY, null);
	}

	/**
	 * Return the description.
	 *
	 * @return the description
	 */
	public EEFTextDescription getDescription() {
		return this.description;
	}

	/**
	 * Return the referenceValue.
	 *
	 * @return the referenceValue
	 */
	public String getReferenceValue() {
		return this.referenceValue;
	}

	/**
	 * Return the userInput.
	 *
	 * @return the userInput
	 */
	public String getUserInput() {
		return this.userInput;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		String newLine = "\n"; //$NON-NLS-1$
		sb.append("Desc: " + EcoreUtil.getURI(description)).append(newLine); //$NON-NLS-1$
		sb.append("Self: " + EcoreUtil.getURI((EObject) self)).append(newLine); //$NON-NLS-1$
		sb.append("Reference Value: " + referenceValue).append(newLine); //$NON-NLS-1$
		sb.append("User Input: " + userInput).append(newLine); //$NON-NLS-1$
		sb.append(newLine);
		return sb.toString();
	}
}