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
import org.eclipse.emf.common.util.EList;

/**
 * The EEFMultiTextController is responsible of supporting all the interactions with the widgets created for an
 * EEFMultiTextDescription.
 *
 * @author arichard
 */
public interface IEEFMultiTextController extends IEEFWidgetController {

	/**
	 * Update the values of the multi text.
	 *
	 * @param values
	 *            The new values of the multi text
	 * @return the status of the update execution.
	 *
	 */
	IStatus updateValues(EList<String> values);

	/**
	 * Register a consumer which will be called with the new value of the text when it will change. The consumer will
	 * have the responsibility to transform the given object into text
	 *
	 * @param consumer
	 *            The consumer of the new value of the text
	 */
	void onNewValue(IConsumer<Object> consumer);

	/**
	 * Remove the consumer of the new value of the text.
	 */
	void removeNewValueConsumer();

}
