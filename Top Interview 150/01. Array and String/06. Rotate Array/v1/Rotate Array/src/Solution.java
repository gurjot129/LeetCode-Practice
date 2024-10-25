import java.util.Arrays;

class Solution {
    public void rotate(int[] nums, int k) {

        //creates and initializes variables
        int[] temp = new int[nums.length];

        //rotates the array elements to the right by the number of k amounts
        for(int i = 0; i < nums.length; ++i) {
            temp[(i + k) % nums.length] = nums[i];
        }

        //assigns the rotated elements to the nums array
        for(int i = 0; i < nums.length; ++i) {
            nums[i] = temp[i];
        }

        System.out.println("After assigning temp array to nums array");
        System.out.println("temp: " + Arrays.toString(temp));
        System.out.println("nums: " + Arrays.toString(nums));
    }
}