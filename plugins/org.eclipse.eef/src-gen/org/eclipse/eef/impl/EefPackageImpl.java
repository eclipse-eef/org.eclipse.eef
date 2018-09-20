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
import org.eclipse.eef.EEFToolbarAction;
import org.eclipse.eef.EEFValidationFixDescription;
import org.eclipse.eef.EEFValidationRuleDescription;
import org.eclipse.eef.EEFViewDescription;
import org.eclipse.eef.EEFWidgetAction;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.EEFWidgetStyle;
import org.eclipse.eef.EefFactory;
import org.eclipse.eef.EefPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class EefPackageImpl extends EPackageImpl implements EefPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass eefViewDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass eefPageDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass eefValidationRuleDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass eefRuleAuditDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass eefValidationFixDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass eefPropertyValidationRuleDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass eefSemanticValidationRuleDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass eefGroupDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass eefToolbarActionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass eefControlDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass eefContainerDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass eefLayoutDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass eefFillLayoutDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass eefGridLayoutDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass eefWidgetDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass eefTextDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass eefLabelDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass eefButtonDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass eefCheckboxDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass eefSelectDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass eefRadioDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass eefHyperlinkDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass eefDynamicMappingForEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass eefDynamicMappingIfEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass eefCustomWidgetDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass eefCustomExpressionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass eefListDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass eefWidgetStyleEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass eefTextStyleEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass eefLabelStyleEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass eefButtonStyleEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass eefCheckboxStyleEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass eefSelectStyleEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass eefRadioStyleEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass eefHyperlinkStyleEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass eefCustomWidgetStyleEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass eefListStyleEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass eefGroupStyleEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass eefConditionalStyleEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass eefTextConditionalStyleEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass eefButtonConditionalStyleEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass eefLabelConditionalStyleEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass eefCheckboxConditionalStyleEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass eefSelectConditionalStyleEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass eefRadioConditionalStyleEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass eefHyperlinkConditionalStyleEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass eefCustomWidgetConditionalStyleEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass eefWidgetActionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass eefListConditionalStyleEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass eefGroupConditionalStyleEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum eeF_VALIDATION_SEVERITY_DESCRIPTIONEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum eeF_FILL_LAYOUT_ORIENTATIONEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum eeF_TOGGLE_STYLEEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum eeF_TITLE_BAR_STYLEEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry
	 * EPackage.Registry} by the package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also
	 * performs initialization of the package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.eef.EefPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EefPackageImpl() {
		super(EefPackage.eNS_URI, EefFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>
	 * This method is used to initialize {@link EefPackage#eINSTANCE} when that field is accessed. Clients should not
	 * invoke it directly. Instead, they should simply access that field to obtain the package. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EefPackage init() {
		if (EefPackageImpl.isInited) {
			return (EefPackage) EPackage.Registry.INSTANCE.getEPackage(EefPackage.eNS_URI);
		}

		// Obtain or create and register package
		Object registeredEefPackage = EPackage.Registry.INSTANCE.get(EefPackage.eNS_URI);
		EefPackageImpl theEefPackage = registeredEefPackage instanceof EefPackageImpl ? (EefPackageImpl) registeredEefPackage : new EefPackageImpl();

		EefPackageImpl.isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEefPackage.createPackageContents();

		// Initialize created meta-data
		theEefPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEefPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EefPackage.eNS_URI, theEefPackage);
		return theEefPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getEEFViewDescription() {
		return eefViewDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFViewDescription_Identifier() {
		return (EAttribute) eefViewDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFViewDescription_LabelExpression() {
		return (EAttribute) eefViewDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFViewDescription_ImageExpression() {
		return (EAttribute) eefViewDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getEEFViewDescription_Groups() {
		return (EReference) eefViewDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getEEFViewDescription_Pages() {
		return (EReference) eefViewDescriptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getEEFViewDescription_EPackages() {
		return (EReference) eefViewDescriptionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getEEFPageDescription() {
		return eefPageDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFPageDescription_Identifier() {
		return (EAttribute) eefPageDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFPageDescription_LabelExpression() {
		return (EAttribute) eefPageDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFPageDescription_DomainClass() {
		return (EAttribute) eefPageDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFPageDescription_SemanticCandidateExpression() {
		return (EAttribute) eefPageDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFPageDescription_PreconditionExpression() {
		return (EAttribute) eefPageDescriptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getEEFPageDescription_Groups() {
		return (EReference) eefPageDescriptionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getEEFPageDescription_SemanticValidationRules() {
		return (EReference) eefPageDescriptionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFPageDescription_Indented() {
		return (EAttribute) eefPageDescriptionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getEEFPageDescription_Actions() {
		return (EReference) eefPageDescriptionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getEEFValidationRuleDescription() {
		return eefValidationRuleDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFValidationRuleDescription_Severity() {
		return (EAttribute) eefValidationRuleDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFValidationRuleDescription_MessageExpression() {
		return (EAttribute) eefValidationRuleDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getEEFValidationRuleDescription_Audits() {
		return (EReference) eefValidationRuleDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getEEFValidationRuleDescription_Fixes() {
		return (EReference) eefValidationRuleDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getEEFRuleAuditDescription() {
		return eefRuleAuditDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFRuleAuditDescription_AuditExpression() {
		return (EAttribute) eefRuleAuditDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getEEFValidationFixDescription() {
		return eefValidationFixDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFValidationFixDescription_Name() {
		return (EAttribute) eefValidationFixDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFValidationFixDescription_FixExpression() {
		return (EAttribute) eefValidationFixDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getEEFPropertyValidationRuleDescription() {
		return eefPropertyValidationRuleDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getEEFPropertyValidationRuleDescription_Targets() {
		return (EReference) eefPropertyValidationRuleDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getEEFSemanticValidationRuleDescription() {
		return eefSemanticValidationRuleDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFSemanticValidationRuleDescription_TargetClass() {
		return (EAttribute) eefSemanticValidationRuleDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getEEFGroupDescription() {
		return eefGroupDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFGroupDescription_Identifier() {
		return (EAttribute) eefGroupDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFGroupDescription_LabelExpression() {
		return (EAttribute) eefGroupDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFGroupDescription_DomainClass() {
		return (EAttribute) eefGroupDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFGroupDescription_SemanticCandidateExpression() {
		return (EAttribute) eefGroupDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFGroupDescription_PreconditionExpression() {
		return (EAttribute) eefGroupDescriptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getEEFGroupDescription_Controls() {
		return (EReference) eefGroupDescriptionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getEEFGroupDescription_SemanticValidationRules() {
		return (EReference) eefGroupDescriptionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getEEFGroupDescription_PropertyValidationRules() {
		return (EReference) eefGroupDescriptionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getEEFGroupDescription_Style() {
		return (EReference) eefGroupDescriptionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getEEFGroupDescription_ConditionalStyles() {
		return (EReference) eefGroupDescriptionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getEEFGroupDescription_Actions() {
		return (EReference) eefGroupDescriptionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getEEFToolbarAction() {
		return eefToolbarActionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFToolbarAction_TooltipExpression() {
		return (EAttribute) eefToolbarActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFToolbarAction_ImageExpression() {
		return (EAttribute) eefToolbarActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFToolbarAction_ActionExpression() {
		return (EAttribute) eefToolbarActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getEEFControlDescription() {
		return eefControlDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFControlDescription_Identifier() {
		return (EAttribute) eefControlDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getEEFContainerDescription() {
		return eefContainerDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getEEFContainerDescription_Controls() {
		return (EReference) eefContainerDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getEEFContainerDescription_Layout() {
		return (EReference) eefContainerDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getEEFLayoutDescription() {
		return eefLayoutDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getEEFFillLayoutDescription() {
		return eefFillLayoutDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFFillLayoutDescription_Orientation() {
		return (EAttribute) eefFillLayoutDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getEEFGridLayoutDescription() {
		return eefGridLayoutDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFGridLayoutDescription_NumberOfColumns() {
		return (EAttribute) eefGridLayoutDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFGridLayoutDescription_MakeColumnsWithEqualWidth() {
		return (EAttribute) eefGridLayoutDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getEEFWidgetDescription() {
		return eefWidgetDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFWidgetDescription_LabelExpression() {
		return (EAttribute) eefWidgetDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFWidgetDescription_HelpExpression() {
		return (EAttribute) eefWidgetDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFWidgetDescription_IsEnabledExpression() {
		return (EAttribute) eefWidgetDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getEEFWidgetDescription_PropertyValidationRules() {
		return (EReference) eefWidgetDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getEEFTextDescription() {
		return eefTextDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFTextDescription_ValueExpression() {
		return (EAttribute) eefTextDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFTextDescription_EditExpression() {
		return (EAttribute) eefTextDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFTextDescription_LineCount() {
		return (EAttribute) eefTextDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getEEFTextDescription_Style() {
		return (EReference) eefTextDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getEEFTextDescription_ConditionalStyles() {
		return (EReference) eefTextDescriptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getEEFLabelDescription() {
		return eefLabelDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFLabelDescription_ValueExpression() {
		return (EAttribute) eefLabelDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFLabelDescription_DisplayExpression() {
		return (EAttribute) eefLabelDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getEEFLabelDescription_Style() {
		return (EReference) eefLabelDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getEEFLabelDescription_ConditionalStyles() {
		return (EReference) eefLabelDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getEEFLabelDescription_Actions() {
		return (EReference) eefLabelDescriptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getEEFButtonDescription() {
		return eefButtonDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFButtonDescription_ButtonLabelExpression() {
		return (EAttribute) eefButtonDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFButtonDescription_ImageExpression() {
		return (EAttribute) eefButtonDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFButtonDescription_PushExpression() {
		return (EAttribute) eefButtonDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getEEFButtonDescription_Style() {
		return (EReference) eefButtonDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getEEFButtonDescription_ConditionalStyles() {
		return (EReference) eefButtonDescriptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getEEFCheckboxDescription() {
		return eefCheckboxDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFCheckboxDescription_ValueExpression() {
		return (EAttribute) eefCheckboxDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFCheckboxDescription_EditExpression() {
		return (EAttribute) eefCheckboxDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getEEFCheckboxDescription_Style() {
		return (EReference) eefCheckboxDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getEEFCheckboxDescription_ConditionalStyles() {
		return (EReference) eefCheckboxDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getEEFSelectDescription() {
		return eefSelectDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFSelectDescription_ValueExpression() {
		return (EAttribute) eefSelectDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFSelectDescription_EditExpression() {
		return (EAttribute) eefSelectDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFSelectDescription_CandidatesExpression() {
		return (EAttribute) eefSelectDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFSelectDescription_CandidateDisplayExpression() {
		return (EAttribute) eefSelectDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getEEFSelectDescription_Style() {
		return (EReference) eefSelectDescriptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getEEFSelectDescription_ConditionalStyles() {
		return (EReference) eefSelectDescriptionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getEEFRadioDescription() {
		return eefRadioDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFRadioDescription_ValueExpression() {
		return (EAttribute) eefRadioDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFRadioDescription_EditExpression() {
		return (EAttribute) eefRadioDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFRadioDescription_CandidatesExpression() {
		return (EAttribute) eefRadioDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFRadioDescription_CandidateDisplayExpression() {
		return (EAttribute) eefRadioDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getEEFRadioDescription_Style() {
		return (EReference) eefRadioDescriptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFRadioDescription_NumberOfColumns() {
		return (EAttribute) eefRadioDescriptionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getEEFRadioDescription_ConditionalStyles() {
		return (EReference) eefRadioDescriptionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getEEFHyperlinkDescription() {
		return eefHyperlinkDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFHyperlinkDescription_ValueExpression() {
		return (EAttribute) eefHyperlinkDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFHyperlinkDescription_DisplayExpression() {
		return (EAttribute) eefHyperlinkDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFHyperlinkDescription_OnClickExpression() {
		return (EAttribute) eefHyperlinkDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getEEFHyperlinkDescription_Style() {
		return (EReference) eefHyperlinkDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getEEFHyperlinkDescription_ConditionalStyles() {
		return (EReference) eefHyperlinkDescriptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getEEFHyperlinkDescription_Actions() {
		return (EReference) eefHyperlinkDescriptionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getEEFDynamicMappingFor() {
		return eefDynamicMappingForEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFDynamicMappingFor_Iterator() {
		return (EAttribute) eefDynamicMappingForEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFDynamicMappingFor_IterableExpression() {
		return (EAttribute) eefDynamicMappingForEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFDynamicMappingFor_ForceRefresh() {
		return (EAttribute) eefDynamicMappingForEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getEEFDynamicMappingFor_Ifs() {
		return (EReference) eefDynamicMappingForEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getEEFDynamicMappingIf() {
		return eefDynamicMappingIfEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFDynamicMappingIf_PredicateExpression() {
		return (EAttribute) eefDynamicMappingIfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getEEFDynamicMappingIf_Widget() {
		return (EReference) eefDynamicMappingIfEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getEEFCustomWidgetDescription() {
		return eefCustomWidgetDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getEEFCustomWidgetDescription_CustomExpressions() {
		return (EReference) eefCustomWidgetDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getEEFCustomWidgetDescription_Style() {
		return (EReference) eefCustomWidgetDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getEEFCustomWidgetDescription_ConditionalStyles() {
		return (EReference) eefCustomWidgetDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getEEFCustomExpression() {
		return eefCustomExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFCustomExpression_Identifier() {
		return (EAttribute) eefCustomExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFCustomExpression_CustomExpression() {
		return (EAttribute) eefCustomExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getEEFListDescription() {
		return eefListDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFListDescription_ValueExpression() {
		return (EAttribute) eefListDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFListDescription_DisplayExpression() {
		return (EAttribute) eefListDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFListDescription_OnClickExpression() {
		return (EAttribute) eefListDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getEEFListDescription_Actions() {
		return (EReference) eefListDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getEEFListDescription_Style() {
		return (EReference) eefListDescriptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getEEFListDescription_ConditionalStyles() {
		return (EReference) eefListDescriptionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getEEFWidgetStyle() {
		return eefWidgetStyleEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFWidgetStyle_LabelBackgroundColorExpression() {
		return (EAttribute) eefWidgetStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFWidgetStyle_LabelForegroundColorExpression() {
		return (EAttribute) eefWidgetStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFWidgetStyle_LabelFontNameExpression() {
		return (EAttribute) eefWidgetStyleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFWidgetStyle_LabelFontSizeExpression() {
		return (EAttribute) eefWidgetStyleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFWidgetStyle_LabelFontStyleExpression() {
		return (EAttribute) eefWidgetStyleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getEEFTextStyle() {
		return eefTextStyleEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFTextStyle_BackgroundColorExpression() {
		return (EAttribute) eefTextStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFTextStyle_ForegroundColorExpression() {
		return (EAttribute) eefTextStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFTextStyle_FontNameExpression() {
		return (EAttribute) eefTextStyleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFTextStyle_FontSizeExpression() {
		return (EAttribute) eefTextStyleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFTextStyle_FontStyleExpression() {
		return (EAttribute) eefTextStyleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getEEFLabelStyle() {
		return eefLabelStyleEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFLabelStyle_BackgroundColorExpression() {
		return (EAttribute) eefLabelStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFLabelStyle_ForegroundColorExpression() {
		return (EAttribute) eefLabelStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFLabelStyle_FontNameExpression() {
		return (EAttribute) eefLabelStyleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFLabelStyle_FontSizeExpression() {
		return (EAttribute) eefLabelStyleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFLabelStyle_FontStyleExpression() {
		return (EAttribute) eefLabelStyleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getEEFButtonStyle() {
		return eefButtonStyleEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getEEFCheckboxStyle() {
		return eefCheckboxStyleEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getEEFSelectStyle() {
		return eefSelectStyleEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getEEFRadioStyle() {
		return eefRadioStyleEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getEEFHyperlinkStyle() {
		return eefHyperlinkStyleEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFHyperlinkStyle_BackgroundColorExpression() {
		return (EAttribute) eefHyperlinkStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFHyperlinkStyle_FontNameExpression() {
		return (EAttribute) eefHyperlinkStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFHyperlinkStyle_FontSizeExpression() {
		return (EAttribute) eefHyperlinkStyleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFHyperlinkStyle_FontStyleExpression() {
		return (EAttribute) eefHyperlinkStyleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getEEFCustomWidgetStyle() {
		return eefCustomWidgetStyleEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getEEFListStyle() {
		return eefListStyleEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getEEFGroupStyle() {
		return eefGroupStyleEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFGroupStyle_BackgroundColorExpression() {
		return (EAttribute) eefGroupStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFGroupStyle_ForegroundColorExpression() {
		return (EAttribute) eefGroupStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFGroupStyle_FontNameExpression() {
		return (EAttribute) eefGroupStyleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFGroupStyle_FontSizeExpression() {
		return (EAttribute) eefGroupStyleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFGroupStyle_BarStyle() {
		return (EAttribute) eefGroupStyleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFGroupStyle_ToggleStyle() {
		return (EAttribute) eefGroupStyleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFGroupStyle_ExpandedByDefault() {
		return (EAttribute) eefGroupStyleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getEEFConditionalStyle() {
		return eefConditionalStyleEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFConditionalStyle_PreconditionExpression() {
		return (EAttribute) eefConditionalStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getEEFTextConditionalStyle() {
		return eefTextConditionalStyleEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getEEFTextConditionalStyle_Style() {
		return (EReference) eefTextConditionalStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getEEFButtonConditionalStyle() {
		return eefButtonConditionalStyleEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getEEFButtonConditionalStyle_Style() {
		return (EReference) eefButtonConditionalStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getEEFLabelConditionalStyle() {
		return eefLabelConditionalStyleEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getEEFLabelConditionalStyle_Style() {
		return (EReference) eefLabelConditionalStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getEEFCheckboxConditionalStyle() {
		return eefCheckboxConditionalStyleEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getEEFCheckboxConditionalStyle_Style() {
		return (EReference) eefCheckboxConditionalStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getEEFSelectConditionalStyle() {
		return eefSelectConditionalStyleEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getEEFSelectConditionalStyle_Style() {
		return (EReference) eefSelectConditionalStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getEEFRadioConditionalStyle() {
		return eefRadioConditionalStyleEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getEEFRadioConditionalStyle_Style() {
		return (EReference) eefRadioConditionalStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getEEFHyperlinkConditionalStyle() {
		return eefHyperlinkConditionalStyleEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getEEFHyperlinkConditionalStyle_Style() {
		return (EReference) eefHyperlinkConditionalStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getEEFCustomWidgetConditionalStyle() {
		return eefCustomWidgetConditionalStyleEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getEEFCustomWidgetConditionalStyle_Style() {
		return (EReference) eefCustomWidgetConditionalStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getEEFWidgetAction() {
		return eefWidgetActionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFWidgetAction_LabelExpression() {
		return (EAttribute) eefWidgetActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFWidgetAction_ImageExpression() {
		return (EAttribute) eefWidgetActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getEEFWidgetAction_ActionExpression() {
		return (EAttribute) eefWidgetActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getEEFListConditionalStyle() {
		return eefListConditionalStyleEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getEEFListConditionalStyle_Style() {
		return (EReference) eefListConditionalStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getEEFGroupConditionalStyle() {
		return eefGroupConditionalStyleEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getEEFGroupConditionalStyle_Style() {
		return (EReference) eefGroupConditionalStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EEnum getEEF_VALIDATION_SEVERITY_DESCRIPTION() {
		return eeF_VALIDATION_SEVERITY_DESCRIPTIONEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EEnum getEEF_FILL_LAYOUT_ORIENTATION() {
		return eeF_FILL_LAYOUT_ORIENTATIONEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EEnum getEEF_TOGGLE_STYLE() {
		return eeF_TOGGLE_STYLEEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EEnum getEEF_TITLE_BAR_STYLE() {
		return eeF_TITLE_BAR_STYLEEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EefFactory getEefFactory() {
		return (EefFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package. This method is guarded to have no affect on any invocation but
	 * its first. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) {
			return;
		}
		isCreated = true;

		// Create classes and their features
		eefViewDescriptionEClass = createEClass(EefPackage.EEF_VIEW_DESCRIPTION);
		createEAttribute(eefViewDescriptionEClass, EefPackage.EEF_VIEW_DESCRIPTION__IDENTIFIER);
		createEAttribute(eefViewDescriptionEClass, EefPackage.EEF_VIEW_DESCRIPTION__LABEL_EXPRESSION);
		createEAttribute(eefViewDescriptionEClass, EefPackage.EEF_VIEW_DESCRIPTION__IMAGE_EXPRESSION);
		createEReference(eefViewDescriptionEClass, EefPackage.EEF_VIEW_DESCRIPTION__GROUPS);
		createEReference(eefViewDescriptionEClass, EefPackage.EEF_VIEW_DESCRIPTION__PAGES);
		createEReference(eefViewDescriptionEClass, EefPackage.EEF_VIEW_DESCRIPTION__EPACKAGES);

		eefPageDescriptionEClass = createEClass(EefPackage.EEF_PAGE_DESCRIPTION);
		createEAttribute(eefPageDescriptionEClass, EefPackage.EEF_PAGE_DESCRIPTION__IDENTIFIER);
		createEAttribute(eefPageDescriptionEClass, EefPackage.EEF_PAGE_DESCRIPTION__LABEL_EXPRESSION);
		createEAttribute(eefPageDescriptionEClass, EefPackage.EEF_PAGE_DESCRIPTION__DOMAIN_CLASS);
		createEAttribute(eefPageDescriptionEClass, EefPackage.EEF_PAGE_DESCRIPTION__SEMANTIC_CANDIDATE_EXPRESSION);
		createEAttribute(eefPageDescriptionEClass, EefPackage.EEF_PAGE_DESCRIPTION__PRECONDITION_EXPRESSION);
		createEReference(eefPageDescriptionEClass, EefPackage.EEF_PAGE_DESCRIPTION__GROUPS);
		createEReference(eefPageDescriptionEClass, EefPackage.EEF_PAGE_DESCRIPTION__SEMANTIC_VALIDATION_RULES);
		createEAttribute(eefPageDescriptionEClass, EefPackage.EEF_PAGE_DESCRIPTION__INDENTED);
		createEReference(eefPageDescriptionEClass, EefPackage.EEF_PAGE_DESCRIPTION__ACTIONS);

		eefValidationRuleDescriptionEClass = createEClass(EefPackage.EEF_VALIDATION_RULE_DESCRIPTION);
		createEAttribute(eefValidationRuleDescriptionEClass, EefPackage.EEF_VALIDATION_RULE_DESCRIPTION__SEVERITY);
		createEAttribute(eefValidationRuleDescriptionEClass, EefPackage.EEF_VALIDATION_RULE_DESCRIPTION__MESSAGE_EXPRESSION);
		createEReference(eefValidationRuleDescriptionEClass, EefPackage.EEF_VALIDATION_RULE_DESCRIPTION__AUDITS);
		createEReference(eefValidationRuleDescriptionEClass, EefPackage.EEF_VALIDATION_RULE_DESCRIPTION__FIXES);

		eefRuleAuditDescriptionEClass = createEClass(EefPackage.EEF_RULE_AUDIT_DESCRIPTION);
		createEAttribute(eefRuleAuditDescriptionEClass, EefPackage.EEF_RULE_AUDIT_DESCRIPTION__AUDIT_EXPRESSION);

		eefValidationFixDescriptionEClass = createEClass(EefPackage.EEF_VALIDATION_FIX_DESCRIPTION);
		createEAttribute(eefValidationFixDescriptionEClass, EefPackage.EEF_VALIDATION_FIX_DESCRIPTION__NAME);
		createEAttribute(eefValidationFixDescriptionEClass, EefPackage.EEF_VALIDATION_FIX_DESCRIPTION__FIX_EXPRESSION);

		eefPropertyValidationRuleDescriptionEClass = createEClass(EefPackage.EEF_PROPERTY_VALIDATION_RULE_DESCRIPTION);
		createEReference(eefPropertyValidationRuleDescriptionEClass, EefPackage.EEF_PROPERTY_VALIDATION_RULE_DESCRIPTION__TARGETS);

		eefSemanticValidationRuleDescriptionEClass = createEClass(EefPackage.EEF_SEMANTIC_VALIDATION_RULE_DESCRIPTION);
		createEAttribute(eefSemanticValidationRuleDescriptionEClass, EefPackage.EEF_SEMANTIC_VALIDATION_RULE_DESCRIPTION__TARGET_CLASS);

		eefGroupDescriptionEClass = createEClass(EefPackage.EEF_GROUP_DESCRIPTION);
		createEAttribute(eefGroupDescriptionEClass, EefPackage.EEF_GROUP_DESCRIPTION__IDENTIFIER);
		createEAttribute(eefGroupDescriptionEClass, EefPackage.EEF_GROUP_DESCRIPTION__LABEL_EXPRESSION);
		createEAttribute(eefGroupDescriptionEClass, EefPackage.EEF_GROUP_DESCRIPTION__DOMAIN_CLASS);
		createEAttribute(eefGroupDescriptionEClass, EefPackage.EEF_GROUP_DESCRIPTION__SEMANTIC_CANDIDATE_EXPRESSION);
		createEAttribute(eefGroupDescriptionEClass, EefPackage.EEF_GROUP_DESCRIPTION__PRECONDITION_EXPRESSION);
		createEReference(eefGroupDescriptionEClass, EefPackage.EEF_GROUP_DESCRIPTION__CONTROLS);
		createEReference(eefGroupDescriptionEClass, EefPackage.EEF_GROUP_DESCRIPTION__SEMANTIC_VALIDATION_RULES);
		createEReference(eefGroupDescriptionEClass, EefPackage.EEF_GROUP_DESCRIPTION__PROPERTY_VALIDATION_RULES);
		createEReference(eefGroupDescriptionEClass, EefPackage.EEF_GROUP_DESCRIPTION__STYLE);
		createEReference(eefGroupDescriptionEClass, EefPackage.EEF_GROUP_DESCRIPTION__CONDITIONAL_STYLES);
		createEReference(eefGroupDescriptionEClass, EefPackage.EEF_GROUP_DESCRIPTION__ACTIONS);

		eefToolbarActionEClass = createEClass(EefPackage.EEF_TOOLBAR_ACTION);
		createEAttribute(eefToolbarActionEClass, EefPackage.EEF_TOOLBAR_ACTION__TOOLTIP_EXPRESSION);
		createEAttribute(eefToolbarActionEClass, EefPackage.EEF_TOOLBAR_ACTION__IMAGE_EXPRESSION);
		createEAttribute(eefToolbarActionEClass, EefPackage.EEF_TOOLBAR_ACTION__ACTION_EXPRESSION);

		eefControlDescriptionEClass = createEClass(EefPackage.EEF_CONTROL_DESCRIPTION);
		createEAttribute(eefControlDescriptionEClass, EefPackage.EEF_CONTROL_DESCRIPTION__IDENTIFIER);

		eefContainerDescriptionEClass = createEClass(EefPackage.EEF_CONTAINER_DESCRIPTION);
		createEReference(eefContainerDescriptionEClass, EefPackage.EEF_CONTAINER_DESCRIPTION__CONTROLS);
		createEReference(eefContainerDescriptionEClass, EefPackage.EEF_CONTAINER_DESCRIPTION__LAYOUT);

		eefLayoutDescriptionEClass = createEClass(EefPackage.EEF_LAYOUT_DESCRIPTION);

		eefFillLayoutDescriptionEClass = createEClass(EefPackage.EEF_FILL_LAYOUT_DESCRIPTION);
		createEAttribute(eefFillLayoutDescriptionEClass, EefPackage.EEF_FILL_LAYOUT_DESCRIPTION__ORIENTATION);

		eefGridLayoutDescriptionEClass = createEClass(EefPackage.EEF_GRID_LAYOUT_DESCRIPTION);
		createEAttribute(eefGridLayoutDescriptionEClass, EefPackage.EEF_GRID_LAYOUT_DESCRIPTION__NUMBER_OF_COLUMNS);
		createEAttribute(eefGridLayoutDescriptionEClass, EefPackage.EEF_GRID_LAYOUT_DESCRIPTION__MAKE_COLUMNS_WITH_EQUAL_WIDTH);

		eefWidgetDescriptionEClass = createEClass(EefPackage.EEF_WIDGET_DESCRIPTION);
		createEAttribute(eefWidgetDescriptionEClass, EefPackage.EEF_WIDGET_DESCRIPTION__LABEL_EXPRESSION);
		createEAttribute(eefWidgetDescriptionEClass, EefPackage.EEF_WIDGET_DESCRIPTION__HELP_EXPRESSION);
		createEAttribute(eefWidgetDescriptionEClass, EefPackage.EEF_WIDGET_DESCRIPTION__IS_ENABLED_EXPRESSION);
		createEReference(eefWidgetDescriptionEClass, EefPackage.EEF_WIDGET_DESCRIPTION__PROPERTY_VALIDATION_RULES);

		eefTextDescriptionEClass = createEClass(EefPackage.EEF_TEXT_DESCRIPTION);
		createEAttribute(eefTextDescriptionEClass, EefPackage.EEF_TEXT_DESCRIPTION__VALUE_EXPRESSION);
		createEAttribute(eefTextDescriptionEClass, EefPackage.EEF_TEXT_DESCRIPTION__EDIT_EXPRESSION);
		createEAttribute(eefTextDescriptionEClass, EefPackage.EEF_TEXT_DESCRIPTION__LINE_COUNT);
		createEReference(eefTextDescriptionEClass, EefPackage.EEF_TEXT_DESCRIPTION__STYLE);
		createEReference(eefTextDescriptionEClass, EefPackage.EEF_TEXT_DESCRIPTION__CONDITIONAL_STYLES);

		eefLabelDescriptionEClass = createEClass(EefPackage.EEF_LABEL_DESCRIPTION);
		createEAttribute(eefLabelDescriptionEClass, EefPackage.EEF_LABEL_DESCRIPTION__VALUE_EXPRESSION);
		createEAttribute(eefLabelDescriptionEClass, EefPackage.EEF_LABEL_DESCRIPTION__DISPLAY_EXPRESSION);
		createEReference(eefLabelDescriptionEClass, EefPackage.EEF_LABEL_DESCRIPTION__STYLE);
		createEReference(eefLabelDescriptionEClass, EefPackage.EEF_LABEL_DESCRIPTION__CONDITIONAL_STYLES);
		createEReference(eefLabelDescriptionEClass, EefPackage.EEF_LABEL_DESCRIPTION__ACTIONS);

		eefButtonDescriptionEClass = createEClass(EefPackage.EEF_BUTTON_DESCRIPTION);
		createEAttribute(eefButtonDescriptionEClass, EefPackage.EEF_BUTTON_DESCRIPTION__BUTTON_LABEL_EXPRESSION);
		createEAttribute(eefButtonDescriptionEClass, EefPackage.EEF_BUTTON_DESCRIPTION__IMAGE_EXPRESSION);
		createEAttribute(eefButtonDescriptionEClass, EefPackage.EEF_BUTTON_DESCRIPTION__PUSH_EXPRESSION);
		createEReference(eefButtonDescriptionEClass, EefPackage.EEF_BUTTON_DESCRIPTION__STYLE);
		createEReference(eefButtonDescriptionEClass, EefPackage.EEF_BUTTON_DESCRIPTION__CONDITIONAL_STYLES);

		eefCheckboxDescriptionEClass = createEClass(EefPackage.EEF_CHECKBOX_DESCRIPTION);
		createEAttribute(eefCheckboxDescriptionEClass, EefPackage.EEF_CHECKBOX_DESCRIPTION__VALUE_EXPRESSION);
		createEAttribute(eefCheckboxDescriptionEClass, EefPackage.EEF_CHECKBOX_DESCRIPTION__EDIT_EXPRESSION);
		createEReference(eefCheckboxDescriptionEClass, EefPackage.EEF_CHECKBOX_DESCRIPTION__STYLE);
		createEReference(eefCheckboxDescriptionEClass, EefPackage.EEF_CHECKBOX_DESCRIPTION__CONDITIONAL_STYLES);

		eefSelectDescriptionEClass = createEClass(EefPackage.EEF_SELECT_DESCRIPTION);
		createEAttribute(eefSelectDescriptionEClass, EefPackage.EEF_SELECT_DESCRIPTION__VALUE_EXPRESSION);
		createEAttribute(eefSelectDescriptionEClass, EefPackage.EEF_SELECT_DESCRIPTION__EDIT_EXPRESSION);
		createEAttribute(eefSelectDescriptionEClass, EefPackage.EEF_SELECT_DESCRIPTION__CANDIDATES_EXPRESSION);
		createEAttribute(eefSelectDescriptionEClass, EefPackage.EEF_SELECT_DESCRIPTION__CANDIDATE_DISPLAY_EXPRESSION);
		createEReference(eefSelectDescriptionEClass, EefPackage.EEF_SELECT_DESCRIPTION__STYLE);
		createEReference(eefSelectDescriptionEClass, EefPackage.EEF_SELECT_DESCRIPTION__CONDITIONAL_STYLES);

		eefRadioDescriptionEClass = createEClass(EefPackage.EEF_RADIO_DESCRIPTION);
		createEAttribute(eefRadioDescriptionEClass, EefPackage.EEF_RADIO_DESCRIPTION__VALUE_EXPRESSION);
		createEAttribute(eefRadioDescriptionEClass, EefPackage.EEF_RADIO_DESCRIPTION__EDIT_EXPRESSION);
		createEAttribute(eefRadioDescriptionEClass, EefPackage.EEF_RADIO_DESCRIPTION__CANDIDATES_EXPRESSION);
		createEAttribute(eefRadioDescriptionEClass, EefPackage.EEF_RADIO_DESCRIPTION__CANDIDATE_DISPLAY_EXPRESSION);
		createEReference(eefRadioDescriptionEClass, EefPackage.EEF_RADIO_DESCRIPTION__STYLE);
		createEAttribute(eefRadioDescriptionEClass, EefPackage.EEF_RADIO_DESCRIPTION__NUMBER_OF_COLUMNS);
		createEReference(eefRadioDescriptionEClass, EefPackage.EEF_RADIO_DESCRIPTION__CONDITIONAL_STYLES);

		eefHyperlinkDescriptionEClass = createEClass(EefPackage.EEF_HYPERLINK_DESCRIPTION);
		createEAttribute(eefHyperlinkDescriptionEClass, EefPackage.EEF_HYPERLINK_DESCRIPTION__VALUE_EXPRESSION);
		createEAttribute(eefHyperlinkDescriptionEClass, EefPackage.EEF_HYPERLINK_DESCRIPTION__DISPLAY_EXPRESSION);
		createEAttribute(eefHyperlinkDescriptionEClass, EefPackage.EEF_HYPERLINK_DESCRIPTION__ON_CLICK_EXPRESSION);
		createEReference(eefHyperlinkDescriptionEClass, EefPackage.EEF_HYPERLINK_DESCRIPTION__STYLE);
		createEReference(eefHyperlinkDescriptionEClass, EefPackage.EEF_HYPERLINK_DESCRIPTION__CONDITIONAL_STYLES);
		createEReference(eefHyperlinkDescriptionEClass, EefPackage.EEF_HYPERLINK_DESCRIPTION__ACTIONS);

		eefDynamicMappingForEClass = createEClass(EefPackage.EEF_DYNAMIC_MAPPING_FOR);
		createEAttribute(eefDynamicMappingForEClass, EefPackage.EEF_DYNAMIC_MAPPING_FOR__ITERATOR);
		createEAttribute(eefDynamicMappingForEClass, EefPackage.EEF_DYNAMIC_MAPPING_FOR__ITERABLE_EXPRESSION);
		createEAttribute(eefDynamicMappingForEClass, EefPackage.EEF_DYNAMIC_MAPPING_FOR__FORCE_REFRESH);
		createEReference(eefDynamicMappingForEClass, EefPackage.EEF_DYNAMIC_MAPPING_FOR__IFS);

		eefDynamicMappingIfEClass = createEClass(EefPackage.EEF_DYNAMIC_MAPPING_IF);
		createEAttribute(eefDynamicMappingIfEClass, EefPackage.EEF_DYNAMIC_MAPPING_IF__PREDICATE_EXPRESSION);
		createEReference(eefDynamicMappingIfEClass, EefPackage.EEF_DYNAMIC_MAPPING_IF__WIDGET);

		eefCustomWidgetDescriptionEClass = createEClass(EefPackage.EEF_CUSTOM_WIDGET_DESCRIPTION);
		createEReference(eefCustomWidgetDescriptionEClass, EefPackage.EEF_CUSTOM_WIDGET_DESCRIPTION__CUSTOM_EXPRESSIONS);
		createEReference(eefCustomWidgetDescriptionEClass, EefPackage.EEF_CUSTOM_WIDGET_DESCRIPTION__STYLE);
		createEReference(eefCustomWidgetDescriptionEClass, EefPackage.EEF_CUSTOM_WIDGET_DESCRIPTION__CONDITIONAL_STYLES);

		eefCustomExpressionEClass = createEClass(EefPackage.EEF_CUSTOM_EXPRESSION);
		createEAttribute(eefCustomExpressionEClass, EefPackage.EEF_CUSTOM_EXPRESSION__IDENTIFIER);
		createEAttribute(eefCustomExpressionEClass, EefPackage.EEF_CUSTOM_EXPRESSION__CUSTOM_EXPRESSION);

		eefListDescriptionEClass = createEClass(EefPackage.EEF_LIST_DESCRIPTION);
		createEAttribute(eefListDescriptionEClass, EefPackage.EEF_LIST_DESCRIPTION__VALUE_EXPRESSION);
		createEAttribute(eefListDescriptionEClass, EefPackage.EEF_LIST_DESCRIPTION__DISPLAY_EXPRESSION);
		createEAttribute(eefListDescriptionEClass, EefPackage.EEF_LIST_DESCRIPTION__ON_CLICK_EXPRESSION);
		createEReference(eefListDescriptionEClass, EefPackage.EEF_LIST_DESCRIPTION__ACTIONS);
		createEReference(eefListDescriptionEClass, EefPackage.EEF_LIST_DESCRIPTION__STYLE);
		createEReference(eefListDescriptionEClass, EefPackage.EEF_LIST_DESCRIPTION__CONDITIONAL_STYLES);

		eefWidgetStyleEClass = createEClass(EefPackage.EEF_WIDGET_STYLE);
		createEAttribute(eefWidgetStyleEClass, EefPackage.EEF_WIDGET_STYLE__LABEL_BACKGROUND_COLOR_EXPRESSION);
		createEAttribute(eefWidgetStyleEClass, EefPackage.EEF_WIDGET_STYLE__LABEL_FOREGROUND_COLOR_EXPRESSION);
		createEAttribute(eefWidgetStyleEClass, EefPackage.EEF_WIDGET_STYLE__LABEL_FONT_NAME_EXPRESSION);
		createEAttribute(eefWidgetStyleEClass, EefPackage.EEF_WIDGET_STYLE__LABEL_FONT_SIZE_EXPRESSION);
		createEAttribute(eefWidgetStyleEClass, EefPackage.EEF_WIDGET_STYLE__LABEL_FONT_STYLE_EXPRESSION);

		eefTextStyleEClass = createEClass(EefPackage.EEF_TEXT_STYLE);
		createEAttribute(eefTextStyleEClass, EefPackage.EEF_TEXT_STYLE__BACKGROUND_COLOR_EXPRESSION);
		createEAttribute(eefTextStyleEClass, EefPackage.EEF_TEXT_STYLE__FOREGROUND_COLOR_EXPRESSION);
		createEAttribute(eefTextStyleEClass, EefPackage.EEF_TEXT_STYLE__FONT_NAME_EXPRESSION);
		createEAttribute(eefTextStyleEClass, EefPackage.EEF_TEXT_STYLE__FONT_SIZE_EXPRESSION);
		createEAttribute(eefTextStyleEClass, EefPackage.EEF_TEXT_STYLE__FONT_STYLE_EXPRESSION);

		eefLabelStyleEClass = createEClass(EefPackage.EEF_LABEL_STYLE);
		createEAttribute(eefLabelStyleEClass, EefPackage.EEF_LABEL_STYLE__BACKGROUND_COLOR_EXPRESSION);
		createEAttribute(eefLabelStyleEClass, EefPackage.EEF_LABEL_STYLE__FOREGROUND_COLOR_EXPRESSION);
		createEAttribute(eefLabelStyleEClass, EefPackage.EEF_LABEL_STYLE__FONT_NAME_EXPRESSION);
		createEAttribute(eefLabelStyleEClass, EefPackage.EEF_LABEL_STYLE__FONT_SIZE_EXPRESSION);
		createEAttribute(eefLabelStyleEClass, EefPackage.EEF_LABEL_STYLE__FONT_STYLE_EXPRESSION);

		eefButtonStyleEClass = createEClass(EefPackage.EEF_BUTTON_STYLE);

		eefCheckboxStyleEClass = createEClass(EefPackage.EEF_CHECKBOX_STYLE);

		eefSelectStyleEClass = createEClass(EefPackage.EEF_SELECT_STYLE);

		eefRadioStyleEClass = createEClass(EefPackage.EEF_RADIO_STYLE);

		eefHyperlinkStyleEClass = createEClass(EefPackage.EEF_HYPERLINK_STYLE);
		createEAttribute(eefHyperlinkStyleEClass, EefPackage.EEF_HYPERLINK_STYLE__BACKGROUND_COLOR_EXPRESSION);
		createEAttribute(eefHyperlinkStyleEClass, EefPackage.EEF_HYPERLINK_STYLE__FONT_NAME_EXPRESSION);
		createEAttribute(eefHyperlinkStyleEClass, EefPackage.EEF_HYPERLINK_STYLE__FONT_SIZE_EXPRESSION);
		createEAttribute(eefHyperlinkStyleEClass, EefPackage.EEF_HYPERLINK_STYLE__FONT_STYLE_EXPRESSION);

		eefCustomWidgetStyleEClass = createEClass(EefPackage.EEF_CUSTOM_WIDGET_STYLE);

		eefListStyleEClass = createEClass(EefPackage.EEF_LIST_STYLE);

		eefGroupStyleEClass = createEClass(EefPackage.EEF_GROUP_STYLE);
		createEAttribute(eefGroupStyleEClass, EefPackage.EEF_GROUP_STYLE__BACKGROUND_COLOR_EXPRESSION);
		createEAttribute(eefGroupStyleEClass, EefPackage.EEF_GROUP_STYLE__FOREGROUND_COLOR_EXPRESSION);
		createEAttribute(eefGroupStyleEClass, EefPackage.EEF_GROUP_STYLE__FONT_NAME_EXPRESSION);
		createEAttribute(eefGroupStyleEClass, EefPackage.EEF_GROUP_STYLE__FONT_SIZE_EXPRESSION);
		createEAttribute(eefGroupStyleEClass, EefPackage.EEF_GROUP_STYLE__BAR_STYLE);
		createEAttribute(eefGroupStyleEClass, EefPackage.EEF_GROUP_STYLE__TOGGLE_STYLE);
		createEAttribute(eefGroupStyleEClass, EefPackage.EEF_GROUP_STYLE__EXPANDED_BY_DEFAULT);

		eefConditionalStyleEClass = createEClass(EefPackage.EEF_CONDITIONAL_STYLE);
		createEAttribute(eefConditionalStyleEClass, EefPackage.EEF_CONDITIONAL_STYLE__PRECONDITION_EXPRESSION);

		eefTextConditionalStyleEClass = createEClass(EefPackage.EEF_TEXT_CONDITIONAL_STYLE);
		createEReference(eefTextConditionalStyleEClass, EefPackage.EEF_TEXT_CONDITIONAL_STYLE__STYLE);

		eefButtonConditionalStyleEClass = createEClass(EefPackage.EEF_BUTTON_CONDITIONAL_STYLE);
		createEReference(eefButtonConditionalStyleEClass, EefPackage.EEF_BUTTON_CONDITIONAL_STYLE__STYLE);

		eefLabelConditionalStyleEClass = createEClass(EefPackage.EEF_LABEL_CONDITIONAL_STYLE);
		createEReference(eefLabelConditionalStyleEClass, EefPackage.EEF_LABEL_CONDITIONAL_STYLE__STYLE);

		eefCheckboxConditionalStyleEClass = createEClass(EefPackage.EEF_CHECKBOX_CONDITIONAL_STYLE);
		createEReference(eefCheckboxConditionalStyleEClass, EefPackage.EEF_CHECKBOX_CONDITIONAL_STYLE__STYLE);

		eefSelectConditionalStyleEClass = createEClass(EefPackage.EEF_SELECT_CONDITIONAL_STYLE);
		createEReference(eefSelectConditionalStyleEClass, EefPackage.EEF_SELECT_CONDITIONAL_STYLE__STYLE);

		eefRadioConditionalStyleEClass = createEClass(EefPackage.EEF_RADIO_CONDITIONAL_STYLE);
		createEReference(eefRadioConditionalStyleEClass, EefPackage.EEF_RADIO_CONDITIONAL_STYLE__STYLE);

		eefHyperlinkConditionalStyleEClass = createEClass(EefPackage.EEF_HYPERLINK_CONDITIONAL_STYLE);
		createEReference(eefHyperlinkConditionalStyleEClass, EefPackage.EEF_HYPERLINK_CONDITIONAL_STYLE__STYLE);

		eefCustomWidgetConditionalStyleEClass = createEClass(EefPackage.EEF_CUSTOM_WIDGET_CONDITIONAL_STYLE);
		createEReference(eefCustomWidgetConditionalStyleEClass, EefPackage.EEF_CUSTOM_WIDGET_CONDITIONAL_STYLE__STYLE);

		eefWidgetActionEClass = createEClass(EefPackage.EEF_WIDGET_ACTION);
		createEAttribute(eefWidgetActionEClass, EefPackage.EEF_WIDGET_ACTION__LABEL_EXPRESSION);
		createEAttribute(eefWidgetActionEClass, EefPackage.EEF_WIDGET_ACTION__IMAGE_EXPRESSION);
		createEAttribute(eefWidgetActionEClass, EefPackage.EEF_WIDGET_ACTION__ACTION_EXPRESSION);

		eefListConditionalStyleEClass = createEClass(EefPackage.EEF_LIST_CONDITIONAL_STYLE);
		createEReference(eefListConditionalStyleEClass, EefPackage.EEF_LIST_CONDITIONAL_STYLE__STYLE);

		eefGroupConditionalStyleEClass = createEClass(EefPackage.EEF_GROUP_CONDITIONAL_STYLE);
		createEReference(eefGroupConditionalStyleEClass, EefPackage.EEF_GROUP_CONDITIONAL_STYLE__STYLE);

		// Create enums
		eeF_VALIDATION_SEVERITY_DESCRIPTIONEEnum = createEEnum(EefPackage.EEF_VALIDATION_SEVERITY_DESCRIPTION);
		eeF_FILL_LAYOUT_ORIENTATIONEEnum = createEEnum(EefPackage.EEF_FILL_LAYOUT_ORIENTATION);
		eeF_TOGGLE_STYLEEEnum = createEEnum(EefPackage.EEF_TOGGLE_STYLE);
		eeF_TITLE_BAR_STYLEEEnum = createEEnum(EefPackage.EEF_TITLE_BAR_STYLE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This method is guarded to have no affect on any
	 * invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) {
			return;
		}
		isInitialized = true;

		// Initialize package
		setName(EefPackage.eNAME);
		setNsPrefix(EefPackage.eNS_PREFIX);
		setNsURI(EefPackage.eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		eefPropertyValidationRuleDescriptionEClass.getESuperTypes().add(this.getEEFValidationRuleDescription());
		eefSemanticValidationRuleDescriptionEClass.getESuperTypes().add(this.getEEFValidationRuleDescription());
		eefContainerDescriptionEClass.getESuperTypes().add(this.getEEFControlDescription());
		eefFillLayoutDescriptionEClass.getESuperTypes().add(this.getEEFLayoutDescription());
		eefGridLayoutDescriptionEClass.getESuperTypes().add(this.getEEFLayoutDescription());
		eefWidgetDescriptionEClass.getESuperTypes().add(this.getEEFControlDescription());
		eefTextDescriptionEClass.getESuperTypes().add(this.getEEFWidgetDescription());
		eefLabelDescriptionEClass.getESuperTypes().add(this.getEEFWidgetDescription());
		eefButtonDescriptionEClass.getESuperTypes().add(this.getEEFWidgetDescription());
		eefCheckboxDescriptionEClass.getESuperTypes().add(this.getEEFWidgetDescription());
		eefSelectDescriptionEClass.getESuperTypes().add(this.getEEFWidgetDescription());
		eefRadioDescriptionEClass.getESuperTypes().add(this.getEEFWidgetDescription());
		eefHyperlinkDescriptionEClass.getESuperTypes().add(this.getEEFWidgetDescription());
		eefDynamicMappingForEClass.getESuperTypes().add(this.getEEFControlDescription());
		eefCustomWidgetDescriptionEClass.getESuperTypes().add(this.getEEFWidgetDescription());
		eefListDescriptionEClass.getESuperTypes().add(this.getEEFWidgetDescription());
		eefTextStyleEClass.getESuperTypes().add(this.getEEFWidgetStyle());
		eefLabelStyleEClass.getESuperTypes().add(this.getEEFWidgetStyle());
		eefButtonStyleEClass.getESuperTypes().add(this.getEEFWidgetStyle());
		eefCheckboxStyleEClass.getESuperTypes().add(this.getEEFWidgetStyle());
		eefSelectStyleEClass.getESuperTypes().add(this.getEEFWidgetStyle());
		eefRadioStyleEClass.getESuperTypes().add(this.getEEFWidgetStyle());
		eefHyperlinkStyleEClass.getESuperTypes().add(this.getEEFWidgetStyle());
		eefCustomWidgetStyleEClass.getESuperTypes().add(this.getEEFWidgetStyle());
		eefListStyleEClass.getESuperTypes().add(this.getEEFWidgetStyle());
		eefTextConditionalStyleEClass.getESuperTypes().add(this.getEEFConditionalStyle());
		eefButtonConditionalStyleEClass.getESuperTypes().add(this.getEEFConditionalStyle());
		eefLabelConditionalStyleEClass.getESuperTypes().add(this.getEEFConditionalStyle());
		eefCheckboxConditionalStyleEClass.getESuperTypes().add(this.getEEFConditionalStyle());
		eefSelectConditionalStyleEClass.getESuperTypes().add(this.getEEFConditionalStyle());
		eefRadioConditionalStyleEClass.getESuperTypes().add(this.getEEFConditionalStyle());
		eefHyperlinkConditionalStyleEClass.getESuperTypes().add(this.getEEFConditionalStyle());
		eefCustomWidgetConditionalStyleEClass.getESuperTypes().add(this.getEEFConditionalStyle());
		eefListConditionalStyleEClass.getESuperTypes().add(this.getEEFConditionalStyle());
		eefGroupConditionalStyleEClass.getESuperTypes().add(this.getEEFConditionalStyle());

		// Initialize classes and features; add operations and parameters
		initEClass(eefViewDescriptionEClass, EEFViewDescription.class, "EEFViewDescription", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, //$NON-NLS-1$
				EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFViewDescription_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1, EEFViewDescription.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID,
				EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEAttribute(getEEFViewDescription_LabelExpression(), theEcorePackage.getEString(), "labelExpression", null, 0, 1, EEFViewDescription.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID,
				EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEAttribute(getEEFViewDescription_ImageExpression(), theEcorePackage.getEString(), "imageExpression", null, 0, 1, EEFViewDescription.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID,
				EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEReference(getEEFViewDescription_Groups(), this.getEEFGroupDescription(), null, "groups", null, 0, -1, EEFViewDescription.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, EPackageImpl.IS_COMPOSITE,
				EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED,
				EPackageImpl.IS_ORDERED);
		initEReference(getEEFViewDescription_Pages(), this.getEEFPageDescription(), null, "pages", null, 1, -1, EEFViewDescription.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, EPackageImpl.IS_COMPOSITE,
				EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED,
				EPackageImpl.IS_ORDERED);
		initEReference(getEEFViewDescription_EPackages(), ecorePackage.getEPackage(), null, "ePackages", null, 0, -1, EEFViewDescription.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_COMPOSITE,
				EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED,
				EPackageImpl.IS_ORDERED);

		initEClass(eefPageDescriptionEClass, EEFPageDescription.class, "EEFPageDescription", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, //$NON-NLS-1$
				EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFPageDescription_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1, EEFPageDescription.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID,
				EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEAttribute(getEEFPageDescription_LabelExpression(), ecorePackage.getEString(), "labelExpression", null, 0, 1, EEFPageDescription.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID,
				EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEAttribute(getEEFPageDescription_DomainClass(), ecorePackage.getEString(), "domainClass", null, 0, 1, EEFPageDescription.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID,
				EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEAttribute(getEEFPageDescription_SemanticCandidateExpression(), ecorePackage.getEString(), "semanticCandidateExpression", "", 0, 1, //$NON-NLS-1$//$NON-NLS-2$
				EEFPageDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEAttribute(getEEFPageDescription_PreconditionExpression(), theEcorePackage.getEString(), "preconditionExpression", null, 0, 1, //$NON-NLS-1$
				EEFPageDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEReference(getEEFPageDescription_Groups(), this.getEEFGroupDescription(), null, "groups", null, 0, -1, EEFPageDescription.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_COMPOSITE,
				EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED,
				EPackageImpl.IS_ORDERED);
		initEReference(getEEFPageDescription_SemanticValidationRules(), this.getEEFSemanticValidationRuleDescription(), null,
				"semanticValidationRules", null, 0, -1, EEFPageDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, //$NON-NLS-1$
				EPackageImpl.IS_CHANGEABLE, EPackageImpl.IS_COMPOSITE, EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED,
				EPackageImpl.IS_ORDERED);
		initEAttribute(getEEFPageDescription_Indented(), theEcorePackage.getEBoolean(), "indented", "false", 0, 1, EEFPageDescription.class, //$NON-NLS-1$//$NON-NLS-2$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID,
				EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEReference(getEEFPageDescription_Actions(), this.getEEFToolbarAction(), null, "actions", null, 0, -1, EEFPageDescription.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, EPackageImpl.IS_COMPOSITE,
				EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED,
				EPackageImpl.IS_ORDERED);

		initEClass(eefValidationRuleDescriptionEClass, EEFValidationRuleDescription.class, "EEFValidationRuleDescription", EPackageImpl.IS_ABSTRACT, //$NON-NLS-1$
				!EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFValidationRuleDescription_Severity(), this.getEEF_VALIDATION_SEVERITY_DESCRIPTION(), "severity", null, 1, 1, //$NON-NLS-1$
				EEFValidationRuleDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEAttribute(getEEFValidationRuleDescription_MessageExpression(), theEcorePackage.getEString(), "messageExpression", null, 0, 1, //$NON-NLS-1$
				EEFValidationRuleDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEReference(getEEFValidationRuleDescription_Audits(), this.getEEFRuleAuditDescription(), null, "audits", null, 0, -1, //$NON-NLS-1$
				EEFValidationRuleDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				EPackageImpl.IS_COMPOSITE, EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE,
				!EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEReference(getEEFValidationRuleDescription_Fixes(), this.getEEFValidationFixDescription(), null, "fixes", null, 0, -1, //$NON-NLS-1$
				EEFValidationRuleDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				EPackageImpl.IS_COMPOSITE, EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE,
				!EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);

		initEClass(eefRuleAuditDescriptionEClass, EEFRuleAuditDescription.class, "EEFRuleAuditDescription", !EPackageImpl.IS_ABSTRACT, //$NON-NLS-1$
				!EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFRuleAuditDescription_AuditExpression(), theEcorePackage.getEString(), "auditExpression", null, 1, 1, //$NON-NLS-1$
				EEFRuleAuditDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);

		initEClass(eefValidationFixDescriptionEClass, EEFValidationFixDescription.class, "EEFValidationFixDescription", !EPackageImpl.IS_ABSTRACT, //$NON-NLS-1$
				!EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFValidationFixDescription_Name(), theEcorePackage.getEString(), "name", null, 1, 1, EEFValidationFixDescription.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID,
				EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEAttribute(getEEFValidationFixDescription_FixExpression(), theEcorePackage.getEString(), "fixExpression", null, 1, 1, //$NON-NLS-1$
				EEFValidationFixDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);

		initEClass(eefPropertyValidationRuleDescriptionEClass, EEFPropertyValidationRuleDescription.class, "EEFPropertyValidationRuleDescription", //$NON-NLS-1$
				!EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEEFPropertyValidationRuleDescription_Targets(), this.getEEFWidgetDescription(),
				this.getEEFWidgetDescription_PropertyValidationRules(), "targets", null, 0, -1, EEFPropertyValidationRuleDescription.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_COMPOSITE,
				EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED,
				EPackageImpl.IS_ORDERED);

		initEClass(eefSemanticValidationRuleDescriptionEClass, EEFSemanticValidationRuleDescription.class, "EEFSemanticValidationRuleDescription", //$NON-NLS-1$
				!EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFSemanticValidationRuleDescription_TargetClass(), theEcorePackage.getEString(), "targetClass", null, 1, 1, //$NON-NLS-1$
				EEFSemanticValidationRuleDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);

		initEClass(eefGroupDescriptionEClass, EEFGroupDescription.class, "EEFGroupDescription", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, //$NON-NLS-1$
				EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFGroupDescription_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1, EEFGroupDescription.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID,
				EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEAttribute(getEEFGroupDescription_LabelExpression(), ecorePackage.getEString(), "labelExpression", null, 0, 1, EEFGroupDescription.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID,
				EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEAttribute(getEEFGroupDescription_DomainClass(), ecorePackage.getEString(), "domainClass", null, 0, 1, EEFGroupDescription.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID,
				EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEAttribute(getEEFGroupDescription_SemanticCandidateExpression(), ecorePackage.getEString(), "semanticCandidateExpression", null, 0, 1, //$NON-NLS-1$
				EEFGroupDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEAttribute(getEEFGroupDescription_PreconditionExpression(), theEcorePackage.getEString(), "preconditionExpression", null, 0, 1, //$NON-NLS-1$
				EEFGroupDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEReference(getEEFGroupDescription_Controls(), this.getEEFControlDescription(), null, "controls", null, 1, -1, EEFGroupDescription.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, EPackageImpl.IS_COMPOSITE,
				EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED,
				EPackageImpl.IS_ORDERED);
		initEReference(getEEFGroupDescription_SemanticValidationRules(), this.getEEFSemanticValidationRuleDescription(), null,
				"semanticValidationRules", null, 0, -1, EEFGroupDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, //$NON-NLS-1$
				EPackageImpl.IS_CHANGEABLE, EPackageImpl.IS_COMPOSITE, EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED,
				EPackageImpl.IS_ORDERED);
		initEReference(getEEFGroupDescription_PropertyValidationRules(), this.getEEFPropertyValidationRuleDescription(), null,
				"propertyValidationRules", null, 0, -1, EEFGroupDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, //$NON-NLS-1$
				EPackageImpl.IS_CHANGEABLE, EPackageImpl.IS_COMPOSITE, EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED,
				EPackageImpl.IS_ORDERED);
		initEReference(getEEFGroupDescription_Style(), this.getEEFGroupStyle(), null, "style", null, 0, 1, EEFGroupDescription.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, EPackageImpl.IS_COMPOSITE, EPackageImpl.IS_RESOLVE_PROXIES,
				!EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEReference(getEEFGroupDescription_ConditionalStyles(), this.getEEFGroupConditionalStyle(), null, "conditionalStyles", null, 0, -1, //$NON-NLS-1$
				EEFGroupDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				EPackageImpl.IS_COMPOSITE, EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE,
				!EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEReference(getEEFGroupDescription_Actions(), this.getEEFToolbarAction(), null, "actions", null, 0, -1, EEFGroupDescription.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, EPackageImpl.IS_COMPOSITE,
				EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED,
				EPackageImpl.IS_ORDERED);

		initEClass(eefToolbarActionEClass, EEFToolbarAction.class, "EEFToolbarAction", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, //$NON-NLS-1$
				EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFToolbarAction_TooltipExpression(), ecorePackage.getEString(), "tooltipExpression", null, 0, 1, EEFToolbarAction.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID,
				EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEAttribute(getEEFToolbarAction_ImageExpression(), ecorePackage.getEString(), "imageExpression", null, 0, 1, EEFToolbarAction.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID,
				EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEAttribute(getEEFToolbarAction_ActionExpression(), ecorePackage.getEString(), "actionExpression", null, 0, 1, EEFToolbarAction.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID,
				EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);

		initEClass(eefControlDescriptionEClass, EEFControlDescription.class, "EEFControlDescription", EPackageImpl.IS_ABSTRACT, //$NON-NLS-1$
				!EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFControlDescription_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1, EEFControlDescription.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID,
				EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);

		initEClass(eefContainerDescriptionEClass, EEFContainerDescription.class, "EEFContainerDescription", !EPackageImpl.IS_ABSTRACT, //$NON-NLS-1$
				!EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEEFContainerDescription_Controls(), this.getEEFControlDescription(), null, "controls", null, 1, -1, //$NON-NLS-1$
				EEFContainerDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				EPackageImpl.IS_COMPOSITE, EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE,
				!EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEReference(getEEFContainerDescription_Layout(), this.getEEFLayoutDescription(), null, "layout", null, 0, 1, EEFContainerDescription.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, EPackageImpl.IS_COMPOSITE,
				EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED,
				EPackageImpl.IS_ORDERED);

		initEClass(eefLayoutDescriptionEClass, EEFLayoutDescription.class, "EEFLayoutDescription", EPackageImpl.IS_ABSTRACT, //$NON-NLS-1$
				!EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);

		initEClass(eefFillLayoutDescriptionEClass, EEFFillLayoutDescription.class, "EEFFillLayoutDescription", !EPackageImpl.IS_ABSTRACT, //$NON-NLS-1$
				!EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFFillLayoutDescription_Orientation(), this.getEEF_FILL_LAYOUT_ORIENTATION(), "orientation", "VERTICAL", 0, 1, //$NON-NLS-1$//$NON-NLS-2$
				EEFFillLayoutDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);

		initEClass(eefGridLayoutDescriptionEClass, EEFGridLayoutDescription.class, "EEFGridLayoutDescription", !EPackageImpl.IS_ABSTRACT, //$NON-NLS-1$
				!EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFGridLayoutDescription_NumberOfColumns(), theEcorePackage.getEInt(), "numberOfColumns", "1", 0, 1, //$NON-NLS-1$//$NON-NLS-2$
				EEFGridLayoutDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEAttribute(getEEFGridLayoutDescription_MakeColumnsWithEqualWidth(), theEcorePackage.getEBoolean(), "makeColumnsWithEqualWidth", "true", 0, //$NON-NLS-1$//$NON-NLS-2$
				1, EEFGridLayoutDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);

		initEClass(eefWidgetDescriptionEClass, EEFWidgetDescription.class, "EEFWidgetDescription", EPackageImpl.IS_ABSTRACT, //$NON-NLS-1$
				!EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFWidgetDescription_LabelExpression(), ecorePackage.getEString(), "labelExpression", null, 0, 1, //$NON-NLS-1$
				EEFWidgetDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEAttribute(getEEFWidgetDescription_HelpExpression(), ecorePackage.getEString(), "helpExpression", null, 0, 1, EEFWidgetDescription.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID,
				EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEAttribute(getEEFWidgetDescription_IsEnabledExpression(), ecorePackage.getEString(), "isEnabledExpression", null, 0, 1, //$NON-NLS-1$
				EEFWidgetDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEReference(getEEFWidgetDescription_PropertyValidationRules(), this.getEEFPropertyValidationRuleDescription(),
				this.getEEFPropertyValidationRuleDescription_Targets(), "propertyValidationRules", null, 0, -1, EEFWidgetDescription.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_COMPOSITE,
				EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED,
				EPackageImpl.IS_ORDERED);

		initEClass(eefTextDescriptionEClass, EEFTextDescription.class, "EEFTextDescription", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, //$NON-NLS-1$
				EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFTextDescription_ValueExpression(), theEcorePackage.getEString(), "valueExpression", null, 0, 1, EEFTextDescription.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID,
				EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEAttribute(getEEFTextDescription_EditExpression(), theEcorePackage.getEString(), "editExpression", null, 0, 1, EEFTextDescription.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID,
				EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEAttribute(getEEFTextDescription_LineCount(), ecorePackage.getEInt(), "lineCount", "1", 0, 1, EEFTextDescription.class, //$NON-NLS-1$//$NON-NLS-2$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE,
				!EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEReference(getEEFTextDescription_Style(), this.getEEFTextStyle(), null, "style", null, 0, 1, EEFTextDescription.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, EPackageImpl.IS_COMPOSITE, EPackageImpl.IS_RESOLVE_PROXIES,
				!EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEReference(getEEFTextDescription_ConditionalStyles(), this.getEEFTextConditionalStyle(), null, "conditionalStyles", null, 0, -1, //$NON-NLS-1$
				EEFTextDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				EPackageImpl.IS_COMPOSITE, EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE,
				!EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);

		initEClass(eefLabelDescriptionEClass, EEFLabelDescription.class, "EEFLabelDescription", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, //$NON-NLS-1$
				EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFLabelDescription_ValueExpression(), ecorePackage.getEString(), "valueExpression", null, 0, 1, EEFLabelDescription.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID,
				EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEAttribute(getEEFLabelDescription_DisplayExpression(), ecorePackage.getEString(), "displayExpression", null, 0, 1, //$NON-NLS-1$
				EEFLabelDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEReference(getEEFLabelDescription_Style(), this.getEEFLabelStyle(), null, "style", null, 0, 1, EEFLabelDescription.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, EPackageImpl.IS_COMPOSITE, EPackageImpl.IS_RESOLVE_PROXIES,
				!EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEReference(getEEFLabelDescription_ConditionalStyles(), this.getEEFLabelConditionalStyle(), null, "conditionalStyles", null, 0, -1, //$NON-NLS-1$
				EEFLabelDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				EPackageImpl.IS_COMPOSITE, EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE,
				!EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEReference(getEEFLabelDescription_Actions(), this.getEEFWidgetAction(), null, "actions", null, 0, -1, EEFLabelDescription.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, EPackageImpl.IS_COMPOSITE,
				EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED,
				EPackageImpl.IS_ORDERED);

		initEClass(eefButtonDescriptionEClass, EEFButtonDescription.class, "EEFButtonDescription", !EPackageImpl.IS_ABSTRACT, //$NON-NLS-1$
				!EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFButtonDescription_ButtonLabelExpression(), theEcorePackage.getEString(), "buttonLabelExpression", null, 0, 1, //$NON-NLS-1$
				EEFButtonDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEAttribute(getEEFButtonDescription_ImageExpression(), ecorePackage.getEString(), "imageExpression", null, 0, 1, //$NON-NLS-1$
				EEFButtonDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEAttribute(getEEFButtonDescription_PushExpression(), theEcorePackage.getEString(), "pushExpression", null, 0, 1, //$NON-NLS-1$
				EEFButtonDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEReference(getEEFButtonDescription_Style(), this.getEEFButtonStyle(), null, "style", null, 0, 1, EEFButtonDescription.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, EPackageImpl.IS_COMPOSITE,
				EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED,
				EPackageImpl.IS_ORDERED);
		initEReference(getEEFButtonDescription_ConditionalStyles(), this.getEEFButtonConditionalStyle(), null, "conditionalStyles", null, 0, -1, //$NON-NLS-1$
				EEFButtonDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				EPackageImpl.IS_COMPOSITE, EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE,
				!EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);

		initEClass(eefCheckboxDescriptionEClass, EEFCheckboxDescription.class, "EEFCheckboxDescription", !EPackageImpl.IS_ABSTRACT, //$NON-NLS-1$
				!EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFCheckboxDescription_ValueExpression(), theEcorePackage.getEString(), "valueExpression", null, 0, 1, //$NON-NLS-1$
				EEFCheckboxDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEAttribute(getEEFCheckboxDescription_EditExpression(), theEcorePackage.getEString(), "editExpression", null, 0, 1, //$NON-NLS-1$
				EEFCheckboxDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEReference(getEEFCheckboxDescription_Style(), this.getEEFCheckboxStyle(), null, "style", null, 0, 1, EEFCheckboxDescription.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, EPackageImpl.IS_COMPOSITE,
				EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED,
				EPackageImpl.IS_ORDERED);
		initEReference(getEEFCheckboxDescription_ConditionalStyles(), this.getEEFCheckboxConditionalStyle(), null, "conditionalStyles", null, 0, -1, //$NON-NLS-1$
				EEFCheckboxDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				EPackageImpl.IS_COMPOSITE, EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE,
				!EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);

		initEClass(eefSelectDescriptionEClass, EEFSelectDescription.class, "EEFSelectDescription", !EPackageImpl.IS_ABSTRACT, //$NON-NLS-1$
				!EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFSelectDescription_ValueExpression(), theEcorePackage.getEString(), "valueExpression", null, 0, 1, //$NON-NLS-1$
				EEFSelectDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEAttribute(getEEFSelectDescription_EditExpression(), theEcorePackage.getEString(), "editExpression", null, 0, 1, //$NON-NLS-1$
				EEFSelectDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEAttribute(getEEFSelectDescription_CandidatesExpression(), theEcorePackage.getEString(), "candidatesExpression", null, 0, 1, //$NON-NLS-1$
				EEFSelectDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEAttribute(getEEFSelectDescription_CandidateDisplayExpression(), theEcorePackage.getEString(), "candidateDisplayExpression", null, 0, 1, //$NON-NLS-1$
				EEFSelectDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEReference(getEEFSelectDescription_Style(), this.getEEFSelectStyle(), null, "style", null, 0, 1, EEFSelectDescription.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, EPackageImpl.IS_COMPOSITE,
				EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED,
				EPackageImpl.IS_ORDERED);
		initEReference(getEEFSelectDescription_ConditionalStyles(), this.getEEFSelectConditionalStyle(), null, "conditionalStyles", null, 0, -1, //$NON-NLS-1$
				EEFSelectDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				EPackageImpl.IS_COMPOSITE, EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE,
				!EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);

		initEClass(eefRadioDescriptionEClass, EEFRadioDescription.class, "EEFRadioDescription", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, //$NON-NLS-1$
				EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFRadioDescription_ValueExpression(), theEcorePackage.getEString(), "valueExpression", null, 0, 1, //$NON-NLS-1$
				EEFRadioDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEAttribute(getEEFRadioDescription_EditExpression(), theEcorePackage.getEString(), "editExpression", null, 0, 1, EEFRadioDescription.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID,
				EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEAttribute(getEEFRadioDescription_CandidatesExpression(), theEcorePackage.getEString(), "candidatesExpression", null, 0, 1, //$NON-NLS-1$
				EEFRadioDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEAttribute(getEEFRadioDescription_CandidateDisplayExpression(), theEcorePackage.getEString(), "candidateDisplayExpression", null, 0, 1, //$NON-NLS-1$
				EEFRadioDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEReference(getEEFRadioDescription_Style(), this.getEEFRadioStyle(), null, "style", null, 0, 1, EEFRadioDescription.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, EPackageImpl.IS_COMPOSITE, EPackageImpl.IS_RESOLVE_PROXIES,
				!EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEAttribute(getEEFRadioDescription_NumberOfColumns(), theEcorePackage.getEInt(), "numberOfColumns", "-1", 0, 1, EEFRadioDescription.class, //$NON-NLS-1$//$NON-NLS-2$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID,
				EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEReference(getEEFRadioDescription_ConditionalStyles(), this.getEEFRadioConditionalStyle(), null, "conditionalStyles", null, 0, -1, //$NON-NLS-1$
				EEFRadioDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				EPackageImpl.IS_COMPOSITE, EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE,
				!EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);

		initEClass(eefHyperlinkDescriptionEClass, EEFHyperlinkDescription.class, "EEFHyperlinkDescription", !EPackageImpl.IS_ABSTRACT, //$NON-NLS-1$
				!EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFHyperlinkDescription_ValueExpression(), theEcorePackage.getEString(), "valueExpression", null, 0, 1, //$NON-NLS-1$
				EEFHyperlinkDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEAttribute(getEEFHyperlinkDescription_DisplayExpression(), ecorePackage.getEString(), "displayExpression", null, 0, 1, //$NON-NLS-1$
				EEFHyperlinkDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEAttribute(getEEFHyperlinkDescription_OnClickExpression(), theEcorePackage.getEString(), "onClickExpression", null, 0, 1, //$NON-NLS-1$
				EEFHyperlinkDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEReference(getEEFHyperlinkDescription_Style(), this.getEEFHyperlinkStyle(), null, "style", null, 0, 1, EEFHyperlinkDescription.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, EPackageImpl.IS_COMPOSITE,
				EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED,
				EPackageImpl.IS_ORDERED);
		initEReference(getEEFHyperlinkDescription_ConditionalStyles(), this.getEEFHyperlinkConditionalStyle(), null, "conditionalStyles", null, 0, -1, //$NON-NLS-1$
				EEFHyperlinkDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				EPackageImpl.IS_COMPOSITE, EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE,
				!EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEReference(getEEFHyperlinkDescription_Actions(), this.getEEFWidgetAction(), null, "actions", null, 0, -1, EEFHyperlinkDescription.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, EPackageImpl.IS_COMPOSITE,
				EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED,
				EPackageImpl.IS_ORDERED);

		initEClass(eefDynamicMappingForEClass, EEFDynamicMappingFor.class, "EEFDynamicMappingFor", !EPackageImpl.IS_ABSTRACT, //$NON-NLS-1$
				!EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFDynamicMappingFor_Iterator(), theEcorePackage.getEString(), "iterator", null, 1, 1, EEFDynamicMappingFor.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID,
				EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEAttribute(getEEFDynamicMappingFor_IterableExpression(), theEcorePackage.getEString(), "iterableExpression", null, 1, 1, //$NON-NLS-1$
				EEFDynamicMappingFor.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEAttribute(getEEFDynamicMappingFor_ForceRefresh(), theEcorePackage.getEBoolean(), "forceRefresh", null, 1, 1, EEFDynamicMappingFor.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID,
				EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEReference(getEEFDynamicMappingFor_Ifs(), this.getEEFDynamicMappingIf(), null, "ifs", null, 1, -1, EEFDynamicMappingFor.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, EPackageImpl.IS_COMPOSITE,
				EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED,
				EPackageImpl.IS_ORDERED);

		initEClass(eefDynamicMappingIfEClass, EEFDynamicMappingIf.class, "EEFDynamicMappingIf", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, //$NON-NLS-1$
				EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFDynamicMappingIf_PredicateExpression(), theEcorePackage.getEString(), "predicateExpression", null, 1, 1, //$NON-NLS-1$
				EEFDynamicMappingIf.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEReference(getEEFDynamicMappingIf_Widget(), this.getEEFWidgetDescription(), null, "widget", null, 1, 1, EEFDynamicMappingIf.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, EPackageImpl.IS_COMPOSITE,
				EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED,
				EPackageImpl.IS_ORDERED);

		initEClass(eefCustomWidgetDescriptionEClass, EEFCustomWidgetDescription.class, "EEFCustomWidgetDescription", !EPackageImpl.IS_ABSTRACT, //$NON-NLS-1$
				!EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEEFCustomWidgetDescription_CustomExpressions(), this.getEEFCustomExpression(), null, "customExpressions", null, 0, -1, //$NON-NLS-1$
				EEFCustomWidgetDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				EPackageImpl.IS_COMPOSITE, EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE,
				!EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEReference(getEEFCustomWidgetDescription_Style(), this.getEEFCustomWidgetStyle(), null, "style", null, 0, 1, //$NON-NLS-1$
				EEFCustomWidgetDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				EPackageImpl.IS_COMPOSITE, EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE,
				!EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEReference(getEEFCustomWidgetDescription_ConditionalStyles(), this.getEEFCustomWidgetConditionalStyle(), null, "conditionalStyles", null, //$NON-NLS-1$
				0, -1, EEFCustomWidgetDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				EPackageImpl.IS_COMPOSITE, EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE,
				!EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);

		initEClass(eefCustomExpressionEClass, EEFCustomExpression.class, "EEFCustomExpression", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, //$NON-NLS-1$
				EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFCustomExpression_Identifier(), ecorePackage.getEString(), "identifier", null, 1, 1, EEFCustomExpression.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID,
				EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEAttribute(getEEFCustomExpression_CustomExpression(), ecorePackage.getEString(), "customExpression", null, 0, 1, //$NON-NLS-1$
				EEFCustomExpression.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);

		initEClass(eefListDescriptionEClass, EEFListDescription.class, "EEFListDescription", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, //$NON-NLS-1$
				EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFListDescription_ValueExpression(), theEcorePackage.getEString(), "valueExpression", null, 0, 1, EEFListDescription.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID,
				EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEAttribute(getEEFListDescription_DisplayExpression(), theEcorePackage.getEString(), "displayExpression", null, 0, 1, //$NON-NLS-1$
				EEFListDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEAttribute(getEEFListDescription_OnClickExpression(), theEcorePackage.getEString(), "onClickExpression", null, 0, 1, //$NON-NLS-1$
				EEFListDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEReference(getEEFListDescription_Actions(), this.getEEFWidgetAction(), null, "actions", null, 0, -1, EEFListDescription.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, EPackageImpl.IS_COMPOSITE,
				EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED,
				EPackageImpl.IS_ORDERED);
		initEReference(getEEFListDescription_Style(), this.getEEFListStyle(), null, "style", null, 0, 1, EEFListDescription.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, EPackageImpl.IS_COMPOSITE, EPackageImpl.IS_RESOLVE_PROXIES,
				!EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEReference(getEEFListDescription_ConditionalStyles(), this.getEEFListConditionalStyle(), null, "conditionalStyles", null, 0, -1, //$NON-NLS-1$
				EEFListDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				EPackageImpl.IS_COMPOSITE, EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE,
				!EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);

		initEClass(eefWidgetStyleEClass, EEFWidgetStyle.class, "EEFWidgetStyle", EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, //$NON-NLS-1$
				EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFWidgetStyle_LabelBackgroundColorExpression(), ecorePackage.getEString(), "labelBackgroundColorExpression", null, 0, 1, //$NON-NLS-1$
				EEFWidgetStyle.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE,
				!EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEAttribute(getEEFWidgetStyle_LabelForegroundColorExpression(), ecorePackage.getEString(), "labelForegroundColorExpression", null, 0, 1, //$NON-NLS-1$
				EEFWidgetStyle.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE,
				!EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEAttribute(getEEFWidgetStyle_LabelFontNameExpression(), ecorePackage.getEString(), "labelFontNameExpression", null, 0, 1, //$NON-NLS-1$
				EEFWidgetStyle.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE,
				!EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEAttribute(getEEFWidgetStyle_LabelFontSizeExpression(), ecorePackage.getEString(), "labelFontSizeExpression", null, 0, 1, //$NON-NLS-1$
				EEFWidgetStyle.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE,
				!EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEAttribute(getEEFWidgetStyle_LabelFontStyleExpression(), ecorePackage.getEString(), "labelFontStyleExpression", null, 0, 1, //$NON-NLS-1$
				EEFWidgetStyle.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE,
				!EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);

		initEClass(eefTextStyleEClass, EEFTextStyle.class, "EEFTextStyle", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, //$NON-NLS-1$
				EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFTextStyle_BackgroundColorExpression(), ecorePackage.getEString(), "backgroundColorExpression", null, 0, 1, //$NON-NLS-1$
				EEFTextStyle.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE,
				!EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEAttribute(getEEFTextStyle_ForegroundColorExpression(), ecorePackage.getEString(), "foregroundColorExpression", null, 0, 1, //$NON-NLS-1$
				EEFTextStyle.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE,
				!EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEAttribute(getEEFTextStyle_FontNameExpression(), ecorePackage.getEString(), "fontNameExpression", null, 0, 1, EEFTextStyle.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID,
				EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEAttribute(getEEFTextStyle_FontSizeExpression(), ecorePackage.getEString(), "fontSizeExpression", null, 0, 1, EEFTextStyle.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID,
				EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEAttribute(getEEFTextStyle_FontStyleExpression(), ecorePackage.getEString(), "fontStyleExpression", null, 0, 1, EEFTextStyle.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID,
				EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);

		initEClass(eefLabelStyleEClass, EEFLabelStyle.class, "EEFLabelStyle", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, //$NON-NLS-1$
				EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFLabelStyle_BackgroundColorExpression(), ecorePackage.getEString(), "backgroundColorExpression", null, 0, 1, //$NON-NLS-1$
				EEFLabelStyle.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE,
				!EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEAttribute(getEEFLabelStyle_ForegroundColorExpression(), ecorePackage.getEString(), "foregroundColorExpression", null, 0, 1, //$NON-NLS-1$
				EEFLabelStyle.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE,
				!EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEAttribute(getEEFLabelStyle_FontNameExpression(), ecorePackage.getEString(), "fontNameExpression", null, 0, 1, EEFLabelStyle.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID,
				EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEAttribute(getEEFLabelStyle_FontSizeExpression(), ecorePackage.getEString(), "fontSizeExpression", null, 0, 1, EEFLabelStyle.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID,
				EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEAttribute(getEEFLabelStyle_FontStyleExpression(), ecorePackage.getEString(), "fontStyleExpression", null, 0, 1, EEFLabelStyle.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID,
				EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);

		initEClass(eefButtonStyleEClass, EEFButtonStyle.class, "EEFButtonStyle", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, //$NON-NLS-1$
				EPackageImpl.IS_GENERATED_INSTANCE_CLASS);

		initEClass(eefCheckboxStyleEClass, EEFCheckboxStyle.class, "EEFCheckboxStyle", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, //$NON-NLS-1$
				EPackageImpl.IS_GENERATED_INSTANCE_CLASS);

		initEClass(eefSelectStyleEClass, EEFSelectStyle.class, "EEFSelectStyle", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, //$NON-NLS-1$
				EPackageImpl.IS_GENERATED_INSTANCE_CLASS);

		initEClass(eefRadioStyleEClass, EEFRadioStyle.class, "EEFRadioStyle", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, //$NON-NLS-1$
				EPackageImpl.IS_GENERATED_INSTANCE_CLASS);

		initEClass(eefHyperlinkStyleEClass, EEFHyperlinkStyle.class, "EEFHyperlinkStyle", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, //$NON-NLS-1$
				EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFHyperlinkStyle_BackgroundColorExpression(), ecorePackage.getEString(), "backgroundColorExpression", null, 0, 1, //$NON-NLS-1$
				EEFHyperlinkStyle.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEAttribute(getEEFHyperlinkStyle_FontNameExpression(), ecorePackage.getEString(), "fontNameExpression", null, 0, 1, //$NON-NLS-1$
				EEFHyperlinkStyle.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEAttribute(getEEFHyperlinkStyle_FontSizeExpression(), ecorePackage.getEString(), "fontSizeExpression", null, 0, 1, //$NON-NLS-1$
				EEFHyperlinkStyle.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEAttribute(getEEFHyperlinkStyle_FontStyleExpression(), ecorePackage.getEString(), "fontStyleExpression", null, 0, 1, //$NON-NLS-1$
				EEFHyperlinkStyle.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);

		initEClass(eefCustomWidgetStyleEClass, EEFCustomWidgetStyle.class, "EEFCustomWidgetStyle", !EPackageImpl.IS_ABSTRACT, //$NON-NLS-1$
				!EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);

		initEClass(eefListStyleEClass, EEFListStyle.class, "EEFListStyle", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, //$NON-NLS-1$
				EPackageImpl.IS_GENERATED_INSTANCE_CLASS);

		initEClass(eefGroupStyleEClass, EEFGroupStyle.class, "EEFGroupStyle", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, //$NON-NLS-1$
				EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFGroupStyle_BackgroundColorExpression(), ecorePackage.getEString(), "backgroundColorExpression", null, 0, 1, //$NON-NLS-1$
				EEFGroupStyle.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE,
				!EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEAttribute(getEEFGroupStyle_ForegroundColorExpression(), ecorePackage.getEString(), "foregroundColorExpression", null, 0, 1, //$NON-NLS-1$
				EEFGroupStyle.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE,
				!EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEAttribute(getEEFGroupStyle_FontNameExpression(), ecorePackage.getEString(), "fontNameExpression", null, 0, 1, EEFGroupStyle.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID,
				EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEAttribute(getEEFGroupStyle_FontSizeExpression(), ecorePackage.getEString(), "fontSizeExpression", null, 0, 1, EEFGroupStyle.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID,
				EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEAttribute(getEEFGroupStyle_BarStyle(), this.getEEF_TITLE_BAR_STYLE(), "barStyle", null, 0, 1, EEFGroupStyle.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE,
				!EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEAttribute(getEEFGroupStyle_ToggleStyle(), this.getEEF_TOGGLE_STYLE(), "toggleStyle", null, 0, 1, EEFGroupStyle.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE,
				!EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEAttribute(getEEFGroupStyle_ExpandedByDefault(), ecorePackage.getEBoolean(), "expandedByDefault", null, 0, 1, EEFGroupStyle.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID,
				EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);

		initEClass(eefConditionalStyleEClass, EEFConditionalStyle.class, "EEFConditionalStyle", EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, //$NON-NLS-1$
				EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFConditionalStyle_PreconditionExpression(), ecorePackage.getEString(), "preconditionExpression", null, 0, 1, //$NON-NLS-1$
				EEFConditionalStyle.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);

		initEClass(eefTextConditionalStyleEClass, EEFTextConditionalStyle.class, "EEFTextConditionalStyle", !EPackageImpl.IS_ABSTRACT, //$NON-NLS-1$
				!EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEEFTextConditionalStyle_Style(), this.getEEFTextStyle(), null, "style", null, 0, 1, EEFTextConditionalStyle.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, EPackageImpl.IS_COMPOSITE,
				EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED,
				EPackageImpl.IS_ORDERED);

		initEClass(eefButtonConditionalStyleEClass, EEFButtonConditionalStyle.class, "EEFButtonConditionalStyle", !EPackageImpl.IS_ABSTRACT, //$NON-NLS-1$
				!EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEEFButtonConditionalStyle_Style(), this.getEEFButtonStyle(), null, "style", null, 0, 1, EEFButtonConditionalStyle.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, EPackageImpl.IS_COMPOSITE,
				EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED,
				EPackageImpl.IS_ORDERED);

		initEClass(eefLabelConditionalStyleEClass, EEFLabelConditionalStyle.class, "EEFLabelConditionalStyle", !EPackageImpl.IS_ABSTRACT, //$NON-NLS-1$
				!EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEEFLabelConditionalStyle_Style(), this.getEEFLabelStyle(), null, "style", null, 0, 1, EEFLabelConditionalStyle.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, EPackageImpl.IS_COMPOSITE,
				EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED,
				EPackageImpl.IS_ORDERED);

		initEClass(eefCheckboxConditionalStyleEClass, EEFCheckboxConditionalStyle.class, "EEFCheckboxConditionalStyle", !EPackageImpl.IS_ABSTRACT, //$NON-NLS-1$
				!EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEEFCheckboxConditionalStyle_Style(), this.getEEFCheckboxStyle(), null, "style", null, 0, 1, //$NON-NLS-1$
				EEFCheckboxConditionalStyle.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				EPackageImpl.IS_COMPOSITE, EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE,
				!EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);

		initEClass(eefSelectConditionalStyleEClass, EEFSelectConditionalStyle.class, "EEFSelectConditionalStyle", !EPackageImpl.IS_ABSTRACT, //$NON-NLS-1$
				!EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEEFSelectConditionalStyle_Style(), this.getEEFSelectStyle(), null, "style", null, 0, 1, EEFSelectConditionalStyle.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, EPackageImpl.IS_COMPOSITE,
				EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED,
				EPackageImpl.IS_ORDERED);

		initEClass(eefRadioConditionalStyleEClass, EEFRadioConditionalStyle.class, "EEFRadioConditionalStyle", !EPackageImpl.IS_ABSTRACT, //$NON-NLS-1$
				!EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEEFRadioConditionalStyle_Style(), this.getEEFRadioStyle(), null, "style", null, 0, 1, EEFRadioConditionalStyle.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, EPackageImpl.IS_COMPOSITE,
				EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED,
				EPackageImpl.IS_ORDERED);

		initEClass(eefHyperlinkConditionalStyleEClass, EEFHyperlinkConditionalStyle.class, "EEFHyperlinkConditionalStyle", !EPackageImpl.IS_ABSTRACT, //$NON-NLS-1$
				!EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEEFHyperlinkConditionalStyle_Style(), this.getEEFHyperlinkStyle(), null, "style", null, 0, 1, //$NON-NLS-1$
				EEFHyperlinkConditionalStyle.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				EPackageImpl.IS_COMPOSITE, EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE,
				!EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);

		initEClass(eefCustomWidgetConditionalStyleEClass, EEFCustomWidgetConditionalStyle.class, "EEFCustomWidgetConditionalStyle", //$NON-NLS-1$
				!EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEEFCustomWidgetConditionalStyle_Style(), this.getEEFCustomWidgetStyle(), null, "style", null, 0, 1, //$NON-NLS-1$
				EEFCustomWidgetConditionalStyle.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				EPackageImpl.IS_COMPOSITE, EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE,
				!EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);

		initEClass(eefWidgetActionEClass, EEFWidgetAction.class, "EEFWidgetAction", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, //$NON-NLS-1$
				EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFWidgetAction_LabelExpression(), ecorePackage.getEString(), "labelExpression", null, 0, 1, EEFWidgetAction.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID,
				EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEAttribute(getEEFWidgetAction_ImageExpression(), ecorePackage.getEString(), "imageExpression", null, 0, 1, EEFWidgetAction.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID,
				EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEAttribute(getEEFWidgetAction_ActionExpression(), ecorePackage.getEString(), "actionExpression", null, 0, 1, EEFWidgetAction.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID,
				EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);

		initEClass(eefListConditionalStyleEClass, EEFListConditionalStyle.class, "EEFListConditionalStyle", !EPackageImpl.IS_ABSTRACT, //$NON-NLS-1$
				!EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEEFListConditionalStyle_Style(), this.getEEFListStyle(), null, "style", null, 0, 1, EEFListConditionalStyle.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, EPackageImpl.IS_COMPOSITE,
				EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED,
				EPackageImpl.IS_ORDERED);

		initEClass(eefGroupConditionalStyleEClass, EEFGroupConditionalStyle.class, "EEFGroupConditionalStyle", !EPackageImpl.IS_ABSTRACT, //$NON-NLS-1$
				!EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEEFGroupConditionalStyle_Style(), this.getEEFGroupStyle(), null, "style", null, 0, 1, EEFGroupConditionalStyle.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, EPackageImpl.IS_COMPOSITE,
				EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED,
				EPackageImpl.IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(eeF_VALIDATION_SEVERITY_DESCRIPTIONEEnum, org.eclipse.eef.EEF_VALIDATION_SEVERITY_DESCRIPTION.class,
				"EEF_VALIDATION_SEVERITY_DESCRIPTION"); //$NON-NLS-1$
		addEEnumLiteral(eeF_VALIDATION_SEVERITY_DESCRIPTIONEEnum, org.eclipse.eef.EEF_VALIDATION_SEVERITY_DESCRIPTION.INFO);
		addEEnumLiteral(eeF_VALIDATION_SEVERITY_DESCRIPTIONEEnum, org.eclipse.eef.EEF_VALIDATION_SEVERITY_DESCRIPTION.WARNING);
		addEEnumLiteral(eeF_VALIDATION_SEVERITY_DESCRIPTIONEEnum, org.eclipse.eef.EEF_VALIDATION_SEVERITY_DESCRIPTION.ERROR);

		initEEnum(eeF_FILL_LAYOUT_ORIENTATIONEEnum, org.eclipse.eef.EEF_FILL_LAYOUT_ORIENTATION.class, "EEF_FILL_LAYOUT_ORIENTATION"); //$NON-NLS-1$
		addEEnumLiteral(eeF_FILL_LAYOUT_ORIENTATIONEEnum, org.eclipse.eef.EEF_FILL_LAYOUT_ORIENTATION.VERTICAL);
		addEEnumLiteral(eeF_FILL_LAYOUT_ORIENTATIONEEnum, org.eclipse.eef.EEF_FILL_LAYOUT_ORIENTATION.HORIZONTAL);

		initEEnum(eeF_TOGGLE_STYLEEEnum, org.eclipse.eef.EEF_TOGGLE_STYLE.class, "EEF_TOGGLE_STYLE"); //$NON-NLS-1$
		addEEnumLiteral(eeF_TOGGLE_STYLEEEnum, org.eclipse.eef.EEF_TOGGLE_STYLE.TWISTIE);
		addEEnumLiteral(eeF_TOGGLE_STYLEEEnum, org.eclipse.eef.EEF_TOGGLE_STYLE.TREE_NODE);
		addEEnumLiteral(eeF_TOGGLE_STYLEEEnum, org.eclipse.eef.EEF_TOGGLE_STYLE.NONE);

		initEEnum(eeF_TITLE_BAR_STYLEEEnum, org.eclipse.eef.EEF_TITLE_BAR_STYLE.class, "EEF_TITLE_BAR_STYLE"); //$NON-NLS-1$
		addEEnumLiteral(eeF_TITLE_BAR_STYLEEEnum, org.eclipse.eef.EEF_TITLE_BAR_STYLE.TITLE_BAR);
		addEEnumLiteral(eeF_TITLE_BAR_STYLEEEnum, org.eclipse.eef.EEF_TITLE_BAR_STYLE.SHORT_TITLE_BAR);
		addEEnumLiteral(eeF_TITLE_BAR_STYLEEEnum, org.eclipse.eef.EEF_TITLE_BAR_STYLE.NO_TITLE);

		// Create resource
		createResource(EefPackage.eNS_URI);
	}

} // EefPackageImpl
