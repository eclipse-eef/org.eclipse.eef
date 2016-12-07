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

import java.math.BigDecimal;
import java.util.concurrent.atomic.AtomicBoolean;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.eef.EEFSpinnerDescription;
import org.eclipse.eef.EEFSpinnerStyle;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.EEFWidgetStyle;
import org.eclipse.eef.EefPackage;
import org.eclipse.eef.common.api.utils.Util;
import org.eclipse.eef.common.ui.api.EEFWidgetFactory;
import org.eclipse.eef.common.ui.api.IEEFFormContainer;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.controllers.EEFControllersFactory;
import org.eclipse.eef.core.api.controllers.IConsumer;
import org.eclipse.eef.core.api.controllers.IEEFSpinnerController;
import org.eclipse.eef.core.api.controllers.IEEFWidgetController;
import org.eclipse.eef.core.api.utils.EvalFactory;
import org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager;
import org.eclipse.eef.ide.ui.api.widgets.EEFStyleHelper;
import org.eclipse.eef.ide.ui.api.widgets.EEFStyleHelper.IEEFTextStyleCallback;
import org.eclipse.eef.ide.ui.internal.EEFIdeUiPlugin;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Spinner;

/**
 * This class will be used in order to manager the lifecycle of a spinner.
 *
 * @author arichard
 */
public class EEFSpinnerLifecycleManager extends AbstractEEFWidgetLifecycleManager {

	/**
	 * This constant is used in order to tell SWT that the text area should be 100px wide even if it is not useful. The
	 * layout data should work by themselves but it seems that there is a bug with SWT so, this useless information on
	 * the width of the text area make it work. Don't ask me why :)
	 */
	private static final int SPINNER_WIDTH_HINT = 100;

	/**
	 * The description.
	 */
	private EEFSpinnerDescription description;

	/**
	 * The spinner.
	 */
	private Spinner spinner;

	/**
	 * The controller.
	 */
	private IEEFSpinnerController controller;

	/**
	 * The listener on the spinner text field.
	 */
	private FocusListener focusListener;

	/**
	 * The key listener on the spinner text field.
	 */
	private KeyListener keyListener;

	/**
	 * The listener on the spinner.
	 */
	private ModifyListener modifyListener;

	/**
	 * Used to make the SelectionListener reentrant, to avoid infinite loops when we need to revert the UI state on
	 * error (as reverting the UI re-triggers the SelectionListener).
	 */
	private AtomicBoolean updateInProgress = new AtomicBoolean(false);

	/**
	 * The reference value of the spinner, as last rendered from the state of the actual model.
	 */
	private String referenceValue = ""; //$NON-NLS-1$

	/**
	 * Indicates that the spinner text field is dirty.
	 */
	private boolean isDirty;

	private double min;

	private double max;

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
	public EEFSpinnerLifecycleManager(EEFSpinnerDescription description, IVariableManager variableManager, IInterpreter interpreter,
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

		this.spinner = widgetFactory.createSpinner(parent, SWT.BORDER);
		Number valueOfDigits = getNumberValueOf(this.description.getDigitsExpression(),
				EefPackage.Literals.EEF_SPINNER_DESCRIPTION__DIGITS_EXPRESSION);
		// The digits must be >= 0
		if (valueOfDigits != null && valueOfDigits.intValue() >= 0) {
			this.spinner.setDigits(valueOfDigits.intValue());
		}
		Number valueOfMin = getNumberValueOf(this.description.getMinExpression(), EefPackage.Literals.EEF_SPINNER_DESCRIPTION__MIN_EXPRESSION);
		if (valueOfMin != null) {
			this.spinner.setMinimum(valueOfMin.intValue());
			min = this.spinner.getMinimum() / Math.pow(10, this.spinner.getDigits());
		}
		Number valueOfMax = getNumberValueOf(this.description.getMaxExpression(), EefPackage.Literals.EEF_SPINNER_DESCRIPTION__MAX_EXPRESSION);
		if (valueOfMax != null) {
			this.spinner.setMaximum(valueOfMax.intValue());
			max = this.spinner.getMaximum() / Math.pow(10, this.spinner.getDigits());
		}
		// The increment must be >= 1
		Number valueOfIncrement = getNumberValueOf(this.description.getIncrementExpression(),
				EefPackage.Literals.EEF_SPINNER_DESCRIPTION__INCREMENT_EXPRESSION);
		if (valueOfIncrement != null && valueOfIncrement.intValue() >= 1) {
			this.spinner.setIncrement(valueOfIncrement.intValue());
		}

		GridData gridData = new GridData();
		gridData.widthHint = SPINNER_WIDTH_HINT;
		gridData.horizontalIndent = VALIDATION_MARKER_OFFSET;
		this.spinner.setLayoutData(gridData);

		widgetFactory.paintBordersFor(parent);

		this.controller = new EEFControllersFactory().createSpinnerController(this.description, this.variableManager, this.interpreter,
				this.contextAdapter);
	}

	private Number getNumberValueOf(String expression, EAttribute eAttribute) {
		try {
			Number expressionEvaluation = EvalFactory.of(EEFSpinnerLifecycleManager.this.interpreter, this.variableManager.getVariables())
					.logIfInvalidType(Number.class).evaluate(expression);
			return expressionEvaluation;
		} catch (NumberFormatException e) {
			EEFIdeUiPlugin.INSTANCE.log(e);
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager#getLabelVerticalAlignment()
	 */
	@Override
	protected int getLabelVerticalAlignment() {
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

	@Override
	public void aboutToBeShown() {
		super.aboutToBeShown();

		this.modifyListener = new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				if (!EEFSpinnerLifecycleManager.this.container.isRenderingInProgress() && !updateInProgress.get()) {
					EEFSpinnerLifecycleManager.this.isDirty = true;
				}
			}
		};
		this.spinner.addModifyListener(this.modifyListener);

		this.focusListener = new FocusListener() {
			@Override
			public void focusLost(FocusEvent e) {
				if (!EEFSpinnerLifecycleManager.this.container.isRenderingInProgress() && EEFSpinnerLifecycleManager.this.isDirty) {
					EEFSpinnerLifecycleManager.this.updateValue(false);
				}
			}

			@Override
			public void focusGained(FocusEvent e) {
				// do nothing
			}
		};
		this.spinner.addFocusListener(this.focusListener);

		this.keyListener = new KeyListener() {
			@Override
			public void keyReleased(KeyEvent e) {
				if (e.character == '\r' || e.character == '\n') {
					EEFSpinnerLifecycleManager.this.updateValue(false);
				}
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// do nothing
			}
		};
		this.spinner.addKeyListener(this.keyListener);

		this.controller.onNewSpinnerValue(new IConsumer<Object>() {
			@Override
			public void apply(Object value) {
				if (!spinner.isDisposed()) {
					String display = ""; //$NON-NLS-1$
					if (value != null) {
						display = Util.firstNonNull(value.toString(), display);
					}
					if (!(spinner.getText() != null && spinner.getText().equals(display))) {
						try {
							BigDecimal textBigDecimalValue = new BigDecimal(display);
							spinner.setSelection(textBigDecimalValue.movePointRight(spinner.getDigits()).intValue());
							referenceValue = spinner.getText();
							EEFSpinnerLifecycleManager.this.setStyle();
							if (!spinner.isEnabled()) {
								spinner.setEnabled(true);
							}
						} catch (NumberFormatException e) {
							EEFIdeUiPlugin.INSTANCE.log(e);
						}
					}
				}
			}
		});
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager#getValidationControl()
	 */
	@Override
	protected Control getValidationControl() {
		return this.spinner;
	}

	@Override
	public void aboutToBeHidden() {
		if (this.isDirty) {
			this.updateValue(true);
		}

		super.aboutToBeHidden();

		if (!spinner.isDisposed()) {
			this.spinner.removeFocusListener(this.focusListener);
		}
		this.controller.removeNewSpinnerValueConsumer();

		if (!this.spinner.isDisposed()) {
			this.spinner.removeModifyListener(this.modifyListener);
		}

		if (!this.spinner.isDisposed()) {
			this.spinner.removeKeyListener(this.keyListener);
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
		this.spinner.setEnabled(isEnabled());
	}

	/**
	 * Updates the value.
	 *
	 * @param force
	 *            if <code>true</code>, update even if we are in the render phase.
	 */
	private void updateValue(boolean force) {
		boolean shouldUpdateWhileRendering = !EEFSpinnerLifecycleManager.this.container.isRenderingInProgress() || force;
		if (!this.spinner.isDisposed() && this.isDirty && shouldUpdateWhileRendering && updateInProgress.compareAndSet(false, true)) {
			try {
				String text = spinner.getText();
				// Check the value is in the range of min/max
				BigDecimal textBigDecimalValue = new BigDecimal(text);
				double textDoubleValue = textBigDecimalValue.doubleValue();
				if (textDoubleValue > this.min && textDoubleValue < this.max) {
					IStatus result = controller.updateValue(text);
					if (result != null && result.getSeverity() == IStatus.ERROR) {
						EEFIdeUiPlugin.INSTANCE.log(result);
						textBigDecimalValue = new BigDecimal(referenceValue);
						spinner.setSelection(textBigDecimalValue.movePointRight(this.spinner.getDigits()).intValue());
					} else {
						referenceValue = spinner.getText();
						refresh();
					}
				} else {
					refresh();
				}
				this.isDirty = false;
				this.setStyle();
			} catch (NumberFormatException e) {
				EEFIdeUiPlugin.INSTANCE.log(e);
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
		if (widgetStyle instanceof EEFSpinnerStyle) {
			EEFSpinnerStyle spinnerStyle = (EEFSpinnerStyle) widgetStyle;

			IEEFTextStyleCallback callback = new EEFSpinnerStyleCallback(this.spinner);
			styleHelper.applyTextStyle(spinnerStyle.getLabelFontNameExpression(), spinnerStyle.getLabelFontSizeExpression(),
					spinnerStyle.getLabelFontStyleExpression(), this.spinner.getFont(), spinnerStyle.getLabelBackgroundColorExpression(),
					spinnerStyle.getLabelForegroundColorExpression(), callback);
		}
	}
}
