/**
 * Copyright (c) Israel Aerospace Industries, Eclipse contributors and others 2021.
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *    Israel Aerospace Industries - initial API and implementation
 */
package org.eclipse.eef.ext.widgets.markup.MarkupWidgets;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.eef.ext.widgets.markup.MarkupWidgets.MarkupWidgetsPackage
 * @generated
 */
public interface MarkupWidgetsFactory extends EFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) Israel Aerospace Industries, Eclipse contributors and others 2021.\nThis program and the accompanying materials\nare made available under the terms of the Eclipse Public License 2.0\nwhich accompanies this distribution, and is available at\nhttps://www.eclipse.org/legal/epl-2.0/\n\nSPDX-License-Identifier: EPL-2.0\n\nContributors:\n   Israel Aerospace Industries - initial API and implementation";

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MarkupWidgetsFactory eINSTANCE = org.eclipse.eef.ext.widgets.markup.MarkupWidgets.impl.MarkupWidgetsFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>EEF Ext HTML Renderer Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Ext HTML Renderer Description</em>'.
	 * @generated
	 */
	EEFExtHTMLRendererDescription createEEFExtHTMLRendererDescription();

	/**
	 * Returns a new object of class '<em>EEF Ext Markdown Widget</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Ext Markdown Widget</em>'.
	 * @generated
	 */
	EEFExtMarkdownWidget createEEFExtMarkdownWidget();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MarkupWidgetsPackage getMarkupWidgetsPackage();

} //MarkupWidgetsFactory
