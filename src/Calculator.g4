grammar Calculator;

options {
    language = Java;
}

@members {
    private double memorySlot = 0.0;
    public static void main(String[] args) throws Exception {
        CalculatorLexer lex = new CalculatorLexer(new ANTLRFileStream(args[0]));
        CommonTokenStream tokens = new CommonTokenStream (lex);
        CalculatorParser parser = new CalculatorParser(tokens);
        parser.start();
    }
}

start
    : (line? COMMENT? LF)* EOF
    ;

line
    : MEMORY '=' expr { memorySlot = $expr.value; System.out.println($MEMORY.text + " = " + $expr.value); }
    | expr { System.out.println($expr.value); }
    ;

expr returns [double value]
    : fstop=addop { $value = $fstop.value; } (OPADD nxtop=addop { if ("+".equals($OPADD.text)) $value += $nxtop.value; else $value -= $nxtop.value; })*
    ;

addop returns [double value]
    : fstop=mulop { $value = $fstop.value; } (OPMUL nxtop=mulop { if ("*".equals($OPMUL.text)) $value *= $nxtop.value; else $value /= $nxtop.value; })*
    ;

mulop returns [double value]
    : fstop=fct { $value = $fstop.value; } (OPPWR nxtop=mulop { $value = Math.pow($value, $nxtop.value); })?
    ;

fct returns [double value]
    : SZAM { $value = Double.parseDouble($SZAM.text); }
    | '(' expr ')' { $value = $expr.value; }
    | 'abs' '(' expr ')' { $value = Math.abs($expr.value); }
    | OPMINMAX '(' fstop=expr { $value = $fstop.value; } (',' nxtop=expr  {
        if ("min".equals(OPMINMAX) && $nxtop.value < $value) $value = $nxtop.value;
        else if ("max".equals(OPMINMAX) && $nxtop.value > $value) $value = $nxtop.value;
    }) * ')'
    | OPADD fct { $value = "-".equals($OPADD.text) ? -$fct.value : $fct.value; }
    | MEMORY { $value = memorySlot; }
    ;

LF       : '\n' ;
WS       : [ \t\r]+ ->skip ;
SZAM     : [0-9]+('.' [0-9]+)? ;
OPADD    : '+' | '-' ;
OPMUL    : '*' | '/' ;
OPPWR    : '^' ;
OPMINMAX : 'min' | 'max' ;
MEMORY   : 'M' ;
COMMENT  : '#' (~[\n])* ;
