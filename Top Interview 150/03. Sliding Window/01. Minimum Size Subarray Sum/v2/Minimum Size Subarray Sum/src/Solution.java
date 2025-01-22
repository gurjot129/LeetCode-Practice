import java.util.logging.LoggingPermission;

public class Solution {

    public int minSubArrayLen(int target, int[] nums) {

        //creates and initializes variables
        int lPtr = 0;
        int rPtr = 0;
        int total = nums[lPtr];
        int subarraySize = Integer.MAX_VALUE;

        //iterates through the nums array to find the minimum subarray size
        while(lPtr < nums.length) {

            //if the total is greater than the target, shift the left pointer forward to decrease the window
            //if the total is less than the target, shift the right pointer forward to increase the window
            if(total >= target) {
                subarraySize = Math.min(subarraySize, rPtr - lPtr + 1);
                total -= nums[lPtr];
                ++lPtr;
            } else if(rPtr < nums.length - 1) {
                ++rPtr;
                total += nums[rPtr];
            } else {
                break;
            }
        }

        //if a subarray wasn't found, return 0, otherwise, return the minimum subarray size
        return subarraySize == Integer.MAX_VALUE ? 0 : subarraySize;
    }
}
