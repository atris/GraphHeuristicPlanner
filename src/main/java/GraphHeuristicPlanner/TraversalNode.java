package GraphHeuristicPlanner;

public class TraversalNode
        implements TraversalState {

    private int g;
    private int f;
    private int h;
    private int row;
    private int col;
    private boolean isBlock;
    private TraversalNode parent;

    public TraversalNode(int row, int col) {
        super();
        this.row = row;
        this.col = col;
    }

    public void calculateHeuristic(TraversalNode finalTraversalNode) {
        this.h = Math.abs(finalTraversalNode.getRow() - getRow()) + Math.abs(finalTraversalNode.getCol() - getCol());
    }

    public void setNodeData(TraversalNode currentTraversalNode, int cost) {
        int gCost = currentTraversalNode.getG() + cost;
        setParent(currentTraversalNode);
        setG(gCost);
        calculateFinalCost();
    }

    public boolean checkBetterPath(TraversalNode currentTraversalNode, int cost) {
        int gCost = currentTraversalNode.getG() + cost;
        if (gCost < getG()) {
            setNodeData(currentTraversalNode, cost);
            return true;
        }
        return false;
    }

    private void calculateFinalCost() {
        int finalCost = getG() + getH();
        setF(finalCost);
    }

    @Override
    public boolean equals(Object arg0) {
        TraversalNode other = (TraversalNode) arg0;
        return this.getRow() == other.getRow() && this.getCol() == other.getCol();
    }

    @Override
    public String toString() {
        return "TraversalNode [row=" + row + ", col=" + col + "]";
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

    public int getF() {
        return f;
    }

    public void setF(int f) {
        this.f = f;
    }

    public TraversalNode getParent() {
        return parent;
    }

    public void setParent(TraversalNode parent) {
        this.parent = parent;
    }

    public boolean isBlock() {
        return isBlock;
    }

    public void setBlock(boolean isBlock) {
        this.isBlock = isBlock;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }
}
