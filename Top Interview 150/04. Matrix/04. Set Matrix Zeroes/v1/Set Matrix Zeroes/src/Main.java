import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        //test case #1
//        int[][] matrix = {
//                {1, 1, 1},
//                {1, 0, 1},
//                {1, 1, 1}
//        };

        //test case #2
        int[][] matrix = {
                {0,1,2,0},
                {3,4,5,2},
                {1,3,1,5}
        };

        solution.setZeroes(matrix);

        System.out.println("*** FINAL RESULTS ***");
        System.out.println("Solution: ");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
