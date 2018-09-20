/**
 * Copyright (c) 2015, 2018 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *
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
	 * Returns a new object of class '<em>EEF Toolbar Action</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>EEF Toolbar Action</em>'.
	 * @generated
	 */
	EEFToolbarAction createEEFToolbarAction();

	/**
	 * Returns a new object of class '<em>EEF Container Description</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>EEF Container Description</em>'.
	 * @generated
	 */
	EEFContainerDescription createEEFContainerDescription();

	/**
	 * Returns a new object of class '<em>EEF Fill Layout Description</em>'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return a new object of class '<em>EEF Fill Layout Description</em>'.
	 * @generated
	 */
	EEFFillLayoutDescription createEEFFillLayoutDescription();

	/**
	 * Returns a new object of class '<em>EEF Grid Layout Description</em>'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return a new object of class '<em>EEF Grid Layout Description</em>'.
	 * @generated
	 */
	EEFGridLayoutDescription createEEFGridLayoutDescription();

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
	 * Returns a new object of class '<em>EEF Hyperlink Description</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>EEF Hyperlink Description</em>'.
	 * @generated
	 */
	EEFHyperlinkDescription createEEFHyperlinkDescription();

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
	 * Returns a new object of class '<em>EEF List Description</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>EEF List Description</em>'.
	 * @generated
	 */
	EEFListDescription createEEFListDescription();

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
	 * Returns a new object of class '<em>EEF Hyperlink Style</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>EEF Hyperlink Style</em>'.
	 * @generated
	 */
	EEFHyperlinkStyle createEEFHyperlinkStyle();

	/**
	 * Returns a new object of class '<em>EEF Custom Widget Style</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>EEF Custom Widget Style</em>'.
	 * @generated
	 */
	EEFCustomWidgetStyle createEEFCustomWidgetStyle();

	/**
	 * Returns a new object of class '<em>EEF List Style</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>EEF List Style</em>'.
	 * @generated
	 */
	EEFListStyle createEEFListStyle();

	/**
	 * Returns a new object of class '<em>EEF Group Style</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>EEF Group Style</em>'.
	 * @generated
	 */
	EEFGroupStyle createEEFGroupStyle();

	/**
	 * Returns a new object of class '<em>EEF Text Conditional Style</em>'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return a new object of class '<em>EEF Text Conditional Style</em>'.
	 * @generated
	 */
	EEFTextConditionalStyle createEEFTextConditionalStyle();

	/**
	 * Returns a new object of class '<em>EEF Button Conditional Style</em>'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return a new object of class '<em>EEF Button Conditional Style</em>'.
	 * @generated
	 */
	EEFButtonConditionalStyle createEEFButtonConditionalStyle();

	/**
	 * Returns a new object of class '<em>EEF Label Conditional Style</em>'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return a new object of class '<em>EEF Label Conditional Style</em>'.
	 * @generated
	 */
	EEFLabelConditionalStyle createEEFLabelConditionalStyle();

	/**
	 * Returns a new object of class '<em>EEF Checkbox Conditional Style</em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return a new object of class '<em>EEF Checkbox Conditional Style</em>'.
	 * @generated
	 */
	EEFCheckboxConditionalStyle createEEFCheckboxConditionalStyle();

	/**
	 * Returns a new object of class '<em>EEF Select Conditional Style</em>'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return a new object of class '<em>EEF Select Conditional Style</em>'.
	 * @generated
	 */
	EEFSelectConditionalStyle createEEFSelectConditionalStyle();

	/**
	 * Returns a new object of class '<em>EEF Radio Conditional Style</em>'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return a new object of class '<em>EEF Radio Conditional Style</em>'.
	 * @generated
	 */
	EEFRadioConditionalStyle createEEFRadioConditionalStyle();

	/**
	 * Returns a new object of class '<em>EEF Hyperlink Conditional Style</em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return a new object of class '<em>EEF Hyperlink Conditional Style</em>'.
	 * @generated
	 */
	EEFHyperlinkConditionalStyle createEEFHyperlinkConditionalStyle();

	/**
	 * Returns a new object of class '<em>EEF Custom Widget Conditional Style</em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return a new object of class '<em>EEF Custom Widget Conditional Style</em>'.
	 * @generated
	 */
	EEFCustomWidgetConditionalStyle createEEFCustomWidgetConditionalStyle();

	/**
	 * Returns a new object of class '<em>EEF Widget Action</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>EEF Widget Action</em>'.
	 * @generated
	 */
	EEFWidgetAction createEEFWidgetAction();

	/**
	 * Returns a new object of class '<em>EEF List Conditional Style</em>'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return a new object of class '<em>EEF List Conditional Style</em>'.
	 * @generated
	 */
	EEFListConditionalStyle createEEFListConditionalStyle();

	/**
	 * Returns a new object of class '<em>EEF Group Conditional Style</em>'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return a new object of class '<em>EEF Group Conditional Style</em>'.
	 * @generated
	 */
	EEFGroupConditionalStyle createEEFGroupConditionalStyle();

	/**
	 * Returns the package supported by this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the package supported by this factory.
	 * @generated
	 */
	EefPackage getEefPackage();

} // EefFactory
