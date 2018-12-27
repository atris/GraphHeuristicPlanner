package GraphHeuristicPlanner;

import org.optaplanner.core.api.domain.solution.PlanningEntityCollectionProperty;
import org.optaplanner.core.api.domain.solution.PlanningScore;
import org.optaplanner.core.api.domain.solution.PlanningSolution;
import org.optaplanner.core.api.domain.solution.drools.ProblemFactCollectionProperty;
import org.optaplanner.core.api.domain.valuerange.ValueRangeProvider;
import org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore;

import java.util.ArrayList;
import java.util.List;

@PlanningSolution
public class TraversalPlanner
{
    AlgorithmChose algorithmChosen;
    private HardSoftScore score;
    ASTNode root;
    TraversalExecutor traversalExecutor;

    public TraversalPlanner() {
        algorithmChosen = AlgorithmChose.ASTAR;
    }

    private void setTraversalExecutor(AlgorithmChose algorithmChosen) {
        if (algorithmChosen == AlgorithmChose.ASTAR) {
        }
    }

    public void setAlgorithmChosen(AlgorithmChose algorithmChosen)
    {
        this.algorithmChosen = algorithmChosen;
    }

    public AlgorithmChose getAlgorithmChosen()
    {
        return algorithmChosen;
    }

    public void setScore(HardSoftScore score)
    {
        this.score = score;
    }

    public HardSoftScore getScore()
    {
        return score;
    }

    public ASTNode getRoot()
    {
        return root;
    }

    public void setRoot(ASTNode root)
    {
        this.root = root;
    }

    public TraversalExecutor getTraversalExecutor()
    {
        return traversalExecutor;
    }

    public void setTraversalExecutor(TraversalExecutor traversalExecutor)
    {
        this.traversalExecutor = traversalExecutor;
    }
}
