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
import org.eclipse.eef.EEFContainmentReferenceDescription;
import org.eclipse.eef.EEFDynamicMappingFor;
import org.eclipse.eef.EEFDynamicMappingIf;
import org.eclipse.eef.EEFGroupDescription;
import org.eclipse.eef.EEFLabelDescription;
import org.eclipse.eef.EEFMultiValuedContainmentReferenceDescription;
import org.eclipse.eef.EEFMultiValuedReferenceDescription;
import org.eclipse.eef.EEFNonContainmentReferenceDescription;
import org.eclipse.eef.EEFPageDescription;
import org.eclipse.eef.EEFPropertyValidationRuleDescription;
import org.eclipse.eef.EEFRadioDescription;
import org.eclipse.eef.EEFReferenceDescription;
import org.eclipse.eef.EEFRuleAuditDescription;
import org.eclipse.eef.EEFSelectDescription;
import org.eclipse.eef.EEFSemanticValidationRuleDescription;
import org.eclipse.eef.EEFSingleValuedContainmentReferenceDescription;
import org.eclipse.eef.EEFSingleValuedReferenceDescription;
import org.eclipse.eef.EEFTextDescription;
import org.eclipse.eef.EEFValidationFixDescription;
import org.eclipse.eef.EEFValidationRuleDescription;
import org.eclipse.eef.EEFViewDescription;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.EefPackage;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter <code>createXXX</code>
 * method for each class of the model. <!-- end-user-doc -->
 * 
 * @see org.eclipse.eef.EefPackage
 * @generated
 */
public class EefAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static EefPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EefAdapterFactory() {
		if (EefAdapterFactory.modelPackage == null) {
			EefAdapterFactory.modelPackage = EefPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object. <!-- begin-user-doc --> This
	 * implementation returns <code>true</code> if the object is either the model's package or is an instance object of
	 * the model. <!-- end-user-doc -->
	 * 
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == EefAdapterFactory.modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == EefAdapterFactory.modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
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
		public Adapter caseEEFValidationRuleDescription(EEFValidationRuleDescription object) {
			return createEEFValidationRuleDescriptionAdapter();
		}

		@Override
		public Adapter caseEEFRuleAuditDescription(EEFRuleAuditDescription object) {
			return createEEFRuleAuditDescriptionAdapter();
		}

		@Override
		public Adapter caseEEFValidationFixDescription(EEFValidationFixDescription object) {
			return createEEFValidationFixDescriptionAdapter();
		}

		@Override
		public Adapter caseEEFPropertyValidationRuleDescription(EEFPropertyValidationRuleDescription object) {
			return createEEFPropertyValidationRuleDescriptionAdapter();
		}

		@Override
		public Adapter caseEEFSemanticValidationRuleDescription(EEFSemanticValidationRuleDescription object) {
			return createEEFSemanticValidationRuleDescriptionAdapter();
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
		public Adapter caseEEFTextDescription(EEFTextDescription object) {
			return createEEFTextDescriptionAdapter();
		}

		@Override
		public Adapter caseEEFLabelDescription(EEFLabelDescription object) {
			return createEEFLabelDescriptionAdapter();
		}

		@Override
		public Adapter caseEEFButtonDescription(EEFButtonDescription object) {
			return createEEFButtonDescriptionAdapter();
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
		public Adapter caseEEFRadioDescription(EEFRadioDescription object) {
			return createEEFRadioDescriptionAdapter();
		}

		@Override
		public Adapter caseEEFDynamicMappingFor(EEFDynamicMappingFor object) {
			return createEEFDynamicMappingForAdapter();
		}

		@Override
		public Adapter caseEEFDynamicMappingIf(EEFDynamicMappingIf object) {
			return createEEFDynamicMappingIfAdapter();
		}

		@Override
		public Adapter caseEEFReferenceDescription(EEFReferenceDescription object) {
			return createEEFReferenceDescriptionAdapter();
		}

		@Override
		public Adapter caseEEFContainmentReferenceDescription(EEFContainmentReferenceDescription object) {
			return createEEFContainmentReferenceDescriptionAdapter();
		}

		@Override
		public Adapter caseEEFNonContainmentReferenceDescription(EEFNonContainmentReferenceDescription object) {
			return createEEFNonContainmentReferenceDescriptionAdapter();
		}

		@Override
		public Adapter caseEEFSingleValuedContainmentReferenceDescription(EEFSingleValuedContainmentReferenceDescription object) {
			return createEEFSingleValuedContainmentReferenceDescriptionAdapter();
		}

		@Override
		public Adapter caseEEFSingleValuedReferenceDescription(EEFSingleValuedReferenceDescription object) {
			return createEEFSingleValuedReferenceDescriptionAdapter();
		}

		@Override
		public Adapter caseEEFMultiValuedContainmentReferenceDescription(EEFMultiValuedContainmentReferenceDescription object) {
			return createEEFMultiValuedContainmentReferenceDescriptionAdapter();
		}

		@Override
		public Adapter caseEEFMultiValuedReferenceDescription(EEFMultiValuedReferenceDescription object) {
			return createEEFMultiValuedReferenceDescriptionAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param target
	 *            the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFViewDescription
	 * <em>EEF View Description</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can
	 * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFViewDescription
	 * @generated
	 */
	public Adapter createEEFViewDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFPageDescription
	 * <em>EEF Page Description</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can
	 * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFPageDescription
	 * @generated
	 */
	public Adapter createEEFPageDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFValidationRuleDescription
	 * <em>EEF Validation Rule Description</em>}'. <!-- begin-user-doc --> This default implementation returns null so
	 * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFValidationRuleDescription
	 * @generated
	 */
	public Adapter createEEFValidationRuleDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFRuleAuditDescription
	 * <em>EEF Rule Audit Description</em>}'. <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFRuleAuditDescription
	 * @generated
	 */
	public Adapter createEEFRuleAuditDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFValidationFixDescription
	 * <em>EEF Validation Fix Description</em>}'. <!-- begin-user-doc --> This default implementation returns null so
	 * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFValidationFixDescription
	 * @generated
	 */
	public Adapter createEEFValidationFixDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFPropertyValidationRuleDescription
	 * <em>EEF Property Validation Rule Description</em>}'. <!-- begin-user-doc --> This default implementation returns
	 * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFPropertyValidationRuleDescription
	 * @generated
	 */
	public Adapter createEEFPropertyValidationRuleDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFSemanticValidationRuleDescription
	 * <em>EEF Semantic Validation Rule Description</em>}'. <!-- begin-user-doc --> This default implementation returns
	 * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFSemanticValidationRuleDescription
	 * @generated
	 */
	public Adapter createEEFSemanticValidationRuleDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFGroupDescription
	 * <em>EEF Group Description</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can
	 * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFGroupDescription
	 * @generated
	 */
	public Adapter createEEFGroupDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFContainerDescription
	 * <em>EEF Container Description</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFContainerDescription
	 * @generated
	 */
	public Adapter createEEFContainerDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFWidgetDescription
	 * <em>EEF Widget Description</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFWidgetDescription
	 * @generated
	 */
	public Adapter createEEFWidgetDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFTextDescription
	 * <em>EEF Text Description</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can
	 * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFTextDescription
	 * @generated
	 */
	public Adapter createEEFTextDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFLabelDescription
	 * <em>EEF Label Description</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can
	 * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFLabelDescription
	 * @generated
	 */
	public Adapter createEEFLabelDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFButtonDescription
	 * <em>EEF Button Description</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFButtonDescription
	 * @generated
	 */
	public Adapter createEEFButtonDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFCheckboxDescription
	 * <em>EEF Checkbox Description</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFCheckboxDescription
	 * @generated
	 */
	public Adapter createEEFCheckboxDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFSelectDescription
	 * <em>EEF Select Description</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFSelectDescription
	 * @generated
	 */
	public Adapter createEEFSelectDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFRadioDescription
	 * <em>EEF Radio Description</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can
	 * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFRadioDescription
	 * @generated
	 */
	public Adapter createEEFRadioDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFDynamicMappingFor
	 * <em>EEF Dynamic Mapping For</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFDynamicMappingFor
	 * @generated
	 */
	public Adapter createEEFDynamicMappingForAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFDynamicMappingIf
	 * <em>EEF Dynamic Mapping If</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFDynamicMappingIf
	 * @generated
	 */
	public Adapter createEEFDynamicMappingIfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFReferenceDescription
	 * <em>EEF Reference Description</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFReferenceDescription
	 * @generated
	 */
	public Adapter createEEFReferenceDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFContainmentReferenceDescription
	 * <em>EEF Containment Reference Description</em>}'. <!-- begin-user-doc --> This default implementation returns
	 * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFContainmentReferenceDescription
	 * @generated
	 */
	public Adapter createEEFContainmentReferenceDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFNonContainmentReferenceDescription
	 * <em>EEF Non Containment Reference Description</em>}'. <!-- begin-user-doc --> This default implementation returns
	 * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFNonContainmentReferenceDescription
	 * @generated
	 */
	public Adapter createEEFNonContainmentReferenceDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.eclipse.eef.EEFSingleValuedContainmentReferenceDescription
	 * <em>EEF Single Valued Containment Reference Description</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFSingleValuedContainmentReferenceDescription
	 * @generated
	 */
	public Adapter createEEFSingleValuedContainmentReferenceDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFSingleValuedReferenceDescription
	 * <em>EEF Single Valued Reference Description</em>}'. <!-- begin-user-doc --> This default implementation returns
	 * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFSingleValuedReferenceDescription
	 * @generated
	 */
	public Adapter createEEFSingleValuedReferenceDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.eclipse.eef.EEFMultiValuedContainmentReferenceDescription
	 * <em>EEF Multi Valued Containment Reference Description</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFMultiValuedContainmentReferenceDescription
	 * @generated
	 */
	public Adapter createEEFMultiValuedContainmentReferenceDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFMultiValuedReferenceDescription
	 * <em>EEF Multi Valued Reference Description</em>}'. <!-- begin-user-doc --> This default implementation returns
	 * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFMultiValuedReferenceDescription
	 * @generated
	 */
	public Adapter createEEFMultiValuedReferenceDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case. <!-- begin-user-doc --> This default implementation returns null.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} // EefAdapterFactory
