package com.leonardo.ltl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.leonardo.ltl.services.LTLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLTLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'description'", "'end'", "'entity'", "'version'", "'requirement'", "'suite'", "'date'", "'cases'", "'entities'", "'case'", "'precondition'", "'method'", "'expectedResult'", "'actualResult'", "'passed'", "'incident'", "'postcondition'", "'inputs'", "','", "'test'", "'specification'", "'.'", "'true'", "'false'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalLTLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLTLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLTLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalLTL.g"; }



     	private LTLGrammarAccess grammarAccess;

        public InternalLTLParser(TokenStream input, LTLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected LTLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalLTL.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalLTL.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalLTL.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalLTL.g:71:1: ruleModel returns [EObject current=null] : ( () ( (lv_packages_1_0= rulePackage ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_packages_1_0 = null;



        	enterRule();

        try {
            // InternalLTL.g:77:2: ( ( () ( (lv_packages_1_0= rulePackage ) )* ) )
            // InternalLTL.g:78:2: ( () ( (lv_packages_1_0= rulePackage ) )* )
            {
            // InternalLTL.g:78:2: ( () ( (lv_packages_1_0= rulePackage ) )* )
            // InternalLTL.g:79:3: () ( (lv_packages_1_0= rulePackage ) )*
            {
            // InternalLTL.g:79:3: ()
            // InternalLTL.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getModelAccess().getModelAction_0(),
            					current);
            			

            }

            // InternalLTL.g:86:3: ( (lv_packages_1_0= rulePackage ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalLTL.g:87:4: (lv_packages_1_0= rulePackage )
            	    {
            	    // InternalLTL.g:87:4: (lv_packages_1_0= rulePackage )
            	    // InternalLTL.g:88:5: lv_packages_1_0= rulePackage
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getPackagesPackageParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_packages_1_0=rulePackage();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"packages",
            	    						lv_packages_1_0,
            	    						"com.leonardo.ltl.LTL.Package");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulePackage"
    // InternalLTL.g:109:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // InternalLTL.g:109:48: (iv_rulePackage= rulePackage EOF )
            // InternalLTL.g:110:2: iv_rulePackage= rulePackage EOF
            {
             newCompositeNode(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackage=rulePackage();

            state._fsp--;

             current =iv_rulePackage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // InternalLTL.g:116:1: rulePackage returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_packagableElements_5_0= rulePackagableElement ) ) )+ ) ) )* ) ) ) otherlv_6= 'end' ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_packagableElements_5_0 = null;



        	enterRule();

        try {
            // InternalLTL.g:122:2: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_packagableElements_5_0= rulePackagableElement ) ) )+ ) ) )* ) ) ) otherlv_6= 'end' ) )
            // InternalLTL.g:123:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_packagableElements_5_0= rulePackagableElement ) ) )+ ) ) )* ) ) ) otherlv_6= 'end' )
            {
            // InternalLTL.g:123:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_packagableElements_5_0= rulePackagableElement ) ) )+ ) ) )* ) ) ) otherlv_6= 'end' )
            // InternalLTL.g:124:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_packagableElements_5_0= rulePackagableElement ) ) )+ ) ) )* ) ) ) otherlv_6= 'end'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPackageAccess().getPackageKeyword_0());
            		
            // InternalLTL.g:128:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalLTL.g:129:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalLTL.g:129:4: (lv_name_1_0= ruleQualifiedName )
            // InternalLTL.g:130:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getPackageAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPackageRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"com.leonardo.ltl.LTL.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLTL.g:147:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_packagableElements_5_0= rulePackagableElement ) ) )+ ) ) )* ) ) )
            // InternalLTL.g:148:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_packagableElements_5_0= rulePackagableElement ) ) )+ ) ) )* ) )
            {
            // InternalLTL.g:148:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_packagableElements_5_0= rulePackagableElement ) ) )+ ) ) )* ) )
            // InternalLTL.g:149:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_packagableElements_5_0= rulePackagableElement ) ) )+ ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getPackageAccess().getUnorderedGroup_2());
            				
            // InternalLTL.g:152:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_packagableElements_5_0= rulePackagableElement ) ) )+ ) ) )* )
            // InternalLTL.g:153:6: ( ({...}? => ( ({...}? => (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_packagableElements_5_0= rulePackagableElement ) ) )+ ) ) )*
            {
            // InternalLTL.g:153:6: ( ({...}? => ( ({...}? => (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_packagableElements_5_0= rulePackagableElement ) ) )+ ) ) )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( LA3_0 == 12 && getUnorderedGroupHelper().canSelect(grammarAccess.getPackageAccess().getUnorderedGroup_2(), 0) ) {
                    alt3=1;
                }
                else if ( ( LA3_0 == 14 || LA3_0 >= 16 && LA3_0 <= 17 || LA3_0 == 21 || LA3_0 == 31 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPackageAccess().getUnorderedGroup_2(), 1) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalLTL.g:154:4: ({...}? => ( ({...}? => (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalLTL.g:154:4: ({...}? => ( ({...}? => (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) )
            	    // InternalLTL.g:155:5: {...}? => ( ({...}? => (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPackageAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "rulePackage", "getUnorderedGroupHelper().canSelect(grammarAccess.getPackageAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalLTL.g:155:104: ( ({...}? => (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ) ) )
            	    // InternalLTL.g:156:6: ({...}? => (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPackageAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalLTL.g:159:9: ({...}? => (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ) )
            	    // InternalLTL.g:159:10: {...}? => (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePackage", "true");
            	    }
            	    // InternalLTL.g:159:19: (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) )
            	    // InternalLTL.g:159:20: otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,12,FOLLOW_6); 

            	    									newLeafNode(otherlv_3, grammarAccess.getPackageAccess().getDescriptionKeyword_2_0_0());
            	    								
            	    // InternalLTL.g:163:9: ( (lv_description_4_0= RULE_STRING ) )
            	    // InternalLTL.g:164:10: (lv_description_4_0= RULE_STRING )
            	    {
            	    // InternalLTL.g:164:10: (lv_description_4_0= RULE_STRING )
            	    // InternalLTL.g:165:11: lv_description_4_0= RULE_STRING
            	    {
            	    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            	    											newLeafNode(lv_description_4_0, grammarAccess.getPackageAccess().getDescriptionSTRINGTerminalRuleCall_2_0_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getPackageRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"description",
            	    												lv_description_4_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPackageAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalLTL.g:187:4: ({...}? => ( ({...}? => ( (lv_packagableElements_5_0= rulePackagableElement ) ) )+ ) )
            	    {
            	    // InternalLTL.g:187:4: ({...}? => ( ({...}? => ( (lv_packagableElements_5_0= rulePackagableElement ) ) )+ ) )
            	    // InternalLTL.g:188:5: {...}? => ( ({...}? => ( (lv_packagableElements_5_0= rulePackagableElement ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPackageAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "rulePackage", "getUnorderedGroupHelper().canSelect(grammarAccess.getPackageAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalLTL.g:188:104: ( ({...}? => ( (lv_packagableElements_5_0= rulePackagableElement ) ) )+ )
            	    // InternalLTL.g:189:6: ({...}? => ( (lv_packagableElements_5_0= rulePackagableElement ) ) )+
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPackageAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalLTL.g:192:9: ({...}? => ( (lv_packagableElements_5_0= rulePackagableElement ) ) )+
            	    int cnt2=0;
            	    loop2:
            	    do {
            	        int alt2=2;
            	        switch ( input.LA(1) ) {
            	        case 31:
            	            {
            	            int LA2_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt2=1;
            	            }


            	            }
            	            break;
            	        case 14:
            	            {
            	            int LA2_3 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt2=1;
            	            }


            	            }
            	            break;
            	        case 16:
            	            {
            	            int LA2_4 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt2=1;
            	            }


            	            }
            	            break;
            	        case 17:
            	            {
            	            int LA2_5 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt2=1;
            	            }


            	            }
            	            break;
            	        case 21:
            	            {
            	            int LA2_6 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt2=1;
            	            }


            	            }
            	            break;

            	        }

            	        switch (alt2) {
            	    	case 1 :
            	    	    // InternalLTL.g:192:10: {...}? => ( (lv_packagableElements_5_0= rulePackagableElement ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "rulePackage", "true");
            	    	    }
            	    	    // InternalLTL.g:192:19: ( (lv_packagableElements_5_0= rulePackagableElement ) )
            	    	    // InternalLTL.g:192:20: (lv_packagableElements_5_0= rulePackagableElement )
            	    	    {
            	    	    // InternalLTL.g:192:20: (lv_packagableElements_5_0= rulePackagableElement )
            	    	    // InternalLTL.g:193:10: lv_packagableElements_5_0= rulePackagableElement
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getPackageAccess().getPackagableElementsPackagableElementParserRuleCall_2_1_0());
            	    	    									
            	    	    pushFollow(FOLLOW_5);
            	    	    lv_packagableElements_5_0=rulePackagableElement();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getPackageRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"packagableElements",
            	    	    											lv_packagableElements_5_0,
            	    	    											"com.leonardo.ltl.LTL.PackagableElement");
            	    	    										afterParserOrEnumRuleCall();
            	    	    									

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt2 >= 1 ) break loop2;
            	                EarlyExitException eee =
            	                    new EarlyExitException(2, input);
            	                throw eee;
            	        }
            	        cnt2++;
            	    } while (true);

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPackageAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getPackageAccess().getUnorderedGroup_2());
            				

            }

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getPackageAccess().getEndKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRulePackagableElement"
    // InternalLTL.g:230:1: entryRulePackagableElement returns [EObject current=null] : iv_rulePackagableElement= rulePackagableElement EOF ;
    public final EObject entryRulePackagableElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackagableElement = null;


        try {
            // InternalLTL.g:230:58: (iv_rulePackagableElement= rulePackagableElement EOF )
            // InternalLTL.g:231:2: iv_rulePackagableElement= rulePackagableElement EOF
            {
             newCompositeNode(grammarAccess.getPackagableElementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackagableElement=rulePackagableElement();

            state._fsp--;

             current =iv_rulePackagableElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackagableElement"


    // $ANTLR start "rulePackagableElement"
    // InternalLTL.g:237:1: rulePackagableElement returns [EObject current=null] : (this_TestExecution_0= ruleTestExecution | this_TestableEntity_1= ruleTestableEntity | this_TestRequirement_2= ruleTestRequirement | this_TestSpecification_3= ruleTestSpecification ) ;
    public final EObject rulePackagableElement() throws RecognitionException {
        EObject current = null;

        EObject this_TestExecution_0 = null;

        EObject this_TestableEntity_1 = null;

        EObject this_TestRequirement_2 = null;

        EObject this_TestSpecification_3 = null;



        	enterRule();

        try {
            // InternalLTL.g:243:2: ( (this_TestExecution_0= ruleTestExecution | this_TestableEntity_1= ruleTestableEntity | this_TestRequirement_2= ruleTestRequirement | this_TestSpecification_3= ruleTestSpecification ) )
            // InternalLTL.g:244:2: (this_TestExecution_0= ruleTestExecution | this_TestableEntity_1= ruleTestableEntity | this_TestRequirement_2= ruleTestRequirement | this_TestSpecification_3= ruleTestSpecification )
            {
            // InternalLTL.g:244:2: (this_TestExecution_0= ruleTestExecution | this_TestableEntity_1= ruleTestableEntity | this_TestRequirement_2= ruleTestRequirement | this_TestSpecification_3= ruleTestSpecification )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt4=1;
                }
                break;
            case 14:
                {
                alt4=2;
                }
                break;
            case 16:
                {
                alt4=3;
                }
                break;
            case 17:
            case 21:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalLTL.g:245:3: this_TestExecution_0= ruleTestExecution
                    {

                    			newCompositeNode(grammarAccess.getPackagableElementAccess().getTestExecutionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_TestExecution_0=ruleTestExecution();

                    state._fsp--;


                    			current = this_TestExecution_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalLTL.g:254:3: this_TestableEntity_1= ruleTestableEntity
                    {

                    			newCompositeNode(grammarAccess.getPackagableElementAccess().getTestableEntityParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TestableEntity_1=ruleTestableEntity();

                    state._fsp--;


                    			current = this_TestableEntity_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalLTL.g:263:3: this_TestRequirement_2= ruleTestRequirement
                    {

                    			newCompositeNode(grammarAccess.getPackagableElementAccess().getTestRequirementParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_TestRequirement_2=ruleTestRequirement();

                    state._fsp--;


                    			current = this_TestRequirement_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalLTL.g:272:3: this_TestSpecification_3= ruleTestSpecification
                    {

                    			newCompositeNode(grammarAccess.getPackagableElementAccess().getTestSpecificationParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_TestSpecification_3=ruleTestSpecification();

                    state._fsp--;


                    			current = this_TestSpecification_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackagableElement"


    // $ANTLR start "entryRuleTestSpecification"
    // InternalLTL.g:284:1: entryRuleTestSpecification returns [EObject current=null] : iv_ruleTestSpecification= ruleTestSpecification EOF ;
    public final EObject entryRuleTestSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestSpecification = null;


        try {
            // InternalLTL.g:284:58: (iv_ruleTestSpecification= ruleTestSpecification EOF )
            // InternalLTL.g:285:2: iv_ruleTestSpecification= ruleTestSpecification EOF
            {
             newCompositeNode(grammarAccess.getTestSpecificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTestSpecification=ruleTestSpecification();

            state._fsp--;

             current =iv_ruleTestSpecification; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTestSpecification"


    // $ANTLR start "ruleTestSpecification"
    // InternalLTL.g:291:1: ruleTestSpecification returns [EObject current=null] : (this_TestSuite_0= ruleTestSuite | this_TestCase_1= ruleTestCase ) ;
    public final EObject ruleTestSpecification() throws RecognitionException {
        EObject current = null;

        EObject this_TestSuite_0 = null;

        EObject this_TestCase_1 = null;



        	enterRule();

        try {
            // InternalLTL.g:297:2: ( (this_TestSuite_0= ruleTestSuite | this_TestCase_1= ruleTestCase ) )
            // InternalLTL.g:298:2: (this_TestSuite_0= ruleTestSuite | this_TestCase_1= ruleTestCase )
            {
            // InternalLTL.g:298:2: (this_TestSuite_0= ruleTestSuite | this_TestCase_1= ruleTestCase )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            else if ( (LA5_0==21) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalLTL.g:299:3: this_TestSuite_0= ruleTestSuite
                    {

                    			newCompositeNode(grammarAccess.getTestSpecificationAccess().getTestSuiteParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_TestSuite_0=ruleTestSuite();

                    state._fsp--;


                    			current = this_TestSuite_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalLTL.g:308:3: this_TestCase_1= ruleTestCase
                    {

                    			newCompositeNode(grammarAccess.getTestSpecificationAccess().getTestCaseParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TestCase_1=ruleTestCase();

                    state._fsp--;


                    			current = this_TestCase_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTestSpecification"


    // $ANTLR start "entryRuleTestableEntity"
    // InternalLTL.g:320:1: entryRuleTestableEntity returns [EObject current=null] : iv_ruleTestableEntity= ruleTestableEntity EOF ;
    public final EObject entryRuleTestableEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestableEntity = null;


        try {
            // InternalLTL.g:320:55: (iv_ruleTestableEntity= ruleTestableEntity EOF )
            // InternalLTL.g:321:2: iv_ruleTestableEntity= ruleTestableEntity EOF
            {
             newCompositeNode(grammarAccess.getTestableEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTestableEntity=ruleTestableEntity();

            state._fsp--;

             current =iv_ruleTestableEntity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTestableEntity"


    // $ANTLR start "ruleTestableEntity"
    // InternalLTL.g:327:1: ruleTestableEntity returns [EObject current=null] : ( () otherlv_1= 'entity' ( (lv_name_2_0= ruleQualifiedName ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'version' ( (lv_version_7_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_8= 'end' ) ;
    public final EObject ruleTestableEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        Token lv_version_7_0=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalLTL.g:333:2: ( ( () otherlv_1= 'entity' ( (lv_name_2_0= ruleQualifiedName ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'version' ( (lv_version_7_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_8= 'end' ) )
            // InternalLTL.g:334:2: ( () otherlv_1= 'entity' ( (lv_name_2_0= ruleQualifiedName ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'version' ( (lv_version_7_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_8= 'end' )
            {
            // InternalLTL.g:334:2: ( () otherlv_1= 'entity' ( (lv_name_2_0= ruleQualifiedName ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'version' ( (lv_version_7_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_8= 'end' )
            // InternalLTL.g:335:3: () otherlv_1= 'entity' ( (lv_name_2_0= ruleQualifiedName ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'version' ( (lv_version_7_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_8= 'end'
            {
            // InternalLTL.g:335:3: ()
            // InternalLTL.g:336:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTestableEntityAccess().getTestableEntityAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTestableEntityAccess().getEntityKeyword_1());
            		
            // InternalLTL.g:346:3: ( (lv_name_2_0= ruleQualifiedName ) )
            // InternalLTL.g:347:4: (lv_name_2_0= ruleQualifiedName )
            {
            // InternalLTL.g:347:4: (lv_name_2_0= ruleQualifiedName )
            // InternalLTL.g:348:5: lv_name_2_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getTestableEntityAccess().getNameQualifiedNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTestableEntityRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"com.leonardo.ltl.LTL.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLTL.g:365:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'version' ( (lv_version_7_0= RULE_STRING ) ) ) ) ) ) )* ) ) )
            // InternalLTL.g:366:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'version' ( (lv_version_7_0= RULE_STRING ) ) ) ) ) ) )* ) )
            {
            // InternalLTL.g:366:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'version' ( (lv_version_7_0= RULE_STRING ) ) ) ) ) ) )* ) )
            // InternalLTL.g:367:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'version' ( (lv_version_7_0= RULE_STRING ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getTestableEntityAccess().getUnorderedGroup_3());
            				
            // InternalLTL.g:370:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'version' ( (lv_version_7_0= RULE_STRING ) ) ) ) ) ) )* )
            // InternalLTL.g:371:6: ( ({...}? => ( ({...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'version' ( (lv_version_7_0= RULE_STRING ) ) ) ) ) ) )*
            {
            // InternalLTL.g:371:6: ( ({...}? => ( ({...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'version' ( (lv_version_7_0= RULE_STRING ) ) ) ) ) ) )*
            loop6:
            do {
                int alt6=3;
                int LA6_0 = input.LA(1);

                if ( LA6_0 == 12 && getUnorderedGroupHelper().canSelect(grammarAccess.getTestableEntityAccess().getUnorderedGroup_3(), 0) ) {
                    alt6=1;
                }
                else if ( LA6_0 == 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getTestableEntityAccess().getUnorderedGroup_3(), 1) ) {
                    alt6=2;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalLTL.g:372:4: ({...}? => ( ({...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalLTL.g:372:4: ({...}? => ( ({...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    // InternalLTL.g:373:5: {...}? => ( ({...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTestableEntityAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleTestableEntity", "getUnorderedGroupHelper().canSelect(grammarAccess.getTestableEntityAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalLTL.g:373:111: ( ({...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    // InternalLTL.g:374:6: ({...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTestableEntityAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalLTL.g:377:9: ({...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    // InternalLTL.g:377:10: {...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTestableEntity", "true");
            	    }
            	    // InternalLTL.g:377:19: (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )
            	    // InternalLTL.g:377:20: otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,12,FOLLOW_6); 

            	    									newLeafNode(otherlv_4, grammarAccess.getTestableEntityAccess().getDescriptionKeyword_3_0_0());
            	    								
            	    // InternalLTL.g:381:9: ( (lv_description_5_0= RULE_STRING ) )
            	    // InternalLTL.g:382:10: (lv_description_5_0= RULE_STRING )
            	    {
            	    // InternalLTL.g:382:10: (lv_description_5_0= RULE_STRING )
            	    // InternalLTL.g:383:11: lv_description_5_0= RULE_STRING
            	    {
            	    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            	    											newLeafNode(lv_description_5_0, grammarAccess.getTestableEntityAccess().getDescriptionSTRINGTerminalRuleCall_3_0_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getTestableEntityRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"description",
            	    												lv_description_5_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTestableEntityAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalLTL.g:405:4: ({...}? => ( ({...}? => (otherlv_6= 'version' ( (lv_version_7_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalLTL.g:405:4: ({...}? => ( ({...}? => (otherlv_6= 'version' ( (lv_version_7_0= RULE_STRING ) ) ) ) ) )
            	    // InternalLTL.g:406:5: {...}? => ( ({...}? => (otherlv_6= 'version' ( (lv_version_7_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTestableEntityAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleTestableEntity", "getUnorderedGroupHelper().canSelect(grammarAccess.getTestableEntityAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalLTL.g:406:111: ( ({...}? => (otherlv_6= 'version' ( (lv_version_7_0= RULE_STRING ) ) ) ) )
            	    // InternalLTL.g:407:6: ({...}? => (otherlv_6= 'version' ( (lv_version_7_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTestableEntityAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalLTL.g:410:9: ({...}? => (otherlv_6= 'version' ( (lv_version_7_0= RULE_STRING ) ) ) )
            	    // InternalLTL.g:410:10: {...}? => (otherlv_6= 'version' ( (lv_version_7_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTestableEntity", "true");
            	    }
            	    // InternalLTL.g:410:19: (otherlv_6= 'version' ( (lv_version_7_0= RULE_STRING ) ) )
            	    // InternalLTL.g:410:20: otherlv_6= 'version' ( (lv_version_7_0= RULE_STRING ) )
            	    {
            	    otherlv_6=(Token)match(input,15,FOLLOW_6); 

            	    									newLeafNode(otherlv_6, grammarAccess.getTestableEntityAccess().getVersionKeyword_3_1_0());
            	    								
            	    // InternalLTL.g:414:9: ( (lv_version_7_0= RULE_STRING ) )
            	    // InternalLTL.g:415:10: (lv_version_7_0= RULE_STRING )
            	    {
            	    // InternalLTL.g:415:10: (lv_version_7_0= RULE_STRING )
            	    // InternalLTL.g:416:11: lv_version_7_0= RULE_STRING
            	    {
            	    lv_version_7_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            	    											newLeafNode(lv_version_7_0, grammarAccess.getTestableEntityAccess().getVersionSTRINGTerminalRuleCall_3_1_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getTestableEntityRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"version",
            	    												lv_version_7_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTestableEntityAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getTestableEntityAccess().getUnorderedGroup_3());
            				

            }

            otherlv_8=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getTestableEntityAccess().getEndKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTestableEntity"


    // $ANTLR start "entryRuleTestRequirement"
    // InternalLTL.g:453:1: entryRuleTestRequirement returns [EObject current=null] : iv_ruleTestRequirement= ruleTestRequirement EOF ;
    public final EObject entryRuleTestRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestRequirement = null;


        try {
            // InternalLTL.g:453:56: (iv_ruleTestRequirement= ruleTestRequirement EOF )
            // InternalLTL.g:454:2: iv_ruleTestRequirement= ruleTestRequirement EOF
            {
             newCompositeNode(grammarAccess.getTestRequirementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTestRequirement=ruleTestRequirement();

            state._fsp--;

             current =iv_ruleTestRequirement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTestRequirement"


    // $ANTLR start "ruleTestRequirement"
    // InternalLTL.g:460:1: ruleTestRequirement returns [EObject current=null] : ( () otherlv_1= 'requirement' ( (lv_name_2_0= ruleQualifiedName ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'version' ( (lv_version_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'entity' ( ( ruleQualifiedName ) ) ) ) ) ) )* ) ) ) otherlv_10= 'end' ) ;
    public final EObject ruleTestRequirement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        Token lv_version_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalLTL.g:466:2: ( ( () otherlv_1= 'requirement' ( (lv_name_2_0= ruleQualifiedName ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'version' ( (lv_version_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'entity' ( ( ruleQualifiedName ) ) ) ) ) ) )* ) ) ) otherlv_10= 'end' ) )
            // InternalLTL.g:467:2: ( () otherlv_1= 'requirement' ( (lv_name_2_0= ruleQualifiedName ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'version' ( (lv_version_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'entity' ( ( ruleQualifiedName ) ) ) ) ) ) )* ) ) ) otherlv_10= 'end' )
            {
            // InternalLTL.g:467:2: ( () otherlv_1= 'requirement' ( (lv_name_2_0= ruleQualifiedName ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'version' ( (lv_version_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'entity' ( ( ruleQualifiedName ) ) ) ) ) ) )* ) ) ) otherlv_10= 'end' )
            // InternalLTL.g:468:3: () otherlv_1= 'requirement' ( (lv_name_2_0= ruleQualifiedName ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'version' ( (lv_version_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'entity' ( ( ruleQualifiedName ) ) ) ) ) ) )* ) ) ) otherlv_10= 'end'
            {
            // InternalLTL.g:468:3: ()
            // InternalLTL.g:469:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTestRequirementAccess().getTestRequirementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTestRequirementAccess().getRequirementKeyword_1());
            		
            // InternalLTL.g:479:3: ( (lv_name_2_0= ruleQualifiedName ) )
            // InternalLTL.g:480:4: (lv_name_2_0= ruleQualifiedName )
            {
            // InternalLTL.g:480:4: (lv_name_2_0= ruleQualifiedName )
            // InternalLTL.g:481:5: lv_name_2_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getTestRequirementAccess().getNameQualifiedNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTestRequirementRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"com.leonardo.ltl.LTL.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLTL.g:498:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'version' ( (lv_version_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'entity' ( ( ruleQualifiedName ) ) ) ) ) ) )* ) ) )
            // InternalLTL.g:499:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'version' ( (lv_version_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'entity' ( ( ruleQualifiedName ) ) ) ) ) ) )* ) )
            {
            // InternalLTL.g:499:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'version' ( (lv_version_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'entity' ( ( ruleQualifiedName ) ) ) ) ) ) )* ) )
            // InternalLTL.g:500:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'version' ( (lv_version_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'entity' ( ( ruleQualifiedName ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getTestRequirementAccess().getUnorderedGroup_3());
            				
            // InternalLTL.g:503:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'version' ( (lv_version_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'entity' ( ( ruleQualifiedName ) ) ) ) ) ) )* )
            // InternalLTL.g:504:6: ( ({...}? => ( ({...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'version' ( (lv_version_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'entity' ( ( ruleQualifiedName ) ) ) ) ) ) )*
            {
            // InternalLTL.g:504:6: ( ({...}? => ( ({...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'version' ( (lv_version_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'entity' ( ( ruleQualifiedName ) ) ) ) ) ) )*
            loop7:
            do {
                int alt7=4;
                int LA7_0 = input.LA(1);

                if ( LA7_0 == 12 && getUnorderedGroupHelper().canSelect(grammarAccess.getTestRequirementAccess().getUnorderedGroup_3(), 0) ) {
                    alt7=1;
                }
                else if ( LA7_0 == 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getTestRequirementAccess().getUnorderedGroup_3(), 1) ) {
                    alt7=2;
                }
                else if ( LA7_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getTestRequirementAccess().getUnorderedGroup_3(), 2) ) {
                    alt7=3;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalLTL.g:505:4: ({...}? => ( ({...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalLTL.g:505:4: ({...}? => ( ({...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    // InternalLTL.g:506:5: {...}? => ( ({...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTestRequirementAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleTestRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getTestRequirementAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalLTL.g:506:112: ( ({...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    // InternalLTL.g:507:6: ({...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTestRequirementAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalLTL.g:510:9: ({...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    // InternalLTL.g:510:10: {...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTestRequirement", "true");
            	    }
            	    // InternalLTL.g:510:19: (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )
            	    // InternalLTL.g:510:20: otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,12,FOLLOW_6); 

            	    									newLeafNode(otherlv_4, grammarAccess.getTestRequirementAccess().getDescriptionKeyword_3_0_0());
            	    								
            	    // InternalLTL.g:514:9: ( (lv_description_5_0= RULE_STRING ) )
            	    // InternalLTL.g:515:10: (lv_description_5_0= RULE_STRING )
            	    {
            	    // InternalLTL.g:515:10: (lv_description_5_0= RULE_STRING )
            	    // InternalLTL.g:516:11: lv_description_5_0= RULE_STRING
            	    {
            	    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            	    											newLeafNode(lv_description_5_0, grammarAccess.getTestRequirementAccess().getDescriptionSTRINGTerminalRuleCall_3_0_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getTestRequirementRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"description",
            	    												lv_description_5_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTestRequirementAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalLTL.g:538:4: ({...}? => ( ({...}? => (otherlv_6= 'version' ( (lv_version_7_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalLTL.g:538:4: ({...}? => ( ({...}? => (otherlv_6= 'version' ( (lv_version_7_0= RULE_STRING ) ) ) ) ) )
            	    // InternalLTL.g:539:5: {...}? => ( ({...}? => (otherlv_6= 'version' ( (lv_version_7_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTestRequirementAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleTestRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getTestRequirementAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalLTL.g:539:112: ( ({...}? => (otherlv_6= 'version' ( (lv_version_7_0= RULE_STRING ) ) ) ) )
            	    // InternalLTL.g:540:6: ({...}? => (otherlv_6= 'version' ( (lv_version_7_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTestRequirementAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalLTL.g:543:9: ({...}? => (otherlv_6= 'version' ( (lv_version_7_0= RULE_STRING ) ) ) )
            	    // InternalLTL.g:543:10: {...}? => (otherlv_6= 'version' ( (lv_version_7_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTestRequirement", "true");
            	    }
            	    // InternalLTL.g:543:19: (otherlv_6= 'version' ( (lv_version_7_0= RULE_STRING ) ) )
            	    // InternalLTL.g:543:20: otherlv_6= 'version' ( (lv_version_7_0= RULE_STRING ) )
            	    {
            	    otherlv_6=(Token)match(input,15,FOLLOW_6); 

            	    									newLeafNode(otherlv_6, grammarAccess.getTestRequirementAccess().getVersionKeyword_3_1_0());
            	    								
            	    // InternalLTL.g:547:9: ( (lv_version_7_0= RULE_STRING ) )
            	    // InternalLTL.g:548:10: (lv_version_7_0= RULE_STRING )
            	    {
            	    // InternalLTL.g:548:10: (lv_version_7_0= RULE_STRING )
            	    // InternalLTL.g:549:11: lv_version_7_0= RULE_STRING
            	    {
            	    lv_version_7_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            	    											newLeafNode(lv_version_7_0, grammarAccess.getTestRequirementAccess().getVersionSTRINGTerminalRuleCall_3_1_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getTestRequirementRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"version",
            	    												lv_version_7_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTestRequirementAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalLTL.g:571:4: ({...}? => ( ({...}? => (otherlv_8= 'entity' ( ( ruleQualifiedName ) ) ) ) ) )
            	    {
            	    // InternalLTL.g:571:4: ({...}? => ( ({...}? => (otherlv_8= 'entity' ( ( ruleQualifiedName ) ) ) ) ) )
            	    // InternalLTL.g:572:5: {...}? => ( ({...}? => (otherlv_8= 'entity' ( ( ruleQualifiedName ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTestRequirementAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleTestRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getTestRequirementAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalLTL.g:572:112: ( ({...}? => (otherlv_8= 'entity' ( ( ruleQualifiedName ) ) ) ) )
            	    // InternalLTL.g:573:6: ({...}? => (otherlv_8= 'entity' ( ( ruleQualifiedName ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTestRequirementAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalLTL.g:576:9: ({...}? => (otherlv_8= 'entity' ( ( ruleQualifiedName ) ) ) )
            	    // InternalLTL.g:576:10: {...}? => (otherlv_8= 'entity' ( ( ruleQualifiedName ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTestRequirement", "true");
            	    }
            	    // InternalLTL.g:576:19: (otherlv_8= 'entity' ( ( ruleQualifiedName ) ) )
            	    // InternalLTL.g:576:20: otherlv_8= 'entity' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_8=(Token)match(input,14,FOLLOW_4); 

            	    									newLeafNode(otherlv_8, grammarAccess.getTestRequirementAccess().getEntityKeyword_3_2_0());
            	    								
            	    // InternalLTL.g:580:9: ( ( ruleQualifiedName ) )
            	    // InternalLTL.g:581:10: ( ruleQualifiedName )
            	    {
            	    // InternalLTL.g:581:10: ( ruleQualifiedName )
            	    // InternalLTL.g:582:11: ruleQualifiedName
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getTestRequirementRule());
            	    											}
            	    										

            	    											newCompositeNode(grammarAccess.getTestRequirementAccess().getTestableEntityTestableEntityCrossReference_3_2_1_0());
            	    										
            	    pushFollow(FOLLOW_8);
            	    ruleQualifiedName();

            	    state._fsp--;


            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTestRequirementAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getTestRequirementAccess().getUnorderedGroup_3());
            				

            }

            otherlv_10=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getTestRequirementAccess().getEndKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTestRequirement"


    // $ANTLR start "entryRuleTestSuite"
    // InternalLTL.g:617:1: entryRuleTestSuite returns [EObject current=null] : iv_ruleTestSuite= ruleTestSuite EOF ;
    public final EObject entryRuleTestSuite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestSuite = null;


        try {
            // InternalLTL.g:617:50: (iv_ruleTestSuite= ruleTestSuite EOF )
            // InternalLTL.g:618:2: iv_ruleTestSuite= ruleTestSuite EOF
            {
             newCompositeNode(grammarAccess.getTestSuiteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTestSuite=ruleTestSuite();

            state._fsp--;

             current =iv_ruleTestSuite; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTestSuite"


    // $ANTLR start "ruleTestSuite"
    // InternalLTL.g:624:1: ruleTestSuite returns [EObject current=null] : ( () otherlv_1= 'suite' ( (lv_name_2_0= ruleQualifiedName ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'date' ( (lv_date_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' ( (lv_version_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'cases' ( ( ruleQualifiedName ) )* otherlv_12= 'end' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'entities' ( ( ruleQualifiedName ) )* otherlv_15= 'end' ) ) ) ) )+ {...}?) ) ) otherlv_16= 'end' ) ;
    public final EObject ruleTestSuite() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        Token lv_date_7_0=null;
        Token otherlv_8=null;
        Token lv_version_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalLTL.g:630:2: ( ( () otherlv_1= 'suite' ( (lv_name_2_0= ruleQualifiedName ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'date' ( (lv_date_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' ( (lv_version_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'cases' ( ( ruleQualifiedName ) )* otherlv_12= 'end' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'entities' ( ( ruleQualifiedName ) )* otherlv_15= 'end' ) ) ) ) )+ {...}?) ) ) otherlv_16= 'end' ) )
            // InternalLTL.g:631:2: ( () otherlv_1= 'suite' ( (lv_name_2_0= ruleQualifiedName ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'date' ( (lv_date_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' ( (lv_version_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'cases' ( ( ruleQualifiedName ) )* otherlv_12= 'end' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'entities' ( ( ruleQualifiedName ) )* otherlv_15= 'end' ) ) ) ) )+ {...}?) ) ) otherlv_16= 'end' )
            {
            // InternalLTL.g:631:2: ( () otherlv_1= 'suite' ( (lv_name_2_0= ruleQualifiedName ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'date' ( (lv_date_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' ( (lv_version_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'cases' ( ( ruleQualifiedName ) )* otherlv_12= 'end' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'entities' ( ( ruleQualifiedName ) )* otherlv_15= 'end' ) ) ) ) )+ {...}?) ) ) otherlv_16= 'end' )
            // InternalLTL.g:632:3: () otherlv_1= 'suite' ( (lv_name_2_0= ruleQualifiedName ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'date' ( (lv_date_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' ( (lv_version_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'cases' ( ( ruleQualifiedName ) )* otherlv_12= 'end' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'entities' ( ( ruleQualifiedName ) )* otherlv_15= 'end' ) ) ) ) )+ {...}?) ) ) otherlv_16= 'end'
            {
            // InternalLTL.g:632:3: ()
            // InternalLTL.g:633:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTestSuiteAccess().getTestSuiteAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTestSuiteAccess().getSuiteKeyword_1());
            		
            // InternalLTL.g:643:3: ( (lv_name_2_0= ruleQualifiedName ) )
            // InternalLTL.g:644:4: (lv_name_2_0= ruleQualifiedName )
            {
            // InternalLTL.g:644:4: (lv_name_2_0= ruleQualifiedName )
            // InternalLTL.g:645:5: lv_name_2_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getTestSuiteAccess().getNameQualifiedNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTestSuiteRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"com.leonardo.ltl.LTL.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLTL.g:662:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'date' ( (lv_date_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' ( (lv_version_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'cases' ( ( ruleQualifiedName ) )* otherlv_12= 'end' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'entities' ( ( ruleQualifiedName ) )* otherlv_15= 'end' ) ) ) ) )+ {...}?) ) )
            // InternalLTL.g:663:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'date' ( (lv_date_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' ( (lv_version_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'cases' ( ( ruleQualifiedName ) )* otherlv_12= 'end' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'entities' ( ( ruleQualifiedName ) )* otherlv_15= 'end' ) ) ) ) )+ {...}?) )
            {
            // InternalLTL.g:663:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'date' ( (lv_date_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' ( (lv_version_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'cases' ( ( ruleQualifiedName ) )* otherlv_12= 'end' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'entities' ( ( ruleQualifiedName ) )* otherlv_15= 'end' ) ) ) ) )+ {...}?) )
            // InternalLTL.g:664:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'date' ( (lv_date_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' ( (lv_version_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'cases' ( ( ruleQualifiedName ) )* otherlv_12= 'end' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'entities' ( ( ruleQualifiedName ) )* otherlv_15= 'end' ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getTestSuiteAccess().getUnorderedGroup_3());
            				
            // InternalLTL.g:667:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'date' ( (lv_date_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' ( (lv_version_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'cases' ( ( ruleQualifiedName ) )* otherlv_12= 'end' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'entities' ( ( ruleQualifiedName ) )* otherlv_15= 'end' ) ) ) ) )+ {...}?)
            // InternalLTL.g:668:6: ( ({...}? => ( ({...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'date' ( (lv_date_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' ( (lv_version_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'cases' ( ( ruleQualifiedName ) )* otherlv_12= 'end' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'entities' ( ( ruleQualifiedName ) )* otherlv_15= 'end' ) ) ) ) )+ {...}?
            {
            // InternalLTL.g:668:6: ( ({...}? => ( ({...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'date' ( (lv_date_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' ( (lv_version_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'cases' ( ( ruleQualifiedName ) )* otherlv_12= 'end' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'entities' ( ( ruleQualifiedName ) )* otherlv_15= 'end' ) ) ) ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=6;
                int LA10_0 = input.LA(1);

                if ( LA10_0 == 12 && getUnorderedGroupHelper().canSelect(grammarAccess.getTestSuiteAccess().getUnorderedGroup_3(), 0) ) {
                    alt10=1;
                }
                else if ( LA10_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getTestSuiteAccess().getUnorderedGroup_3(), 1) ) {
                    alt10=2;
                }
                else if ( LA10_0 == 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getTestSuiteAccess().getUnorderedGroup_3(), 2) ) {
                    alt10=3;
                }
                else if ( LA10_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getTestSuiteAccess().getUnorderedGroup_3(), 3) ) {
                    alt10=4;
                }
                else if ( LA10_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getTestSuiteAccess().getUnorderedGroup_3(), 4) ) {
                    alt10=5;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalLTL.g:669:4: ({...}? => ( ({...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalLTL.g:669:4: ({...}? => ( ({...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    // InternalLTL.g:670:5: {...}? => ( ({...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTestSuiteAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleTestSuite", "getUnorderedGroupHelper().canSelect(grammarAccess.getTestSuiteAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalLTL.g:670:106: ( ({...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    // InternalLTL.g:671:6: ({...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTestSuiteAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalLTL.g:674:9: ({...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    // InternalLTL.g:674:10: {...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTestSuite", "true");
            	    }
            	    // InternalLTL.g:674:19: (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )
            	    // InternalLTL.g:674:20: otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,12,FOLLOW_6); 

            	    									newLeafNode(otherlv_4, grammarAccess.getTestSuiteAccess().getDescriptionKeyword_3_0_0());
            	    								
            	    // InternalLTL.g:678:9: ( (lv_description_5_0= RULE_STRING ) )
            	    // InternalLTL.g:679:10: (lv_description_5_0= RULE_STRING )
            	    {
            	    // InternalLTL.g:679:10: (lv_description_5_0= RULE_STRING )
            	    // InternalLTL.g:680:11: lv_description_5_0= RULE_STRING
            	    {
            	    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            	    											newLeafNode(lv_description_5_0, grammarAccess.getTestSuiteAccess().getDescriptionSTRINGTerminalRuleCall_3_0_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getTestSuiteRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"description",
            	    												lv_description_5_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTestSuiteAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalLTL.g:702:4: ({...}? => ( ({...}? => (otherlv_6= 'date' ( (lv_date_7_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalLTL.g:702:4: ({...}? => ( ({...}? => (otherlv_6= 'date' ( (lv_date_7_0= RULE_STRING ) ) ) ) ) )
            	    // InternalLTL.g:703:5: {...}? => ( ({...}? => (otherlv_6= 'date' ( (lv_date_7_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTestSuiteAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleTestSuite", "getUnorderedGroupHelper().canSelect(grammarAccess.getTestSuiteAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalLTL.g:703:106: ( ({...}? => (otherlv_6= 'date' ( (lv_date_7_0= RULE_STRING ) ) ) ) )
            	    // InternalLTL.g:704:6: ({...}? => (otherlv_6= 'date' ( (lv_date_7_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTestSuiteAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalLTL.g:707:9: ({...}? => (otherlv_6= 'date' ( (lv_date_7_0= RULE_STRING ) ) ) )
            	    // InternalLTL.g:707:10: {...}? => (otherlv_6= 'date' ( (lv_date_7_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTestSuite", "true");
            	    }
            	    // InternalLTL.g:707:19: (otherlv_6= 'date' ( (lv_date_7_0= RULE_STRING ) ) )
            	    // InternalLTL.g:707:20: otherlv_6= 'date' ( (lv_date_7_0= RULE_STRING ) )
            	    {
            	    otherlv_6=(Token)match(input,18,FOLLOW_6); 

            	    									newLeafNode(otherlv_6, grammarAccess.getTestSuiteAccess().getDateKeyword_3_1_0());
            	    								
            	    // InternalLTL.g:711:9: ( (lv_date_7_0= RULE_STRING ) )
            	    // InternalLTL.g:712:10: (lv_date_7_0= RULE_STRING )
            	    {
            	    // InternalLTL.g:712:10: (lv_date_7_0= RULE_STRING )
            	    // InternalLTL.g:713:11: lv_date_7_0= RULE_STRING
            	    {
            	    lv_date_7_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            	    											newLeafNode(lv_date_7_0, grammarAccess.getTestSuiteAccess().getDateSTRINGTerminalRuleCall_3_1_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getTestSuiteRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"date",
            	    												lv_date_7_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTestSuiteAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalLTL.g:735:4: ({...}? => ( ({...}? => (otherlv_8= 'version' ( (lv_version_9_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalLTL.g:735:4: ({...}? => ( ({...}? => (otherlv_8= 'version' ( (lv_version_9_0= RULE_STRING ) ) ) ) ) )
            	    // InternalLTL.g:736:5: {...}? => ( ({...}? => (otherlv_8= 'version' ( (lv_version_9_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTestSuiteAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleTestSuite", "getUnorderedGroupHelper().canSelect(grammarAccess.getTestSuiteAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalLTL.g:736:106: ( ({...}? => (otherlv_8= 'version' ( (lv_version_9_0= RULE_STRING ) ) ) ) )
            	    // InternalLTL.g:737:6: ({...}? => (otherlv_8= 'version' ( (lv_version_9_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTestSuiteAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalLTL.g:740:9: ({...}? => (otherlv_8= 'version' ( (lv_version_9_0= RULE_STRING ) ) ) )
            	    // InternalLTL.g:740:10: {...}? => (otherlv_8= 'version' ( (lv_version_9_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTestSuite", "true");
            	    }
            	    // InternalLTL.g:740:19: (otherlv_8= 'version' ( (lv_version_9_0= RULE_STRING ) ) )
            	    // InternalLTL.g:740:20: otherlv_8= 'version' ( (lv_version_9_0= RULE_STRING ) )
            	    {
            	    otherlv_8=(Token)match(input,15,FOLLOW_6); 

            	    									newLeafNode(otherlv_8, grammarAccess.getTestSuiteAccess().getVersionKeyword_3_2_0());
            	    								
            	    // InternalLTL.g:744:9: ( (lv_version_9_0= RULE_STRING ) )
            	    // InternalLTL.g:745:10: (lv_version_9_0= RULE_STRING )
            	    {
            	    // InternalLTL.g:745:10: (lv_version_9_0= RULE_STRING )
            	    // InternalLTL.g:746:11: lv_version_9_0= RULE_STRING
            	    {
            	    lv_version_9_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            	    											newLeafNode(lv_version_9_0, grammarAccess.getTestSuiteAccess().getVersionSTRINGTerminalRuleCall_3_2_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getTestSuiteRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"version",
            	    												lv_version_9_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTestSuiteAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalLTL.g:768:4: ({...}? => ( ({...}? => (otherlv_10= 'cases' ( ( ruleQualifiedName ) )* otherlv_12= 'end' ) ) ) )
            	    {
            	    // InternalLTL.g:768:4: ({...}? => ( ({...}? => (otherlv_10= 'cases' ( ( ruleQualifiedName ) )* otherlv_12= 'end' ) ) ) )
            	    // InternalLTL.g:769:5: {...}? => ( ({...}? => (otherlv_10= 'cases' ( ( ruleQualifiedName ) )* otherlv_12= 'end' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTestSuiteAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleTestSuite", "getUnorderedGroupHelper().canSelect(grammarAccess.getTestSuiteAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalLTL.g:769:106: ( ({...}? => (otherlv_10= 'cases' ( ( ruleQualifiedName ) )* otherlv_12= 'end' ) ) )
            	    // InternalLTL.g:770:6: ({...}? => (otherlv_10= 'cases' ( ( ruleQualifiedName ) )* otherlv_12= 'end' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTestSuiteAccess().getUnorderedGroup_3(), 3);
            	    					
            	    // InternalLTL.g:773:9: ({...}? => (otherlv_10= 'cases' ( ( ruleQualifiedName ) )* otherlv_12= 'end' ) )
            	    // InternalLTL.g:773:10: {...}? => (otherlv_10= 'cases' ( ( ruleQualifiedName ) )* otherlv_12= 'end' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTestSuite", "true");
            	    }
            	    // InternalLTL.g:773:19: (otherlv_10= 'cases' ( ( ruleQualifiedName ) )* otherlv_12= 'end' )
            	    // InternalLTL.g:773:20: otherlv_10= 'cases' ( ( ruleQualifiedName ) )* otherlv_12= 'end'
            	    {
            	    otherlv_10=(Token)match(input,19,FOLLOW_11); 

            	    									newLeafNode(otherlv_10, grammarAccess.getTestSuiteAccess().getCasesKeyword_3_3_0());
            	    								
            	    // InternalLTL.g:777:9: ( ( ruleQualifiedName ) )*
            	    loop8:
            	    do {
            	        int alt8=2;
            	        int LA8_0 = input.LA(1);

            	        if ( (LA8_0==RULE_ID) ) {
            	            alt8=1;
            	        }


            	        switch (alt8) {
            	    	case 1 :
            	    	    // InternalLTL.g:778:10: ( ruleQualifiedName )
            	    	    {
            	    	    // InternalLTL.g:778:10: ( ruleQualifiedName )
            	    	    // InternalLTL.g:779:11: ruleQualifiedName
            	    	    {

            	    	    											if (current==null) {
            	    	    												current = createModelElement(grammarAccess.getTestSuiteRule());
            	    	    											}
            	    	    										

            	    	    											newCompositeNode(grammarAccess.getTestSuiteAccess().getTestSpecificationsTestSpecificationCrossReference_3_3_1_0());
            	    	    										
            	    	    pushFollow(FOLLOW_11);
            	    	    ruleQualifiedName();

            	    	    state._fsp--;


            	    	    											afterParserOrEnumRuleCall();
            	    	    										

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop8;
            	        }
            	    } while (true);

            	    otherlv_12=(Token)match(input,13,FOLLOW_10); 

            	    									newLeafNode(otherlv_12, grammarAccess.getTestSuiteAccess().getEndKeyword_3_3_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTestSuiteAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalLTL.g:803:4: ({...}? => ( ({...}? => (otherlv_13= 'entities' ( ( ruleQualifiedName ) )* otherlv_15= 'end' ) ) ) )
            	    {
            	    // InternalLTL.g:803:4: ({...}? => ( ({...}? => (otherlv_13= 'entities' ( ( ruleQualifiedName ) )* otherlv_15= 'end' ) ) ) )
            	    // InternalLTL.g:804:5: {...}? => ( ({...}? => (otherlv_13= 'entities' ( ( ruleQualifiedName ) )* otherlv_15= 'end' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTestSuiteAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleTestSuite", "getUnorderedGroupHelper().canSelect(grammarAccess.getTestSuiteAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // InternalLTL.g:804:106: ( ({...}? => (otherlv_13= 'entities' ( ( ruleQualifiedName ) )* otherlv_15= 'end' ) ) )
            	    // InternalLTL.g:805:6: ({...}? => (otherlv_13= 'entities' ( ( ruleQualifiedName ) )* otherlv_15= 'end' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTestSuiteAccess().getUnorderedGroup_3(), 4);
            	    					
            	    // InternalLTL.g:808:9: ({...}? => (otherlv_13= 'entities' ( ( ruleQualifiedName ) )* otherlv_15= 'end' ) )
            	    // InternalLTL.g:808:10: {...}? => (otherlv_13= 'entities' ( ( ruleQualifiedName ) )* otherlv_15= 'end' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTestSuite", "true");
            	    }
            	    // InternalLTL.g:808:19: (otherlv_13= 'entities' ( ( ruleQualifiedName ) )* otherlv_15= 'end' )
            	    // InternalLTL.g:808:20: otherlv_13= 'entities' ( ( ruleQualifiedName ) )* otherlv_15= 'end'
            	    {
            	    otherlv_13=(Token)match(input,20,FOLLOW_11); 

            	    									newLeafNode(otherlv_13, grammarAccess.getTestSuiteAccess().getEntitiesKeyword_3_4_0());
            	    								
            	    // InternalLTL.g:812:9: ( ( ruleQualifiedName ) )*
            	    loop9:
            	    do {
            	        int alt9=2;
            	        int LA9_0 = input.LA(1);

            	        if ( (LA9_0==RULE_ID) ) {
            	            alt9=1;
            	        }


            	        switch (alt9) {
            	    	case 1 :
            	    	    // InternalLTL.g:813:10: ( ruleQualifiedName )
            	    	    {
            	    	    // InternalLTL.g:813:10: ( ruleQualifiedName )
            	    	    // InternalLTL.g:814:11: ruleQualifiedName
            	    	    {

            	    	    											if (current==null) {
            	    	    												current = createModelElement(grammarAccess.getTestSuiteRule());
            	    	    											}
            	    	    										

            	    	    											newCompositeNode(grammarAccess.getTestSuiteAccess().getTestableEntitiesTestableEntityCrossReference_3_4_1_0());
            	    	    										
            	    	    pushFollow(FOLLOW_11);
            	    	    ruleQualifiedName();

            	    	    state._fsp--;


            	    	    											afterParserOrEnumRuleCall();
            	    	    										

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop9;
            	        }
            	    } while (true);

            	    otherlv_15=(Token)match(input,13,FOLLOW_10); 

            	    									newLeafNode(otherlv_15, grammarAccess.getTestSuiteAccess().getEndKeyword_3_4_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTestSuiteAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getTestSuiteAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleTestSuite", "getUnorderedGroupHelper().canLeave(grammarAccess.getTestSuiteAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getTestSuiteAccess().getUnorderedGroup_3());
            				

            }

            otherlv_16=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getTestSuiteAccess().getEndKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTestSuite"


    // $ANTLR start "entryRuleTestCase"
    // InternalLTL.g:854:1: entryRuleTestCase returns [EObject current=null] : iv_ruleTestCase= ruleTestCase EOF ;
    public final EObject entryRuleTestCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestCase = null;


        try {
            // InternalLTL.g:854:49: (iv_ruleTestCase= ruleTestCase EOF )
            // InternalLTL.g:855:2: iv_ruleTestCase= ruleTestCase EOF
            {
             newCompositeNode(grammarAccess.getTestCaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTestCase=ruleTestCase();

            state._fsp--;

             current =iv_ruleTestCase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTestCase"


    // $ANTLR start "ruleTestCase"
    // InternalLTL.g:861:1: ruleTestCase returns [EObject current=null] : ( () otherlv_1= 'case' ( (lv_name_2_0= ruleQualifiedName ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'date' ( (lv_date_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' ( (lv_version_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'precondition' ( (lv_precondition_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'method' ( (lv_testingMethod_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'expectedResult' ( (lv_expectedResult_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'actualResult' ( (lv_actualResult_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'passed' ( (lv_passed_19_0= ruleBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'incident' ( (lv_incident_21_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'postcondition' ( (lv_postcondition_23_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'inputs' ( (lv_inputs_25_0= RULE_STRING ) ) (otherlv_26= ',' ( (lv_inputs_27_0= RULE_STRING ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'entities' ( ( ruleQualifiedName ) )* otherlv_30= 'end' ) ) ) ) )+ {...}?) ) ) otherlv_31= 'end' ) ;
    public final EObject ruleTestCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        Token lv_date_7_0=null;
        Token otherlv_8=null;
        Token lv_version_9_0=null;
        Token otherlv_10=null;
        Token lv_precondition_11_0=null;
        Token otherlv_12=null;
        Token lv_testingMethod_13_0=null;
        Token otherlv_14=null;
        Token lv_expectedResult_15_0=null;
        Token otherlv_16=null;
        Token lv_actualResult_17_0=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token lv_incident_21_0=null;
        Token otherlv_22=null;
        Token lv_postcondition_23_0=null;
        Token otherlv_24=null;
        Token lv_inputs_25_0=null;
        Token otherlv_26=null;
        Token lv_inputs_27_0=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_passed_19_0 = null;



        	enterRule();

        try {
            // InternalLTL.g:867:2: ( ( () otherlv_1= 'case' ( (lv_name_2_0= ruleQualifiedName ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'date' ( (lv_date_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' ( (lv_version_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'precondition' ( (lv_precondition_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'method' ( (lv_testingMethod_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'expectedResult' ( (lv_expectedResult_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'actualResult' ( (lv_actualResult_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'passed' ( (lv_passed_19_0= ruleBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'incident' ( (lv_incident_21_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'postcondition' ( (lv_postcondition_23_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'inputs' ( (lv_inputs_25_0= RULE_STRING ) ) (otherlv_26= ',' ( (lv_inputs_27_0= RULE_STRING ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'entities' ( ( ruleQualifiedName ) )* otherlv_30= 'end' ) ) ) ) )+ {...}?) ) ) otherlv_31= 'end' ) )
            // InternalLTL.g:868:2: ( () otherlv_1= 'case' ( (lv_name_2_0= ruleQualifiedName ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'date' ( (lv_date_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' ( (lv_version_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'precondition' ( (lv_precondition_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'method' ( (lv_testingMethod_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'expectedResult' ( (lv_expectedResult_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'actualResult' ( (lv_actualResult_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'passed' ( (lv_passed_19_0= ruleBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'incident' ( (lv_incident_21_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'postcondition' ( (lv_postcondition_23_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'inputs' ( (lv_inputs_25_0= RULE_STRING ) ) (otherlv_26= ',' ( (lv_inputs_27_0= RULE_STRING ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'entities' ( ( ruleQualifiedName ) )* otherlv_30= 'end' ) ) ) ) )+ {...}?) ) ) otherlv_31= 'end' )
            {
            // InternalLTL.g:868:2: ( () otherlv_1= 'case' ( (lv_name_2_0= ruleQualifiedName ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'date' ( (lv_date_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' ( (lv_version_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'precondition' ( (lv_precondition_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'method' ( (lv_testingMethod_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'expectedResult' ( (lv_expectedResult_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'actualResult' ( (lv_actualResult_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'passed' ( (lv_passed_19_0= ruleBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'incident' ( (lv_incident_21_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'postcondition' ( (lv_postcondition_23_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'inputs' ( (lv_inputs_25_0= RULE_STRING ) ) (otherlv_26= ',' ( (lv_inputs_27_0= RULE_STRING ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'entities' ( ( ruleQualifiedName ) )* otherlv_30= 'end' ) ) ) ) )+ {...}?) ) ) otherlv_31= 'end' )
            // InternalLTL.g:869:3: () otherlv_1= 'case' ( (lv_name_2_0= ruleQualifiedName ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'date' ( (lv_date_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' ( (lv_version_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'precondition' ( (lv_precondition_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'method' ( (lv_testingMethod_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'expectedResult' ( (lv_expectedResult_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'actualResult' ( (lv_actualResult_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'passed' ( (lv_passed_19_0= ruleBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'incident' ( (lv_incident_21_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'postcondition' ( (lv_postcondition_23_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'inputs' ( (lv_inputs_25_0= RULE_STRING ) ) (otherlv_26= ',' ( (lv_inputs_27_0= RULE_STRING ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'entities' ( ( ruleQualifiedName ) )* otherlv_30= 'end' ) ) ) ) )+ {...}?) ) ) otherlv_31= 'end'
            {
            // InternalLTL.g:869:3: ()
            // InternalLTL.g:870:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTestCaseAccess().getTestCaseAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTestCaseAccess().getCaseKeyword_1());
            		
            // InternalLTL.g:880:3: ( (lv_name_2_0= ruleQualifiedName ) )
            // InternalLTL.g:881:4: (lv_name_2_0= ruleQualifiedName )
            {
            // InternalLTL.g:881:4: (lv_name_2_0= ruleQualifiedName )
            // InternalLTL.g:882:5: lv_name_2_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getTestCaseAccess().getNameQualifiedNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTestCaseRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"com.leonardo.ltl.LTL.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLTL.g:899:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'date' ( (lv_date_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' ( (lv_version_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'precondition' ( (lv_precondition_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'method' ( (lv_testingMethod_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'expectedResult' ( (lv_expectedResult_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'actualResult' ( (lv_actualResult_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'passed' ( (lv_passed_19_0= ruleBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'incident' ( (lv_incident_21_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'postcondition' ( (lv_postcondition_23_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'inputs' ( (lv_inputs_25_0= RULE_STRING ) ) (otherlv_26= ',' ( (lv_inputs_27_0= RULE_STRING ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'entities' ( ( ruleQualifiedName ) )* otherlv_30= 'end' ) ) ) ) )+ {...}?) ) )
            // InternalLTL.g:900:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'date' ( (lv_date_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' ( (lv_version_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'precondition' ( (lv_precondition_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'method' ( (lv_testingMethod_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'expectedResult' ( (lv_expectedResult_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'actualResult' ( (lv_actualResult_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'passed' ( (lv_passed_19_0= ruleBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'incident' ( (lv_incident_21_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'postcondition' ( (lv_postcondition_23_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'inputs' ( (lv_inputs_25_0= RULE_STRING ) ) (otherlv_26= ',' ( (lv_inputs_27_0= RULE_STRING ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'entities' ( ( ruleQualifiedName ) )* otherlv_30= 'end' ) ) ) ) )+ {...}?) )
            {
            // InternalLTL.g:900:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'date' ( (lv_date_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' ( (lv_version_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'precondition' ( (lv_precondition_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'method' ( (lv_testingMethod_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'expectedResult' ( (lv_expectedResult_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'actualResult' ( (lv_actualResult_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'passed' ( (lv_passed_19_0= ruleBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'incident' ( (lv_incident_21_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'postcondition' ( (lv_postcondition_23_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'inputs' ( (lv_inputs_25_0= RULE_STRING ) ) (otherlv_26= ',' ( (lv_inputs_27_0= RULE_STRING ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'entities' ( ( ruleQualifiedName ) )* otherlv_30= 'end' ) ) ) ) )+ {...}?) )
            // InternalLTL.g:901:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'date' ( (lv_date_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' ( (lv_version_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'precondition' ( (lv_precondition_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'method' ( (lv_testingMethod_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'expectedResult' ( (lv_expectedResult_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'actualResult' ( (lv_actualResult_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'passed' ( (lv_passed_19_0= ruleBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'incident' ( (lv_incident_21_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'postcondition' ( (lv_postcondition_23_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'inputs' ( (lv_inputs_25_0= RULE_STRING ) ) (otherlv_26= ',' ( (lv_inputs_27_0= RULE_STRING ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'entities' ( ( ruleQualifiedName ) )* otherlv_30= 'end' ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getTestCaseAccess().getUnorderedGroup_3());
            				
            // InternalLTL.g:904:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'date' ( (lv_date_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' ( (lv_version_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'precondition' ( (lv_precondition_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'method' ( (lv_testingMethod_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'expectedResult' ( (lv_expectedResult_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'actualResult' ( (lv_actualResult_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'passed' ( (lv_passed_19_0= ruleBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'incident' ( (lv_incident_21_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'postcondition' ( (lv_postcondition_23_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'inputs' ( (lv_inputs_25_0= RULE_STRING ) ) (otherlv_26= ',' ( (lv_inputs_27_0= RULE_STRING ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'entities' ( ( ruleQualifiedName ) )* otherlv_30= 'end' ) ) ) ) )+ {...}?)
            // InternalLTL.g:905:6: ( ({...}? => ( ({...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'date' ( (lv_date_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' ( (lv_version_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'precondition' ( (lv_precondition_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'method' ( (lv_testingMethod_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'expectedResult' ( (lv_expectedResult_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'actualResult' ( (lv_actualResult_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'passed' ( (lv_passed_19_0= ruleBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'incident' ( (lv_incident_21_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'postcondition' ( (lv_postcondition_23_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'inputs' ( (lv_inputs_25_0= RULE_STRING ) ) (otherlv_26= ',' ( (lv_inputs_27_0= RULE_STRING ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'entities' ( ( ruleQualifiedName ) )* otherlv_30= 'end' ) ) ) ) )+ {...}?
            {
            // InternalLTL.g:905:6: ( ({...}? => ( ({...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'date' ( (lv_date_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' ( (lv_version_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'precondition' ( (lv_precondition_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'method' ( (lv_testingMethod_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'expectedResult' ( (lv_expectedResult_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'actualResult' ( (lv_actualResult_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'passed' ( (lv_passed_19_0= ruleBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'incident' ( (lv_incident_21_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'postcondition' ( (lv_postcondition_23_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'inputs' ( (lv_inputs_25_0= RULE_STRING ) ) (otherlv_26= ',' ( (lv_inputs_27_0= RULE_STRING ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'entities' ( ( ruleQualifiedName ) )* otherlv_30= 'end' ) ) ) ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=13;
                alt13 = dfa13.predict(input);
                switch (alt13) {
            	case 1 :
            	    // InternalLTL.g:906:4: ({...}? => ( ({...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalLTL.g:906:4: ({...}? => ( ({...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    // InternalLTL.g:907:5: {...}? => ( ({...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTestCaseAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleTestCase", "getUnorderedGroupHelper().canSelect(grammarAccess.getTestCaseAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalLTL.g:907:105: ( ({...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    // InternalLTL.g:908:6: ({...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTestCaseAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalLTL.g:911:9: ({...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    // InternalLTL.g:911:10: {...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTestCase", "true");
            	    }
            	    // InternalLTL.g:911:19: (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )
            	    // InternalLTL.g:911:20: otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,12,FOLLOW_6); 

            	    									newLeafNode(otherlv_4, grammarAccess.getTestCaseAccess().getDescriptionKeyword_3_0_0());
            	    								
            	    // InternalLTL.g:915:9: ( (lv_description_5_0= RULE_STRING ) )
            	    // InternalLTL.g:916:10: (lv_description_5_0= RULE_STRING )
            	    {
            	    // InternalLTL.g:916:10: (lv_description_5_0= RULE_STRING )
            	    // InternalLTL.g:917:11: lv_description_5_0= RULE_STRING
            	    {
            	    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            	    											newLeafNode(lv_description_5_0, grammarAccess.getTestCaseAccess().getDescriptionSTRINGTerminalRuleCall_3_0_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getTestCaseRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"description",
            	    												lv_description_5_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTestCaseAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalLTL.g:939:4: ({...}? => ( ({...}? => (otherlv_6= 'date' ( (lv_date_7_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalLTL.g:939:4: ({...}? => ( ({...}? => (otherlv_6= 'date' ( (lv_date_7_0= RULE_STRING ) ) ) ) ) )
            	    // InternalLTL.g:940:5: {...}? => ( ({...}? => (otherlv_6= 'date' ( (lv_date_7_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTestCaseAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleTestCase", "getUnorderedGroupHelper().canSelect(grammarAccess.getTestCaseAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalLTL.g:940:105: ( ({...}? => (otherlv_6= 'date' ( (lv_date_7_0= RULE_STRING ) ) ) ) )
            	    // InternalLTL.g:941:6: ({...}? => (otherlv_6= 'date' ( (lv_date_7_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTestCaseAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalLTL.g:944:9: ({...}? => (otherlv_6= 'date' ( (lv_date_7_0= RULE_STRING ) ) ) )
            	    // InternalLTL.g:944:10: {...}? => (otherlv_6= 'date' ( (lv_date_7_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTestCase", "true");
            	    }
            	    // InternalLTL.g:944:19: (otherlv_6= 'date' ( (lv_date_7_0= RULE_STRING ) ) )
            	    // InternalLTL.g:944:20: otherlv_6= 'date' ( (lv_date_7_0= RULE_STRING ) )
            	    {
            	    otherlv_6=(Token)match(input,18,FOLLOW_6); 

            	    									newLeafNode(otherlv_6, grammarAccess.getTestCaseAccess().getDateKeyword_3_1_0());
            	    								
            	    // InternalLTL.g:948:9: ( (lv_date_7_0= RULE_STRING ) )
            	    // InternalLTL.g:949:10: (lv_date_7_0= RULE_STRING )
            	    {
            	    // InternalLTL.g:949:10: (lv_date_7_0= RULE_STRING )
            	    // InternalLTL.g:950:11: lv_date_7_0= RULE_STRING
            	    {
            	    lv_date_7_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            	    											newLeafNode(lv_date_7_0, grammarAccess.getTestCaseAccess().getDateSTRINGTerminalRuleCall_3_1_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getTestCaseRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"date",
            	    												lv_date_7_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTestCaseAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalLTL.g:972:4: ({...}? => ( ({...}? => (otherlv_8= 'version' ( (lv_version_9_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalLTL.g:972:4: ({...}? => ( ({...}? => (otherlv_8= 'version' ( (lv_version_9_0= RULE_STRING ) ) ) ) ) )
            	    // InternalLTL.g:973:5: {...}? => ( ({...}? => (otherlv_8= 'version' ( (lv_version_9_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTestCaseAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleTestCase", "getUnorderedGroupHelper().canSelect(grammarAccess.getTestCaseAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalLTL.g:973:105: ( ({...}? => (otherlv_8= 'version' ( (lv_version_9_0= RULE_STRING ) ) ) ) )
            	    // InternalLTL.g:974:6: ({...}? => (otherlv_8= 'version' ( (lv_version_9_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTestCaseAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalLTL.g:977:9: ({...}? => (otherlv_8= 'version' ( (lv_version_9_0= RULE_STRING ) ) ) )
            	    // InternalLTL.g:977:10: {...}? => (otherlv_8= 'version' ( (lv_version_9_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTestCase", "true");
            	    }
            	    // InternalLTL.g:977:19: (otherlv_8= 'version' ( (lv_version_9_0= RULE_STRING ) ) )
            	    // InternalLTL.g:977:20: otherlv_8= 'version' ( (lv_version_9_0= RULE_STRING ) )
            	    {
            	    otherlv_8=(Token)match(input,15,FOLLOW_6); 

            	    									newLeafNode(otherlv_8, grammarAccess.getTestCaseAccess().getVersionKeyword_3_2_0());
            	    								
            	    // InternalLTL.g:981:9: ( (lv_version_9_0= RULE_STRING ) )
            	    // InternalLTL.g:982:10: (lv_version_9_0= RULE_STRING )
            	    {
            	    // InternalLTL.g:982:10: (lv_version_9_0= RULE_STRING )
            	    // InternalLTL.g:983:11: lv_version_9_0= RULE_STRING
            	    {
            	    lv_version_9_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            	    											newLeafNode(lv_version_9_0, grammarAccess.getTestCaseAccess().getVersionSTRINGTerminalRuleCall_3_2_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getTestCaseRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"version",
            	    												lv_version_9_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTestCaseAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalLTL.g:1005:4: ({...}? => ( ({...}? => (otherlv_10= 'precondition' ( (lv_precondition_11_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalLTL.g:1005:4: ({...}? => ( ({...}? => (otherlv_10= 'precondition' ( (lv_precondition_11_0= RULE_STRING ) ) ) ) ) )
            	    // InternalLTL.g:1006:5: {...}? => ( ({...}? => (otherlv_10= 'precondition' ( (lv_precondition_11_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTestCaseAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleTestCase", "getUnorderedGroupHelper().canSelect(grammarAccess.getTestCaseAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalLTL.g:1006:105: ( ({...}? => (otherlv_10= 'precondition' ( (lv_precondition_11_0= RULE_STRING ) ) ) ) )
            	    // InternalLTL.g:1007:6: ({...}? => (otherlv_10= 'precondition' ( (lv_precondition_11_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTestCaseAccess().getUnorderedGroup_3(), 3);
            	    					
            	    // InternalLTL.g:1010:9: ({...}? => (otherlv_10= 'precondition' ( (lv_precondition_11_0= RULE_STRING ) ) ) )
            	    // InternalLTL.g:1010:10: {...}? => (otherlv_10= 'precondition' ( (lv_precondition_11_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTestCase", "true");
            	    }
            	    // InternalLTL.g:1010:19: (otherlv_10= 'precondition' ( (lv_precondition_11_0= RULE_STRING ) ) )
            	    // InternalLTL.g:1010:20: otherlv_10= 'precondition' ( (lv_precondition_11_0= RULE_STRING ) )
            	    {
            	    otherlv_10=(Token)match(input,22,FOLLOW_6); 

            	    									newLeafNode(otherlv_10, grammarAccess.getTestCaseAccess().getPreconditionKeyword_3_3_0());
            	    								
            	    // InternalLTL.g:1014:9: ( (lv_precondition_11_0= RULE_STRING ) )
            	    // InternalLTL.g:1015:10: (lv_precondition_11_0= RULE_STRING )
            	    {
            	    // InternalLTL.g:1015:10: (lv_precondition_11_0= RULE_STRING )
            	    // InternalLTL.g:1016:11: lv_precondition_11_0= RULE_STRING
            	    {
            	    lv_precondition_11_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            	    											newLeafNode(lv_precondition_11_0, grammarAccess.getTestCaseAccess().getPreconditionSTRINGTerminalRuleCall_3_3_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getTestCaseRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"precondition",
            	    												lv_precondition_11_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTestCaseAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalLTL.g:1038:4: ({...}? => ( ({...}? => (otherlv_12= 'method' ( (lv_testingMethod_13_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalLTL.g:1038:4: ({...}? => ( ({...}? => (otherlv_12= 'method' ( (lv_testingMethod_13_0= RULE_STRING ) ) ) ) ) )
            	    // InternalLTL.g:1039:5: {...}? => ( ({...}? => (otherlv_12= 'method' ( (lv_testingMethod_13_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTestCaseAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleTestCase", "getUnorderedGroupHelper().canSelect(grammarAccess.getTestCaseAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // InternalLTL.g:1039:105: ( ({...}? => (otherlv_12= 'method' ( (lv_testingMethod_13_0= RULE_STRING ) ) ) ) )
            	    // InternalLTL.g:1040:6: ({...}? => (otherlv_12= 'method' ( (lv_testingMethod_13_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTestCaseAccess().getUnorderedGroup_3(), 4);
            	    					
            	    // InternalLTL.g:1043:9: ({...}? => (otherlv_12= 'method' ( (lv_testingMethod_13_0= RULE_STRING ) ) ) )
            	    // InternalLTL.g:1043:10: {...}? => (otherlv_12= 'method' ( (lv_testingMethod_13_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTestCase", "true");
            	    }
            	    // InternalLTL.g:1043:19: (otherlv_12= 'method' ( (lv_testingMethod_13_0= RULE_STRING ) ) )
            	    // InternalLTL.g:1043:20: otherlv_12= 'method' ( (lv_testingMethod_13_0= RULE_STRING ) )
            	    {
            	    otherlv_12=(Token)match(input,23,FOLLOW_6); 

            	    									newLeafNode(otherlv_12, grammarAccess.getTestCaseAccess().getMethodKeyword_3_4_0());
            	    								
            	    // InternalLTL.g:1047:9: ( (lv_testingMethod_13_0= RULE_STRING ) )
            	    // InternalLTL.g:1048:10: (lv_testingMethod_13_0= RULE_STRING )
            	    {
            	    // InternalLTL.g:1048:10: (lv_testingMethod_13_0= RULE_STRING )
            	    // InternalLTL.g:1049:11: lv_testingMethod_13_0= RULE_STRING
            	    {
            	    lv_testingMethod_13_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            	    											newLeafNode(lv_testingMethod_13_0, grammarAccess.getTestCaseAccess().getTestingMethodSTRINGTerminalRuleCall_3_4_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getTestCaseRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"testingMethod",
            	    												lv_testingMethod_13_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTestCaseAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalLTL.g:1071:4: ({...}? => ( ({...}? => (otherlv_14= 'expectedResult' ( (lv_expectedResult_15_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalLTL.g:1071:4: ({...}? => ( ({...}? => (otherlv_14= 'expectedResult' ( (lv_expectedResult_15_0= RULE_STRING ) ) ) ) ) )
            	    // InternalLTL.g:1072:5: {...}? => ( ({...}? => (otherlv_14= 'expectedResult' ( (lv_expectedResult_15_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTestCaseAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleTestCase", "getUnorderedGroupHelper().canSelect(grammarAccess.getTestCaseAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // InternalLTL.g:1072:105: ( ({...}? => (otherlv_14= 'expectedResult' ( (lv_expectedResult_15_0= RULE_STRING ) ) ) ) )
            	    // InternalLTL.g:1073:6: ({...}? => (otherlv_14= 'expectedResult' ( (lv_expectedResult_15_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTestCaseAccess().getUnorderedGroup_3(), 5);
            	    					
            	    // InternalLTL.g:1076:9: ({...}? => (otherlv_14= 'expectedResult' ( (lv_expectedResult_15_0= RULE_STRING ) ) ) )
            	    // InternalLTL.g:1076:10: {...}? => (otherlv_14= 'expectedResult' ( (lv_expectedResult_15_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTestCase", "true");
            	    }
            	    // InternalLTL.g:1076:19: (otherlv_14= 'expectedResult' ( (lv_expectedResult_15_0= RULE_STRING ) ) )
            	    // InternalLTL.g:1076:20: otherlv_14= 'expectedResult' ( (lv_expectedResult_15_0= RULE_STRING ) )
            	    {
            	    otherlv_14=(Token)match(input,24,FOLLOW_6); 

            	    									newLeafNode(otherlv_14, grammarAccess.getTestCaseAccess().getExpectedResultKeyword_3_5_0());
            	    								
            	    // InternalLTL.g:1080:9: ( (lv_expectedResult_15_0= RULE_STRING ) )
            	    // InternalLTL.g:1081:10: (lv_expectedResult_15_0= RULE_STRING )
            	    {
            	    // InternalLTL.g:1081:10: (lv_expectedResult_15_0= RULE_STRING )
            	    // InternalLTL.g:1082:11: lv_expectedResult_15_0= RULE_STRING
            	    {
            	    lv_expectedResult_15_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            	    											newLeafNode(lv_expectedResult_15_0, grammarAccess.getTestCaseAccess().getExpectedResultSTRINGTerminalRuleCall_3_5_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getTestCaseRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"expectedResult",
            	    												lv_expectedResult_15_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTestCaseAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalLTL.g:1104:4: ({...}? => ( ({...}? => (otherlv_16= 'actualResult' ( (lv_actualResult_17_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalLTL.g:1104:4: ({...}? => ( ({...}? => (otherlv_16= 'actualResult' ( (lv_actualResult_17_0= RULE_STRING ) ) ) ) ) )
            	    // InternalLTL.g:1105:5: {...}? => ( ({...}? => (otherlv_16= 'actualResult' ( (lv_actualResult_17_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTestCaseAccess().getUnorderedGroup_3(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleTestCase", "getUnorderedGroupHelper().canSelect(grammarAccess.getTestCaseAccess().getUnorderedGroup_3(), 6)");
            	    }
            	    // InternalLTL.g:1105:105: ( ({...}? => (otherlv_16= 'actualResult' ( (lv_actualResult_17_0= RULE_STRING ) ) ) ) )
            	    // InternalLTL.g:1106:6: ({...}? => (otherlv_16= 'actualResult' ( (lv_actualResult_17_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTestCaseAccess().getUnorderedGroup_3(), 6);
            	    					
            	    // InternalLTL.g:1109:9: ({...}? => (otherlv_16= 'actualResult' ( (lv_actualResult_17_0= RULE_STRING ) ) ) )
            	    // InternalLTL.g:1109:10: {...}? => (otherlv_16= 'actualResult' ( (lv_actualResult_17_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTestCase", "true");
            	    }
            	    // InternalLTL.g:1109:19: (otherlv_16= 'actualResult' ( (lv_actualResult_17_0= RULE_STRING ) ) )
            	    // InternalLTL.g:1109:20: otherlv_16= 'actualResult' ( (lv_actualResult_17_0= RULE_STRING ) )
            	    {
            	    otherlv_16=(Token)match(input,25,FOLLOW_6); 

            	    									newLeafNode(otherlv_16, grammarAccess.getTestCaseAccess().getActualResultKeyword_3_6_0());
            	    								
            	    // InternalLTL.g:1113:9: ( (lv_actualResult_17_0= RULE_STRING ) )
            	    // InternalLTL.g:1114:10: (lv_actualResult_17_0= RULE_STRING )
            	    {
            	    // InternalLTL.g:1114:10: (lv_actualResult_17_0= RULE_STRING )
            	    // InternalLTL.g:1115:11: lv_actualResult_17_0= RULE_STRING
            	    {
            	    lv_actualResult_17_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            	    											newLeafNode(lv_actualResult_17_0, grammarAccess.getTestCaseAccess().getActualResultSTRINGTerminalRuleCall_3_6_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getTestCaseRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"actualResult",
            	    												lv_actualResult_17_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTestCaseAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalLTL.g:1137:4: ({...}? => ( ({...}? => (otherlv_18= 'passed' ( (lv_passed_19_0= ruleBoolean ) ) ) ) ) )
            	    {
            	    // InternalLTL.g:1137:4: ({...}? => ( ({...}? => (otherlv_18= 'passed' ( (lv_passed_19_0= ruleBoolean ) ) ) ) ) )
            	    // InternalLTL.g:1138:5: {...}? => ( ({...}? => (otherlv_18= 'passed' ( (lv_passed_19_0= ruleBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTestCaseAccess().getUnorderedGroup_3(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleTestCase", "getUnorderedGroupHelper().canSelect(grammarAccess.getTestCaseAccess().getUnorderedGroup_3(), 7)");
            	    }
            	    // InternalLTL.g:1138:105: ( ({...}? => (otherlv_18= 'passed' ( (lv_passed_19_0= ruleBoolean ) ) ) ) )
            	    // InternalLTL.g:1139:6: ({...}? => (otherlv_18= 'passed' ( (lv_passed_19_0= ruleBoolean ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTestCaseAccess().getUnorderedGroup_3(), 7);
            	    					
            	    // InternalLTL.g:1142:9: ({...}? => (otherlv_18= 'passed' ( (lv_passed_19_0= ruleBoolean ) ) ) )
            	    // InternalLTL.g:1142:10: {...}? => (otherlv_18= 'passed' ( (lv_passed_19_0= ruleBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTestCase", "true");
            	    }
            	    // InternalLTL.g:1142:19: (otherlv_18= 'passed' ( (lv_passed_19_0= ruleBoolean ) ) )
            	    // InternalLTL.g:1142:20: otherlv_18= 'passed' ( (lv_passed_19_0= ruleBoolean ) )
            	    {
            	    otherlv_18=(Token)match(input,26,FOLLOW_14); 

            	    									newLeafNode(otherlv_18, grammarAccess.getTestCaseAccess().getPassedKeyword_3_7_0());
            	    								
            	    // InternalLTL.g:1146:9: ( (lv_passed_19_0= ruleBoolean ) )
            	    // InternalLTL.g:1147:10: (lv_passed_19_0= ruleBoolean )
            	    {
            	    // InternalLTL.g:1147:10: (lv_passed_19_0= ruleBoolean )
            	    // InternalLTL.g:1148:11: lv_passed_19_0= ruleBoolean
            	    {

            	    											newCompositeNode(grammarAccess.getTestCaseAccess().getPassedBooleanParserRuleCall_3_7_1_0());
            	    										
            	    pushFollow(FOLLOW_13);
            	    lv_passed_19_0=ruleBoolean();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getTestCaseRule());
            	    											}
            	    											set(
            	    												current,
            	    												"passed",
            	    												lv_passed_19_0,
            	    												"com.leonardo.ltl.LTL.Boolean");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTestCaseAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // InternalLTL.g:1171:4: ({...}? => ( ({...}? => (otherlv_20= 'incident' ( (lv_incident_21_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalLTL.g:1171:4: ({...}? => ( ({...}? => (otherlv_20= 'incident' ( (lv_incident_21_0= RULE_STRING ) ) ) ) ) )
            	    // InternalLTL.g:1172:5: {...}? => ( ({...}? => (otherlv_20= 'incident' ( (lv_incident_21_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTestCaseAccess().getUnorderedGroup_3(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleTestCase", "getUnorderedGroupHelper().canSelect(grammarAccess.getTestCaseAccess().getUnorderedGroup_3(), 8)");
            	    }
            	    // InternalLTL.g:1172:105: ( ({...}? => (otherlv_20= 'incident' ( (lv_incident_21_0= RULE_STRING ) ) ) ) )
            	    // InternalLTL.g:1173:6: ({...}? => (otherlv_20= 'incident' ( (lv_incident_21_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTestCaseAccess().getUnorderedGroup_3(), 8);
            	    					
            	    // InternalLTL.g:1176:9: ({...}? => (otherlv_20= 'incident' ( (lv_incident_21_0= RULE_STRING ) ) ) )
            	    // InternalLTL.g:1176:10: {...}? => (otherlv_20= 'incident' ( (lv_incident_21_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTestCase", "true");
            	    }
            	    // InternalLTL.g:1176:19: (otherlv_20= 'incident' ( (lv_incident_21_0= RULE_STRING ) ) )
            	    // InternalLTL.g:1176:20: otherlv_20= 'incident' ( (lv_incident_21_0= RULE_STRING ) )
            	    {
            	    otherlv_20=(Token)match(input,27,FOLLOW_6); 

            	    									newLeafNode(otherlv_20, grammarAccess.getTestCaseAccess().getIncidentKeyword_3_8_0());
            	    								
            	    // InternalLTL.g:1180:9: ( (lv_incident_21_0= RULE_STRING ) )
            	    // InternalLTL.g:1181:10: (lv_incident_21_0= RULE_STRING )
            	    {
            	    // InternalLTL.g:1181:10: (lv_incident_21_0= RULE_STRING )
            	    // InternalLTL.g:1182:11: lv_incident_21_0= RULE_STRING
            	    {
            	    lv_incident_21_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            	    											newLeafNode(lv_incident_21_0, grammarAccess.getTestCaseAccess().getIncidentSTRINGTerminalRuleCall_3_8_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getTestCaseRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"incident",
            	    												lv_incident_21_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTestCaseAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // InternalLTL.g:1204:4: ({...}? => ( ({...}? => (otherlv_22= 'postcondition' ( (lv_postcondition_23_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalLTL.g:1204:4: ({...}? => ( ({...}? => (otherlv_22= 'postcondition' ( (lv_postcondition_23_0= RULE_STRING ) ) ) ) ) )
            	    // InternalLTL.g:1205:5: {...}? => ( ({...}? => (otherlv_22= 'postcondition' ( (lv_postcondition_23_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTestCaseAccess().getUnorderedGroup_3(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleTestCase", "getUnorderedGroupHelper().canSelect(grammarAccess.getTestCaseAccess().getUnorderedGroup_3(), 9)");
            	    }
            	    // InternalLTL.g:1205:105: ( ({...}? => (otherlv_22= 'postcondition' ( (lv_postcondition_23_0= RULE_STRING ) ) ) ) )
            	    // InternalLTL.g:1206:6: ({...}? => (otherlv_22= 'postcondition' ( (lv_postcondition_23_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTestCaseAccess().getUnorderedGroup_3(), 9);
            	    					
            	    // InternalLTL.g:1209:9: ({...}? => (otherlv_22= 'postcondition' ( (lv_postcondition_23_0= RULE_STRING ) ) ) )
            	    // InternalLTL.g:1209:10: {...}? => (otherlv_22= 'postcondition' ( (lv_postcondition_23_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTestCase", "true");
            	    }
            	    // InternalLTL.g:1209:19: (otherlv_22= 'postcondition' ( (lv_postcondition_23_0= RULE_STRING ) ) )
            	    // InternalLTL.g:1209:20: otherlv_22= 'postcondition' ( (lv_postcondition_23_0= RULE_STRING ) )
            	    {
            	    otherlv_22=(Token)match(input,28,FOLLOW_6); 

            	    									newLeafNode(otherlv_22, grammarAccess.getTestCaseAccess().getPostconditionKeyword_3_9_0());
            	    								
            	    // InternalLTL.g:1213:9: ( (lv_postcondition_23_0= RULE_STRING ) )
            	    // InternalLTL.g:1214:10: (lv_postcondition_23_0= RULE_STRING )
            	    {
            	    // InternalLTL.g:1214:10: (lv_postcondition_23_0= RULE_STRING )
            	    // InternalLTL.g:1215:11: lv_postcondition_23_0= RULE_STRING
            	    {
            	    lv_postcondition_23_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            	    											newLeafNode(lv_postcondition_23_0, grammarAccess.getTestCaseAccess().getPostconditionSTRINGTerminalRuleCall_3_9_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getTestCaseRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"postcondition",
            	    												lv_postcondition_23_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTestCaseAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 11 :
            	    // InternalLTL.g:1237:4: ({...}? => ( ({...}? => (otherlv_24= 'inputs' ( (lv_inputs_25_0= RULE_STRING ) ) (otherlv_26= ',' ( (lv_inputs_27_0= RULE_STRING ) ) )* ) ) ) )
            	    {
            	    // InternalLTL.g:1237:4: ({...}? => ( ({...}? => (otherlv_24= 'inputs' ( (lv_inputs_25_0= RULE_STRING ) ) (otherlv_26= ',' ( (lv_inputs_27_0= RULE_STRING ) ) )* ) ) ) )
            	    // InternalLTL.g:1238:5: {...}? => ( ({...}? => (otherlv_24= 'inputs' ( (lv_inputs_25_0= RULE_STRING ) ) (otherlv_26= ',' ( (lv_inputs_27_0= RULE_STRING ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTestCaseAccess().getUnorderedGroup_3(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleTestCase", "getUnorderedGroupHelper().canSelect(grammarAccess.getTestCaseAccess().getUnorderedGroup_3(), 10)");
            	    }
            	    // InternalLTL.g:1238:106: ( ({...}? => (otherlv_24= 'inputs' ( (lv_inputs_25_0= RULE_STRING ) ) (otherlv_26= ',' ( (lv_inputs_27_0= RULE_STRING ) ) )* ) ) )
            	    // InternalLTL.g:1239:6: ({...}? => (otherlv_24= 'inputs' ( (lv_inputs_25_0= RULE_STRING ) ) (otherlv_26= ',' ( (lv_inputs_27_0= RULE_STRING ) ) )* ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTestCaseAccess().getUnorderedGroup_3(), 10);
            	    					
            	    // InternalLTL.g:1242:9: ({...}? => (otherlv_24= 'inputs' ( (lv_inputs_25_0= RULE_STRING ) ) (otherlv_26= ',' ( (lv_inputs_27_0= RULE_STRING ) ) )* ) )
            	    // InternalLTL.g:1242:10: {...}? => (otherlv_24= 'inputs' ( (lv_inputs_25_0= RULE_STRING ) ) (otherlv_26= ',' ( (lv_inputs_27_0= RULE_STRING ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTestCase", "true");
            	    }
            	    // InternalLTL.g:1242:19: (otherlv_24= 'inputs' ( (lv_inputs_25_0= RULE_STRING ) ) (otherlv_26= ',' ( (lv_inputs_27_0= RULE_STRING ) ) )* )
            	    // InternalLTL.g:1242:20: otherlv_24= 'inputs' ( (lv_inputs_25_0= RULE_STRING ) ) (otherlv_26= ',' ( (lv_inputs_27_0= RULE_STRING ) ) )*
            	    {
            	    otherlv_24=(Token)match(input,29,FOLLOW_6); 

            	    									newLeafNode(otherlv_24, grammarAccess.getTestCaseAccess().getInputsKeyword_3_10_0());
            	    								
            	    // InternalLTL.g:1246:9: ( (lv_inputs_25_0= RULE_STRING ) )
            	    // InternalLTL.g:1247:10: (lv_inputs_25_0= RULE_STRING )
            	    {
            	    // InternalLTL.g:1247:10: (lv_inputs_25_0= RULE_STRING )
            	    // InternalLTL.g:1248:11: lv_inputs_25_0= RULE_STRING
            	    {
            	    lv_inputs_25_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            	    											newLeafNode(lv_inputs_25_0, grammarAccess.getTestCaseAccess().getInputsSTRINGTerminalRuleCall_3_10_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getTestCaseRule());
            	    											}
            	    											addWithLastConsumed(
            	    												current,
            	    												"inputs",
            	    												lv_inputs_25_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }

            	    // InternalLTL.g:1264:9: (otherlv_26= ',' ( (lv_inputs_27_0= RULE_STRING ) ) )*
            	    loop11:
            	    do {
            	        int alt11=2;
            	        int LA11_0 = input.LA(1);

            	        if ( (LA11_0==30) ) {
            	            alt11=1;
            	        }


            	        switch (alt11) {
            	    	case 1 :
            	    	    // InternalLTL.g:1265:10: otherlv_26= ',' ( (lv_inputs_27_0= RULE_STRING ) )
            	    	    {
            	    	    otherlv_26=(Token)match(input,30,FOLLOW_6); 

            	    	    										newLeafNode(otherlv_26, grammarAccess.getTestCaseAccess().getCommaKeyword_3_10_2_0());
            	    	    									
            	    	    // InternalLTL.g:1269:10: ( (lv_inputs_27_0= RULE_STRING ) )
            	    	    // InternalLTL.g:1270:11: (lv_inputs_27_0= RULE_STRING )
            	    	    {
            	    	    // InternalLTL.g:1270:11: (lv_inputs_27_0= RULE_STRING )
            	    	    // InternalLTL.g:1271:12: lv_inputs_27_0= RULE_STRING
            	    	    {
            	    	    lv_inputs_27_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            	    	    												newLeafNode(lv_inputs_27_0, grammarAccess.getTestCaseAccess().getInputsSTRINGTerminalRuleCall_3_10_2_1_0());
            	    	    											

            	    	    												if (current==null) {
            	    	    													current = createModelElement(grammarAccess.getTestCaseRule());
            	    	    												}
            	    	    												addWithLastConsumed(
            	    	    													current,
            	    	    													"inputs",
            	    	    													lv_inputs_27_0,
            	    	    													"org.eclipse.xtext.common.Terminals.STRING");
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop11;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTestCaseAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 12 :
            	    // InternalLTL.g:1294:4: ({...}? => ( ({...}? => (otherlv_28= 'entities' ( ( ruleQualifiedName ) )* otherlv_30= 'end' ) ) ) )
            	    {
            	    // InternalLTL.g:1294:4: ({...}? => ( ({...}? => (otherlv_28= 'entities' ( ( ruleQualifiedName ) )* otherlv_30= 'end' ) ) ) )
            	    // InternalLTL.g:1295:5: {...}? => ( ({...}? => (otherlv_28= 'entities' ( ( ruleQualifiedName ) )* otherlv_30= 'end' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTestCaseAccess().getUnorderedGroup_3(), 11) ) {
            	        throw new FailedPredicateException(input, "ruleTestCase", "getUnorderedGroupHelper().canSelect(grammarAccess.getTestCaseAccess().getUnorderedGroup_3(), 11)");
            	    }
            	    // InternalLTL.g:1295:106: ( ({...}? => (otherlv_28= 'entities' ( ( ruleQualifiedName ) )* otherlv_30= 'end' ) ) )
            	    // InternalLTL.g:1296:6: ({...}? => (otherlv_28= 'entities' ( ( ruleQualifiedName ) )* otherlv_30= 'end' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTestCaseAccess().getUnorderedGroup_3(), 11);
            	    					
            	    // InternalLTL.g:1299:9: ({...}? => (otherlv_28= 'entities' ( ( ruleQualifiedName ) )* otherlv_30= 'end' ) )
            	    // InternalLTL.g:1299:10: {...}? => (otherlv_28= 'entities' ( ( ruleQualifiedName ) )* otherlv_30= 'end' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTestCase", "true");
            	    }
            	    // InternalLTL.g:1299:19: (otherlv_28= 'entities' ( ( ruleQualifiedName ) )* otherlv_30= 'end' )
            	    // InternalLTL.g:1299:20: otherlv_28= 'entities' ( ( ruleQualifiedName ) )* otherlv_30= 'end'
            	    {
            	    otherlv_28=(Token)match(input,20,FOLLOW_11); 

            	    									newLeafNode(otherlv_28, grammarAccess.getTestCaseAccess().getEntitiesKeyword_3_11_0());
            	    								
            	    // InternalLTL.g:1303:9: ( ( ruleQualifiedName ) )*
            	    loop12:
            	    do {
            	        int alt12=2;
            	        int LA12_0 = input.LA(1);

            	        if ( (LA12_0==RULE_ID) ) {
            	            alt12=1;
            	        }


            	        switch (alt12) {
            	    	case 1 :
            	    	    // InternalLTL.g:1304:10: ( ruleQualifiedName )
            	    	    {
            	    	    // InternalLTL.g:1304:10: ( ruleQualifiedName )
            	    	    // InternalLTL.g:1305:11: ruleQualifiedName
            	    	    {

            	    	    											if (current==null) {
            	    	    												current = createModelElement(grammarAccess.getTestCaseRule());
            	    	    											}
            	    	    										

            	    	    											newCompositeNode(grammarAccess.getTestCaseAccess().getTestableEntitiesTestableEntityCrossReference_3_11_1_0());
            	    	    										
            	    	    pushFollow(FOLLOW_11);
            	    	    ruleQualifiedName();

            	    	    state._fsp--;


            	    	    											afterParserOrEnumRuleCall();
            	    	    										

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop12;
            	        }
            	    } while (true);

            	    otherlv_30=(Token)match(input,13,FOLLOW_13); 

            	    									newLeafNode(otherlv_30, grammarAccess.getTestCaseAccess().getEndKeyword_3_11_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTestCaseAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getTestCaseAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleTestCase", "getUnorderedGroupHelper().canLeave(grammarAccess.getTestCaseAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getTestCaseAccess().getUnorderedGroup_3());
            				

            }

            otherlv_31=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_31, grammarAccess.getTestCaseAccess().getEndKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTestCase"


    // $ANTLR start "entryRuleTestExecution"
    // InternalLTL.g:1345:1: entryRuleTestExecution returns [EObject current=null] : iv_ruleTestExecution= ruleTestExecution EOF ;
    public final EObject entryRuleTestExecution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestExecution = null;


        try {
            // InternalLTL.g:1345:54: (iv_ruleTestExecution= ruleTestExecution EOF )
            // InternalLTL.g:1346:2: iv_ruleTestExecution= ruleTestExecution EOF
            {
             newCompositeNode(grammarAccess.getTestExecutionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTestExecution=ruleTestExecution();

            state._fsp--;

             current =iv_ruleTestExecution; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTestExecution"


    // $ANTLR start "ruleTestExecution"
    // InternalLTL.g:1352:1: ruleTestExecution returns [EObject current=null] : (otherlv_0= 'test' ( (lv_name_1_0= ruleQualifiedName ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'date' ( (lv_date_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'specification' ( ( ruleQualifiedName ) )* otherlv_9= 'end' ) ) ) ) )+ {...}?) ) ) otherlv_10= 'end' ) ;
    public final EObject ruleTestExecution() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token lv_date_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalLTL.g:1358:2: ( (otherlv_0= 'test' ( (lv_name_1_0= ruleQualifiedName ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'date' ( (lv_date_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'specification' ( ( ruleQualifiedName ) )* otherlv_9= 'end' ) ) ) ) )+ {...}?) ) ) otherlv_10= 'end' ) )
            // InternalLTL.g:1359:2: (otherlv_0= 'test' ( (lv_name_1_0= ruleQualifiedName ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'date' ( (lv_date_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'specification' ( ( ruleQualifiedName ) )* otherlv_9= 'end' ) ) ) ) )+ {...}?) ) ) otherlv_10= 'end' )
            {
            // InternalLTL.g:1359:2: (otherlv_0= 'test' ( (lv_name_1_0= ruleQualifiedName ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'date' ( (lv_date_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'specification' ( ( ruleQualifiedName ) )* otherlv_9= 'end' ) ) ) ) )+ {...}?) ) ) otherlv_10= 'end' )
            // InternalLTL.g:1360:3: otherlv_0= 'test' ( (lv_name_1_0= ruleQualifiedName ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'date' ( (lv_date_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'specification' ( ( ruleQualifiedName ) )* otherlv_9= 'end' ) ) ) ) )+ {...}?) ) ) otherlv_10= 'end'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTestExecutionAccess().getTestKeyword_0());
            		
            // InternalLTL.g:1364:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalLTL.g:1365:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalLTL.g:1365:4: (lv_name_1_0= ruleQualifiedName )
            // InternalLTL.g:1366:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getTestExecutionAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTestExecutionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"com.leonardo.ltl.LTL.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLTL.g:1383:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'date' ( (lv_date_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'specification' ( ( ruleQualifiedName ) )* otherlv_9= 'end' ) ) ) ) )+ {...}?) ) )
            // InternalLTL.g:1384:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'date' ( (lv_date_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'specification' ( ( ruleQualifiedName ) )* otherlv_9= 'end' ) ) ) ) )+ {...}?) )
            {
            // InternalLTL.g:1384:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'date' ( (lv_date_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'specification' ( ( ruleQualifiedName ) )* otherlv_9= 'end' ) ) ) ) )+ {...}?) )
            // InternalLTL.g:1385:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'date' ( (lv_date_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'specification' ( ( ruleQualifiedName ) )* otherlv_9= 'end' ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getTestExecutionAccess().getUnorderedGroup_2());
            				
            // InternalLTL.g:1388:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'date' ( (lv_date_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'specification' ( ( ruleQualifiedName ) )* otherlv_9= 'end' ) ) ) ) )+ {...}?)
            // InternalLTL.g:1389:6: ( ({...}? => ( ({...}? => (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'date' ( (lv_date_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'specification' ( ( ruleQualifiedName ) )* otherlv_9= 'end' ) ) ) ) )+ {...}?
            {
            // InternalLTL.g:1389:6: ( ({...}? => ( ({...}? => (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'date' ( (lv_date_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'specification' ( ( ruleQualifiedName ) )* otherlv_9= 'end' ) ) ) ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=4;
                int LA15_0 = input.LA(1);

                if ( LA15_0 == 12 && getUnorderedGroupHelper().canSelect(grammarAccess.getTestExecutionAccess().getUnorderedGroup_2(), 0) ) {
                    alt15=1;
                }
                else if ( LA15_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getTestExecutionAccess().getUnorderedGroup_2(), 1) ) {
                    alt15=2;
                }
                else if ( LA15_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getTestExecutionAccess().getUnorderedGroup_2(), 2) ) {
                    alt15=3;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalLTL.g:1390:4: ({...}? => ( ({...}? => (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalLTL.g:1390:4: ({...}? => ( ({...}? => (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) )
            	    // InternalLTL.g:1391:5: {...}? => ( ({...}? => (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTestExecutionAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleTestExecution", "getUnorderedGroupHelper().canSelect(grammarAccess.getTestExecutionAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalLTL.g:1391:110: ( ({...}? => (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ) ) )
            	    // InternalLTL.g:1392:6: ({...}? => (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTestExecutionAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalLTL.g:1395:9: ({...}? => (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) ) )
            	    // InternalLTL.g:1395:10: {...}? => (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTestExecution", "true");
            	    }
            	    // InternalLTL.g:1395:19: (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) )
            	    // InternalLTL.g:1395:20: otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,12,FOLLOW_6); 

            	    									newLeafNode(otherlv_3, grammarAccess.getTestExecutionAccess().getDescriptionKeyword_2_0_0());
            	    								
            	    // InternalLTL.g:1399:9: ( (lv_description_4_0= RULE_STRING ) )
            	    // InternalLTL.g:1400:10: (lv_description_4_0= RULE_STRING )
            	    {
            	    // InternalLTL.g:1400:10: (lv_description_4_0= RULE_STRING )
            	    // InternalLTL.g:1401:11: lv_description_4_0= RULE_STRING
            	    {
            	    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            	    											newLeafNode(lv_description_4_0, grammarAccess.getTestExecutionAccess().getDescriptionSTRINGTerminalRuleCall_2_0_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getTestExecutionRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"description",
            	    												lv_description_4_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTestExecutionAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalLTL.g:1423:4: ({...}? => ( ({...}? => (otherlv_5= 'date' ( (lv_date_6_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalLTL.g:1423:4: ({...}? => ( ({...}? => (otherlv_5= 'date' ( (lv_date_6_0= RULE_STRING ) ) ) ) ) )
            	    // InternalLTL.g:1424:5: {...}? => ( ({...}? => (otherlv_5= 'date' ( (lv_date_6_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTestExecutionAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleTestExecution", "getUnorderedGroupHelper().canSelect(grammarAccess.getTestExecutionAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalLTL.g:1424:110: ( ({...}? => (otherlv_5= 'date' ( (lv_date_6_0= RULE_STRING ) ) ) ) )
            	    // InternalLTL.g:1425:6: ({...}? => (otherlv_5= 'date' ( (lv_date_6_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTestExecutionAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalLTL.g:1428:9: ({...}? => (otherlv_5= 'date' ( (lv_date_6_0= RULE_STRING ) ) ) )
            	    // InternalLTL.g:1428:10: {...}? => (otherlv_5= 'date' ( (lv_date_6_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTestExecution", "true");
            	    }
            	    // InternalLTL.g:1428:19: (otherlv_5= 'date' ( (lv_date_6_0= RULE_STRING ) ) )
            	    // InternalLTL.g:1428:20: otherlv_5= 'date' ( (lv_date_6_0= RULE_STRING ) )
            	    {
            	    otherlv_5=(Token)match(input,18,FOLLOW_6); 

            	    									newLeafNode(otherlv_5, grammarAccess.getTestExecutionAccess().getDateKeyword_2_1_0());
            	    								
            	    // InternalLTL.g:1432:9: ( (lv_date_6_0= RULE_STRING ) )
            	    // InternalLTL.g:1433:10: (lv_date_6_0= RULE_STRING )
            	    {
            	    // InternalLTL.g:1433:10: (lv_date_6_0= RULE_STRING )
            	    // InternalLTL.g:1434:11: lv_date_6_0= RULE_STRING
            	    {
            	    lv_date_6_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            	    											newLeafNode(lv_date_6_0, grammarAccess.getTestExecutionAccess().getDateSTRINGTerminalRuleCall_2_1_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getTestExecutionRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"date",
            	    												lv_date_6_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTestExecutionAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalLTL.g:1456:4: ({...}? => ( ({...}? => (otherlv_7= 'specification' ( ( ruleQualifiedName ) )* otherlv_9= 'end' ) ) ) )
            	    {
            	    // InternalLTL.g:1456:4: ({...}? => ( ({...}? => (otherlv_7= 'specification' ( ( ruleQualifiedName ) )* otherlv_9= 'end' ) ) ) )
            	    // InternalLTL.g:1457:5: {...}? => ( ({...}? => (otherlv_7= 'specification' ( ( ruleQualifiedName ) )* otherlv_9= 'end' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTestExecutionAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleTestExecution", "getUnorderedGroupHelper().canSelect(grammarAccess.getTestExecutionAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalLTL.g:1457:110: ( ({...}? => (otherlv_7= 'specification' ( ( ruleQualifiedName ) )* otherlv_9= 'end' ) ) )
            	    // InternalLTL.g:1458:6: ({...}? => (otherlv_7= 'specification' ( ( ruleQualifiedName ) )* otherlv_9= 'end' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTestExecutionAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalLTL.g:1461:9: ({...}? => (otherlv_7= 'specification' ( ( ruleQualifiedName ) )* otherlv_9= 'end' ) )
            	    // InternalLTL.g:1461:10: {...}? => (otherlv_7= 'specification' ( ( ruleQualifiedName ) )* otherlv_9= 'end' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTestExecution", "true");
            	    }
            	    // InternalLTL.g:1461:19: (otherlv_7= 'specification' ( ( ruleQualifiedName ) )* otherlv_9= 'end' )
            	    // InternalLTL.g:1461:20: otherlv_7= 'specification' ( ( ruleQualifiedName ) )* otherlv_9= 'end'
            	    {
            	    otherlv_7=(Token)match(input,32,FOLLOW_11); 

            	    									newLeafNode(otherlv_7, grammarAccess.getTestExecutionAccess().getSpecificationKeyword_2_2_0());
            	    								
            	    // InternalLTL.g:1465:9: ( ( ruleQualifiedName ) )*
            	    loop14:
            	    do {
            	        int alt14=2;
            	        int LA14_0 = input.LA(1);

            	        if ( (LA14_0==RULE_ID) ) {
            	            alt14=1;
            	        }


            	        switch (alt14) {
            	    	case 1 :
            	    	    // InternalLTL.g:1466:10: ( ruleQualifiedName )
            	    	    {
            	    	    // InternalLTL.g:1466:10: ( ruleQualifiedName )
            	    	    // InternalLTL.g:1467:11: ruleQualifiedName
            	    	    {

            	    	    											if (current==null) {
            	    	    												current = createModelElement(grammarAccess.getTestExecutionRule());
            	    	    											}
            	    	    										

            	    	    											newCompositeNode(grammarAccess.getTestExecutionAccess().getTestSpecificationsTestSpecificationCrossReference_2_2_1_0());
            	    	    										
            	    	    pushFollow(FOLLOW_11);
            	    	    ruleQualifiedName();

            	    	    state._fsp--;


            	    	    											afterParserOrEnumRuleCall();
            	    	    										

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop14;
            	        }
            	    } while (true);

            	    otherlv_9=(Token)match(input,13,FOLLOW_17); 

            	    									newLeafNode(otherlv_9, grammarAccess.getTestExecutionAccess().getEndKeyword_2_2_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTestExecutionAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getTestExecutionAccess().getUnorderedGroup_2()) ) {
                throw new FailedPredicateException(input, "ruleTestExecution", "getUnorderedGroupHelper().canLeave(grammarAccess.getTestExecutionAccess().getUnorderedGroup_2())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getTestExecutionAccess().getUnorderedGroup_2());
            				

            }

            otherlv_10=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getTestExecutionAccess().getEndKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTestExecution"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalLTL.g:1507:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalLTL.g:1509:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalLTL.g:1510:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalLTL.g:1519:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalLTL.g:1526:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalLTL.g:1527:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalLTL.g:1527:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalLTL.g:1528:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalLTL.g:1535:3: (kw= '.' this_ID_2= RULE_ID )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==33) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalLTL.g:1536:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,33,FOLLOW_4); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_18); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleBoolean"
    // InternalLTL.g:1556:1: entryRuleBoolean returns [String current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final String entryRuleBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolean = null;


        try {
            // InternalLTL.g:1556:47: (iv_ruleBoolean= ruleBoolean EOF )
            // InternalLTL.g:1557:2: iv_ruleBoolean= ruleBoolean EOF
            {
             newCompositeNode(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoolean=ruleBoolean();

            state._fsp--;

             current =iv_ruleBoolean.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // InternalLTL.g:1563:1: ruleBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLTL.g:1569:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalLTL.g:1570:2: (kw= 'true' | kw= 'false' )
            {
            // InternalLTL.g:1570:2: (kw= 'true' | kw= 'false' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==34) ) {
                alt17=1;
            }
            else if ( (LA17_0==35) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalLTL.g:1571:3: kw= 'true'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalLTL.g:1577:3: kw= 'false'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBooleanAccess().getFalseKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoolean"

    // Delegated rules


    protected DFA13 dfa13 = new DFA13(this);
    static final String dfa_1s = "\16\uffff";
    static final String dfa_2s = "\1\14\15\uffff";
    static final String dfa_3s = "\1\35\15\uffff";
    static final String dfa_4s = "\1\uffff\1\15\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14";
    static final String dfa_5s = "\1\0\15\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\1\1\1\uffff\1\4\2\uffff\1\3\1\uffff\1\15\1\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()+ loopback of 905:6: ( ({...}? => ( ({...}? => (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'date' ( (lv_date_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' ( (lv_version_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'precondition' ( (lv_precondition_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'method' ( (lv_testingMethod_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'expectedResult' ( (lv_expectedResult_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'actualResult' ( (lv_actualResult_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'passed' ( (lv_passed_19_0= ruleBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'incident' ( (lv_incident_21_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'postcondition' ( (lv_postcondition_23_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'inputs' ( (lv_inputs_25_0= RULE_STRING ) ) (otherlv_26= ',' ( (lv_inputs_27_0= RULE_STRING ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'entities' ( ( ruleQualifiedName ) )* otherlv_30= 'end' ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_0 = input.LA(1);

                         
                        int index13_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA13_0==13) ) {s = 1;}

                        else if ( LA13_0 == 12 && getUnorderedGroupHelper().canSelect(grammarAccess.getTestCaseAccess().getUnorderedGroup_3(), 0) ) {s = 2;}

                        else if ( LA13_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getTestCaseAccess().getUnorderedGroup_3(), 1) ) {s = 3;}

                        else if ( LA13_0 == 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getTestCaseAccess().getUnorderedGroup_3(), 2) ) {s = 4;}

                        else if ( LA13_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getTestCaseAccess().getUnorderedGroup_3(), 3) ) {s = 5;}

                        else if ( LA13_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getTestCaseAccess().getUnorderedGroup_3(), 4) ) {s = 6;}

                        else if ( LA13_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getTestCaseAccess().getUnorderedGroup_3(), 5) ) {s = 7;}

                        else if ( LA13_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getTestCaseAccess().getUnorderedGroup_3(), 6) ) {s = 8;}

                        else if ( LA13_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getTestCaseAccess().getUnorderedGroup_3(), 7) ) {s = 9;}

                        else if ( LA13_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getTestCaseAccess().getUnorderedGroup_3(), 8) ) {s = 10;}

                        else if ( LA13_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getTestCaseAccess().getUnorderedGroup_3(), 9) ) {s = 11;}

                        else if ( LA13_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getTestCaseAccess().getUnorderedGroup_3(), 10) ) {s = 12;}

                        else if ( LA13_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getTestCaseAccess().getUnorderedGroup_3(), 11) ) {s = 13;}

                         
                        input.seek(index13_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000080237000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000B000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000F000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000001C9000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000001CB000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000003FD49000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000003FD4B000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000007FD4B000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000100041000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000100043000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000200000002L});

}
