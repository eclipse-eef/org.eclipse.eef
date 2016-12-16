/**
 * Copyright (c) 2016 Obeo.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula.impl;

import org.eclipse.eef.EefPackage;

import org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula.EEFExtNebulaRichTextConditionalStyle;
import org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula.EEFExtNebulaRichTextDescription;
import org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula.EEFExtNebulaRichTextWidgetStyle;
import org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula.EefExtWidgetsNebulaFactory;
import org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula.EefExtWidgetsNebulaPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EefExtWidgetsNebulaPackageImpl extends EPackageImpl implements EefExtWidgetsNebulaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefExtNebulaRichTextDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefExtNebulaRichTextWidgetStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefExtNebulaRichTextConditionalStyleEClass = null;

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
	 * @see org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula.EefExtWidgetsNebulaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EefExtWidgetsNebulaPackageImpl() {
		super(eNS_URI, EefExtWidgetsNebulaFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EefExtWidgetsNebulaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EefExtWidgetsNebulaPackage init() {
		if (isInited)
			return (EefExtWidgetsNebulaPackage) EPackage.Registry.INSTANCE
					.getEPackage(EefExtWidgetsNebulaPackage.eNS_URI);

		// Obtain or create and register package
		EefExtWidgetsNebulaPackageImpl theEefExtWidgetsNebulaPackage = (EefExtWidgetsNebulaPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof EefExtWidgetsNebulaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new EefExtWidgetsNebulaPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EefPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEefExtWidgetsNebulaPackage.createPackageContents();

		// Initialize created meta-data
		theEefExtWidgetsNebulaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEefExtWidgetsNebulaPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EefExtWidgetsNebulaPackage.eNS_URI, theEefExtWidgetsNebulaPackage);
		return theEefExtWidgetsNebulaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEEFExtNebulaRichTextDescription() {
		return eefExtNebulaRichTextDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEEFExtNebulaRichTextDescription_ValueExpression() {
		return (EAttribute) eefExtNebulaRichTextDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEEFExtNebulaRichTextDescription_EditExpression() {
		return (EAttribute) eefExtNebulaRichTextDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEEFExtNebulaRichTextDescription_Style() {
		return (EReference) eefExtNebulaRichTextDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEEFExtNebulaRichTextDescription_ConditionalStyles() {
		return (EReference) eefExtNebulaRichTextDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEEFExtNebulaRichTextWidgetStyle() {
		return eefExtNebulaRichTextWidgetStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEEFExtNebulaRichTextConditionalStyle() {
		return eefExtNebulaRichTextConditionalStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEEFExtNebulaRichTextConditionalStyle_Style() {
		return (EReference) eefExtNebulaRichTextConditionalStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EefExtWidgetsNebulaFactory getEefExtWidgetsNebulaFactory() {
		return (EefExtWidgetsNebulaFactory) getEFactoryInstance();
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
		eefExtNebulaRichTextDescriptionEClass = createEClass(EEF_EXT_NEBULA_RICH_TEXT_DESCRIPTION);
		createEAttribute(eefExtNebulaRichTextDescriptionEClass, EEF_EXT_NEBULA_RICH_TEXT_DESCRIPTION__VALUE_EXPRESSION);
		createEAttribute(eefExtNebulaRichTextDescriptionEClass, EEF_EXT_NEBULA_RICH_TEXT_DESCRIPTION__EDIT_EXPRESSION);
		createEReference(eefExtNebulaRichTextDescriptionEClass, EEF_EXT_NEBULA_RICH_TEXT_DESCRIPTION__STYLE);
		createEReference(eefExtNebulaRichTextDescriptionEClass,
				EEF_EXT_NEBULA_RICH_TEXT_DESCRIPTION__CONDITIONAL_STYLES);

		eefExtNebulaRichTextWidgetStyleEClass = createEClass(EEF_EXT_NEBULA_RICH_TEXT_WIDGET_STYLE);

		eefExtNebulaRichTextConditionalStyleEClass = createEClass(EEF_EXT_NEBULA_RICH_TEXT_CONDITIONAL_STYLE);
		createEReference(eefExtNebulaRichTextConditionalStyleEClass, EEF_EXT_NEBULA_RICH_TEXT_CONDITIONAL_STYLE__STYLE);
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
		EefPackage theEefPackage = (EefPackage) EPackage.Registry.INSTANCE.getEPackage(EefPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		eefExtNebulaRichTextDescriptionEClass.getESuperTypes().add(theEefPackage.getEEFWidgetDescription());
		eefExtNebulaRichTextWidgetStyleEClass.getESuperTypes().add(theEefPackage.getEEFWidgetStyle());
		eefExtNebulaRichTextConditionalStyleEClass.getESuperTypes().add(theEefPackage.getEEFConditionalStyle());

		// Initialize classes and features; add operations and parameters
		initEClass(eefExtNebulaRichTextDescriptionEClass, EEFExtNebulaRichTextDescription.class,
				"EEFExtNebulaRichTextDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getEEFExtNebulaRichTextDescription_ValueExpression(), theEcorePackage.getEString(),
				"valueExpression", null, 0, 1, EEFExtNebulaRichTextDescription.class, !IS_TRANSIENT, !IS_VOLATILE, //$NON-NLS-1$
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFExtNebulaRichTextDescription_EditExpression(), theEcorePackage.getEString(),
				"editExpression", null, 0, 1, EEFExtNebulaRichTextDescription.class, !IS_TRANSIENT, !IS_VOLATILE, //$NON-NLS-1$
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEEFExtNebulaRichTextDescription_Style(), this.getEEFExtNebulaRichTextWidgetStyle(), null,
				"style", null, 0, 1, EEFExtNebulaRichTextDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, //$NON-NLS-1$
				IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEEFExtNebulaRichTextDescription_ConditionalStyles(),
				this.getEEFExtNebulaRichTextConditionalStyle(), null, "conditionalStyles", null, 0, -1, //$NON-NLS-1$
				EEFExtNebulaRichTextDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eefExtNebulaRichTextWidgetStyleEClass, EEFExtNebulaRichTextWidgetStyle.class,
				"EEFExtNebulaRichTextWidgetStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(eefExtNebulaRichTextConditionalStyleEClass, EEFExtNebulaRichTextConditionalStyle.class,
				"EEFExtNebulaRichTextConditionalStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getEEFExtNebulaRichTextConditionalStyle_Style(), this.getEEFExtNebulaRichTextWidgetStyle(), null,
				"style", null, 0, 1, EEFExtNebulaRichTextConditionalStyle.class, !IS_TRANSIENT, !IS_VOLATILE, //$NON-NLS-1$
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //EefExtWidgetsNebulaPackageImpl
