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
import org.eclipse.eef.EEFDynamicMappingFor;
import org.eclipse.eef.EEFDynamicMappingIf;
import org.eclipse.eef.EEFGroupDescription;
import org.eclipse.eef.EEFLabelDescription;
import org.eclipse.eef.EEFMultipleReferencesDescription;
import org.eclipse.eef.EEFPageDescription;
import org.eclipse.eef.EEFRadioDescription;
import org.eclipse.eef.EEFSelectDescription;
import org.eclipse.eef.EEFSingleReferenceDescription;
import org.eclipse.eef.EEFTextDescription;
import org.eclipse.eef.EEFViewDescription;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.EefFactory;
import org.eclipse.eef.EefPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
	private EClass eefSingleReferenceDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass eefMultipleReferencesDescriptionEClass = null;

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
	public EAttribute getEEFPageDescription_SemanticCandidateExpression() {
		return (EAttribute) eefPageDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getEEFPageDescription_Groups() {
		return (EReference) eefPageDescriptionEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getEEFGroupDescription_SemanticCandidateExpression() {
		return (EAttribute) eefGroupDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getEEFGroupDescription_Container() {
		return (EReference) eefGroupDescriptionEClass.getEStructuralFeatures().get(3);
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
	public EClass getEEFSingleReferenceDescription() {
		return eefSingleReferenceDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getEEFSingleReferenceDescription_ValueExpression() {
		return (EAttribute) eefSingleReferenceDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getEEFSingleReferenceDescription_DisplayExpression() {
		return (EAttribute) eefSingleReferenceDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getEEFSingleReferenceDescription_OnClickExpression() {
		return (EAttribute) eefSingleReferenceDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getEEFSingleReferenceDescription_CreateExpression() {
		return (EAttribute) eefSingleReferenceDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getEEFSingleReferenceDescription_SearchExpression() {
		return (EAttribute) eefSingleReferenceDescriptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getEEFSingleReferenceDescription_UnsetExpression() {
		return (EAttribute) eefSingleReferenceDescriptionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getEEFMultipleReferencesDescription() {
		return eefMultipleReferencesDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getEEFMultipleReferencesDescription_ValueExpression() {
		return (EAttribute) eefMultipleReferencesDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getEEFMultipleReferencesDescription_DisplayExpression() {
		return (EAttribute) eefMultipleReferencesDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getEEFMultipleReferencesDescription_OnClickExpression() {
		return (EAttribute) eefMultipleReferencesDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getEEFMultipleReferencesDescription_CreateExpression() {
		return (EAttribute) eefMultipleReferencesDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getEEFMultipleReferencesDescription_SearchExpression() {
		return (EAttribute) eefMultipleReferencesDescriptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getEEFMultipleReferencesDescription_UnsetExpression() {
		return (EAttribute) eefMultipleReferencesDescriptionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getEEFMultipleReferencesDescription_UpExpression() {
		return (EAttribute) eefMultipleReferencesDescriptionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getEEFMultipleReferencesDescription_DownExpression() {
		return (EAttribute) eefMultipleReferencesDescriptionEClass.getEStructuralFeatures().get(7);
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
		createEAttribute(eefPageDescriptionEClass, EefPackage.EEF_PAGE_DESCRIPTION__SEMANTIC_CANDIDATE_EXPRESSION);
		createEReference(eefPageDescriptionEClass, EefPackage.EEF_PAGE_DESCRIPTION__GROUPS);

		eefGroupDescriptionEClass = createEClass(EefPackage.EEF_GROUP_DESCRIPTION);
		createEAttribute(eefGroupDescriptionEClass, EefPackage.EEF_GROUP_DESCRIPTION__IDENTIFIER);
		createEAttribute(eefGroupDescriptionEClass, EefPackage.EEF_GROUP_DESCRIPTION__LABEL_EXPRESSION);
		createEAttribute(eefGroupDescriptionEClass, EefPackage.EEF_GROUP_DESCRIPTION__SEMANTIC_CANDIDATE_EXPRESSION);
		createEReference(eefGroupDescriptionEClass, EefPackage.EEF_GROUP_DESCRIPTION__CONTAINER);

		eefContainerDescriptionEClass = createEClass(EefPackage.EEF_CONTAINER_DESCRIPTION);
		createEAttribute(eefContainerDescriptionEClass, EefPackage.EEF_CONTAINER_DESCRIPTION__IDENTIFIER);
		createEReference(eefContainerDescriptionEClass, EefPackage.EEF_CONTAINER_DESCRIPTION__WIDGETS);
		createEReference(eefContainerDescriptionEClass, EefPackage.EEF_CONTAINER_DESCRIPTION__DYNAMIC_MAPPINGS);

		eefWidgetDescriptionEClass = createEClass(EefPackage.EEF_WIDGET_DESCRIPTION);
		createEAttribute(eefWidgetDescriptionEClass, EefPackage.EEF_WIDGET_DESCRIPTION__IDENTIFIER);
		createEAttribute(eefWidgetDescriptionEClass, EefPackage.EEF_WIDGET_DESCRIPTION__LABEL_EXPRESSION);

		eefTextDescriptionEClass = createEClass(EefPackage.EEF_TEXT_DESCRIPTION);
		createEAttribute(eefTextDescriptionEClass, EefPackage.EEF_TEXT_DESCRIPTION__VALUE_EXPRESSION);
		createEAttribute(eefTextDescriptionEClass, EefPackage.EEF_TEXT_DESCRIPTION__EDIT_EXPRESSION);
		createEAttribute(eefTextDescriptionEClass, EefPackage.EEF_TEXT_DESCRIPTION__LINE_COUNT);

		eefLabelDescriptionEClass = createEClass(EefPackage.EEF_LABEL_DESCRIPTION);
		createEAttribute(eefLabelDescriptionEClass, EefPackage.EEF_LABEL_DESCRIPTION__BODY_EXPRESSION);

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

		eefSingleReferenceDescriptionEClass = createEClass(EefPackage.EEF_SINGLE_REFERENCE_DESCRIPTION);
		createEAttribute(eefSingleReferenceDescriptionEClass, EefPackage.EEF_SINGLE_REFERENCE_DESCRIPTION__VALUE_EXPRESSION);
		createEAttribute(eefSingleReferenceDescriptionEClass, EefPackage.EEF_SINGLE_REFERENCE_DESCRIPTION__DISPLAY_EXPRESSION);
		createEAttribute(eefSingleReferenceDescriptionEClass, EefPackage.EEF_SINGLE_REFERENCE_DESCRIPTION__ON_CLICK_EXPRESSION);
		createEAttribute(eefSingleReferenceDescriptionEClass, EefPackage.EEF_SINGLE_REFERENCE_DESCRIPTION__CREATE_EXPRESSION);
		createEAttribute(eefSingleReferenceDescriptionEClass, EefPackage.EEF_SINGLE_REFERENCE_DESCRIPTION__SEARCH_EXPRESSION);
		createEAttribute(eefSingleReferenceDescriptionEClass, EefPackage.EEF_SINGLE_REFERENCE_DESCRIPTION__UNSET_EXPRESSION);

		eefMultipleReferencesDescriptionEClass = createEClass(EefPackage.EEF_MULTIPLE_REFERENCES_DESCRIPTION);
		createEAttribute(eefMultipleReferencesDescriptionEClass, EefPackage.EEF_MULTIPLE_REFERENCES_DESCRIPTION__VALUE_EXPRESSION);
		createEAttribute(eefMultipleReferencesDescriptionEClass, EefPackage.EEF_MULTIPLE_REFERENCES_DESCRIPTION__DISPLAY_EXPRESSION);
		createEAttribute(eefMultipleReferencesDescriptionEClass, EefPackage.EEF_MULTIPLE_REFERENCES_DESCRIPTION__ON_CLICK_EXPRESSION);
		createEAttribute(eefMultipleReferencesDescriptionEClass, EefPackage.EEF_MULTIPLE_REFERENCES_DESCRIPTION__CREATE_EXPRESSION);
		createEAttribute(eefMultipleReferencesDescriptionEClass, EefPackage.EEF_MULTIPLE_REFERENCES_DESCRIPTION__SEARCH_EXPRESSION);
		createEAttribute(eefMultipleReferencesDescriptionEClass, EefPackage.EEF_MULTIPLE_REFERENCES_DESCRIPTION__UNSET_EXPRESSION);
		createEAttribute(eefMultipleReferencesDescriptionEClass, EefPackage.EEF_MULTIPLE_REFERENCES_DESCRIPTION__UP_EXPRESSION);
		createEAttribute(eefMultipleReferencesDescriptionEClass, EefPackage.EEF_MULTIPLE_REFERENCES_DESCRIPTION__DOWN_EXPRESSION);
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
		eefTextDescriptionEClass.getESuperTypes().add(this.getEEFWidgetDescription());
		eefLabelDescriptionEClass.getESuperTypes().add(this.getEEFWidgetDescription());
		eefButtonDescriptionEClass.getESuperTypes().add(this.getEEFWidgetDescription());
		eefCheckboxDescriptionEClass.getESuperTypes().add(this.getEEFWidgetDescription());
		eefSelectDescriptionEClass.getESuperTypes().add(this.getEEFWidgetDescription());
		eefRadioDescriptionEClass.getESuperTypes().add(this.getEEFWidgetDescription());
		eefSingleReferenceDescriptionEClass.getESuperTypes().add(this.getEEFWidgetDescription());
		eefMultipleReferencesDescriptionEClass.getESuperTypes().add(this.getEEFWidgetDescription());

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
				getEEFPageDescription_SemanticCandidateExpression(),
				ecorePackage.getEString(),
				"semanticCandidateExpression", "", 0, 1, EEFPageDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(
				getEEFPageDescription_Groups(),
				this.getEEFGroupDescription(),
				null,
				"groups", null, 0, -1, EEFPageDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_COMPOSITE, EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$

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
				getEEFGroupDescription_SemanticCandidateExpression(),
				ecorePackage.getEString(),
				"semanticCandidateExpression", null, 0, 1, EEFGroupDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getEEFGroupDescription_Container(),
				this.getEEFContainerDescription(),
				null,
				"container", null, 1, 1, EEFGroupDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, EPackageImpl.IS_COMPOSITE, EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$

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

		initEClass(eefLabelDescriptionEClass, EEFLabelDescription.class,
				"EEFLabelDescription", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getEEFLabelDescription_BodyExpression(),
				ecorePackage.getEString(),
				"bodyExpression", null, 0, 1, EEFLabelDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$

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

		initEClass(eefSingleReferenceDescriptionEClass, EEFSingleReferenceDescription.class,
				"EEFSingleReferenceDescription", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getEEFSingleReferenceDescription_ValueExpression(),
				theEcorePackage.getEString(),
				"valueExpression", null, 0, 1, EEFSingleReferenceDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getEEFSingleReferenceDescription_DisplayExpression(),
				theEcorePackage.getEString(),
				"displayExpression", null, 0, 1, EEFSingleReferenceDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getEEFSingleReferenceDescription_OnClickExpression(),
				theEcorePackage.getEString(),
				"onClickExpression", null, 0, 1, EEFSingleReferenceDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getEEFSingleReferenceDescription_CreateExpression(),
				theEcorePackage.getEString(),
				"createExpression", null, 0, 1, EEFSingleReferenceDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getEEFSingleReferenceDescription_SearchExpression(),
				theEcorePackage.getEString(),
				"searchExpression", null, 0, 1, EEFSingleReferenceDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getEEFSingleReferenceDescription_UnsetExpression(),
				theEcorePackage.getEString(),
				"unsetExpression", null, 0, 1, EEFSingleReferenceDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$

		initEClass(eefMultipleReferencesDescriptionEClass, EEFMultipleReferencesDescription.class,
				"EEFMultipleReferencesDescription", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getEEFMultipleReferencesDescription_ValueExpression(),
				theEcorePackage.getEString(),
				"valueExpression", null, 0, 1, EEFMultipleReferencesDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getEEFMultipleReferencesDescription_DisplayExpression(),
				theEcorePackage.getEString(),
				"displayExpression", null, 0, 1, EEFMultipleReferencesDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getEEFMultipleReferencesDescription_OnClickExpression(),
				theEcorePackage.getEString(),
				"onClickExpression", null, 0, 1, EEFMultipleReferencesDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getEEFMultipleReferencesDescription_CreateExpression(),
				theEcorePackage.getEString(),
				"createExpression", null, 0, 1, EEFMultipleReferencesDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getEEFMultipleReferencesDescription_SearchExpression(),
				theEcorePackage.getEString(),
				"searchExpression", null, 0, 1, EEFMultipleReferencesDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getEEFMultipleReferencesDescription_UnsetExpression(),
				theEcorePackage.getEString(),
				"unsetExpression", null, 0, 1, EEFMultipleReferencesDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getEEFMultipleReferencesDescription_UpExpression(),
				theEcorePackage.getEString(),
				"upExpression", null, 0, 1, EEFMultipleReferencesDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getEEFMultipleReferencesDescription_DownExpression(),
				theEcorePackage.getEString(),
				"downExpression", null, 0, 1, EEFMultipleReferencesDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED); //$NON-NLS-1$

		// Create resource
		createResource(EefPackage.eNS_URI);
	}

} // EefPackageImpl
