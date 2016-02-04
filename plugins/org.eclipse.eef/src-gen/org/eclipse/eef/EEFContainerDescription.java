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
 * <!-- begin-user-doc --> A representation of the model object '<em><b>EEF Container Description</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.eef.EEFContainerDescription#getIdentifier <em>Identifier</em>}</li>
 * <li>{@link org.eclipse.eef.EEFContainerDescription#getWidgets <em>Widgets</em>}</li>
 * <li>{@link org.eclipse.eef.EEFContainerDescription#getDynamicMappings <em>Dynamic Mappings</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.eef.EefPackage#getEEFContainerDescription()
 * @model
 * @generated
 */
public interface EEFContainerDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * <!-- begin-model-doc --> Used to identify a specific Container in a Group. <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see org.eclipse.eef.EefPackage#getEEFContainerDescription_Identifier()
	 * @model required="true"
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFContainerDescription#getIdentifier <em>Identifier</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Widgets</b></em>' containment reference list. The list contents are of type
	 * {@link org.eclipse.eef.EEFWidgetDescription}. <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc
	 * --> References the widgets to hold. <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Widgets</em>' containment reference list.
	 * @see org.eclipse.eef.EefPackage#getEEFContainerDescription_Widgets()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	EList<EEFWidgetDescription> getWidgets();

	/**
	 * Returns the value of the '<em><b>Dynamic Mappings</b></em>' containment reference list. The list contents are of
	 * type {@link org.eclipse.eef.EEFDynamicMappingFor}. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
	 * begin-model-doc --> References the dynamic mappings to hold. <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Dynamic Mappings</em>' containment reference list.
	 * @see org.eclipse.eef.EefPackage#getEEFContainerDescription_DynamicMappings()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<EEFDynamicMappingFor> getDynamicMappings();

} // EEFContainerDescription
