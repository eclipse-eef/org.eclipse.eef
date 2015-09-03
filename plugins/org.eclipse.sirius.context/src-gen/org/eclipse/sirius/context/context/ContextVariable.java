/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 */
package org.eclipse.sirius.context.context;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a variable associated to a context.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.context.context.ContextVariable#getContext <em>Context</em>}</li>
 *   <li>{@link org.eclipse.sirius.context.context.ContextVariable#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.sirius.context.context.ContextVariable#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.context.context.ContextPackage#getContextVariable()
 * @model
 * @generated
 */
public interface ContextVariable extends EObject {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the context.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see #setContext(Context)
	 * @see org.eclipse.sirius.context.context.ContextPackage#getContextVariable_Context()
	 * @model required="true"
	 * @generated
	 */
	Context getContext();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.context.context.ContextVariable#getContext <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Context value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the name of the variable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.sirius.context.context.ContextPackage#getContextVariable_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.context.context.ContextVariable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Define the documentation of the variable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Documentation</em>' attribute.
	 * @see #setDocumentation(String)
	 * @see org.eclipse.sirius.context.context.ContextPackage#getContextVariable_Documentation()
	 * @model
	 * @generated
	 */
	String getDocumentation();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.context.context.ContextVariable#getDocumentation <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' attribute.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(String value);

} // ContextVariable
