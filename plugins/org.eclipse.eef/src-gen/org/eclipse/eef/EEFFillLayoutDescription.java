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

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>EEF Fill Layout Description</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.eef.EEFFillLayoutDescription#getOrientation <em>Orientation</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eef.EefPackage#getEEFFillLayoutDescription()
 * @model
 * @generated
 */
public interface EEFFillLayoutDescription extends EEFLayoutDescription {
	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' attribute. The default value is <code>"VERTICAL"</code>.
	 * The literals are from the enumeration {@link org.eclipse.eef.EEF_FILL_LAYOUT_ORIENTATION}. <!-- begin-user-doc
	 * --> <!-- end-user-doc --> <!-- begin-model-doc --> The orientation of the fill layout. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Orientation</em>' attribute.
	 * @see org.eclipse.eef.EEF_FILL_LAYOUT_ORIENTATION
	 * @see #setOrientation(EEF_FILL_LAYOUT_ORIENTATION)
	 * @see org.eclipse.eef.EefPackage#getEEFFillLayoutDescription_Orientation()
	 * @model default="VERTICAL"
	 * @generated
	 */
	EEF_FILL_LAYOUT_ORIENTATION getOrientation();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFFillLayoutDescription#getOrientation <em>Orientation</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Orientation</em>' attribute.
	 * @see org.eclipse.eef.EEF_FILL_LAYOUT_ORIENTATION
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(EEF_FILL_LAYOUT_ORIENTATION value);

} // EEFFillLayoutDescription
