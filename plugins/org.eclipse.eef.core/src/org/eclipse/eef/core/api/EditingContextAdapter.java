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
package org.eclipse.eef.core.api;

import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.eef.core.api.controllers.IConsumer;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.domain.EditingDomain;

/**
 * Connects EEF views with the external context (e.g. an editor) on behalf of which the views display and edit model
 * elements. Clients which use the EEF runtime must supply an implementation of this interface so that the EEF views can
 * be correctly integrated into the source context.
 *
 * @author pcdavid
 */
public interface EditingContextAdapter {

	/**
	 * Executes an operation which which potentially makes changes to the model.
	 *
	 * @param operation
	 *            the operation.
	 * @return the status of the operation execution.
	 */
	IStatus performModelChange(Runnable operation);

	/**
	 * Registers a listener to notify when the model is modified. The trigger will be called in a context in which it
	 * may not be possible to perform additional changes to the model itself. The list of changes supplied to the
	 * listener should be considered only as a hint and may be <code>null</code>.
	 *
	 * @param trigger
	 *            the trigger to invoke when the model is modified.
	 */
	void onModelChange(IConsumer<List<Notification>> trigger);

	/**
	 * Unregisters the currently set listener. Does nothing if none is currently registered.
	 */
	void removeModelChangeConsumer();

	/**
	 * Returns the editing domain.
	 *
	 * @return The editing domain
	 *
	 * @since 1.7.0
	 */
	EditingDomain getEditingDomain();
}
