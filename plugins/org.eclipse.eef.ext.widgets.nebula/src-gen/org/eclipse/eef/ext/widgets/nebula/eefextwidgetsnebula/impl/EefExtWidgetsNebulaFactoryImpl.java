/**
 * Copyright (c) 2016 Obeo.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula.impl;

import org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EefExtWidgetsNebulaFactoryImpl extends EFactoryImpl implements EefExtWidgetsNebulaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EefExtWidgetsNebulaFactory init() {
		try {
			EefExtWidgetsNebulaFactory theEefExtWidgetsNebulaFactory = (EefExtWidgetsNebulaFactory) EPackage.Registry.INSTANCE
					.getEFactory(EefExtWidgetsNebulaPackage.eNS_URI);
			if (theEefExtWidgetsNebulaFactory != null) {
				return theEefExtWidgetsNebulaFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EefExtWidgetsNebulaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EefExtWidgetsNebulaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case EefExtWidgetsNebulaPackage.EEF_EXT_NEBULA_RICH_TEXT_DESCRIPTION:
			return createEEFExtNebulaRichTextDescription();
		case EefExtWidgetsNebulaPackage.EEF_EXT_NEBULA_RICH_TEXT_WIDGET_STYLE:
			return createEEFExtNebulaRichTextWidgetStyle();
		case EefExtWidgetsNebulaPackage.EEF_EXT_NEBULA_RICH_TEXT_CONDITIONAL_STYLE:
			return createEEFExtNebulaRichTextConditionalStyle();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEFExtNebulaRichTextDescription createEEFExtNebulaRichTextDescription() {
		EEFExtNebulaRichTextDescriptionImpl eefExtNebulaRichTextDescription = new EEFExtNebulaRichTextDescriptionImpl();
		return eefExtNebulaRichTextDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEFExtNebulaRichTextWidgetStyle createEEFExtNebulaRichTextWidgetStyle() {
		EEFExtNebulaRichTextWidgetStyleImpl eefExtNebulaRichTextWidgetStyle = new EEFExtNebulaRichTextWidgetStyleImpl();
		return eefExtNebulaRichTextWidgetStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEFExtNebulaRichTextConditionalStyle createEEFExtNebulaRichTextConditionalStyle() {
		EEFExtNebulaRichTextConditionalStyleImpl eefExtNebulaRichTextConditionalStyle = new EEFExtNebulaRichTextConditionalStyleImpl();
		return eefExtNebulaRichTextConditionalStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EefExtWidgetsNebulaPackage getEefExtWidgetsNebulaPackage() {
		return (EefExtWidgetsNebulaPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EefExtWidgetsNebulaPackage getPackage() {
		return EefExtWidgetsNebulaPackage.eINSTANCE;
	}

} //EefExtWidgetsNebulaFactoryImpl
