// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculatorParser}.
 */
public interface CalculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(CalculatorParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(CalculatorParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(CalculatorParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(CalculatorParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CalculatorParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CalculatorParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#addop}.
	 * @param ctx the parse tree
	 */
	void enterAddop(CalculatorParser.AddopContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#addop}.
	 * @param ctx the parse tree
	 */
	void exitAddop(CalculatorParser.AddopContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#mulop}.
	 * @param ctx the parse tree
	 */
	void enterMulop(CalculatorParser.MulopContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#mulop}.
	 * @param ctx the parse tree
	 */
	void exitMulop(CalculatorParser.MulopContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#fct}.
	 * @param ctx the parse tree
	 */
	void enterFct(CalculatorParser.FctContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#fct}.
	 * @param ctx the parse tree
	 */
	void exitFct(CalculatorParser.FctContext ctx);
}