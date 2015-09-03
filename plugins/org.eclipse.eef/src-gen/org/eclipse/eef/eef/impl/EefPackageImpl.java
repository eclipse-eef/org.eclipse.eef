/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef.eef.impl;

import org.eclipse.eef.eef.ContextableElement;
import org.eclipse.eef.eef.EEFAdapterFactoryTableStructureDescription;
import org.eclipse.eef.eef.EEFAdapterFactoryTreeStructureDescription;
import org.eclipse.eef.eef.EEFCellWidgetDescription;
import org.eclipse.eef.eef.EEFCheckboxDescription;
import org.eclipse.eef.eef.EEFColumnDescription;
import org.eclipse.eef.eef.EEFContainerDescription;
import org.eclipse.eef.eef.EEFGroupDescription;
import org.eclipse.eef.eef.EEFImageDescription;
import org.eclipse.eef.eef.EEFImagePickerDescription;
import org.eclipse.eef.eef.EEFInterpretedTableStructureDescription;
import org.eclipse.eef.eef.EEFInterpretedTreeStructureDescription;
import org.eclipse.eef.eef.EEFJavaExtensionDescription;
import org.eclipse.eef.eef.EEFLabelDescription;
import org.eclipse.eef.eef.EEFLineDescription;
import org.eclipse.eef.eef.EEFLinkDescription;
import org.eclipse.eef.eef.EEFPageDescription;
import org.eclipse.eef.eef.EEFRadioDescription;
import org.eclipse.eef.eef.EEFSelectDescription;
import org.eclipse.eef.eef.EEFTableDescription;
import org.eclipse.eef.eef.EEFTableStructureDescription;
import org.eclipse.eef.eef.EEFTextDescription;
import org.eclipse.eef.eef.EEFTreeDescription;
import org.eclipse.eef.eef.EEFTreeDialogSelectDescription;
import org.eclipse.eef.eef.EEFTreeStructureDescription;
import org.eclipse.eef.eef.EEFViewDescription;
import org.eclipse.eef.eef.EEFWidgetDescription;
import org.eclipse.eef.eef.EefFactory;
import org.eclipse.eef.eef.EefPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.sirius.context.context.ContextPackage;

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
	private EClass contextableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType expressionEDataType = null;

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
	 * @see org.eclipse.eef.eef.EefPackage#eNS_URI
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
		EefPackageImpl theEefPackage = (EefPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof EefPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new EefPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ContextPackage.eINSTANCE.eClass();

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
	public EAttribute getEEFViewDescription_LabelExpression() {
		return (EAttribute) eefViewDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFViewDescription_EPackageNsUris() {
		return (EAttribute) eefViewDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEEFViewDescription_Groups() {
		return (EReference) eefViewDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEEFViewDescription_Pages() {
		return (EReference) eefViewDescriptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEEFViewDescription_JavaExtensions() {
		return (EReference) eefViewDescriptionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEEFViewDescription_ImportedViews() {
		return (EReference) eefViewDescriptionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEEFViewDescription_TreeStructures() {
		return (EReference) eefViewDescriptionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEEFViewDescription_TableStructures() {
		return (EReference) eefViewDescriptionEClass.getEStructuralFeatures().get(8);
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
	public EAttribute getEEFPageDescription_LabelExpression() {
		return (EAttribute) eefPageDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFPageDescription_DomainClass() {
		return (EAttribute) eefPageDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFPageDescription_SemanticCandidateExpression() {
		return (EAttribute) eefPageDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEEFPageDescription_Groups() {
		return (EReference) eefPageDescriptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEEFPageDescription_ExtendedPage() {
		return (EReference) eefPageDescriptionEClass.getEStructuralFeatures().get(5);
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
	public EAttribute getEEFGroupDescription_LabelExpression() {
		return (EAttribute) eefGroupDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFGroupDescription_DomainClass() {
		return (EAttribute) eefGroupDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFGroupDescription_SemanticCandidatesExpression() {
		return (EAttribute) eefGroupDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEEFGroupDescription_Container() {
		return (EReference) eefGroupDescriptionEClass.getEStructuralFeatures().get(4);
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
	public EAttribute getEEFContainerDescription_SemanticCandidatesExpression() {
		return (EAttribute) eefContainerDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFContainerDescription_DomainClass() {
		return (EAttribute) eefContainerDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFContainerDescription_LayoutColumnCount() {
		return (EAttribute) eefContainerDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEEFContainerDescription_Containers() {
		return (EReference) eefContainerDescriptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEEFContainerDescription_Widgets() {
		return (EReference) eefContainerDescriptionEClass.getEStructuralFeatures().get(5);
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
	public EAttribute getEEFWidgetDescription_LabelExpression() {
		return (EAttribute) eefWidgetDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEFWidgetDescription_FeatureCandidatesExpression() {
		return (EAttribute) eefWidgetDescriptionEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getEEFTextDescription_LineCount() {
		return (EAttribute) eefTextDescriptionEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getEEFColumnDescription_ContextCandidatesExpression() {
		return (EAttribute) eefColumnDescriptionEClass.getEStructuralFeatures().get(3);
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
	public EClass getContextableElement() {
		return contextableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContextableElement_RequiredContextVariables() {
		return (EReference) contextableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContextableElement_ExcludedContextVariables() {
		return (EReference) contextableElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getExpression() {
		return expressionEDataType;
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
		createEAttribute(eefViewDescriptionEClass, EEF_VIEW_DESCRIPTION__LABEL_EXPRESSION);
		createEAttribute(eefViewDescriptionEClass, EEF_VIEW_DESCRIPTION__EPACKAGE_NS_URIS);
		createEReference(eefViewDescriptionEClass, EEF_VIEW_DESCRIPTION__GROUPS);
		createEReference(eefViewDescriptionEClass, EEF_VIEW_DESCRIPTION__PAGES);
		createEReference(eefViewDescriptionEClass, EEF_VIEW_DESCRIPTION__JAVA_EXTENSIONS);
		createEReference(eefViewDescriptionEClass, EEF_VIEW_DESCRIPTION__IMPORTED_VIEWS);
		createEReference(eefViewDescriptionEClass, EEF_VIEW_DESCRIPTION__TREE_STRUCTURES);
		createEReference(eefViewDescriptionEClass, EEF_VIEW_DESCRIPTION__TABLE_STRUCTURES);

		eefPageDescriptionEClass = createEClass(EEF_PAGE_DESCRIPTION);
		createEAttribute(eefPageDescriptionEClass, EEF_PAGE_DESCRIPTION__IDENTIFIER);
		createEAttribute(eefPageDescriptionEClass, EEF_PAGE_DESCRIPTION__LABEL_EXPRESSION);
		createEAttribute(eefPageDescriptionEClass, EEF_PAGE_DESCRIPTION__DOMAIN_CLASS);
		createEAttribute(eefPageDescriptionEClass, EEF_PAGE_DESCRIPTION__SEMANTIC_CANDIDATE_EXPRESSION);
		createEReference(eefPageDescriptionEClass, EEF_PAGE_DESCRIPTION__GROUPS);
		createEReference(eefPageDescriptionEClass, EEF_PAGE_DESCRIPTION__EXTENDED_PAGE);

		eefGroupDescriptionEClass = createEClass(EEF_GROUP_DESCRIPTION);
		createEAttribute(eefGroupDescriptionEClass, EEF_GROUP_DESCRIPTION__IDENTIFIER);
		createEAttribute(eefGroupDescriptionEClass, EEF_GROUP_DESCRIPTION__LABEL_EXPRESSION);
		createEAttribute(eefGroupDescriptionEClass, EEF_GROUP_DESCRIPTION__DOMAIN_CLASS);
		createEAttribute(eefGroupDescriptionEClass, EEF_GROUP_DESCRIPTION__SEMANTIC_CANDIDATES_EXPRESSION);
		createEReference(eefGroupDescriptionEClass, EEF_GROUP_DESCRIPTION__CONTAINER);

		eefContainerDescriptionEClass = createEClass(EEF_CONTAINER_DESCRIPTION);
		createEAttribute(eefContainerDescriptionEClass, EEF_CONTAINER_DESCRIPTION__IDENTIFIER);
		createEAttribute(eefContainerDescriptionEClass, EEF_CONTAINER_DESCRIPTION__SEMANTIC_CANDIDATES_EXPRESSION);
		createEAttribute(eefContainerDescriptionEClass, EEF_CONTAINER_DESCRIPTION__DOMAIN_CLASS);
		createEAttribute(eefContainerDescriptionEClass, EEF_CONTAINER_DESCRIPTION__LAYOUT_COLUMN_COUNT);
		createEReference(eefContainerDescriptionEClass, EEF_CONTAINER_DESCRIPTION__CONTAINERS);
		createEReference(eefContainerDescriptionEClass, EEF_CONTAINER_DESCRIPTION__WIDGETS);

		eefWidgetDescriptionEClass = createEClass(EEF_WIDGET_DESCRIPTION);
		createEAttribute(eefWidgetDescriptionEClass, EEF_WIDGET_DESCRIPTION__IDENTIFIER);
		createEAttribute(eefWidgetDescriptionEClass, EEF_WIDGET_DESCRIPTION__LABEL_EXPRESSION);
		createEAttribute(eefWidgetDescriptionEClass, EEF_WIDGET_DESCRIPTION__FEATURE_CANDIDATES_EXPRESSION);

		eefJavaExtensionDescriptionEClass = createEClass(EEF_JAVA_EXTENSION_DESCRIPTION);
		createEAttribute(eefJavaExtensionDescriptionEClass, EEF_JAVA_EXTENSION_DESCRIPTION__QUALIFIED_NAME);

		eefTreeStructureDescriptionEClass = createEClass(EEF_TREE_STRUCTURE_DESCRIPTION);
		createEAttribute(eefTreeStructureDescriptionEClass, EEF_TREE_STRUCTURE_DESCRIPTION__IDENTIFIER);
		createEAttribute(eefTreeStructureDescriptionEClass, EEF_TREE_STRUCTURE_DESCRIPTION__MULTIPLE);

		eefInterpretedTableStructureDescriptionEClass = createEClass(EEF_INTERPRETED_TABLE_STRUCTURE_DESCRIPTION);
		createEReference(eefInterpretedTableStructureDescriptionEClass,
				EEF_INTERPRETED_TABLE_STRUCTURE_DESCRIPTION__COLUMNS);
		createEReference(eefInterpretedTableStructureDescriptionEClass,
				EEF_INTERPRETED_TABLE_STRUCTURE_DESCRIPTION__LINE);

		eefCellWidgetDescriptionEClass = createEClass(EEF_CELL_WIDGET_DESCRIPTION);

		eefAdapterFactoryTreeStructureDescriptionEClass = createEClass(EEF_ADAPTER_FACTORY_TREE_STRUCTURE_DESCRIPTION);
		createEAttribute(eefAdapterFactoryTreeStructureDescriptionEClass,
				EEF_ADAPTER_FACTORY_TREE_STRUCTURE_DESCRIPTION__ADAPTER_FACTORY_PROVIDER);

		eefInterpretedTreeStructureDescriptionEClass = createEClass(EEF_INTERPRETED_TREE_STRUCTURE_DESCRIPTION);
		createEAttribute(eefInterpretedTreeStructureDescriptionEClass,
				EEF_INTERPRETED_TREE_STRUCTURE_DESCRIPTION__ROOTS_EXPRESSION);
		createEAttribute(eefInterpretedTreeStructureDescriptionEClass,
				EEF_INTERPRETED_TREE_STRUCTURE_DESCRIPTION__CHILDREN_EXPRESSION);
		createEAttribute(eefInterpretedTreeStructureDescriptionEClass,
				EEF_INTERPRETED_TREE_STRUCTURE_DESCRIPTION__SELECTABLE_PREDICATE_EXPRESSION);
		createEAttribute(eefInterpretedTreeStructureDescriptionEClass,
				EEF_INTERPRETED_TREE_STRUCTURE_DESCRIPTION__CANDIDATE_DISPLAY_EXPRESSION);

		eefTextDescriptionEClass = createEClass(EEF_TEXT_DESCRIPTION);
		createEAttribute(eefTextDescriptionEClass, EEF_TEXT_DESCRIPTION__VALUE_EXPRESSION);
		createEAttribute(eefTextDescriptionEClass, EEF_TEXT_DESCRIPTION__EDIT_EXPRESSION);
		createEAttribute(eefTextDescriptionEClass, EEF_TEXT_DESCRIPTION__LINE_COUNT);

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
		createEAttribute(eefTreeDialogSelectDescriptionEClass,
				EEF_TREE_DIALOG_SELECT_DESCRIPTION__SEMANTIC_CANDIDATE_EXPRESSION);
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
		createEAttribute(eefColumnDescriptionEClass, EEF_COLUMN_DESCRIPTION__CONTEXT_CANDIDATES_EXPRESSION);

		eefLineDescriptionEClass = createEClass(EEF_LINE_DESCRIPTION);
		createEAttribute(eefLineDescriptionEClass, EEF_LINE_DESCRIPTION__HEADER_EXPRESSION);
		createEAttribute(eefLineDescriptionEClass, EEF_LINE_DESCRIPTION__SEMANTIC_CANDIDATES_EXPRESSION);
		createEAttribute(eefLineDescriptionEClass, EEF_LINE_DESCRIPTION__DOMAIN_CLASS);
		createEReference(eefLineDescriptionEClass, EEF_LINE_DESCRIPTION__SUB_LINES);

		eefTableStructureDescriptionEClass = createEClass(EEF_TABLE_STRUCTURE_DESCRIPTION);
		createEAttribute(eefTableStructureDescriptionEClass, EEF_TABLE_STRUCTURE_DESCRIPTION__MULTIPLE);
		createEAttribute(eefTableStructureDescriptionEClass, EEF_TABLE_STRUCTURE_DESCRIPTION__IDENTIFIER);

		eefAdapterFactoryTableStructureDescriptionEClass = createEClass(
				EEF_ADAPTER_FACTORY_TABLE_STRUCTURE_DESCRIPTION);
		createEAttribute(eefAdapterFactoryTableStructureDescriptionEClass,
				EEF_ADAPTER_FACTORY_TABLE_STRUCTURE_DESCRIPTION__ADAPTER_FACTORY_PROVIDER);

		contextableElementEClass = createEClass(CONTEXTABLE_ELEMENT);
		createEReference(contextableElementEClass, CONTEXTABLE_ELEMENT__REQUIRED_CONTEXT_VARIABLES);
		createEReference(contextableElementEClass, CONTEXTABLE_ELEMENT__EXCLUDED_CONTEXT_VARIABLES);

		// Create data types
		expressionEDataType = createEDataType(EXPRESSION);
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
		ContextPackage theContextPackage = (ContextPackage) EPackage.Registry.INSTANCE
				.getEPackage(ContextPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		eefViewDescriptionEClass.getESuperTypes().add(this.getContextableElement());
		eefPageDescriptionEClass.getESuperTypes().add(this.getContextableElement());
		eefGroupDescriptionEClass.getESuperTypes().add(this.getContextableElement());
		eefContainerDescriptionEClass.getESuperTypes().add(this.getContextableElement());
		eefWidgetDescriptionEClass.getESuperTypes().add(this.getContextableElement());
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

		// Initialize classes and features; add operations and parameters
		initEClass(eefViewDescriptionEClass, EEFViewDescription.class, "EEFViewDescription", !IS_ABSTRACT, //$NON-NLS-1$
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFViewDescription_Identifier(), ecorePackage.getEString(), "identifier", null, 1, 1, //$NON-NLS-1$
				EEFViewDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFViewDescription_LabelExpression(), this.getExpression(), "labelExpression", null, 0, 1, //$NON-NLS-1$
				EEFViewDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFViewDescription_EPackageNsUris(), ecorePackage.getEString(), "ePackageNsUris", null, 0, -1, //$NON-NLS-1$
				EEFViewDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getEEFViewDescription_Groups(), this.getEEFGroupDescription(), null, "groups", null, 0, -1, //$NON-NLS-1$
				EEFViewDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEEFViewDescription_Pages(), this.getEEFPageDescription(), null, "pages", null, 1, -1, //$NON-NLS-1$
				EEFViewDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEEFViewDescription_JavaExtensions(), this.getEEFJavaExtensionDescription(), null,
				"javaExtensions", null, 0, -1, EEFViewDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, //$NON-NLS-1$
				IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEEFViewDescription_ImportedViews(), this.getEEFViewDescription(), null, "importedViews", null, //$NON-NLS-1$
				0, -1, EEFViewDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEEFViewDescription_TreeStructures(), this.getEEFTreeStructureDescription(), null,
				"treeStructures", null, 0, -1, EEFViewDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, //$NON-NLS-1$
				IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEEFViewDescription_TableStructures(), this.getEEFTableStructureDescription(), null,
				"tableStructures", null, 0, -1, EEFViewDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, //$NON-NLS-1$
				IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eefPageDescriptionEClass, EEFPageDescription.class, "EEFPageDescription", !IS_ABSTRACT, //$NON-NLS-1$
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFPageDescription_Identifier(), ecorePackage.getEString(), "identifier", null, 1, 1, //$NON-NLS-1$
				EEFPageDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFPageDescription_LabelExpression(), this.getExpression(), "labelExpression", null, 0, 1, //$NON-NLS-1$
				EEFPageDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFPageDescription_DomainClass(), this.getTypeName(), "domainClass", null, 0, 1, //$NON-NLS-1$
				EEFPageDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFPageDescription_SemanticCandidateExpression(), this.getExpression(),
				"semanticCandidateExpression", "", 0, 1, EEFPageDescription.class, !IS_TRANSIENT, !IS_VOLATILE, //$NON-NLS-1$//$NON-NLS-2$
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEEFPageDescription_Groups(), this.getEEFGroupDescription(), null, "groups", null, 0, -1, //$NON-NLS-1$
				EEFPageDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEEFPageDescription_ExtendedPage(), this.getEEFPageDescription(), null, "extendedPage", null, //$NON-NLS-1$
				0, 1, EEFPageDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eefGroupDescriptionEClass, EEFGroupDescription.class, "EEFGroupDescription", !IS_ABSTRACT, //$NON-NLS-1$
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFGroupDescription_Identifier(), ecorePackage.getEString(), "identifier", null, 1, 1, //$NON-NLS-1$
				EEFGroupDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFGroupDescription_LabelExpression(), this.getExpression(), "labelExpression", null, 0, 1, //$NON-NLS-1$
				EEFGroupDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFGroupDescription_DomainClass(), this.getTypeName(), "domainClass", null, 0, 1, //$NON-NLS-1$
				EEFGroupDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFGroupDescription_SemanticCandidatesExpression(), this.getExpression(),
				"semanticCandidatesExpression", null, 0, 1, EEFGroupDescription.class, !IS_TRANSIENT, !IS_VOLATILE, //$NON-NLS-1$
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEEFGroupDescription_Container(), this.getEEFContainerDescription(), null, "container", null, //$NON-NLS-1$
				1, 1, EEFGroupDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eefContainerDescriptionEClass, EEFContainerDescription.class, "EEFContainerDescription", //$NON-NLS-1$
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFContainerDescription_Identifier(), ecorePackage.getEString(), "identifier", null, 1, 1, //$NON-NLS-1$
				EEFContainerDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFContainerDescription_SemanticCandidatesExpression(), this.getExpression(),
				"semanticCandidatesExpression", null, 0, 1, EEFContainerDescription.class, !IS_TRANSIENT, !IS_VOLATILE, //$NON-NLS-1$
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFContainerDescription_DomainClass(), this.getTypeName(), "domainClass", null, 0, 1, //$NON-NLS-1$
				EEFContainerDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFContainerDescription_LayoutColumnCount(), ecorePackage.getEInt(), "layoutColumnCount", "1", //$NON-NLS-1$//$NON-NLS-2$
				0, 1, EEFContainerDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEEFContainerDescription_Containers(), this.getEEFContainerDescription(), null, "containers", //$NON-NLS-1$
				null, 0, -1, EEFContainerDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEEFContainerDescription_Widgets(), this.getEEFWidgetDescription(), null, "widgets", null, 1, //$NON-NLS-1$
				-1, EEFContainerDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eefWidgetDescriptionEClass, EEFWidgetDescription.class, "EEFWidgetDescription", IS_ABSTRACT, //$NON-NLS-1$
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFWidgetDescription_Identifier(), ecorePackage.getEString(), "identifier", null, 1, 1, //$NON-NLS-1$
				EEFWidgetDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFWidgetDescription_LabelExpression(), this.getExpression(), "labelExpression", null, 0, 1, //$NON-NLS-1$
				EEFWidgetDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFWidgetDescription_FeatureCandidatesExpression(), this.getExpression(),
				"featureCandidatesExpression", null, 0, 1, EEFWidgetDescription.class, !IS_TRANSIENT, !IS_VOLATILE, //$NON-NLS-1$
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eefJavaExtensionDescriptionEClass, EEFJavaExtensionDescription.class, "EEFJavaExtensionDescription", //$NON-NLS-1$
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFJavaExtensionDescription_QualifiedName(), ecorePackage.getEString(), "qualifiedName", null, //$NON-NLS-1$
				0, 1, EEFJavaExtensionDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eefTreeStructureDescriptionEClass, EEFTreeStructureDescription.class, "EEFTreeStructureDescription", //$NON-NLS-1$
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFTreeStructureDescription_Identifier(), ecorePackage.getEString(), "identifier", null, 1, 1, //$NON-NLS-1$
				EEFTreeStructureDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFTreeStructureDescription_Multiple(), ecorePackage.getEBoolean(), "multiple", null, 0, 1, //$NON-NLS-1$
				EEFTreeStructureDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eefInterpretedTableStructureDescriptionEClass, EEFInterpretedTableStructureDescription.class,
				"EEFInterpretedTableStructureDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getEEFInterpretedTableStructureDescription_Columns(), this.getEEFColumnDescription(), null,
				"columns", null, 0, -1, EEFInterpretedTableStructureDescription.class, !IS_TRANSIENT, !IS_VOLATILE, //$NON-NLS-1$
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEEFInterpretedTableStructureDescription_Line(), this.getEEFLineDescription(), null, "line", //$NON-NLS-1$
				null, 0, 1, EEFInterpretedTableStructureDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eefCellWidgetDescriptionEClass, EEFCellWidgetDescription.class, "EEFCellWidgetDescription", //$NON-NLS-1$
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eefAdapterFactoryTreeStructureDescriptionEClass, EEFAdapterFactoryTreeStructureDescription.class,
				"EEFAdapterFactoryTreeStructureDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getEEFAdapterFactoryTreeStructureDescription_AdapterFactoryProvider(), ecorePackage.getEString(),
				"adapterFactoryProvider", null, 0, 1, EEFAdapterFactoryTreeStructureDescription.class, !IS_TRANSIENT, //$NON-NLS-1$
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eefInterpretedTreeStructureDescriptionEClass, EEFInterpretedTreeStructureDescription.class,
				"EEFInterpretedTreeStructureDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getEEFInterpretedTreeStructureDescription_RootsExpression(), this.getExpression(),
				"rootsExpression", null, 0, 1, EEFInterpretedTreeStructureDescription.class, !IS_TRANSIENT, //$NON-NLS-1$
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFInterpretedTreeStructureDescription_ChildrenExpression(), this.getExpression(),
				"childrenExpression", null, 0, 1, EEFInterpretedTreeStructureDescription.class, !IS_TRANSIENT, //$NON-NLS-1$
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFInterpretedTreeStructureDescription_SelectablePredicateExpression(), this.getExpression(),
				"selectablePredicateExpression", null, 0, 1, EEFInterpretedTreeStructureDescription.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFInterpretedTreeStructureDescription_CandidateDisplayExpression(), this.getExpression(),
				"candidateDisplayExpression", null, 0, 1, EEFInterpretedTreeStructureDescription.class, !IS_TRANSIENT, //$NON-NLS-1$
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eefTextDescriptionEClass, EEFTextDescription.class, "EEFTextDescription", !IS_ABSTRACT, //$NON-NLS-1$
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFTextDescription_ValueExpression(), this.getExpression(), "valueExpression", null, 0, 1, //$NON-NLS-1$
				EEFTextDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFTextDescription_EditExpression(), this.getExpression(), "editExpression", null, 0, 1, //$NON-NLS-1$
				EEFTextDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFTextDescription_LineCount(), ecorePackage.getEInt(), "lineCount", "1", 0, 1, //$NON-NLS-1$//$NON-NLS-2$
				EEFTextDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(eefCheckboxDescriptionEClass, EEFCheckboxDescription.class, "EEFCheckboxDescription", !IS_ABSTRACT, //$NON-NLS-1$
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFCheckboxDescription_ValueExpression(), this.getExpression(), "valueExpression", null, 0, 1, //$NON-NLS-1$
				EEFCheckboxDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFCheckboxDescription_EditExpression(), this.getExpression(), "editExpression", null, 0, 1, //$NON-NLS-1$
				EEFCheckboxDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eefSelectDescriptionEClass, EEFSelectDescription.class, "EEFSelectDescription", !IS_ABSTRACT, //$NON-NLS-1$
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFSelectDescription_ValueExpression(), this.getExpression(), "valueExpression", null, 0, 1, //$NON-NLS-1$
				EEFSelectDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFSelectDescription_EditExpression(), this.getExpression(), "editExpression", null, 0, 1, //$NON-NLS-1$
				EEFSelectDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFSelectDescription_CandidatesExpression(), this.getExpression(), "candidatesExpression", //$NON-NLS-1$
				null, 0, 1, EEFSelectDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFSelectDescription_Multiple(), ecorePackage.getEBoolean(), "multiple", null, 0, 1, //$NON-NLS-1$
				EEFSelectDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFSelectDescription_CandidateDisplayExpression(), this.getExpression(),
				"candidateDisplayExpression", null, 0, 1, EEFSelectDescription.class, !IS_TRANSIENT, !IS_VOLATILE, //$NON-NLS-1$
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eefLabelDescriptionEClass, EEFLabelDescription.class, "EEFLabelDescription", !IS_ABSTRACT, //$NON-NLS-1$
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFLabelDescription_ValueExpression(), this.getExpression(), "valueExpression", null, 0, 1, //$NON-NLS-1$
				EEFLabelDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eefRadioDescriptionEClass, EEFRadioDescription.class, "EEFRadioDescription", !IS_ABSTRACT, //$NON-NLS-1$
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFRadioDescription_ValueExpression(), this.getExpression(), "valueExpression", null, 0, 1, //$NON-NLS-1$
				EEFRadioDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFRadioDescription_EditExpression(), this.getExpression(), "editExpression", null, 0, 1, //$NON-NLS-1$
				EEFRadioDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFRadioDescription_CandidatesExpression(), this.getExpression(), "candidatesExpression", //$NON-NLS-1$
				null, 0, 1, EEFRadioDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFRadioDescription_CandidateDisplayExpression(), this.getExpression(),
				"candidateDisplayExpression", null, 0, 1, EEFRadioDescription.class, !IS_TRANSIENT, !IS_VOLATILE, //$NON-NLS-1$
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eefTreeDialogSelectDescriptionEClass, EEFTreeDialogSelectDescription.class,
				"EEFTreeDialogSelectDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getEEFTreeDialogSelectDescription_SemanticCandidateExpression(), this.getExpression(),
				"semanticCandidateExpression", null, 0, 1, EEFTreeDialogSelectDescription.class, !IS_TRANSIENT, //$NON-NLS-1$
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFTreeDialogSelectDescription_DefaultFilter(), ecorePackage.getEString(), "defaultFilter", //$NON-NLS-1$
				"*", 0, 1, EEFTreeDialogSelectDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, //$NON-NLS-1$
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFTreeDialogSelectDescription_DomainClass(), this.getTypeName(), "domainClass", null, 0, 1, //$NON-NLS-1$
				EEFTreeDialogSelectDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEEFTreeDialogSelectDescription_Tree(), this.getEEFTreeDescription(), null, "tree", null, 0, 1, //$NON-NLS-1$
				EEFTreeDialogSelectDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eefLinkDescriptionEClass, EEFLinkDescription.class, "EEFLinkDescription", !IS_ABSTRACT, //$NON-NLS-1$
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFLinkDescription_OnClickExpression(), this.getExpression(), "onClickExpression", null, 0, 1, //$NON-NLS-1$
				EEFLinkDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(eefImageDescriptionEClass, EEFImageDescription.class, "EEFImageDescription", !IS_ABSTRACT, //$NON-NLS-1$
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFImageDescription_ValueExpression(), this.getExpression(), "valueExpression", null, 0, 1, //$NON-NLS-1$
				EEFImageDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eefTreeDescriptionEClass, EEFTreeDescription.class, "EEFTreeDescription", !IS_ABSTRACT, //$NON-NLS-1$
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFTreeDescription_ValueExpression(), this.getExpression(), "valueExpression", null, 0, 1, //$NON-NLS-1$
				EEFTreeDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getEEFTreeDescription_TreeStructure(), this.getEEFTreeStructureDescription(), null,
				"treeStructure", null, 0, 1, EEFTreeDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, //$NON-NLS-1$
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFTreeDescription_EditExpression(), this.getExpression(), "editExpression", null, 0, 1, //$NON-NLS-1$
				EEFTreeDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(eefImagePickerDescriptionEClass, EEFImagePickerDescription.class, "EEFImagePickerDescription", //$NON-NLS-1$
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFImagePickerDescription_ValueExpression(), this.getExpression(), "valueExpression", null, 0, //$NON-NLS-1$
				1, EEFImagePickerDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFImagePickerDescription_EditExpression(), this.getExpression(), "editExpression", null, 0, //$NON-NLS-1$
				1, EEFImagePickerDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFImagePickerDescription_CandidatesExpression(), this.getExpression(),
				"candidatesExpression", null, 0, 1, EEFImagePickerDescription.class, !IS_TRANSIENT, !IS_VOLATILE, //$NON-NLS-1$
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eefTableDescriptionEClass, EEFTableDescription.class, "EEFTableDescription", !IS_ABSTRACT, //$NON-NLS-1$
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFTableDescription_ValueExpression(), this.getExpression(), "valueExpression", null, 0, 1, //$NON-NLS-1$
				EEFTableDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFTableDescription_EditExpression(), this.getExpression(), "editExpression", null, 0, 1, //$NON-NLS-1$
				EEFTableDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEEFTableDescription_TableStructure(), this.getEEFTableStructureDescription(), null,
				"tableStructure", null, 0, 1, EEFTableDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, //$NON-NLS-1$
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eefColumnDescriptionEClass, EEFColumnDescription.class, "EEFColumnDescription", !IS_ABSTRACT, //$NON-NLS-1$
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFColumnDescription_Width(), ecorePackage.getEInt(), "width", null, 0, 1, //$NON-NLS-1$
				EEFColumnDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFColumnDescription_HeaderExpression(), this.getExpression(), "headerExpression", null, 0, 1, //$NON-NLS-1$
				EEFColumnDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEEFColumnDescription_CellWidget(), this.getEEFCellWidgetDescription(), null, "cellWidget", //$NON-NLS-1$
				null, 0, 1, EEFColumnDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFColumnDescription_ContextCandidatesExpression(), this.getExpression(),
				"contextCandidatesExpression", null, 0, 1, EEFColumnDescription.class, !IS_TRANSIENT, !IS_VOLATILE, //$NON-NLS-1$
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eefLineDescriptionEClass, EEFLineDescription.class, "EEFLineDescription", !IS_ABSTRACT, //$NON-NLS-1$
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFLineDescription_HeaderExpression(), ecorePackage.getEString(), "headerExpression", null, 0, //$NON-NLS-1$
				1, EEFLineDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFLineDescription_SemanticCandidatesExpression(), this.getExpression(),
				"semanticCandidatesExpression", null, 0, 1, EEFLineDescription.class, !IS_TRANSIENT, !IS_VOLATILE, //$NON-NLS-1$
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFLineDescription_DomainClass(), this.getTypeName(), "domainClass", null, 0, 1, //$NON-NLS-1$
				EEFLineDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getEEFLineDescription_SubLines(), this.getEEFLineDescription(), null, "subLines", null, 0, -1, //$NON-NLS-1$
				EEFLineDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eefTableStructureDescriptionEClass, EEFTableStructureDescription.class,
				"EEFTableStructureDescription", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getEEFTableStructureDescription_Multiple(), ecorePackage.getEBoolean(), "multiple", null, 0, 1, //$NON-NLS-1$
				EEFTableStructureDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFTableStructureDescription_Identifier(), ecorePackage.getEString(), "identifier", null, 1, //$NON-NLS-1$
				1, EEFTableStructureDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eefAdapterFactoryTableStructureDescriptionEClass, EEFAdapterFactoryTableStructureDescription.class,
				"EEFAdapterFactoryTableStructureDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getEEFAdapterFactoryTableStructureDescription_AdapterFactoryProvider(),
				ecorePackage.getEString(), "adapterFactoryProvider", null, 0, 1, //$NON-NLS-1$
				EEFAdapterFactoryTableStructureDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contextableElementEClass, ContextableElement.class, "ContextableElement", IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContextableElement_RequiredContextVariables(), theContextPackage.getContextVariable(), null,
				"requiredContextVariables", null, 0, -1, ContextableElement.class, !IS_TRANSIENT, !IS_VOLATILE, //$NON-NLS-1$
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextableElement_ExcludedContextVariables(), theContextPackage.getContextVariable(), null,
				"excludedContextVariables", null, 0, -1, ContextableElement.class, !IS_TRANSIENT, !IS_VOLATILE, //$NON-NLS-1$
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(expressionEDataType, String.class, "Expression", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(typeNameEDataType, String.class, "TypeName", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		// Create resource
		createResource(eNS_URI);
	}

} //EefPackageImpl
