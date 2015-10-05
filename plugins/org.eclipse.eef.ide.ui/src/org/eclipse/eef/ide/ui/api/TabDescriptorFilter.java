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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.eef.EEFViewDescription;
import org.eclipse.eef.api.IEEFViewDescriptionProvider;
import org.eclipse.eef.core.api.EEFPage;
import org.eclipse.eef.core.api.EEFView;
import org.eclipse.eef.core.api.EEFViewFactory;
import org.eclipse.eef.core.api.IEEFContext;
import org.eclipse.eef.core.api.IVariableManager;
import org.eclipse.eef.ide.internal.EEFIdePlugin;
import org.eclipse.eef.ide.internal.extensions.IItemDescriptor;
import org.eclipse.eef.ide.internal.extensions.IItemRegistry;
import org.eclipse.eef.ide.ui.internal.data.EEFTabDescriptor;
import org.eclipse.eef.interpreter.api.IInterpreterProvider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
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
	 * @return The {@link ITabDescriptor} to use
	 */
	public List<ITabDescriptor> getTabDescriptors(final Object[] objects) {
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

		List<ITabDescriptor> tabDescriptors = new ArrayList<ITabDescriptor>();
		if (eefViewDescriptions.size() > 0) {
			EEFViewDescription eefViewDescription = eefViewDescriptions.get(0);

			IEEFContext context = new IEEFContext() {

				@Override
				public IVariableManager getVariableManager() {
					return new IVariableManager() {

						@Override
						public Map<String, Object> getVariables() {
							Map<String, Object> variables = new HashMap<String, Object>();
							variables.put("viewSemanticCandidate", objects[0]); //$NON-NLS-1$
							return variables;
						}
					};
				}

				@Override
				public Iterable<EPackage> getEPackages() {
					List<EPackage> ePackages = new ArrayList<EPackage>();
					if (objects[0] instanceof EObject) {
						EObject eObject = (EObject) objects[0];
						ePackages.add(eObject.eClass().getEPackage());
					}
					return ePackages;
				}

				@Override
				public List<IInterpreterProvider> getInterpreterProviders() {
					List<IInterpreterProvider> providers = new ArrayList<IInterpreterProvider>();
					List<IItemDescriptor<IInterpreterProvider>> descriptors = EEFIdePlugin.getImplementation().getInterpreterProviderRegistry()
							.getItemDescriptors();
					for (IItemDescriptor<IInterpreterProvider> itemDescriptor : descriptors) {
						providers.add(itemDescriptor.getItem());
					}
					return providers;
				}
			};
			EEFView eefView = new EEFViewFactory().createEEFView(eefViewDescription, context);

			List<EEFPage> eefPages = eefView.getPages();
			for (EEFPage eefPage : eefPages) {
				EEFTabDescriptor eefTabDescriptor = new EEFTabDescriptor(eefPage);
				tabDescriptors.add(eefTabDescriptor);
			}
		}

		return tabDescriptors;
	}
}
