import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

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
        //show((<5x^3-9x^2>/<2x+2>*<9x-4>)[4]);
        String polinomSzoveg = """
                polynom a, b, c;
                a = <x - 1>;
                b = <x + 1x^0>;
                c = a / b;
                show(c);
                c = a / b + <2>;
                show(c);
                c = a / b + <2x + 2>;
                show(c);
                c = a / b + <2x + 2>[3];
                show(c);
                show(<2x + 2>[3]);
                
                """;
        CharStream inputStream = CharStreams.fromString(polinomSzoveg);

        PolynomCalculatorLexer lex = new PolynomCalculatorLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lex);
        PolynomCalculatorParser parser = new PolynomCalculatorParser(tokens);
        parser.setPolinomok(polinomok);
        parser.setSzamValtozok(szamValtozok);

        var sparserStart = parser.start();

        /*System.out.println(sparserStart.toStringTree(parser));

        System.out.println();
        System.out.println("Polinomok:");
        for (Map.Entry<String, Polinom> entry : polinomok.entrySet()) {
            String key = entry.getKey();
            Polinom value = entry.getValue();

            System.out.println(key + " = " + value.toString());
        }

        System.out.println();
        System.out.println("Szám változók:");
        for (Map.Entry<String, Double> entry : szamValtozok.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();

            System.out.println(key + " = " + value);
        }*/
    }
}
