/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef.eef.impl;

import org.eclipse.eef.eef.EEFAdapterFactoryTableStructureDescription;
import org.eclipse.eef.eef.EefPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EEF Adapter Factory Table Structure Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eef.eef.impl.EEFAdapterFactoryTableStructureDescriptionImpl#getAdapterFactoryProvider <em>Adapter Factory Provider</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EEFAdapterFactoryTableStructureDescriptionImpl extends EEFTableStructureDescriptionImpl
		implements EEFAdapterFactoryTableStructureDescription {
	/**
	 * The default value of the '{@link #getAdapterFactoryProvider() <em>Adapter Factory Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdapterFactoryProvider()
	 * @generated
	 * @ordered
	 */
	protected static final String ADAPTER_FACTORY_PROVIDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdapterFactoryProvider() <em>Adapter Factory Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdapterFactoryProvider()
	 * @generated
	 * @ordered
	 */
	protected String adapterFactoryProvider = ADAPTER_FACTORY_PROVIDER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EEFAdapterFactoryTableStructureDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefPackage.Literals.EEF_ADAPTER_FACTORY_TABLE_STRUCTURE_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAdapterFactoryProvider() {
		return adapterFactoryProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdapterFactoryProvider(String newAdapterFactoryProvider) {
		String oldAdapterFactoryProvider = adapterFactoryProvider;
		adapterFactoryProvider = newAdapterFactoryProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EefPackage.EEF_ADAPTER_FACTORY_TABLE_STRUCTURE_DESCRIPTION__ADAPTER_FACTORY_PROVIDER,
					oldAdapterFactoryProvider, adapterFactoryProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EefPackage.EEF_ADAPTER_FACTORY_TABLE_STRUCTURE_DESCRIPTION__ADAPTER_FACTORY_PROVIDER:
			return getAdapterFactoryProvider();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EefPackage.EEF_ADAPTER_FACTORY_TABLE_STRUCTURE_DESCRIPTION__ADAPTER_FACTORY_PROVIDER:
			setAdapterFactoryProvider((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case EefPackage.EEF_ADAPTER_FACTORY_TABLE_STRUCTURE_DESCRIPTION__ADAPTER_FACTORY_PROVIDER:
			setAdapterFactoryProvider(ADAPTER_FACTORY_PROVIDER_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case EefPackage.EEF_ADAPTER_FACTORY_TABLE_STRUCTURE_DESCRIPTION__ADAPTER_FACTORY_PROVIDER:
			return ADAPTER_FACTORY_PROVIDER_EDEFAULT == null ? adapterFactoryProvider != null
					: !ADAPTER_FACTORY_PROVIDER_EDEFAULT.equals(adapterFactoryProvider);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (adapterFactoryProvider: "); //$NON-NLS-1$
		result.append(adapterFactoryProvider);
		result.append(')');
		return result.toString();
	}

} //EEFAdapterFactoryTableStructureDescriptionImpl
