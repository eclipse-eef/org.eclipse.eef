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
package org.eclipse.emf.eef.runtime.context.impl;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 * @deprecated {@link EReferencePropertiesEditionContext} can now handle filters on type in a more generic way
 */
public class TypedEReferencePropertiesEditingContext extends EReferencePropertiesEditionContext {

	private EClass expectedType;

	/**
	 * @param parentContext
	 * @param propertiesEditionComponent
	 * @param settings
	 * @param adapterFactory
	 */
	public TypedEReferencePropertiesEditingContext(PropertiesEditingContext parentContext,
			IPropertiesEditionComponent propertiesEditionComponent, ReferencesTableSettings settings,
			EClass expectedType, AdapterFactory adapterFactory) {
		super(parentContext, propertiesEditionComponent, settings, adapterFactory);
		this.expectedType = expectedType;
	}

	/**
	 * @return the expectedType
	 */
	public EClass getExpectedType() {
		return expectedType;
	}

}
