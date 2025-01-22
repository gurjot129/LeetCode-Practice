public class Solution {

    public int minSubArrayLen(int target, int[] nums) {

        //this iterative statement determines the subarray size
        for(int i = 0; i < nums.length; ++i) {

            //this iterative statement determines where to start in the nums array
            for(int j = 0; i + j < nums.length; ++j) {

                int total = 0;

                //this iterative statement sums up all the values from the subarray
                for(int k = 0; k < i + 1; ++k)
                    total += nums[j + k];

                //this statement returns the minimum array size if the subarray total greater or equal to the target
                if(total >= target)
                    return i + 1;
            }
        }

        return 0;
    }
}
