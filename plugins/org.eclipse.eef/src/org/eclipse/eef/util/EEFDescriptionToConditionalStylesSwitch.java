/*******************************************************************************
 * Copyright (c) 2015, 2018 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors: Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.eef.util;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.eef.EEFButtonDescription;
import org.eclipse.eef.EEFCheckboxDescription;
import org.eclipse.eef.EEFConditionalStyle;
import org.eclipse.eef.EEFHyperlinkDescription;
import org.eclipse.eef.EEFLabelDescription;
import org.eclipse.eef.EEFListDescription;
import org.eclipse.eef.EEFRadioDescription;
import org.eclipse.eef.EEFSelectDescription;
import org.eclipse.eef.EEFTextDescription;
import org.eclipse.emf.ecore.EObject;

/**
 * Utility class used to retrieve the conditional styles of a widget.
 *
 * @author sbegaudeau
 */
public class EEFDescriptionToConditionalStylesSwitch extends EefSwitch<List<EEFConditionalStyle>> {

	/**
	 * Returns a list with the given conditional styles.
	 *
	 * @param conditionalStyles
	 *            The conditional styles
	 * @return The list of the conditional styles
	 */
	private List<EEFConditionalStyle> asConditionalStyleList(List<? extends EEFConditionalStyle> conditionalStyles) {
		List<EEFConditionalStyle> styles = new ArrayList<EEFConditionalStyle>();
		styles.addAll(conditionalStyles);
		return styles;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.util.EefSwitch#defaultCase(org.eclipse.emf.ecore.EObject)
	 */
	@Override
	public List<EEFConditionalStyle> defaultCase(EObject object) {
		return new ArrayList<EEFConditionalStyle>();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.util.EefSwitch#caseEEFButtonDescription(org.eclipse.eef.EEFButtonDescription)
	 */
	@Override
	public List<EEFConditionalStyle> caseEEFButtonDescription(EEFButtonDescription object) {
		return this.asConditionalStyleList(object.getConditionalStyles());
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.util.EefSwitch#caseEEFCheckboxDescription(org.eclipse.eef.EEFCheckboxDescription)
	 */
	@Override
	public List<EEFConditionalStyle> caseEEFCheckboxDescription(EEFCheckboxDescription object) {
		return this.asConditionalStyleList(object.getConditionalStyles());
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.util.EefSwitch#caseEEFHyperlinkDescription(org.eclipse.eef.EEFHyperlinkDescription)
	 */
	@Override
	public List<EEFConditionalStyle> caseEEFHyperlinkDescription(EEFHyperlinkDescription object) {
		return this.asConditionalStyleList(object.getConditionalStyles());
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.util.EefSwitch#caseEEFLabelDescription(org.eclipse.eef.EEFLabelDescription)
	 */
	@Override
	public List<EEFConditionalStyle> caseEEFLabelDescription(EEFLabelDescription object) {
		return this.asConditionalStyleList(object.getConditionalStyles());
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.util.EefSwitch#caseEEFRadioDescription(org.eclipse.eef.EEFRadioDescription)
	 */
	@Override
	public List<EEFConditionalStyle> caseEEFRadioDescription(EEFRadioDescription object) {
		return this.asConditionalStyleList(object.getConditionalStyles());
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.util.EefSwitch#caseEEFSelectDescription(org.eclipse.eef.EEFSelectDescription)
	 */
	@Override
	public List<EEFConditionalStyle> caseEEFSelectDescription(EEFSelectDescription object) {
		return this.asConditionalStyleList(object.getConditionalStyles());
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.util.EefSwitch#caseEEFTextDescription(org.eclipse.eef.EEFTextDescription)
	 */
	@Override
	public List<EEFConditionalStyle> caseEEFTextDescription(EEFTextDescription object) {
		return this.asConditionalStyleList(object.getConditionalStyles());
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.util.EefSwitch#caseEEFListDescription(org.eclipse.eef.EEFListDescription)
	 */
	@Override
	public List<EEFConditionalStyle> caseEEFListDescription(EEFListDescription object) {
		return this.asConditionalStyleList(object.getConditionalStyles());
	}
}
