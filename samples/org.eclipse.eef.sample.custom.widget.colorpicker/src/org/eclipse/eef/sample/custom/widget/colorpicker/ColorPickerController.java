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

import java.util.HashMap;
import java.util.Map;

import org.eclipse.eef.EEFCustomWidgetDescription;
import org.eclipse.eef.EefPackage;
import org.eclipse.eef.core.api.EEFExpressionUtils;
import org.eclipse.eef.core.api.EditionContextAdapter;
import org.eclipse.eef.core.api.controllers.AbstractEEFCustomWidgetController;
import org.eclipse.eef.core.api.controllers.IConsumer;
import org.eclipse.eef.core.api.utils.Eval;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;

/**
 * This class is used to provide utilities to single reference viewer
 * controller.
 *
 * @author mbats
 */
public class ColorPickerController extends AbstractEEFCustomWidgetController implements IColorPickerController {

    /**
     * Default color code.
     */
    private static final int DEFAULT_COLOR_CODE = 255;

    /**
     * Value expression id.
     */
    private static final String VALUE_EXPRESSION_ID = "valueExpression";

    /**
     * Add expression id.
     */
    private static final String EDIT_EXPRESSION_ID = "editExpression";

    /**
     * Separator.
     */
    private static final String SEPARATOR = ",";

    /**
     * The consumer of a new value of the color.
     */
    private IConsumer<Color> newValueConsumer;

    /**
     * The constructor.
     *
     * @param description
     *            The description
     * @param variableManager
     *            The variable manager
     * @param interpreter
     *            The interpreter
     * @param eca
     *            The editing context adapter
     */
    public ColorPickerController(EEFCustomWidgetDescription description, IVariableManager variableManager, IInterpreter interpreter, EditionContextAdapter eca) {
        super(description, variableManager, interpreter, eca);
    }

    /**
     * {@inheritDoc}
     *
     * @see org.eclipse.eef.core.api.controllers.AbstractEEFWidgetController.
     *      refresh()
     */
    @Override
    public void refresh() {
        super.refresh();

        String valueExpression = getCustomExpression(VALUE_EXPRESSION_ID);
        EAttribute eAttribute = EefPackage.Literals.EEF_CUSTOM_EXPRESSION__CUSTOM_EXPRESSION;

        this.newEval().call(eAttribute, valueExpression, String.class, new IConsumer<String>() {
            @Override
            public void apply(String value) {
                int red = DEFAULT_COLOR_CODE;
                int green = DEFAULT_COLOR_CODE;
                int blue = DEFAULT_COLOR_CODE;
                if (value != null) {
                    String[] rgb = value.split(SEPARATOR);
                    if (rgb.length == 3) {
                        try {
                            red = Integer.parseInt(rgb[0]);
                            green = Integer.parseInt(rgb[1]);
                            blue = Integer.parseInt(rgb[2]);
                            Color color = ColorHelper.getColor(red, green, blue);
                            ColorPickerController.this.newValueConsumer.apply(color);
                        } catch (NumberFormatException e) {
                            // TODO Log warning about unexpected result format
                            // from the expression.
                        }
                    }
                }
            }
        });
    }

    @Override
    public void onNewValue(IConsumer<Color> consumer) {
        this.newValueConsumer = consumer;
    }

    @Override
    public void removeNewValueConsumer() {
        this.newValueConsumer = null;
    }

    @Override
    protected EEFCustomWidgetDescription getDescription() {
        return this.description;
    }

    @Override
    public void updateValue(final RGB color) {
        eca.performModelChange(new Runnable() {
            @Override
            public void run() {
                String editExpression = getCustomExpression(EDIT_EXPRESSION_ID);
                EAttribute eAttribute = EefPackage.Literals.EEF_CUSTOM_EXPRESSION__CUSTOM_EXPRESSION;

                Map<String, Object> variables = new HashMap<String, Object>();
                variables.putAll(ColorPickerController.this.variableManager.getVariables());
                variables.put(EEFExpressionUtils.EEFText.NEW_VALUE, color.red + SEPARATOR + color.green + SEPARATOR + color.blue);

                new Eval(ColorPickerController.this.interpreter, variables).call(eAttribute, editExpression);
            }
        });
    }

}
