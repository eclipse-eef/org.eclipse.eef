/*******************************************************************************
 * Copyright (c) 2013 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.runtime.ui.swt.e3.internal.widgets;

import org.eclipse.emf.eef.runtime.ui.swt.internal.widgets.SingleLinePropertyViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 *
 */
public class FormSingleLinePropertyViewer extends SingleLinePropertyViewer {

	private FormToolkit toolkit;

	/**
	 * @param toolkit
	 * @param parent
	 * @param styles
	 */
	public FormSingleLinePropertyViewer(FormToolkit toolkit, Composite parent, int styles) {
		super(parent, styles);
		this.toolkit = toolkit;
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.ui.widgets.SingleLinePropertyViewer#createControlComposite(org.eclipse.swt.widgets.Composite)
	 */
	protected Composite createControlComposite(Composite parent) {
		return toolkit.createComposite(parent);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.ui.widgets.SingleLinePropertyViewer#createText(org.eclipse.swt.widgets.Composite, int)
	 */
	protected Text createText(Composite control, int styles) {
		Text result = toolkit.createText(control, "", SWT.NONE);
		result.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		toolkit.paintBordersFor(control);
		return result;
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.ui.widgets.SingleLinePropertyViewer#createSetButton(org.eclipse.swt.widgets.Composite)
	 */
	protected Button createSetButton(Composite control) {
		return toolkit.createButton(control, "...", SWT.PUSH);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.ui.widgets.SingleLinePropertyViewer#createClearButton(org.eclipse.swt.widgets.Composite)
	 */
	protected Button createClearButton(Composite control) {
		return toolkit.createButton(control, "", SWT.PUSH);
	}
}
