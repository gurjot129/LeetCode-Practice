public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        //test case #1
        int[] nums = { 100, 4, 200, 1, 3, 2 };

        int result = solution.longestConsecutive(nums);

        System.out.println("*** FINAL RESULTS ***");
        System.out.println("Solution: ");
        System.out.println(result);
    }
}