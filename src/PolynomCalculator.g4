grammar PolynomCalculator;

options {
    language = Java;
}

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
    | kiertekeles
    | showUtasitas
    ;

showUtasitas
    : SHOW_KULCSSZO '(' showPolinom = polinom ')' {System.out.println($showPolinom.polinomPeldany.toString());}
    | SHOW_KULCSSZO '(' VALTOZO ')' {
        if (polinomok.containsKey($VALTOZO.text)) System.out.println(polinomok.get($VALTOZO.text).toString());
        else System.out.println(szamValtozok.get($VALTOZO.text));
    }
    | SHOW_KULCSSZO '(' showSzamExpr = szamExpr ')' {System.out.println($showSzamExpr.value);}
    | SHOW_KULCSSZO '(' kiertekeles ')' {System.out.println($kiertekeles.kiertekeltErtek);}
    ;

kiertekeles returns[double kiertekeltErtek]
    : kiertekelendoPolinom = polinom fuggvenyertek = kiertekelendoSzam {
        Polinom polinom = $kiertekelendoPolinom.polinomPeldany;
        $kiertekeltErtek = polinom.evaluatePolinom($fuggvenyertek.value);
        // System.out.println("polinom: " + polinom.toString() + ", ertek:" + $kiertekeltErtek);
    }
    ;

kiertekelendoSzam returns[double value]
    : '[' ertekelendoSzam = szamExpr ']' {$value = $ertekelendoSzam.value;}
    | '[' belsoKiertekeles = kiertekeles ']' {$value = $belsoKiertekeles.kiertekeltErtek;}
    ;

polinomExpr returns [double value]
    : fstop=polinomAddop { $value = $fstop.value; } (OPADD nxtop=polinomAddop { if ("+".equals($OPADD.text)) $value += $nxtop.value; else $value -= $nxtop.value; })*
    ;

polinomAddop returns [double value]
    : fstop=polinomMulop { $value = $fstop.value; } (OPMUL nxtop=polinomMulop { if ("*".equals($OPMUL.text)) $value *= $nxtop.value; else $value /= $nxtop.value; })*
    ;

polinomMulop returns [double value]
    : fstop=polinomFct { $value = $fstop.value; } (OPPWR nxtop=polinomMulop { $value = Math.pow($value, $nxtop.value); })?
    ;

polinomFct returns [double value]
    : csakpolinom = polinomVagypolinomValtozo { $value = $csakpolinom.value; }
    | '(' polinomExpr ')' { $value = $polinomExpr.value; }
    | 'abs' '(' polinomExpr ')' { $value = Math.abs($polinomExpr.value); }
    | OPMINMAX '(' fstop=polinomExpr { $value = $fstop.value; } (',' nxtop=polinomExpr  {
        if ("min".equals(OPMINMAX) && $nxtop.value < $value) $value = $nxtop.value;
        else if ("max".equals(OPMINMAX) && $nxtop.value > $value) $value = $nxtop.value;
    }) * ')'
    | OPADD polinomFct { $value = "-".equals($OPADD.text) ? -$polinomFct.value : $polinomFct.value; }
    ;

polinomVagypolinomValtozo returns [double value]
    : NUMBER { $value = Double.parseDouble($NUMBER.text); }
    | VALTOZO { $value = polinomValtozok.get($VALTOZO.text); }
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
    : {$xtagPeldany = new XTag();}
        (prefix = szamExpr {$xtagPeldany.egyutthato = $prefix.value;})?
        'x' ('^' ints = NUMBER)? {
        $xtagPeldany.xSzoveg = "x";

        if ($ints != null) {
            $xtagPeldany.vanHatvany = true;
            $xtagPeldany.hatvanyJel = "^";
            $xtagPeldany.hatvany = Integer.parseInt($ints.text);
        }
    }
    | {$xtagPeldany = new XTag();}
        szamTag = szamExpr {
        $xtagPeldany.xSzoveg = "";
        $xtagPeldany.egyutthato = $szamTag.value;
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
    : csakSzam = szamVagySzamValtozo { $value = $csakSzam.value; }
    | '(' szamExpr ')' { $value = $szamExpr.value; }
    | 'abs' '(' szamExpr ')' { $value = Math.abs($szamExpr.value); }
    | OPMINMAX '(' fstop=szamExpr { $value = $fstop.value; } (',' nxtop=szamExpr  {
        if ("min".equals(OPMINMAX) && $nxtop.value < $value) $value = $nxtop.value;
        else if ("max".equals(OPMINMAX) && $nxtop.value > $value) $value = $nxtop.value;
    }) * ')'
    | OPADD szamFct { $value = "-".equals($OPADD.text) ? -$szamFct.value : $szamFct.value; }
    ;

szamVagySzamValtozo returns [double value]
    : NUMBER { $value = Double.parseDouble($NUMBER.text); }
    | VALTOZO { $value = szamValtozok.get($VALTOZO.text); }
    ;




POLINOM_KULCSSZO: 'polynom' ;
VALTOZO         : [a-wy-zA-WY-Z] ('_' [0-9]+)? ;
SZAM_KULCSSZO   : 'number' ;
SHOW_KULCSSZO   : 'show' ;

WS              : [ \t\r]+ -> skip ;
NL              : [\n]+ -> skip;
NUMBER          : [0-9]+('.' [0-9]+)? ;
OPADD           : '+' | '-' ;
OPMUL           : '*' | '/' ;
OPPWR           : '^' ;
OPMINMAX        : 'min' | 'max' ;
