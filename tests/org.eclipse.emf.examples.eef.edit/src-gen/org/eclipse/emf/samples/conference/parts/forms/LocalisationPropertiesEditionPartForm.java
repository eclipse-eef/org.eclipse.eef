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
package org.eclipse.emf.samples.conference.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.emf.samples.conference.parts.ConferenceViewsRepository;
import org.eclipse.emf.samples.conference.parts.LocalisationPropertiesEditionPart;

import org.eclipse.emf.samples.conference.providers.ConferenceMessages;

import org.eclipse.jface.viewers.ViewerFilter;

import org.eclipse.swt.SWT;

import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;

// End of user code

/**
 * @author <a href="mailto:stephane.bouchet@obeo.fr">Stephane Bouchet</a>
 * 
 */
public class LocalisationPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, LocalisationPropertiesEditionPart {

	protected Text place;
	protected ReferencesTable sites;
	protected List<ViewerFilter> sitesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> sitesFilters = new ArrayList<ViewerFilter>();



	/**
	 * For {@link ISection} use only.
	 */
	public LocalisationPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public LocalisationPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence localisationStep = new BindingCompositionSequence(propertiesEditionComponent);
		localisationStep.addStep(ConferenceViewsRepository.Localisation.place);
		localisationStep.addStep(ConferenceViewsRepository.Localisation.sites);
		
		composer = new PartComposer(localisationStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ConferenceViewsRepository.Localisation.place) {
					return createPlaceText(widgetFactory, parent);
				}
				if (key == ConferenceViewsRepository.Localisation.sites) {
					return createSitesTableComposition(widgetFactory, parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	
	protected Composite createPlaceText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, ConferenceViewsRepository.Localisation.place, ConferenceMessages.LocalisationPropertiesEditionPart_PlaceLabel);
		place = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		place.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData placeData = new GridData(GridData.FILL_HORIZONTAL);
		place.setLayoutData(placeData);
		place.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							LocalisationPropertiesEditionPartForm.this,
							ConferenceViewsRepository.Localisation.place,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, place.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									LocalisationPropertiesEditionPartForm.this,
									ConferenceViewsRepository.Localisation.place,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, place.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									LocalisationPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		place.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LocalisationPropertiesEditionPartForm.this, ConferenceViewsRepository.Localisation.place, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, place.getText()));
				}
			}
		});
		EditingUtils.setID(place, ConferenceViewsRepository.Localisation.place);
		EditingUtils.setEEFtype(place, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ConferenceViewsRepository.Localisation.place, ConferenceViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createPlaceText

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createSitesTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.sites = new ReferencesTable(getDescription(ConferenceViewsRepository.Localisation.sites, ConferenceMessages.LocalisationPropertiesEditionPart_SitesLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LocalisationPropertiesEditionPartForm.this, ConferenceViewsRepository.Localisation.sites, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				sites.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LocalisationPropertiesEditionPartForm.this, ConferenceViewsRepository.Localisation.sites, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				sites.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LocalisationPropertiesEditionPartForm.this, ConferenceViewsRepository.Localisation.sites, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				sites.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LocalisationPropertiesEditionPartForm.this, ConferenceViewsRepository.Localisation.sites, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				sites.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.sitesFilters) {
			this.sites.addFilter(filter);
		}
		this.sites.setHelpText(propertiesEditionComponent.getHelpContent(ConferenceViewsRepository.Localisation.sites, ConferenceViewsRepository.FORM_KIND));
		this.sites.createControls(parent, widgetFactory);
		this.sites.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LocalisationPropertiesEditionPartForm.this, ConferenceViewsRepository.Localisation.sites, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData sitesData = new GridData(GridData.FILL_HORIZONTAL);
		sitesData.horizontalSpan = 3;
		this.sites.setLayoutData(sitesData);
		this.sites.setLowerBound(0);
		this.sites.setUpperBound(-1);
		sites.setID(ConferenceViewsRepository.Localisation.sites);
		sites.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createSitesTableComposition

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
	 * @see org.eclipse.emf.samples.conference.parts.LocalisationPropertiesEditionPart#getPlace()
	 * 
	 */
	public String getPlace() {
		return place.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.LocalisationPropertiesEditionPart#setPlace(String newValue)
	 * 
	 */
	public void setPlace(String newValue) {
		if (newValue != null) {
			place.setText(newValue);
		} else {
			place.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(ConferenceViewsRepository.Localisation.place);
		if (eefElementEditorReadOnlyState && place.isEnabled()) {
			place.setEnabled(false);
			place.setToolTipText(ConferenceMessages.Localisation_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !place.isEnabled()) {
			place.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.LocalisationPropertiesEditionPart#initSites(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initSites(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		sites.setContentProvider(contentProvider);
		sites.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(ConferenceViewsRepository.Localisation.sites);
		if (eefElementEditorReadOnlyState && sites.isEnabled()) {
			sites.setEnabled(false);
			sites.setToolTipText(ConferenceMessages.Localisation_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !sites.isEnabled()) {
			sites.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.LocalisationPropertiesEditionPart#updateSites()
	 * 
	 */
	public void updateSites() {
	sites.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.LocalisationPropertiesEditionPart#addFilterSites(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSites(ViewerFilter filter) {
		sitesFilters.add(filter);
		if (this.sites != null) {
			this.sites.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.LocalisationPropertiesEditionPart#addBusinessFilterSites(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSites(ViewerFilter filter) {
		sitesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.LocalisationPropertiesEditionPart#isContainedInSitesTable(EObject element)
	 * 
	 */
	public boolean isContainedInSitesTable(EObject element) {
		return ((ReferencesTableSettings)sites.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ConferenceMessages.Localisation_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
