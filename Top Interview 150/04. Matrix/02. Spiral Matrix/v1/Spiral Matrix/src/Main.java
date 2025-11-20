import java.util.List;

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        //test case #1
//        int[][] matrix = {
//                            {1, 2, 3},
//                            {4, 5, 6},
//                            {7, 8, 9}
//                        };

        //test case #1
        int[][] matrix = {
                            {3},
                            {2}
                        };

        List<Integer> result = solution.spiralOrder(matrix);

        System.out.println("*** FINAL RESULTS ***");
        System.out.println("Spiral Matrix Solution: ");
        System.out.println(result.toString());

    }
}