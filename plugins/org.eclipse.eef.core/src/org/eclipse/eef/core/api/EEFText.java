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
package org.eclipse.eef.core.api;

import org.eclipse.eef.EEFTextDescription;

/**
 * The {@link EEFText} is used to manage the state of a Text widget.
 *
 * @author sbegaudeau
 */
public interface EEFText extends EEFWidget {
	/**
	 * Returns the description of the {@link EEFText}.
	 *
	 * @return The {@link EEFTextDescription}
	 */
	EEFTextDescription getDescription();

	/**
	 * Adds a consumer which will be triggered when the value expression is evaluated.
	 *
	 * @param consumer
	 *            A functional interface used as a callback
	 */
	void addValueExpressionConsumer(IConsumer<String> consumer);

	/**
	 * Removes the value expression consumer.
	 */
	void removeValueExpressionConsumer();

	/**
	 * Updates the value of the text.
	 *
	 * @param selection
	 *            The selection
	 *
	 * @param newValue
	 *            The new value
	 */
	void updateValue(Object selection, String newValue);

	/**
	 * Adds a consumer which will be triggered when the label expression is evaluated.
	 *
	 * @param consumer
	 *            A functional interface used as a callback
	 */
	void addLabelExpressionConsumer(IConsumer<String> consumer);

	/**
	 * Removes the label expression consumer.
	 */
	void removeLabelExpressionConsumer();

}
