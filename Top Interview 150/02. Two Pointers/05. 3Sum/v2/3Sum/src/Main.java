import java.util.List;

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        //test case #1
//        int[] nums = {-1,0,1,2,-1,-4};

        //test case #193
        int[] nums = {-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6};

        List<List<Integer>> result = solution.threeSum(nums);

        System.out.println("*** FINAL RESULTS ***");
        System.out.println("3 Sum sets: ");
        System.out.println(result.toString());
    }
}