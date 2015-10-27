/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.sirius.expression.UserDefinedVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EEF Widget Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Graphical element.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eef.EEFWidgetDescription#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.eef.EEFWidgetDescription#getPreconditionExpression <em>Precondition Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.EEFWidgetDescription#getUserDefinedVariables <em>User Defined Variables</em>}</li>
 *   <li>{@link org.eclipse.eef.EEFWidgetDescription#getLabelExpression <em>Label Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.EEFWidgetDescription#getLabelStyle <em>Label Style</em>}</li>
 *   <li>{@link org.eclipse.eef.EEFWidgetDescription#getTooltipExpression <em>Tooltip Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.EEFWidgetDescription#getHelpExpression <em>Help Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.EEFWidgetDescription#getValidation <em>Validation</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eef.EefPackage#getEEFWidgetDescription()
 * @model abstract="true"
 * @generated
 */
public interface EEFWidgetDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used to identify a specific widget.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see org.eclipse.eef.EefPackage#getEEFWidgetDescription_Identifier()
	 * @model required="true"
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFWidgetDescription#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Precondition Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the condition on which the Widget will be visible.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Precondition Expression</em>' attribute.
	 * @see #setPreconditionExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFWidgetDescription_PreconditionExpression()
	 * @model dataType="org.eclipse.sirius.expression.Expression"
	 * @generated
	 */
	String getPreconditionExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFWidgetDescription#getPreconditionExpression <em>Precondition Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precondition Expression</em>' attribute.
	 * @see #getPreconditionExpression()
	 * @generated
	 */
	void setPreconditionExpression(String value);

	/**
	 * Returns the value of the '<em><b>User Defined Variables</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.expression.UserDefinedVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains the variables defined by the end user.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>User Defined Variables</em>' containment reference list.
	 * @see org.eclipse.eef.EefPackage#getEEFWidgetDescription_UserDefinedVariables()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<UserDefinedVariable> getUserDefinedVariables();

	/**
	 * Returns the value of the '<em><b>Label Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The label of the Widget visible by the end-users.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Label Expression</em>' attribute.
	 * @see #setLabelExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFWidgetDescription_LabelExpression()
	 * @model dataType="org.eclipse.sirius.expression.Expression"
	 * @generated
	 */
	String getLabelExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFWidgetDescription#getLabelExpression <em>Label Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Expression</em>' attribute.
	 * @see #getLabelExpression()
	 * @generated
	 */
	void setLabelExpression(String value);

	/**
	 * Returns the value of the '<em><b>Label Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The style of the label.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Label Style</em>' reference.
	 * @see #setLabelStyle(EEFLabelStyle)
	 * @see org.eclipse.eef.EefPackage#getEEFWidgetDescription_LabelStyle()
	 * @model
	 * @generated
	 */
	EEFLabelStyle getLabelStyle();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFWidgetDescription#getLabelStyle <em>Label Style</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Style</em>' reference.
	 * @see #getLabelStyle()
	 * @generated
	 */
	void setLabelStyle(EEFLabelStyle value);

	/**
	 * Returns the value of the '<em><b>Tooltip Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The tooltip of the Widget visible by the end-users.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tooltip Expression</em>' attribute.
	 * @see #setTooltipExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFWidgetDescription_TooltipExpression()
	 * @model dataType="org.eclipse.sirius.expression.Expression"
	 * @generated
	 */
	String getTooltipExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFWidgetDescription#getTooltipExpression <em>Tooltip Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tooltip Expression</em>' attribute.
	 * @see #getTooltipExpression()
	 * @generated
	 */
	void setTooltipExpression(String value);

	/**
	 * Returns the value of the '<em><b>Help Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The help of the Widget visible by the end-users.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Help Expression</em>' attribute.
	 * @see #setHelpExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFWidgetDescription_HelpExpression()
	 * @model dataType="org.eclipse.sirius.expression.Expression"
	 * @generated
	 */
	String getHelpExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFWidgetDescription#getHelpExpression <em>Help Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Help Expression</em>' attribute.
	 * @see #getHelpExpression()
	 * @generated
	 */
	void setHelpExpression(String value);

	/**
	 * Returns the value of the '<em><b>Validation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains the validation rule of the Widget.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Validation</em>' containment reference.
	 * @see #setValidation(EEFValidation)
	 * @see org.eclipse.eef.EefPackage#getEEFWidgetDescription_Validation()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EEFValidation getValidation();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFWidgetDescription#getValidation <em>Validation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validation</em>' containment reference.
	 * @see #getValidation()
	 * @generated
	 */
	void setValidation(EEFValidation value);

} // EEFWidgetDescription
