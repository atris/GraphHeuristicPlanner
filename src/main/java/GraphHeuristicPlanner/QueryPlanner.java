package GraphHeuristicPlanner;

import GraphHeuristicPlanner.Planner.FirstPhaseOptimizerService;
import GraphHeuristicPlanner.Planner.SecondPhaseOptimizerService;
import GraphHeuristicPlanner.antlr.DummyGrammarLexer;
import GraphHeuristicPlanner.antlr.DummyGrammarParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

public class QueryPlanner
{
    private ASTNode root;
    private FirstPhaseOptimizerService firstPhaseOptimizerService;
    private SecondPhaseOptimizerService secondPhaseOptimizerService;

    public void setup(){
        firstPhaseOptimizerService = new FirstPhaseOptimizerService();
        secondPhaseOptimizerService = new SecondPhaseOptimizerService();
    }

    public void executePlanning() throws IOException{
        String query ="g.WHERE(a > 5).MATCHES(b < 20)";

        // instantiate the lexer, the parser, and the walker
        ASTNodeListener listener = new ASTNodeListener();
        DummyGrammarLexer mainLexer = new DummyGrammarLexer(CharStreams.fromString(query));
        CommonTokenStream tokens = new CommonTokenStream(mainLexer);
        DummyGrammarParser mainParser = new DummyGrammarParser(tokens);
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener, mainParser.dummygrammar());

        ASTNode root = listener.getEntries().get(0);

        ASTNode optimizedRoot = firstPhaseOptimizerService.optimizeASTNode(root);
        TraversalPlanner traversalPlanner = new TraversalPlanner();
        MemoryConsumptionCalculator memoryConsumptionCalculator = new MemoryConsumptionCalculator();

        traversalPlanner.setRoot(optimizedRoot);
        secondPhaseOptimizerService.optimizeTraversalPlanner(traversalPlanner, memoryConsumptionCalculator);
    }

    public ASTNode getRoot()
    {
        return root;
    }

    public void setRoot(ASTNode root)
    {
        this.root = root;
    }
}
