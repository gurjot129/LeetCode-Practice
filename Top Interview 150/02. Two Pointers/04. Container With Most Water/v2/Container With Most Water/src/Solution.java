public class Solution {

    public int maxArea(int[] height) {

        //creates and initializes variables
        int lPtr = 0;
        int rPtr = height.length - 1;
        int maxArea = 0;

        //each pointer starts from both ends of the height array, and each of the values are evaluated to calculate the max container area
        while(lPtr < rPtr) {

            //this calculates and stores the max container area
            //the width is found by subtracting the right and left pointer in order to find the distance
            //the height is found by choosing the minimum height between the left and right pointer elements
            maxArea = Math.max(maxArea, (rPtr - lPtr) * Math.min(height[lPtr], height[rPtr]));

            //movcs the pointer that contains the smaller height
            if(height[lPtr] < height[rPtr])
                ++lPtr;
            else
                --rPtr;
        }

        return maxArea;
    }
}
