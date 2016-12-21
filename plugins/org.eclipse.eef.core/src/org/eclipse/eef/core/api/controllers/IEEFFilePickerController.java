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
 * The EEFFilePickerController is responsible of supporting all the interactions with the widgets created for an
 * EEFFilePickerDescription.
 *
 * @author arichard
 */
public interface IEEFFilePickerController extends IEEFWidgetController {

	/**
	 * Update the file/directory path of the file picker.
	 *
	 * @param path
	 *            The new file/directory path of the file picker.
	 * @return the status of the update execution.
	 *
	 */
	IStatus updatePath(String path);

	/**
	 * Register a consumer which will be called with the new file/directory path of the file picker when it will change.
	 *
	 * @param consumer
	 *            The consumer of the new file/directory path of the file picker
	 */
	void onNewPath(IConsumer<String> consumer);

	/**
	 * Remove the consumer of the new file/directory path of the file picker.
	 */
	void removeNewPathConsumer();

}
