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

import java.util.Collection;

import org.eclipse.eef.EEFToolbarAction;
import org.eclipse.eef.core.api.controllers.IEEFToolbarActionController;
import org.eclipse.eef.core.api.utils.EvalFactory;
import org.eclipse.eef.ide.ui.internal.EEFIdeUiPlugin;
import org.eclipse.eef.ide.ui.internal.Icons;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuCreator;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.swt.SWTException;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;

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
	 * The interpreter.
	 */
	private IInterpreter interpreter;

	/**
	 * The variable manager.
	 */
	private IVariableManager variableManager;

	/**
	 * The menu creator (can be null).
	 */
	private IMenuCreator menuCreator;

	/**
	 * Constructor.
	 *
	 * @param eefToolbarAction
	 *            the {@link EEFToolbarAction} that provides tooltip, image and behavior for this Action.
	 * @param style
	 *            the style of the Action (IAction.AS_PUSH_BUTTON, or IAction.AS_DROP_DOWN_MENU).
	 * @param controller
	 *            The controller.
	 * @param interpreter
	 *            Interpreter.
	 * @param variableManager
	 *            Variable manager.
	 */
	public ToolbarAction(EEFToolbarAction eefToolbarAction, int style, IEEFToolbarActionController controller, IInterpreter interpreter,
			IVariableManager variableManager) {
		super(null, style);
		this.eefToolbarAction = eefToolbarAction;
		this.controller = controller;
		this.interpreter = interpreter;
		this.variableManager = variableManager;

		String tooltipExpression = eefToolbarAction.getTooltipExpression();
		String actionTooltip = EvalFactory.of(interpreter, variableManager).logIfInvalidType(String.class).evaluate(tooltipExpression);
		if (isSubAction(eefToolbarAction)) {
			this.setText(actionTooltip);
		} else {
			this.setToolTipText(actionTooltip);
		}

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

		if (!eefToolbarAction.getSubActions().isEmpty()) {
			this.menuCreator = new ToolbarActionMenu(eefToolbarAction.getSubActions());
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
			this.controller.action(this.eefToolbarAction);
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.jface.action.Action#getMenuCreator()
	 */
	@Override
	public IMenuCreator getMenuCreator() {
		return this.menuCreator;
	}

	/**
	 * Check if this action is a sub-action.
	 *
	 * @param action
	 *            the given {@link EEFToolbarAction}.
	 * @return <code>true</code> if the given action is a sub-action, <code>false</code> otherwise.
	 */
	protected boolean isSubAction(EEFToolbarAction action) {
		if (action != null && action.eContainer() instanceof EEFToolbarAction) {
			return true;
		}
		return false;
	}

	/**
	 * The menu containg the potential sub-actions of this action.
	 *
	 * @author arichard
	 *
	 */
	protected class ToolbarActionMenu implements IMenuCreator {

		/**
		 * The list of {@link EEFToolbarAction}s that will be part of this menu.
		 */
		private Collection<EEFToolbarAction> subActions;

		/**
		 * The menu containing the save as template/query actions.
		 */
		private Menu menu;

		/**
		 * Constructor.
		 *
		 * @param subActions
		 *            the list of {@link EEFToolbarAction}s that will be part of this menu.
		 */
		public ToolbarActionMenu(Collection<EEFToolbarAction> subActions) {
			this.subActions = subActions;
		}

		/**
		 * {@inheritDoc}
		 *
		 * @see org.eclipse.jface.action.IMenuCreator#dispose()
		 */
		@Override
		public void dispose() {
			// nothing to do
		}

		/**
		 * {@inheritDoc}
		 *
		 * @see org.eclipse.jface.action.IMenuCreator#getMenu(org.eclipse.swt.widgets.Control)
		 */
		@Override
		public Menu getMenu(Control parent) {
			if (this.menu != null) {
				this.menu.dispose();
			}
			this.menu = new Menu(parent);
			for (EEFToolbarAction eefToolbarSubAction : subActions) {
				int style = IAction.AS_PUSH_BUTTON;
				if (!eefToolbarSubAction.getSubActions().isEmpty()) {
					style = IAction.AS_DROP_DOWN_MENU;
				}
				ToolbarAction subAction = new ToolbarAction(eefToolbarSubAction, style, ToolbarAction.this.controller, ToolbarAction.this.interpreter,
						ToolbarAction.this.variableManager);
				addActionToMenu(this.menu, subAction);
			}
			return this.menu;
		}

		/**
		 * {@inheritDoc}
		 *
		 * @see org.eclipse.jface.action.IMenuCreator#getMenu(org.eclipse.swt.widgets.Menu)
		 */
		@Override
		public Menu getMenu(Menu parent) {
			if (this.menu != null) {
				this.menu.dispose();
			}
			this.menu = new Menu(parent);
			for (EEFToolbarAction eefToolbarSubAction : subActions) {
				ToolbarAction subAction = new ToolbarAction(eefToolbarSubAction, IAction.AS_PUSH_BUTTON, ToolbarAction.this.controller,
						ToolbarAction.this.interpreter, ToolbarAction.this.variableManager);
				addActionToMenu(this.menu, subAction);
			}
			return this.menu;
		}

		/**
		 * Adds the given action to the given menu.
		 *
		 * @param parent
		 *            The menu
		 * @param action
		 *            The action to be added
		 */
		protected void addActionToMenu(Menu parent, Action action) {
			ActionContributionItem item = new ActionContributionItem(action);
			item.fill(parent, -1);
		}

	}
}
