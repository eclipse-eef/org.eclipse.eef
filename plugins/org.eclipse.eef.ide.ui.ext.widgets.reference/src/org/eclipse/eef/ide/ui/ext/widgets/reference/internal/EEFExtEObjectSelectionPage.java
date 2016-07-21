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

import java.text.MessageFormat;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.ide.ui.ext.widgets.reference.api.IEEFExtReferenceViewerFilterProvider.ContextKind;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Tree;

/**
 * This page is used to select a new EObject for the given reference.
 *
 * @author sbegaudeau
 */
public class EEFExtEObjectSelectionPage extends WizardPage {
	/**
	 * The target.
	 */
	private EObject target;

	/**
	 * The EReference.
	 */
	private EReference eReference;

	/**
	 * The editing context adapter.
	 */
	private EditingContextAdapter editingContextAdapter;

	/**
	 * The {@link ComposedAdapterFactory} used to retrieve the label and image of the various EObjects visible in the
	 * user interface.
	 */
	private ComposedAdapterFactory composedAdapterFactory;

	/**
	 * The tree viewer used to select the EObject to reference.
	 */
	private TreeViewer eObjectTreeViewer;

	/**
	 * The listener used to react to the selection in the tree viewer.
	 */
	private ISelectionChangedListener eObjectTreeViewerListener;

	/**
	 * The constructor.
	 *
	 * @param target
	 *            The target
	 * @param eReference
	 *            The EReference
	 * @param editingContextAdapter
	 *            The editing context adapter
	 */
	public EEFExtEObjectSelectionPage(EObject target, EReference eReference, EditingContextAdapter editingContextAdapter) {
		super(Messages.ReferenceSelectionWizardPage_title);
		this.target = target;
		this.eReference = eReference;
		this.editingContextAdapter = editingContextAdapter;

		this.setTitle(Messages.ReferenceSelectionWizardPage_title);
		this.setDescription(Messages.ReferenceSelectionWizardPage_description);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createControl(Composite parent) {
		this.initializeDialogUnits(parent);

		Composite control = new Composite(parent, SWT.NONE);
		control.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		this.setControl(control);

		GridLayout gridLayout = new GridLayout(2, false);
		control.setLayout(gridLayout);

		this.composedAdapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

		this.createSelectionTreeViewer(control);
		this.initializeInput();

		this.determinePageCompletion();
	}

	/**
	 * Creates the tree viewer.
	 *
	 * @param parent
	 *            The parent composite
	 */
	private void createSelectionTreeViewer(Composite parent) {
		Label label = new Label(parent, SWT.NONE);
		label.setText(Messages.ReferenceCreationWizardPage_eContainerSelectionLabel);
		label.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1));

		this.eObjectTreeViewer = new TreeViewer(new Tree(parent, SWT.SINGLE | SWT.FULL_SELECTION | SWT.BORDER));
		this.eObjectTreeViewer.setLabelProvider(new DelegatingStyledCellLabelProvider(new AdapterFactoryLabelProvider.StyledLabelProvider(
				this.composedAdapterFactory, this.eObjectTreeViewer)));
		this.eObjectTreeViewer.setContentProvider(new AdapterFactoryContentProvider(this.composedAdapterFactory));
		this.eObjectTreeViewer.setAutoExpandLevel(2);

		GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1);
		this.eObjectTreeViewer.getTree().setLayoutData(gridData);

		List<ViewerFilter> viewFilters = EEFExtReferenceUIPlugin.getPlugin().getViewFilters(ContextKind.EOBJECT_SELECTION);
		this.eObjectTreeViewer.setFilters(viewFilters.toArray(new ViewerFilter[viewFilters.size()]));

		this.eObjectTreeViewerListener = new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				EEFExtEObjectSelectionPage.this.determinePageCompletion();
			}
		};
		this.eObjectTreeViewer.addSelectionChangedListener(this.eObjectTreeViewerListener);
	}

	/**
	 * This methods is called when the selection changes in the tree viewer.
	 */
	protected void handleEObjectSelectionChanged() {
		this.determinePageCompletion();
	}

	/**
	 * Initializes the input of the wizard.
	 */
	private void initializeInput() {
		this.eObjectTreeViewer.setInput(this.editingContextAdapter.getEditingDomain().getResourceSet());
	}

	/**
	 * Determines if the page is complete or not.
	 */
	private void determinePageCompletion() {
		this.setMessage(null);

		ISelection selection = this.eObjectTreeViewer.getSelection();
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			Object object = structuredSelection.getFirstElement();
			if (object instanceof EObject) {
				EObject eObject = (EObject) object;
				if (this.eReference.getEReferenceType().isInstance(eObject)) {
					this.setPageComplete(true);
				} else {
					String type = this.eReference.getEReferenceType().getName();
					this.setMessage(MessageFormat.format(Messages.ReferenceSelectionWizardPage_missingEObject, type), ERROR);
					this.setPageComplete(false);
				}
			} else {
				String type = this.eReference.getEReferenceType().getName();
				this.setMessage(MessageFormat.format(Messages.ReferenceSelectionWizardPage_missingEObject, type), ERROR);
				this.setPageComplete(false);
			}
		}
	}

	/**
	 * Sets the value of the reference to the selected object.
	 *
	 * @param monitor
	 *            The progress monitor
	 */
	public void performFinish(IProgressMonitor monitor) {
		ISelection selection = this.eObjectTreeViewer.getSelection();
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			Object object = structuredSelection.getFirstElement();
			if (object instanceof EObject) {
				EObject eObject = (EObject) object;
				if (this.eReference.getEReferenceType().isInstance(eObject)) {
					this.target.eSet(this.eReference, eObject);
				}
			}
		}
	}
}
