import java.util.Arrays;

class Solution {
    public void rotate(int[] nums, int k) {

        //creates and initializes variables
        int currVal = nums[0];
        int currIdx = 0;
        int count = 0;

        if(k != 0) {

            //rotates the array elements to the right by the number of k amounts
            for(int i = 0; i < nums.length; ++i) {

                System.out.println("i: " + i);
                System.out.println("nums before: " + Arrays.toString(nums));

                //saves the next element's value before it gets overwritten
                int nextVal = nums[(currIdx + k) % nums.length];

                nums[(currIdx + k) % nums.length] = currVal;
                currVal = nextVal;
                currIdx = (currIdx + k) % nums.length;

                if(k != 1 && nums.length % k == 0 && (i + 1) % (nums.length / k) == 0) {

                    currVal = nums[(currIdx + 1) % nums.length];
                    currIdx = (currIdx - k + 1 < 0 ? currIdx - k + 1 + nums.length : currIdx - k + 1) % nums.length;

//                    currVal = nums[(currIdx - k + 1 < 0 ? currIdx - k + 1 + nums.length : currIdx - k + 1) % nums.length];
//                    currIdx = (currIdx + 1) % nums.length;
                }

                System.out.println("nums after: " + Arrays.toString(nums));
                System.out.println(" ");
            }

        }
    }
}