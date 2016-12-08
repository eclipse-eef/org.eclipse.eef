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

import org.eclipse.eef.EEFDateConditionalStyle;
import org.eclipse.eef.EEFDateDescription;
import org.eclipse.eef.EEFDateStyle;
import org.eclipse.eef.EEF_DATE_DISPLAY;
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
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EEF Date Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eef.impl.EEFDateDescriptionImpl#getDisplay <em>Display</em>}</li>
 *   <li>{@link org.eclipse.eef.impl.EEFDateDescriptionImpl#getValueExpression <em>Value Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.impl.EEFDateDescriptionImpl#getEditExpression <em>Edit Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.impl.EEFDateDescriptionImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.eclipse.eef.impl.EEFDateDescriptionImpl#getConditionalStyles <em>Conditional Styles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EEFDateDescriptionImpl extends EEFWidgetDescriptionImpl implements EEFDateDescription {
	/**
	 * The default value of the '{@link #getDisplay() <em>Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplay()
	 * @generated
	 * @ordered
	 */
	protected static final EEF_DATE_DISPLAY DISPLAY_EDEFAULT = EEF_DATE_DISPLAY.CALENDAR;

	/**
	 * The cached value of the '{@link #getDisplay() <em>Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplay()
	 * @generated
	 * @ordered
	 */
	protected EEF_DATE_DISPLAY display = DISPLAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueExpression() <em>Value Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueExpression() <em>Value Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueExpression()
	 * @generated
	 * @ordered
	 */
	protected String valueExpression = VALUE_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getEditExpression() <em>Edit Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String EDIT_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEditExpression() <em>Edit Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditExpression()
	 * @generated
	 * @ordered
	 */
	protected String editExpression = EDIT_EXPRESSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected EEFDateStyle style;

	/**
	 * The cached value of the '{@link #getConditionalStyles() <em>Conditional Styles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionalStyles()
	 * @generated
	 * @ordered
	 */
	protected EList<EEFDateConditionalStyle> conditionalStyles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EEFDateDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefPackage.Literals.EEF_DATE_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEF_DATE_DISPLAY getDisplay() {
		return display;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisplay(EEF_DATE_DISPLAY newDisplay) {
		EEF_DATE_DISPLAY oldDisplay = display;
		display = newDisplay == null ? DISPLAY_EDEFAULT : newDisplay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_DATE_DESCRIPTION__DISPLAY, oldDisplay, display));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValueExpression() {
		return valueExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValueExpression(String newValueExpression) {
		String oldValueExpression = valueExpression;
		valueExpression = newValueExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_DATE_DESCRIPTION__VALUE_EXPRESSION, oldValueExpression,
					valueExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEditExpression() {
		return editExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEditExpression(String newEditExpression) {
		String oldEditExpression = editExpression;
		editExpression = newEditExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_DATE_DESCRIPTION__EDIT_EXPRESSION, oldEditExpression,
					editExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEFDateStyle getStyle() {
		if (style != null && style.eIsProxy()) {
			InternalEObject oldStyle = (InternalEObject) style;
			style = (EEFDateStyle) eResolveProxy(oldStyle);
			if (style != oldStyle) {
				InternalEObject newStyle = (InternalEObject) style;
				NotificationChain msgs = oldStyle.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EefPackage.EEF_DATE_DESCRIPTION__STYLE, null, null);
				if (newStyle.eInternalContainer() == null) {
					msgs = newStyle.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EefPackage.EEF_DATE_DESCRIPTION__STYLE, null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EefPackage.EEF_DATE_DESCRIPTION__STYLE, oldStyle, style));
			}
		}
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEFDateStyle basicGetStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStyle(EEFDateStyle newStyle, NotificationChain msgs) {
		EEFDateStyle oldStyle = style;
		style = newStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EefPackage.EEF_DATE_DESCRIPTION__STYLE, oldStyle,
					newStyle);
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
	public void setStyle(EEFDateStyle newStyle) {
		if (newStyle != style) {
			NotificationChain msgs = null;
			if (style != null)
				msgs = ((InternalEObject) style).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EefPackage.EEF_DATE_DESCRIPTION__STYLE, null, msgs);
			if (newStyle != null)
				msgs = ((InternalEObject) newStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EefPackage.EEF_DATE_DESCRIPTION__STYLE, null, msgs);
			msgs = basicSetStyle(newStyle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_DATE_DESCRIPTION__STYLE, newStyle, newStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EEFDateConditionalStyle> getConditionalStyles() {
		if (conditionalStyles == null) {
			conditionalStyles = new EObjectContainmentEList.Resolving<EEFDateConditionalStyle>(EEFDateConditionalStyle.class, this,
					EefPackage.EEF_DATE_DESCRIPTION__CONDITIONAL_STYLES);
		}
		return conditionalStyles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EefPackage.EEF_DATE_DESCRIPTION__STYLE:
			return basicSetStyle(null, msgs);
		case EefPackage.EEF_DATE_DESCRIPTION__CONDITIONAL_STYLES:
			return ((InternalEList<?>) getConditionalStyles()).basicRemove(otherEnd, msgs);
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
		case EefPackage.EEF_DATE_DESCRIPTION__DISPLAY:
			return getDisplay();
		case EefPackage.EEF_DATE_DESCRIPTION__VALUE_EXPRESSION:
			return getValueExpression();
		case EefPackage.EEF_DATE_DESCRIPTION__EDIT_EXPRESSION:
			return getEditExpression();
		case EefPackage.EEF_DATE_DESCRIPTION__STYLE:
			if (resolve)
				return getStyle();
			return basicGetStyle();
		case EefPackage.EEF_DATE_DESCRIPTION__CONDITIONAL_STYLES:
			return getConditionalStyles();
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
		case EefPackage.EEF_DATE_DESCRIPTION__DISPLAY:
			setDisplay((EEF_DATE_DISPLAY) newValue);
			return;
		case EefPackage.EEF_DATE_DESCRIPTION__VALUE_EXPRESSION:
			setValueExpression((String) newValue);
			return;
		case EefPackage.EEF_DATE_DESCRIPTION__EDIT_EXPRESSION:
			setEditExpression((String) newValue);
			return;
		case EefPackage.EEF_DATE_DESCRIPTION__STYLE:
			setStyle((EEFDateStyle) newValue);
			return;
		case EefPackage.EEF_DATE_DESCRIPTION__CONDITIONAL_STYLES:
			getConditionalStyles().clear();
			getConditionalStyles().addAll((Collection<? extends EEFDateConditionalStyle>) newValue);
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
		case EefPackage.EEF_DATE_DESCRIPTION__DISPLAY:
			setDisplay(DISPLAY_EDEFAULT);
			return;
		case EefPackage.EEF_DATE_DESCRIPTION__VALUE_EXPRESSION:
			setValueExpression(VALUE_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_DATE_DESCRIPTION__EDIT_EXPRESSION:
			setEditExpression(EDIT_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_DATE_DESCRIPTION__STYLE:
			setStyle((EEFDateStyle) null);
			return;
		case EefPackage.EEF_DATE_DESCRIPTION__CONDITIONAL_STYLES:
			getConditionalStyles().clear();
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
		case EefPackage.EEF_DATE_DESCRIPTION__DISPLAY:
			return display != DISPLAY_EDEFAULT;
		case EefPackage.EEF_DATE_DESCRIPTION__VALUE_EXPRESSION:
			return VALUE_EXPRESSION_EDEFAULT == null ? valueExpression != null : !VALUE_EXPRESSION_EDEFAULT.equals(valueExpression);
		case EefPackage.EEF_DATE_DESCRIPTION__EDIT_EXPRESSION:
			return EDIT_EXPRESSION_EDEFAULT == null ? editExpression != null : !EDIT_EXPRESSION_EDEFAULT.equals(editExpression);
		case EefPackage.EEF_DATE_DESCRIPTION__STYLE:
			return style != null;
		case EefPackage.EEF_DATE_DESCRIPTION__CONDITIONAL_STYLES:
			return conditionalStyles != null && !conditionalStyles.isEmpty();
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
		result.append(" (display: "); //$NON-NLS-1$
		result.append(display);
		result.append(", valueExpression: "); //$NON-NLS-1$
		result.append(valueExpression);
		result.append(", editExpression: "); //$NON-NLS-1$
		result.append(editExpression);
		result.append(')');
		return result.toString();
	}

} //EEFDateDescriptionImpl
