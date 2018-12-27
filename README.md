# GraphHeuristicPlanner
Prototype Graph Query Planner and Executor

The project consists of multiple componets -- parser, heuristic planner and executor.

The parser parses raw Gremlin/Test language query and generates an Abstract Syntax Tree.

The heuristic planner operates in two stages:

1) First Phase Optimizer -- First phase optimizer optimizes parsed Graph query and applies heuristics to optimize the
   AST. These heuristics are "rule-of-thumb" and are generic rules to optimize the structure of the AST.

2) Second Phase Optimizer -- Second Phase Optimizer applies dynamic factors such as current memory utilization to choose the
   optimal graph traversal algorithm for the current traversal.
   
The executor executes by identifying the potential partial solutions and aggresively pruning the search space. The executor is
unique in the sense that the executor uses multiple heuristics within same algorithm to generate different solutions and then costs
them and picks the best solution. This leads to a dynamic choice of the heuristic being used. For eg, within Hill Climbing Algorithm,
the executor may pick a simple heuristic and may choose a steep hill climbing heuristic given the current resource utilization.
