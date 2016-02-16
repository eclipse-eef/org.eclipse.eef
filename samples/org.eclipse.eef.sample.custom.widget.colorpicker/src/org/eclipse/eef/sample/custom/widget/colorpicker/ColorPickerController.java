package org.eclipse.eef.sample.custom.widget.colorpicker;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.eef.EEFCustomWidgetDescription;
import org.eclipse.eef.EefPackage;
import org.eclipse.eef.core.api.EEFExpressionUtils;
import org.eclipse.eef.core.api.controllers.AbstractEEFCustomWidgetController;
import org.eclipse.eef.core.api.controllers.IConsumer;
import org.eclipse.eef.core.api.utils.Eval;
import org.eclipse.eef.core.api.utils.ISuccessfulResultConsumer;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
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
     * @param editingDomain
     *            The editing domain
     */
    public ColorPickerController(EEFCustomWidgetDescription description, IVariableManager variableManager, IInterpreter interpreter, TransactionalEditingDomain editingDomain) {
        super(description, variableManager, interpreter, editingDomain);
    }

    /**
     * {@inheritDoc}
     *
     * @see org.eclipse.eef.core.internal.controllers.AbstractEEFCustomWidgetController#refresh()
     */
    @Override
    public void refresh() {
        super.refresh();

        String valueExpression = getCustomExpression(VALUE_EXPRESSION_ID);
        EAttribute eAttribute = EefPackage.Literals.EEF_CUSTOM_EXPRESSION__CUSTOM_EXPRESSION;

        this.newEval().call(eAttribute, valueExpression, String.class, new ISuccessfulResultConsumer<String>() {
            @Override
            public void apply(String value) {
                String[] rgb = value.split(SEPARATOR);
                int red = Integer.parseInt(rgb[0]);
                int green = Integer.parseInt(rgb[1]);
                int blue = Integer.parseInt(rgb[2]);
                Color color = ColorHelper.getColor(red, green, blue);
                ColorPickerController.this.newValueConsumer.apply(color);
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

        final Command command = new RecordingCommand(this.editingDomain) {
            @Override
            protected void doExecute() {
                String editExpression = getCustomExpression(EDIT_EXPRESSION_ID);
                EAttribute eAttribute = EefPackage.Literals.EEF_CUSTOM_EXPRESSION__CUSTOM_EXPRESSION;

                Map<String, Object> variables = new HashMap<String, Object>();
                variables.putAll(ColorPickerController.this.variableManager.getVariables());
                variables.put(EEFExpressionUtils.EEFText.NEW_VALUE, color.red + SEPARATOR + color.green + SEPARATOR + color.blue);

                new Eval(ColorPickerController.this.interpreter, variables).call(eAttribute, editExpression);
            }

            @Override
            public boolean canExecute() {
                return true;
            }
        };

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                CommandStack commandStack = ColorPickerController.this.editingDomain.getCommandStack();
                commandStack.execute(command);
            }
        };
        runnable.run();
    }

}
