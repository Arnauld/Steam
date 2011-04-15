grammar Steam;

/*
  
 */

options { 
  output = AST;
  ASTLabelType=CommonTree; // type of $stat.tree ref etc... 
}

@lexer::header {
  package org.technbolts.steam.parser;
}
@parser::header {
  package org.technbolts.steam.parser;
}

// ---------------- Parser Rules ---------------- //
xPath
    :    pathExpr
    ;

pathExpr
    :    ('/' relativePathExpr?)
    |    ('//' relativePathExpr)
    |    relativePathExpr
    ;

relativePathExpr
    :    primaryStep = stepExpr
         (( '/' | '//' ) trailingStep = stepExpr )*
    ;

stepExpr
    :    ( '.'
         | abbrevForwardStep
         ) (predicate)?
    ;

abbrevForwardStep
    :    attributeFlag = '@'? (stQName = qName | stNodeExpansion =  '*')
    ;

predicate
    :    '[' predicateExpr ']'
    ;

predicateExpr
    :    expr (('and'|'or') expr)* |  '(' expr ')'
    ;

expr
    :    pathExpr (comparisonExpr | containmentExpr);

comparisonExpr  : (ComparisonOp ) literal;
containmentExpr : ('contains' | 'excludes') '(' StringLiteral ')';

literal : StringLiteral | numericLiteral | VarRef;
numericLiteral: IntegerLiteral | DecimalLiteral | DoubleLiteral;
qName: (NCName ':' NCName) | NCName;

// ---------------- Lexer Rules ---------------- //
Letter
    :  '\u0024' | '\u005f'|
       '\u0041'..'\u005a' | '\u0061'..'\u007a' |
       '\u00c0'..'\u00d6' | '\u00d8'..'\u00f6' |
       '\u00f8'..'\u00ff' | '\u0100'..'\u1fff' |
       '\u3040'..'\u318f' | '\u3300'..'\u337f' |
       '\u3400'..'\u3d2d' | '\u4e00'..'\u9fff' |
       '\uf900'..'\ufaff'
    ;

fragment Digit
	:	'0'..'9';
	
IntegerLiteral :  Digit+;
DecimalLiteral :  ('.' Digit+) | (Digit+  '.' Digit*);
DoubleLiteral  : (('.' Digit+) | (Digit+ ('.' Digit*)?)) ('e' | 'E') ('+' | '-')? Digit+;

StringLiteral : '"' ~('"')* '"' | '\'' ~('\'')* '\'';

ComparisonOp : '=' | '<' | '>' | '!=' | '<=' | '>=';

VarRef: '$' NCName;

NCName : (Letter) (Letter | ('0'..'9') | '.' | '-')*;

WS: (' '|'\t'|'\u000C') {skip();};