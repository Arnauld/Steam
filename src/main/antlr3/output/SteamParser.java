// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g 2011-04-29 17:51:46

  package steam.parser;
  import steam.lang.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;

import org.antlr.runtime.tree.*;

public class SteamParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "VARIABLE", "Identifier", "StringLiteral", "IntegerLiteral", "HexLiteral", "DecimalLiteral", "DecimalExpLiteral", "Digit", "ComparisonOp", "IdentifierFirstChar", "WS", "NEWLINE", "':'", "'require'", "';'", "'module'", "'public'", "'var'", "'val'", "'='", "'<'", "'>'", "'~'", "'+'", "'-'", "'*'", "'/'", "'a'", "'z'", "'A'", "'Z'", "'_'", "'0'", "'9'", "'def'", "'('", "')'", "','", "'match'", "'{'", "'}'", "'case'", "'=>'"
    };
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int Identifier=5;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int HexLiteral=8;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int ComparisonOp=12;
    public static final int DecimalExpLiteral=10;
    public static final int Digit=11;
    public static final int DecimalLiteral=9;
    public static final int IdentifierFirstChar=13;
    public static final int StringLiteral=6;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int WS=14;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int NEWLINE=15;
    public static final int T__35=35;
    public static final int VARIABLE=4;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int IntegerLiteral=7;

    // delegates
    // delegators

    public static final String[] ruleNames = new String[] {
        "invalidRule", "defInvocationParameters", "matchExpr", "matchCaseExpr", 
        "stmtBlock", "requireDecl", "qualifiedIdentifier", "expr", "defInvocation", 
        "stmt", "defArgument", "moduleDecl", "defArgumentList", "variableDecl", 
        "defIdentifier", "compilationUnit", "literal", "defDecl"
    };
     
        public int ruleLevel = 0;
        public int getRuleLevel() { return ruleLevel; }
        public void incRuleLevel() { ruleLevel++; }
        public void decRuleLevel() { ruleLevel--; }
        public SteamParser(TokenStream input) {
            this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
        }
        public SteamParser(TokenStream input, int port, RecognizerSharedState state) {
            super(input, state);
            DebugEventSocketProxy proxy =
                new DebugEventSocketProxy(this,port,adaptor);
            setDebugListener(proxy);
            setTokenStream(new DebugTokenStream(input,proxy));
            try {
                proxy.handshake();
            }
            catch (IOException ioe) {
                reportError(ioe);
            }
            TreeAdaptor adap = new CommonTreeAdaptor();
            setTreeAdaptor(adap);
            proxy.setTreeAdaptor(adap);
        }
    public SteamParser(TokenStream input, DebugEventListener dbg) {
        super(input, dbg);

         
        TreeAdaptor adap = new CommonTreeAdaptor();
        setTreeAdaptor(adap);

    }
    protected boolean evalPredicate(boolean result, String predicate) {
        dbg.semanticPredicate(result, predicate);
        return result;
    }

    protected DebugTreeAdaptor adaptor;
    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = new DebugTreeAdaptor(dbg,adaptor);

    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }


    public String[] getTokenNames() { return SteamParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g"; }


      org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(getClass());
      
      protected String unquote(String value) {
        return value.substring(1, value.length()-1);
      }


    public static class qualifiedIdentifier_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "qualifiedIdentifier"
    // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:32:1: qualifiedIdentifier : Identifier ( ':' Identifier )* ;
    public final SteamParser.qualifiedIdentifier_return qualifiedIdentifier() throws RecognitionException {
        SteamParser.qualifiedIdentifier_return retval = new SteamParser.qualifiedIdentifier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier1=null;
        Token char_literal2=null;
        Token Identifier3=null;

        CommonTree Identifier1_tree=null;
        CommonTree char_literal2_tree=null;
        CommonTree Identifier3_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "qualifiedIdentifier");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(32, 1);

        try {
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:33:2: ( Identifier ( ':' Identifier )* )
            dbg.enterAlt(1);

            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:33:7: Identifier ( ':' Identifier )*
            {
            root_0 = (CommonTree)adaptor.nil();

            dbg.location(33,7);
            Identifier1=(Token)match(input,Identifier,FOLLOW_Identifier_in_qualifiedIdentifier79); 
            Identifier1_tree = (CommonTree)adaptor.create(Identifier1);
            adaptor.addChild(root_0, Identifier1_tree);

            dbg.location(33,18);
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:33:18: ( ':' Identifier )*
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:33:19: ':' Identifier
            	    {
            	    dbg.location(33,19);
            	    char_literal2=(Token)match(input,16,FOLLOW_16_in_qualifiedIdentifier82); 
            	    char_literal2_tree = (CommonTree)adaptor.create(char_literal2);
            	    adaptor.addChild(root_0, char_literal2_tree);

            	    dbg.location(33,23);
            	    Identifier3=(Token)match(input,Identifier,FOLLOW_Identifier_in_qualifiedIdentifier84); 
            	    Identifier3_tree = (CommonTree)adaptor.create(Identifier3);
            	    adaptor.addChild(root_0, Identifier3_tree);


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);
            } finally {dbg.exitSubRule(1);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(34, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "qualifiedIdentifier");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "qualifiedIdentifier"

    public static class requireDecl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "requireDecl"
    // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:36:1: requireDecl : 'require' id= qualifiedIdentifier ( ';' )? -> ^( 'require' $id) ;
    public final SteamParser.requireDecl_return requireDecl() throws RecognitionException {
        SteamParser.requireDecl_return retval = new SteamParser.requireDecl_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal4=null;
        Token char_literal5=null;
        SteamParser.qualifiedIdentifier_return id = null;


        CommonTree string_literal4_tree=null;
        CommonTree char_literal5_tree=null;
        RewriteRuleTokenStream stream_17=new RewriteRuleTokenStream(adaptor,"token 17");
        RewriteRuleTokenStream stream_18=new RewriteRuleTokenStream(adaptor,"token 18");
        RewriteRuleSubtreeStream stream_qualifiedIdentifier=new RewriteRuleSubtreeStream(adaptor,"rule qualifiedIdentifier");
        try { dbg.enterRule(getGrammarFileName(), "requireDecl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(36, 1);

        try {
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:37:2: ( 'require' id= qualifiedIdentifier ( ';' )? -> ^( 'require' $id) )
            dbg.enterAlt(1);

            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:37:4: 'require' id= qualifiedIdentifier ( ';' )?
            {
            dbg.location(37,4);
            string_literal4=(Token)match(input,17,FOLLOW_17_in_requireDecl99);  
            stream_17.add(string_literal4);

            dbg.location(37,16);
            pushFollow(FOLLOW_qualifiedIdentifier_in_requireDecl103);
            id=qualifiedIdentifier();

            state._fsp--;

            stream_qualifiedIdentifier.add(id.getTree());
            dbg.location(37,37);
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:37:37: ( ';' )?
            int alt2=2;
            try { dbg.enterSubRule(2);
            try { dbg.enterDecision(2);

            int LA2_0 = input.LA(1);

            if ( (LA2_0==18) ) {
                alt2=1;
            }
            } finally {dbg.exitDecision(2);}

            switch (alt2) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:37:37: ';'
                    {
                    dbg.location(37,37);
                    char_literal5=(Token)match(input,18,FOLLOW_18_in_requireDecl105);  
                    stream_18.add(char_literal5);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(2);}



            // AST REWRITE
            // elements: id, 17
            // token labels: 
            // rule labels: id, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id",id!=null?id.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 37:42: -> ^( 'require' $id)
            {
                dbg.location(37,45);
                // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:37:45: ^( 'require' $id)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(37,47);
                root_1 = (CommonTree)adaptor.becomeRoot(stream_17.nextNode(), root_1);

                dbg.location(37,57);
                adaptor.addChild(root_1, stream_id.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(38, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "requireDecl");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "requireDecl"

    public static class compilationUnit_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "compilationUnit"
    // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:40:1: compilationUnit : moduleDecl ( requireDecl | variableDecl | defDecl )* ;
    public final SteamParser.compilationUnit_return compilationUnit() throws RecognitionException {
        SteamParser.compilationUnit_return retval = new SteamParser.compilationUnit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SteamParser.moduleDecl_return moduleDecl6 = null;

        SteamParser.requireDecl_return requireDecl7 = null;

        SteamParser.variableDecl_return variableDecl8 = null;

        SteamParser.defDecl_return defDecl9 = null;



        try { dbg.enterRule(getGrammarFileName(), "compilationUnit");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(40, 1);

        try {
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:41:2: ( moduleDecl ( requireDecl | variableDecl | defDecl )* )
            dbg.enterAlt(1);

            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:41:4: moduleDecl ( requireDecl | variableDecl | defDecl )*
            {
            root_0 = (CommonTree)adaptor.nil();

            dbg.location(41,4);
            pushFollow(FOLLOW_moduleDecl_in_compilationUnit127);
            moduleDecl6=moduleDecl();

            state._fsp--;

            adaptor.addChild(root_0, moduleDecl6.getTree());
            dbg.location(42,3);
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:42:3: ( requireDecl | variableDecl | defDecl )*
            try { dbg.enterSubRule(3);

            loop3:
            do {
                int alt3=4;
                try { dbg.enterDecision(3);

                switch ( input.LA(1) ) {
                case 17:
                    {
                    alt3=1;
                    }
                    break;
                case 20:
                case 21:
                case 22:
                    {
                    alt3=2;
                    }
                    break;
                case 38:
                    {
                    alt3=3;
                    }
                    break;

                }

                } finally {dbg.exitDecision(3);}

                switch (alt3) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:42:4: requireDecl
            	    {
            	    dbg.location(42,4);
            	    pushFollow(FOLLOW_requireDecl_in_compilationUnit132);
            	    requireDecl7=requireDecl();

            	    state._fsp--;

            	    adaptor.addChild(root_0, requireDecl7.getTree());

            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:42:18: variableDecl
            	    {
            	    dbg.location(42,18);
            	    pushFollow(FOLLOW_variableDecl_in_compilationUnit136);
            	    variableDecl8=variableDecl();

            	    state._fsp--;

            	    adaptor.addChild(root_0, variableDecl8.getTree());

            	    }
            	    break;
            	case 3 :
            	    dbg.enterAlt(3);

            	    // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:42:33: defDecl
            	    {
            	    dbg.location(42,33);
            	    pushFollow(FOLLOW_defDecl_in_compilationUnit140);
            	    defDecl9=defDecl();

            	    state._fsp--;

            	    adaptor.addChild(root_0, defDecl9.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);
            } finally {dbg.exitSubRule(3);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(43, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "compilationUnit");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "compilationUnit"

    public static class moduleDecl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "moduleDecl"
    // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:45:1: moduleDecl : 'module' moduleId= qualifiedIdentifier ( ';' )? -> ^( 'module' $moduleId) ;
    public final SteamParser.moduleDecl_return moduleDecl() throws RecognitionException {
        SteamParser.moduleDecl_return retval = new SteamParser.moduleDecl_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal10=null;
        Token char_literal11=null;
        SteamParser.qualifiedIdentifier_return moduleId = null;


        CommonTree string_literal10_tree=null;
        CommonTree char_literal11_tree=null;
        RewriteRuleTokenStream stream_19=new RewriteRuleTokenStream(adaptor,"token 19");
        RewriteRuleTokenStream stream_18=new RewriteRuleTokenStream(adaptor,"token 18");
        RewriteRuleSubtreeStream stream_qualifiedIdentifier=new RewriteRuleSubtreeStream(adaptor,"rule qualifiedIdentifier");
        try { dbg.enterRule(getGrammarFileName(), "moduleDecl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(45, 1);

        try {
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:46:2: ( 'module' moduleId= qualifiedIdentifier ( ';' )? -> ^( 'module' $moduleId) )
            dbg.enterAlt(1);

            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:46:4: 'module' moduleId= qualifiedIdentifier ( ';' )?
            {
            dbg.location(46,4);
            string_literal10=(Token)match(input,19,FOLLOW_19_in_moduleDecl154);  
            stream_19.add(string_literal10);

            dbg.location(46,21);
            pushFollow(FOLLOW_qualifiedIdentifier_in_moduleDecl158);
            moduleId=qualifiedIdentifier();

            state._fsp--;

            stream_qualifiedIdentifier.add(moduleId.getTree());
            dbg.location(46,42);
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:46:42: ( ';' )?
            int alt4=2;
            try { dbg.enterSubRule(4);
            try { dbg.enterDecision(4);

            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            } finally {dbg.exitDecision(4);}

            switch (alt4) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:46:42: ';'
                    {
                    dbg.location(46,42);
                    char_literal11=(Token)match(input,18,FOLLOW_18_in_moduleDecl160);  
                    stream_18.add(char_literal11);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(4);}



            // AST REWRITE
            // elements: 19, moduleId
            // token labels: 
            // rule labels: retval, moduleId
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_moduleId=new RewriteRuleSubtreeStream(adaptor,"rule moduleId",moduleId!=null?moduleId.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 46:47: -> ^( 'module' $moduleId)
            {
                dbg.location(46,50);
                // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:46:50: ^( 'module' $moduleId)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(46,52);
                root_1 = (CommonTree)adaptor.becomeRoot(stream_19.nextNode(), root_1);

                dbg.location(46,61);
                adaptor.addChild(root_1, stream_moduleId.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(47, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "moduleDecl");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "moduleDecl"

    public static class variableDecl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variableDecl"
    // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:49:1: variableDecl : ( 'public' )? (mod= 'var' | mod= 'val' ) id= Identifier '=' lit= literal -> ^( VARIABLE $mod $id $lit) ;
    public final SteamParser.variableDecl_return variableDecl() throws RecognitionException {
        SteamParser.variableDecl_return retval = new SteamParser.variableDecl_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token mod=null;
        Token id=null;
        Token string_literal12=null;
        Token char_literal13=null;
        SteamParser.literal_return lit = null;


        CommonTree mod_tree=null;
        CommonTree id_tree=null;
        CommonTree string_literal12_tree=null;
        CommonTree char_literal13_tree=null;
        RewriteRuleTokenStream stream_21=new RewriteRuleTokenStream(adaptor,"token 21");
        RewriteRuleTokenStream stream_20=new RewriteRuleTokenStream(adaptor,"token 20");
        RewriteRuleTokenStream stream_22=new RewriteRuleTokenStream(adaptor,"token 22");
        RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_literal=new RewriteRuleSubtreeStream(adaptor,"rule literal");
        try { dbg.enterRule(getGrammarFileName(), "variableDecl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(49, 1);

        try {
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:50:2: ( ( 'public' )? (mod= 'var' | mod= 'val' ) id= Identifier '=' lit= literal -> ^( VARIABLE $mod $id $lit) )
            dbg.enterAlt(1);

            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:50:4: ( 'public' )? (mod= 'var' | mod= 'val' ) id= Identifier '=' lit= literal
            {
            dbg.location(50,4);
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:50:4: ( 'public' )?
            int alt5=2;
            try { dbg.enterSubRule(5);
            try { dbg.enterDecision(5);

            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            } finally {dbg.exitDecision(5);}

            switch (alt5) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:50:5: 'public'
                    {
                    dbg.location(50,5);
                    string_literal12=(Token)match(input,20,FOLLOW_20_in_variableDecl183);  
                    stream_20.add(string_literal12);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(5);}

            dbg.location(50,16);
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:50:16: (mod= 'var' | mod= 'val' )
            int alt6=2;
            try { dbg.enterSubRule(6);
            try { dbg.enterDecision(6);

            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            else if ( (LA6_0==22) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(6);}

            switch (alt6) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:50:17: mod= 'var'
                    {
                    dbg.location(50,20);
                    mod=(Token)match(input,21,FOLLOW_21_in_variableDecl190);  
                    stream_21.add(mod);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:50:27: mod= 'val'
                    {
                    dbg.location(50,30);
                    mod=(Token)match(input,22,FOLLOW_22_in_variableDecl194);  
                    stream_22.add(mod);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(6);}

            dbg.location(50,40);
            id=(Token)match(input,Identifier,FOLLOW_Identifier_in_variableDecl199);  
            stream_Identifier.add(id);

            dbg.location(50,52);
            char_literal13=(Token)match(input,23,FOLLOW_23_in_variableDecl201);  
            stream_23.add(char_literal13);

            dbg.location(50,59);
            pushFollow(FOLLOW_literal_in_variableDecl205);
            lit=literal();

            state._fsp--;

            stream_literal.add(lit.getTree());


            // AST REWRITE
            // elements: mod, id, lit
            // token labels: id, mod
            // rule labels: lit, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_id=new RewriteRuleTokenStream(adaptor,"token id",id);
            RewriteRuleTokenStream stream_mod=new RewriteRuleTokenStream(adaptor,"token mod",mod);
            RewriteRuleSubtreeStream stream_lit=new RewriteRuleSubtreeStream(adaptor,"rule lit",lit!=null?lit.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 50:68: -> ^( VARIABLE $mod $id $lit)
            {
                dbg.location(50,71);
                // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:50:71: ^( VARIABLE $mod $id $lit)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(50,73);
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VARIABLE, "VARIABLE"), root_1);

                dbg.location(50,82);
                adaptor.addChild(root_1, stream_mod.nextNode());
                dbg.location(50,87);
                adaptor.addChild(root_1, stream_id.nextNode());
                dbg.location(50,91);
                adaptor.addChild(root_1, stream_lit.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(51, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "variableDecl");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "variableDecl"

    public static class defIdentifier_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "defIdentifier"
    // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:56:1: defIdentifier : ( '<' | '>' | '=' | '~' | '+' | '-' | '*' | '/' | 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )+ ( ':' )? ;
    public final SteamParser.defIdentifier_return defIdentifier() throws RecognitionException {
        SteamParser.defIdentifier_return retval = new SteamParser.defIdentifier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set14=null;
        Token char_literal15=null;

        CommonTree set14_tree=null;
        CommonTree char_literal15_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "defIdentifier");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(56, 1);

        try {
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:57:2: ( ( '<' | '>' | '=' | '~' | '+' | '-' | '*' | '/' | 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )+ ( ':' )? )
            dbg.enterAlt(1);

            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:57:4: ( '<' | '>' | '=' | '~' | '+' | '-' | '*' | '/' | 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )+ ( ':' )?
            {
            root_0 = (CommonTree)adaptor.nil();

            dbg.location(57,4);
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:57:4: ( '<' | '>' | '=' | '~' | '+' | '-' | '*' | '/' | 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )+
            int cnt7=0;
            try { dbg.enterSubRule(7);

            loop7:
            do {
                int alt7=2;
                try { dbg.enterDecision(7);

                int LA7_0 = input.LA(1);

                if ( (LA7_0==23) ) {
                    int LA7_2 = input.LA(2);

                    if ( (LA7_2==16||(LA7_2>=23 && LA7_2<=30)||LA7_2==35||LA7_2==39) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>=24 && LA7_0<=30)||LA7_0==35) ) {
                    alt7=1;
                }


                } finally {dbg.exitDecision(7);}

                switch (alt7) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:
            	    {
            	    dbg.location(57,4);
            	    set14=(Token)input.LT(1);
            	    if ( (input.LA(1)>=23 && input.LA(1)<=30)||input.LA(1)==35 ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (CommonTree)adaptor.create(set14));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt7++;
            } while (true);
            } finally {dbg.exitSubRule(7);}

            dbg.location(57,95);
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:57:95: ( ':' )?
            int alt8=2;
            try { dbg.enterSubRule(8);
            try { dbg.enterDecision(8);

            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==16||LA8_1==23||LA8_1==39) ) {
                    alt8=1;
                }
            }
            } finally {dbg.exitDecision(8);}

            switch (alt8) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:57:95: ':'
                    {
                    dbg.location(57,95);
                    char_literal15=(Token)match(input,16,FOLLOW_16_in_defIdentifier291); 
                    char_literal15_tree = (CommonTree)adaptor.create(char_literal15);
                    adaptor.addChild(root_0, char_literal15_tree);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(8);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(58, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "defIdentifier");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "defIdentifier"

    public static class defDecl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "defDecl"
    // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:60:1: defDecl : 'def' defIdentifier ( '(' defArgumentList ')' )? ( ':' qualifiedIdentifier )? '=' stmtBlock ;
    public final SteamParser.defDecl_return defDecl() throws RecognitionException {
        SteamParser.defDecl_return retval = new SteamParser.defDecl_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal16=null;
        Token char_literal18=null;
        Token char_literal20=null;
        Token char_literal21=null;
        Token char_literal23=null;
        SteamParser.defIdentifier_return defIdentifier17 = null;

        SteamParser.defArgumentList_return defArgumentList19 = null;

        SteamParser.qualifiedIdentifier_return qualifiedIdentifier22 = null;

        SteamParser.stmtBlock_return stmtBlock24 = null;


        CommonTree string_literal16_tree=null;
        CommonTree char_literal18_tree=null;
        CommonTree char_literal20_tree=null;
        CommonTree char_literal21_tree=null;
        CommonTree char_literal23_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "defDecl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(60, 1);

        try {
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:61:2: ( 'def' defIdentifier ( '(' defArgumentList ')' )? ( ':' qualifiedIdentifier )? '=' stmtBlock )
            dbg.enterAlt(1);

            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:61:4: 'def' defIdentifier ( '(' defArgumentList ')' )? ( ':' qualifiedIdentifier )? '=' stmtBlock
            {
            root_0 = (CommonTree)adaptor.nil();

            dbg.location(61,4);
            string_literal16=(Token)match(input,38,FOLLOW_38_in_defDecl303); 
            string_literal16_tree = (CommonTree)adaptor.create(string_literal16);
            adaptor.addChild(root_0, string_literal16_tree);

            dbg.location(61,10);
            pushFollow(FOLLOW_defIdentifier_in_defDecl305);
            defIdentifier17=defIdentifier();

            state._fsp--;

            adaptor.addChild(root_0, defIdentifier17.getTree());
            dbg.location(61,24);
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:61:24: ( '(' defArgumentList ')' )?
            int alt9=2;
            try { dbg.enterSubRule(9);
            try { dbg.enterDecision(9);

            int LA9_0 = input.LA(1);

            if ( (LA9_0==39) ) {
                alt9=1;
            }
            } finally {dbg.exitDecision(9);}

            switch (alt9) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:61:25: '(' defArgumentList ')'
                    {
                    dbg.location(61,25);
                    char_literal18=(Token)match(input,39,FOLLOW_39_in_defDecl308); 
                    char_literal18_tree = (CommonTree)adaptor.create(char_literal18);
                    adaptor.addChild(root_0, char_literal18_tree);

                    dbg.location(61,29);
                    pushFollow(FOLLOW_defArgumentList_in_defDecl310);
                    defArgumentList19=defArgumentList();

                    state._fsp--;

                    adaptor.addChild(root_0, defArgumentList19.getTree());
                    dbg.location(61,45);
                    char_literal20=(Token)match(input,40,FOLLOW_40_in_defDecl312); 
                    char_literal20_tree = (CommonTree)adaptor.create(char_literal20);
                    adaptor.addChild(root_0, char_literal20_tree);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(9);}

            dbg.location(61,51);
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:61:51: ( ':' qualifiedIdentifier )?
            int alt10=2;
            try { dbg.enterSubRule(10);
            try { dbg.enterDecision(10);

            int LA10_0 = input.LA(1);

            if ( (LA10_0==16) ) {
                alt10=1;
            }
            } finally {dbg.exitDecision(10);}

            switch (alt10) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:61:52: ':' qualifiedIdentifier
                    {
                    dbg.location(61,52);
                    char_literal21=(Token)match(input,16,FOLLOW_16_in_defDecl317); 
                    char_literal21_tree = (CommonTree)adaptor.create(char_literal21);
                    adaptor.addChild(root_0, char_literal21_tree);

                    dbg.location(61,56);
                    pushFollow(FOLLOW_qualifiedIdentifier_in_defDecl319);
                    qualifiedIdentifier22=qualifiedIdentifier();

                    state._fsp--;

                    adaptor.addChild(root_0, qualifiedIdentifier22.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(10);}

            dbg.location(61,78);
            char_literal23=(Token)match(input,23,FOLLOW_23_in_defDecl323); 
            char_literal23_tree = (CommonTree)adaptor.create(char_literal23);
            adaptor.addChild(root_0, char_literal23_tree);

            dbg.location(61,82);
            pushFollow(FOLLOW_stmtBlock_in_defDecl325);
            stmtBlock24=stmtBlock();

            state._fsp--;

            adaptor.addChild(root_0, stmtBlock24.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(62, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "defDecl");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "defDecl"

    public static class defArgument_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "defArgument"
    // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:64:1: defArgument : Identifier ':' qualifiedIdentifier ;
    public final SteamParser.defArgument_return defArgument() throws RecognitionException {
        SteamParser.defArgument_return retval = new SteamParser.defArgument_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier25=null;
        Token char_literal26=null;
        SteamParser.qualifiedIdentifier_return qualifiedIdentifier27 = null;


        CommonTree Identifier25_tree=null;
        CommonTree char_literal26_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "defArgument");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(64, 1);

        try {
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:65:2: ( Identifier ':' qualifiedIdentifier )
            dbg.enterAlt(1);

            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:65:4: Identifier ':' qualifiedIdentifier
            {
            root_0 = (CommonTree)adaptor.nil();

            dbg.location(65,4);
            Identifier25=(Token)match(input,Identifier,FOLLOW_Identifier_in_defArgument337); 
            Identifier25_tree = (CommonTree)adaptor.create(Identifier25);
            adaptor.addChild(root_0, Identifier25_tree);

            dbg.location(65,15);
            char_literal26=(Token)match(input,16,FOLLOW_16_in_defArgument339); 
            char_literal26_tree = (CommonTree)adaptor.create(char_literal26);
            adaptor.addChild(root_0, char_literal26_tree);

            dbg.location(65,19);
            pushFollow(FOLLOW_qualifiedIdentifier_in_defArgument341);
            qualifiedIdentifier27=qualifiedIdentifier();

            state._fsp--;

            adaptor.addChild(root_0, qualifiedIdentifier27.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(66, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "defArgument");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "defArgument"

    public static class defArgumentList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "defArgumentList"
    // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:67:1: defArgumentList : ( defArgument ( ',' defArgument )* )? ;
    public final SteamParser.defArgumentList_return defArgumentList() throws RecognitionException {
        SteamParser.defArgumentList_return retval = new SteamParser.defArgumentList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal29=null;
        SteamParser.defArgument_return defArgument28 = null;

        SteamParser.defArgument_return defArgument30 = null;


        CommonTree char_literal29_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "defArgumentList");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(67, 1);

        try {
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:68:2: ( ( defArgument ( ',' defArgument )* )? )
            dbg.enterAlt(1);

            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:68:4: ( defArgument ( ',' defArgument )* )?
            {
            root_0 = (CommonTree)adaptor.nil();

            dbg.location(68,4);
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:68:4: ( defArgument ( ',' defArgument )* )?
            int alt12=2;
            try { dbg.enterSubRule(12);
            try { dbg.enterDecision(12);

            int LA12_0 = input.LA(1);

            if ( (LA12_0==Identifier) ) {
                alt12=1;
            }
            } finally {dbg.exitDecision(12);}

            switch (alt12) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:68:5: defArgument ( ',' defArgument )*
                    {
                    dbg.location(68,5);
                    pushFollow(FOLLOW_defArgument_in_defArgumentList352);
                    defArgument28=defArgument();

                    state._fsp--;

                    adaptor.addChild(root_0, defArgument28.getTree());
                    dbg.location(68,17);
                    // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:68:17: ( ',' defArgument )*
                    try { dbg.enterSubRule(11);

                    loop11:
                    do {
                        int alt11=2;
                        try { dbg.enterDecision(11);

                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==41) ) {
                            alt11=1;
                        }


                        } finally {dbg.exitDecision(11);}

                        switch (alt11) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:68:18: ',' defArgument
                    	    {
                    	    dbg.location(68,18);
                    	    char_literal29=(Token)match(input,41,FOLLOW_41_in_defArgumentList355); 
                    	    char_literal29_tree = (CommonTree)adaptor.create(char_literal29);
                    	    adaptor.addChild(root_0, char_literal29_tree);

                    	    dbg.location(68,22);
                    	    pushFollow(FOLLOW_defArgument_in_defArgumentList357);
                    	    defArgument30=defArgument();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, defArgument30.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(11);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(12);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(69, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "defArgumentList");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "defArgumentList"

    public static class defInvocation_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "defInvocation"
    // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:71:1: defInvocation : defIdentifier '(' ')' ;
    public final SteamParser.defInvocation_return defInvocation() throws RecognitionException {
        SteamParser.defInvocation_return retval = new SteamParser.defInvocation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal32=null;
        Token char_literal33=null;
        SteamParser.defIdentifier_return defIdentifier31 = null;


        CommonTree char_literal32_tree=null;
        CommonTree char_literal33_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "defInvocation");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(71, 1);

        try {
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:72:2: ( defIdentifier '(' ')' )
            dbg.enterAlt(1);

            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:72:4: defIdentifier '(' ')'
            {
            root_0 = (CommonTree)adaptor.nil();

            dbg.location(72,4);
            pushFollow(FOLLOW_defIdentifier_in_defInvocation373);
            defIdentifier31=defIdentifier();

            state._fsp--;

            adaptor.addChild(root_0, defIdentifier31.getTree());
            dbg.location(72,18);
            char_literal32=(Token)match(input,39,FOLLOW_39_in_defInvocation375); 
            char_literal32_tree = (CommonTree)adaptor.create(char_literal32);
            adaptor.addChild(root_0, char_literal32_tree);

            dbg.location(72,23);
            char_literal33=(Token)match(input,40,FOLLOW_40_in_defInvocation378); 
            char_literal33_tree = (CommonTree)adaptor.create(char_literal33);
            adaptor.addChild(root_0, char_literal33_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(73, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "defInvocation");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "defInvocation"

    public static class defInvocationParameters_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "defInvocationParameters"
    // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:75:1: defInvocationParameters : ( ( Identifier '=' )? expr ( ',' ( Identifier '=' )? expr )* )? ;
    public final SteamParser.defInvocationParameters_return defInvocationParameters() throws RecognitionException {
        SteamParser.defInvocationParameters_return retval = new SteamParser.defInvocationParameters_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier34=null;
        Token char_literal35=null;
        Token char_literal37=null;
        Token Identifier38=null;
        Token char_literal39=null;
        SteamParser.expr_return expr36 = null;

        SteamParser.expr_return expr40 = null;


        CommonTree Identifier34_tree=null;
        CommonTree char_literal35_tree=null;
        CommonTree char_literal37_tree=null;
        CommonTree Identifier38_tree=null;
        CommonTree char_literal39_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "defInvocationParameters");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(75, 1);

        try {
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:77:2: ( ( ( Identifier '=' )? expr ( ',' ( Identifier '=' )? expr )* )? )
            dbg.enterAlt(1);

            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:77:4: ( ( Identifier '=' )? expr ( ',' ( Identifier '=' )? expr )* )?
            {
            root_0 = (CommonTree)adaptor.nil();

            dbg.location(77,4);
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:77:4: ( ( Identifier '=' )? expr ( ',' ( Identifier '=' )? expr )* )?
            int alt16=2;
            try { dbg.enterSubRule(16);
            try { dbg.enterDecision(16);

            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=Identifier && LA16_0<=DecimalExpLiteral)||(LA16_0>=23 && LA16_0<=30)||LA16_0==35||LA16_0==42) ) {
                alt16=1;
            }
            } finally {dbg.exitDecision(16);}

            switch (alt16) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:77:5: ( Identifier '=' )? expr ( ',' ( Identifier '=' )? expr )*
                    {
                    dbg.location(77,5);
                    // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:77:5: ( Identifier '=' )?
                    int alt13=2;
                    try { dbg.enterSubRule(13);
                    try { dbg.enterDecision(13);

                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==Identifier) ) {
                        alt13=1;
                    }
                    } finally {dbg.exitDecision(13);}

                    switch (alt13) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:77:6: Identifier '='
                            {
                            dbg.location(77,6);
                            Identifier34=(Token)match(input,Identifier,FOLLOW_Identifier_in_defInvocationParameters394); 
                            Identifier34_tree = (CommonTree)adaptor.create(Identifier34);
                            adaptor.addChild(root_0, Identifier34_tree);

                            dbg.location(77,17);
                            char_literal35=(Token)match(input,23,FOLLOW_23_in_defInvocationParameters396); 
                            char_literal35_tree = (CommonTree)adaptor.create(char_literal35);
                            adaptor.addChild(root_0, char_literal35_tree);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(13);}

                    dbg.location(77,23);
                    pushFollow(FOLLOW_expr_in_defInvocationParameters400);
                    expr36=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr36.getTree());
                    dbg.location(77,28);
                    // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:77:28: ( ',' ( Identifier '=' )? expr )*
                    try { dbg.enterSubRule(15);

                    loop15:
                    do {
                        int alt15=2;
                        try { dbg.enterDecision(15);

                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==41) ) {
                            alt15=1;
                        }


                        } finally {dbg.exitDecision(15);}

                        switch (alt15) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:77:29: ',' ( Identifier '=' )? expr
                    	    {
                    	    dbg.location(77,29);
                    	    char_literal37=(Token)match(input,41,FOLLOW_41_in_defInvocationParameters403); 
                    	    char_literal37_tree = (CommonTree)adaptor.create(char_literal37);
                    	    adaptor.addChild(root_0, char_literal37_tree);

                    	    dbg.location(77,33);
                    	    // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:77:33: ( Identifier '=' )?
                    	    int alt14=2;
                    	    try { dbg.enterSubRule(14);
                    	    try { dbg.enterDecision(14);

                    	    int LA14_0 = input.LA(1);

                    	    if ( (LA14_0==Identifier) ) {
                    	        alt14=1;
                    	    }
                    	    } finally {dbg.exitDecision(14);}

                    	    switch (alt14) {
                    	        case 1 :
                    	            dbg.enterAlt(1);

                    	            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:77:34: Identifier '='
                    	            {
                    	            dbg.location(77,34);
                    	            Identifier38=(Token)match(input,Identifier,FOLLOW_Identifier_in_defInvocationParameters406); 
                    	            Identifier38_tree = (CommonTree)adaptor.create(Identifier38);
                    	            adaptor.addChild(root_0, Identifier38_tree);

                    	            dbg.location(77,45);
                    	            char_literal39=(Token)match(input,23,FOLLOW_23_in_defInvocationParameters408); 
                    	            char_literal39_tree = (CommonTree)adaptor.create(char_literal39);
                    	            adaptor.addChild(root_0, char_literal39_tree);


                    	            }
                    	            break;

                    	    }
                    	    } finally {dbg.exitSubRule(14);}

                    	    dbg.location(77,51);
                    	    pushFollow(FOLLOW_expr_in_defInvocationParameters412);
                    	    expr40=expr();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, expr40.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(15);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(16);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(78, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "defInvocationParameters");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "defInvocationParameters"

    public static class expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:83:1: expr : ( literal | defInvocation | matchExpr );
    public final SteamParser.expr_return expr() throws RecognitionException {
        SteamParser.expr_return retval = new SteamParser.expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SteamParser.literal_return literal41 = null;

        SteamParser.defInvocation_return defInvocation42 = null;

        SteamParser.matchExpr_return matchExpr43 = null;



        try { dbg.enterRule(getGrammarFileName(), "expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(83, 1);

        try {
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:84:2: ( literal | defInvocation | matchExpr )
            int alt17=3;
            try { dbg.enterDecision(17);

            switch ( input.LA(1) ) {
            case StringLiteral:
            case IntegerLiteral:
            case HexLiteral:
            case DecimalLiteral:
            case DecimalExpLiteral:
                {
                alt17=1;
                }
                break;
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 35:
                {
                alt17=2;
                }
                break;
            case 42:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(17);}

            switch (alt17) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:84:4: literal
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(84,4);
                    pushFollow(FOLLOW_literal_in_expr429);
                    literal41=literal();

                    state._fsp--;

                    adaptor.addChild(root_0, literal41.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:85:4: defInvocation
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(85,4);
                    pushFollow(FOLLOW_defInvocation_in_expr434);
                    defInvocation42=defInvocation();

                    state._fsp--;

                    adaptor.addChild(root_0, defInvocation42.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:86:4: matchExpr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(86,4);
                    pushFollow(FOLLOW_matchExpr_in_expr439);
                    matchExpr43=matchExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, matchExpr43.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(87, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "expr"

    public static class matchExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "matchExpr"
    // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:89:1: matchExpr : 'match' expr '{' ( matchCaseExpr )* '}' ;
    public final SteamParser.matchExpr_return matchExpr() throws RecognitionException {
        SteamParser.matchExpr_return retval = new SteamParser.matchExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal44=null;
        Token char_literal46=null;
        Token char_literal48=null;
        SteamParser.expr_return expr45 = null;

        SteamParser.matchCaseExpr_return matchCaseExpr47 = null;


        CommonTree string_literal44_tree=null;
        CommonTree char_literal46_tree=null;
        CommonTree char_literal48_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "matchExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(89, 1);

        try {
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:90:2: ( 'match' expr '{' ( matchCaseExpr )* '}' )
            dbg.enterAlt(1);

            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:90:4: 'match' expr '{' ( matchCaseExpr )* '}'
            {
            root_0 = (CommonTree)adaptor.nil();

            dbg.location(90,4);
            string_literal44=(Token)match(input,42,FOLLOW_42_in_matchExpr450); 
            string_literal44_tree = (CommonTree)adaptor.create(string_literal44);
            adaptor.addChild(root_0, string_literal44_tree);

            dbg.location(90,12);
            pushFollow(FOLLOW_expr_in_matchExpr452);
            expr45=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr45.getTree());
            dbg.location(90,17);
            char_literal46=(Token)match(input,43,FOLLOW_43_in_matchExpr454); 
            char_literal46_tree = (CommonTree)adaptor.create(char_literal46);
            adaptor.addChild(root_0, char_literal46_tree);

            dbg.location(90,21);
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:90:21: ( matchCaseExpr )*
            try { dbg.enterSubRule(18);

            loop18:
            do {
                int alt18=2;
                try { dbg.enterDecision(18);

                int LA18_0 = input.LA(1);

                if ( (LA18_0==45) ) {
                    alt18=1;
                }


                } finally {dbg.exitDecision(18);}

                switch (alt18) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:90:21: matchCaseExpr
            	    {
            	    dbg.location(90,21);
            	    pushFollow(FOLLOW_matchCaseExpr_in_matchExpr456);
            	    matchCaseExpr47=matchCaseExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, matchCaseExpr47.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);
            } finally {dbg.exitSubRule(18);}

            dbg.location(90,36);
            char_literal48=(Token)match(input,44,FOLLOW_44_in_matchExpr459); 
            char_literal48_tree = (CommonTree)adaptor.create(char_literal48);
            adaptor.addChild(root_0, char_literal48_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(91, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "matchExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "matchExpr"

    public static class matchCaseExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "matchCaseExpr"
    // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:93:1: matchCaseExpr : 'case' expr '=>' stmtBlock ;
    public final SteamParser.matchCaseExpr_return matchCaseExpr() throws RecognitionException {
        SteamParser.matchCaseExpr_return retval = new SteamParser.matchCaseExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal49=null;
        Token string_literal51=null;
        SteamParser.expr_return expr50 = null;

        SteamParser.stmtBlock_return stmtBlock52 = null;


        CommonTree string_literal49_tree=null;
        CommonTree string_literal51_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "matchCaseExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(93, 1);

        try {
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:94:2: ( 'case' expr '=>' stmtBlock )
            dbg.enterAlt(1);

            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:94:4: 'case' expr '=>' stmtBlock
            {
            root_0 = (CommonTree)adaptor.nil();

            dbg.location(94,4);
            string_literal49=(Token)match(input,45,FOLLOW_45_in_matchCaseExpr475); 
            string_literal49_tree = (CommonTree)adaptor.create(string_literal49);
            adaptor.addChild(root_0, string_literal49_tree);

            dbg.location(94,11);
            pushFollow(FOLLOW_expr_in_matchCaseExpr477);
            expr50=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr50.getTree());
            dbg.location(94,16);
            string_literal51=(Token)match(input,46,FOLLOW_46_in_matchCaseExpr479); 
            string_literal51_tree = (CommonTree)adaptor.create(string_literal51);
            adaptor.addChild(root_0, string_literal51_tree);

            dbg.location(94,21);
            pushFollow(FOLLOW_stmtBlock_in_matchCaseExpr481);
            stmtBlock52=stmtBlock();

            state._fsp--;

            adaptor.addChild(root_0, stmtBlock52.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(95, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "matchCaseExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "matchCaseExpr"

    public static class stmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stmt"
    // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:101:1: stmt : ( expr | variableDecl | stmtBlock ) ( ';' )? ;
    public final SteamParser.stmt_return stmt() throws RecognitionException {
        SteamParser.stmt_return retval = new SteamParser.stmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal56=null;
        SteamParser.expr_return expr53 = null;

        SteamParser.variableDecl_return variableDecl54 = null;

        SteamParser.stmtBlock_return stmtBlock55 = null;


        CommonTree char_literal56_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "stmt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(101, 1);

        try {
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:102:2: ( ( expr | variableDecl | stmtBlock ) ( ';' )? )
            dbg.enterAlt(1);

            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:102:4: ( expr | variableDecl | stmtBlock ) ( ';' )?
            {
            root_0 = (CommonTree)adaptor.nil();

            dbg.location(102,4);
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:102:4: ( expr | variableDecl | stmtBlock )
            int alt19=3;
            try { dbg.enterSubRule(19);
            try { dbg.enterDecision(19);

            switch ( input.LA(1) ) {
            case StringLiteral:
            case IntegerLiteral:
            case HexLiteral:
            case DecimalLiteral:
            case DecimalExpLiteral:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 35:
            case 42:
                {
                alt19=1;
                }
                break;
            case 20:
            case 21:
            case 22:
                {
                alt19=2;
                }
                break;
            case 43:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(19);}

            switch (alt19) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:102:5: expr
                    {
                    dbg.location(102,5);
                    pushFollow(FOLLOW_expr_in_stmt497);
                    expr53=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr53.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:102:12: variableDecl
                    {
                    dbg.location(102,12);
                    pushFollow(FOLLOW_variableDecl_in_stmt501);
                    variableDecl54=variableDecl();

                    state._fsp--;

                    adaptor.addChild(root_0, variableDecl54.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:102:27: stmtBlock
                    {
                    dbg.location(102,27);
                    pushFollow(FOLLOW_stmtBlock_in_stmt505);
                    stmtBlock55=stmtBlock();

                    state._fsp--;

                    adaptor.addChild(root_0, stmtBlock55.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(19);}

            dbg.location(102,38);
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:102:38: ( ';' )?
            int alt20=2;
            try { dbg.enterSubRule(20);
            try { dbg.enterDecision(20);

            int LA20_0 = input.LA(1);

            if ( (LA20_0==18) ) {
                alt20=1;
            }
            } finally {dbg.exitDecision(20);}

            switch (alt20) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:102:38: ';'
                    {
                    dbg.location(102,38);
                    char_literal56=(Token)match(input,18,FOLLOW_18_in_stmt508); 
                    char_literal56_tree = (CommonTree)adaptor.create(char_literal56);
                    adaptor.addChild(root_0, char_literal56_tree);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(20);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(103, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "stmt");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "stmt"

    public static class stmtBlock_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stmtBlock"
    // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:105:1: stmtBlock : '{' ( stmt )* '}' ;
    public final SteamParser.stmtBlock_return stmtBlock() throws RecognitionException {
        SteamParser.stmtBlock_return retval = new SteamParser.stmtBlock_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal57=null;
        Token char_literal59=null;
        SteamParser.stmt_return stmt58 = null;


        CommonTree char_literal57_tree=null;
        CommonTree char_literal59_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "stmtBlock");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(105, 1);

        try {
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:106:2: ( '{' ( stmt )* '}' )
            dbg.enterAlt(1);

            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:106:4: '{' ( stmt )* '}'
            {
            root_0 = (CommonTree)adaptor.nil();

            dbg.location(106,4);
            char_literal57=(Token)match(input,43,FOLLOW_43_in_stmtBlock520); 
            char_literal57_tree = (CommonTree)adaptor.create(char_literal57);
            adaptor.addChild(root_0, char_literal57_tree);

            dbg.location(106,8);
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:106:8: ( stmt )*
            try { dbg.enterSubRule(21);

            loop21:
            do {
                int alt21=2;
                try { dbg.enterDecision(21);

                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=StringLiteral && LA21_0<=DecimalExpLiteral)||(LA21_0>=20 && LA21_0<=30)||LA21_0==35||(LA21_0>=42 && LA21_0<=43)) ) {
                    alt21=1;
                }


                } finally {dbg.exitDecision(21);}

                switch (alt21) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:106:8: stmt
            	    {
            	    dbg.location(106,8);
            	    pushFollow(FOLLOW_stmt_in_stmtBlock522);
            	    stmt58=stmt();

            	    state._fsp--;

            	    adaptor.addChild(root_0, stmt58.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);
            } finally {dbg.exitSubRule(21);}

            dbg.location(106,14);
            char_literal59=(Token)match(input,44,FOLLOW_44_in_stmtBlock525); 
            char_literal59_tree = (CommonTree)adaptor.create(char_literal59);
            adaptor.addChild(root_0, char_literal59_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(107, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "stmtBlock");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "stmtBlock"

    public static class literal_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "literal"
    // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:109:1: literal : ( StringLiteral | IntegerLiteral | HexLiteral | DecimalLiteral | DecimalExpLiteral );
    public final SteamParser.literal_return literal() throws RecognitionException {
        SteamParser.literal_return retval = new SteamParser.literal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set60=null;

        CommonTree set60_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "literal");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(109, 1);

        try {
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:110:2: ( StringLiteral | IntegerLiteral | HexLiteral | DecimalLiteral | DecimalExpLiteral )
            dbg.enterAlt(1);

            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            dbg.location(110,2);
            set60=(Token)input.LT(1);
            if ( (input.LA(1)>=StringLiteral && input.LA(1)<=DecimalExpLiteral) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set60));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(115, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "literal");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "literal"

    // Delegated rules


 

    public static final BitSet FOLLOW_Identifier_in_qualifiedIdentifier79 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_qualifiedIdentifier82 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_Identifier_in_qualifiedIdentifier84 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_17_in_requireDecl99 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_qualifiedIdentifier_in_requireDecl103 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_requireDecl105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_moduleDecl_in_compilationUnit127 = new BitSet(new long[]{0x0000004000720002L});
    public static final BitSet FOLLOW_requireDecl_in_compilationUnit132 = new BitSet(new long[]{0x0000004000720002L});
    public static final BitSet FOLLOW_variableDecl_in_compilationUnit136 = new BitSet(new long[]{0x0000004000720002L});
    public static final BitSet FOLLOW_defDecl_in_compilationUnit140 = new BitSet(new long[]{0x0000004000720002L});
    public static final BitSet FOLLOW_19_in_moduleDecl154 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_qualifiedIdentifier_in_moduleDecl158 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_moduleDecl160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_variableDecl183 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_variableDecl190 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_22_in_variableDecl194 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_Identifier_in_variableDecl199 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_variableDecl201 = new BitSet(new long[]{0x00000000000007C0L});
    public static final BitSet FOLLOW_literal_in_variableDecl205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_defIdentifier233 = new BitSet(new long[]{0x000000087F810002L});
    public static final BitSet FOLLOW_16_in_defIdentifier291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_defDecl303 = new BitSet(new long[]{0x000000087F800000L});
    public static final BitSet FOLLOW_defIdentifier_in_defDecl305 = new BitSet(new long[]{0x0000008000810000L});
    public static final BitSet FOLLOW_39_in_defDecl308 = new BitSet(new long[]{0x0000010000000020L});
    public static final BitSet FOLLOW_defArgumentList_in_defDecl310 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_defDecl312 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_16_in_defDecl317 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_qualifiedIdentifier_in_defDecl319 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_defDecl323 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_stmtBlock_in_defDecl325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_defArgument337 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_defArgument339 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_qualifiedIdentifier_in_defArgument341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_defArgument_in_defArgumentList352 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_defArgumentList355 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_defArgument_in_defArgumentList357 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_defIdentifier_in_defInvocation373 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_defInvocation375 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_defInvocation378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_defInvocationParameters394 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_defInvocationParameters396 = new BitSet(new long[]{0x000004087F8007C0L});
    public static final BitSet FOLLOW_expr_in_defInvocationParameters400 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_defInvocationParameters403 = new BitSet(new long[]{0x000004087F8007E0L});
    public static final BitSet FOLLOW_Identifier_in_defInvocationParameters406 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_defInvocationParameters408 = new BitSet(new long[]{0x000004087F8007C0L});
    public static final BitSet FOLLOW_expr_in_defInvocationParameters412 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_literal_in_expr429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_defInvocation_in_expr434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_matchExpr_in_expr439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_matchExpr450 = new BitSet(new long[]{0x000004087F8007C0L});
    public static final BitSet FOLLOW_expr_in_matchExpr452 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_matchExpr454 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_matchCaseExpr_in_matchExpr456 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_44_in_matchExpr459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_matchCaseExpr475 = new BitSet(new long[]{0x000004087F8007C0L});
    public static final BitSet FOLLOW_expr_in_matchCaseExpr477 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_matchCaseExpr479 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_stmtBlock_in_matchCaseExpr481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_stmt497 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_variableDecl_in_stmt501 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_stmtBlock_in_stmt505 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_stmt508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_stmtBlock520 = new BitSet(new long[]{0x00001C087FF007C0L});
    public static final BitSet FOLLOW_stmt_in_stmtBlock522 = new BitSet(new long[]{0x00001C087FF007C0L});
    public static final BitSet FOLLOW_44_in_stmtBlock525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_literal0 = new BitSet(new long[]{0x0000000000000002L});

}