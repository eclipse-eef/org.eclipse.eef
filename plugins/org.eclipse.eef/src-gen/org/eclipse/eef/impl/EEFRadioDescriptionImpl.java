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

import org.eclipse.eef.EEFRadioConditionalStyle;
import org.eclipse.eef.EEFRadioDescription;
import org.eclipse.eef.EEFRadioStyle;
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
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>EEF Radio Description</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.eef.impl.EEFRadioDescriptionImpl#getValueExpression <em>Value Expression</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFRadioDescriptionImpl#getEditExpression <em>Edit Expression</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFRadioDescriptionImpl#getCandidatesExpression <em>Candidates Expression</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFRadioDescriptionImpl#getCandidateDisplayExpression <em>Candidate Display
 * Expression</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFRadioDescriptionImpl#getStyle <em>Style</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFRadioDescriptionImpl#getNumberOfColumns <em>Number Of Columns</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFRadioDescriptionImpl#getConditionalStyles <em>Conditional Styles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EEFRadioDescriptionImpl extends EEFWidgetDescriptionImpl implements EEFRadioDescription {
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
	protected String valueExpression = EEFRadioDescriptionImpl.VALUE_EXPRESSION_EDEFAULT;

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
	protected String editExpression = EEFRadioDescriptionImpl.EDIT_EXPRESSION_EDEFAULT;

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
	protected String candidatesExpression = EEFRadioDescriptionImpl.CANDIDATES_EXPRESSION_EDEFAULT;

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
	protected String candidateDisplayExpression = EEFRadioDescriptionImpl.CANDIDATE_DISPLAY_EXPRESSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected EEFRadioStyle style;

	/**
	 * The default value of the '{@link #getNumberOfColumns() <em>Number Of Columns</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getNumberOfColumns()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_COLUMNS_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getNumberOfColumns() <em>Number Of Columns</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getNumberOfColumns()
	 * @generated
	 * @ordered
	 */
	protected int numberOfColumns = EEFRadioDescriptionImpl.NUMBER_OF_COLUMNS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConditionalStyles() <em>Conditional Styles</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getConditionalStyles()
	 * @generated
	 * @ordered
	 */
	protected EList<EEFRadioConditionalStyle> conditionalStyles;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EEFRadioDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefPackage.Literals.EEF_RADIO_DESCRIPTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_RADIO_DESCRIPTION__VALUE_EXPRESSION, oldValueExpression,
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
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_RADIO_DESCRIPTION__EDIT_EXPRESSION, oldEditExpression,
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
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_RADIO_DESCRIPTION__CANDIDATES_EXPRESSION, oldCandidatesExpression,
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
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_RADIO_DESCRIPTION__CANDIDATE_DISPLAY_EXPRESSION,
					oldCandidateDisplayExpression, candidateDisplayExpression));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EEFRadioStyle getStyle() {
		if (style != null && style.eIsProxy()) {
			InternalEObject oldStyle = (InternalEObject) style;
			style = (EEFRadioStyle) eResolveProxy(oldStyle);
			if (style != oldStyle) {
				InternalEObject newStyle = (InternalEObject) style;
				NotificationChain msgs = oldStyle.eInverseRemove(this,
						InternalEObject.EOPPOSITE_FEATURE_BASE - EefPackage.EEF_RADIO_DESCRIPTION__STYLE, null, null);
				if (newStyle.eInternalContainer() == null) {
					msgs = newStyle.eInverseAdd(this, InternalEObject.EOPPOSITE_FEATURE_BASE - EefPackage.EEF_RADIO_DESCRIPTION__STYLE, null, msgs);
				}
				if (msgs != null) {
					msgs.dispatch();
				}
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EefPackage.EEF_RADIO_DESCRIPTION__STYLE, oldStyle, style));
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
	public EEFRadioStyle basicGetStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetStyle(EEFRadioStyle newStyle, NotificationChain msgs) {
		EEFRadioStyle oldStyle = style;
		style = newStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EefPackage.EEF_RADIO_DESCRIPTION__STYLE, oldStyle,
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
	public void setStyle(EEFRadioStyle newStyle) {
		if (newStyle != style) {
			NotificationChain msgs = null;
			if (style != null) {
				msgs = ((InternalEObject) style).eInverseRemove(this,
						InternalEObject.EOPPOSITE_FEATURE_BASE - EefPackage.EEF_RADIO_DESCRIPTION__STYLE, null, msgs);
			}
			if (newStyle != null) {
				msgs = ((InternalEObject) newStyle).eInverseAdd(this,
						InternalEObject.EOPPOSITE_FEATURE_BASE - EefPackage.EEF_RADIO_DESCRIPTION__STYLE, null, msgs);
			}
			msgs = basicSetStyle(newStyle, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_RADIO_DESCRIPTION__STYLE, newStyle, newStyle));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int getNumberOfColumns() {
		return numberOfColumns;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setNumberOfColumns(int newNumberOfColumns) {
		int oldNumberOfColumns = numberOfColumns;
		numberOfColumns = newNumberOfColumns;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_RADIO_DESCRIPTION__NUMBER_OF_COLUMNS, oldNumberOfColumns,
					numberOfColumns));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<EEFRadioConditionalStyle> getConditionalStyles() {
		if (conditionalStyles == null) {
			conditionalStyles = new EObjectContainmentEList.Resolving<>(EEFRadioConditionalStyle.class, this,
					EefPackage.EEF_RADIO_DESCRIPTION__CONDITIONAL_STYLES);
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
		case EefPackage.EEF_RADIO_DESCRIPTION__STYLE:
			return basicSetStyle(null, msgs);
		case EefPackage.EEF_RADIO_DESCRIPTION__CONDITIONAL_STYLES:
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
		case EefPackage.EEF_RADIO_DESCRIPTION__VALUE_EXPRESSION:
			return getValueExpression();
		case EefPackage.EEF_RADIO_DESCRIPTION__EDIT_EXPRESSION:
			return getEditExpression();
		case EefPackage.EEF_RADIO_DESCRIPTION__CANDIDATES_EXPRESSION:
			return getCandidatesExpression();
		case EefPackage.EEF_RADIO_DESCRIPTION__CANDIDATE_DISPLAY_EXPRESSION:
			return getCandidateDisplayExpression();
		case EefPackage.EEF_RADIO_DESCRIPTION__STYLE:
			if (resolve) {
				return getStyle();
			}
			return basicGetStyle();
		case EefPackage.EEF_RADIO_DESCRIPTION__NUMBER_OF_COLUMNS:
			return getNumberOfColumns();
		case EefPackage.EEF_RADIO_DESCRIPTION__CONDITIONAL_STYLES:
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
		case EefPackage.EEF_RADIO_DESCRIPTION__VALUE_EXPRESSION:
			setValueExpression((String) newValue);
			return;
		case EefPackage.EEF_RADIO_DESCRIPTION__EDIT_EXPRESSION:
			setEditExpression((String) newValue);
			return;
		case EefPackage.EEF_RADIO_DESCRIPTION__CANDIDATES_EXPRESSION:
			setCandidatesExpression((String) newValue);
			return;
		case EefPackage.EEF_RADIO_DESCRIPTION__CANDIDATE_DISPLAY_EXPRESSION:
			setCandidateDisplayExpression((String) newValue);
			return;
		case EefPackage.EEF_RADIO_DESCRIPTION__STYLE:
			setStyle((EEFRadioStyle) newValue);
			return;
		case EefPackage.EEF_RADIO_DESCRIPTION__NUMBER_OF_COLUMNS:
			setNumberOfColumns((Integer) newValue);
			return;
		case EefPackage.EEF_RADIO_DESCRIPTION__CONDITIONAL_STYLES:
			getConditionalStyles().clear();
			getConditionalStyles().addAll((Collection<? extends EEFRadioConditionalStyle>) newValue);
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
		case EefPackage.EEF_RADIO_DESCRIPTION__VALUE_EXPRESSION:
			setValueExpression(EEFRadioDescriptionImpl.VALUE_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_RADIO_DESCRIPTION__EDIT_EXPRESSION:
			setEditExpression(EEFRadioDescriptionImpl.EDIT_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_RADIO_DESCRIPTION__CANDIDATES_EXPRESSION:
			setCandidatesExpression(EEFRadioDescriptionImpl.CANDIDATES_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_RADIO_DESCRIPTION__CANDIDATE_DISPLAY_EXPRESSION:
			setCandidateDisplayExpression(EEFRadioDescriptionImpl.CANDIDATE_DISPLAY_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_RADIO_DESCRIPTION__STYLE:
			setStyle((EEFRadioStyle) null);
			return;
		case EefPackage.EEF_RADIO_DESCRIPTION__NUMBER_OF_COLUMNS:
			setNumberOfColumns(EEFRadioDescriptionImpl.NUMBER_OF_COLUMNS_EDEFAULT);
			return;
		case EefPackage.EEF_RADIO_DESCRIPTION__CONDITIONAL_STYLES:
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
		case EefPackage.EEF_RADIO_DESCRIPTION__VALUE_EXPRESSION:
			return EEFRadioDescriptionImpl.VALUE_EXPRESSION_EDEFAULT == null ? valueExpression != null
					: !EEFRadioDescriptionImpl.VALUE_EXPRESSION_EDEFAULT.equals(valueExpression);
		case EefPackage.EEF_RADIO_DESCRIPTION__EDIT_EXPRESSION:
			return EEFRadioDescriptionImpl.EDIT_EXPRESSION_EDEFAULT == null ? editExpression != null
					: !EEFRadioDescriptionImpl.EDIT_EXPRESSION_EDEFAULT.equals(editExpression);
		case EefPackage.EEF_RADIO_DESCRIPTION__CANDIDATES_EXPRESSION:
			return EEFRadioDescriptionImpl.CANDIDATES_EXPRESSION_EDEFAULT == null ? candidatesExpression != null
					: !EEFRadioDescriptionImpl.CANDIDATES_EXPRESSION_EDEFAULT.equals(candidatesExpression);
		case EefPackage.EEF_RADIO_DESCRIPTION__CANDIDATE_DISPLAY_EXPRESSION:
			return EEFRadioDescriptionImpl.CANDIDATE_DISPLAY_EXPRESSION_EDEFAULT == null ? candidateDisplayExpression != null
					: !EEFRadioDescriptionImpl.CANDIDATE_DISPLAY_EXPRESSION_EDEFAULT.equals(candidateDisplayExpression);
		case EefPackage.EEF_RADIO_DESCRIPTION__STYLE:
			return style != null;
		case EefPackage.EEF_RADIO_DESCRIPTION__NUMBER_OF_COLUMNS:
			return numberOfColumns != EEFRadioDescriptionImpl.NUMBER_OF_COLUMNS_EDEFAULT;
		case EefPackage.EEF_RADIO_DESCRIPTION__CONDITIONAL_STYLES:
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
		result.append(", numberOfColumns: "); //$NON-NLS-1$
		result.append(numberOfColumns);
		result.append(')');
		return result.toString();
	}

} // EEFRadioDescriptionImpl
