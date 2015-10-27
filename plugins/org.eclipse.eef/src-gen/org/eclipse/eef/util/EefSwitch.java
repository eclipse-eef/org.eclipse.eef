/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef.util;

import org.eclipse.eef.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.eef.EefPackage
 * @generated
 */
public class EefSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EefPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EefSwitch() {
		if (modelPackage == null) {
			modelPackage = EefPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case EefPackage.EEF_VIEW_DESCRIPTION: {
			EEFViewDescription eefViewDescription = (EEFViewDescription) theEObject;
			T result = caseEEFViewDescription(eefViewDescription);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EefPackage.EEF_PAGE_DESCRIPTION: {
			EEFPageDescription eefPageDescription = (EEFPageDescription) theEObject;
			T result = caseEEFPageDescription(eefPageDescription);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EefPackage.EEF_GROUP_DESCRIPTION: {
			EEFGroupDescription eefGroupDescription = (EEFGroupDescription) theEObject;
			T result = caseEEFGroupDescription(eefGroupDescription);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EefPackage.EEF_CONTAINER_DESCRIPTION: {
			EEFContainerDescription eefContainerDescription = (EEFContainerDescription) theEObject;
			T result = caseEEFContainerDescription(eefContainerDescription);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EefPackage.EEF_WIDGET_DESCRIPTION: {
			EEFWidgetDescription eefWidgetDescription = (EEFWidgetDescription) theEObject;
			T result = caseEEFWidgetDescription(eefWidgetDescription);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EefPackage.EEF_JAVA_EXTENSION_DESCRIPTION: {
			EEFJavaExtensionDescription eefJavaExtensionDescription = (EEFJavaExtensionDescription) theEObject;
			T result = caseEEFJavaExtensionDescription(eefJavaExtensionDescription);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EefPackage.EEF_TREE_STRUCTURE_DESCRIPTION: {
			EEFTreeStructureDescription eefTreeStructureDescription = (EEFTreeStructureDescription) theEObject;
			T result = caseEEFTreeStructureDescription(eefTreeStructureDescription);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EefPackage.EEF_INTERPRETED_TABLE_STRUCTURE_DESCRIPTION: {
			EEFInterpretedTableStructureDescription eefInterpretedTableStructureDescription = (EEFInterpretedTableStructureDescription) theEObject;
			T result = caseEEFInterpretedTableStructureDescription(eefInterpretedTableStructureDescription);
			if (result == null)
				result = caseEEFTableStructureDescription(eefInterpretedTableStructureDescription);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EefPackage.EEF_CELL_WIDGET_DESCRIPTION: {
			EEFCellWidgetDescription eefCellWidgetDescription = (EEFCellWidgetDescription) theEObject;
			T result = caseEEFCellWidgetDescription(eefCellWidgetDescription);
			if (result == null)
				result = caseEEFWidgetDescription(eefCellWidgetDescription);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EefPackage.EEF_ADAPTER_FACTORY_TREE_STRUCTURE_DESCRIPTION: {
			EEFAdapterFactoryTreeStructureDescription eefAdapterFactoryTreeStructureDescription = (EEFAdapterFactoryTreeStructureDescription) theEObject;
			T result = caseEEFAdapterFactoryTreeStructureDescription(eefAdapterFactoryTreeStructureDescription);
			if (result == null)
				result = caseEEFTreeStructureDescription(eefAdapterFactoryTreeStructureDescription);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EefPackage.EEF_INTERPRETED_TREE_STRUCTURE_DESCRIPTION: {
			EEFInterpretedTreeStructureDescription eefInterpretedTreeStructureDescription = (EEFInterpretedTreeStructureDescription) theEObject;
			T result = caseEEFInterpretedTreeStructureDescription(eefInterpretedTreeStructureDescription);
			if (result == null)
				result = caseEEFTreeStructureDescription(eefInterpretedTreeStructureDescription);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EefPackage.EEF_TEXT_DESCRIPTION: {
			EEFTextDescription eefTextDescription = (EEFTextDescription) theEObject;
			T result = caseEEFTextDescription(eefTextDescription);
			if (result == null)
				result = caseEEFCellWidgetDescription(eefTextDescription);
			if (result == null)
				result = caseEEFWidgetDescription(eefTextDescription);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EefPackage.EEF_CHECKBOX_DESCRIPTION: {
			EEFCheckboxDescription eefCheckboxDescription = (EEFCheckboxDescription) theEObject;
			T result = caseEEFCheckboxDescription(eefCheckboxDescription);
			if (result == null)
				result = caseEEFCellWidgetDescription(eefCheckboxDescription);
			if (result == null)
				result = caseEEFWidgetDescription(eefCheckboxDescription);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EefPackage.EEF_SELECT_DESCRIPTION: {
			EEFSelectDescription eefSelectDescription = (EEFSelectDescription) theEObject;
			T result = caseEEFSelectDescription(eefSelectDescription);
			if (result == null)
				result = caseEEFCellWidgetDescription(eefSelectDescription);
			if (result == null)
				result = caseEEFWidgetDescription(eefSelectDescription);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EefPackage.EEF_LABEL_DESCRIPTION: {
			EEFLabelDescription eefLabelDescription = (EEFLabelDescription) theEObject;
			T result = caseEEFLabelDescription(eefLabelDescription);
			if (result == null)
				result = caseEEFCellWidgetDescription(eefLabelDescription);
			if (result == null)
				result = caseEEFWidgetDescription(eefLabelDescription);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EefPackage.EEF_RADIO_DESCRIPTION: {
			EEFRadioDescription eefRadioDescription = (EEFRadioDescription) theEObject;
			T result = caseEEFRadioDescription(eefRadioDescription);
			if (result == null)
				result = caseEEFWidgetDescription(eefRadioDescription);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EefPackage.EEF_TREE_DIALOG_SELECT_DESCRIPTION: {
			EEFTreeDialogSelectDescription eefTreeDialogSelectDescription = (EEFTreeDialogSelectDescription) theEObject;
			T result = caseEEFTreeDialogSelectDescription(eefTreeDialogSelectDescription);
			if (result == null)
				result = caseEEFCellWidgetDescription(eefTreeDialogSelectDescription);
			if (result == null)
				result = caseEEFWidgetDescription(eefTreeDialogSelectDescription);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EefPackage.EEF_LINK_DESCRIPTION: {
			EEFLinkDescription eefLinkDescription = (EEFLinkDescription) theEObject;
			T result = caseEEFLinkDescription(eefLinkDescription);
			if (result == null)
				result = caseEEFCellWidgetDescription(eefLinkDescription);
			if (result == null)
				result = caseEEFWidgetDescription(eefLinkDescription);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EefPackage.EEF_IMAGE_DESCRIPTION: {
			EEFImageDescription eefImageDescription = (EEFImageDescription) theEObject;
			T result = caseEEFImageDescription(eefImageDescription);
			if (result == null)
				result = caseEEFCellWidgetDescription(eefImageDescription);
			if (result == null)
				result = caseEEFWidgetDescription(eefImageDescription);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EefPackage.EEF_TREE_DESCRIPTION: {
			EEFTreeDescription eefTreeDescription = (EEFTreeDescription) theEObject;
			T result = caseEEFTreeDescription(eefTreeDescription);
			if (result == null)
				result = caseEEFCellWidgetDescription(eefTreeDescription);
			if (result == null)
				result = caseEEFWidgetDescription(eefTreeDescription);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EefPackage.EEF_IMAGE_PICKER_DESCRIPTION: {
			EEFImagePickerDescription eefImagePickerDescription = (EEFImagePickerDescription) theEObject;
			T result = caseEEFImagePickerDescription(eefImagePickerDescription);
			if (result == null)
				result = caseEEFWidgetDescription(eefImagePickerDescription);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EefPackage.EEF_TABLE_DESCRIPTION: {
			EEFTableDescription eefTableDescription = (EEFTableDescription) theEObject;
			T result = caseEEFTableDescription(eefTableDescription);
			if (result == null)
				result = caseEEFWidgetDescription(eefTableDescription);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EefPackage.EEF_COLUMN_DESCRIPTION: {
			EEFColumnDescription eefColumnDescription = (EEFColumnDescription) theEObject;
			T result = caseEEFColumnDescription(eefColumnDescription);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EefPackage.EEF_LINE_DESCRIPTION: {
			EEFLineDescription eefLineDescription = (EEFLineDescription) theEObject;
			T result = caseEEFLineDescription(eefLineDescription);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EefPackage.EEF_TABLE_STRUCTURE_DESCRIPTION: {
			EEFTableStructureDescription eefTableStructureDescription = (EEFTableStructureDescription) theEObject;
			T result = caseEEFTableStructureDescription(eefTableStructureDescription);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EefPackage.EEF_ADAPTER_FACTORY_TABLE_STRUCTURE_DESCRIPTION: {
			EEFAdapterFactoryTableStructureDescription eefAdapterFactoryTableStructureDescription = (EEFAdapterFactoryTableStructureDescription) theEObject;
			T result = caseEEFAdapterFactoryTableStructureDescription(eefAdapterFactoryTableStructureDescription);
			if (result == null)
				result = caseEEFTableStructureDescription(eefAdapterFactoryTableStructureDescription);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EefPackage.EEF_STYLE: {
			EEFStyle eefStyle = (EEFStyle) theEObject;
			T result = caseEEFStyle(eefStyle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EefPackage.EEF_CONDITIONAL_STYLE: {
			EEFConditionalStyle eefConditionalStyle = (EEFConditionalStyle) theEObject;
			T result = caseEEFConditionalStyle(eefConditionalStyle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EefPackage.EEF_STYLE_CUSTOMIZATION: {
			EEFStyleCustomization eefStyleCustomization = (EEFStyleCustomization) theEObject;
			T result = caseEEFStyleCustomization(eefStyleCustomization);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EefPackage.EEF_GROUP_STYLE: {
			EEFGroupStyle eefGroupStyle = (EEFGroupStyle) theEObject;
			T result = caseEEFGroupStyle(eefGroupStyle);
			if (result == null)
				result = caseEEFStyle(eefGroupStyle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EefPackage.EEF_GROUP_CONDITIONAL_STYLE: {
			EEFGroupConditionalStyle eefGroupConditionalStyle = (EEFGroupConditionalStyle) theEObject;
			T result = caseEEFGroupConditionalStyle(eefGroupConditionalStyle);
			if (result == null)
				result = caseEEFConditionalStyle(eefGroupConditionalStyle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EefPackage.EEF_GROUP_STYLE_CUSTOMIZATION: {
			EEFGroupStyleCustomization eefGroupStyleCustomization = (EEFGroupStyleCustomization) theEObject;
			T result = caseEEFGroupStyleCustomization(eefGroupStyleCustomization);
			if (result == null)
				result = caseEEFStyleCustomization(eefGroupStyleCustomization);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EefPackage.EEF_TEXT_STYLE: {
			EEFTextStyle eefTextStyle = (EEFTextStyle) theEObject;
			T result = caseEEFTextStyle(eefTextStyle);
			if (result == null)
				result = caseEEFStyle(eefTextStyle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EefPackage.EEF_TEXT_CONDITIONAL_STYLE: {
			EEFTextConditionalStyle eefTextConditionalStyle = (EEFTextConditionalStyle) theEObject;
			T result = caseEEFTextConditionalStyle(eefTextConditionalStyle);
			if (result == null)
				result = caseEEFConditionalStyle(eefTextConditionalStyle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EefPackage.EEF_TEXT_STYLE_CUSTOMIZATION: {
			EEFTextStyleCustomization eefTextStyleCustomization = (EEFTextStyleCustomization) theEObject;
			T result = caseEEFTextStyleCustomization(eefTextStyleCustomization);
			if (result == null)
				result = caseEEFStyleCustomization(eefTextStyleCustomization);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EefPackage.EEF_CHECKBOX_STYLE: {
			EEFCheckboxStyle eefCheckboxStyle = (EEFCheckboxStyle) theEObject;
			T result = caseEEFCheckboxStyle(eefCheckboxStyle);
			if (result == null)
				result = caseEEFStyle(eefCheckboxStyle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EefPackage.EEF_CHECKBOX_CONDITIONAL_STYLE: {
			EEFCheckboxConditionalStyle eefCheckboxConditionalStyle = (EEFCheckboxConditionalStyle) theEObject;
			T result = caseEEFCheckboxConditionalStyle(eefCheckboxConditionalStyle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EefPackage.EEF_CHECKBOX_STYLE_CUSTOMIZATION: {
			EEFCheckboxStyleCustomization eefCheckboxStyleCustomization = (EEFCheckboxStyleCustomization) theEObject;
			T result = caseEEFCheckboxStyleCustomization(eefCheckboxStyleCustomization);
			if (result == null)
				result = caseEEFStyleCustomization(eefCheckboxStyleCustomization);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EefPackage.EEF_LABEL_STYLE: {
			EEFLabelStyle eefLabelStyle = (EEFLabelStyle) theEObject;
			T result = caseEEFLabelStyle(eefLabelStyle);
			if (result == null)
				result = caseEEFStyle(eefLabelStyle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EefPackage.EEF_LABEL_CONDITIONAL_STYLE: {
			EEFLabelConditionalStyle eefLabelConditionalStyle = (EEFLabelConditionalStyle) theEObject;
			T result = caseEEFLabelConditionalStyle(eefLabelConditionalStyle);
			if (result == null)
				result = caseEEFConditionalStyle(eefLabelConditionalStyle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EefPackage.EEF_LABEL_STYLE_CUSTOMIZATION: {
			EEFLabelStyleCustomization eefLabelStyleCustomization = (EEFLabelStyleCustomization) theEObject;
			T result = caseEEFLabelStyleCustomization(eefLabelStyleCustomization);
			if (result == null)
				result = caseEEFStyleCustomization(eefLabelStyleCustomization);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EefPackage.EEF_RADIO_STYLE: {
			EEFRadioStyle eefRadioStyle = (EEFRadioStyle) theEObject;
			T result = caseEEFRadioStyle(eefRadioStyle);
			if (result == null)
				result = caseEEFStyle(eefRadioStyle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EefPackage.EEF_RADIO_CONDITIONAL_STYLE: {
			EEFRadioConditionalStyle eefRadioConditionalStyle = (EEFRadioConditionalStyle) theEObject;
			T result = caseEEFRadioConditionalStyle(eefRadioConditionalStyle);
			if (result == null)
				result = caseEEFConditionalStyle(eefRadioConditionalStyle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EefPackage.EEF_RADIO_STYLE_CUSTOMIZATION: {
			EEFRadioStyleCustomization eefRadioStyleCustomization = (EEFRadioStyleCustomization) theEObject;
			T result = caseEEFRadioStyleCustomization(eefRadioStyleCustomization);
			if (result == null)
				result = caseEEFStyleCustomization(eefRadioStyleCustomization);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EefPackage.EEF_LINK_STYLE: {
			EEFLinkStyle eefLinkStyle = (EEFLinkStyle) theEObject;
			T result = caseEEFLinkStyle(eefLinkStyle);
			if (result == null)
				result = caseEEFStyle(eefLinkStyle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EefPackage.EEF_LINK_CONDITIONAL_STYLE: {
			EEFLinkConditionalStyle eefLinkConditionalStyle = (EEFLinkConditionalStyle) theEObject;
			T result = caseEEFLinkConditionalStyle(eefLinkConditionalStyle);
			if (result == null)
				result = caseEEFConditionalStyle(eefLinkConditionalStyle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EefPackage.EEF_LINK_STYLE_CUSTOMIZATION: {
			EEFLinkStyleCustomization eefLinkStyleCustomization = (EEFLinkStyleCustomization) theEObject;
			T result = caseEEFLinkStyleCustomization(eefLinkStyleCustomization);
			if (result == null)
				result = caseEEFStyleCustomization(eefLinkStyleCustomization);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EefPackage.EEF_SELECT_STYLE: {
			EEFSelectStyle eefSelectStyle = (EEFSelectStyle) theEObject;
			T result = caseEEFSelectStyle(eefSelectStyle);
			if (result == null)
				result = caseEEFStyle(eefSelectStyle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EefPackage.EEF_SELECT_CONDITIONAL_STYLE: {
			EEFSelectConditionalStyle eefSelectConditionalStyle = (EEFSelectConditionalStyle) theEObject;
			T result = caseEEFSelectConditionalStyle(eefSelectConditionalStyle);
			if (result == null)
				result = caseEEFConditionalStyle(eefSelectConditionalStyle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EefPackage.EEF_SELECT_STYLE_CUSTOMIZATION: {
			EEFSelectStyleCustomization eefSelectStyleCustomization = (EEFSelectStyleCustomization) theEObject;
			T result = caseEEFSelectStyleCustomization(eefSelectStyleCustomization);
			if (result == null)
				result = caseEEFStyleCustomization(eefSelectStyleCustomization);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EefPackage.EEF_TREE_STYLE: {
			EEFTreeStyle eefTreeStyle = (EEFTreeStyle) theEObject;
			T result = caseEEFTreeStyle(eefTreeStyle);
			if (result == null)
				result = caseEEFStyle(eefTreeStyle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EefPackage.EEF_TREE_CONDITIONAL_STYLE: {
			EEFTreeConditionalStyle eefTreeConditionalStyle = (EEFTreeConditionalStyle) theEObject;
			T result = caseEEFTreeConditionalStyle(eefTreeConditionalStyle);
			if (result == null)
				result = caseEEFConditionalStyle(eefTreeConditionalStyle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EefPackage.EEF_TREE_STYLE_CUSTOMIZATION: {
			EEFTreeStyleCustomization eefTreeStyleCustomization = (EEFTreeStyleCustomization) theEObject;
			T result = caseEEFTreeStyleCustomization(eefTreeStyleCustomization);
			if (result == null)
				result = caseEEFStyleCustomization(eefTreeStyleCustomization);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EefPackage.EEF_TABLE_STYLE: {
			EEFTableStyle eefTableStyle = (EEFTableStyle) theEObject;
			T result = caseEEFTableStyle(eefTableStyle);
			if (result == null)
				result = caseEEFStyle(eefTableStyle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EefPackage.EEF_TABLE_CONDITIONAL_STYLE: {
			EEFTableConditionalStyle eefTableConditionalStyle = (EEFTableConditionalStyle) theEObject;
			T result = caseEEFTableConditionalStyle(eefTableConditionalStyle);
			if (result == null)
				result = caseEEFConditionalStyle(eefTableConditionalStyle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EefPackage.EEF_TABLE_STYLE_CUSTOMIZATION: {
			EEFTableStyleCustomization eefTableStyleCustomization = (EEFTableStyleCustomization) theEObject;
			T result = caseEEFTableStyleCustomization(eefTableStyleCustomization);
			if (result == null)
				result = caseEEFStyleCustomization(eefTableStyleCustomization);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EefPackage.EEF_LINE_STYLE: {
			EEFLineStyle eefLineStyle = (EEFLineStyle) theEObject;
			T result = caseEEFLineStyle(eefLineStyle);
			if (result == null)
				result = caseEEFStyle(eefLineStyle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EefPackage.EEF_LINE_CONDITIONAL_STYLE: {
			EEFLineConditionalStyle eefLineConditionalStyle = (EEFLineConditionalStyle) theEObject;
			T result = caseEEFLineConditionalStyle(eefLineConditionalStyle);
			if (result == null)
				result = caseEEFConditionalStyle(eefLineConditionalStyle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EefPackage.EEF_LINE_STYLE_CUSTOMIZATION: {
			EEFLineStyleCustomization eefLineStyleCustomization = (EEFLineStyleCustomization) theEObject;
			T result = caseEEFLineStyleCustomization(eefLineStyleCustomization);
			if (result == null)
				result = caseEEFStyleCustomization(eefLineStyleCustomization);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EefPackage.EEF_COLUMN_STYLE: {
			EEFColumnStyle eefColumnStyle = (EEFColumnStyle) theEObject;
			T result = caseEEFColumnStyle(eefColumnStyle);
			if (result == null)
				result = caseEEFStyle(eefColumnStyle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EefPackage.EEF_COLUMN_CONDITIONAL_STYLE: {
			EEFColumnConditionalStyle eefColumnConditionalStyle = (EEFColumnConditionalStyle) theEObject;
			T result = caseEEFColumnConditionalStyle(eefColumnConditionalStyle);
			if (result == null)
				result = caseEEFConditionalStyle(eefColumnConditionalStyle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EefPackage.EEF_COLUMN_STYLE_CUSTOMIZATION: {
			EEFColumnStyleCustomization eefColumnStyleCustomization = (EEFColumnStyleCustomization) theEObject;
			T result = caseEEFColumnStyleCustomization(eefColumnStyleCustomization);
			if (result == null)
				result = caseEEFStyleCustomization(eefColumnStyleCustomization);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EefPackage.EEF_QUICK_FIX: {
			EEFQuickFix eefQuickFix = (EEFQuickFix) theEObject;
			T result = caseEEFQuickFix(eefQuickFix);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EefPackage.EEF_VALIDATION: {
			EEFValidation eefValidation = (EEFValidation) theEObject;
			T result = caseEEFValidation(eefValidation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF View Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF View Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFViewDescription(EEFViewDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Page Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Page Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFPageDescription(EEFPageDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Group Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Group Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFGroupDescription(EEFGroupDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Container Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Container Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFContainerDescription(EEFContainerDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Widget Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Widget Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFWidgetDescription(EEFWidgetDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Java Extension Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Java Extension Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFJavaExtensionDescription(EEFJavaExtensionDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Tree Structure Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Tree Structure Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFTreeStructureDescription(EEFTreeStructureDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Interpreted Table Structure Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Interpreted Table Structure Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFInterpretedTableStructureDescription(EEFInterpretedTableStructureDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Cell Widget Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Cell Widget Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFCellWidgetDescription(EEFCellWidgetDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Adapter Factory Tree Structure Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Adapter Factory Tree Structure Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFAdapterFactoryTreeStructureDescription(EEFAdapterFactoryTreeStructureDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Interpreted Tree Structure Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Interpreted Tree Structure Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFInterpretedTreeStructureDescription(EEFInterpretedTreeStructureDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Text Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Text Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFTextDescription(EEFTextDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Checkbox Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Checkbox Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFCheckboxDescription(EEFCheckboxDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Select Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Select Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFSelectDescription(EEFSelectDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Label Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Label Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFLabelDescription(EEFLabelDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Radio Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Radio Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFRadioDescription(EEFRadioDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Tree Dialog Select Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Tree Dialog Select Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFTreeDialogSelectDescription(EEFTreeDialogSelectDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Link Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Link Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFLinkDescription(EEFLinkDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Image Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Image Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFImageDescription(EEFImageDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Tree Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Tree Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFTreeDescription(EEFTreeDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Image Picker Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Image Picker Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFImagePickerDescription(EEFImagePickerDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Table Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Table Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFTableDescription(EEFTableDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Column Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Column Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFColumnDescription(EEFColumnDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Line Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Line Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFLineDescription(EEFLineDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Table Structure Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Table Structure Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFTableStructureDescription(EEFTableStructureDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Adapter Factory Table Structure Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Adapter Factory Table Structure Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFAdapterFactoryTableStructureDescription(EEFAdapterFactoryTableStructureDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFStyle(EEFStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Conditional Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Conditional Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFConditionalStyle(EEFConditionalStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Style Customization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Style Customization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFStyleCustomization(EEFStyleCustomization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Group Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Group Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFGroupStyle(EEFGroupStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Group Conditional Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Group Conditional Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFGroupConditionalStyle(EEFGroupConditionalStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Group Style Customization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Group Style Customization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFGroupStyleCustomization(EEFGroupStyleCustomization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Text Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Text Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFTextStyle(EEFTextStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Text Conditional Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Text Conditional Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFTextConditionalStyle(EEFTextConditionalStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Text Style Customization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Text Style Customization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFTextStyleCustomization(EEFTextStyleCustomization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Checkbox Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Checkbox Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFCheckboxStyle(EEFCheckboxStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Checkbox Conditional Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Checkbox Conditional Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFCheckboxConditionalStyle(EEFCheckboxConditionalStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Checkbox Style Customization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Checkbox Style Customization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFCheckboxStyleCustomization(EEFCheckboxStyleCustomization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Label Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Label Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFLabelStyle(EEFLabelStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Label Conditional Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Label Conditional Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFLabelConditionalStyle(EEFLabelConditionalStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Label Style Customization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Label Style Customization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFLabelStyleCustomization(EEFLabelStyleCustomization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Radio Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Radio Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFRadioStyle(EEFRadioStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Radio Conditional Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Radio Conditional Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFRadioConditionalStyle(EEFRadioConditionalStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Radio Style Customization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Radio Style Customization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFRadioStyleCustomization(EEFRadioStyleCustomization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Link Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Link Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFLinkStyle(EEFLinkStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Link Conditional Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Link Conditional Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFLinkConditionalStyle(EEFLinkConditionalStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Link Style Customization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Link Style Customization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFLinkStyleCustomization(EEFLinkStyleCustomization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Select Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Select Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFSelectStyle(EEFSelectStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Select Conditional Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Select Conditional Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFSelectConditionalStyle(EEFSelectConditionalStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Select Style Customization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Select Style Customization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFSelectStyleCustomization(EEFSelectStyleCustomization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Tree Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Tree Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFTreeStyle(EEFTreeStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Tree Conditional Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Tree Conditional Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFTreeConditionalStyle(EEFTreeConditionalStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Tree Style Customization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Tree Style Customization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFTreeStyleCustomization(EEFTreeStyleCustomization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Table Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Table Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFTableStyle(EEFTableStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Table Conditional Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Table Conditional Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFTableConditionalStyle(EEFTableConditionalStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Table Style Customization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Table Style Customization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFTableStyleCustomization(EEFTableStyleCustomization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Line Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Line Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFLineStyle(EEFLineStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Line Conditional Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Line Conditional Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFLineConditionalStyle(EEFLineConditionalStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Line Style Customization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Line Style Customization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFLineStyleCustomization(EEFLineStyleCustomization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Column Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Column Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFColumnStyle(EEFColumnStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Column Conditional Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Column Conditional Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFColumnConditionalStyle(EEFColumnConditionalStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Column Style Customization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Column Style Customization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFColumnStyleCustomization(EEFColumnStyleCustomization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Quick Fix</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Quick Fix</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFQuickFix(EEFQuickFix object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Validation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Validation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFValidation(EEFValidation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //EefSwitch
