/*******************************************************************************
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.eef.core.api;

import java.util.List;

import org.eclipse.eef.EEFViewDescription;
import org.eclipse.eef.core.internal.EEFCompoundInterpreter;
import org.eclipse.eef.core.internal.EEFViewImpl;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.common.interpreter.api.IInterpreterProvider;

/**
 * The factory used to create the {@link EEFView}.
 *
 * @author sbegaudeau
 */
public class EEFViewFactory {
	/**
	 * Creates a new {@link EEFView} from the given {@link EEFViewDescription} and the {@link IEEFContext}.
	 *
	 * @param eefViewDescription
	 *            The description of the {@link EEFView}
	 * @param variableManager
	 *            The variable manager
	 * @param interpreterProviders
	 *            The {@link IInterpreterProvider} available
	 * @param editingDomain
	 *            The editing domain
	 * @return The {@link EEFView} fully initialized
	 */
	public EEFView createEEFView(EEFViewDescription eefViewDescription, IVariableManager variableManager,
			List<IInterpreterProvider> interpreterProviders, TransactionalEditingDomain editingDomain) {
		EEFView eefView = new EEFViewImpl(eefViewDescription, variableManager, new EEFCompoundInterpreter(interpreterProviders), editingDomain);
		eefView.createControl();
		return eefView;
	}
}
