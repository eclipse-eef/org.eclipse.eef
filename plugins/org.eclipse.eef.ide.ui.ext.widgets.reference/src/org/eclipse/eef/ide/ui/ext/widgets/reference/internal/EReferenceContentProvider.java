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

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

/**
 * The {@link IStructuredContentProvider} to display the value of the given EReference.
 *
 * @author sbegaudeau
 */
public class EReferenceContentProvider implements IStructuredContentProvider {

	/**
	 * The EReference.
	 */
	private EReference eReference;

	/**
	 * The constructor.
	 *
	 * @param eReference
	 *            The EReference
	 */
	public EReferenceContentProvider(EReference eReference) {
		this.eReference = eReference;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.jface.viewers.IContentProvider#inputChanged(org.eclipse.jface.viewers.Viewer, java.lang.Object,
	 *      java.lang.Object)
	 */
	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		// do nothing
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.jface.viewers.IStructuredContentProvider#getElements(java.lang.Object)
	 */
	@Override
	public Object[] getElements(Object inputElement) {
		if (inputElement instanceof EObject && ((EObject) inputElement).eClass().getEAllStructuralFeatures().contains(this.eReference)) {
			EObject eObject = (EObject) inputElement;
			Object values = eObject.eGet(eReference);
			if (values instanceof Collection<?>) {
				Collection<?> collections = (Collection<?>) values;
				return collections.toArray();
			}
		}
		return new Object[] {};
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
