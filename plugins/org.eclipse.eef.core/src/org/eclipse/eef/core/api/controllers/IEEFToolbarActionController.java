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
import org.eclipse.eef.EEFToolbarAction;

/**
 * The EEFToolbarActionController is responsible of supporting the execution of the action.
 *
 * @author arichard
 *
 */
public interface IEEFToolbarActionController {

	/**
	 * Invoked when the user clicks on an action button.
	 *
	 * @param action
	 *            Toolbar action
	 * @return the status of the action execution
	 */
	IStatus action(EEFToolbarAction action);
}
