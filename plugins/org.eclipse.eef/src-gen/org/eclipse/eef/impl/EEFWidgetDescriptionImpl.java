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
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>EEF Widget Description</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.eef.impl.EEFWidgetDescriptionImpl#getLabelExpression <em>Label Expression</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFWidgetDescriptionImpl#getHelpExpression <em>Help Expression</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFWidgetDescriptionImpl#getIsEnabledExpression <em>Is Enabled Expression</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFWidgetDescriptionImpl#getPropertyValidationRules <em>Property Validation
 * Rules</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EEFWidgetDescriptionImpl extends EEFControlDescriptionImpl implements EEFWidgetDescription {
	/**
	 * The default value of the '{@link #getLabelExpression() <em>Label Expression</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getLabelExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabelExpression() <em>Label Expression</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getLabelExpression()
	 * @generated
	 * @ordered
	 */
	protected String labelExpression = EEFWidgetDescriptionImpl.LABEL_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getHelpExpression() <em>Help Expression</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getHelpExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String HELP_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHelpExpression() <em>Help Expression</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getHelpExpression()
	 * @generated
	 * @ordered
	 */
	protected String helpExpression = EEFWidgetDescriptionImpl.HELP_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsEnabledExpression() <em>Is Enabled Expression</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getIsEnabledExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String IS_ENABLED_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsEnabledExpression() <em>Is Enabled Expression</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getIsEnabledExpression()
	 * @generated
	 * @ordered
	 */
	protected String isEnabledExpression = EEFWidgetDescriptionImpl.IS_ENABLED_EXPRESSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPropertyValidationRules() <em>Property Validation Rules</em>}' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPropertyValidationRules()
	 * @generated
	 * @ordered
	 */
	protected EList<EEFPropertyValidationRuleDescription> propertyValidationRules;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EEFWidgetDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefPackage.Literals.EEF_WIDGET_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getLabelExpression() {
		return labelExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setLabelExpression(String newLabelExpression) {
		String oldLabelExpression = labelExpression;
		labelExpression = newLabelExpression;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_WIDGET_DESCRIPTION__LABEL_EXPRESSION, oldLabelExpression,
					labelExpression));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getHelpExpression() {
		return helpExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setHelpExpression(String newHelpExpression) {
		String oldHelpExpression = helpExpression;
		helpExpression = newHelpExpression;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_WIDGET_DESCRIPTION__HELP_EXPRESSION, oldHelpExpression,
					helpExpression));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getIsEnabledExpression() {
		return isEnabledExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setIsEnabledExpression(String newIsEnabledExpression) {
		String oldIsEnabledExpression = isEnabledExpression;
		isEnabledExpression = newIsEnabledExpression;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_WIDGET_DESCRIPTION__IS_ENABLED_EXPRESSION, oldIsEnabledExpression,
					isEnabledExpression));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<EEFPropertyValidationRuleDescription> getPropertyValidationRules() {
		if (propertyValidationRules == null) {
			propertyValidationRules = new EObjectWithInverseResolvingEList.ManyInverse<>(
					EEFPropertyValidationRuleDescription.class, this, EefPackage.EEF_WIDGET_DESCRIPTION__PROPERTY_VALIDATION_RULES,
					EefPackage.EEF_PROPERTY_VALIDATION_RULE_DESCRIPTION__TARGETS);
		}
		return propertyValidationRules;
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
		case EefPackage.EEF_WIDGET_DESCRIPTION__PROPERTY_VALIDATION_RULES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPropertyValidationRules()).basicAdd(otherEnd, msgs);
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
		case EefPackage.EEF_WIDGET_DESCRIPTION__PROPERTY_VALIDATION_RULES:
			return ((InternalEList<?>) getPropertyValidationRules()).basicRemove(otherEnd, msgs);
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
		case EefPackage.EEF_WIDGET_DESCRIPTION__LABEL_EXPRESSION:
			return getLabelExpression();
		case EefPackage.EEF_WIDGET_DESCRIPTION__HELP_EXPRESSION:
			return getHelpExpression();
		case EefPackage.EEF_WIDGET_DESCRIPTION__IS_ENABLED_EXPRESSION:
			return getIsEnabledExpression();
		case EefPackage.EEF_WIDGET_DESCRIPTION__PROPERTY_VALIDATION_RULES:
			return getPropertyValidationRules();
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
		case EefPackage.EEF_WIDGET_DESCRIPTION__LABEL_EXPRESSION:
			setLabelExpression((String) newValue);
			return;
		case EefPackage.EEF_WIDGET_DESCRIPTION__HELP_EXPRESSION:
			setHelpExpression((String) newValue);
			return;
		case EefPackage.EEF_WIDGET_DESCRIPTION__IS_ENABLED_EXPRESSION:
			setIsEnabledExpression((String) newValue);
			return;
		case EefPackage.EEF_WIDGET_DESCRIPTION__PROPERTY_VALIDATION_RULES:
			getPropertyValidationRules().clear();
			getPropertyValidationRules().addAll((Collection<? extends EEFPropertyValidationRuleDescription>) newValue);
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
		case EefPackage.EEF_WIDGET_DESCRIPTION__LABEL_EXPRESSION:
			setLabelExpression(EEFWidgetDescriptionImpl.LABEL_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_WIDGET_DESCRIPTION__HELP_EXPRESSION:
			setHelpExpression(EEFWidgetDescriptionImpl.HELP_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_WIDGET_DESCRIPTION__IS_ENABLED_EXPRESSION:
			setIsEnabledExpression(EEFWidgetDescriptionImpl.IS_ENABLED_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_WIDGET_DESCRIPTION__PROPERTY_VALIDATION_RULES:
			getPropertyValidationRules().clear();
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
		case EefPackage.EEF_WIDGET_DESCRIPTION__LABEL_EXPRESSION:
			return EEFWidgetDescriptionImpl.LABEL_EXPRESSION_EDEFAULT == null ? labelExpression != null
					: !EEFWidgetDescriptionImpl.LABEL_EXPRESSION_EDEFAULT.equals(labelExpression);
		case EefPackage.EEF_WIDGET_DESCRIPTION__HELP_EXPRESSION:
			return EEFWidgetDescriptionImpl.HELP_EXPRESSION_EDEFAULT == null ? helpExpression != null
					: !EEFWidgetDescriptionImpl.HELP_EXPRESSION_EDEFAULT.equals(helpExpression);
		case EefPackage.EEF_WIDGET_DESCRIPTION__IS_ENABLED_EXPRESSION:
			return EEFWidgetDescriptionImpl.IS_ENABLED_EXPRESSION_EDEFAULT == null ? isEnabledExpression != null
					: !EEFWidgetDescriptionImpl.IS_ENABLED_EXPRESSION_EDEFAULT.equals(isEnabledExpression);
		case EefPackage.EEF_WIDGET_DESCRIPTION__PROPERTY_VALIDATION_RULES:
			return propertyValidationRules != null && !propertyValidationRules.isEmpty();
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
		result.append(" (labelExpression: "); //$NON-NLS-1$
		result.append(labelExpression);
		result.append(", helpExpression: "); //$NON-NLS-1$
		result.append(helpExpression);
		result.append(", isEnabledExpression: "); //$NON-NLS-1$
		result.append(isEnabledExpression);
		result.append(')');
		return result.toString();
	}

} // EEFWidgetDescriptionImpl
