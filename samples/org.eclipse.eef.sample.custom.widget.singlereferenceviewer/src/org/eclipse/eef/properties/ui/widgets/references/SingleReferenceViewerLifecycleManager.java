package org.eclipse.eef.properties.ui.widgets.references;

import org.eclipse.eef.EEFCustomDescription;
import org.eclipse.eef.core.api.controllers.IConsumer;
import org.eclipse.eef.core.api.controllers.IEEFWidgetController;
import org.eclipse.eef.ide.ui.api.AbstractEEFCustomWidgetLifecycleManager;
import org.eclipse.eef.properties.ui.api.EEFTabbedPropertySheetPage;
import org.eclipse.eef.properties.ui.api.EEFTabbedPropertySheetWidgetFactory;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.eclipse.ui.forms.events.IHyperlinkListener;
import org.eclipse.ui.forms.widgets.Hyperlink;

/**
 * This class will be used in order to manager the lifecycle of a single
 * reference viewer.
 *
 * @author mbats
 */
public class SingleReferenceViewerLifecycleManager extends AbstractEEFCustomWidgetLifecycleManager {

    /**
     * The text.
     */
    private Hyperlink text;

    /**
     * The add button.
     */
    private Button addButton;

    /**
     * The set button.
     */
    private Button setButton;

    /**
     * The unset button.
     */
    private Button unsetButton;

    /**
     * The main parent.
     */
    private Composite composite;

    /**
     * The controller.
     */
    private ISingleReferenceViewerController controller;

    /**
     * The listener on the text.
     */
    private IHyperlinkListener hyperlinkListener;

    /**
     * The listener on the add button.
     */
    private SelectionListener addSelectionListener;

    /**
     * The listener on the set button.
     */
    private SelectionListener setSelectionListener;

    /**
     * The listener on the unset button.
     */
    private SelectionListener unsetSelectionListener;

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
     * @param singleReferenceViewerProvider
     */
    public SingleReferenceViewerLifecycleManager(EEFCustomDescription description, IVariableManager variableManager, IInterpreter interpreter, TransactionalEditingDomain editingDomain) {
        super(description, variableManager, interpreter, editingDomain);
    }

    /**
     * {@inheritDoc}
     *
     * @see org.eclipse.eef.ide.ui.api.AbstractEEFCustomWidgetLifecycleManager#createControl(org.eclipse.swt.widgets.Composite,
     *      org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage)
     */
    @Override
    protected void createMainControl(Composite parent, EEFTabbedPropertySheetPage tabbedPropertySheetPage) {
        EEFTabbedPropertySheetWidgetFactory widgetFactory = tabbedPropertySheetPage.getWidgetFactory();

        this.composite = widgetFactory.createComposite(parent, SWT.NONE);

        GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
        GridLayout gridLayout = new GridLayout();
        gridLayout.numColumns = 4;
        gridLayout.marginWidth = 1;
        this.composite.setLayout(gridLayout);
        this.composite.setLayoutData(nameData);
        widgetFactory.paintBordersFor(composite);

        this.text = widgetFactory.createHyperlink(composite, "", SWT.NONE); //$NON-NLS-1$

        this.addButton = widgetFactory.createButton(composite, "Add", SWT.NONE); //$NON-NLS-1$
        this.setButton = widgetFactory.createButton(composite, "Set", SWT.NONE); //$NON-NLS-1$
        this.unsetButton = widgetFactory.createButton(composite, "Unset", SWT.NONE); //$NON-NLS-1$

        this.controller = new SingleReferenceViewerController(getDescription(), getVariableManager(), getInterpreter(), getEditingDomain());
    }

    @Override
    protected IEEFWidgetController getController() {
        return this.controller;
    }

    @Override
    protected Control getValidationControl() {
        return this.composite;
    }

    /**
     * {@inheritDoc}
     *
     * @see org.eclipse.eef.ide.ui.api.AbstractEEFCustomWidgetLifecycleManager#aboutToBeShown()
     */
    @Override
    public void aboutToBeShown() {
        super.aboutToBeShown();

        this.hyperlinkListener = new IHyperlinkListener() {

            @Override
            public void linkExited(HyperlinkEvent e) {
                // Nothing
            }

            @Override
            public void linkEntered(HyperlinkEvent e) {
                // Nothing
            }

            @Override
            public void linkActivated(HyperlinkEvent e) {
                controller.hyperlink();
            }
        };
        this.text.addHyperlinkListener(this.hyperlinkListener);

        this.controller.onNewValue(new IConsumer<String>() {
            @Override
            public void apply(String value) {
                if (!text.isDisposed() && !(text.getText() != null && text.getText().equals(value))) {
                    text.setText(value);
                    if (!text.isEnabled()) {
                        text.setEnabled(true);
                    }
                }
            }
        });

        this.addSelectionListener = new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                controller.add();
            }
        };
        this.addButton.addSelectionListener(this.addSelectionListener);

        this.setSelectionListener = new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                controller.set();
            }
        };
        this.setButton.addSelectionListener(this.setSelectionListener);

        this.unsetSelectionListener = new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                controller.unset();
            }
        };
        this.unsetButton.addSelectionListener(this.unsetSelectionListener);
    }

    /**
     * {@inheritDoc}
     *
     * @see org.eclipse.eef.ide.ui.api.AbstractEEFCustomWidgetLifecycleManager#aboutToBeHidden()
     */
    @Override
    public void aboutToBeHidden() {
        super.aboutToBeHidden();
        if (!text.isDisposed()) {
            this.text.removeHyperlinkListener(this.hyperlinkListener);
        }

        if (!addButton.isDisposed()) {
            this.addButton.removeSelectionListener(this.addSelectionListener);
        }

        if (!setButton.isDisposed()) {
            this.setButton.removeSelectionListener(this.setSelectionListener);
        }

        if (!unsetButton.isDisposed()) {
            this.unsetButton.removeSelectionListener(this.unsetSelectionListener);
        }

        this.controller.removeNewValueConsumer();
    }
}
