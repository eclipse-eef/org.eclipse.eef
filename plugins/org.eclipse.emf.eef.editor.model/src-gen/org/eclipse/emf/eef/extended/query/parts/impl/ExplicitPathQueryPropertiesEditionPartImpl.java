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
package org.eclipse.emf.eef.extended.query.parts.impl;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.extended.query.parts.ExplicitPathQueryPropertiesEditionPart;
import org.eclipse.emf.eef.extended.query.parts.QueryViewsRepository;
import org.eclipse.emf.eef.extended.query.providers.QueryMessages;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;


// End of user code

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen LeFur</a>
 * 
 */
public class ExplicitPathQueryPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ExplicitPathQueryPropertiesEditionPart {

	protected EObjectFlatComboViewer query;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ExplicitPathQueryPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence explicitPathQueryStep = new BindingCompositionSequence(propertiesEditionComponent);
		explicitPathQueryStep
			.addStep(QueryViewsRepository.ExplicitPathQuery.Properties.class)
			.addStep(QueryViewsRepository.ExplicitPathQuery.Properties.query_);
		
		
		composer = new PartComposer(explicitPathQueryStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == QueryViewsRepository.ExplicitPathQuery.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == QueryViewsRepository.ExplicitPathQuery.Properties.query_) {
					return createQueryFlatComboViewer(parent);
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
		propertiesGroup.setText(QueryMessages.ExplicitPathQueryPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createQueryFlatComboViewer(Composite parent) {
		createDescription(parent, QueryViewsRepository.ExplicitPathQuery.Properties.query_, QueryMessages.ExplicitPathQueryPropertiesEditionPart_QueryLabel);
		query = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(QueryViewsRepository.ExplicitPathQuery.Properties.query_, QueryViewsRepository.SWT_KIND));
		query.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		query.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ExplicitPathQueryPropertiesEditionPartImpl.this, QueryViewsRepository.ExplicitPathQuery.Properties.query_, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getQuery()));
			}

		});
		GridData queryData = new GridData(GridData.FILL_HORIZONTAL);
		query.setLayoutData(queryData);
		query.setID(QueryViewsRepository.ExplicitPathQuery.Properties.query_);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(QueryViewsRepository.ExplicitPathQuery.Properties.query_, QueryViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createQueryFlatComboViewer

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
	 * @see org.eclipse.emf.eef.extended.query.parts.ExplicitPathQueryPropertiesEditionPart#getQuery()
	 * 
	 */
	public EObject getQuery() {
		if (query.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) query.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.extended.query.parts.ExplicitPathQueryPropertiesEditionPart#initQuery(EObjectFlatComboSettings)
	 */
	public void initQuery(EObjectFlatComboSettings settings) {
		query.setInput(settings);
		if (current != null) {
			query.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(QueryViewsRepository.ExplicitPathQuery.Properties.query_);
		if (eefElementEditorReadOnlyState && query.isEnabled()) {
			query.setEnabled(false);
			query.setToolTipText(QueryMessages.ExplicitPathQuery_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !query.isEnabled()) {
			query.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.extended.query.parts.ExplicitPathQueryPropertiesEditionPart#setQuery(EObject newValue)
	 * 
	 */
	public void setQuery(EObject newValue) {
		if (newValue != null) {
			query.setSelection(new StructuredSelection(newValue));
		} else {
			query.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(QueryViewsRepository.ExplicitPathQuery.Properties.query_);
		if (eefElementEditorReadOnlyState && query.isEnabled()) {
			query.setEnabled(false);
			query.setToolTipText(QueryMessages.ExplicitPathQuery_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !query.isEnabled()) {
			query.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.extended.query.parts.ExplicitPathQueryPropertiesEditionPart#setQueryButtonMode(ButtonsModeEnum newValue)
	 */
	public void setQueryButtonMode(ButtonsModeEnum newValue) {
		query.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.extended.query.parts.ExplicitPathQueryPropertiesEditionPart#addFilterQuery(ViewerFilter filter)
	 * 
	 */
	public void addFilterToQuery(ViewerFilter filter) {
		query.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.extended.query.parts.ExplicitPathQueryPropertiesEditionPart#addBusinessFilterQuery(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToQuery(ViewerFilter filter) {
		query.addBusinessRuleFilter(filter);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return QueryMessages.ExplicitPathQuery_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
