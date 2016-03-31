/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef.impl;

import org.eclipse.eef.EEFTextStyle;
import org.eclipse.eef.EEFWidgetStyle;
import org.eclipse.eef.EefPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>EEF Widget Style</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class EEFWidgetStyleImpl extends MinimalEObjectImpl.Container implements EEFWidgetStyle {
	/**
	 * The cached value of the '{@link #getLabelStyle() <em>Label Style</em>}' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getLabelStyle()
	 * @generated
	 * @ordered
	 */
	protected EEFTextStyle labelStyle;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected EEFWidgetStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefPackage.Literals.EEF_WIDGET_STYLE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EEFTextStyle getLabelStyle() {
		if (labelStyle != null && labelStyle.eIsProxy()) {
			InternalEObject oldLabelStyle = (InternalEObject) labelStyle;
			labelStyle = (EEFTextStyle) eResolveProxy(oldLabelStyle);
			if (labelStyle != oldLabelStyle) {
				InternalEObject newLabelStyle = (InternalEObject) labelStyle;
				NotificationChain msgs = oldLabelStyle.eInverseRemove(this, InternalEObject.EOPPOSITE_FEATURE_BASE
						- EefPackage.EEF_WIDGET_STYLE__LABEL_STYLE, null, null);
				if (newLabelStyle.eInternalContainer() == null) {
					msgs = newLabelStyle.eInverseAdd(this, InternalEObject.EOPPOSITE_FEATURE_BASE - EefPackage.EEF_WIDGET_STYLE__LABEL_STYLE, null,
							msgs);
				}
				if (msgs != null) {
					msgs.dispatch();
				}
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EefPackage.EEF_WIDGET_STYLE__LABEL_STYLE, oldLabelStyle, labelStyle));
				}
			}
		}
		return labelStyle;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EEFTextStyle basicGetLabelStyle() {
		return labelStyle;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public NotificationChain basicSetLabelStyle(EEFTextStyle newLabelStyle, NotificationChain msgs) {
		EEFTextStyle oldLabelStyle = labelStyle;
		labelStyle = newLabelStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EefPackage.EEF_WIDGET_STYLE__LABEL_STYLE, oldLabelStyle,
					newLabelStyle);
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
	public void setLabelStyle(EEFTextStyle newLabelStyle) {
		if (newLabelStyle != labelStyle) {
			NotificationChain msgs = null;
			if (labelStyle != null) {
				msgs = ((InternalEObject) labelStyle).eInverseRemove(this, InternalEObject.EOPPOSITE_FEATURE_BASE
						- EefPackage.EEF_WIDGET_STYLE__LABEL_STYLE, null, msgs);
			}
			if (newLabelStyle != null) {
				msgs = ((InternalEObject) newLabelStyle).eInverseAdd(this, InternalEObject.EOPPOSITE_FEATURE_BASE
						- EefPackage.EEF_WIDGET_STYLE__LABEL_STYLE, null, msgs);
			}
			msgs = basicSetLabelStyle(newLabelStyle, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_WIDGET_STYLE__LABEL_STYLE, newLabelStyle, newLabelStyle));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EefPackage.EEF_WIDGET_STYLE__LABEL_STYLE:
			return basicSetLabelStyle(null, msgs);
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
		case EefPackage.EEF_WIDGET_STYLE__LABEL_STYLE:
			if (resolve) {
				return getLabelStyle();
			}
			return basicGetLabelStyle();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EefPackage.EEF_WIDGET_STYLE__LABEL_STYLE:
			setLabelStyle((EEFTextStyle) newValue);
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
		case EefPackage.EEF_WIDGET_STYLE__LABEL_STYLE:
			setLabelStyle((EEFTextStyle) null);
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
		case EefPackage.EEF_WIDGET_STYLE__LABEL_STYLE:
			return labelStyle != null;
		}
		return super.eIsSet(featureID);
	}

} // EEFWidgetStyleImpl
