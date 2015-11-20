/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.sirius.validation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sirius Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.validation.SiriusStatus#getMessage <em>Message</em>}</li>
 *   <li>{@link org.eclipse.sirius.validation.SiriusStatus#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.eclipse.sirius.validation.SiriusStatus#getException <em>Exception</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.validation.ValidationPackage#getSiriusStatus()
 * @model
 * @generated
 */
public interface SiriusStatus extends EObject {
	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see org.eclipse.sirius.validation.ValidationPackage#getSiriusStatus_Message()
	 * @model
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.validation.SiriusStatus#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

	/**
	 * Returns the value of the '<em><b>Severity</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.sirius.validation.Severity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Severity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Severity</em>' attribute.
	 * @see org.eclipse.sirius.validation.Severity
	 * @see #setSeverity(Severity)
	 * @see org.eclipse.sirius.validation.ValidationPackage#getSiriusStatus_Severity()
	 * @model
	 * @generated
	 */
	Severity getSeverity();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.validation.SiriusStatus#getSeverity <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' attribute.
	 * @see org.eclipse.sirius.validation.Severity
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(Severity value);

	/**
	 * Returns the value of the '<em><b>Exception</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exception</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception</em>' attribute.
	 * @see #setException(Object)
	 * @see org.eclipse.sirius.validation.ValidationPackage#getSiriusStatus_Exception()
	 * @model dataType="org.eclipse.sirius.validation.SiriusException"
	 * @generated
	 */
	Object getException();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.validation.SiriusStatus#getException <em>Exception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception</em>' attribute.
	 * @see #getException()
	 * @generated
	 */
	void setException(Object value);

} // SiriusStatus
