public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        //test case #1
        int[] nums = {1,2,3,1};
        int k = 3;

        boolean result = solution.containsNearbyDuplicate(nums, k);

        System.out.println("*** FINAL RESULTS ***");
        System.out.println("Solution: ");
        System.out.println("[ " + result + " ]");
    }
}