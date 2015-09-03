/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef.eef;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.sirius.context.context.ContextVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contextable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents an element which can provide a context.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eef.eef.ContextableElement#getRequiredContextVariables <em>Required Context Variables</em>}</li>
 *   <li>{@link org.eclipse.eef.eef.ContextableElement#getExcludedContextVariables <em>Excluded Context Variables</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eef.eef.EefPackage#getContextableElement()
 * @model abstract="true"
 * @generated
 */
public interface ContextableElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Required Context Variables</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.context.context.ContextVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines variables associated to the required contexts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required Context Variables</em>' containment reference list.
	 * @see org.eclipse.eef.eef.EefPackage#getContextableElement_RequiredContextVariables()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<ContextVariable> getRequiredContextVariables();

	/**
	 * Returns the value of the '<em><b>Excluded Context Variables</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.context.context.ContextVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines variables associated to the excluded contexts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Excluded Context Variables</em>' containment reference list.
	 * @see org.eclipse.eef.eef.EefPackage#getContextableElement_ExcludedContextVariables()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<ContextVariable> getExcludedContextVariables();

} // ContextableElement
