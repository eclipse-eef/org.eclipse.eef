/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef.eef.impl;

import org.eclipse.eef.eef.*;

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
		case EefPackage.EXPRESSION:
			return createExpressionFromString(eDataType, initialValue);
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
		case EefPackage.EXPRESSION:
			return convertExpressionToString(eDataType, instanceValue);
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
	public String createExpressionFromString(EDataType eDataType, String initialValue) {
		return (String) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExpressionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
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
