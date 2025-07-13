**Description:**

You are given a rectangular grid, divided into M rows and N columns, where each cell can be used to plant a tree. Rows are numbered from top to bottom, and columns are numbered from left to right. Each cell contains one of two values: 0 or 1. A cell with the value 1 indicates that a tree is already present, while a cell with the value 0 means there is no tree.

You are designing a tree-planting robot to replant trees. After planting a tree in a cell, this robot can move to one of its 4 adjacent cells to continue planting. To control the robot, you must provide it with a string consisting only of the characters 'E', 'W', 'S', 'N', which signify that the robot should move to an adjacent cell in the East, West, South, or North direction, respectively. The robot is not allowed to move outside the grid boundaries. The robot is also forbidden from entering a cell that already has a tree, whether it's a pre-existing tree or a tree just planted by the robot itself.

Initially, the robot is placed at a position where a tree has been cut down, specifically at row Y, column X, and this is the first cell the robot must plant a tree in. Based on the tree map and the robot's initial position, programmatically generate the control string for the robot such that it plants the maximum possible number of trees.

**Input:**

The first line contains four natural numbers M, N, Y, X, satisfying 0 < N, M < 16.
The next M lines each contain N numbers, which are either 0 or 1.

**Output:**

Print the resulting string representing the robot's movement path.

**Sample:**

- Input:
```
6 6 6 4
1 1 0 1 1 1
1 1 0 0 0 0
0 0 0 1 1 0
0 0 0 0 0 1
1 1 0 0 1 1
1 1 1 0 1 1
```

- Output: `NWNWWNEENEEES`
