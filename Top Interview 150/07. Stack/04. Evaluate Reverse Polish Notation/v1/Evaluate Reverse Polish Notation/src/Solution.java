import java.util.Stack;

class Solution {

    public int evalRPN(String[] tokens) {

        Stack<String> stack = new Stack<>();

        for(String t : tokens) {

            int num1 = 0;
            int num2 = 0;

            switch (t) {

                case "+":
                    num1 = Integer.parseInt(stack.pop());
                    num2 = Integer.parseInt(stack.pop());
                    stack.push((num1 + num2) + "");
                    break;
                case "-":
                    num1 = Integer.parseInt(stack.pop());
                    num2 = Integer.parseInt(stack.pop());
                    stack.push((num1 - num2) + "");
                    break;
                case "*":
                    num1 = Integer.parseInt(stack.pop());
                    num2 = Integer.parseInt(stack.pop());
                    stack.push((num1 * num2) + "");
                    break;
                case "/":
                    num1 = Integer.parseInt(stack.pop());
                    num2 = Integer.parseInt(stack.pop());
                    stack.push((num1 / num2) + "");
                    break;
                default:
                    stack.push(t);

            }
        }

        return Integer.parseInt(stack.peek());
    }
}