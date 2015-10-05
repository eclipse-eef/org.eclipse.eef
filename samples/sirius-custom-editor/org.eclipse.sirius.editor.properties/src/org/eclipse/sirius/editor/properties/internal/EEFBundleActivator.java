package org.eclipse.sirius.editor.properties.internal;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class EEFBundleActivator implements BundleActivator {

    private static final String PLUGIN_ID = "org.eclipse.sirius.editor.properties";

    private static EEFBundleActivator instance;

    public static EEFBundleActivator getInstance() {
        return instance;
    }

    @Override
    public void start(BundleContext context) throws Exception {
        instance = this;
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        instance = null;
    }
}
