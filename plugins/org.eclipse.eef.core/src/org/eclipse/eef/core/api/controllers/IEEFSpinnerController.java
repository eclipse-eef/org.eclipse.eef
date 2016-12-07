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
package org.eclipse.eef.core.api.controllers;

import org.eclipse.core.runtime.IStatus;

/**
 * The IEEFSpinnerController is responsible of supporting all the interactions with the widgets created for an
 * EEFSpinnerDescription.
 *
 * @author arichard
 */
public interface IEEFSpinnerController extends IEEFWidgetController {
	/**
	 * Register a consumer which will be called with the new value of the spinner's value when it will change.
	 *
	 * @param consumer
	 *            The consumer of the new value of the spinner's value.
	 */
	void onNewSpinnerValue(IConsumer<Object> consumer);

	/**
	 * Remove the consumer of the new value of the spinner's value.
	 */
	void removeNewSpinnerValueConsumer();

	/**
	 * Update the value of the spinner.
	 *
	 * @param text
	 *            The new value of the spinner.
	 * @return the status of the update execution.
	 *
	 */
	IStatus updateValue(String text);

}
