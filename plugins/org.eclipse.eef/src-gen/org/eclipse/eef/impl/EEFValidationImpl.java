/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef.impl;

import java.util.Collection;

import org.eclipse.eef.EEFQuickFix;
import org.eclipse.eef.EEFValidation;
import org.eclipse.eef.EefPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EEF Validation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eef.impl.EEFValidationImpl#getValidationExpression <em>Validation Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.impl.EEFValidationImpl#getQuickfixes <em>Quickfixes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EEFValidationImpl extends MinimalEObjectImpl.Container implements EEFValidation {
	/**
	 * The default value of the '{@link #getValidationExpression() <em>Validation Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidationExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATION_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValidationExpression() <em>Validation Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidationExpression()
	 * @generated
	 * @ordered
	 */
	protected String validationExpression = VALIDATION_EXPRESSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getQuickfixes() <em>Quickfixes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuickfixes()
	 * @generated
	 * @ordered
	 */
	protected EList<EEFQuickFix> quickfixes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EEFValidationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefPackage.Literals.EEF_VALIDATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValidationExpression() {
		return validationExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValidationExpression(String newValidationExpression) {
		String oldValidationExpression = validationExpression;
		validationExpression = newValidationExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_VALIDATION__VALIDATION_EXPRESSION, oldValidationExpression,
					validationExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EEFQuickFix> getQuickfixes() {
		if (quickfixes == null) {
			quickfixes = new EObjectContainmentEList.Resolving<EEFQuickFix>(EEFQuickFix.class, this, EefPackage.EEF_VALIDATION__QUICKFIXES);
		}
		return quickfixes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EefPackage.EEF_VALIDATION__QUICKFIXES:
			return ((InternalEList<?>) getQuickfixes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EefPackage.EEF_VALIDATION__VALIDATION_EXPRESSION:
			return getValidationExpression();
		case EefPackage.EEF_VALIDATION__QUICKFIXES:
			return getQuickfixes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EefPackage.EEF_VALIDATION__VALIDATION_EXPRESSION:
			setValidationExpression((String) newValue);
			return;
		case EefPackage.EEF_VALIDATION__QUICKFIXES:
			getQuickfixes().clear();
			getQuickfixes().addAll((Collection<? extends EEFQuickFix>) newValue);
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
		case EefPackage.EEF_VALIDATION__VALIDATION_EXPRESSION:
			setValidationExpression(VALIDATION_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_VALIDATION__QUICKFIXES:
			getQuickfixes().clear();
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
		case EefPackage.EEF_VALIDATION__VALIDATION_EXPRESSION:
			return VALIDATION_EXPRESSION_EDEFAULT == null ? validationExpression != null
					: !VALIDATION_EXPRESSION_EDEFAULT.equals(validationExpression);
		case EefPackage.EEF_VALIDATION__QUICKFIXES:
			return quickfixes != null && !quickfixes.isEmpty();
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
		result.append(" (validationExpression: "); //$NON-NLS-1$
		result.append(validationExpression);
		result.append(')');
		return result.toString();
	}

} //EEFValidationImpl
