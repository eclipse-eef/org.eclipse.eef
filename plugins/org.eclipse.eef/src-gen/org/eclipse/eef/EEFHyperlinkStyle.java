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
package org.eclipse.eef;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>EEF Hyperlink Style</b></em>'. <!-- end-user-doc
 * -->
 *
 * <!-- begin-model-doc --> Represents a style that can be applied on hyperlink widgets. <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.eef.EEFHyperlinkStyle#getBackgroundColorExpression <em>Background Color Expression</em>}</li>
 * <li>{@link org.eclipse.eef.EEFHyperlinkStyle#getFontNameExpression <em>Font Name Expression</em>}</li>
 * <li>{@link org.eclipse.eef.EEFHyperlinkStyle#getFontSizeExpression <em>Font Size Expression</em>}</li>
 * <li>{@link org.eclipse.eef.EEFHyperlinkStyle#getFontStyleExpression <em>Font Style Expression</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eef.EefPackage#getEEFHyperlinkStyle()
 * @model
 * @generated
 */
public interface EEFHyperlinkStyle extends EEFWidgetStyle {
	/**
	 * Returns the value of the '<em><b>Background Color Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc --> Defines the background color of the widget. It must be defined as hex
	 * (#000000) or RGB (rgb(0,0,0)). <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Background Color Expression</em>' attribute.
	 * @see #setBackgroundColorExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFHyperlinkStyle_BackgroundColorExpression()
	 * @model
	 * @generated
	 */
	String getBackgroundColorExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFHyperlinkStyle#getBackgroundColorExpression <em>Background Color
	 * Expression</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Background Color Expression</em>' attribute.
	 * @see #getBackgroundColorExpression()
	 * @generated
	 */
	void setBackgroundColorExpression(String value);

	/**
	 * Returns the value of the '<em><b>Font Name Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc --> Defines the font's name of the widget. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Font Name Expression</em>' attribute.
	 * @see #setFontNameExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFHyperlinkStyle_FontNameExpression()
	 * @model
	 * @generated
	 */
	String getFontNameExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFHyperlinkStyle#getFontNameExpression <em>Font Name
	 * Expression</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * @see org.eclipse.eef.EefPackage#getEEFHyperlinkStyle_FontSizeExpression()
	 * @model
	 * @generated
	 */
	String getFontSizeExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFHyperlinkStyle#getFontSizeExpression <em>Font Size
	 * Expression</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * @see org.eclipse.eef.EefPackage#getEEFHyperlinkStyle_FontStyleExpression()
	 * @model
	 * @generated
	 */
	String getFontStyleExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFHyperlinkStyle#getFontStyleExpression <em>Font Style
	 * Expression</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Font Style Expression</em>' attribute.
	 * @see #getFontStyleExpression()
	 * @generated
	 */
	void setFontStyleExpression(String value);

} // EEFHyperlinkStyle
