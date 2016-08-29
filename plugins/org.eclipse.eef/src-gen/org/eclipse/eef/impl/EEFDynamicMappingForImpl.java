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

import org.eclipse.eef.EEFDynamicMappingFor;
import org.eclipse.eef.EEFDynamicMappingIf;
import org.eclipse.eef.EefPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>EEF Dynamic Mapping For</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.eef.impl.EEFDynamicMappingForImpl#getIterator <em>Iterator</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFDynamicMappingForImpl#getIterableExpression <em>Iterable Expression</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFDynamicMappingForImpl#getIfs <em>Ifs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EEFDynamicMappingForImpl extends EEFControlDescriptionImpl implements EEFDynamicMappingFor {
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
	 * The default value of the '{@link #getIterableExpression() <em>Iterable Expression</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getIterableExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String ITERABLE_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIterableExpression() <em>Iterable Expression</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getIterableExpression()
	 * @generated
	 * @ordered
	 */
	protected String iterableExpression = EEFDynamicMappingForImpl.ITERABLE_EXPRESSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIfs() <em>Ifs</em>}' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #getIfs()
	 * @generated
	 * @ordered
	 */
	protected EList<EEFDynamicMappingIf> ifs;

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
	public String getIterableExpression() {
		return iterableExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setIterableExpression(String newIterableExpression) {
		String oldIterableExpression = iterableExpression;
		iterableExpression = newIterableExpression;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_DYNAMIC_MAPPING_FOR__ITERABLE_EXPRESSION, oldIterableExpression,
					iterableExpression));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<EEFDynamicMappingIf> getIfs() {
		if (ifs == null) {
			ifs = new EObjectContainmentEList.Resolving<EEFDynamicMappingIf>(EEFDynamicMappingIf.class, this, EefPackage.EEF_DYNAMIC_MAPPING_FOR__IFS);
		}
		return ifs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EefPackage.EEF_DYNAMIC_MAPPING_FOR__IFS:
			return ((InternalEList<?>) getIfs()).basicRemove(otherEnd, msgs);
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
		case EefPackage.EEF_DYNAMIC_MAPPING_FOR__ITERABLE_EXPRESSION:
			return getIterableExpression();
		case EefPackage.EEF_DYNAMIC_MAPPING_FOR__IFS:
			return getIfs();
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
		case EefPackage.EEF_DYNAMIC_MAPPING_FOR__ITERATOR:
			setIterator((String) newValue);
			return;
		case EefPackage.EEF_DYNAMIC_MAPPING_FOR__ITERABLE_EXPRESSION:
			setIterableExpression((String) newValue);
			return;
		case EefPackage.EEF_DYNAMIC_MAPPING_FOR__IFS:
			getIfs().clear();
			getIfs().addAll((Collection<? extends EEFDynamicMappingIf>) newValue);
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
		case EefPackage.EEF_DYNAMIC_MAPPING_FOR__ITERABLE_EXPRESSION:
			setIterableExpression(EEFDynamicMappingForImpl.ITERABLE_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_DYNAMIC_MAPPING_FOR__IFS:
			getIfs().clear();
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
		case EefPackage.EEF_DYNAMIC_MAPPING_FOR__ITERABLE_EXPRESSION:
			return EEFDynamicMappingForImpl.ITERABLE_EXPRESSION_EDEFAULT == null ? iterableExpression != null
			: !EEFDynamicMappingForImpl.ITERABLE_EXPRESSION_EDEFAULT.equals(iterableExpression);
		case EefPackage.EEF_DYNAMIC_MAPPING_FOR__IFS:
			return ifs != null && !ifs.isEmpty();
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
		result.append(", iterableExpression: "); //$NON-NLS-1$
		result.append(iterableExpression);
		result.append(')');
		return result.toString();
	}

} // EEFDynamicMappingForImpl
