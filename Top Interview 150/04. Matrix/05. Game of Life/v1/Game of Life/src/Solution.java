public class Solution {

    public void gameOfLife(int[][] board) {

        //stores solution
        int[][] res = new int[board.length][board[0].length];

        //iterates through each element to firgure which cell will be dead or alive
        for(int r = 0; r < board.length; ++r) {

            for(int c = 0; c < board[0].length; ++c) {

                int ones = 0;

                //check up direction
                if(r - 1 >= 0 && board[r - 1][c] == 1)
                    ++ones;

                //check up-right direction
                if(r - 1 >= 0 && c + 1 < board[0].length && board[r - 1][c + 1] == 1)
                    ++ones;

                //check right direction
                if(c + 1 < board[0].length && board[r][c + 1] == 1)
                    ++ones;

                //check down-right direction
                if(r + 1 < board.length && c + 1 < board[0].length && board[r + 1][c + 1] == 1)
                    ++ones;

                //check down direction
                if(r + 1 < board.length && board[r + 1][c] == 1)
                    ++ones;

                //check down-left direction
                if(r + 1 < board.length && c - 1 >= 0 && board[r + 1][c - 1] == 1)
                    ++ones;

                //check left direction
                if(c - 1 >= 0 && board[r][c - 1] == 1)
                    ++ones;

                //check up-left direction
                if(r - 1 >= 0 && c - 1 >= 0 && board[r - 1][c - 1] == 1)
                    ++ones;

                //determines if current cell is going be dead or alive depending on current state and neighbors
                if(board[r][c] == 1 && (ones < 2 || ones > 3)) {
                    res[r][c] = 0;
                } else if(board[r][c] == 1 && (ones == 2 || ones == 3)) {
                    res[r][c] = 1;
                } else if (board[r][c] == 0 && ones == 3) {
                    res[r][c] = 1;
                }
            }
        }

        //copies the solution into the original 2d array
        for(int r = 0; r < board.length; ++r)
            for(int c = 0; c < board[0].length; ++c)
                board[r][c] = res[r][c];
    }
}
