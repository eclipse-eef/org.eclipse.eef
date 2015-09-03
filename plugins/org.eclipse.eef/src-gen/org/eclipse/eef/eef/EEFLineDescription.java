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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EEF Line Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a Line in a Table in the user interface.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eef.eef.EEFLineDescription#getHeaderExpression <em>Header Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.eef.EEFLineDescription#getSemanticCandidatesExpression <em>Semantic Candidates Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.eef.EEFLineDescription#getDomainClass <em>Domain Class</em>}</li>
 *   <li>{@link org.eclipse.eef.eef.EEFLineDescription#getSubLines <em>Sub Lines</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eef.eef.EefPackage#getEEFLineDescription()
 * @model
 * @generated
 */
public interface EEFLineDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Header Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates how to display the line table header. If not set, the default column will not be visible.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Header Expression</em>' attribute.
	 * @see #setHeaderExpression(String)
	 * @see org.eclipse.eef.eef.EefPackage#getEEFLineDescription_HeaderExpression()
	 * @model
	 * @generated
	 */
	String getHeaderExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.eef.EEFLineDescription#getHeaderExpression <em>Header Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header Expression</em>' attribute.
	 * @see #getHeaderExpression()
	 * @generated
	 */
	void setHeaderExpression(String value);

	/**
	 * Returns the value of the '<em><b>Semantic Candidates Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The elements that are represented.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Semantic Candidates Expression</em>' attribute.
	 * @see #setSemanticCandidatesExpression(String)
	 * @see org.eclipse.eef.eef.EefPackage#getEEFLineDescription_SemanticCandidatesExpression()
	 * @model dataType="org.eclipse.eef.eef.Expression"
	 * @generated
	 */
	String getSemanticCandidatesExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.eef.EEFLineDescription#getSemanticCandidatesExpression <em>Semantic Candidates Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semantic Candidates Expression</em>' attribute.
	 * @see #getSemanticCandidatesExpression()
	 * @generated
	 */
	void setSemanticCandidatesExpression(String value);

	/**
	 * Returns the value of the '<em><b>Domain Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the context in which the Line is used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domain Class</em>' attribute.
	 * @see #setDomainClass(String)
	 * @see org.eclipse.eef.eef.EefPackage#getEEFLineDescription_DomainClass()
	 * @model dataType="org.eclipse.eef.eef.TypeName"
	 * @generated
	 */
	String getDomainClass();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.eef.EEFLineDescription#getDomainClass <em>Domain Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Class</em>' attribute.
	 * @see #getDomainClass()
	 * @generated
	 */
	void setDomainClass(String value);

	/**
	 * Returns the value of the '<em><b>Sub Lines</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.eef.eef.EEFLineDescription}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References lines that will be represented as sub lines in the table, this allows to get a kind of tree inside a table.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Lines</em>' containment reference list.
	 * @see org.eclipse.eef.eef.EefPackage#getEEFLineDescription_SubLines()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<EEFLineDescription> getSubLines();

} // EEFLineDescription
