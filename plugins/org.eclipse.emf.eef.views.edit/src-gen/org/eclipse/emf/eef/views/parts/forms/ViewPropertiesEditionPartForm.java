/**
 *  Copyright (c) 2008-2009 Obeo.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *      Obeo - initial API and implementation
 * 
 *
 * $Id: ViewPropertiesEditionPartForm.java,v 1.4 2009/05/19 08:59:24 sbouchet Exp $
 */
package org.eclipse.emf.eef.views.parts.forms;

// Start of user code for imports

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.parts.EEFMessageManager;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.toolkits.Widget;
import org.eclipse.emf.eef.views.parts.ViewPropertiesEditionPart;
import org.eclipse.emf.eef.views.parts.ViewsViewsRepository;
import org.eclipse.emf.eef.views.providers.ViewsMessages;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.IMessageManager;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

// End of user code
/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 */
public class ViewPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, ViewPropertiesEditionPart {

	private Text name;
	protected EObjectFlatComboViewer representation;
	private Button explicit;




	
	public ViewPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}
	
	public Composite createFigure(final Composite parent, final FormToolkit widgetFactory) {
		ScrolledForm scrolledForm = widgetFactory.createScrolledForm(parent);
		Form form = scrolledForm.getForm();
		view = form.getBody();
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(widgetFactory, view, new EEFMessageManager(scrolledForm, widgetFactory));
		return scrolledForm;
	}
	
	public void createControls(final FormToolkit widgetFactory, Composite view, IMessageManager messageManager) {
		this.messageManager = messageManager;
		createPropertiesGroup(widgetFactory, view);
		// Start of user code for additional ui definition
		
		// End of user code		
	}

	protected void createPropertiesGroup(FormToolkit widgetFactory, final Composite view) {
		Section propertiesSection = widgetFactory.createSection(view, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		propertiesSection.setText(ViewsMessages.ViewPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesSectionData.horizontalSpan = 3;
		propertiesSection.setLayoutData(propertiesSectionData);
		Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		createNameText(widgetFactory, propertiesGroup);
		createRepresentationFlatComboViewer(propertiesGroup, widgetFactory);
		createExplicitCheckbox(widgetFactory, propertiesGroup);
		propertiesSection.setClient(propertiesGroup);
	}
	protected void createNameText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ViewsMessages.ViewPropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(ViewsViewsRepository.View.name, ViewsViewsRepository.FORM_KIND));
		name = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		name.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addModifyListener(new ModifyListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.ModifyListener#modifyText(org.eclipse.swt.events.ModifyEvent)
			 */
			public void modifyText(ModifyEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ViewPropertiesEditionPartForm.this, ViewsViewsRepository.View.name, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, name.getText()));
			}
			
		});
		name.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 */
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ViewPropertiesEditionPartForm.this, ViewsViewsRepository.View.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
			}

		});
		name.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 */
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ViewPropertiesEditionPartForm.this, ViewsViewsRepository.View.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
			
		});
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ViewsViewsRepository.View.name, ViewsViewsRepository.FORM_KIND), null); //$NON-NLS-1$

	}
	/**
	 * @param propertiesGroup
	 */
	protected void createRepresentationFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
	
		FormUtils.createPartLabel(widgetFactory, parent, ViewsMessages.ViewPropertiesEditionPart_RepresentationLabel, propertiesEditionComponent.isRequired(ViewsViewsRepository.View.representation, ViewsViewsRepository.FORM_KIND));
		representation = new EObjectFlatComboViewer(parent, true);
		representation.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		GridData representationData = new GridData(GridData.FILL_HORIZONTAL);
		representation.setLayoutData(representationData);
		representation.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ViewPropertiesEditionPartForm.this, ViewsViewsRepository.View.representation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getRepresentation()));
			}
			
		});
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ViewsViewsRepository.View.representation, ViewsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
	}
	protected void createExplicitCheckbox(FormToolkit widgetFactory, Composite parent) {
		explicit = widgetFactory.createButton(parent, ViewsMessages.ViewPropertiesEditionPart_ExplicitLabel, SWT.CHECK);
		explicit.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ViewPropertiesEditionPartForm.this, ViewsViewsRepository.View.explicit, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(explicit.getSelection())));
			}
			
		});
		GridData explicitData = new GridData(GridData.FILL_HORIZONTAL);
		explicitData.horizontalSpan = 2;
		explicit.setLayoutData(explicitData);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ViewsViewsRepository.View.explicit, ViewsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
	}

	
	public void firePropertiesChanged(PropertiesEditionEvent event) {
		// Start of user code for tab synchronization
		
		// Nothing to do
		// End of user code		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.views.parts.ViewPropertiesEditionPart#getName()
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.views.parts.ViewPropertiesEditionPart#setName(String newValue)
	 */
	public void setName(String newValue) {
		name.setText(newValue);
	}

	public void setMessageForName(String msg, int msgLevel) {
		messageManager.addMessage("Name_key", msg, null, msgLevel, name);
	}

	public void unsetMessageForName() {
		messageManager.removeMessage("Name_key", name);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.views.parts.ViewPropertiesEditionPart#getRepresentation()
	 */
	public EObject getRepresentation() {
		if (representation.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) representation.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.views.parts.ViewPropertiesEditionPart#initRepresentation(ResourceSet allResources, EObject current)
	 */
	public void initRepresentation(ResourceSet allResources, EObject current) {
		representation.setInput(allResources);
		if (current != null)
			representation.setSelection(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.views.parts.ViewPropertiesEditionPart#setRepresentation(EObject newValue)
	 */
	public void setRepresentation(EObject newValue) {
		if (newValue != null)
			representation.setSelection(new StructuredSelection(newValue));
		else
			representation.setSelection(new StructuredSelection("")); //$NON-NLS-1$
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.views.parts.ViewPropertiesEditionPart#addFilterRepresentation(ViewerFilter filter)
	 */
	public void addFilterToRepresentation(ViewerFilter filter) {
		representation.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.views.parts.ViewPropertiesEditionPart#addBusinessFilterRepresentation(ViewerFilter filter)
	 */
	public void addBusinessFilterToRepresentation(ViewerFilter filter) {
		representation.addBusinessRuleFilter(filter);
	}





	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.views.parts.ViewPropertiesEditionPart#getExplicit()
	 */
	public Boolean getExplicit() {
		return Boolean.valueOf(explicit.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.views.parts.ViewPropertiesEditionPart#setExplicit(Boolean newValue)
	 */
	public void setExplicit(Boolean newValue) {
		if (newValue != null) {
			explicit.setSelection(newValue.booleanValue());
		} else {
			explicit.setSelection(false);
		}
	}











	
	// Start of user code additional methods
 	
	// End of user code
}	
