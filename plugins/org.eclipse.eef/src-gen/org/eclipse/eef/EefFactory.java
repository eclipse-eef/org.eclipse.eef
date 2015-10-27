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
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.eef.EefPackage
 * @generated
 */
public interface EefFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EefFactory eINSTANCE = org.eclipse.eef.impl.EefFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>EEF View Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF View Description</em>'.
	 * @generated
	 */
	EEFViewDescription createEEFViewDescription();

	/**
	 * Returns a new object of class '<em>EEF Page Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Page Description</em>'.
	 * @generated
	 */
	EEFPageDescription createEEFPageDescription();

	/**
	 * Returns a new object of class '<em>EEF Group Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Group Description</em>'.
	 * @generated
	 */
	EEFGroupDescription createEEFGroupDescription();

	/**
	 * Returns a new object of class '<em>EEF Container Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Container Description</em>'.
	 * @generated
	 */
	EEFContainerDescription createEEFContainerDescription();

	/**
	 * Returns a new object of class '<em>EEF Java Extension Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Java Extension Description</em>'.
	 * @generated
	 */
	EEFJavaExtensionDescription createEEFJavaExtensionDescription();

	/**
	 * Returns a new object of class '<em>EEF Interpreted Table Structure Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Interpreted Table Structure Description</em>'.
	 * @generated
	 */
	EEFInterpretedTableStructureDescription createEEFInterpretedTableStructureDescription();

	/**
	 * Returns a new object of class '<em>EEF Adapter Factory Tree Structure Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Adapter Factory Tree Structure Description</em>'.
	 * @generated
	 */
	EEFAdapterFactoryTreeStructureDescription createEEFAdapterFactoryTreeStructureDescription();

	/**
	 * Returns a new object of class '<em>EEF Interpreted Tree Structure Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Interpreted Tree Structure Description</em>'.
	 * @generated
	 */
	EEFInterpretedTreeStructureDescription createEEFInterpretedTreeStructureDescription();

	/**
	 * Returns a new object of class '<em>EEF Text Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Text Description</em>'.
	 * @generated
	 */
	EEFTextDescription createEEFTextDescription();

	/**
	 * Returns a new object of class '<em>EEF Checkbox Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Checkbox Description</em>'.
	 * @generated
	 */
	EEFCheckboxDescription createEEFCheckboxDescription();

	/**
	 * Returns a new object of class '<em>EEF Select Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Select Description</em>'.
	 * @generated
	 */
	EEFSelectDescription createEEFSelectDescription();

	/**
	 * Returns a new object of class '<em>EEF Label Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Label Description</em>'.
	 * @generated
	 */
	EEFLabelDescription createEEFLabelDescription();

	/**
	 * Returns a new object of class '<em>EEF Radio Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Radio Description</em>'.
	 * @generated
	 */
	EEFRadioDescription createEEFRadioDescription();

	/**
	 * Returns a new object of class '<em>EEF Tree Dialog Select Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Tree Dialog Select Description</em>'.
	 * @generated
	 */
	EEFTreeDialogSelectDescription createEEFTreeDialogSelectDescription();

	/**
	 * Returns a new object of class '<em>EEF Link Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Link Description</em>'.
	 * @generated
	 */
	EEFLinkDescription createEEFLinkDescription();

	/**
	 * Returns a new object of class '<em>EEF Image Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Image Description</em>'.
	 * @generated
	 */
	EEFImageDescription createEEFImageDescription();

	/**
	 * Returns a new object of class '<em>EEF Tree Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Tree Description</em>'.
	 * @generated
	 */
	EEFTreeDescription createEEFTreeDescription();

	/**
	 * Returns a new object of class '<em>EEF Image Picker Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Image Picker Description</em>'.
	 * @generated
	 */
	EEFImagePickerDescription createEEFImagePickerDescription();

	/**
	 * Returns a new object of class '<em>EEF Table Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Table Description</em>'.
	 * @generated
	 */
	EEFTableDescription createEEFTableDescription();

	/**
	 * Returns a new object of class '<em>EEF Column Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Column Description</em>'.
	 * @generated
	 */
	EEFColumnDescription createEEFColumnDescription();

	/**
	 * Returns a new object of class '<em>EEF Line Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Line Description</em>'.
	 * @generated
	 */
	EEFLineDescription createEEFLineDescription();

	/**
	 * Returns a new object of class '<em>EEF Adapter Factory Table Structure Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Adapter Factory Table Structure Description</em>'.
	 * @generated
	 */
	EEFAdapterFactoryTableStructureDescription createEEFAdapterFactoryTableStructureDescription();

	/**
	 * Returns a new object of class '<em>EEF Group Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Group Style</em>'.
	 * @generated
	 */
	EEFGroupStyle createEEFGroupStyle();

	/**
	 * Returns a new object of class '<em>EEF Group Conditional Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Group Conditional Style</em>'.
	 * @generated
	 */
	EEFGroupConditionalStyle createEEFGroupConditionalStyle();

	/**
	 * Returns a new object of class '<em>EEF Group Style Customization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Group Style Customization</em>'.
	 * @generated
	 */
	EEFGroupStyleCustomization createEEFGroupStyleCustomization();

	/**
	 * Returns a new object of class '<em>EEF Text Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Text Style</em>'.
	 * @generated
	 */
	EEFTextStyle createEEFTextStyle();

	/**
	 * Returns a new object of class '<em>EEF Text Conditional Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Text Conditional Style</em>'.
	 * @generated
	 */
	EEFTextConditionalStyle createEEFTextConditionalStyle();

	/**
	 * Returns a new object of class '<em>EEF Text Style Customization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Text Style Customization</em>'.
	 * @generated
	 */
	EEFTextStyleCustomization createEEFTextStyleCustomization();

	/**
	 * Returns a new object of class '<em>EEF Checkbox Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Checkbox Style</em>'.
	 * @generated
	 */
	EEFCheckboxStyle createEEFCheckboxStyle();

	/**
	 * Returns a new object of class '<em>EEF Checkbox Conditional Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Checkbox Conditional Style</em>'.
	 * @generated
	 */
	EEFCheckboxConditionalStyle createEEFCheckboxConditionalStyle();

	/**
	 * Returns a new object of class '<em>EEF Checkbox Style Customization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Checkbox Style Customization</em>'.
	 * @generated
	 */
	EEFCheckboxStyleCustomization createEEFCheckboxStyleCustomization();

	/**
	 * Returns a new object of class '<em>EEF Label Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Label Style</em>'.
	 * @generated
	 */
	EEFLabelStyle createEEFLabelStyle();

	/**
	 * Returns a new object of class '<em>EEF Label Conditional Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Label Conditional Style</em>'.
	 * @generated
	 */
	EEFLabelConditionalStyle createEEFLabelConditionalStyle();

	/**
	 * Returns a new object of class '<em>EEF Label Style Customization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Label Style Customization</em>'.
	 * @generated
	 */
	EEFLabelStyleCustomization createEEFLabelStyleCustomization();

	/**
	 * Returns a new object of class '<em>EEF Radio Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Radio Style</em>'.
	 * @generated
	 */
	EEFRadioStyle createEEFRadioStyle();

	/**
	 * Returns a new object of class '<em>EEF Radio Conditional Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Radio Conditional Style</em>'.
	 * @generated
	 */
	EEFRadioConditionalStyle createEEFRadioConditionalStyle();

	/**
	 * Returns a new object of class '<em>EEF Radio Style Customization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Radio Style Customization</em>'.
	 * @generated
	 */
	EEFRadioStyleCustomization createEEFRadioStyleCustomization();

	/**
	 * Returns a new object of class '<em>EEF Link Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Link Style</em>'.
	 * @generated
	 */
	EEFLinkStyle createEEFLinkStyle();

	/**
	 * Returns a new object of class '<em>EEF Link Conditional Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Link Conditional Style</em>'.
	 * @generated
	 */
	EEFLinkConditionalStyle createEEFLinkConditionalStyle();

	/**
	 * Returns a new object of class '<em>EEF Link Style Customization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Link Style Customization</em>'.
	 * @generated
	 */
	EEFLinkStyleCustomization createEEFLinkStyleCustomization();

	/**
	 * Returns a new object of class '<em>EEF Select Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Select Style</em>'.
	 * @generated
	 */
	EEFSelectStyle createEEFSelectStyle();

	/**
	 * Returns a new object of class '<em>EEF Select Conditional Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Select Conditional Style</em>'.
	 * @generated
	 */
	EEFSelectConditionalStyle createEEFSelectConditionalStyle();

	/**
	 * Returns a new object of class '<em>EEF Select Style Customization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Select Style Customization</em>'.
	 * @generated
	 */
	EEFSelectStyleCustomization createEEFSelectStyleCustomization();

	/**
	 * Returns a new object of class '<em>EEF Tree Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Tree Style</em>'.
	 * @generated
	 */
	EEFTreeStyle createEEFTreeStyle();

	/**
	 * Returns a new object of class '<em>EEF Tree Conditional Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Tree Conditional Style</em>'.
	 * @generated
	 */
	EEFTreeConditionalStyle createEEFTreeConditionalStyle();

	/**
	 * Returns a new object of class '<em>EEF Tree Style Customization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Tree Style Customization</em>'.
	 * @generated
	 */
	EEFTreeStyleCustomization createEEFTreeStyleCustomization();

	/**
	 * Returns a new object of class '<em>EEF Table Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Table Style</em>'.
	 * @generated
	 */
	EEFTableStyle createEEFTableStyle();

	/**
	 * Returns a new object of class '<em>EEF Table Conditional Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Table Conditional Style</em>'.
	 * @generated
	 */
	EEFTableConditionalStyle createEEFTableConditionalStyle();

	/**
	 * Returns a new object of class '<em>EEF Table Style Customization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Table Style Customization</em>'.
	 * @generated
	 */
	EEFTableStyleCustomization createEEFTableStyleCustomization();

	/**
	 * Returns a new object of class '<em>EEF Line Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Line Style</em>'.
	 * @generated
	 */
	EEFLineStyle createEEFLineStyle();

	/**
	 * Returns a new object of class '<em>EEF Line Conditional Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Line Conditional Style</em>'.
	 * @generated
	 */
	EEFLineConditionalStyle createEEFLineConditionalStyle();

	/**
	 * Returns a new object of class '<em>EEF Line Style Customization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Line Style Customization</em>'.
	 * @generated
	 */
	EEFLineStyleCustomization createEEFLineStyleCustomization();

	/**
	 * Returns a new object of class '<em>EEF Column Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Column Style</em>'.
	 * @generated
	 */
	EEFColumnStyle createEEFColumnStyle();

	/**
	 * Returns a new object of class '<em>EEF Column Conditional Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Column Conditional Style</em>'.
	 * @generated
	 */
	EEFColumnConditionalStyle createEEFColumnConditionalStyle();

	/**
	 * Returns a new object of class '<em>EEF Column Style Customization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Column Style Customization</em>'.
	 * @generated
	 */
	EEFColumnStyleCustomization createEEFColumnStyleCustomization();

	/**
	 * Returns a new object of class '<em>EEF Quick Fix</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Quick Fix</em>'.
	 * @generated
	 */
	EEFQuickFix createEEFQuickFix();

	/**
	 * Returns a new object of class '<em>EEF Validation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Validation</em>'.
	 * @generated
	 */
	EEFValidation createEEFValidation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EefPackage getEefPackage();

} //EefFactory
