/**
 * Copyright (c) 2015, 2018 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '<em><b>EEF VALIDATION SEVERITY
 * DESCRIPTION</b></em>', and utility methods for working with them. <!-- end-user-doc -->
 * 
 * @see org.eclipse.eef.EefPackage#getEEF_VALIDATION_SEVERITY_DESCRIPTION()
 * @model
 * @generated
 */
public enum EEF_VALIDATION_SEVERITY_DESCRIPTION implements Enumerator {
	/**
	 * The '<em><b>INFO</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * The severity used to describe a piece of information. <!-- end-model-doc -->
	 * 
	 * @see #INFO_VALUE
	 * @generated
	 * @ordered
	 */
	INFO(1, "INFO", "INFO"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>WARNING</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc
	 * --> The severity used to describe a warning. <!-- end-model-doc -->
	 * 
	 * @see #WARNING_VALUE
	 * @generated
	 * @ordered
	 */
	WARNING(2, "WARNING", "WARNING"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>ERROR</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc
	 * --> The severity used to describe an error. <!-- end-model-doc -->
	 * 
	 * @see #ERROR_VALUE
	 * @generated
	 * @ordered
	 */
	ERROR(3, "ERROR", "ERROR"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>INFO</b></em>' literal value. <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * The severity used to describe a piece of information. <!-- end-model-doc -->
	 * 
	 * @see #INFO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INFO_VALUE = 1;

	/**
	 * The '<em><b>WARNING</b></em>' literal value. <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc
	 * --> The severity used to describe a warning. <!-- end-model-doc -->
	 * 
	 * @see #WARNING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WARNING_VALUE = 2;

	/**
	 * The '<em><b>ERROR</b></em>' literal value. <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * The severity used to describe an error. <!-- end-model-doc -->
	 * 
	 * @see #ERROR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ERROR_VALUE = 3;

	/**
	 * An array of all the '<em><b>EEF VALIDATION SEVERITY DESCRIPTION</b></em>' enumerators. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final EEF_VALIDATION_SEVERITY_DESCRIPTION[] VALUES_ARRAY = new EEF_VALIDATION_SEVERITY_DESCRIPTION[] { INFO, WARNING, ERROR, };

	/**
	 * A public read-only list of all the '<em><b>EEF VALIDATION SEVERITY DESCRIPTION</b></em>' enumerators. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<EEF_VALIDATION_SEVERITY_DESCRIPTION> VALUES = Collections
			.unmodifiableList(Arrays.asList(EEF_VALIDATION_SEVERITY_DESCRIPTION.VALUES_ARRAY));

	/**
	 * Returns the '<em><b>EEF VALIDATION SEVERITY DESCRIPTION</b></em>' literal with the specified literal value. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param literal
	 *            the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EEF_VALIDATION_SEVERITY_DESCRIPTION get(String literal) {
		for (EEF_VALIDATION_SEVERITY_DESCRIPTION result : EEF_VALIDATION_SEVERITY_DESCRIPTION.VALUES_ARRAY) {
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EEF VALIDATION SEVERITY DESCRIPTION</b></em>' literal with the specified name. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param name
	 *            the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EEF_VALIDATION_SEVERITY_DESCRIPTION getByName(String name) {
		for (EEF_VALIDATION_SEVERITY_DESCRIPTION result : EEF_VALIDATION_SEVERITY_DESCRIPTION.VALUES_ARRAY) {
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EEF VALIDATION SEVERITY DESCRIPTION</b></em>' literal with the specified integer value. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EEF_VALIDATION_SEVERITY_DESCRIPTION get(int value) {
		switch (value) {
		case INFO_VALUE:
			return INFO;
		case WARNING_VALUE:
			return WARNING;
		case ERROR_VALUE:
			return ERROR;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEF_VALIDATION_SEVERITY_DESCRIPTION(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} // EEF_VALIDATION_SEVERITY_DESCRIPTION
