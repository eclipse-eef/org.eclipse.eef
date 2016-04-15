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
import org.eclipse.eef.EEFGroupConditionalStyle;
import org.eclipse.eef.EEFGroupDescription;
import org.eclipse.eef.EEFGroupStyle;
import org.eclipse.eef.EEF_TITLE_BAR_STYLE;
import org.eclipse.eef.EEF_TOGGLE_STYLE;
import org.eclipse.eef.EefPackage;
import org.eclipse.eef.common.ui.api.EEFWidgetFactory;
import org.eclipse.eef.common.ui.api.IEEFFormContainer;
import org.eclipse.eef.core.api.controllers.EEFControllersFactory;
import org.eclipse.eef.core.api.controllers.IConsumer;
import org.eclipse.eef.core.api.controllers.IEEFController;
import org.eclipse.eef.core.api.controllers.IEEFGroupController;
import org.eclipse.eef.core.api.utils.Eval;
import org.eclipse.eef.ide.ui.api.ILifecycleManager;
import org.eclipse.eef.ide.ui.api.widgets.AbstractEEFLifecycleManager;
import org.eclipse.eef.ide.ui.internal.widgets.styles.EEFColor;
import org.eclipse.eef.ide.ui.internal.widgets.styles.EEFFont;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
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
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFLifecycleManager#createControl(org.eclipse.swt.widgets.Composite,
	 *      org.eclipse.eef.common.ui.api.IEEFFormContainer)
	 */
	@Override
	public void createControl(Composite parent, IEEFFormContainer formContainer) {
		super.createControl(parent, formContainer);

		EEFWidgetFactory widgetFactory = formContainer.getWidgetFactory();

		Composite groupComposite = widgetFactory.createComposite(parent);
		groupComposite.setLayout(new GridLayout(1, false));

		EEFGroupStyle styleDescription = this.description.getStyle();
		List<EEFGroupConditionalStyle> conditionalStyles = description.getConditionalStyles();
		if (conditionalStyles != null) {
			for (EEFGroupConditionalStyle eefGroupConditionalStyle : conditionalStyles) {
				String preconditionExpression = eefGroupConditionalStyle.getPreconditionExpression();
				Boolean preconditionValid = new Eval(interpreter, variableManager).get(preconditionExpression, Boolean.class);
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

		if (styleDescription != null) {
			// Get background color from expression
			Eval eval = new Eval(interpreter, variableManager);
			String backgroundValue = eval.get(EefPackage.Literals.EEF_GROUP_STYLE__BACKGROUND_COLOR_EXPRESSION,
					styleDescription.getBackgroundColorExpression(), String.class);
			if (backgroundValue != null) {
				Color backgroundColor = new EEFColor(backgroundValue).getColor();
				this.section.setBackground(backgroundColor);
				group.setBackground(backgroundColor);
			}

			// Get foreground color from expression
			String foregroundValue = eval.get(EefPackage.Literals.EEF_GROUP_STYLE__FOREGROUND_COLOR_EXPRESSION,
					styleDescription.getForegroundColorExpression(), String.class);
			if (foregroundValue != null) {
				Color foregroundColor = new EEFColor(foregroundValue).getColor();
				groupComposite.setForeground(foregroundColor);
				this.section.setTitleBarForeground(foregroundColor);
				this.section.setToggleColor(foregroundColor);
				this.section.setForeground(foregroundColor);
				group.setForeground(foregroundColor);
			}

			// Get font name and size from expression
			String fontName = eval.get(EefPackage.Literals.EEF_GROUP_STYLE__FONT_NAME_EXPRESSION, styleDescription.getFontNameExpression(),
					String.class);
			Integer fontSize = eval.get(EefPackage.Literals.EEF_GROUP_STYLE__FONT_SIZE_EXPRESSION, styleDescription.getFontSizeExpression(),
					Integer.class);
			Font font = new EEFFont(fontName, fontSize, SWT.BOLD).getFont();
			this.section.setFont(font);
			group.setFont(font);
		}

		this.section.setClient(group);

		this.controller = new EEFControllersFactory().createGroupController(this.description, this.variableManager, this.interpreter);

		EEFContainerDescription containerDescription = this.description.getContainer();
		if (containerDescription != null) {
			EEFContainerLifecycleManager containerLifecycleManager = new EEFContainerLifecycleManager(containerDescription,
					this.variableManager.createChild(), this.interpreter, this.editingDomain);
			containerLifecycleManager.createControl(group, formContainer);

			parent.layout();

			this.lifecycleManagers.add(containerLifecycleManager);
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
