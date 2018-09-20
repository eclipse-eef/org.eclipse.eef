/*******************************************************************************
 * Copyright (c) 2015, 2018 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors: Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.eef.core.api;

import org.eclipse.eef.EEFViewDescription;
import org.eclipse.eef.core.internal.EEFDomainClassTester;
import org.eclipse.eef.core.internal.EEFViewImpl;
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
	 * @param contextAdapter
	 *            the editing context adapter.
	 * @param input
	 *            The input
	 * @return The {@link EEFView} fully initialized
	 */
	public EEFView createEEFView(EEFViewDescription eefViewDescription, IVariableManager variableManager, IInterpreter interpreter,
			EditingContextAdapter contextAdapter, InputDescriptor input) {
		return this.createEEFView(eefViewDescription, variableManager, interpreter, contextAdapter, new EEFDomainClassTester(), input);
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
	 * @param contextAdapter
	 *            the editing context adapter.
	 * @param domainClassTester
	 *            The domain class tester
	 * @param input
	 *            The input
	 * @return The {@link EEFView} fully initialized
	 */
	public EEFView createEEFView(EEFViewDescription eefViewDescription, IVariableManager variableManager, IInterpreter interpreter,
			EditingContextAdapter contextAdapter, IEEFDomainClassTester domainClassTester, InputDescriptor input) {
		EEFView eefView = new EEFViewImpl(eefViewDescription, variableManager, interpreter, contextAdapter, domainClassTester);
		eefView.setInput(input);
		eefView.initialize();
		return eefView;
	}
}
