/*******************************************************************************
 * Copyright (c) 2015, 2016 Obeo.
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
	 *            The {@link IInterpreter} to use for dynamic expressions
	 * @param editingDomain
	 *            The editing domain
	 * @param input
	 *            The input
	 * @return The {@link EEFView} fully initialized
	 */
	public EEFView createEEFView(EEFViewDescription eefViewDescription, IVariableManager variableManager, IInterpreter interpreter,
			TransactionalEditingDomain editingDomain, InputDescriptor input) {
		return this.createEEFView(eefViewDescription, variableManager, interpreter, editingDomain, new EEFDomainClassTester(), input);
	}

	/**
	 * Creates a new {@link EEFView} from the given {@link EEFViewDescription} and the {@link IEEFContext}.
	 *
	 * @param eefViewDescription
	 *            The description of the {@link EEFView}
	 * @param variableManager
	 *            The variable manager
	 * @param interpreter
	 *            The {@link IInterpreter} to use for dynamic expressions
	 * @param editingDomain
	 *            The editing domain
	 * @param domainClassTester
	 *            The domain class tester
	 * @param input
	 *            The input
	 * @return The {@link EEFView} fully initialized
	 */
	public EEFView createEEFView(EEFViewDescription eefViewDescription, IVariableManager variableManager, IInterpreter interpreter,
			TransactionalEditingDomain editingDomain, EEFDomainClassTester domainClassTester, InputDescriptor input) {
		EEFView eefView = new EEFViewImpl(eefViewDescription, variableManager, interpreter, editingDomain, domainClassTester);
		eefView.setInput(input);
		eefView.initialize();
		return eefView;
	}
}
