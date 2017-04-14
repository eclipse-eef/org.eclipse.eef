/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef.impl;

import org.eclipse.eef.EEFRuleAuditDescription;
import org.eclipse.eef.EefPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>EEF Rule Audit Description</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.eef.impl.EEFRuleAuditDescriptionImpl#getAuditExpression <em>Audit Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EEFRuleAuditDescriptionImpl extends MinimalEObjectImpl.Container implements EEFRuleAuditDescription {
	/**
	 * The default value of the '{@link #getAuditExpression() <em>Audit Expression</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 *
	 * @see #getAuditExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String AUDIT_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuditExpression() <em>Audit Expression</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 *
	 * @see #getAuditExpression()
	 * @generated
	 * @ordered
	 */
	protected String auditExpression = EEFRuleAuditDescriptionImpl.AUDIT_EXPRESSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected EEFRuleAuditDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefPackage.Literals.EEF_RULE_AUDIT_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getAuditExpression() {
		return auditExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setAuditExpression(String newAuditExpression) {
		String oldAuditExpression = auditExpression;
		auditExpression = newAuditExpression;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_RULE_AUDIT_DESCRIPTION__AUDIT_EXPRESSION, oldAuditExpression,
					auditExpression));
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
		case EefPackage.EEF_RULE_AUDIT_DESCRIPTION__AUDIT_EXPRESSION:
			return getAuditExpression();
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
		case EefPackage.EEF_RULE_AUDIT_DESCRIPTION__AUDIT_EXPRESSION:
			setAuditExpression((String) newValue);
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
		case EefPackage.EEF_RULE_AUDIT_DESCRIPTION__AUDIT_EXPRESSION:
			setAuditExpression(EEFRuleAuditDescriptionImpl.AUDIT_EXPRESSION_EDEFAULT);
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
		case EefPackage.EEF_RULE_AUDIT_DESCRIPTION__AUDIT_EXPRESSION:
			return EEFRuleAuditDescriptionImpl.AUDIT_EXPRESSION_EDEFAULT == null ? auditExpression != null
					: !EEFRuleAuditDescriptionImpl.AUDIT_EXPRESSION_EDEFAULT.equals(auditExpression);
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
		result.append(" (auditExpression: "); //$NON-NLS-1$
		result.append(auditExpression);
		result.append(')');
		return result.toString();
	}

} // EEFRuleAuditDescriptionImpl
