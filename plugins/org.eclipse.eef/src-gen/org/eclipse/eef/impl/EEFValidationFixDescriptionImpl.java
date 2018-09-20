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

import org.eclipse.eef.EEFValidationFixDescription;
import org.eclipse.eef.EefPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>EEF Validation Fix Description</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.eef.impl.EEFValidationFixDescriptionImpl#getName <em>Name</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFValidationFixDescriptionImpl#getFixExpression <em>Fix Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EEFValidationFixDescriptionImpl extends MinimalEObjectImpl.Container implements EEFValidationFixDescription {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = EEFValidationFixDescriptionImpl.NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFixExpression() <em>Fix Expression</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getFixExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String FIX_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFixExpression() <em>Fix Expression</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getFixExpression()
	 * @generated
	 * @ordered
	 */
	protected String fixExpression = EEFValidationFixDescriptionImpl.FIX_EXPRESSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EEFValidationFixDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefPackage.Literals.EEF_VALIDATION_FIX_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_VALIDATION_FIX_DESCRIPTION__NAME, oldName, name));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getFixExpression() {
		return fixExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setFixExpression(String newFixExpression) {
		String oldFixExpression = fixExpression;
		fixExpression = newFixExpression;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_VALIDATION_FIX_DESCRIPTION__FIX_EXPRESSION, oldFixExpression,
					fixExpression));
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
		case EefPackage.EEF_VALIDATION_FIX_DESCRIPTION__NAME:
			return getName();
		case EefPackage.EEF_VALIDATION_FIX_DESCRIPTION__FIX_EXPRESSION:
			return getFixExpression();
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
		case EefPackage.EEF_VALIDATION_FIX_DESCRIPTION__NAME:
			setName((String) newValue);
			return;
		case EefPackage.EEF_VALIDATION_FIX_DESCRIPTION__FIX_EXPRESSION:
			setFixExpression((String) newValue);
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
		case EefPackage.EEF_VALIDATION_FIX_DESCRIPTION__NAME:
			setName(EEFValidationFixDescriptionImpl.NAME_EDEFAULT);
			return;
		case EefPackage.EEF_VALIDATION_FIX_DESCRIPTION__FIX_EXPRESSION:
			setFixExpression(EEFValidationFixDescriptionImpl.FIX_EXPRESSION_EDEFAULT);
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
		case EefPackage.EEF_VALIDATION_FIX_DESCRIPTION__NAME:
			return EEFValidationFixDescriptionImpl.NAME_EDEFAULT == null ? name != null : !EEFValidationFixDescriptionImpl.NAME_EDEFAULT.equals(name);
		case EefPackage.EEF_VALIDATION_FIX_DESCRIPTION__FIX_EXPRESSION:
			return EEFValidationFixDescriptionImpl.FIX_EXPRESSION_EDEFAULT == null ? fixExpression != null
					: !EEFValidationFixDescriptionImpl.FIX_EXPRESSION_EDEFAULT.equals(fixExpression);
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
		result.append(" (name: "); //$NON-NLS-1$
		result.append(name);
		result.append(", fixExpression: "); //$NON-NLS-1$
		result.append(fixExpression);
		result.append(')');
		return result.toString();
	}

} // EEFValidationFixDescriptionImpl
