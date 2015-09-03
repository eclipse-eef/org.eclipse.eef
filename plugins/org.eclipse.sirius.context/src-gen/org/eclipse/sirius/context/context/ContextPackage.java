/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 */
package org.eclipse.sirius.context.context;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.eclipse.sirius.context.context.ContextFactory
 * @model kind="package"
 * @generated
 */
public interface ContextPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "context"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/sirius/context"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "context"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ContextPackage eINSTANCE = org.eclipse.sirius.context.context.impl.ContextPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.context.context.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.context.context.impl.ContextImpl
	 * @see org.eclipse.sirius.context.context.impl.ContextPackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 0;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.context.context.impl.ContextVariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.context.context.impl.ContextVariableImpl
	 * @see org.eclipse.sirius.context.context.impl.ContextPackageImpl#getContextVariable()
	 * @generated
	 */
	int CONTEXT_VARIABLE = 1;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE__CONTEXT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE__DOCUMENTATION = 2;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.context.context.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see org.eclipse.sirius.context.context.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.context.context.ContextVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see org.eclipse.sirius.context.context.ContextVariable
	 * @generated
	 */
	EClass getContextVariable();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.context.context.ContextVariable#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see org.eclipse.sirius.context.context.ContextVariable#getContext()
	 * @see #getContextVariable()
	 * @generated
	 */
	EReference getContextVariable_Context();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.context.context.ContextVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.sirius.context.context.ContextVariable#getName()
	 * @see #getContextVariable()
	 * @generated
	 */
	EAttribute getContextVariable_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.context.context.ContextVariable#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see org.eclipse.sirius.context.context.ContextVariable#getDocumentation()
	 * @see #getContextVariable()
	 * @generated
	 */
	EAttribute getContextVariable_Documentation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ContextFactory getContextFactory();

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
		 * The meta object literal for the '{@link org.eclipse.sirius.context.context.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.context.context.impl.ContextImpl
		 * @see org.eclipse.sirius.context.context.impl.ContextPackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.context.context.impl.ContextVariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.context.context.impl.ContextVariableImpl
		 * @see org.eclipse.sirius.context.context.impl.ContextPackageImpl#getContextVariable()
		 * @generated
		 */
		EClass CONTEXT_VARIABLE = eINSTANCE.getContextVariable();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_VARIABLE__CONTEXT = eINSTANCE.getContextVariable_Context();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_VARIABLE__NAME = eINSTANCE.getContextVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_VARIABLE__DOCUMENTATION = eINSTANCE.getContextVariable_Documentation();

	}

} //ContextPackage
