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
 * <!-- begin-user-doc --> A representation of the model object '<em><b>EEF Dynamic Mapping For</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.eef.EEFDynamicMappingFor#getIterator <em>Iterator</em>}</li>
 * <li>{@link org.eclipse.eef.EEFDynamicMappingFor#getIterableExpression <em>Iterable Expression</em>}</li>
 * <li>{@link org.eclipse.eef.EEFDynamicMappingFor#isForceRefresh <em>Force Refresh</em>}</li>
 * <li>{@link org.eclipse.eef.EEFDynamicMappingFor#getIfs <em>Ifs</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eef.EefPackage#getEEFDynamicMappingFor()
 * @model
 * @generated
 */
public interface EEFDynamicMappingFor extends EEFControlDescription {
	/**
	 * Returns the value of the '<em><b>Iterator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
	 * begin-model-doc --> The name of the variable which contain the current value of the iteration. <!-- end-model-doc
	 * -->
	 * 
	 * @return the value of the '<em>Iterator</em>' attribute.
	 * @see #setIterator(String)
	 * @see org.eclipse.eef.EefPackage#getEEFDynamicMappingFor_Iterator()
	 * @model required="true"
	 * @generated
	 */
	String getIterator();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFDynamicMappingFor#getIterator <em>Iterator</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Iterator</em>' attribute.
	 * @see #getIterator()
	 * @generated
	 */
	void setIterator(String value);

	/**
	 * Returns the value of the '<em><b>Iterable Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc --> Used to compute the mappings to create by iterating on the result of
	 * this expression. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Iterable Expression</em>' attribute.
	 * @see #setIterableExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFDynamicMappingFor_IterableExpression()
	 * @model required="true"
	 * @generated
	 */
	String getIterableExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFDynamicMappingFor#getIterableExpression <em>Iterable
	 * Expression</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Iterable Expression</em>' attribute.
	 * @see #getIterableExpression()
	 * @generated
	 */
	void setIterableExpression(String value);

	/**
	 * Returns the value of the '<em><b>Force Refresh</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * <!-- begin-model-doc --> Used to indicate if the runtime should consider that the presence of this dynamic
	 * mapping should force the refresh of the user interface. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Force Refresh</em>' attribute.
	 * @see #setForceRefresh(boolean)
	 * @see org.eclipse.eef.EefPackage#getEEFDynamicMappingFor_ForceRefresh()
	 * @model required="true"
	 * @generated
	 */
	boolean isForceRefresh();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFDynamicMappingFor#isForceRefresh <em>Force Refresh</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Force Refresh</em>' attribute.
	 * @see #isForceRefresh()
	 * @generated
	 */
	void setForceRefresh(boolean value);

	/**
	 * Returns the value of the '<em><b>Ifs</b></em>' containment reference list. The list contents are of type
	 * {@link org.eclipse.eef.EEFDynamicMappingIf}. <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc
	 * --> Used to determine which widget to create. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Ifs</em>' containment reference list.
	 * @see org.eclipse.eef.EefPackage#getEEFDynamicMappingFor_Ifs()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	EList<EEFDynamicMappingIf> getIfs();

} // EEFDynamicMappingFor
