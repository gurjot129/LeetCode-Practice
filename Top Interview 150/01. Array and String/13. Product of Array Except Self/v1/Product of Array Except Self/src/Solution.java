class Solution {

    public int[] productExceptSelf(int[] nums) {

        //create and initialize variables
        int[] answer = new int[nums.length];

        //initializes all answer values to 1
        for(int i = 0; i < nums.length; ++i) {
            answer[i] = 1;
        }

        //starts at the second element, since we are not multiplying all values to each other
        for(int i = 1; i < nums.length; ++i) {

            //multiplies values for each element, where i helps shift to the values that need to be multiplied
            for(int j = 0; j < nums.length; ++j) {
                answer[j] = answer[j] * nums[(i + j) % nums.length];
            }
        }

        return answer;
    }
}