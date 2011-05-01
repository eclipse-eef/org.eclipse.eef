/*******************************************************************************
 * Copyright (c) 2008, 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.mapping.parts.impl;

// Start of user code for imports

import org.eclipse.emf.eef.mapping.parts.FilterPropertiesPropertiesEditionPart;
import org.eclipse.emf.eef.mapping.parts.JavaDeclarationFilterPropertiesEditionPart;
import org.eclipse.emf.eef.mapping.parts.MappingViewsRepository;
import org.eclipse.emf.eef.mapping.providers.MappingMessages;
import org.eclipse.emf.eef.runtime.components.PropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.notify.PropertiesEditingEvent;
import org.eclipse.emf.eef.runtime.notify.impl.PropertiesEditingEventImpl;
import org.eclipse.emf.eef.runtime.parts.PropertiesEditingPart;
import org.eclipse.emf.eef.runtime.parts.SWTPropertiesEditingPart;
import org.eclipse.emf.eef.runtime.parts.impl.CompositePropertiesEditingPart;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingPartProvider;
import org.eclipse.emf.eef.runtime.services.PropertiesEditingPartProviderService;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
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
public class JavaDeclarationFilterPropertiesEditionPartImpl extends CompositePropertiesEditingPart implements SWTPropertiesEditingPart, JavaDeclarationFilterPropertiesEditionPart {

	protected Text methodName;
	private FilterPropertiesPropertiesEditionPart filterPropertiesPropertiesEditionPart;



	/**
	 * Default constructor
	 * @param editionComponent the {@link PropertiesEditingComponent} that manage this part
	 * 
	 */
	public JavaDeclarationFilterPropertiesEditionPartImpl(PropertiesEditingComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.parts.SWTPropertiesEditingPart#
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
	 * @see org.eclipse.emf.eef.runtime.parts.SWTPropertiesEditingPart#
	 * 			createControls(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(Composite view) { 
		CompositionSequence javaDeclarationFilterStep = new CompositionSequence();
		javaDeclarationFilterStep
			.addStep(MappingViewsRepository.JavaDeclarationFilter.FilterExpression.class)
			.addStep(MappingViewsRepository.JavaDeclarationFilter.FilterExpression.methodName);
		
		javaDeclarationFilterStep.addStep(MappingViewsRepository.JavaDeclarationFilter.filterProperties);
		
		composer = new PartComposer(javaDeclarationFilterStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == MappingViewsRepository.JavaDeclarationFilter.FilterExpression.class) {
					return createFilterExpressionGroup(parent);
				}
				if (key == MappingViewsRepository.JavaDeclarationFilter.FilterExpression.methodName) {
					return createMethodNameText(parent);
				}
				if (key == MappingViewsRepository.JavaDeclarationFilter.filterProperties) {
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
		filterExpressionGroup.setText(MappingMessages.JavaDeclarationFilterPropertiesEditionPart_FilterExpressionGroupLabel);
		GridData filterExpressionGroupData = new GridData(GridData.FILL_HORIZONTAL);
		filterExpressionGroupData.horizontalSpan = 3;
		filterExpressionGroup.setLayoutData(filterExpressionGroupData);
		GridLayout filterExpressionGroupLayout = new GridLayout();
		filterExpressionGroupLayout.numColumns = 3;
		filterExpressionGroup.setLayout(filterExpressionGroupLayout);
		return filterExpressionGroup;
	}

	
	protected Composite createMethodNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, MappingMessages.JavaDeclarationFilterPropertiesEditionPart_MethodNameLabel, propertiesEditingComponent.isRequired(MappingViewsRepository.JavaDeclarationFilter.FilterExpression.methodName, MappingViewsRepository.SWT_KIND));
		methodName = new Text(parent, SWT.BORDER);
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
				if (propertiesEditingComponent != null)
					propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(JavaDeclarationFilterPropertiesEditionPartImpl.this, MappingViewsRepository.JavaDeclarationFilter.FilterExpression.methodName, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, methodName.getText()));
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
					if (propertiesEditingComponent != null)
						propertiesEditingComponent.firePropertiesChanged(new PropertiesEditingEventImpl(JavaDeclarationFilterPropertiesEditionPartImpl.this, MappingViewsRepository.JavaDeclarationFilter.FilterExpression.methodName, PropertiesEditingEventImpl.COMMIT, PropertiesEditingEventImpl.SET, null, methodName.getText()));
				}
			}

		});
		EditingUtils.setID(methodName, MappingViewsRepository.JavaDeclarationFilter.FilterExpression.methodName);
		EditingUtils.setEEFtype(methodName, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditingComponent.getHelpContent(MappingViewsRepository.JavaDeclarationFilter.FilterExpression.methodName, MappingViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	protected Composite createFilterProperties(Composite container) {
		PropertiesEditingPartProvider provider = PropertiesEditingPartProviderService.getInstance().getProvider(MappingViewsRepository.class);
		filterPropertiesPropertiesEditionPart = (FilterPropertiesPropertiesEditionPart)provider.getPropertiesEditingPart(MappingViewsRepository.FilterProperties.class, MappingViewsRepository.SWT_KIND, propertiesEditingComponent);
		((SWTPropertiesEditingPart)filterPropertiesPropertiesEditionPart).createControls(container);
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
	}


/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.JavaDeclarationFilterPropertiesEditionPart#getFilterPropertiesReferencedView()
	 * 
	 */
		public PropertiesEditingPart getFilterPropertiesReferencedView() {
			return (PropertiesEditingPart) filterPropertiesPropertiesEditionPart;
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
	 * @see org.eclipse.emf.eef.runtime.parts.PropertiesEditingPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return MappingMessages.JavaDeclarationFilter_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
