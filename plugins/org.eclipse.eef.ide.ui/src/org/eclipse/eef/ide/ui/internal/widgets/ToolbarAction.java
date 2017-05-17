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
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;

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
		.map(EEFImageUtils::getImageDescriptor)
		.orElse(EEFImageUtils.getImageDescriptor(EEFIdeUiPlugin.getPlugin().getImageRegistry().get(Icons.PLACEHOLDER)))
		.ifPresent(this::setImageDescriptor);
		// @formatter:on
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
