package org.example.graphs.bfs;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Queue;

public class FloodFill733 {

    public static int[][] fillColor(int[][] image, int sr, int sc, int color){

        int originalColor = image[sr][sc];

        if (image[sr][sc]== color) return image;

        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[] {sr, sc});

        while(!queue.isEmpty()){
            int[] currentPosition = queue.remove();

            int row = currentPosition[0];
            int column = currentPosition[1];

            if (row < 0 || row >= image.length){
                continue;
            }

            if (column < 0 || column >= image.length){
                continue;
            }

            if (image[row][column] != originalColor){
                continue;
            }

            image[row][column] = color;

            queue.add(new int[] {row + 1, column});
            queue.add(new int[] {row - 1, column});
            queue.add(new int[] {row, column - 1});
            queue.add(new int[] {row, column + 1});
        }


        return image;
    }


    public static void main(String[] args) {
        int[][] ar = {{1,1,1}, {1,1,0}, {1,0,1}};
        int[][] ar1 = {{0,0,0}, {0,0,0}};

        System.out.println(Arrays.deepToString(fillColor(
                ar, 1, 1, 2
        )));

        System.out.println(Arrays.deepToString(fillColor(
                ar1, 0, 0, 0
        )));
    }
}
