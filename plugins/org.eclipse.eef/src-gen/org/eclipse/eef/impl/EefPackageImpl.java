/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef.impl;

import org.eclipse.eef.EEFAdapterFactoryTableStructureDescription;
import org.eclipse.eef.EEFAdapterFactoryTreeStructureDescription;
import org.eclipse.eef.EEFCellWidgetDescription;
import org.eclipse.eef.EEFCheckboxConditionalStyle;
import org.eclipse.eef.EEFCheckboxDescription;
import org.eclipse.eef.EEFCheckboxStyle;
import org.eclipse.eef.EEFCheckboxStyleCustomization;
import org.eclipse.eef.EEFColumnConditionalStyle;
import org.eclipse.eef.EEFColumnDescription;
import org.eclipse.eef.EEFColumnStyle;
import org.eclipse.eef.EEFColumnStyleCustomization;
import org.eclipse.eef.EEFConditionalStyle;
import org.eclipse.eef.EEFContainerDescription;
import org.eclipse.eef.EEFGroupConditionalStyle;
import org.eclipse.eef.EEFGroupDescription;
import org.eclipse.eef.EEFGroupStyle;
import org.eclipse.eef.EEFGroupStyleCustomization;
import org.eclipse.eef.EEFImageDescription;
import org.eclipse.eef.EEFImagePickerDescription;
import org.eclipse.eef.EEFInterpretedTableStructureDescription;
import org.eclipse.eef.EEFInterpretedTreeStructureDescription;
import org.eclipse.eef.EEFJavaExtensionDescription;
import org.eclipse.eef.EEFLabelConditionalStyle;
import org.eclipse.eef.EEFLabelDescription;
import org.eclipse.eef.EEFLabelStyle;
import org.eclipse.eef.EEFLabelStyleCustomization;
import org.eclipse.eef.EEFLineConditionalStyle;
import org.eclipse.eef.EEFLineDescription;
import org.eclipse.eef.EEFLineStyle;
import org.eclipse.eef.EEFLineStyleCustomization;
import org.eclipse.eef.EEFLinkConditionalStyle;
import org.eclipse.eef.EEFLinkDescription;
import org.eclipse.eef.EEFLinkStyle;
import org.eclipse.eef.EEFLinkStyleCustomization;
import org.eclipse.eef.EEFPageDescription;
import org.eclipse.eef.EEFQuickFix;
import org.eclipse.eef.EEFRadioConditionalStyle;
import org.eclipse.eef.EEFRadioDescription;
import org.eclipse.eef.EEFRadioStyle;
import org.eclipse.eef.EEFRadioStyleCustomization;
import org.eclipse.eef.EEFSelectConditionalStyle;
import org.eclipse.eef.EEFSelectDescription;
import org.eclipse.eef.EEFSelectStyle;
import org.eclipse.eef.EEFSelectStyleCustomization;
import org.eclipse.eef.EEFStyle;
import org.eclipse.eef.EEFStyleCustomization;
import org.eclipse.eef.EEFTableConditionalStyle;
import org.eclipse.eef.EEFTableDescription;
import org.eclipse.eef.EEFTableStructureDescription;
import org.eclipse.eef.EEFTableStyle;
import org.eclipse.eef.EEFTableStyleCustomization;
import org.eclipse.eef.EEFTextConditionalStyle;
import org.eclipse.eef.EEFTextDescription;
import org.eclipse.eef.EEFTextStyle;
import org.eclipse.eef.EEFTextStyleCustomization;
import org.eclipse.eef.EEFTreeConditionalStyle;
import org.eclipse.eef.EEFTreeDescription;
import org.eclipse.eef.EEFTreeDialogSelectDescription;
import org.eclipse.eef.EEFTreeStructureDescription;
import org.eclipse.eef.EEFTreeStyle;
import org.eclipse.eef.EEFTreeStyleCustomization;
import org.eclipse.eef.EEFValidation;
import org.eclipse.eef.EEFViewDescription;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.EefFactory;
import org.eclipse.eef.EefPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.sirius.expression.ExpressionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EefPackageImpl extends EPackageImpl implements EefPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefViewDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefPageDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefGroupDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefContainerDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefWidgetDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefJavaExtensionDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefTreeStructureDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefInterpretedTableStructureDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefCellWidgetDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefAdapterFactoryTreeStructureDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefInterpretedTreeStructureDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefTextDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefCheckboxDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefSelectDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefLabelDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefRadioDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefTreeDialogSelectDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefLinkDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefImageDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefTreeDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefImagePickerDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefTableDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefColumnDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefLineDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefTableStructureDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefAdapterFactoryTableStructureDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefConditionalStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefStyleCustomizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefGroupStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefGroupConditionalStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefGroupStyleCustomizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefTextStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefTextConditionalStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefTextStyleCustomizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefCheckboxStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefCheckboxConditionalStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefCheckboxStyleCustomizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefLabelStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefLabelConditionalStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefLabelStyleCustomizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefRadioStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefRadioConditionalStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefRadioStyleCustomizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefLinkStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefLinkConditionalStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefLinkStyleCustomizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefSelectStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefSelectConditionalStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefSelectStyleCustomizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefTreeStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefTreeConditionalStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefTreeStyleCustomizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefTableStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefTableConditionalStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefTableStyleCustomizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefLineStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefLineConditionalStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefLineStyleCustomizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefColumnStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefColumnConditionalStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefColumnStyleCustomizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefQuickFixEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefValidationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeNameEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.eef.EefPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EefPackageImpl() {
		super(eNS_URI, EefFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link EefPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EefPackage init() {
		if (isInited)
			return (EefPackage) EPackage.Registry.INSTANCE.getEPackage(EefPackage.eNS_URI);

		// Obtain or create and register package
		EefPackageImpl theEefPackage = (EefPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EefPackageImpl
				? EPackage.Registry.INSTANCE.get(eNS_URI) : new EefPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ExpressionPackage.eINSTANCE.eClass();

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEEFViewDescription() {
		return eefViewDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFViewDescription_Identifier() {
		return (EAttribute) eefViewDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFViewDescription_PreconditionExpression() {
		return (EAttribute) eefViewDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEEFViewDescription_UserDefinedVariables() {
		return (EReference) eefViewDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFViewDescription_LabelExpression() {
		return (EAttribute) eefViewDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFViewDescription_EPackageNsUris() {
		return (EAttribute) eefViewDescriptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEEFViewDescription_Groups() {
		return (EReference) eefViewDescriptionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEEFViewDescription_Pages() {
		return (EReference) eefViewDescriptionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEEFViewDescription_JavaExtensions() {
		return (EReference) eefViewDescriptionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEEFViewDescription_ImportedViews() {
		return (EReference) eefViewDescriptionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEEFViewDescription_TreeStructures() {
		return (EReference) eefViewDescriptionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEEFViewDescription_TableStructures() {
		return (EReference) eefViewDescriptionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEEFViewDescription_StyleCustomizations() {
		return (EReference) eefViewDescriptionEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEEFPageDescription() {
		return eefPageDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFPageDescription_Identifier() {
		return (EAttribute) eefPageDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFPageDescription_PreconditionExpression() {
		return (EAttribute) eefPageDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEEFPageDescription_UserDefinedVariables() {
		return (EReference) eefPageDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFPageDescription_LabelExpression() {
		return (EAttribute) eefPageDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFPageDescription_DomainClass() {
		return (EAttribute) eefPageDescriptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFPageDescription_SemanticCandidateExpression() {
		return (EAttribute) eefPageDescriptionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEEFPageDescription_Groups() {
		return (EReference) eefPageDescriptionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEEFPageDescription_ExtendedPage() {
		return (EReference) eefPageDescriptionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEEFGroupDescription() {
		return eefGroupDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFGroupDescription_Identifier() {
		return (EAttribute) eefGroupDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFGroupDescription_PreconditionExpression() {
		return (EAttribute) eefGroupDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEEFGroupDescription_UserDefinedVariables() {
		return (EReference) eefGroupDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFGroupDescription_LabelExpression() {
		return (EAttribute) eefGroupDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFGroupDescription_DomainClass() {
		return (EAttribute) eefGroupDescriptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFGroupDescription_SemanticCandidateExpression() {
		return (EAttribute) eefGroupDescriptionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEEFGroupDescription_Container() {
		return (EReference) eefGroupDescriptionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFGroupDescription_CollapsibleExpression() {
		return (EAttribute) eefGroupDescriptionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFGroupDescription_CollapsedByDefaultExpression() {
		return (EAttribute) eefGroupDescriptionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEEFGroupDescription_Validation() {
		return (EReference) eefGroupDescriptionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEEFContainerDescription() {
		return eefContainerDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFContainerDescription_Identifier() {
		return (EAttribute) eefContainerDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFContainerDescription_PreconditionExpression() {
		return (EAttribute) eefContainerDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEEFContainerDescription_UserDefinedVariables() {
		return (EReference) eefContainerDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFContainerDescription_SemanticCandidateExpression() {
		return (EAttribute) eefContainerDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFContainerDescription_DomainClass() {
		return (EAttribute) eefContainerDescriptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFContainerDescription_LayoutColumnCount() {
		return (EAttribute) eefContainerDescriptionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEEFContainerDescription_Containers() {
		return (EReference) eefContainerDescriptionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEEFContainerDescription_Widgets() {
		return (EReference) eefContainerDescriptionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEEFWidgetDescription() {
		return eefWidgetDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFWidgetDescription_Identifier() {
		return (EAttribute) eefWidgetDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFWidgetDescription_PreconditionExpression() {
		return (EAttribute) eefWidgetDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEEFWidgetDescription_UserDefinedVariables() {
		return (EReference) eefWidgetDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFWidgetDescription_LabelExpression() {
		return (EAttribute) eefWidgetDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEEFWidgetDescription_LabelStyle() {
		return (EReference) eefWidgetDescriptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFWidgetDescription_TooltipExpression() {
		return (EAttribute) eefWidgetDescriptionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFWidgetDescription_HelpExpression() {
		return (EAttribute) eefWidgetDescriptionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEEFWidgetDescription_Validation() {
		return (EReference) eefWidgetDescriptionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEEFJavaExtensionDescription() {
		return eefJavaExtensionDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFJavaExtensionDescription_QualifiedName() {
		return (EAttribute) eefJavaExtensionDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEEFTreeStructureDescription() {
		return eefTreeStructureDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFTreeStructureDescription_Identifier() {
		return (EAttribute) eefTreeStructureDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFTreeStructureDescription_Multiple() {
		return (EAttribute) eefTreeStructureDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEEFInterpretedTableStructureDescription() {
		return eefInterpretedTableStructureDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEEFInterpretedTableStructureDescription_Columns() {
		return (EReference) eefInterpretedTableStructureDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEEFInterpretedTableStructureDescription_Line() {
		return (EReference) eefInterpretedTableStructureDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEEFCellWidgetDescription() {
		return eefCellWidgetDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEEFAdapterFactoryTreeStructureDescription() {
		return eefAdapterFactoryTreeStructureDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFAdapterFactoryTreeStructureDescription_AdapterFactoryProvider() {
		return (EAttribute) eefAdapterFactoryTreeStructureDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEEFInterpretedTreeStructureDescription() {
		return eefInterpretedTreeStructureDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFInterpretedTreeStructureDescription_RootsExpression() {
		return (EAttribute) eefInterpretedTreeStructureDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFInterpretedTreeStructureDescription_ChildrenExpression() {
		return (EAttribute) eefInterpretedTreeStructureDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFInterpretedTreeStructureDescription_SelectablePredicateExpression() {
		return (EAttribute) eefInterpretedTreeStructureDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFInterpretedTreeStructureDescription_CandidateDisplayExpression() {
		return (EAttribute) eefInterpretedTreeStructureDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEEFTextDescription() {
		return eefTextDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFTextDescription_ValueExpression() {
		return (EAttribute) eefTextDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFTextDescription_EditExpression() {
		return (EAttribute) eefTextDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFTextDescription_ReadOnlyExpression() {
		return (EAttribute) eefTextDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFTextDescription_ContentAssistExpression() {
		return (EAttribute) eefTextDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFTextDescription_PlaceholderExpression() {
		return (EAttribute) eefTextDescriptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFTextDescription_LineCount() {
		return (EAttribute) eefTextDescriptionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEEFTextDescription_Style() {
		return (EReference) eefTextDescriptionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEEFTextDescription_ConditionalStyles() {
		return (EReference) eefTextDescriptionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEEFCheckboxDescription() {
		return eefCheckboxDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFCheckboxDescription_ValueExpression() {
		return (EAttribute) eefCheckboxDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFCheckboxDescription_EditExpression() {
		return (EAttribute) eefCheckboxDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEEFSelectDescription() {
		return eefSelectDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFSelectDescription_ValueExpression() {
		return (EAttribute) eefSelectDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFSelectDescription_EditExpression() {
		return (EAttribute) eefSelectDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFSelectDescription_CandidatesExpression() {
		return (EAttribute) eefSelectDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFSelectDescription_Multiple() {
		return (EAttribute) eefSelectDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFSelectDescription_CandidateDisplayExpression() {
		return (EAttribute) eefSelectDescriptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEEFLabelDescription() {
		return eefLabelDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFLabelDescription_ValueExpression() {
		return (EAttribute) eefLabelDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEEFRadioDescription() {
		return eefRadioDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFRadioDescription_ValueExpression() {
		return (EAttribute) eefRadioDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFRadioDescription_EditExpression() {
		return (EAttribute) eefRadioDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFRadioDescription_CandidatesExpression() {
		return (EAttribute) eefRadioDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFRadioDescription_CandidateDisplayExpression() {
		return (EAttribute) eefRadioDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEEFTreeDialogSelectDescription() {
		return eefTreeDialogSelectDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFTreeDialogSelectDescription_SemanticCandidateExpression() {
		return (EAttribute) eefTreeDialogSelectDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFTreeDialogSelectDescription_DefaultFilter() {
		return (EAttribute) eefTreeDialogSelectDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFTreeDialogSelectDescription_DomainClass() {
		return (EAttribute) eefTreeDialogSelectDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEEFTreeDialogSelectDescription_Tree() {
		return (EReference) eefTreeDialogSelectDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEEFLinkDescription() {
		return eefLinkDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFLinkDescription_OnClickExpression() {
		return (EAttribute) eefLinkDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEEFImageDescription() {
		return eefImageDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFImageDescription_ValueExpression() {
		return (EAttribute) eefImageDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEEFTreeDescription() {
		return eefTreeDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFTreeDescription_ValueExpression() {
		return (EAttribute) eefTreeDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEEFTreeDescription_TreeStructure() {
		return (EReference) eefTreeDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFTreeDescription_EditExpression() {
		return (EAttribute) eefTreeDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEEFImagePickerDescription() {
		return eefImagePickerDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFImagePickerDescription_ValueExpression() {
		return (EAttribute) eefImagePickerDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFImagePickerDescription_EditExpression() {
		return (EAttribute) eefImagePickerDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFImagePickerDescription_CandidatesExpression() {
		return (EAttribute) eefImagePickerDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEEFTableDescription() {
		return eefTableDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFTableDescription_ValueExpression() {
		return (EAttribute) eefTableDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFTableDescription_EditExpression() {
		return (EAttribute) eefTableDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEEFTableDescription_TableStructure() {
		return (EReference) eefTableDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEEFColumnDescription() {
		return eefColumnDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFColumnDescription_Width() {
		return (EAttribute) eefColumnDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFColumnDescription_HeaderExpression() {
		return (EAttribute) eefColumnDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEEFColumnDescription_CellWidget() {
		return (EReference) eefColumnDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEEFLineDescription() {
		return eefLineDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFLineDescription_HeaderExpression() {
		return (EAttribute) eefLineDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFLineDescription_SemanticCandidatesExpression() {
		return (EAttribute) eefLineDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFLineDescription_DomainClass() {
		return (EAttribute) eefLineDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEEFLineDescription_SubLines() {
		return (EReference) eefLineDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEEFTableStructureDescription() {
		return eefTableStructureDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFTableStructureDescription_Multiple() {
		return (EAttribute) eefTableStructureDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFTableStructureDescription_Identifier() {
		return (EAttribute) eefTableStructureDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFTableStructureDescription_AddExpression() {
		return (EAttribute) eefTableStructureDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFTableStructureDescription_RemoveExpression() {
		return (EAttribute) eefTableStructureDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFTableStructureDescription_UpExpression() {
		return (EAttribute) eefTableStructureDescriptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFTableStructureDescription_DownExpression() {
		return (EAttribute) eefTableStructureDescriptionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEEFAdapterFactoryTableStructureDescription() {
		return eefAdapterFactoryTableStructureDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFAdapterFactoryTableStructureDescription_AdapterFactoryProvider() {
		return (EAttribute) eefAdapterFactoryTableStructureDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEEFStyle() {
		return eefStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFStyle_FontExpression() {
		return (EAttribute) eefStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEEFConditionalStyle() {
		return eefConditionalStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFConditionalStyle_ConditionalExpression() {
		return (EAttribute) eefConditionalStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEEFStyleCustomization() {
		return eefStyleCustomizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEEFGroupStyle() {
		return eefGroupStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFGroupStyle_ForegroundColorExpression() {
		return (EAttribute) eefGroupStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEEFGroupConditionalStyle() {
		return eefGroupConditionalStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEEFGroupConditionalStyle_Style() {
		return (EReference) eefGroupConditionalStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEEFGroupStyleCustomization() {
		return eefGroupStyleCustomizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEEFGroupStyleCustomization_Style() {
		return (EReference) eefGroupStyleCustomizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEEFTextStyle() {
		return eefTextStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFTextStyle_BackgroundColorExpression() {
		return (EAttribute) eefTextStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFTextStyle_ForegroundColorExpression() {
		return (EAttribute) eefTextStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEEFTextConditionalStyle() {
		return eefTextConditionalStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEEFTextConditionalStyle_Style() {
		return (EReference) eefTextConditionalStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEEFTextStyleCustomization() {
		return eefTextStyleCustomizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEEFTextStyleCustomization_Style() {
		return (EReference) eefTextStyleCustomizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEEFCheckboxStyle() {
		return eefCheckboxStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFCheckboxStyle_BackgroundColorExpression() {
		return (EAttribute) eefCheckboxStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFCheckboxStyle_ForegroundColorExpression() {
		return (EAttribute) eefCheckboxStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEEFCheckboxConditionalStyle() {
		return eefCheckboxConditionalStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEEFCheckboxConditionalStyle_Style() {
		return (EReference) eefCheckboxConditionalStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEEFCheckboxStyleCustomization() {
		return eefCheckboxStyleCustomizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEEFCheckboxStyleCustomization_Style() {
		return (EReference) eefCheckboxStyleCustomizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEEFLabelStyle() {
		return eefLabelStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFLabelStyle_BackgroundColorExpression() {
		return (EAttribute) eefLabelStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFLabelStyle_ForegroundColorExpression() {
		return (EAttribute) eefLabelStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEEFLabelConditionalStyle() {
		return eefLabelConditionalStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEEFLabelConditionalStyle_Style() {
		return (EReference) eefLabelConditionalStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEEFLabelStyleCustomization() {
		return eefLabelStyleCustomizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEEFLabelStyleCustomization_Style() {
		return (EReference) eefLabelStyleCustomizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEEFRadioStyle() {
		return eefRadioStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFRadioStyle_BackgroundColorExpression() {
		return (EAttribute) eefRadioStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFRadioStyle_ForegroundColorExpression() {
		return (EAttribute) eefRadioStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEEFRadioConditionalStyle() {
		return eefRadioConditionalStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEEFRadioConditionalStyle_Style() {
		return (EReference) eefRadioConditionalStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEEFRadioStyleCustomization() {
		return eefRadioStyleCustomizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEEFRadioStyleCustomization_Style() {
		return (EReference) eefRadioStyleCustomizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEEFLinkStyle() {
		return eefLinkStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFLinkStyle_BackgroundColorExpression() {
		return (EAttribute) eefLinkStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFLinkStyle_ForegroundColorExpression() {
		return (EAttribute) eefLinkStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFLinkStyle_BackgroundImageExpression() {
		return (EAttribute) eefLinkStyleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEEFLinkConditionalStyle() {
		return eefLinkConditionalStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEEFLinkConditionalStyle_Style() {
		return (EReference) eefLinkConditionalStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEEFLinkStyleCustomization() {
		return eefLinkStyleCustomizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEEFLinkStyleCustomization_Style() {
		return (EReference) eefLinkStyleCustomizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEEFSelectStyle() {
		return eefSelectStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFSelectStyle_BackgroundColorExpression() {
		return (EAttribute) eefSelectStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFSelectStyle_ForegroundColorExpression() {
		return (EAttribute) eefSelectStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEEFSelectConditionalStyle() {
		return eefSelectConditionalStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEEFSelectConditionalStyle_Style() {
		return (EReference) eefSelectConditionalStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEEFSelectStyleCustomization() {
		return eefSelectStyleCustomizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEEFSelectStyleCustomization_Style() {
		return (EReference) eefSelectStyleCustomizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEEFTreeStyle() {
		return eefTreeStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEEFTreeConditionalStyle() {
		return eefTreeConditionalStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEEFTreeConditionalStyle_Style() {
		return (EReference) eefTreeConditionalStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEEFTreeStyleCustomization() {
		return eefTreeStyleCustomizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEEFTreeStyleCustomization_Style() {
		return (EReference) eefTreeStyleCustomizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEEFTableStyle() {
		return eefTableStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEEFTableConditionalStyle() {
		return eefTableConditionalStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEEFTableConditionalStyle_Style() {
		return (EReference) eefTableConditionalStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEEFTableStyleCustomization() {
		return eefTableStyleCustomizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEEFTableStyleCustomization_Style() {
		return (EReference) eefTableStyleCustomizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEEFLineStyle() {
		return eefLineStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFLineStyle_BackgroundColorExpression() {
		return (EAttribute) eefLineStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFLineStyle_ForegroundColorExpression() {
		return (EAttribute) eefLineStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFLineStyle_HeaderBackgroundColorExpression() {
		return (EAttribute) eefLineStyleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFLineStyle_HeaderForegroundColorExpression() {
		return (EAttribute) eefLineStyleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEEFLineConditionalStyle() {
		return eefLineConditionalStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEEFLineConditionalStyle_Style() {
		return (EReference) eefLineConditionalStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEEFLineStyleCustomization() {
		return eefLineStyleCustomizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEEFLineStyleCustomization_Style() {
		return (EReference) eefLineStyleCustomizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEEFColumnStyle() {
		return eefColumnStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFColumnStyle_BackgroundColorExpression() {
		return (EAttribute) eefColumnStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFColumnStyle_ForegroundColorExpression() {
		return (EAttribute) eefColumnStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFColumnStyle_HeaderBackgroundColorExpression() {
		return (EAttribute) eefColumnStyleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFColumnStyle_HeaderForegroundColorExpression() {
		return (EAttribute) eefColumnStyleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEEFColumnConditionalStyle() {
		return eefColumnConditionalStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEEFColumnConditionalStyle_Style() {
		return (EReference) eefColumnConditionalStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEEFColumnStyleCustomization() {
		return eefColumnStyleCustomizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEEFColumnStyleCustomization_Style() {
		return (EReference) eefColumnStyleCustomizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEEFQuickFix() {
		return eefQuickFixEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFQuickFix_TitleExpression() {
		return (EAttribute) eefQuickFixEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFQuickFix_MessageExpression() {
		return (EAttribute) eefQuickFixEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFQuickFix_CanHandleStatusExpression() {
		return (EAttribute) eefQuickFixEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFQuickFix_FixExpression() {
		return (EAttribute) eefQuickFixEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEEFValidation() {
		return eefValidationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFValidation_ValidationExpression() {
		return (EAttribute) eefValidationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEEFValidation_Quickfixes() {
		return (EReference) eefValidationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTypeName() {
		return typeNameEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EefFactory getEefFactory() {
		return (EefFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		eefViewDescriptionEClass = createEClass(EEF_VIEW_DESCRIPTION);
		createEAttribute(eefViewDescriptionEClass, EEF_VIEW_DESCRIPTION__IDENTIFIER);
		createEAttribute(eefViewDescriptionEClass, EEF_VIEW_DESCRIPTION__PRECONDITION_EXPRESSION);
		createEReference(eefViewDescriptionEClass, EEF_VIEW_DESCRIPTION__USER_DEFINED_VARIABLES);
		createEAttribute(eefViewDescriptionEClass, EEF_VIEW_DESCRIPTION__LABEL_EXPRESSION);
		createEAttribute(eefViewDescriptionEClass, EEF_VIEW_DESCRIPTION__EPACKAGE_NS_URIS);
		createEReference(eefViewDescriptionEClass, EEF_VIEW_DESCRIPTION__GROUPS);
		createEReference(eefViewDescriptionEClass, EEF_VIEW_DESCRIPTION__PAGES);
		createEReference(eefViewDescriptionEClass, EEF_VIEW_DESCRIPTION__JAVA_EXTENSIONS);
		createEReference(eefViewDescriptionEClass, EEF_VIEW_DESCRIPTION__IMPORTED_VIEWS);
		createEReference(eefViewDescriptionEClass, EEF_VIEW_DESCRIPTION__TREE_STRUCTURES);
		createEReference(eefViewDescriptionEClass, EEF_VIEW_DESCRIPTION__TABLE_STRUCTURES);
		createEReference(eefViewDescriptionEClass, EEF_VIEW_DESCRIPTION__STYLE_CUSTOMIZATIONS);

		eefPageDescriptionEClass = createEClass(EEF_PAGE_DESCRIPTION);
		createEAttribute(eefPageDescriptionEClass, EEF_PAGE_DESCRIPTION__IDENTIFIER);
		createEAttribute(eefPageDescriptionEClass, EEF_PAGE_DESCRIPTION__PRECONDITION_EXPRESSION);
		createEReference(eefPageDescriptionEClass, EEF_PAGE_DESCRIPTION__USER_DEFINED_VARIABLES);
		createEAttribute(eefPageDescriptionEClass, EEF_PAGE_DESCRIPTION__LABEL_EXPRESSION);
		createEAttribute(eefPageDescriptionEClass, EEF_PAGE_DESCRIPTION__DOMAIN_CLASS);
		createEAttribute(eefPageDescriptionEClass, EEF_PAGE_DESCRIPTION__SEMANTIC_CANDIDATE_EXPRESSION);
		createEReference(eefPageDescriptionEClass, EEF_PAGE_DESCRIPTION__GROUPS);
		createEReference(eefPageDescriptionEClass, EEF_PAGE_DESCRIPTION__EXTENDED_PAGE);

		eefGroupDescriptionEClass = createEClass(EEF_GROUP_DESCRIPTION);
		createEAttribute(eefGroupDescriptionEClass, EEF_GROUP_DESCRIPTION__IDENTIFIER);
		createEAttribute(eefGroupDescriptionEClass, EEF_GROUP_DESCRIPTION__PRECONDITION_EXPRESSION);
		createEReference(eefGroupDescriptionEClass, EEF_GROUP_DESCRIPTION__USER_DEFINED_VARIABLES);
		createEAttribute(eefGroupDescriptionEClass, EEF_GROUP_DESCRIPTION__LABEL_EXPRESSION);
		createEAttribute(eefGroupDescriptionEClass, EEF_GROUP_DESCRIPTION__DOMAIN_CLASS);
		createEAttribute(eefGroupDescriptionEClass, EEF_GROUP_DESCRIPTION__SEMANTIC_CANDIDATE_EXPRESSION);
		createEReference(eefGroupDescriptionEClass, EEF_GROUP_DESCRIPTION__CONTAINER);
		createEAttribute(eefGroupDescriptionEClass, EEF_GROUP_DESCRIPTION__COLLAPSIBLE_EXPRESSION);
		createEAttribute(eefGroupDescriptionEClass, EEF_GROUP_DESCRIPTION__COLLAPSED_BY_DEFAULT_EXPRESSION);
		createEReference(eefGroupDescriptionEClass, EEF_GROUP_DESCRIPTION__VALIDATION);

		eefContainerDescriptionEClass = createEClass(EEF_CONTAINER_DESCRIPTION);
		createEAttribute(eefContainerDescriptionEClass, EEF_CONTAINER_DESCRIPTION__IDENTIFIER);
		createEAttribute(eefContainerDescriptionEClass, EEF_CONTAINER_DESCRIPTION__PRECONDITION_EXPRESSION);
		createEReference(eefContainerDescriptionEClass, EEF_CONTAINER_DESCRIPTION__USER_DEFINED_VARIABLES);
		createEAttribute(eefContainerDescriptionEClass, EEF_CONTAINER_DESCRIPTION__SEMANTIC_CANDIDATE_EXPRESSION);
		createEAttribute(eefContainerDescriptionEClass, EEF_CONTAINER_DESCRIPTION__DOMAIN_CLASS);
		createEAttribute(eefContainerDescriptionEClass, EEF_CONTAINER_DESCRIPTION__LAYOUT_COLUMN_COUNT);
		createEReference(eefContainerDescriptionEClass, EEF_CONTAINER_DESCRIPTION__CONTAINERS);
		createEReference(eefContainerDescriptionEClass, EEF_CONTAINER_DESCRIPTION__WIDGETS);

		eefWidgetDescriptionEClass = createEClass(EEF_WIDGET_DESCRIPTION);
		createEAttribute(eefWidgetDescriptionEClass, EEF_WIDGET_DESCRIPTION__IDENTIFIER);
		createEAttribute(eefWidgetDescriptionEClass, EEF_WIDGET_DESCRIPTION__PRECONDITION_EXPRESSION);
		createEReference(eefWidgetDescriptionEClass, EEF_WIDGET_DESCRIPTION__USER_DEFINED_VARIABLES);
		createEAttribute(eefWidgetDescriptionEClass, EEF_WIDGET_DESCRIPTION__LABEL_EXPRESSION);
		createEReference(eefWidgetDescriptionEClass, EEF_WIDGET_DESCRIPTION__LABEL_STYLE);
		createEAttribute(eefWidgetDescriptionEClass, EEF_WIDGET_DESCRIPTION__TOOLTIP_EXPRESSION);
		createEAttribute(eefWidgetDescriptionEClass, EEF_WIDGET_DESCRIPTION__HELP_EXPRESSION);
		createEReference(eefWidgetDescriptionEClass, EEF_WIDGET_DESCRIPTION__VALIDATION);

		eefJavaExtensionDescriptionEClass = createEClass(EEF_JAVA_EXTENSION_DESCRIPTION);
		createEAttribute(eefJavaExtensionDescriptionEClass, EEF_JAVA_EXTENSION_DESCRIPTION__QUALIFIED_NAME);

		eefTreeStructureDescriptionEClass = createEClass(EEF_TREE_STRUCTURE_DESCRIPTION);
		createEAttribute(eefTreeStructureDescriptionEClass, EEF_TREE_STRUCTURE_DESCRIPTION__IDENTIFIER);
		createEAttribute(eefTreeStructureDescriptionEClass, EEF_TREE_STRUCTURE_DESCRIPTION__MULTIPLE);

		eefInterpretedTableStructureDescriptionEClass = createEClass(EEF_INTERPRETED_TABLE_STRUCTURE_DESCRIPTION);
		createEReference(eefInterpretedTableStructureDescriptionEClass, EEF_INTERPRETED_TABLE_STRUCTURE_DESCRIPTION__COLUMNS);
		createEReference(eefInterpretedTableStructureDescriptionEClass, EEF_INTERPRETED_TABLE_STRUCTURE_DESCRIPTION__LINE);

		eefCellWidgetDescriptionEClass = createEClass(EEF_CELL_WIDGET_DESCRIPTION);

		eefAdapterFactoryTreeStructureDescriptionEClass = createEClass(EEF_ADAPTER_FACTORY_TREE_STRUCTURE_DESCRIPTION);
		createEAttribute(eefAdapterFactoryTreeStructureDescriptionEClass, EEF_ADAPTER_FACTORY_TREE_STRUCTURE_DESCRIPTION__ADAPTER_FACTORY_PROVIDER);

		eefInterpretedTreeStructureDescriptionEClass = createEClass(EEF_INTERPRETED_TREE_STRUCTURE_DESCRIPTION);
		createEAttribute(eefInterpretedTreeStructureDescriptionEClass, EEF_INTERPRETED_TREE_STRUCTURE_DESCRIPTION__ROOTS_EXPRESSION);
		createEAttribute(eefInterpretedTreeStructureDescriptionEClass, EEF_INTERPRETED_TREE_STRUCTURE_DESCRIPTION__CHILDREN_EXPRESSION);
		createEAttribute(eefInterpretedTreeStructureDescriptionEClass, EEF_INTERPRETED_TREE_STRUCTURE_DESCRIPTION__SELECTABLE_PREDICATE_EXPRESSION);
		createEAttribute(eefInterpretedTreeStructureDescriptionEClass, EEF_INTERPRETED_TREE_STRUCTURE_DESCRIPTION__CANDIDATE_DISPLAY_EXPRESSION);

		eefTextDescriptionEClass = createEClass(EEF_TEXT_DESCRIPTION);
		createEAttribute(eefTextDescriptionEClass, EEF_TEXT_DESCRIPTION__VALUE_EXPRESSION);
		createEAttribute(eefTextDescriptionEClass, EEF_TEXT_DESCRIPTION__EDIT_EXPRESSION);
		createEAttribute(eefTextDescriptionEClass, EEF_TEXT_DESCRIPTION__READ_ONLY_EXPRESSION);
		createEAttribute(eefTextDescriptionEClass, EEF_TEXT_DESCRIPTION__CONTENT_ASSIST_EXPRESSION);
		createEAttribute(eefTextDescriptionEClass, EEF_TEXT_DESCRIPTION__PLACEHOLDER_EXPRESSION);
		createEAttribute(eefTextDescriptionEClass, EEF_TEXT_DESCRIPTION__LINE_COUNT);
		createEReference(eefTextDescriptionEClass, EEF_TEXT_DESCRIPTION__STYLE);
		createEReference(eefTextDescriptionEClass, EEF_TEXT_DESCRIPTION__CONDITIONAL_STYLES);

		eefCheckboxDescriptionEClass = createEClass(EEF_CHECKBOX_DESCRIPTION);
		createEAttribute(eefCheckboxDescriptionEClass, EEF_CHECKBOX_DESCRIPTION__VALUE_EXPRESSION);
		createEAttribute(eefCheckboxDescriptionEClass, EEF_CHECKBOX_DESCRIPTION__EDIT_EXPRESSION);

		eefSelectDescriptionEClass = createEClass(EEF_SELECT_DESCRIPTION);
		createEAttribute(eefSelectDescriptionEClass, EEF_SELECT_DESCRIPTION__VALUE_EXPRESSION);
		createEAttribute(eefSelectDescriptionEClass, EEF_SELECT_DESCRIPTION__EDIT_EXPRESSION);
		createEAttribute(eefSelectDescriptionEClass, EEF_SELECT_DESCRIPTION__CANDIDATES_EXPRESSION);
		createEAttribute(eefSelectDescriptionEClass, EEF_SELECT_DESCRIPTION__MULTIPLE);
		createEAttribute(eefSelectDescriptionEClass, EEF_SELECT_DESCRIPTION__CANDIDATE_DISPLAY_EXPRESSION);

		eefLabelDescriptionEClass = createEClass(EEF_LABEL_DESCRIPTION);
		createEAttribute(eefLabelDescriptionEClass, EEF_LABEL_DESCRIPTION__VALUE_EXPRESSION);

		eefRadioDescriptionEClass = createEClass(EEF_RADIO_DESCRIPTION);
		createEAttribute(eefRadioDescriptionEClass, EEF_RADIO_DESCRIPTION__VALUE_EXPRESSION);
		createEAttribute(eefRadioDescriptionEClass, EEF_RADIO_DESCRIPTION__EDIT_EXPRESSION);
		createEAttribute(eefRadioDescriptionEClass, EEF_RADIO_DESCRIPTION__CANDIDATES_EXPRESSION);
		createEAttribute(eefRadioDescriptionEClass, EEF_RADIO_DESCRIPTION__CANDIDATE_DISPLAY_EXPRESSION);

		eefTreeDialogSelectDescriptionEClass = createEClass(EEF_TREE_DIALOG_SELECT_DESCRIPTION);
		createEAttribute(eefTreeDialogSelectDescriptionEClass, EEF_TREE_DIALOG_SELECT_DESCRIPTION__SEMANTIC_CANDIDATE_EXPRESSION);
		createEAttribute(eefTreeDialogSelectDescriptionEClass, EEF_TREE_DIALOG_SELECT_DESCRIPTION__DEFAULT_FILTER);
		createEAttribute(eefTreeDialogSelectDescriptionEClass, EEF_TREE_DIALOG_SELECT_DESCRIPTION__DOMAIN_CLASS);
		createEReference(eefTreeDialogSelectDescriptionEClass, EEF_TREE_DIALOG_SELECT_DESCRIPTION__TREE);

		eefLinkDescriptionEClass = createEClass(EEF_LINK_DESCRIPTION);
		createEAttribute(eefLinkDescriptionEClass, EEF_LINK_DESCRIPTION__ON_CLICK_EXPRESSION);

		eefImageDescriptionEClass = createEClass(EEF_IMAGE_DESCRIPTION);
		createEAttribute(eefImageDescriptionEClass, EEF_IMAGE_DESCRIPTION__VALUE_EXPRESSION);

		eefTreeDescriptionEClass = createEClass(EEF_TREE_DESCRIPTION);
		createEAttribute(eefTreeDescriptionEClass, EEF_TREE_DESCRIPTION__VALUE_EXPRESSION);
		createEReference(eefTreeDescriptionEClass, EEF_TREE_DESCRIPTION__TREE_STRUCTURE);
		createEAttribute(eefTreeDescriptionEClass, EEF_TREE_DESCRIPTION__EDIT_EXPRESSION);

		eefImagePickerDescriptionEClass = createEClass(EEF_IMAGE_PICKER_DESCRIPTION);
		createEAttribute(eefImagePickerDescriptionEClass, EEF_IMAGE_PICKER_DESCRIPTION__VALUE_EXPRESSION);
		createEAttribute(eefImagePickerDescriptionEClass, EEF_IMAGE_PICKER_DESCRIPTION__EDIT_EXPRESSION);
		createEAttribute(eefImagePickerDescriptionEClass, EEF_IMAGE_PICKER_DESCRIPTION__CANDIDATES_EXPRESSION);

		eefTableDescriptionEClass = createEClass(EEF_TABLE_DESCRIPTION);
		createEAttribute(eefTableDescriptionEClass, EEF_TABLE_DESCRIPTION__VALUE_EXPRESSION);
		createEAttribute(eefTableDescriptionEClass, EEF_TABLE_DESCRIPTION__EDIT_EXPRESSION);
		createEReference(eefTableDescriptionEClass, EEF_TABLE_DESCRIPTION__TABLE_STRUCTURE);

		eefColumnDescriptionEClass = createEClass(EEF_COLUMN_DESCRIPTION);
		createEAttribute(eefColumnDescriptionEClass, EEF_COLUMN_DESCRIPTION__WIDTH);
		createEAttribute(eefColumnDescriptionEClass, EEF_COLUMN_DESCRIPTION__HEADER_EXPRESSION);
		createEReference(eefColumnDescriptionEClass, EEF_COLUMN_DESCRIPTION__CELL_WIDGET);

		eefLineDescriptionEClass = createEClass(EEF_LINE_DESCRIPTION);
		createEAttribute(eefLineDescriptionEClass, EEF_LINE_DESCRIPTION__HEADER_EXPRESSION);
		createEAttribute(eefLineDescriptionEClass, EEF_LINE_DESCRIPTION__SEMANTIC_CANDIDATES_EXPRESSION);
		createEAttribute(eefLineDescriptionEClass, EEF_LINE_DESCRIPTION__DOMAIN_CLASS);
		createEReference(eefLineDescriptionEClass, EEF_LINE_DESCRIPTION__SUB_LINES);

		eefTableStructureDescriptionEClass = createEClass(EEF_TABLE_STRUCTURE_DESCRIPTION);
		createEAttribute(eefTableStructureDescriptionEClass, EEF_TABLE_STRUCTURE_DESCRIPTION__MULTIPLE);
		createEAttribute(eefTableStructureDescriptionEClass, EEF_TABLE_STRUCTURE_DESCRIPTION__IDENTIFIER);
		createEAttribute(eefTableStructureDescriptionEClass, EEF_TABLE_STRUCTURE_DESCRIPTION__ADD_EXPRESSION);
		createEAttribute(eefTableStructureDescriptionEClass, EEF_TABLE_STRUCTURE_DESCRIPTION__REMOVE_EXPRESSION);
		createEAttribute(eefTableStructureDescriptionEClass, EEF_TABLE_STRUCTURE_DESCRIPTION__UP_EXPRESSION);
		createEAttribute(eefTableStructureDescriptionEClass, EEF_TABLE_STRUCTURE_DESCRIPTION__DOWN_EXPRESSION);

		eefAdapterFactoryTableStructureDescriptionEClass = createEClass(EEF_ADAPTER_FACTORY_TABLE_STRUCTURE_DESCRIPTION);
		createEAttribute(eefAdapterFactoryTableStructureDescriptionEClass, EEF_ADAPTER_FACTORY_TABLE_STRUCTURE_DESCRIPTION__ADAPTER_FACTORY_PROVIDER);

		eefStyleEClass = createEClass(EEF_STYLE);
		createEAttribute(eefStyleEClass, EEF_STYLE__FONT_EXPRESSION);

		eefConditionalStyleEClass = createEClass(EEF_CONDITIONAL_STYLE);
		createEAttribute(eefConditionalStyleEClass, EEF_CONDITIONAL_STYLE__CONDITIONAL_EXPRESSION);

		eefStyleCustomizationEClass = createEClass(EEF_STYLE_CUSTOMIZATION);

		eefGroupStyleEClass = createEClass(EEF_GROUP_STYLE);
		createEAttribute(eefGroupStyleEClass, EEF_GROUP_STYLE__FOREGROUND_COLOR_EXPRESSION);

		eefGroupConditionalStyleEClass = createEClass(EEF_GROUP_CONDITIONAL_STYLE);
		createEReference(eefGroupConditionalStyleEClass, EEF_GROUP_CONDITIONAL_STYLE__STYLE);

		eefGroupStyleCustomizationEClass = createEClass(EEF_GROUP_STYLE_CUSTOMIZATION);
		createEReference(eefGroupStyleCustomizationEClass, EEF_GROUP_STYLE_CUSTOMIZATION__STYLE);

		eefTextStyleEClass = createEClass(EEF_TEXT_STYLE);
		createEAttribute(eefTextStyleEClass, EEF_TEXT_STYLE__BACKGROUND_COLOR_EXPRESSION);
		createEAttribute(eefTextStyleEClass, EEF_TEXT_STYLE__FOREGROUND_COLOR_EXPRESSION);

		eefTextConditionalStyleEClass = createEClass(EEF_TEXT_CONDITIONAL_STYLE);
		createEReference(eefTextConditionalStyleEClass, EEF_TEXT_CONDITIONAL_STYLE__STYLE);

		eefTextStyleCustomizationEClass = createEClass(EEF_TEXT_STYLE_CUSTOMIZATION);
		createEReference(eefTextStyleCustomizationEClass, EEF_TEXT_STYLE_CUSTOMIZATION__STYLE);

		eefCheckboxStyleEClass = createEClass(EEF_CHECKBOX_STYLE);
		createEAttribute(eefCheckboxStyleEClass, EEF_CHECKBOX_STYLE__BACKGROUND_COLOR_EXPRESSION);
		createEAttribute(eefCheckboxStyleEClass, EEF_CHECKBOX_STYLE__FOREGROUND_COLOR_EXPRESSION);

		eefCheckboxConditionalStyleEClass = createEClass(EEF_CHECKBOX_CONDITIONAL_STYLE);
		createEReference(eefCheckboxConditionalStyleEClass, EEF_CHECKBOX_CONDITIONAL_STYLE__STYLE);

		eefCheckboxStyleCustomizationEClass = createEClass(EEF_CHECKBOX_STYLE_CUSTOMIZATION);
		createEReference(eefCheckboxStyleCustomizationEClass, EEF_CHECKBOX_STYLE_CUSTOMIZATION__STYLE);

		eefLabelStyleEClass = createEClass(EEF_LABEL_STYLE);
		createEAttribute(eefLabelStyleEClass, EEF_LABEL_STYLE__BACKGROUND_COLOR_EXPRESSION);
		createEAttribute(eefLabelStyleEClass, EEF_LABEL_STYLE__FOREGROUND_COLOR_EXPRESSION);

		eefLabelConditionalStyleEClass = createEClass(EEF_LABEL_CONDITIONAL_STYLE);
		createEReference(eefLabelConditionalStyleEClass, EEF_LABEL_CONDITIONAL_STYLE__STYLE);

		eefLabelStyleCustomizationEClass = createEClass(EEF_LABEL_STYLE_CUSTOMIZATION);
		createEReference(eefLabelStyleCustomizationEClass, EEF_LABEL_STYLE_CUSTOMIZATION__STYLE);

		eefRadioStyleEClass = createEClass(EEF_RADIO_STYLE);
		createEAttribute(eefRadioStyleEClass, EEF_RADIO_STYLE__BACKGROUND_COLOR_EXPRESSION);
		createEAttribute(eefRadioStyleEClass, EEF_RADIO_STYLE__FOREGROUND_COLOR_EXPRESSION);

		eefRadioConditionalStyleEClass = createEClass(EEF_RADIO_CONDITIONAL_STYLE);
		createEReference(eefRadioConditionalStyleEClass, EEF_RADIO_CONDITIONAL_STYLE__STYLE);

		eefRadioStyleCustomizationEClass = createEClass(EEF_RADIO_STYLE_CUSTOMIZATION);
		createEReference(eefRadioStyleCustomizationEClass, EEF_RADIO_STYLE_CUSTOMIZATION__STYLE);

		eefLinkStyleEClass = createEClass(EEF_LINK_STYLE);
		createEAttribute(eefLinkStyleEClass, EEF_LINK_STYLE__BACKGROUND_COLOR_EXPRESSION);
		createEAttribute(eefLinkStyleEClass, EEF_LINK_STYLE__FOREGROUND_COLOR_EXPRESSION);
		createEAttribute(eefLinkStyleEClass, EEF_LINK_STYLE__BACKGROUND_IMAGE_EXPRESSION);

		eefLinkConditionalStyleEClass = createEClass(EEF_LINK_CONDITIONAL_STYLE);
		createEReference(eefLinkConditionalStyleEClass, EEF_LINK_CONDITIONAL_STYLE__STYLE);

		eefLinkStyleCustomizationEClass = createEClass(EEF_LINK_STYLE_CUSTOMIZATION);
		createEReference(eefLinkStyleCustomizationEClass, EEF_LINK_STYLE_CUSTOMIZATION__STYLE);

		eefSelectStyleEClass = createEClass(EEF_SELECT_STYLE);
		createEAttribute(eefSelectStyleEClass, EEF_SELECT_STYLE__BACKGROUND_COLOR_EXPRESSION);
		createEAttribute(eefSelectStyleEClass, EEF_SELECT_STYLE__FOREGROUND_COLOR_EXPRESSION);

		eefSelectConditionalStyleEClass = createEClass(EEF_SELECT_CONDITIONAL_STYLE);
		createEReference(eefSelectConditionalStyleEClass, EEF_SELECT_CONDITIONAL_STYLE__STYLE);

		eefSelectStyleCustomizationEClass = createEClass(EEF_SELECT_STYLE_CUSTOMIZATION);
		createEReference(eefSelectStyleCustomizationEClass, EEF_SELECT_STYLE_CUSTOMIZATION__STYLE);

		eefTreeStyleEClass = createEClass(EEF_TREE_STYLE);

		eefTreeConditionalStyleEClass = createEClass(EEF_TREE_CONDITIONAL_STYLE);
		createEReference(eefTreeConditionalStyleEClass, EEF_TREE_CONDITIONAL_STYLE__STYLE);

		eefTreeStyleCustomizationEClass = createEClass(EEF_TREE_STYLE_CUSTOMIZATION);
		createEReference(eefTreeStyleCustomizationEClass, EEF_TREE_STYLE_CUSTOMIZATION__STYLE);

		eefTableStyleEClass = createEClass(EEF_TABLE_STYLE);

		eefTableConditionalStyleEClass = createEClass(EEF_TABLE_CONDITIONAL_STYLE);
		createEReference(eefTableConditionalStyleEClass, EEF_TABLE_CONDITIONAL_STYLE__STYLE);

		eefTableStyleCustomizationEClass = createEClass(EEF_TABLE_STYLE_CUSTOMIZATION);
		createEReference(eefTableStyleCustomizationEClass, EEF_TABLE_STYLE_CUSTOMIZATION__STYLE);

		eefLineStyleEClass = createEClass(EEF_LINE_STYLE);
		createEAttribute(eefLineStyleEClass, EEF_LINE_STYLE__BACKGROUND_COLOR_EXPRESSION);
		createEAttribute(eefLineStyleEClass, EEF_LINE_STYLE__FOREGROUND_COLOR_EXPRESSION);
		createEAttribute(eefLineStyleEClass, EEF_LINE_STYLE__HEADER_BACKGROUND_COLOR_EXPRESSION);
		createEAttribute(eefLineStyleEClass, EEF_LINE_STYLE__HEADER_FOREGROUND_COLOR_EXPRESSION);

		eefLineConditionalStyleEClass = createEClass(EEF_LINE_CONDITIONAL_STYLE);
		createEReference(eefLineConditionalStyleEClass, EEF_LINE_CONDITIONAL_STYLE__STYLE);

		eefLineStyleCustomizationEClass = createEClass(EEF_LINE_STYLE_CUSTOMIZATION);
		createEReference(eefLineStyleCustomizationEClass, EEF_LINE_STYLE_CUSTOMIZATION__STYLE);

		eefColumnStyleEClass = createEClass(EEF_COLUMN_STYLE);
		createEAttribute(eefColumnStyleEClass, EEF_COLUMN_STYLE__BACKGROUND_COLOR_EXPRESSION);
		createEAttribute(eefColumnStyleEClass, EEF_COLUMN_STYLE__FOREGROUND_COLOR_EXPRESSION);
		createEAttribute(eefColumnStyleEClass, EEF_COLUMN_STYLE__HEADER_BACKGROUND_COLOR_EXPRESSION);
		createEAttribute(eefColumnStyleEClass, EEF_COLUMN_STYLE__HEADER_FOREGROUND_COLOR_EXPRESSION);

		eefColumnConditionalStyleEClass = createEClass(EEF_COLUMN_CONDITIONAL_STYLE);
		createEReference(eefColumnConditionalStyleEClass, EEF_COLUMN_CONDITIONAL_STYLE__STYLE);

		eefColumnStyleCustomizationEClass = createEClass(EEF_COLUMN_STYLE_CUSTOMIZATION);
		createEReference(eefColumnStyleCustomizationEClass, EEF_COLUMN_STYLE_CUSTOMIZATION__STYLE);

		eefQuickFixEClass = createEClass(EEF_QUICK_FIX);
		createEAttribute(eefQuickFixEClass, EEF_QUICK_FIX__TITLE_EXPRESSION);
		createEAttribute(eefQuickFixEClass, EEF_QUICK_FIX__MESSAGE_EXPRESSION);
		createEAttribute(eefQuickFixEClass, EEF_QUICK_FIX__CAN_HANDLE_STATUS_EXPRESSION);
		createEAttribute(eefQuickFixEClass, EEF_QUICK_FIX__FIX_EXPRESSION);

		eefValidationEClass = createEClass(EEF_VALIDATION);
		createEAttribute(eefValidationEClass, EEF_VALIDATION__VALIDATION_EXPRESSION);
		createEReference(eefValidationEClass, EEF_VALIDATION__QUICKFIXES);

		// Create data types
		typeNameEDataType = createEDataType(TYPE_NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ExpressionPackage theExpressionPackage = (ExpressionPackage) EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		eefInterpretedTableStructureDescriptionEClass.getESuperTypes().add(this.getEEFTableStructureDescription());
		eefCellWidgetDescriptionEClass.getESuperTypes().add(this.getEEFWidgetDescription());
		eefAdapterFactoryTreeStructureDescriptionEClass.getESuperTypes().add(this.getEEFTreeStructureDescription());
		eefInterpretedTreeStructureDescriptionEClass.getESuperTypes().add(this.getEEFTreeStructureDescription());
		eefTextDescriptionEClass.getESuperTypes().add(this.getEEFCellWidgetDescription());
		eefCheckboxDescriptionEClass.getESuperTypes().add(this.getEEFCellWidgetDescription());
		eefSelectDescriptionEClass.getESuperTypes().add(this.getEEFCellWidgetDescription());
		eefLabelDescriptionEClass.getESuperTypes().add(this.getEEFCellWidgetDescription());
		eefRadioDescriptionEClass.getESuperTypes().add(this.getEEFWidgetDescription());
		eefTreeDialogSelectDescriptionEClass.getESuperTypes().add(this.getEEFCellWidgetDescription());
		eefLinkDescriptionEClass.getESuperTypes().add(this.getEEFCellWidgetDescription());
		eefImageDescriptionEClass.getESuperTypes().add(this.getEEFCellWidgetDescription());
		eefTreeDescriptionEClass.getESuperTypes().add(this.getEEFCellWidgetDescription());
		eefImagePickerDescriptionEClass.getESuperTypes().add(this.getEEFWidgetDescription());
		eefTableDescriptionEClass.getESuperTypes().add(this.getEEFWidgetDescription());
		eefAdapterFactoryTableStructureDescriptionEClass.getESuperTypes().add(this.getEEFTableStructureDescription());
		eefGroupStyleEClass.getESuperTypes().add(this.getEEFStyle());
		eefGroupConditionalStyleEClass.getESuperTypes().add(this.getEEFConditionalStyle());
		eefGroupStyleCustomizationEClass.getESuperTypes().add(this.getEEFStyleCustomization());
		eefTextStyleEClass.getESuperTypes().add(this.getEEFStyle());
		eefTextConditionalStyleEClass.getESuperTypes().add(this.getEEFConditionalStyle());
		eefTextStyleCustomizationEClass.getESuperTypes().add(this.getEEFStyleCustomization());
		eefCheckboxStyleEClass.getESuperTypes().add(this.getEEFStyle());
		eefCheckboxStyleCustomizationEClass.getESuperTypes().add(this.getEEFStyleCustomization());
		eefLabelStyleEClass.getESuperTypes().add(this.getEEFStyle());
		eefLabelConditionalStyleEClass.getESuperTypes().add(this.getEEFConditionalStyle());
		eefLabelStyleCustomizationEClass.getESuperTypes().add(this.getEEFStyleCustomization());
		eefRadioStyleEClass.getESuperTypes().add(this.getEEFStyle());
		eefRadioConditionalStyleEClass.getESuperTypes().add(this.getEEFConditionalStyle());
		eefRadioStyleCustomizationEClass.getESuperTypes().add(this.getEEFStyleCustomization());
		eefLinkStyleEClass.getESuperTypes().add(this.getEEFStyle());
		eefLinkConditionalStyleEClass.getESuperTypes().add(this.getEEFConditionalStyle());
		eefLinkStyleCustomizationEClass.getESuperTypes().add(this.getEEFStyleCustomization());
		eefSelectStyleEClass.getESuperTypes().add(this.getEEFStyle());
		eefSelectConditionalStyleEClass.getESuperTypes().add(this.getEEFConditionalStyle());
		eefSelectStyleCustomizationEClass.getESuperTypes().add(this.getEEFStyleCustomization());
		eefTreeStyleEClass.getESuperTypes().add(this.getEEFStyle());
		eefTreeConditionalStyleEClass.getESuperTypes().add(this.getEEFConditionalStyle());
		eefTreeStyleCustomizationEClass.getESuperTypes().add(this.getEEFStyleCustomization());
		eefTableStyleEClass.getESuperTypes().add(this.getEEFStyle());
		eefTableConditionalStyleEClass.getESuperTypes().add(this.getEEFConditionalStyle());
		eefTableStyleCustomizationEClass.getESuperTypes().add(this.getEEFStyleCustomization());
		eefLineStyleEClass.getESuperTypes().add(this.getEEFStyle());
		eefLineConditionalStyleEClass.getESuperTypes().add(this.getEEFConditionalStyle());
		eefLineStyleCustomizationEClass.getESuperTypes().add(this.getEEFStyleCustomization());
		eefColumnStyleEClass.getESuperTypes().add(this.getEEFStyle());
		eefColumnConditionalStyleEClass.getESuperTypes().add(this.getEEFConditionalStyle());
		eefColumnStyleCustomizationEClass.getESuperTypes().add(this.getEEFStyleCustomization());

		// Initialize classes and features; add operations and parameters
		initEClass(eefViewDescriptionEClass, EEFViewDescription.class, "EEFViewDescription", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFViewDescription_Identifier(), ecorePackage.getEString(), "identifier", null, 1, 1, EEFViewDescription.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFViewDescription_PreconditionExpression(), theExpressionPackage.getExpression(), "preconditionExpression", null, 0, 1, //$NON-NLS-1$
				EEFViewDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEEFViewDescription_UserDefinedVariables(), theExpressionPackage.getUserDefinedVariable(), null, "userDefinedVariables", //$NON-NLS-1$
				null, 0, -1, EEFViewDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFViewDescription_LabelExpression(), theExpressionPackage.getExpression(), "labelExpression", null, 0, 1, //$NON-NLS-1$
				EEFViewDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFViewDescription_EPackageNsUris(), ecorePackage.getEString(), "ePackageNsUris", null, 0, -1, EEFViewDescription.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEEFViewDescription_Groups(), this.getEEFGroupDescription(), null, "groups", null, 0, -1, EEFViewDescription.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEEFViewDescription_Pages(), this.getEEFPageDescription(), null, "pages", null, 1, -1, EEFViewDescription.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEEFViewDescription_JavaExtensions(), this.getEEFJavaExtensionDescription(), null, "javaExtensions", null, 0, -1, //$NON-NLS-1$
				EEFViewDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getEEFViewDescription_ImportedViews(), this.getEEFViewDescription(), null, "importedViews", null, 0, -1, //$NON-NLS-1$
				EEFViewDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getEEFViewDescription_TreeStructures(), this.getEEFTreeStructureDescription(), null, "treeStructures", null, 0, -1, //$NON-NLS-1$
				EEFViewDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getEEFViewDescription_TableStructures(), this.getEEFTableStructureDescription(), null, "tableStructures", null, 0, -1, //$NON-NLS-1$
				EEFViewDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getEEFViewDescription_StyleCustomizations(), this.getEEFStyleCustomization(), null, "styleCustomizations", null, 0, -1, //$NON-NLS-1$
				EEFViewDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(eefPageDescriptionEClass, EEFPageDescription.class, "EEFPageDescription", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFPageDescription_Identifier(), ecorePackage.getEString(), "identifier", null, 1, 1, EEFPageDescription.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFPageDescription_PreconditionExpression(), theExpressionPackage.getExpression(), "preconditionExpression", null, 0, 1, //$NON-NLS-1$
				EEFPageDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEEFPageDescription_UserDefinedVariables(), theExpressionPackage.getUserDefinedVariable(), null, "userDefinedVariables", //$NON-NLS-1$
				null, 0, -1, EEFPageDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFPageDescription_LabelExpression(), theExpressionPackage.getExpression(), "labelExpression", null, 0, 1, //$NON-NLS-1$
				EEFPageDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFPageDescription_DomainClass(), this.getTypeName(), "domainClass", null, 0, 1, EEFPageDescription.class, !IS_TRANSIENT, //$NON-NLS-1$
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFPageDescription_SemanticCandidateExpression(), theExpressionPackage.getExpression(), "semanticCandidateExpression", "", //$NON-NLS-1$//$NON-NLS-2$
				0, 1, EEFPageDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getEEFPageDescription_Groups(), this.getEEFGroupDescription(), null, "groups", null, 0, -1, EEFPageDescription.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEEFPageDescription_ExtendedPage(), this.getEEFPageDescription(), null, "extendedPage", null, 0, 1, EEFPageDescription.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eefGroupDescriptionEClass, EEFGroupDescription.class, "EEFGroupDescription", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFGroupDescription_Identifier(), ecorePackage.getEString(), "identifier", null, 1, 1, EEFGroupDescription.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFGroupDescription_PreconditionExpression(), theExpressionPackage.getExpression(), "preconditionExpression", null, 0, 1, //$NON-NLS-1$
				EEFGroupDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEEFGroupDescription_UserDefinedVariables(), theExpressionPackage.getUserDefinedVariable(), null, "userDefinedVariables", //$NON-NLS-1$
				null, 0, -1, EEFGroupDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFGroupDescription_LabelExpression(), theExpressionPackage.getExpression(), "labelExpression", null, 0, 1, //$NON-NLS-1$
				EEFGroupDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFGroupDescription_DomainClass(), this.getTypeName(), "domainClass", null, 0, 1, EEFGroupDescription.class, !IS_TRANSIENT, //$NON-NLS-1$
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFGroupDescription_SemanticCandidateExpression(), theExpressionPackage.getExpression(), "semanticCandidateExpression", //$NON-NLS-1$
				null, 0, 1, EEFGroupDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getEEFGroupDescription_Container(), this.getEEFContainerDescription(), null, "container", null, 1, 1, //$NON-NLS-1$
				EEFGroupDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFGroupDescription_CollapsibleExpression(), theExpressionPackage.getExpression(), "collapsibleExpression", null, 0, 1, //$NON-NLS-1$
				EEFGroupDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFGroupDescription_CollapsedByDefaultExpression(), theExpressionPackage.getExpression(), "collapsedByDefaultExpression", //$NON-NLS-1$
				null, 0, 1, EEFGroupDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getEEFGroupDescription_Validation(), this.getEEFValidation(), null, "validation", null, 0, 1, EEFGroupDescription.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eefContainerDescriptionEClass, EEFContainerDescription.class, "EEFContainerDescription", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFContainerDescription_Identifier(), ecorePackage.getEString(), "identifier", null, 1, 1, EEFContainerDescription.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFContainerDescription_PreconditionExpression(), theExpressionPackage.getExpression(), "preconditionExpression", null, 0, //$NON-NLS-1$
				1, EEFContainerDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getEEFContainerDescription_UserDefinedVariables(), theExpressionPackage.getUserDefinedVariable(), null, "userDefinedVariables", //$NON-NLS-1$
				null, 0, -1, EEFContainerDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFContainerDescription_SemanticCandidateExpression(), theExpressionPackage.getExpression(), "semanticCandidateExpression", //$NON-NLS-1$
				null, 0, 1, EEFContainerDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getEEFContainerDescription_DomainClass(), this.getTypeName(), "domainClass", null, 0, 1, EEFContainerDescription.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFContainerDescription_LayoutColumnCount(), ecorePackage.getEInt(), "layoutColumnCount", "1", 0, 1, //$NON-NLS-1$//$NON-NLS-2$
				EEFContainerDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getEEFContainerDescription_Containers(), this.getEEFContainerDescription(), null, "containers", null, 0, -1, //$NON-NLS-1$
				EEFContainerDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEEFContainerDescription_Widgets(), this.getEEFWidgetDescription(), null, "widgets", null, 1, -1, //$NON-NLS-1$
				EEFContainerDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eefWidgetDescriptionEClass, EEFWidgetDescription.class, "EEFWidgetDescription", IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFWidgetDescription_Identifier(), ecorePackage.getEString(), "identifier", null, 1, 1, EEFWidgetDescription.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFWidgetDescription_PreconditionExpression(), theExpressionPackage.getExpression(), "preconditionExpression", null, 0, 1, //$NON-NLS-1$
				EEFWidgetDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEEFWidgetDescription_UserDefinedVariables(), theExpressionPackage.getUserDefinedVariable(), null, "userDefinedVariables", //$NON-NLS-1$
				null, 0, -1, EEFWidgetDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFWidgetDescription_LabelExpression(), theExpressionPackage.getExpression(), "labelExpression", null, 0, 1, //$NON-NLS-1$
				EEFWidgetDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEEFWidgetDescription_LabelStyle(), this.getEEFLabelStyle(), null, "labelStyle", null, 0, 1, EEFWidgetDescription.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFWidgetDescription_TooltipExpression(), theExpressionPackage.getExpression(), "tooltipExpression", null, 0, 1, //$NON-NLS-1$
				EEFWidgetDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFWidgetDescription_HelpExpression(), theExpressionPackage.getExpression(), "helpExpression", null, 0, 1, //$NON-NLS-1$
				EEFWidgetDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEEFWidgetDescription_Validation(), this.getEEFValidation(), null, "validation", null, 0, 1, EEFWidgetDescription.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eefJavaExtensionDescriptionEClass, EEFJavaExtensionDescription.class, "EEFJavaExtensionDescription", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFJavaExtensionDescription_QualifiedName(), ecorePackage.getEString(), "qualifiedName", null, 0, 1, //$NON-NLS-1$
				EEFJavaExtensionDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(eefTreeStructureDescriptionEClass, EEFTreeStructureDescription.class, "EEFTreeStructureDescription", IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFTreeStructureDescription_Identifier(), ecorePackage.getEString(), "identifier", null, 1, 1, //$NON-NLS-1$
				EEFTreeStructureDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getEEFTreeStructureDescription_Multiple(), ecorePackage.getEBoolean(), "multiple", null, 0, 1, //$NON-NLS-1$
				EEFTreeStructureDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(eefInterpretedTableStructureDescriptionEClass, EEFInterpretedTableStructureDescription.class,
				"EEFInterpretedTableStructureDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getEEFInterpretedTableStructureDescription_Columns(), this.getEEFColumnDescription(), null, "columns", null, 0, -1, //$NON-NLS-1$
				EEFInterpretedTableStructureDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEEFInterpretedTableStructureDescription_Line(), this.getEEFLineDescription(), null, "line", null, 0, 1, //$NON-NLS-1$
				EEFInterpretedTableStructureDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eefCellWidgetDescriptionEClass, EEFCellWidgetDescription.class, "EEFCellWidgetDescription", IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(eefAdapterFactoryTreeStructureDescriptionEClass, EEFAdapterFactoryTreeStructureDescription.class,
				"EEFAdapterFactoryTreeStructureDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getEEFAdapterFactoryTreeStructureDescription_AdapterFactoryProvider(), ecorePackage.getEString(), "adapterFactoryProvider", //$NON-NLS-1$
				null, 0, 1, EEFAdapterFactoryTreeStructureDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eefInterpretedTreeStructureDescriptionEClass, EEFInterpretedTreeStructureDescription.class,
				"EEFInterpretedTreeStructureDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getEEFInterpretedTreeStructureDescription_RootsExpression(), theExpressionPackage.getExpression(), "rootsExpression", null, 0, //$NON-NLS-1$
				1, EEFInterpretedTreeStructureDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFInterpretedTreeStructureDescription_ChildrenExpression(), theExpressionPackage.getExpression(), "childrenExpression", //$NON-NLS-1$
				null, 0, 1, EEFInterpretedTreeStructureDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFInterpretedTreeStructureDescription_SelectablePredicateExpression(), theExpressionPackage.getExpression(),
				"selectablePredicateExpression", null, 0, 1, EEFInterpretedTreeStructureDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, //$NON-NLS-1$
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFInterpretedTreeStructureDescription_CandidateDisplayExpression(), theExpressionPackage.getExpression(),
				"candidateDisplayExpression", null, 0, 1, EEFInterpretedTreeStructureDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, //$NON-NLS-1$
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eefTextDescriptionEClass, EEFTextDescription.class, "EEFTextDescription", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFTextDescription_ValueExpression(), theExpressionPackage.getExpression(), "valueExpression", null, 0, 1, //$NON-NLS-1$
				EEFTextDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFTextDescription_EditExpression(), theExpressionPackage.getExpression(), "editExpression", null, 0, 1, //$NON-NLS-1$
				EEFTextDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFTextDescription_ReadOnlyExpression(), theExpressionPackage.getExpression(), "readOnlyExpression", null, 0, 1, //$NON-NLS-1$
				EEFTextDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFTextDescription_ContentAssistExpression(), theExpressionPackage.getExpression(), "contentAssistExpression", null, 0, 1, //$NON-NLS-1$
				EEFTextDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFTextDescription_PlaceholderExpression(), theExpressionPackage.getExpression(), "placeholderExpression", null, 0, 1, //$NON-NLS-1$
				EEFTextDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFTextDescription_LineCount(), ecorePackage.getEInt(), "lineCount", "1", 0, 1, EEFTextDescription.class, !IS_TRANSIENT, //$NON-NLS-1$//$NON-NLS-2$
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEEFTextDescription_Style(), this.getEEFTextStyle(), null, "style", null, 0, 1, EEFTextDescription.class, !IS_TRANSIENT, //$NON-NLS-1$
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEEFTextDescription_ConditionalStyles(), this.getEEFTextConditionalStyle(), null, "conditionalStyles", null, 0, -1, //$NON-NLS-1$
				EEFTextDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(eefCheckboxDescriptionEClass, EEFCheckboxDescription.class, "EEFCheckboxDescription", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFCheckboxDescription_ValueExpression(), theExpressionPackage.getExpression(), "valueExpression", null, 0, 1, //$NON-NLS-1$
				EEFCheckboxDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFCheckboxDescription_EditExpression(), theExpressionPackage.getExpression(), "editExpression", null, 0, 1, //$NON-NLS-1$
				EEFCheckboxDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eefSelectDescriptionEClass, EEFSelectDescription.class, "EEFSelectDescription", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFSelectDescription_ValueExpression(), theExpressionPackage.getExpression(), "valueExpression", null, 0, 1, //$NON-NLS-1$
				EEFSelectDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFSelectDescription_EditExpression(), theExpressionPackage.getExpression(), "editExpression", null, 0, 1, //$NON-NLS-1$
				EEFSelectDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFSelectDescription_CandidatesExpression(), theExpressionPackage.getExpression(), "candidatesExpression", null, 0, 1, //$NON-NLS-1$
				EEFSelectDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFSelectDescription_Multiple(), ecorePackage.getEBoolean(), "multiple", null, 0, 1, EEFSelectDescription.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFSelectDescription_CandidateDisplayExpression(), theExpressionPackage.getExpression(), "candidateDisplayExpression", null, //$NON-NLS-1$
				0, 1, EEFSelectDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(eefLabelDescriptionEClass, EEFLabelDescription.class, "EEFLabelDescription", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFLabelDescription_ValueExpression(), theExpressionPackage.getExpression(), "valueExpression", null, 0, 1, //$NON-NLS-1$
				EEFLabelDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eefRadioDescriptionEClass, EEFRadioDescription.class, "EEFRadioDescription", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFRadioDescription_ValueExpression(), theExpressionPackage.getExpression(), "valueExpression", null, 0, 1, //$NON-NLS-1$
				EEFRadioDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFRadioDescription_EditExpression(), theExpressionPackage.getExpression(), "editExpression", null, 0, 1, //$NON-NLS-1$
				EEFRadioDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFRadioDescription_CandidatesExpression(), theExpressionPackage.getExpression(), "candidatesExpression", null, 0, 1, //$NON-NLS-1$
				EEFRadioDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFRadioDescription_CandidateDisplayExpression(), theExpressionPackage.getExpression(), "candidateDisplayExpression", null, //$NON-NLS-1$
				0, 1, EEFRadioDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(eefTreeDialogSelectDescriptionEClass, EEFTreeDialogSelectDescription.class, "EEFTreeDialogSelectDescription", !IS_ABSTRACT, //$NON-NLS-1$
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFTreeDialogSelectDescription_SemanticCandidateExpression(), theExpressionPackage.getExpression(),
				"semanticCandidateExpression", null, 0, 1, EEFTreeDialogSelectDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, //$NON-NLS-1$
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFTreeDialogSelectDescription_DefaultFilter(), ecorePackage.getEString(), "defaultFilter", "*", 0, 1, //$NON-NLS-1$//$NON-NLS-2$
				EEFTreeDialogSelectDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getEEFTreeDialogSelectDescription_DomainClass(), this.getTypeName(), "domainClass", null, 0, 1, //$NON-NLS-1$
				EEFTreeDialogSelectDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getEEFTreeDialogSelectDescription_Tree(), this.getEEFTreeDescription(), null, "tree", null, 0, 1, //$NON-NLS-1$
				EEFTreeDialogSelectDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eefLinkDescriptionEClass, EEFLinkDescription.class, "EEFLinkDescription", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFLinkDescription_OnClickExpression(), theExpressionPackage.getExpression(), "onClickExpression", null, 0, 1, //$NON-NLS-1$
				EEFLinkDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eefImageDescriptionEClass, EEFImageDescription.class, "EEFImageDescription", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFImageDescription_ValueExpression(), theExpressionPackage.getExpression(), "valueExpression", null, 0, 1, //$NON-NLS-1$
				EEFImageDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eefTreeDescriptionEClass, EEFTreeDescription.class, "EEFTreeDescription", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFTreeDescription_ValueExpression(), theExpressionPackage.getExpression(), "valueExpression", null, 0, 1, //$NON-NLS-1$
				EEFTreeDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEEFTreeDescription_TreeStructure(), this.getEEFTreeStructureDescription(), null, "treeStructure", null, 0, 1, //$NON-NLS-1$
				EEFTreeDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFTreeDescription_EditExpression(), theExpressionPackage.getExpression(), "editExpression", null, 0, 1, //$NON-NLS-1$
				EEFTreeDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eefImagePickerDescriptionEClass, EEFImagePickerDescription.class, "EEFImagePickerDescription", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFImagePickerDescription_ValueExpression(), theExpressionPackage.getExpression(), "valueExpression", null, 0, 1, //$NON-NLS-1$
				EEFImagePickerDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getEEFImagePickerDescription_EditExpression(), theExpressionPackage.getExpression(), "editExpression", null, 0, 1, //$NON-NLS-1$
				EEFImagePickerDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getEEFImagePickerDescription_CandidatesExpression(), theExpressionPackage.getExpression(), "candidatesExpression", null, 0, 1, //$NON-NLS-1$
				EEFImagePickerDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(eefTableDescriptionEClass, EEFTableDescription.class, "EEFTableDescription", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFTableDescription_ValueExpression(), theExpressionPackage.getExpression(), "valueExpression", null, 0, 1, //$NON-NLS-1$
				EEFTableDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFTableDescription_EditExpression(), theExpressionPackage.getExpression(), "editExpression", null, 0, 1, //$NON-NLS-1$
				EEFTableDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEEFTableDescription_TableStructure(), this.getEEFTableStructureDescription(), null, "tableStructure", null, 0, 1, //$NON-NLS-1$
				EEFTableDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(eefColumnDescriptionEClass, EEFColumnDescription.class, "EEFColumnDescription", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFColumnDescription_Width(), ecorePackage.getEInt(), "width", null, 0, 1, EEFColumnDescription.class, !IS_TRANSIENT, //$NON-NLS-1$
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFColumnDescription_HeaderExpression(), theExpressionPackage.getExpression(), "headerExpression", null, 0, 1, //$NON-NLS-1$
				EEFColumnDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEEFColumnDescription_CellWidget(), this.getEEFCellWidgetDescription(), null, "cellWidget", null, 0, 1, //$NON-NLS-1$
				EEFColumnDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(eefLineDescriptionEClass, EEFLineDescription.class, "EEFLineDescription", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFLineDescription_HeaderExpression(), ecorePackage.getEString(), "headerExpression", null, 0, 1, EEFLineDescription.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFLineDescription_SemanticCandidatesExpression(), theExpressionPackage.getExpression(), "semanticCandidatesExpression", //$NON-NLS-1$
				null, 0, 1, EEFLineDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getEEFLineDescription_DomainClass(), this.getTypeName(), "domainClass", null, 0, 1, EEFLineDescription.class, !IS_TRANSIENT, //$NON-NLS-1$
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEEFLineDescription_SubLines(), this.getEEFLineDescription(), null, "subLines", null, 0, -1, EEFLineDescription.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eefTableStructureDescriptionEClass, EEFTableStructureDescription.class, "EEFTableStructureDescription", IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFTableStructureDescription_Multiple(), ecorePackage.getEBoolean(), "multiple", null, 0, 1, //$NON-NLS-1$
				EEFTableStructureDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getEEFTableStructureDescription_Identifier(), ecorePackage.getEString(), "identifier", null, 1, 1, //$NON-NLS-1$
				EEFTableStructureDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getEEFTableStructureDescription_AddExpression(), theExpressionPackage.getExpression(), "addExpression", null, 0, 1, //$NON-NLS-1$
				EEFTableStructureDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getEEFTableStructureDescription_RemoveExpression(), theExpressionPackage.getExpression(), "removeExpression", null, 0, 1, //$NON-NLS-1$
				EEFTableStructureDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getEEFTableStructureDescription_UpExpression(), theExpressionPackage.getExpression(), "upExpression", null, 0, 1, //$NON-NLS-1$
				EEFTableStructureDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getEEFTableStructureDescription_DownExpression(), theExpressionPackage.getExpression(), "downExpression", null, 0, 1, //$NON-NLS-1$
				EEFTableStructureDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(eefAdapterFactoryTableStructureDescriptionEClass, EEFAdapterFactoryTableStructureDescription.class,
				"EEFAdapterFactoryTableStructureDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getEEFAdapterFactoryTableStructureDescription_AdapterFactoryProvider(), ecorePackage.getEString(), "adapterFactoryProvider", //$NON-NLS-1$
				null, 0, 1, EEFAdapterFactoryTableStructureDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eefStyleEClass, EEFStyle.class, "EEFStyle", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getEEFStyle_FontExpression(), theExpressionPackage.getExpression(), "fontExpression", null, 0, 1, EEFStyle.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eefConditionalStyleEClass, EEFConditionalStyle.class, "EEFConditionalStyle", IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFConditionalStyle_ConditionalExpression(), theExpressionPackage.getExpression(), "conditionalExpression", null, 0, 1, //$NON-NLS-1$
				EEFConditionalStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eefStyleCustomizationEClass, EEFStyleCustomization.class, "EEFStyleCustomization", IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(eefGroupStyleEClass, EEFGroupStyle.class, "EEFGroupStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getEEFGroupStyle_ForegroundColorExpression(), theExpressionPackage.getExpression(), "foregroundColorExpression", null, 0, 1, //$NON-NLS-1$
				EEFGroupStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eefGroupConditionalStyleEClass, EEFGroupConditionalStyle.class, "EEFGroupConditionalStyle", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEEFGroupConditionalStyle_Style(), this.getEEFGroupStyle(), null, "style", null, 0, 1, EEFGroupConditionalStyle.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eefGroupStyleCustomizationEClass, EEFGroupStyleCustomization.class, "EEFGroupStyleCustomization", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEEFGroupStyleCustomization_Style(), this.getEEFGroupStyle(), null, "style", null, 0, 1, EEFGroupStyleCustomization.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eefTextStyleEClass, EEFTextStyle.class, "EEFTextStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getEEFTextStyle_BackgroundColorExpression(), theExpressionPackage.getExpression(), "backgroundColorExpression", null, 0, 1, //$NON-NLS-1$
				EEFTextStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFTextStyle_ForegroundColorExpression(), theExpressionPackage.getExpression(), "foregroundColorExpression", null, 0, 1, //$NON-NLS-1$
				EEFTextStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eefTextConditionalStyleEClass, EEFTextConditionalStyle.class, "EEFTextConditionalStyle", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEEFTextConditionalStyle_Style(), this.getEEFTextStyle(), null, "style", null, 0, 1, EEFTextConditionalStyle.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eefTextStyleCustomizationEClass, EEFTextStyleCustomization.class, "EEFTextStyleCustomization", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEEFTextStyleCustomization_Style(), this.getEEFTextStyle(), null, "style", null, 0, 1, EEFTextStyleCustomization.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eefCheckboxStyleEClass, EEFCheckboxStyle.class, "EEFCheckboxStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getEEFCheckboxStyle_BackgroundColorExpression(), theExpressionPackage.getExpression(), "backgroundColorExpression", null, 0, 1, //$NON-NLS-1$
				EEFCheckboxStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFCheckboxStyle_ForegroundColorExpression(), theExpressionPackage.getExpression(), "foregroundColorExpression", null, 0, 1, //$NON-NLS-1$
				EEFCheckboxStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eefCheckboxConditionalStyleEClass, EEFCheckboxConditionalStyle.class, "EEFCheckboxConditionalStyle", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEEFCheckboxConditionalStyle_Style(), this.getEEFCheckboxStyle(), null, "style", null, 0, 1, //$NON-NLS-1$
				EEFCheckboxConditionalStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eefCheckboxStyleCustomizationEClass, EEFCheckboxStyleCustomization.class, "EEFCheckboxStyleCustomization", !IS_ABSTRACT, //$NON-NLS-1$
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEEFCheckboxStyleCustomization_Style(), this.getEEFCheckboxStyle(), null, "style", null, 0, 1, //$NON-NLS-1$
				EEFCheckboxStyleCustomization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eefLabelStyleEClass, EEFLabelStyle.class, "EEFLabelStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getEEFLabelStyle_BackgroundColorExpression(), theExpressionPackage.getExpression(), "backgroundColorExpression", null, 0, 1, //$NON-NLS-1$
				EEFLabelStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFLabelStyle_ForegroundColorExpression(), theExpressionPackage.getExpression(), "foregroundColorExpression", null, 0, 1, //$NON-NLS-1$
				EEFLabelStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eefLabelConditionalStyleEClass, EEFLabelConditionalStyle.class, "EEFLabelConditionalStyle", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEEFLabelConditionalStyle_Style(), this.getEEFLabelStyle(), null, "style", null, 0, 1, EEFLabelConditionalStyle.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eefLabelStyleCustomizationEClass, EEFLabelStyleCustomization.class, "EEFLabelStyleCustomization", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEEFLabelStyleCustomization_Style(), this.getEEFLabelStyle(), null, "style", null, 0, 1, EEFLabelStyleCustomization.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eefRadioStyleEClass, EEFRadioStyle.class, "EEFRadioStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getEEFRadioStyle_BackgroundColorExpression(), theExpressionPackage.getExpression(), "backgroundColorExpression", null, 0, 1, //$NON-NLS-1$
				EEFRadioStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFRadioStyle_ForegroundColorExpression(), theExpressionPackage.getExpression(), "foregroundColorExpression", null, 0, 1, //$NON-NLS-1$
				EEFRadioStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eefRadioConditionalStyleEClass, EEFRadioConditionalStyle.class, "EEFRadioConditionalStyle", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEEFRadioConditionalStyle_Style(), this.getEEFRadioStyle(), null, "style", null, 0, 1, EEFRadioConditionalStyle.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eefRadioStyleCustomizationEClass, EEFRadioStyleCustomization.class, "EEFRadioStyleCustomization", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEEFRadioStyleCustomization_Style(), this.getEEFRadioStyle(), null, "style", null, 0, 1, EEFRadioStyleCustomization.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eefLinkStyleEClass, EEFLinkStyle.class, "EEFLinkStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getEEFLinkStyle_BackgroundColorExpression(), theExpressionPackage.getExpression(), "backgroundColorExpression", null, 0, 1, //$NON-NLS-1$
				EEFLinkStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFLinkStyle_ForegroundColorExpression(), theExpressionPackage.getExpression(), "foregroundColorExpression", null, 0, 1, //$NON-NLS-1$
				EEFLinkStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFLinkStyle_BackgroundImageExpression(), theExpressionPackage.getExpression(), "backgroundImageExpression", null, 0, 1, //$NON-NLS-1$
				EEFLinkStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eefLinkConditionalStyleEClass, EEFLinkConditionalStyle.class, "EEFLinkConditionalStyle", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEEFLinkConditionalStyle_Style(), this.getEEFLinkStyle(), null, "style", null, 0, 1, EEFLinkConditionalStyle.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eefLinkStyleCustomizationEClass, EEFLinkStyleCustomization.class, "EEFLinkStyleCustomization", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEEFLinkStyleCustomization_Style(), this.getEEFLinkStyle(), null, "style", null, 0, 1, EEFLinkStyleCustomization.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eefSelectStyleEClass, EEFSelectStyle.class, "EEFSelectStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getEEFSelectStyle_BackgroundColorExpression(), theExpressionPackage.getExpression(), "backgroundColorExpression", null, 0, 1, //$NON-NLS-1$
				EEFSelectStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFSelectStyle_ForegroundColorExpression(), theExpressionPackage.getExpression(), "foregroundColorExpression", null, 0, 1, //$NON-NLS-1$
				EEFSelectStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eefSelectConditionalStyleEClass, EEFSelectConditionalStyle.class, "EEFSelectConditionalStyle", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEEFSelectConditionalStyle_Style(), this.getEEFSelectStyle(), null, "style", null, 0, 1, EEFSelectConditionalStyle.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eefSelectStyleCustomizationEClass, EEFSelectStyleCustomization.class, "EEFSelectStyleCustomization", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEEFSelectStyleCustomization_Style(), this.getEEFSelectStyle(), null, "style", null, 0, 1, EEFSelectStyleCustomization.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eefTreeStyleEClass, EEFTreeStyle.class, "EEFTreeStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(eefTreeConditionalStyleEClass, EEFTreeConditionalStyle.class, "EEFTreeConditionalStyle", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEEFTreeConditionalStyle_Style(), this.getEEFTreeStyle(), null, "style", null, 0, 1, EEFTreeConditionalStyle.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eefTreeStyleCustomizationEClass, EEFTreeStyleCustomization.class, "EEFTreeStyleCustomization", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEEFTreeStyleCustomization_Style(), this.getEEFTreeStyle(), null, "style", null, 0, 1, EEFTreeStyleCustomization.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eefTableStyleEClass, EEFTableStyle.class, "EEFTableStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(eefTableConditionalStyleEClass, EEFTableConditionalStyle.class, "EEFTableConditionalStyle", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEEFTableConditionalStyle_Style(), this.getEEFTableStyle(), null, "style", null, 0, 1, EEFTableConditionalStyle.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eefTableStyleCustomizationEClass, EEFTableStyleCustomization.class, "EEFTableStyleCustomization", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEEFTableStyleCustomization_Style(), this.getEEFTableStyle(), null, "style", null, 0, 1, EEFTableStyleCustomization.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eefLineStyleEClass, EEFLineStyle.class, "EEFLineStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getEEFLineStyle_BackgroundColorExpression(), theExpressionPackage.getExpression(), "backgroundColorExpression", null, 0, 1, //$NON-NLS-1$
				EEFLineStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFLineStyle_ForegroundColorExpression(), theExpressionPackage.getExpression(), "foregroundColorExpression", null, 0, 1, //$NON-NLS-1$
				EEFLineStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFLineStyle_HeaderBackgroundColorExpression(), theExpressionPackage.getExpression(), "headerBackgroundColorExpression", //$NON-NLS-1$
				null, 0, 1, EEFLineStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getEEFLineStyle_HeaderForegroundColorExpression(), theExpressionPackage.getExpression(), "headerForegroundColorExpression", //$NON-NLS-1$
				null, 0, 1, EEFLineStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(eefLineConditionalStyleEClass, EEFLineConditionalStyle.class, "EEFLineConditionalStyle", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEEFLineConditionalStyle_Style(), this.getEEFLineStyle(), null, "style", null, 0, 1, EEFLineConditionalStyle.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eefLineStyleCustomizationEClass, EEFLineStyleCustomization.class, "EEFLineStyleCustomization", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEEFLineStyleCustomization_Style(), this.getEEFLineStyle(), null, "style", null, 0, 1, EEFLineStyleCustomization.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eefColumnStyleEClass, EEFColumnStyle.class, "EEFColumnStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getEEFColumnStyle_BackgroundColorExpression(), theExpressionPackage.getExpression(), "backgroundColorExpression", null, 0, 1, //$NON-NLS-1$
				EEFColumnStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFColumnStyle_ForegroundColorExpression(), theExpressionPackage.getExpression(), "foregroundColorExpression", null, 0, 1, //$NON-NLS-1$
				EEFColumnStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFColumnStyle_HeaderBackgroundColorExpression(), theExpressionPackage.getExpression(), "headerBackgroundColorExpression", //$NON-NLS-1$
				null, 0, 1, EEFColumnStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getEEFColumnStyle_HeaderForegroundColorExpression(), theExpressionPackage.getExpression(), "headerForegroundColorExpression", //$NON-NLS-1$
				null, 0, 1, EEFColumnStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(eefColumnConditionalStyleEClass, EEFColumnConditionalStyle.class, "EEFColumnConditionalStyle", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEEFColumnConditionalStyle_Style(), this.getEEFColumnStyle(), null, "style", null, 0, 1, EEFColumnConditionalStyle.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eefColumnStyleCustomizationEClass, EEFColumnStyleCustomization.class, "EEFColumnStyleCustomization", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEEFColumnStyleCustomization_Style(), this.getEEFColumnStyle(), null, "style", null, 0, 1, EEFColumnStyleCustomization.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eefQuickFixEClass, EEFQuickFix.class, "EEFQuickFix", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getEEFQuickFix_TitleExpression(), theExpressionPackage.getExpression(), "titleExpression", null, 0, 1, EEFQuickFix.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFQuickFix_MessageExpression(), theExpressionPackage.getExpression(), "messageExpression", null, 0, 1, EEFQuickFix.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFQuickFix_CanHandleStatusExpression(), theExpressionPackage.getExpression(), "canHandleStatusExpression", null, 0, 1, //$NON-NLS-1$
				EEFQuickFix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFQuickFix_FixExpression(), theExpressionPackage.getExpression(), "fixExpression", null, 0, 1, EEFQuickFix.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eefValidationEClass, EEFValidation.class, "EEFValidation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getEEFValidation_ValidationExpression(), theExpressionPackage.getExpression(), "validationExpression", null, 0, 1, //$NON-NLS-1$
				EEFValidation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEEFValidation_Quickfixes(), this.getEEFQuickFix(), null, "quickfixes", null, 0, -1, EEFValidation.class, !IS_TRANSIENT, //$NON-NLS-1$
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(typeNameEDataType, String.class, "TypeName", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		// Create resource
		createResource(eNS_URI);
	}

} //EefPackageImpl
