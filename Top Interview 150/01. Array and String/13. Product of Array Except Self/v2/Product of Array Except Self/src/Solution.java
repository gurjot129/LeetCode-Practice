class Solution {

    public int[] productExceptSelf(int[] nums) {

        //create and initialize variables
        int[] answer = new int[nums.length];

        //initializes all answer values to 1
        for(int i = 0; i < nums.length; ++i) {
            answer[i] = 1;
        }

        //starts at the second element, since we are not multiplying all values to each other
        for(int i = 1; i <= (nums.length / 2); ++i) {

            //multiplies values for each element, where i helps shift right and left of the j value that need to be multiplied to j
            for(int j = 0; j < nums.length; ++j) {

                if(((j + i) % nums.length) != (((j - i) < 0 ? nums.length + (j - i) : j - i) % nums.length) ) {
                    answer[j] = answer[j] * (nums[(j + i) % nums.length]) * (nums[(((j - i) < 0 ? nums.length + (j - i) : j - i) % nums.length)]);
                } else {
                    answer[j] = answer[j] * (nums[(j + i) % nums.length]);
                }

            }
        }

        return answer;
    }
}