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
 * <ul>
 * <li>{@link org.eclipse.eef.EEFCustomWidgetDescription#getCustomExpressions <em>Custom Expressions</em>}</li>
 * </ul>
 * </p>
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

} // EEFCustomWidgetDescription
