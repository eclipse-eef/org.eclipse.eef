/**
 * Copyright (c) 2015, 2018 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef.impl;

import org.eclipse.eef.EEFFillLayoutDescription;
import org.eclipse.eef.EEF_FILL_LAYOUT_ORIENTATION;
import org.eclipse.eef.EefPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>EEF Fill Layout Description</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.eef.impl.EEFFillLayoutDescriptionImpl#getOrientation <em>Orientation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EEFFillLayoutDescriptionImpl extends EEFLayoutDescriptionImpl implements EEFFillLayoutDescription {
	/**
	 * The default value of the '{@link #getOrientation() <em>Orientation</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected static final EEF_FILL_LAYOUT_ORIENTATION ORIENTATION_EDEFAULT = EEF_FILL_LAYOUT_ORIENTATION.VERTICAL;

	/**
	 * The cached value of the '{@link #getOrientation() <em>Orientation</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected EEF_FILL_LAYOUT_ORIENTATION orientation = EEFFillLayoutDescriptionImpl.ORIENTATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EEFFillLayoutDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefPackage.Literals.EEF_FILL_LAYOUT_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EEF_FILL_LAYOUT_ORIENTATION getOrientation() {
		return orientation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setOrientation(EEF_FILL_LAYOUT_ORIENTATION newOrientation) {
		EEF_FILL_LAYOUT_ORIENTATION oldOrientation = orientation;
		orientation = newOrientation == null ? EEFFillLayoutDescriptionImpl.ORIENTATION_EDEFAULT : newOrientation;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_FILL_LAYOUT_DESCRIPTION__ORIENTATION, oldOrientation, orientation));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EefPackage.EEF_FILL_LAYOUT_DESCRIPTION__ORIENTATION:
			return getOrientation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EefPackage.EEF_FILL_LAYOUT_DESCRIPTION__ORIENTATION:
			setOrientation((EEF_FILL_LAYOUT_ORIENTATION) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case EefPackage.EEF_FILL_LAYOUT_DESCRIPTION__ORIENTATION:
			setOrientation(EEFFillLayoutDescriptionImpl.ORIENTATION_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case EefPackage.EEF_FILL_LAYOUT_DESCRIPTION__ORIENTATION:
			return orientation != EEFFillLayoutDescriptionImpl.ORIENTATION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (orientation: "); //$NON-NLS-1$
		result.append(orientation);
		result.append(')');
		return result.toString();
	}

} // EEFFillLayoutDescriptionImpl
