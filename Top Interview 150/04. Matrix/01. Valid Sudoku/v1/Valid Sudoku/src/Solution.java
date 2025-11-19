import java.util.HashSet;
import java.util.Set;

public class Solution {

    public boolean isValidSudoku(char[][] board) {

        //creates and initializes variables
        boolean isValidSudoku = true;

        Set<Character> cmpValues = new HashSet<>();

        //checks each row
        for(int i = 0; i < board.length && isValidSudoku; ++i) {

            for(int j = 0; j < board.length && isValidSudoku; ++j)
                if(board[i][j] != '.') isValidSudoku = cmpValues.add(board[i][j]);

            cmpValues.clear();
        }

        //checks each column
        for(int i = 0; i < board.length && isValidSudoku; ++i) {

            for(int j = 0; j < board.length && isValidSudoku; ++j)
                if(board[j][i] != '.') isValidSudoku = cmpValues.add(board[j][i]);

            cmpValues.clear();
        }


        //checks each 3 x 3 square
        for(int i = 0; i < board.length && isValidSudoku;) {

            for(int j = 0; j < 3 && isValidSudoku; ++j) {
                if(board[j][i] != '.' && isValidSudoku) isValidSudoku = cmpValues.add(board[j][i]);
                if(board[j][i + 1] != '.' && isValidSudoku) isValidSudoku = cmpValues.add(board[j][i + 1]);
                if(board[j][i + 2] != '.' && isValidSudoku) isValidSudoku = cmpValues.add(board[j][i + 2]);
            }

            cmpValues.clear();

            for(int j = 3; j < 6 && isValidSudoku; ++j) {
                if(board[j][i] != '.' && isValidSudoku) isValidSudoku = cmpValues.add(board[j][i]);
                if(board[j][i + 1] != '.' && isValidSudoku) isValidSudoku = cmpValues.add(board[j][i + 1]);
                if(board[j][i + 2] != '.' && isValidSudoku) isValidSudoku = cmpValues.add(board[j][i + 2]);
            }

            cmpValues.clear();

            for(int j = 6; j < 9 && isValidSudoku; ++j) {
                if(board[j][i] != '.' && isValidSudoku) isValidSudoku = cmpValues.add(board[j][i]);
                if(board[j][i + 1] != '.' && isValidSudoku) isValidSudoku = cmpValues.add(board[j][i + 1]);
                if(board[j][i + 2] != '.' && isValidSudoku) isValidSudoku = cmpValues.add(board[j][i + 2]);
            }

            cmpValues.clear();

            i += 3;
        }

        return isValidSudoku;
    }
}
