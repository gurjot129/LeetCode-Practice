public class Solution {

    public int[] twoSum(int[] numbers, int target) {

        //creates and initializes variables
        int lPtr = 0;

        //iterates through the numbers array
        while(lPtr < numbers.length) {

            //creates a starting point for the right pointer one index ahead of the left pointer
            //that way, we don't have to worry about skipping the left pointer index
            int rPtr = (lPtr + 1) % numbers.length;

            //iterates through the numbers array with the right pointer,
            //comparing both left and right pointer values to the target
            while(rPtr < numbers.length - 1) {

                //if the summed pointer values match target, return indices with +1 to each index
                if(numbers[lPtr] + numbers[rPtr] == target)
                    return new int[]{lPtr + 1, rPtr + 1};

                //this ensures that the right pointer doesn't go out of bounds
                if (rPtr % numbers.length == numbers.length - 1)
                    rPtr = 0;
                else
                    ++rPtr;
            }

            ++lPtr;
        }

        return new int[]{-1, -1};
    }
}
