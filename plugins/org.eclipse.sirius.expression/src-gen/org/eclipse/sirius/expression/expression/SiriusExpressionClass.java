/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 */
package org.eclipse.sirius.expression.expression;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sirius Expression Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Holds expression descriptions and variables.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.expression.expression.SiriusExpressionClass#getVariables <em>Variables</em>}</li>
 *   <li>{@link org.eclipse.sirius.expression.expression.SiriusExpressionClass#getExpressionDescriptions <em>Expression Descriptions</em>}</li>
 *   <li>{@link org.eclipse.sirius.expression.expression.SiriusExpressionClass#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.expression.expression.ExpressionPackage#getSiriusExpressionClass()
 * @model
 * @generated
 */
public interface SiriusExpressionClass extends EObject {
	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.expression.expression.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the variables. Variables are global as they can be referenced by any expression description.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see org.eclipse.sirius.expression.expression.ExpressionPackage#getSiriusExpressionClass_Variables()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Variable> getVariables();

	/**
	 * Returns the value of the '<em><b>Expression Descriptions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.expression.expression.ExpressionDescription}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the expressions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expression Descriptions</em>' containment reference list.
	 * @see org.eclipse.sirius.expression.expression.ExpressionPackage#getSiriusExpressionClass_ExpressionDescriptions()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<ExpressionDescription> getExpressionDescriptions();

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lable to identify an expression class.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see org.eclipse.sirius.expression.expression.ExpressionPackage#getSiriusExpressionClass_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.expression.expression.SiriusExpressionClass#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

} // SiriusExpressionClass
