/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef.impl;

import org.eclipse.eef.EEFButtonDescription;
import org.eclipse.eef.EEFCheckboxDescription;
import org.eclipse.eef.EEFContainerDescription;
import org.eclipse.eef.EEFCustomExpression;
import org.eclipse.eef.EEFCustomWidgetDescription;
import org.eclipse.eef.EEFDynamicMappingFor;
import org.eclipse.eef.EEFDynamicMappingIf;
import org.eclipse.eef.EEFGroupDescription;
import org.eclipse.eef.EEFLabelDescription;
import org.eclipse.eef.EEFPageDescription;
import org.eclipse.eef.EEFPropertyValidationRuleDescription;
import org.eclipse.eef.EEFRadioDescription;
import org.eclipse.eef.EEFRuleAuditDescription;
import org.eclipse.eef.EEFSelectDescription;
import org.eclipse.eef.EEFSemanticValidationRuleDescription;
import org.eclipse.eef.EEFTextDescription;
import org.eclipse.eef.EEFValidationFixDescription;
import org.eclipse.eef.EEFViewDescription;
import org.eclipse.eef.EEF_VALIDATION_SEVERITY_DESCRIPTION;
import org.eclipse.eef.EefFactory;
import org.eclipse.eef.EefPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 *
 * @generated
 */
public class EefFactoryImpl extends EFactoryImpl implements EefFactory {
	/**
	 * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
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
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EefFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case EefPackage.EEF_VIEW_DESCRIPTION:
			return createEEFViewDescription();
		case EefPackage.EEF_PAGE_DESCRIPTION:
			return createEEFPageDescription();
		case EefPackage.EEF_RULE_AUDIT_DESCRIPTION:
			return createEEFRuleAuditDescription();
		case EefPackage.EEF_VALIDATION_FIX_DESCRIPTION:
			return createEEFValidationFixDescription();
		case EefPackage.EEF_PROPERTY_VALIDATION_RULE_DESCRIPTION:
			return createEEFPropertyValidationRuleDescription();
		case EefPackage.EEF_SEMANTIC_VALIDATION_RULE_DESCRIPTION:
			return createEEFSemanticValidationRuleDescription();
		case EefPackage.EEF_GROUP_DESCRIPTION:
			return createEEFGroupDescription();
		case EefPackage.EEF_CONTAINER_DESCRIPTION:
			return createEEFContainerDescription();
		case EefPackage.EEF_TEXT_DESCRIPTION:
			return createEEFTextDescription();
		case EefPackage.EEF_LABEL_DESCRIPTION:
			return createEEFLabelDescription();
		case EefPackage.EEF_BUTTON_DESCRIPTION:
			return createEEFButtonDescription();
		case EefPackage.EEF_CHECKBOX_DESCRIPTION:
			return createEEFCheckboxDescription();
		case EefPackage.EEF_SELECT_DESCRIPTION:
			return createEEFSelectDescription();
		case EefPackage.EEF_RADIO_DESCRIPTION:
			return createEEFRadioDescription();
		case EefPackage.EEF_DYNAMIC_MAPPING_FOR:
			return createEEFDynamicMappingFor();
		case EefPackage.EEF_DYNAMIC_MAPPING_IF:
			return createEEFDynamicMappingIf();
		case EefPackage.EEF_CUSTOM_WIDGET_DESCRIPTION:
			return createEEFCustomWidgetDescription();
		case EefPackage.EEF_CUSTOM_EXPRESSION:
			return createEEFCustomExpression();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case EefPackage.EEF_VALIDATION_SEVERITY_DESCRIPTION:
			return createEEF_VALIDATION_SEVERITY_DESCRIPTIONFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case EefPackage.EEF_VALIDATION_SEVERITY_DESCRIPTION:
			return convertEEF_VALIDATION_SEVERITY_DESCRIPTIONToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EEFViewDescription createEEFViewDescription() {
		EEFViewDescriptionImpl eefViewDescription = new EEFViewDescriptionImpl();
		return eefViewDescription;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EEFPageDescription createEEFPageDescription() {
		EEFPageDescriptionImpl eefPageDescription = new EEFPageDescriptionImpl();
		return eefPageDescription;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EEFRuleAuditDescription createEEFRuleAuditDescription() {
		EEFRuleAuditDescriptionImpl eefRuleAuditDescription = new EEFRuleAuditDescriptionImpl();
		return eefRuleAuditDescription;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EEFValidationFixDescription createEEFValidationFixDescription() {
		EEFValidationFixDescriptionImpl eefValidationFixDescription = new EEFValidationFixDescriptionImpl();
		return eefValidationFixDescription;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EEFPropertyValidationRuleDescription createEEFPropertyValidationRuleDescription() {
		EEFPropertyValidationRuleDescriptionImpl eefPropertyValidationRuleDescription = new EEFPropertyValidationRuleDescriptionImpl();
		return eefPropertyValidationRuleDescription;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EEFSemanticValidationRuleDescription createEEFSemanticValidationRuleDescription() {
		EEFSemanticValidationRuleDescriptionImpl eefSemanticValidationRuleDescription = new EEFSemanticValidationRuleDescriptionImpl();
		return eefSemanticValidationRuleDescription;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EEFGroupDescription createEEFGroupDescription() {
		EEFGroupDescriptionImpl eefGroupDescription = new EEFGroupDescriptionImpl();
		return eefGroupDescription;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EEFContainerDescription createEEFContainerDescription() {
		EEFContainerDescriptionImpl eefContainerDescription = new EEFContainerDescriptionImpl();
		return eefContainerDescription;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EEFTextDescription createEEFTextDescription() {
		EEFTextDescriptionImpl eefTextDescription = new EEFTextDescriptionImpl();
		return eefTextDescription;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EEFLabelDescription createEEFLabelDescription() {
		EEFLabelDescriptionImpl eefLabelDescription = new EEFLabelDescriptionImpl();
		return eefLabelDescription;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EEFButtonDescription createEEFButtonDescription() {
		EEFButtonDescriptionImpl eefButtonDescription = new EEFButtonDescriptionImpl();
		return eefButtonDescription;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EEFCheckboxDescription createEEFCheckboxDescription() {
		EEFCheckboxDescriptionImpl eefCheckboxDescription = new EEFCheckboxDescriptionImpl();
		return eefCheckboxDescription;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EEFSelectDescription createEEFSelectDescription() {
		EEFSelectDescriptionImpl eefSelectDescription = new EEFSelectDescriptionImpl();
		return eefSelectDescription;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EEFRadioDescription createEEFRadioDescription() {
		EEFRadioDescriptionImpl eefRadioDescription = new EEFRadioDescriptionImpl();
		return eefRadioDescription;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EEFDynamicMappingFor createEEFDynamicMappingFor() {
		EEFDynamicMappingForImpl eefDynamicMappingFor = new EEFDynamicMappingForImpl();
		return eefDynamicMappingFor;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EEFDynamicMappingIf createEEFDynamicMappingIf() {
		EEFDynamicMappingIfImpl eefDynamicMappingIf = new EEFDynamicMappingIfImpl();
		return eefDynamicMappingIf;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EEFCustomWidgetDescription createEEFCustomWidgetDescription() {
		EEFCustomWidgetDescriptionImpl eefCustomWidgetDescription = new EEFCustomWidgetDescriptionImpl();
		return eefCustomWidgetDescription;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EEFCustomExpression createEEFCustomExpression() {
		EEFCustomExpressionImpl eefCustomExpression = new EEFCustomExpressionImpl();
		return eefCustomExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EEF_VALIDATION_SEVERITY_DESCRIPTION createEEF_VALIDATION_SEVERITY_DESCRIPTIONFromString(EDataType eDataType, String initialValue) {
		EEF_VALIDATION_SEVERITY_DESCRIPTION result = EEF_VALIDATION_SEVERITY_DESCRIPTION.get(initialValue);
		if (result == null) {
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public String convertEEF_VALIDATION_SEVERITY_DESCRIPTIONToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EefPackage getEefPackage() {
		return (EefPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EefPackage getPackage() {
		return EefPackage.eINSTANCE;
	}

} // EefFactoryImpl
