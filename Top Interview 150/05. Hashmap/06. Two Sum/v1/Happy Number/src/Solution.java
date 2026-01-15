public class Solution {

    public boolean isHappy(int n) {

        //while n is not equal to 1, continue to perform calculations until conditon is met
        while(n != 1) {

            //seperate each digit
            char[] nums = ("" + n).toCharArray();

            //reset total to 0
            n = 0;

            //perform exponent calculations
            for(char c : nums) {
                n += (int) Math.pow((c - '0'), 2);
            }

            System.out.println("Total: " + n);
        }

        return true;
    }
}
