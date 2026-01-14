
public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        //test case #1
        int[] nums = {2,7,11,15};
        int target = 9;

        int[] result = solution.twoSum(nums, target);

        System.out.println("*** FINAL RESULTS ***");
        System.out.println("Solution: ");
        System.out.println(result);
    }
}