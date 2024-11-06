class Solution {

    public int trap(int[] height) {

        //creates and initializes variables
        int maxHeightIdx = 0;
        int escapedWaterStopPointIdx = 0;
        int[] trapRainWater = new int[height.length];
        int trappedRainWater = 0;

        //checks trapped water from the left to right
        for(int i = 0; i < height.length; ++i) {

            trapRainWater[i] = Math.max(height[maxHeightIdx] - height[i], 0);

            if(height[i] > height[maxHeightIdx]) maxHeightIdx = i;
        }

        escapedWaterStopPointIdx = maxHeightIdx;
        maxHeightIdx = height.length - 1;

        //checks escaped water from the right to left
        for(int i = height.length - 1; i >= escapedWaterStopPointIdx; --i) {

            trapRainWater[i] = Math.max(height[maxHeightIdx] - height[i], 0);

            if(height[i] > height[maxHeightIdx]) maxHeightIdx = i;
        }

        //sums up all the trapped water
        for(int i = 1; i < trapRainWater.length - 1; ++i) {
            trappedRainWater += trapRainWater[i];
        }

        return trappedRainWater;
    }
}