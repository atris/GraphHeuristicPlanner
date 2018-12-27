package GraphHeuristicPlanner.Planner;

import GraphHeuristicPlanner.MemoryConsumptionCalculator;
import GraphHeuristicPlanner.TraversalPlanner;

import java.io.IOException;

public class SecondPhaseOptimizerService {

    KieSession kieSession=new ReteAlgorithmService().getKieSession();

    public TraversalPlanner optimizeTraversalPlanner(TraversalPlanner traversalPlanner,
            MemoryConsumptionCalculator memoryConsumptionCalculator) throws IOException {
        kieSession.insert(traversalPlanner);
        kieSession.insert(memoryConsumptionCalculator);
        kieSession.setGlobal("traversalPlanner", traversalPlanner);
        kieSession.fireAllRules();

        return traversalPlanner;
    }
}
