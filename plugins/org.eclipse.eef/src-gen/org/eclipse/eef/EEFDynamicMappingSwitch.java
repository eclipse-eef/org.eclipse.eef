/**
 * Copyright (c) 2016 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>EEF Dynamic Mapping Switch</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.eef.EEFDynamicMappingSwitch#getSwitchExpression <em>Switch Expression</em>}</li>
 * <li>{@link org.eclipse.eef.EEFDynamicMappingSwitch#getCases <em>Cases</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.eef.EefPackage#getEEFDynamicMappingSwitch()
 * @model
 * @generated
 */
public interface EEFDynamicMappingSwitch extends EObject {
	/**
	 * Returns the value of the '<em><b>Switch Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * --> <!-- begin-model-doc --> Used to compute a value used to match the case to use. <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Switch Expression</em>' attribute.
	 * @see #setSwitchExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFDynamicMappingSwitch_SwitchExpression()
	 * @model required="true"
	 * @generated
	 */
	String getSwitchExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFDynamicMappingSwitch#getSwitchExpression
	 * <em>Switch Expression</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Switch Expression</em>' attribute.
	 * @see #getSwitchExpression()
	 * @generated
	 */
	void setSwitchExpression(String value);

	/**
	 * Returns the value of the '<em><b>Cases</b></em>' containment reference list. The list contents are of type
	 * {@link org.eclipse.eef.EEFDynamicMappingCase}. <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc
	 * --> Lists the cases that are supported. <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Cases</em>' containment reference list.
	 * @see org.eclipse.eef.EefPackage#getEEFDynamicMappingSwitch_Cases()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	EList<EEFDynamicMappingCase> getCases();

} // EEFDynamicMappingSwitch
