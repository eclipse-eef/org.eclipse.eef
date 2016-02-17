/**
 * Copyright (c) 2015 Obeo.
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
 * <!-- begin-user-doc --> A representation of the model object '<em><b>EEF Dynamic Mapping For</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.eef.EEFDynamicMappingFor#getIterator <em>Iterator</em>}</li>
 * <li>{@link org.eclipse.eef.EEFDynamicMappingFor#getDomainClassExpression <em>Domain Class Expression</em>}</li>
 * <li>{@link org.eclipse.eef.EEFDynamicMappingFor#getIfs <em>Ifs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.eef.EefPackage#getEEFDynamicMappingFor()
 * @model
 * @generated
 */
public interface EEFDynamicMappingFor extends EObject {
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
	 * Returns the value of the '<em><b>Domain Class Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc --> Used to compute the mappings to create using the domain class of the
	 * current object. <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Domain Class Expression</em>' attribute.
	 * @see #setDomainClassExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFDynamicMappingFor_DomainClassExpression()
	 * @model required="true"
	 * @generated
	 */
	String getDomainClassExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFDynamicMappingFor#getDomainClassExpression
	 * <em>Domain Class Expression</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Domain Class Expression</em>' attribute.
	 * @see #getDomainClassExpression()
	 * @generated
	 */
	void setDomainClassExpression(String value);

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
