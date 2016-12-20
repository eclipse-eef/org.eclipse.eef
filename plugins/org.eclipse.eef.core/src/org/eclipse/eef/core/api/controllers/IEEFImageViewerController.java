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
 * The EEFImageViewerController is responsible of supporting all the interactions with the widgets created for an
 * EEFImageViewerDescription.
 *
 * @author arichard
 */
public interface IEEFImageViewerController extends IEEFWidgetController {

	/**
	 * Update the path of the image viewer.
	 *
	 * @param path
	 *            The new path of the image viewer.
	 * @return the status of the update execution.
	 *
	 */
	IStatus updatePath(String path);

	/**
	 * Register a consumer which will be called with the new path of the image viewer when it will change. The consumer
	 * will have the responsibility to transform the given object into image.
	 *
	 * @param consumer
	 *            The consumer of the new path of the image.
	 */
	void onNewPath(IConsumer<String> consumer);

	/**
	 * Remove the consumer of the new path of the image.
	 */
	void removeNewPathConsumer();

}
