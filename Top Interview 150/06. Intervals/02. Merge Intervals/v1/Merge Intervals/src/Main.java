public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        //test case #1
//        int[][] intervals = new int[][] {
//                {1, 3},
//                {2, 6},
//                {8, 10},
//                {15, 18}
//            };

        //test case #2
        int[][] intervals = new int[][] {
                {1, 4},
                {4, 5}
        };

        int[][] result = solution.merge(intervals);

        System.out.println("*** FINAL RESULTS ***");
        System.out.println("Solution: ");

        for(int[] arr : result) {
            System.out.println("{" + arr[0] + ", " + arr[1] + "}");
        }
    }
}