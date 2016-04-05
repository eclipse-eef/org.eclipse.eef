/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.eef.util.EefAdapterFactory;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers. The adapters generated by this
 * factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}. The adapters
 * also support Eclipse property sheets. Note that most of the adapters are shared among multiple instances. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class EefItemProviderAdapterFactory extends EefAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EefItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.eef.EEFViewDescription} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EEFViewDescriptionItemProvider eefViewDescriptionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.eef.EEFViewDescription}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createEEFViewDescriptionAdapter() {
		if (eefViewDescriptionItemProvider == null) {
			eefViewDescriptionItemProvider = new EEFViewDescriptionItemProvider(this);
		}

		return eefViewDescriptionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.eef.EEFPageDescription} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EEFPageDescriptionItemProvider eefPageDescriptionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.eef.EEFPageDescription}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createEEFPageDescriptionAdapter() {
		if (eefPageDescriptionItemProvider == null) {
			eefPageDescriptionItemProvider = new EEFPageDescriptionItemProvider(this);
		}

		return eefPageDescriptionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.eef.EEFRuleAuditDescription} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EEFRuleAuditDescriptionItemProvider eefRuleAuditDescriptionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.eef.EEFRuleAuditDescription}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createEEFRuleAuditDescriptionAdapter() {
		if (eefRuleAuditDescriptionItemProvider == null) {
			eefRuleAuditDescriptionItemProvider = new EEFRuleAuditDescriptionItemProvider(this);
		}

		return eefRuleAuditDescriptionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.eef.EEFValidationFixDescription} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EEFValidationFixDescriptionItemProvider eefValidationFixDescriptionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.eef.EEFValidationFixDescription}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createEEFValidationFixDescriptionAdapter() {
		if (eefValidationFixDescriptionItemProvider == null) {
			eefValidationFixDescriptionItemProvider = new EEFValidationFixDescriptionItemProvider(this);
		}

		return eefValidationFixDescriptionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.eef.EEFPropertyValidationRuleDescription}
	 * instances. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EEFPropertyValidationRuleDescriptionItemProvider eefPropertyValidationRuleDescriptionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.eef.EEFPropertyValidationRuleDescription}. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createEEFPropertyValidationRuleDescriptionAdapter() {
		if (eefPropertyValidationRuleDescriptionItemProvider == null) {
			eefPropertyValidationRuleDescriptionItemProvider = new EEFPropertyValidationRuleDescriptionItemProvider(this);
		}

		return eefPropertyValidationRuleDescriptionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.eef.EEFSemanticValidationRuleDescription}
	 * instances. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EEFSemanticValidationRuleDescriptionItemProvider eefSemanticValidationRuleDescriptionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.eef.EEFSemanticValidationRuleDescription}. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createEEFSemanticValidationRuleDescriptionAdapter() {
		if (eefSemanticValidationRuleDescriptionItemProvider == null) {
			eefSemanticValidationRuleDescriptionItemProvider = new EEFSemanticValidationRuleDescriptionItemProvider(this);
		}

		return eefSemanticValidationRuleDescriptionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.eef.EEFGroupDescription} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EEFGroupDescriptionItemProvider eefGroupDescriptionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.eef.EEFGroupDescription}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createEEFGroupDescriptionAdapter() {
		if (eefGroupDescriptionItemProvider == null) {
			eefGroupDescriptionItemProvider = new EEFGroupDescriptionItemProvider(this);
		}

		return eefGroupDescriptionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.eef.EEFContainerDescription} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EEFContainerDescriptionItemProvider eefContainerDescriptionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.eef.EEFContainerDescription}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createEEFContainerDescriptionAdapter() {
		if (eefContainerDescriptionItemProvider == null) {
			eefContainerDescriptionItemProvider = new EEFContainerDescriptionItemProvider(this);
		}

		return eefContainerDescriptionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.eef.EEFFillLayoutDescription} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EEFFillLayoutDescriptionItemProvider eefFillLayoutDescriptionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.eef.EEFFillLayoutDescription}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createEEFFillLayoutDescriptionAdapter() {
		if (eefFillLayoutDescriptionItemProvider == null) {
			eefFillLayoutDescriptionItemProvider = new EEFFillLayoutDescriptionItemProvider(this);
		}

		return eefFillLayoutDescriptionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.eef.EEFGridLayoutDescription} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EEFGridLayoutDescriptionItemProvider eefGridLayoutDescriptionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.eef.EEFGridLayoutDescription}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createEEFGridLayoutDescriptionAdapter() {
		if (eefGridLayoutDescriptionItemProvider == null) {
			eefGridLayoutDescriptionItemProvider = new EEFGridLayoutDescriptionItemProvider(this);
		}

		return eefGridLayoutDescriptionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.eef.EEFTextDescription} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EEFTextDescriptionItemProvider eefTextDescriptionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.eef.EEFTextDescription}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createEEFTextDescriptionAdapter() {
		if (eefTextDescriptionItemProvider == null) {
			eefTextDescriptionItemProvider = new EEFTextDescriptionItemProvider(this);
		}

		return eefTextDescriptionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.eef.EEFLabelDescription} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EEFLabelDescriptionItemProvider eefLabelDescriptionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.eef.EEFLabelDescription}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createEEFLabelDescriptionAdapter() {
		if (eefLabelDescriptionItemProvider == null) {
			eefLabelDescriptionItemProvider = new EEFLabelDescriptionItemProvider(this);
		}

		return eefLabelDescriptionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.eef.EEFButtonDescription} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EEFButtonDescriptionItemProvider eefButtonDescriptionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.eef.EEFButtonDescription}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createEEFButtonDescriptionAdapter() {
		if (eefButtonDescriptionItemProvider == null) {
			eefButtonDescriptionItemProvider = new EEFButtonDescriptionItemProvider(this);
		}

		return eefButtonDescriptionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.eef.EEFCheckboxDescription} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EEFCheckboxDescriptionItemProvider eefCheckboxDescriptionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.eef.EEFCheckboxDescription}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createEEFCheckboxDescriptionAdapter() {
		if (eefCheckboxDescriptionItemProvider == null) {
			eefCheckboxDescriptionItemProvider = new EEFCheckboxDescriptionItemProvider(this);
		}

		return eefCheckboxDescriptionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.eef.EEFSelectDescription} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EEFSelectDescriptionItemProvider eefSelectDescriptionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.eef.EEFSelectDescription}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createEEFSelectDescriptionAdapter() {
		if (eefSelectDescriptionItemProvider == null) {
			eefSelectDescriptionItemProvider = new EEFSelectDescriptionItemProvider(this);
		}

		return eefSelectDescriptionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.eef.EEFRadioDescription} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EEFRadioDescriptionItemProvider eefRadioDescriptionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.eef.EEFRadioDescription}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createEEFRadioDescriptionAdapter() {
		if (eefRadioDescriptionItemProvider == null) {
			eefRadioDescriptionItemProvider = new EEFRadioDescriptionItemProvider(this);
		}

		return eefRadioDescriptionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.eef.EEFDynamicMappingFor} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EEFDynamicMappingForItemProvider eefDynamicMappingForItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.eef.EEFDynamicMappingFor}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createEEFDynamicMappingForAdapter() {
		if (eefDynamicMappingForItemProvider == null) {
			eefDynamicMappingForItemProvider = new EEFDynamicMappingForItemProvider(this);
		}

		return eefDynamicMappingForItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.eef.EEFDynamicMappingIf} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EEFDynamicMappingIfItemProvider eefDynamicMappingIfItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.eef.EEFDynamicMappingIf}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createEEFDynamicMappingIfAdapter() {
		if (eefDynamicMappingIfItemProvider == null) {
			eefDynamicMappingIfItemProvider = new EEFDynamicMappingIfItemProvider(this);
		}

		return eefDynamicMappingIfItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.eef.EEFCustomWidgetDescription} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EEFCustomWidgetDescriptionItemProvider eefCustomWidgetDescriptionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.eef.EEFCustomWidgetDescription}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createEEFCustomWidgetDescriptionAdapter() {
		if (eefCustomWidgetDescriptionItemProvider == null) {
			eefCustomWidgetDescriptionItemProvider = new EEFCustomWidgetDescriptionItemProvider(this);
		}

		return eefCustomWidgetDescriptionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.eef.EEFCustomExpression} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EEFCustomExpressionItemProvider eefCustomExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.eef.EEFCustomExpression}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createEEFCustomExpressionAdapter() {
		if (eefCustomExpressionItemProvider == null) {
			eefCustomExpressionItemProvider = new EEFCustomExpressionItemProvider(this);
		}

		return eefCustomExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.eef.EEFTextStyle} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EEFTextStyleItemProvider eefTextStyleItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.eef.EEFTextStyle}. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createEEFTextStyleAdapter() {
		if (eefTextStyleItemProvider == null) {
			eefTextStyleItemProvider = new EEFTextStyleItemProvider(this);
		}

		return eefTextStyleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.eef.EEFLabelStyle} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EEFLabelStyleItemProvider eefLabelStyleItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.eef.EEFLabelStyle}. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createEEFLabelStyleAdapter() {
		if (eefLabelStyleItemProvider == null) {
			eefLabelStyleItemProvider = new EEFLabelStyleItemProvider(this);
		}

		return eefLabelStyleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.eef.EEFButtonStyle} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EEFButtonStyleItemProvider eefButtonStyleItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.eef.EEFButtonStyle}. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createEEFButtonStyleAdapter() {
		if (eefButtonStyleItemProvider == null) {
			eefButtonStyleItemProvider = new EEFButtonStyleItemProvider(this);
		}

		return eefButtonStyleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.eef.EEFCheckboxStyle} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EEFCheckboxStyleItemProvider eefCheckboxStyleItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.eef.EEFCheckboxStyle}. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createEEFCheckboxStyleAdapter() {
		if (eefCheckboxStyleItemProvider == null) {
			eefCheckboxStyleItemProvider = new EEFCheckboxStyleItemProvider(this);
		}

		return eefCheckboxStyleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.eef.EEFSelectStyle} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EEFSelectStyleItemProvider eefSelectStyleItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.eef.EEFSelectStyle}. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createEEFSelectStyleAdapter() {
		if (eefSelectStyleItemProvider == null) {
			eefSelectStyleItemProvider = new EEFSelectStyleItemProvider(this);
		}

		return eefSelectStyleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.eef.EEFRadioStyle} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EEFRadioStyleItemProvider eefRadioStyleItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.eef.EEFRadioStyle}. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createEEFRadioStyleAdapter() {
		if (eefRadioStyleItemProvider == null) {
			eefRadioStyleItemProvider = new EEFRadioStyleItemProvider(this);
		}

		return eefRadioStyleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.eef.EEFCustomWidgetStyle} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EEFCustomWidgetStyleItemProvider eefCustomWidgetStyleItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.eef.EEFCustomWidgetStyle}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createEEFCustomWidgetStyleAdapter() {
		if (eefCustomWidgetStyleItemProvider == null) {
			eefCustomWidgetStyleItemProvider = new EEFCustomWidgetStyleItemProvider(this);
		}

		return eefCustomWidgetStyleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.eef.EEFTextConditionalStyle} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EEFTextConditionalStyleItemProvider eefTextConditionalStyleItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.eef.EEFTextConditionalStyle}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createEEFTextConditionalStyleAdapter() {
		if (eefTextConditionalStyleItemProvider == null) {
			eefTextConditionalStyleItemProvider = new EEFTextConditionalStyleItemProvider(this);
		}

		return eefTextConditionalStyleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.eef.EEFButtonConditionalStyle} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EEFButtonConditionalStyleItemProvider eefButtonConditionalStyleItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.eef.EEFButtonConditionalStyle}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createEEFButtonConditionalStyleAdapter() {
		if (eefButtonConditionalStyleItemProvider == null) {
			eefButtonConditionalStyleItemProvider = new EEFButtonConditionalStyleItemProvider(this);
		}

		return eefButtonConditionalStyleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.eef.EEFLabelConditionalStyle} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EEFLabelConditionalStyleItemProvider eefLabelConditionalStyleItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.eef.EEFLabelConditionalStyle}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createEEFLabelConditionalStyleAdapter() {
		if (eefLabelConditionalStyleItemProvider == null) {
			eefLabelConditionalStyleItemProvider = new EEFLabelConditionalStyleItemProvider(this);
		}

		return eefLabelConditionalStyleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.eef.EEFCheckboxConditionalStyle} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EEFCheckboxConditionalStyleItemProvider eefCheckboxConditionalStyleItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.eef.EEFCheckboxConditionalStyle}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createEEFCheckboxConditionalStyleAdapter() {
		if (eefCheckboxConditionalStyleItemProvider == null) {
			eefCheckboxConditionalStyleItemProvider = new EEFCheckboxConditionalStyleItemProvider(this);
		}

		return eefCheckboxConditionalStyleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.eef.EEFSelectConditionalStyle} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EEFSelectConditionalStyleItemProvider eefSelectConditionalStyleItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.eef.EEFSelectConditionalStyle}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createEEFSelectConditionalStyleAdapter() {
		if (eefSelectConditionalStyleItemProvider == null) {
			eefSelectConditionalStyleItemProvider = new EEFSelectConditionalStyleItemProvider(this);
		}

		return eefSelectConditionalStyleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.eef.EEFRadioConditionalStyle} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EEFRadioConditionalStyleItemProvider eefRadioConditionalStyleItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.eef.EEFRadioConditionalStyle}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createEEFRadioConditionalStyleAdapter() {
		if (eefRadioConditionalStyleItemProvider == null) {
			eefRadioConditionalStyleItemProvider = new EEFRadioConditionalStyleItemProvider(this);
		}

		return eefRadioConditionalStyleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.eef.EEFCustomWidgetConditionalStyle}
	 * instances. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EEFCustomWidgetConditionalStyleItemProvider eefCustomWidgetConditionalStyleItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.eef.EEFCustomWidgetConditionalStyle}. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createEEFCustomWidgetConditionalStyleAdapter() {
		if (eefCustomWidgetConditionalStyleItemProvider == null) {
			eefCustomWidgetConditionalStyleItemProvider = new EEFCustomWidgetConditionalStyleItemProvider(this);
		}

		return eefCustomWidgetConditionalStyleItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void dispose() {
		if (eefViewDescriptionItemProvider != null) {
			eefViewDescriptionItemProvider.dispose();
		}
		if (eefPageDescriptionItemProvider != null) {
			eefPageDescriptionItemProvider.dispose();
		}
		if (eefRuleAuditDescriptionItemProvider != null) {
			eefRuleAuditDescriptionItemProvider.dispose();
		}
		if (eefValidationFixDescriptionItemProvider != null) {
			eefValidationFixDescriptionItemProvider.dispose();
		}
		if (eefPropertyValidationRuleDescriptionItemProvider != null) {
			eefPropertyValidationRuleDescriptionItemProvider.dispose();
		}
		if (eefSemanticValidationRuleDescriptionItemProvider != null) {
			eefSemanticValidationRuleDescriptionItemProvider.dispose();
		}
		if (eefGroupDescriptionItemProvider != null) {
			eefGroupDescriptionItemProvider.dispose();
		}
		if (eefContainerDescriptionItemProvider != null) {
			eefContainerDescriptionItemProvider.dispose();
		}
		if (eefFillLayoutDescriptionItemProvider != null) {
			eefFillLayoutDescriptionItemProvider.dispose();
		}
		if (eefGridLayoutDescriptionItemProvider != null) {
			eefGridLayoutDescriptionItemProvider.dispose();
		}
		if (eefTextDescriptionItemProvider != null) {
			eefTextDescriptionItemProvider.dispose();
		}
		if (eefLabelDescriptionItemProvider != null) {
			eefLabelDescriptionItemProvider.dispose();
		}
		if (eefButtonDescriptionItemProvider != null) {
			eefButtonDescriptionItemProvider.dispose();
		}
		if (eefCheckboxDescriptionItemProvider != null) {
			eefCheckboxDescriptionItemProvider.dispose();
		}
		if (eefSelectDescriptionItemProvider != null) {
			eefSelectDescriptionItemProvider.dispose();
		}
		if (eefRadioDescriptionItemProvider != null) {
			eefRadioDescriptionItemProvider.dispose();
		}
		if (eefDynamicMappingForItemProvider != null) {
			eefDynamicMappingForItemProvider.dispose();
		}
		if (eefDynamicMappingIfItemProvider != null) {
			eefDynamicMappingIfItemProvider.dispose();
		}
		if (eefCustomWidgetDescriptionItemProvider != null) {
			eefCustomWidgetDescriptionItemProvider.dispose();
		}
		if (eefCustomExpressionItemProvider != null) {
			eefCustomExpressionItemProvider.dispose();
		}
		if (eefTextStyleItemProvider != null) {
			eefTextStyleItemProvider.dispose();
		}
		if (eefLabelStyleItemProvider != null) {
			eefLabelStyleItemProvider.dispose();
		}
		if (eefButtonStyleItemProvider != null) {
			eefButtonStyleItemProvider.dispose();
		}
		if (eefCheckboxStyleItemProvider != null) {
			eefCheckboxStyleItemProvider.dispose();
		}
		if (eefSelectStyleItemProvider != null) {
			eefSelectStyleItemProvider.dispose();
		}
		if (eefRadioStyleItemProvider != null) {
			eefRadioStyleItemProvider.dispose();
		}
		if (eefCustomWidgetStyleItemProvider != null) {
			eefCustomWidgetStyleItemProvider.dispose();
		}
		if (eefTextConditionalStyleItemProvider != null) {
			eefTextConditionalStyleItemProvider.dispose();
		}
		if (eefButtonConditionalStyleItemProvider != null) {
			eefButtonConditionalStyleItemProvider.dispose();
		}
		if (eefLabelConditionalStyleItemProvider != null) {
			eefLabelConditionalStyleItemProvider.dispose();
		}
		if (eefCheckboxConditionalStyleItemProvider != null) {
			eefCheckboxConditionalStyleItemProvider.dispose();
		}
		if (eefSelectConditionalStyleItemProvider != null) {
			eefSelectConditionalStyleItemProvider.dispose();
		}
		if (eefRadioConditionalStyleItemProvider != null) {
			eefRadioConditionalStyleItemProvider.dispose();
		}
		if (eefCustomWidgetConditionalStyleItemProvider != null) {
			eefCustomWidgetConditionalStyleItemProvider.dispose();
		}
	}

}
