package GraphHeuristicPlanner;

import GraphHeuristicPlanner.antlr.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ASTNodeListener extends DummyGrammarBaseListener
{
    private List<ASTNode> astNodes = new ArrayList<ASTNode>();;
    private ASTNode currentASTNode;
    private PredicateClause predicateClause;

    @Override
    public void enterQuery(DummyGrammarParser.QueryContext ctx) {
        this.currentASTNode = new ASTNode();
    }

    @Override
    public void exitQuery(DummyGrammarParser.QueryContext ctx) {
        currentASTNode.addClause(predicateClause);
        astNodes.add(currentASTNode);
    }

    @Override
    public void enterMatchespredicate(DummyGrammarParser.MatchespredicateContext ctx) {
        predicateClause = new PredicateClause();

        predicateClause.setSelectivity(new Random().nextLong());
    }

    @Override
    public void enterMatchesclause(DummyGrammarParser.MatchesclauseContext ctx) {
        if (predicateClause == null) {
            throw new IllegalStateException("PredicateClause should have been allocated");
        }

        predicateClause.setPredicateType(PredicateType.MATCHES);
        predicateClause.setClause(ctx.getText());
    }

    @Override
    public void enterWhereclause(DummyGrammarParser.WhereclauseContext ctx) {
        if (predicateClause == null) {
            throw new IllegalStateException("PredicateClause should have been allocated");
        }

        predicateClause.setPredicateType(PredicateType.WHERE);
        predicateClause.setClause(ctx.getText());
    }

    @Override
    public void enterLiteral(DummyGrammarParser.LiteralContext ctx) {
        predicateClause.setClause(ctx.getText());
    }

    @Override
    public void enterNodename(DummyGrammarParser.NodenameContext ctx) {
        currentASTNode.setNodeName(ctx.getText());
    }

    public List<ASTNode> getEntries() {
        return Collections.unmodifiableList(astNodes);
    }
}