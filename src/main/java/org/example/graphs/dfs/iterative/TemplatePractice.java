package org.example.graphs.dfs.iterative;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class TemplatePractice {

    public static int[][] fillArray(int [][] image, int sr, int sc, int color){

        int originalColor = image[sr][sc];

        Deque<int []> stack = new ArrayDeque<>();
        stack.push(new int[] {sr, sc});

        if (image[sr][sc] == color) return image;

        while (!stack.isEmpty()){

            int[] currentCoords = stack.pop();

            int row = currentCoords[0];
            int column = currentCoords[1];

            if (row < 0 || row >= image.length){
                continue;
            }

            if (column < 0 || column >= image[0].length){
                continue;
            }

            if (image[row][column] != originalColor){
                continue;
            }

            image[row][column] = color;

            stack.push(new int[] {row+1, column});
            stack.push(new int[] {row-1, column});
            stack.push(new int[] {row, column+1});
            stack.push(new int[] {row, column-1});
        }

        return image;
    }

    public static void main(String[] args) {
        int[][] ar = {{1,1,1}, {1,1,0}, {1,0,1}};
        int[][] ar1 = {{0,0,0}, {0,0,0}};

        System.out.println(Arrays.deepToString(
                fillArray(ar, 1,1,2)
        ));

        System.out.println(Arrays.deepToString(
                fillArray(ar1, 0, 0, 0)
        ));

    }
}
