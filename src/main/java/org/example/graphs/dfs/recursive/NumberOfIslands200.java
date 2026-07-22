package org.example.graphs.dfs.recursive;

public class NumberOfIslands200 {

    public static int numIslands(char[][] grid) {
        int islands = 0;
        int[][] foundIslands = new int[grid.length][grid[0].length];


        for (int i = 0; i <= grid.length -1; i++) {
            for (int j = 0; j < grid[i].length; j++) {

                if (foundIslands[i][j] == 1 || grid[i][j] == '0'){
                    continue;
                }

                if (grid[i][j] == '1'){
                    islands++;
                    islandHelper(i,j, grid, foundIslands);
                }
            }
        }

        return islands;
    }

    public static void islandHelper(int row, int column, char[][] grid, int[][] foundIslands){


        //don't forget to guard!
        if (row < 0 || row >= grid.length){
            return;
        }

        if (column < 0 || column >= grid[0].length){
            return;
        }

        if (grid[row][column] == '0'){
            return;
        }

        if (foundIslands[row][column] == 1){
            return;
        }

        foundIslands[row][column] = 1;

        islandHelper(row - 1, column, grid, foundIslands);
        islandHelper(row + 1, column, grid, foundIslands);
        islandHelper(row, column - 1, grid, foundIslands);
        islandHelper(row, column + 1, grid, foundIslands);

    }

    public static void main(String[] args) {
        char[][] grid = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };

        char[][] grid2 = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };

        char[][] grid3 = {
                {'1', '1', '1', '0', '0'},
                {'1', '1', '1', '0', '0'},
                {'0', '0', '0', '0', '0'},
                {'0', '1', '0', '1', '1'}
        };
      //  System.out.println(numIslands(grid));
        System.out.println(numIslands(grid2));
        System.out.println(numIslands(grid3));
    }
}
