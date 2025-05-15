import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class CalculatorMain {
    public static void main(String[] args) throws Exception {
        double memorySlot = 0.0;

        CharStream inputStream = CharStreams.fromString("M = 3 * 1 + 2^(2 + 2)\n");

        CalculatorLexer lex = new CalculatorLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream (lex);
        CalculatorParser parser = new CalculatorParser(tokens);
        parser.start();
    }
}
