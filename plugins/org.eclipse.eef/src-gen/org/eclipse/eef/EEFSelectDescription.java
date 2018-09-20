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
 * <!-- begin-user-doc --> A representation of the model object '<em><b>EEF Select Description</b></em>'. <!--
 * end-user-doc -->
 *
 * <!-- begin-model-doc --> Represents a collection of candidates used to edit a single or multi-valued property. <!--
 * end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.eef.EEFSelectDescription#getValueExpression <em>Value Expression</em>}</li>
 * <li>{@link org.eclipse.eef.EEFSelectDescription#getEditExpression <em>Edit Expression</em>}</li>
 * <li>{@link org.eclipse.eef.EEFSelectDescription#getCandidatesExpression <em>Candidates Expression</em>}</li>
 * <li>{@link org.eclipse.eef.EEFSelectDescription#getCandidateDisplayExpression <em>Candidate Display
 * Expression</em>}</li>
 * <li>{@link org.eclipse.eef.EEFSelectDescription#getStyle <em>Style</em>}</li>
 * <li>{@link org.eclipse.eef.EEFSelectDescription#getConditionalStyles <em>Conditional Styles</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eef.EefPackage#getEEFSelectDescription()
 * @model
 * @generated
 */
public interface EEFSelectDescription extends EEFWidgetDescription {
	/**
	 * Returns the value of the '<em><b>Value Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * --> <!-- begin-model-doc --> Indicates how to display the input value. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Value Expression</em>' attribute.
	 * @see #setValueExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFSelectDescription_ValueExpression()
	 * @model
	 * @generated
	 */
	String getValueExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFSelectDescription#getValueExpression <em>Value Expression</em>}'
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
	 * --> <!-- begin-model-doc --> Defines the behavior executed when the end-user updates the value of the combo. <!--
	 * end-model-doc -->
	 * 
	 * @return the value of the '<em>Edit Expression</em>' attribute.
	 * @see #setEditExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFSelectDescription_EditExpression()
	 * @model
	 * @generated
	 */
	String getEditExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFSelectDescription#getEditExpression <em>Edit Expression</em>}'
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
	 * @see org.eclipse.eef.EefPackage#getEEFSelectDescription_CandidatesExpression()
	 * @model
	 * @generated
	 */
	String getCandidatesExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFSelectDescription#getCandidatesExpression <em>Candidates
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
	 * @see org.eclipse.eef.EefPackage#getEEFSelectDescription_CandidateDisplayExpression()
	 * @model
	 * @generated
	 */
	String getCandidateDisplayExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFSelectDescription#getCandidateDisplayExpression <em>Candidate
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
	 * --> <!-- begin-model-doc --> Defines the select style <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Style</em>' containment reference.
	 * @see #setStyle(EEFSelectStyle)
	 * @see org.eclipse.eef.EefPackage#getEEFSelectDescription_Style()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EEFSelectStyle getStyle();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFSelectDescription#getStyle <em>Style</em>}' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Style</em>' containment reference.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(EEFSelectStyle value);

	/**
	 * Returns the value of the '<em><b>Conditional Styles</b></em>' containment reference list. The list contents are
	 * of type {@link org.eclipse.eef.EEFSelectConditionalStyle}. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
	 * begin-model-doc --> Defines the select style associated to a precondition <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Conditional Styles</em>' containment reference list.
	 * @see org.eclipse.eef.EefPackage#getEEFSelectDescription_ConditionalStyles()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<EEFSelectConditionalStyle> getConditionalStyles();

} // EEFSelectDescription
