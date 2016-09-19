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
package org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.util;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.eef.EEFConditionalStyle;
import org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.EEFExtReferenceDescription;

/**
 * Switch used to add support for the conditional styles of the reference widget.
 *
 * @author sbegaudeau
 */
public class EEFExtDescriptionToConditionalStylesSwitch extends EefExtWidgetsReferenceSwitch<List<EEFConditionalStyle>> {
	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.util.EefExtWidgetsReferenceSwitch#caseEEFExtReferenceDescription(org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.EEFExtReferenceDescription)
	 */
	@Override
	public List<EEFConditionalStyle> caseEEFExtReferenceDescription(EEFExtReferenceDescription object) {
		List<EEFConditionalStyle> styles = new ArrayList<EEFConditionalStyle>();
		styles.addAll(object.getConditionalStyles());
		return styles;
	}
}
