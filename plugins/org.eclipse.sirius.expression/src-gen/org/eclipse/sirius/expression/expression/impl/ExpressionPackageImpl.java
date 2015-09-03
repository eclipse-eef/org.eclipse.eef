/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 */
package org.eclipse.sirius.expression.expression.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.sirius.expression.expression.ExpressionDescription;
import org.eclipse.sirius.expression.expression.ExpressionFactory;
import org.eclipse.sirius.expression.expression.ExpressionPackage;
import org.eclipse.sirius.expression.expression.SiriusExpressionClass;
import org.eclipse.sirius.expression.expression.SiriusExpressionPackage;
import org.eclipse.sirius.expression.expression.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExpressionPackageImpl extends EPackageImpl implements ExpressionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass siriusExpressionPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass siriusExpressionClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType voidEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType objectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType predicateEDataType = null;

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
	 * @see org.eclipse.sirius.expression.expression.ExpressionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ExpressionPackageImpl() {
		super(eNS_URI, ExpressionFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ExpressionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ExpressionPackage init() {
		if (isInited) return (ExpressionPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI);

		// Obtain or create and register package
		ExpressionPackageImpl theExpressionPackage = (ExpressionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ExpressionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ExpressionPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theExpressionPackage.createPackageContents();

		// Initialize created meta-data
		theExpressionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theExpressionPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ExpressionPackage.eNS_URI, theExpressionPackage);
		return theExpressionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSiriusExpressionPackage() {
		return siriusExpressionPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSiriusExpressionPackage_ExpressionClasses() {
		return (EReference)siriusExpressionPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSiriusExpressionPackage_EPackage() {
		return (EReference)siriusExpressionPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressionDescription() {
		return expressionDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpressionDescription_LowerBound() {
		return (EAttribute)expressionDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpressionDescription_UpperBound() {
		return (EAttribute)expressionDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpressionDescription_Expression() {
		return (EReference)expressionDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpressionDescription_Variables() {
		return (EReference)expressionDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpressionDescription_ReturnType() {
		return (EReference)expressionDescriptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpressionDescription_Label() {
		return (EAttribute)expressionDescriptionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpressionDescription_ContextableElements() {
		return (EReference)expressionDescriptionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Name() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Documentation() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSiriusExpressionClass() {
		return siriusExpressionClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSiriusExpressionClass_Variables() {
		return (EReference)siriusExpressionClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSiriusExpressionClass_ExpressionDescriptions() {
		return (EReference)siriusExpressionClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSiriusExpressionClass_Label() {
		return (EAttribute)siriusExpressionClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVoid() {
		return voidEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getObject() {
		return objectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPredicate() {
		return predicateEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionFactory getExpressionFactory() {
		return (ExpressionFactory)getEFactoryInstance();
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
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		siriusExpressionPackageEClass = createEClass(SIRIUS_EXPRESSION_PACKAGE);
		createEReference(siriusExpressionPackageEClass, SIRIUS_EXPRESSION_PACKAGE__EXPRESSION_CLASSES);
		createEReference(siriusExpressionPackageEClass, SIRIUS_EXPRESSION_PACKAGE__EPACKAGE);

		expressionDescriptionEClass = createEClass(EXPRESSION_DESCRIPTION);
		createEAttribute(expressionDescriptionEClass, EXPRESSION_DESCRIPTION__LOWER_BOUND);
		createEAttribute(expressionDescriptionEClass, EXPRESSION_DESCRIPTION__UPPER_BOUND);
		createEReference(expressionDescriptionEClass, EXPRESSION_DESCRIPTION__EXPRESSION);
		createEReference(expressionDescriptionEClass, EXPRESSION_DESCRIPTION__VARIABLES);
		createEReference(expressionDescriptionEClass, EXPRESSION_DESCRIPTION__RETURN_TYPE);
		createEAttribute(expressionDescriptionEClass, EXPRESSION_DESCRIPTION__LABEL);
		createEReference(expressionDescriptionEClass, EXPRESSION_DESCRIPTION__CONTEXTABLE_ELEMENTS);

		variableEClass = createEClass(VARIABLE);
		createEAttribute(variableEClass, VARIABLE__NAME);
		createEAttribute(variableEClass, VARIABLE__DOCUMENTATION);

		siriusExpressionClassEClass = createEClass(SIRIUS_EXPRESSION_CLASS);
		createEReference(siriusExpressionClassEClass, SIRIUS_EXPRESSION_CLASS__VARIABLES);
		createEReference(siriusExpressionClassEClass, SIRIUS_EXPRESSION_CLASS__EXPRESSION_DESCRIPTIONS);
		createEAttribute(siriusExpressionClassEClass, SIRIUS_EXPRESSION_CLASS__LABEL);

		// Create data types
		voidEDataType = createEDataType(VOID);
		objectEDataType = createEDataType(OBJECT);
		predicateEDataType = createEDataType(PREDICATE);
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
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(siriusExpressionPackageEClass, SiriusExpressionPackage.class, "SiriusExpressionPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getSiriusExpressionPackage_ExpressionClasses(), this.getSiriusExpressionClass(), null, "expressionClasses", null, 0, -1, SiriusExpressionPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSiriusExpressionPackage_EPackage(), ecorePackage.getEPackage(), null, "ePackage", null, 0, 1, SiriusExpressionPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(expressionDescriptionEClass, ExpressionDescription.class, "ExpressionDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getExpressionDescription_LowerBound(), ecorePackage.getEInt(), "lowerBound", null, 0, 1, ExpressionDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getExpressionDescription_UpperBound(), ecorePackage.getEInt(), "upperBound", "1", 0, 1, ExpressionDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getExpressionDescription_Expression(), ecorePackage.getEStructuralFeature(), null, "expression", null, 0, 1, ExpressionDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getExpressionDescription_Variables(), this.getVariable(), null, "variables", null, 0, -1, ExpressionDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getExpressionDescription_ReturnType(), ecorePackage.getEClassifier(), null, "returnType", null, 0, 1, ExpressionDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getExpressionDescription_Label(), ecorePackage.getEString(), "label", null, 0, 1, ExpressionDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getExpressionDescription_ContextableElements(), ecorePackage.getEClass(), null, "contextableElements", null, 0, -1, ExpressionDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getVariable_Name(), ecorePackage.getEString(), "name", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getVariable_Documentation(), ecorePackage.getEString(), "documentation", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(siriusExpressionClassEClass, SiriusExpressionClass.class, "SiriusExpressionClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getSiriusExpressionClass_Variables(), this.getVariable(), null, "variables", null, 0, -1, SiriusExpressionClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSiriusExpressionClass_ExpressionDescriptions(), this.getExpressionDescription(), null, "expressionDescriptions", null, 0, -1, SiriusExpressionClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getSiriusExpressionClass_Label(), ecorePackage.getEString(), "label", null, 0, 1, SiriusExpressionClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		// Initialize data types
		initEDataType(voidEDataType, Void.class, "Void", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(objectEDataType, Object.class, "Object", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(predicateEDataType, Object.class, "Predicate", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		// Create resource
		createResource(eNS_URI);
	}

} //ExpressionPackageImpl
