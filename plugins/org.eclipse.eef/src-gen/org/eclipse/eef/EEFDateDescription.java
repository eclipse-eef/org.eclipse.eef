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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EEF Date Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a date field in the user interface.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eef.EEFDateDescription#getDisplay <em>Display</em>}</li>
 *   <li>{@link org.eclipse.eef.EEFDateDescription#getValueExpression <em>Value Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.EEFDateDescription#getEditExpression <em>Edit Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.EEFDateDescription#getStyle <em>Style</em>}</li>
 *   <li>{@link org.eclipse.eef.EEFDateDescription#getConditionalStyles <em>Conditional Styles</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eef.EefPackage#getEEFDateDescription()
 * @model
 * @generated
 */
public interface EEFDateDescription extends EEFWidgetDescription {
	/**
	 * Returns the value of the '<em><b>Display</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.eef.EEF_DATE_DISPLAY}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display</em>' attribute.
	 * @see org.eclipse.eef.EEF_DATE_DISPLAY
	 * @see #setDisplay(EEF_DATE_DISPLAY)
	 * @see org.eclipse.eef.EefPackage#getEEFDateDescription_Display()
	 * @model
	 * @generated
	 */
	EEF_DATE_DISPLAY getDisplay();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFDateDescription#getDisplay <em>Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display</em>' attribute.
	 * @see org.eclipse.eef.EEF_DATE_DISPLAY
	 * @see #getDisplay()
	 * @generated
	 */
	void setDisplay(EEF_DATE_DISPLAY value);

	/**
	 * Returns the value of the '<em><b>Value Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates how to display the input value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Expression</em>' attribute.
	 * @see #setValueExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFDateDescription_ValueExpression()
	 * @model
	 * @generated
	 */
	String getValueExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFDateDescription#getValueExpression <em>Value Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Expression</em>' attribute.
	 * @see #getValueExpression()
	 * @generated
	 */
	void setValueExpression(String value);

	/**
	 * Returns the value of the '<em><b>Edit Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the behavior executed when the end-user updates the value of the date field.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Edit Expression</em>' attribute.
	 * @see #setEditExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFDateDescription_EditExpression()
	 * @model
	 * @generated
	 */
	String getEditExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFDateDescription#getEditExpression <em>Edit Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edit Expression</em>' attribute.
	 * @see #getEditExpression()
	 * @generated
	 */
	void setEditExpression(String value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the date style
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Style</em>' containment reference.
	 * @see #setStyle(EEFDateStyle)
	 * @see org.eclipse.eef.EefPackage#getEEFDateDescription_Style()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EEFDateStyle getStyle();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFDateDescription#getStyle <em>Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' containment reference.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(EEFDateStyle value);

	/**
	 * Returns the value of the '<em><b>Conditional Styles</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.eef.EEFDateConditionalStyle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the date style associated to a precondition
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conditional Styles</em>' containment reference list.
	 * @see org.eclipse.eef.EefPackage#getEEFDateDescription_ConditionalStyles()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<EEFDateConditionalStyle> getConditionalStyles();

} // EEFDateDescription
