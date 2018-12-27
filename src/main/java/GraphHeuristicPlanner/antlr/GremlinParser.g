grammar GremlinParser;

options {
	output=AST;
    ASTLabelType=CommonTree;
    backtrack=true;
}

tokens {
	VAR;
	ARG;
	ARGS;
	
	FUNC;
	NS; // function namespace
	NAME; // function local name
	FUNC_NAME; // function name : namespace? : local_function_name
	
	PATH;
	GPATH;
	
	STEP;
	TOKEN;
	PREDICATE;
	PREDICATES;
	
	// tokens
	SELF; // represents '.'
	HISTORY; // represents '..'
	
	FUNC_CALL;

	IF;
	ELSE;
	COND;
	BLOCK;
	
	FOREACH;
	WHILE;
	REPEAT;
	INCLUDE;
	SCRIPT;
	
	// for atoms
    INT;
    LONG;
    FLOAT;
    DOUBLE;
    
	STR;
    ARR;

    BOOL;
    NULL;
    RANGE;

	PROPERTY_CALL;
	VARIABLE_CALL;
	COLLECTION_CALL;
}

@lexer::header  {package com.atri.GraphHeuristicPlanner;}

@parser::header {package com.atri.GraphHeuristicPlanner;}

@lexer::members 
        {
            /* ANTLR guys by default just print exceptions into System.err, we don't need that */
            public void reportError(RecognitionException e) {
                throw new RuntimeException("Syntax error at " + e.line + "-" + e.charPositionInLine + ": " + this.getErrorMessage(e, this.getTokenNames()));
            }
        }

@parser::members 
        {
            /* ANTLR guys by default just print exceptions into System.err, we don't need that */
            public void reportError(RecognitionException e) {
                throw new RuntimeException("Syntax error at " + e.line + "-" + e.charPositionInLine + ": " + this.getErrorMessage(e, this.getTokenNames()));
            }
        }

program	
    :	COMMENT+
    |   (statement? NEWLINE)+
	;


COMMENT
    : '#' .* NEWLINE {skip();}
    ;

gpath_statement	
    : step ('/' step)* -> ^(GPATH step+)
	;

step	
    :	token ('[' statement ']')* -> ^(STEP ^(TOKEN token) ^(PREDICATES ^(PREDICATE statement)*))
    ;

token
	:   function_call 
    |   StringLiteral	-> ^(STR StringLiteral)
	|	PROPERTY	    -> ^(PROPERTY_CALL PROPERTY)
	|	VARIABLE        -> ^(VARIABLE_CALL VARIABLE)
	|   IDENTIFIER
    |   '..'
	;


statement
    :   if_statement
	|	foreach_statement
	|	while_statement
	|	repeat_statement
	|	path_definition_statement
	|	function_definition_statement
	|	include_statement
	|   script_statement
    |   atom ':=' statement  -> ^(VAR atom statement)	
	|	expression (('and'^|'or'^) expression)*
	;

include_statement
	:	'include' StringLiteral -> ^(INCLUDE StringLiteral)
	;

script_statement
    :   'script' StringLiteral -> ^(SCRIPT StringLiteral) 
    ;

if_statement 
	:	'if' statement NEWLINE 
           if_block=block
        ('else'
           else_block=block)?
        'end' -> ^(IF ^(COND statement) $if_block ^(ELSE $else_block)?)
	;

foreach_statement
	:	'foreach' VARIABLE 'in' statement NEWLINE 
	       block 
	    'end' -> ^(FOREACH VARIABLE statement block)
	;
	
while_statement
	:	'while' statement NEWLINE 
	       block 
	    'end' -> ^(WHILE ^(COND statement) block)
	;

repeat_statement
	:	'repeat' statement NEWLINE
		   block
		'end' -> ^(REPEAT statement block)
	;
	
path_definition_statement
	:	'path' IDENTIFIER NEWLINE
		   statement NEWLINE
		'end' -> ^(PATH IDENTIFIER statement)
	;
	
function_definition_statement
	:	'func' function_name '(' formal_arguments* ')' NEWLINE
		   block
		'end' -> ^(FUNC function_name ^(ARGS formal_arguments*) block) 
	;
	
formal_arguments
	:	VARIABLE (',' VARIABLE)* -> ^(ARG VARIABLE)+
	;

block	
    :	(block_body | NEWLINE)* -> ^(BLOCK block_body*)
	;

block_body
    : statement
    | COMMENT NEWLINE
    ;

expression
	:	operation (('='^ | '!='^ | '<'^ | '<='^ | '>'^ | '>='^) operation)*
	;

operation
	:	binary_operation (('+'^|'-'^) binary_operation)*
	;
	
binary_operation
	:	atom (('*'^|'div'^|'mod'^) atom)*
	;
	
function_call
	:	function_name '(' function_call_params* ')' -> ^(FUNC_CALL function_name ^(ARGS function_call_params*))
	;
	
function_name
	:	ns=IDENTIFIER ':' ln=IDENTIFIER -> ^(FUNC_NAME ^(NS $ns) ^(NAME $ln))   // namespace : local_function_name
	;
	
function_call_params
	: function_call_param (',' function_call_param)* -> ^(ARG function_call_param)+
	;

function_call_param
    : statement
    ;
	
atom
	:   G_INT           -> ^(INT G_INT)
	|   G_LONG          -> ^(LONG G_LONG)
	|   G_FLOAT         -> ^(FLOAT G_FLOAT)
	|   G_DOUBLE        -> ^(DOUBLE G_DOUBLE)
	|   range
    |   gpath_statement
    |   b=BOOLEAN       -> ^(BOOL $b)
    |   NULL
	|	'('! statement ')'!
	;

StringLiteral
	: '"' DoubleStringCharacter* '"'
	| '\'' SingleStringCharacter* '\''
	;


G_INT
    : '-'? ('0'..'9')+ 
    ;

G_LONG
    : '-'? ('0'..'9')+ 'l' 
    ;

G_FLOAT
    : G_INT '.' G_INT
    ;

G_DOUBLE
    : G_FLOAT 'd'
    ;
    
BOOLEAN
    : 'true'
    | 'false'
    ;

NULL
    : 'null'
    ;

range
    :   min=G_INT '..' max=G_INT  -> ^(RANGE $min $max)
    ;

VARIABLE
    :   '$' IDENTIFIER
    ;

PROPERTY
	:	'@' IDENTIFIER	
	;
	
IDENTIFIER 
	: 	('a'..'z'|'A'..'Z'|'_'|'-'|'.'|'0'..'9')+
    ;

NEWLINE
	: '\n'		// Line feed.
	| '\r'		// Carriage return.
	| '\u2028'	// Line separator.
	| '\u2029'	// Paragraph separator.
	;

WS      
    : (' '|'\t')+ {skip();}  //(' '|'\t'|'\n'|'\r')+ {skip();} 
	;
	
fragment DoubleStringCharacter
	: ~('"' | '\\' | NEWLINE)	
	| '\\' EscapeSequence
	;

fragment SingleStringCharacter
	: ~('\'' | '\\' | NEWLINE)	
	| '\\' EscapeSequence
	;

fragment EscapeSequence
	: CharacterEscapeSequence
	| '0'
	| HexEscapeSequence
	| UnicodeEscapeSequence
	;

fragment CharacterEscapeSequence
	: SingleEscapeCharacter
	| NonEscapeCharacter
	;

fragment NonEscapeCharacter
	: ~(EscapeCharacter | NEWLINE)
	;

fragment SingleEscapeCharacter
	: '\'' | '"' | '\\' | 'b' | 'f' | 'n' | 'r' | 't' | 'v'
	;

fragment EscapeCharacter
	: SingleEscapeCharacter
	| DecimalDigit
	| 'x'
	| 'u'
	;
	
fragment HexEscapeSequence
	: 'x' HexDigit HexDigit
	;
	
fragment UnicodeEscapeSequence
	: 'u' HexDigit HexDigit HexDigit HexDigit
	;

fragment HexDigit
	: DecimalDigit | ('a'..'f') | ('A'..'F')
	;

fragment DecimalDigit
	: ('0'..'9')
	;
