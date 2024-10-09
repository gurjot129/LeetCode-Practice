public class Main {
    public static void main(String[] args) {

        Solution s = new Solution();

        //test case #1
        int[] nums = { 2,3,1,1,4 };

        boolean canJump = s.canJump(nums);

        System.out.println("Final Results:");
        System.out.println("canJump: " + canJump);

    }
}