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
package org.eclipse.emf.eef.extended.editor.providers;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.extended.editor.EditorPackage;
import org.eclipse.emf.eef.extended.editor.StaticEEFEditorContribution;

import org.eclipse.emf.eef.extended.editor.components.StaticEEFEditorContributionBasePropertiesEditionComponent;
import org.eclipse.emf.eef.extended.editor.components.StaticEEFEditorContributionPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;

import org.eclipse.emf.eef.runtime.impl.utils.EEFUtils;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.eclipse.emf.eef.runtime.providers.impl.PropertiesEditingProviderImpl;

import org.eclipse.emf.eef.views.components.DocumentedElementPropertiesEditionComponent;

import org.eclipse.jface.viewers.IFilter;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen LeFur</a>
 * 
 */
public class StaticEEFEditorContributionPropertiesEditionProvider extends PropertiesEditingProviderImpl {

	/**
	 * Constructor without provider for super types.
	 */
	public StaticEEFEditorContributionPropertiesEditionProvider() {
		super();
	}

	/**
	 * Constructor with providers for super types.
	 * @param superProviders providers to use for super types.
	 */
	public StaticEEFEditorContributionPropertiesEditionProvider(List<PropertiesEditingProvider> superProviders) {
		super(superProviders);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext)
	 * 
	 */
	public boolean provides(PropertiesEditingContext editingContext) {
		return (editingContext.getEObject() instanceof StaticEEFEditorContribution) 
					&& (EditorPackage.Literals.STATIC_EEF_EDITOR_CONTRIBUTION == editingContext.getEObject().eClass());
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String)
	 * 
	 */
	public boolean provides(PropertiesEditingContext editingContext, String part) {
		return (editingContext.getEObject() instanceof StaticEEFEditorContribution) && (StaticEEFEditorContributionBasePropertiesEditionComponent.BASE_PART.equals(part) || DocumentedElementPropertiesEditionComponent.DOCUMENTATION_PART.equals(part));
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.Class)
	 * 
	 */
	@SuppressWarnings("rawtypes")
	public boolean provides(PropertiesEditingContext editingContext, java.lang.Class refinement) {
		return (editingContext.getEObject() instanceof StaticEEFEditorContribution) && (refinement == StaticEEFEditorContributionBasePropertiesEditionComponent.class || refinement == DocumentedElementPropertiesEditionComponent.class);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String, java.lang.Class)
	 * 
	 */
	@SuppressWarnings("rawtypes")
	public boolean provides(PropertiesEditingContext editingContext, String part, java.lang.Class refinement) {
		return (editingContext.getEObject() instanceof StaticEEFEditorContribution) && ((StaticEEFEditorContributionBasePropertiesEditionComponent.BASE_PART.equals(part) && refinement == StaticEEFEditorContributionBasePropertiesEditionComponent.class) || (DocumentedElementPropertiesEditionComponent.DOCUMENTATION_PART.equals(part) && refinement == DocumentedElementPropertiesEditionComponent.class));
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String)
	 * 
	 */
	public IPropertiesEditionComponent getPropertiesEditingComponent(PropertiesEditingContext editingContext, String mode) {
		if (editingContext.getEObject() instanceof StaticEEFEditorContribution) {
			return new StaticEEFEditorContributionPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
		}
		return super.getPropertiesEditingComponent(editingContext, mode);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String, java.lang.String)
	 * 
	 */
	public IPropertiesEditionComponent getPropertiesEditingComponent(PropertiesEditingContext editingContext, String mode, String part) {
		if (editingContext.getEObject() instanceof StaticEEFEditorContribution) {
			if (StaticEEFEditorContributionBasePropertiesEditionComponent.BASE_PART.equals(part))
				return new StaticEEFEditorContributionBasePropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (DocumentedElementPropertiesEditionComponent.DOCUMENTATION_PART.equals(part))
				return new DocumentedElementPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
		}
		return super.getPropertiesEditingComponent(editingContext, mode, part);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String, java.lang.String, java.lang.Class)
	 */
	@SuppressWarnings("rawtypes")
	public IPropertiesEditionComponent getPropertiesEditingComponent(PropertiesEditingContext editingContext, String mode, String part, java.lang.Class refinement) {
		if (editingContext.getEObject() instanceof StaticEEFEditorContribution) {
			if (StaticEEFEditorContributionBasePropertiesEditionComponent.BASE_PART.equals(part)
				&& refinement == StaticEEFEditorContributionBasePropertiesEditionComponent.class)
				return new StaticEEFEditorContributionBasePropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (DocumentedElementPropertiesEditionComponent.DOCUMENTATION_PART.equals(part)
				&& refinement == DocumentedElementPropertiesEditionComponent.class)
				return new DocumentedElementPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
		}
		return super.getPropertiesEditingComponent(editingContext, mode, part, refinement);
	}

	/**
	 * Provides the filter used by the plugin.xml to assign part forms.
	 */
	public static class EditionFilter implements IFilter {
		
		/**
		 * {@inheritDoc}
		 * 
		 * @see org.eclipse.jface.viewers.IFilter#select(java.lang.Object)
		 */
		public boolean select(Object toTest) {
			EObject eObj = EEFUtils.resolveSemanticObject(toTest);
			return eObj != null && EditorPackage.Literals.STATIC_EEF_EDITOR_CONTRIBUTION == eObj.eClass();
		}
		
	}

}
