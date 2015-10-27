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
 * A representation of the model object '<em><b>EEF Container Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Holds the widgets of a Group.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eef.EEFContainerDescription#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.eef.EEFContainerDescription#getPreconditionExpression <em>Precondition Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.EEFContainerDescription#getUserDefinedVariables <em>User Defined Variables</em>}</li>
 *   <li>{@link org.eclipse.eef.EEFContainerDescription#getSemanticCandidateExpression <em>Semantic Candidate Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.EEFContainerDescription#getDomainClass <em>Domain Class</em>}</li>
 *   <li>{@link org.eclipse.eef.EEFContainerDescription#getLayoutColumnCount <em>Layout Column Count</em>}</li>
 *   <li>{@link org.eclipse.eef.EEFContainerDescription#getContainers <em>Containers</em>}</li>
 *   <li>{@link org.eclipse.eef.EEFContainerDescription#getWidgets <em>Widgets</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eef.EefPackage#getEEFContainerDescription()
 * @model
 * @generated
 */
public interface EEFContainerDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used to identify a specific Container in a Group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see org.eclipse.eef.EefPackage#getEEFContainerDescription_Identifier()
	 * @model required="true"
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFContainerDescription#getIdentifier <em>Identifier</em>}' attribute.
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
	 * Defines the condition on which the Container will be visible.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Precondition Expression</em>' attribute.
	 * @see #setPreconditionExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFContainerDescription_PreconditionExpression()
	 * @model dataType="org.eclipse.sirius.expression.Expression"
	 * @generated
	 */
	String getPreconditionExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFContainerDescription#getPreconditionExpression <em>Precondition Expression</em>}' attribute.
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
	 * @see org.eclipse.eef.EefPackage#getEEFContainerDescription_UserDefinedVariables()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<UserDefinedVariable> getUserDefinedVariables();

	/**
	 * Returns the value of the '<em><b>Semantic Candidate Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The elements that are represented. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Semantic Candidate Expression</em>' attribute.
	 * @see #setSemanticCandidateExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFContainerDescription_SemanticCandidateExpression()
	 * @model dataType="org.eclipse.sirius.expression.Expression"
	 * @generated
	 */
	String getSemanticCandidateExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFContainerDescription#getSemanticCandidateExpression <em>Semantic Candidate Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semantic Candidate Expression</em>' attribute.
	 * @see #getSemanticCandidateExpression()
	 * @generated
	 */
	void setSemanticCandidateExpression(String value);

	/**
	 * Returns the value of the '<em><b>Domain Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the context in which the Container is used. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domain Class</em>' attribute.
	 * @see #setDomainClass(String)
	 * @see org.eclipse.eef.EefPackage#getEEFContainerDescription_DomainClass()
	 * @model dataType="org.eclipse.eef.TypeName"
	 * @generated
	 */
	String getDomainClass();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFContainerDescription#getDomainClass <em>Domain Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Class</em>' attribute.
	 * @see #getDomainClass()
	 * @generated
	 */
	void setDomainClass(String value);

	/**
	 * Returns the value of the '<em><b>Layout Column Count</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of available columns. If the number of elements is higher than the number of columns then the elements are represented on the next line.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Layout Column Count</em>' attribute.
	 * @see #setLayoutColumnCount(int)
	 * @see org.eclipse.eef.EefPackage#getEEFContainerDescription_LayoutColumnCount()
	 * @model default="1"
	 * @generated
	 */
	int getLayoutColumnCount();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFContainerDescription#getLayoutColumnCount <em>Layout Column Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout Column Count</em>' attribute.
	 * @see #getLayoutColumnCount()
	 * @generated
	 */
	void setLayoutColumnCount(int value);

	/**
	 * Returns the value of the '<em><b>Containers</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.eef.EEFContainerDescription}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines sub-containers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Containers</em>' containment reference list.
	 * @see org.eclipse.eef.EefPackage#getEEFContainerDescription_Containers()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<EEFContainerDescription> getContainers();

	/**
	 * Returns the value of the '<em><b>Widgets</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.eef.EEFWidgetDescription}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the widgets to hold.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Widgets</em>' containment reference list.
	 * @see org.eclipse.eef.EefPackage#getEEFContainerDescription_Widgets()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	EList<EEFWidgetDescription> getWidgets();

} // EEFContainerDescription
