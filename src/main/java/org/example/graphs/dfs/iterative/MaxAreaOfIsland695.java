package org.example.graphs.dfs.iterative;

import java.util.ArrayDeque;
import java.util.Deque;

public class MaxAreaOfIsland695 {

    public static int maxAreaOfIsland(int[][] grid){
        int maxArea = 0;
        int currentArea = 0;
        Deque<int[]> stack = new ArrayDeque<>();
        int[][] traversed = new int[grid.length][grid[0].length];

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {

                if (grid[row][col] == 0){
                    continue;
                }

                if (traversed[row][col] == 1){
                    continue;
                }

                if (grid[row][col] == 1 && traversed[row][col] != 1){
                    stack.push(new int[]{row,col});
                    while(!stack.isEmpty()){
                        int[] coords = stack.pop();
                        int innerRow = coords[0];
                        int innerCol = coords[1];

                        if (innerRow < 0 || innerRow >= grid.length){
                            continue;
                        }

                        if (innerCol < 0 || innerCol >= grid[0].length){
                            continue;
                        }

                        if (grid[innerRow][innerCol] == 0){
                            continue;
                        }

                        if (traversed[innerRow][innerCol]==1){
                            continue;
                        }

                        traversed[innerRow][innerCol] =1;
                        currentArea++;

                        stack.push(new int[]{innerRow+1, innerCol});
                        stack.push(new int[]{innerRow -1, innerCol});
                        stack.push(new int[]{innerRow, innerCol+1});
                        stack.push(new int[]{innerRow, innerCol-1});
                    }
                    maxArea = Math.max(maxArea, currentArea);
                    currentArea = 0;

                }
            }
        }




        return maxArea;
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
