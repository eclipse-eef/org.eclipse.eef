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
package org.eclipse.eef.ide.ui.internal.widgets;

import java.util.concurrent.atomic.AtomicBoolean;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.eef.EEFTextDescription;
import org.eclipse.eef.EEFTextStyle;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.EEFWidgetStyle;
import org.eclipse.eef.common.api.utils.Util;
import org.eclipse.eef.common.ui.api.EEFWidgetFactory;
import org.eclipse.eef.common.ui.api.IEEFFormContainer;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.controllers.EEFControllersFactory;
import org.eclipse.eef.core.api.controllers.IConsumer;
import org.eclipse.eef.core.api.controllers.IEEFTextController;
import org.eclipse.eef.core.api.controllers.IEEFWidgetController;
import org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager;
import org.eclipse.eef.ide.ui.api.widgets.EEFStyleHelper;
import org.eclipse.eef.ide.ui.api.widgets.EEFStyleHelper.IEEFTextStyleCallback;
import org.eclipse.eef.ide.ui.internal.EEFIdeUiPlugin;
import org.eclipse.eef.ide.ui.internal.widgets.styles.EEFColor;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.forms.widgets.FormToolkit;

/**
 * This class will be used in order to manager the lifecycle of a text.
 *
 * @author sbegaudeau
 */
public class EEFTextLifecycleManager extends AbstractEEFWidgetLifecycleManager {

	/**
	 * This constant is used in order to tell SWT that the text area should be 300px wide even if it is not useful. The
	 * layout data should work by themselves but it seems that there is a bug with SWT so, this useless information on
	 * the width of the text area make it work. Don't ask me why :)
	 */
	private static final int TEXT_AREA_WIDTH_HINT = 300;

	/**
	 * The description.
	 */
	private EEFTextDescription description;

	/**
	 * The text.
	 */
	private StyledText text;

	/**
	 * The controller.
	 */
	private IEEFTextController controller;

	/**
	 * The listener on the text field.
	 */
	private FocusListener focusListener;

	/**
	 * The key listener on the text field (unused for a multi-line text field).
	 */
	private KeyListener keyListener;

	/**
	 * The widget factory.
	 */
	private EEFWidgetFactory widgetFactory;

	/**
	 * The default background color of the text field.
	 */
	private Color defaultBackgroundColor;

	/**
	 * The listener used to indicate that the text field is dirty.
	 */
	private ModifyListener modifyListener;

	/**
	 * Used to make the SelectionListener reentrant, to avoid infinite loops when we need to revert the UI state on
	 * error (as reverting the UI re-triggers the SelectionListener).
	 */
	private AtomicBoolean updateInProgress = new AtomicBoolean(false);

	/**
	 * The reference value of the text, as last rendered from the state of the actual model.
	 */
	private String referenceValue = ""; //$NON-NLS-1$

	/**
	 * Indicates that the text field is dirty.
	 */
	private boolean isDirty;

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
	public EEFTextLifecycleManager(EEFTextDescription description, IVariableManager variableManager, IInterpreter interpreter,
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
		widgetFactory = formContainer.getWidgetFactory();
		defaultBackgroundColor = parent.getBackground();

		// Get text area line count
		int lineCount = description.getLineCount();

		// Create text or text area according to the defined line count
		if (lineCount > 1) {
			this.text = widgetFactory.createStyledText(parent, SWT.H_SCROLL | SWT.V_SCROLL | SWT.WRAP | SWT.MULTI);
			GridData gridData = new GridData(SWT.FILL, SWT.BEGINNING, true, false);
			gridData.heightHint = lineCount * text.getLineHeight();
			gridData.widthHint = TEXT_AREA_WIDTH_HINT;
			gridData.horizontalIndent = VALIDATION_MARKER_OFFSET;
			this.text.setLayoutData(gridData);
		} else {
			this.text = widgetFactory.createStyledText(parent, SWT.SINGLE);
			GridData gridData = new GridData(SWT.FILL, SWT.CENTER, true, false);
			gridData.horizontalIndent = VALIDATION_MARKER_OFFSET;
			this.text.setLayoutData(gridData);
		}

		this.text.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);

		this.controller = new EEFControllersFactory().createTextController(this.description, this.variableManager, this.interpreter,
				this.contextAdapter);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager#getLabelVerticalAlignment()
	 */
	@Override
	protected int getLabelVerticalAlignment() {
		if (this.description.getLineCount() > 1) {
			return GridData.VERTICAL_ALIGN_BEGINNING;
		}
		return GridData.VERTICAL_ALIGN_CENTER;
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
	 * @see org.eclipse.eef.ide.ui.api.widgets.IEEFLifecycleManager#aboutToBeShown()
	 */
	@Override
	public void aboutToBeShown() {
		super.aboutToBeShown();

		this.modifyListener = new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				if (!EEFTextLifecycleManager.this.container.isRenderingInProgress() && !updateInProgress.get()) {
					EEFTextLifecycleManager.this.isDirty = true;
				}
			}
		};
		this.text.addModifyListener(this.modifyListener);

		this.focusListener = new FocusListener() {
			@Override
			public void focusLost(FocusEvent e) {
				if (!EEFTextLifecycleManager.this.container.isRenderingInProgress() && EEFTextLifecycleManager.this.isDirty) {
					EEFTextLifecycleManager.this.updateValue();
				}
			}

			@Override
			public void focusGained(FocusEvent e) {
				// do nothing
			}
		};
		this.text.addFocusListener(this.focusListener);

		if (this.description.getLineCount() <= 1) {
			this.keyListener = new KeyListener() {
				@Override
				public void keyReleased(KeyEvent e) {
					if (e.character == '\r' || e.character == '\n') {
						EEFTextLifecycleManager.this.updateValue();
					}
				}

				@Override
				public void keyPressed(KeyEvent e) {
					// do nothing
				}
			};
			this.text.addKeyListener(this.keyListener);
		}

		this.controller.onNewValue(new IConsumer<Object>() {
			@Override
			public void apply(Object value) {
				if (!text.isDisposed()) {
					if (value != null && !(text.getText() != null && text.getText().equals(value.toString()))) {
						text.setText(Util.firstNonNull(value.toString(), "")); //$NON-NLS-1$
						referenceValue = text.getText();
					}
					EEFTextLifecycleManager.this.setStyle();
					if (!text.isEnabled()) {
						text.setEnabled(true);
					}
				}
			}
		});
	}

	/**
	 * Updates the value.
	 */
	private void updateValue() {
		if (!this.text.isDisposed() && this.isDirty && !EEFTextLifecycleManager.this.container.isRenderingInProgress()
				&& updateInProgress.compareAndSet(false, true)) {
			try {
				IStatus result = controller.updateValue(text.getText());
				if (result != null && result.getSeverity() == IStatus.ERROR) {
					EEFIdeUiPlugin.INSTANCE.log(result);
					text.setText(referenceValue);
				} else {
					referenceValue = text.getText();
					refresh();
				}
				this.isDirty = false;
				this.setStyle();
			} finally {
				updateInProgress.set(false);
			}
		}
	}

	/**
	 * Set the style.
	 */
	private void setStyle() {
		EEFStyleHelper styleHelper = new EEFStyleHelper(this.interpreter, this.variableManager);
		EEFWidgetStyle widgetStyle = styleHelper.getWidgetStyle(this.description);
		if (widgetStyle instanceof EEFTextStyle) {
			EEFTextStyle textStyle = (EEFTextStyle) widgetStyle;

			IEEFTextStyleCallback callback = new EEFStyledTextStyleCallback(this.text);
			styleHelper.applyTextStyle(textStyle.getFontNameExpression(), textStyle.getFontSizeExpression(), textStyle.getFontStyleExpression(),
					this.text.getFont(), textStyle.getBackgroundColorExpression(), textStyle.getForegroundColorExpression(), callback);
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager#getValidationControl()
	 */
	@Override
	protected Control getValidationControl() {
		return this.text;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.IEEFLifecycleManager#aboutToBeHidden()
	 */
	@Override
	public void aboutToBeHidden() {
		if (this.isDirty) {
			this.updateValue();
		}

		super.aboutToBeHidden();

		if (!text.isDisposed()) {
			this.text.removeFocusListener(this.focusListener);
		}
		this.controller.removeNewValueConsumer();

		if (!this.text.isDisposed()) {
			this.text.removeModifyListener(this.modifyListener);
		}

		if (!this.text.isDisposed() && this.description.getLineCount() <= 1) {
			this.text.removeKeyListener(this.keyListener);
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager#refresh()
	 */
	@Override
	public void refresh() {
		super.refresh();
		this.text.setEnabled(isEnabled());
		this.text.setBackground(getBackgroundColor());
	}

	/**
	 * Get the background color according to the current valid style.
	 *
	 * @return The background color to use in the text field.
	 */
	private Color getBackgroundColor() {
		Color color = defaultBackgroundColor;
		if (!isEnabled()) {
			color = widgetFactory.getColors().getInactiveBackground();
		} else {
			EEFWidgetStyle widgetStyle = new EEFStyleHelper(this.interpreter, this.variableManager).getWidgetStyle(this.description);
			if (widgetStyle instanceof EEFTextStyle) {
				EEFTextStyle style = (EEFTextStyle) widgetStyle;
				String backgroundColorCode = style.getBackgroundColorExpression();
				if (!Util.isBlank(backgroundColorCode)) {
					EEFColor backgroundColor = new EEFColor(backgroundColorCode);
					color = backgroundColor.getColor();
				}
			}
		}
		return color;
	}
}
