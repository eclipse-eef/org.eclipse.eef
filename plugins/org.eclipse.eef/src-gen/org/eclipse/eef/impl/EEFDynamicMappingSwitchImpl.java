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

import org.eclipse.eef.EEFDynamicMappingCase;
import org.eclipse.eef.EEFDynamicMappingSwitch;
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
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>EEF Dynamic Mapping Switch</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.eef.impl.EEFDynamicMappingSwitchImpl#getSwitchExpression <em>Switch Expression</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFDynamicMappingSwitchImpl#getCases <em>Cases</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EEFDynamicMappingSwitchImpl extends MinimalEObjectImpl.Container implements EEFDynamicMappingSwitch {
	/**
	 * The default value of the '{@link #getSwitchExpression() <em>Switch Expression</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getSwitchExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String SWITCH_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSwitchExpression() <em>Switch Expression</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getSwitchExpression()
	 * @generated
	 * @ordered
	 */
	protected String switchExpression = EEFDynamicMappingSwitchImpl.SWITCH_EXPRESSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCases() <em>Cases</em>}' containment reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getCases()
	 * @generated
	 * @ordered
	 */
	protected EList<EEFDynamicMappingCase> cases;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected EEFDynamicMappingSwitchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefPackage.Literals.EEF_DYNAMIC_MAPPING_SWITCH;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getSwitchExpression() {
		return switchExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setSwitchExpression(String newSwitchExpression) {
		String oldSwitchExpression = switchExpression;
		switchExpression = newSwitchExpression;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_DYNAMIC_MAPPING_SWITCH__SWITCH_EXPRESSION, oldSwitchExpression,
					switchExpression));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<EEFDynamicMappingCase> getCases() {
		if (cases == null) {
			cases = new EObjectContainmentEList.Resolving<EEFDynamicMappingCase>(EEFDynamicMappingCase.class, this,
					EefPackage.EEF_DYNAMIC_MAPPING_SWITCH__CASES);
		}
		return cases;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EefPackage.EEF_DYNAMIC_MAPPING_SWITCH__CASES:
			return ((InternalEList<?>) getCases()).basicRemove(otherEnd, msgs);
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
		case EefPackage.EEF_DYNAMIC_MAPPING_SWITCH__SWITCH_EXPRESSION:
			return getSwitchExpression();
		case EefPackage.EEF_DYNAMIC_MAPPING_SWITCH__CASES:
			return getCases();
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
		case EefPackage.EEF_DYNAMIC_MAPPING_SWITCH__SWITCH_EXPRESSION:
			setSwitchExpression((String) newValue);
			return;
		case EefPackage.EEF_DYNAMIC_MAPPING_SWITCH__CASES:
			getCases().clear();
			getCases().addAll((Collection<? extends EEFDynamicMappingCase>) newValue);
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
		case EefPackage.EEF_DYNAMIC_MAPPING_SWITCH__SWITCH_EXPRESSION:
			setSwitchExpression(EEFDynamicMappingSwitchImpl.SWITCH_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_DYNAMIC_MAPPING_SWITCH__CASES:
			getCases().clear();
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
		case EefPackage.EEF_DYNAMIC_MAPPING_SWITCH__SWITCH_EXPRESSION:
			return EEFDynamicMappingSwitchImpl.SWITCH_EXPRESSION_EDEFAULT == null ? switchExpression != null
			: !EEFDynamicMappingSwitchImpl.SWITCH_EXPRESSION_EDEFAULT.equals(switchExpression);
		case EefPackage.EEF_DYNAMIC_MAPPING_SWITCH__CASES:
			return cases != null && !cases.isEmpty();
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
		result.append(" (switchExpression: "); //$NON-NLS-1$
		result.append(switchExpression);
		result.append(')');
		return result.toString();
	}

} // EEFDynamicMappingSwitchImpl
