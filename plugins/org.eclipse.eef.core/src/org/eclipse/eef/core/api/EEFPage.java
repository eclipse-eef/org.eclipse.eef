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

import java.util.List;

import org.eclipse.eef.EEFPageDescription;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;

/**
 * The {@link EEFPage} will control the content of a tab.
 *
 * @author sbegaudeau
 */
public interface EEFPage {
	/**
	 * Returns the description of the {@link EEFPage}.
	 *
	 * @return The {@link EEFPageDescription}
	 */
	EEFPageDescription getDescription();

	/**
	 * Returns the label.
	 *
	 * @return The label
	 */
	String getLabel();

	/**
	 * Returns the {@link EEFGroup} composing this {@link EEFPage}.
	 *
	 * @return The {@link EEFGroup}
	 */
	List<EEFGroup> getGroups();

	/**
	 * Returns the view containing the page.
	 *
	 * @return The view containing the page
	 */
	EEFView getView();

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
	 * Indicates if this page is the only instantiation of the page description.
	 *
	 * @return <code>true</code> if this page is the only page created from the page description, <code>false</code>
	 *         otherwise.
	 */
	boolean isUnique();

}
