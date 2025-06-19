// Generated from java-escape by ANTLR 4.11.1

import java.util.*;

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
	 * Enter a parse tree produced by {@link PolynomCalculatorParser#showUtasitas}.
	 * @param ctx the parse tree
	 */
	void enterShowUtasitas(PolynomCalculatorParser.ShowUtasitasContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolynomCalculatorParser#showUtasitas}.
	 * @param ctx the parse tree
	 */
	void exitShowUtasitas(PolynomCalculatorParser.ShowUtasitasContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolynomCalculatorParser#kiertekeles}.
	 * @param ctx the parse tree
	 */
	void enterKiertekeles(PolynomCalculatorParser.KiertekelesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolynomCalculatorParser#kiertekeles}.
	 * @param ctx the parse tree
	 */
	void exitKiertekeles(PolynomCalculatorParser.KiertekelesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolynomCalculatorParser#kiertekelesPolinomExprre}.
	 * @param ctx the parse tree
	 */
	void enterKiertekelesPolinomExprre(PolynomCalculatorParser.KiertekelesPolinomExprreContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolynomCalculatorParser#kiertekelesPolinomExprre}.
	 * @param ctx the parse tree
	 */
	void exitKiertekelesPolinomExprre(PolynomCalculatorParser.KiertekelesPolinomExprreContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolynomCalculatorParser#kiertekelendoSzam}.
	 * @param ctx the parse tree
	 */
	void enterKiertekelendoSzam(PolynomCalculatorParser.KiertekelendoSzamContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolynomCalculatorParser#kiertekelendoSzam}.
	 * @param ctx the parse tree
	 */
	void exitKiertekelendoSzam(PolynomCalculatorParser.KiertekelendoSzamContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolynomCalculatorParser#polinomExpr}.
	 * @param ctx the parse tree
	 */
	void enterPolinomExpr(PolynomCalculatorParser.PolinomExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolynomCalculatorParser#polinomExpr}.
	 * @param ctx the parse tree
	 */
	void exitPolinomExpr(PolynomCalculatorParser.PolinomExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolynomCalculatorParser#polinomAddop}.
	 * @param ctx the parse tree
	 */
	void enterPolinomAddop(PolynomCalculatorParser.PolinomAddopContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolynomCalculatorParser#polinomAddop}.
	 * @param ctx the parse tree
	 */
	void exitPolinomAddop(PolynomCalculatorParser.PolinomAddopContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolynomCalculatorParser#polinomMulop}.
	 * @param ctx the parse tree
	 */
	void enterPolinomMulop(PolynomCalculatorParser.PolinomMulopContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolynomCalculatorParser#polinomMulop}.
	 * @param ctx the parse tree
	 */
	void exitPolinomMulop(PolynomCalculatorParser.PolinomMulopContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolynomCalculatorParser#polinomFct}.
	 * @param ctx the parse tree
	 */
	void enterPolinomFct(PolynomCalculatorParser.PolinomFctContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolynomCalculatorParser#polinomFct}.
	 * @param ctx the parse tree
	 */
	void exitPolinomFct(PolynomCalculatorParser.PolinomFctContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolynomCalculatorParser#polinomVagypolinomValtozo}.
	 * @param ctx the parse tree
	 */
	void enterPolinomVagypolinomValtozo(PolynomCalculatorParser.PolinomVagypolinomValtozoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolynomCalculatorParser#polinomVagypolinomValtozo}.
	 * @param ctx the parse tree
	 */
	void exitPolinomVagypolinomValtozo(PolynomCalculatorParser.PolinomVagypolinomValtozoContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link PolynomCalculatorParser#szamVagySzamValtozo}.
	 * @param ctx the parse tree
	 */
	void enterSzamVagySzamValtozo(PolynomCalculatorParser.SzamVagySzamValtozoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolynomCalculatorParser#szamVagySzamValtozo}.
	 * @param ctx the parse tree
	 */
	void exitSzamVagySzamValtozo(PolynomCalculatorParser.SzamVagySzamValtozoContext ctx);
}