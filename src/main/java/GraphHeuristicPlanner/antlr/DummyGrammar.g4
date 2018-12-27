grammar DummyGrammar;

dummygrammar : query+;
query : nodename '.' matchespredicate '.' matchespredicate CRLF;
matchesclause : 'MATCHES';
whereclause : 'WHERE';
matchespredicate : matchesclause | whereclause '(' literal ')' | ' ';
literal : (TEXT | ' ')+;
nodename: (TEXT)+;

fragment DIGIT : [0-9];
fragment TWODIGIT : DIGIT DIGIT;
fragment LETTER : [A-Za-z];

TEXT : LETTER+;
CRLF : '\r'? '\n' | '\r';