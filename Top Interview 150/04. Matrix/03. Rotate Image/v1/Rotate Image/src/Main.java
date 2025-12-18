public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        //test case #1
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        solution.rotate(matrix);

        System.out.println("*** FINAL RESULTS ***");
        System.out.println("Rotate Solution: ");
        System.out.println(matrix);
    }
}
