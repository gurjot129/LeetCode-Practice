public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        //test case #1
        int[][] intervals = new int[][] {
                                            {1, 3},
                                            {2, 6},
                                            {8, 10},
                                            {15, 18}
                                        };

        int[][] result = solution.merge(intervals);

        System.out.println("*** FINAL RESULTS ***");
        System.out.println("Solution: ");
        System.out.println(result);
    }
}