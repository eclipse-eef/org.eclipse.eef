/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef.util;

import org.eclipse.eef.EEFButtonConditionalStyle;
import org.eclipse.eef.EEFButtonDescription;
import org.eclipse.eef.EEFButtonStyle;
import org.eclipse.eef.EEFCheckboxConditionalStyle;
import org.eclipse.eef.EEFCheckboxDescription;
import org.eclipse.eef.EEFCheckboxStyle;
import org.eclipse.eef.EEFConditionalStyle;
import org.eclipse.eef.EEFContainerDescription;
import org.eclipse.eef.EEFControlDescription;
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
import org.eclipse.eef.EEFLayoutDescription;
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
import org.eclipse.eef.EEFValidationFixDescription;
import org.eclipse.eef.EEFValidationRuleDescription;
import org.eclipse.eef.EEFViewDescription;
import org.eclipse.eef.EEFWidgetAction;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.EEFWidgetStyle;
import org.eclipse.eef.EefPackage;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the call
 * {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the inheritance hierarchy until a non-null result is
 * returned, which is the result of the switch. <!-- end-user-doc -->
 *
 * @see org.eclipse.eef.EefPackage
 * @generated
 */
public class EefSwitch<T> extends Switch<T> {
	/**
	 * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected static EefPackage modelPackage;

	/**
	 * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EefSwitch() {
		if (EefSwitch.modelPackage == null) {
			EefSwitch.modelPackage = EefPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == EefSwitch.modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that
	 * result. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case EefPackage.EEF_VIEW_DESCRIPTION: {
			EEFViewDescription eefViewDescription = (EEFViewDescription) theEObject;
			T result = caseEEFViewDescription(eefViewDescription);
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case EefPackage.EEF_PAGE_DESCRIPTION: {
			EEFPageDescription eefPageDescription = (EEFPageDescription) theEObject;
			T result = caseEEFPageDescription(eefPageDescription);
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case EefPackage.EEF_VALIDATION_RULE_DESCRIPTION: {
			EEFValidationRuleDescription eefValidationRuleDescription = (EEFValidationRuleDescription) theEObject;
			T result = caseEEFValidationRuleDescription(eefValidationRuleDescription);
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case EefPackage.EEF_RULE_AUDIT_DESCRIPTION: {
			EEFRuleAuditDescription eefRuleAuditDescription = (EEFRuleAuditDescription) theEObject;
			T result = caseEEFRuleAuditDescription(eefRuleAuditDescription);
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case EefPackage.EEF_VALIDATION_FIX_DESCRIPTION: {
			EEFValidationFixDescription eefValidationFixDescription = (EEFValidationFixDescription) theEObject;
			T result = caseEEFValidationFixDescription(eefValidationFixDescription);
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case EefPackage.EEF_PROPERTY_VALIDATION_RULE_DESCRIPTION: {
			EEFPropertyValidationRuleDescription eefPropertyValidationRuleDescription = (EEFPropertyValidationRuleDescription) theEObject;
			T result = caseEEFPropertyValidationRuleDescription(eefPropertyValidationRuleDescription);
			if (result == null) {
				result = caseEEFValidationRuleDescription(eefPropertyValidationRuleDescription);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case EefPackage.EEF_SEMANTIC_VALIDATION_RULE_DESCRIPTION: {
			EEFSemanticValidationRuleDescription eefSemanticValidationRuleDescription = (EEFSemanticValidationRuleDescription) theEObject;
			T result = caseEEFSemanticValidationRuleDescription(eefSemanticValidationRuleDescription);
			if (result == null) {
				result = caseEEFValidationRuleDescription(eefSemanticValidationRuleDescription);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case EefPackage.EEF_GROUP_DESCRIPTION: {
			EEFGroupDescription eefGroupDescription = (EEFGroupDescription) theEObject;
			T result = caseEEFGroupDescription(eefGroupDescription);
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case EefPackage.EEF_CONTROL_DESCRIPTION: {
			EEFControlDescription eefControlDescription = (EEFControlDescription) theEObject;
			T result = caseEEFControlDescription(eefControlDescription);
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case EefPackage.EEF_CONTAINER_DESCRIPTION: {
			EEFContainerDescription eefContainerDescription = (EEFContainerDescription) theEObject;
			T result = caseEEFContainerDescription(eefContainerDescription);
			if (result == null) {
				result = caseEEFControlDescription(eefContainerDescription);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case EefPackage.EEF_LAYOUT_DESCRIPTION: {
			EEFLayoutDescription eefLayoutDescription = (EEFLayoutDescription) theEObject;
			T result = caseEEFLayoutDescription(eefLayoutDescription);
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case EefPackage.EEF_FILL_LAYOUT_DESCRIPTION: {
			EEFFillLayoutDescription eefFillLayoutDescription = (EEFFillLayoutDescription) theEObject;
			T result = caseEEFFillLayoutDescription(eefFillLayoutDescription);
			if (result == null) {
				result = caseEEFLayoutDescription(eefFillLayoutDescription);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case EefPackage.EEF_GRID_LAYOUT_DESCRIPTION: {
			EEFGridLayoutDescription eefGridLayoutDescription = (EEFGridLayoutDescription) theEObject;
			T result = caseEEFGridLayoutDescription(eefGridLayoutDescription);
			if (result == null) {
				result = caseEEFLayoutDescription(eefGridLayoutDescription);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case EefPackage.EEF_WIDGET_DESCRIPTION: {
			EEFWidgetDescription eefWidgetDescription = (EEFWidgetDescription) theEObject;
			T result = caseEEFWidgetDescription(eefWidgetDescription);
			if (result == null) {
				result = caseEEFControlDescription(eefWidgetDescription);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case EefPackage.EEF_TEXT_DESCRIPTION: {
			EEFTextDescription eefTextDescription = (EEFTextDescription) theEObject;
			T result = caseEEFTextDescription(eefTextDescription);
			if (result == null) {
				result = caseEEFWidgetDescription(eefTextDescription);
			}
			if (result == null) {
				result = caseEEFControlDescription(eefTextDescription);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case EefPackage.EEF_LABEL_DESCRIPTION: {
			EEFLabelDescription eefLabelDescription = (EEFLabelDescription) theEObject;
			T result = caseEEFLabelDescription(eefLabelDescription);
			if (result == null) {
				result = caseEEFWidgetDescription(eefLabelDescription);
			}
			if (result == null) {
				result = caseEEFControlDescription(eefLabelDescription);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case EefPackage.EEF_BUTTON_DESCRIPTION: {
			EEFButtonDescription eefButtonDescription = (EEFButtonDescription) theEObject;
			T result = caseEEFButtonDescription(eefButtonDescription);
			if (result == null) {
				result = caseEEFWidgetDescription(eefButtonDescription);
			}
			if (result == null) {
				result = caseEEFControlDescription(eefButtonDescription);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case EefPackage.EEF_CHECKBOX_DESCRIPTION: {
			EEFCheckboxDescription eefCheckboxDescription = (EEFCheckboxDescription) theEObject;
			T result = caseEEFCheckboxDescription(eefCheckboxDescription);
			if (result == null) {
				result = caseEEFWidgetDescription(eefCheckboxDescription);
			}
			if (result == null) {
				result = caseEEFControlDescription(eefCheckboxDescription);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case EefPackage.EEF_SELECT_DESCRIPTION: {
			EEFSelectDescription eefSelectDescription = (EEFSelectDescription) theEObject;
			T result = caseEEFSelectDescription(eefSelectDescription);
			if (result == null) {
				result = caseEEFWidgetDescription(eefSelectDescription);
			}
			if (result == null) {
				result = caseEEFControlDescription(eefSelectDescription);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case EefPackage.EEF_RADIO_DESCRIPTION: {
			EEFRadioDescription eefRadioDescription = (EEFRadioDescription) theEObject;
			T result = caseEEFRadioDescription(eefRadioDescription);
			if (result == null) {
				result = caseEEFWidgetDescription(eefRadioDescription);
			}
			if (result == null) {
				result = caseEEFControlDescription(eefRadioDescription);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case EefPackage.EEF_HYPERLINK_DESCRIPTION: {
			EEFHyperlinkDescription eefHyperlinkDescription = (EEFHyperlinkDescription) theEObject;
			T result = caseEEFHyperlinkDescription(eefHyperlinkDescription);
			if (result == null) {
				result = caseEEFWidgetDescription(eefHyperlinkDescription);
			}
			if (result == null) {
				result = caseEEFControlDescription(eefHyperlinkDescription);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case EefPackage.EEF_DYNAMIC_MAPPING_FOR: {
			EEFDynamicMappingFor eefDynamicMappingFor = (EEFDynamicMappingFor) theEObject;
			T result = caseEEFDynamicMappingFor(eefDynamicMappingFor);
			if (result == null) {
				result = caseEEFControlDescription(eefDynamicMappingFor);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case EefPackage.EEF_DYNAMIC_MAPPING_IF: {
			EEFDynamicMappingIf eefDynamicMappingIf = (EEFDynamicMappingIf) theEObject;
			T result = caseEEFDynamicMappingIf(eefDynamicMappingIf);
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case EefPackage.EEF_CUSTOM_WIDGET_DESCRIPTION: {
			EEFCustomWidgetDescription eefCustomWidgetDescription = (EEFCustomWidgetDescription) theEObject;
			T result = caseEEFCustomWidgetDescription(eefCustomWidgetDescription);
			if (result == null) {
				result = caseEEFWidgetDescription(eefCustomWidgetDescription);
			}
			if (result == null) {
				result = caseEEFControlDescription(eefCustomWidgetDescription);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case EefPackage.EEF_CUSTOM_EXPRESSION: {
			EEFCustomExpression eefCustomExpression = (EEFCustomExpression) theEObject;
			T result = caseEEFCustomExpression(eefCustomExpression);
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case EefPackage.EEF_LIST_DESCRIPTION: {
			EEFListDescription eefListDescription = (EEFListDescription) theEObject;
			T result = caseEEFListDescription(eefListDescription);
			if (result == null) {
				result = caseEEFWidgetDescription(eefListDescription);
			}
			if (result == null) {
				result = caseEEFControlDescription(eefListDescription);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case EefPackage.EEF_WIDGET_STYLE: {
			EEFWidgetStyle eefWidgetStyle = (EEFWidgetStyle) theEObject;
			T result = caseEEFWidgetStyle(eefWidgetStyle);
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case EefPackage.EEF_TEXT_STYLE: {
			EEFTextStyle eefTextStyle = (EEFTextStyle) theEObject;
			T result = caseEEFTextStyle(eefTextStyle);
			if (result == null) {
				result = caseEEFWidgetStyle(eefTextStyle);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case EefPackage.EEF_LABEL_STYLE: {
			EEFLabelStyle eefLabelStyle = (EEFLabelStyle) theEObject;
			T result = caseEEFLabelStyle(eefLabelStyle);
			if (result == null) {
				result = caseEEFWidgetStyle(eefLabelStyle);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case EefPackage.EEF_BUTTON_STYLE: {
			EEFButtonStyle eefButtonStyle = (EEFButtonStyle) theEObject;
			T result = caseEEFButtonStyle(eefButtonStyle);
			if (result == null) {
				result = caseEEFWidgetStyle(eefButtonStyle);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case EefPackage.EEF_CHECKBOX_STYLE: {
			EEFCheckboxStyle eefCheckboxStyle = (EEFCheckboxStyle) theEObject;
			T result = caseEEFCheckboxStyle(eefCheckboxStyle);
			if (result == null) {
				result = caseEEFWidgetStyle(eefCheckboxStyle);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case EefPackage.EEF_SELECT_STYLE: {
			EEFSelectStyle eefSelectStyle = (EEFSelectStyle) theEObject;
			T result = caseEEFSelectStyle(eefSelectStyle);
			if (result == null) {
				result = caseEEFWidgetStyle(eefSelectStyle);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case EefPackage.EEF_RADIO_STYLE: {
			EEFRadioStyle eefRadioStyle = (EEFRadioStyle) theEObject;
			T result = caseEEFRadioStyle(eefRadioStyle);
			if (result == null) {
				result = caseEEFWidgetStyle(eefRadioStyle);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case EefPackage.EEF_HYPERLINK_STYLE: {
			EEFHyperlinkStyle eefHyperlinkStyle = (EEFHyperlinkStyle) theEObject;
			T result = caseEEFHyperlinkStyle(eefHyperlinkStyle);
			if (result == null) {
				result = caseEEFWidgetStyle(eefHyperlinkStyle);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case EefPackage.EEF_CUSTOM_WIDGET_STYLE: {
			EEFCustomWidgetStyle eefCustomWidgetStyle = (EEFCustomWidgetStyle) theEObject;
			T result = caseEEFCustomWidgetStyle(eefCustomWidgetStyle);
			if (result == null) {
				result = caseEEFWidgetStyle(eefCustomWidgetStyle);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case EefPackage.EEF_LIST_STYLE: {
			EEFListStyle eefListStyle = (EEFListStyle) theEObject;
			T result = caseEEFListStyle(eefListStyle);
			if (result == null) {
				result = caseEEFWidgetStyle(eefListStyle);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case EefPackage.EEF_GROUP_STYLE: {
			EEFGroupStyle eefGroupStyle = (EEFGroupStyle) theEObject;
			T result = caseEEFGroupStyle(eefGroupStyle);
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case EefPackage.EEF_CONDITIONAL_STYLE: {
			EEFConditionalStyle eefConditionalStyle = (EEFConditionalStyle) theEObject;
			T result = caseEEFConditionalStyle(eefConditionalStyle);
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case EefPackage.EEF_TEXT_CONDITIONAL_STYLE: {
			EEFTextConditionalStyle eefTextConditionalStyle = (EEFTextConditionalStyle) theEObject;
			T result = caseEEFTextConditionalStyle(eefTextConditionalStyle);
			if (result == null) {
				result = caseEEFConditionalStyle(eefTextConditionalStyle);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case EefPackage.EEF_BUTTON_CONDITIONAL_STYLE: {
			EEFButtonConditionalStyle eefButtonConditionalStyle = (EEFButtonConditionalStyle) theEObject;
			T result = caseEEFButtonConditionalStyle(eefButtonConditionalStyle);
			if (result == null) {
				result = caseEEFConditionalStyle(eefButtonConditionalStyle);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case EefPackage.EEF_LABEL_CONDITIONAL_STYLE: {
			EEFLabelConditionalStyle eefLabelConditionalStyle = (EEFLabelConditionalStyle) theEObject;
			T result = caseEEFLabelConditionalStyle(eefLabelConditionalStyle);
			if (result == null) {
				result = caseEEFConditionalStyle(eefLabelConditionalStyle);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case EefPackage.EEF_CHECKBOX_CONDITIONAL_STYLE: {
			EEFCheckboxConditionalStyle eefCheckboxConditionalStyle = (EEFCheckboxConditionalStyle) theEObject;
			T result = caseEEFCheckboxConditionalStyle(eefCheckboxConditionalStyle);
			if (result == null) {
				result = caseEEFConditionalStyle(eefCheckboxConditionalStyle);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case EefPackage.EEF_SELECT_CONDITIONAL_STYLE: {
			EEFSelectConditionalStyle eefSelectConditionalStyle = (EEFSelectConditionalStyle) theEObject;
			T result = caseEEFSelectConditionalStyle(eefSelectConditionalStyle);
			if (result == null) {
				result = caseEEFConditionalStyle(eefSelectConditionalStyle);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case EefPackage.EEF_RADIO_CONDITIONAL_STYLE: {
			EEFRadioConditionalStyle eefRadioConditionalStyle = (EEFRadioConditionalStyle) theEObject;
			T result = caseEEFRadioConditionalStyle(eefRadioConditionalStyle);
			if (result == null) {
				result = caseEEFConditionalStyle(eefRadioConditionalStyle);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case EefPackage.EEF_HYPERLINK_CONDITIONAL_STYLE: {
			EEFHyperlinkConditionalStyle eefHyperlinkConditionalStyle = (EEFHyperlinkConditionalStyle) theEObject;
			T result = caseEEFHyperlinkConditionalStyle(eefHyperlinkConditionalStyle);
			if (result == null) {
				result = caseEEFConditionalStyle(eefHyperlinkConditionalStyle);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case EefPackage.EEF_CUSTOM_WIDGET_CONDITIONAL_STYLE: {
			EEFCustomWidgetConditionalStyle eefCustomWidgetConditionalStyle = (EEFCustomWidgetConditionalStyle) theEObject;
			T result = caseEEFCustomWidgetConditionalStyle(eefCustomWidgetConditionalStyle);
			if (result == null) {
				result = caseEEFConditionalStyle(eefCustomWidgetConditionalStyle);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case EefPackage.EEF_WIDGET_ACTION: {
			EEFWidgetAction eefWidgetAction = (EEFWidgetAction) theEObject;
			T result = caseEEFWidgetAction(eefWidgetAction);
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case EefPackage.EEF_LIST_CONDITIONAL_STYLE: {
			EEFListConditionalStyle eefListConditionalStyle = (EEFListConditionalStyle) theEObject;
			T result = caseEEFListConditionalStyle(eefListConditionalStyle);
			if (result == null) {
				result = caseEEFConditionalStyle(eefListConditionalStyle);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case EefPackage.EEF_GROUP_CONDITIONAL_STYLE: {
			EEFGroupConditionalStyle eefGroupConditionalStyle = (EEFGroupConditionalStyle) theEObject;
			T result = caseEEFGroupConditionalStyle(eefGroupConditionalStyle);
			if (result == null) {
				result = caseEEFConditionalStyle(eefGroupConditionalStyle);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF View Description</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF View Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFViewDescription(EEFViewDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Page Description</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Page Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFPageDescription(EEFPageDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Validation Rule Description</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Validation Rule Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFValidationRuleDescription(EEFValidationRuleDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Rule Audit Description</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Rule Audit Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFRuleAuditDescription(EEFRuleAuditDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Validation Fix Description</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Validation Fix Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFValidationFixDescription(EEFValidationFixDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>EEF Property Validation Rule Description</em>'. <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>EEF Property Validation Rule Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFPropertyValidationRuleDescription(EEFPropertyValidationRuleDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>EEF Semantic Validation Rule Description</em>'. <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>EEF Semantic Validation Rule Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFSemanticValidationRuleDescription(EEFSemanticValidationRuleDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Group Description</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Group Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFGroupDescription(EEFGroupDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Control Description</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Control Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFControlDescription(EEFControlDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Container Description</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Container Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFContainerDescription(EEFContainerDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Layout Description</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Layout Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFLayoutDescription(EEFLayoutDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Fill Layout Description</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Fill Layout Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFFillLayoutDescription(EEFFillLayoutDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Grid Layout Description</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Grid Layout Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFGridLayoutDescription(EEFGridLayoutDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Widget Description</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Widget Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFWidgetDescription(EEFWidgetDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Text Description</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Text Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFTextDescription(EEFTextDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Label Description</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Label Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFLabelDescription(EEFLabelDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Button Description</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Button Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFButtonDescription(EEFButtonDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Checkbox Description</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Checkbox Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFCheckboxDescription(EEFCheckboxDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Select Description</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Select Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFSelectDescription(EEFSelectDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Radio Description</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Radio Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFRadioDescription(EEFRadioDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Hyperlink Description</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Hyperlink Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFHyperlinkDescription(EEFHyperlinkDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Dynamic Mapping For</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Dynamic Mapping For</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFDynamicMappingFor(EEFDynamicMappingFor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Dynamic Mapping If</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Dynamic Mapping If</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFDynamicMappingIf(EEFDynamicMappingIf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Custom Widget Description</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Custom Widget Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFCustomWidgetDescription(EEFCustomWidgetDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Custom Expression</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Custom Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFCustomExpression(EEFCustomExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF List Description</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF List Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFListDescription(EEFListDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Widget Style</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Widget Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFWidgetStyle(EEFWidgetStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Text Style</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Text Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFTextStyle(EEFTextStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Label Style</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Label Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFLabelStyle(EEFLabelStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Button Style</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Button Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFButtonStyle(EEFButtonStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Checkbox Style</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Checkbox Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFCheckboxStyle(EEFCheckboxStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Select Style</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Select Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFSelectStyle(EEFSelectStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Radio Style</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Radio Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFRadioStyle(EEFRadioStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Hyperlink Style</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Hyperlink Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFHyperlinkStyle(EEFHyperlinkStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Custom Widget Style</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Custom Widget Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFCustomWidgetStyle(EEFCustomWidgetStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF List Style</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF List Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFListStyle(EEFListStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Group Style</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Group Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFGroupStyle(EEFGroupStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Conditional Style</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Conditional Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFConditionalStyle(EEFConditionalStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Text Conditional Style</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Text Conditional Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFTextConditionalStyle(EEFTextConditionalStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Button Conditional Style</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Button Conditional Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFButtonConditionalStyle(EEFButtonConditionalStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Label Conditional Style</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Label Conditional Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFLabelConditionalStyle(EEFLabelConditionalStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Checkbox Conditional Style</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Checkbox Conditional Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFCheckboxConditionalStyle(EEFCheckboxConditionalStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Select Conditional Style</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Select Conditional Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFSelectConditionalStyle(EEFSelectConditionalStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Radio Conditional Style</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Radio Conditional Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFRadioConditionalStyle(EEFRadioConditionalStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Hyperlink Conditional Style</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Hyperlink Conditional Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFHyperlinkConditionalStyle(EEFHyperlinkConditionalStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Custom Widget Conditional Style</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Custom Widget Conditional Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFCustomWidgetConditionalStyle(EEFCustomWidgetConditionalStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Widget Action</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Widget Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFWidgetAction(EEFWidgetAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF List Conditional Style</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF List Conditional Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFListConditionalStyle(EEFListConditionalStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Group Conditional Style</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Group Conditional Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFGroupConditionalStyle(EEFGroupConditionalStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch, but this is the last case
	 * anyway. <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} // EefSwitch
