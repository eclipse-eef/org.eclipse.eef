/*******************************************************************************
 * Copyright (c) 2009 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.samples.conference.components;

// Start of user code for imports

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.emf.samples.conference.Conference;
import org.eclipse.emf.samples.conference.ConferencePackage;
import org.eclipse.emf.samples.conference.Site;
import org.eclipse.emf.samples.conference.parts.ConferencePropertiesEditionPart;
import org.eclipse.emf.samples.conference.parts.ConferenceViewsRepository;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

// End of user code

/**
 * @author <a href="mailto:stephane.bouchet@obeo.fr">Stephane Bouchet</a>
 * 
 */
public class ConferencePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for sites ReferencesTable
	 */
	private	ReferencesTableSettings sitesSettings;
	
	/**
	 * Default constructor
	 * 
	 */
	public ConferencePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject conference, String editing_mode) {
		super(editingContext, conference, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ConferenceViewsRepository.class;
		partKey = ConferenceViewsRepository.Conference_.class;
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
			final Conference conference = (Conference)elt;
			final ConferencePropertiesEditionPart basePart = (ConferencePropertiesEditionPart)editingPart;
			// init values
			if (conference.getPlace() != null)
				basePart.setPlace(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), conference.getPlace()));
			
			sitesSettings = new ReferencesTableSettings(conference, ConferencePackage.eINSTANCE.getConference_Sites());
			basePart.initSites(sitesSettings);
			if (conference.getName() != null)
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), conference.getName()));
			
			if (conference.getOverview() != null)
				basePart.setOverview(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), conference.getOverview()));
			
			// init filters
			
			basePart.addFilterToSites(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Site); //$NON-NLS-1$ 
					}
			
			});
			// Start of user code for additional businessfilters for sites
																																							
																																							// End of user code
			
			
			
			// init values for referenced views
			
			// init filters for referenced views
			
		}
		setInitializing(false);
	}







	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Conference conference = (Conference)semanticObject;
		if (ConferenceViewsRepository.Conference_.Localisation.place == event.getAffectedEditor()) {
			conference.setPlace((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ConferenceViewsRepository.Conference_.Localisation.sites == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD)  {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, semanticObject, ConferencePackage.eINSTANCE.getConference_Sites(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
						EObject resultEObject = (EObject) ((CreateEditingPolicy) policy).getResult();
						if (resultEObject != null) {
							sitesSettings.addToReference(resultEObject);
						}
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
					sitesSettings.removeFromReference((EObject) event.getNewValue());
			}
		}
		if (ConferenceViewsRepository.Conference_.Properties.name == event.getAffectedEditor()) {
			conference.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ConferenceViewsRepository.Conference_.Properties.overview == event.getAffectedEditor()) {
			conference.setOverview((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		ConferencePropertiesEditionPart basePart = (ConferencePropertiesEditionPart)editingPart;
		if (ConferencePackage.eINSTANCE.getConference_Place().equals(msg.getFeature()) && basePart != null){
			if (msg.getNewValue() != null) {
				basePart.setPlace(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
			} else {
				basePart.setPlace("");
			}
		}
		if (ConferencePackage.eINSTANCE.getConference_Sites().equals(msg.getFeature()))
			basePart.updateSites();
		if (ConferencePackage.eINSTANCE.getConference_Name().equals(msg.getFeature()) && basePart != null){
			if (msg.getNewValue() != null) {
				basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
			} else {
				basePart.setName("");
			}
		}
		if (ConferencePackage.eINSTANCE.getConference_Overview().equals(msg.getFeature()) && basePart != null){
			if (msg.getNewValue() != null) {
				basePart.setOverview(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
			} else {
				basePart.setOverview("");
			}
		}
		
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == ConferenceViewsRepository.Conference_.Localisation.place || key == ConferenceViewsRepository.Conference_.Properties.name;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#getHelpContent(java.lang.Object, int)
	 * 
	 */
	public String getHelpContent(Object key, int kind) {
		if (key == ConferenceViewsRepository.Conference_.Localisation.place)
			return "The conference's place"; //$NON-NLS-1$
		if (key == ConferenceViewsRepository.Conference_.Localisation.sites)
			return "Where the conference take place"; //$NON-NLS-1$
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
				if (ConferenceViewsRepository.Conference_.Localisation.place == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ConferencePackage.eINSTANCE.getConference_Place().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ConferencePackage.eINSTANCE.getConference_Place().getEAttributeType(), newValue);
				}
				if (ConferenceViewsRepository.Conference_.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ConferencePackage.eINSTANCE.getConference_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ConferencePackage.eINSTANCE.getConference_Name().getEAttributeType(), newValue);
				}
				if (ConferenceViewsRepository.Conference_.Properties.overview == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ConferencePackage.eINSTANCE.getConference_Overview().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ConferencePackage.eINSTANCE.getConference_Overview().getEAttributeType(), newValue);
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
