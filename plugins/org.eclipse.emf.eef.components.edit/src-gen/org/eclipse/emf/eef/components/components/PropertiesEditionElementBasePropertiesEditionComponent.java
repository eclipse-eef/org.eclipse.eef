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
package org.eclipse.emf.eef.components.components;

// Start of user code for imports

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.components.ComponentsPackage;
import org.eclipse.emf.eef.components.PropertiesEditionElement;
import org.eclipse.emf.eef.components.parts.ComponentsViewsRepository;
import org.eclipse.emf.eef.components.parts.PropertiesEditionElementPropertiesEditionPart;
import org.eclipse.emf.eef.mapping.MappingPackage;
import org.eclipse.emf.eef.runtime.api.notify.EStructuralFeatureNotificationFilter;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.notify.NotificationFilter;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.filters.EObjectStrictFilter;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.impl.utils.EEFUtils;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.emf.eef.views.ElementEditor;
import org.eclipse.emf.eef.views.ViewsPackage;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class PropertiesEditionElementBasePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
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
	public PropertiesEditionElementBasePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject propertiesEditionElement, String editing_mode) {
		super(editingContext, propertiesEditionElement, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ComponentsViewsRepository.class;
		partKey = ComponentsViewsRepository.PropertiesEditionElement.class;
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
			
			final PropertiesEditionElement propertiesEditionElement = (PropertiesEditionElement)elt;
			final PropertiesEditionElementPropertiesEditionPart basePart = (PropertiesEditionElementPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(ComponentsViewsRepository.PropertiesEditionElement.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, propertiesEditionElement.getName()));
			
			if (isAccessible(ComponentsViewsRepository.PropertiesEditionElement.Binding.views)) {
				viewsSettings = new ReferencesTableSettings(propertiesEditionElement, MappingPackage.eINSTANCE.getAbstractPropertyBinding_Views());
				basePart.initViews(viewsSettings);
			}
			if (isAccessible(ComponentsViewsRepository.PropertiesEditionElement.Binding.model)) {
				// init part
				modelSettings = new EObjectFlatComboSettings(propertiesEditionElement, MappingPackage.eINSTANCE.getEMFPropertyBinding_Model());
				basePart.initModel(modelSettings);
				// set the button mode
				basePart.setModelButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(ComponentsViewsRepository.PropertiesEditionElement.Properties.helpID))
				basePart.setHelpID(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, propertiesEditionElement.getHelpID()));
			
			// init filters
			
			if (isAccessible(ComponentsViewsRepository.PropertiesEditionElement.Binding.views)) {
				basePart.addFilterToViews(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInViewsTable((EObject)element));
						return false;
					}
				
				});
				basePart.addFilterToViews(new EObjectStrictFilter(ViewsPackage.Literals.ELEMENT_EDITOR));
							basePart.addFilterToViews(new ViewerFilter() {
				
								/**
								 * {@inheritDoc}
								 * 
								 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
								 */
								public boolean select(Viewer viewer, Object parentElement, Object element) {
									Object result = EEFUtils.choiceOfValues(PropertiesEditionElementBasePropertiesEditionComponent.this.semanticObject, MappingPackage.eINSTANCE.getAbstractPropertyBinding_Views());
									if (result instanceof Collection) {
										return ((Collection)result).contains(element);
									} else if (result instanceof ResourceSet && element instanceof EObject) {
										return ((EObject)element).eResource() != null && ((EObject)element).eResource().getResourceSet() != null && ((EObject)element).eResource().getResourceSet().equals(result);
									}
									return element instanceof Resource;
								}
							});
				// Start of user code for additional businessfilters for views
				
				// End of user code
			}
			if (isAccessible(ComponentsViewsRepository.PropertiesEditionElement.Binding.model)) {
				basePart.addFilterToModel(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof EStructuralFeature);
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
		if (editorKey == ComponentsViewsRepository.PropertiesEditionElement.Properties.name) {
			return MappingPackage.eINSTANCE.getAbstractPropertyBinding_Name();
		}
		if (editorKey == ComponentsViewsRepository.PropertiesEditionElement.Binding.views) {
			return MappingPackage.eINSTANCE.getAbstractPropertyBinding_Views();
		}
		if (editorKey == ComponentsViewsRepository.PropertiesEditionElement.Binding.model) {
			return MappingPackage.eINSTANCE.getEMFPropertyBinding_Model();
		}
		if (editorKey == ComponentsViewsRepository.PropertiesEditionElement.Properties.helpID) {
			return ComponentsPackage.eINSTANCE.getEEFElement_HelpID();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		PropertiesEditionElement propertiesEditionElement = (PropertiesEditionElement)semanticObject;
		if (ComponentsViewsRepository.PropertiesEditionElement.Properties.name == event.getAffectedEditor()) {
			propertiesEditionElement.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (ComponentsViewsRepository.PropertiesEditionElement.Binding.views == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof ElementEditor) {
					viewsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				viewsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				viewsSettings.move(event.getNewIndex(), (ElementEditor) event.getNewValue());
			}
		}
		if (ComponentsViewsRepository.PropertiesEditionElement.Binding.model == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				modelSettings.setToReference((EStructuralFeature)event.getNewValue());
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
		if (ComponentsViewsRepository.PropertiesEditionElement.Properties.helpID == event.getAffectedEditor()) {
			propertiesEditionElement.setHelpID((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			PropertiesEditionElementPropertiesEditionPart basePart = (PropertiesEditionElementPropertiesEditionPart)editingPart;
			if (MappingPackage.eINSTANCE.getAbstractPropertyBinding_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(ComponentsViewsRepository.PropertiesEditionElement.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (MappingPackage.eINSTANCE.getAbstractPropertyBinding_Views().equals(msg.getFeature())  && isAccessible(ComponentsViewsRepository.PropertiesEditionElement.Binding.views))
				basePart.updateViews();
			if (MappingPackage.eINSTANCE.getEMFPropertyBinding_Model().equals(msg.getFeature()) && basePart != null && isAccessible(ComponentsViewsRepository.PropertiesEditionElement.Binding.model))
				basePart.setModel((EObject)msg.getNewValue());
			if (ComponentsPackage.eINSTANCE.getEEFElement_HelpID().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(ComponentsViewsRepository.PropertiesEditionElement.Properties.helpID)) {
				if (msg.getNewValue() != null) {
					basePart.setHelpID(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setHelpID("");
				}
			}
			
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
			MappingPackage.eINSTANCE.getAbstractPropertyBinding_Name(),
			MappingPackage.eINSTANCE.getAbstractPropertyBinding_Views(),
			MappingPackage.eINSTANCE.getEMFPropertyBinding_Model(),
			ComponentsPackage.eINSTANCE.getEEFElement_HelpID()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == ComponentsViewsRepository.PropertiesEditionElement.Properties.name || key == ComponentsViewsRepository.PropertiesEditionElement.Binding.views || key == ComponentsViewsRepository.PropertiesEditionElement.Binding.model;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#getHelpContent(java.lang.Object, int)
	 * 
	 */
	public String getHelpContent(Object key, int kind) {
		if (key == ComponentsViewsRepository.PropertiesEditionElement.Properties.name)
			return "The name of this property binding"; //$NON-NLS-1$
		if (key == ComponentsViewsRepository.PropertiesEditionElement.Binding.views)
			return "The mapped views"; //$NON-NLS-1$
		if (key == ComponentsViewsRepository.PropertiesEditionElement.Binding.model)
			return "The mapped structural feature"; //$NON-NLS-1$
		if (key == ComponentsViewsRepository.PropertiesEditionElement.Properties.helpID)
			return "The ID of the dynamic help associated to this element (not implemented for the moment)"; //$NON-NLS-1$
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
				if (ComponentsViewsRepository.PropertiesEditionElement.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(MappingPackage.eINSTANCE.getAbstractPropertyBinding_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(MappingPackage.eINSTANCE.getAbstractPropertyBinding_Name().getEAttributeType(), newValue);
				}
				if (ComponentsViewsRepository.PropertiesEditionElement.Properties.helpID == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ComponentsPackage.eINSTANCE.getEEFElement_HelpID().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ComponentsPackage.eINSTANCE.getEEFElement_HelpID().getEAttributeType(), newValue);
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
