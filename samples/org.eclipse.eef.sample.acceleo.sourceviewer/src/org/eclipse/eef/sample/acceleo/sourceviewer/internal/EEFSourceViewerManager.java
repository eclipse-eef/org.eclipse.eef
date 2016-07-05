package org.eclipse.eef.sample.acceleo.sourceviewer.internal;

import org.eclipse.acceleo.ide.ui.AcceleoUIActivator;
import org.eclipse.acceleo.internal.ide.ui.editors.template.AcceleoConfiguration;
import org.eclipse.acceleo.internal.ide.ui.interpreter.AcceleoSourceViewer;
import org.eclipse.eef.EEFTextDescription;
import org.eclipse.eef.ide.ui.api.widgets.IEEFSourceViewerManager;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.DocumentEvent;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentPartitioner;
import org.eclipse.jface.text.IPositionUpdater;
import org.eclipse.jface.text.rules.FastPartitioner;
import org.eclipse.jface.text.source.SourceViewer;
import org.eclipse.swt.widgets.Composite;

@SuppressWarnings("restriction")
public class EEFSourceViewerManager implements IEEFSourceViewerManager {

    @Override
    public boolean canHandle(EEFTextDescription description) {
        return description.getIdentifier().contains("acceleo");
    }

    @Override
    public SourceViewer createSourceViewer(Composite parent, int style) {
        final AcceleoSourceViewer sourceViewer = new AcceleoSourceViewer(parent, null, style);
        sourceViewer.setDocument(new Document());
        sourceViewer.initializeContent();

        IDocument document = sourceViewer.getDocument();
        IDocumentPartitioner partitioner = new FastPartitioner(new org.eclipse.acceleo.internal.ide.ui.editors.template.scanner.AcceleoPartitionScanner(),
                org.eclipse.acceleo.internal.ide.ui.editors.template.scanner.AcceleoPartitionScanner.LEGAL_CONTENT_TYPES);
        document.setDocumentPartitioner(partitioner);
        partitioner.connect(document);

        // Setup source content updating
        document.addPositionUpdater(new IPositionUpdater() {
            @Override
            public void update(DocumentEvent event) {
                sourceViewer.handlePositionUpdate(event.getOffset(), event.getOffset() + event.getLength(), event.getText());
            }
        });
        sourceViewer.configure(new AcceleoConfiguration(AcceleoUIActivator.getDefault().getPreferenceStore()));
        return sourceViewer;
    }

}
