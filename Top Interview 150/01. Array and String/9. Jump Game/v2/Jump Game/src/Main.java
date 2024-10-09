public class Main {
    public static void main(String[] args) {

        Solution s = new Solution();

        //test case #1
//        int[] nums = { 2,3,1,1,4 };

        //test case #2
//        int[] nums = { 3,2,1,0,4 };

        //test case #7
//        int[] nums = { 2,0 };

        //test case #8
//        int[] nums = { 2,0,0 };

        //test case #168
//        int[] nums = { 3,0,8,2,0,0,1 };

        //test case #172
        int[] nums = { 5,9,3,2,1,0,2,3,3,1,0,0 };

        boolean canJump = s.canJump(nums);

        System.out.println("Final Results:");
        System.out.println("canJump: " + canJump);

    }
}