/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '
 * <em><b>EEF FILL LAYOUT ORIENTATION</b></em>', and utility methods for working with them. <!-- end-user-doc -->
 *
 * @see org.eclipse.eef.EefPackage#getEEF_FILL_LAYOUT_ORIENTATION()
 * @model
 * @generated
 */
public enum EEF_FILL_LAYOUT_ORIENTATION implements Enumerator {
	/**
	 * The '<em><b>VERTICAL</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #VERTICAL_VALUE
	 * @generated
	 * @ordered
	 */
	VERTICAL(0, "VERTICAL", "VERTICAL"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>HORIZONTAL</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #HORIZONTAL_VALUE
	 * @generated
	 * @ordered
	 */
	HORIZONTAL(1, "HORIZONTAL", "HORIZONTAL"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>VERTICAL</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VERTICAL</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @see #VERTICAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VERTICAL_VALUE = 0;

	/**
	 * The '<em><b>HORIZONTAL</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HORIZONTAL</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @see #HORIZONTAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HORIZONTAL_VALUE = 1;

	/**
	 * An array of all the '<em><b>EEF FILL LAYOUT ORIENTATION</b></em>' enumerators. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 */
	private static final EEF_FILL_LAYOUT_ORIENTATION[] VALUES_ARRAY = new EEF_FILL_LAYOUT_ORIENTATION[] { VERTICAL, HORIZONTAL, };

	/**
	 * A public read-only list of all the '<em><b>EEF FILL LAYOUT ORIENTATION</b></em>' enumerators. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static final List<EEF_FILL_LAYOUT_ORIENTATION> VALUES = Collections.unmodifiableList(Arrays
			.asList(EEF_FILL_LAYOUT_ORIENTATION.VALUES_ARRAY));

	/**
	 * Returns the '<em><b>EEF FILL LAYOUT ORIENTATION</b></em>' literal with the specified literal value. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static EEF_FILL_LAYOUT_ORIENTATION get(String literal) {
		for (EEF_FILL_LAYOUT_ORIENTATION result : EEF_FILL_LAYOUT_ORIENTATION.VALUES_ARRAY) {
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EEF FILL LAYOUT ORIENTATION</b></em>' literal with the specified name. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static EEF_FILL_LAYOUT_ORIENTATION getByName(String name) {
		for (EEF_FILL_LAYOUT_ORIENTATION result : EEF_FILL_LAYOUT_ORIENTATION.VALUES_ARRAY) {
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EEF FILL LAYOUT ORIENTATION</b></em>' literal with the specified integer value. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static EEF_FILL_LAYOUT_ORIENTATION get(int value) {
		switch (value) {
		case VERTICAL_VALUE:
			return VERTICAL;
		case HORIZONTAL_VALUE:
			return HORIZONTAL;
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
	private EEF_FILL_LAYOUT_ORIENTATION(int value, String name, String literal) {
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

} // EEF_FILL_LAYOUT_ORIENTATION
