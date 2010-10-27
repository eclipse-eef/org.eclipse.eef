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
package org.eclipse.emf.eef.eefnr.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.eef.eefnr.AbstractTableCompositionTargetExtensionEditorSample;
import org.eclipse.emf.eef.eefnr.EefnrPackage;
import org.eclipse.emf.eef.eefnr.parts.EefnrViewsRepository;
import org.eclipse.emf.eef.eefnr.parts.TableCompositionExtensionEditorSamplePropertiesEditionPart;
import org.eclipse.emf.eef.eefnr.providers.EefnrMessages;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.policies.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.policies.EReferencePropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.services.PropertiesEditionPolicyProviderService;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicyProvider;
import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;
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
public class TableCompositionExtensionEditorSamplePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, TableCompositionExtensionEditorSamplePropertiesEditionPart {

	protected Text name;
protected ReferencesTable<? extends EObject> tablecompositionRequiredProperty;
protected List<ViewerFilter> tablecompositionRequiredPropertyBusinessFilters = new ArrayList<ViewerFilter>();
protected List<ViewerFilter> tablecompositionRequiredPropertyFilters = new ArrayList<ViewerFilter>();
protected ReferencesTable<? extends EObject> tablecompositionOptionalProperty;
protected List<ViewerFilter> tablecompositionOptionalPropertyBusinessFilters = new ArrayList<ViewerFilter>();
protected List<ViewerFilter> tablecompositionOptionalPropertyFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public TableCompositionExtensionEditorSamplePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		createPropertiesGroup(view);


		// Start of user code for additional ui definition
		
		// End of user code
	}

	/**
	 * 
	 */
	protected void createPropertiesGroup(Composite parent) {
		Group propertiesGroup = new Group(parent, SWT.NONE);
		propertiesGroup.setText(EefnrMessages.TableCompositionExtensionEditorSamplePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		createNameText(propertiesGroup);
createTablecompositionRequiredPropertyAdvancedTableComposition(propertiesGroup);
createTablecompositionOptionalPropertyAdvancedTableComposition(propertiesGroup);
	}

	
	protected void createNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, EefnrMessages.TableCompositionExtensionEditorSamplePropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(EefnrViewsRepository.TableCompositionExtensionEditorSample.name, EefnrViewsRepository.SWT_KIND));
		name = new Text(parent, SWT.BORDER);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TableCompositionExtensionEditorSamplePropertiesEditionPartImpl.this, EefnrViewsRepository.TableCompositionExtensionEditorSample.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TableCompositionExtensionEditorSamplePropertiesEditionPartImpl.this, EefnrViewsRepository.TableCompositionExtensionEditorSample.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, EefnrViewsRepository.TableCompositionExtensionEditorSample.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EefnrViewsRepository.TableCompositionExtensionEditorSample.name, EefnrViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	/**
	 * @param container
	 * 
	 */
	protected void createTablecompositionRequiredPropertyAdvancedTableComposition(Composite parent) {
		this.tablecompositionRequiredProperty = new ReferencesTable<AbstractTableCompositionTargetExtensionEditorSample>(EefnrMessages.TableCompositionExtensionEditorSamplePropertiesEditionPart_TablecompositionRequiredPropertyLabel, new ReferencesTableListener<AbstractTableCompositionTargetExtensionEditorSample>() {			
			public void handleAdd() { addToTablecompositionRequiredProperty();}
			public void handleEdit(AbstractTableCompositionTargetExtensionEditorSample element) { editTablecompositionRequiredProperty(element); }
			public void handleMove(AbstractTableCompositionTargetExtensionEditorSample element, int oldIndex, int newIndex) { moveTablecompositionRequiredProperty(element, oldIndex, newIndex); }
			public void handleRemove(AbstractTableCompositionTargetExtensionEditorSample element) { removeFromTablecompositionRequiredProperty(element); }
			public void navigateTo(AbstractTableCompositionTargetExtensionEditorSample element) { }
		});
		this.tablecompositionRequiredProperty.setHelpText(propertiesEditionComponent.getHelpContent(EefnrViewsRepository.TableCompositionExtensionEditorSample.tablecompositionRequiredProperty, EefnrViewsRepository.SWT_KIND));
		this.tablecompositionRequiredProperty.createControls(parent);
		GridData tablecompositionRequiredPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		tablecompositionRequiredPropertyData.horizontalSpan = 3;
		this.tablecompositionRequiredProperty.setLayoutData(tablecompositionRequiredPropertyData);
		this.tablecompositionRequiredProperty.setLowerBound(1);
		this.tablecompositionRequiredProperty.setUpperBound(-1);
		tablecompositionRequiredProperty.setID(EefnrViewsRepository.TableCompositionExtensionEditorSample.tablecompositionRequiredProperty);
		tablecompositionRequiredProperty.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
	}

	/**
	 *  
	 */
	protected void moveTablecompositionRequiredProperty(AbstractTableCompositionTargetExtensionEditorSample element, int oldIndex, int newIndex) {
	}

	/**
	 *  
	 */
	protected void addToTablecompositionRequiredProperty() {
		EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(propertiesEditionComponent, current, EefnrPackage.eINSTANCE.getTableCompositionExtensionEditorSample_TablecompositionRequiredProperty(), resourceSet);
		PropertiesEditingPolicyProvider provider = PropertiesEditionPolicyProviderService.getInstance().getProvider(context);
		PropertiesEditingPolicy policy = provider.getPolicy(context);
		if (policy instanceof CreateEditingPolicy) {
			policy.execute();
			EObject resultEObject = (EObject) ((CreateEditingPolicy) policy).getResult();
			if (resultEObject != null) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TableCompositionExtensionEditorSamplePropertiesEditionPartImpl.this, EefnrViewsRepository.TableCompositionExtensionEditorSample.tablecompositionRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, resultEObject));
				tablecompositionRequiredProperty.refresh();
			}
		}
		
	}

	/**
	 *  
	 */
	protected void removeFromTablecompositionRequiredProperty(AbstractTableCompositionTargetExtensionEditorSample element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TableCompositionExtensionEditorSamplePropertiesEditionPartImpl.this, EefnrViewsRepository.TableCompositionExtensionEditorSample.tablecompositionRequiredProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				tablecompositionRequiredProperty.refresh();
		
	}

	/**
	 *  
	 */
	protected void editTablecompositionRequiredProperty(AbstractTableCompositionTargetExtensionEditorSample element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(null, element,resourceSet);
		PropertiesEditingPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(context);
		PropertiesEditingPolicy editionPolicy = policyProvider.getPolicy(context);
		if (editionPolicy != null) {
			editionPolicy.execute();
			tablecompositionRequiredProperty.refresh();
		}
	}

	/**
	 * @param container
	 * 
	 */
	protected void createTablecompositionOptionalPropertyAdvancedTableComposition(Composite parent) {
		this.tablecompositionOptionalProperty = new ReferencesTable<AbstractTableCompositionTargetExtensionEditorSample>(EefnrMessages.TableCompositionExtensionEditorSamplePropertiesEditionPart_TablecompositionOptionalPropertyLabel, new ReferencesTableListener<AbstractTableCompositionTargetExtensionEditorSample>() {			
			public void handleAdd() { addToTablecompositionOptionalProperty();}
			public void handleEdit(AbstractTableCompositionTargetExtensionEditorSample element) { editTablecompositionOptionalProperty(element); }
			public void handleMove(AbstractTableCompositionTargetExtensionEditorSample element, int oldIndex, int newIndex) { moveTablecompositionOptionalProperty(element, oldIndex, newIndex); }
			public void handleRemove(AbstractTableCompositionTargetExtensionEditorSample element) { removeFromTablecompositionOptionalProperty(element); }
			public void navigateTo(AbstractTableCompositionTargetExtensionEditorSample element) { }
		});
		this.tablecompositionOptionalProperty.setHelpText(propertiesEditionComponent.getHelpContent(EefnrViewsRepository.TableCompositionExtensionEditorSample.tablecompositionOptionalProperty, EefnrViewsRepository.SWT_KIND));
		this.tablecompositionOptionalProperty.createControls(parent);
		GridData tablecompositionOptionalPropertyData = new GridData(GridData.FILL_HORIZONTAL);
		tablecompositionOptionalPropertyData.horizontalSpan = 3;
		this.tablecompositionOptionalProperty.setLayoutData(tablecompositionOptionalPropertyData);
		this.tablecompositionOptionalProperty.setLowerBound(0);
		this.tablecompositionOptionalProperty.setUpperBound(-1);
		tablecompositionOptionalProperty.setID(EefnrViewsRepository.TableCompositionExtensionEditorSample.tablecompositionOptionalProperty);
		tablecompositionOptionalProperty.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
	}

	/**
	 *  
	 */
	protected void moveTablecompositionOptionalProperty(AbstractTableCompositionTargetExtensionEditorSample element, int oldIndex, int newIndex) {
	}

	/**
	 *  
	 */
	protected void addToTablecompositionOptionalProperty() {
		EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(propertiesEditionComponent, current, EefnrPackage.eINSTANCE.getTableCompositionExtensionEditorSample_TablecompositionOptionalProperty(), resourceSet);
		PropertiesEditingPolicyProvider provider = PropertiesEditionPolicyProviderService.getInstance().getProvider(context);
		PropertiesEditingPolicy policy = provider.getPolicy(context);
		if (policy instanceof CreateEditingPolicy) {
			policy.execute();
			EObject resultEObject = (EObject) ((CreateEditingPolicy) policy).getResult();
			if (resultEObject != null) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TableCompositionExtensionEditorSamplePropertiesEditionPartImpl.this, EefnrViewsRepository.TableCompositionExtensionEditorSample.tablecompositionOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, resultEObject));
				tablecompositionOptionalProperty.refresh();
			}
		}
		
	}

	/**
	 *  
	 */
	protected void removeFromTablecompositionOptionalProperty(AbstractTableCompositionTargetExtensionEditorSample element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TableCompositionExtensionEditorSamplePropertiesEditionPartImpl.this, EefnrViewsRepository.TableCompositionExtensionEditorSample.tablecompositionOptionalProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				tablecompositionOptionalProperty.refresh();
		
	}

	/**
	 *  
	 */
	protected void editTablecompositionOptionalProperty(AbstractTableCompositionTargetExtensionEditorSample element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(null, element,resourceSet);
		PropertiesEditingPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(context);
		PropertiesEditingPolicy editionPolicy = policyProvider.getPolicy(context);
		if (editionPolicy != null) {
			editionPolicy.execute();
			tablecompositionOptionalProperty.refresh();
		}
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
	 * @see org.eclipse.emf.eef.eefnr.parts.TableCompositionExtensionEditorSamplePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TableCompositionExtensionEditorSamplePropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TableCompositionExtensionEditorSamplePropertiesEditionPart#initTablecompositionRequiredProperty(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initTablecompositionRequiredProperty(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		tablecompositionRequiredProperty.setContentProvider(contentProvider);
		tablecompositionRequiredProperty.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TableCompositionExtensionEditorSamplePropertiesEditionPart#updateTablecompositionRequiredProperty()
	 * 
	 */
	public void updateTablecompositionRequiredProperty() {
	tablecompositionRequiredProperty.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TableCompositionExtensionEditorSamplePropertiesEditionPart#addFilterTablecompositionRequiredProperty(ViewerFilter filter)
	 * 
	 */
	public void addFilterToTablecompositionRequiredProperty(ViewerFilter filter) {
		tablecompositionRequiredPropertyFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TableCompositionExtensionEditorSamplePropertiesEditionPart#addBusinessFilterTablecompositionRequiredProperty(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToTablecompositionRequiredProperty(ViewerFilter filter) {
		tablecompositionRequiredPropertyBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TableCompositionExtensionEditorSamplePropertiesEditionPart#isContainedInTablecompositionRequiredPropertyTable(EObject element)
	 * 
	 */
	public boolean isContainedInTablecompositionRequiredPropertyTable(EObject element) {
		return ((ReferencesTableSettings)tablecompositionRequiredProperty.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TableCompositionExtensionEditorSamplePropertiesEditionPart#initTablecompositionOptionalProperty(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initTablecompositionOptionalProperty(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		tablecompositionOptionalProperty.setContentProvider(contentProvider);
		tablecompositionOptionalProperty.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TableCompositionExtensionEditorSamplePropertiesEditionPart#updateTablecompositionOptionalProperty()
	 * 
	 */
	public void updateTablecompositionOptionalProperty() {
	tablecompositionOptionalProperty.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TableCompositionExtensionEditorSamplePropertiesEditionPart#addFilterTablecompositionOptionalProperty(ViewerFilter filter)
	 * 
	 */
	public void addFilterToTablecompositionOptionalProperty(ViewerFilter filter) {
		tablecompositionOptionalPropertyFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TableCompositionExtensionEditorSamplePropertiesEditionPart#addBusinessFilterTablecompositionOptionalProperty(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToTablecompositionOptionalProperty(ViewerFilter filter) {
		tablecompositionOptionalPropertyBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.eefnr.parts.TableCompositionExtensionEditorSamplePropertiesEditionPart#isContainedInTablecompositionOptionalPropertyTable(EObject element)
	 * 
	 */
	public boolean isContainedInTablecompositionOptionalPropertyTable(EObject element) {
		return ((ReferencesTableSettings)tablecompositionOptionalProperty.getInput()).contains(element);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EefnrMessages.TableCompositionExtensionEditorSample_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
