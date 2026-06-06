public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        //test case #1
        int[][] points = new int[][] {
                {10, 16},
                {2, 8},
                {1, 6},
                {7, 12}
        };;

        int result = solution.findMinArrowShots(points);

        System.out.println("*** FINAL RESULTS ***");
        System.out.println("Solution: " + result);}
    }
}