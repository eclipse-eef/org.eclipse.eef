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
package org.eclipse.eef.tests.internal.controllers;

import java.util.Map;

import org.eclipse.eef.EEFTextDescription;
import org.eclipse.eef.EefFactory;
import org.eclipse.eef.core.api.EEFVariableManagerFactory;
import org.eclipse.eef.core.api.IVariableManager;
import org.eclipse.eef.core.api.controllers.EEFTextController;
import org.eclipse.eef.core.internal.controllers.EEFTextControllerImpl;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.transaction.impl.TransactionalEditingDomainImpl;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Unit tests for the {@link EEFTextController}.
 *
 * @author sbegaudeau
 */
@SuppressWarnings({ "checkstyle:javadocmethod" })
public class EEFTextControllerTests {
	/**
	 * The editing domain.
	 */
	private TransactionalEditingDomainImpl editingDomain;

	/**
	 * The description.
	 */
	private EEFTextDescription description;

	/**
	 * The variable manager.
	 */
	private IVariableManager variableManager;

	@Before
	public void setUp() {
		AdapterFactory adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		this.editingDomain = new TransactionalEditingDomainImpl(adapterFactory);
		this.variableManager = new EEFVariableManagerFactory().createVariableManager();

		this.description = EefFactory.eINSTANCE.createEEFTextDescription();

		this.description.setLabelExpression("aql:'General'"); //$NON-NLS-1$
		this.description.setValueExpression("aql:self.name"); //$NON-NLS-1$
		this.description.setEditExpression("aql.self.eSet('name', newValue)"); //$NON-NLS-1$
	}

	@Test
	public void testUpdateValue() {
		final String newValue = "newValue"; //$NON-NLS-1$

		IInterpreter interpreter = (Map<String, Object> variables, String expressionBody) -> {
			return new EvaluationResult(newValue);
		};

		EEFTextController controller = new EEFTextControllerImpl(description, variableManager, interpreter, editingDomain);
		controller.onNewValue((text) -> {
			assertThat(text, equalTo(newValue));
		});

		controller.refresh();
	}

	@Test
	public void testUpdateLabel() {
		final String newLabel = "Label"; //$NON-NLS-1$

		IInterpreter interpreter = (Map<String, Object> variables, String expressionBody) -> {
			return new EvaluationResult(newLabel);
		};

		EEFTextController controller = new EEFTextControllerImpl(description, variableManager, interpreter, editingDomain);
		controller.onNewLabel((label) -> {
			assertThat(label, equalTo(newLabel));
		});

		controller.refresh();
	}
}
