// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PolynomCalculatorParser}.
 */
public interface PolynomCalculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PolynomCalculatorParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(PolynomCalculatorParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolynomCalculatorParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(PolynomCalculatorParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolynomCalculatorParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(PolynomCalculatorParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolynomCalculatorParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(PolynomCalculatorParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolynomCalculatorParser#valtozoErtekadas}.
	 * @param ctx the parse tree
	 */
	void enterValtozoErtekadas(PolynomCalculatorParser.ValtozoErtekadasContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolynomCalculatorParser#valtozoErtekadas}.
	 * @param ctx the parse tree
	 */
	void exitValtozoErtekadas(PolynomCalculatorParser.ValtozoErtekadasContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolynomCalculatorParser#polinomDeklaracio}.
	 * @param ctx the parse tree
	 */
	void enterPolinomDeklaracio(PolynomCalculatorParser.PolinomDeklaracioContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolynomCalculatorParser#polinomDeklaracio}.
	 * @param ctx the parse tree
	 */
	void exitPolinomDeklaracio(PolynomCalculatorParser.PolinomDeklaracioContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolynomCalculatorParser#szamValtozoDeklaracio}.
	 * @param ctx the parse tree
	 */
	void enterSzamValtozoDeklaracio(PolynomCalculatorParser.SzamValtozoDeklaracioContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolynomCalculatorParser#szamValtozoDeklaracio}.
	 * @param ctx the parse tree
	 */
	void exitSzamValtozoDeklaracio(PolynomCalculatorParser.SzamValtozoDeklaracioContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolynomCalculatorParser#polinom}.
	 * @param ctx the parse tree
	 */
	void enterPolinom(PolynomCalculatorParser.PolinomContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolynomCalculatorParser#polinom}.
	 * @param ctx the parse tree
	 */
	void exitPolinom(PolynomCalculatorParser.PolinomContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolynomCalculatorParser#xtag}.
	 * @param ctx the parse tree
	 */
	void enterXtag(PolynomCalculatorParser.XtagContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolynomCalculatorParser#xtag}.
	 * @param ctx the parse tree
	 */
	void exitXtag(PolynomCalculatorParser.XtagContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolynomCalculatorParser#szamExpr}.
	 * @param ctx the parse tree
	 */
	void enterSzamExpr(PolynomCalculatorParser.SzamExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolynomCalculatorParser#szamExpr}.
	 * @param ctx the parse tree
	 */
	void exitSzamExpr(PolynomCalculatorParser.SzamExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolynomCalculatorParser#szamAddop}.
	 * @param ctx the parse tree
	 */
	void enterSzamAddop(PolynomCalculatorParser.SzamAddopContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolynomCalculatorParser#szamAddop}.
	 * @param ctx the parse tree
	 */
	void exitSzamAddop(PolynomCalculatorParser.SzamAddopContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolynomCalculatorParser#szamMulop}.
	 * @param ctx the parse tree
	 */
	void enterSzamMulop(PolynomCalculatorParser.SzamMulopContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolynomCalculatorParser#szamMulop}.
	 * @param ctx the parse tree
	 */
	void exitSzamMulop(PolynomCalculatorParser.SzamMulopContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolynomCalculatorParser#szamFct}.
	 * @param ctx the parse tree
	 */
	void enterSzamFct(PolynomCalculatorParser.SzamFctContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolynomCalculatorParser#szamFct}.
	 * @param ctx the parse tree
	 */
	void exitSzamFct(PolynomCalculatorParser.SzamFctContext ctx);
}