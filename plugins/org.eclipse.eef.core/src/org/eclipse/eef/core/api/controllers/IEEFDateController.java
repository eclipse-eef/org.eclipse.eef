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

import java.util.Date;

import org.eclipse.core.runtime.IStatus;

/**
 * The EEFDateController is responsible of supporting all the interactions with the widgets created for an
 * EEFDateDescription.
 *
 * @author arichard
 */
public interface IEEFDateController extends IEEFWidgetController {

	/**
	 * Update the value of the date.
	 *
	 * @param date
	 *            The new value of the date
	 * @return the status of the update execution.
	 *
	 */
	IStatus updateValue(Date date);

	/**
	 * Register a consumer which will be called with the new value of the date when it will change. The consumer will
	 * have the responsibility to transform the given object into date
	 *
	 * @param consumer
	 *            The consumer of the new value of the date.
	 */
	void onNewValue(IConsumer<Date> consumer);

	/**
	 * Remove the consumer of the new value of the date.
	 */
	void removeNewValueConsumer();

}
