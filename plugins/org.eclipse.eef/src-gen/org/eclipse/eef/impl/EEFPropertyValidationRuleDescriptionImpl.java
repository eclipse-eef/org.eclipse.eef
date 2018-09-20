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

import org.eclipse.eef.EEFPropertyValidationRuleDescription;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.EefPackage;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>EEF Property Validation Rule
 * Description</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.eef.impl.EEFPropertyValidationRuleDescriptionImpl#getTargets <em>Targets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EEFPropertyValidationRuleDescriptionImpl extends EEFValidationRuleDescriptionImpl implements EEFPropertyValidationRuleDescription {
	/**
	 * The cached value of the '{@link #getTargets() <em>Targets</em>}' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getTargets()
	 * @generated
	 * @ordered
	 */
	protected EList<EEFWidgetDescription> targets;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EEFPropertyValidationRuleDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefPackage.Literals.EEF_PROPERTY_VALIDATION_RULE_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<EEFWidgetDescription> getTargets() {
		if (targets == null) {
			targets = new EObjectWithInverseResolvingEList.ManyInverse<>(EEFWidgetDescription.class, this,
					EefPackage.EEF_PROPERTY_VALIDATION_RULE_DESCRIPTION__TARGETS, EefPackage.EEF_WIDGET_DESCRIPTION__PROPERTY_VALIDATION_RULES);
		}
		return targets;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EefPackage.EEF_PROPERTY_VALIDATION_RULE_DESCRIPTION__TARGETS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getTargets()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EefPackage.EEF_PROPERTY_VALIDATION_RULE_DESCRIPTION__TARGETS:
			return ((InternalEList<?>) getTargets()).basicRemove(otherEnd, msgs);
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
		case EefPackage.EEF_PROPERTY_VALIDATION_RULE_DESCRIPTION__TARGETS:
			return getTargets();
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
		case EefPackage.EEF_PROPERTY_VALIDATION_RULE_DESCRIPTION__TARGETS:
			getTargets().clear();
			getTargets().addAll((Collection<? extends EEFWidgetDescription>) newValue);
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
		case EefPackage.EEF_PROPERTY_VALIDATION_RULE_DESCRIPTION__TARGETS:
			getTargets().clear();
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
		case EefPackage.EEF_PROPERTY_VALIDATION_RULE_DESCRIPTION__TARGETS:
			return targets != null && !targets.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // EEFPropertyValidationRuleDescriptionImpl
