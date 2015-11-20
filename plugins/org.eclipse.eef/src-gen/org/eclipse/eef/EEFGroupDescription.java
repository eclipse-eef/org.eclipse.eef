/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>EEF Group Description</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.eef.EEFGroupDescription#getIdentifier <em>Identifier</em>}</li>
 * <li>{@link org.eclipse.eef.EEFGroupDescription#getLabelExpression <em>Label Expression</em>}</li>
 * <li>{@link org.eclipse.eef.EEFGroupDescription#getSemanticCandidateExpression <em>Semantic Candidate Expression</em>}
 * </li>
 * <li>{@link org.eclipse.eef.EEFGroupDescription#getContainer <em>Container</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eef.EefPackage#getEEFGroupDescription()
 * @model
 * @generated
 */
public interface EEFGroupDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * <!-- begin-model-doc --> Used to identify a specific Group in a Page. <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see org.eclipse.eef.EefPackage#getEEFGroupDescription_Identifier()
	 * @model required="true"
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFGroupDescription#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Label Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * --> <!-- begin-model-doc --> The label of the Group visible by the end users. If not specified, the Group is not
	 * drawn only its contained widgets are shown, else it is visible as a section. <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Label Expression</em>' attribute.
	 * @see #setLabelExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFGroupDescription_LabelExpression()
	 * @model
	 * @generated
	 */
	String getLabelExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFGroupDescription#getLabelExpression <em>Label Expression</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Label Expression</em>' attribute.
	 * @see #getLabelExpression()
	 * @generated
	 */
	void setLabelExpression(String value);

	/**
	 * Returns the value of the '<em><b>Semantic Candidate Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc --> The elements that are represented. If not specified, the EEF runtime
	 * reuses the context of the Page for the Group. <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Semantic Candidate Expression</em>' attribute.
	 * @see #setSemanticCandidateExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFGroupDescription_SemanticCandidateExpression()
	 * @model
	 * @generated
	 */
	String getSemanticCandidateExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFGroupDescription#getSemanticCandidateExpression
	 * <em>Semantic Candidate Expression</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Semantic Candidate Expression</em>' attribute.
	 * @see #getSemanticCandidateExpression()
	 * @generated
	 */
	void setSemanticCandidateExpression(String value);

	/**
	 * Returns the value of the '<em><b>Container</b></em>' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc --> Contains the container related to a group. <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Container</em>' containment reference.
	 * @see #setContainer(EEFContainerDescription)
	 * @see org.eclipse.eef.EefPackage#getEEFGroupDescription_Container()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	EEFContainerDescription getContainer();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFGroupDescription#getContainer <em>Container</em>}' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Container</em>' containment reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(EEFContainerDescription value);

} // EEFGroupDescription
