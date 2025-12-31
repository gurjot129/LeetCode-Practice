import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        //test case #1
        int[][] matrix = {
                {0,1,0},
                {0,0,1},
                {1,1,1},
                {0,0,0}
        };

        solution.gameOfLife(matrix);

        System.out.println("*** FINAL RESULTS ***");
        System.out.println("Solution: ");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}