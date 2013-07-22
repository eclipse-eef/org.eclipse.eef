/*******************************************************************************
 * Copyright (c) 2013 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.runtime.ui.swt.e3.tabbed.view.section;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.ui.swt.e3.E3EEFRuntimeUIPlatformPlugin;
import org.eclipse.jface.viewers.DecoratingLabelProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.graphics.Image;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 *
 */
public class EEFLabelProvider extends DecoratingLabelProvider {

	/**
	 * 
	 */
	public EEFLabelProvider() {
		super(new AdapterFactoryLabelProvider(E3EEFRuntimeUIPlatformPlugin.getPlugin().getRegistryAdapterFactory()), null);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.jface.viewers.LabelProvider#getImage(java.lang.Object)
	 */
	public Image getImage(Object element) {
		return super.getImage(unwrap(element));
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.jface.viewers.LabelProvider#getText(java.lang.Object)
	 */
	public String getText(Object element) {
		return super.getText(unwrap(element));
	}

	   /**
     * @generated
     */
    private Object unwrap(Object element) {
        if (element instanceof IStructuredSelection) {
            return unwrap(((IStructuredSelection) element).getFirstElement());
        }
        if (element instanceof IAdaptable) {
            EObject eObject = (EObject) ((IAdaptable) element).getAdapter(EObject.class);
            if (eObject != null) {
                return eObject;
            }
        }
        return element;
    }

}
