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
 * <!-- begin-user-doc --> A representation of the model object '<em><b>EEF List Description</b></em>'. <!--
 * end-user-doc -->
 *
 * <!-- begin-model-doc --> Represents a list in the user interface. <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.eef.EEFListDescription#getValueExpression <em>Value Expression</em>}</li>
 * <li>{@link org.eclipse.eef.EEFListDescription#getDisplayExpression <em>Display Expression</em>}</li>
 * <li>{@link org.eclipse.eef.EEFListDescription#getOnClickExpression <em>On Click Expression</em>}</li>
 * <li>{@link org.eclipse.eef.EEFListDescription#getActions <em>Actions</em>}</li>
 * <li>{@link org.eclipse.eef.EEFListDescription#getStyle <em>Style</em>}</li>
 * <li>{@link org.eclipse.eef.EEFListDescription#getConditionalStyles <em>Conditional Styles</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.eef.EefPackage#getEEFListDescription()
 * @model
 * @generated
 */
public interface EEFListDescription extends EEFWidgetDescription {
	/**
	 * Returns the value of the '<em><b>Value Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * --> <!-- begin-model-doc --> Defines the input value. <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Value Expression</em>' attribute.
	 * @see #setValueExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFListDescription_ValueExpression()
	 * @model
	 * @generated
	 */
	String getValueExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFListDescription#getValueExpression <em>Value Expression</em>}'
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
	 * end-user-doc --> <!-- begin-model-doc --> Indicates how to display the input value. <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Display Expression</em>' attribute.
	 * @see #setDisplayExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFListDescription_DisplayExpression()
	 * @model
	 * @generated
	 */
	String getDisplayExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFListDescription#getDisplayExpression
	 * <em>Display Expression</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Display Expression</em>' attribute.
	 * @see #getDisplayExpression()
	 * @generated
	 */
	void setDisplayExpression(String value);

	/**
	 * Returns the value of the '<em><b>On Click Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc --> Defines the behavior related to the onclick action. <!-- end-model-doc
	 * -->
	 *
	 * @return the value of the '<em>On Click Expression</em>' attribute.
	 * @see #setOnClickExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFListDescription_OnClickExpression()
	 * @model
	 * @generated
	 */
	String getOnClickExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFListDescription#getOnClickExpression
	 * <em>On Click Expression</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>On Click Expression</em>' attribute.
	 * @see #getOnClickExpression()
	 * @generated
	 */
	void setOnClickExpression(String value);

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
	 * @see org.eclipse.eef.EefPackage#getEEFListDescription_Actions()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<EEFWidgetAction> getActions();

	/**
	 * Returns the value of the '<em><b>Style</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * --> <!-- begin-model-doc --> Defines the style of the list <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Style</em>' containment reference.
	 * @see #setStyle(EEFListStyle)
	 * @see org.eclipse.eef.EefPackage#getEEFListDescription_Style()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EEFListStyle getStyle();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFListDescription#getStyle <em>Style</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Style</em>' containment reference.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(EEFListStyle value);

	/**
	 * Returns the value of the '<em><b>Conditional Styles</b></em>' containment reference list. The list contents are
	 * of type {@link org.eclipse.eef.EEFListConditionalStyle}. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
	 * begin-model-doc --> Defines the list style associated to a precondition <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Conditional Styles</em>' containment reference list.
	 * @see org.eclipse.eef.EefPackage#getEEFListDescription_ConditionalStyles()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<EEFListConditionalStyle> getConditionalStyles();

} // EEFListDescription
