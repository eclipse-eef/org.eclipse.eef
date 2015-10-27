/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EEF Link Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents an hyperlink in the user interface.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eef.EEFLinkDescription#getOnClickExpression <em>On Click Expression</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eef.EefPackage#getEEFLinkDescription()
 * @model
 * @generated
 */
public interface EEFLinkDescription extends EEFCellWidgetDescription {
	/**
	 * Returns the value of the '<em><b>On Click Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the behavior executed when the link is clicked.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>On Click Expression</em>' attribute.
	 * @see #setOnClickExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFLinkDescription_OnClickExpression()
	 * @model dataType="org.eclipse.sirius.expression.Expression"
	 * @generated
	 */
	String getOnClickExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFLinkDescription#getOnClickExpression <em>On Click Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Click Expression</em>' attribute.
	 * @see #getOnClickExpression()
	 * @generated
	 */
	void setOnClickExpression(String value);

} // EEFLinkDescription
