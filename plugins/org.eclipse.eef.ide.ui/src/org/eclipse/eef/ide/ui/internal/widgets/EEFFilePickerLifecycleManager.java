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
import java.util.concurrent.atomic.AtomicBoolean;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.eef.EEFFilePickerDescription;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.common.api.utils.Util;
import org.eclipse.eef.common.ui.api.EEFWidgetFactory;
import org.eclipse.eef.common.ui.api.IEEFFormContainer;
import org.eclipse.eef.core.api.EEFExpressionUtils;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.controllers.EEFControllersFactory;
import org.eclipse.eef.core.api.controllers.IEEFFilePickerController;
import org.eclipse.eef.core.api.controllers.IEEFWidgetController;
import org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager;
import org.eclipse.eef.ide.ui.internal.EEFIdeUiPlugin;
import org.eclipse.eef.ide.ui.internal.Icons;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.SWTException;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.forms.widgets.FormToolkit;

/**
 * This class will be used in order to manager the lifecycle of a file picker.
 *
 * @author arichard
 */
public class EEFFilePickerLifecycleManager extends AbstractEEFWidgetLifecycleManager {

	/**
	 * The description.
	 */
	private EEFFilePickerDescription description;

	/**
	 * The text field associated to the file picker.
	 */
	private StyledText text;

	/**
	 * The button to launch the file picker.
	 */
	private Button pickButton;

	/**
	 * The controller.
	 */
	private IEEFFilePickerController controller;

	/**
	 * The listener on the text field.
	 */
	private FocusListener focusListener;

	/**
	 * The widget factory.
	 */
	private EEFWidgetFactory widgetFactory;

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
	 * The reference value of the file picker, as last rendered from the state of the actual model.
	 */
	private String referencePath = ""; //$NON-NLS-1$

	/**
	 * Indicates that the text field is dirty.
	 */
	private boolean isDirty;

	/**
	 * The listener used to indicate that the pick button has been selected.
	 */
	private SelectionAdapter pickButtonSelectionListener;

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
	public EEFFilePickerLifecycleManager(EEFFilePickerDescription description, IVariableManager variableManager, IInterpreter interpreter,
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
		this.widgetFactory = formContainer.getWidgetFactory();

		Composite filePickerComposite = this.widgetFactory.createFlatFormComposite(parent);
		GridLayout filePickerGridLayout = new GridLayout(2, false);
		filePickerComposite.setLayout(filePickerGridLayout);

		GridData filePickerCompositeGridData = new GridData(SWT.FILL, SWT.CENTER, true, false);
		filePickerCompositeGridData.horizontalIndent = VALIDATION_MARKER_OFFSET;
		filePickerComposite.setLayoutData(filePickerCompositeGridData);

		this.text = this.widgetFactory.createStyledText(filePickerComposite, SWT.SINGLE);
		GridData textGridData = new GridData(SWT.FILL, SWT.CENTER, true, false);
		this.text.setLayoutData(textGridData);
		this.text.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);

		this.pickButton = this.widgetFactory.createButton(filePickerComposite, "", SWT.PUSH); //$NON-NLS-1$
		this.pickButton.setImage(EEFIdeUiPlugin.getPlugin().getImageRegistry().get(Icons.SEARCH));
		GridData pickButtonGridData = new GridData(SWT.FILL, SWT.CENTER, false, false);
		this.pickButton.setLayoutData(pickButtonGridData);

		this.widgetFactory.paintBordersFor(parent);

		this.controller = new EEFControllersFactory().createFilePickerController(this.description, this.variableManager, this.interpreter,
				this.contextAdapter);
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

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.IEEFLifecycleManager#aboutToBeShown()
	 */
	@Override
	public void aboutToBeShown() {
		super.aboutToBeShown();

		this.modifyListener = (e) -> {
			if (!EEFFilePickerLifecycleManager.this.container.isRenderingInProgress() && !updateInProgress.get()) {
				EEFFilePickerLifecycleManager.this.isDirty = true;

				List<EObject> elements = new ArrayList<EObject>();
				Object object = EEFFilePickerLifecycleManager.this.variableManager.getVariables().get(EEFExpressionUtils.SELF);
				if (object instanceof EObject) {
					elements.add((EObject) object);
				}
				EEFFilePickerLifecycleManager.this.contextAdapter.lock(elements);
			}
		};
		this.text.addModifyListener(this.modifyListener);

		this.focusListener = new FocusListener() {
			@Override
			public void focusLost(FocusEvent e) {
				if (!EEFFilePickerLifecycleManager.this.container.isRenderingInProgress() && EEFFilePickerLifecycleManager.this.isDirty) {
					EEFFilePickerLifecycleManager.this.updatePath(false);
				}
			}

			@Override
			public void focusGained(FocusEvent e) {
				// do nothing
			}
		};
		this.text.addFocusListener(this.focusListener);

		this.pickButtonSelectionListener = new SelectionAdapter() {
			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (!EEFFilePickerLifecycleManager.this.container.isRenderingInProgress()) {
					FileDialog filePicker = new FileDialog(new Shell(Display.getCurrent()));
					filePicker.setFilterPath(EEFFilePickerLifecycleManager.this.referencePath);
					try {
						String newPath = filePicker.open();
						if (newPath != null) {
							EEFFilePickerLifecycleManager.this.isDirty = true;
							EEFFilePickerLifecycleManager.this.referencePath = newPath;
							EEFFilePickerLifecycleManager.this.text.setText(newPath);
							EEFFilePickerLifecycleManager.this.updatePath(false);
						}
					} catch (SWTException ex) {
						EEFIdeUiPlugin.INSTANCE.log(ex);
					}
				}
			}
		};
		this.pickButton.addSelectionListener(this.pickButtonSelectionListener);

		this.controller.onNewPath((newPath) -> {
			if (!this.text.isDisposed()) {
				String display = ""; //$NON-NLS-1$
				if (newPath != null) {
					display = Util.firstNonNull(newPath.toString(), display);
				}
				if (!(this.text.getText() != null && text.getText().equals(display))) {
					this.text.setText(display);
					this.referencePath = text.getText();
				}
				if (!this.text.isEnabled()) {
					this.text.setEnabled(true);
				}
			}
		});
	}

	/**
	 * Updates the path.
	 *
	 * @param force
	 *            if <code>true</code>, update even if we are in the render phase.
	 */
	private void updatePath(boolean force) {
		boolean shouldUpdateWhileRendering = !EEFFilePickerLifecycleManager.this.container.isRenderingInProgress() || force;
		if (!this.text.isDisposed() && this.isDirty && shouldUpdateWhileRendering && this.updateInProgress.compareAndSet(false, true)) {
			try {
				IStatus result = controller.updatePath(text.getText());
				if (result != null && result.getSeverity() == IStatus.ERROR) {
					EEFIdeUiPlugin.INSTANCE.log(result);
					this.text.setText(referencePath);
				} else {
					this.referencePath = text.getText();
					refresh();
				}
				this.isDirty = false;
			} finally {
				this.updateInProgress.set(false);

				List<EObject> elements = new ArrayList<EObject>();
				Object object = this.variableManager.getVariables().get(EEFExpressionUtils.SELF);
				if (object instanceof EObject) {
					elements.add((EObject) object);
				}
				this.contextAdapter.unlock(elements);
			}
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
			this.updatePath(true);
		}
		if (!this.pickButton.isDisposed()) {
			this.pickButton.removeSelectionListener(this.pickButtonSelectionListener);
		}
		if (!this.text.isDisposed()) {
			this.text.removeModifyListener(this.modifyListener);
		}
		if (!text.isDisposed()) {
			this.text.removeFocusListener(this.focusListener);
		}
		this.controller.removeNewPathConsumer();
		super.aboutToBeHidden();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager#setEnabled(boolean)
	 */
	@Override
	protected void setEnabled(boolean isEnabled) {
		this.text.setEnabled(isEnabled);
	}
}
