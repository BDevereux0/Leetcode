package org.example.graphs.dfs.recursive;

public class MaxAreaOfIsland695 {
    public static int maxAreaOfIsland(int[][] grid) {
        int areaOfIsland = 0;
        int[][] traversed = new int[grid.length][grid[0].length];

        for (int row = 0; row < grid.length ; row++) {
            for (int column = 0; column < grid[row].length ; column++) {
                if (grid[row][column] == 1 && traversed[row][column] != 1){
                    areaOfIsland = Math.max(
                    islandHelper(traversed, grid, row, column), areaOfIsland);
                }
            }
        }
        return areaOfIsland;
    }

    public static int islandHelper(int[][] traversed, int[][] grid,
                                        int row, int column){

        int down = 0;
        int up = 0;
        int left = 0;
        int right =0;

        if (row < 0 || row >= grid.length){
            return 0;
        }

        if (column < 0 || column >= grid[0].length){
            return 0;
        }

        if (traversed[row][column] == 1){
            return 0;
        }

        if (grid[row][column] == 0){
            return 0;
        }

        traversed[row][column] = 1;

        down = islandHelper(traversed, grid, row + 1, column);
        up = islandHelper(traversed, grid,row -1 , column);
        right = islandHelper(traversed, grid, row, column +1);
        left = islandHelper(traversed, grid, row, column - 1);

        return 1+ down + up + right + left;
    }

    public static void main(String[] args) {

        int[][] grid = {
                {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}
        };


        System.out.println(maxAreaOfIsland(grid));
    }
}
