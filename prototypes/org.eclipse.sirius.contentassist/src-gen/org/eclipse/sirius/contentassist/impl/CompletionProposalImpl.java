/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.sirius.contentassist.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.sirius.contentassist.CompletionProposal;
import org.eclipse.sirius.contentassist.ContentassistPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Completion Proposal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.contentassist.impl.CompletionProposalImpl#getDisplay <em>Display</em>}</li>
 *   <li>{@link org.eclipse.sirius.contentassist.impl.CompletionProposalImpl#getProposal <em>Proposal</em>}</li>
 *   <li>{@link org.eclipse.sirius.contentassist.impl.CompletionProposalImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.eclipse.sirius.contentassist.impl.CompletionProposalImpl#getImage <em>Image</em>}</li>
 *   <li>{@link org.eclipse.sirius.contentassist.impl.CompletionProposalImpl#getCursorPosition <em>Cursor Position</em>}</li>
 *   <li>{@link org.eclipse.sirius.contentassist.impl.CompletionProposalImpl#getReplacementOffset <em>Replacement Offset</em>}</li>
 *   <li>{@link org.eclipse.sirius.contentassist.impl.CompletionProposalImpl#getReplacementLength <em>Replacement Length</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompletionProposalImpl extends MinimalEObjectImpl.Container implements CompletionProposal {
	/**
	 * The cached value of the '{@link #getDisplay() <em>Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplay()
	 * @generated
	 * @ordered
	 */
	protected Object display;

	/**
	 * The default value of the '{@link #getProposal() <em>Proposal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProposal()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPOSAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProposal() <em>Proposal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProposal()
	 * @generated
	 * @ordered
	 */
	protected String proposal = PROPOSAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected Object documentation;

	/**
	 * The cached value of the '{@link #getImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected Object image;

	/**
	 * The default value of the '{@link #getCursorPosition() <em>Cursor Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCursorPosition()
	 * @generated
	 * @ordered
	 */
	protected static final int CURSOR_POSITION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCursorPosition() <em>Cursor Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCursorPosition()
	 * @generated
	 * @ordered
	 */
	protected int cursorPosition = CURSOR_POSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getReplacementOffset() <em>Replacement Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplacementOffset()
	 * @generated
	 * @ordered
	 */
	protected static final int REPLACEMENT_OFFSET_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getReplacementOffset() <em>Replacement Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplacementOffset()
	 * @generated
	 * @ordered
	 */
	protected int replacementOffset = REPLACEMENT_OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getReplacementLength() <em>Replacement Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplacementLength()
	 * @generated
	 * @ordered
	 */
	protected static final int REPLACEMENT_LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getReplacementLength() <em>Replacement Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplacementLength()
	 * @generated
	 * @ordered
	 */
	protected int replacementLength = REPLACEMENT_LENGTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompletionProposalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentassistPackage.Literals.COMPLETION_PROPOSAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getDisplay() {
		return display;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplay(Object newDisplay) {
		Object oldDisplay = display;
		display = newDisplay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentassistPackage.COMPLETION_PROPOSAL__DISPLAY, oldDisplay, display));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProposal() {
		return proposal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProposal(String newProposal) {
		String oldProposal = proposal;
		proposal = newProposal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentassistPackage.COMPLETION_PROPOSAL__PROPOSAL, oldProposal, proposal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentation(Object newDocumentation) {
		Object oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentassistPackage.COMPLETION_PROPOSAL__DOCUMENTATION, oldDocumentation, documentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage() {
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImage(Object newImage) {
		Object oldImage = image;
		image = newImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentassistPackage.COMPLETION_PROPOSAL__IMAGE, oldImage, image));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCursorPosition() {
		return cursorPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCursorPosition(int newCursorPosition) {
		int oldCursorPosition = cursorPosition;
		cursorPosition = newCursorPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentassistPackage.COMPLETION_PROPOSAL__CURSOR_POSITION, oldCursorPosition, cursorPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getReplacementOffset() {
		return replacementOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplacementOffset(int newReplacementOffset) {
		int oldReplacementOffset = replacementOffset;
		replacementOffset = newReplacementOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentassistPackage.COMPLETION_PROPOSAL__REPLACEMENT_OFFSET, oldReplacementOffset, replacementOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getReplacementLength() {
		return replacementLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplacementLength(int newReplacementLength) {
		int oldReplacementLength = replacementLength;
		replacementLength = newReplacementLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentassistPackage.COMPLETION_PROPOSAL__REPLACEMENT_LENGTH, oldReplacementLength, replacementLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContentassistPackage.COMPLETION_PROPOSAL__DISPLAY:
				return getDisplay();
			case ContentassistPackage.COMPLETION_PROPOSAL__PROPOSAL:
				return getProposal();
			case ContentassistPackage.COMPLETION_PROPOSAL__DOCUMENTATION:
				return getDocumentation();
			case ContentassistPackage.COMPLETION_PROPOSAL__IMAGE:
				return getImage();
			case ContentassistPackage.COMPLETION_PROPOSAL__CURSOR_POSITION:
				return getCursorPosition();
			case ContentassistPackage.COMPLETION_PROPOSAL__REPLACEMENT_OFFSET:
				return getReplacementOffset();
			case ContentassistPackage.COMPLETION_PROPOSAL__REPLACEMENT_LENGTH:
				return getReplacementLength();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ContentassistPackage.COMPLETION_PROPOSAL__DISPLAY:
				setDisplay(newValue);
				return;
			case ContentassistPackage.COMPLETION_PROPOSAL__PROPOSAL:
				setProposal((String)newValue);
				return;
			case ContentassistPackage.COMPLETION_PROPOSAL__DOCUMENTATION:
				setDocumentation(newValue);
				return;
			case ContentassistPackage.COMPLETION_PROPOSAL__IMAGE:
				setImage(newValue);
				return;
			case ContentassistPackage.COMPLETION_PROPOSAL__CURSOR_POSITION:
				setCursorPosition((Integer)newValue);
				return;
			case ContentassistPackage.COMPLETION_PROPOSAL__REPLACEMENT_OFFSET:
				setReplacementOffset((Integer)newValue);
				return;
			case ContentassistPackage.COMPLETION_PROPOSAL__REPLACEMENT_LENGTH:
				setReplacementLength((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ContentassistPackage.COMPLETION_PROPOSAL__DISPLAY:
				setDisplay((Object)null);
				return;
			case ContentassistPackage.COMPLETION_PROPOSAL__PROPOSAL:
				setProposal(PROPOSAL_EDEFAULT);
				return;
			case ContentassistPackage.COMPLETION_PROPOSAL__DOCUMENTATION:
				setDocumentation((Object)null);
				return;
			case ContentassistPackage.COMPLETION_PROPOSAL__IMAGE:
				setImage((Object)null);
				return;
			case ContentassistPackage.COMPLETION_PROPOSAL__CURSOR_POSITION:
				setCursorPosition(CURSOR_POSITION_EDEFAULT);
				return;
			case ContentassistPackage.COMPLETION_PROPOSAL__REPLACEMENT_OFFSET:
				setReplacementOffset(REPLACEMENT_OFFSET_EDEFAULT);
				return;
			case ContentassistPackage.COMPLETION_PROPOSAL__REPLACEMENT_LENGTH:
				setReplacementLength(REPLACEMENT_LENGTH_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ContentassistPackage.COMPLETION_PROPOSAL__DISPLAY:
				return display != null;
			case ContentassistPackage.COMPLETION_PROPOSAL__PROPOSAL:
				return PROPOSAL_EDEFAULT == null ? proposal != null : !PROPOSAL_EDEFAULT.equals(proposal);
			case ContentassistPackage.COMPLETION_PROPOSAL__DOCUMENTATION:
				return documentation != null;
			case ContentassistPackage.COMPLETION_PROPOSAL__IMAGE:
				return image != null;
			case ContentassistPackage.COMPLETION_PROPOSAL__CURSOR_POSITION:
				return cursorPosition != CURSOR_POSITION_EDEFAULT;
			case ContentassistPackage.COMPLETION_PROPOSAL__REPLACEMENT_OFFSET:
				return replacementOffset != REPLACEMENT_OFFSET_EDEFAULT;
			case ContentassistPackage.COMPLETION_PROPOSAL__REPLACEMENT_LENGTH:
				return replacementLength != REPLACEMENT_LENGTH_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (display: ");
		result.append(display);
		result.append(", proposal: ");
		result.append(proposal);
		result.append(", documentation: ");
		result.append(documentation);
		result.append(", image: ");
		result.append(image);
		result.append(", cursorPosition: ");
		result.append(cursorPosition);
		result.append(", replacementOffset: ");
		result.append(replacementOffset);
		result.append(", replacementLength: ");
		result.append(replacementLength);
		result.append(')');
		return result.toString();
	}

} //CompletionProposalImpl
