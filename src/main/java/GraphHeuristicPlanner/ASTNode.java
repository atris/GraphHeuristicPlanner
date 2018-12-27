package GraphHeuristicPlanner;

import java.util.List;

public class ASTNode
{
    private String nodeName;
    private String nodeLabel;
    private List<PredicateClause> predicateClauses;
    private List<ASTNode> childrenNodes;

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String name) {
        nodeName = name;
    }

    public String getNodeLabel() {
        return nodeLabel;
    }

    public void setNodeLabel(String label) {
        nodeLabel = label;
    }

    public List<PredicateClause> getPredicateClauses() {
        return predicateClauses;
    }

    public void addClause(PredicateClause predicateClause) {
        predicateClauses.add(predicateClause);
    }

    public void addClause(String clause, Long selectivity, PredicateType type) {
        PredicateClause predicateClause = new PredicateClause(clause, selectivity, type);

        predicateClauses.add(predicateClause);
    }

    public List<ASTNode> getChildrenNodes() {
        return childrenNodes;
    }

    public void addChildNode(ASTNode astNode) {
        childrenNodes.add(astNode);
    }
}
