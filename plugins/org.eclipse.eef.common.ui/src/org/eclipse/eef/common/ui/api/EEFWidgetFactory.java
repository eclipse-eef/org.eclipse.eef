/*******************************************************************************
 * Copyright (c) 2001, 2016 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Obeo - Contribution to the EEF project
 *******************************************************************************/
package org.eclipse.eef.common.ui.api;

import org.eclipse.jface.resource.JFaceColors;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Hyperlink;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.internal.forms.widgets.FormUtil;

/**
 * A FormToolkit customized for use by tabbed property sheet page and others.
 *
 * @author Anthony Hunter
 * @author Stephane Begaudeau
 * @since 1.6.0
 */
public class EEFWidgetFactory extends FormToolkit {
	/**
	 * The constructor.
	 */
	public EEFWidgetFactory() {
		super(Display.getCurrent());
	}

	/**
	 * Creates the tab folder as a part of the form.
	 *
	 * @param parent
	 *            the composite parent.
	 * @param style
	 *            the tab folder style.
	 * @return the tab folder
	 */
	public CTabFolder createTabFolder(Composite parent, int style) {
		CTabFolder tabFolder = new CTabFolder(parent, style);
		return tabFolder;
	}

	/**
	 * Creates the tab item as a part of the tab folder.
	 *
	 * @param tabFolder
	 *            the parent.
	 * @param style
	 *            the tab folder style.
	 * @return the tab item.
	 */
	public CTabItem createTabItem(CTabFolder tabFolder, int style) {
		CTabItem tabItem = new CTabItem(tabFolder, style);
		return tabItem;
	}

	/**
	 * Creates the list as a part of the form.
	 *
	 * @param parent
	 *            the composite parent.
	 * @param style
	 *            the list style.
	 * @return the list.
	 */
	public List createList(Composite parent, int style) {
		List list = new org.eclipse.swt.widgets.List(parent, style);
		return list;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.ui.forms.widgets.FormToolkit#createComposite(org.eclipse.swt.widgets.Composite, int)
	 */
	@Override
	public Composite createComposite(Composite parent, int style) {
		Composite c = super.createComposite(parent, style);
		c.setBackgroundMode(SWT.INHERIT_DEFAULT);
		c.setBackground(parent.getBackground());
		c.setForeground(parent.getForeground());
		this.paintBordersFor(c);
		return c;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.ui.forms.widgets.FormToolkit#createComposite(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public Composite createComposite(Composite parent) {
		Composite c = createComposite(parent, SWT.NONE);
		return c;
	}

	/**
	 * Creates a plain composite as a part of the form.
	 *
	 * @param parent
	 *            the composite parent.
	 * @param style
	 *            the composite style.
	 * @return the composite.
	 */
	public Composite createPlainComposite(Composite parent, int style) {
		Composite c = super.createComposite(parent, style);
		this.paintBordersFor(c);
		return c;
	}

	/**
	 * Creates a scrolled composite as a part of the form.
	 *
	 * @param parent
	 *            the composite parent.
	 * @param style
	 *            the composite style.
	 * @return the composite.
	 */
	public ScrolledComposite createScrolledComposite(Composite parent, int style) {
		ScrolledComposite scrolledComposite = new ScrolledComposite(parent, style);
		FormUtil.setFocusScrollingEnabled(scrolledComposite, false);
		return scrolledComposite;
	}

	/**
	 * Creates a combo box as a part of the form.
	 *
	 * @param parent
	 *            the combo box parent.
	 * @param comboStyle
	 *            the combo box style.
	 * @return the combo box.
	 */
	public CCombo createCCombo(Composite parent, int comboStyle) {
		CCombo combo = new CCombo(parent, comboStyle);
		adapt(combo, true, false);
		// Bugzilla 145837 - workaround for no borders on Windows XP
		if (getBorderStyle() == SWT.BORDER) {
			combo.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		}
		return combo;
	}

	/**
	 * Creates a combo box as a part of the form.
	 *
	 * @param parent
	 *            the combo box parent.
	 * @return the combo box.
	 */
	public CCombo createCCombo(Composite parent) {
		return createCCombo(parent, SWT.FLAT | SWT.READ_ONLY);
	}

	/**
	 * Creates a group as a part of the form.
	 *
	 * @param parent
	 *            the group parent.
	 * @param text
	 *            the group title.
	 * @return the composite.
	 */
	public Group createGroup(Composite parent, String text) {
		Group group = new Group(parent, SWT.SHADOW_NONE);
		group.setText(text);
		group.setBackgroundMode(SWT.INHERIT_DEFAULT);
		group.setBackground(parent.getBackground());
		group.setForeground(parent.getForeground());
		return group;
	}

	/**
	 * Creates a flat form composite as a part of the form.
	 *
	 * @param parent
	 *            the composite parent.
	 * @return the composite.
	 */
	public Composite createFlatFormComposite(Composite parent) {
		Composite composite = createComposite(parent);
		FormLayout layout = new FormLayout();
		layout.marginWidth = IEEFConstants.HSPACE + 2;
		layout.marginHeight = IEEFConstants.VSPACE;
		layout.spacing = IEEFConstants.VMARGIN + 1;
		composite.setLayout(layout);
		return composite;
	}

	/**
	 * Creates a label as a part of the form.
	 *
	 * @param parent
	 *            the label parent.
	 * @param text
	 *            the label text.
	 * @return the label.
	 */
	public CLabel createCLabel(Composite parent, String text) {
		return createCLabel(parent, text, SWT.NONE);
	}

	/**
	 * Creates a label as a part of the form.
	 *
	 * @param parent
	 *            the label parent.
	 * @param text
	 *            the label text.
	 * @param style
	 *            the label style.
	 * @return the label.
	 */
	public CLabel createCLabel(Composite parent, String text, int style) {
		final CLabel label = new CLabel(parent, style);
		label.setBackground(parent.getBackground());
		label.setForeground(parent.getForeground());
		label.setText(text);
		return label;
	}

	/**
	 * Creates a styled text as a part of the form.
	 *
	 * @param parent
	 *            the parent.
	 * @param style
	 *            the style.
	 * @return the styled text.
	 */
	public StyledText createStyledText(Composite parent, int style) {
		final StyledText styledText = new StyledText(parent, style);
		styledText.setBackgroundMode(SWT.INHERIT_DEFAULT);
		styledText.setBackground(parent.getBackground());
		styledText.setForeground(parent.getForeground());
		return styledText;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.ui.forms.widgets.FormToolkit#createButton(org.eclipse.swt.widgets.Composite, java.lang.String,
	 *      int)
	 */
	@Override
	public Button createButton(Composite parent, String text, int style) {
		Button button = super.createButton(parent, text, style);
		button.setBackground(parent.getBackground());
		button.setForeground(parent.getForeground());
		return button;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.ui.forms.widgets.FormToolkit#createSection(org.eclipse.swt.widgets.Composite, int)
	 */
	@Override
	public Section createSection(Composite parent, int sectionStyle) {
		Section section = super.createSection(parent, sectionStyle);
		section.setBackgroundMode(SWT.INHERIT_DEFAULT);
		section.setBackground(parent.getBackground());
		section.setForeground(parent.getForeground());
		return section;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.ui.forms.widgets.FormToolkit#createLabel(org.eclipse.swt.widgets.Composite, java.lang.String,
	 *      int)
	 */
	@Override
	public Label createLabel(Composite parent, String text, int style) {
		Label label = super.createLabel(parent, text, style);
		label.setBackground(parent.getBackground());
		label.setForeground(parent.getForeground());
		return label;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.ui.forms.widgets.FormToolkit#createHyperlink(org.eclipse.swt.widgets.Composite,
	 *      java.lang.String, int)
	 */
	@Override
	public Hyperlink createHyperlink(Composite parent, String text, int style) {
		Hyperlink hyperlink = super.createHyperlink(parent, text, style);
		hyperlink.setBackground(parent.getBackground());

		Color hyperlinkText = JFaceColors.getHyperlinkText(hyperlink.getDisplay());
		hyperlink.setForeground(hyperlinkText);

		return hyperlink;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.ui.forms.widgets.FormToolkit#createTable(org.eclipse.swt.widgets.Composite, int)
	 */
	@Override
	public Table createTable(Composite parent, int style) {
		Table table = super.createTable(parent, style);
		table.setBackgroundMode(SWT.INHERIT_DEFAULT);
		table.setBackground(parent.getBackground());
		table.setForeground(parent.getForeground());
		return table;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.ui.forms.widgets.FormToolkit#dispose()
	 */
	@Override
	public void dispose() {
		if (getColors() != null) {
			super.dispose();
		}
	}
}
