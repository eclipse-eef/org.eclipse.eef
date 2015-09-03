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
 * A representation of the model object '<em><b>EEF Select Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a collection of candidates used to edit a single or multi-valued property.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eef.eef.EEFSelectDescription#getValueExpression <em>Value Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.eef.EEFSelectDescription#getEditExpression <em>Edit Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.eef.EEFSelectDescription#getCandidatesExpression <em>Candidates Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.eef.EEFSelectDescription#isMultiple <em>Multiple</em>}</li>
 *   <li>{@link org.eclipse.eef.eef.EEFSelectDescription#getCandidateDisplayExpression <em>Candidate Display Expression</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eef.eef.EefPackage#getEEFSelectDescription()
 * @model
 * @generated
 */
public interface EEFSelectDescription extends EEFCellWidgetDescription {
	/**
	 * Returns the value of the '<em><b>Value Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The initial selected values of the radio.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Expression</em>' attribute.
	 * @see #setValueExpression(String)
	 * @see org.eclipse.eef.eef.EefPackage#getEEFSelectDescription_ValueExpression()
	 * @model dataType="org.eclipse.eef.eef.Expression"
	 * @generated
	 */
	String getValueExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.eef.EEFSelectDescription#getValueExpression <em>Value Expression</em>}' attribute.
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
	 * Defines the behavior executed when the end-user updates the value of the select.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Edit Expression</em>' attribute.
	 * @see #setEditExpression(String)
	 * @see org.eclipse.eef.eef.EefPackage#getEEFSelectDescription_EditExpression()
	 * @model dataType="org.eclipse.eef.eef.Expression"
	 * @generated
	 */
	String getEditExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.eef.EEFSelectDescription#getEditExpression <em>Edit Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edit Expression</em>' attribute.
	 * @see #getEditExpression()
	 * @generated
	 */
	void setEditExpression(String value);

	/**
	 * Returns the value of the '<em><b>Candidates Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the various proposals available.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Candidates Expression</em>' attribute.
	 * @see #setCandidatesExpression(String)
	 * @see org.eclipse.eef.eef.EefPackage#getEEFSelectDescription_CandidatesExpression()
	 * @model dataType="org.eclipse.eef.eef.Expression"
	 * @generated
	 */
	String getCandidatesExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.eef.EEFSelectDescription#getCandidatesExpression <em>Candidates Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Candidates Expression</em>' attribute.
	 * @see #getCandidatesExpression()
	 * @generated
	 */
	void setCandidatesExpression(String value);

	/**
	 * Returns the value of the '<em><b>Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If set to true several values can be selected at same time otherwise one selection is possible.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Multiple</em>' attribute.
	 * @see #setMultiple(boolean)
	 * @see org.eclipse.eef.eef.EefPackage#getEEFSelectDescription_Multiple()
	 * @model
	 * @generated
	 */
	boolean isMultiple();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.eef.EEFSelectDescription#isMultiple <em>Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiple</em>' attribute.
	 * @see #isMultiple()
	 * @generated
	 */
	void setMultiple(boolean value);

	/**
	 * Returns the value of the '<em><b>Candidate Display Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates how to display the input value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Candidate Display Expression</em>' attribute.
	 * @see #setCandidateDisplayExpression(String)
	 * @see org.eclipse.eef.eef.EefPackage#getEEFSelectDescription_CandidateDisplayExpression()
	 * @model dataType="org.eclipse.eef.eef.Expression"
	 * @generated
	 */
	String getCandidateDisplayExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.eef.EEFSelectDescription#getCandidateDisplayExpression <em>Candidate Display Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Candidate Display Expression</em>' attribute.
	 * @see #getCandidateDisplayExpression()
	 * @generated
	 */
	void setCandidateDisplayExpression(String value);

} // EEFSelectDescription
