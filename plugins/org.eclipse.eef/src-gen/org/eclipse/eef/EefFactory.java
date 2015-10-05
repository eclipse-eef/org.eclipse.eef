/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.eef.EefPackage
 * @generated
 */
public interface EefFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EefFactory eINSTANCE = org.eclipse.eef.impl.EefFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>EEF View Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF View Description</em>'.
	 * @generated
	 */
	EEFViewDescription createEEFViewDescription();

	/**
	 * Returns a new object of class '<em>EEF Page Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Page Description</em>'.
	 * @generated
	 */
	EEFPageDescription createEEFPageDescription();

	/**
	 * Returns a new object of class '<em>EEF Group Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Group Description</em>'.
	 * @generated
	 */
	EEFGroupDescription createEEFGroupDescription();

	/**
	 * Returns a new object of class '<em>EEF Container Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Container Description</em>'.
	 * @generated
	 */
	EEFContainerDescription createEEFContainerDescription();

	/**
	 * Returns a new object of class '<em>EEF Java Extension Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Java Extension Description</em>'.
	 * @generated
	 */
	EEFJavaExtensionDescription createEEFJavaExtensionDescription();

	/**
	 * Returns a new object of class '<em>EEF Interpreted Table Structure Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Interpreted Table Structure Description</em>'.
	 * @generated
	 */
	EEFInterpretedTableStructureDescription createEEFInterpretedTableStructureDescription();

	/**
	 * Returns a new object of class '<em>EEF Adapter Factory Tree Structure Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Adapter Factory Tree Structure Description</em>'.
	 * @generated
	 */
	EEFAdapterFactoryTreeStructureDescription createEEFAdapterFactoryTreeStructureDescription();

	/**
	 * Returns a new object of class '<em>EEF Interpreted Tree Structure Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Interpreted Tree Structure Description</em>'.
	 * @generated
	 */
	EEFInterpretedTreeStructureDescription createEEFInterpretedTreeStructureDescription();

	/**
	 * Returns a new object of class '<em>EEF Text Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Text Description</em>'.
	 * @generated
	 */
	EEFTextDescription createEEFTextDescription();

	/**
	 * Returns a new object of class '<em>EEF Checkbox Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Checkbox Description</em>'.
	 * @generated
	 */
	EEFCheckboxDescription createEEFCheckboxDescription();

	/**
	 * Returns a new object of class '<em>EEF Select Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Select Description</em>'.
	 * @generated
	 */
	EEFSelectDescription createEEFSelectDescription();

	/**
	 * Returns a new object of class '<em>EEF Label Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Label Description</em>'.
	 * @generated
	 */
	EEFLabelDescription createEEFLabelDescription();

	/**
	 * Returns a new object of class '<em>EEF Radio Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Radio Description</em>'.
	 * @generated
	 */
	EEFRadioDescription createEEFRadioDescription();

	/**
	 * Returns a new object of class '<em>EEF Tree Dialog Select Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Tree Dialog Select Description</em>'.
	 * @generated
	 */
	EEFTreeDialogSelectDescription createEEFTreeDialogSelectDescription();

	/**
	 * Returns a new object of class '<em>EEF Link Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Link Description</em>'.
	 * @generated
	 */
	EEFLinkDescription createEEFLinkDescription();

	/**
	 * Returns a new object of class '<em>EEF Image Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Image Description</em>'.
	 * @generated
	 */
	EEFImageDescription createEEFImageDescription();

	/**
	 * Returns a new object of class '<em>EEF Tree Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Tree Description</em>'.
	 * @generated
	 */
	EEFTreeDescription createEEFTreeDescription();

	/**
	 * Returns a new object of class '<em>EEF Image Picker Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Image Picker Description</em>'.
	 * @generated
	 */
	EEFImagePickerDescription createEEFImagePickerDescription();

	/**
	 * Returns a new object of class '<em>EEF Table Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Table Description</em>'.
	 * @generated
	 */
	EEFTableDescription createEEFTableDescription();

	/**
	 * Returns a new object of class '<em>EEF Column Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Column Description</em>'.
	 * @generated
	 */
	EEFColumnDescription createEEFColumnDescription();

	/**
	 * Returns a new object of class '<em>EEF Line Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Line Description</em>'.
	 * @generated
	 */
	EEFLineDescription createEEFLineDescription();

	/**
	 * Returns a new object of class '<em>EEF Adapter Factory Table Structure Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Adapter Factory Table Structure Description</em>'.
	 * @generated
	 */
	EEFAdapterFactoryTableStructureDescription createEEFAdapterFactoryTableStructureDescription();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EefPackage getEefPackage();

} //EefFactory
