/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef.util;

import org.eclipse.eef.EEFButtonDescription;
import org.eclipse.eef.EEFCheckboxDescription;
import org.eclipse.eef.EEFContainerDescription;
import org.eclipse.eef.EEFDynamicMappingFor;
import org.eclipse.eef.EEFDynamicMappingIf;
import org.eclipse.eef.EEFGroupDescription;
import org.eclipse.eef.EEFLabelDescription;
import org.eclipse.eef.EEFMultipleReferencesDescription;
import org.eclipse.eef.EEFPageDescription;
import org.eclipse.eef.EEFPropertyValidationRuleDescription;
import org.eclipse.eef.EEFRadioDescription;
import org.eclipse.eef.EEFRuleAuditDescription;
import org.eclipse.eef.EEFSelectDescription;
import org.eclipse.eef.EEFSemanticValidationRuleDescription;
import org.eclipse.eef.EEFSingleReferenceDescription;
import org.eclipse.eef.EEFTextDescription;
import org.eclipse.eef.EEFValidationFixDescription;
import org.eclipse.eef.EEFValidationRuleDescription;
import org.eclipse.eef.EEFViewDescription;
import org.eclipse.eef.EEFWidgetDescription;
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
		case EefPackage.EEF_CONTAINER_DESCRIPTION: {
			EEFContainerDescription eefContainerDescription = (EEFContainerDescription) theEObject;
			T result = caseEEFContainerDescription(eefContainerDescription);
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case EefPackage.EEF_WIDGET_DESCRIPTION: {
			EEFWidgetDescription eefWidgetDescription = (EEFWidgetDescription) theEObject;
			T result = caseEEFWidgetDescription(eefWidgetDescription);
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
				result = defaultCase(theEObject);
			}
			return result;
		}
		case EefPackage.EEF_DYNAMIC_MAPPING_FOR: {
			EEFDynamicMappingFor eefDynamicMappingFor = (EEFDynamicMappingFor) theEObject;
			T result = caseEEFDynamicMappingFor(eefDynamicMappingFor);
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
		case EefPackage.EEF_SINGLE_REFERENCE_DESCRIPTION: {
			EEFSingleReferenceDescription eefSingleReferenceDescription = (EEFSingleReferenceDescription) theEObject;
			T result = caseEEFSingleReferenceDescription(eefSingleReferenceDescription);
			if (result == null) {
				result = caseEEFWidgetDescription(eefSingleReferenceDescription);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case EefPackage.EEF_MULTIPLE_REFERENCES_DESCRIPTION: {
			EEFMultipleReferencesDescription eefMultipleReferencesDescription = (EEFMultipleReferencesDescription) theEObject;
			T result = caseEEFMultipleReferencesDescription(eefMultipleReferencesDescription);
			if (result == null) {
				result = caseEEFWidgetDescription(eefMultipleReferencesDescription);
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
	 * Returns the result of interpreting the object as an instance of '<em>EEF Single Reference Description</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Single Reference Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFSingleReferenceDescription(EEFSingleReferenceDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEF Multiple References Description</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEF Multiple References Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEFMultipleReferencesDescription(EEFMultipleReferencesDescription object) {
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
