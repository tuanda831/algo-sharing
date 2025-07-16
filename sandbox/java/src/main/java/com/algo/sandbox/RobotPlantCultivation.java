package com.algo.sandbox;

public class RobotPlantCultivation {
    public String solution(int X, int Y, int[][] array) {
        int M = array.length;
        int N = array[0].length;

        // Create padded grid with 1s as boundary
        int[][] grid = new int[M + 2][N + 2];

        // Fill boundary with 1s
        for (int i = 0; i < M + 2; i++) {
            grid[i][0] = 1;           // Left boundary
            grid[i][N + 1] = 1;       // Right boundary
        }
        for (int j = 0; j < N + 2; j++) {
            grid[0][j] = 1;           // Top boundary
            grid[M + 1][j] = 1;       // Bottom boundary
        }

        // Copy original array to padded grid (offset by 1)
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                grid[i + 1][j + 1] = array[i][j];
            }
        }

        // Direction mappings
        int[] dx = {0, 0, 1, -1}; // E, W, S, N
        int[] dy = {1, -1, 0, 0};
        char[] directions = {'E', 'W', 'S', 'N'};

        StringBuilder bestPath = new StringBuilder();
        int[] maxTrees = {0};

        // Adjust starting position for padding (add 1 to both coordinates)
        int startX = X + 1;
        int startY = Y + 1;

        // Plant tree at starting position
        grid[startY][startX] = 1;

        // Start backtracking
        backtrack(startX, startY, grid, dx, dy, directions, new StringBuilder(), 1, bestPath, maxTrees);

        return bestPath.toString();
    }

    private void backtrack(int x, int y, int[][] grid,
                           int[] dx, int[] dy, char[] directions,
                           StringBuilder currentPath, int treesPlanted,
                           StringBuilder bestPath, int[] maxTrees) {

        // Update the best path if current path is better
        if (treesPlanted > maxTrees[0]) {
            maxTrees[0] = treesPlanted;
            bestPath.setLength(0);
            bestPath.append(currentPath);
        }

        // Try all 4 directions
        for (int i = 0; i < 4; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];

            // No bounds checking needed! Just check if cell is empty
            if (grid[newY][newX] == 0) {
                // Plant tree at new position
                grid[newY][newX] = 1;
                currentPath.append(directions[i]);

                // Continue exploring
                backtrack(newX, newY, grid, dx, dy, directions,
                        currentPath, treesPlanted + 1, bestPath, maxTrees);

                // Backtrack
                grid[newY][newX] = 0;
                currentPath.setLength(currentPath.length() - 1);
            }
        }
    }
}

// Boundary initialization: Fill the entire border with 1s to act as walls
// Original 3×3:    Padded 5×5:
// [0,1,0]          [1,1,1,1,1]
// [0,0,1]    →     [1,0,1,0,1]
// [1,0,0]          [1,0,0,1,1]
//                  [1,1,0,0,1]
//                  [1,1,1,1,1]
// This approach is commonly used in competitive programming and grid-based algorithms to simplify boundary handling.