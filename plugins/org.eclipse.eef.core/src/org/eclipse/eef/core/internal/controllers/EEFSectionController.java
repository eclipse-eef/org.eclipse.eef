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
package org.eclipse.eef.core.internal.controllers;

import org.eclipse.eef.EEFPageDescription;
import org.eclipse.eef.EefPackage;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.controllers.AbstractEEFController;
import org.eclipse.eef.core.api.controllers.IEEFSectionController;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;

/**
 * The controller of the section.
 *
 * @author sbegaudeau
 */
public class EEFSectionController extends AbstractEEFController implements IEEFSectionController {
	/**
	 * The description of the page.
	 */
	private EEFPageDescription description;

	/**
	 * The constructor.
	 *
	 * @param variableManager
	 *            The variable manager
	 * @param interpreter
	 *            The interpreter
	 * @param description
	 *            The description of the page
	 * @param editingContextAdapter
	 *            The editing context adapter
	 */
	public EEFSectionController(IVariableManager variableManager, IInterpreter interpreter, EEFPageDescription description,
			EditingContextAdapter editingContextAdapter) {
		super(variableManager, interpreter, editingContextAdapter);
		this.description = description;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.controllers.AbstractEEFController#getValidationRulesContainer()
	 */
	@Override
	protected EObject getValidationRulesContainer() {
		return this.description;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.controllers.AbstractEEFController#getValidationRulesReference()
	 */
	@Override
	protected EReference getValidationRulesReference() {
		return EefPackage.Literals.EEF_PAGE_DESCRIPTION__SEMANTIC_VALIDATION_RULES;
	}
}
