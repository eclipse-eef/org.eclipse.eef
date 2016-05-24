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

import org.eclipse.eef.EEFHyperlinkDescription;
import org.eclipse.eef.EEFHyperlinkStyle;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.EEFWidgetStyle;
import org.eclipse.eef.common.ui.api.EEFWidgetFactory;
import org.eclipse.eef.common.ui.api.IEEFFormContainer;
import org.eclipse.eef.core.api.EEFExpressionUtils;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.controllers.EEFControllersFactory;
import org.eclipse.eef.core.api.controllers.IConsumer;
import org.eclipse.eef.core.api.controllers.IEEFHyperlinkController;
import org.eclipse.eef.core.api.controllers.IEEFWidgetController;
import org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager;
import org.eclipse.eef.ide.ui.internal.widgets.EEFStyleHelper.IEEFTextStyleCallback;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

/**
 * This class will be used in order to manager the lifecycle of an hyperlink.
 *
 * @author mbats
 */
public class EEFHyperlinkLifecycleManager extends AbstractEEFWidgetLifecycleManager {

	/**
	 * The description.
	 */
	private EEFHyperlinkDescription description;

	/**
	 * The hyperlink.
	 */
	private StyledText hyperlink;

	/**
	 * The controller.
	 */
	private IEEFHyperlinkController controller;

	/**
	 * The listener on the hyperlink.
	 */
	private MouseListener hyperlinkListener;

	/**
	 * The constructor.
	 *
	 * @param description
	 *            The description
	 * @param variableManager
	 *            The variable manager
	 * @param interpreter
	 *            The interpreter
	 * @param contextAdapter
	 *            The editing context adapter
	 */
	public EEFHyperlinkLifecycleManager(EEFHyperlinkDescription description, IVariableManager variableManager, IInterpreter interpreter,
			EditingContextAdapter contextAdapter) {
		super(variableManager, interpreter, contextAdapter);
		this.description = description;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager#createMainControl(org.eclipse.swt.widgets.Composite,
	 *      org.eclipse.eef.common.ui.api.IEEFFormContainer)
	 */
	@Override
	protected void createMainControl(Composite parent, IEEFFormContainer formContainer) {
		EEFWidgetFactory widgetFactory = formContainer.getWidgetFactory();

		this.hyperlink = widgetFactory.createStyledText(parent, SWT.READ_ONLY);
		this.hyperlink.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		this.hyperlink.setEditable(false);
		this.hyperlink.setEnabled(true);
		widgetFactory.paintBordersFor(parent);

		this.controller = new EEFControllersFactory().createHyperlinkController(this.description, this.variableManager, this.interpreter,
				this.contextAdapter);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager#getController()
	 */
	@Override
	protected IEEFWidgetController getController() {
		return this.controller;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.internal.widgets.AbstractEEFWidgetLifecycleManager#getWidgetDescription()
	 */
	@Override
	protected EEFWidgetDescription getWidgetDescription() {
		return this.description;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager#aboutToBeShown()
	 */
	@Override
	public void aboutToBeShown() {
		super.aboutToBeShown();

		this.hyperlinkListener = new EEFHyperlinkListener(this.hyperlink, this.container, this.controller);
		hyperlink.addMouseListener(hyperlinkListener);

		this.controller.onNewValue(new IConsumer<String>() {
			@Override
			public void apply(String value) {
				if (!hyperlink.isDisposed()) {
					if (!(hyperlink.getText() != null && hyperlink.getText().equals(value))) {
						String text = Objects.firstNonNull(value, ""); //$NON-NLS-1$
						hyperlink.setText(text);
						hyperlink.setData(variableManager.getVariables().get(EEFExpressionUtils.SELF));
					}
					EEFHyperlinkLifecycleManager.this.setStyle();
					if (!hyperlink.isEnabled()) {
						hyperlink.setEnabled(true);
					}
				}
			}

		});
	}

	/**
	 * Set the style.
	 */
	private void setStyle() {
		EEFStyleHelper styleHelper = new EEFStyleHelper(this.interpreter, this.variableManager);
		EEFWidgetStyle widgetStyle = styleHelper.getWidgetStyle(this.description);
		if (widgetStyle instanceof EEFHyperlinkStyle) {
			EEFHyperlinkStyle style = (EEFHyperlinkStyle) widgetStyle;

			IEEFTextStyleCallback callback = new EEFStyledTextStyleCallback(this.hyperlink);
			styleHelper.applyTextStyle(style.getFontNameExpression(), style.getFontSizeExpression(), style.getFontStyleExpression(),
					this.hyperlink.getFont(), style.getBackgroundColorExpression(), null, callback);
		}

		// Sets the default hyperlink style properties
		StyleRange[] styleRanges = hyperlink.getStyleRanges();
		StyleRange styleRange;
		if (styleRanges.length > 0) {
			styleRange = styleRanges[0];
		} else {
			styleRange = new StyleRange();
		}

		if (styleRange != null) {
			styleRange.start = 0;
			styleRange.length = hyperlink.getText().length();
			styleRange.underline = true;
			styleRange.underlineStyle = SWT.UNDERLINE_LINK;
		}
		hyperlink.setStyleRange(styleRange);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager#getValidationControl()
	 */
	@Override
	protected Control getValidationControl() {
		return this.hyperlink;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager#aboutToBeHidden()
	 */
	@Override
	public void aboutToBeHidden() {
		super.aboutToBeHidden();

		if (!hyperlink.isDisposed()) {
			this.hyperlink.removeMouseListener(this.hyperlinkListener);
		}
		this.controller.removeNewValueConsumer();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager#refresh()
	 */
	@Override
	public void refresh() {
		super.refresh();
		this.hyperlink.setEnabled(isEnabled());
	}
}
