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
package org.eclipse.eef.core.internal;

import com.google.common.collect.Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.eef.core.api.IVariableManager;

/**
 * The implementation of the {@link IVariableManager}.
 *
 * @author sbegaudeau
 */
public class EEFVariableManager implements IVariableManager {

	/**
	 * The parent {@link IVariableManager}.
	 */
	private IVariableManager parent;

	/**
	 * The variables.
	 */
	private Map<String, Object> variables = new HashMap<String, Object>();

	/**
	 * The child variable manager.
	 */
	private List<IVariableManager> children = new ArrayList<IVariableManager>();

	/**
	 * The constructor.
	 */
	public EEFVariableManager() {
		// do nothing
	}

	/**
	 * The constructor.
	 *
	 * @param parent
	 *            The parent of this {@link IVariableManager}.
	 */
	public EEFVariableManager(IVariableManager parent) {
		this.parent = parent;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.IVariableManager#put(java.lang.String, java.lang.Object)
	 */
	@Override
	public Object put(String name, Object value) {
		Object previous = this.variables.put(name, value);
		return previous;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.IVariableManager#getVariables()
	 */
	@Override
	public Map<String, Object> getVariables() {
		if (this.parent != null) {
			Map<String, Object> parentVariables = this.parent.getVariables();
			parentVariables.putAll(this.variables);
			return parentVariables;
		}
		return Maps.newHashMap(this.variables);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.IVariableManager#createChild()
	 */
	@Override
	public IVariableManager createChild() {
		IVariableManager variableManager = new EEFVariableManager(this);
		this.children.add(variableManager);
		return variableManager;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.IVariableManager#clear()
	 */
	@Override
	public void clear() {
		this.variables.clear();

		for (IVariableManager variableManager : children) {
			variableManager.clear();
		}
	}
}
