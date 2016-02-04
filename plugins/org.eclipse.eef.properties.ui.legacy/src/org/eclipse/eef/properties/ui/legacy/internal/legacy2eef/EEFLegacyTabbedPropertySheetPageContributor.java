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

package org.eclipse.eef.properties.ui.legacy.internal.legacy2eef;

import org.eclipse.eef.properties.ui.api.IEEFTabbedPropertySheetPageContributor;

/**
 * Wraps a TabbedPropertySheetPage contributor to an {@link IEEFTabbedPropertySheetPageContributor}.
 * 
 * @author mbats
 */
public class EEFLegacyTabbedPropertySheetPageContributor implements IEEFTabbedPropertySheetPageContributor {

	@Override
	public String getContributorId() {
		return null; // no issue here... in theory :)
	}

}
