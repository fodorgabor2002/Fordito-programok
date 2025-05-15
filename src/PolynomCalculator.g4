grammar PolynomCalculator;

options {
    language = Java;
}

//import java.util.HashMap;
//import java.util.Map;
@members {
    java.util.Map<String, Polinom> polinomok = new java.util.HashMap<>();
    public void setPolinomok(java.util.Map<String, Polinom> polinomok) {
        this.polinomok = polinomok;
    }

    java.util.Map<String, Double> szamValtozok = new java.util.HashMap<>();
    public void setSzamValtozok(java.util.Map<String, Double> szamValtozok) {
        this.szamValtozok = szamValtozok;
    }
}

start: line ';' (line ';')* ;

line
    : polinomDeklaracio
    | szamValtozoDeklaracio
    | valtozoErtekadas
    ;

valtozoErtekadas
    : VALTOZO '=' (polinom {polinomok.put($VALTOZO.text, $polinom.polinomPeldany);} | szamExpr {szamValtozok.put($VALTOZO.text, $szamExpr.value);})
    ;

polinomDeklaracio
    : POLINOM_KULCSSZO alapValtozo = VALTOZO {polinomok.put($alapValtozo.text, new Polinom());} ('=' alapPolinom = polinom {polinomok.put($alapValtozo.text, $alapPolinom.polinomPeldany);})?
     (',' ismetlodoValtozo = VALTOZO {polinomok.put($ismetlodoValtozo.text, new Polinom());} ('=' ismetlodoPolinom = polinom {polinomok.put($ismetlodoValtozo.text, $ismetlodoPolinom.polinomPeldany);})?)*
    ;

szamValtozoDeklaracio
    : SZAM_KULCSSZO alapValtozo = VALTOZO {szamValtozok.put($alapValtozo.text, 0d);} ('=' alapErtek = szamExpr {szamValtozok.put($alapValtozo.text, $alapErtek.value);})?
     (',' ismetlodoValtozo = VALTOZO {szamValtozok.put($ismetlodoValtozo.text, 0d);} ('=' ismetlodoErtek = szamExpr {szamValtozok.put($ismetlodoValtozo.text, $ismetlodoErtek.value);})?)*
    ;

polinom returns[Polinom polinomPeldany]
    : '<' alapTag = xtag {
        $polinomPeldany = new Polinom();
        $polinomPeldany.addTerm($alapTag.xtagPeldany);
    }(ismetlodoTag = xtag {
        $polinomPeldany.addTerm($ismetlodoTag.xtagPeldany);
    })* '>'
    ;

xtag returns [XTag xtagPeldany]
    : OPADD? VALTOZO? 'x' ('^' NUMBER)? {
        $xtagPeldany = new XTag();
        $xtagPeldany.xSzoveg = "x";

        if ($OPADD != null) $xtagPeldany.muvelet = $OPADD.text;
        if ($VALTOZO != null) $xtagPeldany.egyutthato = $VALTOZO.text;
        if ($NUMBER != null) {
            $xtagPeldany.vanHatvany = true;
            $xtagPeldany.hatvanyJel = "^";
            $xtagPeldany.hatvany = Integer.parseInt($NUMBER.text);
        }
    }
    | OPADD? prefix = NUMBER? 'x' ('^' ints = NUMBER)? {
        $xtagPeldany = new XTag();
        $xtagPeldany.xSzoveg = "x";

        if ($OPADD != null) $xtagPeldany.muvelet = $OPADD.text;
        if ($prefix != null) $xtagPeldany.egyutthato = $prefix.text;
        if ($ints != null) {
            $xtagPeldany.vanHatvany = true;
            $xtagPeldany.hatvanyJel = "^";
            $xtagPeldany.hatvany = Integer.parseInt($ints.text);
        }
    }
    | szamTag = szamExpr {
        $xtagPeldany = new XTag();
        $xtagPeldany.xSzoveg = "";

        if ($szamTag.value >= 0d) $xtagPeldany.muvelet = "+";
        else $xtagPeldany.muvelet = "-";
        $xtagPeldany.egyutthato = String.valueOf($szamTag.value);
    }
    ;

szamExpr returns [double value]
    : fstop=szamAddop { $value = $fstop.value; } (OPADD nxtop=szamAddop { if ("+".equals($OPADD.text)) $value += $nxtop.value; else $value -= $nxtop.value; })*
    ;

szamAddop returns [double value]
    : fstop=szamMulop { $value = $fstop.value; } (OPMUL nxtop=szamMulop { if ("*".equals($OPMUL.text)) $value *= $nxtop.value; else $value /= $nxtop.value; })*
    ;

szamMulop returns [double value]
    : fstop=szamFct { $value = $fstop.value; } (OPPWR nxtop=szamMulop { $value = Math.pow($value, $nxtop.value); })?
    ;

szamFct returns [double value]
    : NUMBER { $value = Double.parseDouble($NUMBER.text); }
    | '(' szamExpr ')' { $value = $szamExpr.value; }
    | 'abs' '(' szamExpr ')' { $value = Math.abs($szamExpr.value); }
    | OPMINMAX '(' fstop=szamExpr { $value = $fstop.value; } (',' nxtop=szamExpr  {
        if ("min".equals(OPMINMAX) && $nxtop.value < $value) $value = $nxtop.value;
        else if ("max".equals(OPMINMAX) && $nxtop.value > $value) $value = $nxtop.value;
    }) * ')'
    | OPADD szamFct { $value = "-".equals($OPADD.text) ? -$szamFct.value : $szamFct.value; }
    ;


POLINOM_KULCSSZO: 'polynom' ;
//VALTOZO : (?![xX])[a-zA-Z] ('_'[0-9]+)? ;

VALTOZO         : [a-wy-zA-WY-Z] ('_' [0-9]+)? ;

SZAM_KULCSSZO   : 'number' ;

//POLINOM         : '<' XTAG (OPADD XTAG)* '>' ;

WS              : [ \t\r]+ -> skip ;
NL              : [\n]+ -> skip;
NUMBER          : [0-9]+('.' [0-9]+)? ;
OPADD           : '+' | '-' ;
OPMUL           : '*' | '/' ;
OPPWR           : '^' ;
OPMINMAX        : 'min' | 'max' ;

/*
polynom p_1;
polynom p_1, p_2;
number a;
a = 3 - 2 * 1;
p_1 = <x - a>;
p_2 = <x+1x^0>;
show((p_1 * p_2)[3]);
show(p_1 * p_2[2]);
show((<x^2 + 2x + 1> / <1x^1 + 1>)[p_1[2]]);

polynom p_3 = <x^2+1x^0>;
*/