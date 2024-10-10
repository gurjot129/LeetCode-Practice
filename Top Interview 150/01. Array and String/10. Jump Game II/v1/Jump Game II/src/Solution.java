public class Solution {

    public int jump(int[] nums) {

        //creates and initializes variables
        int jumps = 0;
        int count = 0;

        //jump to next index until the last index is reached
        //or when element value is 0 (since you can't jump forward anymore)
        while(jumps < (nums.length - 1) && nums[jumps] != 0) {

            int maxJumps = 0;
            int numOfJumps = nums[jumps];

            //iterates through each jump
            //whichever jump provides the greater max jump value is picked
            //ensures that current and potential jump is within specific boundaries
            for(int i = 1; (i + jumps) < nums.length && i <= nums[jumps]; ++i) {

                //if last index is reached, stop evaluating other jumps
                if((nums[jumps] + jumps) >= (nums.length - 1)) {
                    numOfJumps = nums[jumps];
                    break;

                //helps with evaluate and assign max jump value, and how many jumps are needed to get there
                } else if((i + nums[jumps + i]) > maxJumps && nums[jumps + i] != 0) {
                    maxJumps = i + nums[jumps + i];
                    numOfJumps = i;
                }
            }

            jumps += numOfJumps;
            ++count;
        }

        return count;
    }
}
