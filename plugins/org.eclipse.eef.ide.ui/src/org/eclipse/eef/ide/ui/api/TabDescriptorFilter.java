/*******************************************************************************
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.eef.ide.ui.api;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.eef.EEFViewDescription;
import org.eclipse.eef.api.IEEFViewDescriptionProvider;
import org.eclipse.eef.core.api.EEFPage;
import org.eclipse.eef.core.api.EEFVariableManagerFactory;
import org.eclipse.eef.core.api.EEFView;
import org.eclipse.eef.core.api.EEFViewFactory;
import org.eclipse.eef.core.api.IVariableManager;
import org.eclipse.eef.ide.internal.EEFIdePlugin;
import org.eclipse.eef.ide.internal.extensions.IItemDescriptor;
import org.eclipse.eef.ide.internal.extensions.IItemRegistry;
import org.eclipse.eef.ide.ui.internal.properties.EEFTabDescriptor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.common.interpreter.api.IInterpreterProvider;
import org.eclipse.ui.views.properties.tabbed.ITabDescriptor;

/**
 * Utility class used to filter all the tab descriptors to use for the given {@link IEEFContext}.
 *
 * @author sbegaudeau
 */
public class TabDescriptorFilter {

	/**
	 * Returns the {@link ITabDescriptor} matching the given {@link IEEFContext}.
	 *
	 * @param objects
	 *            The input objects
	 * @param editingDomain
	 *            The editing domain
	 * @return The {@link ITabDescriptor} to use
	 */
	public List<ITabDescriptor> getTabDescriptors(final Object[] objects, TransactionalEditingDomain editingDomain) {
		List<EEFViewDescription> eefViewDescriptions = this.getEEFViewDescriptions();
		List<IInterpreterProvider> interpreterProviders = this.getInterprerProviders();

		List<ITabDescriptor> tabDescriptors = new ArrayList<ITabDescriptor>();
		if (eefViewDescriptions.size() > 0 && objects.length > 0 && objects[0] instanceof EObject) {
			EEFViewDescription eefViewDescription = eefViewDescriptions.get(0);
			EObject eObject = (EObject) objects[0];

			IVariableManager variableManager = new EEFVariableManagerFactory().createVariableManager();
			EEFView eefView = new EEFViewFactory().createEEFView(eefViewDescription, variableManager, interpreterProviders, editingDomain, eObject);

			List<EEFPage> eefPages = eefView.getPages();
			for (EEFPage eefPage : eefPages) {
				EEFTabDescriptor eefTabDescriptor = new EEFTabDescriptor(eefPage);
				tabDescriptors.add(eefTabDescriptor);
			}
		}

		return tabDescriptors;
	}

	/**
	 * Returns the list of all the available {@link EEFViewDescription}.
	 *
	 * @return The list of all the available {@link EEFViewDescription}.
	 */
	private List<EEFViewDescription> getEEFViewDescriptions() {
		List<EEFViewDescription> eefViewDescriptions = new ArrayList<EEFViewDescription>();

		List<IEEFViewDescriptionProvider> eefViewDescriptionProviders = new ArrayList<IEEFViewDescriptionProvider>();
		IItemRegistry<IEEFViewDescriptionProvider> eefViewDescriptionProviderRegistry = EEFIdePlugin.getImplementation()
				.getEEFViewDescriptionProviderRegistry();
		List<IItemDescriptor<IEEFViewDescriptionProvider>> itemDescriptors = eefViewDescriptionProviderRegistry.getItemDescriptors();
		for (IItemDescriptor<IEEFViewDescriptionProvider> itemDescriptor : itemDescriptors) {
			IEEFViewDescriptionProvider eefViewDescriptionProvider = itemDescriptor.getItem();
			eefViewDescriptionProviders.add(eefViewDescriptionProvider);
		}

		for (IEEFViewDescriptionProvider eefViewDescriptionProvider : eefViewDescriptionProviders) {
			eefViewDescriptions.add(eefViewDescriptionProvider.get());
		}

		return eefViewDescriptions;
	}

	/**
	 * Returns the list of all the available {@link IInterpreterProvider}.
	 *
	 * @return The list of all the available {@link IInterpreterProvider}
	 */
	private List<IInterpreterProvider> getInterprerProviders() {
		List<IInterpreterProvider> interpreterProviders = new ArrayList<IInterpreterProvider>();
		List<IItemDescriptor<IInterpreterProvider>> descriptors = EEFIdePlugin.getImplementation().getInterpreterProviderRegistry()
				.getItemDescriptors();
		for (IItemDescriptor<IInterpreterProvider> itemDescriptor : descriptors) {
			interpreterProviders.add(itemDescriptor.getItem());
		}
		return interpreterProviders;
	}
}
