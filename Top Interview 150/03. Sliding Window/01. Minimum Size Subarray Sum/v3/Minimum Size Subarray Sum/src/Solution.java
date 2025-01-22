public class Solution {

    public int minSubArrayLen(int target, int[] nums) {

        //creates and initializes variables
        int lPtr = 0;
        int total = 0;
        int minSubArraySize = Integer.MAX_VALUE;

        //iterates through the nums array
        for(int rPtr = 0; rPtr < nums.length; ++rPtr) {

            total += nums[rPtr];

            //while the total is greater than the target, shift the left pointer forward to decrease the window
            while(total >= target) {
                minSubArraySize = Math.min(minSubArraySize, rPtr - lPtr + 1);
                total -= nums[lPtr];
                ++lPtr;
            }
        }

        //if a subarray wasn't found, return 0, otherwise, return the minimum subarray size
        return minSubArraySize == Integer.MAX_VALUE ? 0 : minSubArraySize;
    }
}
