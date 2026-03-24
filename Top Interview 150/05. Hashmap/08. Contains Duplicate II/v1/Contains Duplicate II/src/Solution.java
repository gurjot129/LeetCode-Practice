import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public boolean containsNearbyDuplicate(int[] nums, int k) {

        //creates and initializes variables
        HashMap<Integer, ArrayList<Integer>> dupIndices = new HashMap<>();

        //stores indices of same integer values
        for(int i = 0; i < nums.length; ++i) {

            if (!dupIndices.containsKey(nums[i])) {
                dupIndices.put(nums[i], new ArrayList<Integer>());
            }

            dupIndices.get(nums[i]).add(i);
        }

        //loops through the hash map and checks for the condition abs(i - j) <= k
        for (Map.Entry<Integer, ArrayList<Integer>> entry : dupIndices.entrySet()) {

            ArrayList<Integer> value = entry.getValue();

            //ensures that there are at least 2 values in the array
            if(value.size() > 1) {

                //checks for the condition abs(i - j) <= k
                for(int i = 1; i < value.size(); ++i) {
                    if (Math.abs(value.get(i) - value.get(i - 1)) <= k)
                        return true;
                }
            }
        }

        return false;
    }
}
