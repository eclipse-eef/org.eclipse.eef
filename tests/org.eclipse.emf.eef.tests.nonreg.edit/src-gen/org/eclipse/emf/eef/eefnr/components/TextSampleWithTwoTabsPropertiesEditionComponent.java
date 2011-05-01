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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.eef.eefnr.TextSampleWithTwoTabs;
import org.eclipse.emf.eef.eefnr.parts.EefnrViewsRepository;
import org.eclipse.emf.eef.eefnr.parts.TextSampleFirstTabPropertiesEditionPart;
import org.eclipse.emf.eef.eefnr.parts.TextSampleSecondTabPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.components.impl.ComposedPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.parts.PropertiesEditingPart;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;


// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class TextSampleWithTwoTabsPropertiesEditionComponent extends ComposedPropertiesEditingComponent {

	/**
	 * The TextSampleFirstTab part
	 * 
	 */
	private TextSampleFirstTabPropertiesEditionPart textSampleFirstTabPart;

	/**
	 * The TextSampleWithTwoTabsTextSampleFirstTabPropertiesEditionComponent sub component
	 * 
	 */
	protected TextSampleWithTwoTabsTextSampleFirstTabPropertiesEditionComponent textSampleWithTwoTabsTextSampleFirstTabPropertiesEditionComponent;

	/**
	 * The TextSampleSecondTab part
	 * 
	 */
	private TextSampleSecondTabPropertiesEditionPart textSampleSecondTabPart;

	/**
	 * The TextSampleWithTwoTabsTextSampleSecondTabPropertiesEditionComponent sub component
	 * 
	 */
	protected TextSampleWithTwoTabsTextSampleSecondTabPropertiesEditionComponent textSampleWithTwoTabsTextSampleSecondTabPropertiesEditionComponent;
	/**
	 * Parameterized constructor
	 * 
	 * @param textSampleWithTwoTabs the EObject to edit
	 * 
	 */
	public TextSampleWithTwoTabsPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject textSampleWithTwoTabs, String editing_mode) {
		super(editingContext, editing_mode);
		if (textSampleWithTwoTabs instanceof TextSampleWithTwoTabs) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(textSampleWithTwoTabs, PropertiesEditingProvider.class);
			textSampleWithTwoTabsTextSampleFirstTabPropertiesEditionComponent = (TextSampleWithTwoTabsTextSampleFirstTabPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, TextSampleWithTwoTabsTextSampleFirstTabPropertiesEditionComponent.TEXTSAMPLEFIRSTTAB_PART, TextSampleWithTwoTabsTextSampleFirstTabPropertiesEditionComponent.class);
			addSubComponent(textSampleWithTwoTabsTextSampleFirstTabPropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(textSampleWithTwoTabs, PropertiesEditingProvider.class);
			textSampleWithTwoTabsTextSampleSecondTabPropertiesEditionComponent = (TextSampleWithTwoTabsTextSampleSecondTabPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, TextSampleWithTwoTabsTextSampleSecondTabPropertiesEditionComponent.TEXTSAMPLESECONDTAB_PART, TextSampleWithTwoTabsTextSampleSecondTabPropertiesEditionComponent.class);
			addSubComponent(textSampleWithTwoTabsTextSampleSecondTabPropertiesEditionComponent);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.components.impl.ComposedPropertiesEditingComponent#
	 *      getPropertiesEditingPart(int, java.lang.String)
	 * 
	 */
	public PropertiesEditingPart getPropertiesEditingPart(int kind, String key) {
		if (TextSampleWithTwoTabsTextSampleFirstTabPropertiesEditionComponent.TEXTSAMPLEFIRSTTAB_PART.equals(key)) {
			textSampleFirstTabPart = (TextSampleFirstTabPropertiesEditionPart)textSampleWithTwoTabsTextSampleFirstTabPropertiesEditionComponent.getPropertiesEditingPart(kind, key);
			return (PropertiesEditingPart)textSampleFirstTabPart;
		}
		if (TextSampleWithTwoTabsTextSampleSecondTabPropertiesEditionComponent.TEXTSAMPLESECONDTAB_PART.equals(key)) {
			textSampleSecondTabPart = (TextSampleSecondTabPropertiesEditionPart)textSampleWithTwoTabsTextSampleSecondTabPropertiesEditionComponent.getPropertiesEditingPart(kind, key);
			return (PropertiesEditingPart)textSampleSecondTabPart;
		}
		return super.getPropertiesEditingPart(kind, key);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.components.impl.ComposedPropertiesEditingComponent#
	 *      setPropertiesEditingPart(java.lang.Object, int,
	 *      org.eclipse.emf.eef.runtime.parts.PropertiesEditingPart)
	 * 
	 */
	public void setPropertiesEditingPart(java.lang.Object key, int kind, PropertiesEditingPart propertiesEditionPart) {
		if (EefnrViewsRepository.TextSampleFirstTab.class == key) {
			super.setPropertiesEditingPart(key, kind, propertiesEditionPart);
			textSampleFirstTabPart = (TextSampleFirstTabPropertiesEditionPart)propertiesEditionPart;
		}
		if (EefnrViewsRepository.TextSampleSecondTab.class == key) {
			super.setPropertiesEditingPart(key, kind, propertiesEditionPart);
			textSampleSecondTabPart = (TextSampleSecondTabPropertiesEditionPart)propertiesEditionPart;
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.components.impl.ComposedPropertiesEditingComponent#
	 *      initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject,
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(java.lang.Object key, int kind, EObject element, ResourceSet allResource) {
		if (key == EefnrViewsRepository.TextSampleFirstTab.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == EefnrViewsRepository.TextSampleSecondTab.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
