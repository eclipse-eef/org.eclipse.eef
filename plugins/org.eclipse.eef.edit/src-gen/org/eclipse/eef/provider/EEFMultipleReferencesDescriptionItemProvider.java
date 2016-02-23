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

import org.eclipse.eef.EEFMultipleReferencesDescription;
import org.eclipse.eef.EefPackage;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.eef.EEFMultipleReferencesDescription} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class EEFMultipleReferencesDescriptionItemProvider extends EEFWidgetDescriptionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EEFMultipleReferencesDescriptionItemProvider(AdapterFactory adapterFactory) {
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

			addValueExpressionPropertyDescriptor(object);
			addDisplayExpressionPropertyDescriptor(object);
			addOnClickExpressionPropertyDescriptor(object);
			addCreateExpressionPropertyDescriptor(object);
			addSearchExpressionPropertyDescriptor(object);
			addUnsetExpressionPropertyDescriptor(object);
			addUpExpressionPropertyDescriptor(object);
			addDownExpressionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Value Expression feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addValueExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
		.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_EEFMultipleReferencesDescription_valueExpression_feature"), //$NON-NLS-1$
				getString(
						"_UI_PropertyDescriptor_description", "_UI_EEFMultipleReferencesDescription_valueExpression_feature", "_UI_EEFMultipleReferencesDescription_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						EefPackage.Literals.EEF_MULTIPLE_REFERENCES_DESCRIPTION__VALUE_EXPRESSION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Display Expression feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addDisplayExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
		.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_EEFMultipleReferencesDescription_displayExpression_feature"), //$NON-NLS-1$
				getString(
						"_UI_PropertyDescriptor_description", "_UI_EEFMultipleReferencesDescription_displayExpression_feature", "_UI_EEFMultipleReferencesDescription_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						EefPackage.Literals.EEF_MULTIPLE_REFERENCES_DESCRIPTION__DISPLAY_EXPRESSION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the On Click Expression feature. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	protected void addOnClickExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
		.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_EEFMultipleReferencesDescription_onClickExpression_feature"), //$NON-NLS-1$
				getString(
						"_UI_PropertyDescriptor_description", "_UI_EEFMultipleReferencesDescription_onClickExpression_feature", "_UI_EEFMultipleReferencesDescription_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						EefPackage.Literals.EEF_MULTIPLE_REFERENCES_DESCRIPTION__ON_CLICK_EXPRESSION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Create Expression feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addCreateExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
		.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_EEFMultipleReferencesDescription_createExpression_feature"), //$NON-NLS-1$
				getString(
						"_UI_PropertyDescriptor_description", "_UI_EEFMultipleReferencesDescription_createExpression_feature", "_UI_EEFMultipleReferencesDescription_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						EefPackage.Literals.EEF_MULTIPLE_REFERENCES_DESCRIPTION__CREATE_EXPRESSION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Search Expression feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addSearchExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
		.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_EEFMultipleReferencesDescription_searchExpression_feature"), //$NON-NLS-1$
				getString(
						"_UI_PropertyDescriptor_description", "_UI_EEFMultipleReferencesDescription_searchExpression_feature", "_UI_EEFMultipleReferencesDescription_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						EefPackage.Literals.EEF_MULTIPLE_REFERENCES_DESCRIPTION__SEARCH_EXPRESSION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Unset Expression feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addUnsetExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
		.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_EEFMultipleReferencesDescription_unsetExpression_feature"), //$NON-NLS-1$
				getString(
						"_UI_PropertyDescriptor_description", "_UI_EEFMultipleReferencesDescription_unsetExpression_feature", "_UI_EEFMultipleReferencesDescription_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						EefPackage.Literals.EEF_MULTIPLE_REFERENCES_DESCRIPTION__UNSET_EXPRESSION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Up Expression feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addUpExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
		.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_EEFMultipleReferencesDescription_upExpression_feature"), //$NON-NLS-1$
				getString(
						"_UI_PropertyDescriptor_description", "_UI_EEFMultipleReferencesDescription_upExpression_feature", "_UI_EEFMultipleReferencesDescription_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						EefPackage.Literals.EEF_MULTIPLE_REFERENCES_DESCRIPTION__UP_EXPRESSION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Down Expression feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addDownExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
		.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_EEFMultipleReferencesDescription_downExpression_feature"), //$NON-NLS-1$
				getString(
						"_UI_PropertyDescriptor_description", "_UI_EEFMultipleReferencesDescription_downExpression_feature", "_UI_EEFMultipleReferencesDescription_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						EefPackage.Literals.EEF_MULTIPLE_REFERENCES_DESCRIPTION__DOWN_EXPRESSION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns EEFMultipleReferencesDescription.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EEFMultipleReferencesDescription")); //$NON-NLS-1$
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
		String label = ((EEFMultipleReferencesDescription) object).getIdentifier();
		return label == null || label.length() == 0 ? getString("_UI_EEFMultipleReferencesDescription_type") : //$NON-NLS-1$
			getString("_UI_EEFMultipleReferencesDescription_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(EEFMultipleReferencesDescription.class)) {
		case EefPackage.EEF_MULTIPLE_REFERENCES_DESCRIPTION__VALUE_EXPRESSION:
		case EefPackage.EEF_MULTIPLE_REFERENCES_DESCRIPTION__DISPLAY_EXPRESSION:
		case EefPackage.EEF_MULTIPLE_REFERENCES_DESCRIPTION__ON_CLICK_EXPRESSION:
		case EefPackage.EEF_MULTIPLE_REFERENCES_DESCRIPTION__CREATE_EXPRESSION:
		case EefPackage.EEF_MULTIPLE_REFERENCES_DESCRIPTION__SEARCH_EXPRESSION:
		case EefPackage.EEF_MULTIPLE_REFERENCES_DESCRIPTION__UNSET_EXPRESSION:
		case EefPackage.EEF_MULTIPLE_REFERENCES_DESCRIPTION__UP_EXPRESSION:
		case EefPackage.EEF_MULTIPLE_REFERENCES_DESCRIPTION__DOWN_EXPRESSION:
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
