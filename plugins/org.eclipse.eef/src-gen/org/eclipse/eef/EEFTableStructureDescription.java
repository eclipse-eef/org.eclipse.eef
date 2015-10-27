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
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EEF Table Structure Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes a table as a set of elements related to an input. This description is reusable by Table widgets.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eef.EEFTableStructureDescription#isMultiple <em>Multiple</em>}</li>
 *   <li>{@link org.eclipse.eef.EEFTableStructureDescription#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.eef.EEFTableStructureDescription#getAddExpression <em>Add Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.EEFTableStructureDescription#getRemoveExpression <em>Remove Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.EEFTableStructureDescription#getUpExpression <em>Up Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.EEFTableStructureDescription#getDownExpression <em>Down Expression</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eef.EefPackage#getEEFTableStructureDescription()
 * @model abstract="true"
 * @generated
 */
public interface EEFTableStructureDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If set to true several values can be selected at same time otherwise one selection is possible.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Multiple</em>' attribute.
	 * @see #setMultiple(boolean)
	 * @see org.eclipse.eef.EefPackage#getEEFTableStructureDescription_Multiple()
	 * @model
	 * @generated
	 */
	boolean isMultiple();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFTableStructureDescription#isMultiple <em>Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiple</em>' attribute.
	 * @see #isMultiple()
	 * @generated
	 */
	void setMultiple(boolean value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used to identify a specific table structure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see org.eclipse.eef.EefPackage#getEEFTableStructureDescription_Identifier()
	 * @model required="true"
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFTableStructureDescription#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Add Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the behavior executed when the add button is clicked.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Add Expression</em>' attribute.
	 * @see #setAddExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFTableStructureDescription_AddExpression()
	 * @model dataType="org.eclipse.sirius.expression.Expression"
	 * @generated
	 */
	String getAddExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFTableStructureDescription#getAddExpression <em>Add Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add Expression</em>' attribute.
	 * @see #getAddExpression()
	 * @generated
	 */
	void setAddExpression(String value);

	/**
	 * Returns the value of the '<em><b>Remove Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the behavior executed when the remove button is clicked.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remove Expression</em>' attribute.
	 * @see #setRemoveExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFTableStructureDescription_RemoveExpression()
	 * @model dataType="org.eclipse.sirius.expression.Expression"
	 * @generated
	 */
	String getRemoveExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFTableStructureDescription#getRemoveExpression <em>Remove Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remove Expression</em>' attribute.
	 * @see #getRemoveExpression()
	 * @generated
	 */
	void setRemoveExpression(String value);

	/**
	 * Returns the value of the '<em><b>Up Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the behavior executed when the up button is clicked.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Up Expression</em>' attribute.
	 * @see #setUpExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFTableStructureDescription_UpExpression()
	 * @model dataType="org.eclipse.sirius.expression.Expression"
	 * @generated
	 */
	String getUpExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFTableStructureDescription#getUpExpression <em>Up Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Up Expression</em>' attribute.
	 * @see #getUpExpression()
	 * @generated
	 */
	void setUpExpression(String value);

	/**
	 * Returns the value of the '<em><b>Down Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the behavior executed when the down button is clicked.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Down Expression</em>' attribute.
	 * @see #setDownExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFTableStructureDescription_DownExpression()
	 * @model dataType="org.eclipse.sirius.expression.Expression"
	 * @generated
	 */
	String getDownExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFTableStructureDescription#getDownExpression <em>Down Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Down Expression</em>' attribute.
	 * @see #getDownExpression()
	 * @generated
	 */
	void setDownExpression(String value);

} // EEFTableStructureDescription
