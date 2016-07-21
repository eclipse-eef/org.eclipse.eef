/**
 * Copyright (c) 2016 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference;

import org.eclipse.eef.EEFWidgetDescription;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>EEF Ext Reference Description</b></em>'. <!--
 * end-user-doc -->
 *
 * <!-- begin-model-doc --> Allows the edition of a reference. <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.EEFExtReferenceDescription#getReferenceNameExpression
 * <em>Reference Name Expression</em>}</li>
 * <li>
 * {@link org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.EEFExtReferenceDescription#getSemanticCandidateExpression
 * <em>Semantic Candidate Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.EefExtWidgetsReferencePackage#getEEFExtReferenceDescription()
 * @model
 * @generated
 */
public interface EEFExtReferenceDescription extends EEFWidgetDescription {
	/**
	 * Returns the value of the '<em><b>Reference Name Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc --> The name of the reference to edit. <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Reference Name Expression</em>' attribute.
	 * @see #setReferenceNameExpression(String)
	 * @see org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.EefExtWidgetsReferencePackage#getEEFExtReferenceDescription_ReferenceNameExpression()
	 * @model required="true"
	 * @generated
	 */
	String getReferenceNameExpression();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.EEFExtReferenceDescription#getReferenceNameExpression
	 * <em>Reference Name Expression</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Reference Name Expression</em>' attribute.
	 * @see #getReferenceNameExpression()
	 * @generated
	 */
	void setReferenceNameExpression(String value);

	/**
	 * Returns the value of the '<em><b>Semantic Candidate Expression</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Semantic Candidate Expression</em>' attribute isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Semantic Candidate Expression</em>' attribute.
	 * @see #setSemanticCandidateExpression(String)
	 * @see org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.EefExtWidgetsReferencePackage#getEEFExtReferenceDescription_SemanticCandidateExpression()
	 * @model
	 * @generated
	 */
	String getSemanticCandidateExpression();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.EEFExtReferenceDescription#getSemanticCandidateExpression
	 * <em>Semantic Candidate Expression</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Semantic Candidate Expression</em>' attribute.
	 * @see #getSemanticCandidateExpression()
	 * @generated
	 */
	void setSemanticCandidateExpression(String value);

} // EEFExtReferenceDescription
