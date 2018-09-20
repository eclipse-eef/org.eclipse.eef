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
 * <!-- begin-user-doc --> A representation of the model object '<em><b>EEF Rule Audit Description</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.eef.EEFRuleAuditDescription#getAuditExpression <em>Audit Expression</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eef.EefPackage#getEEFRuleAuditDescription()
 * @model
 * @generated
 */
public interface EEFRuleAuditDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Audit Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * --> <!-- begin-model-doc --> The expression used to determine if a validation is valid or not. <!-- end-model-doc
	 * -->
	 * 
	 * @return the value of the '<em>Audit Expression</em>' attribute.
	 * @see #setAuditExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFRuleAuditDescription_AuditExpression()
	 * @model required="true"
	 * @generated
	 */
	String getAuditExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFRuleAuditDescription#getAuditExpression <em>Audit
	 * Expression</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Audit Expression</em>' attribute.
	 * @see #getAuditExpression()
	 * @generated
	 */
	void setAuditExpression(String value);

} // EEFRuleAuditDescription
