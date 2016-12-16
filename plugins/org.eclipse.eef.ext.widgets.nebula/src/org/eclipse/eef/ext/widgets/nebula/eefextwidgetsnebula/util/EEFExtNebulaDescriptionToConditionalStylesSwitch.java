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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.eef.EEFConditionalStyle;
import org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula.EEFExtNebulaRichTextDescription;

/**
 * Switch used to add support for the conditional styles of the nebula widgets.
 *
 * @author arichard
 */
public class EEFExtNebulaDescriptionToConditionalStylesSwitch
		extends EefExtWidgetsNebulaSwitch<List<EEFConditionalStyle>> {
	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula.util.EefExtWidgetsNebulaSwitch#caseEEFExtNebulaRichTextDescription(org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula.EEFExtNebulaRichTextDescription)
	 */
	@Override
	public List<EEFConditionalStyle> caseEEFExtNebulaRichTextDescription(EEFExtNebulaRichTextDescription object) {
		List<EEFConditionalStyle> styles = new ArrayList<EEFConditionalStyle>();
		styles.addAll(object.getConditionalStyles());
		return styles;
	}
}
