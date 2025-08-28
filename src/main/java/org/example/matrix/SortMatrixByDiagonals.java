package org.example.matrix;

import java.util.*;

public class SortMatrixByDiagonals {

    public static int[][] sortMatrix(int[][] grid){
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int diagnol =0;
        int[][] result = new int[grid.length][grid.length];
        //creates the diagonols and puts them into a map
        for (int row = 0; row < grid.length; row++) {
            for (int column = 0; column < grid.length; column++) {
                diagnol = row - column;
                if (map.containsKey(diagnol)){
                    List<Integer> list = new ArrayList<>();
                    list = map.get(diagnol);
                    list.add(grid[row][column]);
                    map.put(diagnol, list);
                }else {
                    List<Integer> emptyList = new ArrayList<>();
                    emptyList.add(grid[row][column]);
                    map.put(diagnol, emptyList);
                }
            }
        }

        //sorts the diagonols
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()){
            if (entry.getKey() >= 0){
                map.get(entry.getKey()).sort((x,y) -> Integer.compare(y,x));
            }else {
                map.get(entry.getKey()).sort(Integer::compare);
            }
        }

       /* for (Map.Entry<Integer, List<Integer>> entry1 : map.entrySet()){
            System.out.println("key: " + entry1.getKey());
            for (Integer i : entry1.getValue()){
                System.out.print(i + " ");
            }
            System.out.println();
        }*/

        //diagnols back into an array
        for (int row = 0; row < grid.length; row++) {
            for (int column = 0; column < grid.length; column++){
                diagnol = row - column;
                List<Integer> list = map.get(diagnol);
                result[row][column] = list.removeFirst();

            }
        }

        return result;
    }


    public static void main(String[] args) {
        int[][] arr = {
                {1,7,3},
                {9,8,2},
                {4,5,6}
        };

        int[][] resultArr = sortMatrix(arr);
        for (int[] arr1 : resultArr){
            for (int i : arr1){
                System.out.print(i);
            }
            System.out.println();
        }

    }
}
