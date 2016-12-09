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

import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.eef.EEFMultiTextDescription;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.common.api.utils.Util;
import org.eclipse.eef.common.ui.api.EEFWidgetFactory;
import org.eclipse.eef.common.ui.api.IEEFFormContainer;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.controllers.EEFControllersFactory;
import org.eclipse.eef.core.api.controllers.IEEFMultiTextController;
import org.eclipse.eef.core.api.controllers.IEEFWidgetController;
import org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager;
import org.eclipse.eef.ide.ui.internal.EEFIdeUiPlugin;
import org.eclipse.eef.ide.ui.internal.Icons;
import org.eclipse.eef.ide.ui.internal.Messages;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;

/**
 * This class will be used in order to manager the lifecycle of a multi text.
 *
 * @author arichard
 */
public class EEFMultiTextLifecycleManager extends AbstractEEFWidgetLifecycleManager {

	/**
	 * The minimum width of the button.
	 */
	private static final int MINIMUM_BUTTON_WIDTH = 80;

	/**
	 * Minimal height of the table widget.
	 */
	private static final int TABLE_MINIMAL_HEIGHT = 150;

	/**
	 * The composed adapter factory.
	 */
	protected ComposedAdapterFactory composedAdapterFactory;

	/**
	 * The target.
	 */
	protected EObject target;

	/**
	 * The EAttribute.
	 */
	protected EAttribute eAttribute;

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
	 * The add button.
	 */
	protected Button addButton;

	/**
	 * The listener for the add button.
	 */
	protected ButtonSelectionListener addButtonListener;

	/**
	 * The remove button.
	 */
	protected Button removeButton;

	/**
	 * The listener for the remove button.
	 */
	protected ButtonSelectionListener removeButtonListener;

	/**
	 * The description.
	 */
	private EEFMultiTextDescription description;

	/**
	 * The controller.
	 */
	private IEEFMultiTextController controller;

	/**
	 * The widget factory.
	 */
	private EEFWidgetFactory widgetFactory;

	/**
	 * The cell modifier.
	 */
	private ICellModifier cellModifier;

	/**
	 * The text editor.
	 */
	private TextCellEditor textEditor;

	/**
	 * The constructor.
	 *
	 * @param description
	 *            The description
	 * @param target
	 *            The target
	 * @param eAttribute
	 *            The EAttribute to display
	 * @param variableManager
	 *            The variable manager
	 * @param interpreter
	 *            The interpreter
	 * @param contextAdapter
	 *            The editing context adapter
	 */
	public EEFMultiTextLifecycleManager(EEFMultiTextDescription description, EObject target, EAttribute eAttribute, IVariableManager variableManager,
			IInterpreter interpreter, EditingContextAdapter contextAdapter) {
		super(variableManager, interpreter, contextAdapter);
		this.description = description;
		this.target = target;
		this.eAttribute = eAttribute;
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

		Composite attributeValuesComposite = this.widgetFactory.createFlatFormComposite(parent);
		GridLayout attributeValuesGridLayout = new GridLayout(2, false);
		attributeValuesComposite.setLayout(attributeValuesGridLayout);

		GridData referenceCompositeGridData = new GridData(SWT.FILL, SWT.CENTER, true, false);
		attributeValuesComposite.setLayoutData(referenceCompositeGridData);

		this.createTable(attributeValuesComposite);

		Composite buttonsComposite = this.widgetFactory.createFlatFormComposite(attributeValuesComposite);
		GridData buttonCompositeGridData = new GridData();
		buttonCompositeGridData.verticalAlignment = SWT.BEGINNING;
		buttonsComposite.setLayoutData(buttonCompositeGridData);

		GridLayout buttonCompositeGridLayout = new GridLayout(1, false);
		buttonCompositeGridLayout.marginHeight = 0;
		buttonsComposite.setLayout(buttonCompositeGridLayout);

		this.addButton = this.createButton(buttonsComposite, EEFIdeUiPlugin.getPlugin().getImageRegistry().get(Icons.ADD));
		this.removeButton = this.createButton(buttonsComposite, EEFIdeUiPlugin.getPlugin().getImageRegistry().get(Icons.REMOVE));
		this.upButton = this.createButton(buttonsComposite, EEFIdeUiPlugin.getPlugin().getImageRegistry().get(Icons.UP));
		this.downButton = this.createButton(buttonsComposite, EEFIdeUiPlugin.getPlugin().getImageRegistry().get(Icons.DOWN));

		this.widgetFactory.paintBordersFor(parent);

		this.controller = new EEFControllersFactory().createMultiTextController(this.description, this.variableManager, this.interpreter,
				this.contextAdapter);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager#dispose()
	 */
	@Override
	public void dispose() {
		this.composedAdapterFactory.dispose();
		super.dispose();
	}

	/**
	 * Creates a button used to edit the reference.
	 *
	 * @param parent
	 *            The parent composite
	 * @param image
	 *            The image of the button
	 * @return The button created
	 */
	protected Button createButton(Composite parent, Image image) {
		Button button = this.widgetFactory.createButton(parent, "", SWT.NONE); //$NON-NLS-1$
		button.setImage(image);

		GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
		gridData.grabExcessHorizontalSpace = true;
		gridData.minimumWidth = MINIMUM_BUTTON_WIDTH;
		button.setLayoutData(gridData);

		return button;
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

		this.initializeAddButton();
		this.initializeRemoveButton();
		this.initializeMoveButton(Direction.UP);
		this.initializeMoveButton(Direction.DOWN);

	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager#getValidationControl()
	 */
	@Override
	protected Control getValidationControl() {
		return this.tableViewer.getTable().getParent();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.IEEFLifecycleManager#aboutToBeHidden()
	 */
	@Override
	public void aboutToBeHidden() {
		this.removeListener(this.downButton, this.downButtonListener);
		this.removeListener(this.upButton, this.upButtonListener);
		this.removeListener(this.removeButton, this.removeButtonListener);
		this.removeListener(this.addButton, this.addButtonListener);

		super.aboutToBeHidden();

	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager#refresh()
	 */
	@Override
	public void refresh() {
		super.refresh();

		this.tableViewer.setInput(this.target);

		if (Util.isBlank(this.description.getLabelExpression())) {
			Adapter adapter = this.composedAdapterFactory.adapt(this.target, IItemPropertySource.class);
			if (adapter instanceof IItemPropertySource) {
				IItemPropertySource propertySource = (IItemPropertySource) adapter;
				IItemPropertyDescriptor propertyDescriptor = propertySource.getPropertyDescriptor(this.target, this.eAttribute);
				if (propertyDescriptor != null) {
					String displayName = propertyDescriptor.getDisplayName(this.eAttribute);
					this.label.setText(displayName);
				} else {
					this.label.setText(this.eAttribute.getName());
				}
			}
		}
		this.setLabelFontStyle();

		if (this.addButton != null && !this.addButton.isDisposed()) {
			this.addButton.setEnabled(this.isEnabled());
		}
		if (this.removeButton != null && !this.removeButton.isDisposed()) {
			this.removeButton.setEnabled(this.isEnabled());
		}

		if (this.upButton != null && !this.upButton.isDisposed()) {
			this.upButton.setEnabled(this.isEnabled());
		}
		if (this.downButton != null && !this.downButton.isDisposed()) {
			this.downButton.setEnabled(this.isEnabled());
		}
	}

	/**
	 * Creates the table used to display the attribute.
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

		Table table = this.widgetFactory.createTable(scrolledComposite, SWT.READ_ONLY | SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.BORDER | SWT.SINGLE);
		this.tableViewer = new TableViewer(table);

		this.tableViewer.setColumnProperties(new String[] { "value" }); //$NON-NLS-1$

		GridData tableGridData = new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1);
		tableGridData.horizontalIndent = VALIDATION_MARKER_OFFSET;
		this.tableViewer.getTable().setLayoutData(tableGridData);

		this.composedAdapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		this.composedAdapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());

		this.tableViewer.setContentProvider(new EEFMultiTextContentProvider(this.eAttribute));
		this.tableViewer.setLabelProvider(new DelegatingStyledCellLabelProvider(
				new AdapterFactoryLabelProvider.StyledLabelProvider(this.composedAdapterFactory, this.tableViewer)));

		scrolledComposite.setContent(table);

		final int clientWidth = scrolledComposite.getClientArea().width;
		this.tableViewer.getTable().setSize(clientWidth, TABLE_MINIMAL_HEIGHT);

		scrolledComposite.setExpandHorizontal(true);
		scrolledComposite.setAlwaysShowScrollBars(true);

		this.textEditor = new TextCellEditor(table);
		CellEditor[] cellEditors = new CellEditor[1];
		cellEditors[0] = this.textEditor;
		this.tableViewer.setCellEditors(cellEditors);

		this.cellModifier = new ICellModifier() {

			@Override
			public void modify(Object element, String property, Object value) {
				Object oldValue = ((TableItem) element).getData();
				if (oldValue instanceof String && value instanceof String && !oldValue.equals(value)) {
					EList<String> newAttributeValues = computeNewAttributeValues((String) oldValue, (String) value);
					IStatus result = controller.updateValues(newAttributeValues);
					if (result != null && result.getSeverity() == IStatus.ERROR) {
						EEFIdeUiPlugin.INSTANCE.log(result);
					}
				}
			}

			@Override
			public Object getValue(Object element, String property) {
				return element;
			}

			@Override
			public boolean canModify(Object element, String property) {
				return true;
			}
		};
		this.tableViewer.setCellModifier(this.cellModifier);

	}

	/**
	 * Computes the new list of values to set.
	 *
	 * @param oldValue
	 *            the value to replace in the new list.
	 * @param newValue
	 *            the new value.
	 * @return the new list of values to set.
	 */
	private EList<String> computeNewAttributeValues(String oldValue, String newValue) {
		EList<String> newAttributeValues = new BasicEList<String>();
		EList<String> existingValues = this.getValues();
		for (String existingValue : existingValues) {
			if (oldValue.equals(existingValue)) {
				newAttributeValues.add(newValue);
			} else {
				newAttributeValues.add(existingValue);
			}
		}
		return newAttributeValues;
	}

	/**
	 * Initializes the up/down buttons.
	 *
	 * @param direction
	 *            The direction
	 */
	private void initializeMoveButton(final Direction direction) {
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				EEFMultiTextLifecycleManager.this.moveButtonCallback(direction);
			}
		};
		ButtonSelectionListener listener = new ButtonSelectionListener(this.contextAdapter, runnable);

		if (direction == Direction.UP) {
			this.upButtonListener = listener;
			this.upButton.addSelectionListener(this.upButtonListener);
			this.upButton.setToolTipText(Messages.MultiTextUpButton_tooltipText);
		} else {
			this.downButtonListener = listener;
			this.downButton.addSelectionListener(this.downButtonListener);
			this.downButton.setToolTipText(Messages.MultiTextDownButton_tooltipText);
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
		List<String> selectedValues = this.selectionToList(this.tableViewer.getSelection());

		EList<String> values = new BasicEList<String>(this.getValues());
		for (String selectedValue : selectedValues) {
			if (direction == Direction.UP) {
				values.move(Math.max(0, values.indexOf(selectedValue) - 1), values.indexOf(selectedValue));
			} else {
				values.move(Math.min(values.size() - 1, values.indexOf(selectedValue) + 1), values.indexOf(selectedValue));
			}
		}
		IStatus result = controller.updateValues(values);
		if (result != null && result.getSeverity() == IStatus.ERROR) {
			EEFIdeUiPlugin.INSTANCE.log(result);
		}
	}

	/**
	 * Initializes the add button.
	 */
	private void initializeAddButton() {
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				EEFMultiTextLifecycleManager.this.addButtonCallback();
			}
		};

		this.addButtonListener = new ButtonSelectionListener(this.contextAdapter, runnable);
		this.addButton.addSelectionListener(this.addButtonListener);
		this.addButton.setToolTipText(Messages.MultiTextAddButton_tooltipText);
	}

	/**
	 * This method is called once the add button is clicked in order to open the "add dialog".
	 */
	protected void addButtonCallback() {
		String newElement = "newValue" + (this.tableViewer.getTable().getItemCount() + 1); //$NON-NLS-1$
		EList<String> newAttributeValues = new BasicEList<String>(this.getValues());
		newAttributeValues.add(newElement);
		IStatus result = controller.updateValues(newAttributeValues);
		if (result != null && result.getSeverity() == IStatus.ERROR) {
			EEFIdeUiPlugin.INSTANCE.log(result);
		}
	}

	/**
	 * Initializes the remove button.
	 */
	private void initializeRemoveButton() {
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				EEFMultiTextLifecycleManager.this.removeButtonCallback();
			}
		};
		this.removeButtonListener = new ButtonSelectionListener(this.contextAdapter, runnable);
		this.removeButton.addSelectionListener(this.removeButtonListener);
		this.removeButton.setToolTipText(Messages.MultiTextRemoveButton_tooltipText);
	}

	/**
	 * This method is called once the remove button is clicked in order to remove the selected element.
	 */
	protected void removeButtonCallback() {
		this.contextAdapter.performModelChange(new Runnable() {
			@Override
			public void run() {
				List<String> objects = selectionToList(tableViewer.getSelection());
				for (Object object : objects) {
					EcoreUtil.remove(target, eAttribute, object);
				}
			}
		});
	}

	/**
	 * Returns the value of the attribute for the self EObject.
	 *
	 * @return The value of the attribute for the self EObject or <code>null</code> if it could not be found
	 */
	@SuppressWarnings("unchecked")
	private EList<String> getValues() {
		Object value = this.target.eGet(this.eAttribute);
		if (value instanceof EList<?>) {
			return (EList<String>) value;
		}
		return new BasicEList<String>();
	}

	/**
	 * Returns a list containing all the objects of the given selection.
	 *
	 * @param selection
	 *            The selection
	 * @return The objects of the given selection
	 */
	private EList<String> selectionToList(ISelection selection) {
		EList<String> objects = new BasicEList<String>();
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			for (Object object : structuredSelection.toArray()) {
				if (object instanceof String) {
					objects.add((String) object);
				}
			}
		}
		return objects;
	}

	/**
	 * Removes the given listener from the given button.
	 *
	 * @param button
	 *            The button
	 * @param listener
	 *            The listener to remove
	 */
	protected void removeListener(Button button, ButtonSelectionListener listener) {
		if (!button.isDisposed()) {
			button.removeSelectionListener(listener);
		}
	}

	/**
	 * Utility class used to encapsulate the selection listener.
	 *
	 * @author sbegaudeau
	 */
	protected static class ButtonSelectionListener implements SelectionListener {

		/**
		 * The context adapter.
		 */
		private EditingContextAdapter contextAdapter;

		/**
		 * The behavior to execute when the button is clicked.
		 */
		private Runnable runnable;

		/**
		 * The constructor.
		 *
		 * @param contextAdapter
		 *            The {@link EditingContextAdapter}
		 * @param runnable
		 *            The behavior to execute when the button is clicked
		 */
		public ButtonSelectionListener(EditingContextAdapter contextAdapter, Runnable runnable) {
			this.contextAdapter = contextAdapter;
			this.runnable = runnable;
		}

		/**
		 * {@inheritDoc}
		 *
		 * @see org.eclipse.swt.events.SelectionListener#widgetSelected(org.eclipse.swt.events.SelectionEvent)
		 */
		@Override
		public void widgetSelected(SelectionEvent event) {
			this.contextAdapter.performModelChange(this.runnable);
		}

		/**
		 * {@inheritDoc}
		 *
		 * @see org.eclipse.swt.events.SelectionListener#widgetDefaultSelected(org.eclipse.swt.events.SelectionEvent)
		 */
		@Override
		public void widgetDefaultSelected(SelectionEvent event) {
			this.contextAdapter.performModelChange(this.runnable);
		}
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
