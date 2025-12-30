import java.util.ArrayList;
import java.util.List;

public class Solution {

    public void setZeroes(int[][] matrix) {

        List<int[]> zeroes = new ArrayList<>();

        //finds all the zeroes, and stores it in an array
        for(int i = 0; i < matrix.length; ++i) {

            for(int j = 0; j < matrix[i].length; ++j) {

                if(matrix[i][j] == 0)
                    zeroes.add(new int[]{i, j});
            }
        }

        //converts all the relevant rows and columens to zeroes
        for(int i = 0; i < zeroes.size(); ++i) {

            for(int r = 0; r < matrix[0].length; ++r)
                matrix[(zeroes.get(i))[0]][r] = 0;

            for(int c = 0; c < matrix.length; ++c)
                matrix[c][(zeroes.get(i))[1]] = 0;
        }
    }

}
