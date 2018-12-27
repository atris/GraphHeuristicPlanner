package GraphHeuristicPlanner.Planner;

import GraphHeuristicPlanner.ASTNode;
import GraphHeuristicPlanner.PredicateClause;

import java.io.IOException;
import java.util.List;

public class FirstPhaseOptimizerService {

    KieSession kieSession=new ReteAlgorithmService().getKieSession();

    public ASTNode optimizeASTNode(ASTNode astNode) throws IOException {
        List<PredicateClause> predicateClauses = astNode.getPredicateClauses();

        kieSession.insert(astNode);
        kieSession.setGlobal("astNode", astNode);

        for (int i = 0; i < predicateClauses.size(); i++) {
            kieSession.setGlobal("predicateClause", predicateClauses.get(i));
            kieSession.fireAllRules();
        }

        return astNode;
    }
}
