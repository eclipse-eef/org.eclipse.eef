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
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>EEF Non Containment Reference Description</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc --> Represents a non containment reference in the user interface. <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.eef.EEFNonContainmentReferenceDescription#getCandidatesExpression <em>Candidates Expression
 * </em>}</li>
 * <li>{@link org.eclipse.eef.EEFNonContainmentReferenceDescription#getCandidateDisplayExpression <em>Candidate Display
 * Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.eef.EefPackage#getEEFNonContainmentReferenceDescription()
 * @model abstract="true"
 * @generated
 */
public interface EEFNonContainmentReferenceDescription extends EEFReferenceDescription {
	/**
	 * Returns the value of the '<em><b>Candidates Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc --> Defines the various proposals available. <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Candidates Expression</em>' attribute.
	 * @see #setCandidatesExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFNonContainmentReferenceDescription_CandidatesExpression()
	 * @model
	 * @generated
	 */
	String getCandidatesExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFNonContainmentReferenceDescription#getCandidatesExpression
	 * <em>Candidates Expression</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Candidates Expression</em>' attribute.
	 * @see #getCandidatesExpression()
	 * @generated
	 */
	void setCandidatesExpression(String value);

	/**
	 * Returns the value of the '<em><b>Candidate Display Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc --> Provides the input value. <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Candidate Display Expression</em>' attribute.
	 * @see #setCandidateDisplayExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFNonContainmentReferenceDescription_CandidateDisplayExpression()
	 * @model
	 * @generated
	 */
	String getCandidateDisplayExpression();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.eef.EEFNonContainmentReferenceDescription#getCandidateDisplayExpression
	 * <em>Candidate Display Expression</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Candidate Display Expression</em>' attribute.
	 * @see #getCandidateDisplayExpression()
	 * @generated
	 */
	void setCandidateDisplayExpression(String value);

} // EEFNonContainmentReferenceDescription
