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
 * <!-- begin-user-doc --> A representation of the model object '<em><b>EEF Button Description</b></em>'. <!--
 * end-user-doc -->
 *
 * <!-- begin-model-doc --> Represents a button in the user interface. <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.eef.EEFButtonDescription#getButtonLabelExpression <em>Button Label Expression</em>}</li>
 * <li>{@link org.eclipse.eef.EEFButtonDescription#getPushExpression <em>Push Expression</em>}</li>
 * </ul>
 * </p>
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
	 * Sets the value of the '{@link org.eclipse.eef.EEFButtonDescription#getButtonLabelExpression
	 * <em>Button Label Expression</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Button Label Expression</em>' attribute.
	 * @see #getButtonLabelExpression()
	 * @generated
	 */
	void setButtonLabelExpression(String value);

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

} // EEFButtonDescription
