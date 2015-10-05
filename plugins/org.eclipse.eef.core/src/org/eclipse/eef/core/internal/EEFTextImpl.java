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

import org.eclipse.eef.EEFTextDescription;
import org.eclipse.eef.core.api.EEFText;
import org.eclipse.eef.core.api.IConsumer;

/**
 * The implementation of the {@link EEFText}.
 *
 * @author sbegaudeau
 */
public class EEFTextImpl extends AbstractEEFWidgetImpl implements EEFText {

	/**
	 * The description.
	 */
	private EEFTextDescription eefTextDescription;

	/**
	 * The constructor.
	 *
	 * @param eefTextDescription
	 *            The description
	 */
	public EEFTextImpl(EEFTextDescription eefTextDescription) {
		this.eefTextDescription = eefTextDescription;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.EEFText#getDescription()
	 */
	@Override
	public EEFTextDescription getDescription() {
		return this.eefTextDescription;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.EEFText#getValue(org.eclipse.eef.core.api.IConsumer)
	 */
	@Override
	public void getValue(IConsumer<String> consumer) {
		String valueExpression = this.eefTextDescription.getValueExpression();
		consumer.apply(valueExpression);
	}
}
