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
package org.eclipse.eef.core.internal.controllers;

import org.eclipse.eef.EefPackage;
import org.eclipse.eef.core.api.utils.Eval;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;

/**
 * This class is used to provide utilities to reference widget controller.
 *
 * @author mbats
 */
public abstract class AbstractEEFReferenceController extends AbstractEEFWidgetController {

	/**
	 * The semantic element.
	 */
	protected EObject semanticElement;

	/**
	 * The reference.
	 */
	protected EStructuralFeature eReference;

	/**
	 * The reference value.
	 */
	protected Object eReferenceValue;

	/**
	 * The constructor.
	 *
	 * @param variableManager
	 *            The variable manager
	 * @param interpreter
	 *            The interpreter
	 * @param semanticElementExpression
	 *            The semantic element expression
	 * @param eReferenceNameExpression
	 *            The ereference name expression
	 */
	public AbstractEEFReferenceController(IVariableManager variableManager, IInterpreter interpreter, String semanticElementExpression,
			String eReferenceNameExpression) {
		super(variableManager, interpreter);

		// Get the semantic element
		EAttribute eAttribute = EefPackage.Literals.EEF_REFERENCE_DESCRIPTION__SEMANTIC_ELEMENT_EXPRESSION;
		semanticElement = new Eval(this.interpreter, this.variableManager).get(eAttribute, semanticElementExpression, EObject.class);

		if (semanticElement != null) {
			// Get the reference name
			eAttribute = EefPackage.Literals.EEF_REFERENCE_DESCRIPTION__EREFERENCE_NAME_EXPRESSION;
			String eReferenceName = new Eval(this.interpreter, this.variableManager).get(eAttribute, eReferenceNameExpression, String.class);

			// Get the reference
			eReference = semanticElement.eClass().getEStructuralFeature(eReferenceName);

			if (eReference != null) {
				// Get the reference value
				eReferenceValue = semanticElement.eGet(eReference);
			}
		}
	}
}
