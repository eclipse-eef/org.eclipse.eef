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
		public Adapter caseEEFControlDescription(EEFControlDescription object) {
			return createEEFControlDescriptionAdapter();
		}

		@Override
		public Adapter caseEEFContainerDescription(EEFContainerDescription object) {
			return createEEFContainerDescriptionAdapter();
		}

		@Override
		public Adapter caseEEFLayoutDescription(EEFLayoutDescription object) {
			return createEEFLayoutDescriptionAdapter();
		}

		@Override
		public Adapter caseEEFFillLayoutDescription(EEFFillLayoutDescription object) {
			return createEEFFillLayoutDescriptionAdapter();
		}

		@Override
		public Adapter caseEEFGridLayoutDescription(EEFGridLayoutDescription object) {
			return createEEFGridLayoutDescriptionAdapter();
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
		public Adapter caseEEFHyperlinkDescription(EEFHyperlinkDescription object) {
			return createEEFHyperlinkDescriptionAdapter();
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
		public Adapter caseEEFCustomWidgetDescription(EEFCustomWidgetDescription object) {
			return createEEFCustomWidgetDescriptionAdapter();
		}

		@Override
		public Adapter caseEEFCustomExpression(EEFCustomExpression object) {
			return createEEFCustomExpressionAdapter();
		}

		@Override
		public Adapter caseEEFListDescription(EEFListDescription object) {
			return createEEFListDescriptionAdapter();
		}

		@Override
		public Adapter caseEEFWidgetStyle(EEFWidgetStyle object) {
			return createEEFWidgetStyleAdapter();
		}

		@Override
		public Adapter caseEEFTextStyle(EEFTextStyle object) {
			return createEEFTextStyleAdapter();
		}

		@Override
		public Adapter caseEEFLabelStyle(EEFLabelStyle object) {
			return createEEFLabelStyleAdapter();
		}

		@Override
		public Adapter caseEEFButtonStyle(EEFButtonStyle object) {
			return createEEFButtonStyleAdapter();
		}

		@Override
		public Adapter caseEEFCheckboxStyle(EEFCheckboxStyle object) {
			return createEEFCheckboxStyleAdapter();
		}

		@Override
		public Adapter caseEEFSelectStyle(EEFSelectStyle object) {
			return createEEFSelectStyleAdapter();
		}

		@Override
		public Adapter caseEEFRadioStyle(EEFRadioStyle object) {
			return createEEFRadioStyleAdapter();
		}

		@Override
		public Adapter caseEEFHyperlinkStyle(EEFHyperlinkStyle object) {
			return createEEFHyperlinkStyleAdapter();
		}

		@Override
		public Adapter caseEEFCustomWidgetStyle(EEFCustomWidgetStyle object) {
			return createEEFCustomWidgetStyleAdapter();
		}

		@Override
		public Adapter caseEEFListStyle(EEFListStyle object) {
			return createEEFListStyleAdapter();
		}

		@Override
		public Adapter caseEEFGroupStyle(EEFGroupStyle object) {
			return createEEFGroupStyleAdapter();
		}

		@Override
		public Adapter caseEEFConditionalStyle(EEFConditionalStyle object) {
			return createEEFConditionalStyleAdapter();
		}

		@Override
		public Adapter caseEEFTextConditionalStyle(EEFTextConditionalStyle object) {
			return createEEFTextConditionalStyleAdapter();
		}

		@Override
		public Adapter caseEEFButtonConditionalStyle(EEFButtonConditionalStyle object) {
			return createEEFButtonConditionalStyleAdapter();
		}

		@Override
		public Adapter caseEEFLabelConditionalStyle(EEFLabelConditionalStyle object) {
			return createEEFLabelConditionalStyleAdapter();
		}

		@Override
		public Adapter caseEEFCheckboxConditionalStyle(EEFCheckboxConditionalStyle object) {
			return createEEFCheckboxConditionalStyleAdapter();
		}

		@Override
		public Adapter caseEEFSelectConditionalStyle(EEFSelectConditionalStyle object) {
			return createEEFSelectConditionalStyleAdapter();
		}

		@Override
		public Adapter caseEEFRadioConditionalStyle(EEFRadioConditionalStyle object) {
			return createEEFRadioConditionalStyleAdapter();
		}

		@Override
		public Adapter caseEEFHyperlinkConditionalStyle(EEFHyperlinkConditionalStyle object) {
			return createEEFHyperlinkConditionalStyleAdapter();
		}

		@Override
		public Adapter caseEEFCustomWidgetConditionalStyle(EEFCustomWidgetConditionalStyle object) {
			return createEEFCustomWidgetConditionalStyleAdapter();
		}

		@Override
		public Adapter caseEEFWidgetAction(EEFWidgetAction object) {
			return createEEFWidgetActionAdapter();
		}

		@Override
		public Adapter caseEEFListConditionalStyle(EEFListConditionalStyle object) {
			return createEEFListConditionalStyleAdapter();
		}

		@Override
		public Adapter caseEEFGroupConditionalStyle(EEFGroupConditionalStyle object) {
			return createEEFGroupConditionalStyleAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFControlDescription
	 * <em>EEF Control Description</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFControlDescription
	 * @generated
	 */
	public Adapter createEEFControlDescriptionAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFLayoutDescription
	 * <em>EEF Layout Description</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFLayoutDescription
	 * @generated
	 */
	public Adapter createEEFLayoutDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFFillLayoutDescription
	 * <em>EEF Fill Layout Description</em>}'. <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFFillLayoutDescription
	 * @generated
	 */
	public Adapter createEEFFillLayoutDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFGridLayoutDescription
	 * <em>EEF Grid Layout Description</em>}'. <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFGridLayoutDescription
	 * @generated
	 */
	public Adapter createEEFGridLayoutDescriptionAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFHyperlinkDescription
	 * <em>EEF Hyperlink Description</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFHyperlinkDescription
	 * @generated
	 */
	public Adapter createEEFHyperlinkDescriptionAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFCustomWidgetDescription
	 * <em>EEF Custom Widget Description</em>}'. <!-- begin-user-doc --> This default implementation returns null so
	 * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFCustomWidgetDescription
	 * @generated
	 */
	public Adapter createEEFCustomWidgetDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFCustomExpression
	 * <em>EEF Custom Expression</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can
	 * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFCustomExpression
	 * @generated
	 */
	public Adapter createEEFCustomExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFListDescription
	 * <em>EEF List Description</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can
	 * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFListDescription
	 * @generated
	 */
	public Adapter createEEFListDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFWidgetStyle <em>EEF Widget Style</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful
	 * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFWidgetStyle
	 * @generated
	 */
	public Adapter createEEFWidgetStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFTextStyle <em>EEF Text Style</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
	 * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFTextStyle
	 * @generated
	 */
	public Adapter createEEFTextStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFLabelStyle <em>EEF Label Style</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful
	 * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFLabelStyle
	 * @generated
	 */
	public Adapter createEEFLabelStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFButtonStyle <em>EEF Button Style</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful
	 * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFButtonStyle
	 * @generated
	 */
	public Adapter createEEFButtonStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFCheckboxStyle
	 * <em>EEF Checkbox Style</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can
	 * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFCheckboxStyle
	 * @generated
	 */
	public Adapter createEEFCheckboxStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFSelectStyle <em>EEF Select Style</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful
	 * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFSelectStyle
	 * @generated
	 */
	public Adapter createEEFSelectStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFRadioStyle <em>EEF Radio Style</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful
	 * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFRadioStyle
	 * @generated
	 */
	public Adapter createEEFRadioStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFHyperlinkStyle
	 * <em>EEF Hyperlink Style</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can
	 * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFHyperlinkStyle
	 * @generated
	 */
	public Adapter createEEFHyperlinkStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFCustomWidgetStyle
	 * <em>EEF Custom Widget Style</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFCustomWidgetStyle
	 * @generated
	 */
	public Adapter createEEFCustomWidgetStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFListStyle <em>EEF List Style</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
	 * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFListStyle
	 * @generated
	 */
	public Adapter createEEFListStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFGroupStyle <em>EEF Group Style</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful
	 * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFGroupStyle
	 * @generated
	 */
	public Adapter createEEFGroupStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFConditionalStyle
	 * <em>EEF Conditional Style</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can
	 * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFConditionalStyle
	 * @generated
	 */
	public Adapter createEEFConditionalStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFTextConditionalStyle
	 * <em>EEF Text Conditional Style</em>}'. <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFTextConditionalStyle
	 * @generated
	 */
	public Adapter createEEFTextConditionalStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFButtonConditionalStyle
	 * <em>EEF Button Conditional Style</em>}'. <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFButtonConditionalStyle
	 * @generated
	 */
	public Adapter createEEFButtonConditionalStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFLabelConditionalStyle
	 * <em>EEF Label Conditional Style</em>}'. <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFLabelConditionalStyle
	 * @generated
	 */
	public Adapter createEEFLabelConditionalStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFCheckboxConditionalStyle
	 * <em>EEF Checkbox Conditional Style</em>}'. <!-- begin-user-doc --> This default implementation returns null so
	 * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFCheckboxConditionalStyle
	 * @generated
	 */
	public Adapter createEEFCheckboxConditionalStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFSelectConditionalStyle
	 * <em>EEF Select Conditional Style</em>}'. <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFSelectConditionalStyle
	 * @generated
	 */
	public Adapter createEEFSelectConditionalStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFRadioConditionalStyle
	 * <em>EEF Radio Conditional Style</em>}'. <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFRadioConditionalStyle
	 * @generated
	 */
	public Adapter createEEFRadioConditionalStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFHyperlinkConditionalStyle
	 * <em>EEF Hyperlink Conditional Style</em>}'. <!-- begin-user-doc --> This default implementation returns null so
	 * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFHyperlinkConditionalStyle
	 * @generated
	 */
	public Adapter createEEFHyperlinkConditionalStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFCustomWidgetConditionalStyle
	 * <em>EEF Custom Widget Conditional Style</em>}'. <!-- begin-user-doc --> This default implementation returns null
	 * so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFCustomWidgetConditionalStyle
	 * @generated
	 */
	public Adapter createEEFCustomWidgetConditionalStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFWidgetAction <em>EEF Widget Action</em>}
	 * '. <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFWidgetAction
	 * @generated
	 */
	public Adapter createEEFWidgetActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFListConditionalStyle
	 * <em>EEF List Conditional Style</em>}'. <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFListConditionalStyle
	 * @generated
	 */
	public Adapter createEEFListConditionalStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eef.EEFGroupConditionalStyle
	 * <em>EEF Group Conditional Style</em>}'. <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.eef.EEFGroupConditionalStyle
	 * @generated
	 */
	public Adapter createEEFGroupConditionalStyleAdapter() {
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
