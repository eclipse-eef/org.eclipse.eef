/*******************************************************************************
 * Copyright (c) 2015, 2016 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.eef.core.api.controllers;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.eef.EEFWidgetAction;

/**
 * The EEFLabelController is responsible of supporting all the interactions with the widgets created for an
 * EEFLabelDescription.
 *
 * @author mbats
 */
public interface IEEFLabelController extends IEEFWidgetController {
	/**
	 * Register a consumer which will be called with the new value of the label when it will change.
	 *
	 * @param consumer
	 *            The consumer of the new value of the label
	 */
	void onNewValue(IConsumer<String> consumer);

	/**
	 * Remove the consumer of the new value of the label.
	 */
	void removeNewValueConsumer();

	/**
	 * Invoked when the user clicks on an action button.
	 *
	 * @param action
	 *            Widget action
	 * @return the status of the action execution
	 */
	IStatus action(EEFWidgetAction action);
}
