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

import org.eclipse.eef.EEFGroupDescription;
import org.eclipse.eef.core.api.EEFContainer;
import org.eclipse.eef.core.api.EEFExpressionUtils;
import org.eclipse.eef.core.api.EEFGroup;
import org.eclipse.eef.core.api.EEFPage;
import org.eclipse.eef.core.api.IVariableManager;
import org.eclipse.eef.interpreter.api.IInterpreter;
import org.eclipse.emf.transaction.TransactionalEditingDomain;

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
	 * The editing domain.
	 */
	private TransactionalEditingDomain editingDomain;

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
	 * @param editingDomain
	 *            The editing domain
	 */
	public EEFGroupImpl(EEFPage eefPage, EEFGroupDescription eefGroupDescription, IVariableManager variableManager, IInterpreter interpreter,
			TransactionalEditingDomain editingDomain) {
		super(variableManager, interpreter);
		this.eefPage = eefPage;
		this.eefGroupDescription = eefGroupDescription;
		this.editingDomain = editingDomain;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.EEFObject#createControl()
	 */
	@Override
	public void createControl() {
		EEFContainerImpl eefContainerImpl = new EEFContainerImpl(this, this.eefGroupDescription.getContainer(), this.getVariableManager(),
				this.getInterpreter(), this.editingDomain);
		eefContainerImpl.createControl();
		this.eefContainer = eefContainerImpl;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.EEFObject#setInput(java.lang.Object)
	 */
	@Override
	public void setInput(Object object) {
		this.getVariableManager().put(EEFExpressionUtils.EEFGroup.GROUP_SEMANTIC_CANDIDATE, object);
		if (this.eefContainer instanceof EEFContainerImpl) {
			EEFContainerImpl eefContainerImpl = (EEFContainerImpl) this.eefContainer;
			eefContainerImpl.setInput(null);
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
