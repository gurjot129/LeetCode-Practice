import java.util.Stack;

class Solution {

    public boolean isValid(String s) {

        //checks for null/empty conditions
        if(s == null || s.isEmpty()) {
            return true;
        }

        //creates and initializes variables
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); ++i) {

            //if the top item matches the current character, pop character, else push character
            if(stack.isEmpty()) {
                stack.push(s.charAt(i));
            } else if( (int) stack.peek() == ((int) s.charAt(i) - 1) || (int) stack.peek() == ((int) s.charAt(i) - 2) )
                stack.pop();
            else
                stack.push(s.charAt(i));
        }

        //if all brackets closed, the stack should be empty
        return stack.isEmpty();
    }
}