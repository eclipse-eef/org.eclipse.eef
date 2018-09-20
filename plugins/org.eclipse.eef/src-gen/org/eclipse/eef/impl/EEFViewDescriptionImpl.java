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
package org.eclipse.eef.impl;

import java.util.Collection;

import org.eclipse.eef.EEFGroupDescription;
import org.eclipse.eef.EEFPageDescription;
import org.eclipse.eef.EEFViewDescription;
import org.eclipse.eef.EefPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>EEF View Description</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.eef.impl.EEFViewDescriptionImpl#getIdentifier <em>Identifier</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFViewDescriptionImpl#getLabelExpression <em>Label Expression</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFViewDescriptionImpl#getImageExpression <em>Image Expression</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFViewDescriptionImpl#getGroups <em>Groups</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFViewDescriptionImpl#getPages <em>Pages</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFViewDescriptionImpl#getEPackages <em>EPackages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EEFViewDescriptionImpl extends MinimalEObjectImpl.Container implements EEFViewDescription {
	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String identifier = EEFViewDescriptionImpl.IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabelExpression() <em>Label Expression</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getLabelExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabelExpression() <em>Label Expression</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getLabelExpression()
	 * @generated
	 * @ordered
	 */
	protected String labelExpression = EEFViewDescriptionImpl.LABEL_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getImageExpression() <em>Image Expression</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getImageExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImageExpression() <em>Image Expression</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getImageExpression()
	 * @generated
	 * @ordered
	 */
	protected String imageExpression = EEFViewDescriptionImpl.IMAGE_EXPRESSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGroups() <em>Groups</em>}' containment reference list. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<EEFGroupDescription> groups;

	/**
	 * The cached value of the '{@link #getPages() <em>Pages</em>}' containment reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getPages()
	 * @generated
	 * @ordered
	 */
	protected EList<EEFPageDescription> pages;

	/**
	 * The cached value of the '{@link #getEPackages() <em>EPackages</em>}' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getEPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<EPackage> ePackages;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EEFViewDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefPackage.Literals.EEF_VIEW_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setIdentifier(String newIdentifier) {
		String oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_VIEW_DESCRIPTION__IDENTIFIER, oldIdentifier, identifier));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getLabelExpression() {
		return labelExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setLabelExpression(String newLabelExpression) {
		String oldLabelExpression = labelExpression;
		labelExpression = newLabelExpression;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_VIEW_DESCRIPTION__LABEL_EXPRESSION, oldLabelExpression,
					labelExpression));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getImageExpression() {
		return imageExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setImageExpression(String newImageExpression) {
		String oldImageExpression = imageExpression;
		imageExpression = newImageExpression;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_VIEW_DESCRIPTION__IMAGE_EXPRESSION, oldImageExpression,
					imageExpression));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<EEFGroupDescription> getGroups() {
		if (groups == null) {
			groups = new EObjectContainmentEList.Resolving<>(EEFGroupDescription.class, this,
					EefPackage.EEF_VIEW_DESCRIPTION__GROUPS);
		}
		return groups;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<EEFPageDescription> getPages() {
		if (pages == null) {
			pages = new EObjectContainmentEList.Resolving<>(EEFPageDescription.class, this, EefPackage.EEF_VIEW_DESCRIPTION__PAGES);
		}
		return pages;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<EPackage> getEPackages() {
		if (ePackages == null) {
			ePackages = new EObjectResolvingEList<>(EPackage.class, this, EefPackage.EEF_VIEW_DESCRIPTION__EPACKAGES);
		}
		return ePackages;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EefPackage.EEF_VIEW_DESCRIPTION__GROUPS:
			return ((InternalEList<?>) getGroups()).basicRemove(otherEnd, msgs);
		case EefPackage.EEF_VIEW_DESCRIPTION__PAGES:
			return ((InternalEList<?>) getPages()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EefPackage.EEF_VIEW_DESCRIPTION__IDENTIFIER:
			return getIdentifier();
		case EefPackage.EEF_VIEW_DESCRIPTION__LABEL_EXPRESSION:
			return getLabelExpression();
		case EefPackage.EEF_VIEW_DESCRIPTION__IMAGE_EXPRESSION:
			return getImageExpression();
		case EefPackage.EEF_VIEW_DESCRIPTION__GROUPS:
			return getGroups();
		case EefPackage.EEF_VIEW_DESCRIPTION__PAGES:
			return getPages();
		case EefPackage.EEF_VIEW_DESCRIPTION__EPACKAGES:
			return getEPackages();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EefPackage.EEF_VIEW_DESCRIPTION__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case EefPackage.EEF_VIEW_DESCRIPTION__LABEL_EXPRESSION:
			setLabelExpression((String) newValue);
			return;
		case EefPackage.EEF_VIEW_DESCRIPTION__IMAGE_EXPRESSION:
			setImageExpression((String) newValue);
			return;
		case EefPackage.EEF_VIEW_DESCRIPTION__GROUPS:
			getGroups().clear();
			getGroups().addAll((Collection<? extends EEFGroupDescription>) newValue);
			return;
		case EefPackage.EEF_VIEW_DESCRIPTION__PAGES:
			getPages().clear();
			getPages().addAll((Collection<? extends EEFPageDescription>) newValue);
			return;
		case EefPackage.EEF_VIEW_DESCRIPTION__EPACKAGES:
			getEPackages().clear();
			getEPackages().addAll((Collection<? extends EPackage>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case EefPackage.EEF_VIEW_DESCRIPTION__IDENTIFIER:
			setIdentifier(EEFViewDescriptionImpl.IDENTIFIER_EDEFAULT);
			return;
		case EefPackage.EEF_VIEW_DESCRIPTION__LABEL_EXPRESSION:
			setLabelExpression(EEFViewDescriptionImpl.LABEL_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_VIEW_DESCRIPTION__IMAGE_EXPRESSION:
			setImageExpression(EEFViewDescriptionImpl.IMAGE_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_VIEW_DESCRIPTION__GROUPS:
			getGroups().clear();
			return;
		case EefPackage.EEF_VIEW_DESCRIPTION__PAGES:
			getPages().clear();
			return;
		case EefPackage.EEF_VIEW_DESCRIPTION__EPACKAGES:
			getEPackages().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case EefPackage.EEF_VIEW_DESCRIPTION__IDENTIFIER:
			return EEFViewDescriptionImpl.IDENTIFIER_EDEFAULT == null ? identifier != null
					: !EEFViewDescriptionImpl.IDENTIFIER_EDEFAULT.equals(identifier);
		case EefPackage.EEF_VIEW_DESCRIPTION__LABEL_EXPRESSION:
			return EEFViewDescriptionImpl.LABEL_EXPRESSION_EDEFAULT == null ? labelExpression != null
					: !EEFViewDescriptionImpl.LABEL_EXPRESSION_EDEFAULT.equals(labelExpression);
		case EefPackage.EEF_VIEW_DESCRIPTION__IMAGE_EXPRESSION:
			return EEFViewDescriptionImpl.IMAGE_EXPRESSION_EDEFAULT == null ? imageExpression != null
					: !EEFViewDescriptionImpl.IMAGE_EXPRESSION_EDEFAULT.equals(imageExpression);
		case EefPackage.EEF_VIEW_DESCRIPTION__GROUPS:
			return groups != null && !groups.isEmpty();
		case EefPackage.EEF_VIEW_DESCRIPTION__PAGES:
			return pages != null && !pages.isEmpty();
		case EefPackage.EEF_VIEW_DESCRIPTION__EPACKAGES:
			return ePackages != null && !ePackages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (identifier: "); //$NON-NLS-1$
		result.append(identifier);
		result.append(", labelExpression: "); //$NON-NLS-1$
		result.append(labelExpression);
		result.append(", imageExpression: "); //$NON-NLS-1$
		result.append(imageExpression);
		result.append(')');
		return result.toString();
	}

} // EEFViewDescriptionImpl
