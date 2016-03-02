/*******************************************************************************
 * Copyright (c) 2015, 2016 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.eef.ide.ui.internal.widgets;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.eef.EEFButtonDescription;
import org.eclipse.eef.EEFCheckboxDescription;
import org.eclipse.eef.EEFContainerDescription;
import org.eclipse.eef.EEFDynamicMappingFor;
import org.eclipse.eef.EEFDynamicMappingIf;
import org.eclipse.eef.EEFLabelDescription;
import org.eclipse.eef.EEFMultiValuedContainmentReferenceDescription;
import org.eclipse.eef.EEFMultiValuedReferenceDescription;
import org.eclipse.eef.EEFRadioDescription;
import org.eclipse.eef.EEFSelectDescription;
import org.eclipse.eef.EEFSingleValuedContainmentReferenceDescription;
import org.eclipse.eef.EEFSingleValuedReferenceDescription;
import org.eclipse.eef.EEFTextDescription;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.EefPackage;
import org.eclipse.eef.common.api.utils.Util;
import org.eclipse.eef.core.api.EEFExpressionUtils;
import org.eclipse.eef.core.api.utils.Eval;
import org.eclipse.eef.properties.ui.api.EEFTabbedPropertySheetPage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.swt.widgets.Composite;

/**
 * This class will handle the lifecycle of the {@link EEFContainerDescription}.
 *
 * @author sbegaudeau
 */
public class EEFContainerLifecycleManager implements ILifecycleManager {

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
	 * The description of the container.
	 */
	private EEFContainerDescription description;

	/**
	 * The lifecycle managers of the child of the container.
	 */
	private List<ILifecycleManager> lifecycleManagers = new ArrayList<ILifecycleManager>();

	/**
	 * The constructor.
	 *
	 * @param description
	 *            The description of the container
	 * @param variableManager
	 *            The variable manager
	 * @param interpreter
	 *            The interpreter
	 * @param editingDomain
	 *            The editing domain
	 */
	public EEFContainerLifecycleManager(EEFContainerDescription description, IVariableManager variableManager, IInterpreter interpreter,
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
		List<EEFWidgetDescription> widgets = this.description.getWidgets();
		for (EEFWidgetDescription eefWidgetDescription : widgets) {
			this.createWidgetControl(parent, tabbedPropertySheetPage, eefWidgetDescription, this.variableManager.createChild());
		}

		List<EEFDynamicMappingFor> dynamicMappings = this.description.getDynamicMappings();
		for (EEFDynamicMappingFor dynamicMappingFor : dynamicMappings) {
			this.createDynamicMappingControl(parent, tabbedPropertySheetPage, dynamicMappingFor);
		}
	}

	/**
	 * Creates the control for the widget with the given {@link EEFWidgetDescription}.
	 *
	 * @param parent
	 *            The composite parent
	 * @param tabbedPropertySheetPage
	 *            The tabbed property sheet page
	 * @param eefWidgetDescription
	 *            The description of the widget to create
	 * @param childVariableManager
	 *            The variable manager to use for the widget to create
	 */
	private void createWidgetControl(Composite parent, EEFTabbedPropertySheetPage tabbedPropertySheetPage, EEFWidgetDescription eefWidgetDescription,
			IVariableManager childVariableManager) {
		if (eefWidgetDescription instanceof EEFTextDescription) {
			EEFTextDescription eefTextDescription = (EEFTextDescription) eefWidgetDescription;

			EEFTextLifecycleManager eefTextLifecycleManager = new EEFTextLifecycleManager(eefTextDescription, childVariableManager, interpreter,
					editingDomain);
			eefTextLifecycleManager.createControl(parent, tabbedPropertySheetPage);

			this.lifecycleManagers.add(eefTextLifecycleManager);
		} else if (eefWidgetDescription instanceof EEFLabelDescription) {
			EEFLabelDescription eefLabelDescription = (EEFLabelDescription) eefWidgetDescription;

			EEFLabelLifecycleManager eefLabelLifecycleManager = new EEFLabelLifecycleManager(eefLabelDescription, childVariableManager, interpreter,
					editingDomain);
			eefLabelLifecycleManager.createControl(parent, tabbedPropertySheetPage);

			this.lifecycleManagers.add(eefLabelLifecycleManager);
		} else if (eefWidgetDescription instanceof EEFSelectDescription) {
			EEFSelectDescription eefSelectDescription = (EEFSelectDescription) eefWidgetDescription;

			EEFSelectLifecycleManager eefSelectLifecycleManager = new EEFSelectLifecycleManager(eefSelectDescription, childVariableManager,
					interpreter, editingDomain);
			eefSelectLifecycleManager.createControl(parent, tabbedPropertySheetPage);

			this.lifecycleManagers.add(eefSelectLifecycleManager);
		} else if (eefWidgetDescription instanceof EEFRadioDescription) {
			EEFRadioDescription eefRadioDescription = (EEFRadioDescription) eefWidgetDescription;

			EEFRadioLifecycleManager eefRadioLifecycleManager = new EEFRadioLifecycleManager(eefRadioDescription, childVariableManager, interpreter,
					editingDomain);
			eefRadioLifecycleManager.createControl(parent, tabbedPropertySheetPage);

			this.lifecycleManagers.add(eefRadioLifecycleManager);
		} else if (eefWidgetDescription instanceof EEFCheckboxDescription) {
			EEFCheckboxDescription eefCheckboxDescription = (EEFCheckboxDescription) eefWidgetDescription;

			EEFCheckboxLifecycleManager eefCheckboxLifecycleManager = new EEFCheckboxLifecycleManager(eefCheckboxDescription, childVariableManager,
					interpreter, editingDomain);
			eefCheckboxLifecycleManager.createControl(parent, tabbedPropertySheetPage);

			this.lifecycleManagers.add(eefCheckboxLifecycleManager);
		} else if (eefWidgetDescription instanceof EEFButtonDescription) {
			EEFButtonDescription eefButtonDescription = (EEFButtonDescription) eefWidgetDescription;

			EEFButtonLifecycleManager eefButtonLifecycleManager = new EEFButtonLifecycleManager(eefButtonDescription, childVariableManager,
					interpreter, editingDomain);
			eefButtonLifecycleManager.createControl(parent, tabbedPropertySheetPage);

			this.lifecycleManagers.add(eefButtonLifecycleManager);
		} else if (eefWidgetDescription instanceof EEFSingleValuedContainmentReferenceDescription) {
			EEFSingleValuedContainmentReferenceDescription eefSingleValuedContainmentReferenceDescription = (EEFSingleValuedContainmentReferenceDescription) eefWidgetDescription;

			EEFSingleValuedContainmentReferenceLifecycleManager eefSingleValuedContainmentReferenceLifecycleManager = new EEFSingleValuedContainmentReferenceLifecycleManager(
					eefSingleValuedContainmentReferenceDescription, childVariableManager, interpreter, editingDomain);
			eefSingleValuedContainmentReferenceLifecycleManager.createControl(parent, tabbedPropertySheetPage);

			this.lifecycleManagers.add(eefSingleValuedContainmentReferenceLifecycleManager);
		} else if (eefWidgetDescription instanceof EEFSingleValuedReferenceDescription) {
			EEFSingleValuedReferenceDescription eefSingleValuedReferenceDescription = (EEFSingleValuedReferenceDescription) eefWidgetDescription;

			EEFSingleValuedReferenceLifecycleManager eefSingleValuedReferenceLifecycleManager = new EEFSingleValuedReferenceLifecycleManager(
					eefSingleValuedReferenceDescription, childVariableManager, interpreter, editingDomain);
			eefSingleValuedReferenceLifecycleManager.createControl(parent, tabbedPropertySheetPage);

			this.lifecycleManagers.add(eefSingleValuedReferenceLifecycleManager);
		} else if (eefWidgetDescription instanceof EEFMultiValuedContainmentReferenceDescription) {
			EEFMultiValuedContainmentReferenceDescription eefMultiValuedContainmentReferenceDescription = (EEFMultiValuedContainmentReferenceDescription) eefWidgetDescription;

			EEFMultiValuedContainmentReferenceLifecycleManager eefMultiValuedContainmentReferenceLifecycleManager = new EEFMultiValuedContainmentReferenceLifecycleManager(
					eefMultiValuedContainmentReferenceDescription, childVariableManager, interpreter, editingDomain);
			eefMultiValuedContainmentReferenceLifecycleManager.createControl(parent, tabbedPropertySheetPage);

			this.lifecycleManagers.add(eefMultiValuedContainmentReferenceLifecycleManager);
		} else if (eefWidgetDescription instanceof EEFMultiValuedReferenceDescription) {
			EEFMultiValuedReferenceDescription eefMultiValuedReferenceDescription = (EEFMultiValuedReferenceDescription) eefWidgetDescription;

			EEFMultiValuedReferenceLifecycleManager eefMultiValuedReferenceLifecycleManager = new EEFMultiValuedReferenceLifecycleManager(
					eefMultiValuedReferenceDescription, childVariableManager, interpreter, editingDomain);
			eefMultiValuedReferenceLifecycleManager.createControl(parent, tabbedPropertySheetPage);

			this.lifecycleManagers.add(eefMultiValuedReferenceLifecycleManager);
		}
	}

	/**
	 * Creates the widgets for the dynamic mapping defined in the description.
	 *
	 * @param parent
	 *            The composite parent
	 * @param tabbedPropertySheetPage
	 *            The tabbed property sheet page
	 * @param dynamicMappingFor
	 *            The root of a dynamic mapping definition
	 */
	private void createDynamicMappingControl(Composite parent, EEFTabbedPropertySheetPage tabbedPropertySheetPage,
			EEFDynamicMappingFor dynamicMappingFor) {
		String domainClassExpression = dynamicMappingFor.getDomainClassExpression();
		EAttribute domainClassEAttribute = EefPackage.Literals.EEF_DYNAMIC_MAPPING_FOR__DOMAIN_CLASS_EXPRESSION;
		String iterator = dynamicMappingFor.getIterator();

		EAttribute ifExpressionEAttribute = EefPackage.Literals.EEF_DYNAMIC_MAPPING_IF__PREDICATE_EXPRESSION;

		Object domainClassExpressionResult = new Eval(this.interpreter, this.variableManager).get(domainClassEAttribute, domainClassExpression,
				Object.class);
		for (EObject eObject : Util.asIterable(domainClassExpressionResult, EObject.class)) {
			Map<String, Object> switchExpressionVariables = new HashMap<String, Object>();
			switchExpressionVariables.put(EEFExpressionUtils.SELF, this.variableManager.getVariables().get(EEFExpressionUtils.SELF));
			switchExpressionVariables.put(iterator, eObject);

			EEFWidgetDescription eefWidgetDescription = null;
			List<EEFDynamicMappingIf> dynamicMappingIfs = dynamicMappingFor.getIfs();
			for (EEFDynamicMappingIf dynamicMappingIf : dynamicMappingIfs) {
				Boolean isValid = new Eval(this.interpreter, switchExpressionVariables).get(ifExpressionEAttribute,
						dynamicMappingIf.getPredicateExpression(), Boolean.class);
				if (isValid != null && isValid.booleanValue()) {
					eefWidgetDescription = dynamicMappingIf.getWidget();
					break;
				}
			}

			if (eefWidgetDescription != null) {
				IVariableManager childVariableManager = this.variableManager.createChild();
				childVariableManager.put(iterator, eObject);
				this.createWidgetControl(parent, tabbedPropertySheetPage, eefWidgetDescription, childVariableManager);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.internal.widgets.ILifecycleManager#aboutToBeShown()
	 */
	@Override
	public void aboutToBeShown() {
		for (ILifecycleManager lifecycleManager : lifecycleManagers) {
			lifecycleManager.aboutToBeShown();
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.internal.widgets.ILifecycleManager#refresh()
	 */
	@Override
	public void refresh() {
		for (ILifecycleManager lifecycleManager : lifecycleManagers) {
			lifecycleManager.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.internal.widgets.ILifecycleManager#aboutToBeHidden()
	 */
	@Override
	public void aboutToBeHidden() {
		for (ILifecycleManager lifecycleManager : lifecycleManagers) {
			lifecycleManager.aboutToBeHidden();
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.internal.widgets.ILifecycleManager#dispose()
	 */
	@Override
	public void dispose() {
		for (ILifecycleManager lifecycleManager : lifecycleManagers) {
			lifecycleManager.dispose();
		}
	}

}
