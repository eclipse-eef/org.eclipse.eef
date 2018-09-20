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

import org.eclipse.eef.EEFButtonDescription;
import org.eclipse.eef.EEFCheckboxDescription;
import org.eclipse.eef.EEFHyperlinkDescription;
import org.eclipse.eef.EEFLabelDescription;
import org.eclipse.eef.EEFListDescription;
import org.eclipse.eef.EEFRadioDescription;
import org.eclipse.eef.EEFWidgetStyle;

/**
 * Utility class used to retrieve the style of a given widget.
 *
 * @author sbegaudeau
 */
public class EEFDescriptionToWidgetStyleSwitch extends EefSwitch<EEFWidgetStyle> {
	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.util.EefSwitch#caseEEFButtonDescription(org.eclipse.eef.EEFButtonDescription)
	 */
	@Override
	public EEFWidgetStyle caseEEFButtonDescription(EEFButtonDescription object) {
		return object.getStyle();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.util.EefSwitch#caseEEFCheckboxDescription(org.eclipse.eef.EEFCheckboxDescription)
	 */
	@Override
	public EEFWidgetStyle caseEEFCheckboxDescription(EEFCheckboxDescription object) {
		return object.getStyle();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.util.EefSwitch#caseEEFHyperlinkDescription(org.eclipse.eef.EEFHyperlinkDescription)
	 */
	@Override
	public EEFWidgetStyle caseEEFHyperlinkDescription(EEFHyperlinkDescription object) {
		return object.getStyle();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.util.EefSwitch#caseEEFLabelDescription(org.eclipse.eef.EEFLabelDescription)
	 */
	@Override
	public EEFWidgetStyle caseEEFLabelDescription(EEFLabelDescription object) {
		return object.getStyle();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.util.EefSwitch#caseEEFRadioDescription(org.eclipse.eef.EEFRadioDescription)
	 */
	@Override
	public EEFWidgetStyle caseEEFRadioDescription(EEFRadioDescription object) {
		return object.getStyle();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.util.EefSwitch#caseEEFSelectDescription(org.eclipse.eef.EEFSelectDescription)
	 */
	@Override
	public EEFWidgetStyle caseEEFSelectDescription(org.eclipse.eef.EEFSelectDescription object) {
		return object.getStyle();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.util.EefSwitch#caseEEFTextDescription(org.eclipse.eef.EEFTextDescription)
	 */
	@Override
	public EEFWidgetStyle caseEEFTextDescription(org.eclipse.eef.EEFTextDescription object) {
		return object.getStyle();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.util.EefSwitch#caseEEFListDescription(org.eclipse.eef.EEFListDescription)
	 */
	@Override
	public EEFWidgetStyle caseEEFListDescription(EEFListDescription object) {
		return object.getStyle();
	}
}
