/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef.eef.impl;

import org.eclipse.eef.eef.EEFLinkDescription;
import org.eclipse.eef.eef.EefPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EEF Link Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eef.eef.impl.EEFLinkDescriptionImpl#getOnClickExpression <em>On Click Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EEFLinkDescriptionImpl extends EEFCellWidgetDescriptionImpl implements EEFLinkDescription {
	/**
	 * The default value of the '{@link #getOnClickExpression() <em>On Click Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnClickExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_CLICK_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnClickExpression() <em>On Click Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnClickExpression()
	 * @generated
	 * @ordered
	 */
	protected String onClickExpression = ON_CLICK_EXPRESSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EEFLinkDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefPackage.Literals.EEF_LINK_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOnClickExpression() {
		return onClickExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOnClickExpression(String newOnClickExpression) {
		String oldOnClickExpression = onClickExpression;
		onClickExpression = newOnClickExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_LINK_DESCRIPTION__ON_CLICK_EXPRESSION,
					oldOnClickExpression, onClickExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EefPackage.EEF_LINK_DESCRIPTION__ON_CLICK_EXPRESSION:
			return getOnClickExpression();
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
		case EefPackage.EEF_LINK_DESCRIPTION__ON_CLICK_EXPRESSION:
			setOnClickExpression((String) newValue);
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
		case EefPackage.EEF_LINK_DESCRIPTION__ON_CLICK_EXPRESSION:
			setOnClickExpression(ON_CLICK_EXPRESSION_EDEFAULT);
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
		case EefPackage.EEF_LINK_DESCRIPTION__ON_CLICK_EXPRESSION:
			return ON_CLICK_EXPRESSION_EDEFAULT == null ? onClickExpression != null
					: !ON_CLICK_EXPRESSION_EDEFAULT.equals(onClickExpression);
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
		result.append(" (onClickExpression: "); //$NON-NLS-1$
		result.append(onClickExpression);
		result.append(')');
		return result.toString();
	}

} //EEFLinkDescriptionImpl
