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

import org.eclipse.eef.eef.EEFPageDescription;
import org.eclipse.eef.eef.EefPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.eef.eef.EEFPageDescription} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EEFPageDescriptionItemProvider extends ContextableElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEFPageDescriptionItemProvider(AdapterFactory adapterFactory) {
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
			addDomainClassPropertyDescriptor(object);
			addSemanticCandidateExpressionPropertyDescriptor(object);
			addGroupsPropertyDescriptor(object);
			addExtendedPagePropertyDescriptor(object);
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
						getResourceLocator(), getString("_UI_EEFPageDescription_identifier_feature"), //$NON-NLS-1$
						getString("_UI_PropertyDescriptor_description", "_UI_EEFPageDescription_identifier_feature", //$NON-NLS-1$//$NON-NLS-2$
								"_UI_EEFPageDescription_type"), //$NON-NLS-1$
						EefPackage.Literals.EEF_PAGE_DESCRIPTION__IDENTIFIER, true, false, false,
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
						getResourceLocator(), getString("_UI_EEFPageDescription_labelExpression_feature"), //$NON-NLS-1$
						getString("_UI_PropertyDescriptor_description", //$NON-NLS-1$
								"_UI_EEFPageDescription_labelExpression_feature", "_UI_EEFPageDescription_type"), //$NON-NLS-1$ //$NON-NLS-2$
						EefPackage.Literals.EEF_PAGE_DESCRIPTION__LABEL_EXPRESSION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Domain Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_EEFPageDescription_domainClass_feature"), //$NON-NLS-1$
						getString("_UI_PropertyDescriptor_description", "_UI_EEFPageDescription_domainClass_feature", //$NON-NLS-1$//$NON-NLS-2$
								"_UI_EEFPageDescription_type"), //$NON-NLS-1$
						EefPackage.Literals.EEF_PAGE_DESCRIPTION__DOMAIN_CLASS, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Semantic Candidate Expression feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSemanticCandidateExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_EEFPageDescription_semanticCandidateExpression_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", //$NON-NLS-1$
						"_UI_EEFPageDescription_semanticCandidateExpression_feature", "_UI_EEFPageDescription_type"), //$NON-NLS-1$ //$NON-NLS-2$
				EefPackage.Literals.EEF_PAGE_DESCRIPTION__SEMANTIC_CANDIDATE_EXPRESSION, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Groups feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGroupsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_EEFPageDescription_groups_feature"), //$NON-NLS-1$
						getString("_UI_PropertyDescriptor_description", "_UI_EEFPageDescription_groups_feature", //$NON-NLS-1$//$NON-NLS-2$
								"_UI_EEFPageDescription_type"), //$NON-NLS-1$
						EefPackage.Literals.EEF_PAGE_DESCRIPTION__GROUPS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Extended Page feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExtendedPagePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_EEFPageDescription_extendedPage_feature"), //$NON-NLS-1$
						getString("_UI_PropertyDescriptor_description", "_UI_EEFPageDescription_extendedPage_feature", //$NON-NLS-1$//$NON-NLS-2$
								"_UI_EEFPageDescription_type"), //$NON-NLS-1$
						EefPackage.Literals.EEF_PAGE_DESCRIPTION__EXTENDED_PAGE, true, false, true, null, null, null));
	}

	/**
	 * This returns EEFPageDescription.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EEFPageDescription")); //$NON-NLS-1$
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
		String label = ((EEFPageDescription) object).getIdentifier();
		return label == null || label.length() == 0 ? getString("_UI_EEFPageDescription_type") //$NON-NLS-1$
				:
				getString("_UI_EEFPageDescription_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(EEFPageDescription.class)) {
		case EefPackage.EEF_PAGE_DESCRIPTION__IDENTIFIER:
		case EefPackage.EEF_PAGE_DESCRIPTION__LABEL_EXPRESSION:
		case EefPackage.EEF_PAGE_DESCRIPTION__DOMAIN_CLASS:
		case EefPackage.EEF_PAGE_DESCRIPTION__SEMANTIC_CANDIDATE_EXPRESSION:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
