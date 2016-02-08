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

/**
 * The IEEFButtonController is responsible of supporting all the interactions with the widgets created for an
 * EEFButtonDescription.
 *
 * @author sbegaudeau, pcdavid
 */
public interface IEEFButtonController extends IEEFWidgetController {
	/**
	 * Register a consumer which will be called with the new value of the button's label when it will change.
	 *
	 * @param consumer
	 *            The consumer of the new value of the button's label
	 */
	void onNewButtonLabel(IConsumer<String> consumer);

	/**
	 * Remove the consumer of the new value of the button's label.
	 */
	void removeNewButtonLabelConsumer();

	/**
	 * Invoked when the user pushes the button.
	 */
	void pushed();

}
