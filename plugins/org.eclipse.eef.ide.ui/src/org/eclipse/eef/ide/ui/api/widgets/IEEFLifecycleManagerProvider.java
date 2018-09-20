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
package org.eclipse.eef.ide.ui.api.widgets;

import org.eclipse.eef.EEFControlDescription;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;

/**
 * This interface is used to get the {@link IEEFLifecycleManager} for a control.
 *
 * @author mbats
 */
public interface IEEFLifecycleManagerProvider {

	/**
	 * Indicates if the lifecycle manager provider can handle the given control description.
	 *
	 * @param controlDescription
	 *            the description of the control
	 * @return <code>true</code> if the lifecycle manager can handle it, <code>false</code> otherwise
	 */
	boolean canHandle(EEFControlDescription controlDescription);

	/**
	 * Returns an {@link IEEFLifecycleManager} for the given description. This method should not return
	 * <code>null</code>, if a description is not supported, return false in the method canHandle.
	 *
	 * @param controlDescription
	 *            The control description
	 * @param variableManager
	 *            The variable manager
	 * @param interpreter
	 *            The interpreter
	 * @param editingContextAdapter
	 *            The editing context adapter
	 *
	 * @return An {@link IEEFLifecycleManager}
	 */
	IEEFLifecycleManager getLifecycleManager(EEFControlDescription controlDescription, IVariableManager variableManager, IInterpreter interpreter,
			EditingContextAdapter editingContextAdapter);

}
