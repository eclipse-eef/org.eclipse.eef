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
package org.eclipse.eef.ide.ui.ext.widgets.nebula.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.common.api.utils.Util;
import org.eclipse.eef.common.ui.api.IEEFFormContainer;
import org.eclipse.eef.core.api.EEFExpressionUtils;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.controllers.IEEFWidgetController;
import org.eclipse.eef.core.ext.widgets.nebula.api.IEEFExtNebulaRichTextController;
import org.eclipse.eef.core.ext.widgets.nebula.internal.EEFExtNebulaRichTextController;
import org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula.EEFExtNebulaRichTextDescription;
import org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager;
import org.eclipse.eef.ide.ui.internal.EEFIdeUiPlugin;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.nebula.widgets.richtext.RichTextEditor;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.forms.widgets.FormToolkit;

/**
 * This class will be used in order to manager the lifecycle of a Nebula
 * RichText.
 *
 * @author arichard
 */
public class EEFExtNebulaRichTextLifecycleManager extends AbstractEEFWidgetLifecycleManager {

	/**
	 * Height hint for the RichText editor.
	 */
	private static final int TEXT_AREA_HEIGHT_HINT = 400;

	/**
	 * This constant is used in order to tell SWT that the text area should be
	 * 300px wide even if it is not useful. The layout data should work by
	 * themselves but it seems that there is a bug with SWT so, this useless
	 * information on the width of the text area make it work. Don't ask me why
	 * :)
	 */
	private static final int TEXT_AREA_WIDTH_HINT = 300;

	/**
	 * The description.
	 */
	private EEFExtNebulaRichTextDescription description;

	/**
	 * The RichText.
	 */
	private RichTextEditor richTextEditor;

	/**
	 * The controller.
	 */
	private IEEFExtNebulaRichTextController controller;

	/**
	 * The listener on the text field.
	 */
	private FocusListener focusListener;

	/**
	 * The key listener on the text field (unused for a multi-line text field).
	 */
	private KeyListener keyListener;

	/**
	 * The listener used to indicate that the text field is dirty.
	 */
	private ModifyListener modifyListener;

	/**
	 * Used to make the SelectionListener reentrant, to avoid infinite loops
	 * when we need to revert the UI state on error (as reverting the UI
	 * re-triggers the SelectionListener).
	 */
	private AtomicBoolean updateInProgress = new AtomicBoolean(false);

	/**
	 * The reference value of the text, as last rendered from the state of the
	 * actual model.
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
	public EEFExtNebulaRichTextLifecycleManager(EEFExtNebulaRichTextDescription description,
			IVariableManager variableManager, IInterpreter interpreter, EditingContextAdapter contextAdapter) {
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

		this.richTextEditor = new RichTextEditor(parent);
		GridData gridData = new GridData(SWT.FILL, SWT.BEGINNING, true, false);
		gridData.heightHint = TEXT_AREA_HEIGHT_HINT;
		gridData.widthHint = TEXT_AREA_WIDTH_HINT;
		gridData.horizontalIndent = VALIDATION_MARKER_OFFSET;
		
		this.richTextEditor.setLayoutData(gridData);
		this.richTextEditor.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);

		this.controller = new EEFExtNebulaRichTextController(this.description, this.variableManager, this.interpreter,
				this.contextAdapter);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager#getLabelVerticalAlignment()
	 */
	@Override
	protected int getLabelVerticalAlignment() {
		return GridData.VERTICAL_ALIGN_BEGINNING;
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

		this.modifyListener = event -> {
			if (!this.container.isRenderingInProgress() && !this.updateInProgress.get()) {
				this.isDirty = true;

				List<EObject> elements = new ArrayList<EObject>();
				Object object = this.variableManager.getVariables().get(EEFExpressionUtils.SELF);
				if (object instanceof EObject) {
					elements.add((EObject) object);
				}
				this.contextAdapter.lock(elements);
			}
		};
		this.richTextEditor.addModifyListener(this.modifyListener);

		this.focusListener = new FocusListener() {
			@Override
			public void focusLost(FocusEvent e) {
				if (!EEFExtNebulaRichTextLifecycleManager.this.container.isRenderingInProgress()
						&& EEFExtNebulaRichTextLifecycleManager.this.isDirty) {
					EEFExtNebulaRichTextLifecycleManager.this.updateValue(false);
				}
			}

			@Override
			public void focusGained(FocusEvent e) {
				// do nothing
			}
		};
		this.richTextEditor.addFocusListener(this.focusListener);

		this.keyListener = new KeyListener() {
			@Override
			public void keyReleased(KeyEvent e) {
				if (e.character == '\r' || e.character == '\n') {
					EEFExtNebulaRichTextLifecycleManager.this.updateValue(false);
				}
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// do nothing
			}
		};
		this.richTextEditor.addKeyListener(this.keyListener);

		this.controller.onNewValue(value -> {
			if (!this.richTextEditor.isDisposed()) {
				String display = ""; //$NON-NLS-1$
				if (value != null) {
					display = Util.firstNonNull(value.toString(), display);
				}
				//if (!(this.richTextEditor.getText() != null && this.richTextEditor.getText().equals(display))) {
					this.richTextEditor.setText(display);
					this.referenceValue = this.richTextEditor.getText();
				//}
				if (!this.richTextEditor.isEnabled()) {
					this.richTextEditor.setEnabled(true);
				}
			}
		});
	}

	/**
	 * Updates the value.
	 *
	 * @param force
	 *            if <code>true</code>, update even if we are in the render
	 *            phase.
	 */
	private void updateValue(boolean force) {
		boolean shouldUpdateWhileRendering = !EEFExtNebulaRichTextLifecycleManager.this.container
				.isRenderingInProgress() || force;
		if (!this.richTextEditor.isDisposed() && this.isDirty && shouldUpdateWhileRendering
				&& updateInProgress.compareAndSet(false, true)) {
			try {
				IStatus result = this.controller.updateValue(this.richTextEditor.getText());
				if (result != null && result.getSeverity() == IStatus.ERROR) {
					EEFIdeUiPlugin.INSTANCE.log(result);
					this.richTextEditor.setText(this.referenceValue);
				} else {
					this.referenceValue = this.richTextEditor.getText();
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
		return this.richTextEditor;
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

		if (!richTextEditor.isDisposed()) {
			this.richTextEditor.removeFocusListener(this.focusListener);
		}
		this.controller.removeNewValueConsumer();

		if (!this.richTextEditor.isDisposed()) {
			this.richTextEditor.removeModifyListener(this.modifyListener);
		}

		if (!this.richTextEditor.isDisposed()) {
			this.richTextEditor.removeKeyListener(this.keyListener);
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager#setEnabled(boolean)
	 */
	@Override
	protected void setEnabled(boolean isEnabled) {
		this.richTextEditor.setEnabled(isEnabled);
	}

}
