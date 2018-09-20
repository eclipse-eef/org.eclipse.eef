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
package org.eclipse.eef.impl;

import org.eclipse.eef.EEFButtonConditionalStyle;
import org.eclipse.eef.EEFButtonDescription;
import org.eclipse.eef.EEFButtonStyle;
import org.eclipse.eef.EEFCheckboxConditionalStyle;
import org.eclipse.eef.EEFCheckboxDescription;
import org.eclipse.eef.EEFCheckboxStyle;
import org.eclipse.eef.EEFContainerDescription;
import org.eclipse.eef.EEFCustomExpression;
import org.eclipse.eef.EEFCustomWidgetConditionalStyle;
import org.eclipse.eef.EEFCustomWidgetDescription;
import org.eclipse.eef.EEFCustomWidgetStyle;
import org.eclipse.eef.EEFDynamicMappingFor;
import org.eclipse.eef.EEFDynamicMappingIf;
import org.eclipse.eef.EEFFillLayoutDescription;
import org.eclipse.eef.EEFGridLayoutDescription;
import org.eclipse.eef.EEFGroupConditionalStyle;
import org.eclipse.eef.EEFGroupDescription;
import org.eclipse.eef.EEFGroupStyle;
import org.eclipse.eef.EEFHyperlinkConditionalStyle;
import org.eclipse.eef.EEFHyperlinkDescription;
import org.eclipse.eef.EEFHyperlinkStyle;
import org.eclipse.eef.EEFLabelConditionalStyle;
import org.eclipse.eef.EEFLabelDescription;
import org.eclipse.eef.EEFLabelStyle;
import org.eclipse.eef.EEFListConditionalStyle;
import org.eclipse.eef.EEFListDescription;
import org.eclipse.eef.EEFListStyle;
import org.eclipse.eef.EEFPageDescription;
import org.eclipse.eef.EEFPropertyValidationRuleDescription;
import org.eclipse.eef.EEFRadioConditionalStyle;
import org.eclipse.eef.EEFRadioDescription;
import org.eclipse.eef.EEFRadioStyle;
import org.eclipse.eef.EEFRuleAuditDescription;
import org.eclipse.eef.EEFSelectConditionalStyle;
import org.eclipse.eef.EEFSelectDescription;
import org.eclipse.eef.EEFSelectStyle;
import org.eclipse.eef.EEFSemanticValidationRuleDescription;
import org.eclipse.eef.EEFTextConditionalStyle;
import org.eclipse.eef.EEFTextDescription;
import org.eclipse.eef.EEFTextStyle;
import org.eclipse.eef.EEFToolbarAction;
import org.eclipse.eef.EEFValidationFixDescription;
import org.eclipse.eef.EEFViewDescription;
import org.eclipse.eef.EEFWidgetAction;
import org.eclipse.eef.EEF_FILL_LAYOUT_ORIENTATION;
import org.eclipse.eef.EEF_TITLE_BAR_STYLE;
import org.eclipse.eef.EEF_TOGGLE_STYLE;
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
		case EefPackage.EEF_TOOLBAR_ACTION:
			return createEEFToolbarAction();
		case EefPackage.EEF_CONTAINER_DESCRIPTION:
			return createEEFContainerDescription();
		case EefPackage.EEF_FILL_LAYOUT_DESCRIPTION:
			return createEEFFillLayoutDescription();
		case EefPackage.EEF_GRID_LAYOUT_DESCRIPTION:
			return createEEFGridLayoutDescription();
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
		case EefPackage.EEF_HYPERLINK_DESCRIPTION:
			return createEEFHyperlinkDescription();
		case EefPackage.EEF_DYNAMIC_MAPPING_FOR:
			return createEEFDynamicMappingFor();
		case EefPackage.EEF_DYNAMIC_MAPPING_IF:
			return createEEFDynamicMappingIf();
		case EefPackage.EEF_CUSTOM_WIDGET_DESCRIPTION:
			return createEEFCustomWidgetDescription();
		case EefPackage.EEF_CUSTOM_EXPRESSION:
			return createEEFCustomExpression();
		case EefPackage.EEF_LIST_DESCRIPTION:
			return createEEFListDescription();
		case EefPackage.EEF_TEXT_STYLE:
			return createEEFTextStyle();
		case EefPackage.EEF_LABEL_STYLE:
			return createEEFLabelStyle();
		case EefPackage.EEF_BUTTON_STYLE:
			return createEEFButtonStyle();
		case EefPackage.EEF_CHECKBOX_STYLE:
			return createEEFCheckboxStyle();
		case EefPackage.EEF_SELECT_STYLE:
			return createEEFSelectStyle();
		case EefPackage.EEF_RADIO_STYLE:
			return createEEFRadioStyle();
		case EefPackage.EEF_HYPERLINK_STYLE:
			return createEEFHyperlinkStyle();
		case EefPackage.EEF_CUSTOM_WIDGET_STYLE:
			return createEEFCustomWidgetStyle();
		case EefPackage.EEF_LIST_STYLE:
			return createEEFListStyle();
		case EefPackage.EEF_GROUP_STYLE:
			return createEEFGroupStyle();
		case EefPackage.EEF_TEXT_CONDITIONAL_STYLE:
			return createEEFTextConditionalStyle();
		case EefPackage.EEF_BUTTON_CONDITIONAL_STYLE:
			return createEEFButtonConditionalStyle();
		case EefPackage.EEF_LABEL_CONDITIONAL_STYLE:
			return createEEFLabelConditionalStyle();
		case EefPackage.EEF_CHECKBOX_CONDITIONAL_STYLE:
			return createEEFCheckboxConditionalStyle();
		case EefPackage.EEF_SELECT_CONDITIONAL_STYLE:
			return createEEFSelectConditionalStyle();
		case EefPackage.EEF_RADIO_CONDITIONAL_STYLE:
			return createEEFRadioConditionalStyle();
		case EefPackage.EEF_HYPERLINK_CONDITIONAL_STYLE:
			return createEEFHyperlinkConditionalStyle();
		case EefPackage.EEF_CUSTOM_WIDGET_CONDITIONAL_STYLE:
			return createEEFCustomWidgetConditionalStyle();
		case EefPackage.EEF_WIDGET_ACTION:
			return createEEFWidgetAction();
		case EefPackage.EEF_LIST_CONDITIONAL_STYLE:
			return createEEFListConditionalStyle();
		case EefPackage.EEF_GROUP_CONDITIONAL_STYLE:
			return createEEFGroupConditionalStyle();
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
		case EefPackage.EEF_FILL_LAYOUT_ORIENTATION:
			return createEEF_FILL_LAYOUT_ORIENTATIONFromString(eDataType, initialValue);
		case EefPackage.EEF_TOGGLE_STYLE:
			return createEEF_TOGGLE_STYLEFromString(eDataType, initialValue);
		case EefPackage.EEF_TITLE_BAR_STYLE:
			return createEEF_TITLE_BAR_STYLEFromString(eDataType, initialValue);
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
		case EefPackage.EEF_FILL_LAYOUT_ORIENTATION:
			return convertEEF_FILL_LAYOUT_ORIENTATIONToString(eDataType, instanceValue);
		case EefPackage.EEF_TOGGLE_STYLE:
			return convertEEF_TOGGLE_STYLEToString(eDataType, instanceValue);
		case EefPackage.EEF_TITLE_BAR_STYLE:
			return convertEEF_TITLE_BAR_STYLEToString(eDataType, instanceValue);
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
	public EEFToolbarAction createEEFToolbarAction() {
		EEFToolbarActionImpl eefToolbarAction = new EEFToolbarActionImpl();
		return eefToolbarAction;
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
	public EEFFillLayoutDescription createEEFFillLayoutDescription() {
		EEFFillLayoutDescriptionImpl eefFillLayoutDescription = new EEFFillLayoutDescriptionImpl();
		return eefFillLayoutDescription;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EEFGridLayoutDescription createEEFGridLayoutDescription() {
		EEFGridLayoutDescriptionImpl eefGridLayoutDescription = new EEFGridLayoutDescriptionImpl();
		return eefGridLayoutDescription;
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
	public EEFHyperlinkDescription createEEFHyperlinkDescription() {
		EEFHyperlinkDescriptionImpl eefHyperlinkDescription = new EEFHyperlinkDescriptionImpl();
		return eefHyperlinkDescription;
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
	@Override
	public EEFListDescription createEEFListDescription() {
		EEFListDescriptionImpl eefListDescription = new EEFListDescriptionImpl();
		return eefListDescription;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EEFTextStyle createEEFTextStyle() {
		EEFTextStyleImpl eefTextStyle = new EEFTextStyleImpl();
		return eefTextStyle;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EEFLabelStyle createEEFLabelStyle() {
		EEFLabelStyleImpl eefLabelStyle = new EEFLabelStyleImpl();
		return eefLabelStyle;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EEFButtonStyle createEEFButtonStyle() {
		EEFButtonStyleImpl eefButtonStyle = new EEFButtonStyleImpl();
		return eefButtonStyle;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EEFCheckboxStyle createEEFCheckboxStyle() {
		EEFCheckboxStyleImpl eefCheckboxStyle = new EEFCheckboxStyleImpl();
		return eefCheckboxStyle;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EEFSelectStyle createEEFSelectStyle() {
		EEFSelectStyleImpl eefSelectStyle = new EEFSelectStyleImpl();
		return eefSelectStyle;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EEFRadioStyle createEEFRadioStyle() {
		EEFRadioStyleImpl eefRadioStyle = new EEFRadioStyleImpl();
		return eefRadioStyle;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EEFHyperlinkStyle createEEFHyperlinkStyle() {
		EEFHyperlinkStyleImpl eefHyperlinkStyle = new EEFHyperlinkStyleImpl();
		return eefHyperlinkStyle;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EEFCustomWidgetStyle createEEFCustomWidgetStyle() {
		EEFCustomWidgetStyleImpl eefCustomWidgetStyle = new EEFCustomWidgetStyleImpl();
		return eefCustomWidgetStyle;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EEFListStyle createEEFListStyle() {
		EEFListStyleImpl eefListStyle = new EEFListStyleImpl();
		return eefListStyle;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EEFGroupStyle createEEFGroupStyle() {
		EEFGroupStyleImpl eefGroupStyle = new EEFGroupStyleImpl();
		return eefGroupStyle;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EEFTextConditionalStyle createEEFTextConditionalStyle() {
		EEFTextConditionalStyleImpl eefTextConditionalStyle = new EEFTextConditionalStyleImpl();
		return eefTextConditionalStyle;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EEFButtonConditionalStyle createEEFButtonConditionalStyle() {
		EEFButtonConditionalStyleImpl eefButtonConditionalStyle = new EEFButtonConditionalStyleImpl();
		return eefButtonConditionalStyle;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EEFLabelConditionalStyle createEEFLabelConditionalStyle() {
		EEFLabelConditionalStyleImpl eefLabelConditionalStyle = new EEFLabelConditionalStyleImpl();
		return eefLabelConditionalStyle;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EEFCheckboxConditionalStyle createEEFCheckboxConditionalStyle() {
		EEFCheckboxConditionalStyleImpl eefCheckboxConditionalStyle = new EEFCheckboxConditionalStyleImpl();
		return eefCheckboxConditionalStyle;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EEFSelectConditionalStyle createEEFSelectConditionalStyle() {
		EEFSelectConditionalStyleImpl eefSelectConditionalStyle = new EEFSelectConditionalStyleImpl();
		return eefSelectConditionalStyle;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EEFRadioConditionalStyle createEEFRadioConditionalStyle() {
		EEFRadioConditionalStyleImpl eefRadioConditionalStyle = new EEFRadioConditionalStyleImpl();
		return eefRadioConditionalStyle;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EEFHyperlinkConditionalStyle createEEFHyperlinkConditionalStyle() {
		EEFHyperlinkConditionalStyleImpl eefHyperlinkConditionalStyle = new EEFHyperlinkConditionalStyleImpl();
		return eefHyperlinkConditionalStyle;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EEFCustomWidgetConditionalStyle createEEFCustomWidgetConditionalStyle() {
		EEFCustomWidgetConditionalStyleImpl eefCustomWidgetConditionalStyle = new EEFCustomWidgetConditionalStyleImpl();
		return eefCustomWidgetConditionalStyle;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EEFWidgetAction createEEFWidgetAction() {
		EEFWidgetActionImpl eefWidgetAction = new EEFWidgetActionImpl();
		return eefWidgetAction;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EEFListConditionalStyle createEEFListConditionalStyle() {
		EEFListConditionalStyleImpl eefListConditionalStyle = new EEFListConditionalStyleImpl();
		return eefListConditionalStyle;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EEFGroupConditionalStyle createEEFGroupConditionalStyle() {
		EEFGroupConditionalStyleImpl eefGroupConditionalStyle = new EEFGroupConditionalStyleImpl();
		return eefGroupConditionalStyle;
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
	public EEF_FILL_LAYOUT_ORIENTATION createEEF_FILL_LAYOUT_ORIENTATIONFromString(EDataType eDataType, String initialValue) {
		EEF_FILL_LAYOUT_ORIENTATION result = EEF_FILL_LAYOUT_ORIENTATION.get(initialValue);
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
	public String convertEEF_FILL_LAYOUT_ORIENTATIONToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EEF_TOGGLE_STYLE createEEF_TOGGLE_STYLEFromString(EDataType eDataType, String initialValue) {
		EEF_TOGGLE_STYLE result = EEF_TOGGLE_STYLE.get(initialValue);
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
	public String convertEEF_TOGGLE_STYLEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EEF_TITLE_BAR_STYLE createEEF_TITLE_BAR_STYLEFromString(EDataType eDataType, String initialValue) {
		EEF_TITLE_BAR_STYLE result = EEF_TITLE_BAR_STYLE.get(initialValue);
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
	public String convertEEF_TITLE_BAR_STYLEToString(EDataType eDataType, Object instanceValue) {
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
