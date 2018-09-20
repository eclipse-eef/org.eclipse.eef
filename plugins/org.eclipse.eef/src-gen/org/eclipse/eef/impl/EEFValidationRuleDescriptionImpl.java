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

import java.util.Collection;

import org.eclipse.eef.EEFRuleAuditDescription;
import org.eclipse.eef.EEFValidationFixDescription;
import org.eclipse.eef.EEFValidationRuleDescription;
import org.eclipse.eef.EEF_VALIDATION_SEVERITY_DESCRIPTION;
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
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>EEF Validation Rule Description</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.eef.impl.EEFValidationRuleDescriptionImpl#getSeverity <em>Severity</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFValidationRuleDescriptionImpl#getMessageExpression <em>Message
 * Expression</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFValidationRuleDescriptionImpl#getAudits <em>Audits</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFValidationRuleDescriptionImpl#getFixes <em>Fixes</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EEFValidationRuleDescriptionImpl extends MinimalEObjectImpl.Container implements EEFValidationRuleDescription {
	/**
	 * The default value of the '{@link #getSeverity() <em>Severity</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected static final EEF_VALIDATION_SEVERITY_DESCRIPTION SEVERITY_EDEFAULT = EEF_VALIDATION_SEVERITY_DESCRIPTION.INFO;

	/**
	 * The cached value of the '{@link #getSeverity() <em>Severity</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected EEF_VALIDATION_SEVERITY_DESCRIPTION severity = EEFValidationRuleDescriptionImpl.SEVERITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessageExpression() <em>Message Expression</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMessageExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessageExpression() <em>Message Expression</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMessageExpression()
	 * @generated
	 * @ordered
	 */
	protected String messageExpression = EEFValidationRuleDescriptionImpl.MESSAGE_EXPRESSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAudits() <em>Audits</em>}' containment reference list. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getAudits()
	 * @generated
	 * @ordered
	 */
	protected EList<EEFRuleAuditDescription> audits;

	/**
	 * The cached value of the '{@link #getFixes() <em>Fixes</em>}' containment reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getFixes()
	 * @generated
	 * @ordered
	 */
	protected EList<EEFValidationFixDescription> fixes;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EEFValidationRuleDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefPackage.Literals.EEF_VALIDATION_RULE_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EEF_VALIDATION_SEVERITY_DESCRIPTION getSeverity() {
		return severity;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setSeverity(EEF_VALIDATION_SEVERITY_DESCRIPTION newSeverity) {
		EEF_VALIDATION_SEVERITY_DESCRIPTION oldSeverity = severity;
		severity = newSeverity == null ? EEFValidationRuleDescriptionImpl.SEVERITY_EDEFAULT : newSeverity;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_VALIDATION_RULE_DESCRIPTION__SEVERITY, oldSeverity, severity));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getMessageExpression() {
		return messageExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setMessageExpression(String newMessageExpression) {
		String oldMessageExpression = messageExpression;
		messageExpression = newMessageExpression;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_VALIDATION_RULE_DESCRIPTION__MESSAGE_EXPRESSION,
					oldMessageExpression, messageExpression));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<EEFRuleAuditDescription> getAudits() {
		if (audits == null) {
			audits = new EObjectContainmentEList.Resolving<>(EEFRuleAuditDescription.class, this,
					EefPackage.EEF_VALIDATION_RULE_DESCRIPTION__AUDITS);
		}
		return audits;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<EEFValidationFixDescription> getFixes() {
		if (fixes == null) {
			fixes = new EObjectContainmentEList.Resolving<>(EEFValidationFixDescription.class, this,
					EefPackage.EEF_VALIDATION_RULE_DESCRIPTION__FIXES);
		}
		return fixes;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EefPackage.EEF_VALIDATION_RULE_DESCRIPTION__AUDITS:
			return ((InternalEList<?>) getAudits()).basicRemove(otherEnd, msgs);
		case EefPackage.EEF_VALIDATION_RULE_DESCRIPTION__FIXES:
			return ((InternalEList<?>) getFixes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EefPackage.EEF_VALIDATION_RULE_DESCRIPTION__SEVERITY:
			return getSeverity();
		case EefPackage.EEF_VALIDATION_RULE_DESCRIPTION__MESSAGE_EXPRESSION:
			return getMessageExpression();
		case EefPackage.EEF_VALIDATION_RULE_DESCRIPTION__AUDITS:
			return getAudits();
		case EefPackage.EEF_VALIDATION_RULE_DESCRIPTION__FIXES:
			return getFixes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EefPackage.EEF_VALIDATION_RULE_DESCRIPTION__SEVERITY:
			setSeverity((EEF_VALIDATION_SEVERITY_DESCRIPTION) newValue);
			return;
		case EefPackage.EEF_VALIDATION_RULE_DESCRIPTION__MESSAGE_EXPRESSION:
			setMessageExpression((String) newValue);
			return;
		case EefPackage.EEF_VALIDATION_RULE_DESCRIPTION__AUDITS:
			getAudits().clear();
			getAudits().addAll((Collection<? extends EEFRuleAuditDescription>) newValue);
			return;
		case EefPackage.EEF_VALIDATION_RULE_DESCRIPTION__FIXES:
			getFixes().clear();
			getFixes().addAll((Collection<? extends EEFValidationFixDescription>) newValue);
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
		case EefPackage.EEF_VALIDATION_RULE_DESCRIPTION__SEVERITY:
			setSeverity(EEFValidationRuleDescriptionImpl.SEVERITY_EDEFAULT);
			return;
		case EefPackage.EEF_VALIDATION_RULE_DESCRIPTION__MESSAGE_EXPRESSION:
			setMessageExpression(EEFValidationRuleDescriptionImpl.MESSAGE_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_VALIDATION_RULE_DESCRIPTION__AUDITS:
			getAudits().clear();
			return;
		case EefPackage.EEF_VALIDATION_RULE_DESCRIPTION__FIXES:
			getFixes().clear();
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
		case EefPackage.EEF_VALIDATION_RULE_DESCRIPTION__SEVERITY:
			return severity != EEFValidationRuleDescriptionImpl.SEVERITY_EDEFAULT;
		case EefPackage.EEF_VALIDATION_RULE_DESCRIPTION__MESSAGE_EXPRESSION:
			return EEFValidationRuleDescriptionImpl.MESSAGE_EXPRESSION_EDEFAULT == null ? messageExpression != null
					: !EEFValidationRuleDescriptionImpl.MESSAGE_EXPRESSION_EDEFAULT.equals(messageExpression);
		case EefPackage.EEF_VALIDATION_RULE_DESCRIPTION__AUDITS:
			return audits != null && !audits.isEmpty();
		case EefPackage.EEF_VALIDATION_RULE_DESCRIPTION__FIXES:
			return fixes != null && !fixes.isEmpty();
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
		result.append(" (severity: "); //$NON-NLS-1$
		result.append(severity);
		result.append(", messageExpression: "); //$NON-NLS-1$
		result.append(messageExpression);
		result.append(')');
		return result.toString();
	}

} // EEFValidationRuleDescriptionImpl
