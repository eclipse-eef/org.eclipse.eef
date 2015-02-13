/*******************************************************************************
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 */
package org.eclipse.emf.eef.runtime.ui.adapters;


import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.eef.runtime.context.impl.DomainPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.command.WizardEditingCommand;


/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 *
 */
public class EEFBatchEditingUtil {

	/**
	 * @param domain
	 * @param adapterFactory
	 * @param element
	 */
	public void editObjectInBatchMode(EditingDomain editingDomain, AdapterFactory adapterFactory, EObject eObject) {
		if (eObject != null) {
			DomainPropertiesEditionContext propertiesEditionContext = new DomainPropertiesEditionContext(null, null, editingDomain, adapterFactory, eObject);
			WizardEditingCommand wizardEditingCommand = new WizardEditingCommand(propertiesEditionContext);
			editingDomain.getCommandStack().execute(wizardEditingCommand);
			propertiesEditionContext.dispose();
		}
	}

}