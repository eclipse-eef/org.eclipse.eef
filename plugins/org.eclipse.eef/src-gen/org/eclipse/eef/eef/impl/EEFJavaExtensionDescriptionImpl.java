/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef.eef.impl;

import org.eclipse.eef.eef.EEFJavaExtensionDescription;
import org.eclipse.eef.eef.EefPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EEF Java Extension Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eef.eef.impl.EEFJavaExtensionDescriptionImpl#getQualifiedName <em>Qualified Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EEFJavaExtensionDescriptionImpl extends MinimalEObjectImpl.Container
		implements EEFJavaExtensionDescription {
	/**
	 * The default value of the '{@link #getQualifiedName() <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALIFIED_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQualifiedName() <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected String qualifiedName = QUALIFIED_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EEFJavaExtensionDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefPackage.Literals.EEF_JAVA_EXTENSION_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQualifiedName() {
		return qualifiedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQualifiedName(String newQualifiedName) {
		String oldQualifiedName = qualifiedName;
		qualifiedName = newQualifiedName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EefPackage.EEF_JAVA_EXTENSION_DESCRIPTION__QUALIFIED_NAME, oldQualifiedName, qualifiedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EefPackage.EEF_JAVA_EXTENSION_DESCRIPTION__QUALIFIED_NAME:
			return getQualifiedName();
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
		case EefPackage.EEF_JAVA_EXTENSION_DESCRIPTION__QUALIFIED_NAME:
			setQualifiedName((String) newValue);
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
		case EefPackage.EEF_JAVA_EXTENSION_DESCRIPTION__QUALIFIED_NAME:
			setQualifiedName(QUALIFIED_NAME_EDEFAULT);
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
		case EefPackage.EEF_JAVA_EXTENSION_DESCRIPTION__QUALIFIED_NAME:
			return QUALIFIED_NAME_EDEFAULT == null ? qualifiedName != null
					: !QUALIFIED_NAME_EDEFAULT.equals(qualifiedName);
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
		result.append(" (qualifiedName: "); //$NON-NLS-1$
		result.append(qualifiedName);
		result.append(')');
		return result.toString();
	}

} //EEFJavaExtensionDescriptionImpl
