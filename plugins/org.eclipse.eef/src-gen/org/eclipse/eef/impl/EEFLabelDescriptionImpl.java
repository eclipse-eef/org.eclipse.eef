/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef.impl;

import org.eclipse.eef.EEFLabelDescription;
import org.eclipse.eef.EefPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>EEF Label Description</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.eef.impl.EEFLabelDescriptionImpl#getBodyExpression <em>Body Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EEFLabelDescriptionImpl extends EEFWidgetDescriptionImpl implements EEFLabelDescription {
	/**
	 * The default value of the '{@link #getBodyExpression() <em>Body Expression</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 *
	 * @see #getBodyExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String BODY_EXPRESSION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getBodyExpression() <em>Body Expression</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 *
	 * @see #getBodyExpression()
	 * @generated
	 * @ordered
	 */
	protected String bodyExpression = EEFLabelDescriptionImpl.BODY_EXPRESSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected EEFLabelDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefPackage.Literals.EEF_LABEL_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getBodyExpression() {
		return bodyExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setBodyExpression(String newBodyExpression) {
		String oldBodyExpression = bodyExpression;
		bodyExpression = newBodyExpression;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_LABEL_DESCRIPTION__BODY_EXPRESSION, oldBodyExpression,
					bodyExpression));
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
		case EefPackage.EEF_LABEL_DESCRIPTION__BODY_EXPRESSION:
			return getBodyExpression();
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
		case EefPackage.EEF_LABEL_DESCRIPTION__BODY_EXPRESSION:
			setBodyExpression((String) newValue);
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
		case EefPackage.EEF_LABEL_DESCRIPTION__BODY_EXPRESSION:
			setBodyExpression(EEFLabelDescriptionImpl.BODY_EXPRESSION_EDEFAULT);
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
		case EefPackage.EEF_LABEL_DESCRIPTION__BODY_EXPRESSION:
			return EEFLabelDescriptionImpl.BODY_EXPRESSION_EDEFAULT == null ? bodyExpression != null
			: !EEFLabelDescriptionImpl.BODY_EXPRESSION_EDEFAULT.equals(bodyExpression);
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (bodyExpression: "); //$NON-NLS-1$
		result.append(bodyExpression);
		result.append(')');
		return result.toString();
	}

} // EEFLabelDescriptionImpl
