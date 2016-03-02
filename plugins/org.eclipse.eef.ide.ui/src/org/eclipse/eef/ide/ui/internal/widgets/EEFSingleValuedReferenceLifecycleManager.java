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

import org.eclipse.eef.EEFSingleValuedReferenceDescription;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.EefPackage;
import org.eclipse.eef.core.api.EEFExpressionUtils;
import org.eclipse.eef.core.api.controllers.EEFControllersFactory;
import org.eclipse.eef.core.api.controllers.IConsumer;
import org.eclipse.eef.core.api.controllers.IEEFReferenceController;
import org.eclipse.eef.core.api.controllers.IEEFWidgetController;
import org.eclipse.eef.core.api.utils.Eval;
import org.eclipse.eef.ide.ui.internal.EEFIdeUiPlugin;
import org.eclipse.eef.ide.ui.internal.Icons;
import org.eclipse.eef.properties.ui.api.EEFTabbedPropertySheetPage;
import org.eclipse.eef.properties.ui.api.EEFTabbedPropertySheetWidgetFactory;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.swt.SWT;
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
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.eclipse.ui.forms.events.IHyperlinkListener;
import org.eclipse.ui.forms.widgets.Hyperlink;

/**
 * This class will be used in order to manage the lifecycle of a single valued reference widget.
 *
 * @author mbats
 */
public class EEFSingleValuedReferenceLifecycleManager extends AbstractEEFWidgetLifecycleManager {

	/**
	 * The description.
	 */
	private EEFSingleValuedReferenceDescription description;

	/**
	 * The text.
	 */
	private Hyperlink hyperlink;

	/**
	 * The text.
	 */
	private Label text;

	/**
	 * The create button.
	 */
	private Button createButton;

	/**
	 * The search button.
	 */
	private Button setButton;

	/**
	 * The unset button.
	 */
	private Button unsetButton;

	/**
	 * The main parent.
	 */
	private Composite singleReference;

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
	public EEFSingleValuedReferenceLifecycleManager(EEFSingleValuedReferenceDescription description, IVariableManager variableManager,
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
		EEFTabbedPropertySheetWidgetFactory widgetFactory = tabbedPropertySheetPage.getWidgetFactory();
		this.singleReference = widgetFactory.createFlatFormComposite(parent);
		GridLayout layout = new GridLayout(2, false);
		singleReference.setLayout(layout); // this is the parent composite

		// Use hyperlink if the onclick expression exists
		GridData gd = new GridData();
		gd.grabExcessHorizontalSpace = true;
		gd.horizontalAlignment = SWT.FILL;
		if (this.description.getOnClickExpression() != null) {
			this.hyperlink = widgetFactory.createHyperlink(this.singleReference, "", SWT.NONE); //$NON-NLS-1$
			hyperlink.setLayoutData(gd);
		} else {
			this.text = widgetFactory.createLabel(this.singleReference, "", SWT.NONE); //$NON-NLS-1$
			text.setLayoutData(gd);
		}

		this.buttons = widgetFactory.createFlatFormComposite(singleReference);
		this.buttons.setLayout(new RowLayout(SWT.HORIZONTAL));
		gd = new GridData();
		gd.grabExcessHorizontalSpace = false;
		this.buttons.setLayoutData(gd);

		this.setButton = widgetFactory.createButton(this.buttons, "", SWT.NONE); //$NON-NLS-1$
		this.setButton.setImage(EEFIdeUiPlugin.getPlugin().getImageRegistry().get(Icons.SET));
		if (createExpressionExists()) {
			this.createButton = widgetFactory.createButton(this.buttons, "", SWT.NONE); //$NON-NLS-1$}
			this.createButton.setImage(EEFIdeUiPlugin.getPlugin().getImageRegistry().get(Icons.CREATE));
		}
		this.unsetButton = widgetFactory.createButton(this.buttons, "", SWT.NONE); //$NON-NLS-1$
		this.unsetButton.setImage(EEFIdeUiPlugin.getPlugin().getImageRegistry().get(Icons.UNSET));
		widgetFactory.paintBordersFor(parent);

		FormData formData = new FormData();
		formData.left = new FormAttachment(0, LABEL_WIDTH);
		formData.right = new FormAttachment(100, 0);
		this.singleReference.setLayoutData(formData);

		this.controller = new EEFControllersFactory().createSingleValuedReferenceController(this.description, this.variableManager, this.interpreter,
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
					if (selection != null) {
						Object element = selection.getFirstElement();
						controller.onClick(element);
					}
				}
			};
			this.hyperlink.addHyperlinkListener(this.onClickListener);
		}

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

		this.setSelectionListener = new SetSelectionListener();
		this.setButton.addSelectionListener(this.setSelectionListener);

		this.unsetSelectionListener = new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Object element = null;
				if (hyperlinkExists()) {
					element = EEFSingleValuedReferenceLifecycleManager.this.hyperlink.getData();
				} else {
					element = EEFSingleValuedReferenceLifecycleManager.this.text.getData();
				}
				controller.unset(element);
			}
		};
		this.unsetButton.addSelectionListener(this.unsetSelectionListener);
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

		if (createExpressionExists() && !createButton.isDisposed()) {
			this.createButton.removeSelectionListener(this.createSelectionListener);
		}

		if (!setButton.isDisposed()) {
			this.setButton.removeSelectionListener(this.setSelectionListener);
		}

		if (!unsetButton.isDisposed()) {
			this.unsetButton.removeSelectionListener(this.unsetSelectionListener);
		}

		this.controller.removeNewValueConsumer();
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
	 * Set button listener.
	 *
	 * @author mbats
	 */
	private class SetSelectionListener extends SelectionAdapter {
		@Override
		public void widgetSelected(SelectionEvent e) {
			// Get the semantic element
			String semanticElementExpression = EEFSingleValuedReferenceLifecycleManager.this.description.getSemanticElementExpression();
			EAttribute eAttribute = EefPackage.Literals.EEF_REFERENCE_DESCRIPTION__SEMANTIC_ELEMENT_EXPRESSION;
			EObject semanticElement = new Eval(EEFSingleValuedReferenceLifecycleManager.this.interpreter,
					EEFSingleValuedReferenceLifecycleManager.this.variableManager).get(eAttribute, semanticElementExpression, EObject.class);
			if (semanticElement != null) {
				// Get the reference name
				String eReferenceNameExpression = EEFSingleValuedReferenceLifecycleManager.this.description.getEReferenceNameExpression();
				eAttribute = EefPackage.Literals.EEF_REFERENCE_DESCRIPTION__EREFERENCE_NAME_EXPRESSION;
				String eReferenceName = new Eval(EEFSingleValuedReferenceLifecycleManager.this.interpreter,
						EEFSingleValuedReferenceLifecycleManager.this.variableManager).get(eAttribute, eReferenceNameExpression, String.class);

				// Get the reference
				EStructuralFeature eReference = semanticElement.eClass().getEStructuralFeature(eReferenceName);

				if (eReference != null) {
					// Get the reference value
					Object eReferenceValue = semanticElement.eGet(eReference);

					// Get the candidates
					String candidatesExpression = EEFSingleValuedReferenceLifecycleManager.this.description.getCandidatesExpression();
					eAttribute = EefPackage.Literals.EEF_NON_CONTAINMENT_REFERENCE_DESCRIPTION__CANDIDATES_EXPRESSION;
					@SuppressWarnings("unchecked")
					List<Object> candidates = new Eval(EEFSingleValuedReferenceLifecycleManager.this.interpreter,
							EEFSingleValuedReferenceLifecycleManager.this.variableManager).get(eAttribute, candidatesExpression, List.class);

					ILabelProvider labelProvider = new SelectionDialogLabelProvider();
					ElementListSelectionDialog dialog = new ElementListSelectionDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow()
							.getShell(), labelProvider);
					dialog.setElements(candidates.toArray());
					dialog.setMultipleSelection(false);
					dialog.setHelpAvailable(false);
					dialog.setMessage("Select an element in the list : "); //$NON-NLS-1$
					dialog.setTitle("Set the " + eReferenceName + " reference"); //$NON-NLS-1$//$NON-NLS-2$
					dialog.setInitialSelections(new Object[] { eReferenceValue });
					int result = dialog.open();
					if (result == Dialog.OK) {
						Object newValue = dialog.getFirstResult();
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
	private class SelectionDialogLabelProvider implements ILabelProvider {
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
			String candidateDisplayExpression = EEFSingleValuedReferenceLifecycleManager.this.description.getCandidateDisplayExpression();
			EAttribute eAttribute = EefPackage.Literals.EEF_NON_CONTAINMENT_REFERENCE_DESCRIPTION__CANDIDATE_DISPLAY_EXPRESSION;
			Map<String, Object> variables = new HashMap<String, Object>();
			variables.put(EEFExpressionUtils.SELF, variableManager.getVariables().get(EEFExpressionUtils.SELF));
			variables.put(EEFExpressionUtils.EEFNonContainmentReference.CANDIDATE, element);
			String candidateDisplay = new Eval(EEFSingleValuedReferenceLifecycleManager.this.interpreter, variables).get(eAttribute,
					candidateDisplayExpression, String.class);
			return candidateDisplay;
		}

		@Override
		public Image getImage(Object element) {
			return null;
		}
	}

	/**
	 * New value consumer.
	 *
	 * @author mbats
	 */
	private final class NewValueConsumer implements IConsumer<Object> {
		@Override
		public void apply(Object value) {
			String expression = description.getDisplayExpression();
			EAttribute eAttribute = EefPackage.Literals.EEF_REFERENCE_DESCRIPTION__DISPLAY_EXPRESSION;
			Map<String, Object> variables = new HashMap<String, Object>();
			variables.put(EEFExpressionUtils.SELF, variableManager.getVariables().get(EEFExpressionUtils.SELF));
			variables.put(EEFExpressionUtils.EEFReference.VALUE, value);
			String display = new Eval(EEFSingleValuedReferenceLifecycleManager.this.interpreter, variables).get(eAttribute, expression, String.class);
			if (display == null) {
				display = ""; //$NON-NLS-1$
			}
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
	}
}
