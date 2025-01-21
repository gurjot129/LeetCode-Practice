public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        //test case #1
        int target = 7;
        int[] nums = {2,3,1,2,4,3};

        int result = solution.threeSum(nums);

        System.out.println("*** FINAL RESULTS ***");
        System.out.println("Minimum Sub-Array Length: ");
        System.out.println(result);
    }
}