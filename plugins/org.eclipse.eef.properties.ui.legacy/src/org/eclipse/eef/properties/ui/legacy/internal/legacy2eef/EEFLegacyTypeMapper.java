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
