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

import java.util.List;

import org.eclipse.eef.EEFViewDescription;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;

/**
 * The view if the root concept of the EEF model.
 *
 * @author sbegaudeau
 */
public interface EEFView {

	/**
	 * Initializes the view by creating the pages and groups used to compute the tab and section descriptors.
	 */
	void initialize();

	/**
	 * Sets the input of the view.
	 *
	 * @param input
	 *            The input
	 */
	void setInput(InputDescriptor input);

	/**
	 * Returns the description of the {@link EEFView}.
	 *
	 * @return The {@link EEFViewDescription}
	 */
	EEFViewDescription getDescription();

	/**
	 * Returns the {@link EEFPage} to display in the {@link EEFView}.
	 *
	 * @return The {@link EEFPage}
	 */
	List<EEFPage> getPages();

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
	 * Returns the editing context adapter.
	 *
	 * @return the context adapter.
	 */
	EditingContextAdapter getContextAdapter();
}
