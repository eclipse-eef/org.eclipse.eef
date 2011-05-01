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
package org.eclipse.emf.eef.navigation.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.eefnr.navigation.AnotherSubType;
import org.eclipse.emf.eef.eefnr.navigation.NavigationPackage;
import org.eclipse.emf.eef.eefnr.navigation.parts.AnotherSubtypePropertiesEditionPart;
import org.eclipse.emf.eef.eefnr.navigation.parts.NavigationViewsRepository;
import org.eclipse.emf.eef.runtime.components.impl.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.notify.PropertiesEditingEvent;
	

// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class AnotherSubtypeBasePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Default constructor
	 * 
	 */
	public AnotherSubtypeBasePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject anotherSubType, String editing_mode) {
		super(editingContext, anotherSubType, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = NavigationViewsRepository.class;
		partKey = NavigationViewsRepository.AnotherSubtype.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.components.PropertiesEditingComponent#initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(Object key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (editingPart != null && key == partKey) {
			editingPart.setContext(elt, allResource);
			final AnotherSubType anotherSubType = (AnotherSubType)elt;
			final AnotherSubtypePropertiesEditionPart basePart = (AnotherSubtypePropertiesEditionPart)editingPart;
			// init values
			basePart.setAnotherSpecialisationElement(anotherSubType.isAnotherSpecialisation());
			
			// init filters
			
			// init values for referenced views
					basePart.getSubtypeReferencedView().setContext(elt, allResource);
			
			// init filters for referenced views
			
			
		}
		setInitializing(false);
	}





	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.components.impl.StandardPropertiesEditingComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.notify.PropertiesEditingEvent)
	 * 
	 */
	public void updateSemanticModel(final PropertiesEditingEvent event) {
		AnotherSubType anotherSubType = (AnotherSubType)semanticObject;
		if (NavigationViewsRepository.AnotherSubtype.AnotherSpecialisation.anotherSpecialisationElement == event.getAffectedEditor()) {
			anotherSubType.setAnotherSpecialisation((Boolean)event.getNewValue());
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.components.impl.StandardPropertiesEditingComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			AnotherSubtypePropertiesEditionPart basePart = (AnotherSubtypePropertiesEditionPart)editingPart;
			if (NavigationPackage.eINSTANCE.getAnotherSubType_AnotherSpecialisation().equals(msg.getFeature()) && basePart != null)
				basePart.setAnotherSpecialisationElement((Boolean)msg.getNewValue());
			
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.components.PropertiesEditingComponent#validateValue(org.eclipse.emf.eef.runtime.notify.PropertiesEditingEvent)
	 * 
	 */
	public Diagnostic validateValue(PropertiesEditingEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			try {
				if (NavigationViewsRepository.AnotherSubtype.AnotherSpecialisation.anotherSpecialisationElement == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(NavigationPackage.eINSTANCE.getAnotherSubType_AnotherSpecialisation().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(NavigationPackage.eINSTANCE.getAnotherSubType_AnotherSpecialisation().getEAttributeType(), newValue);
				}
				if (NavigationViewsRepository.Subtype.Specialisation.specialisedElement == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(NavigationPackage.eINSTANCE.getSubtype_SpecialisedElement().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(NavigationPackage.eINSTANCE.getSubtype_SpecialisedElement().getEAttributeType(), newValue);
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
