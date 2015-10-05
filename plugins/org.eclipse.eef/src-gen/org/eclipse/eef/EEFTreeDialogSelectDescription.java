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
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EEF Tree Dialog Select Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a dialog showing a tree in the user interface.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eef.EEFTreeDialogSelectDescription#getSemanticCandidateExpression <em>Semantic Candidate Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.EEFTreeDialogSelectDescription#getDefaultFilter <em>Default Filter</em>}</li>
 *   <li>{@link org.eclipse.eef.EEFTreeDialogSelectDescription#getDomainClass <em>Domain Class</em>}</li>
 *   <li>{@link org.eclipse.eef.EEFTreeDialogSelectDescription#getTree <em>Tree</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eef.EefPackage#getEEFTreeDialogSelectDescription()
 * @model
 * @generated
 */
public interface EEFTreeDialogSelectDescription extends EEFCellWidgetDescription {
	/**
	 * Returns the value of the '<em><b>Semantic Candidate Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The elements that are represented.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Semantic Candidate Expression</em>' attribute.
	 * @see #setSemanticCandidateExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFTreeDialogSelectDescription_SemanticCandidateExpression()
	 * @model dataType="org.eclipse.eef.Expression"
	 * @generated
	 */
	String getSemanticCandidateExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFTreeDialogSelectDescription#getSemanticCandidateExpression <em>Semantic Candidate Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semantic Candidate Expression</em>' attribute.
	 * @see #getSemanticCandidateExpression()
	 * @generated
	 */
	void setSemanticCandidateExpression(String value);

	/**
	 * Returns the value of the '<em><b>Default Filter</b></em>' attribute.
	 * The default value is <code>"*"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defins the default value for filtering field.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Filter</em>' attribute.
	 * @see #setDefaultFilter(String)
	 * @see org.eclipse.eef.EefPackage#getEEFTreeDialogSelectDescription_DefaultFilter()
	 * @model default="*"
	 * @generated
	 */
	String getDefaultFilter();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFTreeDialogSelectDescription#getDefaultFilter <em>Default Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Filter</em>' attribute.
	 * @see #getDefaultFilter()
	 * @generated
	 */
	void setDefaultFilter(String value);

	/**
	 * Returns the value of the '<em><b>Domain Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the context in which the Tree Dialog Select is used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domain Class</em>' attribute.
	 * @see #setDomainClass(String)
	 * @see org.eclipse.eef.EefPackage#getEEFTreeDialogSelectDescription_DomainClass()
	 * @model dataType="org.eclipse.eef.TypeName"
	 * @generated
	 */
	String getDomainClass();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFTreeDialogSelectDescription#getDomainClass <em>Domain Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Class</em>' attribute.
	 * @see #getDomainClass()
	 * @generated
	 */
	void setDomainClass(String value);

	/**
	 * Returns the value of the '<em><b>Tree</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the Tree widget displayed in the select dialog.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tree</em>' reference.
	 * @see #setTree(EEFTreeDescription)
	 * @see org.eclipse.eef.EefPackage#getEEFTreeDialogSelectDescription_Tree()
	 * @model
	 * @generated
	 */
	EEFTreeDescription getTree();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFTreeDialogSelectDescription#getTree <em>Tree</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tree</em>' reference.
	 * @see #getTree()
	 * @generated
	 */
	void setTree(EEFTreeDescription value);

} // EEFTreeDialogSelectDescription
