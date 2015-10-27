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
 * A representation of the model object '<em><b>EEF Page Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Page is a tab represented in a View. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eef.EEFPageDescription#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.eef.EEFPageDescription#getPreconditionExpression <em>Precondition Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.EEFPageDescription#getUserDefinedVariables <em>User Defined Variables</em>}</li>
 *   <li>{@link org.eclipse.eef.EEFPageDescription#getLabelExpression <em>Label Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.EEFPageDescription#getDomainClass <em>Domain Class</em>}</li>
 *   <li>{@link org.eclipse.eef.EEFPageDescription#getSemanticCandidateExpression <em>Semantic Candidate Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.EEFPageDescription#getGroups <em>Groups</em>}</li>
 *   <li>{@link org.eclipse.eef.EEFPageDescription#getExtendedPage <em>Extended Page</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eef.EefPackage#getEEFPageDescription()
 * @model
 * @generated
 */
public interface EEFPageDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used to identify a specific Page instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see org.eclipse.eef.EefPackage#getEEFPageDescription_Identifier()
	 * @model required="true"
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFPageDescription#getIdentifier <em>Identifier</em>}' attribute.
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
	 * Defines the condition on which the Page will be visible.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Precondition Expression</em>' attribute.
	 * @see #setPreconditionExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFPageDescription_PreconditionExpression()
	 * @model dataType="org.eclipse.sirius.expression.Expression"
	 * @generated
	 */
	String getPreconditionExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFPageDescription#getPreconditionExpression <em>Precondition Expression</em>}' attribute.
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
	 * @see org.eclipse.eef.EefPackage#getEEFPageDescription_UserDefinedVariables()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<UserDefinedVariable> getUserDefinedVariables();

	/**
	 * Returns the value of the '<em><b>Label Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The label of the Page visible by the end-users.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Label Expression</em>' attribute.
	 * @see #setLabelExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFPageDescription_LabelExpression()
	 * @model dataType="org.eclipse.sirius.expression.Expression"
	 * @generated
	 */
	String getLabelExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFPageDescription#getLabelExpression <em>Label Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Expression</em>' attribute.
	 * @see #getLabelExpression()
	 * @generated
	 */
	void setLabelExpression(String value);

	/**
	 * Returns the value of the '<em><b>Domain Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the context of the Page.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domain Class</em>' attribute.
	 * @see #setDomainClass(String)
	 * @see org.eclipse.eef.EefPackage#getEEFPageDescription_DomainClass()
	 * @model dataType="org.eclipse.eef.TypeName"
	 * @generated
	 */
	String getDomainClass();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFPageDescription#getDomainClass <em>Domain Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Class</em>' attribute.
	 * @see #getDomainClass()
	 * @generated
	 */
	void setDomainClass(String value);

	/**
	 * Returns the value of the '<em><b>Semantic Candidate Expression</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The elements that are represented. If not specified, the EEF runtime reuses the context of the View for the Page.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Semantic Candidate Expression</em>' attribute.
	 * @see #setSemanticCandidateExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFPageDescription_SemanticCandidateExpression()
	 * @model default="" dataType="org.eclipse.sirius.expression.Expression"
	 * @generated
	 */
	String getSemanticCandidateExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFPageDescription#getSemanticCandidateExpression <em>Semantic Candidate Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semantic Candidate Expression</em>' attribute.
	 * @see #getSemanticCandidateExpression()
	 * @generated
	 */
	void setSemanticCandidateExpression(String value);

	/**
	 * Returns the value of the '<em><b>Groups</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.eef.EEFGroupDescription}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the Groups which are visible in a Page. If not specified, the EEF runtime looks for all the Groups defined under the View containing the Page that have a domainClass which is equal or a super class of the domainClass of the Page and use them following the order of the inheritance tree of the EObject.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Groups</em>' reference list.
	 * @see org.eclipse.eef.EefPackage#getEEFPageDescription_Groups()
	 * @model
	 * @generated
	 */
	EList<EEFGroupDescription> getGroups();

	/**
	 * Returns the value of the '<em><b>Extended Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References existing pages in order to extend their contents by adding/hiding groups and widgets.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extended Page</em>' reference.
	 * @see #setExtendedPage(EEFPageDescription)
	 * @see org.eclipse.eef.EefPackage#getEEFPageDescription_ExtendedPage()
	 * @model
	 * @generated
	 */
	EEFPageDescription getExtendedPage();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFPageDescription#getExtendedPage <em>Extended Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended Page</em>' reference.
	 * @see #getExtendedPage()
	 * @generated
	 */
	void setExtendedPage(EEFPageDescription value);

} // EEFPageDescription
