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
 * <!-- begin-user-doc --> A representation of the model object '<em><b>EEF Button Description</b></em>'. <!--
 * end-user-doc -->
 *
 * <!-- begin-model-doc --> Represents a button in the user interface. <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.eef.EEFButtonDescription#getButtonLabelExpression <em>Button Label Expression</em>}</li>
 * <li>{@link org.eclipse.eef.EEFButtonDescription#getImageExpression <em>Image Expression</em>}</li>
 * <li>{@link org.eclipse.eef.EEFButtonDescription#getPushExpression <em>Push Expression</em>}</li>
 * <li>{@link org.eclipse.eef.EEFButtonDescription#getStyle <em>Style</em>}</li>
 * <li>{@link org.eclipse.eef.EEFButtonDescription#getConditionalStyles <em>Conditional Styles</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eef.EefPackage#getEEFButtonDescription()
 * @model
 * @generated
 */
public interface EEFButtonDescription extends EEFWidgetDescription {
	/**
	 * Returns the value of the '<em><b>Button Label Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc --> Label of the button visible in the user interface. <!-- end-model-doc
	 * -->
	 * 
	 * @return the value of the '<em>Button Label Expression</em>' attribute.
	 * @see #setButtonLabelExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFButtonDescription_ButtonLabelExpression()
	 * @model
	 * @generated
	 */
	String getButtonLabelExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFButtonDescription#getButtonLabelExpression <em>Button Label
	 * Expression</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Button Label Expression</em>' attribute.
	 * @see #getButtonLabelExpression()
	 * @generated
	 */
	void setButtonLabelExpression(String value);

	/**
	 * Returns the value of the '<em><b>Image Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * --> <!-- begin-model-doc --> Image of the button visible in the user interface. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Image Expression</em>' attribute.
	 * @see #setImageExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFButtonDescription_ImageExpression()
	 * @model
	 * @generated
	 */
	String getImageExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFButtonDescription#getImageExpression <em>Image Expression</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Image Expression</em>' attribute.
	 * @see #getImageExpression()
	 * @generated
	 */
	void setImageExpression(String value);

	/**
	 * Returns the value of the '<em><b>Push Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * --> <!-- begin-model-doc --> Defines the behavior executed when the end-user pushed the button. <!--
	 * end-model-doc -->
	 * 
	 * @return the value of the '<em>Push Expression</em>' attribute.
	 * @see #setPushExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFButtonDescription_PushExpression()
	 * @model
	 * @generated
	 */
	String getPushExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFButtonDescription#getPushExpression <em>Push Expression</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Push Expression</em>' attribute.
	 * @see #getPushExpression()
	 * @generated
	 */
	void setPushExpression(String value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * --> <!-- begin-model-doc --> Defines the button style <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Style</em>' containment reference.
	 * @see #setStyle(EEFButtonStyle)
	 * @see org.eclipse.eef.EefPackage#getEEFButtonDescription_Style()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EEFButtonStyle getStyle();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFButtonDescription#getStyle <em>Style</em>}' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Style</em>' containment reference.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(EEFButtonStyle value);

	/**
	 * Returns the value of the '<em><b>Conditional Styles</b></em>' containment reference list. The list contents are
	 * of type {@link org.eclipse.eef.EEFButtonConditionalStyle}. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
	 * begin-model-doc --> Defines the button style associated to a precondition <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Conditional Styles</em>' containment reference list.
	 * @see org.eclipse.eef.EefPackage#getEEFButtonDescription_ConditionalStyles()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<EEFButtonConditionalStyle> getConditionalStyles();

} // EEFButtonDescription
