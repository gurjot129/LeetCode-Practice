import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Solution s = new Solution();

        //test case #2
        int[] nums = { 0,0,1,1,1,1,2,3,3 };

        int k = s.removeDuplicates(nums);
        System.out.println("Final Results:");
        System.out.println("k: " + k);
        System.out.println("nums: " + Arrays.toString(nums));

    }
}