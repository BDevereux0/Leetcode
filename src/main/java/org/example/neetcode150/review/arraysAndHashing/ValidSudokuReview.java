package org.example.neetcode150.review.arraysAndHashing;

public class ValidSudokuReview {

    public static boolean isValidSudoku(char[][] board){
        boolean result = true;

        boolean[][] columns = new boolean[9][9];
        boolean[][] rows = new boolean[9][9];
        boolean[][] grids = new boolean[9][9];

        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board[0].length; column++) {
                if (board[row][column] == '.'){
                    continue;
                }

                //Converts the character digit to a zero-based int (1-9 becomes 0-8)
                int num = board[row][column] - '1';

                //Calcs which of the nine 3x3 Sudoku grids contain the current cell
                //(row/3) identifies the grid row, *3 skips the grids in previous rows, and (column/3)
                //identifies the grid column.
                int gridIndex = (row/3) * 3 + (column/3);


                //This works because by having num be an index. Almost like i'm using a modulo barrier
                //to loop through an array. For example:
                //as I loop through row[0] any value of 1 (which is converted to 0) will look at the
                //value of board[row][num] which is board[0][0]. If the corresponding value in
                //one of the boolean arrays is true -> return false.
                //clever AF
                if (rows[row][num] || columns[column][num] || grids[gridIndex][num]){
                    return false;
                }

                columns[column][num] = true;
                rows[row][num] = true;
                grids[gridIndex][num] = true;
            }
        }


        return result;
    }

    public static void main(String[] args) {
        char[][] board1 = {
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

        System.out.println(isValidSudoku(board1));
        System.out.println(isValidSudoku(board2));
    }
}
