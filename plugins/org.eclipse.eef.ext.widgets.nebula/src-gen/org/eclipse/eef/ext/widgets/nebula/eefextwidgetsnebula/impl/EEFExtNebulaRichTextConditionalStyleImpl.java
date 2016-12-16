/**
 * Copyright (c) 2016 Obeo.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula.impl;

import org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula.EEFExtNebulaRichTextConditionalStyle;
import org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula.EEFExtNebulaRichTextWidgetStyle;
import org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula.EefExtWidgetsNebulaPackage;

import org.eclipse.eef.impl.EEFConditionalStyleImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EEF Ext Nebula Rich Text Conditional Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula.impl.EEFExtNebulaRichTextConditionalStyleImpl#getStyle <em>Style</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EEFExtNebulaRichTextConditionalStyleImpl extends EEFConditionalStyleImpl
		implements EEFExtNebulaRichTextConditionalStyle {
	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected EEFExtNebulaRichTextWidgetStyle style;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EEFExtNebulaRichTextConditionalStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefExtWidgetsNebulaPackage.Literals.EEF_EXT_NEBULA_RICH_TEXT_CONDITIONAL_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEFExtNebulaRichTextWidgetStyle getStyle() {
		if (style != null && style.eIsProxy()) {
			InternalEObject oldStyle = (InternalEObject) style;
			style = (EEFExtNebulaRichTextWidgetStyle) eResolveProxy(oldStyle);
			if (style != oldStyle) {
				InternalEObject newStyle = (InternalEObject) style;
				NotificationChain msgs = oldStyle.eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- EefExtWidgetsNebulaPackage.EEF_EXT_NEBULA_RICH_TEXT_CONDITIONAL_STYLE__STYLE,
						null, null);
				if (newStyle.eInternalContainer() == null) {
					msgs = newStyle.eInverseAdd(this,
							EOPPOSITE_FEATURE_BASE
									- EefExtWidgetsNebulaPackage.EEF_EXT_NEBULA_RICH_TEXT_CONDITIONAL_STYLE__STYLE,
							null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EefExtWidgetsNebulaPackage.EEF_EXT_NEBULA_RICH_TEXT_CONDITIONAL_STYLE__STYLE, oldStyle,
							style));
			}
		}
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEFExtNebulaRichTextWidgetStyle basicGetStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStyle(EEFExtNebulaRichTextWidgetStyle newStyle, NotificationChain msgs) {
		EEFExtNebulaRichTextWidgetStyle oldStyle = style;
		style = newStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					EefExtWidgetsNebulaPackage.EEF_EXT_NEBULA_RICH_TEXT_CONDITIONAL_STYLE__STYLE, oldStyle, newStyle);
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
	public void setStyle(EEFExtNebulaRichTextWidgetStyle newStyle) {
		if (newStyle != style) {
			NotificationChain msgs = null;
			if (style != null)
				msgs = ((InternalEObject) style).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- EefExtWidgetsNebulaPackage.EEF_EXT_NEBULA_RICH_TEXT_CONDITIONAL_STYLE__STYLE,
						null, msgs);
			if (newStyle != null)
				msgs = ((InternalEObject) newStyle).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- EefExtWidgetsNebulaPackage.EEF_EXT_NEBULA_RICH_TEXT_CONDITIONAL_STYLE__STYLE,
						null, msgs);
			msgs = basicSetStyle(newStyle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EefExtWidgetsNebulaPackage.EEF_EXT_NEBULA_RICH_TEXT_CONDITIONAL_STYLE__STYLE, newStyle, newStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EefExtWidgetsNebulaPackage.EEF_EXT_NEBULA_RICH_TEXT_CONDITIONAL_STYLE__STYLE:
			return basicSetStyle(null, msgs);
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
		case EefExtWidgetsNebulaPackage.EEF_EXT_NEBULA_RICH_TEXT_CONDITIONAL_STYLE__STYLE:
			if (resolve)
				return getStyle();
			return basicGetStyle();
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
		case EefExtWidgetsNebulaPackage.EEF_EXT_NEBULA_RICH_TEXT_CONDITIONAL_STYLE__STYLE:
			setStyle((EEFExtNebulaRichTextWidgetStyle) newValue);
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
		case EefExtWidgetsNebulaPackage.EEF_EXT_NEBULA_RICH_TEXT_CONDITIONAL_STYLE__STYLE:
			setStyle((EEFExtNebulaRichTextWidgetStyle) null);
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
		case EefExtWidgetsNebulaPackage.EEF_EXT_NEBULA_RICH_TEXT_CONDITIONAL_STYLE__STYLE:
			return style != null;
		}
		return super.eIsSet(featureID);
	}

} //EEFExtNebulaRichTextConditionalStyleImpl
