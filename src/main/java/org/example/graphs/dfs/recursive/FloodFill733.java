package org.example.graphs.dfs.recursive;

import java.util.Arrays;

public class FloodFill733 {

    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalColor = image[sr][sc];

        if (originalColor == color) return image;

        fillColors(image, sr, sc, color, originalColor);

        return image;
    }

    public static void fillColors(int[][] image, int sr, int sc, int color, int originalColor){

        //guards against row out-of-bounds. Notice the return
        if (sr < 0 || sr >= image.length){
            return;
        }
        //guards against column of bounds
        if (sc < 0 || sc >= image[0].length){
            return;
        }

        //guards against changing incorrect nodes
        if (image[sr][sc] != originalColor){
            return;
        }

        image[sr][sc] = color;

        fillColors(image, sr-1, sc, color, originalColor);
        fillColors(image, sr+1, sc, color, originalColor);
        fillColors(image, sr, sc - 1, color, originalColor);
        fillColors(image, sr, sc + 1, color, originalColor);
    }

    public static void main(String[] args) {
        int[][] ar = {{1,1,1}, {1,1,0}, {1,0,1}};
        int[][] ar1 = {{0,0,0}, {0,0,0}};

        System.out.println(Arrays.deepToString(floodFill(ar,1,1,2)));
        System.out.println(Arrays.deepToString(floodFill(ar1,0,0,0)));
    }
}
