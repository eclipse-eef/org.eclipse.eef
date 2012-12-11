package org.eclipse.emf.samples.tests.junit;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.eclipse.emf.samples.tests.junit.modelingbot.ComposedBotModelingTestCase;
import org.eclipse.emf.samples.tests.junit.modelingbot.ConferenceModelingBotTestCase;
import org.eclipse.emf.samples.tests.junit.modelingbot.SWTBotModelingTestCase;
import org.eclipse.emf.samples.tests.junit.modelingbot.SWTBotModelingTestCase2;
import org.eclipse.emf.samples.tests.junit.modelingbot.SWTBotModelingTestCase3;
import org.eclipse.emf.samples.tests.junit.modelingbot.SiteModelingBotTestCase;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.conference.ComposedMBotAddAdvTableCompo;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.conference.ComposedMBotCancelAddAdvTableCompo;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.conference.ComposedMBotCancelSetAttributeMVE;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.conference.ComposedMBotCancelSetReferenceAdvRefTable;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.conference.ComposedMBotCancelSetReferenceEOFCV;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.conference.ComposedMBotRedoAddAdvTableCompo;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.conference.ComposedMBotRedoSetAttributeCheckbox;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.conference.ComposedMBotRedoSetAttributeEMFComboViewer;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.conference.ComposedMBotRedoSetAttributeMVE;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.conference.ComposedMBotRedoSetAttributeText;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.conference.ComposedMBotRedoSetAttributeTextArea;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.conference.ComposedMBotRedoSetReferenceAdvRefTable;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.conference.ComposedMBotRedoSetReferenceEOFCV;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.conference.ComposedMBotRemoveAdvTableCompo;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.conference.ComposedMBotSetAttributeCheckbox;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.conference.ComposedMBotSetAttributeEMFComboViewer;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.conference.ComposedMBotSetAttributeInteger;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.conference.ComposedMBotSetAttributeMVE;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.conference.ComposedMBotSetAttributeText;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.conference.ComposedMBotSetAttributeTextArea;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.conference.ComposedMBotSetReferenceAdvRefTable;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.conference.ComposedMBotSetReferenceAdvRefTable2;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.conference.ComposedMBotSetReferenceEOFCV;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.conference.ComposedMBotUndoAddAdvTableCompo;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.conference.ComposedMBotUndoSetAttributeCheckbox;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.conference.ComposedMBotUndoSetAttributeEMFComboViewer;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.conference.ComposedMBotUndoSetAttributeMVE;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.conference.ComposedMBotUndoSetAttributeText;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.conference.ComposedMBotUndoSetAttributeTextArea;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.conference.ComposedMBotUndoSetReferenceAdvRefTable;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.conference.ComposedMBotUndoSetReferenceEOFCV;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.conference.ComposedMBotUnsetAdvRefTable;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.conference.ComposedMBotUnsetAttributeMVE;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.conference.ComposedMBotUnsetAttributeText;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.conference.ComposedMBotUnsetAttributeTextArea;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.conference.ComposedMBotUnsetMVE;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.conference.ComposedMBotUnsetReferenceAdvRefTable;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.conference.ComposedMBotUnsetText;
import org.eclipse.emf.samples.tests.junit.modelingbot.composed.detailsview.conference.ComposedMBotUnsetTextArea;
import org.eclipse.emf.samples.tests.junit.modelingbot.propertiesView.conference.PViewMBotAddAdvanceTableComposition;
import org.eclipse.emf.samples.tests.junit.modelingbot.propertiesView.conference.PViewMBotCancelAddAdvanceTableComposition;
import org.eclipse.emf.samples.tests.junit.modelingbot.propertiesView.conference.PViewMBotCancelSetAttributeMVE;
import org.eclipse.emf.samples.tests.junit.modelingbot.propertiesView.conference.PViewMBotCancelSetReferenceAdvRefTable;
import org.eclipse.emf.samples.tests.junit.modelingbot.propertiesView.conference.PViewMBotCancelSetReferenceEOFCV;
import org.eclipse.emf.samples.tests.junit.modelingbot.propertiesView.conference.PViewMBotEditSetReferenceAdvRefTable;
import org.eclipse.emf.samples.tests.junit.modelingbot.propertiesView.conference.PViewMBotEditSetReferenceEOFCV;
import org.eclipse.emf.samples.tests.junit.modelingbot.propertiesView.conference.PViewMBotMoveAdvanceTableComposition;
import org.eclipse.emf.samples.tests.junit.modelingbot.propertiesView.conference.PViewMBotRedoSetAttributeCheckbox;
import org.eclipse.emf.samples.tests.junit.modelingbot.propertiesView.conference.PViewMBotRedoSetAttributeEMFComboViewer;
import org.eclipse.emf.samples.tests.junit.modelingbot.propertiesView.conference.PViewMBotRedoSetAttributeMVE;
import org.eclipse.emf.samples.tests.junit.modelingbot.propertiesView.conference.PViewMBotRedoSetAttributeText;
import org.eclipse.emf.samples.tests.junit.modelingbot.propertiesView.conference.PViewMBotRedoSetAttributeTextArea;
import org.eclipse.emf.samples.tests.junit.modelingbot.propertiesView.conference.PViewMBotRedoSetReferenceAdvRefTable;
import org.eclipse.emf.samples.tests.junit.modelingbot.propertiesView.conference.PViewMBotRedoSetReferenceEOFCV;
import org.eclipse.emf.samples.tests.junit.modelingbot.propertiesView.conference.PViewMBotRemoveAdvanceTableComposition;
import org.eclipse.emf.samples.tests.junit.modelingbot.propertiesView.conference.PViewMBotSetAttributeCheckbox;
import org.eclipse.emf.samples.tests.junit.modelingbot.propertiesView.conference.PViewMBotSetAttributeEMFComboViewer;
import org.eclipse.emf.samples.tests.junit.modelingbot.propertiesView.conference.PViewMBotSetAttributeMVE;
import org.eclipse.emf.samples.tests.junit.modelingbot.propertiesView.conference.PViewMBotSetAttributeText;
import org.eclipse.emf.samples.tests.junit.modelingbot.propertiesView.conference.PViewMBotSetAttributeTextArea;
import org.eclipse.emf.samples.tests.junit.modelingbot.propertiesView.conference.PViewMBotSetReferenceAdvRefTable;
import org.eclipse.emf.samples.tests.junit.modelingbot.propertiesView.conference.PViewMBotSetReferenceEOFCV;
import org.eclipse.emf.samples.tests.junit.modelingbot.propertiesView.conference.PViewMBotUndoAddAdvanceTableComposition;
import org.eclipse.emf.samples.tests.junit.modelingbot.propertiesView.conference.PViewMBotUndoSetAttributeCheckbox;
import org.eclipse.emf.samples.tests.junit.modelingbot.propertiesView.conference.PViewMBotUndoSetAttributeEMFComboViewer;
import org.eclipse.emf.samples.tests.junit.modelingbot.propertiesView.conference.PViewMBotUndoSetAttributeMVE;
import org.eclipse.emf.samples.tests.junit.modelingbot.propertiesView.conference.PViewMBotUndoSetAttributeText;
import org.eclipse.emf.samples.tests.junit.modelingbot.propertiesView.conference.PViewMBotUndoSetAttributeTextArea;
import org.eclipse.emf.samples.tests.junit.modelingbot.propertiesView.conference.PViewMBotUndoSetReferenceAdvRefTable;
import org.eclipse.emf.samples.tests.junit.modelingbot.propertiesView.conference.PViewMBotUndoSetReferenceEOFCV;
import org.eclipse.emf.samples.tests.junit.modelingbot.propertiesView.conference.PViewMBotUnsetAdvancedRefrencesTable;
import org.eclipse.emf.samples.tests.junit.modelingbot.propertiesView.conference.PViewMBotUnsetAttributeMVE;
import org.eclipse.emf.samples.tests.junit.modelingbot.propertiesView.conference.PViewMBotUnsetAttributeText;
import org.eclipse.emf.samples.tests.junit.modelingbot.propertiesView.conference.PViewMBotUnsetAttributeTextArea;
import org.eclipse.emf.samples.tests.junit.modelingbot.propertiesView.conference.PViewMBotUnsetReferenceAdvRefTable;
import org.eclipse.emf.samples.tests.junit.modelingbot.propertiesView.conference.PViewMBotUnsetText;
import org.eclipse.emf.samples.tests.junit.modelingbot.propertiesView.conference.PViewMBotUnsetTextArea;
import org.eclipse.emf.samples.tests.junit.modelingbot.wizard.conference.WizardMBotAddAdvanceTableComposition;
import org.eclipse.emf.samples.tests.junit.modelingbot.wizard.conference.WizardMBotCancelAddAdvanceTableComposition;
import org.eclipse.emf.samples.tests.junit.modelingbot.wizard.conference.WizardMBotCancelSetAttributeMVE;
import org.eclipse.emf.samples.tests.junit.modelingbot.wizard.conference.WizardMBotCancelSetReferenceAdvRefTable;
import org.eclipse.emf.samples.tests.junit.modelingbot.wizard.conference.WizardMBotCancelSetReferenceEOFCV;
import org.eclipse.emf.samples.tests.junit.modelingbot.wizard.conference.WizardMBotEditSetReferenceAdvRefTable;
import org.eclipse.emf.samples.tests.junit.modelingbot.wizard.conference.WizardMBotEditSetReferenceEOFCV;
import org.eclipse.emf.samples.tests.junit.modelingbot.wizard.conference.WizardMBotRedoSetAttributeCheckbox;
import org.eclipse.emf.samples.tests.junit.modelingbot.wizard.conference.WizardMBotRedoSetAttributeEMFComboViewer;
import org.eclipse.emf.samples.tests.junit.modelingbot.wizard.conference.WizardMBotRedoSetAttributeMVE;
import org.eclipse.emf.samples.tests.junit.modelingbot.wizard.conference.WizardMBotRedoSetAttributeText;
import org.eclipse.emf.samples.tests.junit.modelingbot.wizard.conference.WizardMBotRedoSetAttributeTextArea;
import org.eclipse.emf.samples.tests.junit.modelingbot.wizard.conference.WizardMBotRedoSetReferenceAdvRefTable;
import org.eclipse.emf.samples.tests.junit.modelingbot.wizard.conference.WizardMBotRedoSetReferenceEOFCV;
import org.eclipse.emf.samples.tests.junit.modelingbot.wizard.conference.WizardMBotRemoveAdvanceTableComposition;
import org.eclipse.emf.samples.tests.junit.modelingbot.wizard.conference.WizardMBotSetAttributeCheckbox;
import org.eclipse.emf.samples.tests.junit.modelingbot.wizard.conference.WizardMBotSetAttributeEMFComboViewer;
import org.eclipse.emf.samples.tests.junit.modelingbot.wizard.conference.WizardMBotSetAttributeMVE;
import org.eclipse.emf.samples.tests.junit.modelingbot.wizard.conference.WizardMBotSetAttributeText;
import org.eclipse.emf.samples.tests.junit.modelingbot.wizard.conference.WizardMBotSetAttributeTextArea;
import org.eclipse.emf.samples.tests.junit.modelingbot.wizard.conference.WizardMBotSetReferenceAdvRefTable;
import org.eclipse.emf.samples.tests.junit.modelingbot.wizard.conference.WizardMBotSetReferenceEOFCV;
import org.eclipse.emf.samples.tests.junit.modelingbot.wizard.conference.WizardMBotUndoSetAttributeCheckbox;
import org.eclipse.emf.samples.tests.junit.modelingbot.wizard.conference.WizardMBotUndoSetAttributeEMFComboViewer;
import org.eclipse.emf.samples.tests.junit.modelingbot.wizard.conference.WizardMBotUndoSetAttributeMVE;
import org.eclipse.emf.samples.tests.junit.modelingbot.wizard.conference.WizardMBotUndoSetAttributeText;
import org.eclipse.emf.samples.tests.junit.modelingbot.wizard.conference.WizardMBotUndoSetAttributeTextArea;
import org.eclipse.emf.samples.tests.junit.modelingbot.wizard.conference.WizardMBotUndoSetReferenceAdvRefTable;
import org.eclipse.emf.samples.tests.junit.modelingbot.wizard.conference.WizardMBotUndoSetReferenceEOFCV;
import org.eclipse.emf.samples.tests.junit.modelingbot.wizard.conference.WizardMBotUnsetAdvancedRefrencesTable;
import org.eclipse.emf.samples.tests.junit.modelingbot.wizard.conference.WizardMBotUnsetAttributeMVE;
import org.eclipse.emf.samples.tests.junit.modelingbot.wizard.conference.WizardMBotUnsetAttributeText;
import org.eclipse.emf.samples.tests.junit.modelingbot.wizard.conference.WizardMBotUnsetAttributeTextArea;
import org.eclipse.emf.samples.tests.junit.modelingbot.wizard.conference.WizardMBotUnsetReferenceAdvRefTable;
import org.eclipse.emf.samples.tests.junit.modelingbot.wizard.conference.WizardMBotUnsetReferenceEOFCV;
import org.eclipse.emf.samples.tests.junit.modelingbot.wizard.conference.WizardMBotUnsetText;

public class AllTests extends TestCase {

	public static Test suite() {
		TestSuite suite = new TestSuite(AllTests.class.getName());
		//$JUnit-BEGIN$
		// tests on modeling bot
		suite.addTestSuite(ComposedBotModelingTestCase.class);
		suite.addTestSuite(ConferenceModelingBotTestCase.class);
		suite.addTestSuite(SiteModelingBotTestCase.class);
		suite.addTestSuite(SWTBotModelingTestCase.class);
		suite.addTestSuite(SWTBotModelingTestCase2.class);
		suite.addTestSuite(SWTBotModelingTestCase3.class);
		
		// tests composed
		suite.addTestSuite(ComposedMBotAddAdvTableCompo.class);
		suite.addTestSuite(ComposedMBotCancelAddAdvTableCompo.class);
		suite.addTestSuite(ComposedMBotCancelSetAttributeMVE.class);
		suite.addTestSuite(ComposedMBotCancelSetReferenceAdvRefTable.class);
		suite.addTestSuite(ComposedMBotCancelSetReferenceEOFCV.class);
		suite.addTestSuite(ComposedMBotRedoAddAdvTableCompo.class);
		suite.addTestSuite(ComposedMBotRedoSetAttributeCheckbox.class);
		suite.addTestSuite(ComposedMBotRedoSetAttributeEMFComboViewer.class);
		suite.addTestSuite(ComposedMBotRedoSetAttributeMVE.class);
		suite.addTestSuite(ComposedMBotRedoSetAttributeText.class);
		suite.addTestSuite(ComposedMBotRedoSetAttributeTextArea.class);
		suite.addTestSuite(ComposedMBotRedoSetReferenceAdvRefTable.class);
		suite.addTestSuite(ComposedMBotRedoSetReferenceEOFCV.class);
		suite.addTestSuite(ComposedMBotRemoveAdvTableCompo.class);
		suite.addTestSuite(ComposedMBotSetAttributeCheckbox.class);
		suite.addTestSuite(ComposedMBotSetAttributeEMFComboViewer.class);
		suite.addTestSuite(ComposedMBotSetAttributeInteger.class);
		suite.addTestSuite(ComposedMBotSetAttributeMVE.class);
		suite.addTestSuite(ComposedMBotSetAttributeText.class);
		suite.addTestSuite(ComposedMBotSetAttributeTextArea.class);
		suite.addTestSuite(ComposedMBotSetReferenceAdvRefTable.class);
		suite.addTestSuite(ComposedMBotSetReferenceAdvRefTable2.class);
		suite.addTestSuite(ComposedMBotSetReferenceEOFCV.class);
		suite.addTestSuite(ComposedMBotUndoAddAdvTableCompo.class);
		suite.addTestSuite(ComposedMBotUndoSetAttributeCheckbox.class);
		suite.addTestSuite(ComposedMBotUndoSetAttributeEMFComboViewer.class);
		suite.addTestSuite(ComposedMBotUndoSetAttributeMVE.class);
		suite.addTestSuite(ComposedMBotUndoSetAttributeText.class);
		suite.addTestSuite(ComposedMBotUndoSetAttributeTextArea.class);
		suite.addTestSuite(ComposedMBotUndoSetReferenceAdvRefTable.class);
		suite.addTestSuite(ComposedMBotUndoSetReferenceEOFCV.class);
		suite.addTestSuite(ComposedMBotUnsetAdvRefTable.class);
		suite.addTestSuite(ComposedMBotUnsetAttributeMVE.class);
		suite.addTestSuite(ComposedMBotUnsetAttributeText.class);
		suite.addTestSuite(ComposedMBotUnsetAttributeTextArea.class);
		suite.addTestSuite(ComposedMBotUnsetMVE.class);
		suite.addTestSuite(ComposedMBotUnsetReferenceAdvRefTable.class);
		suite.addTestSuite(ComposedMBotUnsetText.class);
		suite.addTestSuite(ComposedMBotUnsetTextArea.class);
				
		// tests on property views
		suite.addTestSuite(PViewMBotAddAdvanceTableComposition.class);
		suite.addTestSuite(PViewMBotCancelAddAdvanceTableComposition.class);
		suite.addTestSuite(PViewMBotCancelSetAttributeMVE.class);
		suite.addTestSuite(PViewMBotCancelSetReferenceAdvRefTable.class);
		suite.addTestSuite(PViewMBotCancelSetReferenceEOFCV.class);
		suite.addTestSuite(PViewMBotEditSetReferenceAdvRefTable.class);
		suite.addTestSuite(PViewMBotEditSetReferenceEOFCV.class);
		suite.addTestSuite(PViewMBotMoveAdvanceTableComposition.class);
		suite.addTestSuite(PViewMBotRedoSetAttributeCheckbox.class);
		suite.addTestSuite(PViewMBotRedoSetAttributeEMFComboViewer.class);
		suite.addTestSuite(PViewMBotRedoSetAttributeMVE.class);
		suite.addTestSuite(PViewMBotRedoSetAttributeText.class);
		suite.addTestSuite(PViewMBotRedoSetAttributeTextArea.class);
		suite.addTestSuite(PViewMBotRedoSetReferenceAdvRefTable.class);
		suite.addTestSuite(PViewMBotRedoSetReferenceEOFCV.class);
		suite.addTestSuite(PViewMBotRemoveAdvanceTableComposition.class);
		suite.addTestSuite(PViewMBotSetAttributeCheckbox.class);
		suite.addTestSuite(PViewMBotSetAttributeEMFComboViewer.class);
		suite.addTestSuite(PViewMBotSetAttributeMVE.class);
		suite.addTestSuite(PViewMBotSetAttributeText.class);
		suite.addTestSuite(PViewMBotSetAttributeTextArea.class);
		suite.addTestSuite(PViewMBotSetReferenceAdvRefTable.class);
		suite.addTestSuite(PViewMBotSetReferenceEOFCV.class);
		suite.addTestSuite(PViewMBotUndoAddAdvanceTableComposition.class);
		suite.addTestSuite(PViewMBotUndoSetAttributeCheckbox.class);
		suite.addTestSuite(PViewMBotUndoSetAttributeEMFComboViewer.class);
		suite.addTestSuite(PViewMBotUndoSetAttributeMVE.class);
		suite.addTestSuite(PViewMBotUndoSetAttributeText.class);
		suite.addTestSuite(PViewMBotUndoSetAttributeTextArea.class);
		suite.addTestSuite(PViewMBotUndoSetReferenceAdvRefTable.class);
		suite.addTestSuite(PViewMBotUndoSetReferenceEOFCV.class);
		suite.addTestSuite(PViewMBotUnsetAdvancedRefrencesTable.class);
		suite.addTestSuite(PViewMBotUnsetAttributeMVE.class);
		suite.addTestSuite(PViewMBotUnsetAttributeText.class);
		suite.addTestSuite(PViewMBotUnsetAttributeTextArea.class);
		suite.addTestSuite(PViewMBotUnsetReferenceAdvRefTable.class);
		suite.addTestSuite(PViewMBotUnsetText.class);
		suite.addTestSuite(PViewMBotUnsetTextArea.class);
		
		// tests on wizards
		suite.addTestSuite(WizardMBotAddAdvanceTableComposition.class);
		suite.addTestSuite(WizardMBotCancelAddAdvanceTableComposition.class);
		suite.addTestSuite(WizardMBotCancelSetAttributeMVE.class);
		suite.addTestSuite(WizardMBotCancelSetReferenceAdvRefTable.class);
		suite.addTestSuite(WizardMBotCancelSetReferenceEOFCV.class);
		suite.addTestSuite(WizardMBotEditSetReferenceAdvRefTable.class);
		suite.addTestSuite(WizardMBotEditSetReferenceEOFCV.class);
		suite.addTestSuite(WizardMBotRedoSetAttributeCheckbox.class);
		suite.addTestSuite(WizardMBotRedoSetAttributeEMFComboViewer.class);
		suite.addTestSuite(WizardMBotRedoSetAttributeMVE.class);
		suite.addTestSuite(WizardMBotRedoSetAttributeText.class);
		suite.addTestSuite(WizardMBotRedoSetAttributeTextArea.class);
		suite.addTestSuite(WizardMBotRedoSetReferenceAdvRefTable.class);
		suite.addTestSuite(WizardMBotRedoSetReferenceEOFCV.class);
		suite.addTestSuite(WizardMBotRemoveAdvanceTableComposition.class);
		suite.addTestSuite(WizardMBotSetAttributeCheckbox.class);
		suite.addTestSuite(WizardMBotSetAttributeEMFComboViewer.class);
		suite.addTestSuite(WizardMBotSetAttributeMVE.class);
		suite.addTestSuite(WizardMBotSetAttributeText.class);
		suite.addTestSuite(WizardMBotSetAttributeTextArea.class);
		suite.addTestSuite(WizardMBotSetReferenceAdvRefTable.class);
		suite.addTestSuite(WizardMBotSetReferenceEOFCV.class);
		suite.addTestSuite(WizardMBotUndoSetAttributeCheckbox.class);
		suite.addTestSuite(WizardMBotUndoSetAttributeEMFComboViewer.class);
		suite.addTestSuite(WizardMBotUndoSetAttributeMVE.class);
		suite.addTestSuite(WizardMBotUndoSetAttributeText.class);
		suite.addTestSuite(WizardMBotUndoSetAttributeTextArea.class);
		suite.addTestSuite(WizardMBotUndoSetReferenceAdvRefTable.class);
		suite.addTestSuite(WizardMBotUndoSetReferenceEOFCV.class);
		suite.addTestSuite(WizardMBotUnsetAdvancedRefrencesTable.class);
		suite.addTestSuite(WizardMBotUnsetAttributeMVE.class);
		suite.addTestSuite(WizardMBotUnsetAttributeText.class);
		suite.addTestSuite(WizardMBotUnsetAttributeTextArea.class);
		suite.addTestSuite(WizardMBotUnsetReferenceAdvRefTable.class);
		suite.addTestSuite(WizardMBotUnsetReferenceEOFCV.class);
		suite.addTestSuite(WizardMBotUnsetText.class);
		
		//$JUnit-END$
		return suite;
	}

}
