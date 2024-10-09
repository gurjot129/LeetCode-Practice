public class Solution {

    public boolean canJump(int[] nums) {

        //creates and initializes variables
        int jumps = 0;

        while(jumps < (nums.length - 1) && nums[jumps] != 0) {

            int maxJumps = 0;
            int numOfJumps = nums[jumps];

            for(int i = 1; (i + jumps) < nums.length && i <= nums[jumps]; ++i) {

                if((i + nums[jumps + i]) > maxJumps && nums[jumps + i] != 0) {
                    numOfJumps = i;
                }
            }

            jumps += numOfJumps;
        }

        return jumps >= (nums.length - 1);
    }
}
