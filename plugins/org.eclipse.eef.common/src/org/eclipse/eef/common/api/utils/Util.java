/*******************************************************************************
 * Copyright (c) 2016, 2018 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors: Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.eef.common.api.utils;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

/**
 * Shared utility methods.
 *
 * @author Pierre-Charles David <pierre-charles.david@obeo.fr>
 */
public final class Util {
	/**
	 * Prevent instantiation.
	 */
	private Util() {
		// Prevent instantiation.
	}

	/**
	 * Returns the first of a series of alternative string values which is not null.
	 *
	 * @param alternatives
	 *            the alernative strings, in order of preference.
	 * @return the first non-null alternative, or an empty string if they are all null.
	 */
	public static String firstNonNull(String... alternatives) {
		for (String s : alternatives) {
			if (s != null) {
				return s;
			}
		}
		return null;
	}

	/**
	 * Tests if a string is blank (i.e. null, empty, or containing only whitespace).
	 *
	 * @param s
	 *            the string to test.
	 * @return <code>true</code> if and only if the string is blank.
	 */
	public static boolean isBlank(String s) {
		return s == null || s.trim().length() == 0;
	}

	/**
	 * Returns the given object as a collection and filter it with the given type. If the object is a single object, the
	 * we will return a collection containing said object, it the object is already a collection, we will return a new
	 * collection with all its elements.
	 *
	 * @param rawValue
	 *            The raw value
	 * @param clazz
	 *            The class of the result wanted
	 * @param <T>
	 *            The type of the result wanted
	 * @return A collection
	 */
	public static <T> Collection<T> asCollection(Object rawValue, Class<T> clazz) {
		final Collection<T> result;
		if (rawValue instanceof Collection<?>) {
			// @formatter:off
			result = ((Collection<?>) rawValue).stream()
						.filter(clazz::isInstance)
						.map(clazz::cast)
						.collect(Collectors.toList());
			// @formatter:on
		} else if (clazz.isInstance(rawValue)) {
			result = Collections.singleton(clazz.cast(rawValue));
		} else if (rawValue != null && rawValue.getClass().isArray()) {
			// @formatter:off
			result = Arrays.stream((Object[]) rawValue)
						.filter(clazz::isInstance)
						.map(clazz::cast)
						.collect(Collectors.toList());
			// @formatter:on
		} else {
			result = Collections.emptySet();
		}
		return result;
	}
}
