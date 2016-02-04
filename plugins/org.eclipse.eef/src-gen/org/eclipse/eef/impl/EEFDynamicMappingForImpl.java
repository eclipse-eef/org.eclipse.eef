/**
 * Copyright (c) 2016 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef.impl;

import org.eclipse.eef.EEFDynamicMappingFor;
import org.eclipse.eef.EEFDynamicMappingSwitch;
import org.eclipse.eef.EefPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>EEF Dynamic Mapping For</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.eef.impl.EEFDynamicMappingForImpl#getIterator <em>Iterator</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFDynamicMappingForImpl#getDomainClassExpression <em>Domain Class Expression</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFDynamicMappingForImpl#getSwitch <em>Switch</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EEFDynamicMappingForImpl extends MinimalEObjectImpl.Container implements EEFDynamicMappingFor {
	/**
	 * The default value of the '{@link #getIterator() <em>Iterator</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #getIterator()
	 * @generated
	 * @ordered
	 */
	protected static final String ITERATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIterator() <em>Iterator</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #getIterator()
	 * @generated
	 * @ordered
	 */
	protected String iterator = EEFDynamicMappingForImpl.ITERATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getDomainClassExpression() <em>Domain Class Expression</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getDomainClassExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAIN_CLASS_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomainClassExpression() <em>Domain Class Expression</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getDomainClassExpression()
	 * @generated
	 * @ordered
	 */
	protected String domainClassExpression = EEFDynamicMappingForImpl.DOMAIN_CLASS_EXPRESSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSwitch() <em>Switch</em>}' containment reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getSwitch()
	 * @generated
	 * @ordered
	 */
	protected EEFDynamicMappingSwitch switch_;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected EEFDynamicMappingForImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefPackage.Literals.EEF_DYNAMIC_MAPPING_FOR;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getIterator() {
		return iterator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setIterator(String newIterator) {
		String oldIterator = iterator;
		iterator = newIterator;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_DYNAMIC_MAPPING_FOR__ITERATOR, oldIterator, iterator));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getDomainClassExpression() {
		return domainClassExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setDomainClassExpression(String newDomainClassExpression) {
		String oldDomainClassExpression = domainClassExpression;
		domainClassExpression = newDomainClassExpression;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_DYNAMIC_MAPPING_FOR__DOMAIN_CLASS_EXPRESSION,
					oldDomainClassExpression, domainClassExpression));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EEFDynamicMappingSwitch getSwitch() {
		if (switch_ != null && switch_.eIsProxy()) {
			InternalEObject oldSwitch = (InternalEObject) switch_;
			switch_ = (EEFDynamicMappingSwitch) eResolveProxy(oldSwitch);
			if (switch_ != oldSwitch) {
				InternalEObject newSwitch = (InternalEObject) switch_;
				NotificationChain msgs = oldSwitch.eInverseRemove(this, InternalEObject.EOPPOSITE_FEATURE_BASE
						- EefPackage.EEF_DYNAMIC_MAPPING_FOR__SWITCH, null, null);
				if (newSwitch.eInternalContainer() == null) {
					msgs = newSwitch.eInverseAdd(this, InternalEObject.EOPPOSITE_FEATURE_BASE - EefPackage.EEF_DYNAMIC_MAPPING_FOR__SWITCH, null,
							msgs);
				}
				if (msgs != null) {
					msgs.dispatch();
				}
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EefPackage.EEF_DYNAMIC_MAPPING_FOR__SWITCH, oldSwitch, switch_));
				}
			}
		}
		return switch_;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EEFDynamicMappingSwitch basicGetSwitch() {
		return switch_;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public NotificationChain basicSetSwitch(EEFDynamicMappingSwitch newSwitch, NotificationChain msgs) {
		EEFDynamicMappingSwitch oldSwitch = switch_;
		switch_ = newSwitch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EefPackage.EEF_DYNAMIC_MAPPING_FOR__SWITCH, oldSwitch,
					newSwitch);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setSwitch(EEFDynamicMappingSwitch newSwitch) {
		if (newSwitch != switch_) {
			NotificationChain msgs = null;
			if (switch_ != null) {
				msgs = ((InternalEObject) switch_).eInverseRemove(this, InternalEObject.EOPPOSITE_FEATURE_BASE
						- EefPackage.EEF_DYNAMIC_MAPPING_FOR__SWITCH, null, msgs);
			}
			if (newSwitch != null) {
				msgs = ((InternalEObject) newSwitch).eInverseAdd(this, InternalEObject.EOPPOSITE_FEATURE_BASE
						- EefPackage.EEF_DYNAMIC_MAPPING_FOR__SWITCH, null, msgs);
			}
			msgs = basicSetSwitch(newSwitch, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_DYNAMIC_MAPPING_FOR__SWITCH, newSwitch, newSwitch));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EefPackage.EEF_DYNAMIC_MAPPING_FOR__SWITCH:
			return basicSetSwitch(null, msgs);
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
		case EefPackage.EEF_DYNAMIC_MAPPING_FOR__ITERATOR:
			return getIterator();
		case EefPackage.EEF_DYNAMIC_MAPPING_FOR__DOMAIN_CLASS_EXPRESSION:
			return getDomainClassExpression();
		case EefPackage.EEF_DYNAMIC_MAPPING_FOR__SWITCH:
			if (resolve) {
				return getSwitch();
			}
			return basicGetSwitch();
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
		case EefPackage.EEF_DYNAMIC_MAPPING_FOR__ITERATOR:
			setIterator((String) newValue);
			return;
		case EefPackage.EEF_DYNAMIC_MAPPING_FOR__DOMAIN_CLASS_EXPRESSION:
			setDomainClassExpression((String) newValue);
			return;
		case EefPackage.EEF_DYNAMIC_MAPPING_FOR__SWITCH:
			setSwitch((EEFDynamicMappingSwitch) newValue);
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
		case EefPackage.EEF_DYNAMIC_MAPPING_FOR__ITERATOR:
			setIterator(EEFDynamicMappingForImpl.ITERATOR_EDEFAULT);
			return;
		case EefPackage.EEF_DYNAMIC_MAPPING_FOR__DOMAIN_CLASS_EXPRESSION:
			setDomainClassExpression(EEFDynamicMappingForImpl.DOMAIN_CLASS_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_DYNAMIC_MAPPING_FOR__SWITCH:
			setSwitch((EEFDynamicMappingSwitch) null);
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
		case EefPackage.EEF_DYNAMIC_MAPPING_FOR__ITERATOR:
			return EEFDynamicMappingForImpl.ITERATOR_EDEFAULT == null ? iterator != null : !EEFDynamicMappingForImpl.ITERATOR_EDEFAULT
			.equals(iterator);
		case EefPackage.EEF_DYNAMIC_MAPPING_FOR__DOMAIN_CLASS_EXPRESSION:
			return EEFDynamicMappingForImpl.DOMAIN_CLASS_EXPRESSION_EDEFAULT == null ? domainClassExpression != null
			: !EEFDynamicMappingForImpl.DOMAIN_CLASS_EXPRESSION_EDEFAULT.equals(domainClassExpression);
		case EefPackage.EEF_DYNAMIC_MAPPING_FOR__SWITCH:
			return switch_ != null;
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
		result.append(" (iterator: "); //$NON-NLS-1$
		result.append(iterator);
		result.append(", domainClassExpression: "); //$NON-NLS-1$
		result.append(domainClassExpression);
		result.append(')');
		return result.toString();
	}

} // EEFDynamicMappingForImpl
