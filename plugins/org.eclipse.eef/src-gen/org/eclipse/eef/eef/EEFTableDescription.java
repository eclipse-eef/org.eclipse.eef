/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef.eef;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EEF Table Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a Table in the user interface.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eef.eef.EEFTableDescription#getValueExpression <em>Value Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.eef.EEFTableDescription#getEditExpression <em>Edit Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.eef.EEFTableDescription#getTableStructure <em>Table Structure</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eef.eef.EefPackage#getEEFTableDescription()
 * @model
 * @generated
 */
public interface EEFTableDescription extends EEFWidgetDescription {
	/**
	 * Returns the value of the '<em><b>Value Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates how to display the input values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Expression</em>' attribute.
	 * @see #setValueExpression(String)
	 * @see org.eclipse.eef.eef.EefPackage#getEEFTableDescription_ValueExpression()
	 * @model dataType="org.eclipse.eef.eef.Expression"
	 * @generated
	 */
	String getValueExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.eef.EEFTableDescription#getValueExpression <em>Value Expression</em>}' attribute.
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
	 * Defines the behavior executed when the end-user updates the table cell elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Edit Expression</em>' attribute.
	 * @see #setEditExpression(String)
	 * @see org.eclipse.eef.eef.EefPackage#getEEFTableDescription_EditExpression()
	 * @model dataType="org.eclipse.eef.eef.Expression"
	 * @generated
	 */
	String getEditExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.eef.EEFTableDescription#getEditExpression <em>Edit Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edit Expression</em>' attribute.
	 * @see #getEditExpression()
	 * @generated
	 */
	void setEditExpression(String value);

	/**
	 * Returns the value of the '<em><b>Table Structure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References a table structure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Table Structure</em>' reference.
	 * @see #setTableStructure(EEFTableStructureDescription)
	 * @see org.eclipse.eef.eef.EefPackage#getEEFTableDescription_TableStructure()
	 * @model
	 * @generated
	 */
	EEFTableStructureDescription getTableStructure();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.eef.EEFTableDescription#getTableStructure <em>Table Structure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Structure</em>' reference.
	 * @see #getTableStructure()
	 * @generated
	 */
	void setTableStructure(EEFTableStructureDescription value);

} // EEFTableDescription
