/*******************************************************************************
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.eef.uml.editor.sample.internal.properties;

import java.util.List;

import org.eclipse.eef.ide.ui.api.TabDescriptorFilter;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.ITabDescriptor;
import org.eclipse.ui.views.properties.tabbed.ITabDescriptorProvider;

/**
 * The tab descriptor provider for the UML properties view.
 *
 * @author sbegaudeau
 */
public class UMLTabDescriptorProvider implements ITabDescriptorProvider {

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.ui.views.properties.tabbed.ITabDescriptorProvider#getTabDescriptors(org.eclipse.ui.IWorkbenchPart,
	 *      org.eclipse.jface.viewers.ISelection)
	 */
	@Override
	public ITabDescriptor[] getTabDescriptors(IWorkbenchPart part, ISelection selection) {
		if (part instanceof IEditingDomainProvider && selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			Object[] objects = structuredSelection.toArray();

			IEditingDomainProvider editingDomainProvider = (IEditingDomainProvider) part;
			EditingDomain editingDomain = editingDomainProvider.getEditingDomain();

			Object[] eObjects = new Object[objects.length];

			for (int i = 0; i < objects.length; i = i + 1) {
				Object object = objects[i];
				if (object instanceof EObject) {
					EObject eObject = (EObject) object;
					URI uri = EcoreUtil.getURI(eObject);
					EObject domainEObject = editingDomain.getResourceSet().getEObject(uri, true);
					eObjects[i] = domainEObject;
				}
			}

			if (editingDomain instanceof TransactionalEditingDomain) {
				TransactionalEditingDomain transactionalEditingDomain = (TransactionalEditingDomain) editingDomain;
				List<ITabDescriptor> descriptors = new TabDescriptorFilter().getTabDescriptors(eObjects, transactionalEditingDomain);
				return descriptors.toArray(new ITabDescriptor[descriptors.size()]);
			}
		}
		return new ITabDescriptor[0];
	}

}
