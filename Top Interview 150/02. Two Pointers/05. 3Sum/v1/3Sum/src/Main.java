import java.util.List;

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        //test case #1
        int[] nums = {-1,0,1,2,-1,-4};

        List<List<Integer>> result = solution.threeSum(nums);

        System.out.println("*** FINAL RESULTS ***");
        System.out.println("Is Subsequence: ");
        System.out.println(result);
    }
}