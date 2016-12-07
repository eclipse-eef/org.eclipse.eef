/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef.impl;

import org.eclipse.eef.EEFHyperlinkStyle;
import org.eclipse.eef.EefPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>EEF Hyperlink Style</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.eef.impl.EEFHyperlinkStyleImpl#getBackgroundColorExpression <em>Background Color
 * Expression</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFHyperlinkStyleImpl#getFontNameExpression <em>Font Name Expression</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFHyperlinkStyleImpl#getFontSizeExpression <em>Font Size Expression</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFHyperlinkStyleImpl#getFontStyleExpression <em>Font Style Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EEFHyperlinkStyleImpl extends EEFWidgetStyleImpl implements EEFHyperlinkStyle {
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
	protected String backgroundColorExpression = BACKGROUND_COLOR_EXPRESSION_EDEFAULT;

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
	protected String fontNameExpression = FONT_NAME_EXPRESSION_EDEFAULT;

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
	protected String fontSizeExpression = FONT_SIZE_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFontStyleExpression() <em>Font Style Expression</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getFontStyleExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String FONT_STYLE_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFontStyleExpression() <em>Font Style Expression</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getFontStyleExpression()
	 * @generated
	 * @ordered
	 */
	protected String fontStyleExpression = FONT_STYLE_EXPRESSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EEFHyperlinkStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefPackage.Literals.EEF_HYPERLINK_STYLE;
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_HYPERLINK_STYLE__BACKGROUND_COLOR_EXPRESSION,
					oldBackgroundColorExpression, backgroundColorExpression));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_HYPERLINK_STYLE__FONT_NAME_EXPRESSION, oldFontNameExpression,
					fontNameExpression));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_HYPERLINK_STYLE__FONT_SIZE_EXPRESSION, oldFontSizeExpression,
					fontSizeExpression));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getFontStyleExpression() {
		return fontStyleExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setFontStyleExpression(String newFontStyleExpression) {
		String oldFontStyleExpression = fontStyleExpression;
		fontStyleExpression = newFontStyleExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_HYPERLINK_STYLE__FONT_STYLE_EXPRESSION, oldFontStyleExpression,
					fontStyleExpression));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EefPackage.EEF_HYPERLINK_STYLE__BACKGROUND_COLOR_EXPRESSION:
			return getBackgroundColorExpression();
		case EefPackage.EEF_HYPERLINK_STYLE__FONT_NAME_EXPRESSION:
			return getFontNameExpression();
		case EefPackage.EEF_HYPERLINK_STYLE__FONT_SIZE_EXPRESSION:
			return getFontSizeExpression();
		case EefPackage.EEF_HYPERLINK_STYLE__FONT_STYLE_EXPRESSION:
			return getFontStyleExpression();
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
		case EefPackage.EEF_HYPERLINK_STYLE__BACKGROUND_COLOR_EXPRESSION:
			setBackgroundColorExpression((String) newValue);
			return;
		case EefPackage.EEF_HYPERLINK_STYLE__FONT_NAME_EXPRESSION:
			setFontNameExpression((String) newValue);
			return;
		case EefPackage.EEF_HYPERLINK_STYLE__FONT_SIZE_EXPRESSION:
			setFontSizeExpression((String) newValue);
			return;
		case EefPackage.EEF_HYPERLINK_STYLE__FONT_STYLE_EXPRESSION:
			setFontStyleExpression((String) newValue);
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
		case EefPackage.EEF_HYPERLINK_STYLE__BACKGROUND_COLOR_EXPRESSION:
			setBackgroundColorExpression(BACKGROUND_COLOR_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_HYPERLINK_STYLE__FONT_NAME_EXPRESSION:
			setFontNameExpression(FONT_NAME_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_HYPERLINK_STYLE__FONT_SIZE_EXPRESSION:
			setFontSizeExpression(FONT_SIZE_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_HYPERLINK_STYLE__FONT_STYLE_EXPRESSION:
			setFontStyleExpression(FONT_STYLE_EXPRESSION_EDEFAULT);
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
		case EefPackage.EEF_HYPERLINK_STYLE__BACKGROUND_COLOR_EXPRESSION:
			return BACKGROUND_COLOR_EXPRESSION_EDEFAULT == null ? backgroundColorExpression != null
					: !BACKGROUND_COLOR_EXPRESSION_EDEFAULT.equals(backgroundColorExpression);
		case EefPackage.EEF_HYPERLINK_STYLE__FONT_NAME_EXPRESSION:
			return FONT_NAME_EXPRESSION_EDEFAULT == null ? fontNameExpression != null : !FONT_NAME_EXPRESSION_EDEFAULT.equals(fontNameExpression);
		case EefPackage.EEF_HYPERLINK_STYLE__FONT_SIZE_EXPRESSION:
			return FONT_SIZE_EXPRESSION_EDEFAULT == null ? fontSizeExpression != null : !FONT_SIZE_EXPRESSION_EDEFAULT.equals(fontSizeExpression);
		case EefPackage.EEF_HYPERLINK_STYLE__FONT_STYLE_EXPRESSION:
			return FONT_STYLE_EXPRESSION_EDEFAULT == null ? fontStyleExpression != null : !FONT_STYLE_EXPRESSION_EDEFAULT.equals(fontStyleExpression);
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
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (backgroundColorExpression: "); //$NON-NLS-1$
		result.append(backgroundColorExpression);
		result.append(", fontNameExpression: "); //$NON-NLS-1$
		result.append(fontNameExpression);
		result.append(", fontSizeExpression: "); //$NON-NLS-1$
		result.append(fontSizeExpression);
		result.append(", fontStyleExpression: "); //$NON-NLS-1$
		result.append(fontStyleExpression);
		result.append(')');
		return result.toString();
	}

} // EEFHyperlinkStyleImpl
