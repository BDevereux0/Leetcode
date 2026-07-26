package org.example.graphs.dfs.iterative;

import java.util.ArrayDeque;
import java.util.Deque;

public class NumberOfIslands200 {

    public static int numIslands(char[][] grid ){
        int islands = 0;
        int[][] foundIslands = new int[grid.length][grid[0].length];
        Deque<int[]> stack = new ArrayDeque<>();

        stack.push(new int[]{0,0});

        while (!stack.isEmpty()){
            int[] currentCoords = stack.pop();

            int row = currentCoords[0];
            int col = currentCoords[1];

            if (row < 0 || row >= grid.length){
                continue;
            }

            if (col < 0 || col >= grid[0].length){
                continue;
            }

            if (foundIslands[row][col] == 1){
                continue;
            }

            if (grid[row][col] == '0'){
                continue;
            }

            if (grid[row][col] == '1'){
                islands++;
                foundIslands[row][col] = 1;

                stack.push(new int[]{row +1, col});
                stack.push(new int[]{row -1, col});
                stack.push(new int[]{row, col + 1});
                stack.push(new int[]{row, col - 1});
            }
        }




        return islands;
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
        System.out.println(numIslands(grid));
        System.out.println(numIslands(grid2));
        System.out.println(numIslands(grid3));
    }
}
