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
 * A representation of the model object '<em><b>EEF Quick Fix</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a quickfix.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eef.EEFQuickFix#getTitleExpression <em>Title Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.EEFQuickFix#getMessageExpression <em>Message Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.EEFQuickFix#getCanHandleStatusExpression <em>Can Handle Status Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.EEFQuickFix#getFixExpression <em>Fix Expression</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eef.EefPackage#getEEFQuickFix()
 * @model
 * @generated
 */
public interface EEFQuickFix extends EObject {
	/**
	 * Returns the value of the '<em><b>Title Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the quickfix title.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title Expression</em>' attribute.
	 * @see #setTitleExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFQuickFix_TitleExpression()
	 * @model dataType="org.eclipse.sirius.expression.Expression"
	 * @generated
	 */
	String getTitleExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFQuickFix#getTitleExpression <em>Title Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title Expression</em>' attribute.
	 * @see #getTitleExpression()
	 * @generated
	 */
	void setTitleExpression(String value);

	/**
	 * Returns the value of the '<em><b>Message Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the quickfix message.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Expression</em>' attribute.
	 * @see #setMessageExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFQuickFix_MessageExpression()
	 * @model dataType="org.eclipse.sirius.expression.Expression"
	 * @generated
	 */
	String getMessageExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFQuickFix#getMessageExpression <em>Message Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Expression</em>' attribute.
	 * @see #getMessageExpression()
	 * @generated
	 */
	void setMessageExpression(String value);

	/**
	 * Returns the value of the '<em><b>Can Handle Status Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines if a quickfix can be applied.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Can Handle Status Expression</em>' attribute.
	 * @see #setCanHandleStatusExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFQuickFix_CanHandleStatusExpression()
	 * @model dataType="org.eclipse.sirius.expression.Expression"
	 * @generated
	 */
	String getCanHandleStatusExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFQuickFix#getCanHandleStatusExpression <em>Can Handle Status Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Handle Status Expression</em>' attribute.
	 * @see #getCanHandleStatusExpression()
	 * @generated
	 */
	void setCanHandleStatusExpression(String value);

	/**
	 * Returns the value of the '<em><b>Fix Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the behavior that will be executed when the quick fix is applied.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fix Expression</em>' attribute.
	 * @see #setFixExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFQuickFix_FixExpression()
	 * @model dataType="org.eclipse.sirius.expression.Expression"
	 * @generated
	 */
	String getFixExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFQuickFix#getFixExpression <em>Fix Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fix Expression</em>' attribute.
	 * @see #getFixExpression()
	 * @generated
	 */
	void setFixExpression(String value);

} // EEFQuickFix
