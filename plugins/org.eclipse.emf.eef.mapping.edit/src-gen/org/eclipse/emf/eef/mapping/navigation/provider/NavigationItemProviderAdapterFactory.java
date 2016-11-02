/*******************************************************************************
 * Copyright (c) 2008, 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.mapping.navigation.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ChildCreationExtenderManager;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.eef.mapping.navigation.NavigationPackage;
import org.eclipse.emf.eef.mapping.navigation.util.NavigationAdapterFactory;
import org.eclipse.emf.eef.mapping.provider.MappingEditPlugin;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NavigationItemProviderAdapterFactory extends
		NavigationAdapterFactory implements ComposeableAdapterFactory,
		IChangeNotifier, IDisposable, IChildCreationExtender {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This helps manage the child creation extenders.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChildCreationExtenderManager childCreationExtenderManager = new ChildCreationExtenderManager(
			MappingEditPlugin.INSTANCE, NavigationPackage.eNS_URI);

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavigationItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emf.eef.mapping.navigation.SimpleModelNavigation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleModelNavigationItemProvider simpleModelNavigationItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emf.eef.mapping.navigation.SimpleModelNavigation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSimpleModelNavigationAdapter() {
		if (simpleModelNavigationItemProvider == null) {
			simpleModelNavigationItemProvider = new SimpleModelNavigationItemProvider(
					this);
		}

		return simpleModelNavigationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emf.eef.mapping.navigation.ChainedModelNavigation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChainedModelNavigationItemProvider chainedModelNavigationItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emf.eef.mapping.navigation.ChainedModelNavigation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createChainedModelNavigationAdapter() {
		if (chainedModelNavigationItemProvider == null) {
			chainedModelNavigationItemProvider = new ChainedModelNavigationItemProvider(
					this);
		}

		return chainedModelNavigationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emf.eef.mapping.navigation.CustomModelNavigation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomModelNavigationItemProvider customModelNavigationItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emf.eef.mapping.navigation.CustomModelNavigation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCustomModelNavigationAdapter() {
		if (customModelNavigationItemProvider == null) {
			customModelNavigationItemProvider = new CustomModelNavigationItemProvider(
					this);
		}

		return customModelNavigationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emf.eef.mapping.navigation.SmartModelNavigation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SmartModelNavigationItemProvider smartModelNavigationItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emf.eef.mapping.navigation.SmartModelNavigation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSmartModelNavigationAdapter() {
		if (smartModelNavigationItemProvider == null) {
			smartModelNavigationItemProvider = new SmartModelNavigationItemProvider(
					this);
		}

		return smartModelNavigationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emf.eef.mapping.navigation.DeclarativeNavigationStep} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeclarativeNavigationStepItemProvider declarativeNavigationStepItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emf.eef.mapping.navigation.DeclarativeNavigationStep}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeclarativeNavigationStepAdapter() {
		if (declarativeNavigationStepItemProvider == null) {
			declarativeNavigationStepItemProvider = new DeclarativeNavigationStepItemProvider(
					this);
		}

		return declarativeNavigationStepItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emf.eef.mapping.navigation.JavaBodyExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaBodyExpressionItemProvider javaBodyExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emf.eef.mapping.navigation.JavaBodyExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createJavaBodyExpressionAdapter() {
		if (javaBodyExpressionItemProvider == null) {
			javaBodyExpressionItemProvider = new JavaBodyExpressionItemProvider(
					this);
		}

		return javaBodyExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emf.eef.mapping.navigation.JavaDeclarationStepInitializer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaDeclarationStepInitializerItemProvider javaDeclarationStepInitializerItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emf.eef.mapping.navigation.JavaDeclarationStepInitializer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createJavaDeclarationStepInitializerAdapter() {
		if (javaDeclarationStepInitializerItemProvider == null) {
			javaDeclarationStepInitializerItemProvider = new JavaDeclarationStepInitializerItemProvider(
					this);
		}

		return javaDeclarationStepInitializerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emf.eef.mapping.navigation.JavaBodyStepInitializer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaBodyStepInitializerItemProvider javaBodyStepInitializerItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emf.eef.mapping.navigation.JavaBodyStepInitializer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createJavaBodyStepInitializerAdapter() {
		if (javaBodyStepInitializerItemProvider == null) {
			javaBodyStepInitializerItemProvider = new JavaBodyStepInitializerItemProvider(
					this);
		}

		return javaBodyStepInitializerItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory
				.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(
			ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>)
					|| (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<IChildCreationExtender> getChildCreationExtenders() {
		return childCreationExtenderManager.getChildCreationExtenders();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection<?> getNewChildDescriptors(Object object,
			EditingDomain editingDomain) {
		return childCreationExtenderManager.getNewChildDescriptors(object,
				editingDomain);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return childCreationExtenderManager;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (simpleModelNavigationItemProvider != null)
			simpleModelNavigationItemProvider.dispose();
		if (chainedModelNavigationItemProvider != null)
			chainedModelNavigationItemProvider.dispose();
		if (customModelNavigationItemProvider != null)
			customModelNavigationItemProvider.dispose();
		if (smartModelNavigationItemProvider != null)
			smartModelNavigationItemProvider.dispose();
		if (declarativeNavigationStepItemProvider != null)
			declarativeNavigationStepItemProvider.dispose();
		if (javaBodyExpressionItemProvider != null)
			javaBodyExpressionItemProvider.dispose();
		if (javaDeclarationStepInitializerItemProvider != null)
			javaDeclarationStepInitializerItemProvider.dispose();
		if (javaBodyStepInitializerItemProvider != null)
			javaBodyStepInitializerItemProvider.dispose();
	}

}