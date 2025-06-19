grammar PolynomCalculator;

options {
    language = Java;
}

@header {
import java.util.*;
}

@members {
    Map<String, Polinom> polinomok = new HashMap<>();
    public void setPolinomok(Map<String, Polinom> polinomok) {
        this.polinomok = polinomok;
    }

    Map<String, Double> szamValtozok = new HashMap<>();
    public void setSzamValtozok(Map<String, Double> szamValtozok) {
        this.szamValtozok = szamValtozok;
    }
}

start: line ';' (line ';')* ;

line
    : showUtasitas
    | kiertekeles
    | polinomDeklaracio
    | szamValtozoDeklaracio
    | valtozoErtekadas
    ;

showUtasitas
    : SHOW_KULCSSZO '(' VALTOZO ')' {
        if (polinomok.containsKey($VALTOZO.text)) System.out.println(polinomok.get($VALTOZO.text).toString());
        else System.out.println(szamValtozok.get($VALTOZO.text));
    }
    | SHOW_KULCSSZO '(' showPolinom = polinomExpr ')' {System.out.println($showPolinom.polinomPeldany.toString());}
    | SHOW_KULCSSZO '(' showSzamExpr = szamExpr ')' {System.out.println($showSzamExpr.value);}
    | SHOW_KULCSSZO '(' kiertekelesPolinomExprre ')' {System.out.println($kiertekelesPolinomExprre.kiertekeltErtek);}
    ;

kiertekeles returns[double kiertekeltErtek]
    : kiertekelendoPolinomErtek = polinom fuggvenyertek = kiertekelendoSzam {
        Polinom polinom = $kiertekelendoPolinomErtek.polinomPeldany;
        $kiertekeltErtek = polinom.evaluatePolinom($fuggvenyertek.value);
    }
    | VALTOZO fuggvenyertek = kiertekelendoSzam {
        Polinom polinom =  polinomok.get($VALTOZO.text);
        $kiertekeltErtek = polinom.evaluatePolinom($fuggvenyertek.value);
    }
    ;


kiertekelesPolinomExprre returns[double kiertekeltErtek]
    : kiertekelendoPolinomErtek = polinomExpr fuggvenyertek = kiertekelendoSzam {
        Polinom polinom = $kiertekelendoPolinomErtek.polinomPeldany;
        $kiertekeltErtek = polinom.evaluatePolinom($fuggvenyertek.value);
    }
    ;

kiertekelendoSzam returns[double value]
    : '[' ertekelendoSzam = szamExpr ']' {$value = $ertekelendoSzam.value;}
    | '[' belsoKiertekeles = kiertekeles ']' {$value = $belsoKiertekeles.kiertekeltErtek;}
    ;

polinomExpr returns [Polinom polinomPeldany]
    : fstop=polinomAddop { $polinomPeldany = $fstop.polinomPeldany; } (OPADD nxtop=polinomAddop { if ("+".equals($OPADD.text)) $polinomPeldany = $polinomPeldany.add($nxtop.polinomPeldany); else $polinomPeldany = $polinomPeldany.subtract($nxtop.polinomPeldany); })*
    ;

polinomAddop returns [Polinom polinomPeldany]
    : fstop=polinomMulop { $polinomPeldany = $fstop.polinomPeldany; } (OPMUL nxtop=polinomMulop { if ("*".equals($OPMUL.text)) $polinomPeldany = $polinomPeldany.multiply($nxtop.polinomPeldany); else if ("/".equals($OPMUL.text)) $polinomPeldany = $polinomPeldany.divide($nxtop.polinomPeldany)[0]; else $polinomPeldany = $polinomPeldany.divide($nxtop.polinomPeldany)[1]; })*
    ;

polinomMulop returns [Polinom polinomPeldany]
    : fstop=polinomFct { $polinomPeldany = $fstop.polinomPeldany; }
    | exp=szamExpr {
        XTag xt = new XTag();
        xt.egyutthato = $exp.value;
        xt.xSzoveg = "";
        xt.hatvany = 0;
        Polinom polinom = new Polinom();
        polinom.addTerm(xt);
        $polinomPeldany = polinom;
    }
    ;

polinomFct returns [Polinom polinomPeldany]
    : csakpolinom = polinomVagypolinomValtozo { $polinomPeldany = $csakpolinom.polinomPeldany; }
    | '(' polinomExpr ')' { $polinomPeldany = $polinomExpr.polinomPeldany; }
    | ki=kiertekeles {
        XTag xt = new XTag();
        xt.egyutthato = $ki.kiertekeltErtek;
        xt.xSzoveg = "";
        xt.hatvany = 0;
        Polinom polinom2 = new Polinom();
        polinom2.addTerm(xt);
        $polinomPeldany = polinom2;
    }
    //| polinomFct { $polinomPeldany = "-".equals($OPADD.text) ? $polinomFct.polinomPeldany.subtract($polinomFct.polinomPeldany.add($polinomFct.polinomPeldany)) : $polinomFct.polinomPeldany; }
    ;

polinomVagypolinomValtozo returns [Polinom polinomPeldany]
    : legmelyebbPolinom = polinom { $polinomPeldany = $legmelyebbPolinom.polinomPeldany; }
    | VALTOZO { $polinomPeldany = polinomok.get($VALTOZO.text); }
    ;









valtozoErtekadas
    : VALTOZO '=' szamExpr {szamValtozok.put($VALTOZO.text, $szamExpr.value);}
    | VALTOZO '=' polinomExpr {polinomok.put($VALTOZO.text, $polinomExpr.polinomPeldany);}
    | VALTOZO '=' ki=kiertekeles  {
        XTag xt = new XTag();
        xt.egyutthato =  $ki.kiertekeltErtek;
        xt.hatvany = 0;
        xt.xSzoveg = "";
        Polinom polinom = new Polinom();
        polinom.addTerm(xt);
        {polinomok.put("ertek_polinom", polinom);}
    }
    ;

polinomDeklaracio
    : POLINOM_KULCSSZO alapValtozo = VALTOZO {polinomok.put($alapValtozo.text, new Polinom());} ('=' alapPolinom = polinomExpr {polinomok.put($alapValtozo.text, $alapPolinom.polinomPeldany);})?
     (',' ismetlodoValtozo = VALTOZO {polinomok.put($ismetlodoValtozo.text, new Polinom());} ('=' ismetlodoPolinom = polinomExpr {polinomok.put($ismetlodoValtozo.text, $ismetlodoPolinom.polinomPeldany);})?)*
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
        $xtagPeldany.hatvany = 0;
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
OPMUL           : '*' | '/' | '%';
OPPWR           : '^' ;
OPMINMAX        : 'min' | 'max' ;
