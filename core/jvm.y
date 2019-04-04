%{
    #include <stdio.h>
    #define YYSTYPE char* /*a Yacc variable which has the value of returned token */
%}
%token T_VAL
%token T_NUM
%token EQ
%%

file: record file | record;
record: T_VAL EQ T_NUM
      {
         printf("%s is now %s years old!!1", $1, $3);
    };
%%

int main()
{
    yyparse();
    return 0;
}
int yyerror(char* msg)
{
    printf("Error: %s encountered \n", msg);
}
