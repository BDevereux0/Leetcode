package org.example.graphs.dfs.recursive;

import java.util.Arrays;

public class TemplatePractice {

    public static int[][] recursiveBFSTemplate(int [][] image, int sr, int sc, int color){

        int originalColor = image[sr][sc];

        if (originalColor == color){
            return image;
        }

        fillColors(image, sr, sc, color, originalColor);

        return image;
    }

    public static void fillColors(int [][] image, int sr, int sc, int color, int originalColor){

        //guards row oob
        if (sr < 0 || sr > image.length - 1){
           return;
       }

        //guards col oob
       if (sc < 0 || sc > image[0].length -1){
           return;
       }

       // allows changing only target colors
       if (image[sr][sc] != originalColor){
           return;
       }

       image[sr][sc] = color;

       fillColors(image, sr-1, sc, color, originalColor);
        fillColors(image, sr+1, sc, color, originalColor);
        fillColors(image, sr, sc-1, color, originalColor);
        fillColors(image, sr, sc+1, color, originalColor);

    }

    public static void main(String[] args) {
        int[][] ar = {{1,1,1}, {1,1,0}, {1,0,1}};
        int[][] ar1 = {{0,0,0}, {0,0,0}};

        System.out.println(Arrays.deepToString(
                recursiveBFSTemplate(ar, 1, 1, 2)
        ));
        System.out.println(Arrays.deepToString(
                recursiveBFSTemplate(ar1, 0 ,0, 0)
        ));
    }
}
