package org.example.graphs.dfs.recursive;
//problem 547

/*
The individual arrays in the 2d array mark which provinces are connected.
So, in array[0] = [1,0,0,1] that means city 0 is connected to itself and city 3.

Algo:
Go row by row, when i find a connection like [0][3]. Go to [3][0] and implement DFS to see the connected
cities.
 */
public class NumberOfProvinces {
    public static int findCircleNum(int[][] isConnected) {
        int provinces = 0;
        int[] traversed = new int[isConnected[0].length];
        for (int row = 0; row < isConnected.length; row++) {
            if (traversed[row] != 1) {
                provinces++;
                provinceHelper(row, isConnected, traversed);
            }
        }
        return provinces;
    }

    public static void provinceHelper(int city, int[][] isConnected, int[] traversed){
        traversed[city]=1;
        for (int i = 0; i < traversed.length; i++) {
            if (isConnected[city][i]==1 && traversed[i] != 1){
                provinceHelper(i, isConnected, traversed);
            }
        }
    }

    public static void main(String[] args) {
        int[][] isConnected = {
                {1, 1, 0},
                {1, 1, 0},
                {0, 0, 1}
        };

        int[][] isConnected2 = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };

        //only 1 province here
        int[][] isConnected3 = {
                {1, 0, 0, 1},
                {0, 1, 1, 0},
                {0, 1, 1, 1},
                {1, 0, 1, 1}
        };

        System.out.println(findCircleNum(isConnected));
        System.out.println(findCircleNum(isConnected2));
        System.out.println(findCircleNum(isConnected3));
    }
}
