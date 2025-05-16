import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.stringtemplate.v4.gui.JTreeScopeStackModel;

import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Map<String, Polinom> polinomok = new HashMap<>();
        Map<String, Double> szamValtozok = new HashMap<>();
/*

polynom p_1, p_2;
number a;
a = 3 - 2 * 1;
p_1 = <x - a>;
p_2 = <x+1x^0>;
show((p_1 * p_2)[3]);
show(p_1 * p_2[2]);
show((<x^2 + 2x + 1> / <1x^1 + 1>)[p_1[2]]);
*/
        String polinomSzoveg1 = """
                polynom p_1, p_2, p_3;
                number b = 4 * 4 + 1;
                number a;
                a = 3 - 2^(3 * 1) + 1;
                p_1 = <x - a>;
                p_3 = <x^2 - 3x + 4*a^2>;
                p_2 = <x+1x^0>;
                
                number c;
                number c_3 = 5;
                polynom p_4 = <-3x^14+1x^0+4^2 - 5 * 2>, p_5;
                number c_45;
                number a_3;
                """;
        CharStream inputStream = CharStreams.fromString(polinomSzoveg1);

        PolynomCalculatorLexer lex = new PolynomCalculatorLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lex);
        PolynomCalculatorParser parser = new PolynomCalculatorParser(tokens);
        parser.setPolinomok(polinomok);
        parser.setSzamValtozok(szamValtozok);

        // parser.start();

        System.out.println(parser.start().toStringTree(parser));

        System.out.println("Polinomok:");
        for (Map.Entry<String, Polinom> entry : polinomok.entrySet()) {
            String key = entry.getKey();
            Polinom value = entry.getValue();

            System.out.println(key + " = " + value.toString());
        }

        System.out.println("Szám változók:");
        for (Map.Entry<String, Double> entry : szamValtozok.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();

            System.out.println(key + " = " + value);
        }
    }
}
