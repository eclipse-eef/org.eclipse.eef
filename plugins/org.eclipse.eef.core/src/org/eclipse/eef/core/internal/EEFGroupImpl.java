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
package org.eclipse.eef.core.internal;

import org.eclipse.eef.EEFGroupDescription;
import org.eclipse.eef.core.api.EEFGroup;
import org.eclipse.eef.core.api.EEFPage;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;

/**
 * The implementation of the {@link EEFGroup}.
 *
 * @author sbegaudeau
 */
public class EEFGroupImpl implements EEFGroup {
	/**
	 * The variable manager.
	 */
	private IVariableManager variableManager;

	/**
	 * The interpreter.
	 */
	private IInterpreter interpreter;

	/**
	 * The description.
	 */
	private EEFGroupDescription eefGroupDescription;

	/**
	 * The containing {@link EEFPage}.
	 */
	private EEFPage eefPage;

	/**
	 * The constructor.
	 *
	 * @param eefPage
	 *            The containing {@link EEFPage}
	 * @param eefGroupDescription
	 *            The description
	 * @param variableManager
	 *            The variable manager.
	 * @param interpreter
	 *            The interpreter
	 */
	public EEFGroupImpl(EEFPage eefPage, EEFGroupDescription eefGroupDescription, IVariableManager variableManager, IInterpreter interpreter) {
		this.variableManager = variableManager;
		this.interpreter = interpreter;
		this.eefPage = eefPage;
		this.eefGroupDescription = eefGroupDescription;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.EEFGroup#getDescription()
	 */
	@Override
	public EEFGroupDescription getDescription() {
		return this.eefGroupDescription;
	}

	@Override
	public EEFPage getPage() {
		return this.eefPage;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.EEFGroup#getVariableManager()
	 */
	@Override
	public IVariableManager getVariableManager() {
		return this.variableManager;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.EEFGroup#getInterpreter()
	 */
	@Override
	public IInterpreter getInterpreter() {
		return this.interpreter;
	}

}
