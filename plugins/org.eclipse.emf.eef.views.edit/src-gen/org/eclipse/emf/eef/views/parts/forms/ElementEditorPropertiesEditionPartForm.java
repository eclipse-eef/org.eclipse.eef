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
package org.eclipse.emf.eef.views.parts.forms;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
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
import org.eclipse.emf.eef.views.parts.ElementEditorPropertiesEditionPart;
import org.eclipse.emf.eef.views.parts.ViewsViewsRepository;
import org.eclipse.emf.eef.views.providers.ViewsMessages;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
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
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
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
public class ElementEditorPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, ElementEditorPropertiesEditionPart {

	protected Text name;
	protected EObjectFlatComboViewer representation;
	protected Button readOnly;
	protected Button nameAsLabel;



	/**
	 * For {@link ISection} use only.
	 */
	public ElementEditorPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ElementEditorPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence elementEditorStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = elementEditorStep.addStep(ViewsViewsRepository.ElementEditor.Properties.class);
		propertiesStep.addStep(ViewsViewsRepository.ElementEditor.Properties.name);
		propertiesStep.addStep(ViewsViewsRepository.ElementEditor.Properties.representation);
		propertiesStep.addStep(ViewsViewsRepository.ElementEditor.Properties.readOnly);
		propertiesStep.addStep(ViewsViewsRepository.ElementEditor.Properties.nameAsLabel);
		
		
		composer = new PartComposer(elementEditorStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ViewsViewsRepository.ElementEditor.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == ViewsViewsRepository.ElementEditor.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == ViewsViewsRepository.ElementEditor.Properties.representation) {
					return createRepresentationFlatComboViewer(parent, widgetFactory);
				}
				if (key == ViewsViewsRepository.ElementEditor.Properties.readOnly) {
					return createReadOnlyCheckbox(widgetFactory, parent);
				}
				if (key == ViewsViewsRepository.ElementEditor.Properties.nameAsLabel) {
					return createNameAsLabelCheckbox(widgetFactory, parent);
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
		propertiesSection.setText(ViewsMessages.ElementEditorPropertiesEditionPart_PropertiesGroupLabel);
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

	
	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, ViewsViewsRepository.ElementEditor.Properties.name, ViewsMessages.ElementEditorPropertiesEditionPart_NameLabel);
		name = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		name.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							ElementEditorPropertiesEditionPartForm.this,
							ViewsViewsRepository.ElementEditor.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ElementEditorPropertiesEditionPartForm.this,
									ViewsViewsRepository.ElementEditor.Properties.name,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, name.getText()));
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
									ElementEditorPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		name.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ElementEditorPropertiesEditionPartForm.this, ViewsViewsRepository.ElementEditor.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, ViewsViewsRepository.ElementEditor.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ViewsViewsRepository.ElementEditor.Properties.name, ViewsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createRepresentationFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, ViewsViewsRepository.ElementEditor.Properties.representation, ViewsMessages.ElementEditorPropertiesEditionPart_RepresentationLabel);
		representation = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ViewsViewsRepository.ElementEditor.Properties.representation, ViewsViewsRepository.FORM_KIND));
		widgetFactory.adapt(representation);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ElementEditorPropertiesEditionPartForm.this, ViewsViewsRepository.ElementEditor.Properties.representation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getRepresentation()));
			}

		});
		representation.setID(ViewsViewsRepository.ElementEditor.Properties.representation);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ViewsViewsRepository.ElementEditor.Properties.representation, ViewsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createRepresentationFlatComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createReadOnlyCheckbox(FormToolkit widgetFactory, Composite parent) {
		readOnly = widgetFactory.createButton(parent, getDescription(ViewsViewsRepository.ElementEditor.Properties.readOnly, ViewsMessages.ElementEditorPropertiesEditionPart_ReadOnlyLabel), SWT.CHECK);
		readOnly.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ElementEditorPropertiesEditionPartForm.this, ViewsViewsRepository.ElementEditor.Properties.readOnly, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(readOnly.getSelection())));
			}

		});
		GridData readOnlyData = new GridData(GridData.FILL_HORIZONTAL);
		readOnlyData.horizontalSpan = 2;
		readOnly.setLayoutData(readOnlyData);
		EditingUtils.setID(readOnly, ViewsViewsRepository.ElementEditor.Properties.readOnly);
		EditingUtils.setEEFtype(readOnly, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ViewsViewsRepository.ElementEditor.Properties.readOnly, ViewsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createReadOnlyCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createNameAsLabelCheckbox(FormToolkit widgetFactory, Composite parent) {
		nameAsLabel = widgetFactory.createButton(parent, getDescription(ViewsViewsRepository.ElementEditor.Properties.nameAsLabel, ViewsMessages.ElementEditorPropertiesEditionPart_NameAsLabelLabel), SWT.CHECK);
		nameAsLabel.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ElementEditorPropertiesEditionPartForm.this, ViewsViewsRepository.ElementEditor.Properties.nameAsLabel, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(nameAsLabel.getSelection())));
			}

		});
		GridData nameAsLabelData = new GridData(GridData.FILL_HORIZONTAL);
		nameAsLabelData.horizontalSpan = 2;
		nameAsLabel.setLayoutData(nameAsLabelData);
		EditingUtils.setID(nameAsLabel, ViewsViewsRepository.ElementEditor.Properties.nameAsLabel);
		EditingUtils.setEEFtype(nameAsLabel, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ViewsViewsRepository.ElementEditor.Properties.nameAsLabel, ViewsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameAsLabelCheckbox

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

// Nothing to do
// End of user code
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.views.parts.ElementEditorPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.views.parts.ElementEditorPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(ViewsViewsRepository.ElementEditor.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(ViewsMessages.ElementEditor_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.views.parts.ElementEditorPropertiesEditionPart#getRepresentation()
	 * 
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
	 * @see org.eclipse.emf.eef.views.parts.ElementEditorPropertiesEditionPart#initRepresentation(EObjectFlatComboSettings)
	 */
	public void initRepresentation(EObjectFlatComboSettings settings) {
		representation.setInput(settings);
		if (current != null) {
			representation.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(ViewsViewsRepository.ElementEditor.Properties.representation);
		if (eefElementEditorReadOnlyState && representation.isEnabled()) {
			representation.setEnabled(false);
			representation.setToolTipText(ViewsMessages.ElementEditor_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !representation.isEnabled()) {
			representation.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.views.parts.ElementEditorPropertiesEditionPart#setRepresentation(EObject newValue)
	 * 
	 */
	public void setRepresentation(EObject newValue) {
		if (newValue != null) {
			representation.setSelection(new StructuredSelection(newValue));
		} else {
			representation.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(ViewsViewsRepository.ElementEditor.Properties.representation);
		if (eefElementEditorReadOnlyState && representation.isEnabled()) {
			representation.setEnabled(false);
			representation.setToolTipText(ViewsMessages.ElementEditor_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !representation.isEnabled()) {
			representation.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.views.parts.ElementEditorPropertiesEditionPart#setRepresentationButtonMode(ButtonsModeEnum newValue)
	 */
	public void setRepresentationButtonMode(ButtonsModeEnum newValue) {
		representation.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.views.parts.ElementEditorPropertiesEditionPart#addFilterRepresentation(ViewerFilter filter)
	 * 
	 */
	public void addFilterToRepresentation(ViewerFilter filter) {
		representation.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.views.parts.ElementEditorPropertiesEditionPart#addBusinessFilterRepresentation(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToRepresentation(ViewerFilter filter) {
		representation.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.views.parts.ElementEditorPropertiesEditionPart#getReadOnly()
	 * 
	 */
	public Boolean getReadOnly() {
		return Boolean.valueOf(readOnly.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.views.parts.ElementEditorPropertiesEditionPart#setReadOnly(Boolean newValue)
	 * 
	 */
	public void setReadOnly(Boolean newValue) {
		if (newValue != null) {
			readOnly.setSelection(newValue.booleanValue());
		} else {
			readOnly.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(ViewsViewsRepository.ElementEditor.Properties.readOnly);
		if (eefElementEditorReadOnlyState && readOnly.isEnabled()) {
			readOnly.setEnabled(false);
			readOnly.setToolTipText(ViewsMessages.ElementEditor_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !readOnly.isEnabled()) {
			readOnly.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.views.parts.ElementEditorPropertiesEditionPart#getNameAsLabel()
	 * 
	 */
	public Boolean getNameAsLabel() {
		return Boolean.valueOf(nameAsLabel.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.views.parts.ElementEditorPropertiesEditionPart#setNameAsLabel(Boolean newValue)
	 * 
	 */
	public void setNameAsLabel(Boolean newValue) {
		if (newValue != null) {
			nameAsLabel.setSelection(newValue.booleanValue());
		} else {
			nameAsLabel.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(ViewsViewsRepository.ElementEditor.Properties.nameAsLabel);
		if (eefElementEditorReadOnlyState && nameAsLabel.isEnabled()) {
			nameAsLabel.setEnabled(false);
			nameAsLabel.setToolTipText(ViewsMessages.ElementEditor_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !nameAsLabel.isEnabled()) {
			nameAsLabel.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ViewsMessages.ElementEditor_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
