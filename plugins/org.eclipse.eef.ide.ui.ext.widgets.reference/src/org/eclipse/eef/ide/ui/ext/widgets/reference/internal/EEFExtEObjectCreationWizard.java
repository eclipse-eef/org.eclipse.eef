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
package org.eclipse.eef.ide.ui.ext.widgets.reference.internal;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.IProgressMonitor;
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
 * The wizard used to create a new value for the reference.
 *
 * @author sbegaudeau
 */
public class EEFExtEObjectCreationWizard extends Wizard {

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
	 * The page used to create the new EObject.
	 */
	private EEFExtEObjectCreationPage eObjectCreationPage;

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
	public EEFExtEObjectCreationWizard(EObject target, EReference eReference, EditingContextAdapter editingContextAdapter) {
		this.target = target;
		this.eReference = eReference;
		this.editingContextAdapter = editingContextAdapter;
		this.setWindowTitle(Messages.ReferenceCreationWizard_windowTitle);
		ImageDescriptor imageDescriptor = ExtendedImageRegistry.INSTANCE.getImageDescriptor(EEFExtReferenceUIPlugin.getPlugin().getImage(
				EEFExtReferenceUIPlugin.Implementation.NEW_WIZBAN_PATH));
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

		this.eObjectCreationPage = new EEFExtEObjectCreationPage(this.target, this.eReference, this.editingContextAdapter);
		this.addPage(this.eObjectCreationPage);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.jface.wizard.Wizard#performFinish()
	 */
	@Override
	public boolean performFinish() {
		boolean finishedProperly = true;

		IRunnableWithProgress runnableWithProgress = new IRunnableWithProgress() {
			@Override
			public void run(final IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
				Runnable runnable = new Runnable() {
					@Override
					public void run() {
						EEFExtEObjectCreationWizard.this.eObjectCreationPage.performFinish(monitor);
					}
				};

				EEFExtEObjectCreationWizard.this.editingContextAdapter.performModelChange(runnable);
			}
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
