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
 * $Id: ModelNavigationImpl.java,v 1.2 2009/05/26 08:20:04 glefur Exp $
 */
package org.eclipse.emf.eef.mapping.navigation.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.eef.mapping.navigation.ModelNavigation;
import org.eclipse.emf.eef.mapping.navigation.NavigationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Navigation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class ModelNavigationImpl extends EObjectImpl implements
		ModelNavigation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelNavigationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NavigationPackage.Literals.MODEL_NAVIGATION;
	}

} //ModelNavigationImpl
