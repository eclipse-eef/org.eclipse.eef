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
 * <!-- begin-user-doc --> A representation of the model object '<em><b>EEF Radio Description</b></em>'. <!--
 * end-user-doc -->
 *
 * <!-- begin-model-doc --> Represents a radio group in the user interface. <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.eef.EEFRadioDescription#getValueExpression <em>Value Expression</em>}</li>
 * <li>{@link org.eclipse.eef.EEFRadioDescription#getEditExpression <em>Edit Expression</em>}</li>
 * <li>{@link org.eclipse.eef.EEFRadioDescription#getCandidatesExpression <em>Candidates Expression</em>}</li>
 * <li>{@link org.eclipse.eef.EEFRadioDescription#getCandidateDisplayExpression <em>Candidate Display
 * Expression</em>}</li>
 * <li>{@link org.eclipse.eef.EEFRadioDescription#getStyle <em>Style</em>}</li>
 * <li>{@link org.eclipse.eef.EEFRadioDescription#getNumberOfColumns <em>Number Of Columns</em>}</li>
 * <li>{@link org.eclipse.eef.EEFRadioDescription#getConditionalStyles <em>Conditional Styles</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eef.EefPackage#getEEFRadioDescription()
 * @model
 * @generated
 */
public interface EEFRadioDescription extends EEFWidgetDescription {
	/**
	 * Returns the value of the '<em><b>Value Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * --> <!-- begin-model-doc --> The initial selected value of the radio. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Value Expression</em>' attribute.
	 * @see #setValueExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFRadioDescription_ValueExpression()
	 * @model
	 * @generated
	 */
	String getValueExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFRadioDescription#getValueExpression <em>Value Expression</em>}'
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
	 * --> <!-- begin-model-doc --> Defines the behavior executed when the end-user updates the value of the radio. <!--
	 * end-model-doc -->
	 * 
	 * @return the value of the '<em>Edit Expression</em>' attribute.
	 * @see #setEditExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFRadioDescription_EditExpression()
	 * @model
	 * @generated
	 */
	String getEditExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFRadioDescription#getEditExpression <em>Edit Expression</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Edit Expression</em>' attribute.
	 * @see #getEditExpression()
	 * @generated
	 */
	void setEditExpression(String value);

	/**
	 * Returns the value of the '<em><b>Candidates Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc --> Defines the various proposals available. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Candidates Expression</em>' attribute.
	 * @see #setCandidatesExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFRadioDescription_CandidatesExpression()
	 * @model
	 * @generated
	 */
	String getCandidatesExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFRadioDescription#getCandidatesExpression <em>Candidates
	 * Expression</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Candidates Expression</em>' attribute.
	 * @see #getCandidatesExpression()
	 * @generated
	 */
	void setCandidatesExpression(String value);

	/**
	 * Returns the value of the '<em><b>Candidate Display Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc --> Indicates how to display the input value. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Candidate Display Expression</em>' attribute.
	 * @see #setCandidateDisplayExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFRadioDescription_CandidateDisplayExpression()
	 * @model
	 * @generated
	 */
	String getCandidateDisplayExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFRadioDescription#getCandidateDisplayExpression <em>Candidate
	 * Display Expression</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Candidate Display Expression</em>' attribute.
	 * @see #getCandidateDisplayExpression()
	 * @generated
	 */
	void setCandidateDisplayExpression(String value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * --> <!-- begin-model-doc --> Defines the radio style <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Style</em>' containment reference.
	 * @see #setStyle(EEFRadioStyle)
	 * @see org.eclipse.eef.EefPackage#getEEFRadioDescription_Style()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EEFRadioStyle getStyle();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFRadioDescription#getStyle <em>Style</em>}' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Style</em>' containment reference.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(EEFRadioStyle value);

	/**
	 * Returns the value of the '<em><b>Number Of Columns</b></em>' attribute. The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> The number of columns to use to display
	 * the candidates. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Number Of Columns</em>' attribute.
	 * @see #setNumberOfColumns(int)
	 * @see org.eclipse.eef.EefPackage#getEEFRadioDescription_NumberOfColumns()
	 * @model default="-1"
	 * @generated
	 */
	int getNumberOfColumns();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFRadioDescription#getNumberOfColumns <em>Number Of Columns</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Number Of Columns</em>' attribute.
	 * @see #getNumberOfColumns()
	 * @generated
	 */
	void setNumberOfColumns(int value);

	/**
	 * Returns the value of the '<em><b>Conditional Styles</b></em>' containment reference list. The list contents are
	 * of type {@link org.eclipse.eef.EEFRadioConditionalStyle}. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
	 * begin-model-doc --> Defines the radio style associated to a precondition <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Conditional Styles</em>' containment reference list.
	 * @see org.eclipse.eef.EefPackage#getEEFRadioDescription_ConditionalStyles()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<EEFRadioConditionalStyle> getConditionalStyles();

} // EEFRadioDescription
