/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef.eef;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EEF Image Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents an image in the user interface.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eef.eef.EEFImageDescription#getValueExpression <em>Value Expression</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eef.eef.EefPackage#getEEFImageDescription()
 * @model
 * @generated
 */
public interface EEFImageDescription extends EEFCellWidgetDescription {
	/**
	 * Returns the value of the '<em><b>Value Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * URI of the image to display. The URI requires a scheme and is considered by the EEF runtime as an EMF URI. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Expression</em>' attribute.
	 * @see #setValueExpression(String)
	 * @see org.eclipse.eef.eef.EefPackage#getEEFImageDescription_ValueExpression()
	 * @model dataType="org.eclipse.eef.eef.Expression"
	 * @generated
	 */
	String getValueExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.eef.EEFImageDescription#getValueExpression <em>Value Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Expression</em>' attribute.
	 * @see #getValueExpression()
	 * @generated
	 */
	void setValueExpression(String value);

} // EEFImageDescription
