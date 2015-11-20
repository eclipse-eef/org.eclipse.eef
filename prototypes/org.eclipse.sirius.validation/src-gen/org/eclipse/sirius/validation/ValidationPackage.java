/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.sirius.validation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.eclipse.sirius.validation.ValidationFactory
 * @model kind="package"
 * @generated
 */
public interface ValidationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "validation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/sirius/validation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "validation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ValidationPackage eINSTANCE = org.eclipse.sirius.validation.impl.ValidationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.validation.impl.SiriusStatusImpl <em>Sirius Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.validation.impl.SiriusStatusImpl
	 * @see org.eclipse.sirius.validation.impl.ValidationPackageImpl#getSiriusStatus()
	 * @generated
	 */
	int SIRIUS_STATUS = 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIRIUS_STATUS__MESSAGE = 0;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIRIUS_STATUS__SEVERITY = 1;

	/**
	 * The feature id for the '<em><b>Exception</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIRIUS_STATUS__EXCEPTION = 2;

	/**
	 * The number of structural features of the '<em>Sirius Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIRIUS_STATUS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Sirius Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIRIUS_STATUS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.validation.Severity <em>Severity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.validation.Severity
	 * @see org.eclipse.sirius.validation.impl.ValidationPackageImpl#getSeverity()
	 * @generated
	 */
	int SEVERITY = 1;

	/**
	 * The meta object id for the '<em>Sirius Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.eclipse.sirius.validation.impl.ValidationPackageImpl#getSiriusException()
	 * @generated
	 */
	int SIRIUS_EXCEPTION = 2;


	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.validation.SiriusStatus <em>Sirius Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sirius Status</em>'.
	 * @see org.eclipse.sirius.validation.SiriusStatus
	 * @generated
	 */
	EClass getSiriusStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.validation.SiriusStatus#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.eclipse.sirius.validation.SiriusStatus#getMessage()
	 * @see #getSiriusStatus()
	 * @generated
	 */
	EAttribute getSiriusStatus_Message();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.validation.SiriusStatus#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see org.eclipse.sirius.validation.SiriusStatus#getSeverity()
	 * @see #getSiriusStatus()
	 * @generated
	 */
	EAttribute getSiriusStatus_Severity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.validation.SiriusStatus#getException <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exception</em>'.
	 * @see org.eclipse.sirius.validation.SiriusStatus#getException()
	 * @see #getSiriusStatus()
	 * @generated
	 */
	EAttribute getSiriusStatus_Exception();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.sirius.validation.Severity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Severity</em>'.
	 * @see org.eclipse.sirius.validation.Severity
	 * @generated
	 */
	EEnum getSeverity();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Sirius Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sirius Exception</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getSiriusException();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ValidationFactory getValidationFactory();

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
		 * The meta object literal for the '{@link org.eclipse.sirius.validation.impl.SiriusStatusImpl <em>Sirius Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.validation.impl.SiriusStatusImpl
		 * @see org.eclipse.sirius.validation.impl.ValidationPackageImpl#getSiriusStatus()
		 * @generated
		 */
		EClass SIRIUS_STATUS = eINSTANCE.getSiriusStatus();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIRIUS_STATUS__MESSAGE = eINSTANCE.getSiriusStatus_Message();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIRIUS_STATUS__SEVERITY = eINSTANCE.getSiriusStatus_Severity();

		/**
		 * The meta object literal for the '<em><b>Exception</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIRIUS_STATUS__EXCEPTION = eINSTANCE.getSiriusStatus_Exception();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.validation.Severity <em>Severity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.validation.Severity
		 * @see org.eclipse.sirius.validation.impl.ValidationPackageImpl#getSeverity()
		 * @generated
		 */
		EEnum SEVERITY = eINSTANCE.getSeverity();

		/**
		 * The meta object literal for the '<em>Sirius Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.eclipse.sirius.validation.impl.ValidationPackageImpl#getSiriusException()
		 * @generated
		 */
		EDataType SIRIUS_EXCEPTION = eINSTANCE.getSiriusException();

	}

} //ValidationPackage
