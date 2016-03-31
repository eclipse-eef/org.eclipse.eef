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
import org.eclipse.eef.EEFTextStyle;
import org.eclipse.eef.EEFValidationFixDescription;
import org.eclipse.eef.EEFValidationRuleDescription;
import org.eclipse.eef.EEFViewDescription;
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
	private EClass eefContainerDescriptionEClass = null;

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
	private EEnum eeF_VALIDATION_SEVERITY_DESCRIPTIONEEnum = null;

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
		EefPackageImpl theEefPackage = (EefPackageImpl) (EPackage.Registry.INSTANCE.get(EefPackage.eNS_URI) instanceof EefPackageImpl ? EPackage.Registry.INSTANCE
				.get(EefPackage.eNS_URI) : new EefPackageImpl());

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
	public EReference getEEFViewDescription_Groups() {
		return (EReference) eefViewDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getEEFViewDescription_Pages() {
		return (EReference) eefViewDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getEEFViewDescription_EPackages() {
		return (EReference) eefViewDescriptionEClass.getEStructuralFeatures().get(4);
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
	public EReference getEEFPageDescription_Groups() {
		return (EReference) eefPageDescriptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getEEFPageDescription_SemanticValidationRules() {
		return (EReference) eefPageDescriptionEClass.getEStructuralFeatures().get(5);
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
	public EReference getEEFGroupDescription_Container() {
		return (EReference) eefGroupDescriptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getEEFGroupDescription_SemanticValidationRules() {
		return (EReference) eefGroupDescriptionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getEEFGroupDescription_PropertyValidationRules() {
		return (EReference) eefGroupDescriptionEClass.getEStructuralFeatures().get(6);
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
	public EAttribute getEEFContainerDescription_Identifier() {
		return (EAttribute) eefContainerDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getEEFContainerDescription_Widgets() {
		return (EReference) eefContainerDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getEEFContainerDescription_DynamicMappings() {
		return (EReference) eefContainerDescriptionEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getEEFWidgetDescription_Identifier() {
		return (EAttribute) eefWidgetDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getEEFWidgetDescription_LabelExpression() {
		return (EAttribute) eefWidgetDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getEEFWidgetDescription_HelpExpression() {
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
	public EReference getEEFWidgetDescription_LabelStyle() {
		return (EReference) eefWidgetDescriptionEClass.getEStructuralFeatures().get(4);
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
	public EClass getEEFLabelDescription() {
		return eefLabelDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getEEFLabelDescription_BodyExpression() {
		return (EAttribute) eefLabelDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getEEFLabelDescription_Style() {
		return (EReference) eefLabelDescriptionEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getEEFButtonDescription_PushExpression() {
		return (EAttribute) eefButtonDescriptionEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getEEFDynamicMappingFor_DomainClassExpression() {
		return (EAttribute) eefDynamicMappingForEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getEEFDynamicMappingFor_Ifs() {
		return (EReference) eefDynamicMappingForEClass.getEStructuralFeatures().get(2);
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
	public EClass getEEFWidgetStyle() {
		return eefWidgetStyleEClass;
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
	public EEnum getEEF_VALIDATION_SEVERITY_DESCRIPTION() {
		return eeF_VALIDATION_SEVERITY_DESCRIPTIONEEnum;
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
		createEReference(eefViewDescriptionEClass, EefPackage.EEF_VIEW_DESCRIPTION__GROUPS);
		createEReference(eefViewDescriptionEClass, EefPackage.EEF_VIEW_DESCRIPTION__PAGES);
		createEReference(eefViewDescriptionEClass, EefPackage.EEF_VIEW_DESCRIPTION__EPACKAGES);

		eefPageDescriptionEClass = createEClass(EefPackage.EEF_PAGE_DESCRIPTION);
		createEAttribute(eefPageDescriptionEClass, EefPackage.EEF_PAGE_DESCRIPTION__IDENTIFIER);
		createEAttribute(eefPageDescriptionEClass, EefPackage.EEF_PAGE_DESCRIPTION__LABEL_EXPRESSION);
		createEAttribute(eefPageDescriptionEClass, EefPackage.EEF_PAGE_DESCRIPTION__DOMAIN_CLASS);
		createEAttribute(eefPageDescriptionEClass, EefPackage.EEF_PAGE_DESCRIPTION__SEMANTIC_CANDIDATE_EXPRESSION);
		createEReference(eefPageDescriptionEClass, EefPackage.EEF_PAGE_DESCRIPTION__GROUPS);
		createEReference(eefPageDescriptionEClass, EefPackage.EEF_PAGE_DESCRIPTION__SEMANTIC_VALIDATION_RULES);

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
		createEReference(eefGroupDescriptionEClass, EefPackage.EEF_GROUP_DESCRIPTION__CONTAINER);
		createEReference(eefGroupDescriptionEClass, EefPackage.EEF_GROUP_DESCRIPTION__SEMANTIC_VALIDATION_RULES);
		createEReference(eefGroupDescriptionEClass, EefPackage.EEF_GROUP_DESCRIPTION__PROPERTY_VALIDATION_RULES);

		eefContainerDescriptionEClass = createEClass(EefPackage.EEF_CONTAINER_DESCRIPTION);
		createEAttribute(eefContainerDescriptionEClass, EefPackage.EEF_CONTAINER_DESCRIPTION__IDENTIFIER);
		createEReference(eefContainerDescriptionEClass, EefPackage.EEF_CONTAINER_DESCRIPTION__WIDGETS);
		createEReference(eefContainerDescriptionEClass, EefPackage.EEF_CONTAINER_DESCRIPTION__DYNAMIC_MAPPINGS);

		eefWidgetDescriptionEClass = createEClass(EefPackage.EEF_WIDGET_DESCRIPTION);
		createEAttribute(eefWidgetDescriptionEClass, EefPackage.EEF_WIDGET_DESCRIPTION__IDENTIFIER);
		createEAttribute(eefWidgetDescriptionEClass, EefPackage.EEF_WIDGET_DESCRIPTION__LABEL_EXPRESSION);
		createEAttribute(eefWidgetDescriptionEClass, EefPackage.EEF_WIDGET_DESCRIPTION__HELP_EXPRESSION);
		createEReference(eefWidgetDescriptionEClass, EefPackage.EEF_WIDGET_DESCRIPTION__PROPERTY_VALIDATION_RULES);
		createEReference(eefWidgetDescriptionEClass, EefPackage.EEF_WIDGET_DESCRIPTION__LABEL_STYLE);

		eefTextDescriptionEClass = createEClass(EefPackage.EEF_TEXT_DESCRIPTION);
		createEAttribute(eefTextDescriptionEClass, EefPackage.EEF_TEXT_DESCRIPTION__VALUE_EXPRESSION);
		createEAttribute(eefTextDescriptionEClass, EefPackage.EEF_TEXT_DESCRIPTION__EDIT_EXPRESSION);
		createEAttribute(eefTextDescriptionEClass, EefPackage.EEF_TEXT_DESCRIPTION__LINE_COUNT);
		createEReference(eefTextDescriptionEClass, EefPackage.EEF_TEXT_DESCRIPTION__STYLE);

		eefLabelDescriptionEClass = createEClass(EefPackage.EEF_LABEL_DESCRIPTION);
		createEAttribute(eefLabelDescriptionEClass, EefPackage.EEF_LABEL_DESCRIPTION__BODY_EXPRESSION);
		createEReference(eefLabelDescriptionEClass, EefPackage.EEF_LABEL_DESCRIPTION__STYLE);

		eefButtonDescriptionEClass = createEClass(EefPackage.EEF_BUTTON_DESCRIPTION);
		createEAttribute(eefButtonDescriptionEClass, EefPackage.EEF_BUTTON_DESCRIPTION__BUTTON_LABEL_EXPRESSION);
		createEAttribute(eefButtonDescriptionEClass, EefPackage.EEF_BUTTON_DESCRIPTION__PUSH_EXPRESSION);

		eefCheckboxDescriptionEClass = createEClass(EefPackage.EEF_CHECKBOX_DESCRIPTION);
		createEAttribute(eefCheckboxDescriptionEClass, EefPackage.EEF_CHECKBOX_DESCRIPTION__VALUE_EXPRESSION);
		createEAttribute(eefCheckboxDescriptionEClass, EefPackage.EEF_CHECKBOX_DESCRIPTION__EDIT_EXPRESSION);

		eefSelectDescriptionEClass = createEClass(EefPackage.EEF_SELECT_DESCRIPTION);
		createEAttribute(eefSelectDescriptionEClass, EefPackage.EEF_SELECT_DESCRIPTION__VALUE_EXPRESSION);
		createEAttribute(eefSelectDescriptionEClass, EefPackage.EEF_SELECT_DESCRIPTION__EDIT_EXPRESSION);
		createEAttribute(eefSelectDescriptionEClass, EefPackage.EEF_SELECT_DESCRIPTION__CANDIDATES_EXPRESSION);
		createEAttribute(eefSelectDescriptionEClass, EefPackage.EEF_SELECT_DESCRIPTION__CANDIDATE_DISPLAY_EXPRESSION);

		eefRadioDescriptionEClass = createEClass(EefPackage.EEF_RADIO_DESCRIPTION);
		createEAttribute(eefRadioDescriptionEClass, EefPackage.EEF_RADIO_DESCRIPTION__VALUE_EXPRESSION);
		createEAttribute(eefRadioDescriptionEClass, EefPackage.EEF_RADIO_DESCRIPTION__EDIT_EXPRESSION);
		createEAttribute(eefRadioDescriptionEClass, EefPackage.EEF_RADIO_DESCRIPTION__CANDIDATES_EXPRESSION);
		createEAttribute(eefRadioDescriptionEClass, EefPackage.EEF_RADIO_DESCRIPTION__CANDIDATE_DISPLAY_EXPRESSION);

		eefDynamicMappingForEClass = createEClass(EefPackage.EEF_DYNAMIC_MAPPING_FOR);
		createEAttribute(eefDynamicMappingForEClass, EefPackage.EEF_DYNAMIC_MAPPING_FOR__ITERATOR);
		createEAttribute(eefDynamicMappingForEClass, EefPackage.EEF_DYNAMIC_MAPPING_FOR__DOMAIN_CLASS_EXPRESSION);
		createEReference(eefDynamicMappingForEClass, EefPackage.EEF_DYNAMIC_MAPPING_FOR__IFS);

		eefDynamicMappingIfEClass = createEClass(EefPackage.EEF_DYNAMIC_MAPPING_IF);
		createEAttribute(eefDynamicMappingIfEClass, EefPackage.EEF_DYNAMIC_MAPPING_IF__PREDICATE_EXPRESSION);
		createEReference(eefDynamicMappingIfEClass, EefPackage.EEF_DYNAMIC_MAPPING_IF__WIDGET);

		eefCustomWidgetDescriptionEClass = createEClass(EefPackage.EEF_CUSTOM_WIDGET_DESCRIPTION);
		createEReference(eefCustomWidgetDescriptionEClass, EefPackage.EEF_CUSTOM_WIDGET_DESCRIPTION__CUSTOM_EXPRESSIONS);

		eefCustomExpressionEClass = createEClass(EefPackage.EEF_CUSTOM_EXPRESSION);
		createEAttribute(eefCustomExpressionEClass, EefPackage.EEF_CUSTOM_EXPRESSION__IDENTIFIER);
		createEAttribute(eefCustomExpressionEClass, EefPackage.EEF_CUSTOM_EXPRESSION__CUSTOM_EXPRESSION);

		eefWidgetStyleEClass = createEClass(EefPackage.EEF_WIDGET_STYLE);

		eefTextStyleEClass = createEClass(EefPackage.EEF_TEXT_STYLE);
		createEAttribute(eefTextStyleEClass, EefPackage.EEF_TEXT_STYLE__BACKGROUND_COLOR_EXPRESSION);
		createEAttribute(eefTextStyleEClass, EefPackage.EEF_TEXT_STYLE__FOREGROUND_COLOR_EXPRESSION);
		createEAttribute(eefTextStyleEClass, EefPackage.EEF_TEXT_STYLE__FONT_NAME_EXPRESSION);
		createEAttribute(eefTextStyleEClass, EefPackage.EEF_TEXT_STYLE__FONT_SIZE_EXPRESSION);
		createEAttribute(eefTextStyleEClass, EefPackage.EEF_TEXT_STYLE__FONT_STYLE_EXPRESSION);

		// Create enums
		eeF_VALIDATION_SEVERITY_DESCRIPTIONEEnum = createEEnum(EefPackage.EEF_VALIDATION_SEVERITY_DESCRIPTION);
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
		eefTextDescriptionEClass.getESuperTypes().add(this.getEEFWidgetDescription());
		eefLabelDescriptionEClass.getESuperTypes().add(this.getEEFWidgetDescription());
		eefButtonDescriptionEClass.getESuperTypes().add(this.getEEFWidgetDescription());
		eefCheckboxDescriptionEClass.getESuperTypes().add(this.getEEFWidgetDescription());
		eefSelectDescriptionEClass.getESuperTypes().add(this.getEEFWidgetDescription());
		eefRadioDescriptionEClass.getESuperTypes().add(this.getEEFWidgetDescription());
		eefCustomWidgetDescriptionEClass.getESuperTypes().add(this.getEEFWidgetDescription());
		eefTextStyleEClass.getESuperTypes().add(this.getEEFWidgetStyle());

		// Initialize classes and features; add operations and parameters
		initEClass(eefViewDescriptionEClass, EEFViewDescription.class,
				"EEFViewDescription", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getEEFViewDescription_Identifier(),
				ecorePackage.getEString(),
				"identifier", null, 1, 1, EEFViewDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getEEFViewDescription_LabelExpression(),
				theEcorePackage.getEString(),
				"labelExpression", null, 0, 1, EEFViewDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getEEFViewDescription_Groups(),
				this.getEEFGroupDescription(),
				null,
				"groups", null, 0, -1, EEFViewDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, EPackageImpl.IS_COMPOSITE, EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getEEFViewDescription_Pages(),
				this.getEEFPageDescription(),
				null,
				"pages", null, 1, -1, EEFViewDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, EPackageImpl.IS_COMPOSITE, EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getEEFViewDescription_EPackages(),
				theEcorePackage.getEPackage(),
				null,
				"ePackages", null, 0, -1, EEFViewDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_COMPOSITE, EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$

		initEClass(eefPageDescriptionEClass, EEFPageDescription.class,
				"EEFPageDescription", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getEEFPageDescription_Identifier(),
				ecorePackage.getEString(),
				"identifier", null, 1, 1, EEFPageDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getEEFPageDescription_LabelExpression(),
				ecorePackage.getEString(),
				"labelExpression", null, 0, 1, EEFPageDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getEEFPageDescription_DomainClass(),
				ecorePackage.getEString(),
				"domainClass", null, 0, 1, EEFPageDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getEEFPageDescription_SemanticCandidateExpression(),
				ecorePackage.getEString(),
				"semanticCandidateExpression", "", 0, 1, EEFPageDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(
				getEEFPageDescription_Groups(),
				this.getEEFGroupDescription(),
				null,
				"groups", null, 0, -1, EEFPageDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_COMPOSITE, EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getEEFPageDescription_SemanticValidationRules(),
				this.getEEFSemanticValidationRuleDescription(),
				null,
				"semanticValidationRules", null, 0, -1, EEFPageDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, EPackageImpl.IS_COMPOSITE, EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$

		initEClass(eefValidationRuleDescriptionEClass, EEFValidationRuleDescription.class,
				"EEFValidationRuleDescription", EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getEEFValidationRuleDescription_Severity(),
				this.getEEF_VALIDATION_SEVERITY_DESCRIPTION(),
				"severity", null, 1, 1, EEFValidationRuleDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getEEFValidationRuleDescription_MessageExpression(),
				theEcorePackage.getEString(),
				"messageExpression", null, 0, 1, EEFValidationRuleDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getEEFValidationRuleDescription_Audits(),
				this.getEEFRuleAuditDescription(),
				null,
				"audits", null, 0, -1, EEFValidationRuleDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, EPackageImpl.IS_COMPOSITE, EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getEEFValidationRuleDescription_Fixes(),
				this.getEEFValidationFixDescription(),
				null,
				"fixes", null, 0, -1, EEFValidationRuleDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, EPackageImpl.IS_COMPOSITE, EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$

		initEClass(eefRuleAuditDescriptionEClass, EEFRuleAuditDescription.class,
				"EEFRuleAuditDescription", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getEEFRuleAuditDescription_AuditExpression(),
				theEcorePackage.getEString(),
				"auditExpression", null, 1, 1, EEFRuleAuditDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$

		initEClass(eefValidationFixDescriptionEClass, EEFValidationFixDescription.class,
				"EEFValidationFixDescription", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getEEFValidationFixDescription_Name(),
				theEcorePackage.getEString(),
				"name", null, 1, 1, EEFValidationFixDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getEEFValidationFixDescription_FixExpression(),
				theEcorePackage.getEString(),
				"fixExpression", null, 1, 1, EEFValidationFixDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$

		initEClass(
				eefPropertyValidationRuleDescriptionEClass,
				EEFPropertyValidationRuleDescription.class,
				"EEFPropertyValidationRuleDescription", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getEEFPropertyValidationRuleDescription_Targets(),
				this.getEEFWidgetDescription(),
				this.getEEFWidgetDescription_PropertyValidationRules(),
				"targets", null, 0, -1, EEFPropertyValidationRuleDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_COMPOSITE, EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$

		initEClass(
				eefSemanticValidationRuleDescriptionEClass,
				EEFSemanticValidationRuleDescription.class,
				"EEFSemanticValidationRuleDescription", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getEEFSemanticValidationRuleDescription_TargetClass(),
				theEcorePackage.getEString(),
				"targetClass", null, 1, 1, EEFSemanticValidationRuleDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$

		initEClass(eefGroupDescriptionEClass, EEFGroupDescription.class,
				"EEFGroupDescription", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getEEFGroupDescription_Identifier(),
				ecorePackage.getEString(),
				"identifier", null, 1, 1, EEFGroupDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getEEFGroupDescription_LabelExpression(),
				ecorePackage.getEString(),
				"labelExpression", null, 0, 1, EEFGroupDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getEEFGroupDescription_DomainClass(),
				ecorePackage.getEString(),
				"domainClass", null, 0, 1, EEFGroupDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getEEFGroupDescription_SemanticCandidateExpression(),
				ecorePackage.getEString(),
				"semanticCandidateExpression", null, 0, 1, EEFGroupDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getEEFGroupDescription_Container(),
				this.getEEFContainerDescription(),
				null,
				"container", null, 1, 1, EEFGroupDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, EPackageImpl.IS_COMPOSITE, EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getEEFGroupDescription_SemanticValidationRules(),
				this.getEEFSemanticValidationRuleDescription(),
				null,
				"semanticValidationRules", null, 0, -1, EEFGroupDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, EPackageImpl.IS_COMPOSITE, EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getEEFGroupDescription_PropertyValidationRules(),
				this.getEEFPropertyValidationRuleDescription(),
				null,
				"propertyValidationRules", null, 0, -1, EEFGroupDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, EPackageImpl.IS_COMPOSITE, EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$

		initEClass(eefContainerDescriptionEClass, EEFContainerDescription.class,
				"EEFContainerDescription", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getEEFContainerDescription_Identifier(),
				ecorePackage.getEString(),
				"identifier", null, 1, 1, EEFContainerDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getEEFContainerDescription_Widgets(),
				this.getEEFWidgetDescription(),
				null,
				"widgets", null, 1, -1, EEFContainerDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, EPackageImpl.IS_COMPOSITE, EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getEEFContainerDescription_DynamicMappings(),
				this.getEEFDynamicMappingFor(),
				null,
				"dynamicMappings", null, 0, -1, EEFContainerDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, EPackageImpl.IS_COMPOSITE, EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$

		initEClass(eefWidgetDescriptionEClass, EEFWidgetDescription.class,
				"EEFWidgetDescription", EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getEEFWidgetDescription_Identifier(),
				ecorePackage.getEString(),
				"identifier", null, 1, 1, EEFWidgetDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getEEFWidgetDescription_LabelExpression(),
				ecorePackage.getEString(),
				"labelExpression", null, 0, 1, EEFWidgetDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getEEFWidgetDescription_HelpExpression(),
				ecorePackage.getEString(),
				"helpExpression", null, 0, 1, EEFWidgetDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getEEFWidgetDescription_PropertyValidationRules(),
				this.getEEFPropertyValidationRuleDescription(),
				this.getEEFPropertyValidationRuleDescription_Targets(),
				"propertyValidationRules", null, 0, -1, EEFWidgetDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_COMPOSITE, EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getEEFWidgetDescription_LabelStyle(),
				this.getEEFTextStyle(),
				null,
				"labelStyle", null, 0, 1, EEFWidgetDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, EPackageImpl.IS_COMPOSITE, EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$

		initEClass(eefTextDescriptionEClass, EEFTextDescription.class,
				"EEFTextDescription", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getEEFTextDescription_ValueExpression(),
				theEcorePackage.getEString(),
				"valueExpression", null, 0, 1, EEFTextDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getEEFTextDescription_EditExpression(),
				theEcorePackage.getEString(),
				"editExpression", null, 0, 1, EEFTextDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getEEFTextDescription_LineCount(),
				ecorePackage.getEInt(),
				"lineCount", "1", 0, 1, EEFTextDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(
				getEEFTextDescription_Style(),
				this.getEEFTextStyle(),
				null,
				"style", null, 0, 1, EEFTextDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, EPackageImpl.IS_COMPOSITE, EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$

		initEClass(eefLabelDescriptionEClass, EEFLabelDescription.class,
				"EEFLabelDescription", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getEEFLabelDescription_BodyExpression(),
				ecorePackage.getEString(),
				"bodyExpression", null, 0, 1, EEFLabelDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getEEFLabelDescription_Style(),
				this.getEEFTextStyle(),
				null,
				"style", null, 0, 1, EEFLabelDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, EPackageImpl.IS_COMPOSITE, EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$

		initEClass(eefButtonDescriptionEClass, EEFButtonDescription.class,
				"EEFButtonDescription", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getEEFButtonDescription_ButtonLabelExpression(),
				theEcorePackage.getEString(),
				"buttonLabelExpression", null, 0, 1, EEFButtonDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getEEFButtonDescription_PushExpression(),
				theEcorePackage.getEString(),
				"pushExpression", null, 0, 1, EEFButtonDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$

		initEClass(eefCheckboxDescriptionEClass, EEFCheckboxDescription.class,
				"EEFCheckboxDescription", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getEEFCheckboxDescription_ValueExpression(),
				theEcorePackage.getEString(),
				"valueExpression", null, 0, 1, EEFCheckboxDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getEEFCheckboxDescription_EditExpression(),
				theEcorePackage.getEString(),
				"editExpression", null, 0, 1, EEFCheckboxDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$

		initEClass(eefSelectDescriptionEClass, EEFSelectDescription.class,
				"EEFSelectDescription", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getEEFSelectDescription_ValueExpression(),
				theEcorePackage.getEString(),
				"valueExpression", null, 0, 1, EEFSelectDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getEEFSelectDescription_EditExpression(),
				theEcorePackage.getEString(),
				"editExpression", null, 0, 1, EEFSelectDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getEEFSelectDescription_CandidatesExpression(),
				theEcorePackage.getEString(),
				"candidatesExpression", null, 0, 1, EEFSelectDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getEEFSelectDescription_CandidateDisplayExpression(),
				theEcorePackage.getEString(),
				"candidateDisplayExpression", null, 0, 1, EEFSelectDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$

		initEClass(eefRadioDescriptionEClass, EEFRadioDescription.class,
				"EEFRadioDescription", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getEEFRadioDescription_ValueExpression(),
				theEcorePackage.getEString(),
				"valueExpression", null, 0, 1, EEFRadioDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getEEFRadioDescription_EditExpression(),
				theEcorePackage.getEString(),
				"editExpression", null, 0, 1, EEFRadioDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getEEFRadioDescription_CandidatesExpression(),
				theEcorePackage.getEString(),
				"candidatesExpression", null, 0, 1, EEFRadioDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getEEFRadioDescription_CandidateDisplayExpression(),
				theEcorePackage.getEString(),
				"candidateDisplayExpression", null, 0, 1, EEFRadioDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$

		initEClass(eefDynamicMappingForEClass, EEFDynamicMappingFor.class,
				"EEFDynamicMappingFor", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getEEFDynamicMappingFor_Iterator(),
				theEcorePackage.getEString(),
				"iterator", null, 1, 1, EEFDynamicMappingFor.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getEEFDynamicMappingFor_DomainClassExpression(),
				theEcorePackage.getEString(),
				"domainClassExpression", null, 1, 1, EEFDynamicMappingFor.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getEEFDynamicMappingFor_Ifs(),
				this.getEEFDynamicMappingIf(),
				null,
				"ifs", null, 1, -1, EEFDynamicMappingFor.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, EPackageImpl.IS_COMPOSITE, EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$

		initEClass(eefDynamicMappingIfEClass, EEFDynamicMappingIf.class,
				"EEFDynamicMappingIf", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getEEFDynamicMappingIf_PredicateExpression(),
				theEcorePackage.getEString(),
				"predicateExpression", null, 1, 1, EEFDynamicMappingIf.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getEEFDynamicMappingIf_Widget(),
				this.getEEFWidgetDescription(),
				null,
				"widget", null, 1, 1, EEFDynamicMappingIf.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, EPackageImpl.IS_COMPOSITE, EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$

		initEClass(eefCustomWidgetDescriptionEClass, EEFCustomWidgetDescription.class,
				"EEFCustomWidgetDescription", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getEEFCustomWidgetDescription_CustomExpressions(),
				this.getEEFCustomExpression(),
				null,
				"customExpressions", null, 0, -1, EEFCustomWidgetDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, EPackageImpl.IS_COMPOSITE, EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$

		initEClass(eefCustomExpressionEClass, EEFCustomExpression.class,
				"EEFCustomExpression", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getEEFCustomExpression_Identifier(),
				ecorePackage.getEString(),
				"identifier", null, 1, 1, EEFCustomExpression.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getEEFCustomExpression_CustomExpression(),
				ecorePackage.getEString(),
				"customExpression", null, 0, 1, EEFCustomExpression.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$

		initEClass(eefWidgetStyleEClass, EEFWidgetStyle.class,
				"EEFWidgetStyle", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(eefTextStyleEClass, EEFTextStyle.class,
				"EEFTextStyle", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getEEFTextStyle_BackgroundColorExpression(),
				ecorePackage.getEString(),
				"backgroundColorExpression", null, 0, 1, EEFTextStyle.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getEEFTextStyle_ForegroundColorExpression(),
				ecorePackage.getEString(),
				"foregroundColorExpression", null, 0, 1, EEFTextStyle.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getEEFTextStyle_FontNameExpression(),
				ecorePackage.getEString(),
				"fontNameExpression", null, 0, 1, EEFTextStyle.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getEEFTextStyle_FontSizeExpression(),
				ecorePackage.getEString(),
				"fontSizeExpression", null, 0, 1, EEFTextStyle.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getEEFTextStyle_FontStyleExpression(),
				ecorePackage.getEString(),
				"fontStyleExpression", null, 0, 1, EEFTextStyle.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$

		// Initialize enums and add enum literals
		initEEnum(eeF_VALIDATION_SEVERITY_DESCRIPTIONEEnum, org.eclipse.eef.EEF_VALIDATION_SEVERITY_DESCRIPTION.class,
				"EEF_VALIDATION_SEVERITY_DESCRIPTION"); //$NON-NLS-1$
		addEEnumLiteral(eeF_VALIDATION_SEVERITY_DESCRIPTIONEEnum, org.eclipse.eef.EEF_VALIDATION_SEVERITY_DESCRIPTION.INFO);
		addEEnumLiteral(eeF_VALIDATION_SEVERITY_DESCRIPTIONEEnum, org.eclipse.eef.EEF_VALIDATION_SEVERITY_DESCRIPTION.WARNING);
		addEEnumLiteral(eeF_VALIDATION_SEVERITY_DESCRIPTIONEEnum, org.eclipse.eef.EEF_VALIDATION_SEVERITY_DESCRIPTION.ERROR);

		// Create resource
		createResource(EefPackage.eNS_URI);
	}

} // EefPackageImpl
