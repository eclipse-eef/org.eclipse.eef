package org.eclipse.sirius.expression.text.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.eclipse.sirius.expression.text.services.ExpressionTextGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExpressionTextParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_WS", "'package'", "'{'", "'}'", "'class'", "'.'", "'var'", "':'", "'exp'", "'('", "')'", "'['", "'..'", "']'", "'userDefinedVariableContainers'", "'='", "','", "'-'", "'optional'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__10=10;
    public static final int T__9=9;
    public static final int T__8=8;
    public static final int RULE_ID=4;
    public static final int RULE_WS=7;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=6;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalExpressionTextParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalExpressionTextParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalExpressionTextParser.tokenNames; }
    public String getGrammarFileName() { return "InternalExpressionText.g"; }


     
     	private ExpressionTextGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ExpressionTextGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleSiriusExpressionPackage"
    // InternalExpressionText.g:60:1: entryRuleSiriusExpressionPackage : ruleSiriusExpressionPackage EOF ;
    public final void entryRuleSiriusExpressionPackage() throws RecognitionException {
        try {
            // InternalExpressionText.g:61:1: ( ruleSiriusExpressionPackage EOF )
            // InternalExpressionText.g:62:1: ruleSiriusExpressionPackage EOF
            {
             before(grammarAccess.getSiriusExpressionPackageRule()); 
            pushFollow(FOLLOW_1);
            ruleSiriusExpressionPackage();

            state._fsp--;

             after(grammarAccess.getSiriusExpressionPackageRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSiriusExpressionPackage"


    // $ANTLR start "ruleSiriusExpressionPackage"
    // InternalExpressionText.g:69:1: ruleSiriusExpressionPackage : ( ( rule__SiriusExpressionPackage__Group__0 ) ) ;
    public final void ruleSiriusExpressionPackage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:73:2: ( ( ( rule__SiriusExpressionPackage__Group__0 ) ) )
            // InternalExpressionText.g:74:1: ( ( rule__SiriusExpressionPackage__Group__0 ) )
            {
            // InternalExpressionText.g:74:1: ( ( rule__SiriusExpressionPackage__Group__0 ) )
            // InternalExpressionText.g:75:1: ( rule__SiriusExpressionPackage__Group__0 )
            {
             before(grammarAccess.getSiriusExpressionPackageAccess().getGroup()); 
            // InternalExpressionText.g:76:1: ( rule__SiriusExpressionPackage__Group__0 )
            // InternalExpressionText.g:76:2: rule__SiriusExpressionPackage__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SiriusExpressionPackage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSiriusExpressionPackageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSiriusExpressionPackage"


    // $ANTLR start "entryRuleSiriusExpressionClass"
    // InternalExpressionText.g:88:1: entryRuleSiriusExpressionClass : ruleSiriusExpressionClass EOF ;
    public final void entryRuleSiriusExpressionClass() throws RecognitionException {
        try {
            // InternalExpressionText.g:89:1: ( ruleSiriusExpressionClass EOF )
            // InternalExpressionText.g:90:1: ruleSiriusExpressionClass EOF
            {
             before(grammarAccess.getSiriusExpressionClassRule()); 
            pushFollow(FOLLOW_1);
            ruleSiriusExpressionClass();

            state._fsp--;

             after(grammarAccess.getSiriusExpressionClassRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSiriusExpressionClass"


    // $ANTLR start "ruleSiriusExpressionClass"
    // InternalExpressionText.g:97:1: ruleSiriusExpressionClass : ( ( rule__SiriusExpressionClass__Group__0 ) ) ;
    public final void ruleSiriusExpressionClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:101:2: ( ( ( rule__SiriusExpressionClass__Group__0 ) ) )
            // InternalExpressionText.g:102:1: ( ( rule__SiriusExpressionClass__Group__0 ) )
            {
            // InternalExpressionText.g:102:1: ( ( rule__SiriusExpressionClass__Group__0 ) )
            // InternalExpressionText.g:103:1: ( rule__SiriusExpressionClass__Group__0 )
            {
             before(grammarAccess.getSiriusExpressionClassAccess().getGroup()); 
            // InternalExpressionText.g:104:1: ( rule__SiriusExpressionClass__Group__0 )
            // InternalExpressionText.g:104:2: rule__SiriusExpressionClass__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SiriusExpressionClass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSiriusExpressionClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSiriusExpressionClass"


    // $ANTLR start "entryRuleFQN"
    // InternalExpressionText.g:116:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // InternalExpressionText.g:117:1: ( ruleFQN EOF )
            // InternalExpressionText.g:118:1: ruleFQN EOF
            {
             before(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_1);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getFQNRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // InternalExpressionText.g:125:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:129:2: ( ( ( rule__FQN__Group__0 ) ) )
            // InternalExpressionText.g:130:1: ( ( rule__FQN__Group__0 ) )
            {
            // InternalExpressionText.g:130:1: ( ( rule__FQN__Group__0 ) )
            // InternalExpressionText.g:131:1: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // InternalExpressionText.g:132:1: ( rule__FQN__Group__0 )
            // InternalExpressionText.g:132:2: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FQN__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFQNAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleSiriusVariable"
    // InternalExpressionText.g:144:1: entryRuleSiriusVariable : ruleSiriusVariable EOF ;
    public final void entryRuleSiriusVariable() throws RecognitionException {
        try {
            // InternalExpressionText.g:145:1: ( ruleSiriusVariable EOF )
            // InternalExpressionText.g:146:1: ruleSiriusVariable EOF
            {
             before(grammarAccess.getSiriusVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleSiriusVariable();

            state._fsp--;

             after(grammarAccess.getSiriusVariableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSiriusVariable"


    // $ANTLR start "ruleSiriusVariable"
    // InternalExpressionText.g:153:1: ruleSiriusVariable : ( ( rule__SiriusVariable__Group__0 ) ) ;
    public final void ruleSiriusVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:157:2: ( ( ( rule__SiriusVariable__Group__0 ) ) )
            // InternalExpressionText.g:158:1: ( ( rule__SiriusVariable__Group__0 ) )
            {
            // InternalExpressionText.g:158:1: ( ( rule__SiriusVariable__Group__0 ) )
            // InternalExpressionText.g:159:1: ( rule__SiriusVariable__Group__0 )
            {
             before(grammarAccess.getSiriusVariableAccess().getGroup()); 
            // InternalExpressionText.g:160:1: ( rule__SiriusVariable__Group__0 )
            // InternalExpressionText.g:160:2: rule__SiriusVariable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SiriusVariable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSiriusVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSiriusVariable"


    // $ANTLR start "entryRuleSiriusExpressionDescription"
    // InternalExpressionText.g:172:1: entryRuleSiriusExpressionDescription : ruleSiriusExpressionDescription EOF ;
    public final void entryRuleSiriusExpressionDescription() throws RecognitionException {
        try {
            // InternalExpressionText.g:173:1: ( ruleSiriusExpressionDescription EOF )
            // InternalExpressionText.g:174:1: ruleSiriusExpressionDescription EOF
            {
             before(grammarAccess.getSiriusExpressionDescriptionRule()); 
            pushFollow(FOLLOW_1);
            ruleSiriusExpressionDescription();

            state._fsp--;

             after(grammarAccess.getSiriusExpressionDescriptionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSiriusExpressionDescription"


    // $ANTLR start "ruleSiriusExpressionDescription"
    // InternalExpressionText.g:181:1: ruleSiriusExpressionDescription : ( ( rule__SiriusExpressionDescription__Group__0 ) ) ;
    public final void ruleSiriusExpressionDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:185:2: ( ( ( rule__SiriusExpressionDescription__Group__0 ) ) )
            // InternalExpressionText.g:186:1: ( ( rule__SiriusExpressionDescription__Group__0 ) )
            {
            // InternalExpressionText.g:186:1: ( ( rule__SiriusExpressionDescription__Group__0 ) )
            // InternalExpressionText.g:187:1: ( rule__SiriusExpressionDescription__Group__0 )
            {
             before(grammarAccess.getSiriusExpressionDescriptionAccess().getGroup()); 
            // InternalExpressionText.g:188:1: ( rule__SiriusExpressionDescription__Group__0 )
            // InternalExpressionText.g:188:2: rule__SiriusExpressionDescription__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SiriusExpressionDescription__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSiriusExpressionDescriptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSiriusExpressionDescription"


    // $ANTLR start "entryRuleSiriusParameter"
    // InternalExpressionText.g:200:1: entryRuleSiriusParameter : ruleSiriusParameter EOF ;
    public final void entryRuleSiriusParameter() throws RecognitionException {
        try {
            // InternalExpressionText.g:201:1: ( ruleSiriusParameter EOF )
            // InternalExpressionText.g:202:1: ruleSiriusParameter EOF
            {
             before(grammarAccess.getSiriusParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleSiriusParameter();

            state._fsp--;

             after(grammarAccess.getSiriusParameterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSiriusParameter"


    // $ANTLR start "ruleSiriusParameter"
    // InternalExpressionText.g:209:1: ruleSiriusParameter : ( ( rule__SiriusParameter__Group__0 ) ) ;
    public final void ruleSiriusParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:213:2: ( ( ( rule__SiriusParameter__Group__0 ) ) )
            // InternalExpressionText.g:214:1: ( ( rule__SiriusParameter__Group__0 ) )
            {
            // InternalExpressionText.g:214:1: ( ( rule__SiriusParameter__Group__0 ) )
            // InternalExpressionText.g:215:1: ( rule__SiriusParameter__Group__0 )
            {
             before(grammarAccess.getSiriusParameterAccess().getGroup()); 
            // InternalExpressionText.g:216:1: ( rule__SiriusParameter__Group__0 )
            // InternalExpressionText.g:216:2: rule__SiriusParameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SiriusParameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSiriusParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSiriusParameter"


    // $ANTLR start "entryRuleBound"
    // InternalExpressionText.g:228:1: entryRuleBound : ruleBound EOF ;
    public final void entryRuleBound() throws RecognitionException {
        try {
            // InternalExpressionText.g:229:1: ( ruleBound EOF )
            // InternalExpressionText.g:230:1: ruleBound EOF
            {
             before(grammarAccess.getBoundRule()); 
            pushFollow(FOLLOW_1);
            ruleBound();

            state._fsp--;

             after(grammarAccess.getBoundRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBound"


    // $ANTLR start "ruleBound"
    // InternalExpressionText.g:237:1: ruleBound : ( ( rule__Bound__Group__0 ) ) ;
    public final void ruleBound() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:241:2: ( ( ( rule__Bound__Group__0 ) ) )
            // InternalExpressionText.g:242:1: ( ( rule__Bound__Group__0 ) )
            {
            // InternalExpressionText.g:242:1: ( ( rule__Bound__Group__0 ) )
            // InternalExpressionText.g:243:1: ( rule__Bound__Group__0 )
            {
             before(grammarAccess.getBoundAccess().getGroup()); 
            // InternalExpressionText.g:244:1: ( rule__Bound__Group__0 )
            // InternalExpressionText.g:244:2: rule__Bound__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Bound__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBoundAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBound"


    // $ANTLR start "rule__SiriusExpressionPackage__Group__0"
    // InternalExpressionText.g:258:1: rule__SiriusExpressionPackage__Group__0 : rule__SiriusExpressionPackage__Group__0__Impl rule__SiriusExpressionPackage__Group__1 ;
    public final void rule__SiriusExpressionPackage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:262:1: ( rule__SiriusExpressionPackage__Group__0__Impl rule__SiriusExpressionPackage__Group__1 )
            // InternalExpressionText.g:263:2: rule__SiriusExpressionPackage__Group__0__Impl rule__SiriusExpressionPackage__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__SiriusExpressionPackage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SiriusExpressionPackage__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionPackage__Group__0"


    // $ANTLR start "rule__SiriusExpressionPackage__Group__0__Impl"
    // InternalExpressionText.g:270:1: rule__SiriusExpressionPackage__Group__0__Impl : ( 'package' ) ;
    public final void rule__SiriusExpressionPackage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:274:1: ( ( 'package' ) )
            // InternalExpressionText.g:275:1: ( 'package' )
            {
            // InternalExpressionText.g:275:1: ( 'package' )
            // InternalExpressionText.g:276:1: 'package'
            {
             before(grammarAccess.getSiriusExpressionPackageAccess().getPackageKeyword_0()); 
            match(input,8,FOLLOW_2); 
             after(grammarAccess.getSiriusExpressionPackageAccess().getPackageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionPackage__Group__0__Impl"


    // $ANTLR start "rule__SiriusExpressionPackage__Group__1"
    // InternalExpressionText.g:289:1: rule__SiriusExpressionPackage__Group__1 : rule__SiriusExpressionPackage__Group__1__Impl rule__SiriusExpressionPackage__Group__2 ;
    public final void rule__SiriusExpressionPackage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:293:1: ( rule__SiriusExpressionPackage__Group__1__Impl rule__SiriusExpressionPackage__Group__2 )
            // InternalExpressionText.g:294:2: rule__SiriusExpressionPackage__Group__1__Impl rule__SiriusExpressionPackage__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__SiriusExpressionPackage__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SiriusExpressionPackage__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionPackage__Group__1"


    // $ANTLR start "rule__SiriusExpressionPackage__Group__1__Impl"
    // InternalExpressionText.g:301:1: rule__SiriusExpressionPackage__Group__1__Impl : ( ( rule__SiriusExpressionPackage__EPackageAssignment_1 ) ) ;
    public final void rule__SiriusExpressionPackage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:305:1: ( ( ( rule__SiriusExpressionPackage__EPackageAssignment_1 ) ) )
            // InternalExpressionText.g:306:1: ( ( rule__SiriusExpressionPackage__EPackageAssignment_1 ) )
            {
            // InternalExpressionText.g:306:1: ( ( rule__SiriusExpressionPackage__EPackageAssignment_1 ) )
            // InternalExpressionText.g:307:1: ( rule__SiriusExpressionPackage__EPackageAssignment_1 )
            {
             before(grammarAccess.getSiriusExpressionPackageAccess().getEPackageAssignment_1()); 
            // InternalExpressionText.g:308:1: ( rule__SiriusExpressionPackage__EPackageAssignment_1 )
            // InternalExpressionText.g:308:2: rule__SiriusExpressionPackage__EPackageAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SiriusExpressionPackage__EPackageAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSiriusExpressionPackageAccess().getEPackageAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionPackage__Group__1__Impl"


    // $ANTLR start "rule__SiriusExpressionPackage__Group__2"
    // InternalExpressionText.g:318:1: rule__SiriusExpressionPackage__Group__2 : rule__SiriusExpressionPackage__Group__2__Impl rule__SiriusExpressionPackage__Group__3 ;
    public final void rule__SiriusExpressionPackage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:322:1: ( rule__SiriusExpressionPackage__Group__2__Impl rule__SiriusExpressionPackage__Group__3 )
            // InternalExpressionText.g:323:2: rule__SiriusExpressionPackage__Group__2__Impl rule__SiriusExpressionPackage__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__SiriusExpressionPackage__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SiriusExpressionPackage__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionPackage__Group__2"


    // $ANTLR start "rule__SiriusExpressionPackage__Group__2__Impl"
    // InternalExpressionText.g:330:1: rule__SiriusExpressionPackage__Group__2__Impl : ( '{' ) ;
    public final void rule__SiriusExpressionPackage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:334:1: ( ( '{' ) )
            // InternalExpressionText.g:335:1: ( '{' )
            {
            // InternalExpressionText.g:335:1: ( '{' )
            // InternalExpressionText.g:336:1: '{'
            {
             before(grammarAccess.getSiriusExpressionPackageAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,9,FOLLOW_2); 
             after(grammarAccess.getSiriusExpressionPackageAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionPackage__Group__2__Impl"


    // $ANTLR start "rule__SiriusExpressionPackage__Group__3"
    // InternalExpressionText.g:349:1: rule__SiriusExpressionPackage__Group__3 : rule__SiriusExpressionPackage__Group__3__Impl rule__SiriusExpressionPackage__Group__4 ;
    public final void rule__SiriusExpressionPackage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:353:1: ( rule__SiriusExpressionPackage__Group__3__Impl rule__SiriusExpressionPackage__Group__4 )
            // InternalExpressionText.g:354:2: rule__SiriusExpressionPackage__Group__3__Impl rule__SiriusExpressionPackage__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__SiriusExpressionPackage__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SiriusExpressionPackage__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionPackage__Group__3"


    // $ANTLR start "rule__SiriusExpressionPackage__Group__3__Impl"
    // InternalExpressionText.g:361:1: rule__SiriusExpressionPackage__Group__3__Impl : ( ( rule__SiriusExpressionPackage__ExpressionClassesAssignment_3 )* ) ;
    public final void rule__SiriusExpressionPackage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:365:1: ( ( ( rule__SiriusExpressionPackage__ExpressionClassesAssignment_3 )* ) )
            // InternalExpressionText.g:366:1: ( ( rule__SiriusExpressionPackage__ExpressionClassesAssignment_3 )* )
            {
            // InternalExpressionText.g:366:1: ( ( rule__SiriusExpressionPackage__ExpressionClassesAssignment_3 )* )
            // InternalExpressionText.g:367:1: ( rule__SiriusExpressionPackage__ExpressionClassesAssignment_3 )*
            {
             before(grammarAccess.getSiriusExpressionPackageAccess().getExpressionClassesAssignment_3()); 
            // InternalExpressionText.g:368:1: ( rule__SiriusExpressionPackage__ExpressionClassesAssignment_3 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalExpressionText.g:368:2: rule__SiriusExpressionPackage__ExpressionClassesAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__SiriusExpressionPackage__ExpressionClassesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getSiriusExpressionPackageAccess().getExpressionClassesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionPackage__Group__3__Impl"


    // $ANTLR start "rule__SiriusExpressionPackage__Group__4"
    // InternalExpressionText.g:378:1: rule__SiriusExpressionPackage__Group__4 : rule__SiriusExpressionPackage__Group__4__Impl ;
    public final void rule__SiriusExpressionPackage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:382:1: ( rule__SiriusExpressionPackage__Group__4__Impl )
            // InternalExpressionText.g:383:2: rule__SiriusExpressionPackage__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SiriusExpressionPackage__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionPackage__Group__4"


    // $ANTLR start "rule__SiriusExpressionPackage__Group__4__Impl"
    // InternalExpressionText.g:389:1: rule__SiriusExpressionPackage__Group__4__Impl : ( '}' ) ;
    public final void rule__SiriusExpressionPackage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:393:1: ( ( '}' ) )
            // InternalExpressionText.g:394:1: ( '}' )
            {
            // InternalExpressionText.g:394:1: ( '}' )
            // InternalExpressionText.g:395:1: '}'
            {
             before(grammarAccess.getSiriusExpressionPackageAccess().getRightCurlyBracketKeyword_4()); 
            match(input,10,FOLLOW_2); 
             after(grammarAccess.getSiriusExpressionPackageAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionPackage__Group__4__Impl"


    // $ANTLR start "rule__SiriusExpressionClass__Group__0"
    // InternalExpressionText.g:418:1: rule__SiriusExpressionClass__Group__0 : rule__SiriusExpressionClass__Group__0__Impl rule__SiriusExpressionClass__Group__1 ;
    public final void rule__SiriusExpressionClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:422:1: ( rule__SiriusExpressionClass__Group__0__Impl rule__SiriusExpressionClass__Group__1 )
            // InternalExpressionText.g:423:2: rule__SiriusExpressionClass__Group__0__Impl rule__SiriusExpressionClass__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__SiriusExpressionClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SiriusExpressionClass__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionClass__Group__0"


    // $ANTLR start "rule__SiriusExpressionClass__Group__0__Impl"
    // InternalExpressionText.g:430:1: rule__SiriusExpressionClass__Group__0__Impl : ( 'class' ) ;
    public final void rule__SiriusExpressionClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:434:1: ( ( 'class' ) )
            // InternalExpressionText.g:435:1: ( 'class' )
            {
            // InternalExpressionText.g:435:1: ( 'class' )
            // InternalExpressionText.g:436:1: 'class'
            {
             before(grammarAccess.getSiriusExpressionClassAccess().getClassKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getSiriusExpressionClassAccess().getClassKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionClass__Group__0__Impl"


    // $ANTLR start "rule__SiriusExpressionClass__Group__1"
    // InternalExpressionText.g:449:1: rule__SiriusExpressionClass__Group__1 : rule__SiriusExpressionClass__Group__1__Impl rule__SiriusExpressionClass__Group__2 ;
    public final void rule__SiriusExpressionClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:453:1: ( rule__SiriusExpressionClass__Group__1__Impl rule__SiriusExpressionClass__Group__2 )
            // InternalExpressionText.g:454:2: rule__SiriusExpressionClass__Group__1__Impl rule__SiriusExpressionClass__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__SiriusExpressionClass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SiriusExpressionClass__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionClass__Group__1"


    // $ANTLR start "rule__SiriusExpressionClass__Group__1__Impl"
    // InternalExpressionText.g:461:1: rule__SiriusExpressionClass__Group__1__Impl : ( ( rule__SiriusExpressionClass__EClassAssignment_1 ) ) ;
    public final void rule__SiriusExpressionClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:465:1: ( ( ( rule__SiriusExpressionClass__EClassAssignment_1 ) ) )
            // InternalExpressionText.g:466:1: ( ( rule__SiriusExpressionClass__EClassAssignment_1 ) )
            {
            // InternalExpressionText.g:466:1: ( ( rule__SiriusExpressionClass__EClassAssignment_1 ) )
            // InternalExpressionText.g:467:1: ( rule__SiriusExpressionClass__EClassAssignment_1 )
            {
             before(grammarAccess.getSiriusExpressionClassAccess().getEClassAssignment_1()); 
            // InternalExpressionText.g:468:1: ( rule__SiriusExpressionClass__EClassAssignment_1 )
            // InternalExpressionText.g:468:2: rule__SiriusExpressionClass__EClassAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SiriusExpressionClass__EClassAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSiriusExpressionClassAccess().getEClassAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionClass__Group__1__Impl"


    // $ANTLR start "rule__SiriusExpressionClass__Group__2"
    // InternalExpressionText.g:478:1: rule__SiriusExpressionClass__Group__2 : rule__SiriusExpressionClass__Group__2__Impl rule__SiriusExpressionClass__Group__3 ;
    public final void rule__SiriusExpressionClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:482:1: ( rule__SiriusExpressionClass__Group__2__Impl rule__SiriusExpressionClass__Group__3 )
            // InternalExpressionText.g:483:2: rule__SiriusExpressionClass__Group__2__Impl rule__SiriusExpressionClass__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__SiriusExpressionClass__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SiriusExpressionClass__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionClass__Group__2"


    // $ANTLR start "rule__SiriusExpressionClass__Group__2__Impl"
    // InternalExpressionText.g:490:1: rule__SiriusExpressionClass__Group__2__Impl : ( '{' ) ;
    public final void rule__SiriusExpressionClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:494:1: ( ( '{' ) )
            // InternalExpressionText.g:495:1: ( '{' )
            {
            // InternalExpressionText.g:495:1: ( '{' )
            // InternalExpressionText.g:496:1: '{'
            {
             before(grammarAccess.getSiriusExpressionClassAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,9,FOLLOW_2); 
             after(grammarAccess.getSiriusExpressionClassAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionClass__Group__2__Impl"


    // $ANTLR start "rule__SiriusExpressionClass__Group__3"
    // InternalExpressionText.g:509:1: rule__SiriusExpressionClass__Group__3 : rule__SiriusExpressionClass__Group__3__Impl rule__SiriusExpressionClass__Group__4 ;
    public final void rule__SiriusExpressionClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:513:1: ( rule__SiriusExpressionClass__Group__3__Impl rule__SiriusExpressionClass__Group__4 )
            // InternalExpressionText.g:514:2: rule__SiriusExpressionClass__Group__3__Impl rule__SiriusExpressionClass__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__SiriusExpressionClass__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SiriusExpressionClass__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionClass__Group__3"


    // $ANTLR start "rule__SiriusExpressionClass__Group__3__Impl"
    // InternalExpressionText.g:521:1: rule__SiriusExpressionClass__Group__3__Impl : ( ( rule__SiriusExpressionClass__VariablesAssignment_3 )* ) ;
    public final void rule__SiriusExpressionClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:525:1: ( ( ( rule__SiriusExpressionClass__VariablesAssignment_3 )* ) )
            // InternalExpressionText.g:526:1: ( ( rule__SiriusExpressionClass__VariablesAssignment_3 )* )
            {
            // InternalExpressionText.g:526:1: ( ( rule__SiriusExpressionClass__VariablesAssignment_3 )* )
            // InternalExpressionText.g:527:1: ( rule__SiriusExpressionClass__VariablesAssignment_3 )*
            {
             before(grammarAccess.getSiriusExpressionClassAccess().getVariablesAssignment_3()); 
            // InternalExpressionText.g:528:1: ( rule__SiriusExpressionClass__VariablesAssignment_3 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ML_COMMENT||LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalExpressionText.g:528:2: rule__SiriusExpressionClass__VariablesAssignment_3
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__SiriusExpressionClass__VariablesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getSiriusExpressionClassAccess().getVariablesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionClass__Group__3__Impl"


    // $ANTLR start "rule__SiriusExpressionClass__Group__4"
    // InternalExpressionText.g:538:1: rule__SiriusExpressionClass__Group__4 : rule__SiriusExpressionClass__Group__4__Impl rule__SiriusExpressionClass__Group__5 ;
    public final void rule__SiriusExpressionClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:542:1: ( rule__SiriusExpressionClass__Group__4__Impl rule__SiriusExpressionClass__Group__5 )
            // InternalExpressionText.g:543:2: rule__SiriusExpressionClass__Group__4__Impl rule__SiriusExpressionClass__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__SiriusExpressionClass__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SiriusExpressionClass__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionClass__Group__4"


    // $ANTLR start "rule__SiriusExpressionClass__Group__4__Impl"
    // InternalExpressionText.g:550:1: rule__SiriusExpressionClass__Group__4__Impl : ( ( rule__SiriusExpressionClass__ExpressionDescriptionsAssignment_4 )* ) ;
    public final void rule__SiriusExpressionClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:554:1: ( ( ( rule__SiriusExpressionClass__ExpressionDescriptionsAssignment_4 )* ) )
            // InternalExpressionText.g:555:1: ( ( rule__SiriusExpressionClass__ExpressionDescriptionsAssignment_4 )* )
            {
            // InternalExpressionText.g:555:1: ( ( rule__SiriusExpressionClass__ExpressionDescriptionsAssignment_4 )* )
            // InternalExpressionText.g:556:1: ( rule__SiriusExpressionClass__ExpressionDescriptionsAssignment_4 )*
            {
             before(grammarAccess.getSiriusExpressionClassAccess().getExpressionDescriptionsAssignment_4()); 
            // InternalExpressionText.g:557:1: ( rule__SiriusExpressionClass__ExpressionDescriptionsAssignment_4 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalExpressionText.g:557:2: rule__SiriusExpressionClass__ExpressionDescriptionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__SiriusExpressionClass__ExpressionDescriptionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getSiriusExpressionClassAccess().getExpressionDescriptionsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionClass__Group__4__Impl"


    // $ANTLR start "rule__SiriusExpressionClass__Group__5"
    // InternalExpressionText.g:567:1: rule__SiriusExpressionClass__Group__5 : rule__SiriusExpressionClass__Group__5__Impl ;
    public final void rule__SiriusExpressionClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:571:1: ( rule__SiriusExpressionClass__Group__5__Impl )
            // InternalExpressionText.g:572:2: rule__SiriusExpressionClass__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SiriusExpressionClass__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionClass__Group__5"


    // $ANTLR start "rule__SiriusExpressionClass__Group__5__Impl"
    // InternalExpressionText.g:578:1: rule__SiriusExpressionClass__Group__5__Impl : ( '}' ) ;
    public final void rule__SiriusExpressionClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:582:1: ( ( '}' ) )
            // InternalExpressionText.g:583:1: ( '}' )
            {
            // InternalExpressionText.g:583:1: ( '}' )
            // InternalExpressionText.g:584:1: '}'
            {
             before(grammarAccess.getSiriusExpressionClassAccess().getRightCurlyBracketKeyword_5()); 
            match(input,10,FOLLOW_2); 
             after(grammarAccess.getSiriusExpressionClassAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionClass__Group__5__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // InternalExpressionText.g:609:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:613:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalExpressionText.g:614:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__FQN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FQN__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__0"


    // $ANTLR start "rule__FQN__Group__0__Impl"
    // InternalExpressionText.g:621:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:625:1: ( ( RULE_ID ) )
            // InternalExpressionText.g:626:1: ( RULE_ID )
            {
            // InternalExpressionText.g:626:1: ( RULE_ID )
            // InternalExpressionText.g:627:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__0__Impl"


    // $ANTLR start "rule__FQN__Group__1"
    // InternalExpressionText.g:638:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:642:1: ( rule__FQN__Group__1__Impl )
            // InternalExpressionText.g:643:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FQN__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__1"


    // $ANTLR start "rule__FQN__Group__1__Impl"
    // InternalExpressionText.g:649:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:653:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalExpressionText.g:654:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalExpressionText.g:654:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalExpressionText.g:655:1: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // InternalExpressionText.g:656:1: ( rule__FQN__Group_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==12) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalExpressionText.g:656:2: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getFQNAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__1__Impl"


    // $ANTLR start "rule__FQN__Group_1__0"
    // InternalExpressionText.g:670:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:674:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalExpressionText.g:675:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FQN__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__0"


    // $ANTLR start "rule__FQN__Group_1__0__Impl"
    // InternalExpressionText.g:682:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:686:1: ( ( '.' ) )
            // InternalExpressionText.g:687:1: ( '.' )
            {
            // InternalExpressionText.g:687:1: ( '.' )
            // InternalExpressionText.g:688:1: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__0__Impl"


    // $ANTLR start "rule__FQN__Group_1__1"
    // InternalExpressionText.g:701:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:705:1: ( rule__FQN__Group_1__1__Impl )
            // InternalExpressionText.g:706:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FQN__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__1"


    // $ANTLR start "rule__FQN__Group_1__1__Impl"
    // InternalExpressionText.g:712:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:716:1: ( ( RULE_ID ) )
            // InternalExpressionText.g:717:1: ( RULE_ID )
            {
            // InternalExpressionText.g:717:1: ( RULE_ID )
            // InternalExpressionText.g:718:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__1__Impl"


    // $ANTLR start "rule__SiriusVariable__Group__0"
    // InternalExpressionText.g:733:1: rule__SiriusVariable__Group__0 : rule__SiriusVariable__Group__0__Impl rule__SiriusVariable__Group__1 ;
    public final void rule__SiriusVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:737:1: ( rule__SiriusVariable__Group__0__Impl rule__SiriusVariable__Group__1 )
            // InternalExpressionText.g:738:2: rule__SiriusVariable__Group__0__Impl rule__SiriusVariable__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__SiriusVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SiriusVariable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusVariable__Group__0"


    // $ANTLR start "rule__SiriusVariable__Group__0__Impl"
    // InternalExpressionText.g:745:1: rule__SiriusVariable__Group__0__Impl : ( ( rule__SiriusVariable__DocumentationAssignment_0 )? ) ;
    public final void rule__SiriusVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:749:1: ( ( ( rule__SiriusVariable__DocumentationAssignment_0 )? ) )
            // InternalExpressionText.g:750:1: ( ( rule__SiriusVariable__DocumentationAssignment_0 )? )
            {
            // InternalExpressionText.g:750:1: ( ( rule__SiriusVariable__DocumentationAssignment_0 )? )
            // InternalExpressionText.g:751:1: ( rule__SiriusVariable__DocumentationAssignment_0 )?
            {
             before(grammarAccess.getSiriusVariableAccess().getDocumentationAssignment_0()); 
            // InternalExpressionText.g:752:1: ( rule__SiriusVariable__DocumentationAssignment_0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ML_COMMENT) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalExpressionText.g:752:2: rule__SiriusVariable__DocumentationAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SiriusVariable__DocumentationAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSiriusVariableAccess().getDocumentationAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusVariable__Group__0__Impl"


    // $ANTLR start "rule__SiriusVariable__Group__1"
    // InternalExpressionText.g:762:1: rule__SiriusVariable__Group__1 : rule__SiriusVariable__Group__1__Impl rule__SiriusVariable__Group__2 ;
    public final void rule__SiriusVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:766:1: ( rule__SiriusVariable__Group__1__Impl rule__SiriusVariable__Group__2 )
            // InternalExpressionText.g:767:2: rule__SiriusVariable__Group__1__Impl rule__SiriusVariable__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__SiriusVariable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SiriusVariable__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusVariable__Group__1"


    // $ANTLR start "rule__SiriusVariable__Group__1__Impl"
    // InternalExpressionText.g:774:1: rule__SiriusVariable__Group__1__Impl : ( 'var' ) ;
    public final void rule__SiriusVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:778:1: ( ( 'var' ) )
            // InternalExpressionText.g:779:1: ( 'var' )
            {
            // InternalExpressionText.g:779:1: ( 'var' )
            // InternalExpressionText.g:780:1: 'var'
            {
             before(grammarAccess.getSiriusVariableAccess().getVarKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSiriusVariableAccess().getVarKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusVariable__Group__1__Impl"


    // $ANTLR start "rule__SiriusVariable__Group__2"
    // InternalExpressionText.g:793:1: rule__SiriusVariable__Group__2 : rule__SiriusVariable__Group__2__Impl rule__SiriusVariable__Group__3 ;
    public final void rule__SiriusVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:797:1: ( rule__SiriusVariable__Group__2__Impl rule__SiriusVariable__Group__3 )
            // InternalExpressionText.g:798:2: rule__SiriusVariable__Group__2__Impl rule__SiriusVariable__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__SiriusVariable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SiriusVariable__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusVariable__Group__2"


    // $ANTLR start "rule__SiriusVariable__Group__2__Impl"
    // InternalExpressionText.g:805:1: rule__SiriusVariable__Group__2__Impl : ( ( rule__SiriusVariable__NameAssignment_2 ) ) ;
    public final void rule__SiriusVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:809:1: ( ( ( rule__SiriusVariable__NameAssignment_2 ) ) )
            // InternalExpressionText.g:810:1: ( ( rule__SiriusVariable__NameAssignment_2 ) )
            {
            // InternalExpressionText.g:810:1: ( ( rule__SiriusVariable__NameAssignment_2 ) )
            // InternalExpressionText.g:811:1: ( rule__SiriusVariable__NameAssignment_2 )
            {
             before(grammarAccess.getSiriusVariableAccess().getNameAssignment_2()); 
            // InternalExpressionText.g:812:1: ( rule__SiriusVariable__NameAssignment_2 )
            // InternalExpressionText.g:812:2: rule__SiriusVariable__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SiriusVariable__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSiriusVariableAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusVariable__Group__2__Impl"


    // $ANTLR start "rule__SiriusVariable__Group__3"
    // InternalExpressionText.g:822:1: rule__SiriusVariable__Group__3 : rule__SiriusVariable__Group__3__Impl rule__SiriusVariable__Group__4 ;
    public final void rule__SiriusVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:826:1: ( rule__SiriusVariable__Group__3__Impl rule__SiriusVariable__Group__4 )
            // InternalExpressionText.g:827:2: rule__SiriusVariable__Group__3__Impl rule__SiriusVariable__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__SiriusVariable__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SiriusVariable__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusVariable__Group__3"


    // $ANTLR start "rule__SiriusVariable__Group__3__Impl"
    // InternalExpressionText.g:834:1: rule__SiriusVariable__Group__3__Impl : ( ':' ) ;
    public final void rule__SiriusVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:838:1: ( ( ':' ) )
            // InternalExpressionText.g:839:1: ( ':' )
            {
            // InternalExpressionText.g:839:1: ( ':' )
            // InternalExpressionText.g:840:1: ':'
            {
             before(grammarAccess.getSiriusVariableAccess().getColonKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSiriusVariableAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusVariable__Group__3__Impl"


    // $ANTLR start "rule__SiriusVariable__Group__4"
    // InternalExpressionText.g:853:1: rule__SiriusVariable__Group__4 : rule__SiriusVariable__Group__4__Impl ;
    public final void rule__SiriusVariable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:857:1: ( rule__SiriusVariable__Group__4__Impl )
            // InternalExpressionText.g:858:2: rule__SiriusVariable__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SiriusVariable__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusVariable__Group__4"


    // $ANTLR start "rule__SiriusVariable__Group__4__Impl"
    // InternalExpressionText.g:864:1: rule__SiriusVariable__Group__4__Impl : ( ( rule__SiriusVariable__ETypeAssignment_4 ) ) ;
    public final void rule__SiriusVariable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:868:1: ( ( ( rule__SiriusVariable__ETypeAssignment_4 ) ) )
            // InternalExpressionText.g:869:1: ( ( rule__SiriusVariable__ETypeAssignment_4 ) )
            {
            // InternalExpressionText.g:869:1: ( ( rule__SiriusVariable__ETypeAssignment_4 ) )
            // InternalExpressionText.g:870:1: ( rule__SiriusVariable__ETypeAssignment_4 )
            {
             before(grammarAccess.getSiriusVariableAccess().getETypeAssignment_4()); 
            // InternalExpressionText.g:871:1: ( rule__SiriusVariable__ETypeAssignment_4 )
            // InternalExpressionText.g:871:2: rule__SiriusVariable__ETypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__SiriusVariable__ETypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSiriusVariableAccess().getETypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusVariable__Group__4__Impl"


    // $ANTLR start "rule__SiriusExpressionDescription__Group__0"
    // InternalExpressionText.g:891:1: rule__SiriusExpressionDescription__Group__0 : rule__SiriusExpressionDescription__Group__0__Impl rule__SiriusExpressionDescription__Group__1 ;
    public final void rule__SiriusExpressionDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:895:1: ( rule__SiriusExpressionDescription__Group__0__Impl rule__SiriusExpressionDescription__Group__1 )
            // InternalExpressionText.g:896:2: rule__SiriusExpressionDescription__Group__0__Impl rule__SiriusExpressionDescription__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__SiriusExpressionDescription__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SiriusExpressionDescription__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionDescription__Group__0"


    // $ANTLR start "rule__SiriusExpressionDescription__Group__0__Impl"
    // InternalExpressionText.g:903:1: rule__SiriusExpressionDescription__Group__0__Impl : ( 'exp' ) ;
    public final void rule__SiriusExpressionDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:907:1: ( ( 'exp' ) )
            // InternalExpressionText.g:908:1: ( 'exp' )
            {
            // InternalExpressionText.g:908:1: ( 'exp' )
            // InternalExpressionText.g:909:1: 'exp'
            {
             before(grammarAccess.getSiriusExpressionDescriptionAccess().getExpKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSiriusExpressionDescriptionAccess().getExpKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionDescription__Group__0__Impl"


    // $ANTLR start "rule__SiriusExpressionDescription__Group__1"
    // InternalExpressionText.g:922:1: rule__SiriusExpressionDescription__Group__1 : rule__SiriusExpressionDescription__Group__1__Impl rule__SiriusExpressionDescription__Group__2 ;
    public final void rule__SiriusExpressionDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:926:1: ( rule__SiriusExpressionDescription__Group__1__Impl rule__SiriusExpressionDescription__Group__2 )
            // InternalExpressionText.g:927:2: rule__SiriusExpressionDescription__Group__1__Impl rule__SiriusExpressionDescription__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__SiriusExpressionDescription__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SiriusExpressionDescription__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionDescription__Group__1"


    // $ANTLR start "rule__SiriusExpressionDescription__Group__1__Impl"
    // InternalExpressionText.g:934:1: rule__SiriusExpressionDescription__Group__1__Impl : ( ( rule__SiriusExpressionDescription__ExpressionAssignment_1 ) ) ;
    public final void rule__SiriusExpressionDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:938:1: ( ( ( rule__SiriusExpressionDescription__ExpressionAssignment_1 ) ) )
            // InternalExpressionText.g:939:1: ( ( rule__SiriusExpressionDescription__ExpressionAssignment_1 ) )
            {
            // InternalExpressionText.g:939:1: ( ( rule__SiriusExpressionDescription__ExpressionAssignment_1 ) )
            // InternalExpressionText.g:940:1: ( rule__SiriusExpressionDescription__ExpressionAssignment_1 )
            {
             before(grammarAccess.getSiriusExpressionDescriptionAccess().getExpressionAssignment_1()); 
            // InternalExpressionText.g:941:1: ( rule__SiriusExpressionDescription__ExpressionAssignment_1 )
            // InternalExpressionText.g:941:2: rule__SiriusExpressionDescription__ExpressionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SiriusExpressionDescription__ExpressionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSiriusExpressionDescriptionAccess().getExpressionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionDescription__Group__1__Impl"


    // $ANTLR start "rule__SiriusExpressionDescription__Group__2"
    // InternalExpressionText.g:951:1: rule__SiriusExpressionDescription__Group__2 : rule__SiriusExpressionDescription__Group__2__Impl rule__SiriusExpressionDescription__Group__3 ;
    public final void rule__SiriusExpressionDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:955:1: ( rule__SiriusExpressionDescription__Group__2__Impl rule__SiriusExpressionDescription__Group__3 )
            // InternalExpressionText.g:956:2: rule__SiriusExpressionDescription__Group__2__Impl rule__SiriusExpressionDescription__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__SiriusExpressionDescription__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SiriusExpressionDescription__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionDescription__Group__2"


    // $ANTLR start "rule__SiriusExpressionDescription__Group__2__Impl"
    // InternalExpressionText.g:963:1: rule__SiriusExpressionDescription__Group__2__Impl : ( '(' ) ;
    public final void rule__SiriusExpressionDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:967:1: ( ( '(' ) )
            // InternalExpressionText.g:968:1: ( '(' )
            {
            // InternalExpressionText.g:968:1: ( '(' )
            // InternalExpressionText.g:969:1: '('
            {
             before(grammarAccess.getSiriusExpressionDescriptionAccess().getLeftParenthesisKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSiriusExpressionDescriptionAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionDescription__Group__2__Impl"


    // $ANTLR start "rule__SiriusExpressionDescription__Group__3"
    // InternalExpressionText.g:982:1: rule__SiriusExpressionDescription__Group__3 : rule__SiriusExpressionDescription__Group__3__Impl rule__SiriusExpressionDescription__Group__4 ;
    public final void rule__SiriusExpressionDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:986:1: ( rule__SiriusExpressionDescription__Group__3__Impl rule__SiriusExpressionDescription__Group__4 )
            // InternalExpressionText.g:987:2: rule__SiriusExpressionDescription__Group__3__Impl rule__SiriusExpressionDescription__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__SiriusExpressionDescription__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SiriusExpressionDescription__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionDescription__Group__3"


    // $ANTLR start "rule__SiriusExpressionDescription__Group__3__Impl"
    // InternalExpressionText.g:994:1: rule__SiriusExpressionDescription__Group__3__Impl : ( ( rule__SiriusExpressionDescription__Group_3__0 )? ) ;
    public final void rule__SiriusExpressionDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:998:1: ( ( ( rule__SiriusExpressionDescription__Group_3__0 )? ) )
            // InternalExpressionText.g:999:1: ( ( rule__SiriusExpressionDescription__Group_3__0 )? )
            {
            // InternalExpressionText.g:999:1: ( ( rule__SiriusExpressionDescription__Group_3__0 )? )
            // InternalExpressionText.g:1000:1: ( rule__SiriusExpressionDescription__Group_3__0 )?
            {
             before(grammarAccess.getSiriusExpressionDescriptionAccess().getGroup_3()); 
            // InternalExpressionText.g:1001:1: ( rule__SiriusExpressionDescription__Group_3__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID||LA6_0==25) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalExpressionText.g:1001:2: rule__SiriusExpressionDescription__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SiriusExpressionDescription__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSiriusExpressionDescriptionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionDescription__Group__3__Impl"


    // $ANTLR start "rule__SiriusExpressionDescription__Group__4"
    // InternalExpressionText.g:1011:1: rule__SiriusExpressionDescription__Group__4 : rule__SiriusExpressionDescription__Group__4__Impl rule__SiriusExpressionDescription__Group__5 ;
    public final void rule__SiriusExpressionDescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:1015:1: ( rule__SiriusExpressionDescription__Group__4__Impl rule__SiriusExpressionDescription__Group__5 )
            // InternalExpressionText.g:1016:2: rule__SiriusExpressionDescription__Group__4__Impl rule__SiriusExpressionDescription__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__SiriusExpressionDescription__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SiriusExpressionDescription__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionDescription__Group__4"


    // $ANTLR start "rule__SiriusExpressionDescription__Group__4__Impl"
    // InternalExpressionText.g:1023:1: rule__SiriusExpressionDescription__Group__4__Impl : ( ')' ) ;
    public final void rule__SiriusExpressionDescription__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:1027:1: ( ( ')' ) )
            // InternalExpressionText.g:1028:1: ( ')' )
            {
            // InternalExpressionText.g:1028:1: ( ')' )
            // InternalExpressionText.g:1029:1: ')'
            {
             before(grammarAccess.getSiriusExpressionDescriptionAccess().getRightParenthesisKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSiriusExpressionDescriptionAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionDescription__Group__4__Impl"


    // $ANTLR start "rule__SiriusExpressionDescription__Group__5"
    // InternalExpressionText.g:1042:1: rule__SiriusExpressionDescription__Group__5 : rule__SiriusExpressionDescription__Group__5__Impl rule__SiriusExpressionDescription__Group__6 ;
    public final void rule__SiriusExpressionDescription__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:1046:1: ( rule__SiriusExpressionDescription__Group__5__Impl rule__SiriusExpressionDescription__Group__6 )
            // InternalExpressionText.g:1047:2: rule__SiriusExpressionDescription__Group__5__Impl rule__SiriusExpressionDescription__Group__6
            {
            pushFollow(FOLLOW_3);
            rule__SiriusExpressionDescription__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SiriusExpressionDescription__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionDescription__Group__5"


    // $ANTLR start "rule__SiriusExpressionDescription__Group__5__Impl"
    // InternalExpressionText.g:1054:1: rule__SiriusExpressionDescription__Group__5__Impl : ( ':' ) ;
    public final void rule__SiriusExpressionDescription__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:1058:1: ( ( ':' ) )
            // InternalExpressionText.g:1059:1: ( ':' )
            {
            // InternalExpressionText.g:1059:1: ( ':' )
            // InternalExpressionText.g:1060:1: ':'
            {
             before(grammarAccess.getSiriusExpressionDescriptionAccess().getColonKeyword_5()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSiriusExpressionDescriptionAccess().getColonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionDescription__Group__5__Impl"


    // $ANTLR start "rule__SiriusExpressionDescription__Group__6"
    // InternalExpressionText.g:1073:1: rule__SiriusExpressionDescription__Group__6 : rule__SiriusExpressionDescription__Group__6__Impl rule__SiriusExpressionDescription__Group__7 ;
    public final void rule__SiriusExpressionDescription__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:1077:1: ( rule__SiriusExpressionDescription__Group__6__Impl rule__SiriusExpressionDescription__Group__7 )
            // InternalExpressionText.g:1078:2: rule__SiriusExpressionDescription__Group__6__Impl rule__SiriusExpressionDescription__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__SiriusExpressionDescription__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SiriusExpressionDescription__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionDescription__Group__6"


    // $ANTLR start "rule__SiriusExpressionDescription__Group__6__Impl"
    // InternalExpressionText.g:1085:1: rule__SiriusExpressionDescription__Group__6__Impl : ( ( rule__SiriusExpressionDescription__ReturnTypeAssignment_6 ) ) ;
    public final void rule__SiriusExpressionDescription__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:1089:1: ( ( ( rule__SiriusExpressionDescription__ReturnTypeAssignment_6 ) ) )
            // InternalExpressionText.g:1090:1: ( ( rule__SiriusExpressionDescription__ReturnTypeAssignment_6 ) )
            {
            // InternalExpressionText.g:1090:1: ( ( rule__SiriusExpressionDescription__ReturnTypeAssignment_6 ) )
            // InternalExpressionText.g:1091:1: ( rule__SiriusExpressionDescription__ReturnTypeAssignment_6 )
            {
             before(grammarAccess.getSiriusExpressionDescriptionAccess().getReturnTypeAssignment_6()); 
            // InternalExpressionText.g:1092:1: ( rule__SiriusExpressionDescription__ReturnTypeAssignment_6 )
            // InternalExpressionText.g:1092:2: rule__SiriusExpressionDescription__ReturnTypeAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__SiriusExpressionDescription__ReturnTypeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getSiriusExpressionDescriptionAccess().getReturnTypeAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionDescription__Group__6__Impl"


    // $ANTLR start "rule__SiriusExpressionDescription__Group__7"
    // InternalExpressionText.g:1102:1: rule__SiriusExpressionDescription__Group__7 : rule__SiriusExpressionDescription__Group__7__Impl rule__SiriusExpressionDescription__Group__8 ;
    public final void rule__SiriusExpressionDescription__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:1106:1: ( rule__SiriusExpressionDescription__Group__7__Impl rule__SiriusExpressionDescription__Group__8 )
            // InternalExpressionText.g:1107:2: rule__SiriusExpressionDescription__Group__7__Impl rule__SiriusExpressionDescription__Group__8
            {
            pushFollow(FOLLOW_17);
            rule__SiriusExpressionDescription__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SiriusExpressionDescription__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionDescription__Group__7"


    // $ANTLR start "rule__SiriusExpressionDescription__Group__7__Impl"
    // InternalExpressionText.g:1114:1: rule__SiriusExpressionDescription__Group__7__Impl : ( '[' ) ;
    public final void rule__SiriusExpressionDescription__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:1118:1: ( ( '[' ) )
            // InternalExpressionText.g:1119:1: ( '[' )
            {
            // InternalExpressionText.g:1119:1: ( '[' )
            // InternalExpressionText.g:1120:1: '['
            {
             before(grammarAccess.getSiriusExpressionDescriptionAccess().getLeftSquareBracketKeyword_7()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSiriusExpressionDescriptionAccess().getLeftSquareBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionDescription__Group__7__Impl"


    // $ANTLR start "rule__SiriusExpressionDescription__Group__8"
    // InternalExpressionText.g:1133:1: rule__SiriusExpressionDescription__Group__8 : rule__SiriusExpressionDescription__Group__8__Impl rule__SiriusExpressionDescription__Group__9 ;
    public final void rule__SiriusExpressionDescription__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:1137:1: ( rule__SiriusExpressionDescription__Group__8__Impl rule__SiriusExpressionDescription__Group__9 )
            // InternalExpressionText.g:1138:2: rule__SiriusExpressionDescription__Group__8__Impl rule__SiriusExpressionDescription__Group__9
            {
            pushFollow(FOLLOW_18);
            rule__SiriusExpressionDescription__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SiriusExpressionDescription__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionDescription__Group__8"


    // $ANTLR start "rule__SiriusExpressionDescription__Group__8__Impl"
    // InternalExpressionText.g:1145:1: rule__SiriusExpressionDescription__Group__8__Impl : ( ( rule__SiriusExpressionDescription__LowerBoundAssignment_8 ) ) ;
    public final void rule__SiriusExpressionDescription__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:1149:1: ( ( ( rule__SiriusExpressionDescription__LowerBoundAssignment_8 ) ) )
            // InternalExpressionText.g:1150:1: ( ( rule__SiriusExpressionDescription__LowerBoundAssignment_8 ) )
            {
            // InternalExpressionText.g:1150:1: ( ( rule__SiriusExpressionDescription__LowerBoundAssignment_8 ) )
            // InternalExpressionText.g:1151:1: ( rule__SiriusExpressionDescription__LowerBoundAssignment_8 )
            {
             before(grammarAccess.getSiriusExpressionDescriptionAccess().getLowerBoundAssignment_8()); 
            // InternalExpressionText.g:1152:1: ( rule__SiriusExpressionDescription__LowerBoundAssignment_8 )
            // InternalExpressionText.g:1152:2: rule__SiriusExpressionDescription__LowerBoundAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__SiriusExpressionDescription__LowerBoundAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getSiriusExpressionDescriptionAccess().getLowerBoundAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionDescription__Group__8__Impl"


    // $ANTLR start "rule__SiriusExpressionDescription__Group__9"
    // InternalExpressionText.g:1162:1: rule__SiriusExpressionDescription__Group__9 : rule__SiriusExpressionDescription__Group__9__Impl rule__SiriusExpressionDescription__Group__10 ;
    public final void rule__SiriusExpressionDescription__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:1166:1: ( rule__SiriusExpressionDescription__Group__9__Impl rule__SiriusExpressionDescription__Group__10 )
            // InternalExpressionText.g:1167:2: rule__SiriusExpressionDescription__Group__9__Impl rule__SiriusExpressionDescription__Group__10
            {
            pushFollow(FOLLOW_17);
            rule__SiriusExpressionDescription__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SiriusExpressionDescription__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionDescription__Group__9"


    // $ANTLR start "rule__SiriusExpressionDescription__Group__9__Impl"
    // InternalExpressionText.g:1174:1: rule__SiriusExpressionDescription__Group__9__Impl : ( '..' ) ;
    public final void rule__SiriusExpressionDescription__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:1178:1: ( ( '..' ) )
            // InternalExpressionText.g:1179:1: ( '..' )
            {
            // InternalExpressionText.g:1179:1: ( '..' )
            // InternalExpressionText.g:1180:1: '..'
            {
             before(grammarAccess.getSiriusExpressionDescriptionAccess().getFullStopFullStopKeyword_9()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSiriusExpressionDescriptionAccess().getFullStopFullStopKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionDescription__Group__9__Impl"


    // $ANTLR start "rule__SiriusExpressionDescription__Group__10"
    // InternalExpressionText.g:1193:1: rule__SiriusExpressionDescription__Group__10 : rule__SiriusExpressionDescription__Group__10__Impl rule__SiriusExpressionDescription__Group__11 ;
    public final void rule__SiriusExpressionDescription__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:1197:1: ( rule__SiriusExpressionDescription__Group__10__Impl rule__SiriusExpressionDescription__Group__11 )
            // InternalExpressionText.g:1198:2: rule__SiriusExpressionDescription__Group__10__Impl rule__SiriusExpressionDescription__Group__11
            {
            pushFollow(FOLLOW_19);
            rule__SiriusExpressionDescription__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SiriusExpressionDescription__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionDescription__Group__10"


    // $ANTLR start "rule__SiriusExpressionDescription__Group__10__Impl"
    // InternalExpressionText.g:1205:1: rule__SiriusExpressionDescription__Group__10__Impl : ( ( rule__SiriusExpressionDescription__UpperBoundAssignment_10 ) ) ;
    public final void rule__SiriusExpressionDescription__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:1209:1: ( ( ( rule__SiriusExpressionDescription__UpperBoundAssignment_10 ) ) )
            // InternalExpressionText.g:1210:1: ( ( rule__SiriusExpressionDescription__UpperBoundAssignment_10 ) )
            {
            // InternalExpressionText.g:1210:1: ( ( rule__SiriusExpressionDescription__UpperBoundAssignment_10 ) )
            // InternalExpressionText.g:1211:1: ( rule__SiriusExpressionDescription__UpperBoundAssignment_10 )
            {
             before(grammarAccess.getSiriusExpressionDescriptionAccess().getUpperBoundAssignment_10()); 
            // InternalExpressionText.g:1212:1: ( rule__SiriusExpressionDescription__UpperBoundAssignment_10 )
            // InternalExpressionText.g:1212:2: rule__SiriusExpressionDescription__UpperBoundAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__SiriusExpressionDescription__UpperBoundAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getSiriusExpressionDescriptionAccess().getUpperBoundAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionDescription__Group__10__Impl"


    // $ANTLR start "rule__SiriusExpressionDescription__Group__11"
    // InternalExpressionText.g:1222:1: rule__SiriusExpressionDescription__Group__11 : rule__SiriusExpressionDescription__Group__11__Impl rule__SiriusExpressionDescription__Group__12 ;
    public final void rule__SiriusExpressionDescription__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:1226:1: ( rule__SiriusExpressionDescription__Group__11__Impl rule__SiriusExpressionDescription__Group__12 )
            // InternalExpressionText.g:1227:2: rule__SiriusExpressionDescription__Group__11__Impl rule__SiriusExpressionDescription__Group__12
            {
            pushFollow(FOLLOW_4);
            rule__SiriusExpressionDescription__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SiriusExpressionDescription__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionDescription__Group__11"


    // $ANTLR start "rule__SiriusExpressionDescription__Group__11__Impl"
    // InternalExpressionText.g:1234:1: rule__SiriusExpressionDescription__Group__11__Impl : ( ']' ) ;
    public final void rule__SiriusExpressionDescription__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:1238:1: ( ( ']' ) )
            // InternalExpressionText.g:1239:1: ( ']' )
            {
            // InternalExpressionText.g:1239:1: ( ']' )
            // InternalExpressionText.g:1240:1: ']'
            {
             before(grammarAccess.getSiriusExpressionDescriptionAccess().getRightSquareBracketKeyword_11()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSiriusExpressionDescriptionAccess().getRightSquareBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionDescription__Group__11__Impl"


    // $ANTLR start "rule__SiriusExpressionDescription__Group__12"
    // InternalExpressionText.g:1253:1: rule__SiriusExpressionDescription__Group__12 : rule__SiriusExpressionDescription__Group__12__Impl rule__SiriusExpressionDescription__Group__13 ;
    public final void rule__SiriusExpressionDescription__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:1257:1: ( rule__SiriusExpressionDescription__Group__12__Impl rule__SiriusExpressionDescription__Group__13 )
            // InternalExpressionText.g:1258:2: rule__SiriusExpressionDescription__Group__12__Impl rule__SiriusExpressionDescription__Group__13
            {
            pushFollow(FOLLOW_20);
            rule__SiriusExpressionDescription__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SiriusExpressionDescription__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionDescription__Group__12"


    // $ANTLR start "rule__SiriusExpressionDescription__Group__12__Impl"
    // InternalExpressionText.g:1265:1: rule__SiriusExpressionDescription__Group__12__Impl : ( '{' ) ;
    public final void rule__SiriusExpressionDescription__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:1269:1: ( ( '{' ) )
            // InternalExpressionText.g:1270:1: ( '{' )
            {
            // InternalExpressionText.g:1270:1: ( '{' )
            // InternalExpressionText.g:1271:1: '{'
            {
             before(grammarAccess.getSiriusExpressionDescriptionAccess().getLeftCurlyBracketKeyword_12()); 
            match(input,9,FOLLOW_2); 
             after(grammarAccess.getSiriusExpressionDescriptionAccess().getLeftCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionDescription__Group__12__Impl"


    // $ANTLR start "rule__SiriusExpressionDescription__Group__13"
    // InternalExpressionText.g:1284:1: rule__SiriusExpressionDescription__Group__13 : rule__SiriusExpressionDescription__Group__13__Impl rule__SiriusExpressionDescription__Group__14 ;
    public final void rule__SiriusExpressionDescription__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:1288:1: ( rule__SiriusExpressionDescription__Group__13__Impl rule__SiriusExpressionDescription__Group__14 )
            // InternalExpressionText.g:1289:2: rule__SiriusExpressionDescription__Group__13__Impl rule__SiriusExpressionDescription__Group__14
            {
            pushFollow(FOLLOW_21);
            rule__SiriusExpressionDescription__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SiriusExpressionDescription__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionDescription__Group__13"


    // $ANTLR start "rule__SiriusExpressionDescription__Group__13__Impl"
    // InternalExpressionText.g:1296:1: rule__SiriusExpressionDescription__Group__13__Impl : ( 'userDefinedVariableContainers' ) ;
    public final void rule__SiriusExpressionDescription__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:1300:1: ( ( 'userDefinedVariableContainers' ) )
            // InternalExpressionText.g:1301:1: ( 'userDefinedVariableContainers' )
            {
            // InternalExpressionText.g:1301:1: ( 'userDefinedVariableContainers' )
            // InternalExpressionText.g:1302:1: 'userDefinedVariableContainers'
            {
             before(grammarAccess.getSiriusExpressionDescriptionAccess().getUserDefinedVariableContainersKeyword_13()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSiriusExpressionDescriptionAccess().getUserDefinedVariableContainersKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionDescription__Group__13__Impl"


    // $ANTLR start "rule__SiriusExpressionDescription__Group__14"
    // InternalExpressionText.g:1315:1: rule__SiriusExpressionDescription__Group__14 : rule__SiriusExpressionDescription__Group__14__Impl rule__SiriusExpressionDescription__Group__15 ;
    public final void rule__SiriusExpressionDescription__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:1319:1: ( rule__SiriusExpressionDescription__Group__14__Impl rule__SiriusExpressionDescription__Group__15 )
            // InternalExpressionText.g:1320:2: rule__SiriusExpressionDescription__Group__14__Impl rule__SiriusExpressionDescription__Group__15
            {
            pushFollow(FOLLOW_16);
            rule__SiriusExpressionDescription__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SiriusExpressionDescription__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionDescription__Group__14"


    // $ANTLR start "rule__SiriusExpressionDescription__Group__14__Impl"
    // InternalExpressionText.g:1327:1: rule__SiriusExpressionDescription__Group__14__Impl : ( '=' ) ;
    public final void rule__SiriusExpressionDescription__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:1331:1: ( ( '=' ) )
            // InternalExpressionText.g:1332:1: ( '=' )
            {
            // InternalExpressionText.g:1332:1: ( '=' )
            // InternalExpressionText.g:1333:1: '='
            {
             before(grammarAccess.getSiriusExpressionDescriptionAccess().getEqualsSignKeyword_14()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSiriusExpressionDescriptionAccess().getEqualsSignKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionDescription__Group__14__Impl"


    // $ANTLR start "rule__SiriusExpressionDescription__Group__15"
    // InternalExpressionText.g:1346:1: rule__SiriusExpressionDescription__Group__15 : rule__SiriusExpressionDescription__Group__15__Impl rule__SiriusExpressionDescription__Group__16 ;
    public final void rule__SiriusExpressionDescription__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:1350:1: ( rule__SiriusExpressionDescription__Group__15__Impl rule__SiriusExpressionDescription__Group__16 )
            // InternalExpressionText.g:1351:2: rule__SiriusExpressionDescription__Group__15__Impl rule__SiriusExpressionDescription__Group__16
            {
            pushFollow(FOLLOW_22);
            rule__SiriusExpressionDescription__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SiriusExpressionDescription__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionDescription__Group__15"


    // $ANTLR start "rule__SiriusExpressionDescription__Group__15__Impl"
    // InternalExpressionText.g:1358:1: rule__SiriusExpressionDescription__Group__15__Impl : ( '[' ) ;
    public final void rule__SiriusExpressionDescription__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:1362:1: ( ( '[' ) )
            // InternalExpressionText.g:1363:1: ( '[' )
            {
            // InternalExpressionText.g:1363:1: ( '[' )
            // InternalExpressionText.g:1364:1: '['
            {
             before(grammarAccess.getSiriusExpressionDescriptionAccess().getLeftSquareBracketKeyword_15()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSiriusExpressionDescriptionAccess().getLeftSquareBracketKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionDescription__Group__15__Impl"


    // $ANTLR start "rule__SiriusExpressionDescription__Group__16"
    // InternalExpressionText.g:1377:1: rule__SiriusExpressionDescription__Group__16 : rule__SiriusExpressionDescription__Group__16__Impl rule__SiriusExpressionDescription__Group__17 ;
    public final void rule__SiriusExpressionDescription__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:1381:1: ( rule__SiriusExpressionDescription__Group__16__Impl rule__SiriusExpressionDescription__Group__17 )
            // InternalExpressionText.g:1382:2: rule__SiriusExpressionDescription__Group__16__Impl rule__SiriusExpressionDescription__Group__17
            {
            pushFollow(FOLLOW_22);
            rule__SiriusExpressionDescription__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SiriusExpressionDescription__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionDescription__Group__16"


    // $ANTLR start "rule__SiriusExpressionDescription__Group__16__Impl"
    // InternalExpressionText.g:1389:1: rule__SiriusExpressionDescription__Group__16__Impl : ( ( rule__SiriusExpressionDescription__Group_16__0 )? ) ;
    public final void rule__SiriusExpressionDescription__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:1393:1: ( ( ( rule__SiriusExpressionDescription__Group_16__0 )? ) )
            // InternalExpressionText.g:1394:1: ( ( rule__SiriusExpressionDescription__Group_16__0 )? )
            {
            // InternalExpressionText.g:1394:1: ( ( rule__SiriusExpressionDescription__Group_16__0 )? )
            // InternalExpressionText.g:1395:1: ( rule__SiriusExpressionDescription__Group_16__0 )?
            {
             before(grammarAccess.getSiriusExpressionDescriptionAccess().getGroup_16()); 
            // InternalExpressionText.g:1396:1: ( rule__SiriusExpressionDescription__Group_16__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalExpressionText.g:1396:2: rule__SiriusExpressionDescription__Group_16__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SiriusExpressionDescription__Group_16__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSiriusExpressionDescriptionAccess().getGroup_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionDescription__Group__16__Impl"


    // $ANTLR start "rule__SiriusExpressionDescription__Group__17"
    // InternalExpressionText.g:1406:1: rule__SiriusExpressionDescription__Group__17 : rule__SiriusExpressionDescription__Group__17__Impl rule__SiriusExpressionDescription__Group__18 ;
    public final void rule__SiriusExpressionDescription__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:1410:1: ( rule__SiriusExpressionDescription__Group__17__Impl rule__SiriusExpressionDescription__Group__18 )
            // InternalExpressionText.g:1411:2: rule__SiriusExpressionDescription__Group__17__Impl rule__SiriusExpressionDescription__Group__18
            {
            pushFollow(FOLLOW_23);
            rule__SiriusExpressionDescription__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SiriusExpressionDescription__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionDescription__Group__17"


    // $ANTLR start "rule__SiriusExpressionDescription__Group__17__Impl"
    // InternalExpressionText.g:1418:1: rule__SiriusExpressionDescription__Group__17__Impl : ( ']' ) ;
    public final void rule__SiriusExpressionDescription__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:1422:1: ( ( ']' ) )
            // InternalExpressionText.g:1423:1: ( ']' )
            {
            // InternalExpressionText.g:1423:1: ( ']' )
            // InternalExpressionText.g:1424:1: ']'
            {
             before(grammarAccess.getSiriusExpressionDescriptionAccess().getRightSquareBracketKeyword_17()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSiriusExpressionDescriptionAccess().getRightSquareBracketKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionDescription__Group__17__Impl"


    // $ANTLR start "rule__SiriusExpressionDescription__Group__18"
    // InternalExpressionText.g:1437:1: rule__SiriusExpressionDescription__Group__18 : rule__SiriusExpressionDescription__Group__18__Impl ;
    public final void rule__SiriusExpressionDescription__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:1441:1: ( rule__SiriusExpressionDescription__Group__18__Impl )
            // InternalExpressionText.g:1442:2: rule__SiriusExpressionDescription__Group__18__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SiriusExpressionDescription__Group__18__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionDescription__Group__18"


    // $ANTLR start "rule__SiriusExpressionDescription__Group__18__Impl"
    // InternalExpressionText.g:1448:1: rule__SiriusExpressionDescription__Group__18__Impl : ( '}' ) ;
    public final void rule__SiriusExpressionDescription__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:1452:1: ( ( '}' ) )
            // InternalExpressionText.g:1453:1: ( '}' )
            {
            // InternalExpressionText.g:1453:1: ( '}' )
            // InternalExpressionText.g:1454:1: '}'
            {
             before(grammarAccess.getSiriusExpressionDescriptionAccess().getRightCurlyBracketKeyword_18()); 
            match(input,10,FOLLOW_2); 
             after(grammarAccess.getSiriusExpressionDescriptionAccess().getRightCurlyBracketKeyword_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionDescription__Group__18__Impl"


    // $ANTLR start "rule__SiriusExpressionDescription__Group_3__0"
    // InternalExpressionText.g:1505:1: rule__SiriusExpressionDescription__Group_3__0 : rule__SiriusExpressionDescription__Group_3__0__Impl rule__SiriusExpressionDescription__Group_3__1 ;
    public final void rule__SiriusExpressionDescription__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:1509:1: ( rule__SiriusExpressionDescription__Group_3__0__Impl rule__SiriusExpressionDescription__Group_3__1 )
            // InternalExpressionText.g:1510:2: rule__SiriusExpressionDescription__Group_3__0__Impl rule__SiriusExpressionDescription__Group_3__1
            {
            pushFollow(FOLLOW_24);
            rule__SiriusExpressionDescription__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SiriusExpressionDescription__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionDescription__Group_3__0"


    // $ANTLR start "rule__SiriusExpressionDescription__Group_3__0__Impl"
    // InternalExpressionText.g:1517:1: rule__SiriusExpressionDescription__Group_3__0__Impl : ( ( rule__SiriusExpressionDescription__ParametersAssignment_3_0 ) ) ;
    public final void rule__SiriusExpressionDescription__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:1521:1: ( ( ( rule__SiriusExpressionDescription__ParametersAssignment_3_0 ) ) )
            // InternalExpressionText.g:1522:1: ( ( rule__SiriusExpressionDescription__ParametersAssignment_3_0 ) )
            {
            // InternalExpressionText.g:1522:1: ( ( rule__SiriusExpressionDescription__ParametersAssignment_3_0 ) )
            // InternalExpressionText.g:1523:1: ( rule__SiriusExpressionDescription__ParametersAssignment_3_0 )
            {
             before(grammarAccess.getSiriusExpressionDescriptionAccess().getParametersAssignment_3_0()); 
            // InternalExpressionText.g:1524:1: ( rule__SiriusExpressionDescription__ParametersAssignment_3_0 )
            // InternalExpressionText.g:1524:2: rule__SiriusExpressionDescription__ParametersAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__SiriusExpressionDescription__ParametersAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getSiriusExpressionDescriptionAccess().getParametersAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionDescription__Group_3__0__Impl"


    // $ANTLR start "rule__SiriusExpressionDescription__Group_3__1"
    // InternalExpressionText.g:1534:1: rule__SiriusExpressionDescription__Group_3__1 : rule__SiriusExpressionDescription__Group_3__1__Impl ;
    public final void rule__SiriusExpressionDescription__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:1538:1: ( rule__SiriusExpressionDescription__Group_3__1__Impl )
            // InternalExpressionText.g:1539:2: rule__SiriusExpressionDescription__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SiriusExpressionDescription__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionDescription__Group_3__1"


    // $ANTLR start "rule__SiriusExpressionDescription__Group_3__1__Impl"
    // InternalExpressionText.g:1545:1: rule__SiriusExpressionDescription__Group_3__1__Impl : ( ( rule__SiriusExpressionDescription__Group_3_1__0 )* ) ;
    public final void rule__SiriusExpressionDescription__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:1549:1: ( ( ( rule__SiriusExpressionDescription__Group_3_1__0 )* ) )
            // InternalExpressionText.g:1550:1: ( ( rule__SiriusExpressionDescription__Group_3_1__0 )* )
            {
            // InternalExpressionText.g:1550:1: ( ( rule__SiriusExpressionDescription__Group_3_1__0 )* )
            // InternalExpressionText.g:1551:1: ( rule__SiriusExpressionDescription__Group_3_1__0 )*
            {
             before(grammarAccess.getSiriusExpressionDescriptionAccess().getGroup_3_1()); 
            // InternalExpressionText.g:1552:1: ( rule__SiriusExpressionDescription__Group_3_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalExpressionText.g:1552:2: rule__SiriusExpressionDescription__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__SiriusExpressionDescription__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getSiriusExpressionDescriptionAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionDescription__Group_3__1__Impl"


    // $ANTLR start "rule__SiriusExpressionDescription__Group_3_1__0"
    // InternalExpressionText.g:1566:1: rule__SiriusExpressionDescription__Group_3_1__0 : rule__SiriusExpressionDescription__Group_3_1__0__Impl rule__SiriusExpressionDescription__Group_3_1__1 ;
    public final void rule__SiriusExpressionDescription__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:1570:1: ( rule__SiriusExpressionDescription__Group_3_1__0__Impl rule__SiriusExpressionDescription__Group_3_1__1 )
            // InternalExpressionText.g:1571:2: rule__SiriusExpressionDescription__Group_3_1__0__Impl rule__SiriusExpressionDescription__Group_3_1__1
            {
            pushFollow(FOLLOW_26);
            rule__SiriusExpressionDescription__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SiriusExpressionDescription__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionDescription__Group_3_1__0"


    // $ANTLR start "rule__SiriusExpressionDescription__Group_3_1__0__Impl"
    // InternalExpressionText.g:1578:1: rule__SiriusExpressionDescription__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__SiriusExpressionDescription__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:1582:1: ( ( ',' ) )
            // InternalExpressionText.g:1583:1: ( ',' )
            {
            // InternalExpressionText.g:1583:1: ( ',' )
            // InternalExpressionText.g:1584:1: ','
            {
             before(grammarAccess.getSiriusExpressionDescriptionAccess().getCommaKeyword_3_1_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSiriusExpressionDescriptionAccess().getCommaKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionDescription__Group_3_1__0__Impl"


    // $ANTLR start "rule__SiriusExpressionDescription__Group_3_1__1"
    // InternalExpressionText.g:1597:1: rule__SiriusExpressionDescription__Group_3_1__1 : rule__SiriusExpressionDescription__Group_3_1__1__Impl ;
    public final void rule__SiriusExpressionDescription__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:1601:1: ( rule__SiriusExpressionDescription__Group_3_1__1__Impl )
            // InternalExpressionText.g:1602:2: rule__SiriusExpressionDescription__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SiriusExpressionDescription__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionDescription__Group_3_1__1"


    // $ANTLR start "rule__SiriusExpressionDescription__Group_3_1__1__Impl"
    // InternalExpressionText.g:1608:1: rule__SiriusExpressionDescription__Group_3_1__1__Impl : ( ( rule__SiriusExpressionDescription__ParametersAssignment_3_1_1 ) ) ;
    public final void rule__SiriusExpressionDescription__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:1612:1: ( ( ( rule__SiriusExpressionDescription__ParametersAssignment_3_1_1 ) ) )
            // InternalExpressionText.g:1613:1: ( ( rule__SiriusExpressionDescription__ParametersAssignment_3_1_1 ) )
            {
            // InternalExpressionText.g:1613:1: ( ( rule__SiriusExpressionDescription__ParametersAssignment_3_1_1 ) )
            // InternalExpressionText.g:1614:1: ( rule__SiriusExpressionDescription__ParametersAssignment_3_1_1 )
            {
             before(grammarAccess.getSiriusExpressionDescriptionAccess().getParametersAssignment_3_1_1()); 
            // InternalExpressionText.g:1615:1: ( rule__SiriusExpressionDescription__ParametersAssignment_3_1_1 )
            // InternalExpressionText.g:1615:2: rule__SiriusExpressionDescription__ParametersAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SiriusExpressionDescription__ParametersAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSiriusExpressionDescriptionAccess().getParametersAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionDescription__Group_3_1__1__Impl"


    // $ANTLR start "rule__SiriusExpressionDescription__Group_16__0"
    // InternalExpressionText.g:1629:1: rule__SiriusExpressionDescription__Group_16__0 : rule__SiriusExpressionDescription__Group_16__0__Impl rule__SiriusExpressionDescription__Group_16__1 ;
    public final void rule__SiriusExpressionDescription__Group_16__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:1633:1: ( rule__SiriusExpressionDescription__Group_16__0__Impl rule__SiriusExpressionDescription__Group_16__1 )
            // InternalExpressionText.g:1634:2: rule__SiriusExpressionDescription__Group_16__0__Impl rule__SiriusExpressionDescription__Group_16__1
            {
            pushFollow(FOLLOW_24);
            rule__SiriusExpressionDescription__Group_16__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SiriusExpressionDescription__Group_16__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionDescription__Group_16__0"


    // $ANTLR start "rule__SiriusExpressionDescription__Group_16__0__Impl"
    // InternalExpressionText.g:1641:1: rule__SiriusExpressionDescription__Group_16__0__Impl : ( ( rule__SiriusExpressionDescription__VariableContainersAssignment_16_0 ) ) ;
    public final void rule__SiriusExpressionDescription__Group_16__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:1645:1: ( ( ( rule__SiriusExpressionDescription__VariableContainersAssignment_16_0 ) ) )
            // InternalExpressionText.g:1646:1: ( ( rule__SiriusExpressionDescription__VariableContainersAssignment_16_0 ) )
            {
            // InternalExpressionText.g:1646:1: ( ( rule__SiriusExpressionDescription__VariableContainersAssignment_16_0 ) )
            // InternalExpressionText.g:1647:1: ( rule__SiriusExpressionDescription__VariableContainersAssignment_16_0 )
            {
             before(grammarAccess.getSiriusExpressionDescriptionAccess().getVariableContainersAssignment_16_0()); 
            // InternalExpressionText.g:1648:1: ( rule__SiriusExpressionDescription__VariableContainersAssignment_16_0 )
            // InternalExpressionText.g:1648:2: rule__SiriusExpressionDescription__VariableContainersAssignment_16_0
            {
            pushFollow(FOLLOW_2);
            rule__SiriusExpressionDescription__VariableContainersAssignment_16_0();

            state._fsp--;


            }

             after(grammarAccess.getSiriusExpressionDescriptionAccess().getVariableContainersAssignment_16_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionDescription__Group_16__0__Impl"


    // $ANTLR start "rule__SiriusExpressionDescription__Group_16__1"
    // InternalExpressionText.g:1658:1: rule__SiriusExpressionDescription__Group_16__1 : rule__SiriusExpressionDescription__Group_16__1__Impl ;
    public final void rule__SiriusExpressionDescription__Group_16__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:1662:1: ( rule__SiriusExpressionDescription__Group_16__1__Impl )
            // InternalExpressionText.g:1663:2: rule__SiriusExpressionDescription__Group_16__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SiriusExpressionDescription__Group_16__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionDescription__Group_16__1"


    // $ANTLR start "rule__SiriusExpressionDescription__Group_16__1__Impl"
    // InternalExpressionText.g:1669:1: rule__SiriusExpressionDescription__Group_16__1__Impl : ( ( rule__SiriusExpressionDescription__Group_16_1__0 )* ) ;
    public final void rule__SiriusExpressionDescription__Group_16__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:1673:1: ( ( ( rule__SiriusExpressionDescription__Group_16_1__0 )* ) )
            // InternalExpressionText.g:1674:1: ( ( rule__SiriusExpressionDescription__Group_16_1__0 )* )
            {
            // InternalExpressionText.g:1674:1: ( ( rule__SiriusExpressionDescription__Group_16_1__0 )* )
            // InternalExpressionText.g:1675:1: ( rule__SiriusExpressionDescription__Group_16_1__0 )*
            {
             before(grammarAccess.getSiriusExpressionDescriptionAccess().getGroup_16_1()); 
            // InternalExpressionText.g:1676:1: ( rule__SiriusExpressionDescription__Group_16_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==23) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalExpressionText.g:1676:2: rule__SiriusExpressionDescription__Group_16_1__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__SiriusExpressionDescription__Group_16_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getSiriusExpressionDescriptionAccess().getGroup_16_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionDescription__Group_16__1__Impl"


    // $ANTLR start "rule__SiriusExpressionDescription__Group_16_1__0"
    // InternalExpressionText.g:1690:1: rule__SiriusExpressionDescription__Group_16_1__0 : rule__SiriusExpressionDescription__Group_16_1__0__Impl rule__SiriusExpressionDescription__Group_16_1__1 ;
    public final void rule__SiriusExpressionDescription__Group_16_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:1694:1: ( rule__SiriusExpressionDescription__Group_16_1__0__Impl rule__SiriusExpressionDescription__Group_16_1__1 )
            // InternalExpressionText.g:1695:2: rule__SiriusExpressionDescription__Group_16_1__0__Impl rule__SiriusExpressionDescription__Group_16_1__1
            {
            pushFollow(FOLLOW_3);
            rule__SiriusExpressionDescription__Group_16_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SiriusExpressionDescription__Group_16_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionDescription__Group_16_1__0"


    // $ANTLR start "rule__SiriusExpressionDescription__Group_16_1__0__Impl"
    // InternalExpressionText.g:1702:1: rule__SiriusExpressionDescription__Group_16_1__0__Impl : ( ',' ) ;
    public final void rule__SiriusExpressionDescription__Group_16_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:1706:1: ( ( ',' ) )
            // InternalExpressionText.g:1707:1: ( ',' )
            {
            // InternalExpressionText.g:1707:1: ( ',' )
            // InternalExpressionText.g:1708:1: ','
            {
             before(grammarAccess.getSiriusExpressionDescriptionAccess().getCommaKeyword_16_1_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSiriusExpressionDescriptionAccess().getCommaKeyword_16_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionDescription__Group_16_1__0__Impl"


    // $ANTLR start "rule__SiriusExpressionDescription__Group_16_1__1"
    // InternalExpressionText.g:1721:1: rule__SiriusExpressionDescription__Group_16_1__1 : rule__SiriusExpressionDescription__Group_16_1__1__Impl ;
    public final void rule__SiriusExpressionDescription__Group_16_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:1725:1: ( rule__SiriusExpressionDescription__Group_16_1__1__Impl )
            // InternalExpressionText.g:1726:2: rule__SiriusExpressionDescription__Group_16_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SiriusExpressionDescription__Group_16_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionDescription__Group_16_1__1"


    // $ANTLR start "rule__SiriusExpressionDescription__Group_16_1__1__Impl"
    // InternalExpressionText.g:1732:1: rule__SiriusExpressionDescription__Group_16_1__1__Impl : ( ( rule__SiriusExpressionDescription__VariableContainersAssignment_16_1_1 ) ) ;
    public final void rule__SiriusExpressionDescription__Group_16_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:1736:1: ( ( ( rule__SiriusExpressionDescription__VariableContainersAssignment_16_1_1 ) ) )
            // InternalExpressionText.g:1737:1: ( ( rule__SiriusExpressionDescription__VariableContainersAssignment_16_1_1 ) )
            {
            // InternalExpressionText.g:1737:1: ( ( rule__SiriusExpressionDescription__VariableContainersAssignment_16_1_1 ) )
            // InternalExpressionText.g:1738:1: ( rule__SiriusExpressionDescription__VariableContainersAssignment_16_1_1 )
            {
             before(grammarAccess.getSiriusExpressionDescriptionAccess().getVariableContainersAssignment_16_1_1()); 
            // InternalExpressionText.g:1739:1: ( rule__SiriusExpressionDescription__VariableContainersAssignment_16_1_1 )
            // InternalExpressionText.g:1739:2: rule__SiriusExpressionDescription__VariableContainersAssignment_16_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SiriusExpressionDescription__VariableContainersAssignment_16_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSiriusExpressionDescriptionAccess().getVariableContainersAssignment_16_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionDescription__Group_16_1__1__Impl"


    // $ANTLR start "rule__SiriusParameter__Group__0"
    // InternalExpressionText.g:1753:1: rule__SiriusParameter__Group__0 : rule__SiriusParameter__Group__0__Impl rule__SiriusParameter__Group__1 ;
    public final void rule__SiriusParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:1757:1: ( rule__SiriusParameter__Group__0__Impl rule__SiriusParameter__Group__1 )
            // InternalExpressionText.g:1758:2: rule__SiriusParameter__Group__0__Impl rule__SiriusParameter__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__SiriusParameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SiriusParameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusParameter__Group__0"


    // $ANTLR start "rule__SiriusParameter__Group__0__Impl"
    // InternalExpressionText.g:1765:1: rule__SiriusParameter__Group__0__Impl : ( ( rule__SiriusParameter__OptionalAssignment_0 )? ) ;
    public final void rule__SiriusParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:1769:1: ( ( ( rule__SiriusParameter__OptionalAssignment_0 )? ) )
            // InternalExpressionText.g:1770:1: ( ( rule__SiriusParameter__OptionalAssignment_0 )? )
            {
            // InternalExpressionText.g:1770:1: ( ( rule__SiriusParameter__OptionalAssignment_0 )? )
            // InternalExpressionText.g:1771:1: ( rule__SiriusParameter__OptionalAssignment_0 )?
            {
             before(grammarAccess.getSiriusParameterAccess().getOptionalAssignment_0()); 
            // InternalExpressionText.g:1772:1: ( rule__SiriusParameter__OptionalAssignment_0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalExpressionText.g:1772:2: rule__SiriusParameter__OptionalAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SiriusParameter__OptionalAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSiriusParameterAccess().getOptionalAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusParameter__Group__0__Impl"


    // $ANTLR start "rule__SiriusParameter__Group__1"
    // InternalExpressionText.g:1782:1: rule__SiriusParameter__Group__1 : rule__SiriusParameter__Group__1__Impl ;
    public final void rule__SiriusParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:1786:1: ( rule__SiriusParameter__Group__1__Impl )
            // InternalExpressionText.g:1787:2: rule__SiriusParameter__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SiriusParameter__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusParameter__Group__1"


    // $ANTLR start "rule__SiriusParameter__Group__1__Impl"
    // InternalExpressionText.g:1793:1: rule__SiriusParameter__Group__1__Impl : ( ( rule__SiriusParameter__VariableAssignment_1 ) ) ;
    public final void rule__SiriusParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:1797:1: ( ( ( rule__SiriusParameter__VariableAssignment_1 ) ) )
            // InternalExpressionText.g:1798:1: ( ( rule__SiriusParameter__VariableAssignment_1 ) )
            {
            // InternalExpressionText.g:1798:1: ( ( rule__SiriusParameter__VariableAssignment_1 ) )
            // InternalExpressionText.g:1799:1: ( rule__SiriusParameter__VariableAssignment_1 )
            {
             before(grammarAccess.getSiriusParameterAccess().getVariableAssignment_1()); 
            // InternalExpressionText.g:1800:1: ( rule__SiriusParameter__VariableAssignment_1 )
            // InternalExpressionText.g:1800:2: rule__SiriusParameter__VariableAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SiriusParameter__VariableAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSiriusParameterAccess().getVariableAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusParameter__Group__1__Impl"


    // $ANTLR start "rule__Bound__Group__0"
    // InternalExpressionText.g:1814:1: rule__Bound__Group__0 : rule__Bound__Group__0__Impl rule__Bound__Group__1 ;
    public final void rule__Bound__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:1818:1: ( rule__Bound__Group__0__Impl rule__Bound__Group__1 )
            // InternalExpressionText.g:1819:2: rule__Bound__Group__0__Impl rule__Bound__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Bound__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bound__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bound__Group__0"


    // $ANTLR start "rule__Bound__Group__0__Impl"
    // InternalExpressionText.g:1826:1: rule__Bound__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Bound__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:1830:1: ( ( ( '-' )? ) )
            // InternalExpressionText.g:1831:1: ( ( '-' )? )
            {
            // InternalExpressionText.g:1831:1: ( ( '-' )? )
            // InternalExpressionText.g:1832:1: ( '-' )?
            {
             before(grammarAccess.getBoundAccess().getHyphenMinusKeyword_0()); 
            // InternalExpressionText.g:1833:1: ( '-' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalExpressionText.g:1834:2: '-'
                    {
                    match(input,24,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getBoundAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bound__Group__0__Impl"


    // $ANTLR start "rule__Bound__Group__1"
    // InternalExpressionText.g:1845:1: rule__Bound__Group__1 : rule__Bound__Group__1__Impl ;
    public final void rule__Bound__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:1849:1: ( rule__Bound__Group__1__Impl )
            // InternalExpressionText.g:1850:2: rule__Bound__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Bound__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bound__Group__1"


    // $ANTLR start "rule__Bound__Group__1__Impl"
    // InternalExpressionText.g:1856:1: rule__Bound__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__Bound__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:1860:1: ( ( RULE_INT ) )
            // InternalExpressionText.g:1861:1: ( RULE_INT )
            {
            // InternalExpressionText.g:1861:1: ( RULE_INT )
            // InternalExpressionText.g:1862:1: RULE_INT
            {
             before(grammarAccess.getBoundAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getBoundAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bound__Group__1__Impl"


    // $ANTLR start "rule__SiriusExpressionPackage__EPackageAssignment_1"
    // InternalExpressionText.g:1878:1: rule__SiriusExpressionPackage__EPackageAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__SiriusExpressionPackage__EPackageAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:1882:1: ( ( ( RULE_ID ) ) )
            // InternalExpressionText.g:1883:1: ( ( RULE_ID ) )
            {
            // InternalExpressionText.g:1883:1: ( ( RULE_ID ) )
            // InternalExpressionText.g:1884:1: ( RULE_ID )
            {
             before(grammarAccess.getSiriusExpressionPackageAccess().getEPackageEPackageCrossReference_1_0()); 
            // InternalExpressionText.g:1885:1: ( RULE_ID )
            // InternalExpressionText.g:1886:1: RULE_ID
            {
             before(grammarAccess.getSiriusExpressionPackageAccess().getEPackageEPackageIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSiriusExpressionPackageAccess().getEPackageEPackageIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getSiriusExpressionPackageAccess().getEPackageEPackageCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionPackage__EPackageAssignment_1"


    // $ANTLR start "rule__SiriusExpressionPackage__ExpressionClassesAssignment_3"
    // InternalExpressionText.g:1897:1: rule__SiriusExpressionPackage__ExpressionClassesAssignment_3 : ( ruleSiriusExpressionClass ) ;
    public final void rule__SiriusExpressionPackage__ExpressionClassesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:1901:1: ( ( ruleSiriusExpressionClass ) )
            // InternalExpressionText.g:1902:1: ( ruleSiriusExpressionClass )
            {
            // InternalExpressionText.g:1902:1: ( ruleSiriusExpressionClass )
            // InternalExpressionText.g:1903:1: ruleSiriusExpressionClass
            {
             before(grammarAccess.getSiriusExpressionPackageAccess().getExpressionClassesSiriusExpressionClassParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSiriusExpressionClass();

            state._fsp--;

             after(grammarAccess.getSiriusExpressionPackageAccess().getExpressionClassesSiriusExpressionClassParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionPackage__ExpressionClassesAssignment_3"


    // $ANTLR start "rule__SiriusExpressionClass__EClassAssignment_1"
    // InternalExpressionText.g:1912:1: rule__SiriusExpressionClass__EClassAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__SiriusExpressionClass__EClassAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:1916:1: ( ( ( ruleFQN ) ) )
            // InternalExpressionText.g:1917:1: ( ( ruleFQN ) )
            {
            // InternalExpressionText.g:1917:1: ( ( ruleFQN ) )
            // InternalExpressionText.g:1918:1: ( ruleFQN )
            {
             before(grammarAccess.getSiriusExpressionClassAccess().getEClassEClassCrossReference_1_0()); 
            // InternalExpressionText.g:1919:1: ( ruleFQN )
            // InternalExpressionText.g:1920:1: ruleFQN
            {
             before(grammarAccess.getSiriusExpressionClassAccess().getEClassEClassFQNParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getSiriusExpressionClassAccess().getEClassEClassFQNParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getSiriusExpressionClassAccess().getEClassEClassCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionClass__EClassAssignment_1"


    // $ANTLR start "rule__SiriusExpressionClass__VariablesAssignment_3"
    // InternalExpressionText.g:1931:1: rule__SiriusExpressionClass__VariablesAssignment_3 : ( ruleSiriusVariable ) ;
    public final void rule__SiriusExpressionClass__VariablesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:1935:1: ( ( ruleSiriusVariable ) )
            // InternalExpressionText.g:1936:1: ( ruleSiriusVariable )
            {
            // InternalExpressionText.g:1936:1: ( ruleSiriusVariable )
            // InternalExpressionText.g:1937:1: ruleSiriusVariable
            {
             before(grammarAccess.getSiriusExpressionClassAccess().getVariablesSiriusVariableParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSiriusVariable();

            state._fsp--;

             after(grammarAccess.getSiriusExpressionClassAccess().getVariablesSiriusVariableParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionClass__VariablesAssignment_3"


    // $ANTLR start "rule__SiriusExpressionClass__ExpressionDescriptionsAssignment_4"
    // InternalExpressionText.g:1946:1: rule__SiriusExpressionClass__ExpressionDescriptionsAssignment_4 : ( ruleSiriusExpressionDescription ) ;
    public final void rule__SiriusExpressionClass__ExpressionDescriptionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:1950:1: ( ( ruleSiriusExpressionDescription ) )
            // InternalExpressionText.g:1951:1: ( ruleSiriusExpressionDescription )
            {
            // InternalExpressionText.g:1951:1: ( ruleSiriusExpressionDescription )
            // InternalExpressionText.g:1952:1: ruleSiriusExpressionDescription
            {
             before(grammarAccess.getSiriusExpressionClassAccess().getExpressionDescriptionsSiriusExpressionDescriptionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSiriusExpressionDescription();

            state._fsp--;

             after(grammarAccess.getSiriusExpressionClassAccess().getExpressionDescriptionsSiriusExpressionDescriptionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionClass__ExpressionDescriptionsAssignment_4"


    // $ANTLR start "rule__SiriusVariable__DocumentationAssignment_0"
    // InternalExpressionText.g:1961:1: rule__SiriusVariable__DocumentationAssignment_0 : ( RULE_ML_COMMENT ) ;
    public final void rule__SiriusVariable__DocumentationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:1965:1: ( ( RULE_ML_COMMENT ) )
            // InternalExpressionText.g:1966:1: ( RULE_ML_COMMENT )
            {
            // InternalExpressionText.g:1966:1: ( RULE_ML_COMMENT )
            // InternalExpressionText.g:1967:1: RULE_ML_COMMENT
            {
             before(grammarAccess.getSiriusVariableAccess().getDocumentationML_COMMENTTerminalRuleCall_0_0()); 
            match(input,RULE_ML_COMMENT,FOLLOW_2); 
             after(grammarAccess.getSiriusVariableAccess().getDocumentationML_COMMENTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusVariable__DocumentationAssignment_0"


    // $ANTLR start "rule__SiriusVariable__NameAssignment_2"
    // InternalExpressionText.g:1976:1: rule__SiriusVariable__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__SiriusVariable__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:1980:1: ( ( RULE_ID ) )
            // InternalExpressionText.g:1981:1: ( RULE_ID )
            {
            // InternalExpressionText.g:1981:1: ( RULE_ID )
            // InternalExpressionText.g:1982:1: RULE_ID
            {
             before(grammarAccess.getSiriusVariableAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSiriusVariableAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusVariable__NameAssignment_2"


    // $ANTLR start "rule__SiriusVariable__ETypeAssignment_4"
    // InternalExpressionText.g:1991:1: rule__SiriusVariable__ETypeAssignment_4 : ( ( ruleFQN ) ) ;
    public final void rule__SiriusVariable__ETypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:1995:1: ( ( ( ruleFQN ) ) )
            // InternalExpressionText.g:1996:1: ( ( ruleFQN ) )
            {
            // InternalExpressionText.g:1996:1: ( ( ruleFQN ) )
            // InternalExpressionText.g:1997:1: ( ruleFQN )
            {
             before(grammarAccess.getSiriusVariableAccess().getETypeEClassifierCrossReference_4_0()); 
            // InternalExpressionText.g:1998:1: ( ruleFQN )
            // InternalExpressionText.g:1999:1: ruleFQN
            {
             before(grammarAccess.getSiriusVariableAccess().getETypeEClassifierFQNParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getSiriusVariableAccess().getETypeEClassifierFQNParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getSiriusVariableAccess().getETypeEClassifierCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusVariable__ETypeAssignment_4"


    // $ANTLR start "rule__SiriusExpressionDescription__ExpressionAssignment_1"
    // InternalExpressionText.g:2010:1: rule__SiriusExpressionDescription__ExpressionAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__SiriusExpressionDescription__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:2014:1: ( ( ( ruleFQN ) ) )
            // InternalExpressionText.g:2015:1: ( ( ruleFQN ) )
            {
            // InternalExpressionText.g:2015:1: ( ( ruleFQN ) )
            // InternalExpressionText.g:2016:1: ( ruleFQN )
            {
             before(grammarAccess.getSiriusExpressionDescriptionAccess().getExpressionEAttributeCrossReference_1_0()); 
            // InternalExpressionText.g:2017:1: ( ruleFQN )
            // InternalExpressionText.g:2018:1: ruleFQN
            {
             before(grammarAccess.getSiriusExpressionDescriptionAccess().getExpressionEAttributeFQNParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getSiriusExpressionDescriptionAccess().getExpressionEAttributeFQNParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getSiriusExpressionDescriptionAccess().getExpressionEAttributeCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionDescription__ExpressionAssignment_1"


    // $ANTLR start "rule__SiriusExpressionDescription__ParametersAssignment_3_0"
    // InternalExpressionText.g:2029:1: rule__SiriusExpressionDescription__ParametersAssignment_3_0 : ( ruleSiriusParameter ) ;
    public final void rule__SiriusExpressionDescription__ParametersAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:2033:1: ( ( ruleSiriusParameter ) )
            // InternalExpressionText.g:2034:1: ( ruleSiriusParameter )
            {
            // InternalExpressionText.g:2034:1: ( ruleSiriusParameter )
            // InternalExpressionText.g:2035:1: ruleSiriusParameter
            {
             before(grammarAccess.getSiriusExpressionDescriptionAccess().getParametersSiriusParameterParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSiriusParameter();

            state._fsp--;

             after(grammarAccess.getSiriusExpressionDescriptionAccess().getParametersSiriusParameterParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionDescription__ParametersAssignment_3_0"


    // $ANTLR start "rule__SiriusExpressionDescription__ParametersAssignment_3_1_1"
    // InternalExpressionText.g:2044:1: rule__SiriusExpressionDescription__ParametersAssignment_3_1_1 : ( ruleSiriusParameter ) ;
    public final void rule__SiriusExpressionDescription__ParametersAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:2048:1: ( ( ruleSiriusParameter ) )
            // InternalExpressionText.g:2049:1: ( ruleSiriusParameter )
            {
            // InternalExpressionText.g:2049:1: ( ruleSiriusParameter )
            // InternalExpressionText.g:2050:1: ruleSiriusParameter
            {
             before(grammarAccess.getSiriusExpressionDescriptionAccess().getParametersSiriusParameterParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSiriusParameter();

            state._fsp--;

             after(grammarAccess.getSiriusExpressionDescriptionAccess().getParametersSiriusParameterParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionDescription__ParametersAssignment_3_1_1"


    // $ANTLR start "rule__SiriusExpressionDescription__ReturnTypeAssignment_6"
    // InternalExpressionText.g:2059:1: rule__SiriusExpressionDescription__ReturnTypeAssignment_6 : ( ( ruleFQN ) ) ;
    public final void rule__SiriusExpressionDescription__ReturnTypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:2063:1: ( ( ( ruleFQN ) ) )
            // InternalExpressionText.g:2064:1: ( ( ruleFQN ) )
            {
            // InternalExpressionText.g:2064:1: ( ( ruleFQN ) )
            // InternalExpressionText.g:2065:1: ( ruleFQN )
            {
             before(grammarAccess.getSiriusExpressionDescriptionAccess().getReturnTypeEClassifierCrossReference_6_0()); 
            // InternalExpressionText.g:2066:1: ( ruleFQN )
            // InternalExpressionText.g:2067:1: ruleFQN
            {
             before(grammarAccess.getSiriusExpressionDescriptionAccess().getReturnTypeEClassifierFQNParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getSiriusExpressionDescriptionAccess().getReturnTypeEClassifierFQNParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getSiriusExpressionDescriptionAccess().getReturnTypeEClassifierCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionDescription__ReturnTypeAssignment_6"


    // $ANTLR start "rule__SiriusExpressionDescription__LowerBoundAssignment_8"
    // InternalExpressionText.g:2078:1: rule__SiriusExpressionDescription__LowerBoundAssignment_8 : ( ruleBound ) ;
    public final void rule__SiriusExpressionDescription__LowerBoundAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:2082:1: ( ( ruleBound ) )
            // InternalExpressionText.g:2083:1: ( ruleBound )
            {
            // InternalExpressionText.g:2083:1: ( ruleBound )
            // InternalExpressionText.g:2084:1: ruleBound
            {
             before(grammarAccess.getSiriusExpressionDescriptionAccess().getLowerBoundBoundParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleBound();

            state._fsp--;

             after(grammarAccess.getSiriusExpressionDescriptionAccess().getLowerBoundBoundParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionDescription__LowerBoundAssignment_8"


    // $ANTLR start "rule__SiriusExpressionDescription__UpperBoundAssignment_10"
    // InternalExpressionText.g:2093:1: rule__SiriusExpressionDescription__UpperBoundAssignment_10 : ( ruleBound ) ;
    public final void rule__SiriusExpressionDescription__UpperBoundAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:2097:1: ( ( ruleBound ) )
            // InternalExpressionText.g:2098:1: ( ruleBound )
            {
            // InternalExpressionText.g:2098:1: ( ruleBound )
            // InternalExpressionText.g:2099:1: ruleBound
            {
             before(grammarAccess.getSiriusExpressionDescriptionAccess().getUpperBoundBoundParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleBound();

            state._fsp--;

             after(grammarAccess.getSiriusExpressionDescriptionAccess().getUpperBoundBoundParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionDescription__UpperBoundAssignment_10"


    // $ANTLR start "rule__SiriusExpressionDescription__VariableContainersAssignment_16_0"
    // InternalExpressionText.g:2108:1: rule__SiriusExpressionDescription__VariableContainersAssignment_16_0 : ( ( ruleFQN ) ) ;
    public final void rule__SiriusExpressionDescription__VariableContainersAssignment_16_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:2112:1: ( ( ( ruleFQN ) ) )
            // InternalExpressionText.g:2113:1: ( ( ruleFQN ) )
            {
            // InternalExpressionText.g:2113:1: ( ( ruleFQN ) )
            // InternalExpressionText.g:2114:1: ( ruleFQN )
            {
             before(grammarAccess.getSiriusExpressionDescriptionAccess().getVariableContainersEClassCrossReference_16_0_0()); 
            // InternalExpressionText.g:2115:1: ( ruleFQN )
            // InternalExpressionText.g:2116:1: ruleFQN
            {
             before(grammarAccess.getSiriusExpressionDescriptionAccess().getVariableContainersEClassFQNParserRuleCall_16_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getSiriusExpressionDescriptionAccess().getVariableContainersEClassFQNParserRuleCall_16_0_0_1()); 

            }

             after(grammarAccess.getSiriusExpressionDescriptionAccess().getVariableContainersEClassCrossReference_16_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionDescription__VariableContainersAssignment_16_0"


    // $ANTLR start "rule__SiriusExpressionDescription__VariableContainersAssignment_16_1_1"
    // InternalExpressionText.g:2127:1: rule__SiriusExpressionDescription__VariableContainersAssignment_16_1_1 : ( ( ruleFQN ) ) ;
    public final void rule__SiriusExpressionDescription__VariableContainersAssignment_16_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:2131:1: ( ( ( ruleFQN ) ) )
            // InternalExpressionText.g:2132:1: ( ( ruleFQN ) )
            {
            // InternalExpressionText.g:2132:1: ( ( ruleFQN ) )
            // InternalExpressionText.g:2133:1: ( ruleFQN )
            {
             before(grammarAccess.getSiriusExpressionDescriptionAccess().getVariableContainersEClassCrossReference_16_1_1_0()); 
            // InternalExpressionText.g:2134:1: ( ruleFQN )
            // InternalExpressionText.g:2135:1: ruleFQN
            {
             before(grammarAccess.getSiriusExpressionDescriptionAccess().getVariableContainersEClassFQNParserRuleCall_16_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getSiriusExpressionDescriptionAccess().getVariableContainersEClassFQNParserRuleCall_16_1_1_0_1()); 

            }

             after(grammarAccess.getSiriusExpressionDescriptionAccess().getVariableContainersEClassCrossReference_16_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusExpressionDescription__VariableContainersAssignment_16_1_1"


    // $ANTLR start "rule__SiriusParameter__OptionalAssignment_0"
    // InternalExpressionText.g:2146:1: rule__SiriusParameter__OptionalAssignment_0 : ( ( 'optional' ) ) ;
    public final void rule__SiriusParameter__OptionalAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:2150:1: ( ( ( 'optional' ) ) )
            // InternalExpressionText.g:2151:1: ( ( 'optional' ) )
            {
            // InternalExpressionText.g:2151:1: ( ( 'optional' ) )
            // InternalExpressionText.g:2152:1: ( 'optional' )
            {
             before(grammarAccess.getSiriusParameterAccess().getOptionalOptionalKeyword_0_0()); 
            // InternalExpressionText.g:2153:1: ( 'optional' )
            // InternalExpressionText.g:2154:1: 'optional'
            {
             before(grammarAccess.getSiriusParameterAccess().getOptionalOptionalKeyword_0_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSiriusParameterAccess().getOptionalOptionalKeyword_0_0()); 

            }

             after(grammarAccess.getSiriusParameterAccess().getOptionalOptionalKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusParameter__OptionalAssignment_0"


    // $ANTLR start "rule__SiriusParameter__VariableAssignment_1"
    // InternalExpressionText.g:2169:1: rule__SiriusParameter__VariableAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__SiriusParameter__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressionText.g:2173:1: ( ( ( RULE_ID ) ) )
            // InternalExpressionText.g:2174:1: ( ( RULE_ID ) )
            {
            // InternalExpressionText.g:2174:1: ( ( RULE_ID ) )
            // InternalExpressionText.g:2175:1: ( RULE_ID )
            {
             before(grammarAccess.getSiriusParameterAccess().getVariableSiriusVariableCrossReference_1_0()); 
            // InternalExpressionText.g:2176:1: ( RULE_ID )
            // InternalExpressionText.g:2177:1: RULE_ID
            {
             before(grammarAccess.getSiriusParameterAccess().getVariableSiriusVariableIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSiriusParameterAccess().getVariableSiriusVariableIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getSiriusParameterAccess().getVariableSiriusVariableCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiriusParameter__VariableAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000A440L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002042L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000002040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002020010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000002000010L});

}