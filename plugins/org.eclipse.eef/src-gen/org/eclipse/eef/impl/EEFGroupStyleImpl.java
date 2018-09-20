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

import org.eclipse.eef.EEFGroupStyle;
import org.eclipse.eef.EEF_TITLE_BAR_STYLE;
import org.eclipse.eef.EEF_TOGGLE_STYLE;
import org.eclipse.eef.EefPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>EEF Group Style</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.eef.impl.EEFGroupStyleImpl#getBackgroundColorExpression <em>Background Color
 * Expression</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFGroupStyleImpl#getForegroundColorExpression <em>Foreground Color
 * Expression</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFGroupStyleImpl#getFontNameExpression <em>Font Name Expression</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFGroupStyleImpl#getFontSizeExpression <em>Font Size Expression</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFGroupStyleImpl#getBarStyle <em>Bar Style</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFGroupStyleImpl#getToggleStyle <em>Toggle Style</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFGroupStyleImpl#isExpandedByDefault <em>Expanded By Default</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EEFGroupStyleImpl extends MinimalEObjectImpl.Container implements EEFGroupStyle {
	/**
	 * The default value of the '{@link #getBackgroundColorExpression() <em>Background Color Expression</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getBackgroundColorExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String BACKGROUND_COLOR_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBackgroundColorExpression() <em>Background Color Expression</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getBackgroundColorExpression()
	 * @generated
	 * @ordered
	 */
	protected String backgroundColorExpression = EEFGroupStyleImpl.BACKGROUND_COLOR_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getForegroundColorExpression() <em>Foreground Color Expression</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getForegroundColorExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String FOREGROUND_COLOR_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getForegroundColorExpression() <em>Foreground Color Expression</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getForegroundColorExpression()
	 * @generated
	 * @ordered
	 */
	protected String foregroundColorExpression = EEFGroupStyleImpl.FOREGROUND_COLOR_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFontNameExpression() <em>Font Name Expression</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFontNameExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String FONT_NAME_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFontNameExpression() <em>Font Name Expression</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFontNameExpression()
	 * @generated
	 * @ordered
	 */
	protected String fontNameExpression = EEFGroupStyleImpl.FONT_NAME_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFontSizeExpression() <em>Font Size Expression</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFontSizeExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String FONT_SIZE_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFontSizeExpression() <em>Font Size Expression</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFontSizeExpression()
	 * @generated
	 * @ordered
	 */
	protected String fontSizeExpression = EEFGroupStyleImpl.FONT_SIZE_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getBarStyle() <em>Bar Style</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getBarStyle()
	 * @generated
	 * @ordered
	 */
	protected static final EEF_TITLE_BAR_STYLE BAR_STYLE_EDEFAULT = EEF_TITLE_BAR_STYLE.TITLE_BAR;

	/**
	 * The cached value of the '{@link #getBarStyle() <em>Bar Style</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getBarStyle()
	 * @generated
	 * @ordered
	 */
	protected EEF_TITLE_BAR_STYLE barStyle = EEFGroupStyleImpl.BAR_STYLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getToggleStyle() <em>Toggle Style</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getToggleStyle()
	 * @generated
	 * @ordered
	 */
	protected static final EEF_TOGGLE_STYLE TOGGLE_STYLE_EDEFAULT = EEF_TOGGLE_STYLE.TWISTIE;

	/**
	 * The cached value of the '{@link #getToggleStyle() <em>Toggle Style</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getToggleStyle()
	 * @generated
	 * @ordered
	 */
	protected EEF_TOGGLE_STYLE toggleStyle = EEFGroupStyleImpl.TOGGLE_STYLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isExpandedByDefault() <em>Expanded By Default</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isExpandedByDefault()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXPANDED_BY_DEFAULT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExpandedByDefault() <em>Expanded By Default</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isExpandedByDefault()
	 * @generated
	 * @ordered
	 */
	protected boolean expandedByDefault = EEFGroupStyleImpl.EXPANDED_BY_DEFAULT_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EEFGroupStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefPackage.Literals.EEF_GROUP_STYLE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getBackgroundColorExpression() {
		return backgroundColorExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setBackgroundColorExpression(String newBackgroundColorExpression) {
		String oldBackgroundColorExpression = backgroundColorExpression;
		backgroundColorExpression = newBackgroundColorExpression;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_GROUP_STYLE__BACKGROUND_COLOR_EXPRESSION,
					oldBackgroundColorExpression, backgroundColorExpression));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getForegroundColorExpression() {
		return foregroundColorExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setForegroundColorExpression(String newForegroundColorExpression) {
		String oldForegroundColorExpression = foregroundColorExpression;
		foregroundColorExpression = newForegroundColorExpression;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_GROUP_STYLE__FOREGROUND_COLOR_EXPRESSION,
					oldForegroundColorExpression, foregroundColorExpression));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getFontNameExpression() {
		return fontNameExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setFontNameExpression(String newFontNameExpression) {
		String oldFontNameExpression = fontNameExpression;
		fontNameExpression = newFontNameExpression;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_GROUP_STYLE__FONT_NAME_EXPRESSION, oldFontNameExpression,
					fontNameExpression));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getFontSizeExpression() {
		return fontSizeExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setFontSizeExpression(String newFontSizeExpression) {
		String oldFontSizeExpression = fontSizeExpression;
		fontSizeExpression = newFontSizeExpression;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_GROUP_STYLE__FONT_SIZE_EXPRESSION, oldFontSizeExpression,
					fontSizeExpression));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EEF_TITLE_BAR_STYLE getBarStyle() {
		return barStyle;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setBarStyle(EEF_TITLE_BAR_STYLE newBarStyle) {
		EEF_TITLE_BAR_STYLE oldBarStyle = barStyle;
		barStyle = newBarStyle == null ? EEFGroupStyleImpl.BAR_STYLE_EDEFAULT : newBarStyle;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_GROUP_STYLE__BAR_STYLE, oldBarStyle, barStyle));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EEF_TOGGLE_STYLE getToggleStyle() {
		return toggleStyle;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setToggleStyle(EEF_TOGGLE_STYLE newToggleStyle) {
		EEF_TOGGLE_STYLE oldToggleStyle = toggleStyle;
		toggleStyle = newToggleStyle == null ? EEFGroupStyleImpl.TOGGLE_STYLE_EDEFAULT : newToggleStyle;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_GROUP_STYLE__TOGGLE_STYLE, oldToggleStyle, toggleStyle));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean isExpandedByDefault() {
		return expandedByDefault;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setExpandedByDefault(boolean newExpandedByDefault) {
		boolean oldExpandedByDefault = expandedByDefault;
		expandedByDefault = newExpandedByDefault;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_GROUP_STYLE__EXPANDED_BY_DEFAULT, oldExpandedByDefault,
					expandedByDefault));
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
		case EefPackage.EEF_GROUP_STYLE__BACKGROUND_COLOR_EXPRESSION:
			return getBackgroundColorExpression();
		case EefPackage.EEF_GROUP_STYLE__FOREGROUND_COLOR_EXPRESSION:
			return getForegroundColorExpression();
		case EefPackage.EEF_GROUP_STYLE__FONT_NAME_EXPRESSION:
			return getFontNameExpression();
		case EefPackage.EEF_GROUP_STYLE__FONT_SIZE_EXPRESSION:
			return getFontSizeExpression();
		case EefPackage.EEF_GROUP_STYLE__BAR_STYLE:
			return getBarStyle();
		case EefPackage.EEF_GROUP_STYLE__TOGGLE_STYLE:
			return getToggleStyle();
		case EefPackage.EEF_GROUP_STYLE__EXPANDED_BY_DEFAULT:
			return isExpandedByDefault();
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
		case EefPackage.EEF_GROUP_STYLE__BACKGROUND_COLOR_EXPRESSION:
			setBackgroundColorExpression((String) newValue);
			return;
		case EefPackage.EEF_GROUP_STYLE__FOREGROUND_COLOR_EXPRESSION:
			setForegroundColorExpression((String) newValue);
			return;
		case EefPackage.EEF_GROUP_STYLE__FONT_NAME_EXPRESSION:
			setFontNameExpression((String) newValue);
			return;
		case EefPackage.EEF_GROUP_STYLE__FONT_SIZE_EXPRESSION:
			setFontSizeExpression((String) newValue);
			return;
		case EefPackage.EEF_GROUP_STYLE__BAR_STYLE:
			setBarStyle((EEF_TITLE_BAR_STYLE) newValue);
			return;
		case EefPackage.EEF_GROUP_STYLE__TOGGLE_STYLE:
			setToggleStyle((EEF_TOGGLE_STYLE) newValue);
			return;
		case EefPackage.EEF_GROUP_STYLE__EXPANDED_BY_DEFAULT:
			setExpandedByDefault((Boolean) newValue);
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
		case EefPackage.EEF_GROUP_STYLE__BACKGROUND_COLOR_EXPRESSION:
			setBackgroundColorExpression(EEFGroupStyleImpl.BACKGROUND_COLOR_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_GROUP_STYLE__FOREGROUND_COLOR_EXPRESSION:
			setForegroundColorExpression(EEFGroupStyleImpl.FOREGROUND_COLOR_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_GROUP_STYLE__FONT_NAME_EXPRESSION:
			setFontNameExpression(EEFGroupStyleImpl.FONT_NAME_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_GROUP_STYLE__FONT_SIZE_EXPRESSION:
			setFontSizeExpression(EEFGroupStyleImpl.FONT_SIZE_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_GROUP_STYLE__BAR_STYLE:
			setBarStyle(EEFGroupStyleImpl.BAR_STYLE_EDEFAULT);
			return;
		case EefPackage.EEF_GROUP_STYLE__TOGGLE_STYLE:
			setToggleStyle(EEFGroupStyleImpl.TOGGLE_STYLE_EDEFAULT);
			return;
		case EefPackage.EEF_GROUP_STYLE__EXPANDED_BY_DEFAULT:
			setExpandedByDefault(EEFGroupStyleImpl.EXPANDED_BY_DEFAULT_EDEFAULT);
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
		case EefPackage.EEF_GROUP_STYLE__BACKGROUND_COLOR_EXPRESSION:
			return EEFGroupStyleImpl.BACKGROUND_COLOR_EXPRESSION_EDEFAULT == null ? backgroundColorExpression != null
					: !EEFGroupStyleImpl.BACKGROUND_COLOR_EXPRESSION_EDEFAULT.equals(backgroundColorExpression);
		case EefPackage.EEF_GROUP_STYLE__FOREGROUND_COLOR_EXPRESSION:
			return EEFGroupStyleImpl.FOREGROUND_COLOR_EXPRESSION_EDEFAULT == null ? foregroundColorExpression != null
					: !EEFGroupStyleImpl.FOREGROUND_COLOR_EXPRESSION_EDEFAULT.equals(foregroundColorExpression);
		case EefPackage.EEF_GROUP_STYLE__FONT_NAME_EXPRESSION:
			return EEFGroupStyleImpl.FONT_NAME_EXPRESSION_EDEFAULT == null ? fontNameExpression != null
					: !EEFGroupStyleImpl.FONT_NAME_EXPRESSION_EDEFAULT.equals(fontNameExpression);
		case EefPackage.EEF_GROUP_STYLE__FONT_SIZE_EXPRESSION:
			return EEFGroupStyleImpl.FONT_SIZE_EXPRESSION_EDEFAULT == null ? fontSizeExpression != null
					: !EEFGroupStyleImpl.FONT_SIZE_EXPRESSION_EDEFAULT.equals(fontSizeExpression);
		case EefPackage.EEF_GROUP_STYLE__BAR_STYLE:
			return barStyle != EEFGroupStyleImpl.BAR_STYLE_EDEFAULT;
		case EefPackage.EEF_GROUP_STYLE__TOGGLE_STYLE:
			return toggleStyle != EEFGroupStyleImpl.TOGGLE_STYLE_EDEFAULT;
		case EefPackage.EEF_GROUP_STYLE__EXPANDED_BY_DEFAULT:
			return expandedByDefault != EEFGroupStyleImpl.EXPANDED_BY_DEFAULT_EDEFAULT;
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
		result.append(" (backgroundColorExpression: "); //$NON-NLS-1$
		result.append(backgroundColorExpression);
		result.append(", foregroundColorExpression: "); //$NON-NLS-1$
		result.append(foregroundColorExpression);
		result.append(", fontNameExpression: "); //$NON-NLS-1$
		result.append(fontNameExpression);
		result.append(", fontSizeExpression: "); //$NON-NLS-1$
		result.append(fontSizeExpression);
		result.append(", barStyle: "); //$NON-NLS-1$
		result.append(barStyle);
		result.append(", toggleStyle: "); //$NON-NLS-1$
		result.append(toggleStyle);
		result.append(", expandedByDefault: "); //$NON-NLS-1$
		result.append(expandedByDefault);
		result.append(')');
		return result.toString();
	}

} // EEFGroupStyleImpl
