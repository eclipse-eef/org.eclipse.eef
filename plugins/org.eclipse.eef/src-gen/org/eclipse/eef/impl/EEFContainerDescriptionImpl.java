/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef.impl;

import java.util.Collection;

import org.eclipse.eef.EEFContainerDescription;
import org.eclipse.eef.EEFControlDescription;
import org.eclipse.eef.EEFLayoutDescription;
import org.eclipse.eef.EefPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>EEF Container Description</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.eef.impl.EEFContainerDescriptionImpl#getControls <em>Controls</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFContainerDescriptionImpl#getLayout <em>Layout</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EEFContainerDescriptionImpl extends EEFControlDescriptionImpl implements EEFContainerDescription {
	/**
	 * The cached value of the '{@link #getControls() <em>Controls</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getControls()
	 * @generated
	 * @ordered
	 */
	protected EList<EEFControlDescription> controls;

	/**
	 * The cached value of the '{@link #getLayout() <em>Layout</em>}' containment reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getLayout()
	 * @generated
	 * @ordered
	 */
	protected EEFLayoutDescription layout;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected EEFContainerDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefPackage.Literals.EEF_CONTAINER_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<EEFControlDescription> getControls() {
		if (controls == null) {
			controls = new EObjectContainmentEList.Resolving<EEFControlDescription>(EEFControlDescription.class, this,
					EefPackage.EEF_CONTAINER_DESCRIPTION__CONTROLS);
		}
		return controls;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EEFLayoutDescription getLayout() {
		if (layout != null && layout.eIsProxy()) {
			InternalEObject oldLayout = (InternalEObject) layout;
			layout = (EEFLayoutDescription) eResolveProxy(oldLayout);
			if (layout != oldLayout) {
				InternalEObject newLayout = (InternalEObject) layout;
				NotificationChain msgs = oldLayout.eInverseRemove(this, InternalEObject.EOPPOSITE_FEATURE_BASE
						- EefPackage.EEF_CONTAINER_DESCRIPTION__LAYOUT, null, null);
				if (newLayout.eInternalContainer() == null) {
					msgs = newLayout.eInverseAdd(this, InternalEObject.EOPPOSITE_FEATURE_BASE - EefPackage.EEF_CONTAINER_DESCRIPTION__LAYOUT, null,
							msgs);
				}
				if (msgs != null) {
					msgs.dispatch();
				}
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EefPackage.EEF_CONTAINER_DESCRIPTION__LAYOUT, oldLayout, layout));
				}
			}
		}
		return layout;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EEFLayoutDescription basicGetLayout() {
		return layout;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public NotificationChain basicSetLayout(EEFLayoutDescription newLayout, NotificationChain msgs) {
		EEFLayoutDescription oldLayout = layout;
		layout = newLayout;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EefPackage.EEF_CONTAINER_DESCRIPTION__LAYOUT, oldLayout,
					newLayout);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setLayout(EEFLayoutDescription newLayout) {
		if (newLayout != layout) {
			NotificationChain msgs = null;
			if (layout != null) {
				msgs = ((InternalEObject) layout).eInverseRemove(this, InternalEObject.EOPPOSITE_FEATURE_BASE
						- EefPackage.EEF_CONTAINER_DESCRIPTION__LAYOUT, null, msgs);
			}
			if (newLayout != null) {
				msgs = ((InternalEObject) newLayout).eInverseAdd(this, InternalEObject.EOPPOSITE_FEATURE_BASE
						- EefPackage.EEF_CONTAINER_DESCRIPTION__LAYOUT, null, msgs);
			}
			msgs = basicSetLayout(newLayout, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_CONTAINER_DESCRIPTION__LAYOUT, newLayout, newLayout));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EefPackage.EEF_CONTAINER_DESCRIPTION__CONTROLS:
			return ((InternalEList<?>) getControls()).basicRemove(otherEnd, msgs);
		case EefPackage.EEF_CONTAINER_DESCRIPTION__LAYOUT:
			return basicSetLayout(null, msgs);
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
		case EefPackage.EEF_CONTAINER_DESCRIPTION__CONTROLS:
			return getControls();
		case EefPackage.EEF_CONTAINER_DESCRIPTION__LAYOUT:
			if (resolve) {
				return getLayout();
			}
			return basicGetLayout();
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
		case EefPackage.EEF_CONTAINER_DESCRIPTION__CONTROLS:
			getControls().clear();
			getControls().addAll((Collection<? extends EEFControlDescription>) newValue);
			return;
		case EefPackage.EEF_CONTAINER_DESCRIPTION__LAYOUT:
			setLayout((EEFLayoutDescription) newValue);
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
		case EefPackage.EEF_CONTAINER_DESCRIPTION__CONTROLS:
			getControls().clear();
			return;
		case EefPackage.EEF_CONTAINER_DESCRIPTION__LAYOUT:
			setLayout((EEFLayoutDescription) null);
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
		case EefPackage.EEF_CONTAINER_DESCRIPTION__CONTROLS:
			return controls != null && !controls.isEmpty();
		case EefPackage.EEF_CONTAINER_DESCRIPTION__LAYOUT:
			return layout != null;
		}
		return super.eIsSet(featureID);
	}

} // EEFContainerDescriptionImpl
