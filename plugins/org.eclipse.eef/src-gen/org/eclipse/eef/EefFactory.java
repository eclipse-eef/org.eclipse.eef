/**
 * Copyright (c) 2016 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each non-abstract class of
 * the model. <!-- end-user-doc -->
 *
 * @see org.eclipse.eef.EefPackage
 * @generated
 */
public interface EefFactory extends EFactory {
	/**
	 * The singleton instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	EefFactory eINSTANCE = org.eclipse.eef.impl.EefFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>EEF View Description</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>EEF View Description</em>'.
	 * @generated
	 */
	EEFViewDescription createEEFViewDescription();

	/**
	 * Returns a new object of class '<em>EEF Page Description</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>EEF Page Description</em>'.
	 * @generated
	 */
	EEFPageDescription createEEFPageDescription();

	/**
	 * Returns a new object of class '<em>EEF Group Description</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>EEF Group Description</em>'.
	 * @generated
	 */
	EEFGroupDescription createEEFGroupDescription();

	/**
	 * Returns a new object of class '<em>EEF Container Description</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>EEF Container Description</em>'.
	 * @generated
	 */
	EEFContainerDescription createEEFContainerDescription();

	/**
	 * Returns a new object of class '<em>EEF Text Description</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>EEF Text Description</em>'.
	 * @generated
	 */
	EEFTextDescription createEEFTextDescription();

	/**
	 * Returns a new object of class '<em>EEF Label Description</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>EEF Label Description</em>'.
	 * @generated
	 */
	EEFLabelDescription createEEFLabelDescription();

	/**
	 * Returns a new object of class '<em>EEF Checkbox Description</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>EEF Checkbox Description</em>'.
	 * @generated
	 */
	EEFCheckboxDescription createEEFCheckboxDescription();

	/**
	 * Returns a new object of class '<em>EEF Select Description</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>EEF Select Description</em>'.
	 * @generated
	 */
	EEFSelectDescription createEEFSelectDescription();

	/**
	 * Returns a new object of class '<em>EEF Dynamic Mapping For</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>EEF Dynamic Mapping For</em>'.
	 * @generated
	 */
	EEFDynamicMappingFor createEEFDynamicMappingFor();

	/**
	 * Returns a new object of class '<em>EEF Dynamic Mapping Switch</em>'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @return a new object of class '<em>EEF Dynamic Mapping Switch</em>'.
	 * @generated
	 */
	EEFDynamicMappingSwitch createEEFDynamicMappingSwitch();

	/**
	 * Returns a new object of class '<em>EEF Dynamic Mapping Case</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>EEF Dynamic Mapping Case</em>'.
	 * @generated
	 */
	EEFDynamicMappingCase createEEFDynamicMappingCase();

	/**
	 * Returns the package supported by this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the package supported by this factory.
	 * @generated
	 */
	EefPackage getEefPackage();

} // EefFactory
