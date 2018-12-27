package GraphHeuristicPlanner;

public class PredicateClause
{
    private String clause;
    private Long selectivity;
    private PredicateType predicateType;

    public PredicateClause() {
        this.selectivity = 0L;
    }

    public PredicateClause(String clause, Long selectivity, PredicateType predicateType) {
        this.clause = clause;
        this.selectivity = selectivity;
        this.predicateType = predicateType;
    }

    public String getClause()
    {
        return clause;
    }

    public void setClause(String clause)
    {
        this.clause = clause;
    }

    public Long getSelectivity()
    {
        return selectivity;
    }

    public void setSelectivity(Long selectivity)
    {
        this.selectivity = selectivity;
    }

    public void setPredicateType(PredicateType predicateType)
    {
        this.predicateType = predicateType;
    }

    public PredicateType getPredicateType()
    {
        return predicateType;
    }
}
