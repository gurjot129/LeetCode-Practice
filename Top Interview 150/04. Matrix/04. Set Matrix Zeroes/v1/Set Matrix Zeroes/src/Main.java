public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        //test case #1
        int[][] matrix = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };

        solution.rotate(matrix);

        System.out.println("*** FINAL RESULTS ***");
        System.out.println("Rotate Solution: ");
        System.out.println(matrix);
    }
}
