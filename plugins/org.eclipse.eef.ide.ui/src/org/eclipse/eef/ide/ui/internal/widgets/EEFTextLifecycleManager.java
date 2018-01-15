/*******************************************************************************
 * Copyright (c) 2015, 2017 Obeo.
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
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.eef.EEFTextDescription;
import org.eclipse.eef.EEFTextStyle;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.EEFWidgetStyle;
import org.eclipse.eef.common.api.utils.Util;
import org.eclipse.eef.common.ui.api.EEFWidgetFactory;
import org.eclipse.eef.common.ui.api.IEEFFormContainer;
import org.eclipse.eef.common.ui.api.SWTUtils;
import org.eclipse.eef.core.api.EEFExpressionUtils;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.controllers.EEFControllersFactory;
import org.eclipse.eef.core.api.controllers.IEEFTextController;
import org.eclipse.eef.core.api.controllers.IEEFWidgetController;
import org.eclipse.eef.core.internal.controllers.EEFTextController;
import org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager;
import org.eclipse.eef.ide.ui.api.widgets.EEFStyleHelper;
import org.eclipse.eef.ide.ui.api.widgets.EEFStyleHelper.IEEFTextStyleCallback;
import org.eclipse.eef.ide.ui.internal.EEFIdeUiPlugin;
import org.eclipse.eef.ide.ui.internal.Messages;
import org.eclipse.eef.ide.ui.internal.preferences.EEFPreferences;
import org.eclipse.eef.ide.ui.internal.widgets.styles.EEFColor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.dnd.Clipboard;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Widget;
import org.eclipse.ui.forms.widgets.FormToolkit;

/**
 * This class will be used in order to manager the lifecycle of a text.
 *
 * @author sbegaudeau
 */
public class EEFTextLifecycleManager extends AbstractEEFWidgetLifecycleManager {
	/**
	 * The different ways an edition conflict can be resolved. Used by the default implementation of
	 * {@link EEFTextLifecycleManager#resolveEditionConflict(Shell, String, String, String)}.
	 */
	public enum ConflictResolutionMode {
		/**
		 * Use the version being edited in the widget, overriding the new version computed from the current model state.
		 */
		USE_LOCAL_VERSION,
		/**
		 * Use the version computed from the current model state, replacing the text being edited by the user in the
		 * widget.
		 */
		USE_MODEL_VERSION,
		/**
		 * Ask the user through a simple dialog which version to keep.
		 */
		ASK_USER
	}

	/**
	 * This constant is used in order to tell SWT that the text area should be 300px wide even if it is not useful. The
	 * layout data should work by themselves but it seems that there is a bug with SWT so, this useless information on
	 * the width of the text area make it work. Don't ask me why :)
	 */
	protected static final int TEXT_AREA_WIDTH_HINT = 300;

	/**
	 * The description.
	 */
	protected EEFTextDescription description;

	/**
	 * The text.
	 */
	protected StyledText text;

	/**
	 * The controller.
	 */
	protected IEEFTextController controller;

	/**
	 * The listener on the text field.
	 */
	protected FocusListener focusListener;

	/**
	 * The key listener on the text field (unused for a multi-line text field).
	 */
	protected KeyListener keyListener;

	/**
	 * The widget factory.
	 */
	protected EEFWidgetFactory widgetFactory;

	/**
	 * The default background color of the text field.
	 */
	protected Color defaultBackgroundColor;

	/**
	 * The listener used to indicate that the text field is dirty.
	 */
	protected ModifyListener modifyListener;

	/**
	 * Used to make the SelectionListener reentrant, to avoid infinite loops when we need to revert the UI state on
	 * error (as reverting the UI re-triggers the SelectionListener).
	 */
	protected AtomicBoolean updateInProgress = new AtomicBoolean(false);

	/**
	 * True only while we are reacting to a notification that the underlying element has been locked by someone else.
	 * When this is the case, we must avoid any attempt to apply our current widget state to the model (it will fail).
	 */
	protected AtomicBoolean lockedByOtherInProgress = new AtomicBoolean(false);

	/**
	 * The reference value of the text, as last rendered from the state of the actual model.
	 */
	protected String referenceValue = ""; //$NON-NLS-1$

	/**
	 * Indicates that the text field is dirty.
	 */
	protected boolean isDirty;

	// CHECKSTYLE:OFF
	/**
	 * A simple data record to remember un-commited user input for recovery in case of concurrent changes that could
	 * override this input.
	 */
	protected static class Memento {
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
	 * @param editingContextAdapter
	 *            The editing context adapter
	 */
	public EEFTextLifecycleManager(EEFTextDescription description, IVariableManager variableManager, IInterpreter interpreter,
			EditingContextAdapter editingContextAdapter) {
		super(variableManager, interpreter, editingContextAdapter);
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
				this.editingContextAdapter);
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

		this.modifyListener = (event) -> {
			if (!this.container.isRenderingInProgress() && !updateInProgress.get()) {
				this.isDirty = true;
				Object self = this.variableManager.getVariables().get(EEFExpressionUtils.SELF);
				String userInput = ((StyledText) event.widget).getText();
				Memento memento = new Memento(this.description, self, this.referenceValue, userInput);
				memento.store(event.widget);
			}
		};
		this.text.addModifyListener(this.modifyListener);

		this.focusListener = SWTUtils.focusLostAdapter((event) -> {
			if (!this.lockedByOtherInProgress.get() && !this.container.isRenderingInProgress() && this.isDirty) {
				this.updateValue(false);
			}
		});
		this.text.addFocusListener(this.focusListener);

		if (this.description.getLineCount() <= 1) {
			this.keyListener = SWTUtils.keyReleasedAdapter((event) -> {
				if (event.character == '\r' || event.character == '\n') {
					this.updateValue(false);
				}
			});
			this.text.addKeyListener(this.keyListener);
		}

		this.controller.onNewValue((value) -> {
			if (!text.isDisposed()) {
				String newDisplayText = computeNewText(value);
				if (!(text.getText() != null && text.getText().equals(newDisplayText))) {
					text.setText(newDisplayText);
					referenceValue = text.getText();
				}
				this.setStyle();
				if (!text.isEnabled()) {
					text.setEnabled(true);
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
		Memento m = Memento.of(text);
		if (m != null) {
			boolean resettingToPreviousReferenceValue = Objects.equals(newDisplayText[0], m.referenceValue);
			boolean userHasUncommitedInput = !Objects.equals(newDisplayText[0], m.userInput);
			if (m.appliesTo(this) && userHasUncommitedInput) {
				if (resettingToPreviousReferenceValue) {
					// Custom user input overrides resetting the same previous referenceValue.
					newDisplayText[0] = m.userInput;
				} else if (!Objects.equals(m.userInput, newDisplayText[0])) {
					// Conflict must be resolved somehow.
					newDisplayText[0] = resolveEditionConflict(this.text.getShell(), m.referenceValue, m.userInput, newDisplayText[0]);
				}
			}
			Memento.remove(text);
		}
		return newDisplayText[0];
	}

	/**
	 * Handle conflicts between un-commited changes in the widget and concurrent changes in the model that produce a
	 * different value than the original one seen by the user.
	 *
	 * @param shell
	 *            the shell to use if user interaction is needed.
	 * @param originalValue
	 *            the original, common value, before the user started editing and before the concurrent model change
	 *            produced a new text.
	 * @param localEditedVersion
	 *            the value as edited by the user, and seen in the UI.
	 * @param newValueFromModel
	 *            the new value produced from the new model state.
	 * @return the new value to use in the text field.
	 */
	protected String resolveEditionConflict(Shell shell, String originalValue, String localEditedVersion, final String newValueFromModel) {
		String result;
		switch (EEFPreferences.getTextConflictResolutionMode()) {
		case USE_LOCAL_VERSION:
			result = localEditedVersion;
			break;
		case USE_MODEL_VERSION:
			result = newValueFromModel;
			break;
		case ASK_USER:
			result = askUserToResolveConflict(shell, originalValue, localEditedVersion, newValueFromModel);
			break;
		default:
			throw new IllegalStateException();
		}
		return result;
	}

	/**
	 * Open a simple dialog to inform the user of a conflict and ask him which version to keep.
	 *
	 * @param shell
	 *            the shell to use if user interaction is needed.
	 * @param originalValue
	 *            the original, common value, before the user started editing and before the concurrent model change
	 *            produced a new text.
	 * @param localEditedVersion
	 *            the value as edited by the user, and seen in the UI.
	 * @param newValueFromModel
	 *            the new value produced from the new model state.
	 * @return the value chosen by the user.
	 */
	protected String askUserToResolveConflict(Shell shell, String originalValue, String localEditedVersion, String newValueFromModel) {
		final String[] result = { localEditedVersion };
		// @formatter:off
		final String[] choices = {
				Messages.EEFTextLifecycleManager_conflictDialog_choiceNewModelValue,
				Messages.EEFTextLifecycleManager_conflictDialog_choiceLocalEditedValue,
		};
		// @formatter:on
		shell.getDisplay().syncExec(() -> {
			String title = Messages.EEFTextLifecycleManager_conflictDialog_title;
			String message = MessageFormat.format(Messages.EEFTextLifecycleManager_conflictDialog_message, newValueFromModel, localEditedVersion);
			Image img = shell.getDisplay().getSystemImage(SWT.ICON_QUESTION);
			MessageDialog dialog = new MessageDialog(shell, title, img, message, MessageDialog.QUESTION, 0, choices);
			switch (dialog.open()) {
			case 0:
				result[0] = newValueFromModel;
				break;
			case 1:
				result[0] = localEditedVersion;
				break;
			default:
				throw new IllegalStateException();
			}
		});
		return result[0];
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

	@Override
	protected void lockedByOther() {
		this.lockedByOtherInProgress.set(true);
		try {
			/*
			 * Disabling the widget will prevent the user to recover any local version of the text widget. Detect this
			 * case and open a popup with the option to copy the local text to the clipboard.
			 */
			String textFromModel = computeTextFromModel();
			Memento m = Memento.of(text);
			if (m != null) {
				boolean userHasUncommitedInput = !Objects.equals(textFromModel, m.userInput);
				if (m.appliesTo(this) && userHasUncommitedInput) {
					notifyTextLossOnLock(m.userInput, textFromModel);
					// Update the displayed text to avoid confusion.
					this.text.setText(textFromModel);
				}
				Memento.remove(text);
			}
			super.lockedByOther();
		} finally {
			this.lockedByOtherInProgress.set(false);
		}
	}

	/**
	 * Notify the end user that his current input will be lost as the underlying widget (and model element) has been
	 * locked by a remote/async change.
	 *
	 * @param userInput
	 *            the current text entered by the user.
	 * @param textFromModel
	 *            the text that will replace the current input.
	 */
	protected void notifyTextLossOnLock(String userInput, String textFromModel) {
		Shell sh = this.text.getShell();
		if (MessageDialog.openQuestion(sh, Messages.EEFTextLifecycleManager_textLossByLocking_title,
				MessageFormat.format(Messages.EEFTextLifecycleManager_textLossByLocking_title, userInput))) {
			Clipboard cp = new Clipboard(sh.getDisplay());
			cp.setContents(new Object[] { userInput }, new Transfer[] { TextTransfer.getInstance() });
			cp.dispose();
		}
	}

	/**
	 * Compute the text the widget should display given the current state of the underlying model (independently of any
	 * potential user input in the widget).
	 *
	 * @return the text to display according to the model's current state.
	 */
	@SuppressWarnings("restriction")
	private String computeTextFromModel() {
		Object[] value = { null };
		if (this.controller instanceof EEFTextController) {
			((EEFTextController) this.controller).computeValue(v -> value[0] = v);
		}
		String result = ""; //$NON-NLS-1$
		if (value[0] != null) {
			result = Util.firstNonNull(value[0].toString(), result);
		}
		return result;
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
