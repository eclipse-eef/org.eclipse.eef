/*******************************************************************************
 * Copyright (c) 2016, 2018 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors: Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.eef.ide.ui.ext.widgets.reference.internal;

import java.util.Optional;

import org.eclipse.eef.common.ui.api.IEEFFormContainer;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.ext.widgets.reference.internal.EEFExtReferenceController;
import org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.EEFExtReferenceDescription;
import org.eclipse.eef.ide.ui.api.widgets.EEFHyperlinkListener;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.forms.widgets.Hyperlink;

/**
 * This lifecycle manager is used to handle the EEF Extension reference widget for mono-valued EReferences.
 *
 * @author sbegaudeau
 */
public class EEFExtSingleReferenceLifecycleManager extends AbstractEEFExtReferenceLifecycleManager {

	/**
	 * The image of the current value.
	 */
	private Label image;

	/**
	 * The label showing the current value.
	 */
	private Label text;

	/**
	 * The hyperlink showing the current value.
	 */
	private Hyperlink hyperlink;

	/**
	 * The listener on the hyperlink.
	 */
	private MouseListener hyperlinkListener;

	/**
	 * The constructor.
	 *
	 * @param description
	 *            The description of the reference
	 * @param target
	 *            The target
	 * @param eReference
	 *            The EReference to display
	 * @param variableManager
	 *            The variable manager
	 * @param interpreter
	 *            The interpreter
	 * @param editingContextAdapter
	 *            The context adapter
	 */
	public EEFExtSingleReferenceLifecycleManager(EEFExtReferenceDescription description, EObject target, EReference eReference,
			IVariableManager variableManager, IInterpreter interpreter, EditingContextAdapter editingContextAdapter) {
		super(description, target, eReference, variableManager, interpreter, editingContextAdapter);
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

		Composite referenceComposite = this.widgetFactory.createComposite(parent);
		GridLayout gridLayout = new GridLayout(3, false);
		gridLayout.verticalSpacing = 0;
		gridLayout.marginHeight = 0;
		gridLayout.marginWidth = 0;
		referenceComposite.setLayout(gridLayout);

		GridData referenceCompositeGridData = new GridData(SWT.FILL, SWT.CENTER, true, false);
		referenceComposite.setLayoutData(referenceCompositeGridData);

		this.composedAdapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		this.composedAdapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());

		this.createLabel(referenceComposite);

		Composite buttonsComposite = this.widgetFactory.createComposite(referenceComposite);
		GridData buttonCompositeGridData = new GridData();
		buttonsComposite.setLayoutData(buttonCompositeGridData);

		GridLayout buttonsLayout = new GridLayout(1, true);
		buttonsLayout.marginHeight = 0;
		buttonsLayout.marginWidth = 0;

		if (!this.eReference.isContainment()) {

			Image browseImage = ExtendedImageRegistry.INSTANCE
					.getImage(EEFExtReferenceUIPlugin.getPlugin().getImage(EEFExtReferenceUIPlugin.Implementation.BROWSE_ICON_PATH));
			this.browseButton = this.createButton(buttonsComposite, browseImage);
		}
		buttonsComposite.setLayout(buttonsLayout);

		Image addImage = ExtendedImageRegistry.INSTANCE
				.getImage(EEFExtReferenceUIPlugin.getPlugin().getImage(EEFExtReferenceUIPlugin.Implementation.ADD_ICON_PATH));
		Image removeImage = ExtendedImageRegistry.INSTANCE
				.getImage(EEFExtReferenceUIPlugin.getPlugin().getImage(EEFExtReferenceUIPlugin.Implementation.REMOVE_ICON_PATH));
		this.addButton = this.createButton(buttonsComposite, addImage);
		this.removeButton = this.createButton(buttonsComposite, removeImage);

		buttonsLayout.numColumns = buttonsComposite.getChildren().length;

		this.controller = new EEFExtReferenceController(this.description, this.variableManager, this.interpreter, this.editingContextAdapter);
	}

	/**
	 * Creates the label showing the value of the reference.
	 *
	 * @param parent
	 *            The parent composite
	 */
	private void createLabel(Composite parent) {
		this.image = this.widgetFactory.createLabel(parent, "", SWT.NONE); //$NON-NLS-1$
		GridData imageGd = new GridData();
		imageGd.horizontalIndent = VALIDATION_MARKER_OFFSET;
		image.setLayoutData(imageGd);

		String onClickExpression = Optional.ofNullable(this.description.getOnClickExpression()).orElse(""); //$NON-NLS-1$
		if (onClickExpression.isEmpty()) {
			this.text = this.widgetFactory.createLabel(parent, "", SWT.NONE); //$NON-NLS-1$
			this.text.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		} else {
			this.hyperlink = this.widgetFactory.createHyperlink(parent, "", SWT.NONE); //$NON-NLS-1$
			this.hyperlink.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		}

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
	 * @see org.eclipse.eef.ide.ui.ext.widgets.reference.internal.AbstractEEFExtReferenceLifecycleManager#browseButtonCallback()
	 */
	@Override
	protected void browseButtonCallback() {
		IWizard wizard = new EEFExtEObjectSelectionWizard(this.target, this.eReference, this.editingContextAdapter);
		WizardDialog wizardDialog = new WizardDialog(this.image.getShell(), wizard);
		wizardDialog.open();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.ext.widgets.reference.internal.AbstractEEFExtReferenceLifecycleManager#addButtonCallback()
	 */
	@Override
	protected void addButtonCallback() {
		IWizard wizard = new EEFExtEObjectCreationWizard(this.target, this.eReference, this.editingContextAdapter);
		WizardDialog wizardDialog = new WizardDialog(this.image.getShell(), wizard);
		wizardDialog.open();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.ext.widgets.reference.internal.AbstractEEFExtReferenceLifecycleManager#removeButtonCallback()
	 */
	@Override
	protected void removeButtonCallback() {
		this.editingContextAdapter.performModelChange(() -> target.eUnset(eReference));
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.ext.widgets.reference.internal.AbstractEEFExtReferenceLifecycleManager#refresh()
	 */
	@Override
	public void refresh() {
		super.refresh();

		Object value = this.target.eGet(this.eReference);
		if (value instanceof EObject) {
			Adapter adapter = this.composedAdapterFactory.adapt((EObject) value, IItemLabelProvider.class);
			if (adapter instanceof IItemLabelProvider) {
				IItemLabelProvider labelProvider = (IItemLabelProvider) adapter;
				this.image.setImage(ExtendedImageRegistry.INSTANCE.getImage(labelProvider.getImage(value)));

				String onClickExpression = Optional.ofNullable(this.description.getOnClickExpression()).orElse(""); //$NON-NLS-1$
				if (onClickExpression.isEmpty()) {
					this.text.setText(labelProvider.getText(value));
				} else {
					this.hyperlink.setText(labelProvider.getText(value));
					this.hyperlink.setData(value);
				}
			}
		} else if (value == null) {
			this.image.setImage(null);

			String onClickExpression = Optional.ofNullable(this.description.getOnClickExpression()).orElse(""); //$NON-NLS-1$
			if (onClickExpression.isEmpty()) {
				this.text.setText(Messages.SingleReference_noValue);
			} else {
				this.hyperlink.setText(Messages.SingleReference_noValue);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.ext.widgets.reference.internal.AbstractEEFExtReferenceLifecycleManager#setEnabled(boolean)
	 */
	@Override
	protected void setEnabled(boolean isEnabled) {
		super.setEnabled(isEnabled);

		if (this.browseButton != null && !this.browseButton.isDisposed()) {
			this.browseButton.setEnabled(isEnabled);
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFLifecycleManager#getValidationControl()
	 */
	@Override
	protected Control getValidationControl() {
		return this.image;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.ext.widgets.reference.internal.AbstractEEFExtReferenceLifecycleManager#aboutToBeShown()
	 */
	@Override
	public void aboutToBeShown() {
		super.aboutToBeShown();

		String onClickExpression = Optional.ofNullable(this.description.getOnClickExpression()).orElse(""); //$NON-NLS-1$
		if (!onClickExpression.isEmpty()) {
			this.hyperlinkListener = new EEFHyperlinkListener(this, this.hyperlink, this.container, this.controller);
			hyperlink.addMouseListener(hyperlinkListener);
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.ext.widgets.reference.internal.AbstractEEFExtReferenceLifecycleManager#aboutToBeHidden()
	 */
	@Override
	public void aboutToBeHidden() {
		super.aboutToBeHidden();

		if (this.hyperlink != null && !this.hyperlink.isDisposed() && this.hyperlinkListener != null) {
			this.hyperlink.removeMouseListener(this.hyperlinkListener);
		}
	}
}
