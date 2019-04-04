%{
    #include "y.tab.h"
    #include <stdio.h>
    #include <string.h>
    extern char* yylval;
%}

%%

[A-Za-z]+ { yylval = strdup(yytext); return T_VAL; }

"=" { return EQ; }

[0-9]+ { yylval = strdup(yytext); return T_NUM; }
%%

int yywrap()
{
    return 1;
}
