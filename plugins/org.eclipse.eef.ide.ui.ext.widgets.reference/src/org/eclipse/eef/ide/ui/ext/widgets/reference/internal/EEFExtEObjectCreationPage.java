/*******************************************************************************
 * Copyright (c) 2016, 2018 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors: Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.eef.ide.ui.ext.widgets.reference.internal;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.eef.common.api.utils.Util;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.ide.ui.ext.widgets.reference.api.IEEFExtReferenceViewerFilterProvider.ContextKind;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Tree;

/**
 * This page is used to create a new EObject for the given reference.
 *
 * @author sbegaudeau
 */
public class EEFExtEObjectCreationPage extends WizardPage {

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
	 * The combo viewer used to select the EClass of the element to create.
	 */
	private ComboViewer eClassInstanceComboViewer;

	/**
	 * This listener will react to selection changes in the combo viewer.
	 */
	private ISelectionChangedListener eClassInstanceComboViewerListener;

	/**
	 * The tree viewer used to select the container of the new EObject to create.
	 */
	private TreeViewer eContainerTreeViewer;

	/**
	 * This listener will react to selection changes in the tree viewer.
	 */
	private ISelectionChangedListener eContainerTreeViewerListener;

	/**
	 * The combo viewer used to select the containment reference to use for the creation of the EObject.
	 */
	private ComboViewer eContainementReferenceComboViewer;

	/**
	 * This listener will react to selection changes in the combo viewer.
	 */
	private ISelectionChangedListener eContainmentReferenceComboViewerListener;

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
	public EEFExtEObjectCreationPage(EObject target, EReference eReference, EditingContextAdapter editingContextAdapter) {
		super(Messages.ReferenceCreationWizardPage_title);
		this.target = target;
		this.eReference = eReference;
		this.editingContextAdapter = editingContextAdapter;

		this.setTitle(Messages.ReferenceCreationWizardPage_title);
		this.setDescription(Messages.ReferenceCreationWizardPage_description);
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
		this.composedAdapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());

		if (this.eReference.isContainment()) {
			this.createEObjectEClassComboViewer(control);
			this.initializeContainmentInput(this.target, this.eReference);
		} else {
			this.createContainerTreeViewer(control);
			this.createContainmentFeatureComboViewer(control);
			this.createEObjectEClassComboViewer(control);
			this.initializeNonContainmentInput();
		}
		this.determinePageCompletion();
	}

	/**
	 * Initializes the input of the page for a containment EReference.
	 *
	 * @param eObject
	 *            The EObject to consider
	 * @param eContainementReference
	 *            The containment EReference to consider
	 */
	private void initializeContainmentInput(EObject eObject, EReference eContainementReference) {
		List<Object> values = new ArrayList<>();
		Adapter adapter = this.composedAdapterFactory.adapt(eObject, IEditingDomainItemProvider.class);
		if (adapter instanceof IEditingDomainItemProvider) {
			IEditingDomainItemProvider itemProviderAdapter = (IEditingDomainItemProvider) adapter;
			Collection<?> newChildDescriptors = itemProviderAdapter.getNewChildDescriptors(eObject, this.editingContextAdapter.getEditingDomain(),
					null);
			for (Object newChildDescriptor : newChildDescriptors) {
				if (newChildDescriptor instanceof CommandParameter) {
					CommandParameter commandParameter = (CommandParameter) newChildDescriptor;
					Object value = commandParameter.getValue();
					if (commandParameter.getEReference().equals(eContainementReference) && value instanceof EObject
							&& this.eReference.getEReferenceType().isSuperTypeOf(((EObject) value).eClass())) {
						values.add(commandParameter.getValue());
					}
				}
			}
		}

		this.eClassInstanceComboViewer.setInput(values);
		if (values.size() > 0) {
			this.eClassInstanceComboViewer.setSelection(new StructuredSelection(values.get(0)));
		} else {
			this.eClassInstanceComboViewer.setSelection(new StructuredSelection());
		}
	}

	/**
	 * Initializes the input of the page for a non containment EReference.
	 */
	private void initializeNonContainmentInput() {
		this.eContainerTreeViewer.setInput(this.editingContextAdapter.getEditingDomain().getResourceSet());
	}

	/**
	 * Creates the tree viewer.
	 *
	 * @param parent
	 *            The parent composite
	 */
	private void createContainerTreeViewer(Composite parent) {
		Label label = new Label(parent, SWT.NONE);
		label.setText(Messages.ReferenceCreationWizardPage_eContainerSelectionLabel);
		label.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1));

		this.eContainerTreeViewer = new TreeViewer(new Tree(parent, SWT.SINGLE | SWT.FULL_SELECTION | SWT.BORDER));
		this.eContainerTreeViewer.setLabelProvider(new DelegatingStyledCellLabelProvider(
				new AdapterFactoryLabelProvider.StyledLabelProvider(this.composedAdapterFactory, this.eContainerTreeViewer)));
		this.eContainerTreeViewer.setContentProvider(new AdapterFactoryContentProvider(this.composedAdapterFactory));
		this.eContainerTreeViewer.getTree().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
		this.eContainerTreeViewer.setAutoExpandLevel(2);

		List<ViewerFilter> viewFilters = EEFExtReferenceUIPlugin.getPlugin().getViewFilters(ContextKind.CONTAINER_SELECTION);
		this.eContainerTreeViewer.setFilters(viewFilters.toArray(new ViewerFilter[viewFilters.size()]));

		this.eContainerTreeViewerListener = new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				EEFExtEObjectCreationPage.this.handleEContainerSelectionChanged();
			}
		};
		this.eContainerTreeViewer.addSelectionChangedListener(this.eContainerTreeViewerListener);
	}

	/**
	 * This methods is called when the selection changes in the EContainer tree viewer.
	 */
	protected void handleEContainerSelectionChanged() {
		EObject eContainer = this.getEObject(this.eContainerTreeViewer);
		if (eContainer != null) {
			List<EReference> eReferences = this.getValidContainmentReferences(eContainer);
			this.eContainementReferenceComboViewer.setInput(eReferences);
			if (eReferences.size() > 0) {
				this.eContainementReferenceComboViewer.setSelection(new StructuredSelection(eReferences.get(0)));
			} else {
				this.eContainementReferenceComboViewer.setSelection(new StructuredSelection());
				this.eClassInstanceComboViewer.setSelection(new StructuredSelection());
			}
		} else {
			this.eContainementReferenceComboViewer.setSelection(new StructuredSelection());
			this.eClassInstanceComboViewer.setSelection(new StructuredSelection());
		}
		this.determinePageCompletion();
	}

	/**
	 * Returns the currently selected EObject in the given viewer.
	 *
	 * @param viewer
	 *            The viewer
	 *
	 * @return The currently selected EObject in the given viewer, or <code>null</code> if the current selection is
	 *         empty or not an EObject (for example an EResource)
	 */
	private EObject getEObject(StructuredViewer viewer) {
		ISelection selection = viewer.getSelection();
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			Object object = structuredSelection.getFirstElement();
			if (object instanceof EObject) {
				return (EObject) object;
			}
		}
		return null;
	}

	/**
	 * Returns a list of all the containment references of the given EObject which have a type compatible with the type
	 * of the current EReference.
	 *
	 * @param eObject
	 *            The EObject
	 * @return A list of EReference
	 */
	private List<EReference> getValidContainmentReferences(EObject eObject) {
		List<EReference> eReferences = new ArrayList<>();

		List<EStructuralFeature> eAllStructuralFeatures = eObject.eClass().getEAllStructuralFeatures();
		for (EStructuralFeature eStructuralFeature : eAllStructuralFeatures) {
			if (eStructuralFeature instanceof EReference) {
				EReference reference = (EReference) eStructuralFeature;
				if (reference.isContainment() && reference.getEReferenceType().isSuperTypeOf(this.eReference.getEReferenceType())) {
					eReferences.add(reference);
				}
			}
		}
		return eReferences;
	}

	/**
	 * Creates the combo viewer to display the possible containment EReferences to use to create the new EObject.
	 *
	 * @param parent
	 *            The parent composite
	 */
	private void createContainmentFeatureComboViewer(Composite parent) {
		Label label = new Label(parent, SWT.NONE);
		label.setText(Messages.ReferenceCreationWizardPage_eContainerToUseLabel);
		label.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false));

		this.eContainementReferenceComboViewer = new ComboViewer(new Combo(parent, SWT.DROP_DOWN | SWT.READ_ONLY));
		this.eContainementReferenceComboViewer.setLabelProvider(new AdapterFactoryLabelProvider(this.composedAdapterFactory));
		this.eContainementReferenceComboViewer.setContentProvider(new ArrayContentProvider());
		this.eContainementReferenceComboViewer.getCombo().setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

		this.eContainmentReferenceComboViewerListener = new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				EEFExtEObjectCreationPage.this.handleEContainmentReferenceSelectionChange();
			}
		};
		this.eContainementReferenceComboViewer.addSelectionChangedListener(this.eContainmentReferenceComboViewerListener);
	}

	/**
	 * This methods is called when the selection changes in the containment EReference combo viewer.
	 */
	private void handleEContainmentReferenceSelectionChange() {
		EObject eContainer = this.getEObject(this.eContainerTreeViewer);
		if (eContainer != null) {
			EObject eContainmentReference = this.getEObject(this.eContainementReferenceComboViewer);
			if (eContainmentReference instanceof EReference) {
				this.initializeContainmentInput(eContainer, (EReference) eContainmentReference);
			}
		}
		this.determinePageCompletion();
	}

	/**
	 * Creates the combo viewer used to display the EClass of the possible EObjects that can be created.
	 *
	 * @param parent
	 *            The parent composite
	 */
	private void createEObjectEClassComboViewer(Composite parent) {
		Label label = new Label(parent, SWT.NONE);
		label.setText(Messages.ReferenceCreationWizardPage_eClassToCreateLabel);
		label.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false));

		this.eClassInstanceComboViewer = new ComboViewer(new Combo(parent, SWT.DROP_DOWN | SWT.READ_ONLY));
		this.eClassInstanceComboViewer.setLabelProvider(new AdapterFactoryLabelProvider(this.composedAdapterFactory) {
			@Override
			public String getText(Object object) {
				String result = super.getText(object);
				if (Util.isBlank(result) && object instanceof EObject) {
					AdapterFactoryLabelProvider labelProvider = new AdapterFactoryLabelProvider(composedAdapterFactory);
					result = labelProvider.getText(((EObject) object).eClass());
				}

				return result;
			}
		});
		this.eClassInstanceComboViewer.setContentProvider(new ArrayContentProvider());
		this.eClassInstanceComboViewer.getCombo().setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

		this.eClassInstanceComboViewerListener = new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				EEFExtEObjectCreationPage.this.determinePageCompletion();
			}
		};
		this.eClassInstanceComboViewer.addSelectionChangedListener(this.eClassInstanceComboViewerListener);
	}

	/**
	 * Determines if the page is complete or not.
	 */
	private void determinePageCompletion() {
		this.setMessage(null);

		boolean isPageComplete = false;
		if (this.eReference.isContainment()) {
			isPageComplete = this.isCompleteViewer(true, this.eClassInstanceComboViewer, Messages.ReferenceCreationWizardPage_missingEClassToCreate);
		} else {
			String message = MessageFormat.format(Messages.ReferenceCreationWizardPage_missingEContainer,
					this.eReference.getEReferenceType().getName());
			isPageComplete = this.isCompleteViewer(true, this.eContainerTreeViewer, message);
			isPageComplete = this.isCompleteViewer(isPageComplete, this.eContainementReferenceComboViewer,
					Messages.ReferenceCreationWizardPage_missingContainmentEReference);
			isPageComplete = this.isCompleteViewer(isPageComplete, this.eClassInstanceComboViewer,
					Messages.ReferenceCreationWizardPage_missingEClassToCreate);
		}
		this.setPageComplete(isPageComplete);
	}

	/**
	 * Verifies if the given viewer is complete and if not, set the given error message.
	 *
	 * @param isCurrentlyComplete
	 *            The currently completion status
	 * @param viewer
	 *            The viewer
	 * @param errorMessage
	 *            The error message
	 * @return <code>true</code> if the wizard is currently complete and the viewer too, <code>false</code> otherwise
	 */
	private boolean isCompleteViewer(boolean isCurrentlyComplete, StructuredViewer viewer, String errorMessage) {
		boolean isComplete = isCurrentlyComplete;
		if (isCurrentlyComplete) {
			boolean isViewerComplete = this.getEObject(viewer) != null;
			isComplete = isComplete && isViewerComplete;

			if (!isViewerComplete) {
				this.setMessage(errorMessage, ERROR);
			}
		}
		return isComplete;
	}

	/**
	 * Creates the EObject.
	 *
	 * @param monitor
	 *            The {@link IProgressMonitor}
	 */
	public void performFinish(IProgressMonitor monitor) {
		EObject eObject = this.getEObject(this.eClassInstanceComboViewer);
		if (eObject != null) {
			if (this.eReference.isContainment() && this.eReference.isMany()) {
				this.performFinishMultiValuedContainmentReference(eObject);
			} else if (this.eReference.isContainment() && !this.eReference.isMany()) {
				this.performFinistMonoValuedContainmentReference(eObject);
			} else if (!this.eReference.isContainment() && this.eReference.isMany()) {
				this.performFinistMultiValuedNonContainmentReference(eObject);
			} else if (!this.eReference.isContainment() && !this.eReference.isMany()) {
				this.performFinistMonoValuedNonContainmentReference(eObject);
			}
		}
	}

	/**
	 * Performs the creation of the object for a multi-valued containment reference. In this case, the operation is
	 * quite simple, we will just retrieve the collection containing the values of the reference and add the new
	 * element, value, at the end.
	 *
	 * @param value
	 *            The element to create
	 */
	private void performFinishMultiValuedContainmentReference(EObject value) {
		this.eContainmentAdd(this.target, this.eReference, value);
	}

	/**
	 * Performs the creation of the object for a mono-valued containment reference. In this case, the easiest one, we
	 * will just create set the value for the reference.
	 *
	 * @param value
	 *            The element to create
	 */
	private void performFinistMonoValuedContainmentReference(EObject value) {
		this.target.eSet(this.eReference, value);
	}

	/**
	 * Performs the creation of the object for a multi-valued reference. In this case, we will create the object in a
	 * mono or multi-valued containment reference and then add it to the multi-valued reference of our current object.
	 *
	 * @param value
	 *            The element to create
	 */
	private void performFinistMultiValuedNonContainmentReference(EObject value) {
		EObject eContainer = this.getEObject(this.eContainerTreeViewer);
		EObject eContainmentReferenceEObject = this.getEObject(this.eContainementReferenceComboViewer);
		if (eContainer != null && eContainmentReferenceEObject instanceof EReference) {
			EReference eContainmentReference = (EReference) eContainmentReferenceEObject;

			if (eContainmentReference.isMany()) {
				this.eContainmentAdd(eContainer, (EReference) eContainmentReferenceEObject, value);
			} else {
				eContainer.eSet(eContainmentReference, value);
			}

			this.eContainmentAdd(this.target, this.eReference, value);
		}
	}

	/**
	 * Performs the creation of the object for a mono-valued reference. In this case, we will create the object in a
	 * mono or multi-valued containment reference and then add it to the mono-valued reference of our current object.
	 *
	 * @param value
	 *            The element to create
	 */
	private void performFinistMonoValuedNonContainmentReference(EObject value) {
		EObject eContainer = this.getEObject(this.eContainerTreeViewer);
		EObject eContainmentReferenceEObject = this.getEObject(this.eContainementReferenceComboViewer);
		if (eContainer != null && eContainmentReferenceEObject instanceof EReference) {
			EReference eContainmentReference = (EReference) eContainmentReferenceEObject;

			if (eContainmentReference.isMany()) {
				this.eContainmentAdd(eContainer, (EReference) eContainmentReferenceEObject, value);
			} else {
				eContainer.eSet(eContainmentReference, value);
			}

			this.target.eSet(this.eReference, value);
		}
	}

	/**
	 * Adds the given eObject to the value of the given EReference for the given container EObject.
	 *
	 * @param eContainer
	 *            The container
	 * @param eContainmentReference
	 *            The containment EReference
	 * @param eObject
	 *            The EObject
	 */
	private void eContainmentAdd(EObject eContainer, EReference eContainmentReference, EObject eObject) {
		Object value = eContainer.eGet(eContainmentReference);
		if (value instanceof EList<?>) {
			// sbegaudeau: Yes I know, @SuppressWarnings are bad but we really need this one in order to prevent the
			// creation of a new list which would fire, as a side effect, a modification notification for all the
			// siblings of the newly created object. We do not want anyone to believe that those objects have been
			// modified
			@SuppressWarnings("unchecked")
			EList<EObject> objects = (EList<EObject>) value;
			objects.add(eObject);
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.jface.dialogs.DialogPage#dispose()
	 */
	@Override
	public void dispose() {
		super.dispose();

		this.composedAdapterFactory.dispose();
		this.eClassInstanceComboViewer.removeSelectionChangedListener(this.eClassInstanceComboViewerListener);
	}
}
