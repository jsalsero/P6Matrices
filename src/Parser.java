//### This file created by BYACC 1.8(/Java extension  1.15)
//### Java capabilities added 7 Jan 97, Bob Jamison
//### Updated : 27 Nov 97  -- Bob Jamison, Joe Nieten
//###           01 Jan 98  -- Bob Jamison -- fixed generic semantic constructor
//###           01 Jun 99  -- Bob Jamison -- added Runnable support
//###           06 Aug 00  -- Bob Jamison -- made state variables class-global
//###           03 Jan 01  -- Bob Jamison -- improved flags, tracing
//###           16 May 01  -- Bob Jamison -- added custom stack sizing
//###           04 Mar 02  -- Yuval Oren  -- improved java performance, added options
//###           14 Mar 02  -- Tomas Hurka -- -d support, static initializer workaround
//### Please send bug reports to tom@hukatronic.cz
//### static char yysccsid[] = "@(#)yaccpar	1.8 (Berkeley) 01/20/90";






//#line 2 "p.y"
	import java.lang.Math;
	import java.io.*;
	import java.util.StringTokenizer;
//#line 21 "Parser.java"




public class Parser
{

boolean yydebug;        //do I want debug output?
int yynerrs;            //number of errors so far
int yyerrflag;          //was there an error?
int yychar;             //the current working character

//########## MESSAGES ##########
//###############################################################
// method: debug
//###############################################################
void debug(String msg)
{
  if (yydebug)
    System.out.println(msg);
}

//########## STATE STACK ##########
final static int YYSTACKSIZE = 500;  //maximum stack size
int statestk[] = new int[YYSTACKSIZE]; //state stack
int stateptr;
int stateptrmax;                     //highest index of stackptr
int statemax;                        //state when highest index reached
//###############################################################
// methods: state stack push,pop,drop,peek
//###############################################################
final void state_push(int state)
{
  try {
		stateptr++;
		statestk[stateptr]=state;
	 }
	 catch (ArrayIndexOutOfBoundsException e) {
     int oldsize = statestk.length;
     int newsize = oldsize * 2;
     int[] newstack = new int[newsize];
     System.arraycopy(statestk,0,newstack,0,oldsize);
     statestk = newstack;
     statestk[stateptr]=state;
  }
}
final int state_pop()
{
  return statestk[stateptr--];
}
final void state_drop(int cnt)
{
  stateptr -= cnt; 
}
final int state_peek(int relative)
{
  return statestk[stateptr-relative];
}
//###############################################################
// method: init_stacks : allocate and prepare stacks
//###############################################################
final boolean init_stacks()
{
  stateptr = -1;
  val_init();
  return true;
}
//###############################################################
// method: dump_stacks : show n levels of the stacks
//###############################################################
void dump_stacks(int count)
{
int i;
  System.out.println("=index==state====value=     s:"+stateptr+"  v:"+valptr);
  for (i=0;i<count;i++)
    System.out.println(" "+i+"    "+statestk[i]+"      "+valstk[i]);
  System.out.println("======================");
}


//########## SEMANTIC VALUES ##########
//public class ParserVal is defined in ParserVal.java


String   yytext;//user variable to return contextual strings
ParserVal yyval; //used to return semantic vals from action routines
ParserVal yylval;//the 'lval' (result) I got from yylex()
ParserVal valstk[];
int valptr;
//###############################################################
// methods: value stack push,pop,drop,peek.
//###############################################################
void val_init()
{
  valstk=new ParserVal[YYSTACKSIZE];
  yyval=new ParserVal();
  yylval=new ParserVal();
  valptr=-1;
}
void val_push(ParserVal val)
{
  if (valptr>=YYSTACKSIZE)
    return;
  valstk[++valptr]=val;
}
ParserVal val_pop()
{
  if (valptr<0)
    return new ParserVal();
  return valstk[valptr--];
}
void val_drop(int cnt)
{
int ptr;
  ptr=valptr-cnt;
  if (ptr<0)
    return;
  valptr = ptr;
}
ParserVal val_peek(int relative)
{
int ptr;
  ptr=valptr-relative;
  if (ptr<0)
    return new ParserVal();
  return valstk[ptr];
}
final ParserVal dup_yyval(ParserVal val)
{
  ParserVal dup = new ParserVal();
  dup.ival = val.ival;
  dup.dval = val.dval;
  dup.sval = val.sval;
  dup.obj = val.obj;
  return dup;
}
//#### end semantic value section ####
public final static short IF=257;
public final static short ELSE=258;
public final static short WHILE=259;
public final static short FOR=260;
public final static short COMP=261;
public final static short DIFERENTES=262;
public final static short MAY=263;
public final static short MEN=264;
public final static short MAYI=265;
public final static short MENI=266;
public final static short FNCT=267;
public final static short NUMBER=268;
public final static short VAR=269;
public final static short AND=270;
public final static short OR=271;
public final static short FUNC=272;
public final static short RETURN=273;
public final static short PARAMETRO=274;
public final static short PROC=275;
public final static short UNARYMINUS=276;
public final static short YYERRCODE=256;
final static short yylhs[] = {                           -1,
    0,    0,    0,    1,    1,    1,    1,    3,    3,    3,
    3,    3,    3,    2,    2,    2,    2,    2,    2,    2,
    2,    2,    2,    2,    2,    2,    2,    2,    2,    2,
    2,    2,    2,    2,    2,    2,    2,    2,    4,    7,
    8,   14,   14,   14,    6,   13,   10,   11,   12,    5,
    9,    9,    9,
};
final static short yylen[] = {                            2,
    0,    2,    3,    2,    1,    3,    2,   14,   11,   10,
   16,    8,    8,    1,    1,    3,    3,    3,    3,    3,
    3,    2,    2,    3,    3,    7,    7,    7,    7,    7,
    7,    7,    7,    2,    4,    2,    1,    4,    1,    1,
    1,    0,    1,    3,    0,    1,    1,    1,    0,    0,
    0,    1,    3,
};
final static short yydefred[] = {                         1,
    0,   39,   40,   41,    0,   15,    0,   47,    0,   37,
   46,    0,    0,    2,    0,    0,    0,    0,    5,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    3,    0,    7,    0,    0,    0,    0,    0,
    4,    0,   22,    0,    0,    0,   48,    0,    0,    0,
    0,    0,   21,    0,    6,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,   35,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,   38,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,   26,   27,   30,   28,   31,   29,
   32,   33,    0,    0,    0,    0,    0,    0,    0,    0,
   12,   13,    0,   50,    0,    0,   50,   10,    0,    0,
    9,    0,    0,    0,    0,    0,    8,    0,   50,   11,
};
final static short yydgoto[] = {                          1,
   17,   18,   19,   20,   79,  137,   21,   22,   65,   23,
   24,  126,   25,   68,
};
final static short yysindex[] = {                         0,
    9,    0,    0,    0,  -76,    0,  -33,    0,  -13,    0,
    0,  -13,  -13,    0,  -13,  -13,   28,   89,    0,    1,
   11,   18, -217,   19, -217,  -13,  -13,  -30,  -30,  -30,
  -31,   80,    0,   98,    0,  -13,  -13,  -13,  -13,  -13,
    0,  -13,    0,  -13,  -13,  -13,    0,   22,  -13,   24,
  104,  141,    0,  182,    0,  -11,  -30,  113,  113,  -29,
  141,  141,  141,  141,   21,   25,  141,   -7,   29,    0,
  -55,  -53,  -52,  -47,  -41,  -40,  -39,  -21,   52,   54,
  -13,   45,    3,    0,  -13,   14,  -13,  -13,  -13,  -13,
  -13,  -13,  -13,  -13,   15,   30,  141,  -13,  -32,  141,
  -32,  121,  129,  165,  268,  288,  301,  310,  325,  -32,
  -32,  141,  -32,  -32,    0,    0,    0,    0,    0,    0,
    0,    0,  -32,  -32,   53,  -12,   17,   31,   34,  -13,
    0,    0, -129,    0,   21,   39,    0,    0,  103,  -32,
    0,   42,  -32,  -32,   48,  -32,    0,   50,    0,    0,
};
final static short yyrindex[] = {                         0,
    0,    0,    0,    0,    0,    0,  -38,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,   37,   46,   57,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,  -20,    0,    0,    2,    0,
    0,    4,    0,    0,    0,   76,   65,  364,  440,  335,
  155,  126,  126,  -19,   95,    0,    6,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,  -15,    0,    0,   12,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,   95,   55,   55,    0,    0,    0,    0,    0,    0,
    0,    0,   62,   62,    0,    0,    0,    0,    0,   16,
    0,    0,  -10,    0,  126,    0,    0,    0,    0,    0,
    0,    0,   62,    0,    0,   62,    0,    0,    0,    0,
};
final static short yygindex[] = {                         0,
  392,  424,  273,    0,  355,    0,    0,    0,   47,    0,
    8,   64,    0,    0,
};
final static int YYTABLESIZE=587;
static short yytable[];
static { yytable();}
static void yytable(){
yytable = new short[]{                         45,
   13,   48,   14,   14,   14,   14,   14,   15,   14,   53,
   40,   38,   12,   39,   26,   42,   42,   42,   14,   13,
   14,   52,   45,   51,   52,   53,   15,   27,   53,   45,
   48,   12,   50,   84,   45,   42,   85,   33,   51,   52,
   44,   13,   42,   53,   16,   42,   43,   16,   15,   43,
   45,   47,   44,   12,   14,   44,   51,   46,   49,   51,
   13,   66,   16,   69,   81,   83,   14,   15,   87,   86,
   88,   89,   12,   43,   43,   43,   90,   36,   36,   36,
   36,   36,   91,   92,   93,   14,   23,   23,   23,   23,
   23,   16,   95,   43,   96,   36,   16,   34,   34,   34,
   34,   34,   94,   98,   23,   25,   25,   25,   25,   25,
   16,  130,  131,   45,   45,   34,   24,   24,   24,   24,
   24,   40,   38,   25,   39,   99,   42,   16,  136,   36,
   40,   38,   16,   39,   24,   42,  101,  110,   23,   40,
   38,  132,   39,  142,   42,   40,   38,   41,   39,   34,
   42,   16,  111,   50,   40,  133,   55,   25,  134,   42,
   36,  140,   40,   38,  144,   39,   50,   42,   24,   23,
   40,   38,  147,   39,  149,   42,  135,  127,    0,   49,
   34,    0,   40,   38,   43,   39,   50,   42,   25,    0,
    0,    0,    0,   43,    0,   20,   70,    0,   20,   24,
    0,    0,   43,   54,    0,    0,   40,   38,   43,   39,
    0,   42,    0,   20,    0,    0,    0,   43,    0,    0,
    0,    0,   14,   14,    2,   43,    3,    4,    0,   36,
   37,   36,   37,   43,    5,    6,    7,    0,    0,    8,
    9,   10,   11,    0,  115,   43,   45,   20,   45,   45,
   37,    0,  116,    5,    6,    7,   45,   45,   45,    9,
   10,   45,   45,   45,   45,    2,    0,    3,    4,   43,
    0,    0,    0,    0,    0,    5,    6,    7,   20,    0,
    8,    9,   10,   11,    2,    0,    3,    4,  117,   35,
    0,    0,    0,    0,    5,    6,    7,   36,   36,    8,
    9,   10,   11,    0,    0,    0,   23,   23,    0,   40,
   38,    0,   39,    0,   42,    0,    0,   34,   34,    0,
    0,    0,    0,    0,    0,   25,   25,    0,    0,   40,
   38,    0,   39,    0,   42,    0,   24,    0,    0,    0,
   36,   37,   40,   38,    0,   39,    0,   42,    0,   36,
   37,   40,   38,    0,   39,    0,   42,    0,   36,   37,
    0,    0,    0,    0,   36,   37,   40,   38,    0,   39,
    0,   42,   43,   36,   37,   17,   17,   17,   17,   17,
    0,   36,   37,    0,    0,   35,   35,    0,    0,   36,
   37,  118,   43,   17,    0,   35,   35,    0,    0,    0,
    0,   36,   37,    0,   18,   43,   18,   18,   18,    0,
    0,  119,    0,    0,   43,   35,    0,   80,   35,   82,
    0,    0,   18,    0,  120,   36,   37,   17,    0,   43,
    0,    0,   28,  121,    0,   29,   30,    0,   31,   32,
   34,    0,   71,   72,   73,   74,   75,   76,  122,   51,
   52,   77,   78,    0,    0,    0,   18,    0,   17,   56,
   57,   58,   59,   60,    0,   61,  125,   62,   63,   64,
    0,    0,   67,    0,    0,    0,    0,  128,  129,    0,
   19,    0,   19,   19,   19,    0,    0,   18,  138,  139,
  113,  141,  114,    0,    0,    0,    0,  145,   19,    0,
  148,  123,  124,  150,   97,    0,    0,    0,  100,    0,
  102,  103,  104,  105,  106,  107,  108,  109,    0,    0,
    0,  112,    0,    0,    0,    0,    0,    0,   36,   37,
    0,  143,   19,    0,    0,  146,   34,   34,    0,    0,
    0,    0,    0,    0,    0,    0,   34,   34,   36,   37,
    0,    0,    0,   64,    0,    0,    0,    0,    0,    0,
    0,   36,   37,   19,    0,    0,   34,    0,    0,   34,
   36,   37,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,   36,   37,
};
}
static short yycheck[];
static { yycheck(); }
static void yycheck() {
yycheck = new short[] {                         10,
   33,   40,   41,   42,   43,   44,   45,   40,   47,   41,
   42,   43,   45,   45,   91,   47,   47,   47,   10,   33,
   59,   41,   33,   44,   44,   41,   40,   61,   44,   40,
   23,   45,   25,   41,   45,   47,   44,   10,   59,   59,
   40,   33,   41,   59,   41,   44,   41,   44,   40,   44,
   40,  269,   41,   45,   93,   44,   41,   40,   40,   44,
   33,   40,   59,   40,   44,   41,  105,   40,  124,   41,
  124,  124,   45,  105,  105,  105,  124,   41,   42,   43,
   44,   45,  124,  124,  124,  124,   41,   42,   43,   44,
   45,  124,   41,  105,   41,   59,   93,   41,   42,   43,
   44,   45,  124,   59,   59,   41,   42,   43,   44,   45,
  124,   59,  125,  124,  125,   59,   41,   42,   43,   44,
   45,   42,   43,   59,   45,  123,   47,  124,  258,   93,
   42,   43,  124,   45,   59,   47,  123,  123,   93,   42,
   43,  125,   45,   41,   47,   42,   43,   59,   45,   93,
   47,  124,  123,   59,   42,  125,   59,   93,  125,   47,
  124,  123,   42,   43,  123,   45,   41,   47,   93,  124,
   42,   43,  125,   45,  125,   47,  130,  114,   -1,  125,
  124,   -1,   42,   43,  105,   45,  125,   47,  124,   -1,
   -1,   -1,   -1,  105,   -1,   41,   93,   -1,   44,  124,
   -1,   -1,  105,  124,   -1,   -1,   42,   43,  105,   45,
   -1,   47,   -1,   59,   -1,   -1,   -1,  105,   -1,   -1,
   -1,   -1,  261,  262,  257,  105,  259,  260,   -1,  261,
  262,  261,  262,  105,  267,  268,  269,   -1,   -1,  272,
  273,  274,  275,   -1,  124,  105,  257,   93,  259,  260,
  262,   -1,  124,  267,  268,  269,  267,  268,  269,  273,
  274,  272,  273,  274,  275,  257,   -1,  259,  260,  105,
   -1,   -1,   -1,   -1,   -1,  267,  268,  269,  124,   -1,
  272,  273,  274,  275,  257,   -1,  259,  260,  124,   17,
   -1,   -1,   -1,   -1,  267,  268,  269,  261,  262,  272,
  273,  274,  275,   -1,   -1,   -1,  261,  262,   -1,   42,
   43,   -1,   45,   -1,   47,   -1,   -1,  261,  262,   -1,
   -1,   -1,   -1,   -1,   -1,  261,  262,   -1,   -1,   42,
   43,   -1,   45,   -1,   47,   -1,  261,   -1,   -1,   -1,
  261,  262,   42,   43,   -1,   45,   -1,   47,   -1,  261,
  262,   42,   43,   -1,   45,   -1,   47,   -1,  261,  262,
   -1,   -1,   -1,   -1,  261,  262,   42,   43,   -1,   45,
   -1,   47,  105,  261,  262,   41,   42,   43,   44,   45,
   -1,  261,  262,   -1,   -1,  113,  114,   -1,   -1,  261,
  262,  124,  105,   59,   -1,  123,  124,   -1,   -1,   -1,
   -1,  261,  262,   -1,   41,  105,   43,   44,   45,   -1,
   -1,  124,   -1,   -1,  105,  143,   -1,   63,  146,   65,
   -1,   -1,   59,   -1,  124,  261,  262,   93,   -1,  105,
   -1,   -1,    9,  124,   -1,   12,   13,   -1,   15,   16,
   17,   -1,  261,  262,  263,  264,  265,  266,  124,   26,
   27,  270,  271,   -1,   -1,   -1,   93,   -1,  124,   36,
   37,   38,   39,   40,   -1,   42,  112,   44,   45,   46,
   -1,   -1,   49,   -1,   -1,   -1,   -1,  123,  124,   -1,
   41,   -1,   43,   44,   45,   -1,   -1,  124,  134,  135,
   99,  137,  101,   -1,   -1,   -1,   -1,  143,   59,   -1,
  146,  110,  111,  149,   81,   -1,   -1,   -1,   85,   -1,
   87,   88,   89,   90,   91,   92,   93,   94,   -1,   -1,
   -1,   98,   -1,   -1,   -1,   -1,   -1,   -1,  261,  262,
   -1,  140,   93,   -1,   -1,  144,  113,  114,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,  123,  124,  261,  262,
   -1,   -1,   -1,  130,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,  261,  262,  124,   -1,   -1,  143,   -1,   -1,  146,
  261,  262,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,  261,  262,
};
}
final static short YYFINAL=1;
final static short YYMAXTOKEN=276;
final static String yyname[] = {
"end-of-file",null,null,null,null,null,null,null,null,null,"'\\n'",null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,"'!'",null,null,null,null,null,null,"'('","')'","'*'","'+'",
"','","'-'",null,"'/'",null,null,null,null,null,null,null,null,null,null,null,
"';'",null,"'='",null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,"'['",null,"']'",null,null,null,null,null,null,null,null,null,null,null,
"'i'",null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,"'{'","'|'","'}'",null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,"IF","ELSE","WHILE","FOR",
"COMP","DIFERENTES","MAY","MEN","MAYI","MENI","FNCT","NUMBER","VAR","AND","OR",
"FUNC","RETURN","PARAMETRO","PROC","UNARYMINUS",
};
final static String yyrule[] = {
"$accept : list",
"list :",
"list : list '\\n'",
"list : list linea '\\n'",
"linea : exp ';'",
"linea : stmt",
"linea : linea exp ';'",
"linea : linea stmt",
"stmt : if_ '(' exp stop_ ')' '{' linea stop_ '}' ELSE '{' linea stop_ '}'",
"stmt : if_ '(' exp stop_ ')' '{' linea stop_ '}' nop stop_",
"stmt : while_ '(' exp stop_ ')' '{' linea stop_ '}' stop_",
"stmt : for_ '(' instrucciones stop_ ';' exp stop_ ';' instrucciones stop_ ')' '{' linea stop_ '}' stop_",
"stmt : funcion nombreProc '(' ')' '{' linea null_ '}'",
"stmt : procedimiento nombreProc '(' ')' '{' linea null_ '}'",
"exp : VAR",
"exp : NUMBER",
"exp : VAR '=' exp",
"exp : exp '*' exp",
"exp : exp '+' exp",
"exp : exp '-' exp",
"exp : exp '/' exp",
"exp : '(' exp ')'",
"exp : exp 'i'",
"exp : '-' exp",
"exp : exp COMP exp",
"exp : exp DIFERENTES exp",
"exp : '|' exp '|' COMP '|' exp '|'",
"exp : '|' exp '|' DIFERENTES '|' exp '|'",
"exp : '|' exp '|' MEN '|' exp '|'",
"exp : '|' exp '|' MENI '|' exp '|'",
"exp : '|' exp '|' MAY '|' exp '|'",
"exp : '|' exp '|' MAYI '|' exp '|'",
"exp : '|' exp '|' AND '|' exp '|'",
"exp : '|' exp '|' OR '|' exp '|'",
"exp : '!' exp",
"exp : FNCT '[' exp ']'",
"exp : RETURN exp",
"exp : PARAMETRO",
"exp : nombreProc '(' arglist ')'",
"if_ : IF",
"while_ : WHILE",
"for_ : FOR",
"arglist :",
"arglist : exp",
"arglist : arglist ',' exp",
"nop :",
"procedimiento : PROC",
"funcion : FUNC",
"nombreProc : VAR",
"null_ :",
"stop_ :",
"instrucciones :",
"instrucciones : exp",
"instrucciones : instrucciones ',' exp",
};

//#line 214 "p.y"

TablaDeSimbolos tablaDeSimbolos = new TablaDeSimbolos();
MaquinaDePila maquina = new MaquinaDePila(tablaDeSimbolos);
Complejo complex = new Complejo();
int i = 0;
int j = 0;
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
	if (!st.hasMoreTokens()) {
		if (!newline) {
			newline=true;
			return '\n'; //So we look like classic YACC example
		}
		else
			return 0;
	}
	s = st.nextToken();
	try {		
		d = Double.valueOf(s);/*this may fail*/
		yylval = new ParserVal(d.doubleValue()); //SEE BELOW
		return NUMBER;
	}
	catch (Exception e) {}
	if (esVariable(s)) {
		if (s.charAt(0) == '$') {
			yylval = new ParserVal((int)Integer.parseInt(s.substring(1)));
			return PARAMETRO;
		}

		if (s.equals("proc"))	return PROC;		
		if(s.equals("return"))	return RETURN;
		if(s.equals("func"))	return FUNC;
		if(s.equals("=="))		return COMP;
		if(s.equals("!="))		return DIFERENTES;
		if(s.equals("<"))		return MEN;
		if(s.equals("<="))		return MENI;
		if(s.equals(">"))		return MAY;
		if(s.equals(">="))		return MAYI;
		if(s.equals("&&"))		return AND;
		if(s.equals("||"))		return OR;
		if(s.equals("if"))		return IF;
		if(s.equals("else"))	return ELSE;
		if(s.equals("while"))	return WHILE;
		if(s.equals("for"))		return FOR;
		
		boolean esFuncion = false;
		Object objeto = tablaDeSimbolos.encontrar(s);
		if (objeto instanceof Funcion) {
			funcionAux = (Funcion)objeto;
			yylval = new ParserVal(objeto);			
			esFuncion = true;
			return FNCT;
		}
		if (!esFuncion) {
			yylval = new ParserVal(s);
			return VAR;
		}
	}
	else {
		tok = s.charAt(0);
	}
	//System.out.println("Token: " + tok);
	return tok;
}

String reservados[] = {"=", "{", "}", ",", "*", "+", "-", "(", ")", "|", "[", "]", ";", "!"};

boolean esVariable(String s) {
	boolean cumple = true;
	for (int i = 0; i < reservados.length; i++)
		if (s.equals(reservados[i]))
			cumple = false;
	return cumple;
}

void dotest() throws Exception {
	tablaDeSimbolos.insertar("Imprimir", new MaquinaDePila.Imprimir());
	tablaDeSimbolos.insertar("Sumar", new MaquinaDePila.Sumar());
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	while (true) {
		huboError = false;
		try {
			ins = in.readLine();
		}
		catch (Exception e) {}
		st = new StringTokenizer(ins);
		newline = false;
		//maquina = new MaquinaDePila(tablaDeSimbolos);
		yyparse();
		if (!huboError)
			maquina.ejecutar();
	}
}

public static void main(String args[]) throws Exception {
	Parser par = new Parser(false);
	par.dotest();
}
//#line 510 "Parser.java"
//###############################################################
// method: yylexdebug : check lexer state
//###############################################################
void yylexdebug(int state,int ch)
{
String s=null;
  if (ch < 0) ch=0;
  if (ch <= YYMAXTOKEN) //check index bounds
     s = yyname[ch];    //now get it
  if (s==null)
    s = "illegal-symbol";
  debug("state "+state+", reading "+ch+" ("+s+")");
}





//The following are now global, to aid in error reporting
int yyn;       //next next thing to do
int yym;       //
int yystate;   //current parsing state from state table
String yys;    //current token string


//###############################################################
// method: yyparse : parse input and execute indicated items
//###############################################################
int yyparse()
{
boolean doaction;
  init_stacks();
  yynerrs = 0;
  yyerrflag = 0;
  yychar = -1;          //impossible char forces a read
  yystate=0;            //initial state
  state_push(yystate);  //save it
  val_push(yylval);     //save empty value
  while (true) //until parsing is done, either correctly, or w/error
    {
    doaction=true;
    if (yydebug) debug("loop"); 
    //#### NEXT ACTION (from reduction table)
    for (yyn=yydefred[yystate];yyn==0;yyn=yydefred[yystate])
      {
      if (yydebug) debug("yyn:"+yyn+"  state:"+yystate+"  yychar:"+yychar);
      if (yychar < 0)      //we want a char?
        {
        yychar = yylex();  //get next token
        if (yydebug) debug(" next yychar:"+yychar);
        //#### ERROR CHECK ####
        if (yychar < 0)    //it it didn't work/error
          {
          yychar = 0;      //change it to default string (no -1!)
          if (yydebug)
            yylexdebug(yystate,yychar);
          }
        }//yychar<0
      yyn = yysindex[yystate];  //get amount to shift by (shift index)
      if ((yyn != 0) && (yyn += yychar) >= 0 &&
          yyn <= YYTABLESIZE && yycheck[yyn] == yychar)
        {
        if (yydebug)
          debug("state "+yystate+", shifting to state "+yytable[yyn]);
        //#### NEXT STATE ####
        yystate = yytable[yyn];//we are in a new state
        state_push(yystate);   //save it
        val_push(yylval);      //push our lval as the input for next rule
        yychar = -1;           //since we have 'eaten' a token, say we need another
        if (yyerrflag > 0)     //have we recovered an error?
           --yyerrflag;        //give ourselves credit
        doaction=false;        //but don't process yet
        break;   //quit the yyn=0 loop
        }

    yyn = yyrindex[yystate];  //reduce
    if ((yyn !=0 ) && (yyn += yychar) >= 0 &&
            yyn <= YYTABLESIZE && yycheck[yyn] == yychar)
      {   //we reduced!
      if (yydebug) debug("reduce");
      yyn = yytable[yyn];
      doaction=true; //get ready to execute
      break;         //drop down to actions
      }
    else //ERROR RECOVERY
      {
      if (yyerrflag==0)
        {
        yyerror("syntax error");
        yynerrs++;
        }
      if (yyerrflag < 3) //low error count?
        {
        yyerrflag = 3;
        while (true)   //do until break
          {
          if (stateptr<0)   //check for under & overflow here
            {
            yyerror("stack underflow. aborting...");  //note lower case 's'
            return 1;
            }
          yyn = yysindex[state_peek(0)];
          if ((yyn != 0) && (yyn += YYERRCODE) >= 0 &&
                    yyn <= YYTABLESIZE && yycheck[yyn] == YYERRCODE)
            {
            if (yydebug)
              debug("state "+state_peek(0)+", error recovery shifting to state "+yytable[yyn]+" ");
            yystate = yytable[yyn];
            state_push(yystate);
            val_push(yylval);
            doaction=false;
            break;
            }
          else
            {
            if (yydebug)
              debug("error recovery discarding state "+state_peek(0)+" ");
            if (stateptr<0)   //check for under & overflow here
              {
              yyerror("Stack underflow. aborting...");  //capital 'S'
              return 1;
              }
            state_pop();
            val_pop();
            }
          }
        }
      else            //discard this token
        {
        if (yychar == 0)
          return 1; //yyabort
        if (yydebug)
          {
          yys = null;
          if (yychar <= YYMAXTOKEN) yys = yyname[yychar];
          if (yys == null) yys = "illegal-symbol";
          debug("state "+yystate+", error recovery discards token "+yychar+" ("+yys+")");
          }
        yychar = -1;  //read another
        }
      }//end error recovery
    }//yyn=0 loop
    if (!doaction)   //any reason not to proceed?
      continue;      //skip action
    yym = yylen[yyn];          //get count of terminals on rhs
    if (yydebug)
      debug("state "+yystate+", reducing "+yym+" by rule "+yyn+" ("+yyrule[yyn]+")");
    if (yym>0)                 //if count of rhs not 'nil'
      yyval = val_peek(yym-1); //get current semantic value
    yyval = dup_yyval(yyval); //duplicate yyval if ParserVal is used as semantic value
    switch(yyn)
      {
//########## USER-SUPPLIED ACTIONS ##########
case 4:
//#line 30 "p.y"
{yyval = val_peek(1);}
break;
case 5:
//#line 31 "p.y"
{yyval = val_peek(0);}
break;
case 6:
//#line 32 "p.y"
{yyval = val_peek(2);}
break;
case 7:
//#line 33 "p.y"
{yyval = val_peek(1);}
break;
case 8:
//#line 36 "p.y"
{
				yyval = val_peek(13);
				maquina.agregar(val_peek(7).ival, val_peek(13).ival + 1);
				maquina.agregar(val_peek(2).ival, val_peek(13).ival + 2);
				maquina.agregar(maquina.numeroDeElementos() - 1, val_peek(13).ival + 3);
			}
break;
case 9:
//#line 42 "p.y"
{
				yyval = val_peek(10);
				maquina.agregar(val_peek(4).ival, val_peek(10).ival + 1);
				maquina.agregar(val_peek(1).ival, val_peek(10).ival + 2);
				maquina.agregar(maquina.numeroDeElementos() - 1, val_peek(10).ival + 3);
			}
break;
case 10:
//#line 48 "p.y"
{
				yyval = val_peek(9);
				maquina.agregar(val_peek(3).ival, val_peek(9).ival + 1);
				maquina.agregar(val_peek(0).ival, val_peek(9).ival + 2);
			}
break;
case 11:
//#line 53 "p.y"
{
				yyval = val_peek(15);
				maquina.agregar(val_peek(10).ival, val_peek(15).ival + 1);
				maquina.agregar(val_peek(7).ival, val_peek(15).ival + 2);
				maquina.agregar(val_peek(3).ival, val_peek(15).ival + 3);
				maquina.agregar(val_peek(0).ival, val_peek(15).ival + 4);
			}
break;
case 14:
//#line 64 "p.y"
{				
				yyval = new ParserVal(maquina.agregarOperacion("varPush_Eval")); 
				maquina.agregar(val_peek(0).sval);
			}
break;
case 15:
//#line 68 "p.y"
{
				yyval = new ParserVal(maquina.agregarOperacion("constPush"));
				complex = new Complejo(val_peek(0).dval, 0);
				maquina.agregar(complex);
			}
break;
case 16:
//#line 73 "p.y"
{
				yyval = new ParserVal(val_peek(0).ival);
				maquina.agregarOperacion("varPush");
		        maquina.agregar(val_peek(2).sval);
		        maquina.agregarOperacion("asignar");
		        maquina.agregarOperacion("varPush_Eval"); 
				maquina.agregar(val_peek(2).sval);
			}
break;
case 17:
//#line 81 "p.y"
{
				yyval = new ParserVal(val_peek(2).ival);
				maquina.agregarOperacion("multiplicar");
			}
break;
case 18:
//#line 85 "p.y"
{
				yyval = new ParserVal(val_peek(2).ival);
				maquina.agregarOperacion("sumar");
			}
break;
case 19:
//#line 89 "p.y"
{
				yyval = new ParserVal(val_peek(2).ival);
				maquina.agregarOperacion("restar");
			}
break;
case 20:
//#line 93 "p.y"
{
				yyval  = new ParserVal(val_peek(2).ival);
				maquina.agregarOperacion("dividir");
			}
break;
case 21:
//#line 97 "p.y"
{
				yyval = new ParserVal(val_peek(1).ival);
			}
break;
case 22:
//#line 100 "p.y"
{
				System.out.println("yimag");
				maquina.agregarOperacion("imag");
				yyval = new ParserVal(val_peek(1).ival);
			}
break;
case 23:
//#line 105 "p.y"
{
				maquina.agregarOperacion("unaryminus");
				yyval = val_peek(0);
			}
break;
case 24:
//#line 109 "p.y"
{
				 maquina.agregarOperacion("comparar");
				 yyval = val_peek(2);
			}
break;
case 25:
//#line 113 "p.y"
{
				 maquina.agregarOperacion("compararNot");
				 yyval = val_peek(2);
			}
break;
case 26:
//#line 117 "p.y"
{
				 maquina.agregarOperacion("mag_comparar");
				 yyval = val_peek(6);
			}
break;
case 27:
//#line 121 "p.y"
{
				 maquina.agregarOperacion("mag_compararNot");
				 yyval = val_peek(6);
			}
break;
case 28:
//#line 125 "p.y"
{
				 maquina.agregarOperacion("menor");
				 yyval = val_peek(6);
			}
break;
case 29:
//#line 129 "p.y"
{
				 maquina.agregarOperacion("menorIgual");
				 yyval = val_peek(6);
			}
break;
case 30:
//#line 133 "p.y"
{
				 maquina.agregarOperacion("mayor");
				 yyval = val_peek(6);
			}
break;
case 31:
//#line 137 "p.y"
{
				 maquina.agregarOperacion("mayorIgual");
				 yyval = val_peek(6);
			}
break;
case 32:
//#line 141 "p.y"
{
				maquina.agregarOperacion("and");
				 yyval = val_peek(6);
			}
break;
case 33:
//#line 145 "p.y"
{
				maquina.agregarOperacion("or");
				 yyval = val_peek(6);
			}
break;
case 34:
//#line 149 "p.y"
{
				maquina.agregarOperacion("negar");
				yyval = val_peek(0);
			}
break;
case 35:
//#line 153 "p.y"
{ 
				yyval = new ParserVal(val_peek(1).ival);
      			maquina.agregar((Funcion)(val_peek(3).obj));
			}
break;
case 36:
//#line 157 "p.y"
{ yyval = val_peek(0); maquina.agregarOperacion("_return"); }
break;
case 37:
//#line 159 "p.y"
{ yyval = new ParserVal(maquina.agregarOperacion("push_parametro")); maquina.agregar((int)val_peek(0).ival); }
break;
case 38:
//#line 161 "p.y"
{ yyval = new ParserVal(maquina.agregarOperacionEn("invocar",(val_peek(3).ival))); maquina.agregar(null); }
break;
case 39:
//#line 164 "p.y"
{
			yyval = new ParserVal(maquina.agregarOperacion("_if_then_else"));
	        maquina.agregarOperacion("stop");/*then*/
	        maquina.agregarOperacion("stop");/*else*/
	        maquina.agregarOperacion("stop");/*siguiente comando*/
		}
break;
case 40:
//#line 172 "p.y"
{
			yyval = new ParserVal(maquina.agregarOperacion("_while"));
	        maquina.agregarOperacion("stop");/*cuerpo*/
	        maquina.agregarOperacion("stop");/*final*/
		}
break;
case 41:
//#line 179 "p.y"
{
			yyval = new ParserVal(maquina.agregarOperacion("_for"));
	        maquina.agregarOperacion("stop");/*condicion*/
	        maquina.agregarOperacion("stop");/*instrucción final*/
	        maquina.agregarOperacion("stop");/*cuerpo*/
	        maquina.agregarOperacion("stop");/*final*/
		}
break;
case 43:
//#line 188 "p.y"
{yyval = val_peek(0); maquina.agregar("Limite");}
break;
case 44:
//#line 189 "p.y"
{yyval = val_peek(2); maquina.agregar("Limite");}
break;
case 45:
//#line 192 "p.y"
{yyval = new ParserVal(maquina.agregarOperacion("nop"));}
break;
case 46:
//#line 195 "p.y"
{ maquina.agregarOperacion("declaracion"); }
break;
case 47:
//#line 197 "p.y"
{ maquina.agregarOperacion("declaracion"); }
break;
case 48:
//#line 200 "p.y"
{yyval = new ParserVal(maquina.agregar(val_peek(0).sval));}
break;
case 49:
//#line 203 "p.y"
{maquina.agregar(null);}
break;
case 50:
//#line 206 "p.y"
{yyval = new ParserVal(maquina.agregarOperacion("stop"));}
break;
case 51:
//#line 209 "p.y"
{ yyval = new ParserVal(maquina.agregarOperacion("nop"));}
break;
case 52:
//#line 210 "p.y"
{yyval = val_peek(0);}
break;
case 53:
//#line 211 "p.y"
{yyval = val_peek(2);}
break;
//#line 953 "Parser.java"
//########## END OF USER-SUPPLIED ACTIONS ##########
    }//switch
    //#### Now let's reduce... ####
    if (yydebug) debug("reduce");
    state_drop(yym);             //we just reduced yylen states
    yystate = state_peek(0);     //get new state
    val_drop(yym);               //corresponding value drop
    yym = yylhs[yyn];            //select next TERMINAL(on lhs)
    if (yystate == 0 && yym == 0)//done? 'rest' state and at first TERMINAL
      {
      if (yydebug) debug("After reduction, shifting from state 0 to state "+YYFINAL+"");
      yystate = YYFINAL;         //explicitly say we're done
      state_push(YYFINAL);       //and save it
      val_push(yyval);           //also save the semantic value of parsing
      if (yychar < 0)            //we want another character?
        {
        yychar = yylex();        //get next character
        if (yychar<0) yychar=0;  //clean, if necessary
        if (yydebug)
          yylexdebug(yystate,yychar);
        }
      if (yychar == 0)          //Good exit (if lex returns 0 ;-)
         break;                 //quit the loop--all DONE
      }//if yystate
    else                        //else not done yet
      {                         //get next state and push, for next yydefred[]
      yyn = yygindex[yym];      //find out where to go
      if ((yyn != 0) && (yyn += yystate) >= 0 &&
            yyn <= YYTABLESIZE && yycheck[yyn] == yystate)
        yystate = yytable[yyn]; //get new state
      else
        yystate = yydgoto[yym]; //else go to new defred
      if (yydebug) debug("after reduction, shifting from state "+state_peek(0)+" to state "+yystate+"");
      state_push(yystate);     //going again, so push state & val...
      val_push(yyval);         //for next action
      }
    }//main loop
  return 0;//yyaccept!!
}
//## end of method parse() ######################################



//## run() --- for Thread #######################################
/**
 * A default run method, used for operating this parser
 * object in the background.  It is intended for extending Thread
 * or implementing Runnable.  Turn off with -Jnorun .
 */
public void run()
{
  yyparse();
}
//## end of method run() ########################################



//## Constructors ###############################################
/**
 * Default constructor.  Turn off with -Jnoconstruct .

 */
public Parser()
{
  //nothing to do
}


/**
 * Create a parser, setting the debug to true or false.
 * @param debugMe true for debugging, false for no debug.
 */
public Parser(boolean debugMe)
{
  yydebug=debugMe;
}
//###############################################################



}
//################### END OF CLASS ##############################
