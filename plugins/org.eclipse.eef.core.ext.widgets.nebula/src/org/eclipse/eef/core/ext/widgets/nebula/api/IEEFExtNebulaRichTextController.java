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
package org.eclipse.eef.core.ext.widgets.nebula.api;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.eef.core.api.controllers.IConsumer;
import org.eclipse.eef.core.api.controllers.IEEFWidgetController;

/**
 * The EEFExtNebulaRichTextController is responsible of supporting all the
 * interactions with the widgets created for an EEFExtNebulaRichTextDescription.
 *
 * @author arichard
 */
public interface IEEFExtNebulaRichTextController extends IEEFWidgetController {

	/**
	 * Update the value of the RichText.
	 *
	 * @param text
	 *            The new value of the RichText.
	 * @return the status of the update execution.
	 *
	 */
	IStatus updateValue(String text);

	/**
	 * Register a consumer which will be called with the new value of the text
	 * when it will change. The consumer will have the responsibility to
	 * transform the given object into RichText.
	 *
	 * @param consumer
	 *            The consumer of the new value of the RichText.
	 */
	void onNewValue(IConsumer<Object> consumer);

	/**
	 * Remove the consumer of the new value of the RichText.
	 */
	void removeNewValueConsumer();

}
