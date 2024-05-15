lexer grammar LexerReact ;
COMMA: ',';
OPEN_SQUARE: '[';
CLOSE_SQUARE: ']';
OPEN_BRACE: '{';
CLOSE_BRACE: '}';
OPEN_PAREN: '(' ;
CLOSE_PAREN: ')';
COLON: ':';
DOT: '.';
ARROW: '=>';
ASSIGN: '=';
MINUS: '-';
NEQUAL: '=!';
NOT: '!';
OR: '||';
AND: '&&';
PLUS: '+';
PLE: '+=';
PLPL: '++';
QUESTION: '?';
SIME: ';';
DOLLAR: '$';
MOD: '%';
POWER :'^';
HASHTAG: '#';
MULTI: '*';
SINGLE_QUOTE : '\'';
D_C : '"';
//NUMBER : [0-9]+;
Sdoular: 'Sdoular';
EXPENSES:'expenses';
CONST: 'const';
FUNCTION: 'function';
BREAK: 'break';
CONTINUE : 'continue';
RETURN: 'return';
IF: 'if';
ELSE: 'else';
ELSE_IF : 'else if';
FOR: 'for';
FOREACH : 'foreach' ;
WHILE : 'while';
DO : 'do';
CLASS: 'class';
VAR: 'var';
LET: 'let';
EXPORT: 'export' ;
DEFAULT: 'default';
SWITCH : 'switch';
CASE : 'case';
IMPORT: 'import';
NULL:'null';
DOCUMNET: 'document';
FROM: 'from';
Backtick: '`';
LT : '<';
LT_EQ : '<=';
GT : '>';
GT_EQ : '>=';
EQ : '==';
NOT_EQ1 : '!=';
JSX_SLASH_OR_DIV: '/';
BACKSLASH : '\\';
COMMENT: '//' ~[\r\n]*;
TYPE: 'type';
TRUE :'true';
FALSE : 'false';
DATATYPE_:'string' |'number';
REACT_:'React' ;
CREATEELEMENT : 'createElement';
REACTDOM: 'ReacttDOM';
USESTATE_:'useState';
USEEFFECT_:'useEffect';
USEREF_:'useRef';
CONSOLE_:'console';
LOG_:'log';
INPUT_:'input';
ONCHANGE_:'onChange';
VALUE_:'value';
PLACEHOLDER_:'placeholder';
DISABLED_:'disabled ';
ONFOCUS_:'onFocus';
ONCLICK_:'onclick';
HEIGHT: 'height';
WIDTH: 'width';
BUTTON_:'button';
MAP_:'map';
CLASS_NAME:'className';
MINUS_MINUS : '--';
OPERATION:PLUS|MINUS|PLPL|MINUS_MINUS|PLE|'-='|MULTI|EQ;
SYNTAX : 'div' |'li' |'p' |'ul' |  'main' | 'BrowserRouter' | 'Switch' | 'Route' | 'img'|'react'|'h3';
 E : 'E'|'e';

 ONE_CHAR_LETTER :
'\'' ( ~'\'' | '\'\'' ) '\''
 ;

 STRING_LITERAL
  : '\'' ( ~'\'' | '\'\'' )* '\''
  ;

IDENTIFIER
 : '"' (~'"' | '""')* '"'
 //| '`' (~'`' | '``')* '`'
 //| '[' ~']'* ']'
 //| RANDOM_NAME
 ;
NUMERIC_LITERAL
  : DIGIT+ ( '.' DIGIT* )? ( E [-+]? DIGIT+ )?
  | '.' DIGIT+ ( E [-+]? DIGIT+ )?
  ;

 RANDOM_NAME :
 [a-zA-Z_] [a-zA-Z_0-9]*
 ;


WS: [ \t\r\n]+ -> skip;

MULTILINE_COMMENT
 : '/*' .*? ( '*/' | EOF ) -> channel(HIDDEN)
 ;

SPACES
 : [ \u000B\t\r\n] -> channel(HIDDEN)
 ;
 UNEXPECTED_CHAR
   :  .
   ;



fragment DIGIT : [0-9];



//HTTP:(JSX_SLASH|SYNTAX|DOT|COMMA);

