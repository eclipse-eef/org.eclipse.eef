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

import org.eclipse.eef.EEFLabelStyle;
import org.eclipse.eef.EEFValidation;
import org.eclipse.eef.EEFWidgetDescription;
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

import org.eclipse.sirius.expression.UserDefinedVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EEF Widget Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eef.impl.EEFWidgetDescriptionImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.eef.impl.EEFWidgetDescriptionImpl#getPreconditionExpression <em>Precondition Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.impl.EEFWidgetDescriptionImpl#getUserDefinedVariables <em>User Defined Variables</em>}</li>
 *   <li>{@link org.eclipse.eef.impl.EEFWidgetDescriptionImpl#getLabelExpression <em>Label Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.impl.EEFWidgetDescriptionImpl#getLabelStyle <em>Label Style</em>}</li>
 *   <li>{@link org.eclipse.eef.impl.EEFWidgetDescriptionImpl#getTooltipExpression <em>Tooltip Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.impl.EEFWidgetDescriptionImpl#getHelpExpression <em>Help Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.impl.EEFWidgetDescriptionImpl#getValidation <em>Validation</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EEFWidgetDescriptionImpl extends MinimalEObjectImpl.Container implements EEFWidgetDescription {
	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String identifier = IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPreconditionExpression() <em>Precondition Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreconditionExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String PRECONDITION_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreconditionExpression() <em>Precondition Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreconditionExpression()
	 * @generated
	 * @ordered
	 */
	protected String preconditionExpression = PRECONDITION_EXPRESSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUserDefinedVariables() <em>User Defined Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserDefinedVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<UserDefinedVariable> userDefinedVariables;

	/**
	 * The default value of the '{@link #getLabelExpression() <em>Label Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabelExpression() <em>Label Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelExpression()
	 * @generated
	 * @ordered
	 */
	protected String labelExpression = LABEL_EXPRESSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLabelStyle() <em>Label Style</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelStyle()
	 * @generated
	 * @ordered
	 */
	protected EEFLabelStyle labelStyle;

	/**
	 * The default value of the '{@link #getTooltipExpression() <em>Tooltip Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTooltipExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String TOOLTIP_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTooltipExpression() <em>Tooltip Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTooltipExpression()
	 * @generated
	 * @ordered
	 */
	protected String tooltipExpression = TOOLTIP_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getHelpExpression() <em>Help Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHelpExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String HELP_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHelpExpression() <em>Help Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHelpExpression()
	 * @generated
	 * @ordered
	 */
	protected String helpExpression = HELP_EXPRESSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValidation() <em>Validation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidation()
	 * @generated
	 * @ordered
	 */
	protected EEFValidation validation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EEFWidgetDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefPackage.Literals.EEF_WIDGET_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdentifier(String newIdentifier) {
		String oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_WIDGET_DESCRIPTION__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPreconditionExpression() {
		return preconditionExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPreconditionExpression(String newPreconditionExpression) {
		String oldPreconditionExpression = preconditionExpression;
		preconditionExpression = newPreconditionExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_WIDGET_DESCRIPTION__PRECONDITION_EXPRESSION,
					oldPreconditionExpression, preconditionExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UserDefinedVariable> getUserDefinedVariables() {
		if (userDefinedVariables == null) {
			userDefinedVariables = new EObjectContainmentEList.Resolving<UserDefinedVariable>(UserDefinedVariable.class, this,
					EefPackage.EEF_WIDGET_DESCRIPTION__USER_DEFINED_VARIABLES);
		}
		return userDefinedVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLabelExpression() {
		return labelExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabelExpression(String newLabelExpression) {
		String oldLabelExpression = labelExpression;
		labelExpression = newLabelExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_WIDGET_DESCRIPTION__LABEL_EXPRESSION, oldLabelExpression,
					labelExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEFLabelStyle getLabelStyle() {
		if (labelStyle != null && labelStyle.eIsProxy()) {
			InternalEObject oldLabelStyle = (InternalEObject) labelStyle;
			labelStyle = (EEFLabelStyle) eResolveProxy(oldLabelStyle);
			if (labelStyle != oldLabelStyle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EefPackage.EEF_WIDGET_DESCRIPTION__LABEL_STYLE, oldLabelStyle,
							labelStyle));
			}
		}
		return labelStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEFLabelStyle basicGetLabelStyle() {
		return labelStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabelStyle(EEFLabelStyle newLabelStyle) {
		EEFLabelStyle oldLabelStyle = labelStyle;
		labelStyle = newLabelStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_WIDGET_DESCRIPTION__LABEL_STYLE, oldLabelStyle, labelStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTooltipExpression() {
		return tooltipExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTooltipExpression(String newTooltipExpression) {
		String oldTooltipExpression = tooltipExpression;
		tooltipExpression = newTooltipExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_WIDGET_DESCRIPTION__TOOLTIP_EXPRESSION, oldTooltipExpression,
					tooltipExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHelpExpression() {
		return helpExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHelpExpression(String newHelpExpression) {
		String oldHelpExpression = helpExpression;
		helpExpression = newHelpExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_WIDGET_DESCRIPTION__HELP_EXPRESSION, oldHelpExpression,
					helpExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEFValidation getValidation() {
		if (validation != null && validation.eIsProxy()) {
			InternalEObject oldValidation = (InternalEObject) validation;
			validation = (EEFValidation) eResolveProxy(oldValidation);
			if (validation != oldValidation) {
				InternalEObject newValidation = (InternalEObject) validation;
				NotificationChain msgs = oldValidation.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EefPackage.EEF_WIDGET_DESCRIPTION__VALIDATION,
						null, null);
				if (newValidation.eInternalContainer() == null) {
					msgs = newValidation.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EefPackage.EEF_WIDGET_DESCRIPTION__VALIDATION, null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EefPackage.EEF_WIDGET_DESCRIPTION__VALIDATION, oldValidation,
							validation));
			}
		}
		return validation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEFValidation basicGetValidation() {
		return validation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidation(EEFValidation newValidation, NotificationChain msgs) {
		EEFValidation oldValidation = validation;
		validation = newValidation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EefPackage.EEF_WIDGET_DESCRIPTION__VALIDATION,
					oldValidation, newValidation);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValidation(EEFValidation newValidation) {
		if (newValidation != validation) {
			NotificationChain msgs = null;
			if (validation != null)
				msgs = ((InternalEObject) validation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EefPackage.EEF_WIDGET_DESCRIPTION__VALIDATION,
						null, msgs);
			if (newValidation != null)
				msgs = ((InternalEObject) newValidation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EefPackage.EEF_WIDGET_DESCRIPTION__VALIDATION,
						null, msgs);
			msgs = basicSetValidation(newValidation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_WIDGET_DESCRIPTION__VALIDATION, newValidation, newValidation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EefPackage.EEF_WIDGET_DESCRIPTION__USER_DEFINED_VARIABLES:
			return ((InternalEList<?>) getUserDefinedVariables()).basicRemove(otherEnd, msgs);
		case EefPackage.EEF_WIDGET_DESCRIPTION__VALIDATION:
			return basicSetValidation(null, msgs);
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
		case EefPackage.EEF_WIDGET_DESCRIPTION__IDENTIFIER:
			return getIdentifier();
		case EefPackage.EEF_WIDGET_DESCRIPTION__PRECONDITION_EXPRESSION:
			return getPreconditionExpression();
		case EefPackage.EEF_WIDGET_DESCRIPTION__USER_DEFINED_VARIABLES:
			return getUserDefinedVariables();
		case EefPackage.EEF_WIDGET_DESCRIPTION__LABEL_EXPRESSION:
			return getLabelExpression();
		case EefPackage.EEF_WIDGET_DESCRIPTION__LABEL_STYLE:
			if (resolve)
				return getLabelStyle();
			return basicGetLabelStyle();
		case EefPackage.EEF_WIDGET_DESCRIPTION__TOOLTIP_EXPRESSION:
			return getTooltipExpression();
		case EefPackage.EEF_WIDGET_DESCRIPTION__HELP_EXPRESSION:
			return getHelpExpression();
		case EefPackage.EEF_WIDGET_DESCRIPTION__VALIDATION:
			if (resolve)
				return getValidation();
			return basicGetValidation();
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
		case EefPackage.EEF_WIDGET_DESCRIPTION__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case EefPackage.EEF_WIDGET_DESCRIPTION__PRECONDITION_EXPRESSION:
			setPreconditionExpression((String) newValue);
			return;
		case EefPackage.EEF_WIDGET_DESCRIPTION__USER_DEFINED_VARIABLES:
			getUserDefinedVariables().clear();
			getUserDefinedVariables().addAll((Collection<? extends UserDefinedVariable>) newValue);
			return;
		case EefPackage.EEF_WIDGET_DESCRIPTION__LABEL_EXPRESSION:
			setLabelExpression((String) newValue);
			return;
		case EefPackage.EEF_WIDGET_DESCRIPTION__LABEL_STYLE:
			setLabelStyle((EEFLabelStyle) newValue);
			return;
		case EefPackage.EEF_WIDGET_DESCRIPTION__TOOLTIP_EXPRESSION:
			setTooltipExpression((String) newValue);
			return;
		case EefPackage.EEF_WIDGET_DESCRIPTION__HELP_EXPRESSION:
			setHelpExpression((String) newValue);
			return;
		case EefPackage.EEF_WIDGET_DESCRIPTION__VALIDATION:
			setValidation((EEFValidation) newValue);
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
		case EefPackage.EEF_WIDGET_DESCRIPTION__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case EefPackage.EEF_WIDGET_DESCRIPTION__PRECONDITION_EXPRESSION:
			setPreconditionExpression(PRECONDITION_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_WIDGET_DESCRIPTION__USER_DEFINED_VARIABLES:
			getUserDefinedVariables().clear();
			return;
		case EefPackage.EEF_WIDGET_DESCRIPTION__LABEL_EXPRESSION:
			setLabelExpression(LABEL_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_WIDGET_DESCRIPTION__LABEL_STYLE:
			setLabelStyle((EEFLabelStyle) null);
			return;
		case EefPackage.EEF_WIDGET_DESCRIPTION__TOOLTIP_EXPRESSION:
			setTooltipExpression(TOOLTIP_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_WIDGET_DESCRIPTION__HELP_EXPRESSION:
			setHelpExpression(HELP_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_WIDGET_DESCRIPTION__VALIDATION:
			setValidation((EEFValidation) null);
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
		case EefPackage.EEF_WIDGET_DESCRIPTION__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case EefPackage.EEF_WIDGET_DESCRIPTION__PRECONDITION_EXPRESSION:
			return PRECONDITION_EXPRESSION_EDEFAULT == null ? preconditionExpression != null
					: !PRECONDITION_EXPRESSION_EDEFAULT.equals(preconditionExpression);
		case EefPackage.EEF_WIDGET_DESCRIPTION__USER_DEFINED_VARIABLES:
			return userDefinedVariables != null && !userDefinedVariables.isEmpty();
		case EefPackage.EEF_WIDGET_DESCRIPTION__LABEL_EXPRESSION:
			return LABEL_EXPRESSION_EDEFAULT == null ? labelExpression != null : !LABEL_EXPRESSION_EDEFAULT.equals(labelExpression);
		case EefPackage.EEF_WIDGET_DESCRIPTION__LABEL_STYLE:
			return labelStyle != null;
		case EefPackage.EEF_WIDGET_DESCRIPTION__TOOLTIP_EXPRESSION:
			return TOOLTIP_EXPRESSION_EDEFAULT == null ? tooltipExpression != null : !TOOLTIP_EXPRESSION_EDEFAULT.equals(tooltipExpression);
		case EefPackage.EEF_WIDGET_DESCRIPTION__HELP_EXPRESSION:
			return HELP_EXPRESSION_EDEFAULT == null ? helpExpression != null : !HELP_EXPRESSION_EDEFAULT.equals(helpExpression);
		case EefPackage.EEF_WIDGET_DESCRIPTION__VALIDATION:
			return validation != null;
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
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (identifier: "); //$NON-NLS-1$
		result.append(identifier);
		result.append(", preconditionExpression: "); //$NON-NLS-1$
		result.append(preconditionExpression);
		result.append(", labelExpression: "); //$NON-NLS-1$
		result.append(labelExpression);
		result.append(", tooltipExpression: "); //$NON-NLS-1$
		result.append(tooltipExpression);
		result.append(", helpExpression: "); //$NON-NLS-1$
		result.append(helpExpression);
		result.append(')');
		return result.toString();
	}

} //EEFWidgetDescriptionImpl
