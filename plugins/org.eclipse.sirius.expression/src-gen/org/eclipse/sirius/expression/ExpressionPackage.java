/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 */
package org.eclipse.sirius.expression;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.sirius.expression.ExpressionFactory
 * @model kind="package"
 * @generated
 */
public interface ExpressionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "expression"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/sirius/expression"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "expression"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExpressionPackage eINSTANCE = org.eclipse.sirius.expression.impl.ExpressionPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.expression.impl.SiriusExpressionPackageImpl <em>Sirius Expression Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.expression.impl.SiriusExpressionPackageImpl
	 * @see org.eclipse.sirius.expression.impl.ExpressionPackageImpl#getSiriusExpressionPackage()
	 * @generated
	 */
	int SIRIUS_EXPRESSION_PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Expression Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIRIUS_EXPRESSION_PACKAGE__EXPRESSION_CLASSES = 0;

	/**
	 * The feature id for the '<em><b>EPackage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIRIUS_EXPRESSION_PACKAGE__EPACKAGE = 1;

	/**
	 * The number of structural features of the '<em>Sirius Expression Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIRIUS_EXPRESSION_PACKAGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Sirius Expression Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIRIUS_EXPRESSION_PACKAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.expression.impl.ExpressionDescriptionImpl <em>Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.expression.impl.ExpressionDescriptionImpl
	 * @see org.eclipse.sirius.expression.impl.ExpressionPackageImpl#getExpressionDescription()
	 * @generated
	 */
	int EXPRESSION_DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_DESCRIPTION__LOWER_BOUND = 0;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_DESCRIPTION__UPPER_BOUND = 1;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_DESCRIPTION__EXPRESSION = 2;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_DESCRIPTION__VARIABLES = 3;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_DESCRIPTION__RETURN_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_DESCRIPTION__LABEL = 5;

	/**
	 * The feature id for the '<em><b>Contextable Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_DESCRIPTION__CONTEXTABLE_ELEMENTS = 6;

	/**
	 * The number of structural features of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_DESCRIPTION_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_DESCRIPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.expression.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.expression.impl.VariableImpl
	 * @see org.eclipse.sirius.expression.impl.ExpressionPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__DOCUMENTATION = 1;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.expression.impl.SiriusExpressionClassImpl <em>Sirius Expression Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.expression.impl.SiriusExpressionClassImpl
	 * @see org.eclipse.sirius.expression.impl.ExpressionPackageImpl#getSiriusExpressionClass()
	 * @generated
	 */
	int SIRIUS_EXPRESSION_CLASS = 3;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIRIUS_EXPRESSION_CLASS__VARIABLES = 0;

	/**
	 * The feature id for the '<em><b>Expression Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIRIUS_EXPRESSION_CLASS__EXPRESSION_DESCRIPTIONS = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIRIUS_EXPRESSION_CLASS__LABEL = 2;

	/**
	 * The number of structural features of the '<em>Sirius Expression Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIRIUS_EXPRESSION_CLASS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Sirius Expression Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIRIUS_EXPRESSION_CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>Void</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Void
	 * @see org.eclipse.sirius.expression.impl.ExpressionPackageImpl#getVoid()
	 * @generated
	 */
	int VOID = 4;

	/**
	 * The meta object id for the '<em>Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.eclipse.sirius.expression.impl.ExpressionPackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 5;

	/**
	 * The meta object id for the '<em>Predicate</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.eclipse.sirius.expression.impl.ExpressionPackageImpl#getPredicate()
	 * @generated
	 */
	int PREDICATE = 6;


	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.expression.SiriusExpressionPackage <em>Sirius Expression Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sirius Expression Package</em>'.
	 * @see org.eclipse.sirius.expression.SiriusExpressionPackage
	 * @generated
	 */
	EClass getSiriusExpressionPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.expression.SiriusExpressionPackage#getExpressionClasses <em>Expression Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expression Classes</em>'.
	 * @see org.eclipse.sirius.expression.SiriusExpressionPackage#getExpressionClasses()
	 * @see #getSiriusExpressionPackage()
	 * @generated
	 */
	EReference getSiriusExpressionPackage_ExpressionClasses();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.expression.SiriusExpressionPackage#getEPackage <em>EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EPackage</em>'.
	 * @see org.eclipse.sirius.expression.SiriusExpressionPackage#getEPackage()
	 * @see #getSiriusExpressionPackage()
	 * @generated
	 */
	EReference getSiriusExpressionPackage_EPackage();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.expression.ExpressionDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description</em>'.
	 * @see org.eclipse.sirius.expression.ExpressionDescription
	 * @generated
	 */
	EClass getExpressionDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.expression.ExpressionDescription#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see org.eclipse.sirius.expression.ExpressionDescription#getLowerBound()
	 * @see #getExpressionDescription()
	 * @generated
	 */
	EAttribute getExpressionDescription_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.expression.ExpressionDescription#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see org.eclipse.sirius.expression.ExpressionDescription#getUpperBound()
	 * @see #getExpressionDescription()
	 * @generated
	 */
	EAttribute getExpressionDescription_UpperBound();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.expression.ExpressionDescription#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Expression</em>'.
	 * @see org.eclipse.sirius.expression.ExpressionDescription#getExpression()
	 * @see #getExpressionDescription()
	 * @generated
	 */
	EReference getExpressionDescription_Expression();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sirius.expression.ExpressionDescription#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Variables</em>'.
	 * @see org.eclipse.sirius.expression.ExpressionDescription#getVariables()
	 * @see #getExpressionDescription()
	 * @generated
	 */
	EReference getExpressionDescription_Variables();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.expression.ExpressionDescription#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Type</em>'.
	 * @see org.eclipse.sirius.expression.ExpressionDescription#getReturnType()
	 * @see #getExpressionDescription()
	 * @generated
	 */
	EReference getExpressionDescription_ReturnType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.expression.ExpressionDescription#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.eclipse.sirius.expression.ExpressionDescription#getLabel()
	 * @see #getExpressionDescription()
	 * @generated
	 */
	EAttribute getExpressionDescription_Label();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sirius.expression.ExpressionDescription#getContextableElements <em>Contextable Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contextable Elements</em>'.
	 * @see org.eclipse.sirius.expression.ExpressionDescription#getContextableElements()
	 * @see #getExpressionDescription()
	 * @generated
	 */
	EReference getExpressionDescription_ContextableElements();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.expression.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see org.eclipse.sirius.expression.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.expression.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.sirius.expression.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.expression.Variable#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see org.eclipse.sirius.expression.Variable#getDocumentation()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Documentation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.expression.SiriusExpressionClass <em>Sirius Expression Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sirius Expression Class</em>'.
	 * @see org.eclipse.sirius.expression.SiriusExpressionClass
	 * @generated
	 */
	EClass getSiriusExpressionClass();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.expression.SiriusExpressionClass#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see org.eclipse.sirius.expression.SiriusExpressionClass#getVariables()
	 * @see #getSiriusExpressionClass()
	 * @generated
	 */
	EReference getSiriusExpressionClass_Variables();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.expression.SiriusExpressionClass#getExpressionDescriptions <em>Expression Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expression Descriptions</em>'.
	 * @see org.eclipse.sirius.expression.SiriusExpressionClass#getExpressionDescriptions()
	 * @see #getSiriusExpressionClass()
	 * @generated
	 */
	EReference getSiriusExpressionClass_ExpressionDescriptions();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.expression.SiriusExpressionClass#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.eclipse.sirius.expression.SiriusExpressionClass#getLabel()
	 * @see #getSiriusExpressionClass()
	 * @generated
	 */
	EAttribute getSiriusExpressionClass_Label();

	/**
	 * Returns the meta object for data type '{@link java.lang.Void <em>Void</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Void</em>'.
	 * @see java.lang.Void
	 * @model instanceClass="java.lang.Void"
	 * @generated
	 */
	EDataType getVoid();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Object</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Predicate</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getPredicate();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExpressionFactory getExpressionFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.expression.impl.SiriusExpressionPackageImpl <em>Sirius Expression Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.expression.impl.SiriusExpressionPackageImpl
		 * @see org.eclipse.sirius.expression.impl.ExpressionPackageImpl#getSiriusExpressionPackage()
		 * @generated
		 */
		EClass SIRIUS_EXPRESSION_PACKAGE = eINSTANCE.getSiriusExpressionPackage();

		/**
		 * The meta object literal for the '<em><b>Expression Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIRIUS_EXPRESSION_PACKAGE__EXPRESSION_CLASSES = eINSTANCE.getSiriusExpressionPackage_ExpressionClasses();

		/**
		 * The meta object literal for the '<em><b>EPackage</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIRIUS_EXPRESSION_PACKAGE__EPACKAGE = eINSTANCE.getSiriusExpressionPackage_EPackage();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.expression.impl.ExpressionDescriptionImpl <em>Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.expression.impl.ExpressionDescriptionImpl
		 * @see org.eclipse.sirius.expression.impl.ExpressionPackageImpl#getExpressionDescription()
		 * @generated
		 */
		EClass EXPRESSION_DESCRIPTION = eINSTANCE.getExpressionDescription();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION_DESCRIPTION__LOWER_BOUND = eINSTANCE.getExpressionDescription_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION_DESCRIPTION__UPPER_BOUND = eINSTANCE.getExpressionDescription_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_DESCRIPTION__EXPRESSION = eINSTANCE.getExpressionDescription_Expression();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_DESCRIPTION__VARIABLES = eINSTANCE.getExpressionDescription_Variables();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_DESCRIPTION__RETURN_TYPE = eINSTANCE.getExpressionDescription_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION_DESCRIPTION__LABEL = eINSTANCE.getExpressionDescription_Label();

		/**
		 * The meta object literal for the '<em><b>Contextable Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_DESCRIPTION__CONTEXTABLE_ELEMENTS = eINSTANCE.getExpressionDescription_ContextableElements();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.expression.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.expression.impl.VariableImpl
		 * @see org.eclipse.sirius.expression.impl.ExpressionPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__DOCUMENTATION = eINSTANCE.getVariable_Documentation();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.expression.impl.SiriusExpressionClassImpl <em>Sirius Expression Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.expression.impl.SiriusExpressionClassImpl
		 * @see org.eclipse.sirius.expression.impl.ExpressionPackageImpl#getSiriusExpressionClass()
		 * @generated
		 */
		EClass SIRIUS_EXPRESSION_CLASS = eINSTANCE.getSiriusExpressionClass();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIRIUS_EXPRESSION_CLASS__VARIABLES = eINSTANCE.getSiriusExpressionClass_Variables();

		/**
		 * The meta object literal for the '<em><b>Expression Descriptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIRIUS_EXPRESSION_CLASS__EXPRESSION_DESCRIPTIONS = eINSTANCE.getSiriusExpressionClass_ExpressionDescriptions();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIRIUS_EXPRESSION_CLASS__LABEL = eINSTANCE.getSiriusExpressionClass_Label();

		/**
		 * The meta object literal for the '<em>Void</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Void
		 * @see org.eclipse.sirius.expression.impl.ExpressionPackageImpl#getVoid()
		 * @generated
		 */
		EDataType VOID = eINSTANCE.getVoid();

		/**
		 * The meta object literal for the '<em>Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.eclipse.sirius.expression.impl.ExpressionPackageImpl#getObject()
		 * @generated
		 */
		EDataType OBJECT = eINSTANCE.getObject();

		/**
		 * The meta object literal for the '<em>Predicate</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.eclipse.sirius.expression.impl.ExpressionPackageImpl#getPredicate()
		 * @generated
		 */
		EDataType PREDICATE = eINSTANCE.getPredicate();

	}

} //ExpressionPackage
