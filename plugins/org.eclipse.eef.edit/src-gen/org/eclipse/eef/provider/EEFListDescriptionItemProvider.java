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

import org.eclipse.eef.EEFListDescription;
import org.eclipse.eef.EefFactory;
import org.eclipse.eef.EefPackage;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.eef.EEFListDescription} object. <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class EEFListDescriptionItemProvider extends EEFWidgetDescriptionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EEFListDescriptionItemProvider(AdapterFactory adapterFactory) {
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
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Value Expression feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addValueExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_EEFListDescription_valueExpression_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_EEFListDescription_valueExpression_feature", "_UI_EEFListDescription_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				EefPackage.Literals.EEF_LIST_DESCRIPTION__VALUE_EXPRESSION, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
				null));
	}

	/**
	 * This adds a property descriptor for the Display Expression feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addDisplayExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_EEFListDescription_displayExpression_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_EEFListDescription_displayExpression_feature", "_UI_EEFListDescription_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				EefPackage.Literals.EEF_LIST_DESCRIPTION__DISPLAY_EXPRESSION, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
				null));
	}

	/**
	 * This adds a property descriptor for the On Click Expression feature. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 */
	protected void addOnClickExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_EEFListDescription_onClickExpression_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_EEFListDescription_onClickExpression_feature", "_UI_EEFListDescription_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				EefPackage.Literals.EEF_LIST_DESCRIPTION__ON_CLICK_EXPRESSION, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
				null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(EefPackage.Literals.EEF_LIST_DESCRIPTION__ACTIONS);
			childrenFeatures.add(EefPackage.Literals.EEF_LIST_DESCRIPTION__STYLE);
			childrenFeatures.add(EefPackage.Literals.EEF_LIST_DESCRIPTION__CONDITIONAL_STYLES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns EEFListDescription.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EEFListDescription")); //$NON-NLS-1$
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
		String label = ((EEFListDescription) object).getIdentifier();
		return label == null || label.length() == 0 ? getString("_UI_EEFListDescription_type") : //$NON-NLS-1$
			getString("_UI_EEFListDescription_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(EEFListDescription.class)) {
		case EefPackage.EEF_LIST_DESCRIPTION__VALUE_EXPRESSION:
		case EefPackage.EEF_LIST_DESCRIPTION__DISPLAY_EXPRESSION:
		case EefPackage.EEF_LIST_DESCRIPTION__ON_CLICK_EXPRESSION:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case EefPackage.EEF_LIST_DESCRIPTION__ACTIONS:
		case EefPackage.EEF_LIST_DESCRIPTION__STYLE:
		case EefPackage.EEF_LIST_DESCRIPTION__CONDITIONAL_STYLES:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors
		.add(createChildParameter(EefPackage.Literals.EEF_LIST_DESCRIPTION__ACTIONS, EefFactory.eINSTANCE.createEEFWidgetAction()));

		newChildDescriptors.add(createChildParameter(EefPackage.Literals.EEF_LIST_DESCRIPTION__STYLE, EefFactory.eINSTANCE.createEEFListStyle()));

		newChildDescriptors.add(createChildParameter(EefPackage.Literals.EEF_LIST_DESCRIPTION__CONDITIONAL_STYLES,
				EefFactory.eINSTANCE.createEEFListConditionalStyle()));
	}

}
