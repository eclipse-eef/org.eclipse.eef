/*******************************************************************************
 * Copyright (c) 2009 - 2010 Obeo.
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
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.eef.eefnr.parts.EefnrViewsRepository;
import org.eclipse.emf.eef.eefnr.parts.RootPropertiesEditionPart;
import org.eclipse.emf.eef.eefnr.providers.EefnrMessages;
import org.eclipse.emf.eef.runtime.components.PropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.notify.PropertiesEditingEvent;
import org.eclipse.emf.eef.runtime.notify.impl.PropertiesEditingEventImpl;
import org.eclipse.emf.eef.runtime.parts.SWTPropertiesEditingPart;
import org.eclipse.emf.eef.runtime.parts.impl.CompositePropertiesEditingPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;



// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class RootPropertiesEditionPartImpl extends CompositePropertiesEditingPart implements SWTPropertiesEditingPart, RootPropertiesEditionPart {

protected ReferencesTable samples;
protected List<ViewerFilter> samplesBusinessFilters = new ArrayList<ViewerFilter>();
protected List<ViewerFilter> samplesFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link PropertiesEditingComponent} that manage this part
	 * 
	 */
	public RootPropertiesEditionPartImpl(PropertiesEditingComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.parts.SWTPropertiesEditingPart#
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
	 * @see org.eclipse.emf.eef.runtime.parts.SWTPropertiesEditingPart#
	 * 			createControls(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(Composite view) { 
		CompositionSequence rootStep = new CompositionSequence();
		rootStep
			.addStep(EefnrViewsRepository.Root.Properties.class)
			.addStep(EefnrViewsRepository.Root.Properties.samples);
		
		
		composer = new PartComposer(rootStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EefnrViewsRepository.Root.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == EefnrViewsRepository.Root.Properties.samples) {
					return createSamplesAdvancedTableComposition(parent);
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
		propertiesGroup.setText(EefnrMessages.RootPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createSamplesAdvancedTableComposition(Composite parent) {
		this.samples = new ReferencesTable(EefnrMessages.RootPropertiesEditionPart_SamplesLabel, new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(RootPropertiesEditionPartImpl.this, EefnrViewsRepository.Root.Properties.samples, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.ADD, null, null));
				samples.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(RootPropertiesEditionPartImpl.this, EefnrViewsRepository.Root.Properties.samples, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.EDIT, null, element));
				samples.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(RootPropertiesEditionPartImpl.this, EefnrViewsRepository.Root.Properties.samples, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.MOVE, element, newIndex));
				samples.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(RootPropertiesEditionPartImpl.this, EefnrViewsRepository.Root.Properties.samples, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.REMOVE, null, element));
				samples.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.samplesFilters) {
			this.samples.addFilter(filter);
		}
		this.samples.setHelpText(propertiesEditingComponent.getHelpContent(EefnrViewsRepository.Root.Properties.samples, EefnrViewsRepository.SWT_KIND));
		this.samples.createControls(parent);
		this.samples.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(RootPropertiesEditionPartImpl.this, EefnrViewsRepository.Root.Properties.samples, PropertiesEditingEventImpl.CHANGE, PropertiesEditingEventImpl.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData samplesData = new GridData(GridData.FILL_HORIZONTAL);
		samplesData.horizontalSpan = 3;
		this.samples.setLayoutData(samplesData);
		this.samples.setLowerBound(0);
		this.samples.setUpperBound(-1);
		samples.setID(EefnrViewsRepository.Root.Properties.samples);
		samples.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.notify.PropertiesEditingListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.notify.PropertiesEditingEvent)
	 * 
	 */
	public void firePropertiesChanged(PropertiesEditingEvent event) {
		// Start of user code for tab synchronization

// End of user code
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.RootPropertiesEditionPart#initSamples(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initSamples(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		samples.setContentProvider(contentProvider);
		samples.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.RootPropertiesEditionPart#updateSamples()
	 * 
	 */
	public void updateSamples() {
	samples.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.RootPropertiesEditionPart#addFilterSamples(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSamples(ViewerFilter filter) {
		samplesFilters.add(filter);
		if (this.samples != null) {
			this.samples.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.RootPropertiesEditionPart#addBusinessFilterSamples(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSamples(ViewerFilter filter) {
		samplesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.RootPropertiesEditionPart#isContainedInSamplesTable(EObject element)
	 * 
	 */
	public boolean isContainedInSamplesTable(EObject element) {
		return ((ReferencesTableSettings)samples.getInput()).contains(element);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.parts.PropertiesEditingPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EefnrMessages.Root_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
