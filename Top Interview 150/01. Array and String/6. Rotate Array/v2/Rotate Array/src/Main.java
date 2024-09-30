import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Solution s = new Solution();

        //test case #1
//        int[] nums = { 1,2,3,4,5,6,7 };
//        int k = 3;

        //test case #2
//        int[] nums = { -1,-100,3,99 };
//        int k = 2;

        //test case #31
        int[] nums = { 1, 2, 3 };
        int k = 3;

        s.rotate(nums, k);

        System.out.println("Final Results:");
        System.out.println("nums: " + Arrays.toString(nums));

    }
}
