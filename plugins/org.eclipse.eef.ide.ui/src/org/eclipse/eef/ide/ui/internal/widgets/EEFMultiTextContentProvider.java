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
package org.eclipse.eef.ide.ui.internal.widgets;

import java.util.Collection;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

/**
 * @author arichard
 *
 */
public class EEFMultiTextContentProvider implements IStructuredContentProvider {

	/**
	 * The EAttribute.
	 */
	private EAttribute eAttribute;

	/**
	 * The constructor.
	 *
	 * @param eAttribute
	 *            The EAttribute
	 */
	public EEFMultiTextContentProvider(EAttribute eAttribute) {
		this.eAttribute = eAttribute;
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
		if (inputElement instanceof EObject) {
			EObject eObject = (EObject) inputElement;
			Object values = eObject.eGet(eAttribute);
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
