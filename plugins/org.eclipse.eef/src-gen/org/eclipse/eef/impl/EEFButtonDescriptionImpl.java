/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef.impl;

import org.eclipse.eef.EEFButtonDescription;
import org.eclipse.eef.EefPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>EEF Button Description</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.eef.impl.EEFButtonDescriptionImpl#getButtonLabelExpression <em>Button Label Expression</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFButtonDescriptionImpl#getPushExpression <em>Push Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EEFButtonDescriptionImpl extends EEFWidgetDescriptionImpl implements EEFButtonDescription {
	/**
	 * The default value of the '{@link #getButtonLabelExpression() <em>Button Label Expression</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getButtonLabelExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String BUTTON_LABEL_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getButtonLabelExpression() <em>Button Label Expression</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getButtonLabelExpression()
	 * @generated
	 * @ordered
	 */
	protected String buttonLabelExpression = EEFButtonDescriptionImpl.BUTTON_LABEL_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPushExpression() <em>Push Expression</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 *
	 * @see #getPushExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String PUSH_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPushExpression() <em>Push Expression</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 *
	 * @see #getPushExpression()
	 * @generated
	 * @ordered
	 */
	protected String pushExpression = EEFButtonDescriptionImpl.PUSH_EXPRESSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected EEFButtonDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefPackage.Literals.EEF_BUTTON_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getButtonLabelExpression() {
		return buttonLabelExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setButtonLabelExpression(String newButtonLabelExpression) {
		String oldButtonLabelExpression = buttonLabelExpression;
		buttonLabelExpression = newButtonLabelExpression;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_BUTTON_DESCRIPTION__BUTTON_LABEL_EXPRESSION,
					oldButtonLabelExpression, buttonLabelExpression));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getPushExpression() {
		return pushExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setPushExpression(String newPushExpression) {
		String oldPushExpression = pushExpression;
		pushExpression = newPushExpression;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_BUTTON_DESCRIPTION__PUSH_EXPRESSION, oldPushExpression,
					pushExpression));
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
		case EefPackage.EEF_BUTTON_DESCRIPTION__BUTTON_LABEL_EXPRESSION:
			return getButtonLabelExpression();
		case EefPackage.EEF_BUTTON_DESCRIPTION__PUSH_EXPRESSION:
			return getPushExpression();
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
		case EefPackage.EEF_BUTTON_DESCRIPTION__BUTTON_LABEL_EXPRESSION:
			setButtonLabelExpression((String) newValue);
			return;
		case EefPackage.EEF_BUTTON_DESCRIPTION__PUSH_EXPRESSION:
			setPushExpression((String) newValue);
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
		case EefPackage.EEF_BUTTON_DESCRIPTION__BUTTON_LABEL_EXPRESSION:
			setButtonLabelExpression(EEFButtonDescriptionImpl.BUTTON_LABEL_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_BUTTON_DESCRIPTION__PUSH_EXPRESSION:
			setPushExpression(EEFButtonDescriptionImpl.PUSH_EXPRESSION_EDEFAULT);
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
		case EefPackage.EEF_BUTTON_DESCRIPTION__BUTTON_LABEL_EXPRESSION:
			return EEFButtonDescriptionImpl.BUTTON_LABEL_EXPRESSION_EDEFAULT == null ? buttonLabelExpression != null
			: !EEFButtonDescriptionImpl.BUTTON_LABEL_EXPRESSION_EDEFAULT.equals(buttonLabelExpression);
		case EefPackage.EEF_BUTTON_DESCRIPTION__PUSH_EXPRESSION:
			return EEFButtonDescriptionImpl.PUSH_EXPRESSION_EDEFAULT == null ? pushExpression != null
			: !EEFButtonDescriptionImpl.PUSH_EXPRESSION_EDEFAULT.equals(pushExpression);
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
		result.append(" (buttonLabelExpression: "); //$NON-NLS-1$
		result.append(buttonLabelExpression);
		result.append(", pushExpression: "); //$NON-NLS-1$
		result.append(pushExpression);
		result.append(')');
		return result.toString();
	}

} // EEFButtonDescriptionImpl
