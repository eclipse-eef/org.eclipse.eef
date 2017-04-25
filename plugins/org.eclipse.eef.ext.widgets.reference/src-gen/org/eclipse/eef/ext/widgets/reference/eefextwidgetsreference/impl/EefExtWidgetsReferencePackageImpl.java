/**
 * Copyright (c) 2016 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.impl;

import org.eclipse.eef.EefPackage;
import org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.EEFExtReferenceConditionalStyle;
import org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.EEFExtReferenceDescription;
import org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.EEFExtReferenceWidgetStyle;
import org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.EefExtWidgetsReferenceFactory;
import org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.EefExtWidgetsReferencePackage;
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
public class EefExtWidgetsReferencePackageImpl extends EPackageImpl implements EefExtWidgetsReferencePackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass eefExtReferenceDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass eefExtReferenceWidgetStyleEClass = null;
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass eefExtReferenceConditionalStyleEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry
	 * EPackage.Registry} by the package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also
	 * performs initialization of the package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.EefExtWidgetsReferencePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EefExtWidgetsReferencePackageImpl() {
		super(EefExtWidgetsReferencePackage.eNS_URI, EefExtWidgetsReferenceFactory.eINSTANCE);
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
	 * This method is used to initialize {@link EefExtWidgetsReferencePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EefExtWidgetsReferencePackage init() {
		if (EefExtWidgetsReferencePackageImpl.isInited) {
			return (EefExtWidgetsReferencePackage) EPackage.Registry.INSTANCE.getEPackage(EefExtWidgetsReferencePackage.eNS_URI);
		}

		// Obtain or create and register package
		EefExtWidgetsReferencePackageImpl theEefExtWidgetsReferencePackage = (EefExtWidgetsReferencePackageImpl) (EPackage.Registry.INSTANCE
				.get(EefExtWidgetsReferencePackage.eNS_URI) instanceof EefExtWidgetsReferencePackageImpl
						? EPackage.Registry.INSTANCE.get(EefExtWidgetsReferencePackage.eNS_URI) : new EefExtWidgetsReferencePackageImpl());

		EefExtWidgetsReferencePackageImpl.isInited = true;

		// Initialize simple dependencies
		EefPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEefExtWidgetsReferencePackage.createPackageContents();

		// Initialize created meta-data
		theEefExtWidgetsReferencePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEefExtWidgetsReferencePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EefExtWidgetsReferencePackage.eNS_URI, theEefExtWidgetsReferencePackage);
		return theEefExtWidgetsReferencePackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getEEFExtReferenceDescription() {
		return eefExtReferenceDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getEEFExtReferenceDescription_ReferenceNameExpression() {
		return (EAttribute) eefExtReferenceDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getEEFExtReferenceDescription_ReferenceOwnerExpression() {
		return (EAttribute) eefExtReferenceDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getEEFExtReferenceDescription_OnClickExpression() {
		return (EAttribute) eefExtReferenceDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getEEFExtReferenceDescription_Style() {
		return (EReference) eefExtReferenceDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getEEFExtReferenceDescription_ConditionalStyles() {
		return (EReference) eefExtReferenceDescriptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getEEFExtReferenceWidgetStyle() {
		return eefExtReferenceWidgetStyleEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getEEFExtReferenceConditionalStyle() {
		return eefExtReferenceConditionalStyleEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getEEFExtReferenceConditionalStyle_Style() {
		return (EReference) eefExtReferenceConditionalStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EefExtWidgetsReferenceFactory getEefExtWidgetsReferenceFactory() {
		return (EefExtWidgetsReferenceFactory) getEFactoryInstance();
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
		eefExtReferenceDescriptionEClass = createEClass(EefExtWidgetsReferencePackage.EEF_EXT_REFERENCE_DESCRIPTION);
		createEAttribute(eefExtReferenceDescriptionEClass, EefExtWidgetsReferencePackage.EEF_EXT_REFERENCE_DESCRIPTION__REFERENCE_NAME_EXPRESSION);
		createEAttribute(eefExtReferenceDescriptionEClass, EefExtWidgetsReferencePackage.EEF_EXT_REFERENCE_DESCRIPTION__REFERENCE_OWNER_EXPRESSION);
		createEAttribute(eefExtReferenceDescriptionEClass, EefExtWidgetsReferencePackage.EEF_EXT_REFERENCE_DESCRIPTION__ON_CLICK_EXPRESSION);
		createEReference(eefExtReferenceDescriptionEClass, EefExtWidgetsReferencePackage.EEF_EXT_REFERENCE_DESCRIPTION__STYLE);
		createEReference(eefExtReferenceDescriptionEClass, EefExtWidgetsReferencePackage.EEF_EXT_REFERENCE_DESCRIPTION__CONDITIONAL_STYLES);

		eefExtReferenceWidgetStyleEClass = createEClass(EefExtWidgetsReferencePackage.EEF_EXT_REFERENCE_WIDGET_STYLE);

		eefExtReferenceConditionalStyleEClass = createEClass(EefExtWidgetsReferencePackage.EEF_EXT_REFERENCE_CONDITIONAL_STYLE);
		createEReference(eefExtReferenceConditionalStyleEClass, EefExtWidgetsReferencePackage.EEF_EXT_REFERENCE_CONDITIONAL_STYLE__STYLE);
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
		setName(EefExtWidgetsReferencePackage.eNAME);
		setNsPrefix(EefExtWidgetsReferencePackage.eNS_PREFIX);
		setNsURI(EefExtWidgetsReferencePackage.eNS_URI);

		// Obtain other dependent packages
		EefPackage theEefPackage = (EefPackage) EPackage.Registry.INSTANCE.getEPackage(EefPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		eefExtReferenceDescriptionEClass.getESuperTypes().add(theEefPackage.getEEFWidgetDescription());
		eefExtReferenceWidgetStyleEClass.getESuperTypes().add(theEefPackage.getEEFWidgetStyle());
		eefExtReferenceConditionalStyleEClass.getESuperTypes().add(theEefPackage.getEEFConditionalStyle());

		// Initialize classes and features; add operations and parameters
		initEClass(eefExtReferenceDescriptionEClass, EEFExtReferenceDescription.class, "EEFExtReferenceDescription", !EPackageImpl.IS_ABSTRACT, //$NON-NLS-1$
				!EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFExtReferenceDescription_ReferenceNameExpression(), theEcorePackage.getEString(), "referenceNameExpression", null, 1, 1, //$NON-NLS-1$
				EEFExtReferenceDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEAttribute(getEEFExtReferenceDescription_ReferenceOwnerExpression(), theEcorePackage.getEString(), "referenceOwnerExpression", null, 0, 1, //$NON-NLS-1$
				EEFExtReferenceDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEAttribute(getEEFExtReferenceDescription_OnClickExpression(), ecorePackage.getEString(), "onClickExpression", null, 0, 1, //$NON-NLS-1$
				EEFExtReferenceDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				!EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEReference(getEEFExtReferenceDescription_Style(), this.getEEFExtReferenceWidgetStyle(), null, "style", null, 0, 1, //$NON-NLS-1$
				EEFExtReferenceDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				EPackageImpl.IS_COMPOSITE, EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE,
				!EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
		initEReference(getEEFExtReferenceDescription_ConditionalStyles(), this.getEEFExtReferenceConditionalStyle(), null, "conditionalStyles", null, //$NON-NLS-1$
				0, -1, EEFExtReferenceDescription.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				EPackageImpl.IS_COMPOSITE, EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE,
				!EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);

		initEClass(eefExtReferenceWidgetStyleEClass, EEFExtReferenceWidgetStyle.class, "EEFExtReferenceWidgetStyle", !EPackageImpl.IS_ABSTRACT, //$NON-NLS-1$
				!EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);

		initEClass(eefExtReferenceConditionalStyleEClass, EEFExtReferenceConditionalStyle.class, "EEFExtReferenceConditionalStyle", //$NON-NLS-1$
				!EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEEFExtReferenceConditionalStyle_Style(), this.getEEFExtReferenceWidgetStyle(), null, "style", null, 0, 1, //$NON-NLS-1$
				EEFExtReferenceConditionalStyle.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE,
				EPackageImpl.IS_COMPOSITE, EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE,
				!EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);

		// Create resource
		createResource(EefExtWidgetsReferencePackage.eNS_URI);
	}

} // EefExtWidgetsReferencePackageImpl
