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
package org.eclipse.eef.properties.ui.widgets.references;

import org.eclipse.eef.EEFCustomDescription;
import org.eclipse.eef.ide.ui.api.IEEFCustomWidgetDescriptionProvider;
import org.eclipse.eef.ide.ui.api.ILifecycleManager;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;

/**
 * The single reference viewer provider.
 *
 * @author mbats
 */
public class SingleReferenceViewerProvider implements IEEFCustomWidgetDescriptionProvider {

    @Override
    public ILifecycleManager getLifecycleManager(EEFCustomDescription customWidgetDescription, IVariableManager variableManager, IInterpreter interpreter, TransactionalEditingDomain editingDomain) {
        return new SingleReferenceViewerLifecycleManager(customWidgetDescription, variableManager, interpreter, editingDomain);
    }
}
