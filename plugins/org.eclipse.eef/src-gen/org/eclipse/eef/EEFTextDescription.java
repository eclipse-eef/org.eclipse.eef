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
 * <!-- begin-user-doc --> A representation of the model object '<em><b>EEF Text Description</b></em>'. <!--
 * end-user-doc -->
 *
 * <!-- begin-model-doc --> Represents a text field in the user interface. <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.eef.EEFTextDescription#getValueExpression <em>Value Expression</em>}</li>
 * <li>{@link org.eclipse.eef.EEFTextDescription#getEditExpression <em>Edit Expression</em>}</li>
 * <li>{@link org.eclipse.eef.EEFTextDescription#getLineCount <em>Line Count</em>}</li>
 * <li>{@link org.eclipse.eef.EEFTextDescription#getStyle <em>Style</em>}</li>
 * <li>{@link org.eclipse.eef.EEFTextDescription#getConditionalStyles <em>Conditional Styles</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eef.EefPackage#getEEFTextDescription()
 * @model
 * @generated
 */
public interface EEFTextDescription extends EEFWidgetDescription {
	/**
	 * Returns the value of the '<em><b>Value Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * --> <!-- begin-model-doc --> Indicates how to display the input value. <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Value Expression</em>' attribute.
	 * @see #setValueExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFTextDescription_ValueExpression()
	 * @model
	 * @generated
	 */
	String getValueExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFTextDescription#getValueExpression <em>Value Expression</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Value Expression</em>' attribute.
	 * @see #getValueExpression()
	 * @generated
	 */
	void setValueExpression(String value);

	/**
	 * Returns the value of the '<em><b>Edit Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * --> <!-- begin-model-doc --> Defines the behavior executed when the end-user updates the value of the text field.
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Edit Expression</em>' attribute.
	 * @see #setEditExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFTextDescription_EditExpression()
	 * @model
	 * @generated
	 */
	String getEditExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFTextDescription#getEditExpression <em>Edit Expression</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Edit Expression</em>' attribute.
	 * @see #getEditExpression()
	 * @generated
	 */
	void setEditExpression(String value);

	/**
	 * Returns the value of the '<em><b>Line Count</b></em>' attribute. The default value is <code>"1"</code>. <!--
	 * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Must be upper or equal to 1. If lineCount > 1,
	 * the text field is represented thanks to a text area. <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Line Count</em>' attribute.
	 * @see #setLineCount(int)
	 * @see org.eclipse.eef.EefPackage#getEEFTextDescription_LineCount()
	 * @model default="1"
	 * @generated
	 */
	int getLineCount();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFTextDescription#getLineCount <em>Line Count</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Line Count</em>' attribute.
	 * @see #getLineCount()
	 * @generated
	 */
	void setLineCount(int value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * --> <!-- begin-model-doc --> Defines the text style <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Style</em>' containment reference.
	 * @see #setStyle(EEFTextStyle)
	 * @see org.eclipse.eef.EefPackage#getEEFTextDescription_Style()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EEFTextStyle getStyle();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFTextDescription#getStyle <em>Style</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Style</em>' containment reference.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(EEFTextStyle value);

	/**
	 * Returns the value of the '<em><b>Conditional Styles</b></em>' containment reference list. The list contents are
	 * of type {@link org.eclipse.eef.EEFTextConditionalStyle}. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
	 * begin-model-doc --> Defines the text style associated to a precondition <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Conditional Styles</em>' containment reference list.
	 * @see org.eclipse.eef.EefPackage#getEEFTextDescription_ConditionalStyles()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<EEFTextConditionalStyle> getConditionalStyles();

} // EEFTextDescription
