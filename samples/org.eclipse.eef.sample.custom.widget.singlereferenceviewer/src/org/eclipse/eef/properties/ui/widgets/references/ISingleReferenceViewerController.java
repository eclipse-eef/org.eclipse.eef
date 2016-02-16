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

import org.eclipse.eef.core.api.controllers.IConsumer;
import org.eclipse.eef.core.api.controllers.IEEFWidgetController;

/**
 * The ISingleReferenceViewerController is responsible of supporting all the
 * interactions with the widgets created for a single reference viewer.
 *
 * @author mbats
 */
public interface ISingleReferenceViewerController extends IEEFWidgetController {
    /**
     * Register a consumer which will be called with the new value of the text
     * when it will change.
     *
     * @param consumer
     *            The consumer of the new value of the text
     */
    void onNewValue(IConsumer<String> consumer);

    /**
     * Remove the consumer of the new value of the text.
     */
    void removeNewValueConsumer();

    /**
     * Invoked when the user pushes the add button.
     */
    void add();

    /**
     * Invoked when the user pushes the set button.
     */
    void set();

    /**
     * Invoked when the user pushes the unset button.
     */
    void unset();

    /**
     * Invoked when the user clicks on an hyperlink.
     */
    void hyperlink();

}
