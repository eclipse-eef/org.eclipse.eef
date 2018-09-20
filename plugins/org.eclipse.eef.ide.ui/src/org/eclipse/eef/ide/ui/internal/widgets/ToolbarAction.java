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
package org.eclipse.eef.ide.ui.internal.widgets;

import java.util.Optional;

import org.eclipse.eef.EEFToolbarAction;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.controllers.IEEFToolbarActionController;
import org.eclipse.eef.core.api.utils.EvalFactory;
import org.eclipse.eef.ide.ui.internal.EEFIdeUiPlugin;
import org.eclipse.eef.ide.ui.internal.EEFImageUtils;
import org.eclipse.eef.ide.ui.internal.Icons;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.swt.graphics.Image;

/**
 * An {@link Action} taking tooltip, image and behavior from an {@link EEFToolbarAction}.
 *
 * @author arichard
 *
 */
public class ToolbarAction extends Action {

	/**
	 * The {@link EEFToolbarAction} that provides tooltip, image and behavior for this Action.
	 */
	private EEFToolbarAction eefToolbarAction;

	/**
	 * The controller.
	 */
	private IEEFToolbarActionController controller;

	/**
	 * The editing context adapter.
	 */
	private EditingContextAdapter editingContextAdapter;

	/**
	 * The interpreter.
	 */
	private IInterpreter interpreter;

	/**
	 * The variable manager.
	 */
	private IVariableManager variableManager;

	/**
	 * Constructor.
	 *
	 * @param eefToolbarAction
	 *            the {@link EEFToolbarAction} that provides tooltip, image and behavior for this Action.
	 * @param controller
	 *            The controller.
	 * @param editingContextAdapter
	 *            The editing context adapter.
	 * @param interpreter
	 *            Interpreter.
	 * @param variableManager
	 *            Variable manager.
	 */
	public ToolbarAction(EEFToolbarAction eefToolbarAction, IEEFToolbarActionController controller, EditingContextAdapter editingContextAdapter,
			IInterpreter interpreter, IVariableManager variableManager) {
		super(null, IAction.AS_PUSH_BUTTON);
		this.eefToolbarAction = eefToolbarAction;
		this.controller = controller;
		this.editingContextAdapter = editingContextAdapter;
		this.interpreter = interpreter;
		this.variableManager = variableManager;

		String tooltipExpression = eefToolbarAction.getTooltipExpression();
		String actionTooltip = EvalFactory.of(interpreter, variableManager).logIfInvalidType(String.class).evaluate(tooltipExpression);
		this.setToolTipText(actionTooltip);

		String imageExpression = Optional.ofNullable(this.eefToolbarAction.getImageExpression()).orElse(""); //$NON-NLS-1$
		Object imagePath = EvalFactory.of(interpreter, variableManager).logIfInvalidType(Object.class).evaluate(imageExpression);

		// @formatter:off
		Optional.ofNullable(imagePath)
			.filter(String.class::isInstance)
			.map(String.class::cast)
			.map(this::computeImageDescriptor)
			.ifPresent(this::setImageDescriptor);
		// @formatter:on
	}

	/**
	 * Computes the image descriptor to use for the given image path.
	 *
	 * @param imagePath
	 *            The path of the image
	 * @return The image descriptor for the image with the given path or a placeholder image if it could not be found
	 */
	private ImageDescriptor computeImageDescriptor(String imagePath) {
		return EEFImageUtils.getImageDescriptor(imagePath).orElseGet(() -> {
			Image placeholderImage = EEFIdeUiPlugin.getPlugin().getImageRegistry().get(Icons.PLACEHOLDER);
			return ImageDescriptor.createFromImage(placeholderImage);
		});
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.jface.action.Action#run()
	 */
	@Override
	public void run() {
		this.controller.action(this.eefToolbarAction, this.editingContextAdapter, this.interpreter, this.variableManager);
	}
}
