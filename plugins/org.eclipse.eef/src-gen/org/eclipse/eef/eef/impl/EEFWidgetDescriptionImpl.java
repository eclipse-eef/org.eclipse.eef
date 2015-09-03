/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef.eef.impl;

import org.eclipse.eef.eef.EEFWidgetDescription;
import org.eclipse.eef.eef.EefPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EEF Widget Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eef.eef.impl.EEFWidgetDescriptionImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.eef.eef.impl.EEFWidgetDescriptionImpl#getLabelExpression <em>Label Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.eef.impl.EEFWidgetDescriptionImpl#getFeatureCandidatesExpression <em>Feature Candidates Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EEFWidgetDescriptionImpl extends ContextableElementImpl implements EEFWidgetDescription {
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
	 * The default value of the '{@link #getFeatureCandidatesExpression() <em>Feature Candidates Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureCandidatesExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String FEATURE_CANDIDATES_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFeatureCandidatesExpression() <em>Feature Candidates Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureCandidatesExpression()
	 * @generated
	 * @ordered
	 */
	protected String featureCandidatesExpression = FEATURE_CANDIDATES_EXPRESSION_EDEFAULT;

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
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_WIDGET_DESCRIPTION__IDENTIFIER,
					oldIdentifier, identifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_WIDGET_DESCRIPTION__LABEL_EXPRESSION,
					oldLabelExpression, labelExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFeatureCandidatesExpression() {
		return featureCandidatesExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFeatureCandidatesExpression(String newFeatureCandidatesExpression) {
		String oldFeatureCandidatesExpression = featureCandidatesExpression;
		featureCandidatesExpression = newFeatureCandidatesExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EefPackage.EEF_WIDGET_DESCRIPTION__FEATURE_CANDIDATES_EXPRESSION, oldFeatureCandidatesExpression,
					featureCandidatesExpression));
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
		case EefPackage.EEF_WIDGET_DESCRIPTION__LABEL_EXPRESSION:
			return getLabelExpression();
		case EefPackage.EEF_WIDGET_DESCRIPTION__FEATURE_CANDIDATES_EXPRESSION:
			return getFeatureCandidatesExpression();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EefPackage.EEF_WIDGET_DESCRIPTION__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case EefPackage.EEF_WIDGET_DESCRIPTION__LABEL_EXPRESSION:
			setLabelExpression((String) newValue);
			return;
		case EefPackage.EEF_WIDGET_DESCRIPTION__FEATURE_CANDIDATES_EXPRESSION:
			setFeatureCandidatesExpression((String) newValue);
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
		case EefPackage.EEF_WIDGET_DESCRIPTION__LABEL_EXPRESSION:
			setLabelExpression(LABEL_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_WIDGET_DESCRIPTION__FEATURE_CANDIDATES_EXPRESSION:
			setFeatureCandidatesExpression(FEATURE_CANDIDATES_EXPRESSION_EDEFAULT);
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
		case EefPackage.EEF_WIDGET_DESCRIPTION__LABEL_EXPRESSION:
			return LABEL_EXPRESSION_EDEFAULT == null ? labelExpression != null
					: !LABEL_EXPRESSION_EDEFAULT.equals(labelExpression);
		case EefPackage.EEF_WIDGET_DESCRIPTION__FEATURE_CANDIDATES_EXPRESSION:
			return FEATURE_CANDIDATES_EXPRESSION_EDEFAULT == null ? featureCandidatesExpression != null
					: !FEATURE_CANDIDATES_EXPRESSION_EDEFAULT.equals(featureCandidatesExpression);
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
		result.append(", labelExpression: "); //$NON-NLS-1$
		result.append(labelExpression);
		result.append(", featureCandidatesExpression: "); //$NON-NLS-1$
		result.append(featureCandidatesExpression);
		result.append(')');
		return result.toString();
	}

} //EEFWidgetDescriptionImpl
