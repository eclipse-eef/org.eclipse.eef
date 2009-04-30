/**
 *  Copyright (c) 2008 Obeo.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *      Obeo - initial API and implementation
 * 
 *
 * $Id: EEFGenFactory.java,v 1.2 2009/04/30 17:49:10 nlepine Exp $
 */
package org.eclipse.emf.eef.EEFGen;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.eef.EEFGen.EEFGenPackage
 * @generated
 */
public interface EEFGenFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EEFGenFactory eINSTANCE = org.eclipse.emf.eef.EEFGen.impl.EEFGenFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Gen Edition Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Edition Context</em>'.
	 * @generated
	 */
	GenEditionContext createGenEditionContext();

	/**
	 * Returns a new object of class '<em>Model Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Reference</em>'.
	 * @generated
	 */
	EEFGenModelReference createEEFGenModelReference();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	EEFGenModel createEEFGenModel();

	/**
	 * Returns a new object of class '<em>Gen Views Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Views Repository</em>'.
	 * @generated
	 */
	GenViewsRepository createGenViewsRepository();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EEFGenPackage getEEFGenPackage();

} //EEFGenFactory
