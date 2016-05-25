/* original parser id follows */
/* yysccsid[] = "@(#)yaccpar	1.9 (Berkeley) 02/21/93" */
/* (use YYMAJOR/YYMINOR for ifdefs dependent on parser version) */

#define YYBYACC 1
#define YYMAJOR 1
#define YYMINOR 9
#define YYPATCH 20140715

#define YYEMPTY        (-1)
#define yyclearin      (yychar = YYEMPTY)
#define yyerrok        (yyerrflag = 0)
#define YYRECOVERING() (yyerrflag != 0)
#define YYENOMEM       (-2)
#define YYEOF          0
#define YYPREFIX "yy"

#define YYPURE 0

#line 2 "P2.y"
	import java.lang.Math;
	import java.io.*;
	import java.util.StringTokenizer;
#line 25 "y.tab.c"

#if ! defined(YYSTYPE) && ! defined(YYSTYPE_IS_DECLARED)
/* Default: YYSTYPE is the semantic value type. */
typedef int YYSTYPE;
# define YYSTYPE_IS_DECLARED 1
#endif

/* compatibility with bison */
#ifdef YYPARSE_PARAM
/* compatibility with FreeBSD */
# ifdef YYPARSE_PARAM_TYPE
#  define YYPARSE_DECL() yyparse(YYPARSE_PARAM_TYPE YYPARSE_PARAM)
# else
#  define YYPARSE_DECL() yyparse(void *YYPARSE_PARAM)
# endif
#else
# define YYPARSE_DECL() yyparse(void)
#endif

/* Parameters sent to lex. */
#ifdef YYLEX_PARAM
# define YYLEX_DECL() yylex(void *YYLEX_PARAM)
# define YYLEX yylex(YYLEX_PARAM)
#else
# define YYLEX_DECL() yylex(void)
# define YYLEX yylex()
#endif

/* Parameters sent to yyerror. */
#ifndef YYERROR_DECL
#define YYERROR_DECL() yyerror(const char *s)
#endif
#ifndef YYERROR_CALL
#define YYERROR_CALL(msg) yyerror(msg)
#endif

extern int YYPARSE_DECL();

#define IF 257
#define ELSE 258
#define WHILE 259
#define FOR 260
#define COMP 261
#define DIFERENTES 262
#define MAY 263
#define MEN 264
#define MAYI 265
#define MENI 266
#define FNCT 267
#define NUMBER 268
#define VAR 269
#define AND 270
#define OR 271
#define FUNC 272
#define RETURN 273
#define PARAMETRO 274
#define PROC 275
#define YYERRCODE 256
typedef short YYINT;
static const YYINT yylhs[] = {                           -1,
    0,    0,    0,    1,    1,    1,    1,    2,    2,    2,
    2,    2,    2,    2,    2,    2,    2,    2,    2,    2,
    2,    2,    2,    2,    2,    2,    2,    2,    7,    7,
    7,    8,    3,    3,    3,    3,    3,    3,   16,   14,
    6,   15,   10,    9,   11,   12,   13,   13,   13,    4,
    5,    5,   17,   17,
};
static const YYINT yylen[] = {                            2,
    0,    2,    3,    2,    1,    3,    2,    1,    1,    8,
    3,    3,    3,    3,    3,    3,    3,    3,    3,    3,
    3,    3,    3,    2,    4,    2,    1,    4,    0,    1,
    3,    0,   14,   11,   10,   16,    8,    8,    1,    1,
    1,    0,    0,    1,    1,    1,    0,    1,    3,    1,
    1,    3,    1,    3,
};
static const YYINT yydefred[] = {                         1,
    0,   44,   45,   46,    0,    9,    0,   40,    0,   27,
   39,    0,    2,    0,    0,    0,    5,    0,    0,    0,
    0,    0,    0,    0,    0,    0,   26,    0,    0,    3,
    0,    7,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    4,    0,    0,    0,    0,   41,    0,
    0,    0,    0,   50,    0,   15,    6,    0,    0,    0,
    0,    0,    0,    0,   23,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,   25,    0,   28,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
   53,    0,    0,    0,    0,    0,    0,    0,   10,    0,
    0,    0,    0,    0,   37,   38,    0,   54,    0,   43,
    0,    0,   43,   35,    0,    0,   34,    0,    0,    0,
    0,    0,   33,    0,   43,   36,
};
static const YYINT yydgoto[] = {                          1,
   15,   16,   17,   55,  102,   18,   70,  123,   19,   81,
   20,   21,   74,   22,  107,   23,  103,
};
static const YYINT yysindex[] = {                         0,
    9,    0,    0,    0,  -50,    0,  -46,    0,  -13,    0,
    0,  -13,    0,  -13,   28,   75,    0,    4,    6,   20,
   38, -219, -219,  -13,  -13, -186,    0, -254,   54,    0,
   86,    0,  -13,  -13,  -13,  -13,  -13,  -13,  -13,  -13,
  -13,  -13,  -13,    0,  -13,  -13,  -13,  -13,    0,   58,
   61,   97,  108,    0,    1,    0,    0,  217,  -78,  225,
 -166, -207, -254, -158,    0,  119,  119,  -55,  108,   -7,
  108,  108,  108,   70,   78,   80,    0,   55,    0,  -13,
   81,   84,  -13,   67,    7,   12,   18,  108,   21,   23,
  108,  -13,  -32,  -32, -141,  -32,  -32,  108,  -32,  -32,
    0,  -99,   99,  -32,  -32,   88,   24,   27,    0, -141,
 -120,   29,   31,  -13,    0,    0,   99,    0, -103,    0,
   70,   34,    0,    0,  118,  -32,    0,   37,  -32,  -32,
   39,  -32,    0,   51,    0,    0,
};
static const YYINT yyrindex[] = {                         0,
    0,    0,    0,    0,    0,    0,   43,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,  130,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,   26,    0,    0,  -35,    0,    0,
    0,    0,  -37,    0,    0,    0,    0,  155,  125,   30,
  -31,   10,  136,   65,    0,  -12,  407,  160,   35,    0,
  122,  122,  -23,  123,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,   36,    0,    0,
   -1,    0,    0,    0,    0,    0,    0,  123,   66,   66,
    0,    0,  -59,   69,   69,    0,    0,    0,    0,    0,
    0,    0,    0,   49,    0,    0,  -33,    0,  -10,    0,
  122,    0,    0,    0,    0,    0,    0,    0,   69,    0,
    0,   69,    0,    0,    0,    0,
};
static const YYINT yygindex[] = {                         0,
  -91,  394,   33,    0,    0,   89,    0,    0,    0,  340,
    0,    0,   98,    0,   83,    0,  103,
};
#define YYTABLESIZE 526
static const YYINT yytable[] = {                         32,
   12,   99,  100,   11,  104,  105,   11,   14,   47,   18,
   18,   18,   18,   18,   25,   39,   40,   48,   13,   12,
   48,   11,   32,   47,  110,  109,   14,   18,   13,   32,
   13,   13,   13,   79,  129,   48,   80,   30,  132,   49,
   24,   12,   49,   45,   26,   46,   13,   32,   14,   49,
   21,   21,   21,   21,   21,   11,   36,   49,   38,   47,
   12,   18,   39,   40,   51,   51,   29,   14,   21,   29,
   20,   20,   20,   20,   20,   30,   31,   48,   30,   31,
   13,   54,   41,    8,    8,    8,    8,    8,   20,   47,
   52,   52,   47,   78,   56,   43,   41,   75,   42,   38,
   76,    8,   21,   39,   40,   22,   22,   22,   22,   22,
   50,   51,   40,   83,   32,   87,   43,   41,   85,   42,
   86,   89,   20,   22,   90,   92,  101,   43,   41,   93,
   42,   32,   32,   44,   94,    8,   32,   32,   43,   41,
   95,   42,  111,   96,   57,   97,  114,  118,  115,   43,
   41,  116,   42,  119,  122,  120,  126,   22,  128,  130,
   43,   32,   43,  133,   32,   17,   17,   17,   17,   17,
   24,   24,   24,   24,   24,  135,   19,   19,   19,   19,
   19,   43,  108,   17,   35,   36,   37,   38,   24,   77,
   42,   39,   40,   43,   19,   16,   16,   16,   16,   16,
   12,   12,   12,   12,   12,   33,   34,   35,   36,   37,
   38,  121,  117,   16,   39,   40,    0,   17,   12,    0,
    0,    0,   24,    0,    2,    0,    3,    4,   19,   18,
   18,   18,   18,   18,    5,    6,    7,    0,    0,    8,
    9,   10,   11,    0,    0,    0,   32,   16,   32,   32,
    0,    0,   12,    5,    6,    7,   32,   32,   32,    9,
   10,   32,   32,   32,   32,    2,    0,    3,    4,    0,
   21,   21,   21,    0,   21,    5,    6,    7,    0,    0,
    8,    9,   10,   11,    2,    0,    3,    4,    0,    0,
   20,   20,   20,    0,    5,    6,    7,    0,    0,    8,
    9,   10,   11,    8,    8,    8,    8,    8,    8,    0,
    0,    0,    8,    8,   33,   34,   35,   36,   37,   38,
    0,    0,    0,   39,   40,   22,   22,   22,   22,   22,
   22,    0,    0,    0,   22,   33,   34,   35,   36,   37,
   38,    0,    0,    0,   39,   40,   33,   34,   35,   36,
   37,   38,    0,    0,    0,   39,   40,   33,   34,   35,
   36,   37,   38,    0,    0,    0,   39,   40,   33,   34,
   35,   36,   37,   38,    0,    0,    0,   39,   40,   33,
   34,   35,   36,   37,   38,   17,   17,    0,   39,   40,
   24,   24,   24,   24,   24,   24,   19,   19,   19,   19,
   19,   19,   27,    0,    0,   28,    0,   29,   31,    0,
    0,   82,    0,   84,    0,   16,    0,   52,   53,    0,
    0,    0,    0,    0,    0,    0,   58,   59,   60,   61,
   62,   63,   64,   65,   66,   67,   68,  106,   69,   71,
   72,   73,    0,  112,  113,    0,    0,   14,    0,   14,
   14,   14,    0,    0,    0,    0,    0,    0,    0,  124,
  125,    0,  127,    0,    0,   14,    0,    0,  131,    0,
    0,  134,    0,   88,  136,    0,   91,    0,   34,   35,
   36,   37,   38,    0,    0,   98,   39,   40,   36,   37,
   38,    0,   31,   31,   39,   40,    0,   31,   31,   14,
    0,    0,    0,    0,    0,    0,    0,   73,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,   31,    0,    0,   31,
};
static const YYINT yycheck[] = {                         10,
   33,   93,   94,   41,   96,   97,   44,   40,   44,   41,
   42,   43,   44,   45,   61,  270,  271,   41,   10,   33,
   44,   59,   33,   59,  124,  125,   40,   59,   41,   40,
   43,   44,   45,   41,  126,   59,   44,   10,  130,   41,
   91,   33,   44,   40,   91,   40,   59,   15,   40,  269,
   41,   42,   43,   44,   45,   93,  264,   59,  266,   40,
   33,   93,  270,  271,  124,  125,   41,   40,   59,   44,
   41,   42,   43,   44,   45,   41,   41,   40,   44,   44,
   93,  268,   40,   41,   42,   43,   44,   45,   59,   41,
  124,  125,   44,   93,   41,   42,   43,   40,   45,  266,
   40,   59,   93,  270,  271,   41,   42,   43,   44,   45,
   22,   23,  271,   44,  125,   61,   42,   43,   41,   45,
   41,   41,   93,   59,   41,   59,  268,   42,   43,  123,
   45,   99,  100,   59,  123,   93,  104,  105,   42,   43,
  123,   45,   44,  123,   59,  123,   59,  268,  125,   42,
   43,  125,   45,  125,  258,  125,  123,   93,   41,  123,
   42,  129,   41,  125,  132,   41,   42,   43,   44,   45,
   41,   42,   43,   44,   45,  125,   41,   42,   43,   44,
   45,   59,  100,   59,  263,  264,  265,  266,   59,   93,
  125,  270,  271,  125,   59,   41,   42,   43,   44,   45,
   41,   42,   43,   44,   45,  261,  262,  263,  264,  265,
  266,  114,  110,   59,  270,  271,   -1,   93,   59,   -1,
   -1,   -1,   93,   -1,  257,   -1,  259,  260,   93,  261,
  262,  263,  264,  265,  267,  268,  269,   -1,   -1,  272,
  273,  274,  275,   -1,   -1,   -1,  257,   93,  259,  260,
   -1,   -1,   93,  267,  268,  269,  267,  268,  269,  273,
  274,  272,  273,  274,  275,  257,   -1,  259,  260,   -1,
  261,  262,  263,   -1,  265,  267,  268,  269,   -1,   -1,
  272,  273,  274,  275,  257,   -1,  259,  260,   -1,   -1,
  261,  262,  263,   -1,  267,  268,  269,   -1,   -1,  272,
  273,  274,  275,  261,  262,  263,  264,  265,  266,   -1,
   -1,   -1,  270,  271,  261,  262,  263,  264,  265,  266,
   -1,   -1,   -1,  270,  271,  261,  262,  263,  264,  265,
  266,   -1,   -1,   -1,  270,  261,  262,  263,  264,  265,
  266,   -1,   -1,   -1,  270,  271,  261,  262,  263,  264,
  265,  266,   -1,   -1,   -1,  270,  271,  261,  262,  263,
  264,  265,  266,   -1,   -1,   -1,  270,  271,  261,  262,
  263,  264,  265,  266,   -1,   -1,   -1,  270,  271,  261,
  262,  263,  264,  265,  266,  261,  262,   -1,  270,  271,
  261,  262,  263,  264,  265,  266,  261,  262,  263,  264,
  265,  266,    9,   -1,   -1,   12,   -1,   14,   15,   -1,
   -1,   72,   -1,   74,   -1,  261,   -1,   24,   25,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   33,   34,   35,   36,
   37,   38,   39,   40,   41,   42,   43,   98,   45,   46,
   47,   48,   -1,  104,  105,   -1,   -1,   41,   -1,   43,
   44,   45,   -1,   -1,   -1,   -1,   -1,   -1,   -1,  120,
  121,   -1,  123,   -1,   -1,   59,   -1,   -1,  129,   -1,
   -1,  132,   -1,   80,  135,   -1,   83,   -1,  262,  263,
  264,  265,  266,   -1,   -1,   92,  270,  271,  264,  265,
  266,   -1,   99,  100,  270,  271,   -1,  104,  105,   93,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,  114,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,  129,   -1,   -1,  132,
};
#define YYFINAL 1
#ifndef YYDEBUG
#define YYDEBUG 0
#endif
#define YYMAXTOKEN 275
#define YYUNDFTOKEN 295
#define YYTRANSLATE(a) ((a) > YYMAXTOKEN ? YYUNDFTOKEN : (a))
#if YYDEBUG
static const char *const yyname[] = {

"end-of-file",0,0,0,0,0,0,0,0,0,"'\\n'",0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
0,0,"'!'",0,0,0,0,0,0,"'('","')'","'*'","'+'","','","'-'",0,0,0,0,0,0,0,0,0,0,0,
0,0,"';'",0,"'='",0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
"'['",0,"']'",0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,"'{'",
"'|'","'}'",0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,"IF","ELSE","WHILE","FOR","COMP","DIFERENTES",
"MAY","MEN","MAYI","MENI","FNCT","NUMBER","VAR","AND","OR","FUNC","RETURN",
"PARAMETRO","PROC",0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,"illegal-symbol",
};
static const char *const yyrule[] = {
"$accept : list",
"list :",
"list : list '\\n'",
"list : list linea '\\n'",
"linea : exp ';'",
"linea : stmt",
"linea : linea exp ';'",
"linea : linea stmt",
"exp : VAR",
"exp : NUMBER",
"exp : VAR '[' initNum ']' '=' '{' listaDeListas '}'",
"exp : VAR '=' exp",
"exp : exp '*' exp",
"exp : exp '+' exp",
"exp : exp '-' exp",
"exp : '(' exp ')'",
"exp : exp COMP exp",
"exp : exp DIFERENTES exp",
"exp : exp MEN exp",
"exp : exp MENI exp",
"exp : exp MAY exp",
"exp : exp MAYI exp",
"exp : exp AND exp",
"exp : exp OR exp",
"exp : '!' exp",
"exp : FNCT '[' exp ']'",
"exp : RETURN exp",
"exp : PARAMETRO",
"exp : nombreProc '(' arglist ')'",
"arglist :",
"arglist : exp",
"arglist : arglist ',' exp",
"nop :",
"stmt : if_ '(' exp stop_ ')' '{' linea stop_ '}' ELSE '{' linea stop_ '}'",
"stmt : if_ '(' exp stop_ ')' '{' linea stop_ '}' nop stop_",
"stmt : while_ '(' exp stop_ ')' '{' linea stop_ '}' stop_",
"stmt : for_ '(' instrucciones stop_ ';' exp stop_ ';' instrucciones stop_ ')' '{' linea stop_ '}' stop_",
"stmt : funcion nombreProc '(' ')' '{' linea null_ '}'",
"stmt : procedimiento nombreProc '(' ')' '{' linea null_ '}'",
"procedimiento : PROC",
"funcion : FUNC",
"nombreProc : VAR",
"null_ :",
"stop_ :",
"if_ : IF",
"while_ : WHILE",
"for_ : FOR",
"instrucciones :",
"instrucciones : exp",
"instrucciones : instrucciones ',' exp",
"initNum : NUMBER",
"listaDeListas : lista",
"listaDeListas : listaDeListas '|' lista",
"lista : NUMBER",
"lista : lista ',' NUMBER",

};
#endif

int      yydebug;
int      yynerrs;

int      yyerrflag;
int      yychar;
YYSTYPE  yyval;
YYSTYPE  yylval;

/* define the initial stack-sizes */
#ifdef YYSTACKSIZE
#undef YYMAXDEPTH
#define YYMAXDEPTH  YYSTACKSIZE
#else
#ifdef YYMAXDEPTH
#define YYSTACKSIZE YYMAXDEPTH
#else
#define YYSTACKSIZE 10000
#define YYMAXDEPTH  10000
#endif
#endif

#define YYINITSTACKSIZE 200

typedef struct {
    unsigned stacksize;
    YYINT    *s_base;
    YYINT    *s_mark;
    YYINT    *s_last;
    YYSTYPE  *l_base;
    YYSTYPE  *l_mark;
} YYSTACKDATA;
/* variables for the parser stack */
static YYSTACKDATA yystack;
#line 232 "P2.y"



TablaDeSimbolos tablaDeSimbolos = new TablaDeSimbolos();
MaquinaDePila maquina = new MaquinaDePila(tablaDeSimbolos);
int i = 0;
int j = 0;
double[][] auxiliar;
Matriz matrizAux = new Matriz();
Funcion funcionAux;
boolean huboError;

String ins;
StringTokenizer st;

void yyerror(String s){
	huboError = true;
	System.out.println("error:"+s);
}

boolean newline;
int yylex(){
	String s;
	int tok = 0;
	Double d;
	if (!st.hasMoreTokens()){
		if (!newline){
			newline=true;
			return '\n'; //So we look like classic YACC example
		}
		else
			return 0;
	}
	s = st.nextToken();
	try{
		d = Double.valueOf(s);/*this may fail*/
		yylval = new ParserVal(d.doubleValue()); //SEE BELOW
		return NUMBER;
	}
	catch (Exception e){}
	if(esVariable(s)){
		if(s.equals("proc")){
			return PROC;
		}
		if(s.charAt(0) == '$'){
			yylval = new ParserVal((int)Integer.parseInt(s.substring(1)));
			return PARAMETRO;
		}
		if(s.equals("return")){
			return RETURN;
		}
		if(s.equals("func")){
			return FUNC;
		}
		if(s.equals("==")){
			return COMP;
		}
		if(s.equals("!=")){
			return DIFERENTES;
		}
		if(s.equals("<")){
			return MEN;
		}
		if(s.equals("<=")){
			return MENI;
		}
		if(s.equals(">")){
			return MAY;
		}
		if(s.equals(">=")){
			return MAYI;
		}
		if(s.equals("&&")){
			return AND;
		}
		if(s.equals("||")){
			return OR;
		}
		if(s.equals("if")){
			return IF;
		}
		if(s.equals("else")){
			return ELSE;
		}
		if(s.equals("while")){
			return WHILE;
		}
		if(s.equals("for")){
			return FOR;
		}
		boolean esFuncion = false;
		Object objeto = tablaDeSimbolos.encontrar(s);
		if(objeto instanceof Funcion){
			funcionAux = (Funcion)objeto;
			yylval = new ParserVal(objeto);			
			esFuncion = true;
			return FNCT;
		}
		if(!esFuncion){
			yylval = new ParserVal(s);
			return VAR;
		}
	}
	else{
		tok = s.charAt(0);
	}
	//System.out.println("Token: " + tok);
	return tok;
}

String reservados[] = {"=", "{", "}", ",", "*", "+", "-", "(", ")", "|", "[", "]", ";", "!"};

boolean esVariable(String s){
	boolean cumple = true;
	for(int i = 0; i < reservados.length; i++)
		if(s.equals(reservados[i]))
			cumple = false;
	return cumple;
}

void dotest() throws Exception{
	tablaDeSimbolos.insertar("Invertir", new MaquinaDePila.Invertir());
	tablaDeSimbolos.insertar("Imprimir", new MaquinaDePila.Imprimir());
	tablaDeSimbolos.insertar("Sumar", new MaquinaDePila.Sumar());
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	while (true){
		huboError = false;
		try{
			ins = in.readLine();
		}
		catch (Exception e){}
		st = new StringTokenizer(ins);
		newline=false;
		//maquina = new MaquinaDePila(tablaDeSimbolos);
		yyparse();
		if(!huboError)
			maquina.ejecutar();
	}
}

public static void main(String args[]) throws Exception{
	Parser par = new Parser(false);
	par.dotest();
}
#line 527 "y.tab.c"

#if YYDEBUG
#include <stdio.h>		/* needed for printf */
#endif

#include <stdlib.h>	/* needed for malloc, etc */
#include <string.h>	/* needed for memset */

/* allocate initial stack or double stack size, up to YYMAXDEPTH */
static int yygrowstack(YYSTACKDATA *data)
{
    int i;
    unsigned newsize;
    YYINT *newss;
    YYSTYPE *newvs;

    if ((newsize = data->stacksize) == 0)
        newsize = YYINITSTACKSIZE;
    else if (newsize >= YYMAXDEPTH)
        return YYENOMEM;
    else if ((newsize *= 2) > YYMAXDEPTH)
        newsize = YYMAXDEPTH;

    i = (int) (data->s_mark - data->s_base);
    newss = (YYINT *)realloc(data->s_base, newsize * sizeof(*newss));
    if (newss == 0)
        return YYENOMEM;

    data->s_base = newss;
    data->s_mark = newss + i;

    newvs = (YYSTYPE *)realloc(data->l_base, newsize * sizeof(*newvs));
    if (newvs == 0)
        return YYENOMEM;

    data->l_base = newvs;
    data->l_mark = newvs + i;

    data->stacksize = newsize;
    data->s_last = data->s_base + newsize - 1;
    return 0;
}

#if YYPURE || defined(YY_NO_LEAKS)
static void yyfreestack(YYSTACKDATA *data)
{
    free(data->s_base);
    free(data->l_base);
    memset(data, 0, sizeof(*data));
}
#else
#define yyfreestack(data) /* nothing */
#endif

#define YYABORT  goto yyabort
#define YYREJECT goto yyabort
#define YYACCEPT goto yyaccept
#define YYERROR  goto yyerrlab

int
YYPARSE_DECL()
{
    int yym, yyn, yystate;
#if YYDEBUG
    const char *yys;

    if ((yys = getenv("YYDEBUG")) != 0)
    {
        yyn = *yys;
        if (yyn >= '0' && yyn <= '9')
            yydebug = yyn - '0';
    }
#endif

    yynerrs = 0;
    yyerrflag = 0;
    yychar = YYEMPTY;
    yystate = 0;

#if YYPURE
    memset(&yystack, 0, sizeof(yystack));
#endif

    if (yystack.s_base == NULL && yygrowstack(&yystack) == YYENOMEM) goto yyoverflow;
    yystack.s_mark = yystack.s_base;
    yystack.l_mark = yystack.l_base;
    yystate = 0;
    *yystack.s_mark = 0;

yyloop:
    if ((yyn = yydefred[yystate]) != 0) goto yyreduce;
    if (yychar < 0)
    {
        if ((yychar = YYLEX) < 0) yychar = YYEOF;
#if YYDEBUG
        if (yydebug)
        {
            yys = yyname[YYTRANSLATE(yychar)];
            printf("%sdebug: state %d, reading %d (%s)\n",
                    YYPREFIX, yystate, yychar, yys);
        }
#endif
    }
    if ((yyn = yysindex[yystate]) && (yyn += yychar) >= 0 &&
            yyn <= YYTABLESIZE && yycheck[yyn] == yychar)
    {
#if YYDEBUG
        if (yydebug)
            printf("%sdebug: state %d, shifting to state %d\n",
                    YYPREFIX, yystate, yytable[yyn]);
#endif
        if (yystack.s_mark >= yystack.s_last && yygrowstack(&yystack) == YYENOMEM)
        {
            goto yyoverflow;
        }
        yystate = yytable[yyn];
        *++yystack.s_mark = yytable[yyn];
        *++yystack.l_mark = yylval;
        yychar = YYEMPTY;
        if (yyerrflag > 0)  --yyerrflag;
        goto yyloop;
    }
    if ((yyn = yyrindex[yystate]) && (yyn += yychar) >= 0 &&
            yyn <= YYTABLESIZE && yycheck[yyn] == yychar)
    {
        yyn = yytable[yyn];
        goto yyreduce;
    }
    if (yyerrflag) goto yyinrecovery;

    YYERROR_CALL("syntax error");

    goto yyerrlab;

yyerrlab:
    ++yynerrs;

yyinrecovery:
    if (yyerrflag < 3)
    {
        yyerrflag = 3;
        for (;;)
        {
            if ((yyn = yysindex[*yystack.s_mark]) && (yyn += YYERRCODE) >= 0 &&
                    yyn <= YYTABLESIZE && yycheck[yyn] == YYERRCODE)
            {
#if YYDEBUG
                if (yydebug)
                    printf("%sdebug: state %d, error recovery shifting\
 to state %d\n", YYPREFIX, *yystack.s_mark, yytable[yyn]);
#endif
                if (yystack.s_mark >= yystack.s_last && yygrowstack(&yystack) == YYENOMEM)
                {
                    goto yyoverflow;
                }
                yystate = yytable[yyn];
                *++yystack.s_mark = yytable[yyn];
                *++yystack.l_mark = yylval;
                goto yyloop;
            }
            else
            {
#if YYDEBUG
                if (yydebug)
                    printf("%sdebug: error recovery discarding state %d\n",
                            YYPREFIX, *yystack.s_mark);
#endif
                if (yystack.s_mark <= yystack.s_base) goto yyabort;
                --yystack.s_mark;
                --yystack.l_mark;
            }
        }
    }
    else
    {
        if (yychar == YYEOF) goto yyabort;
#if YYDEBUG
        if (yydebug)
        {
            yys = yyname[YYTRANSLATE(yychar)];
            printf("%sdebug: state %d, error recovery discards token %d (%s)\n",
                    YYPREFIX, yystate, yychar, yys);
        }
#endif
        yychar = YYEMPTY;
        goto yyloop;
    }

yyreduce:
#if YYDEBUG
    if (yydebug)
        printf("%sdebug: state %d, reducing by rule %d (%s)\n",
                YYPREFIX, yystate, yyn, yyrule[yyn]);
#endif
    yym = yylen[yyn];
    if (yym)
        yyval = yystack.l_mark[1-yym];
    else
        memset(&yyval, 0, sizeof yyval);
    switch (yyn)
    {
case 4:
#line 47 "P2.y"
	{yyval = yystack.l_mark[-1];}
break;
case 5:
#line 48 "P2.y"
	{yyval = yystack.l_mark[0];}
break;
case 6:
#line 49 "P2.y"
	{yyval = yystack.l_mark[-2];}
break;
case 7:
#line 50 "P2.y"
	{yyval = yystack.l_mark[-1];}
break;
case 8:
#line 53 "P2.y"
	{				
				yyval = new ParserVal(maquina.agregarOperacion("varPush_Eval")); 
				maquina.agregar(yystack.l_mark[0].sval);
			}
break;
case 9:
#line 57 "P2.y"
	{
				yyval = new ParserVal(maquina.agregarOperacion("constPush"));
				maquina.agregar(yystack.l_mark[0].dval);
			}
break;
case 10:
#line 61 "P2.y"
	{
				matrizAux = new Matriz(auxiliar);
				yyval = new ParserVal(maquina.agregarOperacion("constPush"));
       			maquina.agregar(matrizAux);
       			maquina.agregarOperacion("varPush");
		        maquina.agregar(yystack.l_mark[-7].sval);
		        maquina.agregarOperacion("asignar");
		        maquina.agregarOperacion("varPush_Eval"); 
				maquina.agregar(yystack.l_mark[-7].sval);
			}
break;
case 11:
#line 71 "P2.y"
	{
				yyval = new ParserVal(yystack.l_mark[0].ival);
				maquina.agregarOperacion("varPush");
		        maquina.agregar(yystack.l_mark[-2].sval);
		        maquina.agregarOperacion("asignar");
		        maquina.agregarOperacion("varPush_Eval"); 
				maquina.agregar(yystack.l_mark[-2].sval);
			}
break;
case 12:
#line 79 "P2.y"
	{
				yyval = new ParserVal(yystack.l_mark[-2].ival);
				maquina.agregarOperacion("multiplicar");
			}
break;
case 13:
#line 83 "P2.y"
	{
				yyval = new ParserVal(yystack.l_mark[-2].ival);
				maquina.agregarOperacion("sumar");
			}
break;
case 14:
#line 87 "P2.y"
	{
				yyval = new ParserVal(yystack.l_mark[-2].ival);
				maquina.agregarOperacion("restar");
			}
break;
case 15:
#line 91 "P2.y"
	{
				yyval = new ParserVal(yystack.l_mark[-1].ival);
			}
break;
case 16:
#line 94 "P2.y"
	{
				 maquina.agregarOperacion("comparar");
				 yyval = yystack.l_mark[-2];
			}
break;
case 17:
#line 98 "P2.y"
	{
				 maquina.agregarOperacion("compararNot");
				 yyval = yystack.l_mark[-2];
			}
break;
case 18:
#line 102 "P2.y"
	{
				 maquina.agregarOperacion("menor");
				 yyval = yystack.l_mark[-2];
			}
break;
case 19:
#line 106 "P2.y"
	{
				 maquina.agregarOperacion("menorIgual");
				 yyval = yystack.l_mark[-2];
			}
break;
case 20:
#line 110 "P2.y"
	{
				 maquina.agregarOperacion("mayor");
				 yyval = yystack.l_mark[-2];
			}
break;
case 21:
#line 114 "P2.y"
	{
				 maquina.agregarOperacion("mayorIgual");
				 yyval = yystack.l_mark[-2];
			}
break;
case 22:
#line 118 "P2.y"
	{
				maquina.agregarOperacion("and");
				 yyval = yystack.l_mark[-2];
			}
break;
case 23:
#line 122 "P2.y"
	{
				maquina.agregarOperacion("or");
				 yyval = yystack.l_mark[-2];
			}
break;
case 24:
#line 126 "P2.y"
	{
				maquina.agregarOperacion("negar");
				yyval = yystack.l_mark[0];
			}
break;
case 25:
#line 130 "P2.y"
	{ 
				yyval = new ParserVal(yystack.l_mark[-1].ival);
      			maquina.agregar((Funcion)(yystack.l_mark[-3].obj));
			}
break;
case 26:
#line 134 "P2.y"
	{ yyval = yystack.l_mark[0]; maquina.agregarOperacion("_return"); }
break;
case 27:
#line 136 "P2.y"
	{ yyval = new ParserVal(maquina.agregarOperacion("push_parametro")); maquina.agregar((int)yystack.l_mark[0].ival); }
break;
case 28:
#line 138 "P2.y"
	{ yyval = new ParserVal(maquina.agregarOperacionEn("invocar",(yystack.l_mark[-3].ival))); maquina.agregar(null); }
break;
case 30:
#line 142 "P2.y"
	{yyval = yystack.l_mark[0]; maquina.agregar("Limite");}
break;
case 31:
#line 143 "P2.y"
	{yyval = yystack.l_mark[-2]; maquina.agregar("Limite");}
break;
case 32:
#line 146 "P2.y"
	{yyval = new ParserVal(maquina.agregarOperacion("nop"));}
break;
case 33:
#line 149 "P2.y"
	{
				yyval = yystack.l_mark[-13];
				maquina.agregar(yystack.l_mark[-7].ival, yystack.l_mark[-13].ival + 1);
				maquina.agregar(yystack.l_mark[-2].ival, yystack.l_mark[-13].ival + 2);
				maquina.agregar(maquina.numeroDeElementos() - 1, yystack.l_mark[-13].ival + 3);
			}
break;
case 34:
#line 155 "P2.y"
	{
				yyval = yystack.l_mark[-10];
				maquina.agregar(yystack.l_mark[-4].ival, yystack.l_mark[-10].ival + 1);
				maquina.agregar(yystack.l_mark[-1].ival, yystack.l_mark[-10].ival + 2);
				maquina.agregar(maquina.numeroDeElementos() - 1, yystack.l_mark[-10].ival + 3);
			}
break;
case 35:
#line 161 "P2.y"
	{
				yyval = yystack.l_mark[-9];
				maquina.agregar(yystack.l_mark[-3].ival, yystack.l_mark[-9].ival + 1);
				maquina.agregar(yystack.l_mark[0].ival, yystack.l_mark[-9].ival + 2);
			}
break;
case 36:
#line 166 "P2.y"
	{
				yyval = yystack.l_mark[-15];
				maquina.agregar(yystack.l_mark[-10].ival, yystack.l_mark[-15].ival + 1);
				maquina.agregar(yystack.l_mark[-7].ival, yystack.l_mark[-15].ival + 2);
				maquina.agregar(yystack.l_mark[-3].ival, yystack.l_mark[-15].ival + 3);
				maquina.agregar(yystack.l_mark[0].ival, yystack.l_mark[-15].ival + 4);
			}
break;
case 39:
#line 177 "P2.y"
	{ maquina.agregarOperacion("declaracion"); }
break;
case 40:
#line 179 "P2.y"
	{ maquina.agregarOperacion("declaracion"); }
break;
case 41:
#line 182 "P2.y"
	{yyval = new ParserVal(maquina.agregar(yystack.l_mark[0].sval));}
break;
case 42:
#line 185 "P2.y"
	{maquina.agregar(null);}
break;
case 43:
#line 188 "P2.y"
	{yyval = new ParserVal(maquina.agregarOperacion("stop"));}
break;
case 44:
#line 191 "P2.y"
	{
			yyval = new ParserVal(maquina.agregarOperacion("_if_then_else"));
	        maquina.agregarOperacion("stop");/*then*/
	        maquina.agregarOperacion("stop");/*else*/
	        maquina.agregarOperacion("stop");/*siguiente comando*/
		}
break;
case 45:
#line 199 "P2.y"
	{
			yyval = new ParserVal(maquina.agregarOperacion("_while"));
	        maquina.agregarOperacion("stop");/*cuerpo*/
	        maquina.agregarOperacion("stop");/*final*/
		}
break;
case 46:
#line 206 "P2.y"
	{
			yyval = new ParserVal(maquina.agregarOperacion("_for"));
	        maquina.agregarOperacion("stop");/*condicion*/
	        maquina.agregarOperacion("stop");/*instrucción final*/
	        maquina.agregarOperacion("stop");/*cuerpo*/
	        maquina.agregarOperacion("stop");/*final*/
		}
break;
case 47:
#line 214 "P2.y"
	{ yyval = new ParserVal(maquina.agregarOperacion("nop"));}
break;
case 48:
#line 215 "P2.y"
	{yyval = yystack.l_mark[0];}
break;
case 49:
#line 216 "P2.y"
	{yyval = yystack.l_mark[-2];}
break;
case 50:
#line 219 "P2.y"
	{i = 0; j = 0; auxiliar = new double[(int)yystack.l_mark[0].dval][(int)yystack.l_mark[0].dval];}
break;
case 51:
#line 222 "P2.y"
	{j = 0; i++;}
break;
case 52:
#line 223 "P2.y"
	{ i++; j = 0;}
break;
case 53:
#line 226 "P2.y"
	{auxiliar[i][j] = yystack.l_mark[0].dval; j++;}
break;
case 54:
#line 227 "P2.y"
	{auxiliar[i][j] = yystack.l_mark[0].dval; j++;}
break;
#line 1019 "y.tab.c"
    }
    yystack.s_mark -= yym;
    yystate = *yystack.s_mark;
    yystack.l_mark -= yym;
    yym = yylhs[yyn];
    if (yystate == 0 && yym == 0)
    {
#if YYDEBUG
        if (yydebug)
            printf("%sdebug: after reduction, shifting from state 0 to\
 state %d\n", YYPREFIX, YYFINAL);
#endif
        yystate = YYFINAL;
        *++yystack.s_mark = YYFINAL;
        *++yystack.l_mark = yyval;
        if (yychar < 0)
        {
            if ((yychar = YYLEX) < 0) yychar = YYEOF;
#if YYDEBUG
            if (yydebug)
            {
                yys = yyname[YYTRANSLATE(yychar)];
                printf("%sdebug: state %d, reading %d (%s)\n",
                        YYPREFIX, YYFINAL, yychar, yys);
            }
#endif
        }
        if (yychar == YYEOF) goto yyaccept;
        goto yyloop;
    }
    if ((yyn = yygindex[yym]) && (yyn += yystate) >= 0 &&
            yyn <= YYTABLESIZE && yycheck[yyn] == yystate)
        yystate = yytable[yyn];
    else
        yystate = yydgoto[yym];
#if YYDEBUG
    if (yydebug)
        printf("%sdebug: after reduction, shifting from state %d \
to state %d\n", YYPREFIX, *yystack.s_mark, yystate);
#endif
    if (yystack.s_mark >= yystack.s_last && yygrowstack(&yystack) == YYENOMEM)
    {
        goto yyoverflow;
    }
    *++yystack.s_mark = (YYINT) yystate;
    *++yystack.l_mark = yyval;
    goto yyloop;

yyoverflow:
    YYERROR_CALL("yacc stack overflow");

yyabort:
    yyfreestack(&yystack);
    return (1);

yyaccept:
    yyfreestack(&yystack);
    return (0);
}
