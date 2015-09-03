/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef.eef.impl;

import java.util.Collection;

import org.eclipse.eef.eef.ContextableElement;
import org.eclipse.eef.eef.EefPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.sirius.context.context.ContextVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contextable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eef.eef.impl.ContextableElementImpl#getRequiredContextVariables <em>Required Context Variables</em>}</li>
 *   <li>{@link org.eclipse.eef.eef.impl.ContextableElementImpl#getExcludedContextVariables <em>Excluded Context Variables</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ContextableElementImpl extends MinimalEObjectImpl.Container implements ContextableElement {
	/**
	 * The cached value of the '{@link #getRequiredContextVariables() <em>Required Context Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredContextVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<ContextVariable> requiredContextVariables;

	/**
	 * The cached value of the '{@link #getExcludedContextVariables() <em>Excluded Context Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludedContextVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<ContextVariable> excludedContextVariables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextableElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefPackage.Literals.CONTEXTABLE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContextVariable> getRequiredContextVariables() {
		if (requiredContextVariables == null) {
			requiredContextVariables = new EObjectContainmentEList.Resolving<ContextVariable>(ContextVariable.class,
					this, EefPackage.CONTEXTABLE_ELEMENT__REQUIRED_CONTEXT_VARIABLES);
		}
		return requiredContextVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContextVariable> getExcludedContextVariables() {
		if (excludedContextVariables == null) {
			excludedContextVariables = new EObjectContainmentEList.Resolving<ContextVariable>(ContextVariable.class,
					this, EefPackage.CONTEXTABLE_ELEMENT__EXCLUDED_CONTEXT_VARIABLES);
		}
		return excludedContextVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EefPackage.CONTEXTABLE_ELEMENT__REQUIRED_CONTEXT_VARIABLES:
			return ((InternalEList<?>) getRequiredContextVariables()).basicRemove(otherEnd, msgs);
		case EefPackage.CONTEXTABLE_ELEMENT__EXCLUDED_CONTEXT_VARIABLES:
			return ((InternalEList<?>) getExcludedContextVariables()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EefPackage.CONTEXTABLE_ELEMENT__REQUIRED_CONTEXT_VARIABLES:
			return getRequiredContextVariables();
		case EefPackage.CONTEXTABLE_ELEMENT__EXCLUDED_CONTEXT_VARIABLES:
			return getExcludedContextVariables();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EefPackage.CONTEXTABLE_ELEMENT__REQUIRED_CONTEXT_VARIABLES:
			getRequiredContextVariables().clear();
			getRequiredContextVariables().addAll((Collection<? extends ContextVariable>) newValue);
			return;
		case EefPackage.CONTEXTABLE_ELEMENT__EXCLUDED_CONTEXT_VARIABLES:
			getExcludedContextVariables().clear();
			getExcludedContextVariables().addAll((Collection<? extends ContextVariable>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case EefPackage.CONTEXTABLE_ELEMENT__REQUIRED_CONTEXT_VARIABLES:
			getRequiredContextVariables().clear();
			return;
		case EefPackage.CONTEXTABLE_ELEMENT__EXCLUDED_CONTEXT_VARIABLES:
			getExcludedContextVariables().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case EefPackage.CONTEXTABLE_ELEMENT__REQUIRED_CONTEXT_VARIABLES:
			return requiredContextVariables != null && !requiredContextVariables.isEmpty();
		case EefPackage.CONTEXTABLE_ELEMENT__EXCLUDED_CONTEXT_VARIABLES:
			return excludedContextVariables != null && !excludedContextVariables.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContextableElementImpl
