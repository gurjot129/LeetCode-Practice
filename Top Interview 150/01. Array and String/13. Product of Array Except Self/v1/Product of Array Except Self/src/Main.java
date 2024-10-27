import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Solution s = new Solution();

        //test case #1
//        int[] nums = { 1,2,3,4 };

        //test case #2
        int[] nums = { -1,1,0,-3,3 };

        int[] answer = s.productExceptSelf(nums);

        System.out.println("Final Results:");
        System.out.println("answer: " + Arrays.toString(answer));

    }
}