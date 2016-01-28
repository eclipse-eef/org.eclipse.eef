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
 * <!-- begin-user-doc --> A representation of the model object '<em><b>EEF Dynamic Mapping Case</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.eef.EEFDynamicMappingCase#getCaseExpression <em>Case Expression</em>}</li>
 * <li>{@link org.eclipse.eef.EEFDynamicMappingCase#getWidget <em>Widget</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.eef.EefPackage#getEEFDynamicMappingCase()
 * @model
 * @generated
 */
public interface EEFDynamicMappingCase extends EObject {
	/**
	 * Returns the value of the '<em><b>Case Expression</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Case Expression</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Case Expression</em>' attribute.
	 * @see #setCaseExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFDynamicMappingCase_CaseExpression()
	 * @model required="true"
	 * @generated
	 */
	String getCaseExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFDynamicMappingCase#getCaseExpression <em>Case Expression</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Case Expression</em>' attribute.
	 * @see #getCaseExpression()
	 * @generated
	 */
	void setCaseExpression(String value);

	/**
	 * Returns the value of the '<em><b>Widget</b></em>' containment reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Widget</em>' containment reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Widget</em>' containment reference.
	 * @see #setWidget(EEFWidgetDescription)
	 * @see org.eclipse.eef.EefPackage#getEEFDynamicMappingCase_Widget()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	EEFWidgetDescription getWidget();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFDynamicMappingCase#getWidget <em>Widget</em>}' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Widget</em>' containment reference.
	 * @see #getWidget()
	 * @generated
	 */
	void setWidget(EEFWidgetDescription value);

} // EEFDynamicMappingCase
