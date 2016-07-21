/**
 * Copyright (c) 2016 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.impl;

import org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.EEFExtReferenceDescription;
import org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.EefExtWidgetsReferenceFactory;
import org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.EefExtWidgetsReferencePackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class EefExtWidgetsReferenceFactoryImpl extends EFactoryImpl implements EefExtWidgetsReferenceFactory {
	/**
	 * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static EefExtWidgetsReferenceFactory init() {
		try {
			EefExtWidgetsReferenceFactory theEefExtWidgetsReferenceFactory = (EefExtWidgetsReferenceFactory) EPackage.Registry.INSTANCE
					.getEFactory(EefExtWidgetsReferencePackage.eNS_URI);
			if (theEefExtWidgetsReferenceFactory != null) {
				return theEefExtWidgetsReferenceFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EefExtWidgetsReferenceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EefExtWidgetsReferenceFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case EefExtWidgetsReferencePackage.EEF_EXT_REFERENCE_DESCRIPTION:
			return createEEFExtReferenceDescription();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EEFExtReferenceDescription createEEFExtReferenceDescription() {
		EEFExtReferenceDescriptionImpl eefExtReferenceDescription = new EEFExtReferenceDescriptionImpl();
		return eefExtReferenceDescription;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EefExtWidgetsReferencePackage getEefExtWidgetsReferencePackage() {
		return (EefExtWidgetsReferencePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EefExtWidgetsReferencePackage getPackage() {
		return EefExtWidgetsReferencePackage.eINSTANCE;
	}

} // EefExtWidgetsReferenceFactoryImpl
