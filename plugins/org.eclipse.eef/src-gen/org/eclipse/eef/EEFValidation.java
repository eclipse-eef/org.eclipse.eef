/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EEF Validation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a validation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eef.EEFValidation#getValidationExpression <em>Validation Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.EEFValidation#getQuickfixes <em>Quickfixes</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eef.EefPackage#getEEFValidation()
 * @model
 * @generated
 */
public interface EEFValidation extends EObject {
	/**
	 * Returns the value of the '<em><b>Validation Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines if the widget value is valid or not.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Validation Expression</em>' attribute.
	 * @see #setValidationExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFValidation_ValidationExpression()
	 * @model dataType="org.eclipse.sirius.expression.Expression"
	 * @generated
	 */
	String getValidationExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFValidation#getValidationExpression <em>Validation Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validation Expression</em>' attribute.
	 * @see #getValidationExpression()
	 * @generated
	 */
	void setValidationExpression(String value);

	/**
	 * Returns the value of the '<em><b>Quickfixes</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.eef.EEFQuickFix}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains all the quickfixes associated to a validation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quickfixes</em>' containment reference list.
	 * @see org.eclipse.eef.EefPackage#getEEFValidation_Quickfixes()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<EEFQuickFix> getQuickfixes();

} // EEFValidation
