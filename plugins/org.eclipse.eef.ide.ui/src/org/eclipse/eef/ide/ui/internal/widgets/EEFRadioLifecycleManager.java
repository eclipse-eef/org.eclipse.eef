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
package org.eclipse.eef.ide.ui.internal.widgets;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.eef.EEFRadioDescription;
import org.eclipse.eef.EefPackage;
import org.eclipse.eef.core.api.EEFExpressionUtils;
import org.eclipse.eef.core.api.EEFExpressionUtils.EEFSelect;
import org.eclipse.eef.core.api.controllers.EEFControllersFactory;
import org.eclipse.eef.core.api.controllers.IConsumer;
import org.eclipse.eef.core.api.controllers.IEEFRadioController;
import org.eclipse.eef.core.api.utils.Eval;
import org.eclipse.eef.properties.ui.api.EEFTabbedPropertySheetPage;
import org.eclipse.eef.properties.ui.api.EEFTabbedPropertySheetWidgetFactory;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.forms.widgets.FormToolkit;

/**
 * This class will be used in order to manager the lifecycle of a radio button.
 *
 * @author mbats
 */
public class EEFRadioLifecycleManager implements ILifecycleManager {
	/**
	 * The key used for the help image.
	 */
	private static final String DLG_IMG_HELP = "dialog_help_image"; //$NON-NLS-1$

	/**
	 * The description.
	 */
	private EEFRadioDescription description;

	/**
	 * The variable manager.
	 */
	private IVariableManager variableManager;

	/**
	 * The interpreter.
	 */
	private IInterpreter interpreter;

	/**
	 * The editing domain.
	 */
	private TransactionalEditingDomain editingDomain;

	/**
	 * The radio group viewer.
	 */
	private RadioGroupViewer radioGroupViewer;

	/**
	 * The radio group.
	 */
	private RadioGroup radioGroup;

	/**
	 * The label.
	 */
	private Label label;

	/**
	 * The help label.
	 */
	private Label help;

	/**
	 * The controller.
	 */
	private IEEFRadioController controller;

	/**
	 * The listener on the combo.
	 */
	private SelectionListener selectionListener;

	/**
	 * The constructor.
	 *
	 * @param description
	 *            The description
	 * @param variableManager
	 *            The variable manager
	 * @param interpreter
	 *            The interpreter
	 * @param editingDomain
	 *            The editing domain
	 */
	public EEFRadioLifecycleManager(EEFRadioDescription description, IVariableManager variableManager, IInterpreter interpreter,
			TransactionalEditingDomain editingDomain) {
		this.description = description;
		this.variableManager = variableManager;
		this.interpreter = interpreter;
		this.editingDomain = editingDomain;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.internal.widgets.ILifecycleManager#createControl(org.eclipse.swt.widgets.Composite,
	 *      org.eclipse.eef.properties.ui.api.EEFTabbedPropertySheetPage)
	 */
	@Override
	public void createControl(Composite parent, EEFTabbedPropertySheetPage tabbedPropertySheetPage) {
		EEFTabbedPropertySheetWidgetFactory widgetFactory = tabbedPropertySheetPage.getWidgetFactory();

		this.label = widgetFactory.createLabel(parent, ""); //$NON-NLS-1$

		this.radioGroupViewer = new RadioGroupViewer(parent, widgetFactory);
		this.radioGroup = radioGroupViewer.getRadioGroup();
		this.radioGroupViewer.setContentProvider(ArrayContentProvider.getInstance());
		this.radioGroupViewer.setLabelProvider(new EEFRadioLabelProvider());

		this.radioGroupViewer.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);

		this.help = widgetFactory.createLabel(parent, ""); //$NON-NLS-1$
		Image image = JFaceResources.getImage(DLG_IMG_HELP);
		this.help.setImage(image);
		this.help.setToolTipText("There should be some help in this tooltip..."); //$NON-NLS-1$

		this.controller = new EEFControllersFactory().createRadioController(this.description, this.variableManager, this.interpreter,
				this.editingDomain);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.internal.widgets.ILifecycleManager#aboutToBeShown()
	 */
	@Override
	public void aboutToBeShown() {
		this.selectionListener = new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				IStructuredSelection selection = radioGroupViewer.getStructuredSelection();
				Object newValue = selection.getFirstElement();
				controller.updateValue(newValue);
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// Nothing to do
			}
		};
		this.radioGroup.addSelectionListener(this.selectionListener);

		// Set radio group value
		this.controller.onNewValue(new IConsumer<Object>() {
			@Override
			public void apply(Object value) {
				if (!radioGroup.isDisposed()) {
					final ISelection selection = new StructuredSelection(value);
					radioGroupViewer.setSelection(selection);
					if (!radioGroup.isEnabled()) {
						radioGroup.setEnabled(true);
					}
				}
			}
		});

		// Set radio group label
		this.controller.onNewLabel(new IConsumer<String>() {
			@Override
			public void apply(String value) {
				if (!label.isDisposed() && !(label.getText() != null && label.getText().equals(value))) {
					label.setText(value);
				}
			}
		});

		// Set radio group items
		this.controller.onNewCandidates(new IConsumer<List<Object>>() {
			@Override
			public void apply(List<Object> candidates) {
				if (!radioGroup.isDisposed()) {
					radioGroupViewer.setInput(candidates.toArray());
					if (!radioGroup.isEnabled()) {
						radioGroup.setEnabled(true);
					}
					radioGroupViewer.refresh(true);
				}
			}
		});
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.internal.widgets.ILifecycleManager#refresh()
	 */
	@Override
	public void refresh() {
		this.controller.refresh();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.internal.widgets.ILifecycleManager#aboutToBeHidden()
	 */
	@Override
	public void aboutToBeHidden() {
		if (!radioGroup.isDisposed()) {
			this.radioGroup.removeSelectionListener(this.selectionListener);
		}
		this.controller.removeNewValueConsumer();
		this.controller.removeNewLabelConsumer();
		this.controller.removeNewCandidatesConsumer();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.internal.widgets.ILifecycleManager#dispose()
	 */
	@Override
	public void dispose() {
		// do nothing
	}

	/**
	 * Radio widget label provider.
	 *
	 * @author mbats
	 */
	private final class EEFRadioLabelProvider extends LabelProvider {
		@Override
		public String getText(Object element) {
			String expression = description.getCandidateDisplayExpression();
			EAttribute eAttribute = EefPackage.Literals.EEF_RADIO_DESCRIPTION__CANDIDATE_DISPLAY_EXPRESSION;

			Map<String, Object> variables = new HashMap<String, Object>();
			variables.put(EEFExpressionUtils.SELF, variableManager.getVariables().get(EEFExpressionUtils.SELF));
			variables.put(EEFSelect.CANDIDATE, element);

			return new Eval(EEFRadioLifecycleManager.this.interpreter, variables).get(eAttribute, expression, String.class);
		}
	}
}
