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

import org.eclipse.eef.EEFCustomExpression;
import org.eclipse.eef.EEFCustomWidgetConditionalStyle;
import org.eclipse.eef.EEFCustomWidgetDescription;
import org.eclipse.eef.EEFCustomWidgetStyle;
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
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>EEF Custom Widget Description</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.eef.impl.EEFCustomWidgetDescriptionImpl#getCustomExpressions <em>Custom Expressions</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFCustomWidgetDescriptionImpl#getStyle <em>Style</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFCustomWidgetDescriptionImpl#getConditionalStyles <em>Conditional Styles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EEFCustomWidgetDescriptionImpl extends EEFWidgetDescriptionImpl implements EEFCustomWidgetDescription {
	/**
	 * The cached value of the '{@link #getCustomExpressions() <em>Custom Expressions</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getCustomExpressions()
	 * @generated
	 * @ordered
	 */
	protected EList<EEFCustomExpression> customExpressions;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected EEFCustomWidgetStyle style;

	/**
	 * The cached value of the '{@link #getConditionalStyles() <em>Conditional Styles</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getConditionalStyles()
	 * @generated
	 * @ordered
	 */
	protected EList<EEFCustomWidgetConditionalStyle> conditionalStyles;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EEFCustomWidgetDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefPackage.Literals.EEF_CUSTOM_WIDGET_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<EEFCustomExpression> getCustomExpressions() {
		if (customExpressions == null) {
			customExpressions = new EObjectContainmentEList.Resolving<>(EEFCustomExpression.class, this,
					EefPackage.EEF_CUSTOM_WIDGET_DESCRIPTION__CUSTOM_EXPRESSIONS);
		}
		return customExpressions;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EEFCustomWidgetStyle getStyle() {
		if (style != null && style.eIsProxy()) {
			InternalEObject oldStyle = (InternalEObject) style;
			style = (EEFCustomWidgetStyle) eResolveProxy(oldStyle);
			if (style != oldStyle) {
				InternalEObject newStyle = (InternalEObject) style;
				NotificationChain msgs = oldStyle.eInverseRemove(this,
						InternalEObject.EOPPOSITE_FEATURE_BASE - EefPackage.EEF_CUSTOM_WIDGET_DESCRIPTION__STYLE, null, null);
				if (newStyle.eInternalContainer() == null) {
					msgs = newStyle.eInverseAdd(this, InternalEObject.EOPPOSITE_FEATURE_BASE - EefPackage.EEF_CUSTOM_WIDGET_DESCRIPTION__STYLE, null,
							msgs);
				}
				if (msgs != null) {
					msgs.dispatch();
				}
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EefPackage.EEF_CUSTOM_WIDGET_DESCRIPTION__STYLE, oldStyle, style));
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
	public EEFCustomWidgetStyle basicGetStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetStyle(EEFCustomWidgetStyle newStyle, NotificationChain msgs) {
		EEFCustomWidgetStyle oldStyle = style;
		style = newStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EefPackage.EEF_CUSTOM_WIDGET_DESCRIPTION__STYLE, oldStyle,
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
	public void setStyle(EEFCustomWidgetStyle newStyle) {
		if (newStyle != style) {
			NotificationChain msgs = null;
			if (style != null) {
				msgs = ((InternalEObject) style).eInverseRemove(this,
						InternalEObject.EOPPOSITE_FEATURE_BASE - EefPackage.EEF_CUSTOM_WIDGET_DESCRIPTION__STYLE, null, msgs);
			}
			if (newStyle != null) {
				msgs = ((InternalEObject) newStyle).eInverseAdd(this,
						InternalEObject.EOPPOSITE_FEATURE_BASE - EefPackage.EEF_CUSTOM_WIDGET_DESCRIPTION__STYLE, null, msgs);
			}
			msgs = basicSetStyle(newStyle, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_CUSTOM_WIDGET_DESCRIPTION__STYLE, newStyle, newStyle));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<EEFCustomWidgetConditionalStyle> getConditionalStyles() {
		if (conditionalStyles == null) {
			conditionalStyles = new EObjectContainmentEList.Resolving<>(EEFCustomWidgetConditionalStyle.class, this,
					EefPackage.EEF_CUSTOM_WIDGET_DESCRIPTION__CONDITIONAL_STYLES);
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
		case EefPackage.EEF_CUSTOM_WIDGET_DESCRIPTION__CUSTOM_EXPRESSIONS:
			return ((InternalEList<?>) getCustomExpressions()).basicRemove(otherEnd, msgs);
		case EefPackage.EEF_CUSTOM_WIDGET_DESCRIPTION__STYLE:
			return basicSetStyle(null, msgs);
		case EefPackage.EEF_CUSTOM_WIDGET_DESCRIPTION__CONDITIONAL_STYLES:
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
		case EefPackage.EEF_CUSTOM_WIDGET_DESCRIPTION__CUSTOM_EXPRESSIONS:
			return getCustomExpressions();
		case EefPackage.EEF_CUSTOM_WIDGET_DESCRIPTION__STYLE:
			if (resolve) {
				return getStyle();
			}
			return basicGetStyle();
		case EefPackage.EEF_CUSTOM_WIDGET_DESCRIPTION__CONDITIONAL_STYLES:
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
		case EefPackage.EEF_CUSTOM_WIDGET_DESCRIPTION__CUSTOM_EXPRESSIONS:
			getCustomExpressions().clear();
			getCustomExpressions().addAll((Collection<? extends EEFCustomExpression>) newValue);
			return;
		case EefPackage.EEF_CUSTOM_WIDGET_DESCRIPTION__STYLE:
			setStyle((EEFCustomWidgetStyle) newValue);
			return;
		case EefPackage.EEF_CUSTOM_WIDGET_DESCRIPTION__CONDITIONAL_STYLES:
			getConditionalStyles().clear();
			getConditionalStyles().addAll((Collection<? extends EEFCustomWidgetConditionalStyle>) newValue);
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
		case EefPackage.EEF_CUSTOM_WIDGET_DESCRIPTION__CUSTOM_EXPRESSIONS:
			getCustomExpressions().clear();
			return;
		case EefPackage.EEF_CUSTOM_WIDGET_DESCRIPTION__STYLE:
			setStyle((EEFCustomWidgetStyle) null);
			return;
		case EefPackage.EEF_CUSTOM_WIDGET_DESCRIPTION__CONDITIONAL_STYLES:
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
		case EefPackage.EEF_CUSTOM_WIDGET_DESCRIPTION__CUSTOM_EXPRESSIONS:
			return customExpressions != null && !customExpressions.isEmpty();
		case EefPackage.EEF_CUSTOM_WIDGET_DESCRIPTION__STYLE:
			return style != null;
		case EefPackage.EEF_CUSTOM_WIDGET_DESCRIPTION__CONDITIONAL_STYLES:
			return conditionalStyles != null && !conditionalStyles.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // EEFCustomWidgetDescriptionImpl
