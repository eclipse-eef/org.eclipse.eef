/**
 * Copyright (c) Israel Aerospace Industries, Eclipse contributors and others 2021.
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *
 */

package org.eclipse.eef.ide.ui.ext.widgets.markup.internal;

import org.eclipse.eef.EEFControlDescription;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.ext.widgets.markup.MarkupWidgets.EEFExtHTMLRendererDescription;
import org.eclipse.eef.ide.ui.api.widgets.IEEFLifecycleManager;
import org.eclipse.eef.ide.ui.api.widgets.IEEFLifecycleManagerProvider;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;

public class HTMLLifeCycleManagerProvider implements IEEFLifecycleManagerProvider {

	@Override
	public boolean canHandle(EEFControlDescription controlDescription) {
		return controlDescription instanceof EEFExtHTMLRendererDescription;
	}

	@Override
	public IEEFLifecycleManager getLifecycleManager(EEFControlDescription controlDescription,
			IVariableManager variableManager, IInterpreter interpreter, EditingContextAdapter editingContextAdapter) {
		return new HTMLLifeCycleManager((EEFExtHTMLRendererDescription) controlDescription, variableManager,
				interpreter, editingContextAdapter);
	}

}
