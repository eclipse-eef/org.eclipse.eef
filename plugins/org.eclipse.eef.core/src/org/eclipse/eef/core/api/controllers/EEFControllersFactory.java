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
package org.eclipse.eef.core.api.controllers;

import org.eclipse.eef.EEFTextDescription;
import org.eclipse.eef.core.api.IVariableManager;
import org.eclipse.eef.core.internal.controllers.EEFTextControllerImpl;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;

/**
 * This factory will be used to create the controllers.
 *
 * @author sbegaudeau
 */
public class EEFControllersFactory {
	/**
	 * Creates a new text controller.
	 *
	 * @param description
	 *            The description
	 * @param variableManager
	 *            The variable manager
	 * @param interpreter
	 *            The interpreter
	 * @param editingDomain
	 *            The editing domain
	 * @return A text controller
	 */
	public EEFTextController createTextController(EEFTextDescription description, IVariableManager variableManager, IInterpreter interpreter,
			TransactionalEditingDomain editingDomain) {
		return new EEFTextControllerImpl(description, variableManager, interpreter, editingDomain);
	}
}
