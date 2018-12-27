package GraphHeuristicPlanner;

import java.util.*;

public class AStar implements TraversalExecutor {
    private static int DEFAULT_HV_COST = 10; // Horizontal - Vertical Cost
    private static int DEFAULT_DIAGONAL_COST = 14;
    private int hvCost;
    private int diagonalCost;
    private TraversalNode[][] searchArea;
    private PriorityQueue<TraversalNode> openList;
    private Set<TraversalNode> closedSet;
    private TraversalNode initialTraversalNode;
    private TraversalNode finalTraversalNode;

    public AStar(int rows, int cols, TraversalNode initialTraversalNode, TraversalNode finalTraversalNode, int hvCost, int diagonalCost) {
        this.hvCost = hvCost;
        this.diagonalCost = diagonalCost;
        setInitialTraversalNode(initialTraversalNode);
        setFinalTraversalNode(finalTraversalNode);
        this.searchArea = new TraversalNode[rows][cols];
        this.openList = new PriorityQueue<TraversalNode>(new Comparator<TraversalNode>() {
            @Override
            public int compare(TraversalNode traversalNode0, TraversalNode traversalNode1) {
                return Integer.compare(traversalNode0.getF(), traversalNode1.getF());
            }
        });
        setNodes();
        this.closedSet = new HashSet<>();
    }

    public AStar(int rows, int cols, TraversalNode initialTraversalNode, TraversalNode finalTraversalNode) {
        this(rows, cols, initialTraversalNode, finalTraversalNode, DEFAULT_HV_COST, DEFAULT_DIAGONAL_COST);
    }

    private void setNodes() {
        for (int i = 0; i < searchArea.length; i++) {
            for (int j = 0; j < searchArea[0].length; j++) {
                TraversalNode traversalNode = new TraversalNode(i, j);
                traversalNode.calculateHeuristic(getFinalTraversalNode());
                this.searchArea[i][j] = traversalNode;
            }
        }
    }

    public void setBlocks(int[][] blocksArray) {
        for (int i = 0; i < blocksArray.length; i++) {
            int row = blocksArray[i][0];
            int col = blocksArray[i][1];
            setBlock(row, col);
        }
    }

    /*public List<TraversalState> findPath() {
        return findInnerPath();
    }*/

    public List<TraversalNode> findPath() {
        openList.add(initialTraversalNode);
        while (!isEmpty(openList)) {
            TraversalNode currentTraversalNode = openList.poll();
            closedSet.add(currentTraversalNode);
            if (isFinalNode(currentTraversalNode)) {
                return getPath(currentTraversalNode);
            } else {
                addAdjacentNodes(currentTraversalNode);
            }
        }
        return new ArrayList<TraversalNode>();
    }

    private List<TraversalNode> getPath(TraversalNode currentTraversalNode) {
        List<TraversalNode> path = new ArrayList<TraversalNode>();
        path.add(currentTraversalNode);
        TraversalNode parent;
        while ((parent = currentTraversalNode.getParent()) != null) {
            path.add(0, parent);
            currentTraversalNode = parent;
        }
        return path;
    }

    private void addAdjacentNodes(TraversalNode currentTraversalNode) {
        addAdjacentUpperRow(currentTraversalNode);
        addAdjacentMiddleRow(currentTraversalNode);
        addAdjacentLowerRow(currentTraversalNode);
    }

    private void addAdjacentLowerRow(TraversalNode currentTraversalNode) {
        int row = currentTraversalNode.getRow();
        int col = currentTraversalNode.getCol();
        int lowerRow = row + 1;
        if (lowerRow < getSearchArea().length) {
            if (col - 1 >= 0) {
                checkNode(currentTraversalNode, col - 1, lowerRow, getDiagonalCost()); // Comment this line if diagonal movements are not allowed
            }
            if (col + 1 < getSearchArea()[0].length) {
                checkNode(currentTraversalNode, col + 1, lowerRow, getDiagonalCost()); // Comment this line if diagonal movements are not allowed
            }
            checkNode(currentTraversalNode, col, lowerRow, getHvCost());
        }
    }

    private void addAdjacentMiddleRow(TraversalNode currentTraversalNode) {
        int row = currentTraversalNode.getRow();
        int col = currentTraversalNode.getCol();
        int middleRow = row;
        if (col - 1 >= 0) {
            checkNode(currentTraversalNode, col - 1, middleRow, getHvCost());
        }
        if (col + 1 < getSearchArea()[0].length) {
            checkNode(currentTraversalNode, col + 1, middleRow, getHvCost());
        }
    }

    private void addAdjacentUpperRow(TraversalNode currentTraversalNode) {
        int row = currentTraversalNode.getRow();
        int col = currentTraversalNode.getCol();
        int upperRow = row - 1;
        if (upperRow >= 0) {
            if (col - 1 >= 0) {
                checkNode(currentTraversalNode, col - 1, upperRow, getDiagonalCost()); // Comment this if diagonal movements are not allowed
            }
            if (col + 1 < getSearchArea()[0].length) {
                checkNode(currentTraversalNode, col + 1, upperRow, getDiagonalCost()); // Comment this if diagonal movements are not allowed
            }
            checkNode(currentTraversalNode, col, upperRow, getHvCost());
        }
    }

    private void checkNode(TraversalNode currentTraversalNode, int col, int row, int cost) {
        TraversalNode adjacentTraversalNode = getSearchArea()[row][col];
        if (!adjacentTraversalNode.isBlock() && !getClosedSet().contains(adjacentTraversalNode)) {
            if (!getOpenList().contains(adjacentTraversalNode)) {
                adjacentTraversalNode.setNodeData(currentTraversalNode, cost);
                getOpenList().add(adjacentTraversalNode);
            } else {
                boolean changed = adjacentTraversalNode.checkBetterPath(currentTraversalNode, cost);
                if (changed) {
                    // Remove and Add the changed node, so that the PriorityQueue can sort again its
                    // contents with the modified "finalCost" value of the modified node
                    getOpenList().remove(adjacentTraversalNode);
                    getOpenList().add(adjacentTraversalNode);
                }
            }
        }
    }

    private boolean isFinalNode(TraversalNode currentTraversalNode) {
        return currentTraversalNode.equals(finalTraversalNode);
    }

    private boolean isEmpty(PriorityQueue<TraversalNode> openList) {
        return openList.size() == 0;
    }

    private void setBlock(int row, int col) {
        this.searchArea[row][col].setBlock(true);
    }

    public TraversalNode getInitialTraversalNode() {
        return initialTraversalNode;
    }

    public void setInitialTraversalNode(TraversalNode initialTraversalNode) {
        this.initialTraversalNode = initialTraversalNode;
    }

    public TraversalNode getFinalTraversalNode() {
        return finalTraversalNode;
    }

    public void setFinalTraversalNode(TraversalNode finalTraversalNode) {
        this.finalTraversalNode = finalTraversalNode;
    }

    public TraversalNode[][] getSearchArea() {
        return searchArea;
    }

    public void setSearchArea(TraversalNode[][] searchArea) {
        this.searchArea = searchArea;
    }

    public PriorityQueue<TraversalNode> getOpenList() {
        return openList;
    }

    public void setOpenList(PriorityQueue<TraversalNode> openList) {
        this.openList = openList;
    }

    public Set<TraversalNode> getClosedSet() {
        return closedSet;
    }

    public void setClosedSet(Set<TraversalNode> closedSet) {
        this.closedSet = closedSet;
    }

    public int getHvCost() {
        return hvCost;
    }

    public void setHvCost(int hvCost) {
        this.hvCost = hvCost;
    }

    private int getDiagonalCost() {
        return diagonalCost;
    }

    private void setDiagonalCost(int diagonalCost) {
        this.diagonalCost = diagonalCost;
    }
}

