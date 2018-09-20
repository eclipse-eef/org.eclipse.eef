/*******************************************************************************
 * Copyright (c) 2016, 2018 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors: Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.util;

import org.eclipse.eef.EEFWidgetStyle;
import org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.EEFExtReferenceDescription;

/**
 * Custom switch used to add support for the reference widget style.
 *
 * @author sbegaudeau
 */
public class EEFExtDescriptionToWidgetStyleSwitch extends EefExtWidgetsReferenceSwitch<EEFWidgetStyle> {
	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.util.EefExtWidgetsReferenceSwitch#caseEEFExtReferenceDescription(org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.EEFExtReferenceDescription)
	 */
	@Override
	public EEFWidgetStyle caseEEFExtReferenceDescription(EEFExtReferenceDescription object) {
		return object.getStyle();
	}
}
