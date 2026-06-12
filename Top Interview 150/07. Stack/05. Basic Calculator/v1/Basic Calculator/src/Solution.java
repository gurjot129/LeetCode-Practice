import java.util.Stack;

class Solution {

    public int calculate(String s) {

        //creates and initializes variables
        Stack<Integer> stack = new Stack<>();
        int res = 0;
        int curr = 0;
        int sign = 1;

        //iterates and evaluates through each character
        for (char c : s.toCharArray()) {

            //checks digit before appending to current value
            if (Character.isDigit(c)) {
                curr = curr * 10 + (c - '0');
            }
            //plus adds current value to result
            else if (c == '+') {
                res += curr * sign;
                sign = 1;
                curr = 0;
            }
            //minus subtracts current value from result
            else if (c == '-') {
                res += curr * sign;
                sign = -1;
                curr = 0;
            }
            //starting parentheses pushes both result and sign into stack
            else if (c == '(') {
                stack.push(res);
                stack.push(sign);
                res = 0;
                sign = 1;
                curr = 0;
            }
            //ending parentheses pops both result and sign from stack, and is added to result
            else if (c == ')') {
                res += curr * sign;
                curr = 0;
                res *= stack.pop();
                res += stack.pop();
            }
        }

        //adds any final current value, if there is any
        res += sign * curr;

        return res;
    }
}