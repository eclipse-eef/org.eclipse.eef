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
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EEF Line Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a style that can be applied on line widgets.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eef.EEFLineStyle#getBackgroundColorExpression <em>Background Color Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.EEFLineStyle#getForegroundColorExpression <em>Foreground Color Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.EEFLineStyle#getHeaderBackgroundColorExpression <em>Header Background Color Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.EEFLineStyle#getHeaderForegroundColorExpression <em>Header Foreground Color Expression</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eef.EefPackage#getEEFLineStyle()
 * @model
 * @generated
 */
public interface EEFLineStyle extends EEFStyle {
	/**
	 * Returns the value of the '<em><b>Background Color Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the background color of the widget. It must be define as rgb (rgb(0,0,0)) or hexa (#000000).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Background Color Expression</em>' attribute.
	 * @see #setBackgroundColorExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFLineStyle_BackgroundColorExpression()
	 * @model dataType="org.eclipse.sirius.expression.Expression"
	 * @generated
	 */
	String getBackgroundColorExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFLineStyle#getBackgroundColorExpression <em>Background Color Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background Color Expression</em>' attribute.
	 * @see #getBackgroundColorExpression()
	 * @generated
	 */
	void setBackgroundColorExpression(String value);

	/**
	 * Returns the value of the '<em><b>Foreground Color Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the foreground color of the widget. It must be define as rgb (rgb(0,0,0)) or hexa (#000000).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Foreground Color Expression</em>' attribute.
	 * @see #setForegroundColorExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFLineStyle_ForegroundColorExpression()
	 * @model dataType="org.eclipse.sirius.expression.Expression"
	 * @generated
	 */
	String getForegroundColorExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFLineStyle#getForegroundColorExpression <em>Foreground Color Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foreground Color Expression</em>' attribute.
	 * @see #getForegroundColorExpression()
	 * @generated
	 */
	void setForegroundColorExpression(String value);

	/**
	 * Returns the value of the '<em><b>Header Background Color Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the header background color of the widget. It must be define as rgb (rgb(0,0,0)) or hexa (#000000).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Header Background Color Expression</em>' attribute.
	 * @see #setHeaderBackgroundColorExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFLineStyle_HeaderBackgroundColorExpression()
	 * @model dataType="org.eclipse.sirius.expression.Expression"
	 * @generated
	 */
	String getHeaderBackgroundColorExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFLineStyle#getHeaderBackgroundColorExpression <em>Header Background Color Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header Background Color Expression</em>' attribute.
	 * @see #getHeaderBackgroundColorExpression()
	 * @generated
	 */
	void setHeaderBackgroundColorExpression(String value);

	/**
	 * Returns the value of the '<em><b>Header Foreground Color Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the header foreground color of the widget. It must be define as rgb (rgb(0,0,0)) or hexa (#000000).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Header Foreground Color Expression</em>' attribute.
	 * @see #setHeaderForegroundColorExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFLineStyle_HeaderForegroundColorExpression()
	 * @model dataType="org.eclipse.sirius.expression.Expression"
	 * @generated
	 */
	String getHeaderForegroundColorExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFLineStyle#getHeaderForegroundColorExpression <em>Header Foreground Color Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header Foreground Color Expression</em>' attribute.
	 * @see #getHeaderForegroundColorExpression()
	 * @generated
	 */
	void setHeaderForegroundColorExpression(String value);

} // EEFLineStyle
