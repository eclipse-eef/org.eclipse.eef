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

import org.eclipse.eef.EEFSelectConditionalStyle;
import org.eclipse.eef.EEFSelectDescription;
import org.eclipse.eef.EEFSelectStyle;
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
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>EEF Select Description</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.eef.impl.EEFSelectDescriptionImpl#getValueExpression <em>Value Expression</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFSelectDescriptionImpl#getEditExpression <em>Edit Expression</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFSelectDescriptionImpl#getCandidatesExpression <em>Candidates Expression</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFSelectDescriptionImpl#getCandidateDisplayExpression <em>Candidate Display
 * Expression</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFSelectDescriptionImpl#getStyle <em>Style</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFSelectDescriptionImpl#getConditionalStyles <em>Conditional Styles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EEFSelectDescriptionImpl extends EEFWidgetDescriptionImpl implements EEFSelectDescription {
	/**
	 * The default value of the '{@link #getValueExpression() <em>Value Expression</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getValueExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueExpression() <em>Value Expression</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getValueExpression()
	 * @generated
	 * @ordered
	 */
	protected String valueExpression = EEFSelectDescriptionImpl.VALUE_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getEditExpression() <em>Edit Expression</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getEditExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String EDIT_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEditExpression() <em>Edit Expression</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getEditExpression()
	 * @generated
	 * @ordered
	 */
	protected String editExpression = EEFSelectDescriptionImpl.EDIT_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCandidatesExpression() <em>Candidates Expression</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getCandidatesExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String CANDIDATES_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCandidatesExpression() <em>Candidates Expression</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getCandidatesExpression()
	 * @generated
	 * @ordered
	 */
	protected String candidatesExpression = EEFSelectDescriptionImpl.CANDIDATES_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCandidateDisplayExpression() <em>Candidate Display Expression</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getCandidateDisplayExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String CANDIDATE_DISPLAY_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCandidateDisplayExpression() <em>Candidate Display Expression</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getCandidateDisplayExpression()
	 * @generated
	 * @ordered
	 */
	protected String candidateDisplayExpression = EEFSelectDescriptionImpl.CANDIDATE_DISPLAY_EXPRESSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected EEFSelectStyle style;

	/**
	 * The cached value of the '{@link #getConditionalStyles() <em>Conditional Styles</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getConditionalStyles()
	 * @generated
	 * @ordered
	 */
	protected EList<EEFSelectConditionalStyle> conditionalStyles;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EEFSelectDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefPackage.Literals.EEF_SELECT_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getValueExpression() {
		return valueExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setValueExpression(String newValueExpression) {
		String oldValueExpression = valueExpression;
		valueExpression = newValueExpression;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_SELECT_DESCRIPTION__VALUE_EXPRESSION, oldValueExpression,
					valueExpression));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getEditExpression() {
		return editExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setEditExpression(String newEditExpression) {
		String oldEditExpression = editExpression;
		editExpression = newEditExpression;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_SELECT_DESCRIPTION__EDIT_EXPRESSION, oldEditExpression,
					editExpression));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getCandidatesExpression() {
		return candidatesExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setCandidatesExpression(String newCandidatesExpression) {
		String oldCandidatesExpression = candidatesExpression;
		candidatesExpression = newCandidatesExpression;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_SELECT_DESCRIPTION__CANDIDATES_EXPRESSION, oldCandidatesExpression,
					candidatesExpression));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getCandidateDisplayExpression() {
		return candidateDisplayExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setCandidateDisplayExpression(String newCandidateDisplayExpression) {
		String oldCandidateDisplayExpression = candidateDisplayExpression;
		candidateDisplayExpression = newCandidateDisplayExpression;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_SELECT_DESCRIPTION__CANDIDATE_DISPLAY_EXPRESSION,
					oldCandidateDisplayExpression, candidateDisplayExpression));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EEFSelectStyle getStyle() {
		if (style != null && style.eIsProxy()) {
			InternalEObject oldStyle = (InternalEObject) style;
			style = (EEFSelectStyle) eResolveProxy(oldStyle);
			if (style != oldStyle) {
				InternalEObject newStyle = (InternalEObject) style;
				NotificationChain msgs = oldStyle.eInverseRemove(this,
						InternalEObject.EOPPOSITE_FEATURE_BASE - EefPackage.EEF_SELECT_DESCRIPTION__STYLE, null, null);
				if (newStyle.eInternalContainer() == null) {
					msgs = newStyle.eInverseAdd(this, InternalEObject.EOPPOSITE_FEATURE_BASE - EefPackage.EEF_SELECT_DESCRIPTION__STYLE, null, msgs);
				}
				if (msgs != null) {
					msgs.dispatch();
				}
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EefPackage.EEF_SELECT_DESCRIPTION__STYLE, oldStyle, style));
				}
			}
		}
		return style;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EEFSelectStyle basicGetStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetStyle(EEFSelectStyle newStyle, NotificationChain msgs) {
		EEFSelectStyle oldStyle = style;
		style = newStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EefPackage.EEF_SELECT_DESCRIPTION__STYLE, oldStyle,
					newStyle);
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
	public void setStyle(EEFSelectStyle newStyle) {
		if (newStyle != style) {
			NotificationChain msgs = null;
			if (style != null) {
				msgs = ((InternalEObject) style).eInverseRemove(this,
						InternalEObject.EOPPOSITE_FEATURE_BASE - EefPackage.EEF_SELECT_DESCRIPTION__STYLE, null, msgs);
			}
			if (newStyle != null) {
				msgs = ((InternalEObject) newStyle).eInverseAdd(this,
						InternalEObject.EOPPOSITE_FEATURE_BASE - EefPackage.EEF_SELECT_DESCRIPTION__STYLE, null, msgs);
			}
			msgs = basicSetStyle(newStyle, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_SELECT_DESCRIPTION__STYLE, newStyle, newStyle));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<EEFSelectConditionalStyle> getConditionalStyles() {
		if (conditionalStyles == null) {
			conditionalStyles = new EObjectContainmentEList.Resolving<>(EEFSelectConditionalStyle.class, this,
					EefPackage.EEF_SELECT_DESCRIPTION__CONDITIONAL_STYLES);
		}
		return conditionalStyles;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EefPackage.EEF_SELECT_DESCRIPTION__STYLE:
			return basicSetStyle(null, msgs);
		case EefPackage.EEF_SELECT_DESCRIPTION__CONDITIONAL_STYLES:
			return ((InternalEList<?>) getConditionalStyles()).basicRemove(otherEnd, msgs);
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
		case EefPackage.EEF_SELECT_DESCRIPTION__VALUE_EXPRESSION:
			return getValueExpression();
		case EefPackage.EEF_SELECT_DESCRIPTION__EDIT_EXPRESSION:
			return getEditExpression();
		case EefPackage.EEF_SELECT_DESCRIPTION__CANDIDATES_EXPRESSION:
			return getCandidatesExpression();
		case EefPackage.EEF_SELECT_DESCRIPTION__CANDIDATE_DISPLAY_EXPRESSION:
			return getCandidateDisplayExpression();
		case EefPackage.EEF_SELECT_DESCRIPTION__STYLE:
			if (resolve) {
				return getStyle();
			}
			return basicGetStyle();
		case EefPackage.EEF_SELECT_DESCRIPTION__CONDITIONAL_STYLES:
			return getConditionalStyles();
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
		case EefPackage.EEF_SELECT_DESCRIPTION__VALUE_EXPRESSION:
			setValueExpression((String) newValue);
			return;
		case EefPackage.EEF_SELECT_DESCRIPTION__EDIT_EXPRESSION:
			setEditExpression((String) newValue);
			return;
		case EefPackage.EEF_SELECT_DESCRIPTION__CANDIDATES_EXPRESSION:
			setCandidatesExpression((String) newValue);
			return;
		case EefPackage.EEF_SELECT_DESCRIPTION__CANDIDATE_DISPLAY_EXPRESSION:
			setCandidateDisplayExpression((String) newValue);
			return;
		case EefPackage.EEF_SELECT_DESCRIPTION__STYLE:
			setStyle((EEFSelectStyle) newValue);
			return;
		case EefPackage.EEF_SELECT_DESCRIPTION__CONDITIONAL_STYLES:
			getConditionalStyles().clear();
			getConditionalStyles().addAll((Collection<? extends EEFSelectConditionalStyle>) newValue);
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
		case EefPackage.EEF_SELECT_DESCRIPTION__VALUE_EXPRESSION:
			setValueExpression(EEFSelectDescriptionImpl.VALUE_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_SELECT_DESCRIPTION__EDIT_EXPRESSION:
			setEditExpression(EEFSelectDescriptionImpl.EDIT_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_SELECT_DESCRIPTION__CANDIDATES_EXPRESSION:
			setCandidatesExpression(EEFSelectDescriptionImpl.CANDIDATES_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_SELECT_DESCRIPTION__CANDIDATE_DISPLAY_EXPRESSION:
			setCandidateDisplayExpression(EEFSelectDescriptionImpl.CANDIDATE_DISPLAY_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_SELECT_DESCRIPTION__STYLE:
			setStyle((EEFSelectStyle) null);
			return;
		case EefPackage.EEF_SELECT_DESCRIPTION__CONDITIONAL_STYLES:
			getConditionalStyles().clear();
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
		case EefPackage.EEF_SELECT_DESCRIPTION__VALUE_EXPRESSION:
			return EEFSelectDescriptionImpl.VALUE_EXPRESSION_EDEFAULT == null ? valueExpression != null
					: !EEFSelectDescriptionImpl.VALUE_EXPRESSION_EDEFAULT.equals(valueExpression);
		case EefPackage.EEF_SELECT_DESCRIPTION__EDIT_EXPRESSION:
			return EEFSelectDescriptionImpl.EDIT_EXPRESSION_EDEFAULT == null ? editExpression != null
					: !EEFSelectDescriptionImpl.EDIT_EXPRESSION_EDEFAULT.equals(editExpression);
		case EefPackage.EEF_SELECT_DESCRIPTION__CANDIDATES_EXPRESSION:
			return EEFSelectDescriptionImpl.CANDIDATES_EXPRESSION_EDEFAULT == null ? candidatesExpression != null
					: !EEFSelectDescriptionImpl.CANDIDATES_EXPRESSION_EDEFAULT.equals(candidatesExpression);
		case EefPackage.EEF_SELECT_DESCRIPTION__CANDIDATE_DISPLAY_EXPRESSION:
			return EEFSelectDescriptionImpl.CANDIDATE_DISPLAY_EXPRESSION_EDEFAULT == null ? candidateDisplayExpression != null
					: !EEFSelectDescriptionImpl.CANDIDATE_DISPLAY_EXPRESSION_EDEFAULT.equals(candidateDisplayExpression);
		case EefPackage.EEF_SELECT_DESCRIPTION__STYLE:
			return style != null;
		case EefPackage.EEF_SELECT_DESCRIPTION__CONDITIONAL_STYLES:
			return conditionalStyles != null && !conditionalStyles.isEmpty();
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
		result.append(" (valueExpression: "); //$NON-NLS-1$
		result.append(valueExpression);
		result.append(", editExpression: "); //$NON-NLS-1$
		result.append(editExpression);
		result.append(", candidatesExpression: "); //$NON-NLS-1$
		result.append(candidatesExpression);
		result.append(", candidateDisplayExpression: "); //$NON-NLS-1$
		result.append(candidateDisplayExpression);
		result.append(')');
		return result.toString();
	}

} // EEFSelectDescriptionImpl
