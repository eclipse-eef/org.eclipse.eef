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
package org.eclipse.emf.eef.views.parts.impl;

// Start of user code for imports

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
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
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class ElementEditorPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ElementEditorPropertiesEditionPart {

	protected Text name;
	protected EObjectFlatComboViewer representation;
	protected Button readOnly;
	protected Button nameAsLabel;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ElementEditorPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
					return createPropertiesGroup(parent);
				}
				if (key == ViewsViewsRepository.ElementEditor.Properties.name) {
					return createNameText(parent);
				}
				if (key == ViewsViewsRepository.ElementEditor.Properties.representation) {
					return createRepresentationFlatComboViewer(parent);
				}
				if (key == ViewsViewsRepository.ElementEditor.Properties.readOnly) {
					return createReadOnlyCheckbox(parent);
				}
				if (key == ViewsViewsRepository.ElementEditor.Properties.nameAsLabel) {
					return createNameAsLabelCheckbox(parent);
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
		propertiesGroup.setText(ViewsMessages.ElementEditorPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, ViewsViewsRepository.ElementEditor.Properties.name, ViewsMessages.ElementEditorPropertiesEditionPart_NameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ElementEditorPropertiesEditionPartImpl.this, ViewsViewsRepository.ElementEditor.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ElementEditorPropertiesEditionPartImpl.this, ViewsViewsRepository.ElementEditor.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, ViewsViewsRepository.ElementEditor.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ViewsViewsRepository.ElementEditor.Properties.name, ViewsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createRepresentationFlatComboViewer(Composite parent) {
		createDescription(parent, ViewsViewsRepository.ElementEditor.Properties.representation, ViewsMessages.ElementEditorPropertiesEditionPart_RepresentationLabel);
		representation = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ViewsViewsRepository.ElementEditor.Properties.representation, ViewsViewsRepository.SWT_KIND));
		representation.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		representation.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ElementEditorPropertiesEditionPartImpl.this, ViewsViewsRepository.ElementEditor.Properties.representation, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getRepresentation()));
			}

		});
		GridData representationData = new GridData(GridData.FILL_HORIZONTAL);
		representation.setLayoutData(representationData);
		representation.setID(ViewsViewsRepository.ElementEditor.Properties.representation);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ViewsViewsRepository.ElementEditor.Properties.representation, ViewsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createRepresentationFlatComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createReadOnlyCheckbox(Composite parent) {
		readOnly = new Button(parent, SWT.CHECK);
		readOnly.setText(getDescription(ViewsViewsRepository.ElementEditor.Properties.readOnly, ViewsMessages.ElementEditorPropertiesEditionPart_ReadOnlyLabel));
		readOnly.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ElementEditorPropertiesEditionPartImpl.this, ViewsViewsRepository.ElementEditor.Properties.readOnly, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(readOnly.getSelection())));
			}

		});
		GridData readOnlyData = new GridData(GridData.FILL_HORIZONTAL);
		readOnlyData.horizontalSpan = 2;
		readOnly.setLayoutData(readOnlyData);
		EditingUtils.setID(readOnly, ViewsViewsRepository.ElementEditor.Properties.readOnly);
		EditingUtils.setEEFtype(readOnly, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ViewsViewsRepository.ElementEditor.Properties.readOnly, ViewsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createReadOnlyCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createNameAsLabelCheckbox(Composite parent) {
		nameAsLabel = new Button(parent, SWT.CHECK);
		nameAsLabel.setText(getDescription(ViewsViewsRepository.ElementEditor.Properties.nameAsLabel, ViewsMessages.ElementEditorPropertiesEditionPart_NameAsLabelLabel));
		nameAsLabel.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ElementEditorPropertiesEditionPartImpl.this, ViewsViewsRepository.ElementEditor.Properties.nameAsLabel, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(nameAsLabel.getSelection())));
			}

		});
		GridData nameAsLabelData = new GridData(GridData.FILL_HORIZONTAL);
		nameAsLabelData.horizontalSpan = 2;
		nameAsLabel.setLayoutData(nameAsLabelData);
		EditingUtils.setID(nameAsLabel, ViewsViewsRepository.ElementEditor.Properties.nameAsLabel);
		EditingUtils.setEEFtype(nameAsLabel, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ViewsViewsRepository.ElementEditor.Properties.nameAsLabel, ViewsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
