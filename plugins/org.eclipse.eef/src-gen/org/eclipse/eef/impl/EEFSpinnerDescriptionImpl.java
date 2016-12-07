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

import org.eclipse.eef.EEFSpinnerConditionalStyle;
import org.eclipse.eef.EEFSpinnerDescription;
import org.eclipse.eef.EEFSpinnerStyle;
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
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>EEF Spinner Description</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.eef.impl.EEFSpinnerDescriptionImpl#getValueExpression <em>Value Expression</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFSpinnerDescriptionImpl#getEditExpression <em>Edit Expression</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFSpinnerDescriptionImpl#getDigitsExpression <em>Digits Expression</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFSpinnerDescriptionImpl#getIncrementExpression <em>Increment Expression</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFSpinnerDescriptionImpl#getMinExpression <em>Min Expression</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFSpinnerDescriptionImpl#getMaxExpression <em>Max Expression</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFSpinnerDescriptionImpl#getStyle <em>Style</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFSpinnerDescriptionImpl#getConditionalStyles <em>Conditional Styles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EEFSpinnerDescriptionImpl extends EEFWidgetDescriptionImpl implements EEFSpinnerDescription {
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
	protected String valueExpression = EEFSpinnerDescriptionImpl.VALUE_EXPRESSION_EDEFAULT;

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
	protected String editExpression = EEFSpinnerDescriptionImpl.EDIT_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDigitsExpression() <em>Digits Expression</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getDigitsExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String DIGITS_EXPRESSION_EDEFAULT = "0"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getDigitsExpression() <em>Digits Expression</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getDigitsExpression()
	 * @generated
	 * @ordered
	 */
	protected String digitsExpression = EEFSpinnerDescriptionImpl.DIGITS_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncrementExpression() <em>Increment Expression</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getIncrementExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String INCREMENT_EXPRESSION_EDEFAULT = "1"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getIncrementExpression() <em>Increment Expression</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getIncrementExpression()
	 * @generated
	 * @ordered
	 */
	protected String incrementExpression = EEFSpinnerDescriptionImpl.INCREMENT_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinExpression() <em>Min Expression</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getMinExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String MIN_EXPRESSION_EDEFAULT = ""; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getMinExpression() <em>Min Expression</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getMinExpression()
	 * @generated
	 * @ordered
	 */
	protected String minExpression = EEFSpinnerDescriptionImpl.MIN_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxExpression() <em>Max Expression</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getMaxExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_EXPRESSION_EDEFAULT = ""; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getMaxExpression() <em>Max Expression</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getMaxExpression()
	 * @generated
	 * @ordered
	 */
	protected String maxExpression = EEFSpinnerDescriptionImpl.MAX_EXPRESSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected EEFSpinnerStyle style;

	/**
	 * The cached value of the '{@link #getConditionalStyles() <em>Conditional Styles</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getConditionalStyles()
	 * @generated
	 * @ordered
	 */
	protected EList<EEFSpinnerConditionalStyle> conditionalStyles;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected EEFSpinnerDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefPackage.Literals.EEF_SPINNER_DESCRIPTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_SPINNER_DESCRIPTION__VALUE_EXPRESSION, oldValueExpression,
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
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_SPINNER_DESCRIPTION__EDIT_EXPRESSION, oldEditExpression,
					editExpression));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getDigitsExpression() {
		return digitsExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setDigitsExpression(String newDigitsExpression) {
		String oldDigitsExpression = digitsExpression;
		digitsExpression = newDigitsExpression;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_SPINNER_DESCRIPTION__DIGITS_EXPRESSION, oldDigitsExpression,
					digitsExpression));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getIncrementExpression() {
		return incrementExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setIncrementExpression(String newIncrementExpression) {
		String oldIncrementExpression = incrementExpression;
		incrementExpression = newIncrementExpression;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_SPINNER_DESCRIPTION__INCREMENT_EXPRESSION, oldIncrementExpression,
					incrementExpression));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getMinExpression() {
		return minExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setMinExpression(String newMinExpression) {
		String oldMinExpression = minExpression;
		minExpression = newMinExpression;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_SPINNER_DESCRIPTION__MIN_EXPRESSION, oldMinExpression,
					minExpression));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getMaxExpression() {
		return maxExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setMaxExpression(String newMaxExpression) {
		String oldMaxExpression = maxExpression;
		maxExpression = newMaxExpression;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_SPINNER_DESCRIPTION__MAX_EXPRESSION, oldMaxExpression,
					maxExpression));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EEFSpinnerStyle getStyle() {
		if (style != null && style.eIsProxy()) {
			InternalEObject oldStyle = (InternalEObject) style;
			style = (EEFSpinnerStyle) eResolveProxy(oldStyle);
			if (style != oldStyle) {
				InternalEObject newStyle = (InternalEObject) style;
				NotificationChain msgs = oldStyle.eInverseRemove(this,
						InternalEObject.EOPPOSITE_FEATURE_BASE - EefPackage.EEF_SPINNER_DESCRIPTION__STYLE, null, null);
				if (newStyle.eInternalContainer() == null) {
					msgs = newStyle.eInverseAdd(this, InternalEObject.EOPPOSITE_FEATURE_BASE - EefPackage.EEF_SPINNER_DESCRIPTION__STYLE, null, msgs);
				}
				if (msgs != null) {
					msgs.dispatch();
				}
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EefPackage.EEF_SPINNER_DESCRIPTION__STYLE, oldStyle, style));
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
	public EEFSpinnerStyle basicGetStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public NotificationChain basicSetStyle(EEFSpinnerStyle newStyle, NotificationChain msgs) {
		EEFSpinnerStyle oldStyle = style;
		style = newStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EefPackage.EEF_SPINNER_DESCRIPTION__STYLE, oldStyle,
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
	public void setStyle(EEFSpinnerStyle newStyle) {
		if (newStyle != style) {
			NotificationChain msgs = null;
			if (style != null) {
				msgs = ((InternalEObject) style).eInverseRemove(this,
						InternalEObject.EOPPOSITE_FEATURE_BASE - EefPackage.EEF_SPINNER_DESCRIPTION__STYLE, null, msgs);
			}
			if (newStyle != null) {
				msgs = ((InternalEObject) newStyle).eInverseAdd(this,
						InternalEObject.EOPPOSITE_FEATURE_BASE - EefPackage.EEF_SPINNER_DESCRIPTION__STYLE, null, msgs);
			}
			msgs = basicSetStyle(newStyle, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_SPINNER_DESCRIPTION__STYLE, newStyle, newStyle));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<EEFSpinnerConditionalStyle> getConditionalStyles() {
		if (conditionalStyles == null) {
			conditionalStyles = new EObjectContainmentEList.Resolving<>(EEFSpinnerConditionalStyle.class, this,
					EefPackage.EEF_SPINNER_DESCRIPTION__CONDITIONAL_STYLES);
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
		case EefPackage.EEF_SPINNER_DESCRIPTION__STYLE:
			return basicSetStyle(null, msgs);
		case EefPackage.EEF_SPINNER_DESCRIPTION__CONDITIONAL_STYLES:
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
		case EefPackage.EEF_SPINNER_DESCRIPTION__VALUE_EXPRESSION:
			return getValueExpression();
		case EefPackage.EEF_SPINNER_DESCRIPTION__EDIT_EXPRESSION:
			return getEditExpression();
		case EefPackage.EEF_SPINNER_DESCRIPTION__DIGITS_EXPRESSION:
			return getDigitsExpression();
		case EefPackage.EEF_SPINNER_DESCRIPTION__INCREMENT_EXPRESSION:
			return getIncrementExpression();
		case EefPackage.EEF_SPINNER_DESCRIPTION__MIN_EXPRESSION:
			return getMinExpression();
		case EefPackage.EEF_SPINNER_DESCRIPTION__MAX_EXPRESSION:
			return getMaxExpression();
		case EefPackage.EEF_SPINNER_DESCRIPTION__STYLE:
			if (resolve) {
				return getStyle();
			}
			return basicGetStyle();
		case EefPackage.EEF_SPINNER_DESCRIPTION__CONDITIONAL_STYLES:
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
		case EefPackage.EEF_SPINNER_DESCRIPTION__VALUE_EXPRESSION:
			setValueExpression((String) newValue);
			return;
		case EefPackage.EEF_SPINNER_DESCRIPTION__EDIT_EXPRESSION:
			setEditExpression((String) newValue);
			return;
		case EefPackage.EEF_SPINNER_DESCRIPTION__DIGITS_EXPRESSION:
			setDigitsExpression((String) newValue);
			return;
		case EefPackage.EEF_SPINNER_DESCRIPTION__INCREMENT_EXPRESSION:
			setIncrementExpression((String) newValue);
			return;
		case EefPackage.EEF_SPINNER_DESCRIPTION__MIN_EXPRESSION:
			setMinExpression((String) newValue);
			return;
		case EefPackage.EEF_SPINNER_DESCRIPTION__MAX_EXPRESSION:
			setMaxExpression((String) newValue);
			return;
		case EefPackage.EEF_SPINNER_DESCRIPTION__STYLE:
			setStyle((EEFSpinnerStyle) newValue);
			return;
		case EefPackage.EEF_SPINNER_DESCRIPTION__CONDITIONAL_STYLES:
			getConditionalStyles().clear();
			getConditionalStyles().addAll((Collection<? extends EEFSpinnerConditionalStyle>) newValue);
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
		case EefPackage.EEF_SPINNER_DESCRIPTION__VALUE_EXPRESSION:
			setValueExpression(EEFSpinnerDescriptionImpl.VALUE_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_SPINNER_DESCRIPTION__EDIT_EXPRESSION:
			setEditExpression(EEFSpinnerDescriptionImpl.EDIT_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_SPINNER_DESCRIPTION__DIGITS_EXPRESSION:
			setDigitsExpression(EEFSpinnerDescriptionImpl.DIGITS_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_SPINNER_DESCRIPTION__INCREMENT_EXPRESSION:
			setIncrementExpression(EEFSpinnerDescriptionImpl.INCREMENT_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_SPINNER_DESCRIPTION__MIN_EXPRESSION:
			setMinExpression(EEFSpinnerDescriptionImpl.MIN_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_SPINNER_DESCRIPTION__MAX_EXPRESSION:
			setMaxExpression(EEFSpinnerDescriptionImpl.MAX_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_SPINNER_DESCRIPTION__STYLE:
			setStyle((EEFSpinnerStyle) null);
			return;
		case EefPackage.EEF_SPINNER_DESCRIPTION__CONDITIONAL_STYLES:
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
		case EefPackage.EEF_SPINNER_DESCRIPTION__VALUE_EXPRESSION:
			return EEFSpinnerDescriptionImpl.VALUE_EXPRESSION_EDEFAULT == null ? valueExpression != null
					: !EEFSpinnerDescriptionImpl.VALUE_EXPRESSION_EDEFAULT.equals(valueExpression);
		case EefPackage.EEF_SPINNER_DESCRIPTION__EDIT_EXPRESSION:
			return EEFSpinnerDescriptionImpl.EDIT_EXPRESSION_EDEFAULT == null ? editExpression != null
					: !EEFSpinnerDescriptionImpl.EDIT_EXPRESSION_EDEFAULT.equals(editExpression);
		case EefPackage.EEF_SPINNER_DESCRIPTION__DIGITS_EXPRESSION:
			return EEFSpinnerDescriptionImpl.DIGITS_EXPRESSION_EDEFAULT == null ? digitsExpression != null
					: !EEFSpinnerDescriptionImpl.DIGITS_EXPRESSION_EDEFAULT.equals(digitsExpression);
		case EefPackage.EEF_SPINNER_DESCRIPTION__INCREMENT_EXPRESSION:
			return EEFSpinnerDescriptionImpl.INCREMENT_EXPRESSION_EDEFAULT == null ? incrementExpression != null
					: !EEFSpinnerDescriptionImpl.INCREMENT_EXPRESSION_EDEFAULT.equals(incrementExpression);
		case EefPackage.EEF_SPINNER_DESCRIPTION__MIN_EXPRESSION:
			return EEFSpinnerDescriptionImpl.MIN_EXPRESSION_EDEFAULT == null ? minExpression != null
					: !EEFSpinnerDescriptionImpl.MIN_EXPRESSION_EDEFAULT.equals(minExpression);
		case EefPackage.EEF_SPINNER_DESCRIPTION__MAX_EXPRESSION:
			return EEFSpinnerDescriptionImpl.MAX_EXPRESSION_EDEFAULT == null ? maxExpression != null
					: !EEFSpinnerDescriptionImpl.MAX_EXPRESSION_EDEFAULT.equals(maxExpression);
		case EefPackage.EEF_SPINNER_DESCRIPTION__STYLE:
			return style != null;
		case EefPackage.EEF_SPINNER_DESCRIPTION__CONDITIONAL_STYLES:
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (valueExpression: "); //$NON-NLS-1$
		result.append(valueExpression);
		result.append(", editExpression: "); //$NON-NLS-1$
		result.append(editExpression);
		result.append(", digitsExpression: "); //$NON-NLS-1$
		result.append(digitsExpression);
		result.append(", incrementExpression: "); //$NON-NLS-1$
		result.append(incrementExpression);
		result.append(", minExpression: "); //$NON-NLS-1$
		result.append(minExpression);
		result.append(", maxExpression: "); //$NON-NLS-1$
		result.append(maxExpression);
		result.append(')');
		return result.toString();
	}

} // EEFSpinnerDescriptionImpl
