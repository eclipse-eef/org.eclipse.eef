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
 * <!-- begin-user-doc --> A representation of the model object '<em><b>EEF Custom Widget Description</b></em>'. <!--
 * end-user-doc -->
 *
 * <!-- begin-model-doc --> Represents a custom widget in the user interface. <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.eef.EEFCustomWidgetDescription#getCustomExpressions <em>Custom Expressions</em>}</li>
 * <li>{@link org.eclipse.eef.EEFCustomWidgetDescription#getStyle <em>Style</em>}</li>
 * <li>{@link org.eclipse.eef.EEFCustomWidgetDescription#getConditionalStyles <em>Conditional Styles</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eef.EefPackage#getEEFCustomWidgetDescription()
 * @model
 * @generated
 */
public interface EEFCustomWidgetDescription extends EEFWidgetDescription {
	/**
	 * Returns the value of the '<em><b>Custom Expressions</b></em>' containment reference list. The list contents are
	 * of type {@link org.eclipse.eef.EEFCustomExpression}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Expressions</em>' containment reference list isn't clear, there really should
	 * be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Custom Expressions</em>' containment reference list.
	 * @see org.eclipse.eef.EefPackage#getEEFCustomWidgetDescription_CustomExpressions()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<EEFCustomExpression> getCustomExpressions();

	/**
	 * Returns the value of the '<em><b>Style</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * --> <!-- begin-model-doc --> Defines the custom widget style <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Style</em>' containment reference.
	 * @see #setStyle(EEFCustomWidgetStyle)
	 * @see org.eclipse.eef.EefPackage#getEEFCustomWidgetDescription_Style()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EEFCustomWidgetStyle getStyle();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFCustomWidgetDescription#getStyle <em>Style</em>}' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Style</em>' containment reference.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(EEFCustomWidgetStyle value);

	/**
	 * Returns the value of the '<em><b>Conditional Styles</b></em>' containment reference list. The list contents are
	 * of type {@link org.eclipse.eef.EEFCustomWidgetConditionalStyle}. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * <!-- begin-model-doc --> Defines the select style associated to a precondition <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Conditional Styles</em>' containment reference list.
	 * @see org.eclipse.eef.EefPackage#getEEFCustomWidgetDescription_ConditionalStyles()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<EEFCustomWidgetConditionalStyle> getConditionalStyles();

} // EEFCustomWidgetDescription
