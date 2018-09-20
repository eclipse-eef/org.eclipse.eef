/*******************************************************************************
 * Copyright (c) 2015, 2018 Obeo.
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

import org.eclipse.eef.EEFGroupDescription;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;

/**
 * The {@link EEFGroup} is used as the main structure within a page.
 *
 * @author sbegaudeau
 */
public interface EEFGroup {
	/**
	 * Returns the description of the {@link EEFGroup}.
	 *
	 * @return The {@link EEFGroupDescription}
	 */
	EEFGroupDescription getDescription();

	/**
	 * Returns the page containing the group.
	 *
	 * @return The page containing the group
	 */
	EEFPage getPage();

	/**
	 * Returns the variable manager.
	 *
	 * @return The variable manager
	 */
	IVariableManager getVariableManager();

	/**
	 * Returns the interpreter.
	 *
	 * @return The interpreter
	 */
	IInterpreter getInterpreter();
}
