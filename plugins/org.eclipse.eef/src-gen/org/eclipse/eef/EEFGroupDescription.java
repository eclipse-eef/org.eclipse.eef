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

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>EEF Group Description</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.eef.EEFGroupDescription#getIdentifier <em>Identifier</em>}</li>
 * <li>{@link org.eclipse.eef.EEFGroupDescription#getLabelExpression <em>Label Expression</em>}</li>
 * <li>{@link org.eclipse.eef.EEFGroupDescription#getDomainClass <em>Domain Class</em>}</li>
 * <li>{@link org.eclipse.eef.EEFGroupDescription#getSemanticCandidateExpression <em>Semantic Candidate Expression</em>}
 * </li>
 * <li>{@link org.eclipse.eef.EEFGroupDescription#getPreconditionExpression <em>Precondition Expression</em>}</li>
 * <li>{@link org.eclipse.eef.EEFGroupDescription#getControls <em>Controls</em>}</li>
 * <li>{@link org.eclipse.eef.EEFGroupDescription#getSemanticValidationRules <em>Semantic Validation Rules</em>}</li>
 * <li>{@link org.eclipse.eef.EEFGroupDescription#getPropertyValidationRules <em>Property Validation Rules</em>}</li>
 * <li>{@link org.eclipse.eef.EEFGroupDescription#getStyle <em>Style</em>}</li>
 * <li>{@link org.eclipse.eef.EEFGroupDescription#getConditionalStyles <em>Conditional Styles</em>}</li>
 * </ul>
 * </p>
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
	 * @model
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
	 * Returns the value of the '<em><b>Domain Class</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * <!-- begin-model-doc --> The class of the EObject used as "self" in the page <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Domain Class</em>' attribute.
	 * @see #setDomainClass(String)
	 * @see org.eclipse.eef.EefPackage#getEEFGroupDescription_DomainClass()
	 * @model
	 * @generated
	 */
	String getDomainClass();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFGroupDescription#getDomainClass <em>Domain Class</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Domain Class</em>' attribute.
	 * @see #getDomainClass()
	 * @generated
	 */
	void setDomainClass(String value);

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
	 * Returns the value of the '<em><b>Precondition Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc --> Indicates if the group should be displayed. <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Precondition Expression</em>' attribute.
	 * @see #setPreconditionExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFGroupDescription_PreconditionExpression()
	 * @model
	 * @generated
	 */
	String getPreconditionExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFGroupDescription#getPreconditionExpression
	 * <em>Precondition Expression</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Precondition Expression</em>' attribute.
	 * @see #getPreconditionExpression()
	 * @generated
	 */
	void setPreconditionExpression(String value);

	/**
	 * Returns the value of the '<em><b>Controls</b></em>' containment reference list. The list contents are of type
	 * {@link org.eclipse.eef.EEFControlDescription}. <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc
	 * --> Contains the controls related to a group. <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Controls</em>' containment reference list.
	 * @see org.eclipse.eef.EefPackage#getEEFGroupDescription_Controls()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	EList<EEFControlDescription> getControls();

	/**
	 * Returns the value of the '<em><b>Semantic Validation Rules</b></em>' containment reference list. The list
	 * contents are of type {@link org.eclipse.eef.EEFSemanticValidationRuleDescription}. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc --> The validation rules used to validate the semantic element of the
	 * group. <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Semantic Validation Rules</em>' containment reference list.
	 * @see org.eclipse.eef.EefPackage#getEEFGroupDescription_SemanticValidationRules()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<EEFSemanticValidationRuleDescription> getSemanticValidationRules();

	/**
	 * Returns the value of the '<em><b>Property Validation Rules</b></em>' containment reference list. The list
	 * contents are of type {@link org.eclipse.eef.EEFPropertyValidationRuleDescription}. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc --> The validation rules used to validate widgets of the group. <!--
	 * end-model-doc -->
	 *
	 * @return the value of the '<em>Property Validation Rules</em>' containment reference list.
	 * @see org.eclipse.eef.EefPackage#getEEFGroupDescription_PropertyValidationRules()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<EEFPropertyValidationRuleDescription> getPropertyValidationRules();

	/**
	 * Returns the value of the '<em><b>Style</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * --> <!-- begin-model-doc --> Defines the group style <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Style</em>' containment reference.
	 * @see #setStyle(EEFTextStyle)
	 * @see org.eclipse.eef.EefPackage#getEEFGroupDescription_Style()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EEFGroupStyle getStyle();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFGroupDescription#getStyle <em>Style</em>}' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Style</em>' containment reference.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(EEFGroupStyle value);

	/**
	 * Returns the value of the '<em><b>Conditional Styles</b></em>' containment reference list. The list contents are
	 * of type {@link org.eclipse.eef.EEFGroupConditionalStyle}. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
	 * begin-model-doc --> Defines the text style associated to a precondition <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Conditional Styles</em>' containment reference list.
	 * @see org.eclipse.eef.EefPackage#getEEFGroupDescription_ConditionalStyles()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<EEFGroupConditionalStyle> getConditionalStyles();

} // EEFGroupDescription
