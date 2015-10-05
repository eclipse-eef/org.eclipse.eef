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
package org.eclipse.eef.core.internal;

import org.eclipse.eef.EEFContainerDescription;
import org.eclipse.eef.EEFGroupDescription;
import org.eclipse.eef.core.api.EEFContainer;
import org.eclipse.eef.core.api.EEFGroup;
import org.eclipse.eef.core.api.EEFPage;
import org.eclipse.eef.core.api.IVariableManager;
import org.eclipse.eef.interpreter.api.IInterpreter;

/**
 * The implementation of the {@link EEFGroup}.
 *
 * @author sbegaudeau
 */
public class EEFGroupImpl extends AbstractEEFChildObject implements EEFGroup {
	/**
	 * The description.
	 */
	private EEFGroupDescription eefGroupDescription;

	/**
	 * The containing {@link EEFPage}.
	 */
	private EEFPage eefPage;

	/**
	 * The {@link EEFContainer}.
	 */
	private EEFContainer eefContainer;

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
		super(variableManager, interpreter);
		this.eefPage = eefPage;
		this.eefGroupDescription = eefGroupDescription;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.EEFObject#createControl()
	 */
	@Override
	public void createControl() {
		EEFContainerDescription eefContainerDescription = this.eefGroupDescription.getContainer();
		String semanticCandidatesExpression = eefContainerDescription.getSemanticCandidatesExpression();
		if (semanticCandidatesExpression != null) {
			// TODO Support semantic candidates for the container
		}
		IVariableManager childVariableManager = this.getVariableManager().createChild();

		EEFContainerImpl eefContainerImpl = new EEFContainerImpl(this, this.eefGroupDescription.getContainer(), childVariableManager,
				this.getInterpreter());
		eefContainerImpl.createControl();
		this.eefContainer = eefContainerImpl;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.internal.AbstractEEFChildObject#fireUpdatedInput()
	 */
	@Override
	public void fireUpdatedInput() {
		if (this.eefContainer instanceof EEFContainerImpl) {
			EEFContainerImpl eefContainerImpl = (EEFContainerImpl) this.eefContainer;
			eefContainerImpl.fireUpdatedInput();
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.EEFGroup#getContainer()
	 */
	@Override
	public EEFContainer getContainer() {
		return this.eefContainer;
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

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.EEFChildObject#getParent()
	 */
	@Override
	public EEFPage getParent() {
		return this.eefPage;
	}
}
