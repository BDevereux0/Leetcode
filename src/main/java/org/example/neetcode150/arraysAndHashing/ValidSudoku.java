package org.example.neetcode150.arraysAndHashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//36
public class ValidSudoku {

    public static boolean isValidSudoko(char[][] board){
        boolean result = true;

        Map<Integer, Set<Character>> rowMap = new HashMap<>();
        Set<Character> rowValues;
        Map<Integer, Set<Character>> colMap = new HashMap<>();
        Set<Character> colValues;
        Set<Character>[] boxes = new HashSet[9];
        int boxFinderRow = 0;
        int boxFinderCol = 0;

        for (int i = 0; i < boxes.length; i++) {
            boxes[i] = new HashSet<>();
        }

        for (int col = 0; col < board.length; col++) {

            if (!colMap.containsKey(col)){
                colMap.put(col, new HashSet<>());
            }

            for (int row = 0; row < board.length ; row++) {

                if (board[row][col]=='.'){
                    continue;
                }

                if (!rowMap.containsKey(row)){
                    rowMap.put(row, new HashSet<>());
                }

                rowValues = rowMap.get(row);
                colValues = colMap.get(col);

                if (!rowValues.add(board[row][col])){
                    return false;
                }

                if (!colValues.add(board[row][col])){
                    return false;
                }

                /*
                This gets me the "bucket" or 3x3 grid location. Think of hashmap, use an integer to determine
                bucket location.

                0/3 = 0     3/3 = 1     6/3 = 2
                1/3 = 0     4/3 = 1     7/3 = 2
                2/3 = 0     5/3 = 1     8/3 = 2

                 */
                 int box = (row/3) * 3 + (col/3);
                 if (!boxes[box].add(board[row][col])){
                     return false;
                 }
            }
        }
        return result;
    }

    //TODO: Trying to solve by checking rows and columns. rowMap holds row value : set<characters>
    //TODO: colMap holds col value: set<chaacters>

    //TODO: Currently broke my row logic but col logic works
    //TODO: Don't have a solution for finding duplicate values in the 3x3 grid
    public static void main(String[] args) {
        char[][] board = {
                {'1','2','.','.','3','.','.','.','.'},
                {'4','.','.','5','.','.','.','.','.'},
                {'.','9','8','.','.','.','.','.','3'},
                {'5','.','.','.','6','.','.','.','4'},
                {'.','.','.','8','.','3','.','.','5'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','.','.','.','.','.','2','.','.'},
                {'.','.','.','4','1','9','.','.','8'},
                {'.','.','.','.','8','.','.','7','9'}
        };

        char[][] board2 = {
                {'1','2','.','.','3','.','.','.','.'},
                {'4','.','.','5','.','.','.','.','.'},
                {'.','9','1','.','.','.','.','.','3'},
                {'5','.','.','.','6','.','.','.','4'},
                {'.','.','.','8','.','3','.','.','5'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','.','.','.','.','.','2','.','.'},
                {'.','.','.','4','1','9','.','.','8'},
                {'.','.','.','.','8','.','.','7','9'}
        };

        System.out.println(isValidSudoko(board));
        System.out.println(isValidSudoko(board2));


    }
}
/*

Optimal solution:
public boolean isValidSudoku(char[][] board) {

        boolean[][] row = new boolean[9][9];
        boolean[][] col = new boolean[9][9];
        boolean[][] box = new boolean[9][9];
        for (int i =0; i < 9; i++){

            for (int j = 0; j < 9; j++){

                if (board[i][j] == '.'){
                    continue;
                }
                int num = board[i][j] - '1';
                int boxIndex = (i / 3) * 3 + (j / 3);

                if (row[i][num] || col[j][num] || box[boxIndex][num]){
                    return false;
                }

                row[i][num] = true;
                col[j][num] = true;
                box[boxIndex][num] = true;
            }


        }


        return true;

    }
 */