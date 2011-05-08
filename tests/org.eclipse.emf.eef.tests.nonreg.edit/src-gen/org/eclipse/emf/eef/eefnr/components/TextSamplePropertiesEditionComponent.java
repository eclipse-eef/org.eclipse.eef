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
package org.eclipse.emf.eef.eefnr.components;

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
import org.eclipse.emf.eef.eefnr.EefnrPackage;
import org.eclipse.emf.eef.eefnr.TextSample;
import org.eclipse.emf.eef.eefnr.parts.EefnrViewsRepository;
import org.eclipse.emf.eef.eefnr.parts.TextSamplePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.components.impl.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.notify.PropertiesEditingEvent;
import org.eclipse.emf.eef.runtime.util.EEFConverterUtil;
	

// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class TextSamplePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Default constructor
	 * 
	 */
	public TextSamplePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject textSample, String editing_mode) {
		super(editingContext, textSample, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = EefnrViewsRepository.class;
		partKey = EefnrViewsRepository.TextSample.class;
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
			final TextSample textSample = (TextSample)elt;
			final TextSamplePropertiesEditionPart basePart = (TextSamplePropertiesEditionPart)editingPart;
			// init values
			if (textSample.getTextRequiredProperty() != null)
				basePart.setTextRequiredProperty(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), textSample.getTextRequiredProperty()));
			
			if (textSample.getTextOptionalProperty() != null)
				basePart.setTextOptionalProperty(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), textSample.getTextOptionalProperty()));
			
			// init filters
			
			
			// init values for referenced views
			
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
		TextSample textSample = (TextSample)semanticObject;
		if (EefnrViewsRepository.TextSample.Properties.textRequiredProperty == event.getAffectedEditor()) {
			textSample.setTextRequiredProperty((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (EefnrViewsRepository.TextSample.Properties.textOptionalProperty == event.getAffectedEditor()) {
			textSample.setTextOptionalProperty((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.components.impl.StandardPropertiesEditingComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			TextSamplePropertiesEditionPart basePart = (TextSamplePropertiesEditionPart)editingPart;
			if (EefnrPackage.eINSTANCE.getTextSample_TextRequiredProperty().equals(msg.getFeature()) && basePart != null){
				if (msg.getNewValue() != null) {
					basePart.setTextRequiredProperty(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setTextRequiredProperty("");
				}
			}
			if (EefnrPackage.eINSTANCE.getTextSample_TextOptionalProperty().equals(msg.getFeature()) && basePart != null){
				if (msg.getNewValue() != null) {
					basePart.setTextOptionalProperty(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setTextOptionalProperty("");
				}
			}
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.components.impl.StandardPropertiesEditingComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == EefnrViewsRepository.TextSample.Properties.textRequiredProperty;
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
				if (EefnrViewsRepository.TextSample.Properties.textRequiredProperty == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(EefnrPackage.eINSTANCE.getTextSample_TextRequiredProperty().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EefnrPackage.eINSTANCE.getTextSample_TextRequiredProperty().getEAttributeType(), newValue);
				}
				if (EefnrViewsRepository.TextSample.Properties.textOptionalProperty == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(EefnrPackage.eINSTANCE.getTextSample_TextOptionalProperty().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EefnrPackage.eINSTANCE.getTextSample_TextOptionalProperty().getEAttributeType(), newValue);
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
