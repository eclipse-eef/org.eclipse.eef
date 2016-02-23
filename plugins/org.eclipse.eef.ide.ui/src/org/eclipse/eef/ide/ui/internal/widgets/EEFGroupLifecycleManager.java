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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.eef.EEFContainerDescription;
import org.eclipse.eef.EEFGroupDescription;
import org.eclipse.eef.core.api.controllers.EEFControllersFactory;
import org.eclipse.eef.core.api.controllers.IConsumer;
import org.eclipse.eef.core.api.controllers.IEEFGroupController;
import org.eclipse.eef.core.api.controllers.IInvalidValidationRuleResult;
import org.eclipse.eef.core.api.controllers.IValidationRuleResult;
import org.eclipse.eef.core.api.utils.Eval;
import org.eclipse.eef.core.api.utils.ISuccessfulResultConsumer;
import org.eclipse.eef.properties.ui.api.EEFTabbedPropertySheetPage;
import org.eclipse.eef.properties.ui.api.EEFTabbedPropertySheetWidgetFactory;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.IMessageManager;
import org.eclipse.ui.forms.widgets.Section;

/**
 * This class will be used in order ot manager the lifecycle of an {@link EEFGroupDescription}.
 *
 * @author sbegaudeau
 */
public class EEFGroupLifecycleManager implements ILifecycleManager {

	/**
	 * The variable manager.
	 */
	private IVariableManager variableManager;

	/**
	 * The interpreter.
	 */
	private IInterpreter interpreter;

	/**
	 * The editing domain.
	 */
	private TransactionalEditingDomain editingDomain;

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
	 * The tabbed property sheet page.
	 */
	private EEFTabbedPropertySheetPage page;

	/**
	 * The constructor.
	 *
	 * @param description
	 *            The description of the group
	 * @param variableManager
	 *            The variable manager
	 * @param interpreter
	 *            The interpreter
	 * @param editingDomain
	 *            The editing domain
	 */
	public EEFGroupLifecycleManager(EEFGroupDescription description, IVariableManager variableManager, IInterpreter interpreter,
			TransactionalEditingDomain editingDomain) {
		this.description = description;
		this.variableManager = variableManager;
		this.interpreter = interpreter;
		this.editingDomain = editingDomain;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.internal.widgets.ILifecycleManager#createControl(org.eclipse.swt.widgets.Composite,
	 *      org.eclipse.eef.properties.ui.api.EEFTabbedPropertySheetPage)
	 */
	@Override
	public void createControl(Composite parent, EEFTabbedPropertySheetPage tabbedPropertySheetPage) {
		this.page = tabbedPropertySheetPage;

		EEFTabbedPropertySheetWidgetFactory widgetFactory = tabbedPropertySheetPage.getWidgetFactory();

		Composite container = widgetFactory.createComposite(parent);
		container.setLayout(new GridLayout(1, false));

		this.section = widgetFactory.createSection(container, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		this.section.setText(""); //$NON-NLS-1$

		String labelExpression = this.description.getLabelExpression();
		new Eval(this.interpreter, this.variableManager).call(labelExpression, String.class, new ISuccessfulResultConsumer<String>() {
			@Override
			public void apply(String value) {
				EEFGroupLifecycleManager.this.section.setText(value);
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
					this.variableManager.createChild(), this.interpreter, this.editingDomain);
			containerLifecycleManager.createControl(group, tabbedPropertySheetPage);

			parent.layout();

			this.lifecycleManagers.add(containerLifecycleManager);
		}

	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.internal.widgets.ILifecycleManager#aboutToBeShown()
	 */
	@Override
	public void aboutToBeShown() {
		this.controller.onNewLabel(new IConsumer<String>() {
			@Override
			public void apply(String value) {
				EEFGroupLifecycleManager.this.section.setText(value);
			}
		});

		this.controller.onValidation(new IConsumer<List<IValidationRuleResult>>() {
			@Override
			public void apply(List<IValidationRuleResult> validationRuleResults) {
				IMessageManager messageManager = page.getForm().getMessageManager();

				for (IValidationRuleResult validationRuleResult : validationRuleResults) {
					if (validationRuleResult instanceof IInvalidValidationRuleResult) {
						IInvalidValidationRuleResult result = (IInvalidValidationRuleResult) validationRuleResult;
						messageManager.addMessage(result.getValidationRule(), result.getMessage(), result.getData(), result.getSeverity(), section);
					} else {
						messageManager.removeMessage(validationRuleResult.getValidationRule(), section);
					}
				}
			}
		});

		for (ILifecycleManager lifecycleManager : lifecycleManagers) {
			lifecycleManager.aboutToBeShown();
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.internal.widgets.ILifecycleManager#refresh()
	 */
	@Override
	public void refresh() {
		this.controller.refresh();

		for (ILifecycleManager lifecycleManager : lifecycleManagers) {
			lifecycleManager.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.internal.widgets.ILifecycleManager#aboutToBeHidden()
	 */
	@Override
	public void aboutToBeHidden() {
		this.controller.removeNewLabelConsumer();

		for (ILifecycleManager lifecycleManager : lifecycleManagers) {
			lifecycleManager.aboutToBeHidden();
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.internal.widgets.ILifecycleManager#dispose()
	 */
	@Override
	public void dispose() {
		for (ILifecycleManager lifecycleManager : lifecycleManagers) {
			lifecycleManager.dispose();
		}
	}

}
