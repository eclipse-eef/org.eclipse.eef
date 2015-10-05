package org.eclipse.sirius.editor.custom.editors;

import org.eclipse.sirius.editor.tools.internal.presentation.CustomSiriusEditor;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

@SuppressWarnings("restriction")
public class CustomEditor extends CustomSiriusEditor {
    @Override
    public Object getAdapter(@SuppressWarnings("rawtypes") Class key) {
        if (key.equals(IPropertySheetPage.class)) {
            return getPropertySheetPage();
        }
        return super.getAdapter(key);
    }

    @Override
    public TabbedPropertySheetPage getPropertySheetPage() {
        if (propertySheetPage == null || propertySheetPage.getControl() == null) {
            propertySheetPage = new SiriusPropertySheetPage(this);
        }
        return propertySheetPage;
    }

    /**
     * The contributor id for this configuration
     */
    @Override
    public String getContributorId() {
        return "org.eclipse.sirius.editor.editorPlugin.CustomSiriusEditorContributor";
    }
}
