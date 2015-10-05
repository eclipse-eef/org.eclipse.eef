/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 */
package org.eclipse.sirius.expression;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines an expression.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.expression.ExpressionDescription#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link org.eclipse.sirius.expression.ExpressionDescription#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link org.eclipse.sirius.expression.ExpressionDescription#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.eclipse.sirius.expression.ExpressionDescription#getVariables <em>Variables</em>}</li>
 *   <li>{@link org.eclipse.sirius.expression.ExpressionDescription#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.eclipse.sirius.expression.ExpressionDescription#getLabel <em>Label</em>}</li>
 *   <li>{@link org.eclipse.sirius.expression.ExpressionDescription#getContextableElements <em>Contextable Elements</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.expression.ExpressionPackage#getExpressionDescription()
 * @model
 * @generated
 */
public interface ExpressionDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the return type lower bound.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lower Bound</em>' attribute.
	 * @see #setLowerBound(int)
	 * @see org.eclipse.sirius.expression.ExpressionPackage#getExpressionDescription_LowerBound()
	 * @model
	 * @generated
	 */
	int getLowerBound();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.expression.ExpressionDescription#getLowerBound <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' attribute.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(int value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the return type upper bound.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Upper Bound</em>' attribute.
	 * @see #setUpperBound(int)
	 * @see org.eclipse.sirius.expression.ExpressionPackage#getExpressionDescription_UpperBound()
	 * @model default="1"
	 * @generated
	 */
	int getUpperBound();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.expression.ExpressionDescription#getUpperBound <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' attribute.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(int value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References an expression from another metamodel.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expression</em>' reference.
	 * @see #setExpression(EStructuralFeature)
	 * @see org.eclipse.sirius.expression.ExpressionPackage#getExpressionDescription_Expression()
	 * @model
	 * @generated
	 */
	EStructuralFeature getExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.expression.ExpressionDescription#getExpression <em>Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(EStructuralFeature value);

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.expression.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains the variables associated to an expression description.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variables</em>' reference list.
	 * @see org.eclipse.sirius.expression.ExpressionPackage#getExpressionDescription_Variables()
	 * @model
	 * @generated
	 */
	EList<Variable> getVariables();

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the return type of an expression.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Return Type</em>' reference.
	 * @see #setReturnType(EClassifier)
	 * @see org.eclipse.sirius.expression.ExpressionPackage#getExpressionDescription_ReturnType()
	 * @model
	 * @generated
	 */
	EClassifier getReturnType();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.expression.ExpressionDescription#getReturnType <em>Return Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(EClassifier value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the label of theexpression.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see org.eclipse.sirius.expression.ExpressionPackage#getExpressionDescription_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.expression.ExpressionDescription#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Contextable Elements</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References contextable elements to get the associated context variables.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contextable Elements</em>' reference list.
	 * @see org.eclipse.sirius.expression.ExpressionPackage#getExpressionDescription_ContextableElements()
	 * @model
	 * @generated
	 */
	EList<EClass> getContextableElements();

} // ExpressionDescription
