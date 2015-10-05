/*******************************************************************************
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.eef.uml.editor.sample.internal.editor;

import java.util.Iterator;

import org.eclipse.eef.uml.editor.sample.internal.properties.UmlPropertySheetPage;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.uml2.uml.editor.presentation.UMLEditor;

/**
 * Our custom UML editor.
 *
 * @author sbegaudeau
 */
public class EEFUmlEditor extends UMLEditor implements ITabbedPropertySheetPageContributor {

	/**
	 * The property sheet page.
	 */
	private TabbedPropertySheetPage propertySheetPage;

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.uml2.uml.editor.presentation.UMLEditor#getAdapter(java.lang.Class)
	 */
	@Override
	public Object getAdapter(@SuppressWarnings("rawtypes") Class key) {
		if (key.equals(IPropertySheetPage.class)) {
			return getPropertySheetPage();
		}
		return super.getAdapter(key);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.uml2.uml.editor.presentation.UMLEditor#getPropertySheetPage()
	 */
	@Override
	public TabbedPropertySheetPage getPropertySheetPage() {
		if (propertySheetPage == null || propertySheetPage.getControl() == null) {
			propertySheetPage = new UmlPropertySheetPage(this);
		}
		return propertySheetPage;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor#getContributorId()
	 */
	@Override
	public String getContributorId() {
		return "org.eclipse.eef.uml.editor.sample.contributorId"; //$NON-NLS-1$
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.uml2.uml.editor.presentation.UMLEditor#getEditingDomain()
	 */
	@Override
	public EditingDomain getEditingDomain() {
		Iterator<Session> iterator = SessionManager.INSTANCE.getSessions().iterator();
		if (iterator.hasNext()) {
			Session session = iterator.next();
			return session.getTransactionalEditingDomain();
		}
		return super.getEditingDomain();
	}
}
