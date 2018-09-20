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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>EEF Label Description</b></em>'. <!--
 * end-user-doc -->
 *
 * <!-- begin-model-doc --> Represents a label in the user interface. <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.eef.EEFLabelDescription#getValueExpression <em>Value Expression</em>}</li>
 * <li>{@link org.eclipse.eef.EEFLabelDescription#getDisplayExpression <em>Display Expression</em>}</li>
 * <li>{@link org.eclipse.eef.EEFLabelDescription#getStyle <em>Style</em>}</li>
 * <li>{@link org.eclipse.eef.EEFLabelDescription#getConditionalStyles <em>Conditional Styles</em>}</li>
 * <li>{@link org.eclipse.eef.EEFLabelDescription#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eef.EefPackage#getEEFLabelDescription()
 * @model
 * @generated
 */
public interface EEFLabelDescription extends EEFWidgetDescription {
	/**
	 * Returns the value of the '<em><b>Value Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * --> <!-- begin-model-doc --> The body of the label containing the meaningful content <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Value Expression</em>' attribute.
	 * @see #setValueExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFLabelDescription_ValueExpression()
	 * @model
	 * @generated
	 */
	String getValueExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFLabelDescription#getValueExpression <em>Value Expression</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Value Expression</em>' attribute.
	 * @see #getValueExpression()
	 * @generated
	 */
	void setValueExpression(String value);

	/**
	 * Returns the value of the '<em><b>Display Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc --> This function will return the label to display <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Display Expression</em>' attribute.
	 * @see #setDisplayExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFLabelDescription_DisplayExpression()
	 * @model
	 * @generated
	 */
	String getDisplayExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFLabelDescription#getDisplayExpression <em>Display
	 * Expression</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Display Expression</em>' attribute.
	 * @see #getDisplayExpression()
	 * @generated
	 */
	void setDisplayExpression(String value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * --> <!-- begin-model-doc --> Defines the label style <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Style</em>' containment reference.
	 * @see #setStyle(EEFLabelStyle)
	 * @see org.eclipse.eef.EefPackage#getEEFLabelDescription_Style()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EEFLabelStyle getStyle();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFLabelDescription#getStyle <em>Style</em>}' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Style</em>' containment reference.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(EEFLabelStyle value);

	/**
	 * Returns the value of the '<em><b>Conditional Styles</b></em>' containment reference list. The list contents are
	 * of type {@link org.eclipse.eef.EEFLabelConditionalStyle}. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
	 * begin-model-doc --> Defines the label style associated to a precondition <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Conditional Styles</em>' containment reference list.
	 * @see org.eclipse.eef.EefPackage#getEEFLabelDescription_ConditionalStyles()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<EEFLabelConditionalStyle> getConditionalStyles();

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list. The list contents are of type
	 * {@link org.eclipse.eef.EEFWidgetAction}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see org.eclipse.eef.EefPackage#getEEFLabelDescription_Actions()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<EEFWidgetAction> getActions();

} // EEFLabelDescription
