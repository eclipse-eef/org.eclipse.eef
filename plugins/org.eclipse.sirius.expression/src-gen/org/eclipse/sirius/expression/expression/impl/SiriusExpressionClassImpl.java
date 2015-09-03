/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 */
package org.eclipse.sirius.expression.expression.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.sirius.expression.expression.ExpressionDescription;
import org.eclipse.sirius.expression.expression.ExpressionPackage;
import org.eclipse.sirius.expression.expression.SiriusExpressionClass;
import org.eclipse.sirius.expression.expression.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sirius Expression Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.expression.expression.impl.SiriusExpressionClassImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link org.eclipse.sirius.expression.expression.impl.SiriusExpressionClassImpl#getExpressionDescriptions <em>Expression Descriptions</em>}</li>
 *   <li>{@link org.eclipse.sirius.expression.expression.impl.SiriusExpressionClassImpl#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SiriusExpressionClassImpl extends MinimalEObjectImpl.Container implements SiriusExpressionClass {
	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> variables;

	/**
	 * The cached value of the '{@link #getExpressionDescriptions() <em>Expression Descriptions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressionDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<ExpressionDescription> expressionDescriptions;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SiriusExpressionClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpressionPackage.Literals.SIRIUS_EXPRESSION_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getVariables() {
		if (variables == null) {
			variables = new EObjectContainmentEList.Resolving<Variable>(Variable.class, this, ExpressionPackage.SIRIUS_EXPRESSION_CLASS__VARIABLES);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExpressionDescription> getExpressionDescriptions() {
		if (expressionDescriptions == null) {
			expressionDescriptions = new EObjectContainmentEList.Resolving<ExpressionDescription>(ExpressionDescription.class, this, ExpressionPackage.SIRIUS_EXPRESSION_CLASS__EXPRESSION_DESCRIPTIONS);
		}
		return expressionDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.SIRIUS_EXPRESSION_CLASS__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExpressionPackage.SIRIUS_EXPRESSION_CLASS__VARIABLES:
				return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
			case ExpressionPackage.SIRIUS_EXPRESSION_CLASS__EXPRESSION_DESCRIPTIONS:
				return ((InternalEList<?>)getExpressionDescriptions()).basicRemove(otherEnd, msgs);
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
			case ExpressionPackage.SIRIUS_EXPRESSION_CLASS__VARIABLES:
				return getVariables();
			case ExpressionPackage.SIRIUS_EXPRESSION_CLASS__EXPRESSION_DESCRIPTIONS:
				return getExpressionDescriptions();
			case ExpressionPackage.SIRIUS_EXPRESSION_CLASS__LABEL:
				return getLabel();
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
			case ExpressionPackage.SIRIUS_EXPRESSION_CLASS__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends Variable>)newValue);
				return;
			case ExpressionPackage.SIRIUS_EXPRESSION_CLASS__EXPRESSION_DESCRIPTIONS:
				getExpressionDescriptions().clear();
				getExpressionDescriptions().addAll((Collection<? extends ExpressionDescription>)newValue);
				return;
			case ExpressionPackage.SIRIUS_EXPRESSION_CLASS__LABEL:
				setLabel((String)newValue);
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
			case ExpressionPackage.SIRIUS_EXPRESSION_CLASS__VARIABLES:
				getVariables().clear();
				return;
			case ExpressionPackage.SIRIUS_EXPRESSION_CLASS__EXPRESSION_DESCRIPTIONS:
				getExpressionDescriptions().clear();
				return;
			case ExpressionPackage.SIRIUS_EXPRESSION_CLASS__LABEL:
				setLabel(LABEL_EDEFAULT);
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
			case ExpressionPackage.SIRIUS_EXPRESSION_CLASS__VARIABLES:
				return variables != null && !variables.isEmpty();
			case ExpressionPackage.SIRIUS_EXPRESSION_CLASS__EXPRESSION_DESCRIPTIONS:
				return expressionDescriptions != null && !expressionDescriptions.isEmpty();
			case ExpressionPackage.SIRIUS_EXPRESSION_CLASS__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (label: "); //$NON-NLS-1$
		result.append(label);
		result.append(')');
		return result.toString();
	}

} //SiriusExpressionClassImpl
