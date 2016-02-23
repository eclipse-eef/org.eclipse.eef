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
 * <!-- begin-user-doc --> A representation of the model object '<em><b>EEF Label Description</b></em>'. <!--
 * end-user-doc -->
 *
 * <!-- begin-model-doc --> Represents a label in the user interface. <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.eef.EEFLabelDescription#getBodyExpression <em>Body Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.eef.EefPackage#getEEFLabelDescription()
 * @model
 * @generated
 */
public interface EEFLabelDescription extends EEFWidgetDescription {
	/**
	 * Returns the value of the '<em><b>Body Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * --> <!-- begin-model-doc --> The body of the label containing the meaningful content <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Body Expression</em>' attribute.
	 * @see #setBodyExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFLabelDescription_BodyExpression()
	 * @model
	 * @generated
	 */
	String getBodyExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFLabelDescription#getBodyExpression <em>Body Expression</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Body Expression</em>' attribute.
	 * @see #getBodyExpression()
	 * @generated
	 */
	void setBodyExpression(String value);

} // EEFLabelDescription
