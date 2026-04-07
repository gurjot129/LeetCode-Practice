import java.util.ArrayList;
import java.util.List;

class Solution {

    public List<String> summaryRanges(int[] nums) {

        //creates and initializes variables
        List<String> result = new ArrayList<String>();
        int l = 0;
        int r = 1;
        int rangeLen = 0;

        //handles empty array condition
        if(nums.length == 0)
            return result;

        //handles 1 element array condition
        if(nums.length == 1) {
            result.add(nums[0] + "->" + nums[0]);
            return result;
        }

        //iterates through nums array to identify and summarize ranges
        for(; r < nums.length; ++r) {

            //checks if previous and current element are consecutive
            //if consecutive, increment range length
            //if not consecutive, add the range to the list, start from new element, and reset range length
            if(nums[r - 1] == nums[r] - 1) {
                ++rangeLen;
            } else {
                result.add(nums[l] + "->" + nums[l + rangeLen]);
                l = r;
                rangeLen = 0;
            }
        }

        //handles the last step
        result.add(nums[l] + "->" + nums[l + rangeLen]);

        return result;
    }
}