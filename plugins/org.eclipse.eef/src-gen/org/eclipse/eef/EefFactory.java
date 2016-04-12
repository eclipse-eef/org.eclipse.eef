/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each non-abstract class of
 * the model. <!-- end-user-doc -->
 *
 * @see org.eclipse.eef.EefPackage
 * @generated
 */
public interface EefFactory extends EFactory {
	/**
	 * The singleton instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	EefFactory eINSTANCE = org.eclipse.eef.impl.EefFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>EEF View Description</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>EEF View Description</em>'.
	 * @generated
	 */
	EEFViewDescription createEEFViewDescription();

	/**
	 * Returns a new object of class '<em>EEF Page Description</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>EEF Page Description</em>'.
	 * @generated
	 */
	EEFPageDescription createEEFPageDescription();

	/**
	 * Returns a new object of class '<em>EEF Rule Audit Description</em>'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @return a new object of class '<em>EEF Rule Audit Description</em>'.
	 * @generated
	 */
	EEFRuleAuditDescription createEEFRuleAuditDescription();

	/**
	 * Returns a new object of class '<em>EEF Validation Fix Description</em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @return a new object of class '<em>EEF Validation Fix Description</em>'.
	 * @generated
	 */
	EEFValidationFixDescription createEEFValidationFixDescription();

	/**
	 * Returns a new object of class '<em>EEF Property Validation Rule Description</em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @return a new object of class '<em>EEF Property Validation Rule Description</em>'.
	 * @generated
	 */
	EEFPropertyValidationRuleDescription createEEFPropertyValidationRuleDescription();

	/**
	 * Returns a new object of class '<em>EEF Semantic Validation Rule Description</em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @return a new object of class '<em>EEF Semantic Validation Rule Description</em>'.
	 * @generated
	 */
	EEFSemanticValidationRuleDescription createEEFSemanticValidationRuleDescription();

	/**
	 * Returns a new object of class '<em>EEF Group Description</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>EEF Group Description</em>'.
	 * @generated
	 */
	EEFGroupDescription createEEFGroupDescription();

	/**
	 * Returns a new object of class '<em>EEF Container Description</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>EEF Container Description</em>'.
	 * @generated
	 */
	EEFContainerDescription createEEFContainerDescription();

	/**
	 * Returns a new object of class '<em>EEF Text Description</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>EEF Text Description</em>'.
	 * @generated
	 */
	EEFTextDescription createEEFTextDescription();

	/**
	 * Returns a new object of class '<em>EEF Label Description</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>EEF Label Description</em>'.
	 * @generated
	 */
	EEFLabelDescription createEEFLabelDescription();

	/**
	 * Returns a new object of class '<em>EEF Button Description</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>EEF Button Description</em>'.
	 * @generated
	 */
	EEFButtonDescription createEEFButtonDescription();

	/**
	 * Returns a new object of class '<em>EEF Checkbox Description</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>EEF Checkbox Description</em>'.
	 * @generated
	 */
	EEFCheckboxDescription createEEFCheckboxDescription();

	/**
	 * Returns a new object of class '<em>EEF Select Description</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>EEF Select Description</em>'.
	 * @generated
	 */
	EEFSelectDescription createEEFSelectDescription();

	/**
	 * Returns a new object of class '<em>EEF Radio Description</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>EEF Radio Description</em>'.
	 * @generated
	 */
	EEFRadioDescription createEEFRadioDescription();

	/**
	 * Returns a new object of class '<em>EEF Dynamic Mapping For</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>EEF Dynamic Mapping For</em>'.
	 * @generated
	 */
	EEFDynamicMappingFor createEEFDynamicMappingFor();

	/**
	 * Returns a new object of class '<em>EEF Dynamic Mapping If</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>EEF Dynamic Mapping If</em>'.
	 * @generated
	 */
	EEFDynamicMappingIf createEEFDynamicMappingIf();

	/**
	 * Returns a new object of class '<em>EEF Custom Widget Description</em>'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @return a new object of class '<em>EEF Custom Widget Description</em>'.
	 * @generated
	 */
	EEFCustomWidgetDescription createEEFCustomWidgetDescription();

	/**
	 * Returns a new object of class '<em>EEF Custom Expression</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>EEF Custom Expression</em>'.
	 * @generated
	 */
	EEFCustomExpression createEEFCustomExpression();

	/**
	 * Returns a new object of class '<em>EEF Reference Description</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>EEF Reference Description</em>'.
	 * @generated
	 */
	EEFReferenceDescription createEEFReferenceDescription();

	/**
	 * Returns a new object of class '<em>EEF Text Style</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>EEF Text Style</em>'.
	 * @generated
	 */
	EEFTextStyle createEEFTextStyle();

	/**
	 * Returns a new object of class '<em>EEF Label Style</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>EEF Label Style</em>'.
	 * @generated
	 */
	EEFLabelStyle createEEFLabelStyle();

	/**
	 * Returns a new object of class '<em>EEF Button Style</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>EEF Button Style</em>'.
	 * @generated
	 */
	EEFButtonStyle createEEFButtonStyle();

	/**
	 * Returns a new object of class '<em>EEF Checkbox Style</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>EEF Checkbox Style</em>'.
	 * @generated
	 */
	EEFCheckboxStyle createEEFCheckboxStyle();

	/**
	 * Returns a new object of class '<em>EEF Select Style</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>EEF Select Style</em>'.
	 * @generated
	 */
	EEFSelectStyle createEEFSelectStyle();

	/**
	 * Returns a new object of class '<em>EEF Radio Style</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>EEF Radio Style</em>'.
	 * @generated
	 */
	EEFRadioStyle createEEFRadioStyle();

	/**
	 * Returns a new object of class '<em>EEF Widget Action</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>EEF Widget Action</em>'.
	 * @generated
	 */
	EEFWidgetAction createEEFWidgetAction();

	/**
	 * Returns a new object of class '<em>EEF Reference Style</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>EEF Reference Style</em>'.
	 * @generated
	 */
	EEFReferenceStyle createEEFReferenceStyle();

	/**
	 * Returns the package supported by this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the package supported by this factory.
	 * @generated
	 */
	EefPackage getEefPackage();

} // EefFactory
