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
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EEF Column Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a Column in a Table in the user interface.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eef.EEFColumnDescription#getWidth <em>Width</em>}</li>
 *   <li>{@link org.eclipse.eef.EEFColumnDescription#getHeaderExpression <em>Header Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.EEFColumnDescription#getCellWidget <em>Cell Widget</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eef.EefPackage#getEEFColumnDescription()
 * @model
 * @generated
 */
public interface EEFColumnDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the initial width of a column. It is a percentage of the total 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(int)
	 * @see org.eclipse.eef.EefPackage#getEEFColumnDescription_Width()
	 * @model
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFColumnDescription#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(int value);

	/**
	 * Returns the value of the '<em><b>Header Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates how to display the column table header.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Header Expression</em>' attribute.
	 * @see #setHeaderExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFColumnDescription_HeaderExpression()
	 * @model dataType="org.eclipse.sirius.expression.Expression"
	 * @generated
	 */
	String getHeaderExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFColumnDescription#getHeaderExpression <em>Header Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header Expression</em>' attribute.
	 * @see #getHeaderExpression()
	 * @generated
	 */
	void setHeaderExpression(String value);

	/**
	 * Returns the value of the '<em><b>Cell Widget</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the widget to represent in the cell.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cell Widget</em>' reference.
	 * @see #setCellWidget(EEFCellWidgetDescription)
	 * @see org.eclipse.eef.EefPackage#getEEFColumnDescription_CellWidget()
	 * @model
	 * @generated
	 */
	EEFCellWidgetDescription getCellWidget();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFColumnDescription#getCellWidget <em>Cell Widget</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cell Widget</em>' reference.
	 * @see #getCellWidget()
	 * @generated
	 */
	void setCellWidget(EEFCellWidgetDescription value);

} // EEFColumnDescription
