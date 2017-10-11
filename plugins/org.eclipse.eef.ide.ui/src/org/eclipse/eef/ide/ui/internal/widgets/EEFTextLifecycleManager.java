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

import java.text.MessageFormat;
import java.util.concurrent.atomic.AtomicBoolean;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.eef.EEFTextDescription;
import org.eclipse.eef.EEFTextStyle;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.EEFWidgetStyle;
import org.eclipse.eef.common.api.utils.Util;
import org.eclipse.eef.common.ui.api.EEFWidgetFactory;
import org.eclipse.eef.common.ui.api.IEEFFormContainer;
import org.eclipse.eef.core.api.EEFExpressionUtils;
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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.MessageDialog;
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
import org.eclipse.swt.widgets.Widget;
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

	// CHECKSTYLE:OFF
	/**
	 * A simple data record to remember un-commited user input for recovery in case of concurrent changes that could
	 * override this input.
	 */
	private static class Memento {
		/**
		 * The key used to attach the user input memento to the widget.
		 */
		public static final String KEY = "eef.widget.text.memento"; //$NON-NLS-1$

		/**
		 * The widget description that was current when the memento was created.
		 */
		public final EEFTextDescription description;
		/**
		 * The "self" target element that was current when the memento was created.
		 */
		public final Object self;
		/**
		 * The reference value corresponding to the pristine text computed from the model by the valueExpression.
		 */
		public final String referenceValue;
		/**
		 * The last (full) value of the text widget entered by the user but not commited yet.
		 */
		public final String userInput;

		public Memento(EEFTextDescription description, Object self, String referenceValue, String userInpu) {
			this.description = description;
			this.self = self;
			this.referenceValue = referenceValue;
			this.userInput = userInpu;
		}

		public boolean appliesTo(EEFTextLifecycleManager lm) {
			return this.description == lm.description && this.self == lm.variableManager.getVariables().get(EEFExpressionUtils.SELF);
		}

		public void store(Widget w) {
			w.setData(KEY, this);
		}

		public static Memento of(Widget w) {
			Object data = w.getData(KEY);
			if (data instanceof Memento) {
				return (Memento) data;
			} else {
				return null;
			}
		}

		public static void remove(Widget w) {
			w.setData(KEY, null);
		}

		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			String newLine = "\n"; //$NON-NLS-1$
			sb.append("Desc: " + EcoreUtil.getURI(description)).append(newLine); //$NON-NLS-1$
			sb.append("Self: " + EcoreUtil.getURI((EObject) self)).append(newLine); //$NON-NLS-1$
			sb.append("Reference Value: " + referenceValue).append(newLine); //$NON-NLS-1$
			sb.append("User Input: " + userInput).append(newLine); //$NON-NLS-1$
			sb.append(newLine);
			return sb.toString();
		}
	}
	// CHECKSTYLE:ON

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
					Object self = EEFTextLifecycleManager.this.variableManager.getVariables().get(EEFExpressionUtils.SELF);
					String userInput = ((StyledText) e.widget).getText();
					Memento memento = new Memento(EEFTextLifecycleManager.this.description, self, EEFTextLifecycleManager.this.referenceValue,
							userInput);
					memento.store(e.widget);
				}
			}
		};
		this.text.addModifyListener(this.modifyListener);

		this.focusListener = new FocusListener() {
			@Override
			public void focusLost(FocusEvent e) {
				if (!EEFTextLifecycleManager.this.container.isRenderingInProgress() && EEFTextLifecycleManager.this.isDirty) {
					EEFTextLifecycleManager.this.updateValue(false);
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
						EEFTextLifecycleManager.this.updateValue(false);
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
					String newDisplayText = computeNewText(value);
					if (!(text.getText() != null && text.getText().equals(newDisplayText))) {
						text.setText(newDisplayText);
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
	 * Determine the new textual value to display in the widget.
	 *
	 * @param value
	 *            the value computed from the model.
	 * @return the textual value to display in the widget.
	 */
	private String computeNewText(Object value) {
		String[] newDisplayText = { "" }; //$NON-NLS-1$
		if (value != null) {
			newDisplayText[0] = Util.firstNonNull(value.toString(), newDisplayText[0]);
		}
		boolean enabled = "true".equals(System.getProperty("org.eclipse.eef.experimental.recoverLostTextInput", "false")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		Memento m = Memento.of(text);
		if (m != null) {
			boolean resettingToPreviousReferenceValue = equals(newDisplayText[0], m.referenceValue);
			boolean userHasUncommitedInput = !equals(newDisplayText[0], m.userInput);
			if (enabled && m.appliesTo(EEFTextLifecycleManager.this) && userHasUncommitedInput) {
				if (resettingToPreviousReferenceValue) {
					// Custom user input overrides resetting the same previous referenceValue.
					newDisplayText[0] = m.userInput;
				} else {
					// The new model state produces a different value than the one the user saw when he
					// started
					// editing.
					String msg = "The model has changed in an incompatible way while you were editing this widget.\nNew value from the model: {0}\nEdited version: {1}"; //$NON-NLS-1$
					String[] choices = { "Use new value from the model", "Keep the edited version" }; //$NON-NLS-1$ //$NON-NLS-2$
					// Can not use MessageDialog.open(kind, parent, title, message, style,
					// dialogButtonLabels)
					// with Neon...
					MessageDialog dialog = new MessageDialog(EEFTextLifecycleManager.this.text.getShell(), "Model Changed During Edition", //$NON-NLS-1$
							null, MessageFormat.format(msg, newDisplayText[0], m.userInput), MessageDialog.QUESTION, 0, choices);
					switch (dialog.open()) {
					case 0:
						// Nothing to do, newDisplayText[0] is initialized with the value from the model.
						break;
					case 1:
						// Override with user input.
						newDisplayText[0] = m.userInput;
						break;
					default:
						throw new IllegalStateException();
					}
				}
			}
			Memento.remove(text);
		}
		return newDisplayText[0];
	}

	/**
	 * Tests two objects for equality, considering <code>null</code>.
	 *
	 * @param o1
	 *            an object.
	 * @param o2
	 *            an object.
	 * @return <code>true</code> if both objects are null or non-null and equal.
	 */
	private boolean equals(Object o1, Object o2) {
		return (o1 == o2) || (o1 != null && o1.equals(o2));
	}

	/**
	 * Updates the value.
	 *
	 * @param force
	 *            if <code>true</code>, update even if we are in the render phase.
	 */
	private void updateValue(boolean force) {
		boolean shouldUpdateWhileRendering = !EEFTextLifecycleManager.this.container.isRenderingInProgress() || force;
		if (!this.text.isDisposed() && this.isDirty && shouldUpdateWhileRendering && updateInProgress.compareAndSet(false, true)) {
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
				Memento.remove(this.text);
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
			this.updateValue(true);
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
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager#setEnabled(boolean)
	 */
	@Override
	protected void setEnabled(boolean isEnabled) {
		if (!this.text.isDisposed()) {
			this.text.setEnabled(isEnabled);
			this.text.setEditable(isEnabled);
			this.text.setBackground(this.getBackgroundColor(isEnabled));
		}
	}

	/**
	 * Get the background color according to the current valid style.
	 *
	 * @param isEnabled
	 *            <code>true</code> to indicate that the widget is currently enabled, <code>false</code> otherwise
	 *
	 * @return The background color to use in the text field.
	 */
	private Color getBackgroundColor(boolean isEnabled) {
		Color color = defaultBackgroundColor;
		if (!isEnabled) {
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
