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

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.wizard.Wizard;

/**
 * The wizard used to select a value for the reference.
 *
 * @author sbegaudeau
 */
public class EEFExtEObjectSelectionWizard extends Wizard {

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
	 * The page used to select a new EObject.
	 */
	private EEFExtEObjectSelectionPage eObjectSelectionPage;

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
	public EEFExtEObjectSelectionWizard(EObject target, EReference eReference, EditingContextAdapter editingContextAdapter) {
		this.target = target;
		this.eReference = eReference;
		this.editingContextAdapter = editingContextAdapter;
		this.setWindowTitle(Messages.ReferenceSelectionWizard_windowTitle);
		ImageDescriptor imageDescriptor = ExtendedImageRegistry.INSTANCE
				.getImageDescriptor(EEFExtReferenceUIPlugin.getPlugin().getImage(EEFExtReferenceUIPlugin.Implementation.NEW_WIZBAN_PATH));
		this.setDefaultPageImageDescriptor(imageDescriptor);
		this.setNeedsProgressMonitor(true);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.jface.wizard.Wizard#addPages()
	 */
	@Override
	public void addPages() {
		super.addPages();

		this.eObjectSelectionPage = new EEFExtEObjectSelectionPage(this.target, this.eReference, this.editingContextAdapter);
		this.addPage(this.eObjectSelectionPage);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.jface.wizard.Wizard#performFinish()
	 */
	@Override
	public boolean performFinish() {
		boolean finishedProperly = true;

		IRunnableWithProgress runnableWithProgress = (monitor) -> {
			this.editingContextAdapter.performModelChange(() -> this.eObjectSelectionPage.performFinish(monitor));
		};

		try {
			this.getContainer().run(false, false, runnableWithProgress);
		} catch (InvocationTargetException | InterruptedException e) {
			finishedProperly = false;
			IStatus status = new Status(IStatus.ERROR, EEFExtReferenceUIPlugin.PLUGIN_ID, e.getMessage());
			EEFExtReferenceUIPlugin.getPlugin().getLog().log(status);
		}

		return finishedProperly;
	}

}
