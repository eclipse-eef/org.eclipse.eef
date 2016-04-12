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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.eef.EEFReferenceDescription;
import org.eclipse.eef.EEFWidgetAction;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.EEFWidgetStyle;
import org.eclipse.eef.EefPackage;
import org.eclipse.eef.common.ui.api.EEFWidgetFactory;
import org.eclipse.eef.common.ui.api.IEEFFormContainer;
import org.eclipse.eef.core.api.EEFExpressionUtils;
import org.eclipse.eef.core.api.controllers.EEFControllersFactory;
import org.eclipse.eef.core.api.controllers.IConsumer;
import org.eclipse.eef.core.api.controllers.IEEFReferenceController;
import org.eclipse.eef.core.api.controllers.IEEFWidgetController;
import org.eclipse.eef.core.api.utils.Eval;
import org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.viewers.ArrayContentProvider;
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
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.eclipse.ui.forms.events.IHyperlinkListener;
import org.eclipse.ui.forms.widgets.Hyperlink;

/**
 * This class will be used in order to manage the lifecycle of a reference widget.
 *
 * @author mbats
 */
public class EEFReferenceLifecycleManager extends AbstractEEFWidgetLifecycleManager {

	/**
	 * Default height.
	 */
	private static final int DEFAULT_HEIGHT = 27;

	/**
	 * The description.
	 */
	private EEFReferenceDescription description;

	/**
	 * The text.
	 */
	private Hyperlink hyperlink;

	/**
	 * The text.
	 */
	private Label text;

	/**
	 * The action buttons.
	 */
	private List<ActionButton> actionButtons = new ArrayList<ActionButton>();

	/**
	 * The main parent.
	 */
	private Composite reference;

	/**
	 * The combo viewer.
	 */
	private TableViewer tableViewer;

	/**
	 * The list.
	 */
	private org.eclipse.swt.widgets.Table table;

	/**
	 * The buttons.
	 */
	private Composite buttons;

	/**
	 * The controller.
	 */
	private IEEFReferenceController controller;

	/**
	 * The listener on the text.
	 */
	private IHyperlinkListener onClickListener;

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
	public EEFReferenceLifecycleManager(EEFReferenceDescription description, IVariableManager variableManager, IInterpreter interpreter,
			TransactionalEditingDomain editingDomain) {
		super(variableManager, interpreter, editingDomain);
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
		EEFWidgetFactory widgetFactory = formContainer.getWidgetFactory();
		this.reference = widgetFactory.createFlatFormComposite(parent);
		GridLayout layout = new GridLayout(2, false);
		reference.setLayout(layout); // this is the parent composite

		if (description.isMultiple()) {
			createMultipleValuedReferenceWidget(widgetFactory);
		} else {
			createSingleValuedReferenceWidget(widgetFactory);
		}

		// Create widget action buttons
		createWidgetActionButtons(widgetFactory);

		widgetFactory.paintBordersFor(parent);

		FormData formData = new FormData();
		formData.left = new FormAttachment(0, LABEL_WIDTH);
		formData.right = new FormAttachment(100, 0);
		this.reference.setLayoutData(formData);

		this.controller = new EEFControllersFactory().createReferenceController(this.description, this.variableManager, this.interpreter,
				this.editingDomain);
	}

	/**
	 * Create widget action buttons.
	 *
	 * @param widgetFactory
	 *            Widget factory
	 */
	private void createWidgetActionButtons(EEFWidgetFactory widgetFactory) {
		this.buttons = widgetFactory.createFlatFormComposite(reference);

		GridData gd = new GridData();

		gd = new GridData();
		gd.grabExcessHorizontalSpace = false;
		this.buttons.setLayoutData(gd);

		// Buttons are visible only if an action is defined
		for (EEFWidgetAction action : this.description.getActions()) {
			ActionButton actionButton = new ActionButton(action, this.buttons, widgetFactory, this.interpreter, this.variableManager);
			actionButtons.add(actionButton);
		}

		if (description.isMultiple()) {
			this.buttons.setLayout(new RowLayout(SWT.VERTICAL));
		} else {
			this.buttons.setLayout(new RowLayout(SWT.HORIZONTAL));
		}
	}

	/**
	 * Create a single valued reference widget : a text field or a label field if the onclick expression exists.
	 *
	 * @param widgetFactory
	 *            Widget factory
	 */
	private void createSingleValuedReferenceWidget(EEFWidgetFactory widgetFactory) {
		GridData gd = new GridData();
		// Use hyperlink if the onclick expression exists
		gd.grabExcessHorizontalSpace = true;
		gd.horizontalAlignment = SWT.FILL;
		if (this.description.getOnClickExpression() != null) {
			this.hyperlink = widgetFactory.createHyperlink(this.reference, "", SWT.NONE); //$NON-NLS-1$
			hyperlink.setLayoutData(gd);
		} else {
			this.text = widgetFactory.createLabel(this.reference, "", SWT.NONE); //$NON-NLS-1$
			text.setLayoutData(gd);
		}
	}

	/**
	 * Create table widget.
	 *
	 * @param widgetFactory
	 *            Widget factory
	 */
	private void createMultipleValuedReferenceWidget(EEFWidgetFactory widgetFactory) {
		ScrolledComposite scrolledComposite = widgetFactory.createScrolledComposite(reference, SWT.NONE);
		GridData gridData = new GridData();
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalAlignment = SWT.FILL;
		scrolledComposite.setLayoutData(gridData);

		final int clientWidth = scrolledComposite.getClientArea().width;

		this.tableViewer = new TableViewer(scrolledComposite, SWT.READ_ONLY | SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.BORDER | SWT.MULTI);
		this.table = tableViewer.getTable();
		this.table.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
		this.tableViewer.setContentProvider(ArrayContentProvider.getInstance());
		this.tableViewer.setLabelProvider(new EEFTableReferencesLabelProvider());

		scrolledComposite.setContent(table);
		int defaultHeight = DEFAULT_HEIGHT;
		List<EEFWidgetAction> actions = description.getActions();
		if (actions != null && actions.size() > 0) {
			defaultHeight = defaultHeight * (actions.size() + 1);
		}
		table.setSize(clientWidth, defaultHeight);
		scrolledComposite.setExpandHorizontal(true);
		scrolledComposite.setAlwaysShowScrollBars(true);
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
		if (this.hyperlink != null) {
			this.onClickListener = createOnClickListener();
			this.hyperlink.addHyperlinkListener(this.onClickListener);
		}

		this.controller.onNewValue(new IConsumer<Object>() {
			@Override
			public void apply(Object value) {
				if (value == null) {
					return;
				}
				if (description.isMultiple()) {
					setMultipleValuedReference(value);
				} else {
					setSingleValuedReference(value);
				}
			}
		});

		for (final ActionButton actionButton : actionButtons) {
			SelectionAdapter selectionListener = new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					List<Object> selections = new ArrayList<Object>();
					if (description.isMultiple()) {
						IStructuredSelection structuredSelection = (IStructuredSelection) EEFReferenceLifecycleManager.this.tableViewer
								.getSelection();

						for (Object selection : structuredSelection.toList()) {
							selections.add(selection);
						}
					} else {
						if (EEFReferenceLifecycleManager.this.hyperlink != null) {
							selections.add(EEFReferenceLifecycleManager.this.hyperlink.getData());
						} else {
							selections.add(EEFReferenceLifecycleManager.this.text.getData());
						}
					}
					controller.action(actionButton.getAction(), selections);
				}
			};

			actionButton.addSelectionListener(selectionListener);
		}
	}

	/**
	 * Set single valued reference.
	 *
	 * @param value
	 *            Value to set
	 */
	private void setSingleValuedReference(Object value) {
		String expression = description.getDisplayExpression();
		EAttribute eAttribute = EefPackage.Literals.EEF_REFERENCE_DESCRIPTION__DISPLAY_EXPRESSION;
		Map<String, Object> variables = new HashMap<String, Object>();
		variables.put(EEFExpressionUtils.SELF, value);
		String display = new Eval(EEFReferenceLifecycleManager.this.interpreter, variables).get(eAttribute, expression, String.class);
		if (display != null) {
			if (hyperlink != null && !hyperlink.isDisposed() && !(hyperlink.getText() != null && hyperlink.getText().equals(value))) {
				hyperlink.setText(display);
				hyperlink.setData(value);
				if (!hyperlink.isEnabled()) {
					hyperlink.setEnabled(true);
				}
			} else if (text != null && !text.isDisposed() && !(text.getText() != null && text.getText().equals(value))) {
				text.setText(display);
				text.setData(value);
				if (!text.isEnabled()) {
					text.setEnabled(true);
				}
			}
		}
	}

	/**
	 * Set multiple valued reference.
	 *
	 * @param value
	 *            Value to ste
	 */
	@SuppressWarnings("rawtypes")
	private void setMultipleValuedReference(Object value) {
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

	/**
	 * Create onclick listener.
	 *
	 * @return Listener
	 */
	private IHyperlinkListener createOnClickListener() {
		return new IHyperlinkListener() {

			@Override
			public void linkExited(HyperlinkEvent e) {
				// Nothing
			}

			@Override
			public void linkEntered(HyperlinkEvent e) {
				// Nothing
			}

			@Override
			public void linkActivated(HyperlinkEvent e) {
				Hyperlink link = (Hyperlink) e.getSource();
				if (link != null) {
					Object element = link.getData();
					controller.onClick(element);
				}
			}
		};
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.internal.widgets.AbstractEEFWidgetLifecycleManager#getValidationControl()
	 */
	@Override
	protected Control getValidationControl() {
		return this.reference;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.internal.widgets.AbstractEEFWidgetLifecycleManager#aboutToBeHidden()
	 */
	@Override
	public void aboutToBeHidden() {
		super.aboutToBeHidden();

		if (this.hyperlink != null && !this.hyperlink.isDisposed()) {
			this.hyperlink.removeHyperlinkListener(this.onClickListener);
		}

		for (ActionButton actionButton : this.actionButtons) {
			actionButton.removeSelectionListener();
		}

		this.controller.removeNewValueConsumer();
		this.actionButtons.clear();
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
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager#getWidgetStyle()
	 */
	@Override
	protected EEFWidgetStyle getWidgetStyle() {
		return this.description.getStyle();
	}

	/**
	 * Table references widget label provider.
	 *
	 * @author mbats
	 */
	private final class EEFTableReferencesLabelProvider extends StyledCellLabelProvider {

		/**
		 * {@inheritDoc}
		 *
		 * @see org.eclipse.jface.viewers.StyledCellLabelProvider#update(org.eclipse.jface.viewers.ViewerCell)
		 */
		@Override
		public void update(ViewerCell cell) {
			Object element = cell.getElement();
			Map<String, Object> variables = new HashMap<String, Object>();
			variables.putAll(EEFReferenceLifecycleManager.this.variableManager.getVariables());
			variables.put(EEFExpressionUtils.EEFReference.VALUE, element);
			variables.put(EEFExpressionUtils.SELF, element);

			String expression = description.getDisplayExpression();
			EAttribute eAttribute = EefPackage.Literals.EEF_REFERENCE_DESCRIPTION__DISPLAY_EXPRESSION;
			String value = new Eval(EEFReferenceLifecycleManager.this.interpreter, variables).get(eAttribute, expression, String.class);
			cell.setText(value);
			super.update(cell);
		}
	}
}
