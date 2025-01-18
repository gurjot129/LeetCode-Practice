import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Solution {

    public List<List<Integer>> threeSum(int[] nums) {

        //creates and initializes variables
        List<List<Integer>> res = new ArrayList<>();

        //this sorts the nums array, that way we can take full advantage of the 2 pointer method, which improves runtime from O(n^2) to O(n0
        Arrays.sort(nums);

        //iterates through the nums array to find 3 sum sets
        for(int i = 0; i < nums.length; ++i) {

            //this skips duplicate values in order to improve runtime efficiency and to avoid duplicate sets
            if(i > 0 && nums[i - 1] == nums[i])
                continue;

            //both pointers start from each end
            int lPtr = i + 1;
            int rPtr = nums.length - 1;

            //iterates through the rest of the array where each pointer moves inwards
            while(lPtr < rPtr) {

                //this also skips duplicate values in order to improve runtime efficiency and to avoid duplicate sets
                if(lPtr > i + 1 && nums[lPtr - 1] == nums[lPtr]) {
                    ++lPtr;
                    continue;
                } else if(rPtr < nums.length - 1 && nums[rPtr + 1] == nums[rPtr]) {
                    --rPtr;
                    continue;
                }

                //once duplicate values have been removed and all values equal to 0, this adds the set to the result
                if(nums[i] + nums[lPtr] + nums[rPtr] == 0)
                    res.add(Arrays.asList(nums[i], nums[lPtr], nums[rPtr]));

                //this adjusts the pointers accordingly, depending on if the total is less or greater than 0
                if(nums[i] + nums[lPtr] + nums[rPtr] < 0)
                    ++lPtr;
                else
                    --rPtr;
            }
        }

        return res;
    }
}
