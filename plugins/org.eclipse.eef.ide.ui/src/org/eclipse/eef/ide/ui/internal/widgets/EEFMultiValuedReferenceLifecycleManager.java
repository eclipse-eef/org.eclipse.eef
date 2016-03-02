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

import org.eclipse.eef.EEFMultiValuedReferenceDescription;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.EefPackage;
import org.eclipse.eef.core.api.EEFExpressionUtils;
import org.eclipse.eef.core.api.controllers.EEFControllersFactory;
import org.eclipse.eef.core.api.controllers.IConsumer;
import org.eclipse.eef.core.api.controllers.IEEFMultiValuedReferenceController;
import org.eclipse.eef.core.api.controllers.IEEFWidgetController;
import org.eclipse.eef.core.api.utils.Eval;
import org.eclipse.eef.ide.ui.internal.EEFIdeUiPlugin;
import org.eclipse.eef.ide.ui.internal.Icons;
import org.eclipse.eef.properties.ui.api.EEFTabbedPropertySheetPage;
import org.eclipse.eef.properties.ui.api.EEFTabbedPropertySheetWidgetFactory;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.celleditor.FeatureEditorDialog;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
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
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.PlatformUI;

/**
 * This class will be used in order to manage the lifecycle of a multi valued reference widget.
 *
 * @author mbats
 */
public class EEFMultiValuedReferenceLifecycleManager extends AbstractEEFWidgetLifecycleManager {

	/**
	 * The description.
	 */
	private EEFMultiValuedReferenceDescription description;

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
	 * The set button.
	 */
	private Button setButton;

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
	private IEEFMultiValuedReferenceController controller;

	/**
	 * The listener on the create button.
	 */
	private SelectionListener createSelectionListener;

	/**
	 * The listener on the set button.
	 */
	private SelectionListener setSelectionListener;

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
	public EEFMultiValuedReferenceLifecycleManager(EEFMultiValuedReferenceDescription description, IVariableManager variableManager,
			IInterpreter interpreter, TransactionalEditingDomain editingDomain) {
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
		if (createExpressionExists()) {
			this.createButton = widgetFactory.createButton(this.buttons, "", SWT.NONE); //$NON-NLS-1$
			this.createButton.setImage(EEFIdeUiPlugin.getPlugin().getImageRegistry().get(Icons.CREATE));
		}
		this.setButton = widgetFactory.createButton(this.buttons, "", SWT.NONE); //$NON-NLS-1$
		this.setButton.setImage(EEFIdeUiPlugin.getPlugin().getImageRegistry().get(Icons.SET));
		this.unsetButton = widgetFactory.createButton(this.buttons, "", SWT.NONE); //$NON-NLS-1$
		this.unsetButton.setImage(EEFIdeUiPlugin.getPlugin().getImageRegistry().get(Icons.UNSET));
		this.upButton = widgetFactory.createButton(this.buttons, "", SWT.NONE); //$NON-NLS-1$
		this.upButton.setImage(EEFIdeUiPlugin.getPlugin().getImageRegistry().get(Icons.UP));
		this.downButton = widgetFactory.createButton(this.buttons, "", SWT.NONE); //$NON-NLS-1$
		this.downButton.setImage(EEFIdeUiPlugin.getPlugin().getImageRegistry().get(Icons.DOWN));

		scrolledComposite.setContent(table);
		int prefHeight = setButton.computeSize(SWT.DEFAULT, SWT.DEFAULT).y * 6;
		table.setSize(clientWidth, prefHeight);
		scrolledComposite.setExpandHorizontal(true);
		scrolledComposite.setAlwaysShowScrollBars(true);

		widgetFactory.paintBordersFor(parent);

		FormData formData = new FormData();
		formData.left = new FormAttachment(0, LABEL_WIDTH);
		formData.right = new FormAttachment(100, 0);
		this.multipleReferences.setLayoutData(formData);

		this.controller = new EEFControllersFactory().createMultiValuedReferenceController(this.description, this.variableManager, this.interpreter,
				this.editingDomain);
	}

	/**
	 * Check if the create expression is set.
	 *
	 * @return True if set otherwise false.
	 */
	private boolean createExpressionExists() {
		return this.description.getCreateExpression() != null && !this.description.getCreateExpression().isEmpty();
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

		if (createExpressionExists()) {
			this.createSelectionListener = new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					controller.create();
				}
			};

			this.createButton.addSelectionListener(this.createSelectionListener);
		}

		this.upSelectionListener = new SelectionAdapter() {
			@SuppressWarnings("unchecked")
			@Override
			public void widgetSelected(SelectionEvent e) {
				IStructuredSelection selection = (IStructuredSelection) EEFMultiValuedReferenceLifecycleManager.this.tableViewer.getSelection();
				controller.up(selection.toList());
			}
		};

		this.upButton.addSelectionListener(this.upSelectionListener);

		this.downSelectionListener = new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				IStructuredSelection selection = (IStructuredSelection) EEFMultiValuedReferenceLifecycleManager.this.tableViewer.getSelection();
				@SuppressWarnings("unchecked")
				List<Object> elements = selection.toList();
				controller.down(elements);
			}
		};

		this.downButton.addSelectionListener(this.downSelectionListener);

		this.setSelectionListener = new SetSelectionListener();
		this.setButton.addSelectionListener(this.setSelectionListener);

		this.unsetSelectionListener = new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				IStructuredSelection selection = (IStructuredSelection) EEFMultiValuedReferenceLifecycleManager.this.tableViewer.getSelection();
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

	/**
	 * Set button listener.
	 *
	 * @author mbats
	 */
	private class SetSelectionListener extends SelectionAdapter {
		@Override
		public void widgetSelected(SelectionEvent e) {
			// Get the semantic element
			String semanticElementExpression = EEFMultiValuedReferenceLifecycleManager.this.description.getSemanticElementExpression();
			EAttribute eAttribute = EefPackage.Literals.EEF_REFERENCE_DESCRIPTION__SEMANTIC_ELEMENT_EXPRESSION;
			EObject semanticElement = new Eval(EEFMultiValuedReferenceLifecycleManager.this.interpreter,
					EEFMultiValuedReferenceLifecycleManager.this.variableManager).get(eAttribute, semanticElementExpression, EObject.class);
			if (semanticElement != null) {
				// Get the reference name
				String eReferenceNameExpression = EEFMultiValuedReferenceLifecycleManager.this.description.getEReferenceNameExpression();
				eAttribute = EefPackage.Literals.EEF_REFERENCE_DESCRIPTION__EREFERENCE_NAME_EXPRESSION;
				String eReferenceName = new Eval(EEFMultiValuedReferenceLifecycleManager.this.interpreter,
						EEFMultiValuedReferenceLifecycleManager.this.variableManager).get(eAttribute, eReferenceNameExpression, String.class);

				// Get the reference
				EStructuralFeature eReference = semanticElement.eClass().getEStructuralFeature(eReferenceName);

				if (eReference != null) {
					// Get the reference value
					Object eReferenceValue = semanticElement.eGet(eReference);

					// Get the candidates
					String candidatesExpression = EEFMultiValuedReferenceLifecycleManager.this.description.getCandidatesExpression();
					eAttribute = EefPackage.Literals.EEF_NON_CONTAINMENT_REFERENCE_DESCRIPTION__CANDIDATES_EXPRESSION;
					@SuppressWarnings("unchecked")
					List<Object> candidates = new Eval(EEFMultiValuedReferenceLifecycleManager.this.interpreter,
							EEFMultiValuedReferenceLifecycleManager.this.variableManager).get(eAttribute, candidatesExpression, List.class);

					ILabelProvider labelProvider = new SelectionDialogTreeLabelProvider();

					// Set the value
					FeatureEditorDialog dlg = new FeatureEditorDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), labelProvider,
							semanticElement, eReference.getEType(), (List<?>) eReferenceValue, eReferenceName, candidates, true, false, true);

					int result = dlg.open();
					if (result == Dialog.OK) {
						Object newValue = dlg.getResult();
						controller.set(newValue);
					}
				}
			}
		}
	}

	/**
	 * Selection dialog tree label provider.
	 *
	 * @author mbats
	 */
	private class SelectionDialogTreeLabelProvider implements ILabelProvider {

		/**
		 * Default EMF label provider.
		 */
		AdapterFactoryLabelProvider labelProvider = new AdapterFactoryLabelProvider(new ComposedAdapterFactory(
				ComposedAdapterFactory.Descriptor.Registry.INSTANCE));

		@Override
		public void removeListener(ILabelProviderListener listener) {
			// Nothing
		}

		@Override
		public boolean isLabelProperty(Object element, String property) {
			// Nothing
			return false;
		}

		@Override
		public void dispose() {
			// Nothing
		}

		@Override
		public void addListener(ILabelProviderListener listener) {
			// Nothing
		}

		@Override
		public String getText(Object element) {
			String candidateDisplayExpression = EEFMultiValuedReferenceLifecycleManager.this.description.getCandidateDisplayExpression();
			String candidateDisplay;
			if (candidateDisplayExpression != null && !candidateDisplayExpression.isEmpty()) {
				EAttribute eAttribute = EefPackage.Literals.EEF_NON_CONTAINMENT_REFERENCE_DESCRIPTION__CANDIDATE_DISPLAY_EXPRESSION;
				Map<String, Object> variables = new HashMap<String, Object>();
				variables.put(EEFExpressionUtils.SELF, variableManager.getVariables().get(EEFExpressionUtils.SELF));
				variables.put(EEFExpressionUtils.EEFNonContainmentReference.CANDIDATE, element);
				candidateDisplay = new Eval(EEFMultiValuedReferenceLifecycleManager.this.interpreter, variables).get(eAttribute,
						candidateDisplayExpression, String.class);
			} else {
				// If candidate expression is not set use the default label provider
				candidateDisplay = labelProvider.getText(element);
			}
			return candidateDisplay;
		}

		@Override
		public Image getImage(Object element) {
			return labelProvider.getImage(element);
		}
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

		if (createExpressionExists() && !createButton.isDisposed()) {
			this.createButton.removeSelectionListener(this.createSelectionListener);
		}

		if (!upButton.isDisposed()) {
			this.upButton.removeSelectionListener(this.upSelectionListener);
		}

		if (!downButton.isDisposed()) {
			this.downButton.removeSelectionListener(this.downSelectionListener);
		}

		if (!setButton.isDisposed()) {
			this.setButton.removeSelectionListener(this.setSelectionListener);
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
			variables.putAll(EEFMultiValuedReferenceLifecycleManager.this.variableManager.getVariables());
			variables.put(EEFExpressionUtils.EEFReference.VALUE, element);
			variables.put(EEFExpressionUtils.SELF, element);

			String expression = description.getDisplayExpression();
			EAttribute eAttribute = EefPackage.Literals.EEF_REFERENCE_DESCRIPTION__DISPLAY_EXPRESSION;
			String text = new Eval(EEFMultiValuedReferenceLifecycleManager.this.interpreter, variables).get(eAttribute, expression, String.class);
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

}
