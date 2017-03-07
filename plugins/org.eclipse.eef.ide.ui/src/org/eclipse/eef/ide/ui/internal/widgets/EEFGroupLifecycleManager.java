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
import java.util.Optional;

import org.eclipse.eef.EEFControlDescription;
import org.eclipse.eef.EEFGroupConditionalStyle;
import org.eclipse.eef.EEFGroupDescription;
import org.eclipse.eef.EEFGroupStyle;
import org.eclipse.eef.EEF_TITLE_BAR_STYLE;
import org.eclipse.eef.EEF_TOGGLE_STYLE;
import org.eclipse.eef.common.ui.api.EEFWidgetFactory;
import org.eclipse.eef.common.ui.api.IEEFFormContainer;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.controllers.EEFControllersFactory;
import org.eclipse.eef.core.api.controllers.IEEFController;
import org.eclipse.eef.core.api.controllers.IEEFGroupController;
import org.eclipse.eef.core.api.utils.EvalFactory;
import org.eclipse.eef.ide.ui.api.widgets.AbstractEEFLifecycleManager;
import org.eclipse.eef.ide.ui.api.widgets.IEEFLifecycleManager;
import org.eclipse.eef.ide.ui.internal.widgets.styles.EEFColor;
import org.eclipse.eef.ide.ui.internal.widgets.styles.EEFFont;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
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
	private EditingContextAdapter editingContextAdapter;

	/**
	 * The description of the container.
	 */
	private EEFGroupDescription description;

	/**
	 * The lifecycle managers of the child of the container.
	 */
	private List<IEEFLifecycleManager> lifecycleManagers = new ArrayList<IEEFLifecycleManager>();

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
	 * @param editingContextAdapter
	 *            The editing context adapter
	 */
	public EEFGroupLifecycleManager(EEFGroupDescription description, IVariableManager variableManager, IInterpreter interpreter,
			EditingContextAdapter editingContextAdapter) {
		this.description = description;
		this.variableManager = variableManager;
		this.interpreter = interpreter;
		this.editingContextAdapter = editingContextAdapter;
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
		GridData gridData = new GridData(SWT.FILL, SWT.BEGINNING, true, false);
		groupComposite.setLayoutData(gridData);

		EEFGroupStyle styleDescription = this.description.getStyle();
		List<EEFGroupConditionalStyle> conditionalStyles = description.getConditionalStyles();
		if (conditionalStyles != null) {
			for (EEFGroupConditionalStyle eefGroupConditionalStyle : conditionalStyles) {
				String preconditionExpression = eefGroupConditionalStyle.getPreconditionExpression();
				Boolean preconditionValid = EvalFactory.of(interpreter, variableManager).logIfInvalidType(Boolean.class)
						.evaluate(preconditionExpression);
				if (preconditionValid != null && preconditionValid.booleanValue()) {
					styleDescription = eefGroupConditionalStyle.getStyle();
					break;
				}
			}
		}

		int style = Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED;
		if (styleDescription != null) {
			// Get bar style & toggle style from expression
			style = getBarStyle(styleDescription.getBarStyle()) | getToggleStyle(styleDescription.getToggleStyle());

			// Get if the group is expanded by default
			boolean isExpandedByDefault = styleDescription.isExpandedByDefault();
			if (isExpandedByDefault) {
				style |= Section.EXPANDED;
			}
		}

		this.section = widgetFactory.createSection(groupComposite, style);
		this.section.setText(""); //$NON-NLS-1$

		String labelExpression = this.description.getLabelExpression();
		EvalFactory.of(this.interpreter, this.variableManager).logIfInvalidType(String.class).call(labelExpression,
				(value) -> this.section.setText(Optional.ofNullable(value).orElse(""))); //$NON-NLS-1$

		this.section.setLayout(new GridLayout(1, false));
		GridData sectionLayoutData = new GridData(SWT.FILL, SWT.BEGINNING, true, false);
		this.section.setLayoutData(sectionLayoutData);

		Composite group = widgetFactory.createComposite(this.section);
		GridData groupLayoutData = new GridData(SWT.FILL, SWT.BEGINNING, true, false);
		group.setLayoutData(groupLayoutData);

		// Three columns: label, help, widget
		GridLayout groupLayout = new GridLayout(3, false);
		group.setLayout(groupLayout);

		if (styleDescription != null) {
			// Get background color from expression
			String backgroundValue = EvalFactory.of(interpreter, variableManager).logIfInvalidType(String.class)
					.evaluate(styleDescription.getBackgroundColorExpression());
			if (backgroundValue != null) {
				Color backgroundColor = new EEFColor(backgroundValue).getColor();
				this.section.setBackground(backgroundColor);
				group.setBackground(backgroundColor);
			}

			// Get foreground color from expression
			String foregroundValue = EvalFactory.of(interpreter, variableManager).logIfInvalidType(String.class)
					.evaluate(styleDescription.getForegroundColorExpression());
			if (foregroundValue != null) {
				Color foregroundColor = new EEFColor(foregroundValue).getColor();
				groupComposite.setForeground(foregroundColor);
				this.section.setTitleBarForeground(foregroundColor);
				this.section.setToggleColor(foregroundColor);
				this.section.setForeground(foregroundColor);
				group.setForeground(foregroundColor);
			}

			// Get font name and size from expression
			String fontName = EvalFactory.of(interpreter, variableManager).logIfInvalidType(String.class)
					.evaluate(styleDescription.getFontNameExpression());
			Integer fontSize = EvalFactory.of(interpreter, variableManager).logIfInvalidType(Integer.class)
					.evaluate(styleDescription.getFontSizeExpression());
			if (fontSize == null) {
				fontSize = Integer.valueOf(0);
			}
			Font font = new EEFFont(fontName, fontSize.intValue(), SWT.BOLD).getFont();
			this.section.setFont(font);
			group.setFont(font);
		}

		this.section.setClient(group);

		this.controller = new EEFControllersFactory().createGroupController(this.description, this.variableManager, this.interpreter,
				this.editingContextAdapter);

		EEFControlSwitch eefControlSwitch = new EEFControlSwitch(this.interpreter, this.editingContextAdapter);
		List<EEFControlDescription> controls = this.description.getControls();
		for (EEFControlDescription eefControlDescription : controls) {
			this.lifecycleManagers.addAll(eefControlSwitch.doCreate(group, formContainer, eefControlDescription, this.variableManager));
		}
	}

	/**
	 * Get the bar style.
	 *
	 * @param barStyleEnum
	 *            Bar style
	 * @return Section bar style
	 */
	private int getBarStyle(EEF_TITLE_BAR_STYLE barStyleEnum) {
		int barStyle = SWT.NONE;
		switch (barStyleEnum) {
		case SHORT_TITLE_BAR:
			barStyle = Section.SHORT_TITLE_BAR;
			break;
		case NO_TITLE:
			barStyle = Section.NO_TITLE;
			break;
		default:
			barStyle = Section.TITLE_BAR;
			break;
		}
		return barStyle;
	}

	/**
	 * Get the toggle style.
	 *
	 * @param toggleStyleEnum
	 *            Toggle style
	 * @return The section toggle style
	 */
	private int getToggleStyle(EEF_TOGGLE_STYLE toggleStyleEnum) {
		int toggleStyle = Section.TWISTIE;
		switch (toggleStyleEnum) {
		case TREE_NODE:
			toggleStyle = Section.TREE_NODE;
			break;
		case NONE:
			toggleStyle = SWT.NONE;
			break;
		default:
			toggleStyle = Section.TWISTIE;
			break;
		}
		return toggleStyle;
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
	 * @see org.eclipse.eef.ide.ui.api.widgets.IEEFLifecycleManager#aboutToBeShown()
	 */
	@Override
	public void aboutToBeShown() {
		super.aboutToBeShown();

		this.controller.onNewLabel((value) -> Optional.ofNullable(value).ifPresent(this.section::setText));

		this.lifecycleManagers.forEach(IEEFLifecycleManager::aboutToBeShown);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.IEEFLifecycleManager#refresh()
	 */
	@Override
	public void refresh() {
		super.refresh();

		this.lifecycleManagers.forEach(IEEFLifecycleManager::refresh);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.IEEFLifecycleManager#aboutToBeHidden()
	 */
	@Override
	public void aboutToBeHidden() {
		super.aboutToBeHidden();

		this.controller.removeNewLabelConsumer();

		this.lifecycleManagers.forEach(IEEFLifecycleManager::aboutToBeHidden);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.IEEFLifecycleManager#dispose()
	 */
	@Override
	public void dispose() {
		this.lifecycleManagers.forEach(IEEFLifecycleManager::dispose);
	}

}
