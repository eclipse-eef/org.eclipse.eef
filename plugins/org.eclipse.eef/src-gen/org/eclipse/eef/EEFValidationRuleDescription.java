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
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>EEF Validation Rule Description</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.eef.EEFValidationRuleDescription#getSeverity <em>Severity</em>}</li>
 * <li>{@link org.eclipse.eef.EEFValidationRuleDescription#getMessageExpression <em>Message Expression</em>}</li>
 * <li>{@link org.eclipse.eef.EEFValidationRuleDescription#getAudits <em>Audits</em>}</li>
 * <li>{@link org.eclipse.eef.EEFValidationRuleDescription#getFixes <em>Fixes</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eef.EefPackage#getEEFValidationRuleDescription()
 * @model abstract="true"
 * @generated
 */
public interface EEFValidationRuleDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Severity</b></em>' attribute. The literals are from the enumeration
	 * {@link org.eclipse.eef.EEF_VALIDATION_SEVERITY_DESCRIPTION}. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
	 * begin-model-doc --> The severity of the validation rule. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Severity</em>' attribute.
	 * @see org.eclipse.eef.EEF_VALIDATION_SEVERITY_DESCRIPTION
	 * @see #setSeverity(EEF_VALIDATION_SEVERITY_DESCRIPTION)
	 * @see org.eclipse.eef.EefPackage#getEEFValidationRuleDescription_Severity()
	 * @model required="true"
	 * @generated
	 */
	EEF_VALIDATION_SEVERITY_DESCRIPTION getSeverity();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFValidationRuleDescription#getSeverity <em>Severity</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Severity</em>' attribute.
	 * @see org.eclipse.eef.EEF_VALIDATION_SEVERITY_DESCRIPTION
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(EEF_VALIDATION_SEVERITY_DESCRIPTION value);

	/**
	 * Returns the value of the '<em><b>Message Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc --> The expression used to compute the message to display to the end user
	 * in case of error. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Message Expression</em>' attribute.
	 * @see #setMessageExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFValidationRuleDescription_MessageExpression()
	 * @model
	 * @generated
	 */
	String getMessageExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFValidationRuleDescription#getMessageExpression <em>Message
	 * Expression</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Message Expression</em>' attribute.
	 * @see #getMessageExpression()
	 * @generated
	 */
	void setMessageExpression(String value);

	/**
	 * Returns the value of the '<em><b>Audits</b></em>' containment reference list. The list contents are of type
	 * {@link org.eclipse.eef.EEFRuleAuditDescription}. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
	 * begin-model-doc --> The audits to perform to ensure that the validation rule is valid or not. <!-- end-model-doc
	 * -->
	 * 
	 * @return the value of the '<em>Audits</em>' containment reference list.
	 * @see org.eclipse.eef.EefPackage#getEEFValidationRuleDescription_Audits()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<EEFRuleAuditDescription> getAudits();

	/**
	 * Returns the value of the '<em><b>Fixes</b></em>' containment reference list. The list contents are of type
	 * {@link org.eclipse.eef.EEFValidationFixDescription}. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
	 * begin-model-doc --> The quick fixes that can be used to fix invalid data. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Fixes</em>' containment reference list.
	 * @see org.eclipse.eef.EefPackage#getEEFValidationRuleDescription_Fixes()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<EEFValidationFixDescription> getFixes();

} // EEFValidationRuleDescription
