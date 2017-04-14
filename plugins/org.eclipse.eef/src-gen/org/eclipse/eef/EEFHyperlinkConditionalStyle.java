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
 * <!-- begin-user-doc --> A representation of the model object '<em><b>EEF Hyperlink Conditional Style</b></em>'. <!--
 * end-user-doc -->
 *
 * <!-- begin-model-doc --> Represents a conditional style that can be applied on hyperlink widgets. <!-- end-model-doc
 * -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.eef.EEFHyperlinkConditionalStyle#getStyle <em>Style</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eef.EefPackage#getEEFHyperlinkConditionalStyle()
 * @model
 * @generated
 */
public interface EEFHyperlinkConditionalStyle extends EEFConditionalStyle {
	/**
	 * Returns the value of the '<em><b>Style</b></em>' containment reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style</em>' containment reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Style</em>' containment reference.
	 * @see #setStyle(EEFHyperlinkStyle)
	 * @see org.eclipse.eef.EefPackage#getEEFHyperlinkConditionalStyle_Style()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EEFHyperlinkStyle getStyle();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFHyperlinkConditionalStyle#getStyle <em>Style</em>}' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Style</em>' containment reference.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(EEFHyperlinkStyle value);

} // EEFHyperlinkConditionalStyle
