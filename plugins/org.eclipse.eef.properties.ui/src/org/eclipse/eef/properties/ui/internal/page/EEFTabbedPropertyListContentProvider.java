/*******************************************************************************
 * Copyright (c) 2001, 2015 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Obeo - Contribution to the project EEF
 *******************************************************************************/
package org.eclipse.eef.properties.ui.internal.page;

import org.eclipse.eef.properties.ui.internal.registry.EEFTabbedPropertyRegistry;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IWorkbenchPart;

/**
 * The default implementation of the content provider for the tabbed property sheet page's list of tabs.
 *
 * @author Anthony Hunter
 * @author Stephane Begaudeau
 */
public class EEFTabbedPropertyListContentProvider implements IStructuredContentProvider {

	/**
	 * The current workbench part.
	 */
	protected IWorkbenchPart currentPart;

	/**
	 * The registry.
	 */
	protected EEFTabbedPropertyRegistry registry;

	/**
	 * The constructor.
	 *
	 * @param registry
	 *            The registry
	 */
	public EEFTabbedPropertyListContentProvider(EEFTabbedPropertyRegistry registry) {
		this.registry = registry;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.jface.viewers.IContentProvider#inputChanged(org.eclipse.jface.viewers.Viewer, java.lang.Object,
	 *      java.lang.Object)
	 */
	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		if (viewer instanceof EEFTabbedPropertyViewer) {
			this.currentPart = ((EEFTabbedPropertyViewer) viewer).getWorkbenchPart();
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.jface.viewers.IStructuredContentProvider#getElements(java.lang.Object)
	 */
	@Override
	public Object[] getElements(Object inputElement) {
		return this.registry.getTabDescriptors().toArray();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.jface.viewers.IContentProvider#dispose()
	 */
	@Override
	public void dispose() {
		// do nothing
	}

}
