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

import org.eclipse.eef.EEFCustomExpression;
import org.eclipse.eef.EEFCustomWidgetDescription;
import org.eclipse.eef.EefPackage;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>EEF Custom Widget Description</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.eef.impl.EEFCustomWidgetDescriptionImpl#getCustomExpressions <em>Custom Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EEFCustomWidgetDescriptionImpl extends EEFWidgetDescriptionImpl implements EEFCustomWidgetDescription {
	/**
	 * The cached value of the '{@link #getCustomExpressions() <em>Custom Expressions</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getCustomExpressions()
	 * @generated
	 * @ordered
	 */
	protected EList<EEFCustomExpression> customExpressions;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected EEFCustomWidgetDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefPackage.Literals.EEF_CUSTOM_WIDGET_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<EEFCustomExpression> getCustomExpressions() {
		if (customExpressions == null) {
			customExpressions = new EObjectContainmentEList.Resolving<EEFCustomExpression>(EEFCustomExpression.class, this,
					EefPackage.EEF_CUSTOM_WIDGET_DESCRIPTION__CUSTOM_EXPRESSIONS);
		}
		return customExpressions;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EefPackage.EEF_CUSTOM_WIDGET_DESCRIPTION__CUSTOM_EXPRESSIONS:
			return ((InternalEList<?>) getCustomExpressions()).basicRemove(otherEnd, msgs);
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
		case EefPackage.EEF_CUSTOM_WIDGET_DESCRIPTION__CUSTOM_EXPRESSIONS:
			return getCustomExpressions();
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
		case EefPackage.EEF_CUSTOM_WIDGET_DESCRIPTION__CUSTOM_EXPRESSIONS:
			getCustomExpressions().clear();
			getCustomExpressions().addAll((Collection<? extends EEFCustomExpression>) newValue);
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
		case EefPackage.EEF_CUSTOM_WIDGET_DESCRIPTION__CUSTOM_EXPRESSIONS:
			getCustomExpressions().clear();
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
		case EefPackage.EEF_CUSTOM_WIDGET_DESCRIPTION__CUSTOM_EXPRESSIONS:
			return customExpressions != null && !customExpressions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // EEFCustomWidgetDescriptionImpl
