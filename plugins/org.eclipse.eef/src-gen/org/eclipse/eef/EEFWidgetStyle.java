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
 * <!-- begin-user-doc --> A representation of the model object '<em><b>EEF Widget Style</b></em>'. <!-- end-user-doc
 * -->
 *
 * <!-- begin-model-doc --> Represents a style that can be applied on widgets. <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.eef.EEFWidgetStyle#getLabelBackgroundColorExpression <em>Label Background Color
 * Expression</em>}</li>
 * <li>{@link org.eclipse.eef.EEFWidgetStyle#getLabelForegroundColorExpression <em>Label Foreground Color
 * Expression</em>}</li>
 * <li>{@link org.eclipse.eef.EEFWidgetStyle#getLabelFontNameExpression <em>Label Font Name Expression</em>}</li>
 * <li>{@link org.eclipse.eef.EEFWidgetStyle#getLabelFontSizeExpression <em>Label Font Size Expression</em>}</li>
 * <li>{@link org.eclipse.eef.EEFWidgetStyle#getLabelFontStyleExpression <em>Label Font Style Expression</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eef.EefPackage#getEEFWidgetStyle()
 * @model abstract="true"
 * @generated
 */
public interface EEFWidgetStyle extends EObject {
	/**
	 * Returns the value of the '<em><b>Label Background Color Expression</b></em>' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc --> <!-- begin-model-doc --> Defines the background color of the widget. It must be defined as
	 * hex (#000000) or RGB (rgb(0,0,0)). <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Label Background Color Expression</em>' attribute.
	 * @see #setLabelBackgroundColorExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFWidgetStyle_LabelBackgroundColorExpression()
	 * @model
	 * @generated
	 */
	String getLabelBackgroundColorExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFWidgetStyle#getLabelBackgroundColorExpression <em>Label
	 * Background Color Expression</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Label Background Color Expression</em>' attribute.
	 * @see #getLabelBackgroundColorExpression()
	 * @generated
	 */
	void setLabelBackgroundColorExpression(String value);

	/**
	 * Returns the value of the '<em><b>Label Foreground Color Expression</b></em>' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc --> <!-- begin-model-doc --> Defines the foreground color of the widget. It must be defined as
	 * hex (#000000) or RGB (rgb(0,0,0)). <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Label Foreground Color Expression</em>' attribute.
	 * @see #setLabelForegroundColorExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFWidgetStyle_LabelForegroundColorExpression()
	 * @model
	 * @generated
	 */
	String getLabelForegroundColorExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFWidgetStyle#getLabelForegroundColorExpression <em>Label
	 * Foreground Color Expression</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Label Foreground Color Expression</em>' attribute.
	 * @see #getLabelForegroundColorExpression()
	 * @generated
	 */
	void setLabelForegroundColorExpression(String value);

	/**
	 * Returns the value of the '<em><b>Label Font Name Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc --> Defines the font's name of the widget. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Label Font Name Expression</em>' attribute.
	 * @see #setLabelFontNameExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFWidgetStyle_LabelFontNameExpression()
	 * @model
	 * @generated
	 */
	String getLabelFontNameExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFWidgetStyle#getLabelFontNameExpression <em>Label Font Name
	 * Expression</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Label Font Name Expression</em>' attribute.
	 * @see #getLabelFontNameExpression()
	 * @generated
	 */
	void setLabelFontNameExpression(String value);

	/**
	 * Returns the value of the '<em><b>Label Font Size Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc --> Defines the font's size of the widget. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Label Font Size Expression</em>' attribute.
	 * @see #setLabelFontSizeExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFWidgetStyle_LabelFontSizeExpression()
	 * @model
	 * @generated
	 */
	String getLabelFontSizeExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFWidgetStyle#getLabelFontSizeExpression <em>Label Font Size
	 * Expression</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Label Font Size Expression</em>' attribute.
	 * @see #getLabelFontSizeExpression()
	 * @generated
	 */
	void setLabelFontSizeExpression(String value);

	/**
	 * Returns the value of the '<em><b>Label Font Style Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc --> Defines the font's style of the widget. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Label Font Style Expression</em>' attribute.
	 * @see #setLabelFontStyleExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFWidgetStyle_LabelFontStyleExpression()
	 * @model
	 * @generated
	 */
	String getLabelFontStyleExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFWidgetStyle#getLabelFontStyleExpression <em>Label Font Style
	 * Expression</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Label Font Style Expression</em>' attribute.
	 * @see #getLabelFontStyleExpression()
	 * @generated
	 */
	void setLabelFontStyleExpression(String value);

} // EEFWidgetStyle
