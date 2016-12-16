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
import org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula.EEFExtNebulaRichTextConditionalStyle;

/**
 * Switch used to compute the style of a widget style.
 *
 * @author arichard
 */
public class EEFExtNebulaConditionalStyleToWidgetStyleSwitch extends EefExtWidgetsNebulaSwitch<EEFWidgetStyle> {
	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula.util.EefExtWidgetsNebulaSwitch#caseEEFExtNebulaRichTextConditionalStyle(org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula.EEFExtNebulaRichTextConditionalStyle)
	 */
	@Override
	public EEFWidgetStyle caseEEFExtNebulaRichTextConditionalStyle(EEFExtNebulaRichTextConditionalStyle object) {
		return object.getStyle();
	}
}
