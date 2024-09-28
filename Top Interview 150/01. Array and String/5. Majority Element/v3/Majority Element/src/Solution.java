
class Solution {

    public int majorityElement(int[] nums) {

        //create and initializes variables
        int k = 0;
        int[][] valCount = new int[nums.length + 6][1];

        int leftIdx = 0;
        int rightIdx = nums.length - 1;
        int midIdx = rightIdx / 2;

        //handles empty array condition
        if(nums.length != 0) {

            //iterates through nums array in order to count the number of occurrences of specific values
            while(leftIdx <= midIdx) {

                //if the left and right indices equal to each, only use the left side logic to avoid working on the same index twice
                if(leftIdx != rightIdx) {
                    ++valCount[nums[leftIdx]][0];
                    ++leftIdx;

                    ++valCount[nums[rightIdx]][0];
                    --rightIdx;

                } else {
                    ++valCount[nums[leftIdx]][0];
                    ++leftIdx;
                }
            }

            // Loop through key-value pairs
            for (int i = 1; i < valCount.length; ++i) {
                if(valCount[i][0] > nums.length / 2) {
                    k = i;
                }
            }

        }

        return k;
    }
}