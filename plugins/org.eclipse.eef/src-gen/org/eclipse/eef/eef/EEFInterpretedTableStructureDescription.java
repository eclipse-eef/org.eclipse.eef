/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef.eef;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EEF Interpreted Table Structure Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines the structure of a Table  based on expressions and variables interpreted by the EEF runtime.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eef.eef.EEFInterpretedTableStructureDescription#getColumns <em>Columns</em>}</li>
 *   <li>{@link org.eclipse.eef.eef.EEFInterpretedTableStructureDescription#getLine <em>Line</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eef.eef.EefPackage#getEEFInterpretedTableStructureDescription()
 * @model
 * @generated
 */
public interface EEFInterpretedTableStructureDescription extends EEFTableStructureDescription {
	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.eef.eef.EEFColumnDescription}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the table columns.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference list.
	 * @see org.eclipse.eef.eef.EefPackage#getEEFInterpretedTableStructureDescription_Columns()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<EEFColumnDescription> getColumns();

	/**
	 * Returns the value of the '<em><b>Line</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the table lines.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Line</em>' containment reference.
	 * @see #setLine(EEFLineDescription)
	 * @see org.eclipse.eef.eef.EefPackage#getEEFInterpretedTableStructureDescription_Line()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EEFLineDescription getLine();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.eef.EEFInterpretedTableStructureDescription#getLine <em>Line</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line</em>' containment reference.
	 * @see #getLine()
	 * @generated
	 */
	void setLine(EEFLineDescription value);

} // EEFInterpretedTableStructureDescription
