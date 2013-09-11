/*******************************************************************************
 * Copyright (c) 2008, 2012 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.settings.providers;

import org.eclipse.emf.common.notify.Adapter;

import org.eclipse.emf.eef.mapping.settings.util.SettingsAdapterFactory;

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class SettingsEEFAdapterFactory extends SettingsAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.mapping.settings.util.SettingsAdapterFactory#createEReferenceViewerSettingsAdapter()
	 * 
	 */
	public Adapter createEReferenceViewerSettingsAdapter() {
		return new EReferenceViewerSettingsPropertiesEditionProvider();
	}

}
