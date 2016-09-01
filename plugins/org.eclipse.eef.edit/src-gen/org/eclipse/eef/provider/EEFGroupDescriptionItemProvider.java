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

import org.eclipse.eef.EEFGroupDescription;
import org.eclipse.eef.EefFactory;
import org.eclipse.eef.EefPackage;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.eef.EEFGroupDescription} object. <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class EEFGroupDescriptionItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider, IStructuredItemContentProvider,
ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EEFGroupDescriptionItemProvider(AdapterFactory adapterFactory) {
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

			addIdentifierPropertyDescriptor(object);
			addLabelExpressionPropertyDescriptor(object);
			addDomainClassPropertyDescriptor(object);
			addSemanticCandidateExpressionPropertyDescriptor(object);
			addPreconditionExpressionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Identifier feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addIdentifierPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(), getString("_UI_EEFGroupDescription_identifier_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_EEFGroupDescription_identifier_feature", "_UI_EEFGroupDescription_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				EefPackage.Literals.EEF_GROUP_DESCRIPTION__IDENTIFIER, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Label Expression feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addLabelExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_EEFGroupDescription_labelExpression_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_EEFGroupDescription_labelExpression_feature", "_UI_EEFGroupDescription_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				EefPackage.Literals.EEF_GROUP_DESCRIPTION__LABEL_EXPRESSION, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
				null));
	}

	/**
	 * This adds a property descriptor for the Domain Class feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addDomainClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(), getString("_UI_EEFGroupDescription_domainClass_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_EEFGroupDescription_domainClass_feature", "_UI_EEFGroupDescription_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				EefPackage.Literals.EEF_GROUP_DESCRIPTION__DOMAIN_CLASS, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Semantic Candidate Expression feature. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addSemanticCandidateExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
		.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_EEFGroupDescription_semanticCandidateExpression_feature"), //$NON-NLS-1$
				getString(
						"_UI_PropertyDescriptor_description", "_UI_EEFGroupDescription_semanticCandidateExpression_feature", "_UI_EEFGroupDescription_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						EefPackage.Literals.EEF_GROUP_DESCRIPTION__SEMANTIC_CANDIDATE_EXPRESSION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Precondition Expression feature. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addPreconditionExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
		.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_EEFGroupDescription_preconditionExpression_feature"), //$NON-NLS-1$
				getString(
						"_UI_PropertyDescriptor_description", "_UI_EEFGroupDescription_preconditionExpression_feature", "_UI_EEFGroupDescription_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						EefPackage.Literals.EEF_GROUP_DESCRIPTION__PRECONDITION_EXPRESSION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
			childrenFeatures.add(EefPackage.Literals.EEF_GROUP_DESCRIPTION__CONTROLS);
			childrenFeatures.add(EefPackage.Literals.EEF_GROUP_DESCRIPTION__SEMANTIC_VALIDATION_RULES);
			childrenFeatures.add(EefPackage.Literals.EEF_GROUP_DESCRIPTION__PROPERTY_VALIDATION_RULES);
			childrenFeatures.add(EefPackage.Literals.EEF_GROUP_DESCRIPTION__STYLE);
			childrenFeatures.add(EefPackage.Literals.EEF_GROUP_DESCRIPTION__CONDITIONAL_STYLES);
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
	 * This returns EEFGroupDescription.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EEFGroupDescription")); //$NON-NLS-1$
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
		String label = ((EEFGroupDescription) object).getIdentifier();
		return label == null || label.length() == 0 ? getString("_UI_EEFGroupDescription_type") : //$NON-NLS-1$
			getString("_UI_EEFGroupDescription_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(EEFGroupDescription.class)) {
		case EefPackage.EEF_GROUP_DESCRIPTION__IDENTIFIER:
		case EefPackage.EEF_GROUP_DESCRIPTION__LABEL_EXPRESSION:
		case EefPackage.EEF_GROUP_DESCRIPTION__DOMAIN_CLASS:
		case EefPackage.EEF_GROUP_DESCRIPTION__SEMANTIC_CANDIDATE_EXPRESSION:
		case EefPackage.EEF_GROUP_DESCRIPTION__PRECONDITION_EXPRESSION:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case EefPackage.EEF_GROUP_DESCRIPTION__CONTROLS:
		case EefPackage.EEF_GROUP_DESCRIPTION__SEMANTIC_VALIDATION_RULES:
		case EefPackage.EEF_GROUP_DESCRIPTION__PROPERTY_VALIDATION_RULES:
		case EefPackage.EEF_GROUP_DESCRIPTION__STYLE:
		case EefPackage.EEF_GROUP_DESCRIPTION__CONDITIONAL_STYLES:
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

		newChildDescriptors.add(createChildParameter(EefPackage.Literals.EEF_GROUP_DESCRIPTION__CONTROLS,
				EefFactory.eINSTANCE.createEEFContainerDescription()));

		newChildDescriptors.add(createChildParameter(EefPackage.Literals.EEF_GROUP_DESCRIPTION__CONTROLS,
				EefFactory.eINSTANCE.createEEFTextDescription()));

		newChildDescriptors.add(createChildParameter(EefPackage.Literals.EEF_GROUP_DESCRIPTION__CONTROLS,
				EefFactory.eINSTANCE.createEEFLabelDescription()));

		newChildDescriptors.add(createChildParameter(EefPackage.Literals.EEF_GROUP_DESCRIPTION__CONTROLS,
				EefFactory.eINSTANCE.createEEFButtonDescription()));

		newChildDescriptors.add(createChildParameter(EefPackage.Literals.EEF_GROUP_DESCRIPTION__CONTROLS,
				EefFactory.eINSTANCE.createEEFCheckboxDescription()));

		newChildDescriptors.add(createChildParameter(EefPackage.Literals.EEF_GROUP_DESCRIPTION__CONTROLS,
				EefFactory.eINSTANCE.createEEFSelectDescription()));

		newChildDescriptors.add(createChildParameter(EefPackage.Literals.EEF_GROUP_DESCRIPTION__CONTROLS,
				EefFactory.eINSTANCE.createEEFRadioDescription()));

		newChildDescriptors.add(createChildParameter(EefPackage.Literals.EEF_GROUP_DESCRIPTION__CONTROLS,
				EefFactory.eINSTANCE.createEEFHyperlinkDescription()));

		newChildDescriptors.add(createChildParameter(EefPackage.Literals.EEF_GROUP_DESCRIPTION__CONTROLS,
				EefFactory.eINSTANCE.createEEFDynamicMappingFor()));

		newChildDescriptors.add(createChildParameter(EefPackage.Literals.EEF_GROUP_DESCRIPTION__CONTROLS,
				EefFactory.eINSTANCE.createEEFCustomWidgetDescription()));

		newChildDescriptors.add(createChildParameter(EefPackage.Literals.EEF_GROUP_DESCRIPTION__CONTROLS,
				EefFactory.eINSTANCE.createEEFReferenceDescription()));

		newChildDescriptors.add(createChildParameter(EefPackage.Literals.EEF_GROUP_DESCRIPTION__SEMANTIC_VALIDATION_RULES,
				EefFactory.eINSTANCE.createEEFSemanticValidationRuleDescription()));

		newChildDescriptors.add(createChildParameter(EefPackage.Literals.EEF_GROUP_DESCRIPTION__PROPERTY_VALIDATION_RULES,
				EefFactory.eINSTANCE.createEEFPropertyValidationRuleDescription()));

		newChildDescriptors.add(createChildParameter(EefPackage.Literals.EEF_GROUP_DESCRIPTION__STYLE, EefFactory.eINSTANCE.createEEFGroupStyle()));

		newChildDescriptors.add(createChildParameter(EefPackage.Literals.EEF_GROUP_DESCRIPTION__CONDITIONAL_STYLES,
				EefFactory.eINSTANCE.createEEFGroupConditionalStyle()));
	}

	/**
	 * Return the resource locator for this item provider's resources. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ((IChildCreationExtender) adapterFactory).getResourceLocator();
	}

}
