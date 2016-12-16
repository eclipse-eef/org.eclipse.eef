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
package org.eclipse.eef.ide.ui.ext.widgets.nebula.internal;

import org.eclipse.eef.EEFControlDescription;
import org.eclipse.eef.common.api.utils.Util;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula.EEFExtNebulaRichTextDescription;
import org.eclipse.eef.ide.ui.api.widgets.IEEFLifecycleManager;
import org.eclipse.eef.ide.ui.api.widgets.IEEFLifecycleManagerProvider;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;

/**
 * The lifecycle manager provider is used to create a lifecycle manager for the Nebula RichText widget.
 *
 * @author arichard
 */
public class EEFExtNebulaRichTextLifecycleManagerProvider implements IEEFLifecycleManagerProvider {

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.IEEFLifecycleManagerProvider#canHandle(org.eclipse.eef.EEFControlDescription)
	 */
	@Override
	public boolean canHandle(EEFControlDescription controlDescription) {
		return controlDescription instanceof EEFExtNebulaRichTextDescription;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.IEEFLifecycleManagerProvider#getLifecycleManager(org.eclipse.eef.EEFControlDescription,
	 *      org.eclipse.sirius.common.interpreter.api.IVariableManager,
	 *      org.eclipse.sirius.common.interpreter.api.IInterpreter, org.eclipse.eef.core.api.EditingContextAdapter)
	 */
	@Override
	public IEEFLifecycleManager getLifecycleManager(EEFControlDescription controlDescription, IVariableManager variableManager,
			IInterpreter interpreter, EditingContextAdapter contextAdapter) {
		if (!(controlDescription instanceof EEFExtNebulaRichTextDescription)
				|| Util.isBlank(((EEFExtNebulaRichTextDescription) controlDescription).getValueExpression())) {
			return null;
		}

		EEFExtNebulaRichTextDescription description = (EEFExtNebulaRichTextDescription) controlDescription;
		IEEFLifecycleManager lifecycleManager = new EEFExtNebulaRichTextLifecycleManager(description, variableManager, interpreter, contextAdapter);

		return lifecycleManager;
	}

}
