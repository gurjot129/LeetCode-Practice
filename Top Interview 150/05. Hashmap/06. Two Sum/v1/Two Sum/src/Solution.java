import java.util.HashMap;

public class Solution {

    public int[] twoSum(int[] nums, int target) {

        //creates and initializes variables
        HashMap<Integer, Integer> numIdcs = new HashMap<>();

        //stores the values with the associated index
        for(int i = 0; i < nums.length; ++i)
            numIdcs.put(nums[i], i);

        //iterates and evaluates all the values in the nums array
        for(int i = 0; i < nums.length; ++i) {

            //when subtracting the current element from target, if the result is found in the hashmap, return the index of both the current value and the result value
            if(numIdcs.containsKey(target - nums[i]) && numIdcs.get(target - nums[i]) != i) {
                return new int[]{numIdcs.get(target - nums[i]), i};
            }
        }


        return new int[]{};
    }
}
