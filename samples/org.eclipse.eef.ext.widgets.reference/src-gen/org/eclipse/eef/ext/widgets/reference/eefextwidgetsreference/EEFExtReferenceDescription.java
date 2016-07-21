/**
 * Copyright (c) 2016 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference;

import org.eclipse.eef.EEFWidgetDescription;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>EEF Ext Reference Description</b></em>'. <!--
 * end-user-doc -->
 *
 * <!-- begin-model-doc --> Allows the edition of a reference. <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.EEFExtReferenceDescription#getReferenceName
 * <em>Reference Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.EefExtWidgetsReferencePackage#getEEFExtReferenceDescription()
 * @model
 * @generated
 */
public interface EEFExtReferenceDescription extends EEFWidgetDescription {
	/**
	 * Returns the value of the '<em><b>Reference Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * --> <!-- begin-model-doc --> The name of the reference to edit. <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Reference Name</em>' attribute.
	 * @see #setReferenceName(String)
	 * @see org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.EefExtWidgetsReferencePackage#getEEFExtReferenceDescription_ReferenceName()
	 * @model
	 * @generated
	 */
	String getReferenceName();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.EEFExtReferenceDescription#getReferenceName
	 * <em>Reference Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Reference Name</em>' attribute.
	 * @see #getReferenceName()
	 * @generated
	 */
	void setReferenceName(String value);

} // EEFExtReferenceDescription
