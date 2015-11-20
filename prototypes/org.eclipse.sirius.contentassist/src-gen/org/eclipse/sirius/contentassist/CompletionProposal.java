/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.sirius.contentassist;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Completion Proposal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.contentassist.CompletionProposal#getDisplay <em>Display</em>}</li>
 *   <li>{@link org.eclipse.sirius.contentassist.CompletionProposal#getProposal <em>Proposal</em>}</li>
 *   <li>{@link org.eclipse.sirius.contentassist.CompletionProposal#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.eclipse.sirius.contentassist.CompletionProposal#getImage <em>Image</em>}</li>
 *   <li>{@link org.eclipse.sirius.contentassist.CompletionProposal#getCursorPosition <em>Cursor Position</em>}</li>
 *   <li>{@link org.eclipse.sirius.contentassist.CompletionProposal#getReplacementOffset <em>Replacement Offset</em>}</li>
 *   <li>{@link org.eclipse.sirius.contentassist.CompletionProposal#getReplacementLength <em>Replacement Length</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.contentassist.ContentassistPackage#getCompletionProposal()
 * @model
 * @generated
 */
public interface CompletionProposal extends EObject {
	/**
	 * Returns the value of the '<em><b>Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display</em>' attribute.
	 * @see #setDisplay(Object)
	 * @see org.eclipse.sirius.contentassist.ContentassistPackage#getCompletionProposal_Display()
	 * @model dataType="org.eclipse.sirius.contentassist.StyledString"
	 * @generated
	 */
	Object getDisplay();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.contentassist.CompletionProposal#getDisplay <em>Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display</em>' attribute.
	 * @see #getDisplay()
	 * @generated
	 */
	void setDisplay(Object value);

	/**
	 * Returns the value of the '<em><b>Proposal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proposal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proposal</em>' attribute.
	 * @see #setProposal(String)
	 * @see org.eclipse.sirius.contentassist.ContentassistPackage#getCompletionProposal_Proposal()
	 * @model
	 * @generated
	 */
	String getProposal();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.contentassist.CompletionProposal#getProposal <em>Proposal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proposal</em>' attribute.
	 * @see #getProposal()
	 * @generated
	 */
	void setProposal(String value);

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' attribute.
	 * @see #setDocumentation(Object)
	 * @see org.eclipse.sirius.contentassist.ContentassistPackage#getCompletionProposal_Documentation()
	 * @model dataType="org.eclipse.sirius.contentassist.StyledString"
	 * @generated
	 */
	Object getDocumentation();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.contentassist.CompletionProposal#getDocumentation <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' attribute.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(Object value);

	/**
	 * Returns the value of the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' attribute.
	 * @see #setImage(Object)
	 * @see org.eclipse.sirius.contentassist.ContentassistPackage#getCompletionProposal_Image()
	 * @model dataType="org.eclipse.sirius.contentassist.ContentAssistImage"
	 * @generated
	 */
	Object getImage();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.contentassist.CompletionProposal#getImage <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' attribute.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(Object value);

	/**
	 * Returns the value of the '<em><b>Cursor Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cursor Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cursor Position</em>' attribute.
	 * @see #setCursorPosition(int)
	 * @see org.eclipse.sirius.contentassist.ContentassistPackage#getCompletionProposal_CursorPosition()
	 * @model
	 * @generated
	 */
	int getCursorPosition();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.contentassist.CompletionProposal#getCursorPosition <em>Cursor Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cursor Position</em>' attribute.
	 * @see #getCursorPosition()
	 * @generated
	 */
	void setCursorPosition(int value);

	/**
	 * Returns the value of the '<em><b>Replacement Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Replacement Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replacement Offset</em>' attribute.
	 * @see #setReplacementOffset(int)
	 * @see org.eclipse.sirius.contentassist.ContentassistPackage#getCompletionProposal_ReplacementOffset()
	 * @model
	 * @generated
	 */
	int getReplacementOffset();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.contentassist.CompletionProposal#getReplacementOffset <em>Replacement Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replacement Offset</em>' attribute.
	 * @see #getReplacementOffset()
	 * @generated
	 */
	void setReplacementOffset(int value);

	/**
	 * Returns the value of the '<em><b>Replacement Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Replacement Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replacement Length</em>' attribute.
	 * @see #setReplacementLength(int)
	 * @see org.eclipse.sirius.contentassist.ContentassistPackage#getCompletionProposal_ReplacementLength()
	 * @model
	 * @generated
	 */
	int getReplacementLength();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.contentassist.CompletionProposal#getReplacementLength <em>Replacement Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replacement Length</em>' attribute.
	 * @see #getReplacementLength()
	 * @generated
	 */
	void setReplacementLength(int value);

} // CompletionProposal
