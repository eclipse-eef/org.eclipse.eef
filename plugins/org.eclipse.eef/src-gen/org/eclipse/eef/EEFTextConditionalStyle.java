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
 * <!-- begin-user-doc --> A representation of the model object '<em><b>EEF Text Conditional Style</b></em>'. <!--
 * end-user-doc -->
 *
 * <!-- begin-model-doc --> Represents a conditional style that can be applied on text widgets. <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.eef.EEFTextConditionalStyle#getStyle <em>Style</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eef.EefPackage#getEEFTextConditionalStyle()
 * @model
 * @generated
 */
public interface EEFTextConditionalStyle extends EEFConditionalStyle {
	/**
	 * Returns the value of the '<em><b>Style</b></em>' containment reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style</em>' containment reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Style</em>' containment reference.
	 * @see #setStyle(EEFTextStyle)
	 * @see org.eclipse.eef.EefPackage#getEEFTextConditionalStyle_Style()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EEFTextStyle getStyle();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFTextConditionalStyle#getStyle <em>Style</em>}' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Style</em>' containment reference.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(EEFTextStyle value);

} // EEFTextConditionalStyle
