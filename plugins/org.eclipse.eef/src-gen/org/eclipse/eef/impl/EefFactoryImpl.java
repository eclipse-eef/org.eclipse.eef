/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef.impl;

import org.eclipse.eef.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EefFactoryImpl extends EFactoryImpl implements EefFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EefFactory init() {
		try {
			EefFactory theEefFactory = (EefFactory) EPackage.Registry.INSTANCE.getEFactory(EefPackage.eNS_URI);
			if (theEefFactory != null) {
				return theEefFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EefFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EefFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case EefPackage.EEF_VIEW_DESCRIPTION:
			return createEEFViewDescription();
		case EefPackage.EEF_PAGE_DESCRIPTION:
			return createEEFPageDescription();
		case EefPackage.EEF_GROUP_DESCRIPTION:
			return createEEFGroupDescription();
		case EefPackage.EEF_CONTAINER_DESCRIPTION:
			return createEEFContainerDescription();
		case EefPackage.EEF_JAVA_EXTENSION_DESCRIPTION:
			return createEEFJavaExtensionDescription();
		case EefPackage.EEF_INTERPRETED_TABLE_STRUCTURE_DESCRIPTION:
			return createEEFInterpretedTableStructureDescription();
		case EefPackage.EEF_ADAPTER_FACTORY_TREE_STRUCTURE_DESCRIPTION:
			return createEEFAdapterFactoryTreeStructureDescription();
		case EefPackage.EEF_INTERPRETED_TREE_STRUCTURE_DESCRIPTION:
			return createEEFInterpretedTreeStructureDescription();
		case EefPackage.EEF_TEXT_DESCRIPTION:
			return createEEFTextDescription();
		case EefPackage.EEF_CHECKBOX_DESCRIPTION:
			return createEEFCheckboxDescription();
		case EefPackage.EEF_SELECT_DESCRIPTION:
			return createEEFSelectDescription();
		case EefPackage.EEF_LABEL_DESCRIPTION:
			return createEEFLabelDescription();
		case EefPackage.EEF_RADIO_DESCRIPTION:
			return createEEFRadioDescription();
		case EefPackage.EEF_TREE_DIALOG_SELECT_DESCRIPTION:
			return createEEFTreeDialogSelectDescription();
		case EefPackage.EEF_LINK_DESCRIPTION:
			return createEEFLinkDescription();
		case EefPackage.EEF_IMAGE_DESCRIPTION:
			return createEEFImageDescription();
		case EefPackage.EEF_TREE_DESCRIPTION:
			return createEEFTreeDescription();
		case EefPackage.EEF_IMAGE_PICKER_DESCRIPTION:
			return createEEFImagePickerDescription();
		case EefPackage.EEF_TABLE_DESCRIPTION:
			return createEEFTableDescription();
		case EefPackage.EEF_COLUMN_DESCRIPTION:
			return createEEFColumnDescription();
		case EefPackage.EEF_LINE_DESCRIPTION:
			return createEEFLineDescription();
		case EefPackage.EEF_ADAPTER_FACTORY_TABLE_STRUCTURE_DESCRIPTION:
			return createEEFAdapterFactoryTableStructureDescription();
		case EefPackage.EEF_GROUP_STYLE:
			return createEEFGroupStyle();
		case EefPackage.EEF_GROUP_CONDITIONAL_STYLE:
			return createEEFGroupConditionalStyle();
		case EefPackage.EEF_GROUP_STYLE_CUSTOMIZATION:
			return createEEFGroupStyleCustomization();
		case EefPackage.EEF_TEXT_STYLE:
			return createEEFTextStyle();
		case EefPackage.EEF_TEXT_CONDITIONAL_STYLE:
			return createEEFTextConditionalStyle();
		case EefPackage.EEF_TEXT_STYLE_CUSTOMIZATION:
			return createEEFTextStyleCustomization();
		case EefPackage.EEF_CHECKBOX_STYLE:
			return createEEFCheckboxStyle();
		case EefPackage.EEF_CHECKBOX_CONDITIONAL_STYLE:
			return createEEFCheckboxConditionalStyle();
		case EefPackage.EEF_CHECKBOX_STYLE_CUSTOMIZATION:
			return createEEFCheckboxStyleCustomization();
		case EefPackage.EEF_LABEL_STYLE:
			return createEEFLabelStyle();
		case EefPackage.EEF_LABEL_CONDITIONAL_STYLE:
			return createEEFLabelConditionalStyle();
		case EefPackage.EEF_LABEL_STYLE_CUSTOMIZATION:
			return createEEFLabelStyleCustomization();
		case EefPackage.EEF_RADIO_STYLE:
			return createEEFRadioStyle();
		case EefPackage.EEF_RADIO_CONDITIONAL_STYLE:
			return createEEFRadioConditionalStyle();
		case EefPackage.EEF_RADIO_STYLE_CUSTOMIZATION:
			return createEEFRadioStyleCustomization();
		case EefPackage.EEF_LINK_STYLE:
			return createEEFLinkStyle();
		case EefPackage.EEF_LINK_CONDITIONAL_STYLE:
			return createEEFLinkConditionalStyle();
		case EefPackage.EEF_LINK_STYLE_CUSTOMIZATION:
			return createEEFLinkStyleCustomization();
		case EefPackage.EEF_SELECT_STYLE:
			return createEEFSelectStyle();
		case EefPackage.EEF_SELECT_CONDITIONAL_STYLE:
			return createEEFSelectConditionalStyle();
		case EefPackage.EEF_SELECT_STYLE_CUSTOMIZATION:
			return createEEFSelectStyleCustomization();
		case EefPackage.EEF_TREE_STYLE:
			return createEEFTreeStyle();
		case EefPackage.EEF_TREE_CONDITIONAL_STYLE:
			return createEEFTreeConditionalStyle();
		case EefPackage.EEF_TREE_STYLE_CUSTOMIZATION:
			return createEEFTreeStyleCustomization();
		case EefPackage.EEF_TABLE_STYLE:
			return createEEFTableStyle();
		case EefPackage.EEF_TABLE_CONDITIONAL_STYLE:
			return createEEFTableConditionalStyle();
		case EefPackage.EEF_TABLE_STYLE_CUSTOMIZATION:
			return createEEFTableStyleCustomization();
		case EefPackage.EEF_LINE_STYLE:
			return createEEFLineStyle();
		case EefPackage.EEF_LINE_CONDITIONAL_STYLE:
			return createEEFLineConditionalStyle();
		case EefPackage.EEF_LINE_STYLE_CUSTOMIZATION:
			return createEEFLineStyleCustomization();
		case EefPackage.EEF_COLUMN_STYLE:
			return createEEFColumnStyle();
		case EefPackage.EEF_COLUMN_CONDITIONAL_STYLE:
			return createEEFColumnConditionalStyle();
		case EefPackage.EEF_COLUMN_STYLE_CUSTOMIZATION:
			return createEEFColumnStyleCustomization();
		case EefPackage.EEF_QUICK_FIX:
			return createEEFQuickFix();
		case EefPackage.EEF_VALIDATION:
			return createEEFValidation();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case EefPackage.TYPE_NAME:
			return createTypeNameFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case EefPackage.TYPE_NAME:
			return convertTypeNameToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEFViewDescription createEEFViewDescription() {
		EEFViewDescriptionImpl eefViewDescription = new EEFViewDescriptionImpl();
		return eefViewDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEFPageDescription createEEFPageDescription() {
		EEFPageDescriptionImpl eefPageDescription = new EEFPageDescriptionImpl();
		return eefPageDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEFGroupDescription createEEFGroupDescription() {
		EEFGroupDescriptionImpl eefGroupDescription = new EEFGroupDescriptionImpl();
		return eefGroupDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEFContainerDescription createEEFContainerDescription() {
		EEFContainerDescriptionImpl eefContainerDescription = new EEFContainerDescriptionImpl();
		return eefContainerDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEFJavaExtensionDescription createEEFJavaExtensionDescription() {
		EEFJavaExtensionDescriptionImpl eefJavaExtensionDescription = new EEFJavaExtensionDescriptionImpl();
		return eefJavaExtensionDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEFInterpretedTableStructureDescription createEEFInterpretedTableStructureDescription() {
		EEFInterpretedTableStructureDescriptionImpl eefInterpretedTableStructureDescription = new EEFInterpretedTableStructureDescriptionImpl();
		return eefInterpretedTableStructureDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEFAdapterFactoryTreeStructureDescription createEEFAdapterFactoryTreeStructureDescription() {
		EEFAdapterFactoryTreeStructureDescriptionImpl eefAdapterFactoryTreeStructureDescription = new EEFAdapterFactoryTreeStructureDescriptionImpl();
		return eefAdapterFactoryTreeStructureDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEFInterpretedTreeStructureDescription createEEFInterpretedTreeStructureDescription() {
		EEFInterpretedTreeStructureDescriptionImpl eefInterpretedTreeStructureDescription = new EEFInterpretedTreeStructureDescriptionImpl();
		return eefInterpretedTreeStructureDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEFTextDescription createEEFTextDescription() {
		EEFTextDescriptionImpl eefTextDescription = new EEFTextDescriptionImpl();
		return eefTextDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEFCheckboxDescription createEEFCheckboxDescription() {
		EEFCheckboxDescriptionImpl eefCheckboxDescription = new EEFCheckboxDescriptionImpl();
		return eefCheckboxDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEFSelectDescription createEEFSelectDescription() {
		EEFSelectDescriptionImpl eefSelectDescription = new EEFSelectDescriptionImpl();
		return eefSelectDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEFLabelDescription createEEFLabelDescription() {
		EEFLabelDescriptionImpl eefLabelDescription = new EEFLabelDescriptionImpl();
		return eefLabelDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEFRadioDescription createEEFRadioDescription() {
		EEFRadioDescriptionImpl eefRadioDescription = new EEFRadioDescriptionImpl();
		return eefRadioDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEFTreeDialogSelectDescription createEEFTreeDialogSelectDescription() {
		EEFTreeDialogSelectDescriptionImpl eefTreeDialogSelectDescription = new EEFTreeDialogSelectDescriptionImpl();
		return eefTreeDialogSelectDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEFLinkDescription createEEFLinkDescription() {
		EEFLinkDescriptionImpl eefLinkDescription = new EEFLinkDescriptionImpl();
		return eefLinkDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEFImageDescription createEEFImageDescription() {
		EEFImageDescriptionImpl eefImageDescription = new EEFImageDescriptionImpl();
		return eefImageDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEFTreeDescription createEEFTreeDescription() {
		EEFTreeDescriptionImpl eefTreeDescription = new EEFTreeDescriptionImpl();
		return eefTreeDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEFImagePickerDescription createEEFImagePickerDescription() {
		EEFImagePickerDescriptionImpl eefImagePickerDescription = new EEFImagePickerDescriptionImpl();
		return eefImagePickerDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEFTableDescription createEEFTableDescription() {
		EEFTableDescriptionImpl eefTableDescription = new EEFTableDescriptionImpl();
		return eefTableDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEFColumnDescription createEEFColumnDescription() {
		EEFColumnDescriptionImpl eefColumnDescription = new EEFColumnDescriptionImpl();
		return eefColumnDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEFLineDescription createEEFLineDescription() {
		EEFLineDescriptionImpl eefLineDescription = new EEFLineDescriptionImpl();
		return eefLineDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEFAdapterFactoryTableStructureDescription createEEFAdapterFactoryTableStructureDescription() {
		EEFAdapterFactoryTableStructureDescriptionImpl eefAdapterFactoryTableStructureDescription = new EEFAdapterFactoryTableStructureDescriptionImpl();
		return eefAdapterFactoryTableStructureDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEFGroupStyle createEEFGroupStyle() {
		EEFGroupStyleImpl eefGroupStyle = new EEFGroupStyleImpl();
		return eefGroupStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEFGroupConditionalStyle createEEFGroupConditionalStyle() {
		EEFGroupConditionalStyleImpl eefGroupConditionalStyle = new EEFGroupConditionalStyleImpl();
		return eefGroupConditionalStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEFGroupStyleCustomization createEEFGroupStyleCustomization() {
		EEFGroupStyleCustomizationImpl eefGroupStyleCustomization = new EEFGroupStyleCustomizationImpl();
		return eefGroupStyleCustomization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEFTextStyle createEEFTextStyle() {
		EEFTextStyleImpl eefTextStyle = new EEFTextStyleImpl();
		return eefTextStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEFTextConditionalStyle createEEFTextConditionalStyle() {
		EEFTextConditionalStyleImpl eefTextConditionalStyle = new EEFTextConditionalStyleImpl();
		return eefTextConditionalStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEFTextStyleCustomization createEEFTextStyleCustomization() {
		EEFTextStyleCustomizationImpl eefTextStyleCustomization = new EEFTextStyleCustomizationImpl();
		return eefTextStyleCustomization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEFCheckboxStyle createEEFCheckboxStyle() {
		EEFCheckboxStyleImpl eefCheckboxStyle = new EEFCheckboxStyleImpl();
		return eefCheckboxStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEFCheckboxConditionalStyle createEEFCheckboxConditionalStyle() {
		EEFCheckboxConditionalStyleImpl eefCheckboxConditionalStyle = new EEFCheckboxConditionalStyleImpl();
		return eefCheckboxConditionalStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEFCheckboxStyleCustomization createEEFCheckboxStyleCustomization() {
		EEFCheckboxStyleCustomizationImpl eefCheckboxStyleCustomization = new EEFCheckboxStyleCustomizationImpl();
		return eefCheckboxStyleCustomization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEFLabelStyle createEEFLabelStyle() {
		EEFLabelStyleImpl eefLabelStyle = new EEFLabelStyleImpl();
		return eefLabelStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEFLabelConditionalStyle createEEFLabelConditionalStyle() {
		EEFLabelConditionalStyleImpl eefLabelConditionalStyle = new EEFLabelConditionalStyleImpl();
		return eefLabelConditionalStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEFLabelStyleCustomization createEEFLabelStyleCustomization() {
		EEFLabelStyleCustomizationImpl eefLabelStyleCustomization = new EEFLabelStyleCustomizationImpl();
		return eefLabelStyleCustomization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEFRadioStyle createEEFRadioStyle() {
		EEFRadioStyleImpl eefRadioStyle = new EEFRadioStyleImpl();
		return eefRadioStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEFRadioConditionalStyle createEEFRadioConditionalStyle() {
		EEFRadioConditionalStyleImpl eefRadioConditionalStyle = new EEFRadioConditionalStyleImpl();
		return eefRadioConditionalStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEFRadioStyleCustomization createEEFRadioStyleCustomization() {
		EEFRadioStyleCustomizationImpl eefRadioStyleCustomization = new EEFRadioStyleCustomizationImpl();
		return eefRadioStyleCustomization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEFLinkStyle createEEFLinkStyle() {
		EEFLinkStyleImpl eefLinkStyle = new EEFLinkStyleImpl();
		return eefLinkStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEFLinkConditionalStyle createEEFLinkConditionalStyle() {
		EEFLinkConditionalStyleImpl eefLinkConditionalStyle = new EEFLinkConditionalStyleImpl();
		return eefLinkConditionalStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEFLinkStyleCustomization createEEFLinkStyleCustomization() {
		EEFLinkStyleCustomizationImpl eefLinkStyleCustomization = new EEFLinkStyleCustomizationImpl();
		return eefLinkStyleCustomization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEFSelectStyle createEEFSelectStyle() {
		EEFSelectStyleImpl eefSelectStyle = new EEFSelectStyleImpl();
		return eefSelectStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEFSelectConditionalStyle createEEFSelectConditionalStyle() {
		EEFSelectConditionalStyleImpl eefSelectConditionalStyle = new EEFSelectConditionalStyleImpl();
		return eefSelectConditionalStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEFSelectStyleCustomization createEEFSelectStyleCustomization() {
		EEFSelectStyleCustomizationImpl eefSelectStyleCustomization = new EEFSelectStyleCustomizationImpl();
		return eefSelectStyleCustomization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEFTreeStyle createEEFTreeStyle() {
		EEFTreeStyleImpl eefTreeStyle = new EEFTreeStyleImpl();
		return eefTreeStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEFTreeConditionalStyle createEEFTreeConditionalStyle() {
		EEFTreeConditionalStyleImpl eefTreeConditionalStyle = new EEFTreeConditionalStyleImpl();
		return eefTreeConditionalStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEFTreeStyleCustomization createEEFTreeStyleCustomization() {
		EEFTreeStyleCustomizationImpl eefTreeStyleCustomization = new EEFTreeStyleCustomizationImpl();
		return eefTreeStyleCustomization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEFTableStyle createEEFTableStyle() {
		EEFTableStyleImpl eefTableStyle = new EEFTableStyleImpl();
		return eefTableStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEFTableConditionalStyle createEEFTableConditionalStyle() {
		EEFTableConditionalStyleImpl eefTableConditionalStyle = new EEFTableConditionalStyleImpl();
		return eefTableConditionalStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEFTableStyleCustomization createEEFTableStyleCustomization() {
		EEFTableStyleCustomizationImpl eefTableStyleCustomization = new EEFTableStyleCustomizationImpl();
		return eefTableStyleCustomization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEFLineStyle createEEFLineStyle() {
		EEFLineStyleImpl eefLineStyle = new EEFLineStyleImpl();
		return eefLineStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEFLineConditionalStyle createEEFLineConditionalStyle() {
		EEFLineConditionalStyleImpl eefLineConditionalStyle = new EEFLineConditionalStyleImpl();
		return eefLineConditionalStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEFLineStyleCustomization createEEFLineStyleCustomization() {
		EEFLineStyleCustomizationImpl eefLineStyleCustomization = new EEFLineStyleCustomizationImpl();
		return eefLineStyleCustomization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEFColumnStyle createEEFColumnStyle() {
		EEFColumnStyleImpl eefColumnStyle = new EEFColumnStyleImpl();
		return eefColumnStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEFColumnConditionalStyle createEEFColumnConditionalStyle() {
		EEFColumnConditionalStyleImpl eefColumnConditionalStyle = new EEFColumnConditionalStyleImpl();
		return eefColumnConditionalStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEFColumnStyleCustomization createEEFColumnStyleCustomization() {
		EEFColumnStyleCustomizationImpl eefColumnStyleCustomization = new EEFColumnStyleCustomizationImpl();
		return eefColumnStyleCustomization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEFQuickFix createEEFQuickFix() {
		EEFQuickFixImpl eefQuickFix = new EEFQuickFixImpl();
		return eefQuickFix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEFValidation createEEFValidation() {
		EEFValidationImpl eefValidation = new EEFValidationImpl();
		return eefValidation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTypeNameFromString(EDataType eDataType, String initialValue) {
		return (String) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeNameToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EefPackage getEefPackage() {
		return (EefPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EefPackage getPackage() {
		return EefPackage.eINSTANCE;
	}

} //EefFactoryImpl
