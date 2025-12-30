import java.util.ArrayList;
import java.util.List;

public class Solution {

    public void rotate(int[][] matrix) {

        //create and initialize variables
        int lPtr = 0;
        int rPtr = matrix[0].length - 1;

        while(lPtr < rPtr) {

            for(int i = 0; i < (rPtr - lPtr); ++i) {

                int tPtr = lPtr;
                int bPtr = rPtr;

                //save top-left value
                int topLeftVal = matrix[tPtr][lPtr + i];

                //move bottom-left into top-left
                matrix[tPtr][lPtr + i] = matrix[bPtr - i][lPtr];

                //move bottom-right into bottom-left
                matrix[bPtr - i][lPtr] = matrix[bPtr][rPtr - i];

                //move top-right into bottom-right
                matrix[bPtr][rPtr - i] = matrix[tPtr + i][rPtr];

                //move top-left into top-right
                matrix[tPtr + i][rPtr] = topLeftVal;
            }

            --rPtr;
            ++lPtr;
        }
    }
}
