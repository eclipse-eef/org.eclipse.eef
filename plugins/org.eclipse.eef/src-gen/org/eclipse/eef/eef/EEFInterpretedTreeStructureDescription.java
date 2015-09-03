/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef.eef;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EEF Interpreted Tree Structure Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines the structure of a Tree based on expressions and variables interpreted by the EEF runtime.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eef.eef.EEFInterpretedTreeStructureDescription#getRootsExpression <em>Roots Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.eef.EEFInterpretedTreeStructureDescription#getChildrenExpression <em>Children Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.eef.EEFInterpretedTreeStructureDescription#getSelectablePredicateExpression <em>Selectable Predicate Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.eef.EEFInterpretedTreeStructureDescription#getCandidateDisplayExpression <em>Candidate Display Expression</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eef.eef.EefPackage#getEEFInterpretedTreeStructureDescription()
 * @model
 * @generated
 */
public interface EEFInterpretedTreeStructureDescription extends EEFTreeStructureDescription {
	/**
	 * Returns the value of the '<em><b>Roots Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the collection of elements that could be roots of the Tree.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Roots Expression</em>' attribute.
	 * @see #setRootsExpression(String)
	 * @see org.eclipse.eef.eef.EefPackage#getEEFInterpretedTreeStructureDescription_RootsExpression()
	 * @model dataType="org.eclipse.eef.eef.Expression"
	 * @generated
	 */
	String getRootsExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.eef.EEFInterpretedTreeStructureDescription#getRootsExpression <em>Roots Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roots Expression</em>' attribute.
	 * @see #getRootsExpression()
	 * @generated
	 */
	void setRootsExpression(String value);

	/**
	 * Returns the value of the '<em><b>Children Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines how to compute the children.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Children Expression</em>' attribute.
	 * @see #setChildrenExpression(String)
	 * @see org.eclipse.eef.eef.EefPackage#getEEFInterpretedTreeStructureDescription_ChildrenExpression()
	 * @model dataType="org.eclipse.eef.eef.Expression"
	 * @generated
	 */
	String getChildrenExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.eef.EEFInterpretedTreeStructureDescription#getChildrenExpression <em>Children Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Children Expression</em>' attribute.
	 * @see #getChildrenExpression()
	 * @generated
	 */
	void setChildrenExpression(String value);

	/**
	 * Returns the value of the '<em><b>Selectable Predicate Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the elements of the Tree that can be selected.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Selectable Predicate Expression</em>' attribute.
	 * @see #setSelectablePredicateExpression(String)
	 * @see org.eclipse.eef.eef.EefPackage#getEEFInterpretedTreeStructureDescription_SelectablePredicateExpression()
	 * @model dataType="org.eclipse.eef.eef.Expression"
	 * @generated
	 */
	String getSelectablePredicateExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.eef.EEFInterpretedTreeStructureDescription#getSelectablePredicateExpression <em>Selectable Predicate Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selectable Predicate Expression</em>' attribute.
	 * @see #getSelectablePredicateExpression()
	 * @generated
	 */
	void setSelectablePredicateExpression(String value);

	/**
	 * Returns the value of the '<em><b>Candidate Display Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates how to display the input value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Candidate Display Expression</em>' attribute.
	 * @see #setCandidateDisplayExpression(String)
	 * @see org.eclipse.eef.eef.EefPackage#getEEFInterpretedTreeStructureDescription_CandidateDisplayExpression()
	 * @model dataType="org.eclipse.eef.eef.Expression"
	 * @generated
	 */
	String getCandidateDisplayExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.eef.EEFInterpretedTreeStructureDescription#getCandidateDisplayExpression <em>Candidate Display Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Candidate Display Expression</em>' attribute.
	 * @see #getCandidateDisplayExpression()
	 * @generated
	 */
	void setCandidateDisplayExpression(String value);

} // EEFInterpretedTreeStructureDescription
