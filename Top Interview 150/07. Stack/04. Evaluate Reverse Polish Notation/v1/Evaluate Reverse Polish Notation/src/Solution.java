import java.util.Stack;

class Solution {

    public int evalRPN(String[] tokens) {

        //creates and initializes variables
        Stack<String> stack = new Stack<>();

        //iterates through and evaluates each token
        for(String t : tokens) {

            //helps store parsed values for evaluation
            int num1 = 0;
            int num2 = 0;

            //if it's a number, push into stack
            //if arithmetic operator, perform relevant arithmetic operation
            switch (t) {

                case "+":
                    num1 = Integer.parseInt(stack.pop());
                    num2 = Integer.parseInt(stack.pop());
                    stack.push((num2 + num1) + "");
                    break;
                case "-":
                    num1 = Integer.parseInt(stack.pop());
                    num2 = Integer.parseInt(stack.pop());
                    stack.push((num2 - num1) + "");
                    break;
                case "*":
                    num1 = Integer.parseInt(stack.pop());
                    num2 = Integer.parseInt(stack.pop());
                    stack.push((num2 * num1) + "");
                    break;
                case "/":
                    num1 = Integer.parseInt(stack.pop());
                    num2 = Integer.parseInt(stack.pop());
                    stack.push((num2 / num1) + "");
                    break;
                default:
                    stack.push(t);

            }
        }

        return Integer.parseInt(stack.peek());
    }
}