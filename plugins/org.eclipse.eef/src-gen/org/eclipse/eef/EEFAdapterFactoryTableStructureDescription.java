/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EEF Adapter Factory Table Structure Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines the structure of a Tree from an AdapterFactory.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eef.EEFAdapterFactoryTableStructureDescription#getAdapterFactoryProvider <em>Adapter Factory Provider</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eef.EefPackage#getEEFAdapterFactoryTableStructureDescription()
 * @model
 * @generated
 */
public interface EEFAdapterFactoryTableStructureDescription extends EEFTableStructureDescription {
	/**
	 * Returns the value of the '<em><b>Adapter Factory Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The qualified name of the adapter factory Java class.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Adapter Factory Provider</em>' attribute.
	 * @see #setAdapterFactoryProvider(String)
	 * @see org.eclipse.eef.EefPackage#getEEFAdapterFactoryTableStructureDescription_AdapterFactoryProvider()
	 * @model
	 * @generated
	 */
	String getAdapterFactoryProvider();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFAdapterFactoryTableStructureDescription#getAdapterFactoryProvider <em>Adapter Factory Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adapter Factory Provider</em>' attribute.
	 * @see #getAdapterFactoryProvider()
	 * @generated
	 */
	void setAdapterFactoryProvider(String value);

} // EEFAdapterFactoryTableStructureDescription
