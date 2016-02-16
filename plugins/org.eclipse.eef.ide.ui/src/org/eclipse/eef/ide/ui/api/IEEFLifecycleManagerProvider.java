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
package org.eclipse.eef.ide.ui.api;

import org.eclipse.eef.EEFCustomWidgetDescription;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;

/**
 * This interface is used to get the {@link ILifecycleManager} of a widget.
 *
 * @author mbats
 */
public interface IEEFLifecycleManagerProvider {
	/**
	 * Returns an {@link ILifecycleManager}.
	 *
	 * @param customWidgetDescription
	 *            The widget description
	 * @param variableManager
	 *            The variable manager
	 * @param interpreter
	 *            The interpreter
	 * @param editingDomain
	 *            The editing domain
	 *
	 * @return An {@link ILifecycleManager}
	 */
	ILifecycleManager getLifecycleManager(EEFCustomWidgetDescription customWidgetDescription, IVariableManager variableManager,
			IInterpreter interpreter, TransactionalEditingDomain editingDomain);

}
