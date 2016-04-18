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
package org.eclipse.eef.sample.custom.widget.colorpicker;

import org.eclipse.eef.EEFCustomWidgetDescription;
import org.eclipse.eef.core.api.EditionContextAdapter;
import org.eclipse.eef.ide.ui.api.IEEFLifecycleManagerProvider;
import org.eclipse.eef.ide.ui.api.ILifecycleManager;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;

/**
 * The color picker provider.
 *
 * @author mbats
 */
public class ColorPickerProvider implements IEEFLifecycleManagerProvider {

    @Override
    public ILifecycleManager getLifecycleManager(EEFCustomWidgetDescription customWidgetDescription, IVariableManager variableManager, IInterpreter interpreter, EditionContextAdapter contextAdapter) {
        return new ColorPickerLifecycleManager(customWidgetDescription, variableManager, interpreter, contextAdapter);
    }
}
