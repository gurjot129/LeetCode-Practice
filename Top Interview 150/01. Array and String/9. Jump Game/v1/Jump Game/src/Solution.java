public class Solution {

    public boolean canJump(int[] nums) {

        //creates and initializes variables
        int jumps = 0;

        while(jumps < (nums.length - 1) && nums[jumps] != 0) {
            //int max = nums[jumps] != 0? 1 + nums[jumps + 1] : 0;
            jumps += nums[jumps];
        }

        return jumps >= (nums.length - 1);
    }
}
