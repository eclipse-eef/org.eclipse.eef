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

import org.eclipse.eef.EEFConditionalStyle;
import org.eclipse.eef.EEFReferenceConditionalStyle;
import org.eclipse.eef.EEFReferenceDescription;
import org.eclipse.eef.EEFWidgetAction;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.EEFWidgetStyle;
import org.eclipse.eef.EefPackage;
import org.eclipse.eef.common.ui.api.EEFWidgetFactory;
import org.eclipse.eef.common.ui.api.IEEFFormContainer;
import org.eclipse.eef.core.api.EEFExpressionUtils;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.controllers.EEFControllersFactory;
import org.eclipse.eef.core.api.controllers.IConsumer;
import org.eclipse.eef.core.api.controllers.IEEFReferenceController;
import org.eclipse.eef.core.api.controllers.IEEFWidgetController;
import org.eclipse.eef.core.api.utils.EvalFactory;
import org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager;
import org.eclipse.emf.ecore.EAttribute;
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
import org.eclipse.swt.graphics.Color;
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
	private static final int DEFAULT_HEIGHT = 34;

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
	 * Default height.
	 */
	private int widgetHeight = DEFAULT_HEIGHT;

	/**
	 * The widget factory.
	 */
	private EEFWidgetFactory widgetFactory;

	/**
	 * The default background color of the text field.
	 */
	private Color defaultBackgroundColor;

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
	public EEFReferenceLifecycleManager(EEFReferenceDescription description, IVariableManager variableManager, IInterpreter interpreter,
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
		widgetFactory = formContainer.getWidgetFactory();
		defaultBackgroundColor = parent.getBackground();

		this.reference = widgetFactory.createFlatFormComposite(parent);
		GridLayout layout = new GridLayout(2, false);
		reference.setLayout(layout); // this is the parent composite
		reference.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		if (description.isMultiple()) {
			createMultipleValuedReferenceWidget();
		} else {
			createSingleValuedReferenceWidget();
		}

		// Create widget action buttons
		createWidgetActionButtons();

		widgetFactory.paintBordersFor(parent);

		this.controller = new EEFControllersFactory().createReferenceController(this.description, this.variableManager, this.interpreter,
				this.contextAdapter);
	}

	/**
	 * Create widget action buttons.
	 */
	private void createWidgetActionButtons() {
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
	 */
	private void createSingleValuedReferenceWidget() {
		GridData gd = new GridData();
		// Use hyperlink if the onclick expression exists
		gd.grabExcessHorizontalSpace = true;
		gd.horizontalAlignment = SWT.FILL;
		final int clientWidth = reference.getClientArea().width;
		if (this.description.getOnClickExpression() != null) {
			this.hyperlink = widgetFactory.createHyperlink(this.reference, "", SWT.NONE); //$NON-NLS-1$
			hyperlink.setLayoutData(gd);
			hyperlink.setSize(clientWidth, widgetHeight);
		} else {
			this.text = widgetFactory.createLabel(this.reference, "", SWT.NONE); //$NON-NLS-1$
			text.setLayoutData(gd);
			text.setSize(clientWidth, widgetHeight);
		}
	}

	/**
	 * Create table widget.
	 */
	private void createMultipleValuedReferenceWidget() {
		ScrolledComposite scrolledComposite = widgetFactory.createScrolledComposite(reference, SWT.NONE);
		GridData gridData = new GridData();
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalAlignment = SWT.FILL;
		scrolledComposite.setLayoutData(gridData);

		final int clientWidth = scrolledComposite.getClientArea().width;
		this.table = widgetFactory.createTable(scrolledComposite, SWT.READ_ONLY | SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.BORDER | SWT.MULTI);
		this.tableViewer = new TableViewer(this.table);
		this.table.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
		this.tableViewer.setContentProvider(ArrayContentProvider.getInstance());
		this.tableViewer.setLabelProvider(new EEFTableReferencesLabelProvider());

		scrolledComposite.setContent(table);
		List<EEFWidgetAction> actions = description.getActions();
		if (actions != null && actions.size() > 0) {
			widgetHeight = widgetHeight * (actions.size() + 1);
		}
		table.setSize(clientWidth, widgetHeight);
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
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager#aboutToBeShown()
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

		Map<String, Object> variables = new HashMap<String, Object>();
		variables.put(EEFExpressionUtils.SELF, value);
		String display = EvalFactory.of(EEFReferenceLifecycleManager.this.interpreter, variables).logIfInvalidType(String.class).evaluate(expression);

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
	 *            Value to select
	 */
	private void setMultipleValuedReference(Object value) {
		if (!table.isDisposed()) {
			final ISelection selection = new StructuredSelection(value);
			tableViewer.setSelection(selection);
			List<Object> values = new ArrayList<Object>();
			if (value instanceof Iterable<?>) {
				for (Object val : (Iterable<?>) value) {
					values.add(val);
				}
			} else {
				values.add(value);
			}
			tableViewer.setInput(values.toArray());
			if (!table.isEnabled()) {
				table.setEnabled(true);
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
			String value = EvalFactory.of(EEFReferenceLifecycleManager.this.interpreter, variables).logIfInvalidType(String.class)
					.logIfBlank(eAttribute).evaluate(expression);
			cell.setText(value);
			super.update(cell);
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager#getWidgetStyle(org.eclipse.eef.EEFConditionalStyle)
	 */
	@Override
	protected EEFWidgetStyle getWidgetStyle(EEFConditionalStyle conditionalStyle) {
		if (conditionalStyle instanceof EEFReferenceConditionalStyle) {
			return ((EEFReferenceConditionalStyle) conditionalStyle).getStyle();
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager#getWidgetConditionalStyles()
	 */
	@Override
	protected List<EEFConditionalStyle> getWidgetConditionalStyles() {
		List<EEFConditionalStyle> widgetConditionalStyles = new ArrayList<EEFConditionalStyle>();
		widgetConditionalStyles.addAll(this.description.getConditionalStyles());
		return widgetConditionalStyles;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager#getLabelVerticalAlignment()
	 */
	@Override
	protected int getLabelVerticalAlignment() {
		if (!description.isMultiple()) {
			return GridData.VERTICAL_ALIGN_CENTER;
		}
		return super.getLabelVerticalAlignment();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager#refresh()
	 */
	@Override
	public void refresh() {
		super.refresh();
		if (this.text != null) {
			this.text.setEnabled(isEnabled());
			this.text.setBackground(getBackgroundColor());
		} else if (this.hyperlink != null) {
			this.hyperlink.setEnabled(isEnabled());
			this.hyperlink.setBackground(getBackgroundColor());
		} else if (this.table != null) {
			this.table.setEnabled(isEnabled());
			this.table.setBackground(getBackgroundColor());
		}
	}

	/**
	 * Get the background color according to the current valid style.
	 *
	 * @return The background color to use in the text field.
	 */
	private Color getBackgroundColor() {
		Color color = defaultBackgroundColor;
		if (!isEnabled()) {
			color = widgetFactory.getColors().getInactiveBackground();
		}
		return color;
	}
}
