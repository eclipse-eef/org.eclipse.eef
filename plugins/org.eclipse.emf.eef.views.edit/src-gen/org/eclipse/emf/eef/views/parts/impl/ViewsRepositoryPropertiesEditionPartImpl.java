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
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.views.parts.ViewsRepositoryPropertiesEditionPart;
import org.eclipse.emf.eef.views.parts.ViewsViewsRepository;
import org.eclipse.emf.eef.views.providers.ViewsMessages;
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
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class ViewsRepositoryPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ViewsRepositoryPropertiesEditionPart {

	protected Text name;
	protected Text repositoryKind;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ViewsRepositoryPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence viewsRepositoryStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = viewsRepositoryStep.addStep(ViewsViewsRepository.ViewsRepository.Properties.class);
		propertiesStep.addStep(ViewsViewsRepository.ViewsRepository.Properties.name);
		propertiesStep.addStep(ViewsViewsRepository.ViewsRepository.Properties.repositoryKind);
		
		
		composer = new PartComposer(viewsRepositoryStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ViewsViewsRepository.ViewsRepository.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == ViewsViewsRepository.ViewsRepository.Properties.name) {
					return createNameText(parent);
				}
				if (key == ViewsViewsRepository.ViewsRepository.Properties.repositoryKind) {
					return createRepositoryKindText(parent);
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
		propertiesGroup.setText(ViewsMessages.ViewsRepositoryPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, ViewsViewsRepository.ViewsRepository.Properties.name, ViewsMessages.ViewsRepositoryPropertiesEditionPart_NameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ViewsRepositoryPropertiesEditionPartImpl.this, ViewsViewsRepository.ViewsRepository.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ViewsRepositoryPropertiesEditionPartImpl.this, ViewsViewsRepository.ViewsRepository.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, ViewsViewsRepository.ViewsRepository.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ViewsViewsRepository.ViewsRepository.Properties.name, ViewsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	
	protected Composite createRepositoryKindText(Composite parent) {
		createDescription(parent, ViewsViewsRepository.ViewsRepository.Properties.repositoryKind, ViewsMessages.ViewsRepositoryPropertiesEditionPart_RepositoryKindLabel);
		repositoryKind = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData repositoryKindData = new GridData(GridData.FILL_HORIZONTAL);
		repositoryKind.setLayoutData(repositoryKindData);
		repositoryKind.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ViewsRepositoryPropertiesEditionPartImpl.this, ViewsViewsRepository.ViewsRepository.Properties.repositoryKind, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, repositoryKind.getText()));
			}

		});
		repositoryKind.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ViewsRepositoryPropertiesEditionPartImpl.this, ViewsViewsRepository.ViewsRepository.Properties.repositoryKind, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, repositoryKind.getText()));
				}
			}

		});
		EditingUtils.setID(repositoryKind, ViewsViewsRepository.ViewsRepository.Properties.repositoryKind);
		EditingUtils.setEEFtype(repositoryKind, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ViewsViewsRepository.ViewsRepository.Properties.repositoryKind, ViewsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createRepositoryKindText

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
	 * @see org.eclipse.emf.eef.views.parts.ViewsRepositoryPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.views.parts.ViewsRepositoryPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(ViewsViewsRepository.ViewsRepository.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(ViewsMessages.ViewsRepository_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.views.parts.ViewsRepositoryPropertiesEditionPart#getRepositoryKind()
	 * 
	 */
	public String getRepositoryKind() {
		return repositoryKind.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.views.parts.ViewsRepositoryPropertiesEditionPart#setRepositoryKind(String newValue)
	 * 
	 */
	public void setRepositoryKind(String newValue) {
		if (newValue != null) {
			repositoryKind.setText(newValue);
		} else {
			repositoryKind.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(ViewsViewsRepository.ViewsRepository.Properties.repositoryKind);
		if (eefElementEditorReadOnlyState && repositoryKind.isEnabled()) {
			repositoryKind.setEnabled(false);
			repositoryKind.setToolTipText(ViewsMessages.ViewsRepository_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !repositoryKind.isEnabled()) {
			repositoryKind.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ViewsMessages.ViewsRepository_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
