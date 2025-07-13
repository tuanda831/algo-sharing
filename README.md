# Algo Learning
## Lesson 1: The Basics

### Topic 1: Problem-solving framework
- Understand the problem
- Brute-force baseline
- Optimize iteratively
- Edge cases & constraints

### Topic 2: Big O analysis
![alt BigONotation](./docs/bigONotation.png)
- Time complexity (nested loops, recursion)
- Space complexity (arrays, call stacks)
- Real-world trade-offs

----
## Lesson 2: Brute Force & Recursion

### Topic 1: Brute-force strategy

- Try all possible combinations (e.g. Task3)
- Use cases: string matching, array permutations

### Topic 2: Recursion
- Stack behavior, base cases
- Trace example call stacks

### Topic 3: Backtracking
- DFS-style recursion + undoing state
- Use case: [Robot Plant Cultivation](./docs/Backtracking.md), Sudoku solver, permutations

### Topic 4: Convert recursion to iteration
- Tail recursion, stack simulation

----
## Lesson 3: Optimization over Brute Force

### Topic 1: Branch and Bound
- Pruning invalid paths early
- Bounding based on optimal value estimates

### Topic 2: Memoization
- Store intermediate results
- Leads into DP

----
## Lesson 4: Dynamic Programming

### Topic 1: Top-down vs Bottom-up

### Topic 2: 1D and 2D DP

### Topic 3: DP Optimization Techniques
- Space reduction
- Monotonic queues for optimization

### Topic 4: Common DP Patterns
- Knapsack, LIS, Fibonacci, Matrix paths
- State representation (dp[i], dp[i][j])

----
## Lesson 5: Common Algorithms
### Topic 1: Greedy Algorithms
- When it works (intervals, local optimal = global)

### Topic 2: Binary Search Variants
- On sorted arrays, answers space

### Topic 3: Union-Find (DSU)
- Connectivity and components

### Topic 4: Bit Manipulation
- XOR tricks, masking, power of two checks

----
## Lesson 6: Advanced Patterns "Graph Algorithms"

### Topic 1: Graph Representation
- Adjacency list vs matrix

### Topic 2: BFS and DFS
- Traversal patterns
- Visited set tracking

### Topic 3: Use cases
- Shortest path, connected components

### Topic 4: Cycle Detection & Topo Sort
- Useful for scheduling-type Codility questions
