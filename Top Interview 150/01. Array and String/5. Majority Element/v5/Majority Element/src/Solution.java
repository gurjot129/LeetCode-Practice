class Solution {

    public int majorityElement(int[] nums) {

        //create and initializes variables
        int k = 0;
        int valIdx = 0;
        ValCount[] valCount = new ValCount[4];

        for(int i = 0; i < valCount.length; ++i) {
            valCount[i] = new ValCount();
        }

        int leftIdx = 0;
        int rightIdx = nums.length - 1;
        int midIdx = rightIdx / 2;

        //handles empty array condition
        //if(nums.length != 0) {

            //iterates through nums array in order to count the number of occurrences of specific values
            while(leftIdx <= midIdx) {

                int foundIdx;

                //if the left and right indices equal to each, only use the left side logic to avoid working on the same index twice
                if(leftIdx != rightIdx) {

                    foundIdx = ValCount.getIndex(valCount, nums[rightIdx]);

                    if(foundIdx != -1) {
                        ++valCount[foundIdx].value;
                    } else {
                        valCount[valIdx].key = nums[rightIdx];
                        valCount[valIdx].value = 1;
                        ++valIdx;
                    }
                    --rightIdx;
                }

                foundIdx = ValCount.getIndex(valCount, nums[leftIdx]);

                if(foundIdx != -1) {
                    ++valCount[foundIdx].value;
                } else {
                    valCount[valIdx].key = nums[leftIdx];
                    valCount[valIdx].value = 1;
                    ++valIdx;
                }
                ++leftIdx;
            }

            // Loop through key-value pairs
            for (int i = 0; i < valCount.length; ++i) {
                if(valCount[i].value > nums.length / 2) {
                    k = valCount[i].key;
                }
            }

        //}

        return k;
    }
}

class ValCount {
    public int key;
    public int value;

    public static int getIndex(ValCount[] vc, int k) {

        for(int i = 0; i < vc.length; ++i) {
            if(vc[i].key == k) {
                return i;
            }
        }
        return -1;
    }

}