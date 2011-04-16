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
@parser::members {
  org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(getClass());
}

// ---------------- Parser Rules ---------------- //

qualifiedIdentifier returns [QualifiedIdentifier result]
@init {	List<String> path = new ArrayList<String> (); } : 
    id=Identifier { path.add(id.getText()); } (':' id=Identifier { path.add(id.getText()); })* 
{
    log.debug("qualifiedIdentifier from "+path);
    result = new QualifiedIdentifier(path.toArray(new String[path.size()]));
};

require returns [Require result] : 'require' id=qualifiedIdentifier ';' {
    log.debug("require "+id);
    result = new Require(id);
};


moduleDecl returns [Module result] : 'module' moduleId=qualifiedIdentifier '{'  '}' {
    result = new Module(moduleId);
};

/*
constantDecl : ('public'|'private'('[' Identifier (',' Identifier)+ ']'))? NCName '=' literal ;

functionDecl : 'func';

literal : StringLiteral | IntegerLiteral | DoubleLiteral;
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
DecimalLiteral :  ('.' Digit+) | (Digit+  '.' Digit*);
DoubleLiteral  : (('.' Digit+) | (Digit+ ('.' Digit*)?)) ('e' | 'E') ('+' | '-')? Digit+;

StringLiteral : '"' ~('"')* '"' | '\'' ~('\'')* '\'';

ComparisonOp : '==' | '<' | '>' | '!=' | '<=' | '>=';

IdentifierFirstChar
	:	 'a'..'z' | 'A' .. 'Z' | '_';

Identifier
	: IdentifierFirstChar (IdentifierFirstChar | '0'..'9' )*;

WS: (' '|'\t'|'\u000C') {skip();};