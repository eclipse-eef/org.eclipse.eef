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
package org.eclipse.emf.eef.extended.query.parts.forms;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.extended.query.parts.OCLQueryPropertiesEditionPart;
import org.eclipse.emf.eef.extended.query.parts.QueryViewsRepository;
import org.eclipse.emf.eef.extended.query.providers.QueryMessages;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
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
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.views.properties.tabbed.ISection;


// End of user code

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen LeFur</a>
 * 
 */
public class OCLQueryPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, OCLQueryPropertiesEditionPart {

	protected EObjectFlatComboViewer context;
	protected Text query;



	/**
	 * For {@link ISection} use only.
	 */
	public OCLQueryPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public OCLQueryPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence oCLQueryStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = oCLQueryStep.addStep(QueryViewsRepository.OCLQuery.Properties.class);
		propertiesStep.addStep(QueryViewsRepository.OCLQuery.Properties.context);
		propertiesStep.addStep(QueryViewsRepository.OCLQuery.Properties.query_);
		
		
		composer = new PartComposer(oCLQueryStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == QueryViewsRepository.OCLQuery.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == QueryViewsRepository.OCLQuery.Properties.context) {
					return createContextFlatComboViewer(parent, widgetFactory);
				}
				if (key == QueryViewsRepository.OCLQuery.Properties.query_) {
					return createQueryText(widgetFactory, parent);
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
		propertiesSection.setText(QueryMessages.OCLQueryPropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createContextFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, QueryViewsRepository.OCLQuery.Properties.context, QueryMessages.OCLQueryPropertiesEditionPart_ContextLabel);
		context = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(QueryViewsRepository.OCLQuery.Properties.context, QueryViewsRepository.FORM_KIND));
		widgetFactory.adapt(context);
		context.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData contextData = new GridData(GridData.FILL_HORIZONTAL);
		context.setLayoutData(contextData);
		context.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OCLQueryPropertiesEditionPartForm.this, QueryViewsRepository.OCLQuery.Properties.context, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getContext()));
			}

		});
		context.setID(QueryViewsRepository.OCLQuery.Properties.context);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(QueryViewsRepository.OCLQuery.Properties.context, QueryViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createContextFlatComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createQueryText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, QueryViewsRepository.OCLQuery.Properties.query_, QueryMessages.OCLQueryPropertiesEditionPart_QueryLabel);
		query = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		query.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData queryData = new GridData(GridData.FILL_HORIZONTAL);
		query.setLayoutData(queryData);
		query.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OCLQueryPropertiesEditionPartForm.this,
							QueryViewsRepository.OCLQuery.Properties.query_,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, query.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									OCLQueryPropertiesEditionPartForm.this,
									QueryViewsRepository.OCLQuery.Properties.query_,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, query.getText()));
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
									OCLQueryPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		query.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OCLQueryPropertiesEditionPartForm.this, QueryViewsRepository.OCLQuery.Properties.query_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, query.getText()));
				}
			}
		});
		EditingUtils.setID(query, QueryViewsRepository.OCLQuery.Properties.query_);
		EditingUtils.setEEFtype(query, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(QueryViewsRepository.OCLQuery.Properties.query_, QueryViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
