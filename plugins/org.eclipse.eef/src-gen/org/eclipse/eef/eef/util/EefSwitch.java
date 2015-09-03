/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef.eef.util;

import org.eclipse.eef.eef.*;

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
 * @see org.eclipse.eef.eef.EefPackage
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
				result = caseContextableElement(eefViewDescription);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EefPackage.EEF_PAGE_DESCRIPTION: {
			EEFPageDescription eefPageDescription = (EEFPageDescription) theEObject;
			T result = caseEEFPageDescription(eefPageDescription);
			if (result == null)
				result = caseContextableElement(eefPageDescription);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EefPackage.EEF_GROUP_DESCRIPTION: {
			EEFGroupDescription eefGroupDescription = (EEFGroupDescription) theEObject;
			T result = caseEEFGroupDescription(eefGroupDescription);
			if (result == null)
				result = caseContextableElement(eefGroupDescription);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EefPackage.EEF_CONTAINER_DESCRIPTION: {
			EEFContainerDescription eefContainerDescription = (EEFContainerDescription) theEObject;
			T result = caseEEFContainerDescription(eefContainerDescription);
			if (result == null)
				result = caseContextableElement(eefContainerDescription);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EefPackage.EEF_WIDGET_DESCRIPTION: {
			EEFWidgetDescription eefWidgetDescription = (EEFWidgetDescription) theEObject;
			T result = caseEEFWidgetDescription(eefWidgetDescription);
			if (result == null)
				result = caseContextableElement(eefWidgetDescription);
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
				result = caseContextableElement(eefCellWidgetDescription);
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
				result = caseContextableElement(eefTextDescription);
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
				result = caseContextableElement(eefCheckboxDescription);
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
				result = caseContextableElement(eefSelectDescription);
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
				result = caseContextableElement(eefLabelDescription);
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
				result = caseContextableElement(eefRadioDescription);
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
				result = caseContextableElement(eefTreeDialogSelectDescription);
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
				result = caseContextableElement(eefLinkDescription);
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
				result = caseContextableElement(eefImageDescription);
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
				result = caseContextableElement(eefTreeDescription);
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
				result = caseContextableElement(eefImagePickerDescription);
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
				result = caseContextableElement(eefTableDescription);
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
		case EefPackage.CONTEXTABLE_ELEMENT: {
			ContextableElement contextableElement = (ContextableElement) theEObject;
			T result = caseContextableElement(contextableElement);
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
	 * Returns the result of interpreting the object as an instance of '<em>Contextable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contextable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextableElement(ContextableElement object) {
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
