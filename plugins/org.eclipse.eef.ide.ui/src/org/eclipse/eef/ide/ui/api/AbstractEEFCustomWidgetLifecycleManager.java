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

import org.eclipse.eef.EEFCustomDescription;
import org.eclipse.eef.ide.ui.internal.widgets.AbstractEEFWidgetLifecycleManager;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;

/**
 * Parent of all the custom lifecycle managers.
 *
 * @author mbats
 */
public abstract class AbstractEEFCustomWidgetLifecycleManager extends AbstractEEFWidgetLifecycleManager {

	/**
	 * The description.
	 */
	private EEFCustomDescription description;

	/**
	 * The constructor.
	 *
	 * @param description
	 *            The description
	 * @param variableManager
	 *            The variable manager
	 * @param interpreter
	 *            The interpreter
	 * @param editingDomain
	 *            The editing domain
	 */
	public AbstractEEFCustomWidgetLifecycleManager(EEFCustomDescription description, IVariableManager variableManager, IInterpreter interpreter,
			TransactionalEditingDomain editingDomain) {
		super(variableManager, interpreter, editingDomain);

		this.description = description;
	}

	/**
	 * Get the variable manager.
	 *
	 * @return Variable manager
	 */
	protected IVariableManager getVariableManager() {
		return this.variableManager;
	}

	/**
	 * Get description.
	 *
	 * @return EEF custom description
	 */
	protected EEFCustomDescription getDescription() {
		return this.description;
	}

	/**
	 * Get the interpreter.
	 *
	 * @return Interpreter
	 */
	protected IInterpreter getInterpreter() {
		return this.interpreter;
	}

	/**
	 * Get editing domain.
	 *
	 * @return Editing domain
	 */
	protected TransactionalEditingDomain getEditingDomain() {
		return this.editingDomain;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.internal.widgets.AbstractEEFWidgetLifecycleManager#aboutToBeShown()
	 */
	@Override
	public void aboutToBeShown() {
		super.aboutToBeShown();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.internal.widgets.AbstractEEFWidgetLifecycleManager#aboutToBeHidden()
	 */
	@Override
	public void aboutToBeHidden() {
		super.aboutToBeHidden();
	}
}
