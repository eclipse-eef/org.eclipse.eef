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
package org.eclipse.eef.ide.ui.internal.data;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.Platform;
import org.eclipse.eef.core.api.EEFChildObject;
import org.eclipse.eef.core.api.EEFContainer;
import org.eclipse.eef.core.api.EEFGroup;
import org.eclipse.eef.core.api.EEFObject;
import org.eclipse.eef.core.api.EEFText;
import org.eclipse.eef.core.api.EEFView;
import org.eclipse.eef.core.api.EEFWidget;
import org.eclipse.eef.core.api.IConsumer;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Widget;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.ISection;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;

/**
 * The implementation of {@link ISection} using the {@link EEFSectionDescriptor}.
 *
 * @author sbegaudeau
 */
public class EEFSection implements ISection {

	/**
	 * The section descriptor.
	 */
	private EEFSectionDescriptor eefSectionDescriptor;

	/**
	 * The widgets of this section.
	 */
	private List<Widget> widgets = new ArrayList<Widget>();

	/**
	 * The current selection.
	 */
	private Object currentSelection;

	/**
	 * The constructor.
	 *
	 * @param eefSectionDescriptor
	 *            The section descriptor
	 */
	public EEFSection(EEFSectionDescriptor eefSectionDescriptor) {
		this.eefSectionDescriptor = eefSectionDescriptor;
	}

	@Override
	public void createControls(Composite parent, TabbedPropertySheetPage tabbedPropertySheetPage) {
		TabbedPropertySheetWidgetFactory widgetFactory = tabbedPropertySheetPage.getWidgetFactory();

		EEFGroup eefGroup = this.eefSectionDescriptor.getEEFGroup();
		EEFContainer eefContainer = eefGroup.getContainer();

		if (eefContainer != null) {
			Composite sectionComposite = widgetFactory.createFlatFormComposite(parent);

			List<EEFWidget> eefWidgets = eefContainer.getWidgets();
			for (EEFWidget eefWidget : eefWidgets) {
				if (eefWidget instanceof EEFText) {
					EEFText eefText = (EEFText) eefWidget;

					Text text = widgetFactory.createText(sectionComposite, ""); //$NON-NLS-1$
					FormData data = new FormData();

					final int textOffset = 232;
					data.left = new FormAttachment(0, textOffset);
					data.right = new FormAttachment(100, 0);
					data.top = new FormAttachment(0, ITabbedPropertyConstants.VSPACE);

					text.setLayoutData(data);
					text.setEnabled(false);
					text.setData(eefText);
					this.widgets.add(text);

					if (eefText.getDescription().getLabelExpression() != null && eefText.getDescription().getLabelExpression().trim().length() > 0) {
						CLabel label = widgetFactory.createCLabel(sectionComposite, ""); //$NON-NLS-1$

						final int labelOffset = 20;
						data = new FormData();
						data.left = new FormAttachment(0, 0);
						data.right = new FormAttachment(text, -ITabbedPropertyConstants.HSPACE - labelOffset);
						data.top = new FormAttachment(text, 0, SWT.CENTER);
						label.setLayoutData(data);

						label.setData(eefText);
						this.widgets.add(label);
					}

				}
			}
		}
	}

	@Override
	public void setInput(IWorkbenchPart part, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection iStructuredSelection = (IStructuredSelection) selection;
			Object object = iStructuredSelection.getFirstElement();

			this.currentSelection = ((IStructuredSelection) selection).getFirstElement();

			EObject eObject = Platform.getAdapterManager().getAdapter(object, EObject.class);

			if (eObject != null) {
				for (Widget widget : widgets) {
					if (widget instanceof Text && ((Text) widget).getData() instanceof EEFText) {
						Text text = (Text) widget;
						EEFText eefText = (EEFText) text.getData();
						EEFView eefView = this.getEEFView(eefText);
						eefView.setInput(eObject);
					}
				}
			}
		}
	}

	/**
	 * Finds the root {@link EEFView} from the given {@link EEFChildObject}.
	 *
	 * @param eefChildObject
	 *            The {@link EEFChildObject}
	 * @return The root {@link EEFView}
	 */
	private EEFView getEEFView(EEFChildObject eefChildObject) {
		EEFView eefView = null;

		EEFChildObject child = eefChildObject;
		while (eefView == null) {
			EEFObject parent = child.getParent();
			if (parent instanceof EEFChildObject) {
				child = (EEFChildObject) parent;
			} else if (parent instanceof EEFView) {
				eefView = (EEFView) parent;
			}
		}

		return eefView;
	}

	@Override
	public void aboutToBeShown() {
		for (Widget widget : widgets) {
			if (widget instanceof CLabel && ((CLabel) widget).getData() instanceof EEFText) {
				final CLabel label = (CLabel) widget;
				final EEFText eefText = (EEFText) label.getData();

				eefText.addLabelExpressionConsumer(new IConsumer<String>() {
					@Override
					public void apply(String value) {
						label.setText(value);
					}
				});
			} else if (widget instanceof Text && ((Text) widget).getData() instanceof EEFText) {
				final Text text = (Text) widget;
				final EEFText eefText = (EEFText) text.getData();

				eefText.addValueExpressionConsumer(new IConsumer<String>() {
					@Override
					public void apply(String value) {
						if (!text.isDisposed()) {
							text.setText(value);
							if (!text.isEnabled()) {
								text.setEnabled(true);
							}
						}
					}
				});

				text.addModifyListener(new ModifyListener() {
					@Override
					public void modifyText(ModifyEvent e) {
						eefText.updateValue(currentSelection, text.getText());
					}
				});
			}
		}
	}

	@Override
	public void aboutToBeHidden() {
		for (Widget widget : widgets) {
			if (!widget.isDisposed() && widget instanceof Label && ((Label) widget).getData() instanceof EEFText) {
				final Label label = (Label) widget;
				EEFText eefText = (EEFText) label.getData();
				eefText.removeLabelExpressionConsumer();
			} else if (!widget.isDisposed() && widget instanceof Text && ((Text) widget).getData() instanceof EEFText) {
				final Text text = (Text) widget;
				EEFText eefText = (EEFText) text.getData();
				eefText.removeValueExpressionConsumer();
			}
		}
	}

	@Override
	public void dispose() {
		// do something
	}

	@Override
	public int getMinimumHeight() {
		return SWT.DEFAULT;
	}

	@Override
	public boolean shouldUseExtraSpace() {
		return true;
	}

	@Override
	public void refresh() {
		// do something
	}

}
