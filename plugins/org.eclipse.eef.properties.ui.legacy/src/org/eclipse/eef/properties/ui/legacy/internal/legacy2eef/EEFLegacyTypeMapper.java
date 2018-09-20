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
package org.eclipse.eef.properties.ui.legacy.internal.legacy2eef;

import org.eclipse.eef.properties.ui.api.EEFTypeMapper;
import org.eclipse.ui.views.properties.tabbed.ITypeMapper;

/**
 * Wraps an {@link TypeMapper} to an {@link EEFLegacyTypeMapper}.
 *
 * @author mbats
 */
public class EEFLegacyTypeMapper extends EEFTypeMapper {

	/**
	 * The legacy type mapper.
	 */
	private ITypeMapper legacyTypeMapper;

	/**
	 * The constructor.
	 *
	 * @param typeMapper
	 *            The type mapper
	 */
	public EEFLegacyTypeMapper(ITypeMapper typeMapper) {
		this.legacyTypeMapper = typeMapper;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.properties.ui.api.EEFTypeMapper#mapType(java.lang.Object)
	 */
	@Override
	public Class<?> mapType(Object object) {
		return legacyTypeMapper.mapType(object);
	}
}
