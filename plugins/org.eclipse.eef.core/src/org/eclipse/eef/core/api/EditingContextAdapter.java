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

import java.util.Collection;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.eef.core.api.controllers.IConsumer;
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
	 * Registers one listener to notify when the model is modified. The listener will be called in a context in which it
	 * may not be possible to perform additional changes to the model itself. The list of changes supplied to the
	 * listener should be considered only as a hint and may be <code>null</code>.
	 *
	 * @param listener
	 *            the listener to invoke when the model is modified.
	 */
	void registerModelChangeListener(IConsumer<List<Notification>> listener);

	/**
	 * Unregisters the currently set consumer. Does nothing if none is currently registered.
	 */
	void unregisterModelChangeConsumer();

	/**
	 * Returns the editing domain.
	 *
	 * @return The editing domain
	 *
	 * @since 1.7.0
	 */
	EditingDomain getEditingDomain();

	/**
	 * Registers a listener to notify when model elements are locked or unlocked.
	 *
	 * @param listener
	 *            the listener to invoke when elements are locked on unlocked.
	 */
	void addLockStatusChangedListener(IConsumer<Collection<LockStatusChangeEvent>> listener);

	/**
	 * Unregisters the given listener.
	 *
	 * @param listener
	 *            The listener to unregister
	 */
	void removeLockStatusChangedListener(IConsumer<Collection<LockStatusChangeEvent>> listener);

	/**
	 * Attempts to take an exclusive lock on the specified elements. Callers should not assume the elements are actually
	 * locked until they receive the corresponding {@link LockStatusChangeEvent} notification through the
	 * {@link #onLockStatusChanged(IConsumer)} callback. There is no guarantee such a notification will be sent, if for
	 * example an element was already locked by some other context.
	 *
	 * @param elements
	 *            the elements to lock.
	 */
	void lock(Collection<EObject> elements);

	/**
	 * Attempts to release the locks on the specified elements. Callers should not assume the elements are actually
	 * locked until they receive the corresponding {@link LockStatusChangeEvent} notification through the
	 * {@link #onLockStatusChanged(IConsumer)} callback. There is no guarantee such a notification will be sent, if for
	 * example this editing context did not have a lock on a given element.
	 *
	 * @param elements
	 *            the elements to unlock.
	 */
	void unlock(Collection<EObject> elements);
}
