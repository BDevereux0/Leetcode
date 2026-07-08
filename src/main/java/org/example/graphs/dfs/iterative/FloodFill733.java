package org.example.graphs.dfs.iterative;

import java.util.ArrayDeque;
import java.util.Deque;

public class FloodFill733 {

    public int [][] floodFill(int[][]image, int sr, int sc, int color){
        int originalColor = image[sr][sc];

        Deque<int[]> stack = new ArrayDeque<>();
        stack.push(new int[] {sc, sr});

        while (!stack.isEmpty()){
            int[] currentPosition = stack.pop();

            int row = currentPosition[0];
            int col = currentPosition[1];

            if (row < 0 || row >= image.length || col < 0 || col >= image[0].length){
                continue;
            }

            if (image[row][col] == originalColor){
                continue;
            }

            image[row][col] = color;

            stack.push(new int[]{row - 1, col});
            stack.push(new int[]{row + 1, col});
            stack.push(new int[]{row, col - 1});
            stack.push(new int[]{row, col + 1});
        }

        return image;
    }

    public static void main(String[] args) {
        int[][] ar = {{1,1,1}, {1,1,0}, {1,0,1}};
        int[][] ar1 = {{0,0,0}, {0,0,0}};
    }
}
