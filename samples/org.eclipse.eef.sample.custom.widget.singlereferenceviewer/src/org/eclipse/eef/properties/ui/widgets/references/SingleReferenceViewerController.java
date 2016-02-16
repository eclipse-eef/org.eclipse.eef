package org.eclipse.eef.properties.ui.widgets.references;

import org.eclipse.eef.EEFCustomDescription;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.EefPackage;
import org.eclipse.eef.core.api.controllers.AbstractEEFCustomWidgetController;
import org.eclipse.eef.core.api.controllers.IConsumer;
import org.eclipse.eef.core.api.utils.ISuccessfulResultConsumer;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;

/**
 * This class is used to provide utilities to single reference viewer
 * controller.
 *
 * @author mbats
 */
public class SingleReferenceViewerController extends AbstractEEFCustomWidgetController implements ISingleReferenceViewerController {
    /**
     * Value expression id.
     */
    private static final String VALUE_EXPRESSION_ID = "valueExpression";

    /**
     * Add expression id.
     */
    private static final String ADD_EXPRESSION_ID = "addExpression";

    /**
     * Set expression id.
     */
    private static final String SET_EXPRESSION_ID = "setExpression";

    /**
     * Unset expression id.
     */
    private static final String UNSET_EXPRESSION_ID = "unsetExpression";

    /**
     * Hyperlink expression id.
     */
    private static final String HYPERLINK_EXPRESSION_ID = "hyperlinkExpression";

    /**
     * The consumer of a new value of the text.
     */
    private IConsumer<String> newValueConsumer;

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
    public SingleReferenceViewerController(EEFCustomDescription description, IVariableManager variableManager, IInterpreter interpreter, TransactionalEditingDomain editingDomain) {
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
                SingleReferenceViewerController.this.newValueConsumer.apply(value);
            }
        });
    }

    @Override
    public void onNewValue(IConsumer<String> consumer) {
        this.newValueConsumer = consumer;
    }

    @Override
    public void removeNewValueConsumer() {
        this.newValueConsumer = null;
    }

    @Override
    public void add() {
        executeCommandExpression(ADD_EXPRESSION_ID);
    }


    @Override
    public void set() {
        executeCommandExpression(SET_EXPRESSION_ID);
    }

    @Override
    public void unset() {
        executeCommandExpression(UNSET_EXPRESSION_ID);
    }

    @Override
    public void hyperlink() {
        executeCommandExpression(HYPERLINK_EXPRESSION_ID);
    }

    @Override
    protected EEFWidgetDescription getDescription() {
        return this.description;
    }

}
