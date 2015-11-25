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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.eef.EEFContainerDescription;
import org.eclipse.eef.EEFTextDescription;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.core.api.EEFContainer;
import org.eclipse.eef.core.api.EEFContainerParent;
import org.eclipse.eef.core.api.EEFWidget;
import org.eclipse.eef.core.api.IVariableManager;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;

/**
 * Implementation of the {@link EEFContainer}.
 *
 * @author sbegaudeau
 */
public class EEFContainerImpl extends AbstractEEFChildObject implements EEFContainer {

	/**
	 * The parent of the {@link EEFContainer}.
	 */
	private EEFContainerParent eefContainerParent;

	/**
	 * The description.
	 */
	private EEFContainerDescription eefContainerDescription;

	/**
	 * The widgets.
	 */
	private List<EEFWidget> eWidgets = new ArrayList<EEFWidget>();

	/**
	 * The editing domain.
	 */
	private TransactionalEditingDomain editingDomain;

	/**
	 * The constructor.
	 *
	 * @param eefContainerParent
	 *            The parent of the container
	 * @param eefContainerDescription
	 *            The description
	 * @param variableManager
	 *            The variable manager
	 * @param interpreter
	 *            The interpreter
	 * @param editingDomain
	 *            The editing domain
	 */
	public EEFContainerImpl(EEFContainerParent eefContainerParent, EEFContainerDescription eefContainerDescription, IVariableManager variableManager,
			IInterpreter interpreter, TransactionalEditingDomain editingDomain) {
		super(variableManager, interpreter);
		this.eefContainerDescription = eefContainerDescription;
		this.eefContainerParent = eefContainerParent;
		this.editingDomain = editingDomain;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.EEFObject#createControl()
	 */
	@Override
	public void createControl() {
		List<EEFWidgetDescription> eefWidgetDescriptions = this.eefContainerDescription.getWidgets();
		for (EEFWidgetDescription eefWidgetDescription : eefWidgetDescriptions) {
			if (eefWidgetDescription instanceof EEFTextDescription) {
				EEFTextDescription eefTextDescription = (EEFTextDescription) eefWidgetDescription;
				IVariableManager childVariableManager = this.getVariableManager().createChild();
				EEFTextImpl eefTextImpl = new EEFTextImpl(this, eefTextDescription, childVariableManager, this.getInterpreter(), this.editingDomain);
				eefTextImpl.createControl();
				this.eWidgets.add(eefTextImpl);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.EEFObject#setInput(java.lang.Object)
	 */
	@Override
	public void setInput(Object object) {
		for (EEFWidget eefWidget : this.eWidgets) {
			if (eefWidget instanceof AbstractEEFWidgetImpl) {
				AbstractEEFWidgetImpl eefWidgetImpl = (AbstractEEFWidgetImpl) eefWidget;
				eefWidgetImpl.setInput(null);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.EEFContainer#getDescription()
	 */
	@Override
	public EEFContainerDescription getDescription() {
		return this.eefContainerDescription;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.EEFContainer#getWidgets()
	 */
	@Override
	public List<EEFWidget> getWidgets() {
		return this.eWidgets;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.EEFChildObject#getParent()
	 */
	@Override
	public EEFContainerParent getParent() {
		return this.eefContainerParent;
	}

}
