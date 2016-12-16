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
package org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula.util;

import org.eclipse.eef.EEFWidgetStyle;
import org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula.EEFExtNebulaRichTextDescription;

/**
 * Custom switch used to add support for the nebula widgets styles.
 *
 * @author arichard
 */
public class EEFExtNebulaDescriptionToWidgetStyleSwitch extends EefExtWidgetsNebulaSwitch<EEFWidgetStyle> {
	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula.util.EefExtWidgetsNebulaSwitch#caseEEFExtNebulaRichTextDescription(org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula.EEFExtNebulaRichTextDescription)
	 */
	@Override
	public EEFWidgetStyle caseEEFExtNebulaRichTextDescription(EEFExtNebulaRichTextDescription object) {
		return object.getStyle();
	}
}
