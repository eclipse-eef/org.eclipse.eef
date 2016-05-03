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

import org.eclipse.eef.EEFConditionalStyle;
import org.eclipse.eef.EEFHyperlinkConditionalStyle;
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
import org.eclipse.eef.core.api.utils.Eval;
import org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.graphics.Point;
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
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager#getWidgetStyle()
	 */
	@Override
	protected EEFWidgetStyle getWidgetStyle() {
		return this.description.getStyle();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager#getWidgetStyle(org.eclipse.eef.EEFConditionalStyle)
	 */
	@Override
	protected EEFWidgetStyle getWidgetStyle(EEFConditionalStyle conditionalStyle) {
		if (conditionalStyle instanceof EEFHyperlinkConditionalStyle) {
			return ((EEFHyperlinkConditionalStyle) conditionalStyle).getStyle();
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager#getWidgetConditionalStyles()
	 */
	@Override
	protected List<EEFConditionalStyle> getWidgetConditionalStyles() {
		List<EEFConditionalStyle> widgetConditionalStyles = new ArrayList<EEFConditionalStyle>();
		widgetConditionalStyles.addAll(this.description.getConditionalStyles());
		return widgetConditionalStyles;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager#aboutToBeShown()
	 */
	@Override
	public void aboutToBeShown() {
		super.aboutToBeShown();

		this.hyperlinkListener = new MouseListener() {

			@Override
			public void mouseDoubleClick(MouseEvent e) {
				// nothing
			}

			@Override
			public void mouseDown(MouseEvent e) {
				int offset = hyperlink.getOffsetAtLocation(new Point(e.x, e.y));
				StyleRange stylerange = hyperlink.getStyleRangeAtOffset(offset);
				if (stylerange != null) {
					if (!EEFHyperlinkLifecycleManager.this.container.isRenderingInProgress()) {
						controller.onClick(hyperlink.getData());
					}
				}
			}

			@Override
			public void mouseUp(MouseEvent e) {
				// nothing
			}
		};
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
					// Set style
					setStyle();
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
		EEFHyperlinkStyle hyperlinkStyle = description.getStyle();
		List<EEFHyperlinkConditionalStyle> conditionalStyles = description.getConditionalStyles();
		if (conditionalStyles != null) {
			for (EEFHyperlinkConditionalStyle eefHyperlinkConditionalStyle : conditionalStyles) {
				String preconditionExpression = eefHyperlinkConditionalStyle.getPreconditionExpression();
				Boolean preconditionValid = Eval.of(interpreter, variableManager).logIfInvalidType(Boolean.class).get(preconditionExpression);
				if (preconditionValid != null && preconditionValid.booleanValue()) {
					hyperlinkStyle = eefHyperlinkConditionalStyle.getStyle();
					break;
				}
			}
		}
		setHyperlinkStyle(hyperlinkStyle);
	}

	/**
	 * Set the hyperlink style.
	 *
	 * @param style
	 *            Style
	 */
	protected void setHyperlinkStyle(EEFHyperlinkStyle style) {
		if (style != null) {
			setFont(style.getFontNameExpression(), style.getFontSizeExpression(), style.getFontStyleExpression(), hyperlink);
			setBackgroundColor(style.getBackgroundColorExpression(), hyperlink);
		}
		StyleRange[] styleRanges = hyperlink.getStyleRanges();
		StyleRange styleRange;
		if (styleRanges.length > 0) {
			styleRange = styleRanges[0];
		} else {
			styleRange = new StyleRange();
			styleRange.start = 0;
			styleRange.length = hyperlink.getText().length();
			styleRange.underline = true;
		}

		styleRange.underlineStyle = SWT.UNDERLINE_LINK;
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
