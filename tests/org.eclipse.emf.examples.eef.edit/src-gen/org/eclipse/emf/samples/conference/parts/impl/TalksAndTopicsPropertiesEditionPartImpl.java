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
package org.eclipse.emf.samples.conference.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.emf.samples.conference.parts.ConferenceViewsRepository;
import org.eclipse.emf.samples.conference.parts.TalksAndTopicsPropertiesEditionPart;

import org.eclipse.emf.samples.conference.providers.ConferenceMessages;

import org.eclipse.jface.viewers.ViewerFilter;

import org.eclipse.swt.SWT;

import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Composite;

// End of user code

/**
 * @author <a href="mailto:stephane.bouchet@obeo.fr">Stephane Bouchet</a>
 * 
 */
public class TalksAndTopicsPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, TalksAndTopicsPropertiesEditionPart {

	protected ReferencesTable talks;
	protected List<ViewerFilter> talksBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> talksFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable topics;
	protected List<ViewerFilter> topicsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> topicsFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public TalksAndTopicsPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence talksAndTopicsStep = new BindingCompositionSequence(propertiesEditionComponent);
		talksAndTopicsStep.addStep(ConferenceViewsRepository.TalksAndTopics.talks);
		talksAndTopicsStep.addStep(ConferenceViewsRepository.TalksAndTopics.topics);
		
		composer = new PartComposer(talksAndTopicsStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ConferenceViewsRepository.TalksAndTopics.talks) {
					return createTalksAdvancedTableComposition(parent);
				}
				if (key == ConferenceViewsRepository.TalksAndTopics.topics) {
					return createTopicsAdvancedTableComposition(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createTalksAdvancedTableComposition(Composite parent) {
		this.talks = new ReferencesTable(getDescription(ConferenceViewsRepository.TalksAndTopics.talks, ConferenceMessages.TalksAndTopicsPropertiesEditionPart_TalksLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TalksAndTopicsPropertiesEditionPartImpl.this, ConferenceViewsRepository.TalksAndTopics.talks, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				talks.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TalksAndTopicsPropertiesEditionPartImpl.this, ConferenceViewsRepository.TalksAndTopics.talks, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				talks.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TalksAndTopicsPropertiesEditionPartImpl.this, ConferenceViewsRepository.TalksAndTopics.talks, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				talks.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TalksAndTopicsPropertiesEditionPartImpl.this, ConferenceViewsRepository.TalksAndTopics.talks, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				talks.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.talksFilters) {
			this.talks.addFilter(filter);
		}
		this.talks.setHelpText(propertiesEditionComponent.getHelpContent(ConferenceViewsRepository.TalksAndTopics.talks, ConferenceViewsRepository.SWT_KIND));
		this.talks.createControls(parent);
		this.talks.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TalksAndTopicsPropertiesEditionPartImpl.this, ConferenceViewsRepository.TalksAndTopics.talks, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData talksData = new GridData(GridData.FILL_HORIZONTAL);
		talksData.horizontalSpan = 3;
		this.talks.setLayoutData(talksData);
		this.talks.setLowerBound(0);
		this.talks.setUpperBound(-1);
		talks.setID(ConferenceViewsRepository.TalksAndTopics.talks);
		talks.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createTalksAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createTopicsAdvancedTableComposition(Composite parent) {
		this.topics = new ReferencesTable(getDescription(ConferenceViewsRepository.TalksAndTopics.topics, ConferenceMessages.TalksAndTopicsPropertiesEditionPart_TopicsLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TalksAndTopicsPropertiesEditionPartImpl.this, ConferenceViewsRepository.TalksAndTopics.topics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				topics.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TalksAndTopicsPropertiesEditionPartImpl.this, ConferenceViewsRepository.TalksAndTopics.topics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				topics.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TalksAndTopicsPropertiesEditionPartImpl.this, ConferenceViewsRepository.TalksAndTopics.topics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				topics.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TalksAndTopicsPropertiesEditionPartImpl.this, ConferenceViewsRepository.TalksAndTopics.topics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				topics.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.topicsFilters) {
			this.topics.addFilter(filter);
		}
		this.topics.setHelpText(propertiesEditionComponent.getHelpContent(ConferenceViewsRepository.TalksAndTopics.topics, ConferenceViewsRepository.SWT_KIND));
		this.topics.createControls(parent);
		this.topics.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TalksAndTopicsPropertiesEditionPartImpl.this, ConferenceViewsRepository.TalksAndTopics.topics, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData topicsData = new GridData(GridData.FILL_HORIZONTAL);
		topicsData.horizontalSpan = 3;
		this.topics.setLayoutData(topicsData);
		this.topics.setLowerBound(0);
		this.topics.setUpperBound(-1);
		topics.setID(ConferenceViewsRepository.TalksAndTopics.topics);
		topics.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createTopicsAdvancedTableComposition

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
	 * @see org.eclipse.emf.samples.conference.parts.TalksAndTopicsPropertiesEditionPart#initTalks(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initTalks(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		talks.setContentProvider(contentProvider);
		talks.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(ConferenceViewsRepository.TalksAndTopics.talks);
		if (eefElementEditorReadOnlyState && talks.isEnabled()) {
			talks.setEnabled(false);
			talks.setToolTipText(ConferenceMessages.TalksAndTopics_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !talks.isEnabled()) {
			talks.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.TalksAndTopicsPropertiesEditionPart#updateTalks()
	 * 
	 */
	public void updateTalks() {
	talks.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.TalksAndTopicsPropertiesEditionPart#addFilterTalks(ViewerFilter filter)
	 * 
	 */
	public void addFilterToTalks(ViewerFilter filter) {
		talksFilters.add(filter);
		if (this.talks != null) {
			this.talks.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.TalksAndTopicsPropertiesEditionPart#addBusinessFilterTalks(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToTalks(ViewerFilter filter) {
		talksBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.TalksAndTopicsPropertiesEditionPart#isContainedInTalksTable(EObject element)
	 * 
	 */
	public boolean isContainedInTalksTable(EObject element) {
		return ((ReferencesTableSettings)talks.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.TalksAndTopicsPropertiesEditionPart#initTopics(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initTopics(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		topics.setContentProvider(contentProvider);
		topics.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(ConferenceViewsRepository.TalksAndTopics.topics);
		if (eefElementEditorReadOnlyState && topics.isEnabled()) {
			topics.setEnabled(false);
			topics.setToolTipText(ConferenceMessages.TalksAndTopics_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !topics.isEnabled()) {
			topics.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.TalksAndTopicsPropertiesEditionPart#updateTopics()
	 * 
	 */
	public void updateTopics() {
	topics.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.TalksAndTopicsPropertiesEditionPart#addFilterTopics(ViewerFilter filter)
	 * 
	 */
	public void addFilterToTopics(ViewerFilter filter) {
		topicsFilters.add(filter);
		if (this.topics != null) {
			this.topics.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.TalksAndTopicsPropertiesEditionPart#addBusinessFilterTopics(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToTopics(ViewerFilter filter) {
		topicsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.TalksAndTopicsPropertiesEditionPart#isContainedInTopicsTable(EObject element)
	 * 
	 */
	public boolean isContainedInTopicsTable(EObject element) {
		return ((ReferencesTableSettings)topics.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ConferenceMessages.TalksAndTopics_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
