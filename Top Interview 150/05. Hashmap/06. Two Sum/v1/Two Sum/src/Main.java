
public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        //test case #1
//        int[] nums = {2,7,11,15};
//        int target = 9;

        //test case #3
        int[] nums = {3, 2, 4};
        int target = 6;

        //test case #3
//        int[] nums = {3, 3};
//        int target = 6;

        int[] result = solution.twoSum(nums, target);

        System.out.println("*** FINAL RESULTS ***");
        System.out.println("Solution: ");
        System.out.println("[ " + result[0] + ", " + result[1] + " ]");
    }
}