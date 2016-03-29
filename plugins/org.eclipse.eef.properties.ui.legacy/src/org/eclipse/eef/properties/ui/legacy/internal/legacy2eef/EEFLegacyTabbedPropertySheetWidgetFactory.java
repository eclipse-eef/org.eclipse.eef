/*******************************************************************************
 * Copyright (c) 2015, 2016 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/

package org.eclipse.eef.properties.ui.legacy.internal.legacy2eef;

import org.eclipse.eef.common.ui.api.EEFWidgetFactory;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;

/**
 * Wraps an {@link TabbedPropertySheetWidgetFactory} to an {@link EEFTabbedPropertySheetWidgetFactory}.
 * 
 * @author mbats
 */
public class EEFLegacyTabbedPropertySheetWidgetFactory extends EEFWidgetFactory {

	/**
	 * The constructor.
	 * 
	 * @param widgetFactory
	 *            A legacy widget factory
	 */
	public EEFLegacyTabbedPropertySheetWidgetFactory(TabbedPropertySheetWidgetFactory widgetFactory) {
		// Do nothing
	}

}
