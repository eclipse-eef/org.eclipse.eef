/*******************************************************************************
 * Copyright (c) 2008, 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.runtime.impl.command;

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.ecore.change.ChangeDescription;
import org.eclipse.emf.eef.runtime.context.impl.DomainPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.services.WizardOpeningPolicyProviderService;
import org.eclipse.emf.eef.runtime.ui.wizards.IWizardOpeningPolicy;
import org.eclipse.emf.eef.runtime.ui.wizards.PropertiesEditionWizard;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 */
public class WizardEditingCommand extends AbstractCommand {

	protected DomainPropertiesEditionContext editionContext;

	protected ChangeDescription description;

	/**
	 * @param editionContext
	 */
	public WizardEditingCommand(DomainPropertiesEditionContext editionContext) {
		this.editionContext = editionContext;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.common.command.AbstractCommand#prepare()
	 */
	@Override
	protected boolean prepare() {
		PropertiesEditionWizard wizard = new PropertiesEditionWizard(editionContext,
				editionContext.getAdapterFactory(), editionContext.getEObject());
		IWizardOpeningPolicy wizardOpeningPolicy = WizardOpeningPolicyProviderService.provide(editionContext.getEObject());
		boolean openWizard = wizardOpeningPolicy.openWizard(editionContext, wizard);
		this.description = wizardOpeningPolicy.getDescription();
		return openWizard;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.common.command.Command#execute()
	 */
	public void execute() {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.common.command.AbstractCommand#undo()
	 */
	@Override
	public void undo() {
		if (description != null) {
			description.applyAndReverse();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.common.command.Command#redo()
	 */
	public void redo() {
		if (description != null) {
			description.applyAndReverse();
		}
	}

}
