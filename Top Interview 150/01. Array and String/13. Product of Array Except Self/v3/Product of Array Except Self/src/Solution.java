import java.util.Arrays;

class Solution {

    public int[] productExceptSelf(int[] nums) {

        //create and initialize variables
        int[] answer = new int[nums.length];

        int prefix = 1;
        int suffix = 1;

        //this code calculates and stores the prefix values in the answer array
        for(int i = 0; i < nums.length; ++i) {
            answer[i] = prefix;
            prefix *= nums[i];
        }

        //this code calculates and stores the final product values (prefix & suffix) in the answer array
        for(int i = nums.length - 1; i >= 0; --i) {
            answer[i] *= suffix;
            suffix *= nums[i];

        }

        return answer;
    }
}