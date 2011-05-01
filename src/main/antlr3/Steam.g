grammar Steam;

/*
  
 */

options { 
  output = AST;
  ASTLabelType=CommonTree; // type of $stat.tree ref etc... 
}
tokens { 
	VARIABLE;
	VISIBILITY;
	ARGUMENT;
	RETURN;
	BODY;
} // imaginary token

@lexer::header {
  package steam.parser;
}
@parser::header {
  package steam.parser;
  import steam.lang.*;
}
@parser::members {
  org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(getClass());
  
  protected String unquote(String value) {
    return value.substring(1, value.length()-1);
  }
}

// ---------------- Parser Rules ---------------- //

qualifiedIdentifier 
	:    Identifier ('.' Identifier)* 
	;

requireDecl 
	: 'require' id=qualifiedIdentifier ';'? -> ^('require' $id)
	;

compilationUnit 
	: moduleDecl (requireDecl | variableDecl | defDecl)*
	;

moduleDecl 
	: 'module' moduleId=qualifiedIdentifier ';'? -> ^('module' $moduleId)
	;

variableDecl 
	: visibility=visibilityModifier? (mod='var'|mod='val') id=Identifier '=' value=expr -> ^(VARIABLE $id $value $visibility? $mod )
	;

visibilityModifier
	: modifier='public' | (modifier='protected' ('[' qualifiedIdentifier (',' qualifiedIdentifier)* ']')? )
	-> ^(VISIBILITY $modifier qualifiedIdentifier+)
	;
/*
 *  def
 */
defIdentifier
	: DefIdentifier
	| Identifier
	;

defDecl
	: visibilityModifier? 'def' defIdentifier defArguments? defReturn? '=' defBody 
	-> ^('def' defIdentifier defArguments? defReturn? visibilityModifier? ^(BODY defBody))
	;

defArgument
	: Identifier ':' qualifiedIdentifier
	;

defArguments
	: '(' ')' | '(' defArgument (',' defArgument)* ')' -> ^(ARGUMENT defArgument+)
	;
	
defReturn
	: ':' qualifiedIdentifier -> ^(RETURN qualifiedIdentifier)
	;
	
defBody
	: expr | stmtBlock
	;
	
defInvocation
	: (qualifiedIdentifier ('.' DefIdentifier)?| DefIdentifier) defInvocationParameters?
	;

defInvocationParameters
	: '(' ')' | '(' (Identifier '=')? expr (',' (Identifier '=')? expr)* ')'
	;

/*
 *  Expression
 */
expr
	: literal
	| defInvocation
	| matchExpr
	;

matchExpr
	: 'match' expr '{' matchCaseExpr* '}'
	;
	    
matchCaseExpr
	: 'case' expr '=>' stmtBlock
	;


/*
 *  Statement
 */	
stmt
	: (expr ';'? | variableDecl ';'? | stmtBlock)
	;

stmtBlock
	: '{' stmt* '}'
	;

literal 
	: StringLiteral
	| IntegerLiteral
	| HexLiteral
	| DecimalLiteral
	| DecimalExpLiteral
	;

/*
functionDecl : 'func';

*/

// ---------------- Lexer Rules ---------------- //
/*
Letter
    :  '\u0024' | '\u005f'|
       '\u0041'..'\u005a' | '\u0061'..'\u007a' |
       '\u00c0'..'\u00d6' | '\u00d8'..'\u00f6' |
       '\u00f8'..'\u00ff' | '\u0100'..'\u1fff' |
       '\u3040'..'\u318f' | '\u3300'..'\u337f' |
       '\u3400'..'\u3d2d' | '\u4e00'..'\u9fff' |
       '\uf900'..'\ufaff'
    ;
*/
fragment Digit
	:	'0'..'9';
	
IntegerLiteral :  Digit+;
HexLiteral : '0x' (Digit | 'A'..'F' | 'a'..'f')+;	 
DecimalLiteral :  IntegerLiteral '.' IntegerLiteral;
DecimalExpLiteral  : (IntegerLiteral | DecimalLiteral) ('e' | 'E') ('+' | '-')? IntegerLiteral;

StringLiteral : '"""' ~('"""')* '"""' | '"' ~('"')* '"' | '\'' ~('\'')* '\'';


Identifier
	: ('a'..'z' | 'A' .. 'Z' | '_') ( 'a'..'z' | 'A' .. 'Z' | '_' | '0'..'9' )*;


DefIdentifier
	: ( '<' | '>' | '=' | '~' | '+' | '-' | '*' | '/' | 'a' .. 'z' | 'A' .. 'Z' | '_' )
	  ( '<' | '>' | '=' | '~' | '+' | '-' | '*' | '/' | 'a' .. 'z' | 'A' .. 'Z' | '_' | '0'..'9' )*
	;

WS: (' '|'\t'|'\u000C') {skip();};


NEWLINE	: ('\r')? '\n' {skip();}
	;