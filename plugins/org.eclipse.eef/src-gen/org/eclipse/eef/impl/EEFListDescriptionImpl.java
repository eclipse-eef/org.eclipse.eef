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

import org.eclipse.eef.EEFListConditionalStyle;
import org.eclipse.eef.EEFListDescription;
import org.eclipse.eef.EEFListStyle;
import org.eclipse.eef.EEFWidgetAction;
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
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>EEF List Description</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.eef.impl.EEFListDescriptionImpl#getValueExpression <em>Value Expression</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFListDescriptionImpl#getDisplayExpression <em>Display Expression</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFListDescriptionImpl#getOnClickExpression <em>On Click Expression</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFListDescriptionImpl#getActions <em>Actions</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFListDescriptionImpl#getStyle <em>Style</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFListDescriptionImpl#getConditionalStyles <em>Conditional Styles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EEFListDescriptionImpl extends EEFWidgetDescriptionImpl implements EEFListDescription {
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
	protected String valueExpression = EEFListDescriptionImpl.VALUE_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisplayExpression() <em>Display Expression</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDisplayExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplayExpression() <em>Display Expression</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDisplayExpression()
	 * @generated
	 * @ordered
	 */
	protected String displayExpression = EEFListDescriptionImpl.DISPLAY_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnClickExpression() <em>On Click Expression</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getOnClickExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_CLICK_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnClickExpression() <em>On Click Expression</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getOnClickExpression()
	 * @generated
	 * @ordered
	 */
	protected String onClickExpression = EEFListDescriptionImpl.ON_CLICK_EXPRESSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<EEFWidgetAction> actions;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected EEFListStyle style;

	/**
	 * The cached value of the '{@link #getConditionalStyles() <em>Conditional Styles</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getConditionalStyles()
	 * @generated
	 * @ordered
	 */
	protected EList<EEFListConditionalStyle> conditionalStyles;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EEFListDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefPackage.Literals.EEF_LIST_DESCRIPTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_LIST_DESCRIPTION__VALUE_EXPRESSION, oldValueExpression,
					valueExpression));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getDisplayExpression() {
		return displayExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setDisplayExpression(String newDisplayExpression) {
		String oldDisplayExpression = displayExpression;
		displayExpression = newDisplayExpression;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_LIST_DESCRIPTION__DISPLAY_EXPRESSION, oldDisplayExpression,
					displayExpression));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getOnClickExpression() {
		return onClickExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setOnClickExpression(String newOnClickExpression) {
		String oldOnClickExpression = onClickExpression;
		onClickExpression = newOnClickExpression;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_LIST_DESCRIPTION__ON_CLICK_EXPRESSION, oldOnClickExpression,
					onClickExpression));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<EEFWidgetAction> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList.Resolving<>(EEFWidgetAction.class, this, EefPackage.EEF_LIST_DESCRIPTION__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EEFListStyle getStyle() {
		if (style != null && style.eIsProxy()) {
			InternalEObject oldStyle = (InternalEObject) style;
			style = (EEFListStyle) eResolveProxy(oldStyle);
			if (style != oldStyle) {
				InternalEObject newStyle = (InternalEObject) style;
				NotificationChain msgs = oldStyle.eInverseRemove(this,
						InternalEObject.EOPPOSITE_FEATURE_BASE - EefPackage.EEF_LIST_DESCRIPTION__STYLE, null, null);
				if (newStyle.eInternalContainer() == null) {
					msgs = newStyle.eInverseAdd(this, InternalEObject.EOPPOSITE_FEATURE_BASE - EefPackage.EEF_LIST_DESCRIPTION__STYLE, null, msgs);
				}
				if (msgs != null) {
					msgs.dispatch();
				}
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EefPackage.EEF_LIST_DESCRIPTION__STYLE, oldStyle, style));
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
	public EEFListStyle basicGetStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetStyle(EEFListStyle newStyle, NotificationChain msgs) {
		EEFListStyle oldStyle = style;
		style = newStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EefPackage.EEF_LIST_DESCRIPTION__STYLE, oldStyle,
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
	public void setStyle(EEFListStyle newStyle) {
		if (newStyle != style) {
			NotificationChain msgs = null;
			if (style != null) {
				msgs = ((InternalEObject) style).eInverseRemove(this, InternalEObject.EOPPOSITE_FEATURE_BASE - EefPackage.EEF_LIST_DESCRIPTION__STYLE,
						null, msgs);
			}
			if (newStyle != null) {
				msgs = ((InternalEObject) newStyle).eInverseAdd(this, InternalEObject.EOPPOSITE_FEATURE_BASE - EefPackage.EEF_LIST_DESCRIPTION__STYLE,
						null, msgs);
			}
			msgs = basicSetStyle(newStyle, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_LIST_DESCRIPTION__STYLE, newStyle, newStyle));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<EEFListConditionalStyle> getConditionalStyles() {
		if (conditionalStyles == null) {
			conditionalStyles = new EObjectContainmentEList.Resolving<>(EEFListConditionalStyle.class, this,
					EefPackage.EEF_LIST_DESCRIPTION__CONDITIONAL_STYLES);
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
		case EefPackage.EEF_LIST_DESCRIPTION__ACTIONS:
			return ((InternalEList<?>) getActions()).basicRemove(otherEnd, msgs);
		case EefPackage.EEF_LIST_DESCRIPTION__STYLE:
			return basicSetStyle(null, msgs);
		case EefPackage.EEF_LIST_DESCRIPTION__CONDITIONAL_STYLES:
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
		case EefPackage.EEF_LIST_DESCRIPTION__VALUE_EXPRESSION:
			return getValueExpression();
		case EefPackage.EEF_LIST_DESCRIPTION__DISPLAY_EXPRESSION:
			return getDisplayExpression();
		case EefPackage.EEF_LIST_DESCRIPTION__ON_CLICK_EXPRESSION:
			return getOnClickExpression();
		case EefPackage.EEF_LIST_DESCRIPTION__ACTIONS:
			return getActions();
		case EefPackage.EEF_LIST_DESCRIPTION__STYLE:
			if (resolve) {
				return getStyle();
			}
			return basicGetStyle();
		case EefPackage.EEF_LIST_DESCRIPTION__CONDITIONAL_STYLES:
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
		case EefPackage.EEF_LIST_DESCRIPTION__VALUE_EXPRESSION:
			setValueExpression((String) newValue);
			return;
		case EefPackage.EEF_LIST_DESCRIPTION__DISPLAY_EXPRESSION:
			setDisplayExpression((String) newValue);
			return;
		case EefPackage.EEF_LIST_DESCRIPTION__ON_CLICK_EXPRESSION:
			setOnClickExpression((String) newValue);
			return;
		case EefPackage.EEF_LIST_DESCRIPTION__ACTIONS:
			getActions().clear();
			getActions().addAll((Collection<? extends EEFWidgetAction>) newValue);
			return;
		case EefPackage.EEF_LIST_DESCRIPTION__STYLE:
			setStyle((EEFListStyle) newValue);
			return;
		case EefPackage.EEF_LIST_DESCRIPTION__CONDITIONAL_STYLES:
			getConditionalStyles().clear();
			getConditionalStyles().addAll((Collection<? extends EEFListConditionalStyle>) newValue);
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
		case EefPackage.EEF_LIST_DESCRIPTION__VALUE_EXPRESSION:
			setValueExpression(EEFListDescriptionImpl.VALUE_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_LIST_DESCRIPTION__DISPLAY_EXPRESSION:
			setDisplayExpression(EEFListDescriptionImpl.DISPLAY_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_LIST_DESCRIPTION__ON_CLICK_EXPRESSION:
			setOnClickExpression(EEFListDescriptionImpl.ON_CLICK_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_LIST_DESCRIPTION__ACTIONS:
			getActions().clear();
			return;
		case EefPackage.EEF_LIST_DESCRIPTION__STYLE:
			setStyle((EEFListStyle) null);
			return;
		case EefPackage.EEF_LIST_DESCRIPTION__CONDITIONAL_STYLES:
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
		case EefPackage.EEF_LIST_DESCRIPTION__VALUE_EXPRESSION:
			return EEFListDescriptionImpl.VALUE_EXPRESSION_EDEFAULT == null ? valueExpression != null
					: !EEFListDescriptionImpl.VALUE_EXPRESSION_EDEFAULT.equals(valueExpression);
		case EefPackage.EEF_LIST_DESCRIPTION__DISPLAY_EXPRESSION:
			return EEFListDescriptionImpl.DISPLAY_EXPRESSION_EDEFAULT == null ? displayExpression != null
					: !EEFListDescriptionImpl.DISPLAY_EXPRESSION_EDEFAULT.equals(displayExpression);
		case EefPackage.EEF_LIST_DESCRIPTION__ON_CLICK_EXPRESSION:
			return EEFListDescriptionImpl.ON_CLICK_EXPRESSION_EDEFAULT == null ? onClickExpression != null
					: !EEFListDescriptionImpl.ON_CLICK_EXPRESSION_EDEFAULT.equals(onClickExpression);
		case EefPackage.EEF_LIST_DESCRIPTION__ACTIONS:
			return actions != null && !actions.isEmpty();
		case EefPackage.EEF_LIST_DESCRIPTION__STYLE:
			return style != null;
		case EefPackage.EEF_LIST_DESCRIPTION__CONDITIONAL_STYLES:
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
		result.append(", displayExpression: "); //$NON-NLS-1$
		result.append(displayExpression);
		result.append(", onClickExpression: "); //$NON-NLS-1$
		result.append(onClickExpression);
		result.append(')');
		return result.toString();
	}

} // EEFListDescriptionImpl
