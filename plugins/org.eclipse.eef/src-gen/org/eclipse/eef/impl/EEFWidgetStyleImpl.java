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

import org.eclipse.eef.EEFWidgetStyle;
import org.eclipse.eef.EefPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>EEF Widget Style</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.eef.impl.EEFWidgetStyleImpl#getLabelBackgroundColorExpression <em>Label Background Color
 * Expression</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFWidgetStyleImpl#getLabelForegroundColorExpression <em>Label Foreground Color
 * Expression</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFWidgetStyleImpl#getLabelFontNameExpression <em>Label Font Name
 * Expression</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFWidgetStyleImpl#getLabelFontSizeExpression <em>Label Font Size
 * Expression</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFWidgetStyleImpl#getLabelFontStyleExpression <em>Label Font Style
 * Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EEFWidgetStyleImpl extends MinimalEObjectImpl.Container implements EEFWidgetStyle {
	/**
	 * The default value of the '{@link #getLabelBackgroundColorExpression() <em>Label Background Color
	 * Expression</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLabelBackgroundColorExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_BACKGROUND_COLOR_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabelBackgroundColorExpression() <em>Label Background Color Expression</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLabelBackgroundColorExpression()
	 * @generated
	 * @ordered
	 */
	protected String labelBackgroundColorExpression = EEFWidgetStyleImpl.LABEL_BACKGROUND_COLOR_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabelForegroundColorExpression() <em>Label Foreground Color
	 * Expression</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLabelForegroundColorExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_FOREGROUND_COLOR_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabelForegroundColorExpression() <em>Label Foreground Color Expression</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLabelForegroundColorExpression()
	 * @generated
	 * @ordered
	 */
	protected String labelForegroundColorExpression = EEFWidgetStyleImpl.LABEL_FOREGROUND_COLOR_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabelFontNameExpression() <em>Label Font Name Expression</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLabelFontNameExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_FONT_NAME_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabelFontNameExpression() <em>Label Font Name Expression</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLabelFontNameExpression()
	 * @generated
	 * @ordered
	 */
	protected String labelFontNameExpression = EEFWidgetStyleImpl.LABEL_FONT_NAME_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabelFontSizeExpression() <em>Label Font Size Expression</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLabelFontSizeExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_FONT_SIZE_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabelFontSizeExpression() <em>Label Font Size Expression</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLabelFontSizeExpression()
	 * @generated
	 * @ordered
	 */
	protected String labelFontSizeExpression = EEFWidgetStyleImpl.LABEL_FONT_SIZE_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabelFontStyleExpression() <em>Label Font Style Expression</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLabelFontStyleExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_FONT_STYLE_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabelFontStyleExpression() <em>Label Font Style Expression</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLabelFontStyleExpression()
	 * @generated
	 * @ordered
	 */
	protected String labelFontStyleExpression = EEFWidgetStyleImpl.LABEL_FONT_STYLE_EXPRESSION_EDEFAULT;

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
	public String getLabelBackgroundColorExpression() {
		return labelBackgroundColorExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setLabelBackgroundColorExpression(String newLabelBackgroundColorExpression) {
		String oldLabelBackgroundColorExpression = labelBackgroundColorExpression;
		labelBackgroundColorExpression = newLabelBackgroundColorExpression;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_WIDGET_STYLE__LABEL_BACKGROUND_COLOR_EXPRESSION,
					oldLabelBackgroundColorExpression, labelBackgroundColorExpression));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getLabelForegroundColorExpression() {
		return labelForegroundColorExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setLabelForegroundColorExpression(String newLabelForegroundColorExpression) {
		String oldLabelForegroundColorExpression = labelForegroundColorExpression;
		labelForegroundColorExpression = newLabelForegroundColorExpression;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_WIDGET_STYLE__LABEL_FOREGROUND_COLOR_EXPRESSION,
					oldLabelForegroundColorExpression, labelForegroundColorExpression));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getLabelFontNameExpression() {
		return labelFontNameExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setLabelFontNameExpression(String newLabelFontNameExpression) {
		String oldLabelFontNameExpression = labelFontNameExpression;
		labelFontNameExpression = newLabelFontNameExpression;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_WIDGET_STYLE__LABEL_FONT_NAME_EXPRESSION, oldLabelFontNameExpression,
					labelFontNameExpression));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getLabelFontSizeExpression() {
		return labelFontSizeExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setLabelFontSizeExpression(String newLabelFontSizeExpression) {
		String oldLabelFontSizeExpression = labelFontSizeExpression;
		labelFontSizeExpression = newLabelFontSizeExpression;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_WIDGET_STYLE__LABEL_FONT_SIZE_EXPRESSION, oldLabelFontSizeExpression,
					labelFontSizeExpression));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getLabelFontStyleExpression() {
		return labelFontStyleExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setLabelFontStyleExpression(String newLabelFontStyleExpression) {
		String oldLabelFontStyleExpression = labelFontStyleExpression;
		labelFontStyleExpression = newLabelFontStyleExpression;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_WIDGET_STYLE__LABEL_FONT_STYLE_EXPRESSION,
					oldLabelFontStyleExpression, labelFontStyleExpression));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EefPackage.EEF_WIDGET_STYLE__LABEL_BACKGROUND_COLOR_EXPRESSION:
			return getLabelBackgroundColorExpression();
		case EefPackage.EEF_WIDGET_STYLE__LABEL_FOREGROUND_COLOR_EXPRESSION:
			return getLabelForegroundColorExpression();
		case EefPackage.EEF_WIDGET_STYLE__LABEL_FONT_NAME_EXPRESSION:
			return getLabelFontNameExpression();
		case EefPackage.EEF_WIDGET_STYLE__LABEL_FONT_SIZE_EXPRESSION:
			return getLabelFontSizeExpression();
		case EefPackage.EEF_WIDGET_STYLE__LABEL_FONT_STYLE_EXPRESSION:
			return getLabelFontStyleExpression();
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
		case EefPackage.EEF_WIDGET_STYLE__LABEL_BACKGROUND_COLOR_EXPRESSION:
			setLabelBackgroundColorExpression((String) newValue);
			return;
		case EefPackage.EEF_WIDGET_STYLE__LABEL_FOREGROUND_COLOR_EXPRESSION:
			setLabelForegroundColorExpression((String) newValue);
			return;
		case EefPackage.EEF_WIDGET_STYLE__LABEL_FONT_NAME_EXPRESSION:
			setLabelFontNameExpression((String) newValue);
			return;
		case EefPackage.EEF_WIDGET_STYLE__LABEL_FONT_SIZE_EXPRESSION:
			setLabelFontSizeExpression((String) newValue);
			return;
		case EefPackage.EEF_WIDGET_STYLE__LABEL_FONT_STYLE_EXPRESSION:
			setLabelFontStyleExpression((String) newValue);
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
		case EefPackage.EEF_WIDGET_STYLE__LABEL_BACKGROUND_COLOR_EXPRESSION:
			setLabelBackgroundColorExpression(EEFWidgetStyleImpl.LABEL_BACKGROUND_COLOR_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_WIDGET_STYLE__LABEL_FOREGROUND_COLOR_EXPRESSION:
			setLabelForegroundColorExpression(EEFWidgetStyleImpl.LABEL_FOREGROUND_COLOR_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_WIDGET_STYLE__LABEL_FONT_NAME_EXPRESSION:
			setLabelFontNameExpression(EEFWidgetStyleImpl.LABEL_FONT_NAME_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_WIDGET_STYLE__LABEL_FONT_SIZE_EXPRESSION:
			setLabelFontSizeExpression(EEFWidgetStyleImpl.LABEL_FONT_SIZE_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_WIDGET_STYLE__LABEL_FONT_STYLE_EXPRESSION:
			setLabelFontStyleExpression(EEFWidgetStyleImpl.LABEL_FONT_STYLE_EXPRESSION_EDEFAULT);
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
		case EefPackage.EEF_WIDGET_STYLE__LABEL_BACKGROUND_COLOR_EXPRESSION:
			return EEFWidgetStyleImpl.LABEL_BACKGROUND_COLOR_EXPRESSION_EDEFAULT == null ? labelBackgroundColorExpression != null
					: !EEFWidgetStyleImpl.LABEL_BACKGROUND_COLOR_EXPRESSION_EDEFAULT.equals(labelBackgroundColorExpression);
		case EefPackage.EEF_WIDGET_STYLE__LABEL_FOREGROUND_COLOR_EXPRESSION:
			return EEFWidgetStyleImpl.LABEL_FOREGROUND_COLOR_EXPRESSION_EDEFAULT == null ? labelForegroundColorExpression != null
					: !EEFWidgetStyleImpl.LABEL_FOREGROUND_COLOR_EXPRESSION_EDEFAULT.equals(labelForegroundColorExpression);
		case EefPackage.EEF_WIDGET_STYLE__LABEL_FONT_NAME_EXPRESSION:
			return EEFWidgetStyleImpl.LABEL_FONT_NAME_EXPRESSION_EDEFAULT == null ? labelFontNameExpression != null
					: !EEFWidgetStyleImpl.LABEL_FONT_NAME_EXPRESSION_EDEFAULT.equals(labelFontNameExpression);
		case EefPackage.EEF_WIDGET_STYLE__LABEL_FONT_SIZE_EXPRESSION:
			return EEFWidgetStyleImpl.LABEL_FONT_SIZE_EXPRESSION_EDEFAULT == null ? labelFontSizeExpression != null
					: !EEFWidgetStyleImpl.LABEL_FONT_SIZE_EXPRESSION_EDEFAULT.equals(labelFontSizeExpression);
		case EefPackage.EEF_WIDGET_STYLE__LABEL_FONT_STYLE_EXPRESSION:
			return EEFWidgetStyleImpl.LABEL_FONT_STYLE_EXPRESSION_EDEFAULT == null ? labelFontStyleExpression != null
					: !EEFWidgetStyleImpl.LABEL_FONT_STYLE_EXPRESSION_EDEFAULT.equals(labelFontStyleExpression);
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
		result.append(" (labelBackgroundColorExpression: "); //$NON-NLS-1$
		result.append(labelBackgroundColorExpression);
		result.append(", labelForegroundColorExpression: "); //$NON-NLS-1$
		result.append(labelForegroundColorExpression);
		result.append(", labelFontNameExpression: "); //$NON-NLS-1$
		result.append(labelFontNameExpression);
		result.append(", labelFontSizeExpression: "); //$NON-NLS-1$
		result.append(labelFontSizeExpression);
		result.append(", labelFontStyleExpression: "); //$NON-NLS-1$
		result.append(labelFontStyleExpression);
		result.append(')');
		return result.toString();
	}

} // EEFWidgetStyleImpl
