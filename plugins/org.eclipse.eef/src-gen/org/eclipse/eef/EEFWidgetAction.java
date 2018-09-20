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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>EEF Widget Action</b></em>'. <!-- end-user-doc
 * -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.eef.EEFWidgetAction#getLabelExpression <em>Label Expression</em>}</li>
 * <li>{@link org.eclipse.eef.EEFWidgetAction#getImageExpression <em>Image Expression</em>}</li>
 * <li>{@link org.eclipse.eef.EEFWidgetAction#getActionExpression <em>Action Expression</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eef.EefPackage#getEEFWidgetAction()
 * @model
 * @generated
 */
public interface EEFWidgetAction extends EObject {
	/**
	 * Returns the value of the '<em><b>Label Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * --> <!-- begin-model-doc --> The label of the action visible by the end-users. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Label Expression</em>' attribute.
	 * @see #setLabelExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFWidgetAction_LabelExpression()
	 * @model
	 * @generated
	 */
	String getLabelExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFWidgetAction#getLabelExpression <em>Label Expression</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Label Expression</em>' attribute.
	 * @see #getLabelExpression()
	 * @generated
	 */
	void setLabelExpression(String value);

	/**
	 * Returns the value of the '<em><b>Image Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * --> <!-- begin-model-doc --> The image of the action visible by the end-users. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Image Expression</em>' attribute.
	 * @see #setImageExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFWidgetAction_ImageExpression()
	 * @model
	 * @generated
	 */
	String getImageExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFWidgetAction#getImageExpression <em>Image Expression</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Image Expression</em>' attribute.
	 * @see #getImageExpression()
	 * @generated
	 */
	void setImageExpression(String value);

	/**
	 * Returns the value of the '<em><b>Action Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * --> <!-- begin-model-doc --> The behavior of the action. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Action Expression</em>' attribute.
	 * @see #setActionExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFWidgetAction_ActionExpression()
	 * @model
	 * @generated
	 */
	String getActionExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFWidgetAction#getActionExpression <em>Action Expression</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Action Expression</em>' attribute.
	 * @see #getActionExpression()
	 * @generated
	 */
	void setActionExpression(String value);

} // EEFWidgetAction
