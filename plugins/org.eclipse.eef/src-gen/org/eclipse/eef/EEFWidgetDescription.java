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
 * <!-- begin-user-doc --> A representation of the model object '<em><b>EEF Widget Description</b></em>'. <!--
 * end-user-doc -->
 *
 * <!-- begin-model-doc --> Graphical element. <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.eef.EEFWidgetDescription#getIdentifier <em>Identifier</em>}</li>
 * <li>{@link org.eclipse.eef.EEFWidgetDescription#getLabelExpression <em>Label Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.eef.EefPackage#getEEFWidgetDescription()
 * @model abstract="true"
 * @generated
 */
public interface EEFWidgetDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * <!-- begin-model-doc --> Used to identify a specific widget. <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see org.eclipse.eef.EefPackage#getEEFWidgetDescription_Identifier()
	 * @model required="true"
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFWidgetDescription#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Label Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * --> <!-- begin-model-doc --> The label of the Widget visible by the end-users. <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Label Expression</em>' attribute.
	 * @see #setLabelExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFWidgetDescription_LabelExpression()
	 * @model
	 * @generated
	 */
	String getLabelExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFWidgetDescription#getLabelExpression <em>Label Expression</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Label Expression</em>' attribute.
	 * @see #getLabelExpression()
	 * @generated
	 */
	void setLabelExpression(String value);

} // EEFWidgetDescription
