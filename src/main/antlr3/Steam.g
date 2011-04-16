grammar Steam;

/*
  
 */

/*
options { 
  output = AST;
  ASTLabelType=CommonTree; // type of $stat.tree ref etc... 
}
*/

@lexer::header {
  package steam.parser;
}
@parser::header {
  package steam.parser;
  import steam.lang.*;
}

// ---------------- Parser Rules ---------------- //

require returns [Require result] : 'require' NCName ';' {
	System.out.println("invoke "+$NCName.text);
	result = new Require($NCName.text);
} ;

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

ComparisonOp : '==' | '<' | '>' | '!=' | '<=' | '>=';

NCName : (Letter) (Letter | ('0'..'9') | '.' | '-')*;

WS: (' '|'\t'|'\u000C') {skip();};