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
package org.eclipse.emf.eef.mapping.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.mapping.EMFElementBinding;
import org.eclipse.emf.eef.mapping.MappingPackage;
import org.eclipse.emf.eef.mapping.parts.EMFElementBindingPropertiesEditionPart;
import org.eclipse.emf.eef.mapping.parts.MappingViewsRepository;
import org.eclipse.emf.eef.runtime.api.notify.EStructuralFeatureNotificationFilter;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.notify.NotificationFilter;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.emf.eef.views.View;
import org.eclipse.emf.eef.views.ViewsPackage;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class EMFElementBindingBasePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for views ReferencesTable
	 */
	private ReferencesTableSettings viewsSettings;
	
	/**
	 * Settings for model EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings modelSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public EMFElementBindingBasePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject eMFElementBinding, String editing_mode) {
		super(editingContext, eMFElementBinding, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = MappingViewsRepository.class;
		partKey = MappingViewsRepository.EMFElementBinding.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(Object key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (editingPart != null && key == partKey) {
			editingPart.setContext(elt, allResource);
			final EMFElementBinding eMFElementBinding = (EMFElementBinding)elt;
			final EMFElementBindingPropertiesEditionPart basePart = (EMFElementBindingPropertiesEditionPart)editingPart;
			// init values
			if (eMFElementBinding.getName() != null && isAccessible(MappingViewsRepository.EMFElementBinding.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, eMFElementBinding.getName()));
			
			if (isAccessible(MappingViewsRepository.EMFElementBinding.Binding.views)) {
				viewsSettings = new ReferencesTableSettings(eMFElementBinding, MappingPackage.eINSTANCE.getAbstractElementBinding_Views());
				basePart.initViews(viewsSettings);
			}
			if (isAccessible(MappingViewsRepository.EMFElementBinding.Binding.model)) {
				// init part
				modelSettings = new EObjectFlatComboSettings(eMFElementBinding, MappingPackage.eINSTANCE.getEMFElementBinding_Model());
				basePart.initModel(modelSettings);
				// set the button mode
				basePart.setModelButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			
			if (isAccessible(MappingViewsRepository.EMFElementBinding.Binding.views)) {
				basePart.addFilterToViews(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInViewsTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToViews(new EObjectFilter(ViewsPackage.Literals.VIEW));
				// Start of user code for additional businessfilters for views
				
				// End of user code
			}
			if (isAccessible(MappingViewsRepository.EMFElementBinding.Binding.model)) {
				basePart.addFilterToModel(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof EClassifier);
					}
					
				});
				// Start of user code for additional businessfilters for model
				
				// End of user code
			}
			// init values for referenced views
			
			// init filters for referenced views
			
		}
		setInitializing(false);
	}






	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#associatedFeature(java.lang.Object)
	 */
	public EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == MappingViewsRepository.EMFElementBinding.Properties.name) {
			return MappingPackage.eINSTANCE.getAbstractElementBinding_Name();
		}
		if (editorKey == MappingViewsRepository.EMFElementBinding.Binding.views) {
			return MappingPackage.eINSTANCE.getAbstractElementBinding_Views();
		}
		if (editorKey == MappingViewsRepository.EMFElementBinding.Binding.model) {
			return MappingPackage.eINSTANCE.getEMFElementBinding_Model();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		EMFElementBinding eMFElementBinding = (EMFElementBinding)semanticObject;
		if (MappingViewsRepository.EMFElementBinding.Properties.name == event.getAffectedEditor()) {
			eMFElementBinding.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (MappingViewsRepository.EMFElementBinding.Binding.views == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof View) {
					viewsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				viewsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				viewsSettings.move(event.getNewIndex(), (View) event.getNewValue());
			}
		}
		if (MappingViewsRepository.EMFElementBinding.Binding.model == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				modelSettings.setToReference((EClassifier)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, modelSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			EMFElementBindingPropertiesEditionPart basePart = (EMFElementBindingPropertiesEditionPart)editingPart;
			if (MappingPackage.eINSTANCE.getAbstractElementBinding_Name().equals(msg.getFeature()) && basePart != null && isAccessible(MappingViewsRepository.EMFElementBinding.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (MappingPackage.eINSTANCE.getAbstractElementBinding_Views().equals(msg.getFeature())  && isAccessible(MappingViewsRepository.EMFElementBinding.Binding.views))
				basePart.updateViews();
			if (MappingPackage.eINSTANCE.getEMFElementBinding_Model().equals(msg.getFeature()) && basePart != null && isAccessible(MappingViewsRepository.EMFElementBinding.Binding.model))
				basePart.setModel((EObject)msg.getNewValue());
			
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#getNotificationFilters()
	 */
	@Override
	protected NotificationFilter[] getNotificationFilters() {
		NotificationFilter filter = new EStructuralFeatureNotificationFilter(
			MappingPackage.eINSTANCE.getAbstractElementBinding_Name(),
			MappingPackage.eINSTANCE.getAbstractElementBinding_Views(),
			MappingPackage.eINSTANCE.getEMFElementBinding_Model());
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == MappingViewsRepository.EMFElementBinding.Properties.name || key == MappingViewsRepository.EMFElementBinding.Binding.views || key == MappingViewsRepository.EMFElementBinding.Binding.model;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#getHelpContent(java.lang.Object, int)
	 * 
	 */
	public String getHelpContent(Object key, int kind) {
		if (key == MappingViewsRepository.EMFElementBinding.Properties.name)
			return "The name of this element binding"; //$NON-NLS-1$
		if (key == MappingViewsRepository.EMFElementBinding.Binding.views)
			return "The mapped views"; //$NON-NLS-1$
		if (key == MappingViewsRepository.EMFElementBinding.Binding.model)
			return "The mapped classifier"; //$NON-NLS-1$
		return super.getHelpContent(key, kind);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public Diagnostic validateValue(IPropertiesEditionEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			try {
				if (MappingViewsRepository.EMFElementBinding.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(MappingPackage.eINSTANCE.getAbstractElementBinding_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(MappingPackage.eINSTANCE.getAbstractElementBinding_Name().getEAttributeType(), newValue);
				}
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}

}
