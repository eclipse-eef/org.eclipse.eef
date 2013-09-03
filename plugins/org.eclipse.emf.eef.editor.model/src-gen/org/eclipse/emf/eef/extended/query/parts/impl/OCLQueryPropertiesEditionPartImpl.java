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
import org.eclipse.emf.eef.extended.query.parts.OCLQueryPropertiesEditionPart;
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
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;


// End of user code

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen LeFur</a>
 * 
 */
public class OCLQueryPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, OCLQueryPropertiesEditionPart {

	protected EObjectFlatComboViewer context;
	protected Text query;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public OCLQueryPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence oCLQueryStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = oCLQueryStep.addStep(QueryViewsRepository.OCLQuery.Properties.class);
		propertiesStep.addStep(QueryViewsRepository.OCLQuery.Properties.context);
		propertiesStep.addStep(QueryViewsRepository.OCLQuery.Properties.query_);
		
		
		composer = new PartComposer(oCLQueryStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == QueryViewsRepository.OCLQuery.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == QueryViewsRepository.OCLQuery.Properties.context) {
					return createContextFlatComboViewer(parent);
				}
				if (key == QueryViewsRepository.OCLQuery.Properties.query_) {
					return createQueryText(parent);
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
		propertiesGroup.setText(QueryMessages.OCLQueryPropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createContextFlatComboViewer(Composite parent) {
		createDescription(parent, QueryViewsRepository.OCLQuery.Properties.context, QueryMessages.OCLQueryPropertiesEditionPart_ContextLabel);
		context = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(QueryViewsRepository.OCLQuery.Properties.context, QueryViewsRepository.SWT_KIND));
		context.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		context.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OCLQueryPropertiesEditionPartImpl.this, QueryViewsRepository.OCLQuery.Properties.context, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getContext()));
			}

		});
		GridData contextData = new GridData(GridData.FILL_HORIZONTAL);
		context.setLayoutData(contextData);
		context.setID(QueryViewsRepository.OCLQuery.Properties.context);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(QueryViewsRepository.OCLQuery.Properties.context, QueryViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createContextFlatComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createQueryText(Composite parent) {
		createDescription(parent, QueryViewsRepository.OCLQuery.Properties.query_, QueryMessages.OCLQueryPropertiesEditionPart_QueryLabel);
		query = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData queryData = new GridData(GridData.FILL_HORIZONTAL);
		query.setLayoutData(queryData);
		query.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OCLQueryPropertiesEditionPartImpl.this, QueryViewsRepository.OCLQuery.Properties.query_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, query.getText()));
			}

		});
		query.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OCLQueryPropertiesEditionPartImpl.this, QueryViewsRepository.OCLQuery.Properties.query_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, query.getText()));
				}
			}

		});
		EditingUtils.setID(query, QueryViewsRepository.OCLQuery.Properties.query_);
		EditingUtils.setEEFtype(query, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(QueryViewsRepository.OCLQuery.Properties.query_, QueryViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createQueryText

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
	 * @see org.eclipse.emf.eef.extended.query.parts.OCLQueryPropertiesEditionPart#getContext()
	 * 
	 */
	public EObject getContext() {
		if (context.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) context.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.extended.query.parts.OCLQueryPropertiesEditionPart#initContext(EObjectFlatComboSettings)
	 */
	public void initContext(EObjectFlatComboSettings settings) {
		context.setInput(settings);
		if (current != null) {
			context.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(QueryViewsRepository.OCLQuery.Properties.context);
		if (eefElementEditorReadOnlyState && context.isEnabled()) {
			context.setEnabled(false);
			context.setToolTipText(QueryMessages.OCLQuery_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !context.isEnabled()) {
			context.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.extended.query.parts.OCLQueryPropertiesEditionPart#setContext(EObject newValue)
	 * 
	 */
	public void setContext(EObject newValue) {
		if (newValue != null) {
			context.setSelection(new StructuredSelection(newValue));
		} else {
			context.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(QueryViewsRepository.OCLQuery.Properties.context);
		if (eefElementEditorReadOnlyState && context.isEnabled()) {
			context.setEnabled(false);
			context.setToolTipText(QueryMessages.OCLQuery_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !context.isEnabled()) {
			context.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.extended.query.parts.OCLQueryPropertiesEditionPart#setContextButtonMode(ButtonsModeEnum newValue)
	 */
	public void setContextButtonMode(ButtonsModeEnum newValue) {
		context.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.extended.query.parts.OCLQueryPropertiesEditionPart#addFilterContext(ViewerFilter filter)
	 * 
	 */
	public void addFilterToContext(ViewerFilter filter) {
		context.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.extended.query.parts.OCLQueryPropertiesEditionPart#addBusinessFilterContext(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToContext(ViewerFilter filter) {
		context.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.extended.query.parts.OCLQueryPropertiesEditionPart#getQuery()
	 * 
	 */
	public String getQuery() {
		return query.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.extended.query.parts.OCLQueryPropertiesEditionPart#setQuery(String newValue)
	 * 
	 */
	public void setQuery(String newValue) {
		if (newValue != null) {
			query.setText(newValue);
		} else {
			query.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(QueryViewsRepository.OCLQuery.Properties.query_);
		if (eefElementEditorReadOnlyState && query.isEnabled()) {
			query.setEnabled(false);
			query.setToolTipText(QueryMessages.OCLQuery_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !query.isEnabled()) {
			query.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return QueryMessages.OCLQuery_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
