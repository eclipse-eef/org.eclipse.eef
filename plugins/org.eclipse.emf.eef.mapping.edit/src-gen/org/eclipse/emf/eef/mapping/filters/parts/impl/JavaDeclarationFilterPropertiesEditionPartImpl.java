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
package org.eclipse.emf.eef.mapping.filters.parts.impl;

// Start of user code for imports
import org.eclipse.emf.eef.mapping.filters.parts.FiltersViewsRepository;
import org.eclipse.emf.eef.mapping.filters.parts.JavaDeclarationFilterPropertiesEditionPart;
import org.eclipse.emf.eef.mapping.filters.providers.FiltersMessages;
import org.eclipse.emf.eef.mapping.parts.FilterPropertiesPropertiesEditionPart;
import org.eclipse.emf.eef.mapping.parts.MappingViewsRepository;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.services.PropertiesEditionPartProviderService;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
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
public class JavaDeclarationFilterPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, JavaDeclarationFilterPropertiesEditionPart {

	protected Text methodName;
	private FilterPropertiesPropertiesEditionPart filterPropertiesPropertiesEditionPart;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public JavaDeclarationFilterPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence javaDeclarationFilterStep = new BindingCompositionSequence(propertiesEditionComponent);
		javaDeclarationFilterStep
			.addStep(FiltersViewsRepository.JavaDeclarationFilter.FilterExpression.class)
			.addStep(FiltersViewsRepository.JavaDeclarationFilter.FilterExpression.methodName);
		
		javaDeclarationFilterStep.addStep(FiltersViewsRepository.JavaDeclarationFilter.filterProperties);
		
		composer = new PartComposer(javaDeclarationFilterStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == FiltersViewsRepository.JavaDeclarationFilter.FilterExpression.class) {
					return createFilterExpressionGroup(parent);
				}
				if (key == FiltersViewsRepository.JavaDeclarationFilter.FilterExpression.methodName) {
					return createMethodNameText(parent);
				}
				if (key == FiltersViewsRepository.JavaDeclarationFilter.filterProperties) {
					return createFilterProperties(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createFilterExpressionGroup(Composite parent) {
		Group filterExpressionGroup = new Group(parent, SWT.NONE);
		filterExpressionGroup.setText(FiltersMessages.JavaDeclarationFilterPropertiesEditionPart_FilterExpressionGroupLabel);
		GridData filterExpressionGroupData = new GridData(GridData.FILL_HORIZONTAL);
		filterExpressionGroupData.horizontalSpan = 3;
		filterExpressionGroup.setLayoutData(filterExpressionGroupData);
		GridLayout filterExpressionGroupLayout = new GridLayout();
		filterExpressionGroupLayout.numColumns = 3;
		filterExpressionGroup.setLayout(filterExpressionGroupLayout);
		return filterExpressionGroup;
	}

	
	protected Composite createMethodNameText(Composite parent) {
		createDescription(parent, FiltersViewsRepository.JavaDeclarationFilter.FilterExpression.methodName, FiltersMessages.JavaDeclarationFilterPropertiesEditionPart_MethodNameLabel);
		methodName = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData methodNameData = new GridData(GridData.FILL_HORIZONTAL);
		methodName.setLayoutData(methodNameData);
		methodName.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(JavaDeclarationFilterPropertiesEditionPartImpl.this, FiltersViewsRepository.JavaDeclarationFilter.FilterExpression.methodName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, methodName.getText()));
			}

		});
		methodName.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(JavaDeclarationFilterPropertiesEditionPartImpl.this, FiltersViewsRepository.JavaDeclarationFilter.FilterExpression.methodName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, methodName.getText()));
				}
			}

		});
		EditingUtils.setID(methodName, FiltersViewsRepository.JavaDeclarationFilter.FilterExpression.methodName);
		EditingUtils.setEEFtype(methodName, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(FiltersViewsRepository.JavaDeclarationFilter.FilterExpression.methodName, FiltersViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createMethodNameText

		// End of user code
		return parent;
	}

	protected Composite createFilterProperties(Composite container) {
		IPropertiesEditionPartProvider provider = PropertiesEditionPartProviderService.getInstance().getProvider(MappingViewsRepository.class);
		filterPropertiesPropertiesEditionPart = (FilterPropertiesPropertiesEditionPart)provider.getPropertiesEditionPart(MappingViewsRepository.FilterProperties.class, MappingViewsRepository.SWT_KIND, propertiesEditionComponent);
		((ISWTPropertiesEditionPart)filterPropertiesPropertiesEditionPart).createControls(container);
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
	 * @see org.eclipse.emf.eef.filters.parts.JavaDeclarationFilterPropertiesEditionPart#getMethodName()
	 * 
	 */
	public String getMethodName() {
		return methodName.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.JavaDeclarationFilterPropertiesEditionPart#setMethodName(String newValue)
	 * 
	 */
	public void setMethodName(String newValue) {
		if (newValue != null) {
			methodName.setText(newValue);
		} else {
			methodName.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(FiltersViewsRepository.JavaDeclarationFilter.FilterExpression.methodName);
		if (eefElementEditorReadOnlyState && methodName.isEnabled()) {
			methodName.setEnabled(false);
			methodName.setToolTipText(FiltersMessages.JavaDeclarationFilter_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !methodName.isEnabled()) {
			methodName.setEnabled(true);
		}	
		
	}


/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.JavaDeclarationFilterPropertiesEditionPart#getFilterPropertiesReferencedView()
	 * 
	 */
		public IPropertiesEditionPart getFilterPropertiesReferencedView() {
			return (IPropertiesEditionPart) filterPropertiesPropertiesEditionPart;
		}
	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.JavaDeclarationFilterPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return filterPropertiesPropertiesEditionPart.getName();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.JavaDeclarationFilterPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		filterPropertiesPropertiesEditionPart.setName(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.JavaDeclarationFilterPropertiesEditionPart#getMandatory()
	 * 
	 */
	public Boolean getMandatory() {
		return filterPropertiesPropertiesEditionPart.getMandatory();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.JavaDeclarationFilterPropertiesEditionPart#setMandatory(Boolean newValue)
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
		return FiltersMessages.JavaDeclarationFilter_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
