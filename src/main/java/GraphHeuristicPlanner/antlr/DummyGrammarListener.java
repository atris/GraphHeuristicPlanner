// Generated from DummyGrammar.g4 by ANTLR 4.7.1
package GraphHeuristicPlanner.antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DummyGrammarParser}.
 */
public interface DummyGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DummyGrammarParser#dummygrammar}.
	 * @param ctx the parse tree
	 */
	void enterDummygrammar(DummyGrammarParser.DummygrammarContext ctx);
	/**
	 * Exit a parse tree produced by {@link DummyGrammarParser#dummygrammar}.
	 * @param ctx the parse tree
	 */
	void exitDummygrammar(DummyGrammarParser.DummygrammarContext ctx);
	/**
	 * Enter a parse tree produced by {@link DummyGrammarParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(DummyGrammarParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DummyGrammarParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(DummyGrammarParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DummyGrammarParser#matchesclause}.
	 * @param ctx the parse tree
	 */
	void enterMatchesclause(DummyGrammarParser.MatchesclauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DummyGrammarParser#matchesclause}.
	 * @param ctx the parse tree
	 */
	void exitMatchesclause(DummyGrammarParser.MatchesclauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DummyGrammarParser#whereclause}.
	 * @param ctx the parse tree
	 */
	void enterWhereclause(DummyGrammarParser.WhereclauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DummyGrammarParser#whereclause}.
	 * @param ctx the parse tree
	 */
	void exitWhereclause(DummyGrammarParser.WhereclauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DummyGrammarParser#matchespredicate}.
	 * @param ctx the parse tree
	 */
	void enterMatchespredicate(DummyGrammarParser.MatchespredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DummyGrammarParser#matchespredicate}.
	 * @param ctx the parse tree
	 */
	void exitMatchespredicate(DummyGrammarParser.MatchespredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link DummyGrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(DummyGrammarParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link DummyGrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(DummyGrammarParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link DummyGrammarParser#nodename}.
	 * @param ctx the parse tree
	 */
	void enterNodename(DummyGrammarParser.NodenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DummyGrammarParser#nodename}.
	 * @param ctx the parse tree
	 */
	void exitNodename(DummyGrammarParser.NodenameContext ctx);
}