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
package org.eclipse.eef.util;

import org.eclipse.eef.EEFButtonConditionalStyle;
import org.eclipse.eef.EEFCheckboxConditionalStyle;
import org.eclipse.eef.EEFHyperlinkConditionalStyle;
import org.eclipse.eef.EEFLabelConditionalStyle;
import org.eclipse.eef.EEFListConditionalStyle;
import org.eclipse.eef.EEFRadioConditionalStyle;
import org.eclipse.eef.EEFReferenceConditionalStyle;
import org.eclipse.eef.EEFSelectConditionalStyle;
import org.eclipse.eef.EEFTextConditionalStyle;
import org.eclipse.eef.EEFWidgetStyle;

/**
 * Utility class used to retrieve the style of a given conditional style.
 *
 * @author sbegaudeau
 */
public class EEFConditionalStyleToWidgetStyleSwitch extends EefSwitch<EEFWidgetStyle> {
	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.util.EefSwitch#caseEEFButtonConditionalStyle(org.eclipse.eef.EEFButtonConditionalStyle)
	 */
	@Override
	public EEFWidgetStyle caseEEFButtonConditionalStyle(EEFButtonConditionalStyle object) {
		return object.getStyle();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.util.EefSwitch#caseEEFCheckboxConditionalStyle(org.eclipse.eef.EEFCheckboxConditionalStyle)
	 */
	@Override
	public EEFWidgetStyle caseEEFCheckboxConditionalStyle(EEFCheckboxConditionalStyle object) {
		return object.getStyle();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.util.EefSwitch#caseEEFHyperlinkConditionalStyle(org.eclipse.eef.EEFHyperlinkConditionalStyle)
	 */
	@Override
	public EEFWidgetStyle caseEEFHyperlinkConditionalStyle(EEFHyperlinkConditionalStyle object) {
		return object.getStyle();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.util.EefSwitch#caseEEFLabelConditionalStyle(org.eclipse.eef.EEFLabelConditionalStyle)
	 */
	@Override
	public EEFWidgetStyle caseEEFLabelConditionalStyle(EEFLabelConditionalStyle object) {
		return object.getStyle();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.util.EefSwitch#caseEEFRadioConditionalStyle(org.eclipse.eef.EEFRadioConditionalStyle)
	 */
	@Override
	public EEFWidgetStyle caseEEFRadioConditionalStyle(EEFRadioConditionalStyle object) {
		return object.getStyle();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.util.EefSwitch#caseEEFReferenceConditionalStyle(org.eclipse.eef.EEFReferenceConditionalStyle)
	 */
	@Override
	public EEFWidgetStyle caseEEFReferenceConditionalStyle(EEFReferenceConditionalStyle object) {
		return object.getStyle();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.util.EefSwitch#caseEEFSelectConditionalStyle(org.eclipse.eef.EEFSelectConditionalStyle)
	 */
	@Override
	public EEFWidgetStyle caseEEFSelectConditionalStyle(EEFSelectConditionalStyle object) {
		return object.getStyle();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.util.EefSwitch#caseEEFTextConditionalStyle(org.eclipse.eef.EEFTextConditionalStyle)
	 */
	@Override
	public EEFWidgetStyle caseEEFTextConditionalStyle(EEFTextConditionalStyle object) {
		return object.getStyle();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.util.EefSwitch#caseEEFListConditionalStyle(org.eclipse.eef.EEFListConditionalStyle)
	 */
	@Override
	public EEFWidgetStyle caseEEFListConditionalStyle(EEFListConditionalStyle object) {
		return object.getStyle();
	}
}
