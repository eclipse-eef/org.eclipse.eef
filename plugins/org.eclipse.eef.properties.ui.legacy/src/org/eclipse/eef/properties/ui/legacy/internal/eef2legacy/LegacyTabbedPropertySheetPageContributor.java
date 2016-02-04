/*******************************************************************************
 * Copyright (c) 2016 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.eef.properties.ui.legacy.internal.eef2legacy;

import org.eclipse.eef.properties.ui.api.IEEFTabbedPropertySheetPageContributor;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;

/**
 * Wraps an {@link IEEFTabbedPropertySheetPageContributor} to a {@link ITabbedPropertySheetPageContributor}.
 * 
 * @author mbats
 */
public class LegacyTabbedPropertySheetPageContributor implements ITabbedPropertySheetPageContributor {

	/**
	 * The EEF tabbed property sheet page contributor.
	 */
	private IEEFTabbedPropertySheetPageContributor eefTabbedPropertySheetPageContributor;

	/**
	 * The constructor.
	 * 
	 * @param eefTabbedPropertySheetPageContributor
	 *            EEF tabbed property sheet page contributor
	 */
	public LegacyTabbedPropertySheetPageContributor(IEEFTabbedPropertySheetPageContributor eefTabbedPropertySheetPageContributor) {
		this.eefTabbedPropertySheetPageContributor = eefTabbedPropertySheetPageContributor;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see ITabbedPropertySheetPageContributor#getContributorId()
	 */
	@Override
	public String getContributorId() {
		return this.eefTabbedPropertySheetPageContributor.getContributorId();
	}

}
