/*******************************************************************************
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.eef.core.api;

/**
 * Implementations are able to notify registered listeners when external changes to the model are detected.
 *
 * @author pcdavid
 */
public interface ModelChangeDetector {

	/**
	 * Registers a listener to notify when changes on the underlying model are detected from outside of the view itself.
	 *
	 * @param trigger
	 *            the listener to register.
	 */
	void addExternalModelChangeListener(Runnable trigger);

	/**
	 * De-registers a listener to notify when changes on the underlying model are detected from outside of the view
	 * itself.
	 *
	 * @param trigger
	 *            the listener to deregister.
	 */
	void removeExternalModelChangeListener(Runnable trigger);

}