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

import org.eclipse.eef.EEFGroupDescription;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;

/**
 * The {@link EEFGroup} is used as the main structure within a page.
 *
 * @author sbegaudeau
 */
public interface EEFGroup extends EEFContainerParent {
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

	/**
	 * Returns the editing domain.
	 *
	 * @return The editing domain
	 */
	TransactionalEditingDomain getEditingDomain();
}
