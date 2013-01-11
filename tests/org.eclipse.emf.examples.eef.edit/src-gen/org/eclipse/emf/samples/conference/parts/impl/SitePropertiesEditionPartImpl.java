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
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.emf.samples.conference.parts.ConferenceViewsRepository;
import org.eclipse.emf.samples.conference.parts.SitePropertiesEditionPart;

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
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

// End of user code

/**
 * @author <a href="mailto:stephane.bouchet@obeo.fr">Stephane Bouchet</a>
 * 
 */
public class SitePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, SitePropertiesEditionPart {

	protected Text name;
	protected Text documentation;
	protected ReferencesTable rooms;
	protected List<ViewerFilter> roomsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> roomsFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public SitePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence siteStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = siteStep.addStep(ConferenceViewsRepository.Site.Properties.class);
		propertiesStep.addStep(ConferenceViewsRepository.Site.Properties.name);
		propertiesStep.addStep(ConferenceViewsRepository.Site.Properties.documentation);
		propertiesStep.addStep(ConferenceViewsRepository.Site.Properties.rooms);
		
		
		composer = new PartComposer(siteStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ConferenceViewsRepository.Site.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == ConferenceViewsRepository.Site.Properties.name) {
					return createNameText(parent);
				}
				if (key == ConferenceViewsRepository.Site.Properties.documentation) {
					return createDocumentationTextarea(parent);
				}
				if (key == ConferenceViewsRepository.Site.Properties.rooms) {
					return createRoomsAdvancedTableComposition(parent);
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
		propertiesGroup.setText(ConferenceMessages.SitePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, ConferenceViewsRepository.Site.Properties.name, ConferenceMessages.SitePropertiesEditionPart_NameLabel);
		name = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SitePropertiesEditionPartImpl.this, ConferenceViewsRepository.Site.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
			}

		});
		name.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SitePropertiesEditionPartImpl.this, ConferenceViewsRepository.Site.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, ConferenceViewsRepository.Site.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ConferenceViewsRepository.Site.Properties.name, ConferenceViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	
	protected Composite createDocumentationTextarea(Composite parent) {
		Label documentationLabel = createDescription(parent, ConferenceViewsRepository.Site.Properties.documentation, ConferenceMessages.SitePropertiesEditionPart_DocumentationLabel);
		GridData documentationLabelData = new GridData(GridData.FILL_HORIZONTAL);
		documentationLabelData.horizontalSpan = 3;
		documentationLabel.setLayoutData(documentationLabelData);
		documentation = SWTUtils.createScrollableText(parent, SWT.BORDER | SWT.WRAP | SWT.MULTI | SWT.V_SCROLL);
		GridData documentationData = new GridData(GridData.FILL_HORIZONTAL);
		documentationData.horizontalSpan = 2;
		documentationData.heightHint = 80;
		documentationData.widthHint = 200;
		documentation.setLayoutData(documentationData);
		documentation.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SitePropertiesEditionPartImpl.this, ConferenceViewsRepository.Site.Properties.documentation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, documentation.getText()));
			}

		});
		EditingUtils.setID(documentation, ConferenceViewsRepository.Site.Properties.documentation);
		EditingUtils.setEEFtype(documentation, "eef::Textarea"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ConferenceViewsRepository.Site.Properties.documentation, ConferenceViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createDocumentationTextArea

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createRoomsAdvancedTableComposition(Composite parent) {
		this.rooms = new ReferencesTable(getDescription(ConferenceViewsRepository.Site.Properties.rooms, ConferenceMessages.SitePropertiesEditionPart_RoomsLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SitePropertiesEditionPartImpl.this, ConferenceViewsRepository.Site.Properties.rooms, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				rooms.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SitePropertiesEditionPartImpl.this, ConferenceViewsRepository.Site.Properties.rooms, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				rooms.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SitePropertiesEditionPartImpl.this, ConferenceViewsRepository.Site.Properties.rooms, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				rooms.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SitePropertiesEditionPartImpl.this, ConferenceViewsRepository.Site.Properties.rooms, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				rooms.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.roomsFilters) {
			this.rooms.addFilter(filter);
		}
		this.rooms.setHelpText(propertiesEditionComponent.getHelpContent(ConferenceViewsRepository.Site.Properties.rooms, ConferenceViewsRepository.SWT_KIND));
		this.rooms.createControls(parent);
		this.rooms.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SitePropertiesEditionPartImpl.this, ConferenceViewsRepository.Site.Properties.rooms, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData roomsData = new GridData(GridData.FILL_HORIZONTAL);
		roomsData.horizontalSpan = 3;
		this.rooms.setLayoutData(roomsData);
		this.rooms.setLowerBound(0);
		this.rooms.setUpperBound(-1);
		rooms.setID(ConferenceViewsRepository.Site.Properties.rooms);
		rooms.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createRoomsAdvancedTableComposition

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
	 * @see org.eclipse.emf.samples.conference.parts.SitePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.SitePropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(ConferenceViewsRepository.Site.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(ConferenceMessages.Site_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.SitePropertiesEditionPart#getDocumentation()
	 * 
	 */
	public String getDocumentation() {
		return documentation.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.SitePropertiesEditionPart#setDocumentation(String newValue)
	 * 
	 */
	public void setDocumentation(String newValue) {
		if (newValue != null) {
			documentation.setText(newValue);
		} else {
			documentation.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(ConferenceViewsRepository.Site.Properties.documentation);
		if (eefElementEditorReadOnlyState && documentation.isEnabled()) {
			documentation.setEnabled(false);
			documentation.setBackground(documentation.getDisplay().getSystemColor(SWT.COLOR_WIDGET_BACKGROUND));
			documentation.setToolTipText(ConferenceMessages.Site_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !documentation.isEnabled()) {
			documentation.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.SitePropertiesEditionPart#initRooms(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initRooms(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		rooms.setContentProvider(contentProvider);
		rooms.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(ConferenceViewsRepository.Site.Properties.rooms);
		if (eefElementEditorReadOnlyState && rooms.isEnabled()) {
			rooms.setEnabled(false);
			rooms.setToolTipText(ConferenceMessages.Site_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !rooms.isEnabled()) {
			rooms.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.SitePropertiesEditionPart#updateRooms()
	 * 
	 */
	public void updateRooms() {
	rooms.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.SitePropertiesEditionPart#addFilterRooms(ViewerFilter filter)
	 * 
	 */
	public void addFilterToRooms(ViewerFilter filter) {
		roomsFilters.add(filter);
		if (this.rooms != null) {
			this.rooms.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.SitePropertiesEditionPart#addBusinessFilterRooms(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToRooms(ViewerFilter filter) {
		roomsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.samples.conference.parts.SitePropertiesEditionPart#isContainedInRoomsTable(EObject element)
	 * 
	 */
	public boolean isContainedInRoomsTable(EObject element) {
		return ((ReferencesTableSettings)rooms.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ConferenceMessages.Site_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
