/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>EEF Widget Style</b></em>'. <!-- end-user-doc
 * -->
 *
 *
 * @see org.eclipse.eef.EefPackage#getEEFWidgetStyle()
 * @model
 * @generated
 */
public interface EEFWidgetStyle extends EObject {

	/**
	 * Returns the value of the '<em><b>Label Style</b></em>' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc --> Defines the label style <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Label Style</em>' containment reference.
	 * @see #setLabelStyle(EEFTextStyle)
	 * @see org.eclipse.eef.EefPackage#getEEFWidgetStyle_LabelStyle()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EEFTextStyle getLabelStyle();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFWidgetStyle#getLabelStyle <em>Label Style</em>}' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Label Style</em>' containment reference.
	 * @see #getLabelStyle()
	 * @generated
	 */
	void setLabelStyle(EEFTextStyle value);
} // EEFWidgetStyle
