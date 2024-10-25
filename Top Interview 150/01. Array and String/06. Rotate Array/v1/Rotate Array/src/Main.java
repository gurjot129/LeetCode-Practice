import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Solution s = new Solution();

        //test case #1
        int[] nums = { 1,2,3,4,5,6,7 };
        int k = 3;

        s.rotate(nums, k);

        System.out.println("Final Results:");
        System.out.println("nums: " + Arrays.toString(nums));

    }
}