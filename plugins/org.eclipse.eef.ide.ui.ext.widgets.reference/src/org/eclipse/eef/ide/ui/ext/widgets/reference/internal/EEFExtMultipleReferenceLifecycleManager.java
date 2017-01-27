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
package org.eclipse.eef.ide.ui.ext.widgets.reference.internal;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.eef.common.ui.api.IEEFFormContainer;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.ext.widgets.reference.internal.EEFExtReferenceController;
import org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.EEFExtReferenceDescription;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.celleditor.FeatureEditorDialog;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Table;

/**
 * This lifecycle manager is used to handle the EEF Extension reference widget for multi-valued EReferences.
 *
 * @author sbegaudeau
 */
public class EEFExtMultipleReferenceLifecycleManager extends AbstractEEFExtReferenceLifecycleManager {

	/**
	 * Minimal height of the table widget.
	 */
	private static final int TABLE_MINIMAL_HEIGHT = 150;

	/**
	 * The table viewer.
	 */
	private TableViewer tableViewer;

	/**
	 * The up button.
	 */
	private Button upButton;

	/**
	 * The listener for the up button.
	 */
	private ButtonSelectionListener upButtonListener;

	/**
	 * The down button.
	 */
	private Button downButton;

	/**
	 * The listener for the down button.
	 */
	private ButtonSelectionListener downButtonListener;

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
	public EEFExtMultipleReferenceLifecycleManager(EEFExtReferenceDescription description, EObject target, EReference eReference,
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
		GridLayout referenceGridLayout = new GridLayout(2, false);
		referenceComposite.setLayout(referenceGridLayout);

		GridData referenceCompositeGridData = new GridData(SWT.FILL, SWT.CENTER, true, false);
		referenceComposite.setLayoutData(referenceCompositeGridData);

		this.createTable(referenceComposite);

		Composite buttonsComposite = this.widgetFactory.createFlatFormComposite(referenceComposite);
		GridData buttonCompositeGridData = new GridData();
		buttonCompositeGridData.verticalAlignment = SWT.BEGINNING;
		buttonsComposite.setLayoutData(buttonCompositeGridData);

		GridLayout buttonCompositeGridLayout = new GridLayout(1, false);
		buttonCompositeGridLayout.marginHeight = 0;
		buttonsComposite.setLayout(buttonCompositeGridLayout);

		if (!this.eReference.isContainment()) {
			Image browseImage = ExtendedImageRegistry.INSTANCE
					.getImage(EEFExtReferenceUIPlugin.getPlugin().getImage(EEFExtReferenceUIPlugin.Implementation.BROWSE_ICON_PATH));
			this.browseButton = this.createButton(buttonsComposite, browseImage);
		}

		Image addImage = ExtendedImageRegistry.INSTANCE
				.getImage(EEFExtReferenceUIPlugin.getPlugin().getImage(EEFExtReferenceUIPlugin.Implementation.ADD_ICON_PATH));
		Image removeImage = ExtendedImageRegistry.INSTANCE
				.getImage(EEFExtReferenceUIPlugin.getPlugin().getImage(EEFExtReferenceUIPlugin.Implementation.REMOVE_ICON_PATH));
		Image upImage = ExtendedImageRegistry.INSTANCE
				.getImage(EEFExtReferenceUIPlugin.getPlugin().getImage(EEFExtReferenceUIPlugin.Implementation.UP_ICON_PATH));
		Image downImage = ExtendedImageRegistry.INSTANCE
				.getImage(EEFExtReferenceUIPlugin.getPlugin().getImage(EEFExtReferenceUIPlugin.Implementation.DOWN_ICON_PATH));

		this.addButton = this.createButton(buttonsComposite, addImage);
		this.removeButton = this.createButton(buttonsComposite, removeImage);
		this.upButton = this.createButton(buttonsComposite, upImage);
		this.downButton = this.createButton(buttonsComposite, downImage);

		this.widgetFactory.paintBordersFor(parent);

		this.controller = new EEFExtReferenceController(this.description, this.variableManager, this.interpreter);
	}

	/**
	 * Creates the table used to display the reference.
	 *
	 * @param parent
	 *            The parent composite
	 */
	private void createTable(Composite parent) {
		ScrolledComposite scrolledComposite = this.widgetFactory.createScrolledComposite(parent, SWT.NONE);
		GridData gridData = new GridData();
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalAlignment = SWT.FILL;
		scrolledComposite.setLayoutData(gridData);

		// CHECKSTYLE:OFF
		int style = SWT.READ_ONLY | SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.BORDER | SWT.SINGLE | SWT.VIRTUAL;
		// CHECKSTYLE:ON

		Table table = this.widgetFactory.createTable(scrolledComposite, style);
		this.tableViewer = new TableViewer(table);

		GridData tableGridData = new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1);
		tableGridData.horizontalIndent = VALIDATION_MARKER_OFFSET;
		this.tableViewer.getTable().setLayoutData(tableGridData);

		this.composedAdapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		this.composedAdapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());

		this.tableViewer.setContentProvider(new EReferenceContentProvider(this.eReference));
		this.tableViewer.setLabelProvider(new DelegatingStyledCellLabelProvider(
				new AdapterFactoryLabelProvider.StyledLabelProvider(this.composedAdapterFactory, this.tableViewer)));

		scrolledComposite.setContent(table);

		final int clientWidth = scrolledComposite.getClientArea().width;
		this.tableViewer.getTable().setSize(clientWidth, TABLE_MINIMAL_HEIGHT);

		scrolledComposite.setExpandHorizontal(true);
		scrolledComposite.setAlwaysShowScrollBars(true);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.ext.widgets.reference.internal.AbstractEEFExtReferenceLifecycleManager#aboutToBeShown()
	 */
	@Override
	public void aboutToBeShown() {
		super.aboutToBeShown();

		this.initializeMoveButton(Direction.UP);
		this.initializeMoveButton(Direction.DOWN);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.ext.widgets.reference.internal.AbstractEEFExtReferenceLifecycleManager#browseButtonCallback()
	 */
	@Override
	protected void browseButtonCallback() {
		Object adapter = this.composedAdapterFactory.adapt(this.target, IItemPropertySource.class);
		if (adapter instanceof IItemPropertySource) {
			IItemPropertySource propertySource = (IItemPropertySource) adapter;
			IItemPropertyDescriptor propertyDescriptor = propertySource.getPropertyDescriptor(this.target, this.eReference);
			if (propertyDescriptor != null) {
				ArrayList<Object> choiceOfValues = new ArrayList<Object>(propertyDescriptor.getChoiceOfValues(this.target));
				FeatureEditorDialog dialog = new FeatureEditorDialog(this.tableViewer.getTable().getShell(),
						new AdapterFactoryLabelProvider(this.composedAdapterFactory), this.target, this.eReference,
						propertyDescriptor.getDisplayName(this.target), choiceOfValues);
				dialog.open();

				EList<?> result = dialog.getResult();
				if (result != null) {
					this.target.eSet(this.eReference, result);
				}
			}
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.ext.widgets.reference.internal.AbstractEEFExtReferenceLifecycleManager#addButtonCallback()
	 */
	@Override
	protected void addButtonCallback() {
		IWizard wizard = new EEFExtEObjectCreationWizard(this.target, this.eReference, this.contextAdapter);
		WizardDialog wizardDialog = new WizardDialog(this.tableViewer.getTable().getShell(), wizard);
		wizardDialog.open();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.ext.widgets.reference.internal.AbstractEEFExtReferenceLifecycleManager#removeButtonCallback()
	 */
	@Override
	protected void removeButtonCallback() {
		this.contextAdapter.performModelChange(() -> {
			List<Object> objects = selectionToList(tableViewer.getSelection());
			for (Object object : objects) {
				EcoreUtil.remove(target, eReference, object);
			}
		});
	}

	/**
	 * Initializes the up button.
	 *
	 * @param direction
	 *            The direction
	 */
	private void initializeMoveButton(final Direction direction) {
		ButtonSelectionListener listener = new ButtonSelectionListener(this.contextAdapter, () -> this.moveButtonCallback(direction));

		if (direction == Direction.UP) {
			this.upButtonListener = listener;
			this.upButton.addSelectionListener(this.upButtonListener);
			this.upButton.setToolTipText(Messages.ReferenceUpButton_tooltipText);
		} else {
			this.downButtonListener = listener;
			this.downButton.addSelectionListener(this.downButtonListener);
			this.downButton.setToolTipText(Messages.ReferenceDownButton_tooltipText);
		}
	}

	/**
	 * This method is called once the move button is clicked in order to move the selected element up or down depending
	 * of the given direction.
	 *
	 * @param direction
	 *            The direction
	 */
	private void moveButtonCallback(Direction direction) {
		List<Object> objects = this.selectionToList(this.tableViewer.getSelection());

		EList<?> values = this.getValues();
		for (Object object : objects) {
			if (direction == Direction.UP) {
				values.move(Math.max(0, values.indexOf(object) - 1), values.indexOf(object));
			} else {
				values.move(Math.min(values.size() - 1, values.indexOf(object) + 1), values.indexOf(object));
			}
		}
	}

	/**
	 * Returns the value of the reference for the self EObject.
	 *
	 * @return The value of the reference for the self EObject or <code>null</code> if it could not be found
	 */
	private EList<?> getValues() {
		Object value = this.target.eGet(this.eReference);
		if (value instanceof EList<?>) {
			return (EList<?>) value;
		}
		return new BasicEList<>();
	}

	/**
	 * Returns a list containing all the objects of the given selection.
	 *
	 * @param selection
	 *            The selection
	 * @return The objects of the given selection
	 */
	private List<Object> selectionToList(ISelection selection) {
		List<Object> objects = new ArrayList<>();
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			for (Object object : structuredSelection.toArray()) {
				objects.add(object);
			}
		}
		return objects;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.ext.widgets.reference.internal.AbstractEEFExtReferenceLifecycleManager#refresh()
	 */
	@Override
	public void refresh() {
		super.refresh();

		this.tableViewer.setInput(this.target);

	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.ext.widgets.reference.internal.AbstractEEFExtReferenceLifecycleManager#setEnabled(boolean)
	 */
	@Override
	protected void setEnabled(boolean isEnabled) {
		super.setEnabled(isEnabled);

		if (this.upButton != null && !this.upButton.isDisposed()) {
			this.upButton.setEnabled(isEnabled);
		}
		if (this.downButton != null && !this.downButton.isDisposed()) {
			this.downButton.setEnabled(isEnabled);
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

		this.removeListener(this.upButton, this.upButtonListener);
		this.removeListener(this.downButton, this.downButtonListener);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFLifecycleManager#getValidationControl()
	 */
	@Override
	protected Control getValidationControl() {
		return this.tableViewer.getTable().getParent();
	}

	/**
	 * This enumeration is used for the direction of the up and down buttons.
	 *
	 * @author sbegaudeau
	 */
	private static enum Direction {
		/**
		 * Up.
		 */
		UP,

		/**
		 * Down.
		 */
		DOWN
	}
}
