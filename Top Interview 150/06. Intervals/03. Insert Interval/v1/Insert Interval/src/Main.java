public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        //test case #1
        int[][] intervals = new int[][] {
                {1, 3},
                {6, 9}
            };

        int[] newInterval = new int[] {2, 5};

        int[][] result = solution.insert(intervals, newInterval);

        System.out.println("*** FINAL RESULTS ***");
        System.out.println("Solution: ");

        for(int[] arr : result) {
            System.out.println("{" + arr[0] + ", " + arr[1] + "}");
        }
    }
}