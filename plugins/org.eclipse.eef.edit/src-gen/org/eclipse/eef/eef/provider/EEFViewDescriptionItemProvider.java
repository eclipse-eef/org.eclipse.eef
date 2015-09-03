/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef.eef.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.eef.eef.EEFViewDescription;
import org.eclipse.eef.eef.EefFactory;
import org.eclipse.eef.eef.EefPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.eef.eef.EEFViewDescription} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EEFViewDescriptionItemProvider extends ContextableElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEFViewDescriptionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addIdentifierPropertyDescriptor(object);
			addLabelExpressionPropertyDescriptor(object);
			addEPackageNsUrisPropertyDescriptor(object);
			addImportedViewsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Identifier feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdentifierPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_EEFViewDescription_identifier_feature"), //$NON-NLS-1$
						getString("_UI_PropertyDescriptor_description", "_UI_EEFViewDescription_identifier_feature", //$NON-NLS-1$//$NON-NLS-2$
								"_UI_EEFViewDescription_type"), //$NON-NLS-1$
						EefPackage.Literals.EEF_VIEW_DESCRIPTION__IDENTIFIER, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Label Expression feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLabelExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_EEFViewDescription_labelExpression_feature"), //$NON-NLS-1$
						getString("_UI_PropertyDescriptor_description", //$NON-NLS-1$
								"_UI_EEFViewDescription_labelExpression_feature", "_UI_EEFViewDescription_type"), //$NON-NLS-1$ //$NON-NLS-2$
						EefPackage.Literals.EEF_VIEW_DESCRIPTION__LABEL_EXPRESSION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the EPackage Ns Uris feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEPackageNsUrisPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_EEFViewDescription_ePackageNsUris_feature"), //$NON-NLS-1$
						getString("_UI_PropertyDescriptor_description", "_UI_EEFViewDescription_ePackageNsUris_feature", //$NON-NLS-1$//$NON-NLS-2$
								"_UI_EEFViewDescription_type"), //$NON-NLS-1$
						EefPackage.Literals.EEF_VIEW_DESCRIPTION__EPACKAGE_NS_URIS, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Imported Views feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImportedViewsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_EEFViewDescription_importedViews_feature"), //$NON-NLS-1$
						getString("_UI_PropertyDescriptor_description", "_UI_EEFViewDescription_importedViews_feature", //$NON-NLS-1$//$NON-NLS-2$
								"_UI_EEFViewDescription_type"), //$NON-NLS-1$
						EefPackage.Literals.EEF_VIEW_DESCRIPTION__IMPORTED_VIEWS, true, false, true, null, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(EefPackage.Literals.EEF_VIEW_DESCRIPTION__GROUPS);
			childrenFeatures.add(EefPackage.Literals.EEF_VIEW_DESCRIPTION__PAGES);
			childrenFeatures.add(EefPackage.Literals.EEF_VIEW_DESCRIPTION__JAVA_EXTENSIONS);
			childrenFeatures.add(EefPackage.Literals.EEF_VIEW_DESCRIPTION__TREE_STRUCTURES);
			childrenFeatures.add(EefPackage.Literals.EEF_VIEW_DESCRIPTION__TABLE_STRUCTURES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns EEFViewDescription.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EEFViewDescription")); //$NON-NLS-1$
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((EEFViewDescription) object).getIdentifier();
		return label == null || label.length() == 0 ? getString("_UI_EEFViewDescription_type") //$NON-NLS-1$
				:
				getString("_UI_EEFViewDescription_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(EEFViewDescription.class)) {
		case EefPackage.EEF_VIEW_DESCRIPTION__IDENTIFIER:
		case EefPackage.EEF_VIEW_DESCRIPTION__LABEL_EXPRESSION:
		case EefPackage.EEF_VIEW_DESCRIPTION__EPACKAGE_NS_URIS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case EefPackage.EEF_VIEW_DESCRIPTION__GROUPS:
		case EefPackage.EEF_VIEW_DESCRIPTION__PAGES:
		case EefPackage.EEF_VIEW_DESCRIPTION__JAVA_EXTENSIONS:
		case EefPackage.EEF_VIEW_DESCRIPTION__TREE_STRUCTURES:
		case EefPackage.EEF_VIEW_DESCRIPTION__TABLE_STRUCTURES:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(EefPackage.Literals.EEF_VIEW_DESCRIPTION__GROUPS,
				EefFactory.eINSTANCE.createEEFGroupDescription()));

		newChildDescriptors.add(createChildParameter(EefPackage.Literals.EEF_VIEW_DESCRIPTION__PAGES,
				EefFactory.eINSTANCE.createEEFPageDescription()));

		newChildDescriptors.add(createChildParameter(EefPackage.Literals.EEF_VIEW_DESCRIPTION__JAVA_EXTENSIONS,
				EefFactory.eINSTANCE.createEEFJavaExtensionDescription()));

		newChildDescriptors.add(createChildParameter(EefPackage.Literals.EEF_VIEW_DESCRIPTION__TREE_STRUCTURES,
				EefFactory.eINSTANCE.createEEFAdapterFactoryTreeStructureDescription()));

		newChildDescriptors.add(createChildParameter(EefPackage.Literals.EEF_VIEW_DESCRIPTION__TREE_STRUCTURES,
				EefFactory.eINSTANCE.createEEFInterpretedTreeStructureDescription()));

		newChildDescriptors.add(createChildParameter(EefPackage.Literals.EEF_VIEW_DESCRIPTION__TABLE_STRUCTURES,
				EefFactory.eINSTANCE.createEEFInterpretedTableStructureDescription()));

		newChildDescriptors.add(createChildParameter(EefPackage.Literals.EEF_VIEW_DESCRIPTION__TABLE_STRUCTURES,
				EefFactory.eINSTANCE.createEEFAdapterFactoryTableStructureDescription()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == EefPackage.Literals.CONTEXTABLE_ELEMENT__REQUIRED_CONTEXT_VARIABLES
				|| childFeature == EefPackage.Literals.CONTEXTABLE_ELEMENT__EXCLUDED_CONTEXT_VARIABLES;

		if (qualify) {
			return getString("_UI_CreateChild_text2", //$NON-NLS-1$
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
