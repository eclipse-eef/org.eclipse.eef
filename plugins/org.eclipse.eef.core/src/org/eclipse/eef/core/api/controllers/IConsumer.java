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
package org.eclipse.eef.core.api.controllers;

/**
 * The consumer is a functional type used to receive an Object of a specific type.
 *
 * @author sbegaudeau
 * @param <T>
 *            The type of the Object that can be received
 */
public interface IConsumer<T> {
	/**
	 * This operation is called in order to give to the consumer an Object.
	 *
	 * @param value
	 *            The Object
	 */
	void apply(T value);
}
