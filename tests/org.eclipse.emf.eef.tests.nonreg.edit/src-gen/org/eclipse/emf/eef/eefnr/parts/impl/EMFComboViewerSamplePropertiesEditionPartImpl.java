/*******************************************************************************
 * Copyright (c) 2008, 2012 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.eefnr.parts.impl;

// Start of user code for imports
import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import org.eclipse.emf.eef.eefnr.parts.EMFComboViewerSamplePropertiesEditionPart;
import org.eclipse.emf.eef.eefnr.parts.EefnrViewsRepository;

import org.eclipse.emf.eef.eefnr.providers.EefnrMessages;

import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;

import org.eclipse.swt.SWT;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class EMFComboViewerSamplePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, EMFComboViewerSamplePropertiesEditionPart {

	protected EMFComboViewer emfcomboviewerRequiredProperty;
	protected EMFComboViewer emfcomboviewerOptionalProperty;
	protected EMFComboViewer emfcomboviewerROProperty;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public EMFComboViewerSamplePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createFigure(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public Composite createFigure(final Composite parent) {
		view = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(view);
		return view;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createControls(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(Composite view) { 
		CompositionSequence eMFComboViewerSampleStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = eMFComboViewerSampleStep.addStep(EefnrViewsRepository.EMFComboViewerSample.Properties.class);
		propertiesStep.addStep(EefnrViewsRepository.EMFComboViewerSample.Properties.emfcomboviewerRequiredProperty);
		propertiesStep.addStep(EefnrViewsRepository.EMFComboViewerSample.Properties.emfcomboviewerOptionalProperty);
		propertiesStep.addStep(EefnrViewsRepository.EMFComboViewerSample.Properties.emfcomboviewerROProperty);
		
		
		composer = new PartComposer(eMFComboViewerSampleStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EefnrViewsRepository.EMFComboViewerSample.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == EefnrViewsRepository.EMFComboViewerSample.Properties.emfcomboviewerRequiredProperty) {
					return createEmfcomboviewerRequiredPropertyEMFComboViewer(parent);
				}
				if (key == EefnrViewsRepository.EMFComboViewerSample.Properties.emfcomboviewerOptionalProperty) {
					return createEmfcomboviewerOptionalPropertyEMFComboViewer(parent);
				}
				if (key == EefnrViewsRepository.EMFComboViewerSample.Properties.emfcomboviewerROProperty) {
					return createEmfcomboviewerROPropertyEMFComboViewer(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createPropertiesGroup(Composite parent) {
		Group propertiesGroup = new Group(parent, SWT.NONE);
		propertiesGroup.setText(EefnrMessages.EMFComboViewerSamplePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createEmfcomboviewerRequiredPropertyEMFComboViewer(Composite parent) {
		createDescription(parent, EefnrViewsRepository.EMFComboViewerSample.Properties.emfcomboviewerRequiredProperty, EefnrMessages.EMFComboViewerSamplePropertiesEditionPart_EmfcomboviewerRequiredPropertyLabel);
		emfcomboviewerRequiredProperty = new EMFComboViewer(parent);
		emfcomboviewerRequiredProperty.setContentProvider(new ArrayContentProvider());
		emfcomboviewerRequiredProperty.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData emfcomboviewerRequiredPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		emfcomboviewerRequiredProperty.getCombo().setLayoutData(emfcomboviewerRequiredPropertyData);
		emfcomboviewerRequiredProperty.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EMFComboViewerSamplePropertiesEditionPartImpl.this, EefnrViewsRepository.EMFComboViewerSample.Properties.emfcomboviewerRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getEmfcomboviewerRequiredProperty()));
			}

		});
		emfcomboviewerRequiredProperty.setID(EefnrViewsRepository.EMFComboViewerSample.Properties.emfcomboviewerRequiredProperty);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EefnrViewsRepository.EMFComboViewerSample.Properties.emfcomboviewerRequiredProperty, EefnrViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createEmfcomboviewerRequiredPropertyEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createEmfcomboviewerOptionalPropertyEMFComboViewer(Composite parent) {
		createDescription(parent, EefnrViewsRepository.EMFComboViewerSample.Properties.emfcomboviewerOptionalProperty, EefnrMessages.EMFComboViewerSamplePropertiesEditionPart_EmfcomboviewerOptionalPropertyLabel);
		emfcomboviewerOptionalProperty = new EMFComboViewer(parent);
		emfcomboviewerOptionalProperty.setContentProvider(new ArrayContentProvider());
		emfcomboviewerOptionalProperty.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData emfcomboviewerOptionalPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		emfcomboviewerOptionalProperty.getCombo().setLayoutData(emfcomboviewerOptionalPropertyData);
		emfcomboviewerOptionalProperty.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EMFComboViewerSamplePropertiesEditionPartImpl.this, EefnrViewsRepository.EMFComboViewerSample.Properties.emfcomboviewerOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getEmfcomboviewerOptionalProperty()));
			}

		});
		emfcomboviewerOptionalProperty.setID(EefnrViewsRepository.EMFComboViewerSample.Properties.emfcomboviewerOptionalProperty);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EefnrViewsRepository.EMFComboViewerSample.Properties.emfcomboviewerOptionalProperty, EefnrViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createEmfcomboviewerOptionalPropertyEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createEmfcomboviewerROPropertyEMFComboViewer(Composite parent) {
		createDescription(parent, EefnrViewsRepository.EMFComboViewerSample.Properties.emfcomboviewerROProperty, EefnrMessages.EMFComboViewerSamplePropertiesEditionPart_EmfcomboviewerROPropertyLabel);
		emfcomboviewerROProperty = new EMFComboViewer(parent);
		emfcomboviewerROProperty.setContentProvider(new ArrayContentProvider());
		emfcomboviewerROProperty.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData emfcomboviewerROPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		emfcomboviewerROProperty.getCombo().setLayoutData(emfcomboviewerROPropertyData);
		emfcomboviewerROProperty.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EMFComboViewerSamplePropertiesEditionPartImpl.this, EefnrViewsRepository.EMFComboViewerSample.Properties.emfcomboviewerROProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getEmfcomboviewerROProperty()));
			}

		});
		emfcomboviewerROProperty.setID(EefnrViewsRepository.EMFComboViewerSample.Properties.emfcomboviewerROProperty);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EefnrViewsRepository.EMFComboViewerSample.Properties.emfcomboviewerROProperty, EefnrViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createEmfcomboviewerROPropertyEMFComboViewer

		// End of user code
		return parent;
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization
		
		// End of user code
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.EMFComboViewerSamplePropertiesEditionPart#getEmfcomboviewerRequiredProperty()
	 * 
	 */
	public Enumerator getEmfcomboviewerRequiredProperty() {
		Enumerator selection = (Enumerator) ((StructuredSelection) emfcomboviewerRequiredProperty.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.EMFComboViewerSamplePropertiesEditionPart#initEmfcomboviewerRequiredProperty(Object input, Enumerator current)
	 */
	public void initEmfcomboviewerRequiredProperty(Object input, Enumerator current) {
		emfcomboviewerRequiredProperty.setInput(input);
		emfcomboviewerRequiredProperty.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(EefnrViewsRepository.EMFComboViewerSample.Properties.emfcomboviewerRequiredProperty);
		if (eefElementEditorReadOnlyState && emfcomboviewerRequiredProperty.isEnabled()) {
			emfcomboviewerRequiredProperty.setEnabled(false);
			emfcomboviewerRequiredProperty.setToolTipText(EefnrMessages.EMFComboViewerSample_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !emfcomboviewerRequiredProperty.isEnabled()) {
			emfcomboviewerRequiredProperty.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.EMFComboViewerSamplePropertiesEditionPart#setEmfcomboviewerRequiredProperty(Enumerator newValue)
	 * 
	 */
	public void setEmfcomboviewerRequiredProperty(Enumerator newValue) {
		emfcomboviewerRequiredProperty.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(EefnrViewsRepository.EMFComboViewerSample.Properties.emfcomboviewerRequiredProperty);
		if (eefElementEditorReadOnlyState && emfcomboviewerRequiredProperty.isEnabled()) {
			emfcomboviewerRequiredProperty.setEnabled(false);
			emfcomboviewerRequiredProperty.setToolTipText(EefnrMessages.EMFComboViewerSample_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !emfcomboviewerRequiredProperty.isEnabled()) {
			emfcomboviewerRequiredProperty.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.EMFComboViewerSamplePropertiesEditionPart#getEmfcomboviewerOptionalProperty()
	 * 
	 */
	public Enumerator getEmfcomboviewerOptionalProperty() {
		Enumerator selection = (Enumerator) ((StructuredSelection) emfcomboviewerOptionalProperty.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.EMFComboViewerSamplePropertiesEditionPart#initEmfcomboviewerOptionalProperty(Object input, Enumerator current)
	 */
	public void initEmfcomboviewerOptionalProperty(Object input, Enumerator current) {
		emfcomboviewerOptionalProperty.setInput(input);
		emfcomboviewerOptionalProperty.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(EefnrViewsRepository.EMFComboViewerSample.Properties.emfcomboviewerOptionalProperty);
		if (eefElementEditorReadOnlyState && emfcomboviewerOptionalProperty.isEnabled()) {
			emfcomboviewerOptionalProperty.setEnabled(false);
			emfcomboviewerOptionalProperty.setToolTipText(EefnrMessages.EMFComboViewerSample_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !emfcomboviewerOptionalProperty.isEnabled()) {
			emfcomboviewerOptionalProperty.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.EMFComboViewerSamplePropertiesEditionPart#setEmfcomboviewerOptionalProperty(Enumerator newValue)
	 * 
	 */
	public void setEmfcomboviewerOptionalProperty(Enumerator newValue) {
		emfcomboviewerOptionalProperty.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(EefnrViewsRepository.EMFComboViewerSample.Properties.emfcomboviewerOptionalProperty);
		if (eefElementEditorReadOnlyState && emfcomboviewerOptionalProperty.isEnabled()) {
			emfcomboviewerOptionalProperty.setEnabled(false);
			emfcomboviewerOptionalProperty.setToolTipText(EefnrMessages.EMFComboViewerSample_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !emfcomboviewerOptionalProperty.isEnabled()) {
			emfcomboviewerOptionalProperty.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.EMFComboViewerSamplePropertiesEditionPart#getEmfcomboviewerROProperty()
	 * 
	 */
	public Enumerator getEmfcomboviewerROProperty() {
		Enumerator selection = (Enumerator) ((StructuredSelection) emfcomboviewerROProperty.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.EMFComboViewerSamplePropertiesEditionPart#initEmfcomboviewerROProperty(Object input, Enumerator current)
	 */
	public void initEmfcomboviewerROProperty(Object input, Enumerator current) {
		emfcomboviewerROProperty.setInput(input);
		emfcomboviewerROProperty.modelUpdating(new StructuredSelection(current));
		emfcomboviewerROProperty.setEnabled(false);
		emfcomboviewerROProperty.setToolTipText(EefnrMessages.EMFComboViewerSample_ReadOnly);
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.EMFComboViewerSamplePropertiesEditionPart#setEmfcomboviewerROProperty(Enumerator newValue)
	 * 
	 */
	public void setEmfcomboviewerROProperty(Enumerator newValue) {
		emfcomboviewerROProperty.modelUpdating(new StructuredSelection(newValue));
		emfcomboviewerROProperty.setEnabled(false);
		emfcomboviewerROProperty.setToolTipText(EefnrMessages.EMFComboViewerSample_ReadOnly);
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EefnrMessages.EMFComboViewerSample_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
