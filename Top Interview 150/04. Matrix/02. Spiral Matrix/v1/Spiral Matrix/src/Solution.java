import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Integer> spiralOrder(int[][] matrix) {

        //creates and initializes variables
        List<Integer> result = new ArrayList<Integer>();
        int matrixSize = matrix.length * matrix[0].length;
        char direction = 'r';
        int row = 0;
        int col = 0;
        int rLimit = matrix[0].length - 1;
        int dLimit = matrix.length - 1;
        int lLimit = 0;
        int uLimit = 0;

        //iterates through 2d array
        for(int i = 0; i < matrixSize; ++i) {

            //adds element to the spiral result
            result.add(matrix[row][col]);

            //handles single element arrays edge-case
            if(direction == 'r' && matrix[0].length == 1) {
                direction = 'd';
            }

            //iterates in a specific direction
            if(direction == 'r') {
                ++col;
            } else if(direction == 'd') {
                ++row;
            } else if(direction == 'l') {
                --col;
            } else if(direction == 'u') {
                --row;
            }

            //changes direction, when certain limits are met
            if(direction == 'r' && col == rLimit) {
                direction = 'd';
                --rLimit;
            } else if(direction == 'd' && row == dLimit) {
                direction = 'l';
                --dLimit;
            } else if(direction == 'l' && col == lLimit) {
                direction = 'u';
                ++lLimit;
                ++uLimit;
            } else if(direction == 'u' && row == uLimit) {
                direction = 'r';
            }
        }

        return result;
    }
}
