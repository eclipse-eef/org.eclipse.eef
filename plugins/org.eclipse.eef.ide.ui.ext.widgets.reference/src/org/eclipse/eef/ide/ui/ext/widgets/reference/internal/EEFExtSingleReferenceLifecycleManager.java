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
package org.eclipse.eef.ide.ui.ext.widgets.reference.internal;

import org.eclipse.eef.common.ui.api.IEEFFormContainer;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.ext.widgets.reference.internal.EEFExtReferenceController;
import org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.EEFExtReferenceDescription;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;

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
	 * @param contextAdapter
	 *            The context adapter
	 */
	public EEFExtSingleReferenceLifecycleManager(EEFExtReferenceDescription description, EObject target, EReference eReference,
			IVariableManager variableManager, IInterpreter interpreter, EditingContextAdapter contextAdapter) {
		super(description, target, eReference, variableManager, interpreter, contextAdapter);
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

		Composite referenceComposite = this.widgetFactory.createFlatFormComposite(parent);
		GridLayout gridLayout = new GridLayout(3, false);
		gridLayout.verticalSpacing = 0;
		gridLayout.marginHeight = 0;
		referenceComposite.setLayout(gridLayout);

		GridData referenceCompositeGridData = new GridData(SWT.FILL, SWT.CENTER, true, false);
		referenceComposite.setLayoutData(referenceCompositeGridData);

		this.composedAdapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

		this.createLabel(referenceComposite);

		Composite buttonsComposite = this.widgetFactory.createFlatFormComposite(referenceComposite);
		GridData buttonCompositeGridData = new GridData();
		buttonsComposite.setLayoutData(buttonCompositeGridData);

		if (!this.eReference.isContainment()) {
			buttonsComposite.setLayout(new GridLayout(3, true));

			Image browseImage = ExtendedImageRegistry.INSTANCE.getImage(EEFExtReferenceUIPlugin.getPlugin().getImage(
					EEFExtReferenceUIPlugin.Implementation.BROWSE_ICON_PATH));
			this.browseButton = this.createButton(buttonsComposite, browseImage);
		} else {
			buttonsComposite.setLayout(new GridLayout(2, true));
		}

		Image addImage = ExtendedImageRegistry.INSTANCE.getImage(EEFExtReferenceUIPlugin.getPlugin().getImage(
				EEFExtReferenceUIPlugin.Implementation.ADD_ICON_PATH));
		Image removeImage = ExtendedImageRegistry.INSTANCE.getImage(EEFExtReferenceUIPlugin.getPlugin().getImage(
				EEFExtReferenceUIPlugin.Implementation.REMOVE_ICON_PATH));
		this.addButton = this.createButton(buttonsComposite, addImage);
		this.removeButton = this.createButton(buttonsComposite, removeImage);

		this.widgetFactory.paintBordersFor(parent);

		this.controller = new EEFExtReferenceController(this.description, this.variableManager, this.interpreter);
	}

	/**
	 * Creates the label showing the value of the reference.
	 *
	 * @param parent
	 *            The parent composite
	 */
	private void createLabel(Composite parent) {
		this.image = this.widgetFactory.createLabel(parent, "", SWT.NONE); //$NON-NLS-1$
		this.text = this.widgetFactory.createLabel(parent, "", SWT.NONE); //$NON-NLS-1$

		GridData gridData = new GridData();
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalAlignment = SWT.FILL;

		this.text.setLayoutData(gridData);
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
		IWizard wizard = new EEFExtEObjectSelectionWizard(this.target, this.eReference, this.contextAdapter);
		WizardDialog wizardDialog = new WizardDialog(this.text.getShell(), wizard);
		wizardDialog.open();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.ext.widgets.reference.internal.AbstractEEFExtReferenceLifecycleManager#addButtonCallback()
	 */
	@Override
	protected void addButtonCallback() {
		IWizard wizard = new EEFExtEObjectCreationWizard(this.target, eReference, this.contextAdapter);
		WizardDialog wizardDialog = new WizardDialog(this.text.getShell(), wizard);
		wizardDialog.open();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.ext.widgets.reference.internal.AbstractEEFExtReferenceLifecycleManager#removeButtonCallback()
	 */
	@Override
	protected void removeButtonCallback() {
		this.target.eUnset(this.eReference);
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
				this.text.setText(labelProvider.getText(value));
				this.image.setImage(ExtendedImageRegistry.INSTANCE.getImage(labelProvider.getImage(value)));
			}
		} else if (value == null) {
			this.image.setImage(null);
			this.text.setText(Messages.SingleReference_noValue);
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

}
