/*******************************************************************************
 * Copyright (c) 2008-2009 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.runtime.ui.editors.pages;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.impl.providers.RegistryPropertiesEditionProvider;
import org.eclipse.emf.eef.runtime.ui.layout.EEFFormLayoutFactory;
import org.eclipse.emf.eef.runtime.ui.viewers.PropertiesEditionContentProvider;
import org.eclipse.emf.eef.runtime.ui.viewers.PropertiesEditionViewer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.AbstractFormPart;
import org.eclipse.ui.forms.IDetailsPage;
import org.eclipse.ui.forms.IFormPart;
import org.eclipse.ui.forms.widgets.FormToolkit;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 *
 */
public class EEFDetailsPage extends AbstractFormPart implements IDetailsPage {
	
	private FormToolkit toolkit;
	private EditingDomain editingDomain;
	protected EObject eObject;
	protected IPropertiesEditionComponent propertiesEditionComponent;
	protected ResourceSet allResources;
	protected PropertiesEditionViewer viewer;

	public EEFDetailsPage(FormToolkit toolkit, EditingDomain editingDomain) {
		super();
		this.toolkit = toolkit; 
		this.editingDomain = editingDomain;
	}

	public void createContents(Composite parent) {
		parent.setLayout(EEFFormLayoutFactory.createDetailsGridLayout(false, 1));
		parent.setLayoutData(new GridData(GridData.FILL_BOTH));
		Composite container = toolkit.createComposite(parent, SWT.FLAT);
		FillLayout containerLayout = new FillLayout();
		container.setLayout(containerLayout);
		container.setLayoutData(new GridData(GridData.FILL_BOTH));
		viewer = new PropertiesEditionViewer(container, null, SWT.None, 1);
		viewer.setDynamicTabHeader(false);
		viewer.setToolkit(getManagedForm().getToolkit());
		viewer.setContentProvider(new PropertiesEditionContentProvider(new RegistryPropertiesEditionProvider(), IPropertiesEditionComponent.LIVE_MODE, editingDomain));
	}

	public void selectionChanged(IFormPart part, ISelection selection) {
		if (!(selection instanceof IStructuredSelection)) {
			return;
		}
		EObject newEObject = getEObjectFromSelection(selection);
		if (newEObject != null && newEObject != eObject) {
			eObject = newEObject;
			if (eObject != null) {
				viewer.setToolkit(toolkit);
				viewer.setInput(eObject);
			}
		}
	}

	private EObject getEObjectFromSelection(ISelection selection) {
		if (selection instanceof TreeSelection && (((TreeSelection)selection).getFirstElement() instanceof EObject))
			return (EObject) ((TreeSelection)selection).getFirstElement();
		if (selection instanceof EObject)
			return (EObject) selection;
		if (selection instanceof IAdaptable && ((IAdaptable)selection).getAdapter(EObject.class) != null)
			return (EObject) ((IAdaptable)selection).getAdapter(EObject.class);
			
		return null;
	}
}
