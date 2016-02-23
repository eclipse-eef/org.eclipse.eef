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
import java.util.Map;

import org.eclipse.eef.EEFSingleReferenceDescription;
import org.eclipse.eef.EefPackage;
import org.eclipse.eef.core.api.EEFExpressionUtils;
import org.eclipse.eef.core.api.controllers.EEFControllersFactory;
import org.eclipse.eef.core.api.controllers.IConsumer;
import org.eclipse.eef.core.api.controllers.IEEFSingleReferenceController;
import org.eclipse.eef.core.api.controllers.IEEFWidgetController;
import org.eclipse.eef.core.api.utils.Eval;
import org.eclipse.eef.ide.ui.internal.EEFIdeUiPlugin;
import org.eclipse.eef.ide.ui.internal.Icons;
import org.eclipse.eef.properties.ui.api.EEFTabbedPropertySheetPage;
import org.eclipse.eef.properties.ui.api.EEFTabbedPropertySheetWidgetFactory;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.eclipse.ui.forms.events.IHyperlinkListener;
import org.eclipse.ui.forms.widgets.Hyperlink;

/**
 * This class will be used in order to manager the lifecycle of a single reference widget.
 *
 * @author mbats
 */
public class EEFSingleReferenceLifecycleManager extends AbstractEEFWidgetLifecycleManager {

	/**
	 * The description.
	 */
	private EEFSingleReferenceDescription description;

	/**
	 * The text.
	 */
	private Hyperlink hyperlink;

	/**
	 * The text.
	 */
	private Text text;

	/**
	 * The create button.
	 */
	private Button createButton;

	/**
	 * The search button.
	 */
	private Button searchButton;

	/**
	 * The unset button.
	 */
	private Button unsetButton;

	/**
	 * The main parent.
	 */
	private Composite singleReference;

	/**
	 * The controller.
	 */
	private IEEFSingleReferenceController controller;

	/**
	 * The listener on the text.
	 */
	private IHyperlinkListener onClickListener;

	/**
	 * The listener on the create button.
	 */
	private SelectionListener createSelectionListener;

	/**
	 * The listener on the search button.
	 */
	private SelectionListener searchSelectionListener;

	/**
	 * The listener on the unset button.
	 */
	private SelectionListener unsetSelectionListener;

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
	public EEFSingleReferenceLifecycleManager(EEFSingleReferenceDescription description, IVariableManager variableManager, IInterpreter interpreter,
			TransactionalEditingDomain editingDomain) {
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
		EEFTabbedPropertySheetWidgetFactory widgetFactory = tabbedPropertySheetPage.getWidgetFactory();

		this.singleReference = widgetFactory.createFlatFormComposite(parent);
		this.singleReference.setLayout(new RowLayout(SWT.HORIZONTAL));

		// Use hyperlink if the onclick expression exists
		if (this.description.getOnClickExpression() != null) {
			this.hyperlink = widgetFactory.createHyperlink(this.singleReference, "", SWT.NONE); //$NON-NLS-1$
		} else {
			this.text = widgetFactory.createText(this.singleReference, "", SWT.READ_ONLY); //$NON-NLS-1$
		}

		// Create button is visible only if the create expression exists
		if (this.description.getCreateExpression() != null) {
			this.createButton = widgetFactory.createButton(this.singleReference, "", SWT.NONE); //$NON-NLS-1$
			this.createButton.setImage(EEFIdeUiPlugin.getPlugin().getImageRegistry().get(Icons.CREATE));
		}
		this.searchButton = widgetFactory.createButton(this.singleReference, "", SWT.NONE); //$NON-NLS-1$
		this.searchButton.setImage(EEFIdeUiPlugin.getPlugin().getImageRegistry().get(Icons.SEARCH));
		this.unsetButton = widgetFactory.createButton(this.singleReference, "", SWT.NONE); //$NON-NLS-1$
		this.unsetButton.setImage(EEFIdeUiPlugin.getPlugin().getImageRegistry().get(Icons.UNSET));

		widgetFactory.paintBordersFor(parent);

		FormData formData = new FormData();
		formData.left = new FormAttachment(0, LABEL_WIDTH);
		formData.right = new FormAttachment(100, 0);
		this.singleReference.setLayoutData(formData);

		this.controller = new EEFControllersFactory().createSingleReferenceController(this.description, this.variableManager, this.interpreter,
				this.editingDomain);
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
		if (hyperlinkExists()) {
			this.onClickListener = new IHyperlinkListener() {

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
					IStructuredSelection selection = (IStructuredSelection) e.getHref();
					Object element = selection.getFirstElement();
					controller.onClick(element);
				}
			};
			this.hyperlink.addHyperlinkListener(this.onClickListener);
		}

		this.controller.onNewValue(new IConsumer<Object>() {
			@Override
			public void apply(Object value) {
				String expression = description.getDisplayExpression();
				EAttribute eAttribute = EefPackage.Literals.EEF_SINGLE_REFERENCE_DESCRIPTION__DISPLAY_EXPRESSION;

				Map<String, Object> variables = new HashMap<String, Object>();
				variables.put(EEFExpressionUtils.SELF, value);
				String display = new Eval(EEFSingleReferenceLifecycleManager.this.interpreter, variables).get(eAttribute, expression, String.class);

				if (hyperlinkExists() && !hyperlink.isDisposed() && !(hyperlink.getText() != null && hyperlink.getText().equals(value))) {
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
		});

		if (createButtonExists()) {
			this.createSelectionListener = new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					controller.create();
				}
			};

			this.createButton.addSelectionListener(this.createSelectionListener);
		}

		this.searchSelectionListener = new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				controller.search();
			}
		};
		this.searchButton.addSelectionListener(this.searchSelectionListener);

		this.unsetSelectionListener = new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Object element = null;
				if (hyperlinkExists()) {
					element = EEFSingleReferenceLifecycleManager.this.hyperlink.getData();
				} else {
					element = EEFSingleReferenceLifecycleManager.this.text.getData();
				}
				controller.unset(element);
			}
		};
		this.unsetButton.addSelectionListener(this.unsetSelectionListener);
	}

	/**
	 * Check if the create button exists in the UI.
	 *
	 * @return True if exists otherwise false
	 */
	private boolean createButtonExists() {
		return this.createButton != null;
	}

	/**
	 * Check if the hyperlink exists in the UI.
	 *
	 * @return True if exists otherwise false
	 */
	private boolean hyperlinkExists() {
		return this.hyperlink != null;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.internal.widgets.AbstractEEFWidgetLifecycleManager#getValidationControl()
	 */
	@Override
	protected Control getValidationControl() {
		return this.singleReference;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.internal.widgets.AbstractEEFWidgetLifecycleManager#aboutToBeHidden()
	 */
	@Override
	public void aboutToBeHidden() {
		super.aboutToBeHidden();

		if (hyperlinkExists() && !hyperlink.isDisposed()) {
			this.hyperlink.removeHyperlinkListener(this.onClickListener);
		}

		if (createButtonExists() && !createButton.isDisposed()) {
			this.createButton.removeSelectionListener(this.createSelectionListener);
		}

		if (!searchButton.isDisposed()) {
			this.searchButton.removeSelectionListener(this.searchSelectionListener);
		}

		if (!unsetButton.isDisposed()) {
			this.unsetButton.removeSelectionListener(this.unsetSelectionListener);
		}

		this.controller.removeNewValueConsumer();
	}
}
