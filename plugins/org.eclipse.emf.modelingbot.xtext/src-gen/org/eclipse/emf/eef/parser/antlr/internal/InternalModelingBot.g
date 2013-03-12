/*
* generated by Xtext
*/
grammar InternalModelingBot;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.eclipse.emf.eef.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipse.emf.eef.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.emf.eef.services.ModelingBotGrammarAccess;

}

@parser::members {

 	private ModelingBotGrammarAccess grammarAccess;
 	
    public InternalModelingBotParser(TokenStream input, ModelingBotGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Scenario";	
   	}
   	
   	@Override
   	protected ModelingBotGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleScenario
entryRuleScenario returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getScenarioRule()); }
	 iv_ruleScenario=ruleScenario 
	 { $current=$iv_ruleScenario.current; } 
	 EOF 
;

// Rule Scenario
ruleScenario returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='scenario' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getScenarioAccess().getScenarioKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getScenarioAccess().getNameEStringParserRuleCall_1_0()); 
	    }
		lv_name_1_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getScenarioRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getScenarioAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getScenarioAccess().getProcessingsEEFProcessingsParserRuleCall_3_0()); 
	    }
		lv_processings_3_0=ruleEEFProcessings		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getScenarioRule());
	        }
       		add(
       			$current, 
       			"processings",
        		lv_processings_3_0, 
        		"EEFProcessings");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_4='}' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getScenarioAccess().getRightCurlyBracketKeyword_4());
    }
)
;





// Entry rule entryRuleEEFProcessings
entryRuleEEFProcessings returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEEFProcessingsRule()); }
	 iv_ruleEEFProcessings=ruleEEFProcessings 
	 { $current=$iv_ruleEEFProcessings.current; } 
	 EOF 
;

// Rule EEFProcessings
ruleEEFProcessings returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getEEFProcessingsAccess().getDetailsParserRuleCall_0()); 
    }
    this_Details_0=ruleDetails
    { 
        $current = $this_Details_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getEEFProcessingsAccess().getWizardParserRuleCall_1()); 
    }
    this_Wizard_1=ruleWizard
    { 
        $current = $this_Wizard_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getEEFProcessingsAccess().getPropertiesViewParserRuleCall_2()); 
    }
    this_PropertiesView_2=rulePropertiesView
    { 
        $current = $this_PropertiesView_2.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRulePropertiesView
entryRulePropertiesView returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPropertiesViewRule()); }
	 iv_rulePropertiesView=rulePropertiesView 
	 { $current=$iv_rulePropertiesView.current; } 
	 EOF 
;

// Rule PropertiesView
rulePropertiesView returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='propertiesView' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getPropertiesViewAccess().getPropertiesViewKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getPropertiesViewAccess().getNameEStringParserRuleCall_1_0()); 
	    }
		lv_name_1_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPropertiesViewRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)?	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getPropertiesViewAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getPropertiesViewAccess().getProcessingsSubProcessingsParserRuleCall_3_0()); 
	    }
		lv_processings_3_0=ruleSubProcessings		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPropertiesViewRule());
	        }
       		add(
       			$current, 
       			"processings",
        		lv_processings_3_0, 
        		"SubProcessings");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_4='}' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getPropertiesViewAccess().getRightCurlyBracketKeyword_4());
    }
)
;





// Entry rule entryRuleWizard
entryRuleWizard returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getWizardRule()); }
	 iv_ruleWizard=ruleWizard 
	 { $current=$iv_ruleWizard.current; } 
	 EOF 
;

// Rule Wizard
ruleWizard returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='wizard' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getWizardAccess().getWizardKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getWizardAccess().getNameEStringParserRuleCall_1_0()); 
	    }
		lv_name_1_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getWizardRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)?	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getWizardAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getWizardAccess().getProcessingsSubProcessingsParserRuleCall_3_0()); 
	    }
		lv_processings_3_0=ruleSubProcessings		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getWizardRule());
	        }
       		add(
       			$current, 
       			"processings",
        		lv_processings_3_0, 
        		"SubProcessings");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_4='}' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getWizardAccess().getRightCurlyBracketKeyword_4());
    }
)
;





// Entry rule entryRuleDetails
entryRuleDetails returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDetailsRule()); }
	 iv_ruleDetails=ruleDetails 
	 { $current=$iv_ruleDetails.current; } 
	 EOF 
;

// Rule Details
ruleDetails returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='detailsPage' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getDetailsAccess().getDetailsPageKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getDetailsAccess().getNameEStringParserRuleCall_1_0()); 
	    }
		lv_name_1_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDetailsRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)?	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getDetailsAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getDetailsAccess().getProcessingsSubProcessingsParserRuleCall_3_0()); 
	    }
		lv_processings_3_0=ruleSubProcessings		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDetailsRule());
	        }
       		add(
       			$current, 
       			"processings",
        		lv_processings_3_0, 
        		"SubProcessings");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_4='}' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getDetailsAccess().getRightCurlyBracketKeyword_4());
    }
)
;





// Entry rule entryRuleSubProcessings
entryRuleSubProcessings returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSubProcessingsRule()); }
	 iv_ruleSubProcessings=ruleSubProcessings 
	 { $current=$iv_ruleSubProcessings.current; } 
	 EOF 
;

// Rule SubProcessings
ruleSubProcessings returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:

    { 
        newCompositeNode(grammarAccess.getSubProcessingsAccess().getWizardParserRuleCall()); 
    }
    this_Wizard_0=ruleWizard
    { 
        $current = $this_Wizard_0.current; 
        afterParserOrEnumRuleCall();
    }

;





// Entry rule entryRuleEString
entryRuleEString returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getEStringRule()); } 
	 iv_ruleEString=ruleEString 
	 { $current=$iv_ruleEString.current.getText(); }  
	 EOF 
;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_STRING_0=RULE_STRING    {
		$current.merge(this_STRING_0);
    }

    { 
    newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
    }

    |    this_ID_1=RULE_ID    {
		$current.merge(this_ID_1);
    }

    { 
    newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
    }
)
    ;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


