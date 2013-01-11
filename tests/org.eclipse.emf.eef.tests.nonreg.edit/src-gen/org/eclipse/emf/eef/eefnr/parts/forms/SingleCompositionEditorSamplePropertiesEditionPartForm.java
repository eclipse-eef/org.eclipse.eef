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
package org.eclipse.emf.eef.eefnr.parts.forms;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.eefnr.parts.EefnrViewsRepository;
import org.eclipse.emf.eef.eefnr.parts.SingleCompositionEditorSamplePropertiesEditionPart;

import org.eclipse.emf.eef.eefnr.providers.EefnrMessages;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.SingleCompositionEditor;

import org.eclipse.emf.eef.runtime.ui.widgets.SingleCompositionEditor.SingleCompositionListener;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.swt.SWT;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Composite;

import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class SingleCompositionEditorSamplePropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, SingleCompositionEditorSamplePropertiesEditionPart {

	protected SingleCompositionEditor singlecompositionviewerRequiredProperty;
	protected SingleCompositionEditor singlecompositionviewerOptionalProperty;
	protected SingleCompositionEditor singlecompositionviewerROProperty;
	protected SingleCompositionEditor singlecompositionviewerOnAbstractOptionalProperty;



	/**
	 * For {@link ISection} use only.
	 */
	public SingleCompositionEditorSamplePropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public SingleCompositionEditorSamplePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createFigure(org.eclipse.swt.widgets.Composite, org.eclipse.ui.forms.widgets.FormToolkit)
	 * 
	 */
	public Composite createFigure(final Composite parent, final FormToolkit widgetFactory) {
		ScrolledForm scrolledForm = widgetFactory.createScrolledForm(parent);
		Form form = scrolledForm.getForm();
		view = form.getBody();
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(widgetFactory, view);
		return scrolledForm;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createControls(org.eclipse.ui.forms.widgets.FormToolkit, org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(final FormToolkit widgetFactory, Composite view) {
		CompositionSequence singleCompositionEditorSampleStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = singleCompositionEditorSampleStep.addStep(EefnrViewsRepository.SingleCompositionEditorSample.Properties.class);
		propertiesStep.addStep(EefnrViewsRepository.SingleCompositionEditorSample.Properties.singlecompositionviewerRequiredProperty);
		propertiesStep.addStep(EefnrViewsRepository.SingleCompositionEditorSample.Properties.singlecompositionviewerOptionalProperty);
		propertiesStep.addStep(EefnrViewsRepository.SingleCompositionEditorSample.Properties.singlecompositionviewerROProperty);
		propertiesStep.addStep(EefnrViewsRepository.SingleCompositionEditorSample.Properties.singlecompositionviewerOnAbstractOptionalProperty);
		
		
		composer = new PartComposer(singleCompositionEditorSampleStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EefnrViewsRepository.SingleCompositionEditorSample.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == EefnrViewsRepository.SingleCompositionEditorSample.Properties.singlecompositionviewerRequiredProperty) {
					return createSinglecompositionviewerRequiredPropertySingleCompositionEditor(parent, widgetFactory);
				}
				if (key == EefnrViewsRepository.SingleCompositionEditorSample.Properties.singlecompositionviewerOptionalProperty) {
					return createSinglecompositionviewerOptionalPropertySingleCompositionEditor(parent, widgetFactory);
				}
				if (key == EefnrViewsRepository.SingleCompositionEditorSample.Properties.singlecompositionviewerROProperty) {
					return createSinglecompositionviewerROPropertySingleCompositionEditor(parent, widgetFactory);
				}
				if (key == EefnrViewsRepository.SingleCompositionEditorSample.Properties.singlecompositionviewerOnAbstractOptionalProperty) {
					return createSinglecompositionviewerOnAbstractOptionalPropertySingleCompositionEditor(parent, widgetFactory);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	/**
	 * 
	 */
	protected Composite createPropertiesGroup(FormToolkit widgetFactory, final Composite parent) {
		Section propertiesSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		propertiesSection.setText(EefnrMessages.SingleCompositionEditorSamplePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesSectionData.horizontalSpan = 3;
		propertiesSection.setLayoutData(propertiesSectionData);
		Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		propertiesSection.setClient(propertiesGroup);
		return propertiesGroup;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createSinglecompositionviewerRequiredPropertySingleCompositionEditor(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, EefnrViewsRepository.SingleCompositionEditorSample.Properties.singlecompositionviewerRequiredProperty, EefnrMessages.SingleCompositionEditorSamplePropertiesEditionPart_SinglecompositionviewerRequiredPropertyLabel);
		//create widget
		singlecompositionviewerRequiredProperty = new SingleCompositionEditor(widgetFactory, parent, SWT.NONE);
		GridData singlecompositionviewerRequiredPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		singlecompositionviewerRequiredProperty.setLayoutData(singlecompositionviewerRequiredPropertyData);
		singlecompositionviewerRequiredProperty.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SingleCompositionEditorSamplePropertiesEditionPartForm.this,  EefnrViewsRepository.SingleCompositionEditorSample.Properties.singlecompositionviewerRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				singlecompositionviewerRequiredProperty.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SingleCompositionEditorSamplePropertiesEditionPartForm.this,  EefnrViewsRepository.SingleCompositionEditorSample.Properties.singlecompositionviewerRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				singlecompositionviewerRequiredProperty.refresh();
			}
		});
		singlecompositionviewerRequiredProperty.setID(EefnrViewsRepository.SingleCompositionEditorSample.Properties.singlecompositionviewerRequiredProperty);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EefnrViewsRepository.SingleCompositionEditorSample.Properties.singlecompositionviewerRequiredProperty, EefnrViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createSinglecompositionviewerRequiredPropertySingleCompositionEditor

		// End of user code
		return parent;
	}


	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createSinglecompositionviewerOptionalPropertySingleCompositionEditor(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, EefnrViewsRepository.SingleCompositionEditorSample.Properties.singlecompositionviewerOptionalProperty, EefnrMessages.SingleCompositionEditorSamplePropertiesEditionPart_SinglecompositionviewerOptionalPropertyLabel);
		//create widget
		singlecompositionviewerOptionalProperty = new SingleCompositionEditor(widgetFactory, parent, SWT.NONE);
		GridData singlecompositionviewerOptionalPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		singlecompositionviewerOptionalProperty.setLayoutData(singlecompositionviewerOptionalPropertyData);
		singlecompositionviewerOptionalProperty.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SingleCompositionEditorSamplePropertiesEditionPartForm.this,  EefnrViewsRepository.SingleCompositionEditorSample.Properties.singlecompositionviewerOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				singlecompositionviewerOptionalProperty.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SingleCompositionEditorSamplePropertiesEditionPartForm.this,  EefnrViewsRepository.SingleCompositionEditorSample.Properties.singlecompositionviewerOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				singlecompositionviewerOptionalProperty.refresh();
			}
		});
		singlecompositionviewerOptionalProperty.setID(EefnrViewsRepository.SingleCompositionEditorSample.Properties.singlecompositionviewerOptionalProperty);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EefnrViewsRepository.SingleCompositionEditorSample.Properties.singlecompositionviewerOptionalProperty, EefnrViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createSinglecompositionviewerOptionalPropertySingleCompositionEditor

		// End of user code
		return parent;
	}


	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createSinglecompositionviewerROPropertySingleCompositionEditor(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, EefnrViewsRepository.SingleCompositionEditorSample.Properties.singlecompositionviewerROProperty, EefnrMessages.SingleCompositionEditorSamplePropertiesEditionPart_SinglecompositionviewerROPropertyLabel);
		//create widget
		singlecompositionviewerROProperty = new SingleCompositionEditor(widgetFactory, parent, SWT.NONE);
		GridData singlecompositionviewerROPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		singlecompositionviewerROProperty.setLayoutData(singlecompositionviewerROPropertyData);
		singlecompositionviewerROProperty.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SingleCompositionEditorSamplePropertiesEditionPartForm.this,  EefnrViewsRepository.SingleCompositionEditorSample.Properties.singlecompositionviewerROProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				singlecompositionviewerROProperty.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SingleCompositionEditorSamplePropertiesEditionPartForm.this,  EefnrViewsRepository.SingleCompositionEditorSample.Properties.singlecompositionviewerROProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				singlecompositionviewerROProperty.refresh();
			}
		});
		singlecompositionviewerROProperty.setID(EefnrViewsRepository.SingleCompositionEditorSample.Properties.singlecompositionviewerROProperty);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EefnrViewsRepository.SingleCompositionEditorSample.Properties.singlecompositionviewerROProperty, EefnrViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createSinglecompositionviewerROPropertySingleCompositionEditor

		// End of user code
		return parent;
	}


	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createSinglecompositionviewerOnAbstractOptionalPropertySingleCompositionEditor(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, EefnrViewsRepository.SingleCompositionEditorSample.Properties.singlecompositionviewerOnAbstractOptionalProperty, EefnrMessages.SingleCompositionEditorSamplePropertiesEditionPart_SinglecompositionviewerOnAbstractOptionalPropertyLabel);
		//create widget
		singlecompositionviewerOnAbstractOptionalProperty = new SingleCompositionEditor(widgetFactory, parent, SWT.NONE);
		GridData singlecompositionviewerOnAbstractOptionalPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		singlecompositionviewerOnAbstractOptionalProperty.setLayoutData(singlecompositionviewerOnAbstractOptionalPropertyData);
		singlecompositionviewerOnAbstractOptionalProperty.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SingleCompositionEditorSamplePropertiesEditionPartForm.this,  EefnrViewsRepository.SingleCompositionEditorSample.Properties.singlecompositionviewerOnAbstractOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				singlecompositionviewerOnAbstractOptionalProperty.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SingleCompositionEditorSamplePropertiesEditionPartForm.this,  EefnrViewsRepository.SingleCompositionEditorSample.Properties.singlecompositionviewerOnAbstractOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				singlecompositionviewerOnAbstractOptionalProperty.refresh();
			}
		});
		singlecompositionviewerOnAbstractOptionalProperty.setID(EefnrViewsRepository.SingleCompositionEditorSample.Properties.singlecompositionviewerOnAbstractOptionalProperty);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EefnrViewsRepository.SingleCompositionEditorSample.Properties.singlecompositionviewerOnAbstractOptionalProperty, EefnrViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createSinglecompositionviewerOnAbstractOptionalPropertySingleCompositionEditor

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
	 * @see org.eclipse.emf.eef.eefnr.parts.SingleCompositionEditorSamplePropertiesEditionPart#getSinglecompositionviewerRequiredProperty()
	 * 
	 */
	public EObject getSinglecompositionviewerRequiredProperty() {
		return (EObject) singlecompositionviewerRequiredProperty.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.SingleCompositionEditorSamplePropertiesEditionPart#initSinglecompositionviewerRequiredProperty(EObjectFlatComboSettings)
	 */
	public void initSinglecompositionviewerRequiredProperty(EObjectFlatComboSettings settings) {
		singlecompositionviewerRequiredProperty.setAdapterFactory(adapterFactory);
		singlecompositionviewerRequiredProperty.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(EefnrViewsRepository.SingleCompositionEditorSample.Properties.singlecompositionviewerRequiredProperty);
		if (eefElementEditorReadOnlyState && singlecompositionviewerRequiredProperty.isEnabled()) {
			singlecompositionviewerRequiredProperty.setEnabled(false);
			singlecompositionviewerRequiredProperty.setToolTipText(EefnrMessages.SingleCompositionEditorSample_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !singlecompositionviewerRequiredProperty.isEnabled()) {
			singlecompositionviewerRequiredProperty.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.SingleCompositionEditorSamplePropertiesEditionPart#setSinglecompositionviewerRequiredProperty(EObject newValue)
	 * 
	 */
	public void setSinglecompositionviewerRequiredProperty(EObject newValue) {
		singlecompositionviewerRequiredProperty.refresh();
		boolean eefElementEditorReadOnlyState = isReadOnly(EefnrViewsRepository.SingleCompositionEditorSample.Properties.singlecompositionviewerRequiredProperty);
		if (eefElementEditorReadOnlyState && singlecompositionviewerRequiredProperty.isEnabled()) {
			singlecompositionviewerRequiredProperty.setEnabled(false);
			singlecompositionviewerRequiredProperty.setToolTipText(EefnrMessages.SingleCompositionEditorSample_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !singlecompositionviewerRequiredProperty.isEnabled()) {
			singlecompositionviewerRequiredProperty.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.SingleCompositionEditorSamplePropertiesEditionPart#getSinglecompositionviewerOptionalProperty()
	 * 
	 */
	public EObject getSinglecompositionviewerOptionalProperty() {
		return (EObject) singlecompositionviewerOptionalProperty.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.SingleCompositionEditorSamplePropertiesEditionPart#initSinglecompositionviewerOptionalProperty(EObjectFlatComboSettings)
	 */
	public void initSinglecompositionviewerOptionalProperty(EObjectFlatComboSettings settings) {
		singlecompositionviewerOptionalProperty.setAdapterFactory(adapterFactory);
		singlecompositionviewerOptionalProperty.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(EefnrViewsRepository.SingleCompositionEditorSample.Properties.singlecompositionviewerOptionalProperty);
		if (eefElementEditorReadOnlyState && singlecompositionviewerOptionalProperty.isEnabled()) {
			singlecompositionviewerOptionalProperty.setEnabled(false);
			singlecompositionviewerOptionalProperty.setToolTipText(EefnrMessages.SingleCompositionEditorSample_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !singlecompositionviewerOptionalProperty.isEnabled()) {
			singlecompositionviewerOptionalProperty.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.SingleCompositionEditorSamplePropertiesEditionPart#setSinglecompositionviewerOptionalProperty(EObject newValue)
	 * 
	 */
	public void setSinglecompositionviewerOptionalProperty(EObject newValue) {
		singlecompositionviewerOptionalProperty.refresh();
		boolean eefElementEditorReadOnlyState = isReadOnly(EefnrViewsRepository.SingleCompositionEditorSample.Properties.singlecompositionviewerOptionalProperty);
		if (eefElementEditorReadOnlyState && singlecompositionviewerOptionalProperty.isEnabled()) {
			singlecompositionviewerOptionalProperty.setEnabled(false);
			singlecompositionviewerOptionalProperty.setToolTipText(EefnrMessages.SingleCompositionEditorSample_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !singlecompositionviewerOptionalProperty.isEnabled()) {
			singlecompositionviewerOptionalProperty.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.SingleCompositionEditorSamplePropertiesEditionPart#getSinglecompositionviewerROProperty()
	 * 
	 */
	public EObject getSinglecompositionviewerROProperty() {
		return (EObject) singlecompositionviewerROProperty.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.SingleCompositionEditorSamplePropertiesEditionPart#initSinglecompositionviewerROProperty(EObjectFlatComboSettings)
	 */
	public void initSinglecompositionviewerROProperty(EObjectFlatComboSettings settings) {
		singlecompositionviewerROProperty.setAdapterFactory(adapterFactory);
		singlecompositionviewerROProperty.setInput(settings);
		singlecompositionviewerROProperty.setEnabled(false);
		singlecompositionviewerROProperty.setToolTipText(EefnrMessages.SingleCompositionEditorSample_ReadOnly);
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.SingleCompositionEditorSamplePropertiesEditionPart#setSinglecompositionviewerROProperty(EObject newValue)
	 * 
	 */
	public void setSinglecompositionviewerROProperty(EObject newValue) {
		singlecompositionviewerROProperty.refresh();
		singlecompositionviewerROProperty.setEnabled(false);
		singlecompositionviewerROProperty.setToolTipText(EefnrMessages.SingleCompositionEditorSample_ReadOnly);
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.SingleCompositionEditorSamplePropertiesEditionPart#getSinglecompositionviewerOnAbstractOptionalProperty()
	 * 
	 */
	public EObject getSinglecompositionviewerOnAbstractOptionalProperty() {
		return (EObject) singlecompositionviewerOnAbstractOptionalProperty.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.SingleCompositionEditorSamplePropertiesEditionPart#initSinglecompositionviewerOnAbstractOptionalProperty(EObjectFlatComboSettings)
	 */
	public void initSinglecompositionviewerOnAbstractOptionalProperty(EObjectFlatComboSettings settings) {
		singlecompositionviewerOnAbstractOptionalProperty.setAdapterFactory(adapterFactory);
		singlecompositionviewerOnAbstractOptionalProperty.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(EefnrViewsRepository.SingleCompositionEditorSample.Properties.singlecompositionviewerOnAbstractOptionalProperty);
		if (eefElementEditorReadOnlyState && singlecompositionviewerOnAbstractOptionalProperty.isEnabled()) {
			singlecompositionviewerOnAbstractOptionalProperty.setEnabled(false);
			singlecompositionviewerOnAbstractOptionalProperty.setToolTipText(EefnrMessages.SingleCompositionEditorSample_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !singlecompositionviewerOnAbstractOptionalProperty.isEnabled()) {
			singlecompositionviewerOnAbstractOptionalProperty.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.SingleCompositionEditorSamplePropertiesEditionPart#setSinglecompositionviewerOnAbstractOptionalProperty(EObject newValue)
	 * 
	 */
	public void setSinglecompositionviewerOnAbstractOptionalProperty(EObject newValue) {
		singlecompositionviewerOnAbstractOptionalProperty.refresh();
		boolean eefElementEditorReadOnlyState = isReadOnly(EefnrViewsRepository.SingleCompositionEditorSample.Properties.singlecompositionviewerOnAbstractOptionalProperty);
		if (eefElementEditorReadOnlyState && singlecompositionviewerOnAbstractOptionalProperty.isEnabled()) {
			singlecompositionviewerOnAbstractOptionalProperty.setEnabled(false);
			singlecompositionviewerOnAbstractOptionalProperty.setToolTipText(EefnrMessages.SingleCompositionEditorSample_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !singlecompositionviewerOnAbstractOptionalProperty.isEnabled()) {
			singlecompositionviewerOnAbstractOptionalProperty.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EefnrMessages.SingleCompositionEditorSample_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
