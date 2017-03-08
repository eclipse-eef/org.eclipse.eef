/*******************************************************************************
 * Copyright (c) 2016, 2017 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.eef.ide.ui.api.widgets;

import java.util.Collection;
import java.util.Optional;
import java.util.function.Consumer;

import org.eclipse.eef.EEFDynamicMappingFor;
import org.eclipse.eef.EEFDynamicMappingIf;
import org.eclipse.eef.EEFGroupDescription;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.EEFWidgetStyle;
import org.eclipse.eef.common.api.utils.Util;
import org.eclipse.eef.common.ui.api.EEFWidgetFactory;
import org.eclipse.eef.common.ui.api.IEEFFormContainer;
import org.eclipse.eef.core.api.EEFExpressionUtils;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.LockStatusChangeEvent;
import org.eclipse.eef.core.api.LockStatusChangeEvent.LockStatus;
import org.eclipse.eef.core.api.controllers.IEEFWidgetController;
import org.eclipse.eef.core.api.utils.EvalFactory;
import org.eclipse.eef.ide.ui.api.widgets.EEFStyleHelper.IEEFTextStyleCallback;
import org.eclipse.eef.ide.ui.internal.EEFIdeUiPlugin;
import org.eclipse.eef.ide.ui.internal.Icons;
import org.eclipse.eef.ide.ui.internal.Messages;
import org.eclipse.eef.ide.ui.internal.widgets.EEFStyledTextStyleCallback;
import org.eclipse.eef.ide.ui.internal.widgets.styles.EEFColor;
import org.eclipse.eef.ide.ui.internal.widgets.styles.EEFFont;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.fieldassist.ControlDecoration;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseTrackListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

/**
 * Parent of all the lifecycle managers.
 *
 * @author sbegaudeau
 */
public abstract class AbstractEEFWidgetLifecycleManager extends AbstractEEFLifecycleManager {
	/**
	 * The number of pixel of the additional gap necessary to draw the validation marker.
	 */
	protected static final int VALIDATION_MARKER_OFFSET = 5;

	/**
	 * The variable manager.
	 */
	protected IVariableManager variableManager;

	/**
	 * The interpreter.
	 */
	protected IInterpreter interpreter;

	/**
	 * The editing context adapter.
	 */
	protected EditingContextAdapter editingContextAdapter;

	/**
	 * The label.
	 */
	protected StyledText label;

	/**
	 * The help label.
	 */
	protected CLabel help;

	/**
	 * The listener on the help.
	 */
	private MouseTrackListener mouseTrackListener;

	/**
	 * The listener used to react to changes in the lock status of a semantic element.
	 */
	private Consumer<Collection<LockStatusChangeEvent>> lockStatusChangedListener;

	/**
	 * The decorator used to indicate the permission on the validation widget.
	 */
	private ControlDecoration controlDecoration;

	/**
	 * The constructor.
	 *
	 * @param variableManager
	 *            The variable manager
	 * @param interpreter
	 *            The interpreter
	 * @param editingContextAdapter
	 *            The editing context adapter
	 */
	public AbstractEEFWidgetLifecycleManager(IVariableManager variableManager, IInterpreter interpreter,
			EditingContextAdapter editingContextAdapter) {
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

		Composite composite = parent;

		// If we are in a group, we will always create a label (empty or not) for the 3 columns layout of the group.
		boolean isInGroup = this.isInGroup();

		// Some widgets (like a checkbox) will not have a separated "label" widget for their label. Those widgets will
		// thus never create another widget expect in the group (for the layout).
		boolean needsSeparatedLabel = this.needSeparatedLabel();

		// Finally if the label expression is blank, we will not create a label inside of a group (for the layout).
		boolean isBlankLabel = Util.isBlank(this.getWidgetDescription().getLabelExpression());

		boolean needsLabel = isInGroup || (!isBlankLabel && needsSeparatedLabel);
		boolean needsHelp = isInGroup || !Util.isBlank(this.getWidgetDescription().getHelpExpression());

		// If we are not in a group, we will create a composite to hold all the label and help of the widget if
		// necessary
		if (!isInGroup && (needsLabel || needsHelp)) {
			composite = widgetFactory.createComposite(parent);

			// We will only create the necessary number of columns for this "invisible" composite
			int numColumn = 1;
			if (needsLabel) {
				numColumn = numColumn + 1;
			}
			if (needsHelp) {
				numColumn = numColumn + 1;
			}
			GridLayout layout = new GridLayout(numColumn, false);
			composite.setLayout(layout);

			GridData layoutData = new GridData(GridData.FILL_HORIZONTAL);
			layoutData.horizontalSpan = 1;
			composite.setLayoutData(layoutData);
		}

		if (needsLabel) {
			this.label = widgetFactory.createStyledText(composite, SWT.NONE);
			this.label.setEditable(false);
			this.label.setEnabled(false);
			this.label.setLayoutData(new GridData(this.getLabelVerticalAlignment()));
		}

		if (needsHelp) {
			this.help = widgetFactory.createCLabel(composite, ""); //$NON-NLS-1$
			if (!Util.isBlank(this.getWidgetDescription().getHelpExpression())) {
				this.help.setImage(EEFIdeUiPlugin.getPlugin().getImageRegistry().get(Icons.HELP));
				this.help.setLayoutData(new GridData(this.getLabelVerticalAlignment()));
				this.help.setToolTipText(""); //$NON-NLS-1$
			}
		}

		this.createMainControl(composite, formContainer);

		this.controlDecoration = new ControlDecoration(this.getValidationControl(), SWT.TOP | SWT.LEFT);
		this.checkLockStatus();
	}

	/**
	 * Checks the current lock status and make the user interface react to it.
	 */
	private void checkLockStatus() {
		Object self = this.variableManager.getVariables().get(EEFExpressionUtils.SELF);
		if (self instanceof EObject) {
			LockStatus status = this.editingContextAdapter.getLockStatus((EObject) self);
			this.handleLockStatus(status);
		}
	}

	/**
	 * Indicates if the widget description is located directly under a group or if it is under a container.
	 *
	 * @return <code>true</code> if the widget description is directly under a group, <code>false</code> otherwise
	 */
	private boolean isInGroup() {
		EObject eContainer = this.getWidgetDescription().eContainer();

		// Test if the widget description is in a dynamic mapping directly under a group
		if (eContainer instanceof EEFDynamicMappingIf && eContainer.eContainer() instanceof EEFDynamicMappingFor) {
			EEFDynamicMappingFor dynamicMappingFor = (EEFDynamicMappingFor) eContainer.eContainer();
			return dynamicMappingFor.eContainer() instanceof EEFGroupDescription;
		}

		// Otherwise, let's test if it is directly under a group
		return eContainer instanceof EEFGroupDescription;
	}

	/**
	 * Indicates if the widget should create a label widget for its label.
	 *
	 * @return <code>true</code> if a label should be created, <code>false</code> otherwise.
	 */
	protected boolean needSeparatedLabel() {
		return true;
	}

	/**
	 * Returns the vertical alignment of the label of the widget. Use one of the following values:
	 * <ul>
	 * <li>GridData.VERTICAL_ALIGN_BEGINNING</li>
	 * <li>GridData.VERTICAL_ALIGN_CENTER</li>
	 * <li>GridData.VERTICAL_ALIGN_END</li>
	 * </ul>
	 *
	 * @return The vertical alignment of the label of the widget
	 */
	protected int getLabelVerticalAlignment() {
		// By default, the label is aligned to the top of the widget
		return GridData.VERTICAL_ALIGN_BEGINNING;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFLifecycleManager#getController()
	 */
	@Override
	protected abstract IEEFWidgetController getController();

	/**
	 * Returns the description of the widget.
	 *
	 * @return The description of the widget
	 */
	protected abstract EEFWidgetDescription getWidgetDescription();

	/**
	 * Create the main control.
	 *
	 * @param parent
	 *            The composite parent
	 * @param formContainer
	 *            The form container
	 */
	protected abstract void createMainControl(Composite parent, IEEFFormContainer formContainer);

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFLifecycleManager#aboutToBeShown()
	 */
	@Override
	public void aboutToBeShown() {
		super.aboutToBeShown();

		this.getController().onNewLabel((value) -> {
			if (!label.isDisposed() && !(label.getText() != null && label.getText().equals(value))) {
				label.setText(Optional.ofNullable(value).orElse("")); //$NON-NLS-1$
			}
			AbstractEEFWidgetLifecycleManager.this.setLabelFontStyle();
		});

		this.getController().onNewHelp((value) -> {
			if (help != null && !help.isDisposed() && !(help.getText() != null && help.getText().equals(value))) {
				help.setToolTipText(Optional.ofNullable(value).orElse(Messages.AbstractEEFWidgetLifecycleManager_noDescriptionAvailable));
			}
		});

		if (this.help != null) {
			this.mouseTrackListener = new MouseTrackListener() {

				@Override
				public void mouseHover(MouseEvent e) {
					// Defer the computation of the help message when the user hovers the Help label
					getController().computeHelp();
				}

				@Override
				public void mouseExit(MouseEvent e) {
					// Nothing todo
				}

				@Override
				public void mouseEnter(MouseEvent e) {
					// Nothing todo
				}
			};
			this.help.addMouseTrackListener(mouseTrackListener);
		}

		this.lockStatusChangedListener = (events) -> {
			Display.getDefault().asyncExec(() -> {
				events.stream().filter(event -> this.getWidgetSemanticElement().equals(event.getElement()))
						.forEach(event -> this.handleLockStatus(event.getStatus()));
			});
		};
		this.editingContextAdapter.addLockStatusChangedListener(this.lockStatusChangedListener);
	}

	/**
	 * Handles the change in the lock status by switching the user interface to a "locked by me", "locked by other" or
	 * "unlocked" state.
	 *
	 * @param status
	 *            The lock status
	 */
	private void handleLockStatus(LockStatus status) {
		if (status != null) {
			switch (status) {
			case LOCKED_BY_ME:
				AbstractEEFWidgetLifecycleManager.this.lockedByMe();
				break;
			case LOCKED_BY_OTHER:
				AbstractEEFWidgetLifecycleManager.this.lockedByOther();
				break;
			case UNLOCKED:
				AbstractEEFWidgetLifecycleManager.this.unlocked();
				break;
			default:
				AbstractEEFWidgetLifecycleManager.this.unlocked();
				break;
			}
		}
	}

	/**
	 * Returns the semantic element of the current widget.
	 *
	 * @return The semantic element of the current widget
	 */
	protected Object getWidgetSemanticElement() {
		return this.variableManager.getVariables().get(EEFExpressionUtils.SELF);
	}

	/**
	 * Sets the appearance and behavior of the widget in order to indicate that the semantic element used by the widget
	 * is currently locked by the current user. By default, it will only display a small green lock next to the
	 * validation control.
	 */
	protected void lockedByMe() {
		if (this.controlDecoration.getControl() != null) {
			this.controlDecoration.hide();
			this.controlDecoration.setDescriptionText(Messages.AbstractEEFWidgetLifecycleManager_lockedByMe);
			this.controlDecoration.setImage(EEFIdeUiPlugin.getPlugin().getImageRegistry().get(Icons.PERMISSION_GRANTED_TO_CURRENT_USER_EXCLUSIVELY));
			this.controlDecoration.show();
		}
	}

	/**
	 * Sets the appearance and behavior of the widget in order to indicate that the semantic element used by the widget
	 * is currently locked by another user. As a result, it will set the user interface in a disabled mode along with a
	 * red lock next to the widget.
	 */
	protected void lockedByOther() {
		this.setEnabled(false);

		if (this.controlDecoration.getControl() != null) {
			this.controlDecoration.hide();
			this.controlDecoration.setDescriptionText(Messages.AbstractEEFWidgetLifecycleManager_lockedByOther);
			this.controlDecoration.setImage(EEFIdeUiPlugin.getPlugin().getImageRegistry().get(Icons.PERMISSION_DENIED));
			this.controlDecoration.show();
		}
	}

	/**
	 * Sets the appearance and behavior of the widget in order to indicate that the semantic element used by the widget
	 * is currently unlocked. As a result, it will set back the widget to its default state.
	 */
	protected void unlocked() {
		this.setEnabled(this.isEnabled());

		if (this.controlDecoration.getControl() != null) {
			this.controlDecoration.hide();
		}
	}

	/**
	 * Sets the enablement of the widget.
	 *
	 * @param isEnabled
	 *            <code>true</code> when the widget should have its default behavior, <code>false</code> when the widget
	 *            should be in a read only mode.
	 */
	protected abstract void setEnabled(boolean isEnabled);

	/**
	 * Check if a widget is enabled.
	 *
	 * @return True if the widget should be enabled otherwise false.
	 */
	protected boolean isEnabled() {
		Boolean result = EvalFactory.of(interpreter, variableManager).logIfInvalidType(Boolean.class).defaultValue(Boolean.TRUE)
				.evaluate(getWidgetDescription().getIsEnabledExpression());
		return result.booleanValue();
	}

	/**
	 * Set label font style.
	 */
	protected void setLabelFontStyle() {
		EEFStyleHelper styleHelper = this.getEEFStyleHelper();
		EEFWidgetStyle style = styleHelper.getWidgetStyle(getWidgetDescription());
		IEEFTextStyleCallback callback = new EEFStyledTextStyleCallback(this.label);
		if (style != null) {
			styleHelper.applyTextStyle(style.getLabelFontNameExpression(), style.getLabelFontSizeExpression(), style.getLabelFontStyleExpression(),
					this.label.getFont(), style.getLabelBackgroundColorExpression(), style.getLabelForegroundColorExpression(), callback);
		} else {
			// Set everything back to the default value
			callback.applyForegroundColor(new EEFColor((Color) null));
			callback.applyBackgroundColor(new EEFColor((Color) null));
			callback.applyFontStyle(false, false);
			callback.applyFont(new EEFFont(null, 0, 0) {
				@Override
				public Font getFont() {
					return null;
				}
			});
		}
	}

	/**
	 * Returns the style helper used to compute the style of the widget.
	 *
	 * @return The style helper
	 */
	protected EEFStyleHelper getEEFStyleHelper() {
		return new EEFStyleHelper(interpreter, variableManager);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFLifecycleManager#refresh()
	 */
	@Override
	public void refresh() {
		super.refresh();

		this.checkLockStatus();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFLifecycleManager#aboutToBeHidden()
	 */
	@Override
	public void aboutToBeHidden() {
		super.aboutToBeHidden();
		if (this.help != null && !this.help.isDisposed()) {
			this.help.removeMouseTrackListener(mouseTrackListener);
		}

		this.getController().removeNewLabelConsumer();
		this.editingContextAdapter.removeLockStatusChangedListener(this.lockStatusChangedListener);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.IEEFLifecycleManager#dispose()
	 */
	@Override
	public void dispose() {
		EEFIdeUiPlugin.getPlugin().debug("AbstractEEFWidgetLifeCycleManager#dispose()"); //$NON-NLS-1$
	}

	/**
	 * Returns the <code>IStructuredSelection</code> of the specified viewer.
	 * <p>
	 * Backport of <code>StructuredViewer.getStructuredSelection()</code> which was introduced in JFace 3.11 (Mars) to
	 * work with JFace 3.10 (Luna).
	 * </p>
	 *
	 * @param viewer
	 *            the viewer.
	 * @return IStructuredSelection
	 * @throws ClassCastException
	 *             if the selection of the viewer is not an instance of IStructuredSelection
	 */
	protected IStructuredSelection getStructuredSelection(StructuredViewer viewer) throws ClassCastException {
		ISelection selection = viewer.getSelection();
		if (selection instanceof IStructuredSelection) {
			return (IStructuredSelection) selection;
		}
		throw new ClassCastException(Messages.AbstractEEFWidgetLifecycleManager_invalidSelectionType);
	}

}
