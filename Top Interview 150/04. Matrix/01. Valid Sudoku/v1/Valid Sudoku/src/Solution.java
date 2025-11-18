import java.util.ArrayList;
import java.util.List;

public class Solution {

    public boolean isValidSudoku(char[][] board) {

        //creates and initializes variables
        boolean isValidSudoku = true;

        for(int i = 0; i < board.length && isValidSudoku; i += 3) {

            List<Character> cmpValues = new ArrayList<>();

            for(int j = 0; j < board.length % 3 && isValidSudoku; ++j) {

                if( (!cmpValues.contains(board[i][j]) && !cmpValues.contains(board[i + 1][j + 1]) && !cmpValues.contains(board[i + 2][j + 2])) &&
                     board[i][j] != board[i + 1][j + 1] &&
                     board[i][j] != board[i + 2][j + 2] &&
                     board[i + 1][j + 1] != board[i + 2][j + 2]) {

                    cmpValues.add(board[i][j]);
                    cmpValues.add(board[i + 1][j + 1]);
                    cmpValues.add(board[i + 2][j + 2]);

                } else
                    isValidSudoku = false;

            }
        }

        return isValidSudoku;
    }
}
