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
package org.eclipse.eef.uml.editor.sample.internal.description;

import java.util.List;

import org.eclipse.eef.EEFViewDescription;
import org.eclipse.eef.api.IEEFViewDescriptionProvider;
import org.eclipse.eef.uml.editor.sample.internal.UmlSamplePlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

/**
 * This class returns the EEFViewDescription for the custom UML editor.
 *
 * @author sbegaudeau
 */
public class EEFViewDescriptionProvider implements IEEFViewDescriptionProvider {

	/**
	 * The path of the EEF description model.
	 */
	private static final String MODEL_PATH = UmlSamplePlugin.PLUGIN_ID + "/description/EEFViewDescription.xmi"; //$NON-NLS-1$

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.api.IEEFViewDescriptionProvider#get()
	 */
	@Override
	public EEFViewDescription get() {
		EEFViewDescription eefViewDescription = null;

		ResourceSet resourceSet = new ResourceSetImpl();
		URI uri = URI.createPlatformPluginURI(MODEL_PATH, true);
		Resource resource = resourceSet.getResource(uri, true);
		if (resource != null) {
			List<EObject> contents = resource.getContents();
			if (contents.size() > 0 && contents.get(0) instanceof EEFViewDescription) {
				eefViewDescription = (EEFViewDescription) contents.get(0);
			}
		}

		return eefViewDescription;
	}

}
