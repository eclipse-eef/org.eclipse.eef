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

import org.eclipse.eef.EEFViewDescription;
import org.eclipse.eef.core.internal.EEFViewImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;

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
	 * @param interpreter
	 *            The {@link IInterpreter} to use for dynamic expressions.
	 * @param editingDomain
	 *            The editing domain
	 * @param eObject
	 *            The input
	 * @return The {@link EEFView} fully initialized
	 */
	public EEFView createEEFView(EEFViewDescription eefViewDescription, IVariableManager variableManager, IInterpreter interpreter,
			TransactionalEditingDomain editingDomain, EObject eObject) {
		EEFView eefView = new EEFViewImpl(eefViewDescription, variableManager, interpreter, editingDomain);
		eefView.setInput(eObject);
		eefView.initialize();
		return eefView;
	}
}
