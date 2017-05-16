/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>EEF Label Style</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc --> Represents a style that can be applied on label widgets. <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.eef.EEFLabelStyle#getBackgroundColorExpression <em>Background Color Expression</em>}</li>
 * <li>{@link org.eclipse.eef.EEFLabelStyle#getForegroundColorExpression <em>Foreground Color Expression</em>}</li>
 * <li>{@link org.eclipse.eef.EEFLabelStyle#getFontNameExpression <em>Font Name Expression</em>}</li>
 * <li>{@link org.eclipse.eef.EEFLabelStyle#getFontSizeExpression <em>Font Size Expression</em>}</li>
 * <li>{@link org.eclipse.eef.EEFLabelStyle#getFontStyleExpression <em>Font Style Expression</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eef.EefPackage#getEEFLabelStyle()
 * @model
 * @generated
 */
public interface EEFLabelStyle extends EEFWidgetStyle {
	/**
	 * Returns the value of the '<em><b>Background Color Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc --> Defines the background color of the widget. It must be defined as hex
	 * (#000000) or RGB (rgb(0,0,0)). <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Background Color Expression</em>' attribute.
	 * @see #setBackgroundColorExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFLabelStyle_BackgroundColorExpression()
	 * @model
	 * @generated
	 */
	String getBackgroundColorExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFLabelStyle#getBackgroundColorExpression <em>Background Color
	 * Expression</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Background Color Expression</em>' attribute.
	 * @see #getBackgroundColorExpression()
	 * @generated
	 */
	void setBackgroundColorExpression(String value);

	/**
	 * Returns the value of the '<em><b>Foreground Color Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc --> Defines the foreground color of the widget. It must be defined as hex
	 * (#000000) or RGB (rgb(0,0,0)). <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Foreground Color Expression</em>' attribute.
	 * @see #setForegroundColorExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFLabelStyle_ForegroundColorExpression()
	 * @model
	 * @generated
	 */
	String getForegroundColorExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFLabelStyle#getForegroundColorExpression <em>Foreground Color
	 * Expression</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Foreground Color Expression</em>' attribute.
	 * @see #getForegroundColorExpression()
	 * @generated
	 */
	void setForegroundColorExpression(String value);

	/**
	 * Returns the value of the '<em><b>Font Name Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc --> Defines the font's name of the widget. <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Font Name Expression</em>' attribute.
	 * @see #setFontNameExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFLabelStyle_FontNameExpression()
	 * @model
	 * @generated
	 */
	String getFontNameExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFLabelStyle#getFontNameExpression <em>Font Name Expression</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Font Name Expression</em>' attribute.
	 * @see #getFontNameExpression()
	 * @generated
	 */
	void setFontNameExpression(String value);

	/**
	 * Returns the value of the '<em><b>Font Size Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc --> Defines the font's size of the widget. <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Font Size Expression</em>' attribute.
	 * @see #setFontSizeExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFLabelStyle_FontSizeExpression()
	 * @model
	 * @generated
	 */
	String getFontSizeExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFLabelStyle#getFontSizeExpression <em>Font Size Expression</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Font Size Expression</em>' attribute.
	 * @see #getFontSizeExpression()
	 * @generated
	 */
	void setFontSizeExpression(String value);

	/**
	 * Returns the value of the '<em><b>Font Style Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc --> Defines the font's style of the widget. <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Font Style Expression</em>' attribute.
	 * @see #setFontStyleExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFLabelStyle_FontStyleExpression()
	 * @model
	 * @generated
	 */
	String getFontStyleExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFLabelStyle#getFontStyleExpression <em>Font Style
	 * Expression</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Font Style Expression</em>' attribute.
	 * @see #getFontStyleExpression()
	 * @generated
	 */
	void setFontStyleExpression(String value);

} // EEFLabelStyle
