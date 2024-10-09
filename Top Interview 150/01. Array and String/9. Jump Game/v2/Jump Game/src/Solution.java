public class Solution {

    public boolean canJump(int[] nums) {

        //calls a recursive function that checks through every possibility whether if the values can reach the final index
        return canJump(0, nums);
    }

    //recursive function that checks through every possibility whether if the values can reach the final index
    public boolean canJump(int jumps, int[] nums) {

        //creates and initializes variables
        boolean canJump = false;

        //if the amount of jumps reaches the final index, return true
        if(jumps >= (nums.length - 1)) {
            canJump = true;

        //doesn't check any element with values of 0, since we can't jump forward "0" spaces
        } else if(nums[jumps] != 0) {

            //iterates through each possible jump, and calls the recursive function until we reach a "true" condition
            for(int i = 1; i <= nums[jumps] && !canJump; ++i) {
                canJump = canJump(jumps + i, nums);
            }
        }

        return canJump;
    }
}
