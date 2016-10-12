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

import java.util.List;

import org.eclipse.core.runtime.IStatus;

/**
 * The EEFSelectController is responsible of supporting all the interactions with the widgets created for an
 * EEFSelectDescription.
 *
 * @author mbats
 */
public interface IEEFSelectController extends IEEFWidgetController {

	/**
	 * Update the value of the text.
	 *
	 * @param text
	 *            The new value of the text
	 * @return the status of the update execution.
	 */
	IStatus updateValue(Object text);

	/**
	 * Register a consumer which will be called with the new value of the text when it will change.
	 *
	 * @param consumer
	 *            The consumer of the new value of the text
	 */
	void onNewValue(IConsumer<Object> consumer);

	/**
	 * Register a consumer which will be called with the new value of the candidates when it will change.
	 *
	 * @param consumer
	 *            The consumer of the new candidates of the combo
	 */
	void onNewCandidates(IConsumer<List<Object>> consumer);

	/**
	 * Remove the consumer of the new value of the text.
	 */
	void removeNewValueConsumer();

	/**
	 * Remove the consumer of the new value of the label.
	 */
	void removeNewCandidatesConsumer();

}
