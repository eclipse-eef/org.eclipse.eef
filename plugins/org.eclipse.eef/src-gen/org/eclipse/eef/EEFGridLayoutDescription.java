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
 * <!-- begin-user-doc --> A representation of the model object '<em><b>EEF Grid Layout Description</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.eef.EEFGridLayoutDescription#getNumberOfColumns <em>Number Of Columns</em>}</li>
 * <li>{@link org.eclipse.eef.EEFGridLayoutDescription#isMakeColumnsWithEqualWidth <em>Make Columns With Equal
 * Width</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eef.EefPackage#getEEFGridLayoutDescription()
 * @model
 * @generated
 */
public interface EEFGridLayoutDescription extends EEFLayoutDescription {
	/**
	 * Returns the value of the '<em><b>Number Of Columns</b></em>' attribute. The default value is <code>"1"</code>.
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> The number of columns used inside the grid
	 * layout. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Number Of Columns</em>' attribute.
	 * @see #setNumberOfColumns(int)
	 * @see org.eclipse.eef.EefPackage#getEEFGridLayoutDescription_NumberOfColumns()
	 * @model default="1"
	 * @generated
	 */
	int getNumberOfColumns();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFGridLayoutDescription#getNumberOfColumns <em>Number Of
	 * Columns</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Number Of Columns</em>' attribute.
	 * @see #getNumberOfColumns()
	 * @generated
	 */
	void setNumberOfColumns(int value);

	/**
	 * Returns the value of the '<em><b>Make Columns With Equal Width</b></em>' attribute. The default value is
	 * <code>"true"</code>. <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Indicates if the
	 * columns should have an equal width. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Make Columns With Equal Width</em>' attribute.
	 * @see #setMakeColumnsWithEqualWidth(boolean)
	 * @see org.eclipse.eef.EefPackage#getEEFGridLayoutDescription_MakeColumnsWithEqualWidth()
	 * @model default="true"
	 * @generated
	 */
	boolean isMakeColumnsWithEqualWidth();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFGridLayoutDescription#isMakeColumnsWithEqualWidth <em>Make
	 * Columns With Equal Width</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Make Columns With Equal Width</em>' attribute.
	 * @see #isMakeColumnsWithEqualWidth()
	 * @generated
	 */
	void setMakeColumnsWithEqualWidth(boolean value);

} // EEFGridLayoutDescription
