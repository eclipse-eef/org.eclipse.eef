/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.eef.EEFGridLayoutDescription;
import org.eclipse.eef.EefPackage;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.eef.EEFGridLayoutDescription} object. <!-- begin-user-doc
 * --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class EEFGridLayoutDescriptionItemProvider extends EEFLayoutDescriptionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EEFGridLayoutDescriptionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNumberOfColumnsPropertyDescriptor(object);
			addMakeColumnsWithEqualWidthPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Number Of Columns feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addNumberOfColumnsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
		.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_EEFGridLayoutDescription_numberOfColumns_feature"), //$NON-NLS-1$
				getString(
						"_UI_PropertyDescriptor_description", "_UI_EEFGridLayoutDescription_numberOfColumns_feature", "_UI_EEFGridLayoutDescription_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						EefPackage.Literals.EEF_GRID_LAYOUT_DESCRIPTION__NUMBER_OF_COLUMNS, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Make Columns With Equal Width feature. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addMakeColumnsWithEqualWidthPropertyDescriptor(Object object) {
		itemPropertyDescriptors
		.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_EEFGridLayoutDescription_makeColumnsWithEqualWidth_feature"), //$NON-NLS-1$
				getString(
						"_UI_PropertyDescriptor_description", "_UI_EEFGridLayoutDescription_makeColumnsWithEqualWidth_feature", "_UI_EEFGridLayoutDescription_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						EefPackage.Literals.EEF_GRID_LAYOUT_DESCRIPTION__MAKE_COLUMNS_WITH_EQUAL_WIDTH, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns EEFGridLayoutDescription.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EEFGridLayoutDescription")); //$NON-NLS-1$
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		EEFGridLayoutDescription eefGridLayoutDescription = (EEFGridLayoutDescription) object;
		return getString("_UI_EEFGridLayoutDescription_type") + " " + eefGridLayoutDescription.getNumberOfColumns(); //$NON-NLS-1$ //$NON-NLS-2$
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached children and by creating
	 * a viewer notification, which it passes to {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(EEFGridLayoutDescription.class)) {
		case EefPackage.EEF_GRID_LAYOUT_DESCRIPTION__NUMBER_OF_COLUMNS:
		case EefPackage.EEF_GRID_LAYOUT_DESCRIPTION__MAKE_COLUMNS_WITH_EQUAL_WIDTH:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children that can be created
	 * under this object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
