/**
 * Copyright (c) 2015, 2018 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>EEF Validation Fix Description</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.eef.EEFValidationFixDescription#getName <em>Name</em>}</li>
 * <li>{@link org.eclipse.eef.EEFValidationFixDescription#getFixExpression <em>Fix Expression</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eef.EefPackage#getEEFValidationFixDescription()
 * @model
 * @generated
 */
public interface EEFValidationFixDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
	 * begin-model-doc --> The name of the validation fix to be displayed to the end user. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.eef.EefPackage#getEEFValidationFixDescription_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFValidationFixDescription#getName <em>Name</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Fix Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * --> <!-- begin-model-doc --> The expression to be used to fix an issue with the validation. <!-- end-model-doc
	 * -->
	 * 
	 * @return the value of the '<em>Fix Expression</em>' attribute.
	 * @see #setFixExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFValidationFixDescription_FixExpression()
	 * @model required="true"
	 * @generated
	 */
	String getFixExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFValidationFixDescription#getFixExpression <em>Fix
	 * Expression</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Fix Expression</em>' attribute.
	 * @see #getFixExpression()
	 * @generated
	 */
	void setFixExpression(String value);

} // EEFValidationFixDescription
