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

import org.eclipse.eef.EEFTextStyle;
import org.eclipse.eef.EefPackage;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.eef.EEFTextStyle} object.
 * <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * @generated
 */
public class EEFTextStyleItemProvider extends EEFWidgetStyleItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EEFTextStyleItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addBackgroundColorExpressionPropertyDescriptor(object);
			addForegroundColorExpressionPropertyDescriptor(object);
			addFontNameExpressionPropertyDescriptor(object);
			addFontSizeExpressionPropertyDescriptor(object);
			addFontStyleExpressionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Background Color Expression feature.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected void addBackgroundColorExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(), getString("_UI_EEFTextStyle_backgroundColorExpression_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_EEFTextStyle_backgroundColorExpression_feature", "_UI_EEFTextStyle_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				EefPackage.Literals.EEF_TEXT_STYLE__BACKGROUND_COLOR_EXPRESSION, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
				null));
	}

	/**
	 * This adds a property descriptor for the Foreground Color Expression feature.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected void addForegroundColorExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(), getString("_UI_EEFTextStyle_foregroundColorExpression_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_EEFTextStyle_foregroundColorExpression_feature", "_UI_EEFTextStyle_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				EefPackage.Literals.EEF_TEXT_STYLE__FOREGROUND_COLOR_EXPRESSION, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
				null));
	}

	/**
	 * This adds a property descriptor for the Font Name Expression feature. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 */
	protected void addFontNameExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(), getString("_UI_EEFTextStyle_fontNameExpression_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_EEFTextStyle_fontNameExpression_feature", "_UI_EEFTextStyle_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				EefPackage.Literals.EEF_TEXT_STYLE__FONT_NAME_EXPRESSION, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
				null));
	}

	/**
	 * This adds a property descriptor for the Font Size Expression feature. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 */
	protected void addFontSizeExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(), getString("_UI_EEFTextStyle_fontSizeExpression_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_EEFTextStyle_fontSizeExpression_feature", "_UI_EEFTextStyle_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				EefPackage.Literals.EEF_TEXT_STYLE__FONT_SIZE_EXPRESSION, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
				null));
	}

	/**
	 * This adds a property descriptor for the Font Style Expression feature. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 */
	protected void addFontStyleExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(), getString("_UI_EEFTextStyle_fontStyleExpression_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_EEFTextStyle_fontStyleExpression_feature", "_UI_EEFTextStyle_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				EefPackage.Literals.EEF_TEXT_STYLE__FONT_STYLE_EXPRESSION, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
				null));
	}

	/**
	 * This returns EEFTextStyle.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EEFTextStyle")); //$NON-NLS-1$
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((EEFTextStyle) object).getLabelFontNameExpression();
		return label == null || label.length() == 0 ? getString("_UI_EEFTextStyle_type") : //$NON-NLS-1$
				getString("_UI_EEFTextStyle_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(EEFTextStyle.class)) {
		case EefPackage.EEF_TEXT_STYLE__BACKGROUND_COLOR_EXPRESSION:
		case EefPackage.EEF_TEXT_STYLE__FOREGROUND_COLOR_EXPRESSION:
		case EefPackage.EEF_TEXT_STYLE__FONT_NAME_EXPRESSION:
		case EefPackage.EEF_TEXT_STYLE__FONT_SIZE_EXPRESSION:
		case EefPackage.EEF_TEXT_STYLE__FONT_STYLE_EXPRESSION:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
