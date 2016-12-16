/**
 * Copyright (c) 2016 Obeo.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula.EefExtWidgetsNebulaPackage
 * @generated
 */
public interface EefExtWidgetsNebulaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EefExtWidgetsNebulaFactory eINSTANCE = org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula.impl.EefExtWidgetsNebulaFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>EEF Ext Nebula Rich Text Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Ext Nebula Rich Text Description</em>'.
	 * @generated
	 */
	EEFExtNebulaRichTextDescription createEEFExtNebulaRichTextDescription();

	/**
	 * Returns a new object of class '<em>EEF Ext Nebula Rich Text Widget Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Ext Nebula Rich Text Widget Style</em>'.
	 * @generated
	 */
	EEFExtNebulaRichTextWidgetStyle createEEFExtNebulaRichTextWidgetStyle();

	/**
	 * Returns a new object of class '<em>EEF Ext Nebula Rich Text Conditional Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEF Ext Nebula Rich Text Conditional Style</em>'.
	 * @generated
	 */
	EEFExtNebulaRichTextConditionalStyle createEEFExtNebulaRichTextConditionalStyle();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EefExtWidgetsNebulaPackage getEefExtWidgetsNebulaPackage();

} //EefExtWidgetsNebulaFactory
