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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>EEF Group Style</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.eef.EEFGroupStyle#getBackgroundColorExpression <em>Background Color Expression</em>}</li>
 * <li>{@link org.eclipse.eef.EEFGroupStyle#getForegroundColorExpression <em>Foreground Color Expression</em>}</li>
 * <li>{@link org.eclipse.eef.EEFGroupStyle#getFontNameExpression <em>Font Name Expression</em>}</li>
 * <li>{@link org.eclipse.eef.EEFGroupStyle#getFontSizeExpression <em>Font Size Expression</em>}</li>
 * <li>{@link org.eclipse.eef.EEFGroupStyle#getBarStyle <em>Bar Style</em>}</li>
 * <li>{@link org.eclipse.eef.EEFGroupStyle#getToggleStyle <em>Toggle Style</em>}</li>
 * <li>{@link org.eclipse.eef.EEFGroupStyle#isExpandedByDefault <em>Expanded By Default</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eef.EefPackage#getEEFGroupStyle()
 * @model
 * @generated
 */
public interface EEFGroupStyle extends EObject {
	/**
	 * Returns the value of the '<em><b>Background Color Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc --> Defines the background color of the group. It must be defined as hex
	 * (#000000) or RGB (rgb(0,0,0)). <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Background Color Expression</em>' attribute.
	 * @see #setBackgroundColorExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFGroupStyle_BackgroundColorExpression()
	 * @model
	 * @generated
	 */
	String getBackgroundColorExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFGroupStyle#getBackgroundColorExpression <em>Background Color
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
	 * end-user-doc --> <!-- begin-model-doc --> Defines the foreground color of the group. It must be defined as hex
	 * (#000000) or RGB (rgb(0,0,0)). <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Foreground Color Expression</em>' attribute.
	 * @see #setForegroundColorExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFGroupStyle_ForegroundColorExpression()
	 * @model
	 * @generated
	 */
	String getForegroundColorExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFGroupStyle#getForegroundColorExpression <em>Foreground Color
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
	 * end-user-doc --> <!-- begin-model-doc --> Defines the font's name of the group. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Font Name Expression</em>' attribute.
	 * @see #setFontNameExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFGroupStyle_FontNameExpression()
	 * @model
	 * @generated
	 */
	String getFontNameExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFGroupStyle#getFontNameExpression <em>Font Name Expression</em>}'
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
	 * end-user-doc --> <!-- begin-model-doc --> Defines the font's size of the group. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Font Size Expression</em>' attribute.
	 * @see #setFontSizeExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFGroupStyle_FontSizeExpression()
	 * @model
	 * @generated
	 */
	String getFontSizeExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFGroupStyle#getFontSizeExpression <em>Font Size Expression</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Font Size Expression</em>' attribute.
	 * @see #getFontSizeExpression()
	 * @generated
	 */
	void setFontSizeExpression(String value);

	/**
	 * Returns the value of the '<em><b>Bar Style</b></em>' attribute. The literals are from the enumeration
	 * {@link org.eclipse.eef.EEF_TITLE_BAR_STYLE}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bar Style</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Bar Style</em>' attribute.
	 * @see org.eclipse.eef.EEF_TITLE_BAR_STYLE
	 * @see #setBarStyle(EEF_TITLE_BAR_STYLE)
	 * @see org.eclipse.eef.EefPackage#getEEFGroupStyle_BarStyle()
	 * @model
	 * @generated
	 */
	EEF_TITLE_BAR_STYLE getBarStyle();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFGroupStyle#getBarStyle <em>Bar Style</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Bar Style</em>' attribute.
	 * @see org.eclipse.eef.EEF_TITLE_BAR_STYLE
	 * @see #getBarStyle()
	 * @generated
	 */
	void setBarStyle(EEF_TITLE_BAR_STYLE value);

	/**
	 * Returns the value of the '<em><b>Toggle Style</b></em>' attribute. The literals are from the enumeration
	 * {@link org.eclipse.eef.EEF_TOGGLE_STYLE}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Toggle Style</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Toggle Style</em>' attribute.
	 * @see org.eclipse.eef.EEF_TOGGLE_STYLE
	 * @see #setToggleStyle(EEF_TOGGLE_STYLE)
	 * @see org.eclipse.eef.EefPackage#getEEFGroupStyle_ToggleStyle()
	 * @model
	 * @generated
	 */
	EEF_TOGGLE_STYLE getToggleStyle();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFGroupStyle#getToggleStyle <em>Toggle Style</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Toggle Style</em>' attribute.
	 * @see org.eclipse.eef.EEF_TOGGLE_STYLE
	 * @see #getToggleStyle()
	 * @generated
	 */
	void setToggleStyle(EEF_TOGGLE_STYLE value);

	/**
	 * Returns the value of the '<em><b>Expanded By Default</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expanded By Default</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Expanded By Default</em>' attribute.
	 * @see #setExpandedByDefault(boolean)
	 * @see org.eclipse.eef.EefPackage#getEEFGroupStyle_ExpandedByDefault()
	 * @model
	 * @generated
	 */
	boolean isExpandedByDefault();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFGroupStyle#isExpandedByDefault <em>Expanded By Default</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Expanded By Default</em>' attribute.
	 * @see #isExpandedByDefault()
	 * @generated
	 */
	void setExpandedByDefault(boolean value);

} // EEFGroupStyle
