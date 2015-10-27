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
 * A representation of the model object '<em><b>EEF Conditional Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a conditional style.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eef.EEFConditionalStyle#getConditionalExpression <em>Conditional Expression</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eef.EefPackage#getEEFConditionalStyle()
 * @model abstract="true"
 * @generated
 */
public interface EEFConditionalStyle extends EObject {
	/**
	 * Returns the value of the '<em><b>Conditional Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the condition on which a style must be applied on a widget.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conditional Expression</em>' attribute.
	 * @see #setConditionalExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFConditionalStyle_ConditionalExpression()
	 * @model dataType="org.eclipse.sirius.expression.Expression"
	 * @generated
	 */
	String getConditionalExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFConditionalStyle#getConditionalExpression <em>Conditional Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditional Expression</em>' attribute.
	 * @see #getConditionalExpression()
	 * @generated
	 */
	void setConditionalExpression(String value);

} // EEFConditionalStyle
