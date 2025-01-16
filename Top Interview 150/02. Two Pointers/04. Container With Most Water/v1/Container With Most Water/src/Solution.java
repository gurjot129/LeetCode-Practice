public class Solution {

    public int maxArea(int[] height) {

        //creates and initializes variables
        int lPtr = 0;
        int maxArea = 0;

        //iterates through the height array and helps find the max container area
        while(lPtr < height.length - 1) {

            //ensures that the right pointer will always start 1 element after left pointer
            int rPtr = lPtr + 1;

            //each right pointer value is being assessed with the current left pointer value, determining the max container area
            while(rPtr < height.length) {
                //the calculates and stores the max container area
                maxArea = Math.max(maxArea, (rPtr - lPtr) * Math.min(height[lPtr], height[rPtr]));
                ++rPtr;
            }

            ++lPtr;
        }

        return maxArea;
    }
}
