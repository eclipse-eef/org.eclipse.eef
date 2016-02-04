/*******************************************************************************
 * Copyright (c) 2016 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.eef.core.api.utils;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

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
	 * Returns the first of a series of alternative string values which is not {@link Util#blank blank}.
	 *
	 * @param alternatives
	 *            the alernative strings, in order of preference.
	 * @return the first non-blank alternative, or <code>null</code> if they are all blank.
	 */
	public static String firstNonBlank(String... alternatives) {
		for (String s : alternatives) {
			if (!isBlank(s)) {
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
	 * Returns the given object as an iterable and filer it with the given type. If the object is a single object, the
	 * we will return a collection containing said object, it the object is already a collection, we will return a new
	 * collection with all its elements.
	 *
	 * @param rawValue
	 *            The raw value
	 * @param clazz
	 *            The class of the result wanted
	 * @param <T>
	 *            The type of the result wanted
	 * @return An iterable
	 */
	public static <T> Iterable<T> asIterable(Object rawValue, Class<T> clazz) {
		final Iterable<T> result;
		if (rawValue instanceof Collection<?>) {
			result = Lists.newArrayList(Iterables.filter((Collection<?>) rawValue, clazz));
		} else if (clazz.isInstance(rawValue)) {
			result = Collections.singleton(clazz.cast(rawValue));
		} else if (rawValue != null && rawValue.getClass().isArray()) {
			List<Object> list = Lists.newArrayList((Object[]) rawValue);
			result = Lists.newArrayList(Iterables.filter(list, clazz));
		} else {
			result = Collections.emptySet();
		}
		return result;
	}
}
