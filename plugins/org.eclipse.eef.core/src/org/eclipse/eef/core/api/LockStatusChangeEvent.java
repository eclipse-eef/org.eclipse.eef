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

import java.text.MessageFormat;

import org.eclipse.emf.ecore.EObject;

/**
 * Represents a change in the lock status of an {@link EObject}.
 *
 * @author pcdavid
 */
public class LockStatusChangeEvent {
	/**
	 * The possible lock status.
	 *
	 * @author pcdavid
	 */
	public enum LockStatus {
	/**
	 * Status to indicate that a EObject is locked by the current editing context.
	 */
	LOCKED_BY_ME,
	/**
	 * Status to indicate that a EObject is locked by another editing context.
	 */
	LOCKED_BY_OTHER,
	/**
	 * Status to indicate that a EObject is locked because of a permission issue.
	 */
	LOCKED_PERMISSION,
	/**
	 * Status to indicate that a EObject is not locked.
	 */
	UNLOCKED
	}

	/**
	 * The element whose lock status changed.
	 */
	private final EObject element;

	/**
	 * The new lock status.
	 */
	private final LockStatus status;

	/**
	 * Creates a new {@link LockStatusChangeEvent}.
	 *
	 * @param element
	 *            the element whose lock status changed.
	 * @param status
	 *            the new lock status.
	 */
	public LockStatusChangeEvent(EObject element, LockStatus status) {
		this.element = element;
		this.status = status;
	}

	/**
	 * Returns the element whose lock status changed.
	 *
	 * @return The element whose lock status changed.
	 */
	public EObject getElement() {
		return this.element;
	}

	/**
	 * Returns the new lock status.
	 *
	 * @return The new lock status.
	 */
	public LockStatus getStatus() {
		return this.status;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return MessageFormat.format("{0} => {1}", element, status); //$NON-NLS-1$
	}
}
