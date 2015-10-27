/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EEF Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a widget style.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eef.EEFStyle#getFontExpression <em>Font Expression</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eef.EefPackage#getEEFStyle()
 * @model abstract="true"
 * @generated
 */
public interface EEFStyle extends EObject {
	/**
	 * Returns the value of the '<em><b>Font Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the widget font.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Font Expression</em>' attribute.
	 * @see #setFontExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFStyle_FontExpression()
	 * @model dataType="org.eclipse.sirius.expression.Expression"
	 * @generated
	 */
	String getFontExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFStyle#getFontExpression <em>Font Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Expression</em>' attribute.
	 * @see #getFontExpression()
	 * @generated
	 */
	void setFontExpression(String value);

} // EEFStyle
