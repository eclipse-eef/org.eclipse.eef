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
package org.eclipse.eef.core.internal;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.eef.EEFContainerDescription;
import org.eclipse.eef.EEFTextDescription;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.core.api.EEFContainer;
import org.eclipse.eef.core.api.EEFWidget;

/**
 * Implementation of the {@link EEFContainer}.
 *
 * @author sbegaudeau
 */
public class EEFContainerImpl implements EEFContainer {

	/**
	 * The description.
	 */
	private EEFContainerDescription eefContainerDescription;

	/**
	 * The constructor.
	 *
	 * @param eefContainerDescription
	 *            The description
	 */
	public EEFContainerImpl(EEFContainerDescription eefContainerDescription) {
		this.eefContainerDescription = eefContainerDescription;
	}

	@Override
	public EEFContainerDescription getDescription() {
		return this.eefContainerDescription;
	}

	@Override
	public List<EEFWidget> getWidgets() {
		List<EEFWidget> eWidgets = new ArrayList<EEFWidget>();
		List<EEFWidgetDescription> eefWidgetDescriptions = this.eefContainerDescription.getWidgets();
		for (EEFWidgetDescription eefWidgetDescription : eefWidgetDescriptions) {
			if (eefWidgetDescription instanceof EEFTextDescription) {
				EEFTextDescription eefTextDescription = (EEFTextDescription) eefWidgetDescription;
				eWidgets.add(new EEFTextImpl(eefTextDescription));
			}
		}
		return eWidgets;
	}

}
