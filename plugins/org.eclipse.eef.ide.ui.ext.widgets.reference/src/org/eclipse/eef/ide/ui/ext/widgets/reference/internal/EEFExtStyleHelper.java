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
package org.eclipse.eef.ide.ui.ext.widgets.reference.internal;

import java.util.Arrays;
import java.util.List;

import org.eclipse.eef.EEFConditionalStyle;
import org.eclipse.eef.EEFWidgetStyle;
import org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.util.EEFExtConditionalStyleToWidgetStyleSwitch;
import org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.util.EEFExtDescriptionToConditionalStylesSwitch;
import org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.util.EEFExtDescriptionToWidgetStyleSwitch;
import org.eclipse.eef.ide.ui.api.widgets.EEFStyleHelper;
import org.eclipse.eef.util.EEFConditionalStyleToWidgetStyleSwitch;
import org.eclipse.eef.util.EEFDescriptionToConditionalStylesSwitch;
import org.eclipse.eef.util.EEFDescriptionToWidgetStyleSwitch;
import org.eclipse.emf.ecore.util.ComposedSwitch;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;

/**
 * Custom version of the {@link EEFStyleHelper} in order to add support for the style and conditional styles of the
 * reference widget.
 *
 * @author sbegaudeau
 */
public class EEFExtStyleHelper extends EEFStyleHelper {

	/**
	 * The constructor.
	 *
	 * @param interpreter
	 *            The interpeter
	 * @param variableManager
	 *            The variable manager
	 */
	public EEFExtStyleHelper(IInterpreter interpreter, IVariableManager variableManager) {
		super(interpreter, variableManager);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.EEFStyleHelper#getDescriptionToWidgetStyleSwitch()
	 */
	@Override
	protected Switch<EEFWidgetStyle> getDescriptionToWidgetStyleSwitch() {
		return new ComposedSwitch<>(Arrays.asList(new EEFDescriptionToWidgetStyleSwitch(), new EEFExtDescriptionToWidgetStyleSwitch()));
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.EEFStyleHelper#getDescriptionToConditionalStylesSwitch()
	 */
	@Override
	protected Switch<List<EEFConditionalStyle>> getDescriptionToConditionalStylesSwitch() {
		return new ComposedSwitch<>(Arrays.asList(new EEFDescriptionToConditionalStylesSwitch(), new EEFExtDescriptionToConditionalStylesSwitch()));
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.EEFStyleHelper#getConditionalStyleToWidgetStyleSwitch()
	 */
	@Override
	protected Switch<EEFWidgetStyle> getConditionalStyleToWidgetStyleSwitch() {
		return new ComposedSwitch<>(Arrays.asList(new EEFConditionalStyleToWidgetStyleSwitch(), new EEFExtConditionalStyleToWidgetStyleSwitch()));
	}
}
