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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.eef.EEFMultiValuedContainmentReferenceDescription;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.EefPackage;
import org.eclipse.eef.core.api.EEFExpressionUtils;
import org.eclipse.eef.core.api.controllers.EEFControllersFactory;
import org.eclipse.eef.core.api.controllers.IConsumer;
import org.eclipse.eef.core.api.controllers.IEEFMultiValuedContainmentReferenceController;
import org.eclipse.eef.core.api.controllers.IEEFWidgetController;
import org.eclipse.eef.core.api.utils.Eval;
import org.eclipse.eef.ide.ui.internal.EEFIdeUiPlugin;
import org.eclipse.eef.ide.ui.internal.Icons;
import org.eclipse.eef.properties.ui.api.EEFTabbedPropertySheetPage;
import org.eclipse.eef.properties.ui.api.EEFTabbedPropertySheetWidgetFactory;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.StyledCellLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

/**
 * This class will be used in order to manage the lifecycle of a multi valued containment reference widget.
 *
 * @author mbats
 */
public class EEFMultiValuedContainmentReferenceLifecycleManager extends AbstractEEFWidgetLifecycleManager {

	/**
	 * The description.
	 */
	private EEFMultiValuedContainmentReferenceDescription description;

	/**
	 * The combo viewer.
	 */
	private TableViewer tableViewer;

	/**
	 * The list.
	 */
	private org.eclipse.swt.widgets.Table table;

	/**
	 * The create button.
	 */
	private Button createButton;

	/**
	 * The unset button.
	 */
	private Button unsetButton;
	/**
	 * The up button.
	 */
	private Button upButton;
	/**
	 * The down button.
	 */
	private Button downButton;

	/**
	 * The main parent.
	 */
	private Composite multipleReferences;

	/**
	 * The buttons.
	 */
	private Composite buttons;

	/**
	 * The controller.
	 */
	private IEEFMultiValuedContainmentReferenceController controller;

	/**
	 * The listener on the create button.
	 */
	private SelectionListener createSelectionListener;

	/**
	 * The listener on the unset button.
	 */
	private SelectionListener unsetSelectionListener;

	/**
	 * The listener on the up button.
	 */
	private SelectionListener upSelectionListener;

	/**
	 * The listener on the down button.
	 */
	private SelectionListener downSelectionListener;

	/**
	 * The listeners on the cells.
	 */
	private IDoubleClickListener doubleClickListener;

	/**
	 * The widget factory.
	 */
	private EEFTabbedPropertySheetWidgetFactory widgetFactory;

	/**
	 * The constructor.
	 *
	 * @param description
	 *            The description
	 * @param variableManager
	 *            The variable manager
	 * @param interpreter
	 *            The interpreter
	 * @param editingDomain
	 *            The editing domain
	 */
	public EEFMultiValuedContainmentReferenceLifecycleManager(EEFMultiValuedContainmentReferenceDescription description,
			IVariableManager variableManager, IInterpreter interpreter, TransactionalEditingDomain editingDomain) {
		super(variableManager, interpreter, editingDomain);
		this.description = description;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.internal.widgets.AbstractEEFWidgetLifecycleManager#createMainControl(org.eclipse.swt.widgets.Composite,
	 *      org.eclipse.eef.properties.ui.api.EEFTabbedPropertySheetPage)
	 */
	@Override
	protected void createMainControl(Composite parent, EEFTabbedPropertySheetPage tabbedPropertySheetPage) {
		widgetFactory = tabbedPropertySheetPage.getWidgetFactory();

		this.multipleReferences = widgetFactory.createFlatFormComposite(parent);
		GridLayout layout = new GridLayout(2, false);
		multipleReferences.setLayout(layout); // this is the parent composite

		ScrolledComposite scrolledComposite = widgetFactory.createScrolledComposite(multipleReferences, SWT.NONE);
		GridData gridData = new GridData();
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalAlignment = SWT.FILL;
		scrolledComposite.setLayoutData(gridData);

		final int clientWidth = scrolledComposite.getClientArea().width;

		this.tableViewer = new TableViewer(scrolledComposite, SWT.READ_ONLY | SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.BORDER | SWT.MULTI);
		this.table = tableViewer.getTable();
		this.table.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
		this.tableViewer.setContentProvider(ArrayContentProvider.getInstance());
		this.tableViewer.setLabelProvider(new EEFMultipleReferencesLabelProvider());

		this.buttons = widgetFactory.createFlatFormComposite(multipleReferences);
		this.buttons.setLayout(new RowLayout(SWT.VERTICAL));
		gridData = new GridData();
		gridData.grabExcessHorizontalSpace = false;
		buttons.setLayoutData(gridData);

		this.createButton = widgetFactory.createButton(this.buttons, "", SWT.NONE); //$NON-NLS-1$
		this.createButton.setImage(EEFIdeUiPlugin.getPlugin().getImageRegistry().get(Icons.CREATE));
		this.unsetButton = widgetFactory.createButton(this.buttons, "", SWT.NONE); //$NON-NLS-1$
		this.unsetButton.setImage(EEFIdeUiPlugin.getPlugin().getImageRegistry().get(Icons.UNSET));
		this.upButton = widgetFactory.createButton(this.buttons, "", SWT.NONE); //$NON-NLS-1$
		this.upButton.setImage(EEFIdeUiPlugin.getPlugin().getImageRegistry().get(Icons.UP));
		this.downButton = widgetFactory.createButton(this.buttons, "", SWT.NONE); //$NON-NLS-1$
		this.downButton.setImage(EEFIdeUiPlugin.getPlugin().getImageRegistry().get(Icons.DOWN));

		scrolledComposite.setContent(table);
		int prefHeight = createButton.computeSize(SWT.DEFAULT, SWT.DEFAULT).y * 5;
		table.setSize(clientWidth, prefHeight);
		scrolledComposite.setExpandHorizontal(true);
		scrolledComposite.setAlwaysShowScrollBars(true);

		widgetFactory.paintBordersFor(parent);

		FormData formData = new FormData();
		formData.left = new FormAttachment(0, LABEL_WIDTH);
		formData.right = new FormAttachment(100, 0);
		this.multipleReferences.setLayoutData(formData);

		this.controller = new EEFControllersFactory().createMultiValuedContainmentReferenceController(this.description, this.variableManager,
				this.interpreter, this.editingDomain);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.internal.widgets.AbstractEEFWidgetLifecycleManager#getController()
	 */
	@Override
	protected IEEFWidgetController getController() {
		return this.controller;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.internal.widgets.ILifecycleManager#aboutToBeShown()
	 */
	@Override
	public void aboutToBeShown() {
		super.aboutToBeShown();

		// Set table items
		this.controller.onNewValue(new NewValueConsumer());

		this.createSelectionListener = new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				controller.create();
			}
		};

		this.createButton.addSelectionListener(this.createSelectionListener);

		this.upSelectionListener = new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				IStructuredSelection selection = (IStructuredSelection) EEFMultiValuedContainmentReferenceLifecycleManager.this.tableViewer
						.getSelection();
				@SuppressWarnings("unchecked")
				List<Object> elements = selection.toList();
				controller.up(elements);
			}
		};

		this.upButton.addSelectionListener(this.upSelectionListener);

		this.downSelectionListener = new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				IStructuredSelection selection = (IStructuredSelection) EEFMultiValuedContainmentReferenceLifecycleManager.this.tableViewer
						.getSelection();
				@SuppressWarnings("unchecked")
				List<Object> elements = selection.toList();
				controller.down(elements);
			}
		};

		this.downButton.addSelectionListener(this.downSelectionListener);

		this.unsetSelectionListener = new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				IStructuredSelection selection = (IStructuredSelection) EEFMultiValuedContainmentReferenceLifecycleManager.this.tableViewer
						.getSelection();
				@SuppressWarnings("unchecked")
				List<Object> elements = selection.toList();
				controller.unset(elements);
			}
		};
		this.unsetButton.addSelectionListener(this.unsetSelectionListener);

		this.doubleClickListener = new IDoubleClickListener() {

			@Override
			public void doubleClick(DoubleClickEvent e) {
				IStructuredSelection selection = (IStructuredSelection) e.getSelection();
				Object element = selection.getFirstElement();
				controller.onClick(element);
			}
		};
		this.tableViewer.addDoubleClickListener(doubleClickListener);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.internal.widgets.AbstractEEFWidgetLifecycleManager#getValidationControl()
	 */
	@Override
	protected Control getValidationControl() {
		return this.multipleReferences;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.internal.widgets.AbstractEEFWidgetLifecycleManager#aboutToBeHidden()
	 */
	@Override
	public void aboutToBeHidden() {
		super.aboutToBeHidden();

		if (!createButton.isDisposed()) {
			this.createButton.removeSelectionListener(this.createSelectionListener);
		}

		if (!upButton.isDisposed()) {
			this.upButton.removeSelectionListener(this.upSelectionListener);
		}

		if (!downButton.isDisposed()) {
			this.downButton.removeSelectionListener(this.downSelectionListener);
		}

		if (!unsetButton.isDisposed()) {
			this.unsetButton.removeSelectionListener(this.unsetSelectionListener);
		}

		this.tableViewer.removeDoubleClickListener(doubleClickListener);
		this.controller.removeNewValueConsumer();
	}

	/**
	 * Multiple references widget label provider.
	 *
	 * @author mbats
	 */
	private final class EEFMultipleReferencesLabelProvider extends StyledCellLabelProvider {

		/**
		 * {@inheritDoc}
		 *
		 * @see org.eclipse.jface.viewers.StyledCellLabelProvider#update(org.eclipse.jface.viewers.ViewerCell)
		 */
		@Override
		public void update(ViewerCell cell) {
			Object element = cell.getElement();
			Map<String, Object> variables = new HashMap<String, Object>();
			variables.putAll(EEFMultiValuedContainmentReferenceLifecycleManager.this.variableManager.getVariables());
			variables.put(EEFExpressionUtils.EEFReference.VALUE, element);
			variables.put(EEFExpressionUtils.SELF, variableManager.getVariables().get(EEFExpressionUtils.SELF));

			String expression = description.getDisplayExpression();
			EAttribute eAttribute = EefPackage.Literals.EEF_REFERENCE_DESCRIPTION__DISPLAY_EXPRESSION;
			String text = new Eval(EEFMultiValuedContainmentReferenceLifecycleManager.this.interpreter, variables).get(eAttribute, expression,
					String.class);
			cell.setText(text);
			super.update(cell);
		}
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
	 * New value consumer.
	 *
	 * @author mbats
	 */
	private final class NewValueConsumer implements IConsumer<Object> {
		@SuppressWarnings("rawtypes")
		@Override
		public void apply(Object value) {
			if (!table.isDisposed()) {
				final ISelection selection = new StructuredSelection(value);
				tableViewer.setSelection(selection);
				if (value instanceof List) {
					tableViewer.setInput(((List) value).toArray());
					if (!table.isEnabled()) {
						table.setEnabled(true);
					}
				}
			}
		}
	}
}
