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
 * <!-- begin-user-doc --> A representation of the model object '<em><b>EEF Custom Expression</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.eef.EEFCustomExpression#getIdentifier <em>Identifier</em>}</li>
 * <li>{@link org.eclipse.eef.EEFCustomExpression#getCustomExpression <em>Custom Expression</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eef.EefPackage#getEEFCustomExpression()
 * @model
 * @generated
 */
public interface EEFCustomExpression extends EObject {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * <!-- begin-model-doc --> Used to identify a specific widget. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see org.eclipse.eef.EefPackage#getEEFCustomExpression_Identifier()
	 * @model required="true"
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFCustomExpression#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Custom Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * --> <!-- begin-model-doc --> Defines the behavior associated to a custom expression. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Custom Expression</em>' attribute.
	 * @see #setCustomExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFCustomExpression_CustomExpression()
	 * @model
	 * @generated
	 */
	String getCustomExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFCustomExpression#getCustomExpression <em>Custom
	 * Expression</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Custom Expression</em>' attribute.
	 * @see #getCustomExpression()
	 * @generated
	 */
	void setCustomExpression(String value);

} // EEFCustomExpression
