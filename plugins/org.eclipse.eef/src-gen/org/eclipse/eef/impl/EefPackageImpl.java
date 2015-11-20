/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef.impl;

import org.eclipse.eef.EEFContainerDescription;
import org.eclipse.eef.EEFGroupDescription;
import org.eclipse.eef.EEFPageDescription;
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
		EefPackageImpl theEefPackage = (EefPackageImpl) (EPackage.Registry.INSTANCE.get(EefPackage.eNS_URI) instanceof EefPackageImpl
				? EPackage.Registry.INSTANCE.get(EefPackage.eNS_URI) : new EefPackageImpl());

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

		eefWidgetDescriptionEClass = createEClass(EefPackage.EEF_WIDGET_DESCRIPTION);
		createEAttribute(eefWidgetDescriptionEClass, EefPackage.EEF_WIDGET_DESCRIPTION__IDENTIFIER);
		createEAttribute(eefWidgetDescriptionEClass, EefPackage.EEF_WIDGET_DESCRIPTION__LABEL_EXPRESSION);

		eefTextDescriptionEClass = createEClass(EefPackage.EEF_TEXT_DESCRIPTION);
		createEAttribute(eefTextDescriptionEClass, EefPackage.EEF_TEXT_DESCRIPTION__VALUE_EXPRESSION);
		createEAttribute(eefTextDescriptionEClass, EefPackage.EEF_TEXT_DESCRIPTION__EDIT_EXPRESSION);
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

		// Initialize classes and features; add operations and parameters
		initEClass(eefViewDescriptionEClass, EEFViewDescription.class, "EEFViewDescription", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, //$NON-NLS-1$
				EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFViewDescription_Identifier(), ecorePackage.getEString(), "identifier", null, 1, 1, EEFViewDescription.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID,
				EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEAttribute(getEEFViewDescription_LabelExpression(), theEcorePackage.getEString(), "labelExpression", null, 0, 1, EEFViewDescription.class, //$NON-NLS-1$
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
		initEReference(getEEFViewDescription_EPackages(), theEcorePackage.getEPackage(), null, "ePackages", null, 0, -1, EEFViewDescription.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_COMPOSITE,
				EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED,
				EPackageImpl.IS_ORDERED);

		initEClass(eefPageDescriptionEClass, EEFPageDescription.class, "EEFPageDescription", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, //$NON-NLS-1$
				EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFPageDescription_Identifier(), ecorePackage.getEString(), "identifier", null, 1, 1, EEFPageDescription.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID,
				EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEAttribute(getEEFPageDescription_LabelExpression(), ecorePackage.getEString(), "labelExpression", null, 0, 1, EEFPageDescription.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID,
				EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEAttribute(getEEFPageDescription_SemanticCandidateExpression(), ecorePackage.getEString(), "semanticCandidateExpression", "", 0, 1, //$NON-NLS-1$//$NON-NLS-2$
				EEFPageDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEReference(getEEFPageDescription_Groups(), this.getEEFGroupDescription(), null, "groups", null, 0, -1, EEFPageDescription.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_COMPOSITE,
				EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED,
				EPackageImpl.IS_ORDERED);

		initEClass(eefGroupDescriptionEClass, EEFGroupDescription.class, "EEFGroupDescription", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, //$NON-NLS-1$
				EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFGroupDescription_Identifier(), ecorePackage.getEString(), "identifier", null, 1, 1, EEFGroupDescription.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID,
				EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEAttribute(getEEFGroupDescription_LabelExpression(), ecorePackage.getEString(), "labelExpression", null, 0, 1, EEFGroupDescription.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID,
				EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEAttribute(getEEFGroupDescription_SemanticCandidateExpression(), ecorePackage.getEString(), "semanticCandidateExpression", null, 0, 1, //$NON-NLS-1$
				EEFGroupDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEReference(getEEFGroupDescription_Container(), this.getEEFContainerDescription(), null, "container", null, 1, 1, //$NON-NLS-1$
				EEFGroupDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				EPackageImpl.IS_COMPOSITE, EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE,
				!EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);

		initEClass(eefContainerDescriptionEClass, EEFContainerDescription.class, "EEFContainerDescription", !EPackageImpl.IS_ABSTRACT, //$NON-NLS-1$
				!EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFContainerDescription_Identifier(), ecorePackage.getEString(), "identifier", null, 1, 1, EEFContainerDescription.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID,
				EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEReference(getEEFContainerDescription_Widgets(), this.getEEFWidgetDescription(), null, "widgets", null, 1, -1, //$NON-NLS-1$
				EEFContainerDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				EPackageImpl.IS_COMPOSITE, EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE,
				!EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);

		initEClass(eefWidgetDescriptionEClass, EEFWidgetDescription.class, "EEFWidgetDescription", EPackageImpl.IS_ABSTRACT, //$NON-NLS-1$
				!EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFWidgetDescription_Identifier(), ecorePackage.getEString(), "identifier", null, 1, 1, EEFWidgetDescription.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID,
				EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEAttribute(getEEFWidgetDescription_LabelExpression(), ecorePackage.getEString(), "labelExpression", null, 0, 1, //$NON-NLS-1$
				EEFWidgetDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);

		initEClass(eefTextDescriptionEClass, EEFTextDescription.class, "EEFTextDescription", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, //$NON-NLS-1$
				EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFTextDescription_ValueExpression(), theEcorePackage.getEString(), "valueExpression", null, 0, 1, EEFTextDescription.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID,
				EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEAttribute(getEEFTextDescription_EditExpression(), theEcorePackage.getEString(), "editExpression", null, 0, 1, EEFTextDescription.class, //$NON-NLS-1$
				!EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID,
				EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);

		// Create resource
		createResource(EefPackage.eNS_URI);
	}

} // EefPackageImpl
