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
import org.eclipse.emf.eef.mapping.filters.parts.FiltersViewsRepository;
import org.eclipse.emf.eef.mapping.filters.parts.JavaExpressionFilterPropertiesEditionPart;
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
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
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
public class JavaExpressionFilterPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, JavaExpressionFilterPropertiesEditionPart {

	protected Text javaExpressionBody;
	private FilterPropertiesPropertiesEditionPart filterPropertiesPropertiesEditionPart;



	/**
	 * For {@link ISection} use only.
	 */
	public JavaExpressionFilterPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public JavaExpressionFilterPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence javaExpressionFilterStep = new BindingCompositionSequence(propertiesEditionComponent);
		javaExpressionFilterStep
			.addStep(FiltersViewsRepository.JavaExpressionFilter.FilterExpression.class)
			.addStep(FiltersViewsRepository.JavaExpressionFilter.FilterExpression.javaExpressionBody);
		
		javaExpressionFilterStep.addStep(FiltersViewsRepository.JavaExpressionFilter.filterProperties);
		
		composer = new PartComposer(javaExpressionFilterStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == FiltersViewsRepository.JavaExpressionFilter.FilterExpression.class) {
					return createFilterExpressionGroup(widgetFactory, parent);
				}
				if (key == FiltersViewsRepository.JavaExpressionFilter.FilterExpression.javaExpressionBody) {
					return createJavaExpressionBodyTextarea(widgetFactory, parent);
				}
				if (key == FiltersViewsRepository.JavaExpressionFilter.filterProperties) {
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
	protected Composite createFilterExpressionGroup(FormToolkit widgetFactory, final Composite parent) {
		Section filterExpressionSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		filterExpressionSection.setText(FiltersMessages.JavaExpressionFilterPropertiesEditionPart_FilterExpressionGroupLabel);
		GridData filterExpressionSectionData = new GridData(GridData.FILL_HORIZONTAL);
		filterExpressionSectionData.horizontalSpan = 3;
		filterExpressionSection.setLayoutData(filterExpressionSectionData);
		Composite filterExpressionGroup = widgetFactory.createComposite(filterExpressionSection);
		GridLayout filterExpressionGroupLayout = new GridLayout();
		filterExpressionGroupLayout.numColumns = 3;
		filterExpressionGroup.setLayout(filterExpressionGroupLayout);
		filterExpressionSection.setClient(filterExpressionGroup);
		return filterExpressionGroup;
	}

	
	protected Composite createJavaExpressionBodyTextarea(FormToolkit widgetFactory, Composite parent) {
		Label javaExpressionBodyLabel = createDescription(parent, FiltersViewsRepository.JavaExpressionFilter.FilterExpression.javaExpressionBody, FiltersMessages.JavaExpressionFilterPropertiesEditionPart_JavaExpressionBodyLabel);
		GridData javaExpressionBodyLabelData = new GridData(GridData.FILL_HORIZONTAL);
		javaExpressionBodyLabelData.horizontalSpan = 3;
		javaExpressionBodyLabel.setLayoutData(javaExpressionBodyLabelData);
		javaExpressionBody = widgetFactory.createText(parent, "", SWT.BORDER | SWT.WRAP | SWT.MULTI | SWT.V_SCROLL); //$NON-NLS-1$
		GridData javaExpressionBodyData = new GridData(GridData.FILL_HORIZONTAL);
		javaExpressionBodyData.horizontalSpan = 2;
		javaExpressionBodyData.heightHint = 80;
		javaExpressionBodyData.widthHint = 200;
		javaExpressionBody.setLayoutData(javaExpressionBodyData);
		javaExpressionBody.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							JavaExpressionFilterPropertiesEditionPartForm.this,
							FiltersViewsRepository.JavaExpressionFilter.FilterExpression.javaExpressionBody,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, javaExpressionBody.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									JavaExpressionFilterPropertiesEditionPartForm.this,
									FiltersViewsRepository.JavaExpressionFilter.FilterExpression.javaExpressionBody,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, javaExpressionBody.getText()));
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
									JavaExpressionFilterPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		EditingUtils.setID(javaExpressionBody, FiltersViewsRepository.JavaExpressionFilter.FilterExpression.javaExpressionBody);
		EditingUtils.setEEFtype(javaExpressionBody, "eef::Textarea"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(FiltersViewsRepository.JavaExpressionFilter.FilterExpression.javaExpressionBody, FiltersViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createJavaExpressionBodyTextArea

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
	 * @see org.eclipse.emf.eef.filters.parts.JavaExpressionFilterPropertiesEditionPart#getJavaExpressionBody()
	 * 
	 */
	public String getJavaExpressionBody() {
		return javaExpressionBody.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.JavaExpressionFilterPropertiesEditionPart#setJavaExpressionBody(String newValue)
	 * 
	 */
	public void setJavaExpressionBody(String newValue) {
		if (newValue != null) {
			javaExpressionBody.setText(newValue);
		} else {
			javaExpressionBody.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(FiltersViewsRepository.JavaExpressionFilter.FilterExpression.javaExpressionBody);
		if (eefElementEditorReadOnlyState && javaExpressionBody.isEnabled()) {
			javaExpressionBody.setEnabled(false);
			javaExpressionBody.setBackground(javaExpressionBody.getDisplay().getSystemColor(SWT.COLOR_WIDGET_BACKGROUND));
			javaExpressionBody.setToolTipText(FiltersMessages.JavaExpressionFilter_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !javaExpressionBody.isEnabled()) {
			javaExpressionBody.setEnabled(true);
		}	
		
	}


/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.JavaExpressionFilterPropertiesEditionPart#getFilterPropertiesReferencedView()
	 * 
	 */
		public IPropertiesEditionPart getFilterPropertiesReferencedView() {
			return (IPropertiesEditionPart) filterPropertiesPropertiesEditionPart;
		}
	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.JavaExpressionFilterPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return filterPropertiesPropertiesEditionPart.getName();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.JavaExpressionFilterPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		filterPropertiesPropertiesEditionPart.setName(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.JavaExpressionFilterPropertiesEditionPart#getMandatory()
	 * 
	 */
	public Boolean getMandatory() {
		return filterPropertiesPropertiesEditionPart.getMandatory();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.JavaExpressionFilterPropertiesEditionPart#setMandatory(Boolean newValue)
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
		return FiltersMessages.JavaExpressionFilter_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
