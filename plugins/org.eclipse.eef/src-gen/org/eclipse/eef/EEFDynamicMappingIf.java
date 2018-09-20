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
 * <!-- begin-user-doc --> A representation of the model object '<em><b>EEF Dynamic Mapping If</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.eef.EEFDynamicMappingIf#getPredicateExpression <em>Predicate Expression</em>}</li>
 * <li>{@link org.eclipse.eef.EEFDynamicMappingIf#getWidget <em>Widget</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eef.EefPackage#getEEFDynamicMappingIf()
 * @model
 * @generated
 */
public interface EEFDynamicMappingIf extends EObject {
	/**
	 * Returns the value of the '<em><b>Predicate Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc --> The expression used to determine if we will use the widget. <!--
	 * end-model-doc -->
	 * 
	 * @return the value of the '<em>Predicate Expression</em>' attribute.
	 * @see #setPredicateExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFDynamicMappingIf_PredicateExpression()
	 * @model required="true"
	 * @generated
	 */
	String getPredicateExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFDynamicMappingIf#getPredicateExpression <em>Predicate
	 * Expression</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Predicate Expression</em>' attribute.
	 * @see #getPredicateExpression()
	 * @generated
	 */
	void setPredicateExpression(String value);

	/**
	 * Returns the value of the '<em><b>Widget</b></em>' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc --> The widget to create if the predicate expression is evaluated to true.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Widget</em>' containment reference.
	 * @see #setWidget(EEFWidgetDescription)
	 * @see org.eclipse.eef.EefPackage#getEEFDynamicMappingIf_Widget()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	EEFWidgetDescription getWidget();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFDynamicMappingIf#getWidget <em>Widget</em>}' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Widget</em>' containment reference.
	 * @see #getWidget()
	 * @generated
	 */
	void setWidget(EEFWidgetDescription value);

} // EEFDynamicMappingIf
