class Solution {

    public int trap(int[] height) {

        //creates and initializes variables
        int lIdx = 0;
        int rIdx = height.length - 1;

        int lMax = height[lIdx];
        int rMax = height[rIdx];

        int totalWater = 0;

        //evaluates each element starting from the opposite sides, it will continue to evaluate until the pointers meet each other
        while(lIdx < rIdx) {

            //the pointer with the lower elevation will move, since we do not want to cross an elevation greater than the max
            if(lMax < rMax) {

                ++lIdx;
                lMax = Math.max(lMax, height[lIdx]);
                totalWater += lMax - height[lIdx];
            } else {

                --rIdx;
                rMax = Math.max(rMax, height[rIdx]);
                totalWater += rMax - height[rIdx];
            }
        }

        return totalWater;
    }
}