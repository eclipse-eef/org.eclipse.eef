/*******************************************************************************
 * Copyright (c) 2016, 2018 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors: Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.eef.core.api;

import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.eef.core.api.LockStatusChangeEvent.LockStatus;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
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
	 * Registers the sole unique model change listener listener to be notified when the model is modified. The listener
	 * will be called in a context in which it may not be possible to perform additional changes to the model itself.
	 * The list of changes supplied to the listener should be considered only as a hint and may be <code>null</code>.
	 *
	 * @param listener
	 *            the listener to invoke when the model is modified.
	 */
	void registerModelChangeListener(Consumer<List<Notification>> listener);

	/**
	 * Unregisters the currently set model change listener. Does nothing if none is currently registered.
	 */
	void unregisterModelChangeListener();

	/**
	 * Returns the editing domain.
	 *
	 * @return The editing domain
	 *
	 * @since 1.7.0
	 */
	EditingDomain getEditingDomain();

	/**
	 * Adds a new lock status changed listener to the collection of lock status changed listeners to be notified when
	 * model elements are locked or unlocked.
	 *
	 * @param listener
	 *            the listener to invoke when elements are locked or unlocked.
	 */
	void addLockStatusChangedListener(Consumer<Collection<LockStatusChangeEvent>> listener);

	/**
	 * Removes the given lock status changed listener from the list of all lock status changed listeners..
	 *
	 * @param listener
	 *            The listener to unregister
	 */
	void removeLockStatusChangedListener(Consumer<Collection<LockStatusChangeEvent>> listener);

	/**
	 * Returns the current locking status of an element.
	 *
	 * @param obj
	 *            the element.
	 * @return the current lock status of the element.
	 */
	LockStatus getLockStatus(EObject obj);
}
