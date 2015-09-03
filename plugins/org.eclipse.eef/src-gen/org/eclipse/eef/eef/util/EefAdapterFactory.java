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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.eef.eef.EefPackage
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
		public Adapter caseEEFAdapterFactoryTableStructureDescription(
				EEFAdapterFactoryTableStructureDescription object) {
			return createEEFAdapterFactoryTableStructureDescriptionAdapter();
		}

		@Override
		public Adapter caseContextableElement(ContextableElement object) {
			return createContextableElementAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.eef.EEFViewDescription <em>EEF View Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.eef.EEFViewDescription
	 * @generated
	 */
	public Adapter createEEFViewDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.eef.EEFPageDescription <em>EEF Page Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.eef.EEFPageDescription
	 * @generated
	 */
	public Adapter createEEFPageDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.eef.EEFGroupDescription <em>EEF Group Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.eef.EEFGroupDescription
	 * @generated
	 */
	public Adapter createEEFGroupDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.eef.EEFContainerDescription <em>EEF Container Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.eef.EEFContainerDescription
	 * @generated
	 */
	public Adapter createEEFContainerDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.eef.EEFWidgetDescription <em>EEF Widget Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.eef.EEFWidgetDescription
	 * @generated
	 */
	public Adapter createEEFWidgetDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.eef.EEFJavaExtensionDescription <em>EEF Java Extension Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.eef.EEFJavaExtensionDescription
	 * @generated
	 */
	public Adapter createEEFJavaExtensionDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.eef.EEFTreeStructureDescription <em>EEF Tree Structure Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.eef.EEFTreeStructureDescription
	 * @generated
	 */
	public Adapter createEEFTreeStructureDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.eef.EEFInterpretedTableStructureDescription <em>EEF Interpreted Table Structure Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.eef.EEFInterpretedTableStructureDescription
	 * @generated
	 */
	public Adapter createEEFInterpretedTableStructureDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.eef.EEFCellWidgetDescription <em>EEF Cell Widget Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.eef.EEFCellWidgetDescription
	 * @generated
	 */
	public Adapter createEEFCellWidgetDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.eef.EEFAdapterFactoryTreeStructureDescription <em>EEF Adapter Factory Tree Structure Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.eef.EEFAdapterFactoryTreeStructureDescription
	 * @generated
	 */
	public Adapter createEEFAdapterFactoryTreeStructureDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.eef.EEFInterpretedTreeStructureDescription <em>EEF Interpreted Tree Structure Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.eef.EEFInterpretedTreeStructureDescription
	 * @generated
	 */
	public Adapter createEEFInterpretedTreeStructureDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.eef.EEFTextDescription <em>EEF Text Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.eef.EEFTextDescription
	 * @generated
	 */
	public Adapter createEEFTextDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.eef.EEFCheckboxDescription <em>EEF Checkbox Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.eef.EEFCheckboxDescription
	 * @generated
	 */
	public Adapter createEEFCheckboxDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.eef.EEFSelectDescription <em>EEF Select Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.eef.EEFSelectDescription
	 * @generated
	 */
	public Adapter createEEFSelectDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.eef.EEFLabelDescription <em>EEF Label Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.eef.EEFLabelDescription
	 * @generated
	 */
	public Adapter createEEFLabelDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.eef.EEFRadioDescription <em>EEF Radio Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.eef.EEFRadioDescription
	 * @generated
	 */
	public Adapter createEEFRadioDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.eef.EEFTreeDialogSelectDescription <em>EEF Tree Dialog Select Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.eef.EEFTreeDialogSelectDescription
	 * @generated
	 */
	public Adapter createEEFTreeDialogSelectDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.eef.EEFLinkDescription <em>EEF Link Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.eef.EEFLinkDescription
	 * @generated
	 */
	public Adapter createEEFLinkDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.eef.EEFImageDescription <em>EEF Image Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.eef.EEFImageDescription
	 * @generated
	 */
	public Adapter createEEFImageDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.eef.EEFTreeDescription <em>EEF Tree Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.eef.EEFTreeDescription
	 * @generated
	 */
	public Adapter createEEFTreeDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.eef.EEFImagePickerDescription <em>EEF Image Picker Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.eef.EEFImagePickerDescription
	 * @generated
	 */
	public Adapter createEEFImagePickerDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.eef.EEFTableDescription <em>EEF Table Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.eef.EEFTableDescription
	 * @generated
	 */
	public Adapter createEEFTableDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.eef.EEFColumnDescription <em>EEF Column Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.eef.EEFColumnDescription
	 * @generated
	 */
	public Adapter createEEFColumnDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.eef.EEFLineDescription <em>EEF Line Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.eef.EEFLineDescription
	 * @generated
	 */
	public Adapter createEEFLineDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.eef.EEFTableStructureDescription <em>EEF Table Structure Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.eef.EEFTableStructureDescription
	 * @generated
	 */
	public Adapter createEEFTableStructureDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.eef.EEFAdapterFactoryTableStructureDescription <em>EEF Adapter Factory Table Structure Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.eef.EEFAdapterFactoryTableStructureDescription
	 * @generated
	 */
	public Adapter createEEFAdapterFactoryTableStructureDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.eef.ContextableElement <em>Contextable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eef.eef.ContextableElement
	 * @generated
	 */
	public Adapter createContextableElementAdapter() {
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
