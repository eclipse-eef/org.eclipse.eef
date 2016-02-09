/*******************************************************************************
 * Copyright (c) 2015, 2016 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.eef.core.api.controllers;

import org.eclipse.eef.EEFCheckboxDescription;
import org.eclipse.eef.EEFGroupDescription;
import org.eclipse.eef.EEFLabelDescription;
import org.eclipse.eef.EEFRadioDescription;
import org.eclipse.eef.EEFSelectDescription;
import org.eclipse.eef.EEFTextDescription;
import org.eclipse.eef.core.internal.controllers.EEFCheckboxController;
import org.eclipse.eef.core.internal.controllers.EEFGroupController;
import org.eclipse.eef.core.internal.controllers.EEFLabelController;
import org.eclipse.eef.core.internal.controllers.EEFRadioController;
import org.eclipse.eef.core.internal.controllers.EEFSelectController;
import org.eclipse.eef.core.internal.controllers.EEFTextController;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;

/**
 * This factory will be used to create the controllers.
 *
 * @author sbegaudeau
 */
public class EEFControllersFactory {

	/**
	 * Creates a new group controller.
	 *
	 * @param description
	 *            The description
	 * @param variableManager
	 *            The variable manager
	 * @param interpreter
	 *            The interpreter
	 * @return The group controller
	 */
	public IEEFGroupController createGroupController(EEFGroupDescription description, IVariableManager variableManager, IInterpreter interpreter) {
		return new EEFGroupController(description, variableManager, interpreter);
	}

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
	public IEEFTextController createTextController(EEFTextDescription description, IVariableManager variableManager, IInterpreter interpreter,
			TransactionalEditingDomain editingDomain) {
		return new EEFTextController(description, variableManager, interpreter, editingDomain);
	}

	/**
	 * Creates a new label controller.
	 *
	 * @param description
	 *            The description
	 * @param variableManager
	 *            The variable manager
	 * @param interpreter
	 *            The interpreter
	 * @return A label controller
	 */
	public IEEFLabelController createLabelController(EEFLabelDescription description, IVariableManager variableManager, IInterpreter interpreter) {
		return new EEFLabelController(description, variableManager, interpreter);
	}

	/**
	 * Creates a new select controller.
	 *
	 * @param description
	 *            The description
	 * @param variableManager
	 *            The variable manager
	 * @param interpreter
	 *            The interpreter
	 * @param editingDomain
	 *            The editing domain
	 * @return A label controller
	 */
	public IEEFSelectController createSelectController(EEFSelectDescription description, IVariableManager variableManager, IInterpreter interpreter,
			TransactionalEditingDomain editingDomain) {
		return new EEFSelectController(description, variableManager, interpreter, editingDomain);
	}

	/**
	 * Creates a new checkbox controller.
	 *
	 * @param description
	 *            The description
	 * @param variableManager
	 *            The variable manager
	 * @param interpreter
	 *            The interpreter
	 * @param editingDomain
	 *            The editing domain
	 * @return A checkbox controller
	 */
	public IEEFCheckboxController createCheckboxController(EEFCheckboxDescription description, IVariableManager variableManager,
			IInterpreter interpreter, TransactionalEditingDomain editingDomain) {
		return new EEFCheckboxController(description, variableManager, interpreter, editingDomain);

	}

	/**
	 * Creates a new radio controller.
	 *
	 * @param description
	 *            The description
	 * @param variableManager
	 *            The variable manager
	 * @param interpreter
	 *            The interpreter
	 * @param editingDomain
	 *            The editing domain
	 * @return A radio controller
	 */
	public IEEFRadioController createRadioController(EEFRadioDescription description, IVariableManager variableManager, IInterpreter interpreter,
			TransactionalEditingDomain editingDomain) {
		return new EEFRadioController(description, variableManager, interpreter, editingDomain);
	}
}
