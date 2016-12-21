/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EEF Image Viewer Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a image viewer in the user interface.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eef.EEFImageViewerDescription#getPathExpression <em>Path Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.EEFImageViewerDescription#getEditExpression <em>Edit Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.EEFImageViewerDescription#isWithPicker <em>With Picker</em>}</li>
 *   <li>{@link org.eclipse.eef.EEFImageViewerDescription#getStyle <em>Style</em>}</li>
 *   <li>{@link org.eclipse.eef.EEFImageViewerDescription#getConditionalStyles <em>Conditional Styles</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eef.EefPackage#getEEFImageViewerDescription()
 * @model
 * @generated
 */
public interface EEFImageViewerDescription extends EEFWidgetDescription {
	/**
	 * Returns the value of the '<em><b>Path Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the path of the image.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path Expression</em>' attribute.
	 * @see #setPathExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFImageViewerDescription_PathExpression()
	 * @model
	 * @generated
	 */
	String getPathExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFImageViewerDescription#getPathExpression <em>Path Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Expression</em>' attribute.
	 * @see #getPathExpression()
	 * @generated
	 */
	void setPathExpression(String value);

	/**
	 * Returns the value of the '<em><b>Edit Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the behavior executed when the end-user updates the value of the image viewer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Edit Expression</em>' attribute.
	 * @see #setEditExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFImageViewerDescription_EditExpression()
	 * @model
	 * @generated
	 */
	String getEditExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFImageViewerDescription#getEditExpression <em>Edit Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edit Expression</em>' attribute.
	 * @see #getEditExpression()
	 * @generated
	 */
	void setEditExpression(String value);

	/**
	 * Returns the value of the '<em><b>With Picker</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If set to true, add a picker to the image viewer widget. Default value is false.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>With Picker</em>' attribute.
	 * @see #setWithPicker(boolean)
	 * @see org.eclipse.eef.EefPackage#getEEFImageViewerDescription_WithPicker()
	 * @model default="false"
	 * @generated
	 */
	boolean isWithPicker();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFImageViewerDescription#isWithPicker <em>With Picker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>With Picker</em>' attribute.
	 * @see #isWithPicker()
	 * @generated
	 */
	void setWithPicker(boolean value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the text style
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Style</em>' containment reference.
	 * @see #setStyle(EEFImageViewerStyle)
	 * @see org.eclipse.eef.EefPackage#getEEFImageViewerDescription_Style()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EEFImageViewerStyle getStyle();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFImageViewerDescription#getStyle <em>Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' containment reference.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(EEFImageViewerStyle value);

	/**
	 * Returns the value of the '<em><b>Conditional Styles</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.eef.EEFImageViewerConditionalStyle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the text style associated to a precondition
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conditional Styles</em>' containment reference list.
	 * @see org.eclipse.eef.EefPackage#getEEFImageViewerDescription_ConditionalStyles()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<EEFImageViewerConditionalStyle> getConditionalStyles();

} // EEFImageViewerDescription
