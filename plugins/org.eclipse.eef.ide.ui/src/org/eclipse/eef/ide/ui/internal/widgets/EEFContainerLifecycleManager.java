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

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.eef.EEFButtonDescription;
import org.eclipse.eef.EEFCheckboxDescription;
import org.eclipse.eef.EEFContainerDescription;
import org.eclipse.eef.EEFCustomWidgetDescription;
import org.eclipse.eef.EEFDynamicMappingFor;
import org.eclipse.eef.EEFDynamicMappingIf;
import org.eclipse.eef.EEFLabelDescription;
import org.eclipse.eef.EEFRadioDescription;
import org.eclipse.eef.EEFSelectDescription;
import org.eclipse.eef.EEFTextDescription;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.EefPackage;
import org.eclipse.eef.common.api.utils.Util;
import org.eclipse.eef.common.ui.api.IEEFFormContainer;
import org.eclipse.eef.core.api.EEFExpressionUtils;
import org.eclipse.eef.core.api.EditionContextAdapter;
import org.eclipse.eef.core.api.utils.Eval;
import org.eclipse.eef.ide.ui.api.ILifecycleManager;
import org.eclipse.eef.ide.ui.internal.EEFIdeUiPlugin;
import org.eclipse.eef.ide.ui.internal.Messages;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
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
	 * The editing context adapter.
	 */
	private EditionContextAdapter contextAdapter;

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
	 * @param contextAdapter
	 *            The editing context adapter
	 */
	public EEFContainerLifecycleManager(EEFContainerDescription description, IVariableManager variableManager, IInterpreter interpreter,
			EditionContextAdapter contextAdapter) {
		this.description = description;
		this.variableManager = variableManager;
		this.interpreter = interpreter;
		this.contextAdapter = contextAdapter;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.ILifecycleManager#createControl(org.eclipse.swt.widgets.Composite,
	 *      org.eclipse.eef.common.ui.api.IEEFFormContainer)
	 */
	@Override
	public void createControl(Composite parent, IEEFFormContainer formContainer) {
		List<EEFWidgetDescription> widgets = this.description.getWidgets();
		for (EEFWidgetDescription eefWidgetDescription : widgets) {
			this.createWidgetControl(parent, formContainer, eefWidgetDescription, this.variableManager.createChild());
		}

		List<EEFDynamicMappingFor> dynamicMappings = this.description.getDynamicMappings();
		for (EEFDynamicMappingFor dynamicMappingFor : dynamicMappings) {
			this.createDynamicMappingControl(parent, formContainer, dynamicMappingFor);
		}
	}

	/**
	 * Creates the control for the widget with the given {@link EEFWidgetDescription}.
	 *
	 * @param parent
	 *            The composite parent
	 * @param formContainer
	 *            The form container
	 * @param eefWidgetDescription
	 *            The description of the widget to create
	 * @param childVariableManager
	 *            The variable manager to use for the widget to create
	 */
	private void createWidgetControl(Composite parent, IEEFFormContainer formContainer, EEFWidgetDescription eefWidgetDescription,
			IVariableManager childVariableManager) {
		if (eefWidgetDescription instanceof EEFTextDescription) {
			EEFTextDescription eefTextDescription = (EEFTextDescription) eefWidgetDescription;

			EEFTextLifecycleManager eefTextLifecycleManager = new EEFTextLifecycleManager(eefTextDescription, childVariableManager, interpreter, contextAdapter);
			eefTextLifecycleManager.createControl(parent, formContainer);

			this.lifecycleManagers.add(eefTextLifecycleManager);
		} else if (eefWidgetDescription instanceof EEFLabelDescription) {
			EEFLabelDescription eefLabelDescription = (EEFLabelDescription) eefWidgetDescription;

			EEFLabelLifecycleManager eefLabelLifecycleManager = new EEFLabelLifecycleManager(eefLabelDescription, childVariableManager, interpreter,
					contextAdapter);
			eefLabelLifecycleManager.createControl(parent, formContainer);

			this.lifecycleManagers.add(eefLabelLifecycleManager);
		} else if (eefWidgetDescription instanceof EEFSelectDescription) {
			EEFSelectDescription eefSelectDescription = (EEFSelectDescription) eefWidgetDescription;

			EEFSelectLifecycleManager eefSelectLifecycleManager = new EEFSelectLifecycleManager(eefSelectDescription, childVariableManager,
					interpreter, contextAdapter);
			eefSelectLifecycleManager.createControl(parent, formContainer);

			this.lifecycleManagers.add(eefSelectLifecycleManager);
		} else if (eefWidgetDescription instanceof EEFRadioDescription) {
			EEFRadioDescription eefRadioDescription = (EEFRadioDescription) eefWidgetDescription;

			EEFRadioLifecycleManager eefRadioLifecycleManager = new EEFRadioLifecycleManager(eefRadioDescription, childVariableManager, interpreter,
					contextAdapter);
			eefRadioLifecycleManager.createControl(parent, formContainer);

			this.lifecycleManagers.add(eefRadioLifecycleManager);
		} else if (eefWidgetDescription instanceof EEFCheckboxDescription) {
			EEFCheckboxDescription eefCheckboxDescription = (EEFCheckboxDescription) eefWidgetDescription;

			EEFCheckboxLifecycleManager eefCheckboxLifecycleManager = new EEFCheckboxLifecycleManager(eefCheckboxDescription, childVariableManager,
					interpreter, contextAdapter);
			eefCheckboxLifecycleManager.createControl(parent, formContainer);

			this.lifecycleManagers.add(eefCheckboxLifecycleManager);
		} else if (eefWidgetDescription instanceof EEFButtonDescription) {
			EEFButtonDescription eefButtonDescription = (EEFButtonDescription) eefWidgetDescription;

			EEFButtonLifecycleManager eefButtonLifecycleManager = new EEFButtonLifecycleManager(eefButtonDescription, childVariableManager,
					interpreter, contextAdapter);
			eefButtonLifecycleManager.createControl(parent, formContainer);

			this.lifecycleManagers.add(eefButtonLifecycleManager);
		} else if (eefWidgetDescription instanceof EEFCustomWidgetDescription) {
			EEFCustomWidgetDescription eefCustomDescription = (EEFCustomWidgetDescription) eefWidgetDescription;
			ILifecycleManager eefCustomWidgetLifecycleManager = EEFIdeUiPlugin.getPlugin().getEEFLifecycleManager(eefCustomDescription,
					childVariableManager, interpreter, contextAdapter);
			if (eefCustomWidgetLifecycleManager != null) {
				eefCustomWidgetLifecycleManager.createControl(parent, formContainer);
				this.lifecycleManagers.add(eefCustomWidgetLifecycleManager);
			} else {
				String message = MessageFormat.format(Messages.EEFIdeUiPlugin_lifecycleManagerNotFound, eefCustomDescription.getIdentifier());
				EEFIdeUiPlugin.getPlugin().error(message);
			}
		}
	}

	/**
	 * Creates the widgets for the dynamic mapping defined in the description.
	 *
	 * @param parent
	 *            The composite parent
	 * @param formContainer
	 *            The form container
	 * @param dynamicMappingFor
	 *            The root of a dynamic mapping definition
	 */
	private void createDynamicMappingControl(Composite parent, IEEFFormContainer formContainer, EEFDynamicMappingFor dynamicMappingFor) {
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
				this.createWidgetControl(parent, formContainer, eefWidgetDescription, childVariableManager);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.ILifecycleManager#aboutToBeShown()
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
	 * @see org.eclipse.eef.ide.ui.api.ILifecycleManager#refresh()
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
	 * @see org.eclipse.eef.ide.ui.api.ILifecycleManager#aboutToBeHidden()
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
	 * @see org.eclipse.eef.ide.ui.api.ILifecycleManager#dispose()
	 */
	@Override
	public void dispose() {
		for (ILifecycleManager lifecycleManager : lifecycleManagers) {
			lifecycleManager.dispose();
		}
	}

}
