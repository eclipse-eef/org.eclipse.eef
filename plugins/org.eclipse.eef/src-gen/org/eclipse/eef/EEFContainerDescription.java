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

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>EEF Container Description</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.eef.EEFContainerDescription#getControls <em>Controls</em>}</li>
 * <li>{@link org.eclipse.eef.EEFContainerDescription#getLayout <em>Layout</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eef.EefPackage#getEEFContainerDescription()
 * @model
 * @generated
 */
public interface EEFContainerDescription extends EEFControlDescription {
	/**
	 * Returns the value of the '<em><b>Controls</b></em>' containment reference list. The list contents are of type
	 * {@link org.eclipse.eef.EEFControlDescription}. <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc
	 * --> References the widgets to hold. <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Controls</em>' containment reference list.
	 * @see org.eclipse.eef.EefPackage#getEEFContainerDescription_Controls()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	EList<EEFControlDescription> getControls();

	/**
	 * Returns the value of the '<em><b>Layout</b></em>' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc --> The layout of the container. <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Layout</em>' containment reference.
	 * @see #setLayout(EEFLayoutDescription)
	 * @see org.eclipse.eef.EefPackage#getEEFContainerDescription_Layout()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EEFLayoutDescription getLayout();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFContainerDescription#getLayout <em>Layout</em>}' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Layout</em>' containment reference.
	 * @see #getLayout()
	 * @generated
	 */
	void setLayout(EEFLayoutDescription value);

} // EEFContainerDescription
