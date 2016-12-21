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
 * A representation of the model object '<em><b>EEF File Picker Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a file picker in the user interface.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eef.EEFFilePickerDescription#getPathExpression <em>Path Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.EEFFilePickerDescription#getEditExpression <em>Edit Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.EEFFilePickerDescription#getStyle <em>Style</em>}</li>
 *   <li>{@link org.eclipse.eef.EEFFilePickerDescription#getConditionalStyles <em>Conditional Styles</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eef.EefPackage#getEEFFilePickerDescription()
 * @model
 * @generated
 */
public interface EEFFilePickerDescription extends EEFWidgetDescription {
	/**
	 * Returns the value of the '<em><b>Path Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates how to display the input path.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path Expression</em>' attribute.
	 * @see #setPathExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFFilePickerDescription_PathExpression()
	 * @model
	 * @generated
	 */
	String getPathExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFFilePickerDescription#getPathExpression <em>Path Expression</em>}' attribute.
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
	 * Defines the behavior executed when the end-user updates the path of the file picker.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Edit Expression</em>' attribute.
	 * @see #setEditExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFFilePickerDescription_EditExpression()
	 * @model
	 * @generated
	 */
	String getEditExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFFilePickerDescription#getEditExpression <em>Edit Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edit Expression</em>' attribute.
	 * @see #getEditExpression()
	 * @generated
	 */
	void setEditExpression(String value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the file picker style
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Style</em>' containment reference.
	 * @see #setStyle(EEFFilePickerStyle)
	 * @see org.eclipse.eef.EefPackage#getEEFFilePickerDescription_Style()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EEFFilePickerStyle getStyle();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFFilePickerDescription#getStyle <em>Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' containment reference.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(EEFFilePickerStyle value);

	/**
	 * Returns the value of the '<em><b>Conditional Styles</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.eef.EEFFilePickerConditionalStyle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the file picker style associated to a precondition
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conditional Styles</em>' containment reference list.
	 * @see org.eclipse.eef.EefPackage#getEEFFilePickerDescription_ConditionalStyles()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<EEFFilePickerConditionalStyle> getConditionalStyles();

} // EEFFilePickerDescription
