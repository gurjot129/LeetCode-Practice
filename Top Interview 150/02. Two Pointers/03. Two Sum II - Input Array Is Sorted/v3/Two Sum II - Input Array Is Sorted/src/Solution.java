public class Solution {

    public int[] twoSum(int[] numbers, int target) {

        //creates and initializes variables
        int lptr = 0;
        int rPtr = numbers.length - 1;

        //iterates through the numbers by moving from each end inwards until target is found
        while(lptr < rPtr) {

            if(numbers[lptr] + numbers[rPtr] < target)
                ++lptr;
            else if(numbers[lptr] + numbers[rPtr] > target)
                --rPtr;
            else
                break;
        }

        return new int[]{lptr + 1, rPtr + 1};
    }
}
