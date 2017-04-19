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

import org.eclipse.eef.EEFToolbarAction;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.controllers.IEEFToolbarActionController;
import org.eclipse.eef.core.api.utils.EvalFactory;
import org.eclipse.eef.ide.ui.internal.EEFIdeUiPlugin;
import org.eclipse.eef.ide.ui.internal.Icons;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.swt.SWTException;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

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

		// TODO To rewrite when patchset about image management will be integrated
		String imageExpression = eefToolbarAction.getImageExpression();
		Object actionImage = EvalFactory.of(interpreter, variableManager).logIfInvalidType(Object.class).evaluate(imageExpression);
		try {
			ImageDescriptor imageDescriptor = null;
			if (actionImage instanceof String) {
				imageDescriptor = ImageDescriptor.createFromImage(new Image(Display.getCurrent(), (String) actionImage));
			} else {
				imageDescriptor = ExtendedImageRegistry.INSTANCE.getImageDescriptor(actionImage);
			}
			if (imageDescriptor == null) {
				imageDescriptor = EEFIdeUiPlugin.getPlugin().getImageDescriptor(Icons.PLACEHOLDER);
			}
			this.setImageDescriptor(imageDescriptor);
		} catch (IllegalArgumentException | SWTException e) {
			EEFIdeUiPlugin.getPlugin().error(e.getMessage(), e);
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.jface.action.Action#run()
	 */
	@Override
	public void run() {
		if (this.controller != null) {
			this.controller.action(this.eefToolbarAction, this.editingContextAdapter, this.interpreter, this.variableManager);
		}
	}
}
