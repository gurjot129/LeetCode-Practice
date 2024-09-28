import java.util.HashMap;

class Solution {

    public int majorityElement(int[] nums) {

        //create and initializes variables
        int k = 0;
        HashMap<Integer, Integer> valCount = new HashMap<>();

        int leftIdx = 0;
        int rightIdx = nums.length - 1;
        int midIdx = rightIdx / 2;

        //handles empty array condition
        if(nums.length != 0) {

            //iterates through nums array in order to count the number of occurrences of specific values
            while(leftIdx <= midIdx) {

                //if the left and right indices equal to each, only use the left side logic to avoid working on the same index twice
                if(leftIdx != rightIdx) {

                    if(!valCount.containsKey(nums[leftIdx])) {
                        valCount.put(nums[leftIdx], 1);
                    } else {
                        valCount.put(nums[leftIdx], valCount.get(nums[leftIdx]) + 1);
                    }
                    ++leftIdx;

                    if(!valCount.containsKey(nums[rightIdx])) {
                        valCount.put(nums[rightIdx], 1);
                    } else {
                        valCount.put(nums[rightIdx], valCount.get(nums[rightIdx]) + 1);
                    }
                    --rightIdx;

                } else {

                    if(!valCount.containsKey(nums[leftIdx])) {
                        valCount.put(nums[leftIdx], 1);
                    } else {
                        valCount.put(nums[leftIdx], valCount.get(nums[leftIdx]) + 1);
                    }
                    ++leftIdx;
                }
            }

            // Loop through key-value pairs
            for (HashMap.Entry<Integer, Integer> entry : valCount.entrySet()) {
                if(entry.getValue() > nums.length / 2) {
                    k = entry.getKey();
                }
            }

        }

        return k;
    }
}