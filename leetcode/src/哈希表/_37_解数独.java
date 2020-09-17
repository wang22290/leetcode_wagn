package 哈希表;

/**
 * https://leetcode-cn.com/problems/sudoku-solver/
 * created by wagn on 2020/9/15
 */
public class _37_解数独 {

    public static void main(String[] args) {

    }

     class Solution {
        public void solveSudoku(char[][] board) {
            boolean[][] rowUsed = new boolean[9][10];
            boolean[][] colUsed = new boolean[9][10];
            boolean[][][] boxUsed = new boolean[3][3][10];

            for (int row = 0;row < board.length; row++){
                for (int col = 0; col < board[0].length; col++){
                    int num = board[row][col] - '0';
                    if (1 <= num && num <= 9){
                        rowUsed[row][num] = true;
                        colUsed[col][num] = true;
                        boxUsed[row/3][col/3][num] = true;
                    }
                }
            }
            recusuveSolveSudoku(board, rowUsed, colUsed, boxUsed, 0,  0);
        }



         private boolean recusuveSolveSudoku(char[][]board, boolean[][]rowUsed, boolean[][]colUsed,boolean[][][]boxUsed, int row, int col){
            if (col == board[0].length){
                col = 0;
                row++;
                if (row == board.length){
                    return true;
                }
            }

            if (board[row][col] == '.'){
                for (int num = 1; num <= 9; num++) {
                    boolean canused = !(rowUsed[row][num] || colUsed[col][num] || boxUsed[row/3][col/3][num] );
                    if (canused){
                        rowUsed[row][num] = true;
                        colUsed[col][num] = true;
                        boxUsed[row/3][col/3][num] = true;

                        board[row][col] = (char)('0' + num);
                        if (recusuveSolveSudoku(board, rowUsed, colUsed, boxUsed, row,col + 1)){
                            return true;
                        }
                        board[row][col] = '.';

                        rowUsed[row][num] = false;
                        colUsed[col][num] = false;
                        boxUsed[row/3][col/3][num] = false;
                    }
                }
            }else {
                return  recusuveSolveSudoku(board, rowUsed, colUsed, boxUsed, row, col + 1);
            }
            return false;
        }
    }


}
