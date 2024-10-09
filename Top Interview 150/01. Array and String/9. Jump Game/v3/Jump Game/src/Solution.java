public class Solution {

    //this solution uses the Greedy Method to solve this problem
    public boolean canJump(int[] nums) {

        //starts from the last index
        int goal = nums.length - 1;

        //this code works its way backwards from the last to the first index
        for(int i = nums.length - 1; i >= 0; --i) {

            //if there are sufficient jumps to reach the goal, then move the goal closer to the first index
            if((i + nums[i]) >= goal)
                goal = i;
        }

        return goal == 0;
    }
}
