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
package org.eclipse.emf.eef.eefnr.references.parts.forms;

// Start of user code for imports
import org.eclipse.emf.eef.eefnr.references.parts.AbstractEnabledSamplePropertiesEditionPart;
import org.eclipse.emf.eef.eefnr.references.parts.AbstractSamplePropertiesEditionPart;
import org.eclipse.emf.eef.eefnr.references.parts.ReferencesViewsRepository;
import org.eclipse.emf.eef.eefnr.references.providers.ReferencesMessages;
import org.eclipse.emf.eef.runtime.components.PropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.notify.PropertiesEditingEvent;
import org.eclipse.emf.eef.runtime.notify.impl.PropertiesEditingEventImpl;
import org.eclipse.emf.eef.runtime.parts.FormPropertiesEditingPart;
import org.eclipse.emf.eef.runtime.parts.PropertiesEditingPart;
import org.eclipse.emf.eef.runtime.parts.impl.CompositePropertiesEditingPart;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingPartProvider;
import org.eclipse.emf.eef.runtime.services.PropertiesEditingPartProviderService;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
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
public class AbstractEnabledSamplePropertiesEditionPartForm extends CompositePropertiesEditingPart implements FormPropertiesEditingPart, AbstractEnabledSamplePropertiesEditionPart {

	protected Button enabled;
	private AbstractSamplePropertiesEditionPart abstractSamplePropertiesEditionPart;



	/**
	 * Default constructor
	 * @param editionComponent the {@link PropertiesEditingComponent} that manage this part
	 * 
	 */
	public AbstractEnabledSamplePropertiesEditionPartForm(PropertiesEditingComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.parts.FormPropertiesEditingPart#
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
	 * @see org.eclipse.emf.eef.runtime.parts.FormPropertiesEditingPart#
	 *  createControls(org.eclipse.ui.forms.widgets.FormToolkit, org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(final FormToolkit widgetFactory, Composite view) {
		CompositionSequence abstractEnabledSampleStep = new CompositionSequence();
		abstractEnabledSampleStep
			.addStep(ReferencesViewsRepository.AbstractEnabledSample.EnabledProperties.class)
			.addStep(ReferencesViewsRepository.AbstractEnabledSample.EnabledProperties.enabled);
		
		abstractEnabledSampleStep.addStep(ReferencesViewsRepository.AbstractEnabledSample.abstractReference);
		
		composer = new PartComposer(abstractEnabledSampleStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ReferencesViewsRepository.AbstractEnabledSample.EnabledProperties.class) {
					return createEnabledPropertiesGroup(widgetFactory, parent);
				}
				if (key == ReferencesViewsRepository.AbstractEnabledSample.EnabledProperties.enabled) {
					return createEnabledCheckbox(widgetFactory, parent);
				}
				if (key == ReferencesViewsRepository.AbstractEnabledSample.abstractReference) {
					return createAbstractSample(widgetFactory, parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	/**
	 * 
	 */
	protected Composite createEnabledPropertiesGroup(FormToolkit widgetFactory, final Composite parent) {
		Section enabledPropertiesSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		enabledPropertiesSection.setText(ReferencesMessages.AbstractEnabledSamplePropertiesEditionPart_EnabledPropertiesGroupLabel);
		GridData enabledPropertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		enabledPropertiesSectionData.horizontalSpan = 3;
		enabledPropertiesSection.setLayoutData(enabledPropertiesSectionData);
		Composite enabledPropertiesGroup = widgetFactory.createComposite(enabledPropertiesSection);
		GridLayout enabledPropertiesGroupLayout = new GridLayout();
		enabledPropertiesGroupLayout.numColumns = 3;
		enabledPropertiesGroup.setLayout(enabledPropertiesGroupLayout);
		enabledPropertiesSection.setClient(enabledPropertiesGroup);
		return enabledPropertiesGroup;
	}

	
	protected Composite createEnabledCheckbox(FormToolkit widgetFactory, Composite parent) {
		enabled = widgetFactory.createButton(parent, ReferencesMessages.AbstractEnabledSamplePropertiesEditionPart_EnabledLabel, SWT.CHECK);
		enabled.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditingComponent != null)
					propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(AbstractEnabledSamplePropertiesEditionPartForm.this, ReferencesViewsRepository.AbstractEnabledSample.EnabledProperties.enabled, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, new Boolean(enabled.getSelection())));
			}

		});
		GridData enabledData = new GridData(GridData.FILL_HORIZONTAL);
		enabledData.horizontalSpan = 2;
		enabled.setLayoutData(enabledData);
		EditingUtils.setID(enabled, ReferencesViewsRepository.AbstractEnabledSample.EnabledProperties.enabled);
		EditingUtils.setEEFtype(enabled, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditingComponent.getHelpContent(ReferencesViewsRepository.AbstractEnabledSample.EnabledProperties.enabled, ReferencesViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	protected Composite createAbstractSample(FormToolkit widgetFactory, Composite container) {
		PropertiesEditingPartProvider provider = PropertiesEditingPartProviderService.getInstance().getProvider(ReferencesViewsRepository.class);
		abstractSamplePropertiesEditionPart = (AbstractSamplePropertiesEditionPart)provider.getPropertiesEditingPart(ReferencesViewsRepository.AbstractSample.class, ReferencesViewsRepository.FORM_KIND, propertiesEditingComponent);
		((FormPropertiesEditingPart)abstractSamplePropertiesEditionPart).createControls(widgetFactory, container);
		return container;
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
	 * @see org.eclipse.emf.eef.references.parts.AbstractEnabledSamplePropertiesEditionPart#getEnabled()
	 * 
	 */
	public Boolean getEnabled() {
		return Boolean.valueOf(enabled.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.references.parts.AbstractEnabledSamplePropertiesEditionPart#setEnabled(Boolean newValue)
	 * 
	 */
	public void setEnabled(Boolean newValue) {
		if (newValue != null) {
			enabled.setSelection(newValue.booleanValue());
		} else {
			enabled.setSelection(false);
		}
	}

/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.references.parts.AbstractEnabledSamplePropertiesEditionPart#getAbstractSampleReferencedView()
	 * 
	 */
		public PropertiesEditingPart getAbstractSampleReferencedView() {
			return (PropertiesEditingPart) abstractSamplePropertiesEditionPart;
		}
	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.references.parts.AbstractEnabledSamplePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return abstractSamplePropertiesEditionPart.getName();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.references.parts.AbstractEnabledSamplePropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		abstractSamplePropertiesEditionPart.setName(newValue);
	}





	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.parts.PropertiesEditingPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ReferencesMessages.AbstractEnabledSample_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
