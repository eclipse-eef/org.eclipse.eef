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

import org.eclipse.eef.EEFSemanticValidationRuleDescription;
import org.eclipse.eef.EefPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>EEF Semantic Validation Rule
 * Description</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.eef.impl.EEFSemanticValidationRuleDescriptionImpl#getTargetClass <em>Target Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EEFSemanticValidationRuleDescriptionImpl extends EEFValidationRuleDescriptionImpl implements EEFSemanticValidationRuleDescription {
	/**
	 * The default value of the '{@link #getTargetClass() <em>Target Class</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getTargetClass()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetClass() <em>Target Class</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getTargetClass()
	 * @generated
	 * @ordered
	 */
	protected String targetClass = EEFSemanticValidationRuleDescriptionImpl.TARGET_CLASS_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EEFSemanticValidationRuleDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefPackage.Literals.EEF_SEMANTIC_VALIDATION_RULE_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getTargetClass() {
		return targetClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setTargetClass(String newTargetClass) {
		String oldTargetClass = targetClass;
		targetClass = newTargetClass;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_SEMANTIC_VALIDATION_RULE_DESCRIPTION__TARGET_CLASS, oldTargetClass,
					targetClass));
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
		case EefPackage.EEF_SEMANTIC_VALIDATION_RULE_DESCRIPTION__TARGET_CLASS:
			return getTargetClass();
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
		case EefPackage.EEF_SEMANTIC_VALIDATION_RULE_DESCRIPTION__TARGET_CLASS:
			setTargetClass((String) newValue);
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
		case EefPackage.EEF_SEMANTIC_VALIDATION_RULE_DESCRIPTION__TARGET_CLASS:
			setTargetClass(EEFSemanticValidationRuleDescriptionImpl.TARGET_CLASS_EDEFAULT);
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
		case EefPackage.EEF_SEMANTIC_VALIDATION_RULE_DESCRIPTION__TARGET_CLASS:
			return EEFSemanticValidationRuleDescriptionImpl.TARGET_CLASS_EDEFAULT == null ? targetClass != null
					: !EEFSemanticValidationRuleDescriptionImpl.TARGET_CLASS_EDEFAULT.equals(targetClass);
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
		result.append(" (targetClass: "); //$NON-NLS-1$
		result.append(targetClass);
		result.append(')');
		return result.toString();
	}

} // EEFSemanticValidationRuleDescriptionImpl
