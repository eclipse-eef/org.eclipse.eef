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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.eef.EefPackage
 * @generated
 */
public class EefAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EefPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EefAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EefPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EefSwitch<Adapter> modelSwitch = new EefSwitch<Adapter>() {
		@Override
		public Adapter caseEEFViewDescription(EEFViewDescription object) {
			return createEEFViewDescriptionAdapter();
		}

		@Override
		public Adapter caseEEFPageDescription(EEFPageDescription object) {
			return createEEFPageDescriptionAdapter();
		}

		@Override
		public Adapter caseEEFGroupDescription(EEFGroupDescription object) {
			return createEEFGroupDescriptionAdapter();
		}

		@Override
		public Adapter caseEEFContainerDescription(EEFContainerDescription object) {
			return createEEFContainerDescriptionAdapter();
		}

		@Override
		public Adapter caseEEFWidgetDescription(EEFWidgetDescription object) {
			return createEEFWidgetDescriptionAdapter();
		}

		@Override
		public Adapter caseEEFJavaExtensionDescription(EEFJavaExtensionDescription object) {
			return createEEFJavaExtensionDescriptionAdapter();
		}

		@Override
		public Adapter caseEEFTreeStructureDescription(EEFTreeStructureDescription object) {
			return createEEFTreeStructureDescriptionAdapter();
		}

		@Override
		public Adapter caseEEFInterpretedTableStructureDescription(EEFInterpretedTableStructureDescription object) {
			return createEEFInterpretedTableStructureDescriptionAdapter();
		}

		@Override
		public Adapter caseEEFCellWidgetDescription(EEFCellWidgetDescription object) {
			return createEEFCellWidgetDescriptionAdapter();
		}

		@Override
		public Adapter caseEEFAdapterFactoryTreeStructureDescription(EEFAdapterFactoryTreeStructureDescription object) {
			return createEEFAdapterFactoryTreeStructureDescriptionAdapter();
		}

		@Override
		public Adapter caseEEFInterpretedTreeStructureDescription(EEFInterpretedTreeStructureDescription object) {
			return createEEFInterpretedTreeStructureDescriptionAdapter();
		}

		@Override
		public Adapter caseEEFTextDescription(EEFTextDescription object) {
			return createEEFTextDescriptionAdapter();
		}

		@Override
		public Adapter caseEEFCheckboxDescription(EEFCheckboxDescription object) {
			return createEEFCheckboxDescriptionAdapter();
		}

		@Override
		public Adapter caseEEFSelectDescription(EEFSelectDescription object) {
			return createEEFSelectDescriptionAdapter();
		}

		@Override
		public Adapter caseEEFLabelDescription(EEFLabelDescription object) {
			return createEEFLabelDescriptionAdapter();
		}

		@Override
		public Adapter caseEEFRadioDescription(EEFRadioDescription object) {
			return createEEFRadioDescriptionAdapter();
		}

		@Override
		public Adapter caseEEFTreeDialogSelectDescription(EEFTreeDialogSelectDescription object) {
			return createEEFTreeDialogSelectDescriptionAdapter();
		}

		@Override
		public Adapter caseEEFLinkDescription(EEFLinkDescription object) {
			return createEEFLinkDescriptionAdapter();
		}

		@Override
		public Adapter caseEEFImageDescription(EEFImageDescription object) {
			return createEEFImageDescriptionAdapter();
		}

		@Override
		public Adapter caseEEFTreeDescription(EEFTreeDescription object) {
			return createEEFTreeDescriptionAdapter();
		}

		@Override
		public Adapter caseEEFImagePickerDescription(EEFImagePickerDescription object) {
			return createEEFImagePickerDescriptionAdapter();
		}

		@Override
		public Adapter caseEEFTableDescription(EEFTableDescription object) {
			return createEEFTableDescriptionAdapter();
		}

		@Override
		public Adapter caseEEFColumnDescription(EEFColumnDescription object) {
			return createEEFColumnDescriptionAdapter();
		}

		@Override
		public Adapter caseEEFLineDescription(EEFLineDescription object) {
			return createEEFLineDescriptionAdapter();
		}

		@Override
		public Adapter caseEEFTableStructureDescription(EEFTableStructureDescription object) {
			return createEEFTableStructureDescriptionAdapter();
		}

		@Override
		public Adapter caseEEFAdapterFactoryTableStructureDescription(EEFAdapterFactoryTableStructureDescription object) {
			return createEEFAdapterFactoryTableStructureDescriptionAdapter();
		}

		@Override
		public Adapter caseEEFStyle(EEFStyle object) {
			return createEEFStyleAdapter();
		}

		@Override
		public Adapter caseEEFConditionalStyle(EEFConditionalStyle object) {
			return createEEFConditionalStyleAdapter();
		}

		@Override
		public Adapter caseEEFStyleCustomization(EEFStyleCustomization object) {
			return createEEFStyleCustomizationAdapter();
		}

		@Override
		public Adapter caseEEFGroupStyle(EEFGroupStyle object) {
			return createEEFGroupStyleAdapter();
		}

		@Override
		public Adapter caseEEFGroupConditionalStyle(EEFGroupConditionalStyle object) {
			return createEEFGroupConditionalStyleAdapter();
		}

		@Override
		public Adapter caseEEFGroupStyleCustomization(EEFGroupStyleCustomization object) {
			return createEEFGroupStyleCustomizationAdapter();
		}

		@Override
		public Adapter caseEEFTextStyle(EEFTextStyle object) {
			return createEEFTextStyleAdapter();
		}

		@Override
		public Adapter caseEEFTextConditionalStyle(EEFTextConditionalStyle object) {
			return createEEFTextConditionalStyleAdapter();
		}

		@Override
		public Adapter caseEEFTextStyleCustomization(EEFTextStyleCustomization object) {
			return createEEFTextStyleCustomizationAdapter();
		}

		@Override
		public Adapter caseEEFCheckboxStyle(EEFCheckboxStyle object) {
			return createEEFCheckboxStyleAdapter();
		}

		@Override
		public Adapter caseEEFCheckboxConditionalStyle(EEFCheckboxConditionalStyle object) {
			return createEEFCheckboxConditionalStyleAdapter();
		}

		@Override
		public Adapter caseEEFCheckboxStyleCustomization(EEFCheckboxStyleCustomization object) {
			return createEEFCheckboxStyleCustomizationAdapter();
		}

		@Override
		public Adapter caseEEFLabelStyle(EEFLabelStyle object) {
			return createEEFLabelStyleAdapter();
		}

		@Override
		public Adapter caseEEFLabelConditionalStyle(EEFLabelConditionalStyle object) {
			return createEEFLabelConditionalStyleAdapter();
		}

		@Override
		public Adapter caseEEFLabelStyleCustomization(EEFLabelStyleCustomization object) {
			return createEEFLabelStyleCustomizationAdapter();
		}

		@Override
		public Adapter caseEEFRadioStyle(EEFRadioStyle object) {
			return createEEFRadioStyleAdapter();
		}

		@Override
		public Adapter caseEEFRadioConditionalStyle(EEFRadioConditionalStyle object) {
			return createEEFRadioConditionalStyleAdapter();
		}

		@Override
		public Adapter caseEEFRadioStyleCustomization(EEFRadioStyleCustomization object) {
			return createEEFRadioStyleCustomizationAdapter();
		}

		@Override
		public Adapter caseEEFLinkStyle(EEFLinkStyle object) {
			return createEEFLinkStyleAdapter();
		}

		@Override
		public Adapter caseEEFLinkConditionalStyle(EEFLinkConditionalStyle object) {
			return createEEFLinkConditionalStyleAdapter();
		}

		@Override
		public Adapter caseEEFLinkStyleCustomization(EEFLinkStyleCustomization object) {
			return createEEFLinkStyleCustomizationAdapter();
		}

		@Override
		public Adapter caseEEFSelectStyle(EEFSelectStyle object) {
			return createEEFSelectStyleAdapter();
		}

		@Override
		public Adapter caseEEFSelectConditionalStyle(EEFSelectConditionalStyle object) {
			return createEEFSelectConditionalStyleAdapter();
		}

		@Override
		public Adapter caseEEFSelectStyleCustomization(EEFSelectStyleCustomization object) {
			return createEEFSelectStyleCustomizationAdapter();
		}

		@Override
		public Adapter caseEEFTreeStyle(EEFTreeStyle object) {
			return createEEFTreeStyleAdapter();
		}

		@Override
		public Adapter caseEEFTreeConditionalStyle(EEFTreeConditionalStyle object) {
			return createEEFTreeConditionalStyleAdapter();
		}

		@Override
		public Adapter caseEEFTreeStyleCustomization(EEFTreeStyleCustomization object) {
			return createEEFTreeStyleCustomizationAdapter();
		}

		@Override
		public Adapter caseEEFTableStyle(EEFTableStyle object) {
			return createEEFTableStyleAdapter();
		}

		@Override
		public Adapter caseEEFTableConditionalStyle(EEFTableConditionalStyle object) {
			return createEEFTableConditionalStyleAdapter();
		}

		@Override
		public Adapter caseEEFTableStyleCustomization(EEFTableStyleCustomization object) {
			return createEEFTableStyleCustomizationAdapter();
		}

		@Override
		public Adapter caseEEFLineStyle(EEFLineStyle object) {
			return createEEFLineStyleAdapter();
		}

		@Override
		public Adapter caseEEFLineConditionalStyle(EEFLineConditionalStyle object) {
			return createEEFLineConditionalStyleAdapter();
		}

		@Override
		public Adapter caseEEFLineStyleCustomization(EEFLineStyleCustomization object) {
			return createEEFLineStyleCustomizationAdapter();
		}

		@Override
		public Adapter caseEEFColumnStyle(EEFColumnStyle object) {
			return createEEFColumnStyleAdapter();
		}

		@Override
		public Adapter caseEEFColumnConditionalStyle(EEFColumnConditionalStyle object) {
			return createEEFColumnConditionalStyleAdapter();
		}

		@Override
		public Adapter caseEEFColumnStyleCustomization(EEFColumnStyleCustomization object) {
			return createEEFColumnStyleCustomizationAdapter();
		}

		@Override
		public Adapter caseEEFQuickFix(EEFQuickFix object) {
			return createEEFQuickFixAdapter();
		}

		@Override
		public Adapter caseEEFValidation(EEFValidation object) {
			return createEEFValidationAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFViewDescription <em>EEF View Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFViewDescription
	 * @generated
	 */
	public Adapter createEEFViewDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFPageDescription <em>EEF Page Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFPageDescription
	 * @generated
	 */
	public Adapter createEEFPageDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFGroupDescription <em>EEF Group Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFGroupDescription
	 * @generated
	 */
	public Adapter createEEFGroupDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFContainerDescription <em>EEF Container Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFContainerDescription
	 * @generated
	 */
	public Adapter createEEFContainerDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFWidgetDescription <em>EEF Widget Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFWidgetDescription
	 * @generated
	 */
	public Adapter createEEFWidgetDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFJavaExtensionDescription <em>EEF Java Extension Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFJavaExtensionDescription
	 * @generated
	 */
	public Adapter createEEFJavaExtensionDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFTreeStructureDescription <em>EEF Tree Structure Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFTreeStructureDescription
	 * @generated
	 */
	public Adapter createEEFTreeStructureDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFInterpretedTableStructureDescription <em>EEF Interpreted Table Structure Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFInterpretedTableStructureDescription
	 * @generated
	 */
	public Adapter createEEFInterpretedTableStructureDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFCellWidgetDescription <em>EEF Cell Widget Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFCellWidgetDescription
	 * @generated
	 */
	public Adapter createEEFCellWidgetDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFAdapterFactoryTreeStructureDescription <em>EEF Adapter Factory Tree Structure Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFAdapterFactoryTreeStructureDescription
	 * @generated
	 */
	public Adapter createEEFAdapterFactoryTreeStructureDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFInterpretedTreeStructureDescription <em>EEF Interpreted Tree Structure Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFInterpretedTreeStructureDescription
	 * @generated
	 */
	public Adapter createEEFInterpretedTreeStructureDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFTextDescription <em>EEF Text Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFTextDescription
	 * @generated
	 */
	public Adapter createEEFTextDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFCheckboxDescription <em>EEF Checkbox Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFCheckboxDescription
	 * @generated
	 */
	public Adapter createEEFCheckboxDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFSelectDescription <em>EEF Select Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFSelectDescription
	 * @generated
	 */
	public Adapter createEEFSelectDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFLabelDescription <em>EEF Label Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFLabelDescription
	 * @generated
	 */
	public Adapter createEEFLabelDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFRadioDescription <em>EEF Radio Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFRadioDescription
	 * @generated
	 */
	public Adapter createEEFRadioDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFTreeDialogSelectDescription <em>EEF Tree Dialog Select Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFTreeDialogSelectDescription
	 * @generated
	 */
	public Adapter createEEFTreeDialogSelectDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFLinkDescription <em>EEF Link Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFLinkDescription
	 * @generated
	 */
	public Adapter createEEFLinkDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFImageDescription <em>EEF Image Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFImageDescription
	 * @generated
	 */
	public Adapter createEEFImageDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFTreeDescription <em>EEF Tree Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFTreeDescription
	 * @generated
	 */
	public Adapter createEEFTreeDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFImagePickerDescription <em>EEF Image Picker Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFImagePickerDescription
	 * @generated
	 */
	public Adapter createEEFImagePickerDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFTableDescription <em>EEF Table Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFTableDescription
	 * @generated
	 */
	public Adapter createEEFTableDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFColumnDescription <em>EEF Column Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFColumnDescription
	 * @generated
	 */
	public Adapter createEEFColumnDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFLineDescription <em>EEF Line Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFLineDescription
	 * @generated
	 */
	public Adapter createEEFLineDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFTableStructureDescription <em>EEF Table Structure Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFTableStructureDescription
	 * @generated
	 */
	public Adapter createEEFTableStructureDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFAdapterFactoryTableStructureDescription <em>EEF Adapter Factory Table Structure Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFAdapterFactoryTableStructureDescription
	 * @generated
	 */
	public Adapter createEEFAdapterFactoryTableStructureDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFStyle <em>EEF Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFStyle
	 * @generated
	 */
	public Adapter createEEFStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFConditionalStyle <em>EEF Conditional Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFConditionalStyle
	 * @generated
	 */
	public Adapter createEEFConditionalStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFStyleCustomization <em>EEF Style Customization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFStyleCustomization
	 * @generated
	 */
	public Adapter createEEFStyleCustomizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFGroupStyle <em>EEF Group Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFGroupStyle
	 * @generated
	 */
	public Adapter createEEFGroupStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFGroupConditionalStyle <em>EEF Group Conditional Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFGroupConditionalStyle
	 * @generated
	 */
	public Adapter createEEFGroupConditionalStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFGroupStyleCustomization <em>EEF Group Style Customization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFGroupStyleCustomization
	 * @generated
	 */
	public Adapter createEEFGroupStyleCustomizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFTextStyle <em>EEF Text Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFTextStyle
	 * @generated
	 */
	public Adapter createEEFTextStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFTextConditionalStyle <em>EEF Text Conditional Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFTextConditionalStyle
	 * @generated
	 */
	public Adapter createEEFTextConditionalStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFTextStyleCustomization <em>EEF Text Style Customization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFTextStyleCustomization
	 * @generated
	 */
	public Adapter createEEFTextStyleCustomizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFCheckboxStyle <em>EEF Checkbox Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFCheckboxStyle
	 * @generated
	 */
	public Adapter createEEFCheckboxStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFCheckboxConditionalStyle <em>EEF Checkbox Conditional Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFCheckboxConditionalStyle
	 * @generated
	 */
	public Adapter createEEFCheckboxConditionalStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFCheckboxStyleCustomization <em>EEF Checkbox Style Customization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFCheckboxStyleCustomization
	 * @generated
	 */
	public Adapter createEEFCheckboxStyleCustomizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFLabelStyle <em>EEF Label Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFLabelStyle
	 * @generated
	 */
	public Adapter createEEFLabelStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFLabelConditionalStyle <em>EEF Label Conditional Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFLabelConditionalStyle
	 * @generated
	 */
	public Adapter createEEFLabelConditionalStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFLabelStyleCustomization <em>EEF Label Style Customization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFLabelStyleCustomization
	 * @generated
	 */
	public Adapter createEEFLabelStyleCustomizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFRadioStyle <em>EEF Radio Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFRadioStyle
	 * @generated
	 */
	public Adapter createEEFRadioStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFRadioConditionalStyle <em>EEF Radio Conditional Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFRadioConditionalStyle
	 * @generated
	 */
	public Adapter createEEFRadioConditionalStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFRadioStyleCustomization <em>EEF Radio Style Customization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFRadioStyleCustomization
	 * @generated
	 */
	public Adapter createEEFRadioStyleCustomizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFLinkStyle <em>EEF Link Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFLinkStyle
	 * @generated
	 */
	public Adapter createEEFLinkStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFLinkConditionalStyle <em>EEF Link Conditional Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFLinkConditionalStyle
	 * @generated
	 */
	public Adapter createEEFLinkConditionalStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFLinkStyleCustomization <em>EEF Link Style Customization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFLinkStyleCustomization
	 * @generated
	 */
	public Adapter createEEFLinkStyleCustomizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFSelectStyle <em>EEF Select Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFSelectStyle
	 * @generated
	 */
	public Adapter createEEFSelectStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFSelectConditionalStyle <em>EEF Select Conditional Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFSelectConditionalStyle
	 * @generated
	 */
	public Adapter createEEFSelectConditionalStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFSelectStyleCustomization <em>EEF Select Style Customization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFSelectStyleCustomization
	 * @generated
	 */
	public Adapter createEEFSelectStyleCustomizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFTreeStyle <em>EEF Tree Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFTreeStyle
	 * @generated
	 */
	public Adapter createEEFTreeStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFTreeConditionalStyle <em>EEF Tree Conditional Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFTreeConditionalStyle
	 * @generated
	 */
	public Adapter createEEFTreeConditionalStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFTreeStyleCustomization <em>EEF Tree Style Customization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFTreeStyleCustomization
	 * @generated
	 */
	public Adapter createEEFTreeStyleCustomizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFTableStyle <em>EEF Table Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFTableStyle
	 * @generated
	 */
	public Adapter createEEFTableStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFTableConditionalStyle <em>EEF Table Conditional Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFTableConditionalStyle
	 * @generated
	 */
	public Adapter createEEFTableConditionalStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFTableStyleCustomization <em>EEF Table Style Customization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFTableStyleCustomization
	 * @generated
	 */
	public Adapter createEEFTableStyleCustomizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFLineStyle <em>EEF Line Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFLineStyle
	 * @generated
	 */
	public Adapter createEEFLineStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFLineConditionalStyle <em>EEF Line Conditional Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFLineConditionalStyle
	 * @generated
	 */
	public Adapter createEEFLineConditionalStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFLineStyleCustomization <em>EEF Line Style Customization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFLineStyleCustomization
	 * @generated
	 */
	public Adapter createEEFLineStyleCustomizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFColumnStyle <em>EEF Column Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFColumnStyle
	 * @generated
	 */
	public Adapter createEEFColumnStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFColumnConditionalStyle <em>EEF Column Conditional Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFColumnConditionalStyle
	 * @generated
	 */
	public Adapter createEEFColumnConditionalStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFColumnStyleCustomization <em>EEF Column Style Customization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFColumnStyleCustomization
	 * @generated
	 */
	public Adapter createEEFColumnStyleCustomizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFQuickFix <em>EEF Quick Fix</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFQuickFix
	 * @generated
	 */
	public Adapter createEEFQuickFixAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFValidation <em>EEF Validation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFValidation
	 * @generated
	 */
	public Adapter createEEFValidationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //EefAdapterFactory
