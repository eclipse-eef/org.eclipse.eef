/*******************************************************************************
 * Copyright (c) 2017, 2018 Obeo.
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

import java.util.Collection;
import java.util.Optional;

import org.eclipse.eef.EEFToolbarAction;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.controllers.IEEFToolbarActionController;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.ToolBar;

/**
 * Implementations of this interface will be used to handle the lifecycle of the toolbars.
 *
 * @author mbats
 */
public interface IEEFToolbarLifecycleManager {
	/**
	 * Populate a tool bar with actions.
	 *
	 * @param toolBarManager
	 *            The toolbar manager to populate
	 * @param actions
	 *            The actions
	 * @param controller
	 *            The controller
	 * @param editingContextAdapter
	 *            The editing context adapter
	 * @param interpreter
	 *            The interpreter
	 * @param variableManager
	 *            The variable manager
	 */
	default void populateToolBar(IToolBarManager toolBarManager, Collection<EEFToolbarAction> actions, IEEFToolbarActionController controller,
			EditingContextAdapter editingContextAdapter, IInterpreter interpreter, IVariableManager variableManager) {
		if (toolBarManager instanceof ToolBarManager) {
			// For an unknown reason, the existing tool bar of the formContainer doesn't have a transparent background.
			ToolBar toolBar = ((ToolBarManager) toolBarManager).getControl();
			toolBar.setBackground(Display.getCurrent().getSystemColor(SWT.COLOR_TRANSPARENT));
		}

		Optional.ofNullable(toolBarManager).ifPresent(manager -> {
			manager.removeAll();

			actions.forEach(action -> {
				ToolbarAction toolbarAction = new ToolbarAction(action, controller, editingContextAdapter, interpreter, variableManager);
				manager.add(toolbarAction);
			});

			manager.update(true);
		});
	}
}
