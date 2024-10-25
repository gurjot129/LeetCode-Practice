public class RemoveDuplicatesfromSortedArray {

    public int removeDuplicates(int[] nums) {

        //create and initializes variables
        int k = 0;

        //ensures that the array isn't empty
        if(nums.length > 0) {

            //we start by analyzing the first element, and it also ensures to handle 1 element array use case
            int currVal = nums[0];
            k = 1;

            //if we have an array with more than one element, we begin to iterate through and analyze the other elements
            for(int i = 1; i < nums.length; ++i) {

                //if the element doesn't match the current value, then we count it as unique
                //We also shift the unique values towards the left side of the array
                if(nums[i] != currVal) {
                    currVal = nums[i];
                    nums[k] = nums[i];
                    ++k;
                }
            }
        }

        return k;
    }
}
