/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef.eef;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EEF Java Extension Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Contributes the referenced Java class as a service for the EEF runtime interpreters.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eef.eef.EEFJavaExtensionDescription#getQualifiedName <em>Qualified Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eef.eef.EefPackage#getEEFJavaExtensionDescription()
 * @model
 * @generated
 */
public interface EEFJavaExtensionDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The qualified name of the Java class to reference.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Qualified Name</em>' attribute.
	 * @see #setQualifiedName(String)
	 * @see org.eclipse.eef.eef.EefPackage#getEEFJavaExtensionDescription_QualifiedName()
	 * @model
	 * @generated
	 */
	String getQualifiedName();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.eef.EEFJavaExtensionDescription#getQualifiedName <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualified Name</em>' attribute.
	 * @see #getQualifiedName()
	 * @generated
	 */
	void setQualifiedName(String value);

} // EEFJavaExtensionDescription
