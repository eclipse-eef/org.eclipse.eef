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
package org.eclipse.emf.eef.mapping.filters.parts.forms;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.mapping.filters.parts.FiltersViewsRepository;
import org.eclipse.emf.eef.mapping.filters.parts.OnlyReferenceTypeFilterPropertiesEditionPart;
import org.eclipse.emf.eef.mapping.filters.providers.FiltersMessages;
import org.eclipse.emf.eef.mapping.parts.FilterPropertiesPropertiesEditionPart;
import org.eclipse.emf.eef.mapping.parts.MappingViewsRepository;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.services.PropertiesEditionPartProviderService;
import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.views.properties.tabbed.ISection;




// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class OnlyReferenceTypeFilterPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, OnlyReferenceTypeFilterPropertiesEditionPart {

	protected EObjectFlatComboViewer referencedFeature;
	private FilterPropertiesPropertiesEditionPart filterPropertiesPropertiesEditionPart;



	/**
	 * For {@link ISection} use only.
	 */
	public OnlyReferenceTypeFilterPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public OnlyReferenceTypeFilterPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence onlyReferenceTypeFilterStep = new BindingCompositionSequence(propertiesEditionComponent);
		onlyReferenceTypeFilterStep
			.addStep(FiltersViewsRepository.OnlyReferenceTypeFilter.ReferencedFeature.class)
			.addStep(FiltersViewsRepository.OnlyReferenceTypeFilter.ReferencedFeature.referencedFeature_);
		
		onlyReferenceTypeFilterStep.addStep(FiltersViewsRepository.OnlyReferenceTypeFilter.filterProperties);
		
		composer = new PartComposer(onlyReferenceTypeFilterStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == FiltersViewsRepository.OnlyReferenceTypeFilter.ReferencedFeature.class) {
					return createReferencedFeatureGroup(widgetFactory, parent);
				}
				if (key == FiltersViewsRepository.OnlyReferenceTypeFilter.ReferencedFeature.referencedFeature_) {
					return createReferencedFeatureFlatComboViewer(parent, widgetFactory);
				}
				if (key == FiltersViewsRepository.OnlyReferenceTypeFilter.filterProperties) {
					return createFilterProperties(widgetFactory, parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	/**
	 * 
	 */
	protected Composite createReferencedFeatureGroup(FormToolkit widgetFactory, final Composite parent) {
		Section referencedFeatureSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		referencedFeatureSection.setText(FiltersMessages.OnlyReferenceTypeFilterPropertiesEditionPart_ReferencedFeatureGroupLabel);
		GridData referencedFeatureSectionData = new GridData(GridData.FILL_HORIZONTAL);
		referencedFeatureSectionData.horizontalSpan = 3;
		referencedFeatureSection.setLayoutData(referencedFeatureSectionData);
		Composite referencedFeatureGroup = widgetFactory.createComposite(referencedFeatureSection);
		GridLayout referencedFeatureGroupLayout = new GridLayout();
		referencedFeatureGroupLayout.numColumns = 3;
		referencedFeatureGroup.setLayout(referencedFeatureGroupLayout);
		referencedFeatureSection.setClient(referencedFeatureGroup);
		return referencedFeatureGroup;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createReferencedFeatureFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, FiltersViewsRepository.OnlyReferenceTypeFilter.ReferencedFeature.referencedFeature_, FiltersMessages.OnlyReferenceTypeFilterPropertiesEditionPart_ReferencedFeatureLabel);
		referencedFeature = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(FiltersViewsRepository.OnlyReferenceTypeFilter.ReferencedFeature.referencedFeature_, FiltersViewsRepository.FORM_KIND));
		widgetFactory.adapt(referencedFeature);
		referencedFeature.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData referencedFeatureData = new GridData(GridData.FILL_HORIZONTAL);
		referencedFeature.setLayoutData(referencedFeatureData);
		referencedFeature.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OnlyReferenceTypeFilterPropertiesEditionPartForm.this, FiltersViewsRepository.OnlyReferenceTypeFilter.ReferencedFeature.referencedFeature_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getReferencedFeature()));
			}

		});
		referencedFeature.setID(FiltersViewsRepository.OnlyReferenceTypeFilter.ReferencedFeature.referencedFeature_);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(FiltersViewsRepository.OnlyReferenceTypeFilter.ReferencedFeature.referencedFeature_, FiltersViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createReferencedFeatureFlatComboViewer

		// End of user code
		return parent;
	}

	protected Composite createFilterProperties(FormToolkit widgetFactory, Composite container) {
		IPropertiesEditionPartProvider provider = PropertiesEditionPartProviderService.getInstance().getProvider(MappingViewsRepository.class);
		filterPropertiesPropertiesEditionPart = (FilterPropertiesPropertiesEditionPart)provider.getPropertiesEditionPart(MappingViewsRepository.FilterProperties.class, MappingViewsRepository.FORM_KIND, propertiesEditionComponent);
		((IFormPropertiesEditionPart)filterPropertiesPropertiesEditionPart).createControls(widgetFactory, container);
		return container;
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
	 * @see org.eclipse.emf.eef.filters.parts.OnlyReferenceTypeFilterPropertiesEditionPart#getReferencedFeature()
	 * 
	 */
	public EObject getReferencedFeature() {
		if (referencedFeature.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) referencedFeature.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.OnlyReferenceTypeFilterPropertiesEditionPart#initReferencedFeature(EObjectFlatComboSettings)
	 */
	public void initReferencedFeature(EObjectFlatComboSettings settings) {
		referencedFeature.setInput(settings);
		if (current != null) {
			referencedFeature.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(FiltersViewsRepository.OnlyReferenceTypeFilter.ReferencedFeature.referencedFeature_);
		if (eefElementEditorReadOnlyState && referencedFeature.isEnabled()) {
			referencedFeature.setEnabled(false);
			referencedFeature.setToolTipText(FiltersMessages.OnlyReferenceTypeFilter_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !referencedFeature.isEnabled()) {
			referencedFeature.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.OnlyReferenceTypeFilterPropertiesEditionPart#setReferencedFeature(EObject newValue)
	 * 
	 */
	public void setReferencedFeature(EObject newValue) {
		if (newValue != null) {
			referencedFeature.setSelection(new StructuredSelection(newValue));
		} else {
			referencedFeature.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(FiltersViewsRepository.OnlyReferenceTypeFilter.ReferencedFeature.referencedFeature_);
		if (eefElementEditorReadOnlyState && referencedFeature.isEnabled()) {
			referencedFeature.setEnabled(false);
			referencedFeature.setToolTipText(FiltersMessages.OnlyReferenceTypeFilter_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !referencedFeature.isEnabled()) {
			referencedFeature.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.OnlyReferenceTypeFilterPropertiesEditionPart#setReferencedFeatureButtonMode(ButtonsModeEnum newValue)
	 */
	public void setReferencedFeatureButtonMode(ButtonsModeEnum newValue) {
		referencedFeature.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.OnlyReferenceTypeFilterPropertiesEditionPart#addFilterReferencedFeature(ViewerFilter filter)
	 * 
	 */
	public void addFilterToReferencedFeature(ViewerFilter filter) {
		referencedFeature.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.OnlyReferenceTypeFilterPropertiesEditionPart#addBusinessFilterReferencedFeature(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToReferencedFeature(ViewerFilter filter) {
		referencedFeature.addBusinessRuleFilter(filter);
	}


/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.OnlyReferenceTypeFilterPropertiesEditionPart#getFilterPropertiesReferencedView()
	 * 
	 */
		public IPropertiesEditionPart getFilterPropertiesReferencedView() {
			return (IPropertiesEditionPart) filterPropertiesPropertiesEditionPart;
		}
	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.OnlyReferenceTypeFilterPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return filterPropertiesPropertiesEditionPart.getName();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.OnlyReferenceTypeFilterPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		filterPropertiesPropertiesEditionPart.setName(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.OnlyReferenceTypeFilterPropertiesEditionPart#getMandatory()
	 * 
	 */
	public Boolean getMandatory() {
		return filterPropertiesPropertiesEditionPart.getMandatory();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.OnlyReferenceTypeFilterPropertiesEditionPart#setMandatory(Boolean newValue)
	 * 
	 */
	public void setMandatory(Boolean newValue) {
		filterPropertiesPropertiesEditionPart.setMandatory(newValue);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return FiltersMessages.OnlyReferenceTypeFilter_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
