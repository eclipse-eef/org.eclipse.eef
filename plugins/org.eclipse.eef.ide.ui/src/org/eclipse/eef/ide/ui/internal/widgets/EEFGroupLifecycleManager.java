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

import com.google.common.base.Objects;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.eef.EEFContainerDescription;
import org.eclipse.eef.EEFGroupDescription;
import org.eclipse.eef.common.ui.api.EEFWidgetFactory;
import org.eclipse.eef.common.ui.api.IEEFFormContainer;
import org.eclipse.eef.core.api.EditionContextAdapter;
import org.eclipse.eef.core.api.controllers.EEFControllersFactory;
import org.eclipse.eef.core.api.controllers.IConsumer;
import org.eclipse.eef.core.api.controllers.IEEFController;
import org.eclipse.eef.core.api.controllers.IEEFGroupController;
import org.eclipse.eef.core.api.utils.Eval;
import org.eclipse.eef.ide.ui.api.ILifecycleManager;
import org.eclipse.eef.ide.ui.api.widgets.AbstractEEFLifecycleManager;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.forms.widgets.Section;

/**
 * This class will be used in order ot manager the lifecycle of an {@link EEFGroupDescription}.
 *
 * @author sbegaudeau
 */
public class EEFGroupLifecycleManager extends AbstractEEFLifecycleManager {

	/**
	 * The variable manager.
	 */
	private IVariableManager variableManager;

	/**
	 * The interpreter.
	 */
	private IInterpreter interpreter;

	/**
	 * The editing context adapter.
	 */
	private EditionContextAdapter eca;

	/**
	 * The description of the container.
	 */
	private EEFGroupDescription description;

	/**
	 * The lifecycle managers of the child of the container.
	 */
	private List<ILifecycleManager> lifecycleManagers = new ArrayList<ILifecycleManager>();

	/**
	 * The controller.
	 */
	private IEEFGroupController controller;

	/**
	 * The section.
	 */
	private Section section;

	/**
	 * The constructor.
	 *
	 * @param description
	 *            The description of the group
	 * @param variableManager
	 *            The variable manager
	 * @param interpreter
	 *            The interpreter
	 * @param eca
	 *            The editing context adapter
	 */
	public EEFGroupLifecycleManager(EEFGroupDescription description, IVariableManager variableManager, IInterpreter interpreter,
			EditionContextAdapter eca) {
		this.description = description;
		this.variableManager = variableManager;
		this.interpreter = interpreter;
		this.eca = eca;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFLifecycleManager#createControl(org.eclipse.swt.widgets.Composite,
	 *      org.eclipse.eef.common.ui.api.IEEFFormContainer)
	 */
	@Override
	public void createControl(Composite parent, IEEFFormContainer formContainer) {
		super.createControl(parent, formContainer);

		EEFWidgetFactory widgetFactory = formContainer.getWidgetFactory();

		Composite groupComposite = widgetFactory.createComposite(parent);
		groupComposite.setLayout(new GridLayout(1, false));

		this.section = widgetFactory.createSection(groupComposite, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		this.section.setText(""); //$NON-NLS-1$

		String labelExpression = this.description.getLabelExpression();
		new Eval(this.interpreter, this.variableManager).call(labelExpression, String.class, new IConsumer<String>() {
			@Override
			public void apply(String value) {
				EEFGroupLifecycleManager.this.section.setText(Objects.firstNonNull(value, "")); //$NON-NLS-1$
			}
		});

		GridData sectionLayoutData = new GridData(GridData.FILL_HORIZONTAL);
		sectionLayoutData.horizontalSpan = 1;
		this.section.setLayoutData(sectionLayoutData);
		Composite group = widgetFactory.createComposite(this.section);
		GridLayout groupLayout = new GridLayout();
		groupLayout.numColumns = 1;
		group.setLayout(groupLayout);
		this.section.setClient(group);

		this.controller = new EEFControllersFactory().createGroupController(this.description, this.variableManager, this.interpreter);

		EEFContainerDescription containerDescription = this.description.getContainer();
		if (containerDescription != null) {
			EEFContainerLifecycleManager containerLifecycleManager = new EEFContainerLifecycleManager(containerDescription,
					this.variableManager.createChild(), this.interpreter, this.eca);
			containerLifecycleManager.createControl(group, formContainer);

			parent.layout();

			this.lifecycleManagers.add(containerLifecycleManager);
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFLifecycleManager#getController()
	 */
	@Override
	protected IEEFController getController() {
		return this.controller;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFLifecycleManager#getValidationControl()
	 */
	@Override
	protected Control getValidationControl() {
		return this.section;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.ILifecycleManager#aboutToBeShown()
	 */
	@Override
	public void aboutToBeShown() {
		super.aboutToBeShown();

		this.controller.onNewLabel(new IConsumer<String>() {
			@Override
			public void apply(String value) {
				EEFGroupLifecycleManager.this.section.setText(value);
			}
		});

		for (ILifecycleManager lifecycleManager : lifecycleManagers) {
			lifecycleManager.aboutToBeShown();
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.ILifecycleManager#refresh()
	 */
	@Override
	public void refresh() {
		super.refresh();

		for (ILifecycleManager lifecycleManager : lifecycleManagers) {
			lifecycleManager.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.ILifecycleManager#aboutToBeHidden()
	 */
	@Override
	public void aboutToBeHidden() {
		super.aboutToBeHidden();

		this.controller.removeNewLabelConsumer();

		for (ILifecycleManager lifecycleManager : lifecycleManagers) {
			lifecycleManager.aboutToBeHidden();
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.ILifecycleManager#dispose()
	 */
	@Override
	public void dispose() {
		for (ILifecycleManager lifecycleManager : lifecycleManagers) {
			lifecycleManager.dispose();
		}
	}

}
