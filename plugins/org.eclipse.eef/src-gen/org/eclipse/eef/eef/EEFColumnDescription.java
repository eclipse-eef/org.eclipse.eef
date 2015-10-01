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
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>EEF Column Description</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a Column in a Table in the user interface.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eef.eef.EEFColumnDescription#getWidth <em>Width</em>}</li>
 *   <li>{@link org.eclipse.eef.eef.EEFColumnDescription#getHeaderExpression <em>Header Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.eef.EEFColumnDescription#getCellWidget <em>Cell Widget</em>}</li>
 *   <li>{@link org.eclipse.eef.eef.EEFColumnDescription#getContextCandidatesExpression <em>Context Candidates Expression</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eef.eef.EefPackage#getEEFColumnDescription()
 * @model
 * @generated
 */
public interface EEFColumnDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(int)
	 * @see org.eclipse.eef.eef.EefPackage#getEEFColumnDescription_Width()
	 * @model
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.eef.EEFColumnDescription#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(int value);

	/**
	 * Returns the value of the '<em><b>Header Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates how to display the column table header.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Header Expression</em>' attribute.
	 * @see #setHeaderExpression(String)
	 * @see org.eclipse.eef.eef.EefPackage#getEEFColumnDescription_HeaderExpression()
	 * @model dataType="org.eclipse.eef.eef.Expression"
	 * @generated
	 */
	String getHeaderExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.eef.EEFColumnDescription#getHeaderExpression <em>Header Expression</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Header Expression</em>' attribute.
	 * @see #getHeaderExpression()
	 * @generated
	 */
	void setHeaderExpression(String value);

	/**
	 * Returns the value of the '<em><b>Cell Widget</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cell Widget</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Cell Widget</em>' reference.
	 * @see #setCellWidget(EEFCellWidgetDescription)
	 * @see org.eclipse.eef.eef.EefPackage#getEEFColumnDescription_CellWidget()
	 * @model
	 * @generated
	 */
	EEFCellWidgetDescription getCellWidget();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.eef.EEFColumnDescription#getCellWidget <em>Cell Widget</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Cell Widget</em>' reference.
	 * @see #getCellWidget()
	 * @generated
	 */
	void setCellWidget(EEFCellWidgetDescription value);

	/**
	 * Returns the value of the '<em><b>Context Candidates Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Candidates Expression</em>' attribute
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Candidates Expression</em>' attribute.
	 * @see #setContextCandidatesExpression(String)
	 * @see org.eclipse.eef.eef.EefPackage#getEEFColumnDescription_ContextCandidatesExpression()
	 * @model dataType="org.eclipse.eef.eef.Expression"
	 * @generated
	 */
	String getContextCandidatesExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.eef.EEFColumnDescription#getContextCandidatesExpression <em>Context Candidates Expression</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Candidates Expression</em>' attribute.
	 * @see #getContextCandidatesExpression()
	 * @generated
	 */
	void setContextCandidatesExpression(String value);

} // EEFColumnDescription
