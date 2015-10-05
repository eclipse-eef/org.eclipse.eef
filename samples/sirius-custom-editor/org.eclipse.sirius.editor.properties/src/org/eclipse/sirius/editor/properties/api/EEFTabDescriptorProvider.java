package org.eclipse.sirius.editor.properties.api;

import java.util.List;

import org.eclipse.eef.ide.ui.api.TabDescriptorFilter;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.editor.tools.internal.presentation.CustomSiriusEditor;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.ITabDescriptor;
import org.eclipse.ui.views.properties.tabbed.ITabDescriptorProvider;

public class EEFTabDescriptorProvider implements ITabDescriptorProvider {

    @Override
    public ITabDescriptor[] getTabDescriptors(IWorkbenchPart part, ISelection selection) {
        if (part instanceof IEditorPart) {
            IEditorPart iEditorPart = (IEditorPart) part;
            if (iEditorPart instanceof CustomSiriusEditor) {
            	
            	Session session = SessionManager.INSTANCE.getSessions().iterator().next();
            	
                // We have our editor, let's retrieve the tab descriptors
                if (selection instanceof IStructuredSelection) {
                    IStructuredSelection iStructuredSelection = (IStructuredSelection) selection;
                    final Object[] objects = iStructuredSelection.toArray();

                    TabDescriptorFilter tabDescriptorFilter = new TabDescriptorFilter();
                    List<ITabDescriptor> descriptors = tabDescriptorFilter.getTabDescriptors(objects, session.getTransactionalEditingDomain());
                    return descriptors.toArray(new ITabDescriptor[descriptors.size()]);

                }
            }
        }
        return new ITabDescriptor[] {};
    }

}
